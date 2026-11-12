package com.huami.moving.ui.sport.detail.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/moving/ui/sport/detail/data/ShowItemBean;", "", "", "component1", "", "component2", "item_data_name", "item_data_value", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getItem_data_name", "()Ljava/lang/String;", "setItem_data_name", "(Ljava/lang/String;)V", LogUtil.I, "getItem_data_value", "()I", "setItem_data_value", "(I)V", "<init>", "(Ljava/lang/String;I)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShowItemBean {

    @NotNull
    private String item_data_name;
    private int item_data_value;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowItemBean() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public ShowItemBean(@NotNull String str, int i) {
        this.item_data_name = str;
        this.item_data_value = i;
    }

    public static /* synthetic */ ShowItemBean copy$default(ShowItemBean showItemBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = showItemBean.item_data_name;
        }
        if ((i2 & 2) != 0) {
            i = showItemBean.item_data_value;
        }
        return showItemBean.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItem_data_name() {
        return this.item_data_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getItem_data_value() {
        return this.item_data_value;
    }

    @NotNull
    public final ShowItemBean copy(@NotNull String item_data_name, int item_data_value) {
        return new ShowItemBean(item_data_name, item_data_value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowItemBean)) {
            return false;
        }
        ShowItemBean showItemBean = (ShowItemBean) other;
        return Intrinsics.areEqual(this.item_data_name, showItemBean.item_data_name) && this.item_data_value == showItemBean.item_data_value;
    }

    @NotNull
    public final String getItem_data_name() {
        return this.item_data_name;
    }

    public final int getItem_data_value() {
        return this.item_data_value;
    }

    public int hashCode() {
        return (this.item_data_name.hashCode() * 31) + this.item_data_value;
    }

    public final void setItem_data_name(@NotNull String str) {
        this.item_data_name = str;
    }

    public final void setItem_data_value(int i) {
        this.item_data_value = i;
    }

    @NotNull
    public String toString() {
        return "ShowItemBean(item_data_name=" + this.item_data_name + ", item_data_value=" + this.item_data_value + ")";
    }

    public /* synthetic */ ShowItemBean(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i);
    }
}
