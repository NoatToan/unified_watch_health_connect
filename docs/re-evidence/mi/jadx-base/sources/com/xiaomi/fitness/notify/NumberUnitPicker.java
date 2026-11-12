package com.xiaomi.fitness.notify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.mzg;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated(message = "use com.xiaomi.fitness.baseui.dialog.PickerDialog instead")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010!B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\"J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/notify/NumberUnitPicker;", "Landroid/widget/LinearLayout;", "", "unit", "", "setUnit", "(Ljava/lang/String;)V", "", StatConstants.PARAM_START, StatConstants.PARAM_END, "setNumberRange", "(II)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lmzg;", "mViewBinding", "Lmzg;", "value", "getCurrentValue", "()I", "setCurrentValue", "(I)V", "currentValue", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NumberUnitPicker extends LinearLayout {

    @NotNull
    private final mzg mViewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberUnitPicker(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mViewBinding = mzg.A0(LayoutInflater.from(context), this);
        setGravity(17);
        setOrientation(0);
        setMinimumHeight((int) TypedValue.applyDimension(1, 200.0f, getResources().getDisplayMetrics()));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public final int getCurrentValue() {
        return this.mViewBinding.A.getValue();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        return this.mViewBinding.A.onTouchEvent(event);
    }

    public final void setCurrentValue(int i) {
        this.mViewBinding.A.setValue(i);
    }

    public final void setNumberRange(int start, int end) {
        this.mViewBinding.A.setMinValue(start);
        this.mViewBinding.A.setMaxValue(end);
    }

    public final void setUnit(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.mViewBinding.B.setText(unit);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberUnitPicker(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberUnitPicker(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
