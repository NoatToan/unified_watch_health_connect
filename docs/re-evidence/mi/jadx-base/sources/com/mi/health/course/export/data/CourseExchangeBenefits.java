package com.mi.health.course.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "", "status", "", "membership", "Lcom/mi/health/course/export/data/CourseExchangeBenefitsMembership;", "<init>", "(Ljava/lang/Integer;Lcom/mi/health/course/export/data/CourseExchangeBenefitsMembership;)V", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMembership", "()Lcom/mi/health/course/export/data/CourseExchangeBenefitsMembership;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/mi/health/course/export/data/CourseExchangeBenefitsMembership;)Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "equals", "", "other", "hashCode", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseExchangeBenefits {

    @NotNull
    private final CourseExchangeBenefitsMembership membership;

    @Nullable
    private final Integer status;

    public CourseExchangeBenefits(@Nullable Integer num, @NotNull CourseExchangeBenefitsMembership membership) {
        Intrinsics.checkNotNullParameter(membership, "membership");
        this.status = num;
        this.membership = membership;
    }

    public static /* synthetic */ CourseExchangeBenefits copy$default(CourseExchangeBenefits courseExchangeBenefits, Integer num, CourseExchangeBenefitsMembership courseExchangeBenefitsMembership, int i, Object obj) {
        if ((i & 1) != 0) {
            num = courseExchangeBenefits.status;
        }
        if ((i & 2) != 0) {
            courseExchangeBenefitsMembership = courseExchangeBenefits.membership;
        }
        return courseExchangeBenefits.copy(num, courseExchangeBenefitsMembership);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CourseExchangeBenefitsMembership getMembership() {
        return this.membership;
    }

    @NotNull
    public final CourseExchangeBenefits copy(@Nullable Integer status, @NotNull CourseExchangeBenefitsMembership membership) {
        Intrinsics.checkNotNullParameter(membership, "membership");
        return new CourseExchangeBenefits(status, membership);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseExchangeBenefits)) {
            return false;
        }
        CourseExchangeBenefits courseExchangeBenefits = (CourseExchangeBenefits) other;
        return Intrinsics.areEqual(this.status, courseExchangeBenefits.status) && Intrinsics.areEqual(this.membership, courseExchangeBenefits.membership);
    }

    @NotNull
    public final CourseExchangeBenefitsMembership getMembership() {
        return this.membership;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.membership.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseExchangeBenefits(status=" + this.status + ", membership=" + this.membership + ")";
    }
}
