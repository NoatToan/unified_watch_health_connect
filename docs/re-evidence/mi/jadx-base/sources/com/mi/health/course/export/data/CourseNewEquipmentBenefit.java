package com.mi.health.course.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/export/data/CourseNewEquipmentBenefit;", "", "benefit", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "<init>", "(Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;)V", "getBenefit", "()Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseNewEquipmentBenefit {

    @Nullable
    private final CourseNewEquipmentBenefits benefit;

    public CourseNewEquipmentBenefit(@Nullable CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
        this.benefit = courseNewEquipmentBenefits;
    }

    public static /* synthetic */ CourseNewEquipmentBenefit copy$default(CourseNewEquipmentBenefit courseNewEquipmentBenefit, CourseNewEquipmentBenefits courseNewEquipmentBenefits, int i, Object obj) {
        if ((i & 1) != 0) {
            courseNewEquipmentBenefits = courseNewEquipmentBenefit.benefit;
        }
        return courseNewEquipmentBenefit.copy(courseNewEquipmentBenefits);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CourseNewEquipmentBenefits getBenefit() {
        return this.benefit;
    }

    @NotNull
    public final CourseNewEquipmentBenefit copy(@Nullable CourseNewEquipmentBenefits benefit) {
        return new CourseNewEquipmentBenefit(benefit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CourseNewEquipmentBenefit) && Intrinsics.areEqual(this.benefit, ((CourseNewEquipmentBenefit) other).benefit);
    }

    @Nullable
    public final CourseNewEquipmentBenefits getBenefit() {
        return this.benefit;
    }

    public int hashCode() {
        CourseNewEquipmentBenefits courseNewEquipmentBenefits = this.benefit;
        if (courseNewEquipmentBenefits == null) {
            return 0;
        }
        return courseNewEquipmentBenefits.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseNewEquipmentBenefit(benefit=" + this.benefit + ")";
    }
}
