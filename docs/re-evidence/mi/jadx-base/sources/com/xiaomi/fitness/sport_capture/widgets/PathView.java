package com.xiaomi.fitness.sport_capture.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport_capture.utils.CoordinatePoint;
import com.xiaomi.fitness.sport_capture.utils.RoutePointManager;
import defpackage.wwi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0014J\u0016\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/PathView;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getCtx", "()Landroid/content/Context;", "TAG", "", "centerX", "", "centerY", "radius", "outRadius", "rectF", "Landroid/graphics/RectF;", "linePath", "Landroid/graphics/Path;", "clipPath", "circleBgPaint", "Landroid/graphics/Paint;", "mainLinePathPaint", "subLinePathPaint", "northPaint", "compassRotate", "compassBitmap", "Landroid/graphics/Bitmap;", "onLayout", "", "changed", "", "left", "", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "update", "rotate", "onDraw", "canvas", "Landroid/graphics/Canvas;", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathView.kt\ncom/xiaomi/fitness/sport_capture/widgets/PathView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1863#2,2:139\n*S KotlinDebug\n*F\n+ 1 PathView.kt\ncom/xiaomi/fitness/sport_capture/widgets/PathView\n*L\n121#1:139,2\n*E\n"})
public final class PathView extends View {

    @NotNull
    private final String TAG;
    private float centerX;
    private float centerY;

    @NotNull
    private final Paint circleBgPaint;

    @NotNull
    private final Path clipPath;

    @NotNull
    private Bitmap compassBitmap;
    private float compassRotate;

    @NotNull
    private final Context ctx;

    @NotNull
    private final Path linePath;

    @NotNull
    private final Paint mainLinePathPaint;

    @NotNull
    private final Paint northPaint;
    private float outRadius;
    private float radius;

    @NotNull
    private RectF rectF;

    @NotNull
    private final Paint subLinePathPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.TAG = "PathView";
        this.centerX = -1.0f;
        this.centerY = -1.0f;
        this.radius = -1.0f;
        this.rectF = new RectF();
        this.linePath = new Path();
        this.clipPath = new Path();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#4DADADAD"));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.circleBgPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#4A7DFF"));
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(ExtUtilsKt.getDp(3));
        paint2.setPathEffect(new CornerPathEffect(paint2.getStrokeWidth()));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.mainLinePathPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#385BB4"));
        paint3.setStyle(style2);
        paint3.setStrokeWidth(ExtUtilsKt.getDp(6));
        paint3.setPathEffect(new CornerPathEffect(paint3.getStrokeWidth()));
        paint3.setStrokeCap(cap);
        this.subLinePathPaint = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(-1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(8.0f);
        paint4.setTextSize(ExtUtilsKt.getSp(12));
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setAntiAlias(true);
        this.northPaint = paint4;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ctx.getResources(), wwi.f38439a);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        this.compassBitmap = bitmapDecodeResource;
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.clipPath.addCircle(this.centerX, this.centerY, this.outRadius, Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        canvas.drawCircle(this.centerX, this.centerY, this.outRadius, this.circleBgPaint);
        this.circleBgPaint.setColor(Color.parseColor("#50616161"));
        canvas.drawCircle(this.centerX, this.centerY, this.outRadius, this.circleBgPaint);
        ArrayList<CoordinatePoint> points = RoutePointManager.INSTANCE.getPoints();
        if (points != null) {
            this.linePath.reset();
            this.linePath.moveTo(this.centerX, this.centerY);
            for (CoordinatePoint coordinatePoint : points) {
                this.linePath.lineTo(this.centerX + coordinatePoint.getX(), this.centerY + coordinatePoint.getY());
            }
        }
        canvas.drawPath(this.linePath, this.subLinePathPaint);
        canvas.drawPath(this.linePath, this.mainLinePathPaint);
        canvas.save();
        canvas.rotate(this.compassRotate, this.centerX, this.centerY);
        Bitmap bitmap = this.compassBitmap;
        canvas.drawBitmap(bitmap, this.centerX - (bitmap.getWidth() / 2), this.centerY - (this.compassBitmap.getHeight() / 2), (Paint) null);
        canvas.restore();
        canvas.drawText("N", this.centerX, this.centerY - ExtUtilsKt.getDp(35), this.northPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.centerX = getWidth() / 2.0f;
        this.centerY = getHeight() / 2.0f;
        this.radius = (RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2) * 0.9f;
        this.outRadius = RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2.0f;
        RectF rectF = this.rectF;
        float f = this.centerX;
        float f2 = this.radius;
        rectF.left = f - f2;
        float f3 = this.centerY;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
        RoutePointManager.INSTANCE.updateRadius((int) f2);
    }

    public final void update(float rotate, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.compassRotate = rotate;
        try {
            if (((Activity) ctx).getWindowManager().getDefaultDisplay().getRotation() == 1) {
                this.compassRotate += 90;
            }
        } catch (Exception e) {
            Logger.e(this.TAG, "update exception", e);
        }
    }

    public /* synthetic */ PathView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
