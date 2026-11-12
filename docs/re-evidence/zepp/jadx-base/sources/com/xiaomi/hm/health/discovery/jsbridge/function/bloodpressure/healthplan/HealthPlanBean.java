package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.healthplan;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.squareup.picasso.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/healthplan/HealthPlanBean;", "", "", "component1", "", "component2", "component3", "", "component4", "userId", BloodPressureConst.ParamKey.PLANID, "planName", u.z, "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", LogUtil.I, "getPlanId", "()I", "c", "getPlanName", GoogleApiAvailabilityLight.a, "Z", "getJoined", "()Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HealthPlanBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("userId")
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(BloodPressureConst.ParamKey.PLANID)
    private final int planId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("planName")
    @NotNull
    private final String planName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName(u.z)
    private final boolean joined;

    public HealthPlanBean(@NotNull String str, int i, @NotNull String str2, boolean z) {
        this.userId = str;
        this.planId = i;
        this.planName = str2;
        this.joined = z;
    }

    public static /* synthetic */ HealthPlanBean copy$default(HealthPlanBean healthPlanBean, String str, int i, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = healthPlanBean.userId;
        }
        if ((i2 & 2) != 0) {
            i = healthPlanBean.planId;
        }
        if ((i2 & 4) != 0) {
            str2 = healthPlanBean.planName;
        }
        if ((i2 & 8) != 0) {
            z = healthPlanBean.joined;
        }
        return healthPlanBean.copy(str, i, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlanId() {
        return this.planId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getJoined() {
        return this.joined;
    }

    @NotNull
    public final HealthPlanBean copy(@NotNull String userId, int planId, @NotNull String planName, boolean joined) {
        return new HealthPlanBean(userId, planId, planName, joined);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthPlanBean)) {
            return false;
        }
        HealthPlanBean healthPlanBean = (HealthPlanBean) other;
        return Intrinsics.areEqual(this.userId, healthPlanBean.userId) && this.planId == healthPlanBean.planId && Intrinsics.areEqual(this.planName, healthPlanBean.planName) && this.joined == healthPlanBean.joined;
    }

    public final boolean getJoined() {
        return this.joined;
    }

    public final int getPlanId() {
        return this.planId;
    }

    @NotNull
    public final String getPlanName() {
        return this.planName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = ((((this.userId.hashCode() * 31) + this.planId) * 31) + this.planName.hashCode()) * 31;
        boolean z = this.joined;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "HealthPlanBean(userId=" + this.userId + ", planId=" + this.planId + ", planName=" + this.planName + ", joined=" + this.joined + ")";
    }
}
