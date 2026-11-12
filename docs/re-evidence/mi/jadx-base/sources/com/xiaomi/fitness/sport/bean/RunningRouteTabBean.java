package com.xiaomi.fitness.sport.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/RunningRouteTabBean;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "isNew", "", "isShow", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningRouteTabBean extends BaseSportItemBean {

    @SerializedName("New")
    private final boolean isNew;

    @SerializedName("Show")
    private final boolean isShow;

    public RunningRouteTabBean(boolean z, boolean z2) {
        this.isNew = z;
        this.isShow = z2;
    }

    public static /* synthetic */ RunningRouteTabBean copy$default(RunningRouteTabBean runningRouteTabBean, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = runningRouteTabBean.isNew;
        }
        if ((i & 2) != 0) {
            z2 = runningRouteTabBean.isShow;
        }
        return runningRouteTabBean.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @NotNull
    public final RunningRouteTabBean copy(boolean isNew, boolean isShow) {
        return new RunningRouteTabBean(isNew, isShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningRouteTabBean)) {
            return false;
        }
        RunningRouteTabBean runningRouteTabBean = (RunningRouteTabBean) other;
        return this.isNew == runningRouteTabBean.isNew && this.isShow == runningRouteTabBean.isShow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isNew) * 31) + Boolean.hashCode(this.isShow);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    @NotNull
    public String toString() {
        return "RunningRouteTabBean(isNew=" + this.isNew + ", isShow=" + this.isShow + ")";
    }
}
