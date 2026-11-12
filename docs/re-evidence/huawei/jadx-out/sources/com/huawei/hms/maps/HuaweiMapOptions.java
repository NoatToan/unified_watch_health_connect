package com.huawei.hms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.utils.LogM;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class HuaweiMapOptions implements Parcelable {
    public static final Parcelable.Creator<HuaweiMapOptions> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f14124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f14125c;
    private CameraPosition d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n;
    private Float o;
    private LatLngBounds p;
    private Boolean q;
    private String r;
    private String s;
    private Boolean t;
    private Boolean u;
    private int v;
    private List w;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HuaweiMapOptions createFromParcel(Parcel parcel) {
            return new HuaweiMapOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HuaweiMapOptions[] newArray(int i) {
            return new HuaweiMapOptions[i];
        }

        maa() {
        }
    }

    public HuaweiMapOptions() {
        this.f14123a = 1;
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        this.i = bool;
        this.j = bool;
        Boolean bool2 = Boolean.FALSE;
        this.k = bool2;
        this.n = Float.valueOf(3.0f);
        this.o = Float.valueOf(20.0f);
        this.p = null;
        this.t = bool;
        this.u = bool2;
        this.v = 0;
        this.w = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected HuaweiMapOptions(Parcel parcel) {
        this.f14123a = 1;
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        this.i = bool;
        this.j = bool;
        Boolean bool2 = Boolean.FALSE;
        this.k = bool2;
        this.n = Float.valueOf(3.0f);
        this.o = Float.valueOf(20.0f);
        this.p = null;
        this.t = bool;
        this.u = bool2;
        this.v = 0;
        this.w = new ArrayList();
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14123a = parcelReader.readInt(2, this.f14123a);
        this.f14124b = parcelReader.readBooleanObject(3, null);
        this.f14125c = parcelReader.readBooleanObject(4, null);
        this.e = parcelReader.readBooleanObject(5, null);
        this.f = parcelReader.readBooleanObject(6, null);
        this.g = parcelReader.readBooleanObject(7, null);
        this.h = parcelReader.readBooleanObject(8, null);
        this.i = parcelReader.readBooleanObject(9, null);
        this.j = parcelReader.readBooleanObject(10, null);
        this.k = parcelReader.readBooleanObject(11, null);
        this.l = parcelReader.readBooleanObject(12, null);
        this.m = parcelReader.readBooleanObject(13, null);
        this.n = parcelReader.readFloatObject(14, null);
        this.o = parcelReader.readFloatObject(15, null);
        this.p = (LatLngBounds) parcelReader.readParcelable(16, LatLngBounds.CREATOR, null);
        this.d = (CameraPosition) parcelReader.readParcelable(17, CameraPosition.CREATOR, null);
        this.q = parcelReader.readBooleanObject(18, null);
        this.r = parcelReader.createString(19, null);
        this.s = parcelReader.createString(20, null);
        this.t = parcelReader.readBooleanObject(21, null);
        this.u = parcelReader.readBooleanObject(22, null);
        this.v = parcelReader.readInt(23, this.v);
        this.w = parcelReader.createStringList(24, (ArrayList) this.w);
    }

    public HuaweiMapOptions zoomGesturesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions zoomControlsEnabled(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions zOrderOnTop(boolean z) {
        this.f14124b = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f14123a);
        parcelWrite.writeBooleanObject(3, this.f14124b);
        parcelWrite.writeBooleanObject(4, this.f14125c);
        parcelWrite.writeBooleanObject(5, this.e);
        parcelWrite.writeBooleanObject(6, this.f);
        parcelWrite.writeBooleanObject(7, this.g);
        parcelWrite.writeBooleanObject(8, this.h);
        parcelWrite.writeBooleanObject(9, this.i);
        parcelWrite.writeBooleanObject(10, this.j);
        parcelWrite.writeBooleanObject(11, this.k);
        parcelWrite.writeBooleanObject(12, this.l);
        parcelWrite.writeBooleanObject(13, this.m);
        parcelWrite.writeFloatObject(14, this.n, true);
        parcelWrite.writeFloatObject(15, this.o, true);
        parcelWrite.writeParcelable(16, this.p, i, false);
        parcelWrite.writeParcelable(17, this.d, i, false);
        parcelWrite.writeBooleanObject(18, this.q);
        parcelWrite.writeString(19, this.r, false);
        parcelWrite.writeString(20, this.s, false);
        parcelWrite.writeBooleanObject(21, this.t, false);
        parcelWrite.writeBooleanObject(22, this.u, false);
        parcelWrite.writeInt(23, this.v);
        parcelWrite.writeStringList(24, this.w, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public HuaweiMapOptions useViewLifecycleInFragment(boolean z) {
        this.f14125c = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        return "HuaweiMapOptions{mapType=" + this.f14123a + ", zOrderOnTop=" + this.f14124b + ", isUseViewLifecycleInFragment=" + this.f14125c + ", cameraPosition=" + this.d + ", isZoomControlsEnabled=" + this.e + ", isCompassEnabled=" + this.f + ", isScrollGesturesEnabled=" + this.g + ", isZoomGesturesEnabled=" + this.h + ", isTiltGesturesEnabled=" + this.i + ", isRotateGesturesEnabled=" + this.j + ", isLiteMode=" + this.k + ", isMapToolbarEnabled=" + this.l + ", isAmbientEnabled=" + this.m + ", minZoomLevel=" + this.n + ", maxZoomLevel=" + this.o + ", latLngBounds=" + this.p + ", styleId=" + this.r + ", previewId=" + this.s + '}';
    }

    public HuaweiMapOptions tiltGesturesEnabled(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions styleId(String str) {
        this.r = str;
        return this;
    }

    public HuaweiMapOptions styleEnable(boolean z) {
        this.t = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions scrollGesturesEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions rotateGesturesEnabled(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions previewId(String str) {
        this.s = str;
        return this;
    }

    public HuaweiMapOptions minZoomPreference(float f) {
        this.n = Float.valueOf(f);
        return this;
    }

    public HuaweiMapOptions maxZoomPreference(float f) {
        this.o = Float.valueOf(f);
        return this;
    }

    public HuaweiMapOptions mapType(int i) {
        this.f14123a = i;
        return this;
    }

    public HuaweiMapOptions mapToolbarEnabled(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions mapStyle(int i) {
        this.v = i;
        return this;
    }

    public HuaweiMapOptions liteMode(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.p = latLngBounds;
        return this;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.h;
    }

    public Boolean getZoomControlsEnabled() {
        return this.e;
    }

    public Boolean getZOrderOnTop() {
        return this.f14124b;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.f14125c;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.i;
    }

    public String getStyleId() {
        return this.r;
    }

    public Boolean getStyleEnable() {
        return this.t;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.g;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.j;
    }

    public String getPreviewId() {
        return this.s;
    }

    public Float getMinZoomPreference() {
        return this.n;
    }

    public Float getMaxZoomPreference() {
        return this.o;
    }

    public int getMapType() {
        return this.f14123a;
    }

    public Boolean getMapToolbarEnabled() {
        return Boolean.FALSE;
    }

    public int getMapStyle() {
        return this.v;
    }

    public Boolean getLiteMode() {
        return this.k;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.p;
    }

    public Boolean getDark() {
        return this.u;
    }

    public List<String> getCustomStyles() {
        return this.w;
    }

    public Boolean getCompassEnabled() {
        return this.f;
    }

    public CameraPosition getCamera() {
        return this.d;
    }

    public Boolean getAmbientEnabled() {
        return Boolean.FALSE;
    }

    public HuaweiMapOptions dark(boolean z) {
        this.u = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions customStyles(List<String> list) {
        this.w = list;
        return this;
    }

    public HuaweiMapOptions compassEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public HuaweiMapOptions camera(CameraPosition cameraPosition) {
        this.d = cameraPosition;
        return this;
    }

    public HuaweiMapOptions ambientEnabled(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public static HuaweiMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        HuaweiMapOptions huaweiMapOptions = new HuaweiMapOptions();
        if (attributeSet == null) {
            LogM.d("ContentValues", "createFromAttributes() attrs is null");
            return huaweiMapOptions;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.MapAttrs, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(R.styleable.MapAttrs_mapType, 1);
            LogM.d("ContentValues", "createFromAttributes() mapyType is " + i);
            if (i != 0 && i != 3 && i != 8) {
                i = 1;
            }
            huaweiMapOptions.f14123a = i;
            huaweiMapOptions.d = CameraPosition.createFromAttributes(context, attributeSet);
            huaweiMapOptions.e = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
            huaweiMapOptions.f = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiCompass, true));
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
                huaweiMapOptions.h = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
                huaweiMapOptions.g = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
                huaweiMapOptions.j = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
                huaweiMapOptions.i = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
            }
            huaweiMapOptions.f14124b = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
            huaweiMapOptions.f14125c = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_useViewLifecycle, true));
            huaweiMapOptions.k = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_liteMode, false));
            huaweiMapOptions.q = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, false));
            huaweiMapOptions.l = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiMapToolbar, false));
            huaweiMapOptions.m = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
            huaweiMapOptions.n = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.MapAttrs_cameraMinZoomPreference, 3.0f));
            huaweiMapOptions.o = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, 22.0f));
            huaweiMapOptions.r = typedArrayObtainStyledAttributes.getString(R.styleable.MapAttrs_styleId);
            huaweiMapOptions.s = typedArrayObtainStyledAttributes.getString(R.styleable.MapAttrs_previewId);
            huaweiMapOptions.t = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_styleEnable, true));
            huaweiMapOptions.u = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapAttrs_dark, false));
            huaweiMapOptions.latLngBoundsForCameraTarget(buildLatLngBounds(context, attributeSet));
            huaweiMapOptions.v = typedArrayObtainStyledAttributes.getInt(R.styleable.MapAttrs_mapStyle, 0);
            return huaweiMapOptions;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static LatLngBounds buildLatLngBounds(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        Float fValueOf = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public static CameraPosition buildCameraPosition(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }
}
