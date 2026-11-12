package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.electronic.scale.model.FatAnalysisBean;
import com.xiaomi.fitness.electronic.scale.widget.BodyShapeDiagram;
import com.xiaomi.fitness.health.export.WeightExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\u0012\u0010'\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0018\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0012H\u0002J\u001e\u0010-\u001a\u00020$2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/BodyShapeDiagram;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scale", "", "getScale", "()F", "scale$delegate", "Lkotlin/Lazy;", "value", "", "Lcom/xiaomi/fitness/electronic/scale/model/FatAnalysisBean;", "data", "getData", "()Ljava/util/List;", "setData$electronic_scale_chinaProductRelease", "(Ljava/util/List;)V", "bt", "", "getBt", "()S", "setBt", "(S)V", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint$delegate", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawGroup", "setGreenPaintColor", "short", "setOrangePaintColor", "drawItem", "bean", "setData", "muscleDataList", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyShapeDiagram extends View {
    private short bt;

    @NotNull
    private List<? extends FatAnalysisBean> data;

    /* JADX INFO: renamed from: mPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPaint;

    /* JADX INFO: renamed from: scale$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scale;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BodyShapeDiagram(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawGroup(Canvas canvas) {
        if (canvas != null) {
            Iterator<? extends FatAnalysisBean> it = this.data.iterator();
            while (it.hasNext()) {
                drawItem(canvas, it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    private final void drawItem(Canvas canvas, FatAnalysisBean bean) {
        getMPaint().setStyle(Paint.Style.FILL);
        String fillColor = bean.getFillColor();
        Intrinsics.checkNotNullExpressionValue(fillColor, "getFillColor(...)");
        if (fillColor.length() > 0) {
            String name = bean.getName();
            if (name != null) {
                switch (name) {
                    case "偏胖":
                        setOrangePaintColor((short) 2);
                        break;
                    case "肥胖":
                        setOrangePaintColor((short) 4);
                        break;
                    case "健康型":
                        setGreenPaintColor((short) 0);
                        break;
                    case "偏瘦型":
                        setOrangePaintColor((short) -4);
                        break;
                    case "消瘦型":
                        setOrangePaintColor((short) -5);
                        break;
                    case "肌肉型":
                        setGreenPaintColor((short) 1);
                        break;
                    case "苗条型":
                        setGreenPaintColor((short) -1);
                        break;
                    case "运动员型":
                        setGreenPaintColor((short) 3);
                        break;
                    case "隐形肥胖":
                        setOrangePaintColor((short) -3);
                        break;
                    case "肌肉苗条型":
                        setGreenPaintColor((short) -2);
                        break;
                    default:
                        getMPaint().setColor(Color.parseColor(bean.getFillColor()));
                        break;
                }
            } else {
                getMPaint().setColor(Color.parseColor(bean.getFillColor()));
            }
        }
        canvas.drawPath(bean.getPath(), getMPaint());
        getMPaint().setStyle(Paint.Style.STROKE);
        String strokeColor = bean.getStrokeColor();
        Intrinsics.checkNotNullExpressionValue(strokeColor, "getStrokeColor(...)");
        if (strokeColor.length() > 0) {
            getMPaint().setColor(Color.parseColor(bean.getStrokeColor()));
        }
        canvas.drawPath(bean.getPath(), getMPaint());
    }

    private final Paint getMPaint() {
        return (Paint) this.mPaint.getValue();
    }

    private final float getScale() {
        return ((Number) this.scale.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint mPaint_delegate$lambda$2() {
        Paint paint = new Paint(5);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(0.2f);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale_delegate$lambda$0(BodyShapeDiagram this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getResources().getDisplayMetrics().density;
    }

    private final void setGreenPaintColor(short s) {
        if (this.bt == s) {
            getMPaint().setColor(getContext().getColor(WeightExtKt.getColorNormal()));
        } else {
            getMPaint().setColor(Color.parseColor("#1A8C93B0"));
        }
    }

    private final void setOrangePaintColor(short s) {
        if (this.bt == s) {
            getMPaint().setColor(Color.parseColor("#FF8A05"));
        } else {
            getMPaint().setColor(Color.parseColor("#1A8C93B0"));
        }
    }

    public final short getBt() {
        return this.bt;
    }

    @NotNull
    public final List<FatAnalysisBean> getData() {
        return this.data;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.scale(getScale(), getScale());
        drawGroup(canvas);
        canvas.restore();
    }

    public final void setBt(short s) {
        this.bt = s;
    }

    public final void setData(@Nullable List<? extends FatAnalysisBean> muscleDataList, short bt) {
        if (muscleDataList == null) {
            muscleDataList = new ArrayList<>();
        }
        this.data = muscleDataList;
        this.bt = bt;
        requestLayout();
        postInvalidate();
    }

    public final void setData$electronic_scale_chinaProductRelease(@NotNull List<? extends FatAnalysisBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BodyShapeDiagram(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BodyShapeDiagram(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BodyShapeDiagram(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scale = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(BodyShapeDiagram.scale_delegate$lambda$0(this.f24624a));
            }
        });
        this.data = new ArrayList();
        this.mPaint = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyShapeDiagram.mPaint_delegate$lambda$2();
            }
        });
    }
}
