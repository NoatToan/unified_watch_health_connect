package com.huawei.hms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public final class StreetViewPanoramaOptions implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StreetViewPanoramaCamera f14146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLng f14148c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private StreetViewSource j;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreetViewPanoramaOptions[] newArray(int i) {
            return new StreetViewPanoramaOptions[i];
        }

        maa() {
        }
    }

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StreetViewPanoramaOptions position(LatLng latLng) {
        this.f14148c = latLng;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    protected StreetViewPanoramaOptions(Parcel parcel) {
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, StreetViewSource streetViewSource) {
        this.f14148c = latLng;
        this.j = streetViewSource;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.f14148c = latLng;
        this.d = num;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        this.f14148c = latLng;
        this.d = num;
        this.j = streetViewSource;
        return this;
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        return "";
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String str) {
        this.f14147b = str;
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f14146a = streetViewPanoramaCamera;
        return this;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.f;
    }

    public Boolean getUserNavigationEnabled() {
        return this.e;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.i;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.f14146a;
    }

    public Boolean getStreetNamesEnabled() {
        return this.h;
    }

    public StreetViewSource getSource() {
        return this.j;
    }

    public Integer getRadius() {
        return this.d;
    }

    public LatLng getPosition() {
        return this.f14148c;
    }

    public String getPanoramaId() {
        return this.f14147b;
    }

    public Boolean getPanningGesturesEnabled() {
        return this.g;
    }
}
