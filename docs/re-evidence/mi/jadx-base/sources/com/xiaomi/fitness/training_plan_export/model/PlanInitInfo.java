package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.miui.circulate.device.api.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/PlanInitInfo;", "", "title", "", Column.SUBTITLE, "planType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPlanType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanInitInfo {

    @SerializedName("plan_type")
    private final int planType;

    @SerializedName(Column.SUBTITLE)
    @NotNull
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    public PlanInitInfo(@NotNull String title, @NotNull String subtitle, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.planType = i;
    }

    public static /* synthetic */ PlanInitInfo copy$default(PlanInitInfo planInitInfo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planInitInfo.title;
        }
        if ((i2 & 2) != 0) {
            str2 = planInitInfo.subtitle;
        }
        if ((i2 & 4) != 0) {
            i = planInitInfo.planType;
        }
        return planInitInfo.copy(str, str2, i);
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

    @NotNull
    public final PlanInitInfo copy(@NotNull String title, @NotNull String subtitle, int planType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new PlanInitInfo(title, subtitle, planType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanInitInfo)) {
            return false;
        }
        PlanInitInfo planInitInfo = (PlanInitInfo) other;
        return Intrinsics.areEqual(this.title, planInitInfo.title) && Intrinsics.areEqual(this.subtitle, planInitInfo.subtitle) && this.planType == planInitInfo.planType;
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
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.planType);
    }

    @NotNull
    public String toString() {
        return "PlanInitInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", planType=" + this.planType + ")";
    }
}
