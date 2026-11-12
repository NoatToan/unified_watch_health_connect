package com.xiaomi.fitness.smarthome.mijiasdk.bean;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ(\u0010\r\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R,\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/GetHomeBean;", "", "homelist", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/HomeBean;", "Ljava/util/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getHomelist", "()Ljava/util/ArrayList;", "setHomelist", "Ljava/util/ArrayList;", "component1", "copy", "(Ljava/util/ArrayList;)Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/GetHomeBean;", "equals", "", "other", "hashCode", "", "toString", "", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetHomeBean {

    @NotNull
    private ArrayList<HomeBean> homelist;

    public GetHomeBean(@NotNull ArrayList<HomeBean> homelist) {
        Intrinsics.checkNotNullParameter(homelist, "homelist");
        this.homelist = homelist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetHomeBean copy$default(GetHomeBean getHomeBean, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = getHomeBean.homelist;
        }
        return getHomeBean.copy(arrayList);
    }

    @NotNull
    public final ArrayList<HomeBean> component1() {
        return this.homelist;
    }

    @NotNull
    public final GetHomeBean copy(@NotNull ArrayList<HomeBean> homelist) {
        Intrinsics.checkNotNullParameter(homelist, "homelist");
        return new GetHomeBean(homelist);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetHomeBean) && Intrinsics.areEqual(this.homelist, ((GetHomeBean) other).homelist);
    }

    @NotNull
    public final ArrayList<HomeBean> getHomelist() {
        return this.homelist;
    }

    public int hashCode() {
        return this.homelist.hashCode();
    }

    public final void setHomelist(@NotNull ArrayList<HomeBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.homelist = arrayList;
    }

    @NotNull
    public String toString() {
        return "GetHomeBean(homelist=" + this.homelist + ")";
    }
}
