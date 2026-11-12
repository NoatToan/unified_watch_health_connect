package com.mapbox.maps.extension.style.sources;

import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxStyleManager f54496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeoJsonSource f54497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f54499e;

    public /* synthetic */ a(MapboxStyleManager mapboxStyleManager, GeoJsonSource geoJsonSource, String str, List list, int i14) {
        this.f54495a = i14;
        this.f54496b = mapboxStyleManager;
        this.f54497c = geoJsonSource;
        this.f54498d = str;
        this.f54499e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54495a) {
            case 0:
                GeoJsonSourceUtils.addGeoJSONSourceFeatures$lambda$1$lambda$0(this.f54496b, this.f54497c, this.f54498d, this.f54499e);
                break;
            case 1:
                GeoJsonSourceUtils.updateGeoJSONSourceFeatures$lambda$3$lambda$2(this.f54496b, this.f54497c, this.f54498d, this.f54499e);
                break;
            default:
                GeoJsonSourceUtils.removeGeoJSONSourceFeatures$lambda$5$lambda$4(this.f54496b, this.f54497c, this.f54498d, this.f54499e);
                break;
        }
    }
}
