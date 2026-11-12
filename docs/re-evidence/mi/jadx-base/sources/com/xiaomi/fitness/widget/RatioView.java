package com.xiaomi.fitness.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b5j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J2\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/widget/RatioView;", "", "ratio", "", "getRatio", "()F", "setRatio", "(F)V", "widthFixed", "", "getWidthFixed", "()Z", "setWidthFixed", "(Z)V", "obtainAttrs", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "onRatioMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onMeasure", "Lkotlin/Function2;", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RatioView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void obtainAttrs(@NotNull RatioView ratioView, @NotNull Context context, @Nullable AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.E3);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            ratioView.setRatio(typedArrayObtainStyledAttributes.getFloat(b5j.G3, ratioView.getRatio()));
            ratioView.setWidthFixed(typedArrayObtainStyledAttributes.getInteger(b5j.F3, 0) == 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static void onRatioMeasure(@NotNull RatioView ratioView, int i, int i2, @NotNull Function2<? super Integer, ? super Integer, Unit> onMeasure) {
            Intrinsics.checkNotNullParameter(onMeasure, "onMeasure");
            if (ratioView.getRatio() <= 0.0f) {
                onMeasure.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            if (ratioView.getWidthFixed()) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / ratioView.getRatio()), 1073741824);
            } else {
                i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * ratioView.getRatio()), 1073741824);
            }
            onMeasure.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    float getRatio();

    boolean getWidthFixed();

    void obtainAttrs(@NotNull Context context, @Nullable AttributeSet attrs);

    void onRatioMeasure(int widthMeasureSpec, int heightMeasureSpec, @NotNull Function2<? super Integer, ? super Integer, Unit> onMeasure);

    void setRatio(float f);

    void setWidthFixed(boolean z);
}
