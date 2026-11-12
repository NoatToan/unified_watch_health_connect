package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.PlatformVersion;
import f.c;
import f.i;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zzc;

    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    private final ConnectionResult zzd;

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_API_NOT_CONNECTED = new Status(17);

    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zze();

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) ConnectionResult connectionResult) {
        this.zza = i14;
        this.zzb = str;
        this.zzc = pendingIntent;
        this.zzd = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zza == status.zza && Objects.equal(this.zzb, status.zzb) && Objects.equal(this.zzc, status.zzc) && Objects.equal(this.zzd, status.zzd);
    }

    public ConnectionResult getConnectionResult() {
        return this.zzd;
    }

    public PendingIntent getResolution() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zza;
    }

    public String getStatusMessage() {
        return this.zzb;
    }

    public boolean hasResolution() {
        return this.zzc != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    public boolean isCanceled() {
        return this.zza == 16;
    }

    public boolean isInterrupted() {
        return this.zza == 14;
    }

    public boolean isSuccess() {
        return this.zza <= 0;
    }

    public void startResolutionForResult(Activity activity, int i14) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            Bundle bundle = PlatformVersion.isAtLeastU() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            PendingIntent pendingIntent = this.zzc;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i14, null, 0, 0, 0, bundle);
        }
    }

    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add("resolution", this.zzc);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        String str = this.zzb;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.zza);
    }

    public Status(int i14) {
        this(i14, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i14, String str) {
        this(i14, str, (PendingIntent) null);
    }

    @KeepForSdk
    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i14) {
        this(i14, str, connectionResult.getResolution(), connectionResult);
    }

    public Status(int i14, String str, PendingIntent pendingIntent) {
        this(i14, str, pendingIntent, null);
    }

    public void startResolutionForResult(c<i> cVar) {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            Preconditions.checkNotNull(pendingIntent);
            cVar.a(new i.a(pendingIntent.getIntentSender()).a(), null);
        }
    }
}
