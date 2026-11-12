package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.csi;
import defpackage.jvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/SummaryDataItemLayout;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getCtx", "()Landroid/content/Context;", "labelText", "Landroid/widget/TextView;", "valueText", "unitText", "initView", "", "update", "label", "", "value", "unit", "setValueMarginTop", "topMargin", "", "setLabelTextSize", MediaStoreUtil.MediaInfo.SIZE, "setUnitTextColor", "colorRes", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SummaryDataItemLayout extends FrameLayout {

    @NotNull
    private static final String TAG = "SummaryDataItemLayout";

    @NotNull
    private final Context ctx;
    private TextView labelText;
    private TextView unitText;
    private TextView valueText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryDataItemLayout(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        initView();
    }

    private final void initView() {
        LayoutInflater.from(getContext()).inflate(jvi.R, this);
        this.labelText = (TextView) findViewById(csi.G0);
        this.valueText = (TextView) findViewById(csi.b5);
        this.unitText = (TextView) findViewById(csi.W4);
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    public final void setLabelTextSize(int size) {
        TextView textView = this.labelText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelText");
            textView = null;
        }
        textView.setTextSize(size);
    }

    public final void setUnitTextColor(int colorRes) {
        TextView textView = this.unitText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
            textView = null;
        }
        textView.setTextColor(ExtUtilsKt.getColor(colorRes));
    }

    public final void setValueMarginTop(int topMargin) {
        ViewGroup.LayoutParams layoutParams;
        TextView textView = this.valueText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            textView = null;
        }
        if (textView.getLayoutParams() == null) {
            layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        } else {
            TextView textView3 = this.valueText;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueText");
                textView3 = null;
            }
            layoutParams = textView3.getLayoutParams();
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Logger.i(TAG, "can not set marginTop!!");
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ExtUtilsKt.getDp(Integer.valueOf(topMargin));
        TextView textView4 = this.valueText;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
        } else {
            textView2 = textView4;
        }
        textView2.setLayoutParams(layoutParams);
    }

    public final void update(@Nullable String label, @Nullable String value, @Nullable String unit) {
        TextView textView = this.labelText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelText");
            textView = null;
        }
        textView.setText(label);
        TextView textView3 = this.valueText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            textView3 = null;
        }
        textView3.setText(value);
        TextView textView4 = this.unitText;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
        } else {
            textView2 = textView4;
        }
        textView2.setText(unit);
    }
}
