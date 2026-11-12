package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzu();

    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzaf a;
    private TileProvider b;

    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean c;

    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float d;

    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean e;

    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float f;

    public TileOverlayOptions() {
        this.c = true;
        this.e = true;
        this.f = 0.0f;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) float f2) {
        this.c = true;
        this.e = true;
        this.f = 0.0f;
        zzaf zzafVarZzk = zzag.zzk(iBinder);
        this.a = zzafVarZzk;
        this.b = zzafVarZzk == null ? null : new a(this);
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = f2;
    }

    public final TileOverlayOptions fadeIn(boolean z) {
        this.e = z;
        return this;
    }

    public final boolean getFadeIn() {
        return this.e;
    }

    public final TileProvider getTileProvider() {
        return this.b;
    }

    public final float getTransparency() {
        return this.f;
    }

    public final float getZIndex() {
        return this.d;
    }

    public final boolean isVisible() {
        return this.c;
    }

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.b = tileProvider;
        this.a = tileProvider == null ? null : new b(this, tileProvider);
        return this;
    }

    public final TileOverlayOptions transparency(float f) {
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.f = f;
        return this;
    }

    public final TileOverlayOptions visible(boolean z) {
        this.c = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.a.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final TileOverlayOptions zIndex(float f) {
        this.d = f;
        return this;
    }
}
