package com.huami.account.selectArea.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.selectArea.baseui.BaseIndexBean;
import com.huami.account.service.model.SubArea;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/huami/account/selectArea/entity/StateIndexBean;", "Lcom/huami/account/selectArea/baseui/BaseIndexBean;", "Lcom/huami/account/service/model/SubArea;", "component1", "subArea", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", GoogleApiAvailabilityLight.a, "Lcom/huami/account/service/model/SubArea;", "getSubArea", "()Lcom/huami/account/service/model/SubArea;", "setSubArea", "(Lcom/huami/account/service/model/SubArea;)V", "<init>", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StateIndexBean extends BaseIndexBean {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private SubArea subArea;

    public StateIndexBean(@NotNull SubArea subArea) {
        this.subArea = subArea;
    }

    public static /* synthetic */ StateIndexBean copy$default(StateIndexBean stateIndexBean, SubArea subArea, int i, Object obj) {
        if ((i & 1) != 0) {
            subArea = stateIndexBean.subArea;
        }
        return stateIndexBean.copy(subArea);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SubArea getSubArea() {
        return this.subArea;
    }

    @NotNull
    public final StateIndexBean copy(@NotNull SubArea subArea) {
        return new StateIndexBean(subArea);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StateIndexBean) && Intrinsics.areEqual(this.subArea, ((StateIndexBean) other).subArea);
    }

    @NotNull
    public final SubArea getSubArea() {
        return this.subArea;
    }

    public int hashCode() {
        return this.subArea.hashCode();
    }

    public final void setSubArea(@NotNull SubArea subArea) {
        this.subArea = subArea;
    }

    @NotNull
    public String toString() {
        return "StateIndexBean(subArea=" + this.subArea + ")";
    }
}
