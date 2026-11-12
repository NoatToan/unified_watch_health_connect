package com.huami.watchfacesstore.bean;

import com.huami.watchfacesstore.ui.HomePageItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/watchfacesstore/bean/HomeListBean;", "", "Lcom/huami/watchfacesstore/ui/HomePageItemType;", "component1", "component2", "type", "data", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/watchfacesstore/ui/HomePageItemType;", "getType", "()Lcom/huami/watchfacesstore/ui/HomePageItemType;", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "<init>", "(Lcom/huami/watchfacesstore/ui/HomePageItemType;Ljava/lang/Object;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HomeListBean {

    @NotNull
    private final Object data;

    @NotNull
    private final HomePageItemType type;

    public HomeListBean(@NotNull HomePageItemType homePageItemType, @NotNull Object obj) {
        this.type = homePageItemType;
        this.data = obj;
    }

    public static /* synthetic */ HomeListBean copy$default(HomeListBean homeListBean, HomePageItemType homePageItemType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            homePageItemType = homeListBean.type;
        }
        if ((i & 2) != 0) {
            obj = homeListBean.data;
        }
        return homeListBean.copy(homePageItemType, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HomePageItemType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final HomeListBean copy(@NotNull HomePageItemType type, @NotNull Object data) {
        return new HomeListBean(type, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeListBean)) {
            return false;
        }
        HomeListBean homeListBean = (HomeListBean) other;
        return this.type == homeListBean.type && Intrinsics.areEqual(this.data, homeListBean.data);
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final HomePageItemType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "HomeListBean(type=" + this.type + ", data=" + this.data + ")";
    }
}
