package com.huami.training.vo;

import com.huami.training.api.WebConst;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/training/vo/FilterInfo;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "text", WebConst.QueryParam.FILTER_MODE, StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "getFilterMode", "c", "getOrder", "setOrder", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FilterInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String filterMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String order;

    public FilterInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.text = str;
        this.filterMode = str2;
        this.order = str3;
    }

    public static /* synthetic */ FilterInfo copy$default(FilterInfo filterInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterInfo.text;
        }
        if ((i & 2) != 0) {
            str2 = filterInfo.filterMode;
        }
        if ((i & 4) != 0) {
            str3 = filterInfo.order;
        }
        return filterInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilterMode() {
        return this.filterMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrder() {
        return this.order;
    }

    @NotNull
    public final FilterInfo copy(@NotNull String text, @NotNull String filterMode, @NotNull String order) {
        return new FilterInfo(text, filterMode, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterInfo)) {
            return false;
        }
        FilterInfo filterInfo = (FilterInfo) other;
        return Intrinsics.areEqual(this.text, filterInfo.text) && Intrinsics.areEqual(this.filterMode, filterInfo.filterMode) && Intrinsics.areEqual(this.order, filterInfo.order);
    }

    @NotNull
    public final String getFilterMode() {
        return this.filterMode;
    }

    @NotNull
    public final String getOrder() {
        return this.order;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.filterMode.hashCode()) * 31) + this.order.hashCode();
    }

    public final void setOrder(@NotNull String str) {
        this.order = str;
    }

    @NotNull
    public String toString() {
        return "FilterInfo(text=" + this.text + ", filterMode=" + this.filterMode + ", order=" + this.order + ')';
    }
}
