package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.electronic.scale.WeightResultParamsExtKt;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.model.FatAnalysisBean;
import com.xiaomi.fitness.electronic.scale.widget.FatAnalysisBodyView;
import defpackage.eji;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\u0012\u0010'\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0018\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0012H\u0002J\u001e\u0010*\u001a\u00020$2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b \u0010!¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/FatAnalysisBodyView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scale", "", "getScale", "()F", "scale$delegate", "Lkotlin/Lazy;", "value", "", "Lcom/xiaomi/fitness/electronic/scale/model/FatAnalysisBean;", "data", "getData", "()Ljava/util/List;", "setData$electronic_scale_chinaProductRelease", "(Ljava/util/List;)V", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "getWeightResult", "()Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "setWeightResult", "(Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;)V", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint$delegate", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawGroup", "drawItem", "bean", "setData", "muscleDataList", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FatAnalysisBodyView extends View {

    @NotNull
    private List<? extends FatAnalysisBean> data;

    /* JADX INFO: renamed from: mPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPaint;

    /* JADX INFO: renamed from: scale$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scale;

    @Nullable
    private WeightResult weightResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FatAnalysisBodyView(@NotNull Context context) {
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
    /* JADX WARN: Code duplicated, block: B:51:0x017d  */
    private final void drawItem(Canvas canvas, FatAnalysisBean bean) {
        WeightResult weightResult;
        getMPaint().setStyle(Paint.Style.FILL);
        String fillColor = bean.getFillColor();
        Intrinsics.checkNotNullExpressionValue(fillColor, "getFillColor(...)");
        if (fillColor.length() > 0 && (weightResult = this.weightResult) != null) {
            String name = bean.getName();
            if (name != null) {
                switch (name) {
                    case "躯干浅":
                        Paint mPaint = getMPaint();
                        short tfms = weightResult.getTfms();
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        mPaint.setColor(WeightResultParamsExtKt.getIntColor(tfms, context, false));
                        break;
                    case "躯干深":
                        Paint mPaint2 = getMPaint();
                        short tfms2 = weightResult.getTfms();
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        mPaint2.setColor(WeightResultParamsExtKt.getIntColor(tfms2, context2, true));
                        break;
                    case "右上肢浅":
                        Paint mPaint3 = getMPaint();
                        short rafms = weightResult.getRafms();
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        mPaint3.setColor(WeightResultParamsExtKt.getIntColor(rafms, context3, false));
                        break;
                    case "右上肢深":
                        Paint mPaint4 = getMPaint();
                        short rafms2 = weightResult.getRafms();
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        mPaint4.setColor(WeightResultParamsExtKt.getIntColor(rafms2, context4, true));
                        break;
                    case "右下肢浅":
                        Paint mPaint5 = getMPaint();
                        short rlfms = weightResult.getRlfms();
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        mPaint5.setColor(WeightResultParamsExtKt.getIntColor(rlfms, context5, false));
                        break;
                    case "右下肢深":
                        Paint mPaint6 = getMPaint();
                        short rlfms2 = weightResult.getRlfms();
                        Context context6 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        mPaint6.setColor(WeightResultParamsExtKt.getIntColor(rlfms2, context6, true));
                        break;
                    case "左上肢浅":
                        Paint mPaint7 = getMPaint();
                        short lafms = weightResult.getLafms();
                        Context context7 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                        mPaint7.setColor(WeightResultParamsExtKt.getIntColor(lafms, context7, false));
                        break;
                    case "左上肢深":
                        Paint mPaint8 = getMPaint();
                        short lafms2 = weightResult.getLafms();
                        Context context8 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                        mPaint8.setColor(WeightResultParamsExtKt.getIntColor(lafms2, context8, true));
                        break;
                    case "左下肢浅":
                        Paint mPaint9 = getMPaint();
                        short llfms = weightResult.getLlfms();
                        Context context9 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                        mPaint9.setColor(WeightResultParamsExtKt.getIntColor(llfms, context9, false));
                        break;
                    case "左下肢深":
                        Paint mPaint10 = getMPaint();
                        short llfms2 = weightResult.getLlfms();
                        Context context10 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                        mPaint10.setColor(WeightResultParamsExtKt.getIntColor(llfms2, context10, true));
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
            String name2 = bean.getName();
            if (Intrinsics.areEqual(name2, "正左") || Intrinsics.areEqual(name2, "正右")) {
                getMPaint().setColor(getResources().getColor(eji.w));
            } else {
                getMPaint().setColor(Color.parseColor(bean.getStrokeColor()));
            }
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
    public static final float scale_delegate$lambda$0(FatAnalysisBodyView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getResources().getDisplayMetrics().density;
    }

    @NotNull
    public final List<FatAnalysisBean> getData() {
        return this.data;
    }

    @Nullable
    public final WeightResult getWeightResult() {
        return this.weightResult;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.scale(getScale(), getScale());
        drawGroup(canvas);
        canvas.restore();
    }

    public final void setData(@Nullable List<? extends FatAnalysisBean> muscleDataList, @NotNull WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        if (muscleDataList == null) {
            muscleDataList = new ArrayList<>();
        }
        this.data = muscleDataList;
        this.weightResult = weightResult;
        requestLayout();
        postInvalidate();
    }

    public final void setData$electronic_scale_chinaProductRelease(@NotNull List<? extends FatAnalysisBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setWeightResult(@Nullable WeightResult weightResult) {
        this.weightResult = weightResult;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FatAnalysisBodyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FatAnalysisBodyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FatAnalysisBodyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scale = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ja9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(FatAnalysisBodyView.scale_delegate$lambda$0(this.f22587a));
            }
        });
        this.data = new ArrayList();
        this.mPaint = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ka9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FatAnalysisBodyView.mPaint_delegate$lambda$2();
            }
        });
    }
}
