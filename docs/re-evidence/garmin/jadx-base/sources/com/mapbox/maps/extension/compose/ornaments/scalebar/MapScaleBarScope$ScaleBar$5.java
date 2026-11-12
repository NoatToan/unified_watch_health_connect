package com.mapbox.maps.extension.compose.ornaments.scalebar;

import c2.h2;
import e23.p;
import h4.d;
import h4.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapScaleBarScope$ScaleBar$5 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ d $alignment;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ h2 $contentPadding;
    final /* synthetic */ float $height;
    final /* synthetic */ boolean $isMetricUnit;
    final /* synthetic */ r $modifier;
    final /* synthetic */ long $primaryColor;
    final /* synthetic */ float $ratio;
    final /* synthetic */ long $refreshInterval;
    final /* synthetic */ long $secondaryColor;
    final /* synthetic */ boolean $showTextBorder;
    final /* synthetic */ float $textBarMargin;
    final /* synthetic */ float $textBorderWidth;
    final /* synthetic */ long $textColor;
    final /* synthetic */ long $textSize;
    final /* synthetic */ MapScaleBarScope $tmp0_rcvr;
    final /* synthetic */ boolean $useContinuousRendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapScaleBarScope$ScaleBar$5(MapScaleBarScope mapScaleBarScope, r rVar, h2 h2Var, d dVar, long j8, long j14, long j15, float f14, float f15, float f16, float f17, long j16, boolean z14, long j17, boolean z15, float f18, boolean z16, int i14, int i15, int i16) {
        super(2);
        this.$tmp0_rcvr = mapScaleBarScope;
        this.$modifier = rVar;
        this.$contentPadding = h2Var;
        this.$alignment = dVar;
        this.$textColor = j8;
        this.$primaryColor = j14;
        this.$secondaryColor = j15;
        this.$borderWidth = f14;
        this.$height = f15;
        this.$textBarMargin = f16;
        this.$textBorderWidth = f17;
        this.$textSize = j16;
        this.$isMetricUnit = z14;
        this.$refreshInterval = j17;
        this.$showTextBorder = z15;
        this.$ratio = f18;
        this.$useContinuousRendering = z16;
        this.$$changed = i14;
        this.$$changed1 = i15;
        this.$$default = i16;
    }

    public final void invoke(m mVar, int i14) {
        this.$tmp0_rcvr.m214ScaleBarvLKV3eY(this.$modifier, this.$contentPadding, this.$alignment, this.$textColor, this.$primaryColor, this.$secondaryColor, this.$borderWidth, this.$height, this.$textBarMargin, this.$textBorderWidth, this.$textSize, this.$isMetricUnit, this.$refreshInterval, this.$showTextBorder, this.$ratio, this.$useContinuousRendering, mVar, this.$$changed | 1, this.$$changed1, this.$$default);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
