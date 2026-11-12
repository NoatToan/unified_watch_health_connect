package com.huami.bloodoxygen.bluetooth.synctime.remote.api.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006)"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "toString", "", "getMax", "", "other", "", "equals", "component1", "component2", "component3", "clickSpo2Time", "osaProcessTime", "osaEventTime", "copy", "", "hashCode", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "J", "getClickSpo2Time", "()J", "setClickSpo2Time", "(J)V", "b", "getOsaProcessTime", "setOsaProcessTime", "c", "getOsaEventTime", "setOsaEventTime", "<init>", "(JJJ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodOxygenSyncTime implements Serializable, Parcelable {
    private static final int d = -1;
    private static final long e = 259200000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("spo2SyncSecondTime")
    private long clickSpo2Time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("osaSpo2SyncSecondTime")
    private long osaProcessTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("osaEventSyncSecondTime")
    private long osaEventTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BloodOxygenSyncTime> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime$Companion;", "", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "getDefault", "()Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "default", "", "MORE_DAY", "J", "", "UNDEFINE", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodOxygenSyncTime getDefault() {
            BloodOxygenSyncTime bloodOxygenSyncTime = new BloodOxygenSyncTime(0L, 0L, 0L, 7, null);
            long jCurrentTimeMillis = (System.currentTimeMillis() - BloodOxygenSyncTime.e) / ((long) 1000);
            bloodOxygenSyncTime.setClickSpo2Time(jCurrentTimeMillis);
            bloodOxygenSyncTime.setOsaProcessTime(jCurrentTimeMillis);
            bloodOxygenSyncTime.setOsaEventTime(jCurrentTimeMillis);
            return bloodOxygenSyncTime;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<BloodOxygenSyncTime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BloodOxygenSyncTime createFromParcel(@NotNull Parcel parcel) {
            return new BloodOxygenSyncTime(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BloodOxygenSyncTime[] newArray(int i) {
            return new BloodOxygenSyncTime[i];
        }
    }

    public BloodOxygenSyncTime() {
        this(0L, 0L, 0L, 7, null);
    }

    public BloodOxygenSyncTime(long j, long j2, long j3) {
        this.clickSpo2Time = j;
        this.osaProcessTime = j2;
        this.osaEventTime = j3;
    }

    public static /* synthetic */ BloodOxygenSyncTime copy$default(BloodOxygenSyncTime bloodOxygenSyncTime, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bloodOxygenSyncTime.clickSpo2Time;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = bloodOxygenSyncTime.osaProcessTime;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = bloodOxygenSyncTime.osaEventTime;
        }
        return bloodOxygenSyncTime.copy(j4, j5, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getClickSpo2Time() {
        return this.clickSpo2Time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOsaProcessTime() {
        return this.osaProcessTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getOsaEventTime() {
        return this.osaEventTime;
    }

    @NotNull
    public final BloodOxygenSyncTime copy(long clickSpo2Time, long osaProcessTime, long osaEventTime) {
        return new BloodOxygenSyncTime(clickSpo2Time, osaProcessTime, osaEventTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof BloodOxygenSyncTime)) {
            return false;
        }
        BloodOxygenSyncTime bloodOxygenSyncTime = (BloodOxygenSyncTime) other;
        return this.clickSpo2Time == bloodOxygenSyncTime.clickSpo2Time && this.osaProcessTime == bloodOxygenSyncTime.osaProcessTime && this.osaEventTime == bloodOxygenSyncTime.osaEventTime;
    }

    public final long getClickSpo2Time() {
        return this.clickSpo2Time;
    }

    public final long getMax() {
        return e.coerceAtLeast(e.coerceAtLeast(this.clickSpo2Time, this.osaProcessTime), this.osaEventTime);
    }

    public final long getOsaEventTime() {
        return this.osaEventTime;
    }

    public final long getOsaProcessTime() {
        return this.osaProcessTime;
    }

    public int hashCode() {
        return (((b.a(this.clickSpo2Time) * 31) + b.a(this.osaProcessTime)) * 31) + b.a(this.osaEventTime);
    }

    public final void setClickSpo2Time(long j) {
        this.clickSpo2Time = j;
    }

    public final void setOsaEventTime(long j) {
        this.osaEventTime = j;
    }

    public final void setOsaProcessTime(long j) {
        this.osaProcessTime = j;
    }

    @NotNull
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeLong(this.clickSpo2Time);
        parcel.writeLong(this.osaProcessTime);
        parcel.writeLong(this.osaEventTime);
    }

    public /* synthetic */ BloodOxygenSyncTime(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? -1L : j2, (i & 4) != 0 ? -1L : j3);
    }
}
