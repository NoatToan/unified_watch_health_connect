package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/share/view/ShareRoutineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "scaleMatrix", "Landroid/graphics/Matrix;", "rectF", "Landroid/graphics/RectF;", "strokeWidth", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "scaleFactor", "setPath", "setPathColor", "color", "getPath", "getPointsFromPath", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareRoutineView extends View {

    @NotNull
    private final Paint paint;

    @Nullable
    private Path path;

    @NotNull
    private final RectF rectF;
    private final float scaleFactor;

    @NotNull
    private final Matrix scaleMatrix;
    private final float strokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareRoutineView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Path getPath() {
        return this.path;
    }

    @NotNull
    public final float[] getPointsFromPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
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

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = 2;
        float fMin = Math.min(((float) getWidth()) > this.strokeWidth * f ? (getWidth() - (this.strokeWidth * f)) / this.rectF.width() : 1.0f, ((float) getHeight()) > this.strokeWidth * f ? (getHeight() - (this.strokeWidth * f)) / this.rectF.height() : 1.0f);
        this.scaleMatrix.setScale(fMin, fMin, this.rectF.centerX(), this.rectF.centerY());
        Path path = new Path();
        RectF rectF = new RectF();
        Path path2 = this.path;
        if (path2 != null) {
            path.addPath(path2, this.scaleMatrix);
            path.computeBounds(rectF, true);
            canvas.save();
            float width = (getWidth() / 2.0f) - (rectF.width() / f);
            getHeight();
            canvas.translate((-rectF.left) + width, (-rectF.top) + this.strokeWidth);
            getPointsFromPath(path);
            canvas.drawPath(path, this.paint);
            canvas.restore();
        }
    }

    public final void setPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = new Path();
        this.path = path2;
        path2.addPath(path);
        getPointsFromPath(path);
        Path path3 = this.path;
        if (path3 != null) {
            path3.computeBounds(this.rectF, true);
        }
        Matrix matrix = this.scaleMatrix;
        float f = this.scaleFactor;
        matrix.setScale(f, f, this.rectF.centerX(), this.rectF.centerY());
        Path path4 = this.path;
        if (path4 != null) {
            path4.transform(this.scaleMatrix);
        }
        Path path5 = this.path;
        if (path5 != null) {
            path5.computeBounds(this.rectF, true);
        }
        requestLayout();
    }

    public final void setPathColor(int color) {
        this.paint.setColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareRoutineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareRoutineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        this.scaleMatrix = new Matrix();
        this.rectF = new RectF();
        float fDip2px = DisplayUtil.dip2px(2.0f);
        this.strokeWidth = fDip2px;
        paint.setColor(-1);
        paint.setStrokeWidth(fDip2px);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new CornerPathEffect(fDip2px));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.scaleFactor = 0.4f;
    }

    public /* synthetic */ ShareRoutineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
