package com.mapbox.maps.extension.compose.ornaments.scalebar;

import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import e23.l;
import e53.f;
import g6.c;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapScaleBarScope$ScaleBar$3$1 extends w implements l<ScaleBarImpl, Unit> {
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ c $density;
    final /* synthetic */ float $height;
    final /* synthetic */ boolean $isMetricUnit;
    final /* synthetic */ long $primaryColor;
    final /* synthetic */ float $ratio;
    final /* synthetic */ long $refreshInterval;
    final /* synthetic */ long $secondaryColor;
    final /* synthetic */ boolean $showTextBorder;
    final /* synthetic */ float $textBarMargin;
    final /* synthetic */ float $textBorderWidth;
    final /* synthetic */ long $textColor;
    final /* synthetic */ long $textSize;
    final /* synthetic */ boolean $useContinuousRendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapScaleBarScope$ScaleBar$3$1(c cVar, long j8, long j14, long j15, float f14, float f15, float f16, float f17, long j16, boolean z14, long j17, boolean z15, float f18, boolean z16) {
        super(1);
        this.$density = cVar;
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
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScaleBarImpl scaleBarImpl) {
        scaleBarImpl.getClass();
        c cVar = this.$density;
        long j8 = this.$textColor;
        long j14 = this.$primaryColor;
        long j15 = this.$secondaryColor;
        float f14 = this.$borderWidth;
        float f15 = this.$height;
        float f16 = this.$textBarMargin;
        float f17 = this.$textBorderWidth;
        long j16 = this.$textSize;
        boolean z14 = this.$isMetricUnit;
        long j17 = this.$refreshInterval;
        boolean z15 = this.$showTextBorder;
        float f18 = this.$ratio;
        scaleBarImpl.setSettings(scaleBarImpl.getSettings().toBuilder().setTextColor(f0.j(j8)).setPrimaryColor(f0.j(j14)).setSecondaryColor(f0.j(j15)).setBorderWidth(cVar.s0(f14)).setHeight(cVar.s0(f15)).setTextBarMargin(cVar.s0(f16)).setTextBorderWidth(cVar.s0(f17)).setTextSize(cVar.g0(j16)).setIsMetricUnits(z14).setRefreshInterval(e53.c.j(j17, f.MILLISECONDS)).setShowTextBorder(z15).setRatio(f18).setUseContinuousRendering(this.$useContinuousRendering).build());
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(ScaleBarImpl scaleBarImpl) {
        invoke2(scaleBarImpl);
        return Unit.INSTANCE;
    }
}
