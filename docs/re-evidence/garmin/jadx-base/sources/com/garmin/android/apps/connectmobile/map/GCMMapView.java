package com.garmin.android.apps.connectmobile.map;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.mapsdkadapter.MapView;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.p;
import com.garmin.android.library.mapsdkadapter.q;
import ie2.j;
import ie2.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import qe2.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/garmin/android/apps/connectmobile/map/GCMMapView;", "Lcom/garmin/android/library/mapsdkadapter/MapView;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lie2/l;", "mapOptions", "(Landroid/content/Context;Lie2/l;)V", "", "mode", "", "setLiteMode", "(Z)V", "mapType", "setMapType", "(I)V", "Lcom/garmin/android/library/mapsdkadapter/i$j;", "mapClickListener", "setOnMapClickListener", "(Lcom/garmin/android/library/mapsdkadapter/i$j;)V", "Lcom/garmin/android/library/mapsdkadapter/i$m;", "markerClickListener", "setOnMarkerClickListener", "(Lcom/garmin/android/library/mapsdkadapter/i$m;)V", "enabled", "setInteractionsEnabled", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GCMMapView extends MapView implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f38734k = MapView.f50234j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapView(Context context, l lVar) {
        super(context, lVar);
        context.getClass();
        lVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.MapView
    public final void f(ViewGroup viewGroup, i.d dVar, l lVar, i.l lVar2) {
        super.f(viewGroup, dVar, lVar, lVar2);
        f12.l.f68084a.getClass();
        if (f12.l.a.a().G1() == i.b.GCJ02) {
            getMapAdapter().X(false);
        }
        f12.l.a.a().u3(this);
    }

    public final j g(p pVar) {
        pVar.getClass();
        return getMapProxy().x(pVar);
    }

    public final com.garmin.android.library.mapsdkadapter.l h(q qVar) {
        qVar.getClass();
        h mapProxy = getMapProxy();
        mapProxy.getClass();
        return mapProxy.h(qVar);
    }

    public final void i() {
        h mapProxy = getMapProxy();
        mapProxy.getClass();
        i.a.c(mapProxy);
    }

    @Override // com.garmin.android.library.mapsdkadapter.b, ie2.i
    public final void onDestroy() {
        f12.l.f68084a.getClass();
        f12.l.a.a().r(this);
        super.onDestroy();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        f12.l.f68084a.getClass();
        if (s.g(str, "keyMapGeodeticSystem")) {
            getMapAdapter().X(f12.l.a.a().G1() == i.b.WGS84);
        }
    }

    public final void setInteractionsEnabled(boolean enabled) {
        getMapAdapter().getUiSettings().setAllGesturesEnabled(enabled);
    }

    public final void setLiteMode(boolean mode) {
        getMapOptions().f93137b = mode;
    }

    public final void setMapType(int mapType) {
        getMapProxy().setMapType(mapType);
    }

    public final void setOnMapClickListener(i.j mapClickListener) {
        getMapAdapter().O(mapClickListener);
    }

    public final void setOnMarkerClickListener(i.m markerClickListener) {
        getMapAdapter().B(markerClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapView(Context context) {
        super(context);
        context.getClass();
    }
}
