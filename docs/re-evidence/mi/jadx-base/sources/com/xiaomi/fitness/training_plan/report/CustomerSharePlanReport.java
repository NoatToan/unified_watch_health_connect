package com.xiaomi.fitness.training_plan.report;

import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.training_plan.common.TrainReport;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "Ljava/io/Serializable;", CommonConstants.KEY_USER_NAME, "", "userIcon", "planReport", "Lcom/xiaomi/fitness/training_plan/common/TrainReport;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/training_plan/common/TrainReport;)V", "getUserName", "()Ljava/lang/String;", "getUserIcon", "getPlanReport", "()Lcom/xiaomi/fitness/training_plan/common/TrainReport;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomerSharePlanReport implements Serializable {

    @NotNull
    private final TrainReport planReport;

    @NotNull
    private final String userIcon;

    @NotNull
    private final String userName;

    public CustomerSharePlanReport(@NotNull String userName, @NotNull String userIcon, @NotNull TrainReport planReport) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userIcon, "userIcon");
        Intrinsics.checkNotNullParameter(planReport, "planReport");
        this.userName = userName;
        this.userIcon = userIcon;
        this.planReport = planReport;
    }

    public static /* synthetic */ CustomerSharePlanReport copy$default(CustomerSharePlanReport customerSharePlanReport, String str, String str2, TrainReport trainReport, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerSharePlanReport.userName;
        }
        if ((i & 2) != 0) {
            str2 = customerSharePlanReport.userIcon;
        }
        if ((i & 4) != 0) {
            trainReport = customerSharePlanReport.planReport;
        }
        return customerSharePlanReport.copy(str, str2, trainReport);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserIcon() {
        return this.userIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrainReport getPlanReport() {
        return this.planReport;
    }

    @NotNull
    public final CustomerSharePlanReport copy(@NotNull String userName, @NotNull String userIcon, @NotNull TrainReport planReport) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userIcon, "userIcon");
        Intrinsics.checkNotNullParameter(planReport, "planReport");
        return new CustomerSharePlanReport(userName, userIcon, planReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSharePlanReport)) {
            return false;
        }
        CustomerSharePlanReport customerSharePlanReport = (CustomerSharePlanReport) other;
        return Intrinsics.areEqual(this.userName, customerSharePlanReport.userName) && Intrinsics.areEqual(this.userIcon, customerSharePlanReport.userIcon) && Intrinsics.areEqual(this.planReport, customerSharePlanReport.planReport);
    }

    @NotNull
    public final TrainReport getPlanReport() {
        return this.planReport;
    }

    @NotNull
    public final String getUserIcon() {
        return this.userIcon;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((this.userName.hashCode() * 31) + this.userIcon.hashCode()) * 31) + this.planReport.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomerSharePlanReport(userName=" + this.userName + ", userIcon=" + this.userIcon + ", planReport=" + this.planReport + ")";
    }
}
