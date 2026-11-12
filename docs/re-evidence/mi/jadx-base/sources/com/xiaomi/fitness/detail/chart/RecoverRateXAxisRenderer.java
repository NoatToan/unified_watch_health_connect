package com.xiaomi.fitness.detail.chart;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.XAxis;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import defpackage.byi;
import defpackage.crr;
import defpackage.fmq;
import defpackage.ft1;
import defpackage.hwq;
import defpackage.j1j;
import defpackage.ryp;
import defpackage.wye;
import defpackage.xd5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/detail/chart/RecoverRateXAxisRenderer;", "Lcrr;", "", "positions", "", "fillXAxisPositionList", "([F)V", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "renderAxisLabels", "(Landroid/graphics/Canvas;)V", "renderAxisLine", "renderGridLines", "", "yPos", "Lwye;", "anchor", "drawLabels", "(Landroid/graphics/Canvas;FLwye;)V", "min", VibrateModeSetFragment.MAX, "computeAxisValues", "(FF)V", "Lxd5;", "mLineChartAttr", "Lxd5;", "Lhwq;", "mViewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lryp;", "trans", "<init>", "(Lhwq;Lcom/github/mikephil/charting/components/XAxis;Lryp;Lxd5;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecoverRateXAxisRenderer extends crr {

    @NotNull
    private xd5 mLineChartAttr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverRateXAxisRenderer(@Nullable hwq hwqVar, @Nullable XAxis xAxis, @Nullable ryp rypVar, @NotNull xd5 mLineChartAttr) {
        super(hwqVar, xAxis, rypVar);
        Intrinsics.checkNotNullParameter(mLineChartAttr, "mLineChartAttr");
        this.mLineChartAttr = mLineChartAttr;
    }

    private final void fillXAxisPositionList(float[] positions) {
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        for (int i = 0; i < positions.length; i += 2) {
            if (zIsCenterAxisLabelsEnabled) {
                positions[i] = this.mXAxis.mCenteredEntries[i / 2];
            } else {
                positions[i] = this.mXAxis.mEntries[i / 2];
            }
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void computeAxisValues(float min, float max) {
        ft1 ft1Var = this.mAxis;
        if ((ft1Var instanceof RecoverRateXAxis) && this.mLineChartAttr.f) {
            int labelCount = ft1Var.getLabelCount();
            double dAbs = Math.abs(max - min);
            if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
                ft1 ft1Var2 = this.mAxis;
                ft1Var2.mEntries = new float[0];
                ft1Var2.mCenteredEntries = new float[0];
                ft1Var2.mEntryCount = 0;
                return;
            }
        } else {
            super.computeAxisValues(min, max);
        }
        computeSize();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    @Override // defpackage.crr
    public void drawLabels(@NotNull Canvas c, float yPos, @NotNull wye anchor) {
        String string;
        boolean z;
        float fH;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        fillXAxisPositionList(fArr);
        this.mTrans.k(fArr);
        int i2 = 0;
        while (i2 < i) {
            float fI = fArr[i2];
            if (this.mViewPortHandler.E(fI)) {
                boolean z2 = true;
                if (i2 == 0) {
                    string = ResourceExtKt.getString(j1j.r4);
                } else if (i2 != 2) {
                    string = i2 != 4 ? "" : ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), byi.h, 2, 2);
                } else {
                    string = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), byi.h, 1, 1);
                }
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (!AppUtil.isRTLDirection()) {
                        int i3 = i2 / 2;
                        int i4 = this.mXAxis.mEntryCount;
                        if (i3 != i4 - 1 || i4 <= 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (AppUtil.isRTLDirection()) {
                        int i5 = i2 / 2;
                        int i6 = this.mXAxis.mEntryCount;
                        if (i5 != i6 - 1 || i6 <= 1) {
                            z2 = false;
                        }
                    } else if (i2 != 0) {
                        z2 = false;
                    }
                    if (z) {
                        float fD = fmq.d(this.mAxisLabelPaint, string);
                        if (AppUtil.isRTLDirection()) {
                            fI = fD;
                        } else {
                            fH = fD / 2;
                            fI -= fH;
                        }
                    } else if (z2) {
                        float fD2 = fmq.d(this.mAxisLabelPaint, string);
                        if (AppUtil.isRTLDirection()) {
                            fI = this.mViewPortHandler.i();
                            fH = this.mViewPortHandler.h();
                            fI -= fH;
                        } else {
                            fI += fD2 / 2;
                        }
                    }
                }
                drawLabel(c, string, AppUtil.isRTLDirection() ? this.mViewPortHandler.i() - fI : fI, yPos, anchor, labelRotationAngle);
            }
            i2 += 2;
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLabels(@NotNull Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.getYOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            wye wyeVarC = wye.c(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                float fJ = this.mViewPortHandler.j() - yOffset;
                Intrinsics.checkNotNull(wyeVarC);
                drawLabels(c, fJ, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                float fJ2 = this.mViewPortHandler.j() + yOffset + this.mXAxis.mLabelRotatedHeight;
                Intrinsics.checkNotNull(wyeVarC);
                drawLabels(c, fJ2, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                wyeVarC.c = AppUtil.isRTLDirection() ? 0.05f : 0.5f;
                wyeVarC.d = 0.0f;
                float f = this.mViewPortHandler.f() + (yOffset * 2);
                Intrinsics.checkNotNull(wyeVarC);
                drawLabels(c, f, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                float f2 = (this.mViewPortHandler.f() - yOffset) - this.mXAxis.mLabelRotatedHeight;
                Intrinsics.checkNotNull(wyeVarC);
                drawLabels(c, f2, wyeVarC);
            } else {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                float fJ3 = this.mViewPortHandler.j() - yOffset;
                Intrinsics.checkNotNull(wyeVarC);
                drawLabels(c, fJ3, wyeVarC);
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(c, this.mViewPortHandler.f() + yOffset, wyeVarC);
            }
            int color = this.mAxisLabelPaint.getColor();
            int alpha = this.mAxisLabelPaint.getAlpha();
            this.mAxisLabelPaint.setColor(-1);
            this.mAxisLabelPaint.setAlpha(3);
            RectF rectF = new RectF();
            rectF.set(0.0f, this.mViewPortHandler.f() + DisplayUtil.dip2px(0.5f), DisplayUtil.getScreenWidth(), this.mViewPortHandler.f() + this.mViewPortHandler.H() + DisplayUtil.dip2px(1.0f));
            c.drawRect(rectF, this.mAxisLabelPaint);
            this.mAxisLabelPaint.setColor(color);
            this.mAxisLabelPaint.setAlpha(alpha);
            wye.f(wyeVarC);
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLine(@NotNull Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderGridLines(@NotNull Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = c.save();
            c.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.mTrans.k(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                drawGridLine(c, fArr[i3], fArr[i3 + 1], path);
            }
            c.restoreToCount(iSave);
        }
    }
}
