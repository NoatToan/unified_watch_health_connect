package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\f\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/GesScreenVo;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "isSupport", "isEnable", "isAllDayEnable", "startTime", "endTime", "isShowTips", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "c", GoogleApiAvailabilityLight.a, LogUtil.I, "getStartTime", "()I", "e", "getEndTime", "f", "<init>", "(ZZZIIZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GesScreenVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isEnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isAllDayEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int startTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int endTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isShowTips;

    public GesScreenVo(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4) {
        this.isSupport = z;
        this.isEnable = z2;
        this.isAllDayEnable = z3;
        this.startTime = i;
        this.endTime = i2;
        this.isShowTips = z4;
    }

    public static /* synthetic */ GesScreenVo copy$default(GesScreenVo gesScreenVo, boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = gesScreenVo.isSupport;
        }
        if ((i3 & 2) != 0) {
            z2 = gesScreenVo.isEnable;
        }
        boolean z5 = z2;
        if ((i3 & 4) != 0) {
            z3 = gesScreenVo.isAllDayEnable;
        }
        boolean z6 = z3;
        if ((i3 & 8) != 0) {
            i = gesScreenVo.startTime;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = gesScreenVo.endTime;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z4 = gesScreenVo.isShowTips;
        }
        return gesScreenVo.copy(z, z5, z6, i4, i5, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAllDayEnable() {
        return this.isAllDayEnable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsShowTips() {
        return this.isShowTips;
    }

    @NotNull
    public final GesScreenVo copy(boolean isSupport, boolean isEnable, boolean isAllDayEnable, int startTime, int endTime, boolean isShowTips) {
        return new GesScreenVo(isSupport, isEnable, isAllDayEnable, startTime, endTime, isShowTips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GesScreenVo)) {
            return false;
        }
        GesScreenVo gesScreenVo = (GesScreenVo) other;
        return this.isSupport == gesScreenVo.isSupport && this.isEnable == gesScreenVo.isEnable && this.isAllDayEnable == gesScreenVo.isAllDayEnable && this.startTime == gesScreenVo.startTime && this.endTime == gesScreenVo.endTime && this.isShowTips == gesScreenVo.isShowTips;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isEnable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isAllDayEnable;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (((((i2 + r3) * 31) + this.startTime) * 31) + this.endTime) * 31;
        boolean z4 = this.isShowTips;
        return i3 + (z4 ? 1 : z4);
    }

    public final boolean isAllDayEnable() {
        return this.isAllDayEnable;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isShowTips() {
        return this.isShowTips;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "GesScreenVo(isSupport=" + this.isSupport + ", isEnable=" + this.isEnable + ", isAllDayEnable=" + this.isAllDayEnable + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isShowTips=" + this.isShowTips + ")";
    }

    public /* synthetic */ GesScreenVo(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z4);
    }
}
