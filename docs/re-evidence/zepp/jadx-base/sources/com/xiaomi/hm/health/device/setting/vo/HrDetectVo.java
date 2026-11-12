package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/HrDetectVo;", "", "", "component1", "", "component2", "component3", "component4", "isSupport", "type", "freq", "isShowDetectDialog", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", LogUtil.I, "getType", "()I", "c", "getFreq", GoogleApiAvailabilityLight.a, "<init>", "(ZIIZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HrDetectVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int freq;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isShowDetectDialog;

    public HrDetectVo(boolean z, int i, int i2, boolean z2) {
        this.isSupport = z;
        this.type = i;
        this.freq = i2;
        this.isShowDetectDialog = z2;
    }

    public static /* synthetic */ HrDetectVo copy$default(HrDetectVo hrDetectVo, boolean z, int i, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = hrDetectVo.isSupport;
        }
        if ((i3 & 2) != 0) {
            i = hrDetectVo.type;
        }
        if ((i3 & 4) != 0) {
            i2 = hrDetectVo.freq;
        }
        if ((i3 & 8) != 0) {
            z2 = hrDetectVo.isShowDetectDialog;
        }
        return hrDetectVo.copy(z, i, i2, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFreq() {
        return this.freq;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsShowDetectDialog() {
        return this.isShowDetectDialog;
    }

    @NotNull
    public final HrDetectVo copy(boolean isSupport, int type, int freq, boolean isShowDetectDialog) {
        return new HrDetectVo(isSupport, type, freq, isShowDetectDialog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrDetectVo)) {
            return false;
        }
        HrDetectVo hrDetectVo = (HrDetectVo) other;
        return this.isSupport == hrDetectVo.isSupport && this.type == hrDetectVo.type && this.freq == hrDetectVo.freq && this.isShowDetectDialog == hrDetectVo.isShowDetectDialog;
    }

    public final int getFreq() {
        return this.freq;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((r0 * 31) + this.type) * 31) + this.freq) * 31;
        boolean z2 = this.isShowDetectDialog;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isShowDetectDialog() {
        return this.isShowDetectDialog;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "HrDetectVo(isSupport=" + this.isSupport + ", type=" + this.type + ", freq=" + this.freq + ", isShowDetectDialog=" + this.isShowDetectDialog + ")";
    }

    public /* synthetic */ HrDetectVo(boolean z, int i, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, i2, (i3 & 8) != 0 ? false : z2);
    }
}
