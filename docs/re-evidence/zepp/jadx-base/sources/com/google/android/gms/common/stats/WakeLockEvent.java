package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    @SafeParcelable.VersionField(id = 1)
    public final int a;

    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getEventType", id = 11)
    private int c;

    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final String d;

    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String e;

    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final String f;

    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int g;

    @Nullable
    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    private final List<String> h;

    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final String i;

    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long j;

    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private int k;

    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final String l;

    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float m;

    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long n;

    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean o;
    private long p = -1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) @Nullable List<String> list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 14) int i4, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j3, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.g = i3;
        this.h = list;
        this.i = str2;
        this.j = j2;
        this.k = i4;
        this.l = str4;
        this.m = f;
        this.n = j3;
        this.o = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.g);
        SafeParcelWriter.writeStringList(parcel, 6, this.h, false);
        SafeParcelWriter.writeLong(parcel, 8, this.j);
        SafeParcelWriter.writeString(parcel, 10, this.e, false);
        SafeParcelWriter.writeInt(parcel, 11, this.c);
        SafeParcelWriter.writeString(parcel, 12, this.i, false);
        SafeParcelWriter.writeString(parcel, 13, this.l, false);
        SafeParcelWriter.writeInt(parcel, 14, this.k);
        SafeParcelWriter.writeFloat(parcel, 15, this.m);
        SafeParcelWriter.writeLong(parcel, 16, this.n);
        SafeParcelWriter.writeString(parcel, 17, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.p;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
        return this.b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzd() {
        List<String> list = this.h;
        String str = this.d;
        int i = this.g;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.k;
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.l;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.m;
        String str4 = this.f;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.o;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(strJoin).length() + str2.length() + str3.length() + str5.length());
        sb.append(HTTP.TAB);
        sb.append(str);
        sb.append(HTTP.TAB);
        sb.append(i);
        sb.append(HTTP.TAB);
        sb.append(strJoin);
        sb.append(HTTP.TAB);
        sb.append(i2);
        sb.append(HTTP.TAB);
        sb.append(str2);
        sb.append(HTTP.TAB);
        sb.append(str3);
        sb.append(HTTP.TAB);
        sb.append(f);
        sb.append(HTTP.TAB);
        sb.append(str5);
        sb.append(HTTP.TAB);
        sb.append(z);
        return sb.toString();
    }
}
