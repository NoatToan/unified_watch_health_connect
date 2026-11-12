package com.huawei.ui.commonui.linechart.view.datarender;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.qly;
import defpackage.qmj;
import defpackage.qoc;
import defpackage.qod;
import defpackage.qof;
import defpackage.qog;
import defpackage.qoh;
import defpackage.qqn;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthRenderMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HwHealthBaseBarLineChart f23750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected IRenderMode f23751b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23752c;
    public DataInfos d;
    protected ViewPortHandler e;

    public interface IRenderMode {
        void clear();

        void draw(Canvas canvas, qod qodVar, Path path, qod qodVar2, qoc.a aVar);

        void draw(Canvas canvas, qod qodVar, qoc.a aVar);

        float getDisplayIntervalPx(Transformer transformer);

        float getLineWidth();

        NodeStyle getNodeStyle();

        int getNodeStyleConst();

        boolean isLadderMode();

        void prepareDraw();

        void setLadderMode(float f);

        void setLineWidth(float f);

        void setNodeStyle(NodeStyle nodeStyle);

        void setStandMode();
    }

    public interface NodeStyle {
        float getInnerRadius();

        float getOuterRadius();
    }

    public HwHealthRenderMode(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler) {
        this.f23750a = hwHealthBaseBarLineChart;
        this.e = viewPortHandler;
        b("render_foreground");
    }

    public HwHealthBaseBarLineChart e() {
        return this.f23750a;
    }

    public ViewPortHandler b() {
        return this.e;
    }

    public void a(String str) {
        b(str);
    }

    private void b(String str) {
        IRenderMode iRenderMode = this.f23751b;
        if (iRenderMode != null) {
            iRenderMode.clear();
        }
        if ("render_foreground".equals(str)) {
            this.f23751b = new b();
        } else if ("render_background".equals(str)) {
            this.f23751b = new e();
        } else if ("render_focus_area".equals(str)) {
            this.f23751b = new a(this.f23750a, this.e);
        }
    }

    public void a(HwHealthLineDataSet hwHealthLineDataSet) {
        this.f23751b.setLineWidth(hwHealthLineDataSet.getLineWidth());
        d(hwHealthLineDataSet);
        IRenderMode iRenderMode = this.f23751b;
        if (iRenderMode instanceof b) {
            b bVar = (b) iRenderMode;
            bVar.a(hwHealthLineDataSet.getColor());
            GradientDrawable gradientDrawableG = hwHealthLineDataSet.g();
            GradientDrawable gradientDrawableD = hwHealthLineDataSet.d();
            bVar.d(gradientDrawableG);
            bVar.e(gradientDrawableD);
            bVar.d(hwHealthLineDataSet.isDrawFilledEnabled());
            return;
        }
        if (iRenderMode instanceof e) {
            e eVar = (e) iRenderMode;
            eVar.c(qqn.d(R.color.health_bg_mode_line_color));
            eVar.c(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{qqn.d(R.color.health_bg_mode_filleddrawable_start_color), qqn.d(R.color.health_bg_mode_filleddrawable_end_color)}));
            return;
        }
        if (iRenderMode instanceof a) {
            a aVar = (a) iRenderMode;
            aVar.a(qqn.d(R.color.health_bg_mode_line_color));
            aVar.d(hwHealthLineDataSet.getColor());
            GradientDrawable gradientDrawableG2 = hwHealthLineDataSet.g();
            GradientDrawable gradientDrawableD2 = hwHealthLineDataSet.d();
            aVar.e(gradientDrawableG2);
            aVar.d(gradientDrawableD2);
        }
    }

    private void d(HwHealthLineDataSet hwHealthLineDataSet) {
        IRenderMode iRenderMode = this.f23751b;
        if (!(iRenderMode instanceof RenderModeCommon)) {
            LogUtil.e("HealthChart_HwHealthRenderMode", "mRenderMode type is error", iRenderMode);
            return;
        }
        iRenderMode.setNodeStyle(new qof(hwHealthLineDataSet.d(hwHealthLineDataSet.isDrawFilledEnabled())));
        RenderModeCommon renderModeCommon = (RenderModeCommon) this.f23751b;
        if (renderModeCommon.getPointStyle() == 1) {
            HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f23750a;
            if (hwHealthBaseBarLineChart instanceof HwHealthCombinedChart) {
                List dataSets = hwHealthBaseBarLineChart.getData().getDataSets();
                if (dataSets.size() > 0 && (dataSets.get(0) instanceof HwHealthBarDataSet)) {
                    qly barData = ((HwHealthCombinedChart) this.f23750a).getBarData();
                    float[] fArr = {0.0f, 0.0f, barData != null ? barData.a() : 0.0f, 0.0f};
                    this.f23750a.getTransformer(hwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr);
                    this.f23751b.setNodeStyle(new qoh((fArr[2] - fArr[0]) / 2.0f));
                    return;
                }
            }
            this.f23751b.setNodeStyle(new qoh(qrs.d(BaseApplication.getContext(), 3.5f)));
            return;
        }
        if (renderModeCommon.getPointStyle() == 2) {
            this.f23751b.setNodeStyle(new qog(qrs.d(BaseApplication.getContext(), 5.0f)));
        }
    }

    public IRenderMode d() {
        return this.f23751b;
    }

    public void a() {
        this.f23751b.prepareDraw();
    }

    public static abstract class RenderModeCommon implements IRenderMode {
        private float mDisplayInterval;
        private float mLineWidthPx;
        private NodeStyle mNodeStyle;
        private int mPointStyle = 0;
        private boolean mIsLadderLineMode = false;

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void setLadderMode(float f) {
            this.mIsLadderLineMode = true;
            this.mDisplayInterval = f;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public float getDisplayIntervalPx(Transformer transformer) {
            float[] fArr = {0.0f, 0.0f, this.mDisplayInterval, 0.0f};
            transformer.pointValuesToPixel(fArr);
            return Math.abs(fArr[2] - fArr[0]);
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void setStandMode() {
            this.mIsLadderLineMode = false;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public boolean isLadderMode() {
            return this.mIsLadderLineMode;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void setLineWidth(float f) {
            this.mLineWidthPx = f;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void setNodeStyle(NodeStyle nodeStyle) {
            this.mNodeStyle = nodeStyle;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public float getLineWidth() {
            return this.mLineWidthPx;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public NodeStyle getNodeStyle() {
            return this.mNodeStyle;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public int getNodeStyleConst() {
            return this.mPointStyle;
        }

        public int getPointStyle() {
            return this.mPointStyle;
        }

        public void setPointStyle(int i) {
            this.mPointStyle = i;
        }
    }

    public static class b extends RenderModeCommon {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23756a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23757c;
        private Drawable d;
        private Drawable e;

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void clear() {
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void prepareDraw() {
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void draw(Canvas canvas, qod qodVar, qoc.a aVar) {
            aVar.e(canvas, qodVar, this.f23757c);
            if (this.f23756a) {
                aVar.e(canvas, qodVar, this.d, this.e);
            }
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void draw(Canvas canvas, qod qodVar, Path path, qod qodVar2, qoc.a aVar) {
            aVar.c(canvas, qodVar, path, qodVar2, this.f23757c);
            if (this.f23756a) {
                aVar.e(canvas, qodVar, path, qodVar2, this.d, this.e);
            }
        }

        public void a(int i) {
            this.f23757c = i;
        }

        public void d(Drawable drawable) {
            this.d = drawable;
        }

        public void e(Drawable drawable) {
            this.e = drawable;
        }

        public void d(boolean z) {
            this.f23756a = z;
        }
    }

    public static class e extends RenderModeCommon {
        private Drawable d;
        private int e;

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void clear() {
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void prepareDraw() {
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void draw(Canvas canvas, qod qodVar, qoc.a aVar) {
            aVar.e(canvas, qodVar, this.e);
            aVar.e(canvas, qodVar, this.d);
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void draw(Canvas canvas, qod qodVar, Path path, qod qodVar2, qoc.a aVar) {
            aVar.c(canvas, qodVar, path, qodVar2, this.e);
            aVar.e(canvas, qodVar, path, qodVar2, this.d);
        }

        public void c(int i) {
            this.e = i;
        }

        public void c(Drawable drawable) {
            this.d = drawable;
        }
    }

    public static class a extends RenderModeCommon {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f23753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HwHealthBaseBarLineChart f23754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<qmj> f23755c;
        private Path d;
        private Drawable e;
        private ViewPortHandler f;
        private int g;
        private int h;

        private a(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler) {
            this.f23755c = new ArrayList();
            this.d = new Path();
            this.f23754b = hwHealthBaseBarLineChart;
            this.f = viewPortHandler;
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void clear() {
            List<qmj> list = this.f23755c;
            if (list != null) {
                list.clear();
            }
            Path path = this.d;
            if (path != null) {
                path.reset();
            }
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void prepareDraw() {
            c();
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void draw(Canvas canvas, qod qodVar, qoc.a aVar) {
            int iContentBottom = (int) (this.f.contentBottom() + this.f23754b.getXAxis().getYOffset());
            int iSave = canvas.save();
            canvas.clipRect((int) this.f.contentLeft(), (int) this.f.contentTop(), (int) this.f.contentRight(), iContentBottom);
            canvas.clipPath(this.d, Region.Op.DIFFERENCE);
            aVar.e(canvas, qodVar, this.h);
            canvas.restoreToCount(iSave);
            int iSave2 = canvas.save();
            canvas.clipRect((int) this.f.contentLeft(), (int) this.f.contentTop(), (int) this.f.contentRight(), iContentBottom);
            canvas.clipPath(this.d);
            aVar.e(canvas, qodVar, this.g);
            aVar.e(canvas, qodVar, this.e, this.f23753a);
            canvas.restoreToCount(iSave2);
        }

        @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.IRenderMode
        public void draw(Canvas canvas, qod qodVar, Path path, qod qodVar2, qoc.a aVar) {
            int iContentBottom = (int) (this.f.contentBottom() + this.f23754b.getXAxis().getYOffset());
            int iSave = canvas.save();
            float f = iContentBottom;
            canvas.clipRect(qodVar.c(), (int) this.f.contentTop(), qodVar2.c(), f);
            canvas.clipPath(this.d, Region.Op.DIFFERENCE);
            aVar.c(canvas, qodVar, path, qodVar2, this.h);
            canvas.restoreToCount(iSave);
            int iSave2 = canvas.save();
            canvas.clipRect(qodVar.c(), (int) this.f.contentTop(), qodVar2.c(), f);
            canvas.clipPath(this.d);
            aVar.c(canvas, qodVar, path, qodVar2, this.g);
            aVar.e(canvas, qodVar, path, qodVar2, this.e, this.f23753a);
            canvas.restoreToCount(iSave2);
        }

        public boolean e(List<qmj> list) {
            if (list == null || this.f23755c == null || list.size() != this.f23755c.size()) {
                return false;
            }
            for (int i = 0; i < this.f23755c.size(); i++) {
                if (list.get(i).a() != this.f23755c.get(i).a() || list.get(i).d() != this.f23755c.get(i).d()) {
                    return false;
                }
            }
            return true;
        }

        public void b(List<qmj> list) {
            this.f23755c.clear();
            this.f23755c.addAll(list);
        }

        public void c() {
            this.d.reset();
            for (qmj qmjVar : this.f23755c) {
                if (qmjVar != null) {
                    float[] fArr = {qmjVar.a(), 0.0f, qmjVar.d(), 0.0f};
                    HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f23754b;
                    hwHealthBaseBarLineChart.getTransformer(hwHealthBaseBarLineChart.getAxisFirstParty().b()).pointValuesToPixel(fArr);
                    this.d.addRect(fArr[0], this.f.contentTop(), fArr[2], (int) (this.f.contentBottom() + this.f23754b.getXAxis().getYOffset()), Path.Direction.CW);
                }
            }
        }

        public void d(int i) {
            this.g = i;
        }

        public void e(Drawable drawable) {
            this.e = drawable;
        }

        public void d(Drawable drawable) {
            this.f23753a = drawable;
        }

        public Path e() {
            return this.d;
        }

        public void a(int i) {
            this.h = i;
        }
    }
}
