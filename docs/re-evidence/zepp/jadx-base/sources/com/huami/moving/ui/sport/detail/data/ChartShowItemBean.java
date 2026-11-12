package com.huami.moving.ui.sport.detail.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/ui/sport/detail/data/ChartShowItemBean;", "", "", "chart_name", "Ljava/lang/String;", "getChart_name", "()Ljava/lang/String;", "setChart_name", "(Ljava/lang/String;)V", "chart_enum_value", "getChart_enum_value", "setChart_enum_value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class ChartShowItemBean {

    @NotNull
    private String chart_enum_value;

    @NotNull
    private String chart_name;

    /* JADX WARN: Multi-variable type inference failed */
    public ChartShowItemBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ChartShowItemBean(@NotNull String str, @NotNull String str2) {
        this.chart_name = str;
        this.chart_enum_value = str2;
    }

    @NotNull
    public final String getChart_enum_value() {
        return this.chart_enum_value;
    }

    @NotNull
    public final String getChart_name() {
        return this.chart_name;
    }

    public final void setChart_enum_value(@NotNull String str) {
        this.chart_enum_value = str;
    }

    public final void setChart_name(@NotNull String str) {
        this.chart_name = str;
    }

    public /* synthetic */ ChartShowItemBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
