package com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.ui.fragment.SnoreListFragment;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(indices = {@Index(unique = true, value = {"timeStamp", "userId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003Jl\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0012\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0014\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0016\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\u0017\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b:\u0010&R\u001c\u0010\u0018\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010&¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaProcessEntity;", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2Entity;", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "id", "userId", "timeStamp", "spo2", "duration", SnoreListFragment.TYPE_UPLOAD, "deviceSource", "deviceId", "sn", "copy", "(Ljava/lang/Long;Ljava/lang/String;JIIZILjava/lang/String;Ljava/lang/String;)Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaProcessEntity;", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/Long;", "getId", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "J", "getTimeStamp", "()J", GoogleApiAvailabilityLight.a, LogUtil.I, "getSpo2", "()I", "e", "getDuration", "f", "Z", "getUpload", "()Z", "setUpload", "(Z)V", "g", "getDeviceSource", "h", "getDeviceId", "i", "getSn", "<init>", "(Ljava/lang/Long;Ljava/lang/String;JIIZILjava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OsaProcessEntity implements Spo2Entity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    private final Long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int spo2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int duration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean upload;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int deviceSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String sn;

    public OsaProcessEntity(@Nullable Long l, @NotNull String str, long j, int i, int i2, boolean z, int i3, @NotNull String str2, @NotNull String str3) {
        this.id = l;
        this.userId = str;
        this.timeStamp = j;
        this.spo2 = i;
        this.duration = i2;
        this.upload = z;
        this.deviceSource = i3;
        this.deviceId = str2;
        this.sn = str3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final long component3() {
        return getTimeStamp();
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSpo2() {
        return this.spo2;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUpload() {
        return this.upload;
    }

    public final int component7() {
        return getDeviceSource();
    }

    @NotNull
    public final String component8() {
        return getDeviceId();
    }

    @NotNull
    public final String component9() {
        return getSn();
    }

    @NotNull
    public final OsaProcessEntity copy(@Nullable Long id, @NotNull String userId, long timeStamp, int spo2, int duration, boolean upload, int deviceSource, @NotNull String deviceId, @NotNull String sn) {
        return new OsaProcessEntity(id, userId, timeStamp, spo2, duration, upload, deviceSource, deviceId, sn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OsaProcessEntity)) {
            return false;
        }
        OsaProcessEntity osaProcessEntity = (OsaProcessEntity) other;
        return Intrinsics.areEqual(this.id, osaProcessEntity.id) && Intrinsics.areEqual(this.userId, osaProcessEntity.userId) && getTimeStamp() == osaProcessEntity.getTimeStamp() && this.spo2 == osaProcessEntity.spo2 && this.duration == osaProcessEntity.duration && this.upload == osaProcessEntity.upload && getDeviceSource() == osaProcessEntity.getDeviceSource() && Intrinsics.areEqual(getDeviceId(), osaProcessEntity.getDeviceId()) && Intrinsics.areEqual(getSn(), osaProcessEntity.getSn());
    }

    @Override // com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2Entity
    @NotNull
    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2Entity
    public int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2Entity
    @NotNull
    public String getSn() {
        return this.sn;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2Entity
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public final boolean getUpload() {
        return this.upload;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = (((((((((l == null ? 0 : l.hashCode()) * 31) + this.userId.hashCode()) * 31) + b.a(getTimeStamp())) * 31) + this.spo2) * 31) + this.duration) * 31;
        boolean z = this.upload;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((iHashCode + r1) * 31) + getDeviceSource()) * 31) + getDeviceId().hashCode()) * 31) + getSn().hashCode();
    }

    public final void setUpload(boolean z) {
        this.upload = z;
    }

    @NotNull
    public String toString() {
        return "OsaProcessEntity(id=" + this.id + ", userId=" + this.userId + ", timeStamp=" + getTimeStamp() + ", spo2=" + this.spo2 + ", duration=" + this.duration + ", upload=" + this.upload + ", deviceSource=" + getDeviceSource() + ", deviceId=" + getDeviceId() + ", sn=" + getSn() + ")";
    }

    public /* synthetic */ OsaProcessEntity(Long l, String str, long j, int i, int i2, boolean z, int i3, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : l, str, j, i, i2, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? -1 : i3, (i4 & 128) != 0 ? "" : str2, (i4 & 256) != 0 ? "" : str3);
    }
}
