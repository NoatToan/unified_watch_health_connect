package me2;

import com.google.android.gms.maps.UiSettings;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme2/d0;", "Lie2/k;", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 implements ie2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UiSettings f118152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f118153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118154c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f118155d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f118156e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f118157f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f118158g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f118159h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f118160i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f118161j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f118162k = true;

    @Override // ie2.k
    public final void a() {
        this.f118155d = false;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setMyLocationButtonEnabled(false);
        }
    }

    @Override // ie2.k
    public final void b() {
        this.f118154c = false;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setCompassEnabled(false);
        }
    }

    @Override // ie2.k
    public final void setAllGesturesEnabled(boolean z14) {
        setScrollGesturesEnabled(z14);
        setZoomGesturesEnabled(z14);
        setTiltGesturesEnabled(z14);
        setRotateGesturesEnabled(z14);
        this.f118160i = z14;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setIndoorLevelPickerEnabled(z14);
        }
        this.f118162k = z14;
        UiSettings uiSettings2 = this.f118152a;
        if (uiSettings2 != null) {
            uiSettings2.setScrollGesturesEnabledDuringRotateOrZoom(z14);
        }
        UiSettings uiSettings3 = this.f118152a;
        if (uiSettings3 != null) {
            uiSettings3.setAllGesturesEnabled(z14);
        }
    }

    @Override // ie2.k
    public final void setMapToolbarEnabled(boolean z14) {
        this.f118161j = false;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setMapToolbarEnabled(false);
        }
    }

    @Override // ie2.k
    public final void setRotateGesturesEnabled(boolean z14) {
        this.f118159h = z14;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(z14);
        }
    }

    @Override // ie2.k
    public final void setScrollGesturesEnabled(boolean z14) {
        this.f118156e = z14;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setScrollGesturesEnabled(z14);
        }
    }

    @Override // ie2.k
    public final void setTiltGesturesEnabled(boolean z14) {
        this.f118158g = z14;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setTiltGesturesEnabled(z14);
        }
    }

    @Override // ie2.k
    public final void setZoomControlsEnabled(boolean z14) {
        this.f118153b = z14;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setZoomControlsEnabled(z14);
        }
    }

    @Override // ie2.k
    public final void setZoomGesturesEnabled(boolean z14) {
        this.f118157f = z14;
        UiSettings uiSettings = this.f118152a;
        if (uiSettings != null) {
            uiSettings.setZoomGesturesEnabled(z14);
        }
    }
}
