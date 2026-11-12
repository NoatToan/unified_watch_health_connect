package com.xiaomi.fitness.homepage.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.xiaomi.fitness.baseui.widget.ScrollTitleBar;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.homepage.view.HealthTitleView;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u000fH\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/HealthTitleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollTitleBar", "Lcom/xiaomi/fitness/baseui/widget/ScrollTitleBar;", "mSetCommonHeaderFlag", "", "mSelectModeListener", "Lkotlin/Function1;", "", "", "onFinishInflate", "initListener", "onFuncMoreClick", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "getOnFuncMoreClick", "()Lkotlin/jvm/functions/Function1;", "setOnFuncMoreClick", "(Lkotlin/jvm/functions/Function1;)V", "bindData", "scrollView", "Landroidx/core/widget/NestedScrollView;", "title", "", "setGradientBg", "setBackground", "headerFlag", "onDetachedFromWindow", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthTitleView extends FrameLayout {

    @NotNull
    public static final String TAG = "HealthTitleView";

    @Nullable
    private Function1<? super Integer, Unit> mSelectModeListener;
    private boolean mSetCommonHeaderFlag;

    @Nullable
    private Function1<? super View, Unit> onFuncMoreClick;

    @Nullable
    private ScrollTitleBar scrollTitleBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jui.l4, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$2(HealthTitleView this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i2 < 30) {
            ViewExtKt.invisible(this$0);
        } else {
            ViewExtKt.visible(this$0);
        }
    }

    private final void initListener() {
        this.mSelectModeListener = new Function1() { // from class: h2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthTitleView.initListener$lambda$1(this.f19606a, ((Integer) obj).intValue());
            }
        };
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        Function1<? super Integer, Unit> function1 = this.mSelectModeListener;
        Intrinsics.checkNotNull(function1);
        checkerUserSettingManagerExtKt.addSelectModeListener(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$1(HealthTitleView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        boolean z = CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() == companion.getCONCISE_MODE();
        if (z != this$0.mSetCommonHeaderFlag) {
            this$0.mSetCommonHeaderFlag = z;
            this$0.setBackground(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFinishInflate$lambda$0(HealthTitleView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super View, Unit> function1 = this$0.onFuncMoreClick;
        if (function1 != null) {
            Intrinsics.checkNotNull(view);
            function1.invoke2(view);
        }
    }

    private final void setBackground(boolean headerFlag) {
        if (headerFlag) {
            setBackground(ViewExtKt.getDrawable(this, iji.K));
        } else {
            setGradientBg();
        }
    }

    private final void setGradientBg() {
        setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ViewExtKt.getColor(this, iji.z3), ViewExtKt.getColor(this, iji.z3)}));
    }

    public final void bindData(@NotNull NestedScrollView scrollView, @NotNull String title) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(title, "title");
        scrollView.setOnScrollChangeListener(new NestedScrollView.d() { // from class: i2c
            @Override // androidx.core.widget.NestedScrollView.d
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                HealthTitleView.bindData$lambda$2(this.f20696a, nestedScrollView, i, i2, i3, i4);
            }
        });
        ScrollTitleBar scrollTitleBar = this.scrollTitleBar;
        if (scrollTitleBar != null) {
            scrollTitleBar.setTitle(title);
        }
    }

    @Nullable
    public final Function1<View, Unit> getOnFuncMoreClick() {
        return this.onFuncMoreClick;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Function1<? super Integer, Unit> function1 = this.mSelectModeListener;
        if (function1 != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).removeSelectModeListener(function1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.scrollTitleBar = (ScrollTitleBar) findViewById(eri.ij);
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        boolean z = CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() == companion.getCONCISE_MODE();
        this.mSetCommonHeaderFlag = z;
        setBackground(z);
        initListener();
        ScrollTitleBar scrollTitleBar = this.scrollTitleBar;
        if (scrollTitleBar != null) {
            scrollTitleBar.setOnFuncMoreClickListener(new View.OnClickListener() { // from class: g2c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthTitleView.onFinishInflate$lambda$0(this.f18501a, view);
                }
            });
        }
    }

    public final void setOnFuncMoreClick(@Nullable Function1<? super View, Unit> function1) {
        this.onFuncMoreClick = function1;
    }
}
