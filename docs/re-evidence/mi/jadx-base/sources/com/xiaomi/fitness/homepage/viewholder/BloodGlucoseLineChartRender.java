package com.xiaomi.fitness.homepage.viewholder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.mi.health.course.export.data.CourseConfigModel;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.age;
import defpackage.cge;
import defpackage.cu3;
import defpackage.d12;
import defpackage.erc;
import defpackage.hwq;
import defpackage.iji;
import defpackage.ktc;
import defpackage.r7c;
import defpackage.ryp;
import defpackage.x44;
import defpackage.xfe;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001YB%\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\b\u0010T\u001a\u0004\u0018\u00010S\u0012\b\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bW\u0010XJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000b2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b/\u00100J1\u00106\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002032\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000403¢\u0006\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u00105\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\"\u0010E\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@\"\u0004\bG\u0010BR\u0016\u0010H\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010:R\u0016\u0010I\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010J\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R$\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010>¨\u0006Z"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/BloodGlucoseLineChartRender;", "Lage;", "", "yValue", "", "getChartFillColor", "(F)I", "Lcom/github/mikephil/charting/data/Entry;", "e1", "e2", "phaseY", "Landroid/graphics/Canvas;", "canvas", "Lryp;", "trans", "", "drawCharFillColor", "(Lcom/github/mikephil/charting/data/Entry;Lcom/github/mikephil/charting/data/Entry;FLandroid/graphics/Canvas;Lryp;)V", "x1", "y1", "x2", "y2", "y", "isPointBetweenTwoPoints", "(FFFFF)F", "bottom", "Landroid/graphics/Path;", "createPathRecent", "(FFFFF)Landroid/graphics/Path;", "path", "colorBegin", "startX", "endX", "drawLinerFillColor", "(Landroid/graphics/Path;Landroid/graphics/Canvas;IFF)V", PluginDeviceInfo.FICONON, "Lktc;", "dataSet", "drawLinear", "(Landroid/graphics/Canvas;Lktc;)V", "drawCircles", "(Landroid/graphics/Canvas;)V", "", "Lr7c;", "indices", "drawHighlighted", "(Landroid/graphics/Canvas;[Lr7c;)V", "drawHorizontalBezier", "(Lktc;)V", "", "isHeart", "", "valueList", "colors", "setHeartLine", "(ZLjava/util/List;Ljava/util/List;)V", "Landroid/graphics/Paint;", "mHighlightCirclePaint", "Landroid/graphics/Paint;", "Z", "", "pos", "[F", "getPos", "()[F", "setPos", "([F)V", "", "[I", "range", "getRange", "setRange", "mLineFillPaint", "yPos", "mLineBuffer", "Ljava/util/HashMap;", "Lerc;", "Lcom/xiaomi/fitness/homepage/viewholder/BloodGlucoseLineChartRender$DataSetImageCache;", "mImageCaches", "Ljava/util/HashMap;", "mCirclesBuffer", "Lcge;", "chart", "Lcu3;", "animator", "Lhwq;", "viewPortHandler", "<init>", "(Lcge;Lcu3;Lhwq;)V", "DataSetImageCache", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseLineChartRender extends age {

    @NotNull
    private int[] colors;
    private boolean isHeart;

    @NotNull
    private final float[] mCirclesBuffer;

    @Nullable
    private Paint mHighlightCirclePaint;

    @NotNull
    private final HashMap<erc<?>, DataSetImageCache> mImageCaches;

    @NotNull
    private float[] mLineBuffer;

    @NotNull
    private Paint mLineFillPaint;

    @NotNull
    private float[] pos;

    @NotNull
    private float[] range;

    @NotNull
    private float[] yPos;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/BloodGlucoseLineChartRender$DataSetImageCache;", "", "Lktc;", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "init", "(Lktc;)Z", "drawCircleHole", "drawTransparentCircleHole", "Landroid/graphics/Paint;", "mRenderPaint", "", "fill", "(Lktc;ZZLandroid/graphics/Paint;)V", "", "index", "Landroid/graphics/Bitmap;", "getBitmap", "(I)Landroid/graphics/Bitmap;", "Landroid/graphics/Path;", "mCirclePathBuffer", "Landroid/graphics/Path;", "", "circleBitmaps", "[Landroid/graphics/Bitmap;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DataSetImageCache {

        @Nullable
        private Bitmap[] circleBitmaps;

        @NotNull
        private final Path mCirclePathBuffer = new Path();

        public final void fill(@NotNull ktc set, boolean drawCircleHole, boolean drawTransparentCircleHole, @NotNull Paint mRenderPaint) {
            Intrinsics.checkNotNullParameter(set, "set");
            Intrinsics.checkNotNullParameter(mRenderPaint, "mRenderPaint");
            int iX = set.x();
            float fB0 = set.B0();
            float fS = set.S();
            for (int i = 0; i < iX; i++) {
                int i2 = (int) (((double) fB0) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Bitmap[] bitmapArr = this.circleBitmaps;
                Intrinsics.checkNotNull(bitmapArr);
                bitmapArr[i] = bitmapCreateBitmap;
                mRenderPaint.setColor(set.P(i));
                if (drawTransparentCircleHole) {
                    this.mCirclePathBuffer.reset();
                    this.mCirclePathBuffer.addCircle(fB0, fB0, fB0, Path.Direction.CW);
                    this.mCirclePathBuffer.addCircle(fB0, fB0, fS, Path.Direction.CCW);
                    canvas.drawPath(this.mCirclePathBuffer, mRenderPaint);
                } else {
                    canvas.drawCircle(fB0, fB0, fB0, mRenderPaint);
                }
            }
        }

        @Nullable
        public final Bitmap getBitmap(int index) {
            Bitmap[] bitmapArr = this.circleBitmaps;
            Intrinsics.checkNotNull(bitmapArr);
            Bitmap[] bitmapArr2 = this.circleBitmaps;
            Intrinsics.checkNotNull(bitmapArr2);
            return bitmapArr[index % bitmapArr2.length];
        }

        public final boolean init(@NotNull ktc set) {
            Intrinsics.checkNotNullParameter(set, "set");
            int iX = set.x();
            Bitmap[] bitmapArr = this.circleBitmaps;
            if (bitmapArr == null) {
                this.circleBitmaps = new Bitmap[iX];
                return true;
            }
            Intrinsics.checkNotNull(bitmapArr);
            if (bitmapArr.length == iX) {
                return false;
            }
            this.circleBitmaps = new Bitmap[iX];
            return true;
        }
    }

    public BloodGlucoseLineChartRender(@Nullable cge cgeVar, @Nullable cu3 cu3Var, @Nullable hwq hwqVar) {
        super(cgeVar, cu3Var, hwqVar);
        this.pos = new float[0];
        this.colors = new int[0];
        this.range = new float[0];
        Paint paint = new Paint();
        this.mLineFillPaint = paint;
        this.yPos = new float[]{10.0f, 3.9f};
        paint.reset();
        this.mLineFillPaint.setAntiAlias(true);
        Paint paint2 = this.mLineFillPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.mChart = cgeVar;
        Paint paint3 = new Paint(1);
        this.mCirclePaintInner = paint3;
        paint3.setStyle(style);
        this.mCirclePaintInner.setColor(-1);
        this.mHighlightCirclePaint = new Paint();
        this.mLineBuffer = new float[4];
        this.mImageCaches = new HashMap<>();
        this.mCirclesBuffer = new float[2];
    }

    private final Path createPathRecent(float x1, float y1, float x2, float y2, float bottom) {
        Path path = new Path();
        path.moveTo(x1, y1);
        path.lineTo(x1, bottom);
        path.lineTo(x2, bottom);
        path.lineTo(x2, y2);
        path.close();
        return path;
    }

    private final void drawCharFillColor(Entry e1, Entry e2, float phaseY, Canvas canvas, ryp trans) {
        float[] fArr = {e1.getX(), e1.getY() * phaseY, e1.getX(), 0.0f, e2.getX(), 0.0f, e2.getX(), e2.getY() * phaseY};
        float[] fArr2 = this.yPos;
        float f = fArr2[0];
        float f2 = fArr2[1];
        float[] fArr3 = {f, f2};
        fArr3[0] = f * phaseY;
        fArr3[1] = f2 * phaseY;
        trans.k(fArr);
        trans.k(fArr3);
        int chartFillColor = getChartFillColor(e1.getY());
        int chartFillColor2 = getChartFillColor(e2.getY());
        float fIsPointBetweenTwoPoints = isPointBetweenTwoPoints(fArr[0], fArr[1], fArr[6], fArr[7], fArr3[0]);
        float fIsPointBetweenTwoPoints2 = isPointBetweenTwoPoints(fArr[0], fArr[1], fArr[6], fArr[7], fArr3[1]);
        float f3 = fArr[0];
        float f4 = fArr[6];
        Path path = new Path();
        if (fIsPointBetweenTwoPoints != -1.0f && fIsPointBetweenTwoPoints2 == -1.0f) {
            drawLinerFillColor(createPathRecent(fArr[0], fArr[1], fIsPointBetweenTwoPoints, fArr3[0], fArr[3]), canvas, chartFillColor, f3, fIsPointBetweenTwoPoints);
            drawLinerFillColor(createPathRecent(fIsPointBetweenTwoPoints, fArr3[0], fArr[6], fArr[7], fArr[3]), canvas, chartFillColor2, fIsPointBetweenTwoPoints, f4);
            return;
        }
        if (fIsPointBetweenTwoPoints == -1.0f && fIsPointBetweenTwoPoints2 != -1.0f) {
            drawLinerFillColor(createPathRecent(fArr[0], fArr[1], fIsPointBetweenTwoPoints2, fArr3[1], fArr[3]), canvas, chartFillColor, f3, fIsPointBetweenTwoPoints2);
            drawLinerFillColor(createPathRecent(fIsPointBetweenTwoPoints2, fArr3[1], fArr[6], fArr[7], fArr[3]), canvas, chartFillColor2, fIsPointBetweenTwoPoints2, f4);
            return;
        }
        if (fIsPointBetweenTwoPoints != -1.0f && fIsPointBetweenTwoPoints2 != -1.0f) {
            int iA = x44.a(iji.P);
            drawLinerFillColor(createPathRecent(fArr[0], fArr[1], fIsPointBetweenTwoPoints, fArr3[0], fArr[3]), canvas, chartFillColor, f3, fIsPointBetweenTwoPoints);
            drawLinerFillColor(createPathRecent(fIsPointBetweenTwoPoints, fArr3[0], fIsPointBetweenTwoPoints2, fArr3[1], fArr[3]), canvas, iA, fIsPointBetweenTwoPoints, fIsPointBetweenTwoPoints2);
            drawLinerFillColor(createPathRecent(fIsPointBetweenTwoPoints2, fArr3[1], fArr[6], fArr[7], fArr[3]), canvas, chartFillColor2, fIsPointBetweenTwoPoints2, f4);
            return;
        }
        path.moveTo(fArr[0], fArr[1]);
        path.lineTo(fArr[2], fArr[3]);
        path.lineTo(fArr[4], fArr[5]);
        path.lineTo(fArr[6], fArr[7]);
        drawLinerFillColor(path, canvas, chartFillColor, f3, f4);
    }

    private final void drawLinerFillColor(Path path, Canvas canvas, int colorBegin, float startX, float endX) {
        this.mLineFillPaint.setShader(new LinearGradient(startX, this.mViewPortHandler.p().top, endX, this.mViewPortHandler.p().bottom, new int[]{colorBegin, -1}, (float[]) null, Shader.TileMode.CLAMP));
        xfe xfeVar = new xfe(this.mLineFillPaint, path);
        Intrinsics.checkNotNull(canvas);
        xfeVar.draw(canvas);
    }

    private final int getChartFillColor(float yValue) {
        float[] fArr = this.yPos;
        if (yValue > fArr[0]) {
            return x44.a(iji.L);
        }
        if (yValue > fArr[1]) {
            return x44.a(iji.N);
        }
        if (yValue > fArr[2]) {
            return x44.a(iji.P);
        }
        return yValue > fArr[3] ? x44.a(iji.O) : x44.a(iji.M);
    }

    private final float isPointBetweenTwoPoints(float x1, float y1, float x2, float y2, float y) {
        float f = (y2 - y1) / (x2 - x1);
        float f2 = (y - (y1 - (f * x1))) / f;
        if (x1 > f2 || f2 > x2) {
            return -1.0f;
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.age
    public void drawCircles(@NotNull Canvas c) {
        boolean z;
        DataSetImageCache dataSetImageCache;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(c, "c");
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float fI = this.mAnimator.i();
        float[] fArr = this.mCirclesBuffer;
        char c2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        boolean z2 = true;
        fArr[1] = 0.0f;
        List<T> listL = this.mChart.getLineData().l();
        int size = listL.size();
        int i = 0;
        while (i < size) {
            ktc ktcVar = (ktc) listL.get(i);
            if (ktcVar.isVisible() && ktcVar.Q() && ktcVar.O0() != 0) {
                this.mCirclePaintInner.setColor(ktcVar.f());
                ryp transformer = this.mChart.getTransformer(ktcVar.m0());
                Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
                this.mXBounds.a(this.mChart, ktcVar);
                float fB0 = ktcVar.B0();
                float fS = ktcVar.S();
                boolean z3 = (!ktcVar.R0() || fS >= fB0 || fS <= f) ? c2 : z2;
                boolean z4 = (z3 == 0 || ktcVar.f() != 1122867) ? c2 : z2;
                if (this.mImageCaches.containsKey(ktcVar)) {
                    dataSetImageCache = this.mImageCaches.get(ktcVar);
                } else {
                    DataSetImageCache dataSetImageCache2 = new DataSetImageCache();
                    this.mImageCaches.put(ktcVar, dataSetImageCache2);
                    dataSetImageCache = dataSetImageCache2;
                }
                Intrinsics.checkNotNull(dataSetImageCache);
                Intrinsics.checkNotNull(ktcVar);
                if (dataSetImageCache.init(ktcVar)) {
                    Paint mRenderPaint = this.mRenderPaint;
                    Intrinsics.checkNotNullExpressionValue(mRenderPaint, "mRenderPaint");
                    dataSetImageCache.fill(ktcVar, z3, z4, mRenderPaint);
                }
                d12.a aVar = this.mXBounds;
                int i2 = aVar.c;
                int i3 = aVar.f14945a;
                int i4 = i2 + i3;
                if (i3 > i4) {
                    z = true;
                    break;
                    break;
                }
                while (true) {
                    ?? I = ktcVar.i(i3);
                    if (I != 0) {
                        if (I.getY() == f) {
                            z = true;
                        } else {
                            this.mCirclesBuffer[c2] = I.getX();
                            this.mCirclesBuffer[1] = I.getY() * fI;
                            transformer.k(this.mCirclesBuffer);
                            if (this.mViewPortHandler.C(this.mCirclesBuffer[c2])) {
                                if (this.mViewPortHandler.B(this.mCirclesBuffer[c2])) {
                                    z = true;
                                    if (this.mViewPortHandler.F(this.mCirclesBuffer[1]) && (bitmap = dataSetImageCache.getBitmap(i3)) != null) {
                                        float[] fArr2 = this.mCirclesBuffer;
                                        c.drawBitmap(bitmap, fArr2[c2] - fB0, fArr2[1] - fB0, (Paint) null);
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3++;
                        c2 = 0;
                        f = 0.0f;
                    }
                    z = true;
                    break;
                }
            } else {
                z = z2;
            }
            i++;
            z2 = z;
            c2 = 0;
            f = 0.0f;
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [com.github.mikephil.charting.data.Entry, j72, java.lang.Object] */
    @Override // defpackage.age, defpackage.dn5
    public void drawHighlighted(@NotNull Canvas c, @NotNull r7c[] indices) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(indices, "indices");
        super.drawHighlighted(c, indices);
        float fI = this.mAnimator.i();
        ktc ktcVar = (ktc) this.mChart.getLineData().i(0);
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
        float[] fArr = this.mCirclesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        int length = indices.length;
        for (int i = 0; i < length; i++) {
            r7c r7cVar = indices[i];
            ?? V0 = ktcVar.v0(r7cVar != null ? r7cVar.h() : 0.0f, r7cVar != null ? r7cVar.j() : 0.0f);
            Intrinsics.checkNotNullExpressionValue(V0, "getEntryForXValue(...)");
            this.mCirclesBuffer[0] = V0.getX();
            this.mCirclesBuffer[1] = V0.getY() * fI;
            transformer.k(this.mCirclesBuffer);
            Paint paint = this.mHighlightCirclePaint;
            Intrinsics.checkNotNull(paint);
            paint.setColor(ktcVar.N0());
            if (this.isHeart) {
                if (V0.getY() >= this.range[0]) {
                    Paint paint2 = this.mHighlightCirclePaint;
                    Intrinsics.checkNotNull(paint2);
                    paint2.setColor(this.colors[0]);
                } else if (V0.getY() < this.range[0] && V0.getY() >= this.range[1]) {
                    Paint paint3 = this.mHighlightCirclePaint;
                    Intrinsics.checkNotNull(paint3);
                    paint3.setColor(this.colors[2]);
                } else if (V0.getY() < this.range[2] || V0.getY() >= this.range[1]) {
                    Paint paint4 = this.mHighlightCirclePaint;
                    Intrinsics.checkNotNull(paint4);
                    paint4.setColor(this.colors[6]);
                } else {
                    Paint paint5 = this.mHighlightCirclePaint;
                    Intrinsics.checkNotNull(paint5);
                    paint5.setColor(this.colors[4]);
                }
            }
            float[] fArr2 = this.mCirclesBuffer;
            float f = fArr2[0];
            float f2 = fArr2[1];
            Paint paint6 = this.mHighlightCirclePaint;
            Intrinsics.checkNotNull(paint6);
            c.drawCircle(f, f2, 10.0f, paint6);
            Paint paint7 = this.mHighlightCirclePaint;
            Intrinsics.checkNotNull(paint7);
            paint7.setColor(-1);
            float[] fArr3 = this.mCirclesBuffer;
            float f3 = fArr3[0];
            float f4 = fArr3[1];
            Paint paint8 = this.mHighlightCirclePaint;
            Intrinsics.checkNotNull(paint8);
            c.drawCircle(f3, f4, 5.0f, paint8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.github.mikephil.charting.data.Entry, j72, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.age
    public void drawHorizontalBezier(@NotNull ktc dataSet) {
        ?? I;
        ?? r1;
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        float fI = this.mAnimator.i();
        ryp transformer = this.mChart.getTransformer(dataSet.m0());
        Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
        this.mXBounds.a(this.mChart, dataSet);
        this.cubicPath.reset();
        d12.a aVar = this.mXBounds;
        if (aVar.c >= 1) {
            I = dataSet.i(aVar.f14945a);
            Intrinsics.checkNotNullExpressionValue(I, "getEntryForIndex(...)");
            this.cubicPath.moveTo(I.getX(), I.getY() * fI);
            d12.a aVar2 = this.mXBounds;
            int i = aVar2.f14945a;
            int i2 = i + 1;
            int i3 = aVar2.c + i;
            if (i2 <= i3) {
                while (true) {
                    r1 = I;
                    ?? I2 = dataSet.i(i2);
                    float x = r1.getX() + ((I2.getX() - r1.getX()) / 2.0f);
                    this.cubicPath.cubicTo(x, r1.getY() * fI, x, I2.getY() * fI, I2.getX(), I2.getY() * fI);
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                    r1 = I2;
                }
            }
        }
        r1 = I;
        if (dataSet.C0()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, dataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(dataSet.n0());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.i(this.cubicPath);
        if (this.isHeart) {
            this.mRenderPaint.setShader(new LinearGradient(0.0f, this.mViewPortHandler.p().top, 0.0f, this.mViewPortHandler.p().bottom, this.colors, this.pos, Shader.TileMode.CLAMP));
        }
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0163 A[LOOP:0: B:21:0x0095->B:47:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x02c0 A[EDGE_INSN: B:88:0x02c0->B:85:0x02c0 BREAK  A[LOOP:0: B:21:0x0095->B:47:0x0163], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v7, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r3v29, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.age
    public void drawLinear(@Nullable Canvas c, @NotNull ktc dataSet) {
        d12.a aVar;
        int i;
        int i2;
        Entry entry;
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        int iO0 = dataSet.O0();
        boolean zO0 = dataSet.o0();
        int i3 = 2;
        int i4 = zO0 ? 4 : 2;
        ryp transformer = this.mChart.getTransformer(dataSet.m0());
        Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
        float fI = this.mAnimator.i();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas = dataSet.d() ? this.mBitmapCanvas : c;
        this.mXBounds.a(this.mChart, dataSet);
        if (dataSet.C0() && iO0 > 0) {
            drawLinearFill(c, dataSet, transformer, this.mXBounds);
        }
        int i5 = 0;
        Logger.i("thisDataSetColorsSize  " + dataSet.i0().size(), new Object[0]);
        int i6 = 1;
        if (dataSet.i0().size() > 1) {
            int i7 = i4 * 2;
            if (this.mLineBuffer.length <= i7) {
                this.mLineBuffer = new float[i4 * 4];
            }
            d12.a aVar2 = this.mXBounds;
            int i8 = aVar2.f14945a;
            int i9 = aVar2.c + i8;
            if (i8 <= i9) {
                while (true) {
                    ?? I = dataSet.i(i8);
                    if (I != 0 && I.getY() != 0.0f) {
                        this.mLineBuffer[0] = I.getX();
                        this.mLineBuffer[1] = I.getY() * fI;
                        if (i8 < this.mXBounds.f14946b) {
                            ?? I2 = dataSet.i(i8 + 1);
                            if (I2.getY() == 0.0f) {
                                break;
                            }
                            if (zO0) {
                                this.mLineBuffer[2] = I2.getX();
                                float[] fArr = this.mLineBuffer;
                                float f = fArr[1];
                                fArr[3] = f;
                                fArr[4] = fArr[2];
                                fArr[5] = f;
                                fArr[6] = I2.getX();
                                this.mLineBuffer[7] = I2.getY() * fI;
                            } else {
                                this.mLineBuffer[2] = I2.getX();
                                this.mLineBuffer[3] = I2.getY() * fI;
                            }
                        } else {
                            float[] fArr2 = this.mLineBuffer;
                            fArr2[2] = fArr2[0];
                            fArr2[3] = fArr2[1];
                        }
                        transformer.k(this.mLineBuffer);
                        if (!this.mViewPortHandler.C(this.mLineBuffer[0])) {
                            break;
                        }
                        if (this.mViewPortHandler.B(this.mLineBuffer[2]) && (this.mViewPortHandler.D(this.mLineBuffer[1]) || this.mViewPortHandler.A(this.mLineBuffer[3]))) {
                            this.mRenderPaint.setColor(dataSet.E0(i8));
                            Intrinsics.checkNotNull(canvas);
                            canvas.drawLines(this.mLineBuffer, 0, i7, this.mRenderPaint);
                        }
                        if (i8 != i9) {
                            break;
                        } else {
                            i8++;
                        }
                    } else {
                        if (i8 != i9) {
                            break;
                            break;
                        }
                        i8++;
                    }
                }
            }
        } else {
            int i10 = iO0 * i4;
            if (this.mLineBuffer.length < Math.max(i10, i4) * 2) {
                this.mLineBuffer = new float[Math.max(i10, i4) * 4];
            }
            if (dataSet.i(this.mXBounds.f14945a) != 0 && i <= (i2 = aVar.c + (i = (aVar = this.mXBounds).f14945a))) {
                int i11 = i;
                int i12 = 0;
                while (true) {
                    Entry entryI = dataSet.i(i11 == 0 ? i5 : i11 - 1);
                    d12.a aVar3 = this.mXBounds;
                    if (aVar3.c + aVar3.f14945a <= i6 || entryI.getY() == -1.0f || dataSet.i(i11).getY() != -1.0f) {
                        Entry entryI2 = dataSet.i(i11);
                        Intrinsics.checkNotNull(entryI2);
                        entry = entryI2;
                    } else {
                        entry = new Entry(entryI.getX() + ((dataSet.i(i6).getX() - dataSet.i(i5).getX()) / i3), entryI.getY());
                    }
                    if (entryI.getY() != -1.0f && entry.getY() != -1.0f) {
                        this.mLineBuffer[i12] = entryI.getX();
                        int i13 = i12 + 2;
                        this.mLineBuffer[i12 + 1] = entryI.getY() * fI;
                        if (zO0) {
                            this.mLineBuffer[i13] = entry.getX();
                            this.mLineBuffer[i12 + 3] = entryI.getY() * fI;
                            this.mLineBuffer[i12 + 4] = entry.getX();
                            i13 = i12 + 6;
                            this.mLineBuffer[i12 + 5] = entryI.getY() * fI;
                        }
                        this.mLineBuffer[i13] = entry.getX();
                        this.mLineBuffer[i13 + 1] = entry.getY() * fI;
                        drawCharFillColor(entryI, entry, fI, canvas, transformer);
                        i12 = i13 + i3;
                    }
                    if (i11 == i2) {
                        break;
                    }
                    i11++;
                    i2 = i2;
                    i3 = 2;
                    i5 = 0;
                    i6 = 1;
                }
                if (i12 > 0) {
                    transformer.k(this.mLineBuffer);
                    int iMax = Math.max((this.mXBounds.c + 1) * i4, i4) * 2;
                    this.mRenderPaint.setColor(dataSet.n0());
                    if (this.isHeart) {
                        this.mRenderPaint.setShader(new LinearGradient(0.0f, this.mViewPortHandler.p().top, 0.0f, this.mViewPortHandler.p().bottom, this.colors, this.pos, Shader.TileMode.CLAMP));
                    }
                    Intrinsics.checkNotNull(canvas);
                    canvas.drawLines(this.mLineBuffer, 0, iMax, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    @NotNull
    public final float[] getPos() {
        return this.pos;
    }

    @NotNull
    public final float[] getRange() {
        return this.range;
    }

    public final void setHeartLine(boolean isHeart, @NotNull List<Float> valueList, @NotNull List<Integer> colors) {
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.isHeart = isHeart;
        int size = valueList.size() + 1;
        float[] fArr = new float[size];
        cge cgeVar = this.mChart;
        Intrinsics.checkNotNull(cgeVar, "null cannot be cast to non-null type com.github.mikephil.charting.charts.LineChart");
        float axisMaximum = ((LineChart) cgeVar).getAxisLeft().getAxisMaximum();
        cge cgeVar2 = this.mChart;
        Intrinsics.checkNotNull(cgeVar2, "null cannot be cast to non-null type com.github.mikephil.charting.charts.LineChart");
        float axisMinimum = ((LineChart) cgeVar2).getAxisLeft().getAxisMinimum();
        this.yPos = new float[valueList.size()];
        float f = axisMaximum - axisMinimum;
        List listReversed = CollectionsKt___CollectionsKt.reversed(valueList);
        int size2 = valueList.size();
        for (int i = 0; i < size2; i++) {
            if (i > 0) {
                int i2 = i - 1;
                fArr[i] = ((((Number) listReversed.get(i2)).floatValue() - ((Number) listReversed.get(i)).floatValue()) / f) + fArr[i2];
            } else {
                fArr[i] = (axisMaximum - ((Number) listReversed.get(i)).floatValue()) / f;
            }
            this.yPos[i] = ((Number) listReversed.get(i)).floatValue();
        }
        fArr[valueList.size()] = 1.0f;
        this.pos = new float[size * 2];
        this.colors = new int[colors.size() * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            this.colors[i3] = colors.get(i4).intValue();
            int i5 = i3 + 1;
            this.colors[i5] = colors.get(i4).intValue();
            if (i4 == 0) {
                float[] fArr2 = this.pos;
                fArr2[i3] = 0.0f;
                fArr2[i5] = fArr[i4];
            } else {
                float[] fArr3 = this.pos;
                fArr3[i3] = fArr[i4 - 1];
                fArr3[i5] = fArr[i4];
            }
            i3 += 2;
        }
    }

    public final void setPos(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.pos = fArr;
    }

    public final void setRange(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.range = fArr;
    }
}
