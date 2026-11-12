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
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.model.HwHealthLineEntry;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fqn extends qmm {
    private boolean i;

    public static int a(double d) {
        if ((d * 100.0d) % 100.0d == 0.0d) {
            return (int) d;
        }
        return 100;
    }

    private int a(int i, int i2) {
        return i2 > i ? i2 : i;
    }

    private int b(int i, int i2) {
        return i2 < i ? i2 : i;
    }

    private boolean b(boolean z, int i) {
        if (i == 0 || i == Integer.MAX_VALUE) {
            return z;
        }
        return true;
    }

    private boolean c(boolean z, int i) {
        if (i != 0) {
            return true;
        }
        return z;
    }

    public fqn(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        ObserverManagerUtil.d(new a(), "BLOOD_AND_ALTITUDE_DATA");
    }

    static class a implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<fqn> f34414c;

        private a(fqn fqnVar) {
            this.f34414c = new WeakReference<>(fqnVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            fqn fqnVar = this.f34414c.get();
            if (fqnVar == null) {
                LogUtil.j("BloodOxygenYAxisRender", "render is null");
                return;
            }
            if (njy.c(objArr, 0)) {
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() == 0) {
                        fqnVar.i = true;
                    } else {
                        fqnVar.i = false;
                    }
                }
            }
        }
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
            float f = (this.f46486a.getContentRect().bottom - this.f46486a.getContentRect().top) / 4.0f;
            boolean z = true;
            float[] fArr = {0.0f, this.f46486a.getContentRect().bottom, 0.0f, this.f46486a.getContentRect().bottom - f, 0.0f, this.f46486a.getContentRect().bottom - (f * 2.0f), 0.0f, this.f46486a.getContentRect().bottom - (3.0f * f), 0.0f, this.f46486a.getContentRect().bottom - (f * 4.0f)};
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{qqp.a(this.d, 2.0f), qqp.a(this.d, 1.0f)}, 0.0f);
            for (int i = 0; i < 10; i += 2) {
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
        e(canvas);
    }

    private void e(Canvas canvas) {
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
        float f = (this.f46486a.getContentRect().bottom - this.f46486a.getContentRect().top) / 4.0f;
        drawYLabels(canvas, fContentRight, new float[]{0.0f, this.f46486a.getContentRect().bottom, 0.0f, this.f46486a.getContentRect().bottom - f, 0.0f, this.f46486a.getContentRect().bottom - (2.0f * f), 0.0f, this.f46486a.getContentRect().bottom - (3.0f * f), 0.0f, this.f46486a.getContentRect().bottom - (f * 4.0f)}, (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f) + this.mYAxis.getYOffset());
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        float fConvertDpToPixel;
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
        float fB = b();
        float f3 = 0.0f;
        float f4 = fArr.length >= 3 ? fArr[1] - fArr[3] : 0.0f;
        float requiredWidthSpace = ((HwHealthYAxis) this.mAxis).getRequiredWidthSpace(null);
        if (qmh.e(this.d)) {
            fConvertDpToPixel = 0.0f;
        } else {
            fConvertDpToPixel = Utils.convertDpToPixel(2.0f);
            f3 = requiredWidthSpace;
        }
        for (int i = 0; i < 3; i++) {
            canvas.drawText(strArrE[i], this.mViewPortHandler.contentRight() + f3 + fConvertDpToPixel, (fArr[1] + fB) - (i * f4), this.mAxisLabelPaint);
        }
        int i2 = 2;
        while (i2 < 5) {
            int i3 = i2 + 1;
            canvas.drawText(strArrE[i3], this.mViewPortHandler.offsetLeft() - fConvertDpToPixel, (fArr[1] + fB) - (i2 * f4), this.mAxisLabelPaint);
            i2 = i3;
        }
    }

    private String[] e(List<HwHealthBaseEntry> list) {
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int iB = Integer.MAX_VALUE;
        int iB2 = Integer.MAX_VALUE;
        boolean zC = false;
        boolean zB = false;
        for (HwHealthBaseEntry hwHealthBaseEntry : list) {
            if (hwHealthBaseEntry instanceof HwHealthLineEntry) {
                HwHealthLineEntry hwHealthLineEntry = (HwHealthLineEntry) hwHealthBaseEntry;
                if (hwHealthLineEntry.acquireModel() instanceof fqt) {
                    int y = (int) hwHealthLineEntry.getY();
                    zC = c(zC, y);
                    int iB3 = ((fqt) hwHealthLineEntry.acquireModel()).b();
                    zB = b(zB, iB3);
                    if (iB3 != Integer.MAX_VALUE) {
                        int iA = a(i, iB3);
                        iB = b(iB, iB3);
                        i = iA;
                    }
                    if (y != 0) {
                        int iA2 = a(i2, y);
                        iB2 = b(iB2, y);
                        i2 = iA2;
                    }
                }
            }
        }
        return d(i, iB, i2, iB2, zC, zB);
    }

    private String[] d(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int iA = a(i2);
        int iD = d(i);
        int i5 = (iA + iD) / 2;
        int iB = b(i4);
        int iF = f(i3);
        int i6 = (i3 == 100 || iF > 100) ? 100 : iF;
        return e(z, z2, iA, iD, i5, iB, i6, (iB + i6) / 2);
    }

    private int f(int i) {
        int i2 = i % 4;
        int i3 = i + 4;
        return i2 == 0 ? i3 : i3 - i2;
    }

    private int b(int i) {
        int i2 = i % 4;
        return i2 == 0 ? i - 4 : i - i2;
    }

    private int d(int i) {
        int i2 = i % 50;
        int i3 = i + 50;
        return i2 == 0 ? i3 : i3 - i2;
    }

    private int a(int i) {
        int i2 = i % 50;
        return i2 == 0 ? i - 50 : i - i2;
    }

    private String[] e(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6) {
        String[] strArr = {b(i4, 2, (String) null), b(i6, 2, (String) null), b(i5, 2, (String) null), c(i), c(i3), c(i2)};
        if (!z || this.i) {
            strArr[0] = b(80, 2, (String) null);
            strArr[1] = b(90, 2, (String) null);
            strArr[2] = b(100, 2, (String) null);
            strArr[3] = c(0);
            strArr[4] = c(100);
            strArr[5] = c(200);
        }
        if (!z2) {
            strArr[3] = c(0);
            strArr[4] = c(100);
            strArr[5] = c(200);
        }
        return strArr;
    }

    private String b(int i, int i2, String str) {
        if (str == null) {
            return UnitUtil.e(i, i2, 0);
        }
        if (LanguageUtil.ba(this.d)) {
            return str + UnitUtil.e(i, i2, 0);
        }
        return UnitUtil.e(i, i2, 0) + str;
    }

    public static String c(int i) {
        if (i == Integer.MIN_VALUE) {
            return String.valueOf(Integer.MIN_VALUE);
        }
        if (UnitUtil.f()) {
            int i2 = UnitUtil.g(i)[0];
            String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_ft_string, a(i2), String.valueOf(i2));
            return (LanguageUtil.l(BaseApplication.getContext()) && quantityString.contains(" ")) ? quantityString.replaceAll(" ", "") : quantityString;
        }
        String strE = UnitUtil.e(i, 1, 0);
        StringBuilder sb = new StringBuilder();
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            sb.append(string);
            sb.append(strE);
        } else {
            sb.append(strE);
            sb.append(string);
        }
        return sb.toString();
    }
}
