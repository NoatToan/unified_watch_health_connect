package com.huami.moving.ui.sport.detail.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/moving/ui/sport/detail/data/ChartShowDataBean;", "", "", "Lcom/huami/moving/ui/sport/detail/data/SportTypeItemBean;", "sportType", "Ljava/util/List;", "getSportType", "()Ljava/util/List;", "setSportType", "(Ljava/util/List;)V", "Lcom/huami/moving/ui/sport/detail/data/ChartShowItemBean;", "chart_show_type", "getChart_show_type", "setChart_show_type", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class ChartShowDataBean {

    @NotNull
    private List<ChartShowItemBean> chart_show_type;

    @NotNull
    private List<SportTypeItemBean> sportType;

    /* JADX WARN: Multi-variable type inference failed */
    public ChartShowDataBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ChartShowDataBean(@NotNull List<SportTypeItemBean> list, @NotNull List<ChartShowItemBean> list2) {
        this.sportType = list;
        this.chart_show_type = list2;
    }

    @NotNull
    public final List<ChartShowItemBean> getChart_show_type() {
        return this.chart_show_type;
    }

    @NotNull
    public final List<SportTypeItemBean> getSportType() {
        return this.sportType;
    }

    public final void setChart_show_type(@NotNull List<ChartShowItemBean> list) {
        this.chart_show_type = list;
    }

    public final void setSportType(@NotNull List<SportTypeItemBean> list) {
        this.sportType = list;
    }

    public /* synthetic */ ChartShowDataBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
