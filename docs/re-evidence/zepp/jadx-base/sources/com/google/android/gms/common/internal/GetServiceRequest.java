package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    @SafeParcelable.VersionField(id = 1)
    public final int a;

    @SafeParcelable.Field(id = 2)
    public final int b;

    @SafeParcelable.Field(id = 3)
    public int c;

    @SafeParcelable.Field(id = 4)
    public String d;

    @SafeParcelable.Field(id = 5)
    public IBinder e;

    @SafeParcelable.Field(id = 6)
    public Scope[] f;

    @SafeParcelable.Field(id = 7)
    public Bundle g;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public Account h;

    @SafeParcelable.Field(id = 10)
    public Feature[] i;

    @SafeParcelable.Field(id = 11)
    public Feature[] j;

    @SafeParcelable.Field(id = 12)
    public boolean k;

    @SafeParcelable.Field(defaultValue = "0", id = 13)
    public int l;

    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean m;

    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private String n;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) boolean z2, @Nullable @SafeParcelable.Param(id = 15) String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            this.h = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = featureArr;
        this.j = featureArr2;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzm.a(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.n;
    }

    public GetServiceRequest(int i, @Nullable String str) {
        this.a = 6;
        this.c = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.b = i;
        this.k = true;
        this.n = str;
    }
}
