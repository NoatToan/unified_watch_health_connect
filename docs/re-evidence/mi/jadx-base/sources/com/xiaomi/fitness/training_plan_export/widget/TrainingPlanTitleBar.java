package com.xiaomi.fitness.training_plan_export.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import defpackage.dsi;
import defpackage.kvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/widget/TrainingPlanTitleBar;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getAttrs", "()Landroid/util/AttributeSet;", "backImage", "Landroid/widget/ImageView;", "titleTV", "Landroid/widget/TextView;", "moreImage", "actionTV", "initView", "", "setTitle", "resId", "", "title", "", "hideMore", "hideBack", "setRightImageButtonRes", "setAction", "clickListener", "Landroid/view/View$OnClickListener;", "action", "setMoreClickListener", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingPlanTitleBar extends FrameLayout {

    @Nullable
    private TextView actionTV;

    @Nullable
    private final AttributeSet attrs;

    @Nullable
    private ImageView backImage;

    @NotNull
    private final Context ctx;

    @Nullable
    private ImageView moreImage;

    @Nullable
    private TextView titleTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainingPlanTitleBar(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.attrs = attributeSet;
        initView();
    }

    private final void initView() {
        LayoutInflater.from(this.ctx).inflate(kvi.f24340b, this);
        this.backImage = (ImageView) findViewById(dsi.c);
        this.titleTV = (TextView) findViewById(dsi.q);
        this.moreImage = (ImageView) findViewById(dsi.n);
        this.actionTV = (TextView) findViewById(dsi.f15891b);
        ImageView imageView = this.backImage;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ivp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingPlanTitleBar.initView$lambda$0(this.f22151a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TrainingPlanTitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.ctx;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAction$lambda$1(View.OnClickListener onClickListener, TrainingPlanTitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(this$0.actionTV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAction$lambda$2(View.OnClickListener onClickListener, TrainingPlanTitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(this$0.actionTV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMoreClickListener$lambda$4$lambda$3(View.OnClickListener listener, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onClick(view);
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final void hideBack() {
        ImageView imageView = this.backImage;
        if (imageView != null) {
            ViewExtKt.invisible(imageView);
        }
    }

    public final void hideMore() {
        ImageView imageView = this.moreImage;
        if (imageView != null) {
            ViewExtKt.gone(imageView);
        }
    }

    public final void setAction(int resId, @Nullable final View.OnClickListener clickListener) {
        hideMore();
        TextView textView = this.actionTV;
        if (textView != null) {
            textView.setText(getContext().getString(resId));
        }
        TextView textView2 = this.actionTV;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: kvp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingPlanTitleBar.setAction$lambda$1(clickListener, this, view);
                }
            });
        }
    }

    public final void setMoreClickListener(@Nullable final View.OnClickListener clickListener) {
        ImageView imageView;
        if (clickListener == null || (imageView = this.moreImage) == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingPlanTitleBar.setMoreClickListener$lambda$4$lambda$3(clickListener, view);
            }
        });
    }

    public final void setRightImageButtonRes(int resId) {
        ImageView imageView = this.moreImage;
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
    }

    public final void setTitle(int resId) {
        TextView textView = this.titleTV;
        if (textView != null) {
            textView.setText(this.ctx.getString(resId));
        }
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = this.titleTV;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public final void setAction(@NotNull String action, @Nullable final View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(action, "action");
        hideMore();
        TextView textView = this.actionTV;
        if (textView != null) {
            textView.setText(action);
        }
        TextView textView2 = this.actionTV;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: lvp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingPlanTitleBar.setAction$lambda$2(clickListener, this, view);
                }
            });
        }
    }
}
