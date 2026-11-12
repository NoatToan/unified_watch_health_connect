package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.widget.ScrollTitleBar;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.gsi;
import defpackage.mvi;
import defpackage.v84;
import defpackage.z4j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010\u001f\u001a\u00020\u0013H\u0014J\u0006\u0010 \u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/ScrollTitleBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollLimit", "", "mNestedScrollView", "Landroidx/core/widget/NestedScrollView;", "mCollapseTitleTV", "Landroid/widget/TextView;", "mCollapseFuncMoreBtn", "Landroid/widget/ImageView;", "onFuncMoreClickListener", "Landroid/view/View$OnClickListener;", "setOnFuncMoreClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindScrollView", "scrollView", "setCollapseBackground", "drawable", "Landroid/graphics/drawable/Drawable;", "colorRes", "setTitle", "str", "", "resid", "onFinishInflate", "hideMoreBtn", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollTitleBar extends FrameLayout {
    public static final int STATE_COLLAPSE = 0;
    public static final int STATE_EXPAND = 1;

    @NotNull
    private ImageView mCollapseFuncMoreBtn;

    @NotNull
    private TextView mCollapseTitleTV;
    private NestedScrollView mNestedScrollView;

    @Nullable
    private View.OnClickListener onFuncMoreClickListener;
    private final int scrollLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollLimit = 30;
        View viewInflate = LayoutInflater.from(context).inflate(mvi.y, this);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(gsi.c);
        this.mCollapseTitleTV = (TextView) viewInflate.findViewById(gsi.d0);
        this.mCollapseFuncMoreBtn = (ImageView) viewInflate.findViewById(gsi.c0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.W4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(z4j.Y4);
        typedArrayObtainStyledAttributes.getString(z4j.X4);
        if (string == null || string.length() == 0) {
            this.mCollapseTitleTV.setText("");
        } else {
            this.mCollapseTitleTV.setText(string);
        }
        typedArrayObtainStyledAttributes.recycle();
        int statusBarHeight = UIUtils.INSTANCE.getStatusBarHeight(context);
        Logger.i("ScrollTitleBar", "statusBarHeight = " + statusBarHeight);
        v84.i(constraintLayout, 0, statusBarHeight, 0, 0);
        this.mCollapseFuncMoreBtn.setOnClickListener(new View.OnClickListener() { // from class: yhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScrollTitleBar._init_$lambda$1(this.f40189a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ScrollTitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.onFuncMoreClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindScrollView$lambda$0(ScrollTitleBar this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
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
        scrollView.setOnScrollChangeListener(new NestedScrollView.d() { // from class: xhl
            @Override // androidx.core.widget.NestedScrollView.d
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                ScrollTitleBar.bindScrollView$lambda$0(this.f39139a, nestedScrollView, i, i2, i3, i4);
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

    public final void setOnFuncMoreClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFuncMoreClickListener = listener;
    }

    @NotNull
    public final ScrollTitleBar setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        this.mCollapseTitleTV.setText(str);
        return this;
    }

    public final void setCollapseBackground(int colorRes) {
        setBackgroundColor(ViewExtKt.getColor(this, colorRes));
    }

    @NotNull
    public final ScrollTitleBar setTitle(int resid) {
        this.mCollapseTitleTV.setText(resid);
        return this;
    }
}
