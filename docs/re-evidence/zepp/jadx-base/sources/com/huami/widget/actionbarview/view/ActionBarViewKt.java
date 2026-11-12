package com.huami.widget.actionbarview.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.systembartint.SystemBarTintManager;
import com.huami.watch.notification.TransportUri;
import com.huami.widget.actionbarview.R;
import com.huami.widget.actionbarview.extension.DrawableExtensionFunKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001a:\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001a:\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aS\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000eH\u0007\u001a(\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007\u001aD\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001a(\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001a\"\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u0001\u001a\"\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0003\u0010\u001d\u001a\u00020\u00012\b\b\u0003\u0010\u001e\u001a\u00020\u0001\u001a*\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00172\b\b\u0003\u0010#\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001\u001a\"\u0010'\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0003\u0010\u001d\u001a\u00020\u00012\b\b\u0003\u0010\u001e\u001a\u00020\u0001\u001a(\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001a&\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010)\u001a\u00020\u00012\b\b\u0001\u0010*\u001a\u00020\u0001H\u0002¨\u0006-"}, d2 = {"Lcom/huami/widget/actionbarview/view/ActionBarView;", "", "height", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lkotlin/Function0;", "", "onViewClick", "addStartView", "addCenterView", "addEndView", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "addCustomView", "Landroid/app/Activity;", "activity", "statusBarColor", "", "isStatusTextLight", "setSystemStatus", "", "title", "addTitleView", "addBackImageButton", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "src", "tint", "Landroid/widget/ImageButton;", "getImageButton", "getActionBarBackImageButton", "text", "textColor", "textSize", "Landroid/widget/TextView;", "getActionBarTitleView", "getActionBarAddImageButton", "addMenuImageButton", "drawableResId", "color", "Landroid/graphics/drawable/Drawable;", "a", "action-bar-view_release"}, k = 2, mv = {1, 4, 0})
public final class ActionBarViewKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "a", "(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function1<ConstraintLayout.LayoutParams, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
            a(layoutParams);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "com/huami/widget/actionbarview/view/ActionBarViewKt$addCustomView$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b implements View.OnClickListener {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Function1 d;

        public b(Function0 function0, int i, int i2, Function1 function1) {
            this.a = function0;
            this.b = i;
            this.c = i2;
            this.d = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Function0 function0 = this.a;
            if (function0 != null) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "a", "(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function1<ConstraintLayout.LayoutParams, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.endToEnd = 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
            a(layoutParams);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "a", "(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function1<ConstraintLayout.LayoutParams, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.startToStart = 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
            a(layoutParams);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "a", "(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function1<ConstraintLayout.LayoutParams, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
            a(layoutParams);
            return Unit.INSTANCE;
        }
    }

    private static final Drawable a(Context context, @DrawableRes int i, @ColorInt int i2) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable != null) {
            return DrawableExtensionFunKt.tintDrawable(drawable, i2);
        }
        return null;
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addBackImageButton(@NotNull ActionBarView actionBarView) {
        return addBackImageButton$default(actionBarView, null, null, 3, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addBackImageButton(@NotNull ActionBarView actionBarView, @NotNull View view) {
        return addBackImageButton$default(actionBarView, view, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addBackImageButton(@NotNull ActionBarView actionBarView, @NotNull View view, @Nullable Function0<Unit> function0) {
        return addStartView(actionBarView, -1, (int) actionBarView.getResources().getDimension(R.dimen.action_bar_width), view, function0);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addBackImageButton$default(ActionBarView actionBarView, View view, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            view = getActionBarBackImageButton$default(actionBarView.getContext(), 0, 0, 6, null);
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return addBackImageButton(actionBarView, view, function0);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCenterView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view) {
        return addCenterView$default(actionBarView, i, i2, view, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCenterView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view, @Nullable Function0<Unit> function0) {
        return addCustomView(actionBarView, i, i2, view, function0, a.a);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCenterView(@NotNull ActionBarView actionBarView, int i, @NotNull View view) {
        return addCenterView$default(actionBarView, i, 0, view, null, 10, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCenterView(@NotNull ActionBarView actionBarView, @NotNull View view) {
        return addCenterView$default(actionBarView, 0, 0, view, null, 11, null);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addCenterView$default(ActionBarView actionBarView, int i, int i2, View view, Function0 function0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -2;
        }
        if ((i3 & 2) != 0) {
            i2 = -2;
        }
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        return addCenterView(actionBarView, i, i2, view, function0);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCustomView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view, @Nullable Function0<Unit> function0, @NotNull Function1<? super ConstraintLayout.LayoutParams, Unit> function1) {
        actionBarView.addView(view);
        view.setOnClickListener(new b(function0, i, i2, function1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = i2;
        function1.invoke(layoutParams2);
        return actionBarView;
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCustomView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view, @NotNull Function1<? super ConstraintLayout.LayoutParams, Unit> function1) {
        return addCustomView$default(actionBarView, i, i2, view, null, function1, 8, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCustomView(@NotNull ActionBarView actionBarView, int i, @NotNull View view, @NotNull Function1<? super ConstraintLayout.LayoutParams, Unit> function1) {
        return addCustomView$default(actionBarView, i, 0, view, null, function1, 10, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addCustomView(@NotNull ActionBarView actionBarView, @NotNull View view, @NotNull Function1<? super ConstraintLayout.LayoutParams, Unit> function1) {
        return addCustomView$default(actionBarView, 0, 0, view, null, function1, 11, null);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addCustomView$default(ActionBarView actionBarView, int i, int i2, View view, Function0 function0, Function1 function1, int i3, Object obj) {
        int i4 = (i3 & 1) != 0 ? -2 : i;
        int i5 = (i3 & 2) != 0 ? -2 : i2;
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        return addCustomView(actionBarView, i4, i5, view, function0, function1);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addEndView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view) {
        return addEndView$default(actionBarView, i, i2, view, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addEndView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view, @Nullable Function0<Unit> function0) {
        return addCustomView(actionBarView, i, i2, view, function0, c.a);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addEndView(@NotNull ActionBarView actionBarView, int i, @NotNull View view) {
        return addEndView$default(actionBarView, i, 0, view, null, 10, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addEndView(@NotNull ActionBarView actionBarView, @NotNull View view) {
        return addEndView$default(actionBarView, 0, 0, view, null, 11, null);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addEndView$default(ActionBarView actionBarView, int i, int i2, View view, Function0 function0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -2;
        }
        if ((i3 & 2) != 0) {
            i2 = -2;
        }
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        return addEndView(actionBarView, i, i2, view, function0);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addMenuImageButton(@NotNull ActionBarView actionBarView) {
        return addMenuImageButton$default(actionBarView, null, null, 3, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addMenuImageButton(@NotNull ActionBarView actionBarView, @NotNull View view) {
        return addMenuImageButton$default(actionBarView, view, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addMenuImageButton(@NotNull ActionBarView actionBarView, @NotNull View view, @Nullable Function0<Unit> function0) {
        return addEndView(actionBarView, -1, (int) actionBarView.getResources().getDimension(R.dimen.action_bar_width), view, function0);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addMenuImageButton$default(ActionBarView actionBarView, View view, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            view = getActionBarAddImageButton$default(actionBarView.getContext(), 0, 0, 6, null);
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return addMenuImageButton(actionBarView, view, function0);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addStartView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view) {
        return addStartView$default(actionBarView, i, i2, view, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addStartView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull View view, @Nullable Function0<Unit> function0) {
        return addCustomView(actionBarView, i, i2, view, function0, d.a);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addStartView(@NotNull ActionBarView actionBarView, int i, @NotNull View view) {
        return addStartView$default(actionBarView, i, 0, view, null, 10, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addStartView(@NotNull ActionBarView actionBarView, @NotNull View view) {
        return addStartView$default(actionBarView, 0, 0, view, null, 11, null);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addStartView$default(ActionBarView actionBarView, int i, int i2, View view, Function0 function0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -2;
        }
        if ((i3 & 2) != 0) {
            i2 = -2;
        }
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        return addStartView(actionBarView, i, i2, view, function0);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addTitleView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull String str) {
        return addTitleView$default(actionBarView, i, i2, str, null, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addTitleView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull String str, @NotNull View view) {
        return addTitleView$default(actionBarView, i, i2, str, view, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addTitleView(@NotNull ActionBarView actionBarView, int i, int i2, @NotNull String str, @NotNull View view, @Nullable Function0<Unit> function0) {
        return addCustomView(actionBarView, i, i2, view, function0, e.a);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addTitleView(@NotNull ActionBarView actionBarView, int i, @NotNull String str) {
        return addTitleView$default(actionBarView, i, 0, str, null, null, 26, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView addTitleView(@NotNull ActionBarView actionBarView, @NotNull String str) {
        return addTitleView$default(actionBarView, 0, 0, str, null, null, 27, null);
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView addTitleView$default(ActionBarView actionBarView, int i, int i2, String str, View view, Function0 function0, int i3, Object obj) {
        return addTitleView(actionBarView, (i3 & 1) != 0 ? -2 : i, (i3 & 2) != 0 ? -2 : i2, str, (i3 & 8) != 0 ? getActionBarTitleView$default(actionBarView.getContext(), str, 0, 0, 12, null) : view, (i3 & 16) != 0 ? null : function0);
    }

    @NotNull
    public static final ImageButton getActionBarAddImageButton(@NotNull Context context, @DrawableRes int i, @ColorRes int i2) {
        return getImageButton(context, i, i2);
    }

    @NotNull
    public static /* synthetic */ ImageButton getActionBarAddImageButton$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = R.drawable.action_bar_add;
        }
        if ((i3 & 4) != 0) {
            i2 = R.color.action_bar_view_grey;
        }
        return getActionBarAddImageButton(context, i, i2);
    }

    @NotNull
    public static final ImageButton getActionBarBackImageButton(@NotNull Context context, @DrawableRes int i, @ColorRes int i2) {
        return getImageButton(context, i, i2);
    }

    @NotNull
    public static /* synthetic */ ImageButton getActionBarBackImageButton$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = R.drawable.action_bar_arrow;
        }
        if ((i3 & 4) != 0) {
            i2 = R.color.action_bar_view_grey;
        }
        return getActionBarBackImageButton(context, i, i2);
    }

    @NotNull
    public static final TextView getActionBarTitleView(@NotNull Context context, @NotNull String str, @ColorRes int i, @DimenRes int i2) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextColor(ContextCompat.getColor(context, i));
        textView.setTextSize(0, textView.getResources().getDimension(i2));
        return textView;
    }

    @NotNull
    public static /* synthetic */ TextView getActionBarTitleView$default(Context context, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = R.color.action_bar_view_grey;
        }
        if ((i3 & 8) != 0) {
            i2 = R.dimen.t4;
        }
        return getActionBarTitleView(context, str, i, i2);
    }

    @NotNull
    public static final ImageButton getImageButton(@NotNull Context context, @DrawableRes int i, @ColorRes int i2) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setImageDrawable(a(imageButton.getContext(), i, ContextCompat.getColor(context, i2)));
        imageButton.setBackgroundResource(R.drawable.clickable_item_background);
        return imageButton;
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView setSystemStatus(@NotNull ActionBarView actionBarView, @NotNull Activity activity) {
        return setSystemStatus$default(actionBarView, activity, 0, false, 6, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView setSystemStatus(@NotNull ActionBarView actionBarView, @NotNull Activity activity, @ColorRes int i) {
        return setSystemStatus$default(actionBarView, activity, i, false, 4, null);
    }

    @JvmOverloads
    @NotNull
    public static final ActionBarView setSystemStatus(@NotNull ActionBarView actionBarView, @NotNull Activity activity, @ColorRes int i, boolean z) {
        SystemBarTintManager systemBarTintManager = new SystemBarTintManager(activity);
        SystemBarTintManager.enableTransparentStatusBar(activity);
        SystemBarTintManager.changeStatusBarMode(activity, !z);
        systemBarTintManager.setStatusBarTintColor(ContextCompat.getColor(activity, i));
        systemBarTintManager.setStatusBarVisibility(true);
        ViewGroup.LayoutParams layoutParams = actionBarView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = new SystemBarTintManager(activity).getConfig().getStatusBarHeight();
        return actionBarView;
    }

    @JvmOverloads
    @NotNull
    public static /* synthetic */ ActionBarView setSystemStatus$default(ActionBarView actionBarView, Activity activity, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.color.action_bar_view_pale_grey;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return setSystemStatus(actionBarView, activity, i, z);
    }
}
