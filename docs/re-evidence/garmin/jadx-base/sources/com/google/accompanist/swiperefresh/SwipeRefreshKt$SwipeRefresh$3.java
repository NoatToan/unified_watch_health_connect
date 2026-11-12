package com.google.accompanist.swiperefresh;

import c2.h2;
import e23.a;
import e23.p;
import e23.r;
import g6.f;
import h4.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class SwipeRefreshKt$SwipeRefresh$3 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $clipIndicatorToPadding;
    final /* synthetic */ p<m, Integer, Unit> $content;
    final /* synthetic */ r<SwipeRefreshState, f, m, Integer, Unit> $indicator;
    final /* synthetic */ d $indicatorAlignment;
    final /* synthetic */ h2 $indicatorPadding;
    final /* synthetic */ h4.r $modifier;
    final /* synthetic */ a<Unit> $onRefresh;
    final /* synthetic */ float $refreshTriggerDistance;
    final /* synthetic */ SwipeRefreshState $state;
    final /* synthetic */ boolean $swipeEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeRefreshKt$SwipeRefresh$3(SwipeRefreshState swipeRefreshState, a<Unit> aVar, h4.r rVar, boolean z14, float f14, d dVar, h2 h2Var, r<? super SwipeRefreshState, ? super f, ? super m, ? super Integer, Unit> rVar2, boolean z15, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
        super(2);
        this.$state = swipeRefreshState;
        this.$onRefresh = aVar;
        this.$modifier = rVar;
        this.$swipeEnabled = z14;
        this.$refreshTriggerDistance = f14;
        this.$indicatorAlignment = dVar;
        this.$indicatorPadding = h2Var;
        this.$indicator = rVar2;
        this.$clipIndicatorToPadding = z15;
        this.$content = pVar;
        this.$$changed = i14;
        this.$$default = i15;
    }

    public final void invoke(m mVar, int i14) {
        SwipeRefreshKt.m89SwipeRefreshFsagccs(this.$state, this.$onRefresh, this.$modifier, this.$swipeEnabled, this.$refreshTriggerDistance, this.$indicatorAlignment, this.$indicatorPadding, this.$indicator, this.$clipIndicatorToPadding, this.$content, mVar, p0.t(this.$$changed | 1), this.$$default);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
