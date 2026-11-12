package com.mi.health.course.eco.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.mi.health.course.LineChartType;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import defpackage.czi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0014J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0014J\u0016\u00103\u001a\u00020)2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0007J\u000e\u00107\u001a\u00020)2\u0006\u00104\u001a\u000205J#\u00108\u001a\u00020)2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000e0;j\b\u0012\u0004\u0012\u00020\u000e`:¢\u0006\u0002\u0010<J#\u0010=\u001a\u00020)2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000e0;j\b\u0012\u0004\u0012\u00020\u000e`:¢\u0006\u0002\u0010<J\u000e\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\u000eJ\u0010\u0010@\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010A\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010C\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/mi/health/course/eco/widget/LineChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shaderColor", "", "list", "", "Lcom/xiaomi/wearable/course/data/LinechartDataEntity;", "recommendList", "recommendLinePaint", "Landroid/graphics/Paint;", "actualLinePaint", "shaderPaint", "circlePaint1", "circlePaint2", "axesPaint", "textPaint", "pathShader", "Landroid/graphics/Path;", "path", "recommendPath", "xlength", "", "yLength", "yText", "", "xText", "yMaxData", "yInterval", "xTopMargin", "xyTextSize", "xMaxData", "xPart", "onLayout", "", "changed", "", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setXType", "type", "Lcom/mi/health/course/LineChartType;", Constants.KEY_RECHARGE_MAXVALUE, "setYType", "initRecommendData", "dataList", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Ljava/util/ArrayList;)V", "initBikeRecommendData", "updateData", "data", "drawAxes", "drawText", "drawLine", "drawRecommendLine", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LineChartView extends View {

    @NotNull
    private final Paint actualLinePaint;

    @NotNull
    private final Paint axesPaint;

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
    private final Paint recommendLinePaint;

    @NotNull
    private List<LinechartDataEntity> recommendList;

    @NotNull
    private final Path recommendPath;

    @NotNull
    private final int[] shaderColor;

    @NotNull
    private final Paint shaderPaint;

    @NotNull
    private final Paint textPaint;
    private int xMaxData;
    private int xPart;

    @NotNull
    private String xText;
    private int xTopMargin;
    private float xlength;
    private int xyTextSize;
    private int yInterval;
    private float yLength;
    private int yMaxData;

    @NotNull
    private String yText;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LineChartType.values().length];
            try {
                iArr[LineChartType.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LineChartType.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LineChartType.RPM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawAxes(Canvas canvas) {
        canvas.drawLine(0.0f, this.yLength, this.xlength + (this.textPaint.measureText(String.valueOf(this.xMaxData)) / 2), this.yLength, this.axesPaint);
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
            float yAxis = this.yLength - ((linechartDataEntity.getYAxis() / this.yMaxData) * this.yLength);
            if (xAxis < 5.0f) {
                xAxis = 5.0f;
            }
            if (i == 0) {
                this.path.moveTo(xAxis, yAxis);
                this.pathShader.moveTo(0.0f, this.yLength);
            } else {
                this.path.lineTo(xAxis, yAxis);
                this.pathShader.lineTo(xAxis, yAxis);
                if (i == size - 1) {
                    this.pathShader.lineTo(xAxis, this.yLength);
                    this.pathShader.close();
                }
            }
            i++;
            float f3 = xAxis;
            f2 = yAxis;
            f = f3;
        }
        this.shaderPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.yLength, this.shaderColor, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPath(this.path, this.actualLinePaint);
        canvas.drawPath(this.pathShader, this.shaderPaint);
        canvas.drawCircle(f, f2, 10.0f, this.circlePaint1);
        canvas.drawCircle(f, f2, 5.0f, this.circlePaint2);
    }

    private final void drawRecommendLine(Canvas canvas) {
        this.recommendPath.reset();
        int size = this.recommendList.size();
        for (int i = 0; i < size; i++) {
            LinechartDataEntity linechartDataEntity = this.recommendList.get(i);
            float xAxis = (linechartDataEntity.getXAxis() / this.xMaxData) * this.xlength;
            float yAxis = this.yLength - ((linechartDataEntity.getYAxis() / this.yMaxData) * this.yLength);
            if (xAxis < 5.0f) {
                xAxis = 5.0f;
            }
            if (i == 0) {
                this.recommendPath.moveTo(xAxis, yAxis);
            } else {
                this.recommendPath.lineTo(xAxis, yAxis);
            }
        }
        canvas.drawPath(this.recommendPath, this.recommendLinePaint);
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
            int i4 = 0;
            while (true) {
                if (i4 == 0) {
                    strValueOf = i4 + this.xText;
                } else {
                    strValueOf = String.valueOf(i4);
                }
                int i5 = this.xMaxData;
                canvas.drawText(strValueOf, (i4 / i5) * (this.xlength - (this.textPaint.measureText(String.valueOf(i5)) / 2)), getHeight() - 3.0f, this.textPaint);
                if (i4 == progressionLastElement) {
                    break;
                } else {
                    i4 += i2;
                }
            }
        }
        int i6 = this.yMaxData;
        int i7 = this.yInterval;
        if (i7 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i7 + ".");
        }
        int progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(0, i6, i7);
        if (progressionLastElement2 < 0) {
            return;
        }
        while (true) {
            String strValueOf2 = i3 == 0 ? this.yText : String.valueOf(i3);
            float width = getWidth() - this.textPaint.measureText(this.yText);
            float f = this.yLength;
            canvas.drawText(strValueOf2, width, f - ((i3 / this.yMaxData) * (f - this.xyTextSize)), this.textPaint);
            if (i3 == progressionLastElement2) {
                return;
            } else {
                i3 += i7;
            }
        }
    }

    public final void initBikeRecommendData(@NotNull ArrayList<LinechartDataEntity> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.yMaxData = 180;
        this.yInterval = 20;
        this.recommendList.addAll(dataList);
    }

    public final void initRecommendData(@NotNull ArrayList<LinechartDataEntity> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.recommendList.addAll(dataList);
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
        this.yLength = ((getHeight() - this.xyTextSize) - this.xTopMargin) - 3.0f;
    }

    public final void setXType(@NotNull LineChartType type, int maxValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.xText = "(" + ResourceExtKt.getString(czi.i) + ")";
            this.xPart = 6;
            int i2 = maxValue / 60;
            if (maxValue % 60 > 0) {
                i2++;
            }
            this.xMaxData = i2;
        } else if (i == 2) {
            this.xText = "(" + ResourceExtKt.getString(czi.course_audio_linechart_xaxis) + ")";
            this.xPart = 5;
            this.xMaxData = maxValue;
        } else if (i == 3) {
            this.xText = "(" + ResourceExtKt.getString(czi.i) + ")";
            this.xPart = 5;
            this.xMaxData = maxValue;
        }
        int i3 = this.xMaxData;
        int i4 = this.xPart;
        if (i3 % i4 > 0) {
            this.xMaxData = ((i3 / i4) + 1) * i4;
        }
        invalidate();
    }

    public final void setYType(@NotNull LineChartType type) {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 3) {
            str = "(" + ResourceExtKt.getString(czi.i) + ")";
        } else {
            str = "(" + ResourceExtKt.getString(czi.course_audio_linechart_yaxis) + ")";
        }
        this.yText = str;
        invalidate();
    }

    public final void updateData(@NotNull LinechartDataEntity data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getXAxis() > this.xMaxData || data.getYAxis() < 1.0f) {
            return;
        }
        this.list.add(data);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LineChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shaderColor = new int[]{Color.argb(80, 8, SportReportBaseParser.ReportType.noFlyDuration, 54), Color.argb(50, 8, SportReportBaseParser.ReportType.noFlyDuration, 54), Color.argb(20, 8, SportReportBaseParser.ReportType.noFlyDuration, 54)};
        this.list = new ArrayList();
        this.recommendList = new ArrayList();
        Paint paint = new Paint();
        this.recommendLinePaint = paint;
        Paint paint2 = new Paint();
        this.actualLinePaint = paint2;
        Paint paint3 = new Paint();
        this.shaderPaint = paint3;
        Paint paint4 = new Paint();
        this.circlePaint1 = paint4;
        Paint paint5 = new Paint();
        this.circlePaint2 = paint5;
        Paint paint6 = new Paint();
        this.axesPaint = paint6;
        Paint paint7 = new Paint();
        this.textPaint = paint7;
        this.pathShader = new Path();
        this.path = new Path();
        this.recommendPath = new Path();
        this.yText = "(" + ResourceExtKt.getString(czi.course_audio_linechart_yaxis) + ")";
        this.xText = "(" + ResourceExtKt.getString(czi.i) + ")";
        this.yMaxData = 15;
        this.yInterval = 3;
        this.xTopMargin = 10;
        this.xyTextSize = 30;
        this.xMaxData = 12;
        this.xPart = 6;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(5.0f);
        paint.setColor(UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? Color.parseColor("#F3F3F3") : Color.parseColor("#21000000"));
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(5.0f);
        paint2.setColor(Color.parseColor("#08C59A"));
        paint2.setAlpha(255);
        paint6.setStyle(style);
        paint6.setStrokeWidth(1.0f);
        paint6.setColor(Color.parseColor("#CFCFCF"));
        paint7.setStrokeWidth(2.0f);
        paint7.setTextSize(UIUtils.INSTANCE.sp2px(context, 9.0f));
        paint7.setColor(Color.parseColor("#CFCFCF"));
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(2.0f);
        paint4.setColor(-1);
        paint4.setStrokeWidth(5.0f);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(Color.parseColor("#08C59A"));
    }
}
