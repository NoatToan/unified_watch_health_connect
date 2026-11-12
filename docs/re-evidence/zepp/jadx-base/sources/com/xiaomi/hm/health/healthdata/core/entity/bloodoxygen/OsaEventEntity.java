package com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.loc.z;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(indices = {@Index(unique = true, value = {"timeStamp", "userId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003JX\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000f\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0011\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u001c\u0010\u0012\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u0019\u0010\u0013\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*\"\u0004\b3\u00104R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\b068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010A\u001a\b\u0012\u0004\u0012\u00020\b068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\"\u0010H\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaEventEntity;", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2Entity;", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "", "component4", "component5", "component6", "component7", "id", "userId", "timeStamp", "deviceSource", "deviceId", "sn", "dateStr", "copy", "(Ljava/lang/Long;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaEventEntity;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Long;", "getId", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "J", "getTimeStamp", "()J", GoogleApiAvailabilityLight.a, LogUtil.I, "getDeviceSource", "()I", "e", "getDeviceId", "f", "getSn", "g", "getDateStr", "h", "getSpo2Decrease", "setSpo2Decrease", "(I)V", "spo2Decrease", "", "i", "Ljava/util/List;", "getSpo2", "()Ljava/util/List;", "setSpo2", "(Ljava/util/List;)V", "spo2", z.j, "getHr", "setHr", Constants.DATA_KEY_HR, hl.k, "Z", "getUpload", "()Z", "setUpload", "(Z)V", SnoreListFragment.TYPE_UPLOAD, "<init>", "(Ljava/lang/Long;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OsaEventEntity implements Spo2Entity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    private final Long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int deviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String dateStr;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int spo2Decrease;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private List<Integer> spo2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private List<Integer> hr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean upload;

    public OsaEventEntity(@Nullable Long l, @NotNull String str, long j, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.id = l;
        this.userId = str;
        this.timeStamp = j;
        this.deviceSource = i;
        this.deviceId = str2;
        this.sn = str3;
        this.dateStr = str4;
        this.spo2 = CollectionsKt__CollectionsKt.emptyList();
        this.hr = CollectionsKt__CollectionsKt.emptyList();
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

    public final int component4() {
        return getDeviceSource();
    }

    @NotNull
    public final String component5() {
        return getDeviceId();
    }

    @NotNull
    public final String component6() {
        return getSn();
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
    }

    @NotNull
    public final OsaEventEntity copy(@Nullable Long id, @NotNull String userId, long timeStamp, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull String dateStr) {
        return new OsaEventEntity(id, userId, timeStamp, deviceSource, deviceId, sn, dateStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OsaEventEntity)) {
            return false;
        }
        OsaEventEntity osaEventEntity = (OsaEventEntity) other;
        return Intrinsics.areEqual(this.id, osaEventEntity.id) && Intrinsics.areEqual(this.userId, osaEventEntity.userId) && getTimeStamp() == osaEventEntity.getTimeStamp() && getDeviceSource() == osaEventEntity.getDeviceSource() && Intrinsics.areEqual(getDeviceId(), osaEventEntity.getDeviceId()) && Intrinsics.areEqual(getSn(), osaEventEntity.getSn()) && Intrinsics.areEqual(this.dateStr, osaEventEntity.dateStr);
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

    @NotNull
    public final List<Integer> getHr() {
        return this.hr;
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

    @NotNull
    public final List<Integer> getSpo2() {
        return this.spo2;
    }

    public final int getSpo2Decrease() {
        return this.spo2Decrease;
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

    public int hashCode() {
        Long l = this.id;
        return ((((((((((((l == null ? 0 : l.hashCode()) * 31) + this.userId.hashCode()) * 31) + b.a(getTimeStamp())) * 31) + getDeviceSource()) * 31) + getDeviceId().hashCode()) * 31) + getSn().hashCode()) * 31) + this.dateStr.hashCode();
    }

    public final void setHr(@NotNull List<Integer> list) {
        this.hr = list;
    }

    public final void setSpo2(@NotNull List<Integer> list) {
        this.spo2 = list;
    }

    public final void setSpo2Decrease(int i) {
        this.spo2Decrease = i;
    }

    public final void setUpload(boolean z) {
        this.upload = z;
    }

    @NotNull
    public String toString() {
        return "OsaEventEntity(id=" + this.id + ", userId=" + this.userId + ", timeStamp=" + getTimeStamp() + ", deviceSource=" + getDeviceSource() + ", deviceId=" + getDeviceId() + ", sn=" + getSn() + ", dateStr=" + this.dateStr + ")";
    }

    public /* synthetic */ OsaEventEntity(Long l, String str, long j, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, str, j, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? HealthDataTimeUtils.INSTANCE.formatTime(j, "yyyy-MM-dd") : str4);
    }
}
