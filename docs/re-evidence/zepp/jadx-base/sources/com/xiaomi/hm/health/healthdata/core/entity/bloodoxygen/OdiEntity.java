package com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.loc.z;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(indices = {@Index(unique = true, value = {"timeStamp", "userId", "dateStr"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\bN\u0010OJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u008a\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0004R\u0019\u0010\u0015\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0016\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0017\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0018\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u001a\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u001b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u00101R\u001c\u0010\u001c\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010-R\u001c\u0010\u001d\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\"\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010/\u001a\u0004\bI\u00101\"\u0004\bJ\u0010KR\u0019\u0010\u001f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bM\u0010-¨\u0006P"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OdiEntity;", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2Entity;", "", "component1", "()Ljava/lang/Long;", "", "component2", "", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "id", "userId", HMFwOnlineAnalyticsKt.COST, "odi", "odTimes", SnoreListFragment.TYPE_UPLOAD, "timeStamp", "deviceSource", "deviceId", "sn", "valid", "dateStr", "copy", "(Ljava/lang/Long;Ljava/lang/String;IFIZJILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OdiEntity;", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/Long;", "getId", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", LogUtil.I, "getCost", "()I", GoogleApiAvailabilityLight.a, "F", "getOdi", "()F", "e", "getOdTimes", "f", "Z", "getUpload", "()Z", "setUpload", "(Z)V", "g", "J", "getTimeStamp", "()J", "h", "getDeviceSource", "i", "getDeviceId", z.j, "getSn", hl.k, "getValid", "setValid", "(I)V", "l", "getDateStr", "<init>", "(Ljava/lang/Long;Ljava/lang/String;IFIZJILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OdiEntity implements Spo2Entity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    private final Long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int cost;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float odi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int odTimes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean upload;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long timeStamp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int deviceSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private int valid;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final String dateStr;

    public OdiEntity(@Nullable Long l, @NotNull String str, int i, float f, int i2, boolean z, long j, int i3, @NotNull String str2, @NotNull String str3, int i4, @NotNull String str4) {
        this.id = l;
        this.userId = str;
        this.cost = i;
        this.odi = f;
        this.odTimes = i2;
        this.upload = z;
        this.timeStamp = j;
        this.deviceSource = i3;
        this.deviceId = str2;
        this.sn = str3;
        this.valid = i4;
        this.dateStr = str4;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @NotNull
    public final String component10() {
        return getSn();
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getValid() {
        return this.valid;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getOdi() {
        return this.odi;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOdTimes() {
        return this.odTimes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUpload() {
        return this.upload;
    }

    public final long component7() {
        return getTimeStamp();
    }

    public final int component8() {
        return getDeviceSource();
    }

    @NotNull
    public final String component9() {
        return getDeviceId();
    }

    @NotNull
    public final OdiEntity copy(@Nullable Long id, @NotNull String userId, int cost, float odi, int odTimes, boolean upload, long timeStamp, int deviceSource, @NotNull String deviceId, @NotNull String sn, int valid, @NotNull String dateStr) {
        return new OdiEntity(id, userId, cost, odi, odTimes, upload, timeStamp, deviceSource, deviceId, sn, valid, dateStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OdiEntity)) {
            return false;
        }
        OdiEntity odiEntity = (OdiEntity) other;
        return Intrinsics.areEqual(this.id, odiEntity.id) && Intrinsics.areEqual(this.userId, odiEntity.userId) && this.cost == odiEntity.cost && Intrinsics.areEqual((Object) Float.valueOf(this.odi), (Object) Float.valueOf(odiEntity.odi)) && this.odTimes == odiEntity.odTimes && this.upload == odiEntity.upload && getTimeStamp() == odiEntity.getTimeStamp() && getDeviceSource() == odiEntity.getDeviceSource() && Intrinsics.areEqual(getDeviceId(), odiEntity.getDeviceId()) && Intrinsics.areEqual(getSn(), odiEntity.getSn()) && this.valid == odiEntity.valid && Intrinsics.areEqual(this.dateStr, odiEntity.dateStr);
    }

    public final int getCost() {
        return this.cost;
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

    public final int getOdTimes() {
        return this.odTimes;
    }

    public final float getOdi() {
        return this.odi;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2Entity
    @NotNull
    public String getSn() {
        return this.sn;
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

    public final int getValid() {
        return this.valid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = (((((((((l == null ? 0 : l.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.cost) * 31) + Float.floatToIntBits(this.odi)) * 31) + this.odTimes) * 31;
        boolean z = this.upload;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + b.a(getTimeStamp())) * 31) + getDeviceSource()) * 31) + getDeviceId().hashCode()) * 31) + getSn().hashCode()) * 31) + this.valid) * 31) + this.dateStr.hashCode();
    }

    public final void setUpload(boolean z) {
        this.upload = z;
    }

    public final void setValid(int i) {
        this.valid = i;
    }

    @NotNull
    public String toString() {
        return "OdiEntity(id=" + this.id + ", userId=" + this.userId + ", cost=" + this.cost + ", odi=" + this.odi + ", odTimes=" + this.odTimes + ", upload=" + this.upload + ", timeStamp=" + getTimeStamp() + ", deviceSource=" + getDeviceSource() + ", deviceId=" + getDeviceId() + ", sn=" + getSn() + ", valid=" + this.valid + ", dateStr=" + this.dateStr + ")";
    }

    public /* synthetic */ OdiEntity(Long l, String str, int i, float f, int i2, boolean z, long j, int i3, String str2, String str3, int i4, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : l, str, i, f, i2, (i5 & 32) != 0 ? false : z, j, (i5 & 128) != 0 ? -1 : i3, (i5 & 256) != 0 ? "" : str2, (i5 & 512) != 0 ? "" : str3, (i5 & 1024) != 0 ? -1 : i4, (i5 & 2048) != 0 ? HealthDataTimeUtils.INSTANCE.formatTime(j, "yyyy-MM-dd") : str4);
    }
}
