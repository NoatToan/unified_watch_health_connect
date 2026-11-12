package com.garmin.android.apps.connectmobile.powerguide.model;

import i3.e5;
import p005kotlin.Metadata;
import q6.f;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006)"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSplitDTO;", "", "coursePointIndex", "", "powerTargetWatts", "estimatedSeconds", "", "slope", "heading", "ascent", "<init>", "(IIFFFF)V", "getCoursePointIndex", "()I", "setCoursePointIndex", "(I)V", "getPowerTargetWatts", "setPowerTargetWatts", "getEstimatedSeconds", "()F", "setEstimatedSeconds", "(F)V", "getSlope", "setSlope", "getHeading", "setHeading", "getAscent", "setAscent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PlanSplitDTO {
    public static final int $stable = 8;
    private float ascent;
    private int coursePointIndex;
    private float estimatedSeconds;
    private float heading;
    private int powerTargetWatts;
    private float slope;

    public PlanSplitDTO(int i14, int i15, float f14, float f15, float f16, float f17) {
        this.coursePointIndex = i14;
        this.powerTargetWatts = i15;
        this.estimatedSeconds = f14;
        this.slope = f15;
        this.heading = f16;
        this.ascent = f17;
    }

    public static /* synthetic */ PlanSplitDTO copy$default(PlanSplitDTO planSplitDTO, int i14, int i15, float f14, float f15, float f16, float f17, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i14 = planSplitDTO.coursePointIndex;
        }
        if ((i16 & 2) != 0) {
            i15 = planSplitDTO.powerTargetWatts;
        }
        if ((i16 & 4) != 0) {
            f14 = planSplitDTO.estimatedSeconds;
        }
        if ((i16 & 8) != 0) {
            f15 = planSplitDTO.slope;
        }
        if ((i16 & 16) != 0) {
            f16 = planSplitDTO.heading;
        }
        if ((i16 & 32) != 0) {
            f17 = planSplitDTO.ascent;
        }
        float f18 = f16;
        float f19 = f17;
        return planSplitDTO.copy(i14, i15, f14, f15, f18, f19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCoursePointIndex() {
        return this.coursePointIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPowerTargetWatts() {
        return this.powerTargetWatts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getEstimatedSeconds() {
        return this.estimatedSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getSlope() {
        return this.slope;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getAscent() {
        return this.ascent;
    }

    public final PlanSplitDTO copy(int coursePointIndex, int powerTargetWatts, float estimatedSeconds, float slope, float heading, float ascent) {
        return new PlanSplitDTO(coursePointIndex, powerTargetWatts, estimatedSeconds, slope, heading, ascent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanSplitDTO)) {
            return false;
        }
        PlanSplitDTO planSplitDTO = (PlanSplitDTO) other;
        return this.coursePointIndex == planSplitDTO.coursePointIndex && this.powerTargetWatts == planSplitDTO.powerTargetWatts && Float.compare(this.estimatedSeconds, planSplitDTO.estimatedSeconds) == 0 && Float.compare(this.slope, planSplitDTO.slope) == 0 && Float.compare(this.heading, planSplitDTO.heading) == 0 && Float.compare(this.ascent, planSplitDTO.ascent) == 0;
    }

    public final float getAscent() {
        return this.ascent;
    }

    public final int getCoursePointIndex() {
        return this.coursePointIndex;
    }

    public final float getEstimatedSeconds() {
        return this.estimatedSeconds;
    }

    public final float getHeading() {
        return this.heading;
    }

    public final int getPowerTargetWatts() {
        return this.powerTargetWatts;
    }

    public final float getSlope() {
        return this.slope;
    }

    public int hashCode() {
        return Float.hashCode(this.ascent) + f.d(this.heading, f.d(this.slope, f.d(this.estimatedSeconds, q2.d(this.powerTargetWatts, Integer.hashCode(this.coursePointIndex) * 31, 31), 31), 31), 31);
    }

    public final void setAscent(float f14) {
        this.ascent = f14;
    }

    public final void setCoursePointIndex(int i14) {
        this.coursePointIndex = i14;
    }

    public final void setEstimatedSeconds(float f14) {
        this.estimatedSeconds = f14;
    }

    public final void setHeading(float f14) {
        this.heading = f14;
    }

    public final void setPowerTargetWatts(int i14) {
        this.powerTargetWatts = i14;
    }

    public final void setSlope(float f14) {
        this.slope = f14;
    }

    public String toString() {
        int i14 = this.coursePointIndex;
        int i15 = this.powerTargetWatts;
        float f14 = this.estimatedSeconds;
        float f15 = this.slope;
        float f16 = this.heading;
        float f17 = this.ascent;
        StringBuilder sbJ = e5.j(i14, i15, "PlanSplitDTO(coursePointIndex=", ", powerTargetWatts=", ", estimatedSeconds=");
        l2.n(sbJ, f14, ", slope=", f15, ", heading=");
        sbJ.append(f16);
        sbJ.append(", ascent=");
        sbJ.append(f17);
        sbJ.append(")");
        return sbJ.toString();
    }
}
