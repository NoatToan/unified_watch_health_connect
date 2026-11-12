package com.huami.account.selectArea.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.selectArea.baseui.BaseIndexBean;
import com.huami.account.service.model.Area;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/huami/account/selectArea/entity/RegionIndexBean;", "Lcom/huami/account/selectArea/baseui/BaseIndexBean;", "Lcom/huami/account/service/model/Area;", "component1", BaseDeviceStatusActivity.KEY_AREA, "copy", "", "toString", "", "hashCode", "", "other", "", "equals", GoogleApiAvailabilityLight.a, "Lcom/huami/account/service/model/Area;", "getArea", "()Lcom/huami/account/service/model/Area;", "setArea", "(Lcom/huami/account/service/model/Area;)V", "<init>", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RegionIndexBean extends BaseIndexBean {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private Area area;

    public RegionIndexBean(@NotNull Area area) {
        this.area = area;
    }

    public static /* synthetic */ RegionIndexBean copy$default(RegionIndexBean regionIndexBean, Area area, int i, Object obj) {
        if ((i & 1) != 0) {
            area = regionIndexBean.area;
        }
        return regionIndexBean.copy(area);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Area getArea() {
        return this.area;
    }

    @NotNull
    public final RegionIndexBean copy(@NotNull Area area) {
        return new RegionIndexBean(area);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RegionIndexBean) && Intrinsics.areEqual(this.area, ((RegionIndexBean) other).area);
    }

    @NotNull
    public final Area getArea() {
        return this.area;
    }

    public int hashCode() {
        return this.area.hashCode();
    }

    public final void setArea(@NotNull Area area) {
        this.area = area;
    }

    @NotNull
    public String toString() {
        return "RegionIndexBean(area=" + this.area + ")";
    }
}
