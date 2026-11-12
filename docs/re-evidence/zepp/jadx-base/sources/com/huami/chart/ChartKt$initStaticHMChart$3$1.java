package com.huami.chart;

import com.huami.chart.chart.ChartProvider;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.util.Index;
import defpackage.nc4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/huami/chart/ChartKt$initStaticHMChart$3$1", "Lcom/huami/chart/listener/ITouchListener;", "Lcom/huami/chart/util/Index;", "i", "", "onDown", "onUp", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class ChartKt$initStaticHMChart$3$1 implements ITouchListener {
    public final /* synthetic */ Function2<Index, ChartProvider, Unit> a;
    public final /* synthetic */ ChartProvider b;
    public final /* synthetic */ Function2<Index, ChartProvider, Unit> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ChartKt$initStaticHMChart$3$1(Function2<? super Index, ? super ChartProvider, Unit> function2, ChartProvider chartProvider, Function2<? super Index, ? super ChartProvider, Unit> function3) {
        this.a = function2;
        this.b = chartProvider;
        this.c = function3;
    }

    @Override // com.huami.chart.listener.ITouchListener
    public void onDown(@NotNull Index i) {
        this.a.invoke(i, this.b);
    }

    @Override // com.huami.chart.listener.ITouchListener
    public /* synthetic */ void onTouchOutOfRange() {
        nc4.a(this);
    }

    @Override // com.huami.chart.listener.ITouchListener
    public void onUp(@NotNull Index i) {
        this.c.invoke(i, this.b);
    }
}
