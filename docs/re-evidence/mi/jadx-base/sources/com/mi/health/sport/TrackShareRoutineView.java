package com.mi.health.sport;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.ali;
import defpackage.vmi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010&\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0015J*\u0010&\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010)\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006/"}, d2 = {"Lcom/mi/health/sport/TrackShareRoutineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "scaleMatrix", "Landroid/graphics/Matrix;", "rectF", "Landroid/graphics/RectF;", "usePoint", "", "startPoint", "Landroid/graphics/PointF;", "endPoint", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "startBitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getStartBitmap", "()Landroid/graphics/Bitmap;", "setStartBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Bitmap;", "endBitmap", "getEndBitmap", "setEndBitmap", "setPath", "sp", "ep", "getPointsFromPath", "", "createBitmap", "v", "width", "height", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackShareRoutineView extends View {
    private Bitmap endBitmap;

    @Nullable
    private PointF endPoint;

    @NotNull
    private final Paint paint;

    @Nullable
    private Path path;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Matrix scaleMatrix;
    private Bitmap startBitmap;

    @Nullable
    private PointF startPoint;
    private boolean usePoint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrackShareRoutineView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float[] getPointsFromPath(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        int length = (int) pathMeasure.getLength();
        float[] fArr2 = new float[length * 2];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            pathMeasure.getPosTan(i2, fArr, null);
            int i3 = i + 1;
            fArr2[i] = fArr[0];
            i += 2;
            fArr2[i3] = fArr[1];
        }
        return fArr2;
    }

    @NotNull
    public final Bitmap createBitmap(@NotNull View v, int width, int height) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        v.layout(0, 0, v.getMeasuredWidth(), v.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(v.getWidth(), v.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        v.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final Bitmap getEndBitmap() {
        return this.endBitmap;
    }

    public final Bitmap getStartBitmap() {
        return this.startBitmap;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() > 0 ? getWidth() / this.rectF.width() : 1.0f;
        float height = getHeight() > 0 ? getHeight() / this.rectF.height() : 1.0f;
        float fMin = Math.min(width, height);
        FitnessLogUtils.i("ShareRoutineView", "scaleFactorX:" + width + " , scaleFactorY:" + height + " , scale:" + fMin);
        this.scaleMatrix.setScale(fMin, fMin, this.rectF.centerX(), this.rectF.centerY());
        Path path = new Path();
        RectF rectF = new RectF();
        Path path2 = this.path;
        if (path2 == null || path2.isEmpty()) {
            return;
        }
        path.addPath(path2, this.scaleMatrix);
        path.computeBounds(rectF, true);
        float f = 2;
        canvas.translate(((getWidth() / 2.0f) - (rectF.width() / f)) - rectF.left, ((getHeight() / 2.0f) - (rectF.height() / f)) - rectF.top);
        canvas.drawPath(path, this.paint);
        if (!this.usePoint) {
            float[] pointsFromPath = getPointsFromPath(path2);
            if (pointsFromPath.length == 0) {
                return;
            }
            if (pointsFromPath.length == 1) {
                Bitmap bitmap = this.startBitmap;
                canvas.drawBitmap(bitmap, bitmap.getWidth() / f, this.startBitmap.getHeight(), this.paint);
                return;
            } else {
                Bitmap bitmap2 = this.startBitmap;
                canvas.drawBitmap(bitmap2, pointsFromPath[0] - (bitmap2.getWidth() / 2), pointsFromPath[1] - this.startBitmap.getHeight(), this.paint);
                Bitmap bitmap3 = this.endBitmap;
                canvas.drawBitmap(bitmap3, pointsFromPath[pointsFromPath.length - 2] - (bitmap3.getWidth() / 2), pointsFromPath[pointsFromPath.length - 1] - this.endBitmap.getHeight(), this.paint);
                return;
            }
        }
        PointF pointF = this.startPoint;
        if (pointF == null || this.endPoint == null) {
            return;
        }
        Intrinsics.checkNotNull(pointF);
        float f2 = pointF.x;
        PointF pointF2 = this.startPoint;
        Intrinsics.checkNotNull(pointF2);
        float f3 = pointF2.y;
        PointF pointF3 = this.endPoint;
        Intrinsics.checkNotNull(pointF3);
        float f4 = pointF3.x;
        PointF pointF4 = this.endPoint;
        Intrinsics.checkNotNull(pointF4);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.scaleMatrix.mapPoints(fArr, new float[]{f2, f3, f4, pointF4.y});
        Bitmap bitmap4 = this.startBitmap;
        canvas.drawBitmap(bitmap4, fArr[0] - (bitmap4.getWidth() / 2), fArr[1] - this.startBitmap.getHeight(), this.paint);
        Bitmap bitmap5 = this.endBitmap;
        canvas.drawBitmap(bitmap5, fArr[2] - (bitmap5.getWidth() / 2), fArr[3] - this.endBitmap.getHeight(), this.paint);
    }

    public final void setEndBitmap(Bitmap bitmap) {
        this.endBitmap = bitmap;
    }

    public final void setPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        setPath(path, null, null, false);
    }

    public final void setStartBitmap(Bitmap bitmap) {
        this.startBitmap = bitmap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrackShareRoutineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setPath(@NotNull Path path, @Nullable PointF sp, @Nullable PointF ep) {
        Intrinsics.checkNotNullParameter(path, "path");
        setPath(path, sp, ep, true);
    }

    public /* synthetic */ TrackShareRoutineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setPath(@NotNull Path path, @Nullable PointF sp, @Nullable PointF ep, boolean usePoint) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.usePoint = usePoint;
        Path path2 = new Path();
        this.path = path2;
        path2.addPath(path);
        Path path3 = this.path;
        if (path3 != null) {
            path3.computeBounds(this.rectF, true);
        }
        this.startPoint = sp;
        this.endPoint = ep;
        RectF rectF = this.rectF;
        rectF.left -= ExtUtilsKt.getDp(Float.valueOf(30.0f));
        rectF.right += ExtUtilsKt.getDp(Float.valueOf(30.0f));
        rectF.top -= ExtUtilsKt.getDp(Float.valueOf(30.0f));
        rectF.bottom += ExtUtilsKt.getDp(Float.valueOf(30.0f));
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrackShareRoutineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        this.scaleMatrix = new Matrix();
        this.rectF = new RectF();
        paint.setColor(ApplicationExtKt.getApplication().getResources().getColor(ali.f1175a, null));
        float fDip2px = DisplayUtil.dip2px(2.0f);
        paint.setStrokeWidth(fDip2px);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new CornerPathEffect(fDip2px));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.startBitmap = BitmapFactory.decodeResource(getResources(), vmi.e);
        this.endBitmap = BitmapFactory.decodeResource(getResources(), vmi.d);
    }
}
