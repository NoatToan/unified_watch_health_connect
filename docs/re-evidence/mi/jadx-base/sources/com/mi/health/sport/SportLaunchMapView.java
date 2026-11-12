package com.mi.health.sport;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolylineOptions;
import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import com.xiaomi.fitness.common.utils.ILocationListener;
import com.xiaomi.fitness.common.utils.Location;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.lqi;
import defpackage.qti;
import defpackage.s2b;
import defpackage.t4i;
import defpackage.vmi;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SportLaunchMapView extends BaseMapView<SportLaunchMapView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MapView f10060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AMap f10061b;
    public TextView c;
    public FusionLocationRequest d;

    public class a implements ILocationListener {
        public a() {
        }

        @Override // com.xiaomi.fitness.common.utils.ILocationListener
        public void onFail(String str) {
            Logger.i("AmapFragment", "locate fail");
        }

        @Override // com.xiaomi.fitness.common.utils.ILocationListener
        public void onSuccess(Location location) {
            Logger.d("AmapFragment", "long:" + location.getLon() + ",la:" + location.getLat());
            s2b s2bVarB = t4i.b(location.getLat(), location.getLon());
            LatLng latLng = new LatLng(s2bVarB.a(), s2bVarB.b());
            if (SportLaunchMapView.this.f10061b != null) {
                SportLaunchMapView.this.f10061b.animateCamera(CameraUpdateFactory.changeLatLng(latLng));
                SportLaunchMapView.this.f10061b.clear();
                SportLaunchMapView.this.f10061b.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(SportLaunchMapView.this.getResources(), vmi.c)))).setPosition(latLng);
            }
            if (SportLaunchMapView.this.d != null) {
                SportLaunchMapView.this.d.destory();
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10063a;

        static {
            int[] iArr = new int[MapMode.values().length];
            f10063a = iArr;
            try {
                iArr[MapMode.day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10063a[MapMode.night.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface c {
        void a();
    }

    public SportLaunchMapView(Context context) {
        this(context, null);
    }

    private void d(View view) {
        this.f10060a = (MapView) view.findViewById(lqi.c);
        this.c = (TextView) view.findViewById(lqi.f25354a);
        mapConfig();
        setCustomMapStyle();
    }

    private void drawPreLine(List<LatLng> list) {
        this.f10061b.addPolyline(new PolylineOptions().addAll(list).width(10.0f).color(Color.parseColor("#ff0000")));
    }

    private void setCustomMapStyle() {
        String str = UIUtils.isNightMode(getContext()) ? MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE : MapUtilsKt.MAP_STYLE_RES_ID_LIGHT_STYLE;
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        customMapStyleOptions.setStyleId(str);
        this.f10061b.setCustomMapStyle(customMapStyleOptions);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public SportLaunchMapView getMapView() {
        return this;
    }

    public final void mapConfig() {
        AMap map = this.f10060a.getMap();
        this.f10061b = map;
        map.getUiSettings().setZoomControlsEnabled(false);
        this.f10061b.getUiSettings().setLogoBottomMargin(-50);
        this.f10061b.getUiSettings().setCompassEnabled(false);
        this.f10061b.getUiSettings().isRotateGesturesEnabled();
        this.f10061b.getUiSettings().isTiltGesturesEnabled();
        this.f10061b.getUiSettings().setMyLocationButtonEnabled(false);
        this.f10061b.getUiSettings().setAllGesturesEnabled(false);
        this.f10061b.getUiSettings().isMyLocationButtonEnabled();
        this.f10061b.moveCamera(CameraUpdateFactory.zoomTo(15.0f));
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(Bundle bundle) {
        this.f10060a.onCreate(bundle);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        this.f10060a.onDestroy();
        this.f10061b.clear();
        this.f10061b = null;
        this.f10060a = null;
        FusionLocationRequest fusionLocationRequest = this.d;
        if (fusionLocationRequest != null) {
            fusionLocationRequest.destory();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        this.f10060a.onLowMemory();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        this.f10060a.onPause();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        this.f10060a.onResume();
        this.f10061b.getUiSettings().setZoomControlsEnabled(false);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(Bundle bundle) {
        this.f10060a.onSaveInstanceState(bundle);
    }

    public void setLocationMarkerClick(final c cVar) {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: apn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cVar.a();
            }
        });
    }

    public void setMapMode(MapMode mapMode) {
        mapConfig();
        int i = b.f10063a[mapMode.ordinal()];
    }

    public void setRunningRoute(List<LatLng> list) {
        if (list != null) {
            drawPreLine(list);
        }
    }

    public void startLocation() {
        FitnessLogUtils.i("AmapFragment", "mapview , startLocation");
        if (this.d == null) {
            this.d = new FusionLocationRequest();
        }
        this.d.requestLocation(new a());
    }

    public SportLaunchMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SportLaunchMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AMapLocationClient.updatePrivacyShow(context, true, true);
        AMapLocationClient.updatePrivacyAgree(context, true);
        d(LayoutInflater.from(context).inflate(qti.f31830a, this));
    }
}
