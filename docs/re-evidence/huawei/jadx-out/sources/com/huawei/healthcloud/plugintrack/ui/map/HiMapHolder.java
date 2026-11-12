package com.huawei.healthcloud.plugintrack.ui.map;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.amap.api.maps.MapsInitializer;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.HuaweiMapOptions;
import com.huawei.hms.maps.TextureMapView;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import defpackage.izt;
import defpackage.jqu;
import defpackage.jqv;
import defpackage.jqy;
import defpackage.jrg;
import defpackage.oet;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class HiMapHolder extends HealthCardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f11217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceHiMap f11218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextureMapView f11219c;
    private LinearLayout d;
    private SupportMapFragment e;
    private View h;
    private com.amap.api.maps.TextureMapView i;

    public HiMapHolder(Context context) {
        super(context);
        this.i = null;
        this.e = null;
        this.f11219c = null;
        this.d = null;
        d(context);
    }

    public HiMapHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = null;
        this.e = null;
        this.f11219c = null;
        this.d = null;
        d(context);
    }

    public HiMapHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = null;
        this.e = null;
        this.f11219c = null;
        this.d = null;
        d(context);
    }

    private void d(Context context) {
        this.h = View.inflate(context, R.layout.layout_map_holder, this);
    }

    public InterfaceHiMap getHiMap() {
        return this.f11218b;
    }

    public InterfaceHiMap e(Bundle bundle, Context context) {
        LogUtil.a("Track_HiMapHolder", "GAODE_MAP_TYPE");
        if (this.f11217a != null && this.i != null && (this.f11218b instanceof jqu)) {
            LogUtil.a("Track_HiMapHolder", "gaode map exist");
            return this.f11218b;
        }
        MapsInitializer.updatePrivacyShow(context, true, true);
        MapsInitializer.updatePrivacyAgree(context, true);
        MapsInitializer.setSupportRecycleView(false);
        LinearLayout linearLayout = (LinearLayout) this.h.findViewById(R.id.map_container);
        this.f11217a = linearLayout;
        linearLayout.removeAllViews();
        this.i = new com.amap.api.maps.TextureMapView(getContext());
        this.f11217a.addView(this.i, new LinearLayout.LayoutParams(-1, -1));
        this.i.onCreate(bundle);
        MapsInitializer.setProtocol(2);
        jqu jquVar = new jqu(context, this.i, true);
        this.f11218b = jquVar;
        return jquVar;
    }

    public InterfaceHiMap b(Bundle bundle, Context context) {
        LogUtil.a("Track_HiMapHolder", "EMPTY_MAP_TYPE");
        if (this.f11217a != null && this.d != null && (this.f11218b instanceof jqv)) {
            LogUtil.a("Track_HiMapHolder", "empty map exist");
            return this.f11218b;
        }
        LinearLayout linearLayout = (LinearLayout) this.h.findViewById(R.id.map_container);
        this.f11217a = linearLayout;
        linearLayout.removeAllViews();
        this.d = new LinearLayout(getContext());
        this.f11217a.addView(this.d, new LinearLayout.LayoutParams(-1, -1));
        jqv jqvVar = new jqv(context, this.d, true);
        this.f11218b = jqvVar;
        return jqvVar;
    }

    public void c(final Context context, Fragment fragment, final SyncMapCallback syncMapCallback) {
        FragmentManager supportFragmentManager;
        if (this.f11217a != null && this.e != null && (this.f11218b instanceof jqy)) {
            LogUtil.a("Track_HiMapHolder", "google map exist");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.h.findViewById(R.id.map_container);
        this.f11217a = linearLayout;
        linearLayout.removeAllViews();
        if (fragment != null) {
            supportFragmentManager = fragment.getChildFragmentManager();
        } else if (context instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        } else {
            LogUtil.j("Track_HiMapHolder", "fragmentManager is null");
            supportFragmentManager = null;
        }
        if (supportFragmentManager != null) {
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(SupportMapFragment.class.getName());
            if (fragmentFindFragmentByTag != null) {
                supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
            }
            this.e = SupportMapFragment.newInstance();
            try {
                supportFragmentManager.beginTransaction().add(R.id.map_container, this.e, SupportMapFragment.class.getName()).commitAllowingStateLoss();
                this.e.getMapAsync(new OnMapReadyCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.map.HiMapHolder.4
                    @Override // com.google.android.gms.maps.OnMapReadyCallback
                    public void onMapReady(GoogleMap googleMap) {
                        LogUtil.a("Track_HiMapHolder", "GoogleMap onMapReady", Integer.valueOf(googleMap.getMapType()));
                        HiMapHolder hiMapHolder = HiMapHolder.this;
                        hiMapHolder.f11218b = new jqy(context, hiMapHolder.e, googleMap);
                        SyncMapCallback syncMapCallback2 = syncMapCallback;
                        if (syncMapCallback2 != null) {
                            syncMapCallback2.onMapReady(HiMapHolder.this.f11218b);
                        }
                    }
                });
            } catch (IllegalArgumentException unused) {
                ReleaseLogUtil.a("Track_HiMapHolder", "commitAllowingStateLoss illegalArgumentException");
            }
        }
    }

    public void e(final Context context, final SyncMapCallback syncMapCallback) {
        LogUtil.a("Track_HiMapHolder", "HMS_MAP_TYPE");
        if (this.f11217a != null && this.f11219c != null && (this.f11218b instanceof jrg)) {
            LogUtil.a("Track_HiMapHolder", "hms map exist");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.h.findViewById(R.id.map_container);
        this.f11217a = linearLayout;
        linearLayout.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        oet.d();
        com.huawei.hms.maps.MapsInitializer.initialize(context);
        HuaweiMapOptions huaweiMapOptions = new HuaweiMapOptions();
        Location locationE = izt.e(BaseApplication.getContext());
        if (locationE != null) {
            double[] dArrB = izt.b(BaseApplication.getContext(), locationE);
            huaweiMapOptions.camera(new CameraPosition(new LatLng(dArrB[0], dArrB[1]), 16.5f, 0.0f, 0.0f));
        }
        huaweiMapOptions.compassEnabled(false);
        TextureMapView textureMapView = new TextureMapView(context, huaweiMapOptions);
        this.f11219c = textureMapView;
        textureMapView.onCreate(null);
        this.f11219c.onStart();
        this.f11219c.onResume();
        this.f11219c.getMapAsync(new com.huawei.hms.maps.OnMapReadyCallback() { // from class: jrf
            @Override // com.huawei.hms.maps.OnMapReadyCallback
            public final void onMapReady(HuaweiMap huaweiMap) {
                this.f38908c.b(context, syncMapCallback, huaweiMap);
            }
        });
        this.f11217a.addView(this.f11219c, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context, SyncMapCallback syncMapCallback, HuaweiMap huaweiMap) {
        LogUtil.d("Track_HiMapHolder", "hms onMapReady");
        jrg jrgVar = new jrg(context, huaweiMap, this.f11219c);
        this.f11218b = jrgVar;
        if (syncMapCallback != null) {
            syncMapCallback.onMapReady(jrgVar);
        }
    }

    public void e() {
        InterfaceHiMap interfaceHiMap = this.f11218b;
        if (interfaceHiMap != null) {
            interfaceHiMap.onDestroy();
            this.f11218b = null;
        }
        com.amap.api.maps.TextureMapView textureMapView = this.i;
        if (textureMapView != null) {
            textureMapView.onDestroy();
        }
        LinearLayout linearLayout = this.f11217a;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f11217a = null;
        this.i = null;
        this.f11219c = null;
        this.d = null;
    }
}
