package com.xiaomi.fitness.relative.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.base.RelativeScrollTitleBar;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\tJ\b\u0010$\u001a\u00020\u0015H\u0014J\u0006\u0010%\u001a\u00020\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/relative/base/RelativeScrollTitleBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollLimit", "", "mNestedScrollView", "Landroidx/core/widget/NestedScrollView;", "mCollapseTitleTV", "Landroid/widget/TextView;", "mCollapseFuncMoreBtn", "Landroid/widget/ImageView;", "mCollapseBackBtn", "onFuncMoreClickListener", "Landroid/view/View$OnClickListener;", "onFuncBackClickListener", "setOnFuncMoreClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFuncBackClickListener", "bindScrollView", "scrollView", "setCollapseBackground", "drawable", "Landroid/graphics/drawable/Drawable;", "colorRes", "setTitle", "str", "", "resid", "setImage", "resourceId", "onFinishInflate", "hideMoreBtn", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeScrollTitleBar extends FrameLayout {
    public static final int STATE_COLLAPSE = 0;
    public static final int STATE_EXPAND = 1;

    @NotNull
    private ImageView mCollapseBackBtn;

    @NotNull
    private ImageView mCollapseFuncMoreBtn;

    @NotNull
    private TextView mCollapseTitleTV;
    private NestedScrollView mNestedScrollView;

    @Nullable
    private View.OnClickListener onFuncBackClickListener;

    @Nullable
    private View.OnClickListener onFuncMoreClickListener;
    private final int scrollLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScrollTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollLimit = 30;
        View viewInflate = LayoutInflater.from(context).inflate(jui.q8, this);
        this.mCollapseTitleTV = (TextView) viewInflate.findViewById(eri.pj);
        this.mCollapseFuncMoreBtn = (ImageView) viewInflate.findViewById(eri.nj);
        this.mCollapseBackBtn = (ImageView) viewInflate.findViewById(eri.mj);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.H4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(n4j.J4);
        typedArrayObtainStyledAttributes.getString(n4j.I4);
        if (string == null || string.length() == 0) {
            this.mCollapseTitleTV.setText("");
        } else {
            this.mCollapseTitleTV.setText(string);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mCollapseFuncMoreBtn.setOnClickListener(new View.OnClickListener() { // from class: kik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeScrollTitleBar._init_$lambda$1(this.f23890a, view);
            }
        });
        this.mCollapseBackBtn.setOnClickListener(new View.OnClickListener() { // from class: lik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeScrollTitleBar._init_$lambda$2(this.f25104a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(RelativeScrollTitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.onFuncMoreClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(RelativeScrollTitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.onFuncBackClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindScrollView$lambda$0(RelativeScrollTitleBar this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i2 < this$0.scrollLimit) {
            ViewExtKt.invisible(this$0);
        } else {
            ViewExtKt.visible(this$0);
        }
    }

    public final void bindScrollView(@NotNull NestedScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        this.mNestedScrollView = scrollView;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNestedScrollView");
            scrollView = null;
        }
        scrollView.setOnScrollChangeListener(new NestedScrollView.d() { // from class: jik
            @Override // androidx.core.widget.NestedScrollView.d
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                RelativeScrollTitleBar.bindScrollView$lambda$0(this.f22842a, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    public final void hideMoreBtn() {
        this.mCollapseFuncMoreBtn.setVisibility(4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public final void setCollapseBackground(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        setBackground(drawable);
    }

    @NotNull
    public final RelativeScrollTitleBar setImage(int resourceId) {
        this.mCollapseFuncMoreBtn.setBackgroundResource(resourceId);
        return this;
    }

    public final void setOnFuncBackClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFuncBackClickListener = listener;
    }

    public final void setOnFuncMoreClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFuncMoreClickListener = listener;
    }

    @NotNull
    public final RelativeScrollTitleBar setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        this.mCollapseTitleTV.setText(str);
        return this;
    }

    public final void setCollapseBackground(int colorRes) {
        setBackgroundColor(ViewExtKt.getColor(this, colorRes));
    }

    @NotNull
    public final RelativeScrollTitleBar setTitle(int resid) {
        this.mCollapseTitleTV.setText(resid);
        return this;
    }
}
