package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b5j;
import defpackage.bmi;
import defpackage.qoi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/widget/view/DividerView;", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mHorizontal", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DividerView extends View {

    @NotNull
    private final Context mContext;
    private final boolean mHorizontal;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DividerView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        int dimensionPixelSize;
        if (this.mHorizontal) {
            size = this.mContext.getResources().getDimensionPixelSize(bmi.f4370a);
            dimensionPixelSize = View.MeasureSpec.getSize(heightMeasureSpec);
        } else {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
            dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(bmi.f4370a);
        }
        setMeasuredDimension(size, dimensionPixelSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DividerView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ DividerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DividerView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        setBackgroundResource(qoi.d);
        TypedArray typedArrayObtainStyledAttributes = mContext.obtainStyledAttributes(attributeSet, b5j.k0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mHorizontal = typedArrayObtainStyledAttributes.getBoolean(b5j.l0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
