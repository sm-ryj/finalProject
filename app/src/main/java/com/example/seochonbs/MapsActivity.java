package com.example.seochonbs;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
//import com.example.seochonbs.databinding.ActivityMapsBinding;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button irasun, tbs, ota, sch, rabbit;
    Button scan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        irasun = (Button) findViewById(R.id.button1);
        tbs = (Button) findViewById(R.id.button2);
        ota = (Button) findViewById(R.id.button3);
        sch = (Button) findViewById(R.id.button4);
        rabbit = (Button) findViewById(R.id.button5);

        irasun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, irasunActivity.class));
            }
        });

        tbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, tbsActivity.class));
            }
        });

        ota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, otaActivity.class));
            }
        });

        sch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, schActivity.class));
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, rabbitActivity.class));
            }
        });

        scan = (Button)findViewById(R.id.scan);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, ScanActivity.class));
            }
        });

    }




    //마커설정 등
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        oneMarker1();
        oneMarker2();
        oneMarker3();
        oneMarker4();
        oneMarker5();

    }

    //마커 + 타이틀 + 소타이틀 + 지도 줌인아웃
    public void oneMarker1() {
        LatLng bs1 = new LatLng(37.579006, 126.973565);

        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(bs1)
                .title("이라선.")
                .snippet("테스트테스트")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(1.5f);

        mMap.addMarker(makerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bs1, 16));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(MapsActivity.this, "눌렀습니다!!", Toast.LENGTH_LONG);
                return false;
            }
        });
    }

    //마커하나찍는 기본 예제
    public void oneMarker2() {
        LatLng bs2 = new LatLng(37.579468, 126.972672);

        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(bs2)
                .title("더북소사이어티.")
                .snippet("#감성책방#북토크")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(1.5f);

        mMap.addMarker(makerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bs2, 16));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(MapsActivity.this, "눌렀습니다!!", Toast.LENGTH_LONG);
                return false;
            }
        });
    }


    public void oneMarker3() {
        LatLng bs3 = new LatLng(37.580962, 126.969509);

        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(bs3)
                .title("오프투얼론 Off to ( ____) ALONE.")
                .snippet("#감성책방#북토크")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(1.5f);

        mMap.addMarker(makerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bs3, 16));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(MapsActivity.this, "눌렀습니다!!", Toast.LENGTH_LONG);
                return false;
            }
        });
    }

    public void oneMarker4() {
        LatLng bs3 = new LatLng(37.580558, 126.968090);

        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(bs3)
                .title("작은토끼야 들어와 편히 쉬어라")
                .snippet("#감성책방#북토크")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(1.5f);

        mMap.addMarker(makerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bs3, 16));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(MapsActivity.this, "눌렀습니다!!", Toast.LENGTH_LONG);
                return false;
            }
        });
    }

    public void oneMarker5() {

        LatLng bs3 = new LatLng(37.578838, 126.970307);

        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(bs3)
                .title("서촌 그 책방.")
                .snippet("#감성책방#북토크")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(1.5f);

        mMap.addMarker(makerOptions);


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bs3, 16));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(MapsActivity.this, "눌렀습니다!!", Toast.LENGTH_LONG);
                return false;
            }
        });
    }
}

