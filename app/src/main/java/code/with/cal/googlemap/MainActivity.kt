package code.with.cal.googlemap

import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.GoogleMap
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import code.with.cal.googlemap.R
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdateFactory

class MainActivity : FragmentActivity(), OnMapReadyCallback {
    var map: GoogleMap? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        val Tehran = LatLng(35.702655, 51.338388)
        map!!.addMarker(MarkerOptions().position(Tehran).title("Tehran"))
        map!!.moveCamera(CameraUpdateFactory.newLatLng(Tehran))
    }
}