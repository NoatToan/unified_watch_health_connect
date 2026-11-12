package com.xiaomi.fitness.health.sleep.interfere.report.charts;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.cu3;
import defpackage.gpc;
import defpackage.hwq;
import defpackage.p02;
import defpackage.u02;
import defpackage.x02;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J¦\u0001\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u008b\u0001\u0010\u0010\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/RoundedStackedBarChartRenderer;", "Lu02;", "", "bufferIdx", "Lkotlin/Function6;", "", "Lkotlin/ParameterName;", "name", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "segIndex", "", "topSeg", "", "action", "loopBuffer", "(ILkotlin/jvm/functions/Function6;)V", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "Lgpc;", "dataSet", "dataSetIndex", "drawDataSet", "(Landroid/graphics/Canvas;Lgpc;I)V", "radiusPx", "F", "Lx02;", "chart", "Lcu3;", "animator", "Lhwq;", "viewPortHandler", "<init>", "(Lx02;Lcu3;Lhwq;F)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RoundedStackedBarChartRenderer extends u02 {
    private final float radiusPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedStackedBarChartRenderer(@NotNull x02 chart, @NotNull cu3 animator, @NotNull hwq viewPortHandler, float f) {
        super(chart, animator, viewPortHandler);
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        this.radiusPx = f;
    }

    private final void loopBuffer(int bufferIdx, Function6<? super Float, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Boolean, Unit> action) {
        gpc gpcVar = (gpc) this.mChart.getBarData().i(bufferIdx);
        int iO = gpcVar.N() ? gpcVar.o() : 1;
        p02 p02Var = this.mBarBuffers[bufferIdx];
        for (int i = 0; i < p02Var.c(); i += 4) {
            int i2 = (i / 4) % iO;
            action.invoke(Float.valueOf(p02Var.f16108b[i]), Float.valueOf(p02Var.f16108b[i + 1]), Float.valueOf(p02Var.f16108b[i + 2]), Float.valueOf(p02Var.f16108b[i + 3]), Integer.valueOf(i2), Boolean.valueOf(i2 == iO + (-1)));
        }
    }

    @Override // defpackage.u02
    public void drawDataSet(@NotNull Canvas c, @NotNull gpc dataSet, int dataSetIndex) {
        int iE0;
        boolean z;
        char c2;
        int i;
        char c3 = 3;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        p02 p02Var = this.mBarBuffers[dataSetIndex];
        p02Var.f(this.mChart.getBarData().y());
        p02Var.b(this.mAnimator.h(), this.mAnimator.i());
        p02Var.g(dataSetIndex);
        p02Var.h(this.mChart.isInverted(dataSet.m0()));
        p02Var.e(dataSet);
        this.mChart.getTransformer(dataSet.m0()).k(p02Var.f16108b);
        boolean z2 = dataSet.i0().size() == 1;
        if (z2) {
            this.mRenderPaint.setColor(dataSet.n0());
        }
        int iO = dataSet.o();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        RectF rectF = null;
        while (i3 < p02Var.f16108b.length) {
            float[] fArr = p02Var.f16108b;
            RectF rectF2 = new RectF(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]);
            float f = rectF2.bottom - rectF2.top;
            boolean z3 = (i3 / 4) % iO == iO + (-1);
            if (z2) {
                iE0 = dataSet.n0();
            } else {
                iE0 = dataSet.E0(i4);
                i4++;
            }
            this.mRenderPaint.setColor(iE0);
            if (f > 0.01f) {
                if (rectF != null) {
                    this.mRenderPaint.setColor(i2);
                    c.drawRect(rectF, this.mRenderPaint);
                }
                rectF = rectF2;
                i2 = iE0;
            }
            if (z3) {
                if (rectF != null) {
                    float f2 = this.radiusPx;
                    float[] fArr2 = new float[8];
                    fArr2[0] = f2;
                    z = true;
                    fArr2[1] = f2;
                    c2 = 2;
                    fArr2[2] = f2;
                    fArr2[c3] = f2;
                    fArr2[4] = 0.0f;
                    fArr2[5] = 0.0f;
                    fArr2[6] = 0.0f;
                    fArr2[7] = 0.0f;
                    Path path = new Path();
                    path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                    this.mRenderPaint.setColor(i2);
                    c.drawPath(path, this.mRenderPaint);
                } else {
                    z = true;
                    c2 = 2;
                }
                i = 4;
                rectF = null;
            } else {
                z = true;
                c2 = 2;
                i = 4;
            }
            i3 += i;
            c3 = 3;
        }
    }
}
