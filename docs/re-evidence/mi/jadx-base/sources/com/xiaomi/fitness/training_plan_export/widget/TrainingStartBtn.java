package com.xiaomi.fitness.training_plan_export.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan_export.widget.TrainingStartBtn;
import defpackage.fki;
import defpackage.joi;
import defpackage.m1j;
import defpackage.yzh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/widget/TrainingStartBtn;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "notStartedImg", "Landroid/widget/ImageView;", "tipTV", "Landroid/widget/TextView;", "initView", "", "showStatus", "status", "", "onClickListener", "Landroid/view/View$OnClickListener;", "planId", "", "courseId", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingStartBtn extends FrameLayout {

    @NotNull
    private final Context ctx;

    @Nullable
    private ImageView notStartedImg;

    @Nullable
    private TextView tipTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainingStartBtn(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        initView();
    }

    private final void initView() {
        yzh yzhVarA0 = yzh.A0(LayoutInflater.from(this.ctx));
        Intrinsics.checkNotNullExpressionValue(yzhVarA0, "inflate(...)");
        this.notStartedImg = yzhVarA0.A;
        this.tipTV = yzhVarA0.B;
        View root = yzhVarA0.getRoot();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        addView(root, layoutParams);
        showStatus$default(this, 2, null, 0L, 0L, 12, null);
    }

    public static /* synthetic */ void showStatus$default(TrainingStartBtn trainingStartBtn, int i, View.OnClickListener onClickListener, long j, long j2, int i2, Object obj) {
        trainingStartBtn.showStatus(i, onClickListener, (i2 & 4) != 0 ? -1L : j, (i2 & 8) != 0 ? -1L : j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showStatus$lambda$1(View.OnClickListener onClickListener, TrainingStartBtn this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(this$0);
        }
    }

    public final void showStatus(int status, @Nullable final View.OnClickListener onClickListener, long planId, long courseId) {
        if (status == 1) {
            TextView textView = this.tipTV;
            if (textView != null) {
                textView.setText(this.ctx.getString(m1j.f));
            }
            setBackgroundResource(joi.f22978a);
            TextView textView2 = this.tipTV;
            if (textView2 != null) {
                textView2.setTextColor(ExtUtilsKt.getColor(fki.f17876a));
            }
            ImageView imageView = this.notStartedImg;
            if (imageView != null) {
                ViewExtKt.visible(imageView);
                return;
            }
            return;
        }
        if (status == 2) {
            setBackgroundResource(joi.i);
            ImageView imageView2 = this.notStartedImg;
            if (imageView2 != null) {
                ViewExtKt.gone(imageView2);
            }
            TextView textView3 = this.tipTV;
            if (textView3 != null) {
                textView3.setText(this.ctx.getString(m1j.g));
            }
            setOnClickListener(new View.OnClickListener() { // from class: cwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingStartBtn.showStatus$lambda$1(onClickListener, this, view);
                }
            });
            return;
        }
        if (status != 4) {
            return;
        }
        ImageView imageView3 = this.notStartedImg;
        if (imageView3 != null) {
            ViewExtKt.gone(imageView3);
        }
        setBackgroundResource(joi.f22978a);
        TextView textView4 = this.tipTV;
        if (textView4 != null) {
            textView4.setTextColor(ExtUtilsKt.getColor(fki.f17876a));
        }
        TextView textView5 = this.tipTV;
        if (textView5 != null) {
            textView5.setText(this.ctx.getString(m1j.d));
        }
    }
}
