package com.mi.health.rainbow;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.health.threetarget.RainbowExExportKt;
import defpackage.ddp;
import defpackage.edp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001d2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b04J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0018\u0010:\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010=\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010>\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u001dH\u0002J \u0010B\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010A\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0018\u0010C\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010;\u001a\u00020\u001dH\u0002J(\u0010D\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J0\u0010D\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010F\u001a\u00020@H\u0002J\u0010\u0010G\u001a\u00020!2\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010H\u001a\u00020!2\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010I\u001a\u00020!2\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010K\u001a\u00020L2\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010M\u001a\u00020L2\u0006\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010N\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001dH\u0002J\b\u0010O\u001a\u000206H\u0002J\u001c\u0010P\u001a\u0002062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000b042\u0006\u0010R\u001a\u00020@R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/mi/health/rainbow/RainbowWidgetHelper;", "", "<init>", "()V", "TAG", "", "circlePaint", "Landroid/graphics/Paint;", "foundRectPaint", "mTargetItemList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "getMTargetItemList", "()Ljava/util/List;", "setMTargetItemList", "(Ljava/util/List;)V", "canvasWidth", "", "getCanvasWidth", "()F", "setCanvasWidth", "(F)V", "canvasHeight", "getCanvasHeight", "setCanvasHeight", "firstPercent", "secondPercent", "thirdPercent", "firstColor", "", "secondColor", "thirdColor", "firstColors", "", "secondColors", "thirdColors", "firstBgColors", "firstBgColorsWithAlpha", "secondBgColors", "secondBgColorsWithAlpha", "thirdBgColors", "thirdBgColorsWithAlpha", "itemWidth", "spaceWidth", "paintWidth", "getRainbowProgressBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "widthId", "heightId", "goalItemList", "", "doDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawThreeCircleWithBgAlpha", "drawBgAndPercent", "type", "getPercentByType", "drawThreeCircle", "drawThreeCircleBg", "checkFractionIsSmall", "", "fraction", "drawCircle", "drawFoundRect", "drawCircleInner", "sweepAngel", "isBg", "getCircleColors", "getCircleColorsBg", "getCircleColorsBgWithAlpha", "getCircleColor", "createTargetRectF", "Landroid/graphics/RectF;", "createFoundRectF", "getTimes", "resetPercent", "setRegularReport", "goalList", "isWightBg", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RainbowWidgetHelper {
    private float canvasHeight;
    private float canvasWidth;
    private float firstPercent;
    private float itemWidth;
    private float paintWidth;
    private float secondPercent;
    private float spaceWidth;
    private float thirdPercent;

    @NotNull
    private final String TAG = RainbowConstants.TAG;

    @NotNull
    private Paint circlePaint = new Paint(1);

    @NotNull
    private Paint foundRectPaint = new Paint(1);

    @NotNull
    private List<GoalItem> mTargetItemList = new ArrayList();
    private int firstColor = -1;
    private int secondColor = -1;
    private int thirdColor = -1;

    @NotNull
    private int[] firstColors = new int[2];

    @NotNull
    private int[] secondColors = new int[2];

    @NotNull
    private int[] thirdColors = new int[2];

    @NotNull
    private int[] firstBgColors = new int[2];

    @NotNull
    private int[] firstBgColorsWithAlpha = new int[2];

    @NotNull
    private int[] secondBgColors = new int[2];

    @NotNull
    private int[] secondBgColorsWithAlpha = new int[2];

    @NotNull
    private int[] thirdBgColors = new int[2];

    @NotNull
    private int[] thirdBgColorsWithAlpha = new int[2];

    private final boolean checkFractionIsSmall(float fraction, int type) {
        if (type == ddp.j) {
            if (fraction >= ddp.m) {
                return false;
            }
        } else if (type == ddp.f15416k) {
            if (fraction >= ddp.n) {
                return false;
            }
        } else if (fraction >= ddp.o) {
            return false;
        }
        return true;
    }

    private final RectF createFoundRectF(int type) {
        float times = getTimes(type) * (this.itemWidth + this.spaceWidth);
        float f = this.canvasHeight;
        float f2 = 2;
        return new RectF(times, (f / f2) - this.spaceWidth, this.itemWidth + times, f / f2);
    }

    private final RectF createTargetRectF(int type) {
        float times = getTimes(type);
        float f = this.itemWidth;
        float f2 = this.spaceWidth;
        return new RectF((f + f2) * times, (f + f2) * times, this.canvasWidth - ((f + f2) * times), this.canvasHeight - (times * (f + f2)));
    }

    private final void doDraw(Canvas canvas) {
        float f = this.canvasWidth / 7.2f;
        this.itemWidth = f;
        float f2 = f / 6.5f;
        this.spaceWidth = f2;
        this.paintWidth = f - f2;
        drawThreeCircle(canvas);
    }

    private final void drawBgAndPercent(Canvas canvas, int type) {
        canvas.save();
        float times = (this.itemWidth / 2.0f) + (getTimes(type) * this.itemWidth);
        float f = this.canvasWidth;
        RectF rectF = new RectF(times, times, f - times, f - times);
        Path path = new Path();
        path.arcTo(rectF, 180.0f, 180.0f, true);
        int[] circleColorsBgWithAlpha = getCircleColorsBgWithAlpha(type);
        Paint paint = this.circlePaint;
        float f2 = this.canvasWidth;
        float f3 = 2;
        paint.setShader(new SweepGradient(f2 / f3, f2 / f3, circleColorsBgWithAlpha, new float[]{0.0f, 1.0f}));
        this.circlePaint.setStrokeWidth(this.paintWidth);
        canvas.drawPath(path, this.circlePaint);
        Path path2 = new Path();
        path2.arcTo(rectF, 180.0f, 180 * getPercentByType(type), true);
        int[] circleColors = getCircleColors(type);
        Paint paint2 = this.circlePaint;
        float f4 = this.canvasWidth;
        paint2.setShader(new SweepGradient(f4 / f3, f4 / f3, circleColors, new float[]{0.0f, 1.0f}));
        canvas.drawPath(path2, this.circlePaint);
        canvas.restore();
    }

    private final void drawCircle(Canvas canvas, float fraction, int type) {
        float f = 180 * fraction;
        if (f == 0.0f) {
            return;
        }
        if (checkFractionIsSmall(fraction, type)) {
            drawFoundRect(canvas, type);
        } else {
            drawCircleInner(canvas, type, f, this.spaceWidth);
        }
    }

    private final void drawCircleInner(Canvas canvas, int type, float sweepAngel, float spaceWidth) {
        drawCircleInner(canvas, type, sweepAngel, spaceWidth, false);
    }

    private final void drawFoundRect(Canvas canvas, int type) {
        canvas.save();
        RectF rectFCreateFoundRectF = createFoundRectF(type);
        this.foundRectPaint.setColor(getCircleColor(type));
        float f = this.spaceWidth;
        canvas.drawRoundRect(rectFCreateFoundRectF, f / 2.0f, f / 2.0f, this.foundRectPaint);
        canvas.restore();
    }

    private final void drawThreeCircle(Canvas canvas) {
        drawThreeCircleBg(canvas);
        drawCircle(canvas, this.firstPercent, ddp.j);
        drawCircle(canvas, this.secondPercent, ddp.f15416k);
        drawCircle(canvas, this.thirdPercent, ddp.l);
    }

    private final void drawThreeCircleBg(Canvas canvas) {
        drawCircleInner(canvas, ddp.j, 180.0f, this.spaceWidth, true);
        drawCircleInner(canvas, ddp.f15416k, 180.0f, this.spaceWidth, true);
        drawCircleInner(canvas, ddp.l, 180.0f, this.spaceWidth / 2.0f, true);
    }

    private final void drawThreeCircleWithBgAlpha(Canvas canvas) {
        this.circlePaint.setStyle(Paint.Style.STROKE);
        this.circlePaint.setStrokeCap(Paint.Cap.BUTT);
        drawBgAndPercent(canvas, ddp.j);
        drawBgAndPercent(canvas, ddp.f15416k);
        drawBgAndPercent(canvas, ddp.l);
    }

    private final int getCircleColor(int type) {
        if (type == ddp.j) {
            return this.firstColor;
        }
        return type == ddp.f15416k ? this.secondColor : this.thirdColor;
    }

    private final int[] getCircleColors(int type) {
        if (type == ddp.j) {
            return this.firstColors;
        }
        return type == ddp.f15416k ? this.secondColors : this.thirdColors;
    }

    private final int[] getCircleColorsBg(int type) {
        if (type == ddp.j) {
            return this.firstBgColors;
        }
        return type == ddp.f15416k ? this.secondBgColors : this.thirdBgColors;
    }

    private final int[] getCircleColorsBgWithAlpha(int type) {
        if (type == ddp.j) {
            return this.firstBgColorsWithAlpha;
        }
        return type == ddp.f15416k ? this.secondBgColorsWithAlpha : this.thirdBgColorsWithAlpha;
    }

    private final float getPercentByType(int type) {
        if (type == ddp.j) {
            return this.firstPercent;
        }
        return type == ddp.f15416k ? this.secondPercent : this.thirdPercent;
    }

    private final int getTimes(int type) {
        int i = type - 1;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    private final void resetPercent() {
        this.firstPercent = 0.0f;
        this.secondPercent = 0.0f;
        this.thirdPercent = 0.0f;
    }

    public final float getCanvasHeight() {
        return this.canvasHeight;
    }

    public final float getCanvasWidth() {
        return this.canvasWidth;
    }

    @NotNull
    public final List<GoalItem> getMTargetItemList() {
        return this.mTargetItemList;
    }

    @NotNull
    public final Bitmap getRainbowProgressBitmap(@NotNull Context context, int widthId, int heightId, @NotNull List<GoalItem> goalItemList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(goalItemList, "goalItemList");
        setRegularReport(goalItemList, true);
        Resources resources = context.getResources();
        float dimension = resources.getDimension(widthId);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dimension, (int) resources.getDimension(heightId), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.canvasWidth = dimension;
        this.canvasHeight = dimension;
        doDraw(canvas);
        return bitmapCreateBitmap;
    }

    public final void setCanvasHeight(float f) {
        this.canvasHeight = f;
    }

    public final void setCanvasWidth(float f) {
        this.canvasWidth = f;
    }

    public final void setMTargetItemList(@NotNull List<GoalItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mTargetItemList = list;
    }

    public final void setRegularReport(@NotNull List<GoalItem> goalList, boolean isWightBg) {
        Intrinsics.checkNotNullParameter(goalList, "goalList");
        this.mTargetItemList.clear();
        this.mTargetItemList.addAll(goalList);
        resetPercent();
        for (int i = 0; i < 3; i++) {
            if (this.mTargetItemList.size() >= 1 && i == 0) {
                GoalItem goalItem = this.mTargetItemList.get(0);
                float achievedValue = (goalItem.getAchievedValue() * 1.0f) / goalItem.getGoalValue();
                this.firstPercent = achievedValue;
                this.firstPercent = Math.min(1.0f, achievedValue);
                this.firstColor = RainbowExExportKt.getItemColor(goalItem);
                this.firstColors = RainbowExExportKt.getItemColors(goalItem);
                this.firstBgColors = RainbowExExportKt.getItemBgColorsWithAlpha(goalItem);
                this.firstBgColorsWithAlpha = RainbowExExportKt.getItemBgColorsWithAlpha(goalItem);
            }
            if (this.mTargetItemList.size() >= 2 && i == 1) {
                GoalItem goalItem2 = this.mTargetItemList.get(1);
                float achievedValue2 = (goalItem2.getAchievedValue() * 1.0f) / goalItem2.getGoalValue();
                this.secondPercent = achievedValue2;
                this.secondPercent = Math.min(1.0f, achievedValue2);
                this.secondColor = RainbowExExportKt.getItemColor(goalItem2);
                this.secondColors = RainbowExExportKt.getItemColors(goalItem2);
                this.secondBgColors = RainbowExExportKt.getItemBgColorsWithAlpha(goalItem2);
                this.secondBgColorsWithAlpha = RainbowExExportKt.getItemBgColorsWithAlpha(goalItem2);
            }
            if (this.mTargetItemList.size() >= 3 && i == 2) {
                GoalItem goalItem3 = this.mTargetItemList.get(2);
                float achievedValue3 = (goalItem3.getAchievedValue() * 1.0f) / goalItem3.getGoalValue();
                this.thirdPercent = achievedValue3;
                this.thirdPercent = Math.min(1.0f, achievedValue3);
                this.thirdColor = RainbowExExportKt.getItemColor(goalItem3);
                this.thirdColors = RainbowExExportKt.getItemColors(goalItem3);
                this.thirdBgColors = RainbowExExportKt.getItemBgColorsWithAlpha(goalItem3);
                this.thirdBgColorsWithAlpha = RainbowExExportKt.getItemBgColorsWithAlpha(goalItem3);
            }
        }
    }

    private final void drawCircleInner(Canvas canvas, int type, float sweepAngel, float spaceWidth, boolean isBg) {
        SweepGradient sweepGradient;
        canvas.save();
        RectF rectFCreateTargetRectF = createTargetRectF(type);
        canvas.translate(rectFCreateTargetRectF.left, rectFCreateTargetRectF.top);
        edp edpVarF = edp.f(isBg, type, rectFCreateTargetRectF, this.itemWidth, spaceWidth, sweepAngel);
        float[] fArr = {0.0f, 1.0f};
        Paint paint = this.circlePaint;
        if (isBg) {
            int[] circleColorsBg = getCircleColorsBg(type);
            float f = this.canvasWidth;
            float f2 = 2;
            sweepGradient = new SweepGradient(f / f2, f / f2, circleColorsBg, fArr);
        } else {
            int[] circleColors = getCircleColors(type);
            float f3 = this.canvasWidth;
            float f4 = 2;
            sweepGradient = new SweepGradient(f3 / f4, f3 / f4, circleColors, fArr);
        }
        paint.setShader(sweepGradient);
        edpVarF.i(canvas, this.circlePaint);
        canvas.restore();
    }
}
