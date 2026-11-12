package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.model.HwHealthLineEntry;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fqw extends qmm {
    private boolean i;
    private final int m;
    private final DataInfos o;

    public fqw(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, DataInfos dataInfos) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        this.o = dataInfos;
        this.m = qqp.a(BaseApplication.getContext(), j());
        ObserverManagerUtil.d(new Observer() { // from class: fqw.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (njy.c(objArr, 0)) {
                    Object obj = objArr[0];
                    if (obj instanceof Integer) {
                        if (((Integer) obj).intValue() == 0) {
                            fqw.this.i = true;
                        } else {
                            fqw.this.i = false;
                        }
                    }
                }
            }
        }, "BLOOD_AND_ALTITUDE_DATA");
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        int iE;
        if (this.mYAxis == null || !this.mYAxis.isEnabled()) {
            return;
        }
        if (this.mYAxis.isDrawGridLinesEnabled()) {
            canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(qqp.a(this.d, 0.5f));
            Path path = this.mRenderGridLinesPath;
            path.reset();
            float f = (this.f46486a.getContentRect().bottom - (this.f46486a.getContentRect().top + this.m)) / 4.0f;
            boolean z = true;
            float[] fArr = {0.0f, this.f46486a.getContentRect().bottom, 0.0f, this.f46486a.getContentRect().bottom - f, 0.0f, this.f46486a.getContentRect().bottom - (f * 2.0f), 0.0f, this.f46486a.getContentRect().bottom - (3.0f * f), 0.0f, this.f46486a.getContentRect().bottom - (f * 4.0f)};
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{qqp.a(this.d, 2.0f), qqp.a(this.d, 1.0f)}, 0.0f);
            for (int i = 0; i < 10; i += 2) {
                int i2 = i + 1;
                if (i2 >= 10 || fArr[i2] <= this.f46486a.getContentRect().bottom) {
                    if (z) {
                        this.mGridPaint.setPathEffect(null);
                        z = false;
                    } else {
                        this.mGridPaint.setPathEffect(dashPathEffect);
                    }
                    int gridColor = this.mYAxis.getGridColor();
                    if (((HwHealthYAxis) this.mYAxis).a()) {
                        iE = Color.argb(13, Color.red(gridColor), Color.green(gridColor), Color.blue(gridColor));
                    } else {
                        iE = ((HwHealthYAxis) this.mYAxis).e();
                    }
                    this.mGridPaint.setColor(iE);
                    canvas.drawPath(linePath(path, i, fArr), this.mGridPaint);
                    path.reset();
                    this.mGridPaint.setColor(gridColor);
                }
            }
        }
        b(canvas);
    }

    private void b(Canvas canvas) {
        if (this.h) {
            this.mGridPaint.setColor(this.g);
            float[] fArr = {0.0f, this.f};
            this.mTrans.pointValuesToPixel(fArr);
            if (this.j != null) {
                canvas.drawPath(b(this.mRenderGridLinesPath, fArr[1]), this.j);
            } else {
                canvas.drawPath(b(this.mRenderGridLinesPath, fArr[1]), this.mGridPaint);
            }
            this.mRenderGridLinesPath.reset();
        }
        if (this.mYAxis.isDrawZeroLineEnabled()) {
            drawZeroLine(canvas);
        }
    }

    private float j() {
        return this.o == DataInfos.BloodOxygenDayHorizontal ? 1.0f : 2.0f;
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentRight;
        if (this.mYAxis == null || this.mAxisLabelPaint == null || !this.mYAxis.isEnabled() || !this.mYAxis.isDrawLabelsEnabled() || this.mAxis.getAxisMaximum() == 2000000.0f) {
            return;
        }
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b();
        if (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
            return;
        }
        float requiredWidthSpace = ((HwHealthYAxis) this.mAxis).getRequiredWidthSpace(null);
        boolean zE = qmh.e(this.d);
        if ((hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && zE) || (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && !zE)) {
            this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
            fContentRight = this.mViewPortHandler.offsetLeft() - requiredWidthSpace;
        } else if ((hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && zE) || (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && !zE)) {
            this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
            fContentRight = this.mViewPortHandler.contentRight() + requiredWidthSpace;
        } else {
            LogUtil.e("R_BloodOxygen_BloodOxygenYAxisRender", "renderAxisLabels dependency err");
            fContentRight = 0.0f;
        }
        float f = (this.f46486a.getContentRect().bottom - (this.f46486a.getContentRect().top + this.m)) / 4.0f;
        drawYLabels(canvas, fContentRight, new float[]{0.0f, this.f46486a.getContentRect().bottom, 0.0f, this.f46486a.getContentRect().bottom - f, 0.0f, this.f46486a.getContentRect().bottom - (2.0f * f), 0.0f, this.f46486a.getContentRect().bottom - (3.0f * f), 0.0f, this.f46486a.getContentRect().bottom - (f * 4.0f)}, (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f) + this.mYAxis.getYOffset());
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        float fB = b();
        List<HwHealthBaseEntry> listAcquireEntryVals = ((HwHealthBaseBarLineDataSet) this.f46486a.getData().getDataSets().get(0)).acquireEntryVals();
        if (listAcquireEntryVals == null) {
            LogUtil.j("BloodOxygenYAxisRender", "getRemindSet baseEntries is null or is horizontal");
            return;
        }
        LogUtil.a("BloodOxygenYAxisRender", "drawLinear baseEntries.size = ", Integer.valueOf(listAcquireEntryVals.size()));
        String[] strArrE = e(listAcquireEntryVals);
        if (strArrE == null) {
            return;
        }
        float fConvertDpToPixel = Utils.convertDpToPixel(2.0f);
        for (int i = 0; i < 5; i++) {
            String strE = strArrE[i];
            if (LanguageUtil.c(this.d) || LanguageUtil.x(this.d)) {
                strE = UnitUtil.e(CommonUtil.n(this.d, this.mYAxis.getFormattedLabel(i)), 2, 0);
            }
            if (LanguageUtil.br(this.d) || LanguageUtil.z(this.d)) {
                strE = this.mYAxis.getFormattedLabel(i) + "%";
            }
            if (LanguageUtil.v(this.d)) {
                strE = "%" + this.mYAxis.getFormattedLabel(i);
            }
            canvas.drawText(strE, f + fConvertDpToPixel, fArr[(i * 2) + 1] + fB, this.mAxisLabelPaint);
        }
    }

    private String[] e(List<HwHealthBaseEntry> list) {
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        boolean z = false;
        for (HwHealthBaseEntry hwHealthBaseEntry : list) {
            if (hwHealthBaseEntry instanceof HwHealthLineEntry) {
                HwHealthLineEntry hwHealthLineEntry = (HwHealthLineEntry) hwHealthBaseEntry;
                if (hwHealthLineEntry.acquireModel() instanceof fqt) {
                    int y = (int) hwHealthLineEntry.getY();
                    if (y != 0) {
                        z = true;
                    }
                    if (y != 0) {
                        if (y > i) {
                            i = y;
                        }
                        if (y < i2) {
                            i2 = y;
                        }
                    }
                }
            }
        }
        int i3 = i2 % 4;
        int i4 = i3 == 0 ? i2 - 4 : i2 - i3;
        int i5 = i % 4;
        int i6 = i5 == 0 ? i + 4 : (i + 4) - i5;
        if (i == 100 || i6 > 100) {
            i6 = 100;
        }
        int i7 = (i4 + i6) / 2;
        int i8 = (i7 + i6) / 2;
        String[] strArr = {i4 + "%", ((i7 + i4) / 2) + "%", i7 + "%", i8 + "%", i6 + "%"};
        if (z && !this.i) {
            return strArr;
        }
        strArr[0] = "60%";
        strArr[1] = "70%";
        strArr[2] = "80%";
        strArr[3] = "90%";
        strArr[4] = "100%";
        return strArr;
    }
}
