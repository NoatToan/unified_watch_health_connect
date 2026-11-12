package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import sn.a;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getEventType", id = 11)
    private final int zzc;

    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String zze;

    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final String zzf;

    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int zzg;

    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    private final List zzh;

    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final String zzi;

    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long zzj;

    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private final int zzk;

    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final String zzl;

    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzm;

    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long zzn;

    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean zzo;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) long j8, @SafeParcelable.Param(id = 11) int i15, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i16, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j14, @SafeParcelable.Param(id = 14) int i17, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f14, @SafeParcelable.Param(id = 16) long j15, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z14) {
        this.zza = i14;
        this.zzb = j8;
        this.zzc = i15;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i16;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j14;
        this.zzk = i17;
        this.zzl = str4;
        this.zzm = f14;
        this.zzn = j15;
        this.zzo = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i14 = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f14 = this.zzm;
        String str3 = this.zzf;
        int i15 = this.zzg;
        String str4 = this.zzd;
        boolean z14 = this.zzo;
        int length = String.valueOf(i14).length() + String.valueOf(i15).length() + String.valueOf(str4).length() + 2 + 1 + String.valueOf(strJoin).length() + 1;
        if (str == null) {
            str = "";
        }
        int length2 = str.length() + length + 1 + 1;
        if (str2 == null) {
            str2 = "";
        }
        int length3 = String.valueOf(f14).length() + str2.length() + length2 + 1 + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb3 = new StringBuilder(str5.length() + length3 + 1 + String.valueOf(z14).length());
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(str4);
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(i15);
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(strJoin);
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(i14);
        a.t(sb3, SyslogAppender.DEFAULT_STACKTRACE_PATTERN, str, SyslogAppender.DEFAULT_STACKTRACE_PATTERN, str2);
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(f14);
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(str5);
        sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb3.append(z14);
        return sb3.toString();
    }
}
