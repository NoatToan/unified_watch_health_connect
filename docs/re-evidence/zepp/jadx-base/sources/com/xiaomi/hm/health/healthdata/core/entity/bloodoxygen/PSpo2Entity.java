package com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(indices = {@Index(unique = true, value = {"timeStamp", "userId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003Jl\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0012\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0019\u0010\u0015\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&R\u001c\u0010\u0016\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\u0017\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b:\u0010&R\u001c\u0010\u0018\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010&¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2Entity;", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "id", "userId", "timeStamp", "spo2", SnoreListFragment.TYPE_UPLOAD, "dateStr", "deviceSource", "deviceId", "sn", "copy", "(Ljava/lang/Long;Ljava/lang/String;JIZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/Long;", "getId", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "J", "getTimeStamp", "()J", GoogleApiAvailabilityLight.a, LogUtil.I, "getSpo2", "()I", "e", "Z", "getUpload", "()Z", "setUpload", "(Z)V", "f", "getDateStr", "g", "getDeviceSource", "h", "getDeviceId", "i", "getSn", "<init>", "(Ljava/lang/Long;Ljava/lang/String;JIZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PSpo2Entity implements Spo2Entity {

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
    private boolean upload;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String dateStr;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int deviceSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String sn;

    public PSpo2Entity(@Nullable Long l, @NotNull String str, long j, int i, boolean z, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4) {
        this.id = l;
        this.userId = str;
        this.timeStamp = j;
        this.spo2 = i;
        this.upload = z;
        this.dateStr = str2;
        this.deviceSource = i2;
        this.deviceId = str3;
        this.sn = str4;
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
    public final boolean getUpload() {
        return this.upload;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
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
    public final PSpo2Entity copy(@Nullable Long id, @NotNull String userId, long timeStamp, int spo2, boolean upload, @NotNull String dateStr, int deviceSource, @NotNull String deviceId, @NotNull String sn) {
        return new PSpo2Entity(id, userId, timeStamp, spo2, upload, dateStr, deviceSource, deviceId, sn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PSpo2Entity)) {
            return false;
        }
        PSpo2Entity pSpo2Entity = (PSpo2Entity) other;
        return Intrinsics.areEqual(this.id, pSpo2Entity.id) && Intrinsics.areEqual(this.userId, pSpo2Entity.userId) && getTimeStamp() == pSpo2Entity.getTimeStamp() && this.spo2 == pSpo2Entity.spo2 && this.upload == pSpo2Entity.upload && Intrinsics.areEqual(this.dateStr, pSpo2Entity.dateStr) && getDeviceSource() == pSpo2Entity.getDeviceSource() && Intrinsics.areEqual(getDeviceId(), pSpo2Entity.getDeviceId()) && Intrinsics.areEqual(getSn(), pSpo2Entity.getSn());
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
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
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = (((((((l == null ? 0 : l.hashCode()) * 31) + this.userId.hashCode()) * 31) + b.a(getTimeStamp())) * 31) + this.spo2) * 31;
        boolean z = this.upload;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + this.dateStr.hashCode()) * 31) + getDeviceSource()) * 31) + getDeviceId().hashCode()) * 31) + getSn().hashCode();
    }

    public final void setUpload(boolean z) {
        this.upload = z;
    }

    @NotNull
    public String toString() {
        return "PSpo2Entity(id=" + this.id + ", userId=" + this.userId + ", timeStamp=" + getTimeStamp() + ", spo2=" + this.spo2 + ", upload=" + this.upload + ", dateStr=" + this.dateStr + ", deviceSource=" + getDeviceSource() + ", deviceId=" + getDeviceId() + ", sn=" + getSn() + ")";
    }

    public /* synthetic */ PSpo2Entity(Long l, String str, long j, int i, boolean z, String str2, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : l, str, j, i, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? HealthDataTimeUtils.INSTANCE.formatTime(j, "yyyy-MM-dd") : str2, (i3 & 64) != 0 ? -1 : i2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? "" : str4);
    }
}
