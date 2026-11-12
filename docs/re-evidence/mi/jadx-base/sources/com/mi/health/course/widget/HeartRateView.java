package com.mi.health.course.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.mi.health.course.widget.HeartRateView;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import defpackage.czi;
import defpackage.xmi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007J0\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0014J\u0010\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0014J\u0014\u0010C\u001a\u0002072\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0EJ\u000e\u0010F\u001a\u0002072\u0006\u0010D\u001a\u00020\u000eJ\u0010\u0010G\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010H\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010I\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010J\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010*\u001a\n ,*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b3\u00104¨\u0006K"}, d2 = {"Lcom/mi/health/course/widget/HeartRateView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shaderColor", "", "list", "", "Lcom/xiaomi/wearable/course/data/LinechartDataEntity;", "recommendList", "recommendPaint", "Landroid/graphics/Paint;", "actualLinePaint", "shaderPaint", "axesPaint", "textPaint", "circlePaint1", "circlePaint2", "pathShader", "Landroid/graphics/Path;", "path", "recommendMaxPath", "xlength", "", "yLength", "yAxisLength", "yText", "", "xText", "yMaxData", "yStart", "yInterval", "xTopMargin", "xyTextSize", "xMaxData", "xPart", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap$delegate", "Lkotlin/Lazy;", "src", "Landroid/graphics/Rect;", "getSrc", "()Landroid/graphics/Rect;", "src$delegate", "setXMaxData", "", Constants.KEY_RECHARGE_MAXVALUE, "onLayout", "changed", "", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "initRecommendData", "data", "", "updateData", "drawAxes", "drawText", "drawLine", "drawRecommendLine", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartRateView extends View {

    @NotNull
    private final Paint actualLinePaint;

    @NotNull
    private final Paint axesPaint;

    /* JADX INFO: renamed from: bitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bitmap;

    @NotNull
    private final Paint circlePaint1;

    @NotNull
    private final Paint circlePaint2;

    @NotNull
    private List<LinechartDataEntity> list;

    @NotNull
    private final Path path;

    @NotNull
    private final Path pathShader;

    @NotNull
    private List<LinechartDataEntity> recommendList;

    @NotNull
    private final Path recommendMaxPath;

    @NotNull
    private final Paint recommendPaint;

    @NotNull
    private final int[] shaderColor;

    @NotNull
    private final Paint shaderPaint;

    /* JADX INFO: renamed from: src$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy src;

    @NotNull
    private final Paint textPaint;
    private int xMaxData;
    private int xPart;

    @NotNull
    private String xText;
    private int xTopMargin;
    private float xlength;
    private int xyTextSize;
    private float yAxisLength;
    private final int yInterval;
    private float yLength;
    private final int yMaxData;
    private final int yStart;

    @NotNull
    private final String yText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeartRateView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap bitmap_delegate$lambda$0(HeartRateView this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outWidth = this$0.getWidth();
        options.outHeight = this$0.getHeight();
        return BitmapFactory.decodeResource(context.getResources(), xmi.course_hr_linechart_bg, options);
    }

    private final void drawAxes(Canvas canvas) {
        float f = this.yLength;
        canvas.drawLine(0.0f, f, this.xlength, f, this.axesPaint);
    }

    private final void drawLine(Canvas canvas) {
        int size = this.list.size();
        if (size == 0) {
            return;
        }
        this.path.reset();
        this.pathShader.reset();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < size) {
            LinechartDataEntity linechartDataEntity = this.list.get(i);
            float xAxis = (linechartDataEntity.getXAxis() / this.xMaxData) * this.xlength;
            float f3 = this.yAxisLength;
            float yAxis = linechartDataEntity.getYAxis();
            int i2 = this.yStart;
            float f4 = f3 - (((yAxis - i2) / (this.yMaxData - i2)) * this.yAxisLength);
            if (i == 0) {
                this.path.moveTo(xAxis, f4);
                this.pathShader.moveTo(0.0f, this.yLength);
            } else {
                this.path.lineTo(xAxis, f4);
                this.pathShader.lineTo(xAxis, f4);
                if (i == size - 1) {
                    this.pathShader.lineTo(xAxis, this.yLength);
                    this.pathShader.close();
                }
            }
            i++;
            f2 = f4;
            f = xAxis;
        }
        this.shaderPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.yLength, this.shaderColor, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPath(this.path, this.actualLinePaint);
        canvas.drawPath(this.pathShader, this.shaderPaint);
        if (f < 10.0f) {
            f = 10.0f;
        }
        canvas.drawCircle(f, f2, 10.0f, this.circlePaint1);
        canvas.drawCircle(f, f2, 5.0f, this.circlePaint2);
    }

    private final void drawRecommendLine(Canvas canvas) {
        int size = this.recommendList.size();
        if (size == 0) {
            return;
        }
        this.recommendMaxPath.reset();
        RectF rectF = new RectF(0.0f, 0.0f, this.xlength, this.yLength);
        Path path = new Path();
        path.addRect(rectF, Path.Direction.CW);
        canvas.drawBitmap(getBitmap(), getSrc(), rectF, (Paint) null);
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, size), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                LinechartDataEntity linechartDataEntity = this.recommendList.get(first);
                if (first != size - 1) {
                    LinechartDataEntity linechartDataEntity2 = this.recommendList.get(first + 1);
                    float xAxis = (linechartDataEntity.getXAxis() / this.xMaxData) * this.xlength;
                    float xAxis2 = (linechartDataEntity2.getXAxis() / this.xMaxData) * this.xlength;
                    float f = this.yAxisLength;
                    float yAxis = linechartDataEntity.getYAxis();
                    int i = this.yStart;
                    float f2 = (yAxis - i) / (this.yMaxData - i);
                    float f3 = this.yAxisLength;
                    float f4 = f - (f2 * f3);
                    float yAxis2 = linechartDataEntity2.getYAxis();
                    int i2 = this.yStart;
                    this.recommendMaxPath.addRect(new RectF(xAxis, f4, xAxis2, f3 - (((yAxis2 - i2) / (this.yMaxData - i2)) * this.yAxisLength)), Path.Direction.CW);
                    path.op(this.recommendMaxPath, Path.Op.DIFFERENCE);
                    if (first == last) {
                        break;
                    } else {
                        first += step;
                    }
                } else {
                    break;
                }
            }
        }
        canvas.drawPath(path, this.recommendPaint);
    }

    private final void drawText(Canvas canvas) {
        String strValueOf;
        int i = this.xMaxData;
        int i2 = i / this.xPart;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i2 + ".");
        }
        int i3 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, i, i2);
        if (progressionLastElement >= 0) {
            while (true) {
                if (i3 == 0) {
                    strValueOf = i3 + this.xText;
                } else {
                    strValueOf = String.valueOf(i3);
                }
                int i4 = this.xMaxData;
                canvas.drawText(strValueOf, (i3 / i4) * (this.xlength - this.textPaint.measureText(String.valueOf(i4))), getHeight() - 3.0f, this.textPaint);
                if (i3 == progressionLastElement) {
                    break;
                } else {
                    i3 += i2;
                }
            }
        }
        canvas.drawText(this.yText, getWidth() - this.textPaint.measureText(this.yText), this.yLength, this.textPaint);
        int i5 = this.yStart;
        int i6 = this.yMaxData;
        int i7 = this.yInterval;
        if (i7 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i7 + ".");
        }
        int progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(i5, i6, i7);
        if (i5 > progressionLastElement2) {
            return;
        }
        while (true) {
            String strValueOf2 = String.valueOf(i5);
            float width = getWidth() - this.textPaint.measureText(this.yText);
            float f = this.yAxisLength;
            int i8 = this.yStart;
            canvas.drawText(strValueOf2, width, f - (((i5 - i8) / (this.yMaxData - i8)) * (f - this.xyTextSize)), this.textPaint);
            if (i5 == progressionLastElement2) {
                return;
            } else {
                i5 += i7;
            }
        }
    }

    private final Bitmap getBitmap() {
        return (Bitmap) this.bitmap.getValue();
    }

    private final Rect getSrc() {
        return (Rect) this.src.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect src_delegate$lambda$1(HeartRateView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Rect(0, 0, this$0.getBitmap().getWidth(), this$0.getBitmap().getHeight());
    }

    public final void initRecommendData(@NotNull List<LinechartDataEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.recommendList.addAll(data);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawAxes(canvas);
        drawText(canvas);
        drawRecommendLine(canvas);
        drawLine(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.xlength = (getWidth() - this.textPaint.measureText(String.valueOf(this.xMaxData))) - this.textPaint.measureText(this.yText);
        int height = getHeight();
        int i = this.xyTextSize;
        float f = ((height - i) - this.xTopMargin) - 3.0f;
        this.yLength = f;
        this.yAxisLength = f - i;
    }

    public final void setXMaxData(int maxValue) {
        this.xMaxData = maxValue;
        int i = this.xPart;
        if (maxValue % i > 0) {
            this.xMaxData = ((maxValue / i) + 1) * i;
        }
        invalidate();
    }

    public final void updateData(@NotNull LinechartDataEntity data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getXAxis() > this.xMaxData || data.getYAxis() == 0.0f || data.getXAxis() > this.yMaxData) {
            return;
        }
        this.list.add(data);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeartRateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HeartRateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeartRateView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shaderColor = new int[]{Color.argb(80, 255, 89, 89), Color.argb(50, 255, 89, 89), Color.argb(20, 255, 89, 89)};
        this.list = new ArrayList();
        this.recommendList = new ArrayList();
        Paint paint = new Paint();
        this.recommendPaint = paint;
        Paint paint2 = new Paint();
        this.actualLinePaint = paint2;
        Paint paint3 = new Paint();
        this.shaderPaint = paint3;
        Paint paint4 = new Paint();
        this.axesPaint = paint4;
        Paint paint5 = new Paint();
        this.textPaint = paint5;
        Paint paint6 = new Paint();
        this.circlePaint1 = paint6;
        Paint paint7 = new Paint();
        this.circlePaint2 = paint7;
        this.pathShader = new Path();
        this.path = new Path();
        this.recommendMaxPath = new Path();
        this.yText = "(" + ResourceExtKt.getString(czi.course_data_rate_unit) + ")";
        this.xText = "(" + ResourceExtKt.getString(czi.i) + ")";
        this.yMaxData = 200;
        this.yStart = 60;
        this.yInterval = 35;
        this.xTopMargin = 10;
        this.xyTextSize = 30;
        this.xMaxData = 12;
        this.xPart = 6;
        this.bitmap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r6c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HeartRateView.bitmap_delegate$lambda$0(this.f32235a, context);
            }
        });
        this.src = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s6c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HeartRateView.src_delegate$lambda$1(this.f33341a);
            }
        });
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint.setColor(-1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(7.0f);
        paint2.setColor(Color.parseColor("#F54F66"));
        paint4.setStyle(style2);
        paint4.setStrokeWidth(1.0f);
        paint4.setColor(Color.parseColor("#CFCFCF"));
        paint5.setStrokeWidth(2.0f);
        paint5.setTextSize(UIUtils.INSTANCE.sp2px(context, 9.0f));
        paint5.setColor(Color.parseColor("#CFCFCF"));
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(2.0f);
        paint6.setColor(-1);
        paint6.setStrokeWidth(5.0f);
        paint7.setStyle(style);
        paint7.setColor(Color.parseColor("#F54F66"));
    }
}
