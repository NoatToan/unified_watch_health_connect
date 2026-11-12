package com.huami.bluetooth.profile.channel.module.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B3\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNSummaryResult;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "weekTrimp", "dayTrimp", "status", EcgData.TIMESTAMP_SERVER_UPDATED, "updateTimeTz", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getWeekTrimp", "()I", "b", "getDayTrimp", "c", "F", "getStatus", "()F", GoogleApiAvailabilityLight.a, "J", "getUpdateTime", "()J", "e", "getUpdateTimeTz", "<init>", "(IIFJI)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PHNSummaryResult {
    public static final int INVALID_TZ = -56;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int weekTrimp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int dayTrimp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long updateTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int updateTimeTz;

    public PHNSummaryResult(int i, int i2, float f, long j, int i3) {
        this.weekTrimp = i;
        this.dayTrimp = i2;
        this.status = f;
        this.updateTime = j;
        this.updateTimeTz = i3;
    }

    public static /* synthetic */ PHNSummaryResult copy$default(PHNSummaryResult pHNSummaryResult, int i, int i2, float f, long j, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pHNSummaryResult.weekTrimp;
        }
        if ((i4 & 2) != 0) {
            i2 = pHNSummaryResult.dayTrimp;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            f = pHNSummaryResult.status;
        }
        float f2 = f;
        if ((i4 & 8) != 0) {
            j = pHNSummaryResult.updateTime;
        }
        long j2 = j;
        if ((i4 & 16) != 0) {
            i3 = pHNSummaryResult.updateTimeTz;
        }
        return pHNSummaryResult.copy(i, i5, f2, j2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWeekTrimp() {
        return this.weekTrimp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDayTrimp() {
        return this.dayTrimp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUpdateTimeTz() {
        return this.updateTimeTz;
    }

    @NotNull
    public final PHNSummaryResult copy(int weekTrimp, int dayTrimp, float status, long updateTime, int updateTimeTz) {
        return new PHNSummaryResult(weekTrimp, dayTrimp, status, updateTime, updateTimeTz);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNSummaryResult)) {
            return false;
        }
        PHNSummaryResult pHNSummaryResult = (PHNSummaryResult) other;
        return this.weekTrimp == pHNSummaryResult.weekTrimp && this.dayTrimp == pHNSummaryResult.dayTrimp && Intrinsics.areEqual((Object) Float.valueOf(this.status), (Object) Float.valueOf(pHNSummaryResult.status)) && this.updateTime == pHNSummaryResult.updateTime && this.updateTimeTz == pHNSummaryResult.updateTimeTz;
    }

    public final int getDayTrimp() {
        return this.dayTrimp;
    }

    public final float getStatus() {
        return this.status;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getUpdateTimeTz() {
        return this.updateTimeTz;
    }

    public final int getWeekTrimp() {
        return this.weekTrimp;
    }

    public int hashCode() {
        return (((((((this.weekTrimp * 31) + this.dayTrimp) * 31) + Float.floatToIntBits(this.status)) * 31) + b.a(this.updateTime)) * 31) + this.updateTimeTz;
    }

    @NotNull
    public String toString() {
        return "PHNSummaryResult(weekTrimp=" + this.weekTrimp + ", dayTrimp=" + this.dayTrimp + ", status=" + this.status + ", updateTime=" + this.updateTime + ", updateTimeTz=" + this.updateTimeTz + ')';
    }

    public /* synthetic */ PHNSummaryResult(int i, int i2, float f, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -56 : i3);
    }
}
