package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import com.miui.circulate.device.api.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/PlanType;", "", "title", "", Column.SUBTITLE, "planType", "", "madeStatus", "planId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIJ)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPlanType", "()I", "getMadeStatus", "getPlanId", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanType {

    @SerializedName("plan_made")
    private final int madeStatus;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName("plan_type")
    private final int planType;

    @SerializedName(Column.SUBTITLE)
    @NotNull
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    public PlanType(@NotNull String title, @NotNull String subtitle, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.planType = i;
        this.madeStatus = i2;
        this.planId = j;
    }

    public static /* synthetic */ PlanType copy$default(PlanType planType, String str, String str2, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = planType.title;
        }
        if ((i3 & 2) != 0) {
            str2 = planType.subtitle;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = planType.planType;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = planType.madeStatus;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            j = planType.planId;
        }
        return planType.copy(str, str3, i4, i5, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPlanType() {
        return this.planType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMadeStatus() {
        return this.madeStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    public final PlanType copy(@NotNull String title, @NotNull String subtitle, int planType, int madeStatus, long planId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new PlanType(title, subtitle, planType, madeStatus, planId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanType)) {
            return false;
        }
        PlanType planType = (PlanType) other;
        return Intrinsics.areEqual(this.title, planType.title) && Intrinsics.areEqual(this.subtitle, planType.subtitle) && this.planType == planType.planType && this.madeStatus == planType.madeStatus && this.planId == planType.planId;
    }

    public final int getMadeStatus() {
        return this.madeStatus;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getPlanType() {
        return this.planType;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.planType)) * 31) + Integer.hashCode(this.madeStatus)) * 31) + Long.hashCode(this.planId);
    }

    @NotNull
    public String toString() {
        return "PlanType(title=" + this.title + ", subtitle=" + this.subtitle + ", planType=" + this.planType + ", madeStatus=" + this.madeStatus + ", planId=" + this.planId + ")";
    }
}
