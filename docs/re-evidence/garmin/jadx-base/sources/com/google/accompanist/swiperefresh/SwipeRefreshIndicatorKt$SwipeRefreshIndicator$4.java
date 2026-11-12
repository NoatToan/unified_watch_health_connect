package com.google.accompanist.swiperefresh;

import e23.p;
import h4.r;
import o4.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $arrowEnabled;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $fade;
    final /* synthetic */ boolean $largeIndication;
    final /* synthetic */ r $modifier;
    final /* synthetic */ float $refreshTriggerDistance;
    final /* synthetic */ float $refreshingOffset;
    final /* synthetic */ boolean $scale;
    final /* synthetic */ r1 $shape;
    final /* synthetic */ SwipeRefreshState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4(SwipeRefreshState swipeRefreshState, float f14, r rVar, boolean z14, boolean z15, boolean z16, long j8, long j14, r1 r1Var, float f15, boolean z17, float f16, int i14, int i15, int i16) {
        super(2);
        this.$state = swipeRefreshState;
        this.$refreshTriggerDistance = f14;
        this.$modifier = rVar;
        this.$fade = z14;
        this.$scale = z15;
        this.$arrowEnabled = z16;
        this.$backgroundColor = j8;
        this.$contentColor = j14;
        this.$shape = r1Var;
        this.$refreshingOffset = f15;
        this.$largeIndication = z17;
        this.$elevation = f16;
        this.$$changed = i14;
        this.$$changed1 = i15;
        this.$$default = i16;
    }

    public final void invoke(m mVar, int i14) {
        SwipeRefreshIndicatorKt.m76SwipeRefreshIndicator_UAkqwU(this.$state, this.$refreshTriggerDistance, this.$modifier, this.$fade, this.$scale, this.$arrowEnabled, this.$backgroundColor, this.$contentColor, this.$shape, this.$refreshingOffset, this.$largeIndication, this.$elevation, mVar, p0.t(this.$$changed | 1), p0.t(this.$$changed1), this.$$default);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
