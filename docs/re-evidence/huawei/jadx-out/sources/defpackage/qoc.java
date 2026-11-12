package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qoc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HwHealthRenderMode f46550c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f46549a = new e();
    protected Transformer e = null;

    public qoc(HwHealthRenderMode hwHealthRenderMode) {
        this.f46550c = hwHealthRenderMode;
    }

    private int[] c(List<qod> list, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        float lowestVisibleX = hwHealthBaseBarLineChart.getLowestVisibleX();
        float highestVisibleX = hwHealthBaseBarLineChart.getHighestVisibleX();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            qod qodVar = list.get(i3);
            if (qodVar.c() >= lowestVisibleX && qodVar.c() <= highestVisibleX) {
                if (i == -1) {
                    i = i3;
                }
                i2 = i3 + 1;
            }
        }
        if (i == -1 || i2 == -1) {
            for (int i4 = 0; i4 < list.size() && list.get(i4).c() <= lowestVisibleX; i4++) {
                i = i4;
            }
            i2 = i + 1;
        }
        if (i == -1) {
            return null;
        }
        int i5 = i - 1;
        if (i5 >= 0) {
            i = i5;
        }
        int i6 = i2 + 1;
        if (i6 <= list.size()) {
            i2 = i6;
        }
        return new int[]{i, i2};
    }

    protected List<qod> c(IHwHealthLineDatasContainer iHwHealthLineDatasContainer) {
        return iHwHealthLineDatasContainer.queryNodes();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    public void a(Canvas canvas, IHwHealthLineDatasContainer iHwHealthLineDatasContainer, Transformer transformer) {
        int[] iArrC;
        qod qodVar;
        this.e = transformer;
        List<qod> listC = c(iHwHealthLineDatasContainer);
        if (njy.e(listC) || (iArrC = c(listC, iHwHealthLineDatasContainer.acquireChart())) == null) {
            return;
        }
        int i = iArrC[0];
        int i2 = iArrC[1];
        Path path = new Path();
        int i3 = i;
        int i4 = 0;
        qod qodVar2 = null;
        while (i3 < i2) {
            qod qodVar3 = listC.get(i3);
            if (qodVar3.g()) {
                this.f46549a.d(canvas, qodVar3, this.f46550c);
            } else {
                if (path.isEmpty() && !qodVar3.h()) {
                    path.moveTo(qodVar3.c(), qodVar3.b());
                    qodVar = qodVar3;
                } else {
                    if (path.isEmpty() && qodVar3.h()) {
                        qodVar2 = listC.get(i3 - 1);
                        path.moveTo(qodVar2.c(), qodVar2.b());
                        d(path, qodVar2, qodVar3);
                    } else {
                        d(path, listC.get(i3 - 1), qodVar3);
                    }
                    qodVar = qodVar2;
                }
                int i5 = i4 + 1;
                if (path.isEmpty()) {
                    qodVar2 = qodVar;
                    i4 = i5;
                } else {
                    if (b(qodVar, listC, i3, i5, i3 == i2 + (-1))) {
                        this.f46549a.c(canvas, qodVar, path, qodVar3, this.f46550c);
                        path.reset();
                        i4 = 0;
                        qodVar2 = null;
                    } else {
                        qodVar2 = qodVar;
                        i4 = i5;
                    }
                }
            }
            i3++;
        }
        b(canvas, listC);
    }

    private boolean b(qod qodVar, List<qod> list, int i, int i2, boolean z) {
        if (qodVar == null) {
            return false;
        }
        if (z) {
            return true;
        }
        int i3 = i + 1;
        return !(njy.e(list, i3) || list.get(i3).h()) || i2 >= 128;
    }

    private void b(Canvas canvas, List<qod> list) {
        for (qod qodVar : list) {
            if (qodVar.i() || qodVar.d()) {
                this.f46549a.d(canvas, qodVar, this.f46550c);
            }
        }
        HwHealthRenderMode.NodeStyle nodeStyle = this.f46550c.d().getNodeStyle();
        if (nodeStyle instanceof qoh) {
            Iterator<qod> it = list.iterator();
            while (it.hasNext()) {
                this.f46549a.d(canvas, it.next(), this.f46550c);
            }
            return;
        }
        if (nodeStyle instanceof qog) {
            for (int i = 0; i < list.size() - 1; i++) {
                this.f46549a.d(canvas, list.get(i), this.f46550c);
            }
            this.f46550c.d().setNodeStyle(new qoe(qrs.d(BaseApplication.getContext(), 6.0f)));
            this.f46549a.d(canvas, list.get(list.size() - 1), this.f46550c);
        }
    }

    boolean b(HwHealthRenderMode.NodeStyle nodeStyle) {
        return nodeStyle instanceof qoh;
    }

    boolean c(HwHealthRenderMode.NodeStyle nodeStyle) {
        return nodeStyle instanceof qog;
    }

    boolean e(HwHealthRenderMode.NodeStyle nodeStyle) {
        return nodeStyle instanceof qoe;
    }

    protected void d(Path path, qod qodVar, qod qodVar2) {
        if (this.f46550c.d().isLadderMode()) {
            path.lineTo(qodVar2.c(), qodVar.b());
            path.lineTo(qodVar2.c(), qodVar2.b());
        } else {
            path.lineTo(qodVar2.c(), qodVar2.b());
        }
    }

    protected class e {
        private a d;

        protected e() {
            this.d = qoc.this.new a();
        }

        public void d(Canvas canvas, qod qodVar, HwHealthRenderMode hwHealthRenderMode) {
            hwHealthRenderMode.d().draw(canvas, d(qodVar), this.d);
        }

        public void c(Canvas canvas, qod qodVar, Path path, qod qodVar2, HwHealthRenderMode hwHealthRenderMode) {
            qod qodVarD = d(qodVar);
            c(path);
            hwHealthRenderMode.d().draw(canvas, qodVarD, path, d(qodVar2), this.d);
        }

        private void c(Path path) {
            qoc.this.e.pathValueToPixel(path);
        }

        private qod d(qod qodVar) {
            return qodVar.c(qoc.this.e);
        }
    }

    public class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected Paint f46551c = new Paint(1);

        public a() {
        }

        public void c(Canvas canvas, qod qodVar, Path path, qod qodVar2, int i) {
            this.f46551c.setStyle(Paint.Style.STROKE);
            this.f46551c.setStrokeCap(Paint.Cap.SQUARE);
            this.f46551c.setStrokeJoin(Paint.Join.ROUND);
            this.f46551c.setColor(i);
            this.f46551c.setStrokeWidth(qoc.this.f46550c.d().getLineWidth());
            HwHealthBaseBarLineChart hwHealthBaseBarLineChartE = qoc.this.f46550c.e();
            ViewPortHandler viewPortHandlerB = qoc.this.f46550c.b();
            int iContentBottom = (int) (viewPortHandlerB.contentBottom() + hwHealthBaseBarLineChartE.getXAxis().getYOffset());
            int iSave = canvas.save();
            canvas.clipRect(qodVar.c(), (int) viewPortHandlerB.contentTop(), qodVar2.c(), iContentBottom);
            if (qoc.this.f46550c.d().getNodeStyleConst() == 1) {
                this.f46551c.setShadowLayer(Utils.convertDpToPixel(5.0f), 0.0f, 6.0f, Color.argb(38, Color.red(i), Color.green(i), Color.blue(i)));
                canvas.drawPath(path, this.f46551c);
                this.f46551c.clearShadowLayer();
            } else {
                canvas.drawPath(path, this.f46551c);
            }
            canvas.restoreToCount(iSave);
        }

        public void e(Canvas canvas, qod qodVar, Path path, qod qodVar2, Drawable... drawableArr) {
            b(canvas, qodVar, path, qodVar2, drawableArr);
        }

        public void e(Canvas canvas, qod qodVar, int i) {
            HwHealthRenderMode.IRenderMode iRenderModeD = qoc.this.f46550c.d();
            HwHealthRenderMode.NodeStyle nodeStyle = iRenderModeD.getNodeStyle();
            if (qoc.this.b(nodeStyle)) {
                e(canvas, qodVar, i, qqn.d(R.color.colorBackground), nodeStyle);
                return;
            }
            if (qoc.this.c(nodeStyle) || qoc.this.e(nodeStyle)) {
                e(canvas, qodVar, qqn.d(R.color.emui_card_bg), i, nodeStyle);
                return;
            }
            if (iRenderModeD.isLadderMode()) {
                Path path = new Path();
                path.moveTo(qodVar.c(), qodVar.b());
                path.lineTo(qodVar.c() + iRenderModeD.getDisplayIntervalPx(qoc.this.e), qodVar.b());
                c(canvas, qodVar, path, new qod(qodVar.c() + iRenderModeD.getDisplayIntervalPx(qoc.this.e), qodVar.b(), null), i);
                return;
            }
            if (qodVar.i() || qodVar.d()) {
                qoj qojVar = new qoj();
                qoc.this.f46550c.d().setNodeStyle(qojVar);
                e(canvas, qodVar, qqn.d(R.color.chart_background_color), i, qojVar);
            } else {
                this.f46551c.setStrokeCap(Paint.Cap.ROUND);
                this.f46551c.setColor(i);
                this.f46551c.setStrokeWidth(nodeStyle.getInnerRadius());
                canvas.drawLine(qodVar.c(), qodVar.b(), qodVar.c(), qodVar.b(), this.f46551c);
            }
        }

        private void e(Canvas canvas, qod qodVar, int i, int i2, HwHealthRenderMode.NodeStyle nodeStyle) {
            this.f46551c.setAntiAlias(true);
            this.f46551c.setStrokeWidth(1.0f);
            this.f46551c.setStyle(Paint.Style.FILL);
            this.f46551c.setColor(i);
            canvas.drawCircle(qodVar.c(), qodVar.b(), nodeStyle.getOuterRadius(), this.f46551c);
            this.f46551c.setColor(i2);
            canvas.drawCircle(qodVar.c(), qodVar.b(), nodeStyle.getInnerRadius(), this.f46551c);
        }

        public void e(Canvas canvas, qod qodVar, Drawable... drawableArr) {
            if (qoc.this.f46550c.d() instanceof HwHealthRenderMode.RenderModeCommon) {
                Path path = new Path();
                HwHealthRenderMode.RenderModeCommon renderModeCommon = (HwHealthRenderMode.RenderModeCommon) qoc.this.f46550c.d();
                HwHealthRenderMode.NodeStyle nodeStyle = renderModeCommon.getNodeStyle();
                if (renderModeCommon.isLadderMode()) {
                    path.moveTo(qodVar.c(), qodVar.b());
                    path.lineTo(qodVar.c() + renderModeCommon.getDisplayIntervalPx(qoc.this.e), qodVar.b());
                    e(canvas, new qod(qodVar.c(), qodVar.b(), null), path, new qod(qodVar.c() + renderModeCommon.getDisplayIntervalPx(qoc.this.e), qodVar.b(), null), drawableArr);
                } else if (nodeStyle instanceof qof) {
                    float innerRadius = nodeStyle.getInnerRadius();
                    Path path2 = new Path();
                    float f = innerRadius / 2.0f;
                    float fC = qodVar.c() - f;
                    float fC2 = qodVar.c() + f;
                    path2.moveTo(fC, qodVar.b());
                    path2.lineTo(fC2, qodVar.b());
                    e(canvas, new qod(fC, qodVar.b(), null), path2, new qod(fC2, qodVar.b(), null), drawableArr);
                }
            }
        }

        protected void b(Canvas canvas, qod qodVar, Path path, qod qodVar2, Drawable... drawableArr) {
            Path pathE;
            boolean z;
            HwHealthBaseBarLineChart hwHealthBaseBarLineChartE = qoc.this.f46550c.e();
            Path path2 = new Path();
            path2.addPath(path);
            path2.lineTo(qodVar2.c(), hwHealthBaseBarLineChartE.getContentRect().bottom + hwHealthBaseBarLineChartE.getXAxis().getYOffset());
            path2.lineTo(qodVar.c(), hwHealthBaseBarLineChartE.getContentRect().bottom + hwHealthBaseBarLineChartE.getXAxis().getYOffset());
            path2.close();
            HwHealthRenderMode.IRenderMode iRenderModeD = qoc.this.f46550c.d();
            if (iRenderModeD instanceof HwHealthRenderMode.a) {
                pathE = ((HwHealthRenderMode.a) iRenderModeD).e();
                z = true;
            } else {
                pathE = null;
                z = false;
            }
            int iSave = canvas.save();
            canvas.clipPath(path2);
            if (z) {
                canvas.clipPath(pathE);
            }
            int length = drawableArr.length;
            Drawable[] drawableArr2 = new Drawable[length];
            System.arraycopy(drawableArr, 0, drawableArr2, 0, length);
            qoc.this.c(canvas, drawableArr2, hwHealthBaseBarLineChartE);
            canvas.restoreToCount(iSave);
        }
    }

    private float a(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler) {
        if (hwHealthBaseBarLineChart.getAxisFirstParty().mEntries != null && hwHealthBaseBarLineChart.getAxisFirstParty().mEntries.length > 2) {
            float[] fArr = (float[]) hwHealthBaseBarLineChart.getAxisFirstParty().mEntries.clone();
            int length = fArr.length - 2;
            if (e(this.e)) {
                length = 1;
            }
            float[] fArr2 = {0.0f, fArr[length]};
            this.e.pointValuesToPixel(fArr2);
            return fArr2[1];
        }
        return viewPortHandler.contentTop() + ((viewPortHandler.contentBottom() - viewPortHandler.contentTop()) / 5.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Canvas canvas, Drawable[] drawableArr, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        Drawable drawable3 = null;
        if (drawableArr.length == 1) {
            drawable2 = drawableArr[0];
            drawable = null;
        } else if (drawableArr.length == 2) {
            Drawable drawable4 = drawableArr[0];
            drawable = drawableArr[1];
            drawable3 = drawable4;
            drawable2 = null;
        } else {
            drawable = null;
            drawable2 = null;
        }
        ViewPortHandler viewPortHandlerB = this.f46550c.b();
        float fA = a(hwHealthBaseBarLineChart, viewPortHandlerB);
        boolean z = this.f46550c.f23752c;
        if (z) {
            float fContentBottom = (viewPortHandlerB.contentBottom() - viewPortHandlerB.contentTop()) / 4.0f;
            f = fContentBottom;
            fA = viewPortHandlerB.contentTop() + fContentBottom;
        } else {
            f = 0.0f;
        }
        if (drawable3 != null) {
            drawable3.setBounds((int) viewPortHandlerB.contentLeft(), (int) viewPortHandlerB.contentTop(), (int) viewPortHandlerB.contentRight(), (int) fA);
            drawable3.draw(canvas);
        }
        int iContentBottom = (int) (viewPortHandlerB.contentBottom() + hwHealthBaseBarLineChart.getXAxis().getYOffset());
        if (z) {
            iContentBottom = (int) (viewPortHandlerB.contentTop() + (f * 2.0f));
        }
        if (drawable != null) {
            drawable.setBounds((int) viewPortHandlerB.contentLeft(), (int) fA, (int) viewPortHandlerB.contentRight(), iContentBottom);
            drawable.draw(canvas);
        }
        if (drawable2 != null) {
            drawable2.setBounds((int) viewPortHandlerB.contentLeft(), (int) viewPortHandlerB.contentTop(), (int) viewPortHandlerB.contentRight(), iContentBottom);
            drawable2.draw(canvas);
        }
    }

    private boolean e(Transformer transformer) {
        ViewPortHandler viewPortHandlerB = this.f46550c.b();
        float[] fArr = {0.0f, viewPortHandlerB.contentTop()};
        float[] fArr2 = {0.0f, viewPortHandlerB.contentBottom()};
        transformer.pixelsToValue(fArr);
        transformer.pixelsToValue(fArr2);
        return fArr2[1] > fArr[1];
    }
}
