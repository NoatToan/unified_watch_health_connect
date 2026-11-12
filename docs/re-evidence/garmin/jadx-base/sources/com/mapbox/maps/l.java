package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Expected.Transformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f54512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraOptions f54513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EdgeInsets f54514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Double f54515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ScreenCoordinate f54516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MapboxMap f54517g;

    public /* synthetic */ l(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, int i14) {
        this.f54511a = i14;
        this.f54512b = list;
        this.f54513c = cameraOptions;
        this.f54514d = edgeInsets;
        this.f54515e = d14;
        this.f54516f = screenCoordinate;
        this.f54517g = mapboxMap;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        switch (this.f54511a) {
            case 0:
                return MapboxMap.AnonymousClass3.invoke$lambda$1(this.f54512b, this.f54513c, this.f54514d, this.f54515e, this.f54516f, this.f54517g, (String) obj);
            default:
                return MapboxMap.cameraForCoordinates$lambda$17(this.f54512b, this.f54513c, this.f54514d, this.f54515e, this.f54516f, this.f54517g, (String) obj);
        }
    }
}
