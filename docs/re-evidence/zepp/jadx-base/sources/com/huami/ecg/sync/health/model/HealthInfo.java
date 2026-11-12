package com.huami.ecg.sync.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;BM\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0006HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105¨\u0006<"}, d2 = {"Lcom/huami/ecg/sync/health/model/HealthInfo;", "", "", "isHtn", "isSmk", "isDiab", "", "getTolColCoff", "getHdColCoff", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "bpsys", "bpdias", "htn", "diab", "smk", "totCol", "hdlCol", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getBpsys", "()I", "setBpsys", "(I)V", "b", "getBpdias", "setBpdias", "c", "getHtn", "setHtn", GoogleApiAvailabilityLight.a, "getDiab", "setDiab", "e", "getSmk", "setSmk", "f", "F", "getTotCol", "()F", "setTotCol", "(F)V", "g", "getHdlCol", "setHdlCol", "<init>", "(IIIIIFF)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HealthInfo {
    public static final float COL_UNIT = 38.67f;
    public static final int UN_DEFINE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int bpsys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int bpdias;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int htn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int diab;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int smk;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private float totCol;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private float hdlCol;

    public HealthInfo() {
        this(0, 0, 0, 0, 0, 0.0f, 0.0f, 127, null);
    }

    public HealthInfo(int i, int i2, int i3, int i4, int i5, float f, float f2) {
        this.bpsys = i;
        this.bpdias = i2;
        this.htn = i3;
        this.diab = i4;
        this.smk = i5;
        this.totCol = f;
        this.hdlCol = f2;
    }

    public static /* synthetic */ HealthInfo copy$default(HealthInfo healthInfo, int i, int i2, int i3, int i4, int i5, float f, float f2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = healthInfo.bpsys;
        }
        if ((i6 & 2) != 0) {
            i2 = healthInfo.bpdias;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = healthInfo.htn;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = healthInfo.diab;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = healthInfo.smk;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            f = healthInfo.totCol;
        }
        float f3 = f;
        if ((i6 & 64) != 0) {
            f2 = healthInfo.hdlCol;
        }
        return healthInfo.copy(i, i7, i8, i9, i10, f3, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBpsys() {
        return this.bpsys;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBpdias() {
        return this.bpdias;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHtn() {
        return this.htn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDiab() {
        return this.diab;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSmk() {
        return this.smk;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getTotCol() {
        return this.totCol;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getHdlCol() {
        return this.hdlCol;
    }

    @NotNull
    public final HealthInfo copy(int bpsys, int bpdias, int htn, int diab, int smk, float totCol, float hdlCol) {
        return new HealthInfo(bpsys, bpdias, htn, diab, smk, totCol, hdlCol);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthInfo)) {
            return false;
        }
        HealthInfo healthInfo = (HealthInfo) other;
        return this.bpsys == healthInfo.bpsys && this.bpdias == healthInfo.bpdias && this.htn == healthInfo.htn && this.diab == healthInfo.diab && this.smk == healthInfo.smk && Float.compare(this.totCol, healthInfo.totCol) == 0 && Float.compare(this.hdlCol, healthInfo.hdlCol) == 0;
    }

    public final int getBpdias() {
        return this.bpdias;
    }

    public final int getBpsys() {
        return this.bpsys;
    }

    public final int getDiab() {
        return this.diab;
    }

    public final float getHdColCoff() {
        float f = this.totCol;
        if (f < 0) {
            return 0.0f;
        }
        return f * 38.67f;
    }

    public final float getHdlCol() {
        return this.hdlCol;
    }

    public final int getHtn() {
        return this.htn;
    }

    public final int getSmk() {
        return this.smk;
    }

    public final float getTolColCoff() {
        float f = this.totCol;
        if (f < 0) {
            return 0.0f;
        }
        return f * 38.67f;
    }

    public final float getTotCol() {
        return this.totCol;
    }

    public int hashCode() {
        return (((((((((((this.bpsys * 31) + this.bpdias) * 31) + this.htn) * 31) + this.diab) * 31) + this.smk) * 31) + Float.floatToIntBits(this.totCol)) * 31) + Float.floatToIntBits(this.hdlCol);
    }

    public final boolean isDiab() {
        return 1 == this.smk;
    }

    public final boolean isHtn() {
        return 1 == this.htn;
    }

    public final boolean isSmk() {
        return 1 == this.smk;
    }

    public final void setBpdias(int i) {
        this.bpdias = i;
    }

    public final void setBpsys(int i) {
        this.bpsys = i;
    }

    public final void setDiab(int i) {
        this.diab = i;
    }

    public final void setHdlCol(float f) {
        this.hdlCol = f;
    }

    public final void setHtn(int i) {
        this.htn = i;
    }

    public final void setSmk(int i) {
        this.smk = i;
    }

    public final void setTotCol(float f) {
        this.totCol = f;
    }

    @NotNull
    public String toString() {
        return "HealthInfo(bpsys=" + this.bpsys + ", bpdias=" + this.bpdias + ", htn=" + this.htn + ", diab=" + this.diab + ", smk=" + this.smk + ", totCol=" + this.totCol + ", hdlCol=" + this.hdlCol + ")";
    }

    public /* synthetic */ HealthInfo(int i, int i2, int i3, int i4, int i5, float f, float f2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? -1 : i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) == 0 ? i5 : -1, (i6 & 32) != 0 ? -1.0f : f, (i6 & 64) != 0 ? -1.0f : f2);
    }
}
