package com.garmin.android.apps.connectmobile.powerguide.model;

import am.j;
import java.util.Arrays;
import p005kotlin.Metadata;
import q6.f;
import v.e0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0002\u0010\u0012JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSummaryDTO;", "", "lowerHours", "", "upperHours", "cda", "crr", "planSplits", "", "Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSplitDTO;", "<init>", "(FFFF[Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSplitDTO;)V", "getLowerHours", "()F", "getUpperHours", "getCda", "getCrr", "getPlanSplits", "()[Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSplitDTO;", "[Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSplitDTO;", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "(FFFF[Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSplitDTO;)Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSummaryDTO;", "toString", "", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PlanSummaryDTO {
    public static final int $stable = 8;
    private final float cda;
    private final float crr;
    private final float lowerHours;
    private final PlanSplitDTO[] planSplits;
    private final float upperHours;

    public PlanSummaryDTO(float f14, float f15, float f16, float f17, PlanSplitDTO[] planSplitDTOArr) {
        planSplitDTOArr.getClass();
        this.lowerHours = f14;
        this.upperHours = f15;
        this.cda = f16;
        this.crr = f17;
        this.planSplits = planSplitDTOArr;
    }

    public static /* synthetic */ PlanSummaryDTO copy$default(PlanSummaryDTO planSummaryDTO, float f14, float f15, float f16, float f17, PlanSplitDTO[] planSplitDTOArr, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            f14 = planSummaryDTO.lowerHours;
        }
        if ((i14 & 2) != 0) {
            f15 = planSummaryDTO.upperHours;
        }
        if ((i14 & 4) != 0) {
            f16 = planSummaryDTO.cda;
        }
        if ((i14 & 8) != 0) {
            f17 = planSummaryDTO.crr;
        }
        if ((i14 & 16) != 0) {
            planSplitDTOArr = planSummaryDTO.planSplits;
        }
        PlanSplitDTO[] planSplitDTOArr2 = planSplitDTOArr;
        float f18 = f16;
        return planSummaryDTO.copy(f14, f15, f18, f17, planSplitDTOArr2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLowerHours() {
        return this.lowerHours;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getUpperHours() {
        return this.upperHours;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getCda() {
        return this.cda;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getCrr() {
        return this.crr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PlanSplitDTO[] getPlanSplits() {
        return this.planSplits;
    }

    public final PlanSummaryDTO copy(float lowerHours, float upperHours, float cda, float crr, PlanSplitDTO[] planSplits) {
        planSplits.getClass();
        return new PlanSummaryDTO(lowerHours, upperHours, cda, crr, planSplits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlanSummaryDTO.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        PlanSummaryDTO planSummaryDTO = (PlanSummaryDTO) other;
        return this.lowerHours == planSummaryDTO.lowerHours && this.upperHours == planSummaryDTO.upperHours && this.cda == planSummaryDTO.cda && this.crr == planSummaryDTO.crr && Arrays.equals(this.planSplits, planSummaryDTO.planSplits);
    }

    public final float getCda() {
        return this.cda;
    }

    public final float getCrr() {
        return this.crr;
    }

    public final float getLowerHours() {
        return this.lowerHours;
    }

    public final PlanSplitDTO[] getPlanSplits() {
        return this.planSplits;
    }

    public final float getUpperHours() {
        return this.upperHours;
    }

    public int hashCode() {
        return Arrays.hashCode(this.planSplits) + f.d(this.crr, f.d(this.cda, f.d(this.upperHours, Float.hashCode(this.lowerHours) * 31, 31), 31), 31);
    }

    public String toString() {
        float f14 = this.lowerHours;
        float f15 = this.upperHours;
        float f16 = this.cda;
        float f17 = this.crr;
        String string = Arrays.toString(this.planSplits);
        StringBuilder sbI = e0.i("PlanSummaryDTO(lowerHours=", f14, ", upperHours=", f15, ", cda=");
        l2.n(sbI, f16, ", crr=", f17, ", planSplits=");
        return j.o(string, ")", sbI);
    }
}
