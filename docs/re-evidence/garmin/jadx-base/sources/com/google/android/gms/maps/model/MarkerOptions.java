package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng zza;

    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String zzc;

    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;

    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float zze;

    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float zzj;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float zzl;

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float zzm;

    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float zzn;

    @AdvancedMarkerOptions.CollisionBehavior
    @SafeParcelable.Field(getter = "getCollisionBehaviorInternal", id = 17)
    private int zzo;

    @SafeParcelable.Field(getter = "getIconViewBinder", id = 18, type = "android.os.IBinder")
    private View zzp;

    @SafeParcelable.Field(getter = "getMarkerType", id = 19)
    private int zzq;

    @SafeParcelable.Field(getter = "getContentDescription", id = 20)
    private String zzr;

    @SafeParcelable.Field(getter = "getAltitudeInternal", id = 21)
    private float zzs;

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) float f14, @SafeParcelable.Param(id = 7) float f15, @SafeParcelable.Param(id = 8) boolean z14, @SafeParcelable.Param(id = 9) boolean z15, @SafeParcelable.Param(id = 10) boolean z16, @SafeParcelable.Param(id = 11) float f16, @SafeParcelable.Param(id = 12) float f17, @SafeParcelable.Param(id = 13) float f18, @SafeParcelable.Param(id = 14) float f19, @SafeParcelable.Param(id = 15) float f22, @SafeParcelable.Param(id = 17) int i14, @SafeParcelable.Param(id = 18) IBinder iBinder2, @SafeParcelable.Param(id = 19) int i15, @SafeParcelable.Param(id = 20) String str3, @SafeParcelable.Param(id = 21) float f24) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f14;
        this.zzf = f15;
        this.zzg = z14;
        this.zzh = z15;
        this.zzi = z16;
        this.zzj = f16;
        this.zzk = f17;
        this.zzl = f18;
        this.zzm = f19;
        this.zzn = f22;
        this.zzq = i15;
        this.zzo = i14;
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.zzp = iObjectWrapperAsInterface != null ? (View) ObjectWrapper.unwrap(iObjectWrapperAsInterface) : null;
        this.zzr = str3;
        this.zzs = f24;
    }

    public MarkerOptions alpha(float f14) {
        this.zzm = f14;
        return this;
    }

    public MarkerOptions anchor(float f14, float f15) {
        this.zze = f14;
        this.zzf = f15;
        return this;
    }

    public MarkerOptions contentDescription(String str) {
        this.zzr = str;
        return this;
    }

    public MarkerOptions draggable(boolean z14) {
        this.zzg = z14;
        return this;
    }

    public MarkerOptions flat(boolean z14) {
        this.zzi = z14;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    public String getSnippet() {
        return this.zzc;
    }

    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f14, float f15) {
        this.zzk = f14;
        this.zzl = f15;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        h.s("latlng cannot be null - a position is required.");
        return null;
    }

    public MarkerOptions rotation(float f14) {
        this.zzj = f14;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.zzc = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.zzb = str;
        return this;
    }

    public MarkerOptions visible(boolean z14) {
        this.zzh = z14;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i14, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.writeInt(parcel, 17, this.zzo);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 19, this.zzq);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeFloat(parcel, 21, this.zzs);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public MarkerOptions zIndex(float f14) {
        this.zzn = f14;
        return this;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzq;
    }

    public final View zzc() {
        return this.zzp;
    }

    public final MarkerOptions zzd(@AdvancedMarkerOptions.CollisionBehavior int i14) {
        this.zzo = i14;
        return this;
    }

    public final MarkerOptions zze(View view2) {
        this.zzp = view2;
        return this;
    }

    public final MarkerOptions zzf(int i14) {
        this.zzq = 1;
        return this;
    }

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
    }
}
