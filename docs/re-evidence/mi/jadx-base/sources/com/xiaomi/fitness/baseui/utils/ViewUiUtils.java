package com.xiaomi.fitness.baseui.utils;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.snackbar.Snackbar;
import com.xiaomi.fitness.baseui.utils.ViewUiUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.gki;
import defpackage.iqi;
import defpackage.loi;
import defpackage.ni4;
import defpackage.o7h;
import defpackage.rbd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÞ\u0001\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u001b\b\u0002\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u0005*\u00020\u00062\u0006\u0010 \u001a\u00020\tH\u0002J^\u0010!\u001a\u00020\u0005*\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062:\b\u0002\u0010%\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0013\u0012\u00110*¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u0005\u0018\u00010&J^\u0010!\u001a\u00020\u0005*\u00020,2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062:\b\u0002\u0010%\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0013\u0012\u00110*¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u0005\u0018\u00010&¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/ViewUiUtils;", "", "<init>", "()V", "showSnackbarToast", "", "Landroid/view/View;", "message", "duration", "", "iconRes", "extraIconHeight", "textSizeSp", "", "minTextSizeSp", "maxTextSizeSp", "maxLines", "backgroundRes", "maxTextWidthPx", "bottomMarginPx", "textHorzPadding", "textVertPadding", "minusVertPx", "textColorRes", "iconPadding", "anchorView", "onConfigure", "Lkotlin/Function1;", "Lcom/google/android/material/snackbar/Snackbar;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Ljava/lang/Object;ILjava/lang/Integer;IFIIILjava/lang/Integer;IIIIILjava/lang/Integer;ILandroid/view/View;Lkotlin/jvm/functions/Function1;)V", "reLayout", "bottomMargin", "fitFullScreen", "Landroidx/fragment/app/Fragment;", "actionBarView", "navigationBarView", "customHandler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "view", "Landroidx/core/view/WindowInsetsCompat;", "insets", "Landroid/app/Activity;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewUiUtils.kt\ncom/xiaomi/fitness/baseui/utils/ViewUiUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,297:1\n1#2:298\n65#3,4:299\n37#3:303\n53#3:304\n72#3:305\n*S KotlinDebug\n*F\n+ 1 ViewUiUtils.kt\ncom/xiaomi/fitness/baseui/utils/ViewUiUtils\n*L\n110#1:299,4\n110#1:303\n110#1:304\n110#1:305\n*E\n"})
public final class ViewUiUtils {

    @NotNull
    public static final ViewUiUtils INSTANCE = new ViewUiUtils();

    private ViewUiUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fitFullScreen$default(ViewUiUtils viewUiUtils, Fragment fragment, View view, View view2, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            view2 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        viewUiUtils.fitFullScreen(fragment, view, view2, (Function2<? super View, ? super WindowInsetsCompat, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat fitFullScreen$lambda$14$lambda$13(Function2 function2, View view, View view2, View view3, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view3, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (function2 != null) {
            function2.invoke(view3, insets);
        }
        if (function2 == null) {
            rbd rbdVarF = insets.f(WindowInsetsCompat.m.c());
            Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
            rbd rbdVarF2 = insets.f(WindowInsetsCompat.m.f());
            Intrinsics.checkNotNullExpressionValue(rbdVarF2, "getInsets(...)");
            int iMax = Math.max(rbdVarF.d, rbdVarF2.d);
            rbd rbdVarF3 = insets.f(WindowInsetsCompat.m.g());
            Intrinsics.checkNotNullExpressionValue(rbdVarF3, "getInsets(...)");
            int i = rbdVarF3.f32379b;
            if (view != null) {
                view.setPaddingRelative(0, i, 0, 0);
            }
            if (view2 != null) {
                view2.setPaddingRelative(0, 0, 0, iMax);
            }
        }
        return WindowInsetsCompat.f2098b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat fitFullScreen$lambda$16(Function2 function2, View view, View view2, View view3, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view3, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (function2 != null) {
            function2.invoke(view3, insets);
        }
        if (function2 == null) {
            rbd rbdVarF = insets.f(WindowInsetsCompat.m.c());
            Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
            rbd rbdVarF2 = insets.f(WindowInsetsCompat.m.f());
            Intrinsics.checkNotNullExpressionValue(rbdVarF2, "getInsets(...)");
            int iMax = Math.max(rbdVarF.d, rbdVarF2.d);
            rbd rbdVarF3 = insets.f(WindowInsetsCompat.m.g());
            Intrinsics.checkNotNullExpressionValue(rbdVarF3, "getInsets(...)");
            int i = rbdVarF3.f32379b;
            if (view != null) {
                view.setPaddingRelative(0, i, 0, 0);
            }
            if (view2 != null) {
                view2.setPaddingRelative(0, 0, 0, iMax);
            }
        }
        return WindowInsetsCompat.f2098b;
    }

    private final void reLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof CoordinatorLayout.e) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams2;
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.c = 81;
            eVar.setMargins(0, 0, 0, i);
            layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.gravity = 81;
            layoutParams3.setMargins(0, 0, 0, i);
            layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams4.width = -2;
            layoutParams4.height = -2;
            layoutParams4.gravity = 81;
            layoutParams4.setMargins(0, 0, 0, i);
            layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams2);
            marginLayoutParams.width = -2;
            marginLayoutParams.height = -2;
            marginLayoutParams.setMargins(0, 0, 0, i);
            layoutParams = marginLayoutParams;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSnackbarToast$default(ViewUiUtils viewUiUtils, View view, Object obj, int i, Integer num, int i2, float f, int i3, int i4, int i5, Integer num2, int i6, int i7, int i8, int i9, int i10, Integer num3, int i11, View view2, Function1 function1, int i12, Object obj2) {
        viewUiUtils.showSnackbarToast(view, obj, (i12 & 2) != 0 ? 3000 : i, (i12 & 4) != 0 ? Integer.valueOf(loi.i) : num, (i12 & 8) != 0 ? ExtUtilsKt.getDp(5) : i2, (i12 & 16) != 0 ? 14.0f : f, (i12 & 32) != 0 ? 8 : i3, (i12 & 64) != 0 ? 14 : i4, (i12 & 128) != 0 ? 2 : i5, (i12 & 256) != 0 ? Integer.valueOf(loi.p) : num2, (i12 & 512) != 0 ? (view.getResources().getDisplayMetrics().widthPixels * 2) / 3 : i6, (i12 & 1024) != 0 ? view.getResources().getDisplayMetrics().heightPixels / 8 : i7, (i12 & 2048) != 0 ? ExtUtilsKt.getDp(12) : i8, (i12 & 4096) != 0 ? ExtUtilsKt.getDp(4) : i9, (i12 & 8192) != 0 ? ExtUtilsKt.getDp(2) : i10, (i12 & 16384) != 0 ? Integer.valueOf(gki.p) : num3, (32768 & i12) != 0 ? ExtUtilsKt.getDp(6) : i11, (65536 & i12) != 0 ? null : view2, (i12 & 131072) != 0 ? null : function1);
    }

    public final void fitFullScreen(@NotNull Fragment fragment, @Nullable final View view, @Nullable final View view2, @Nullable final Function2<? super View, ? super WindowInsetsCompat, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                activity.getWindow().setDecorFitsSystemWindows(false);
            } else {
                Window window = activity.getWindow();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                window.getDecorView().setSystemUiVisibility(1280);
            }
            c.H0(activity.getWindow().getDecorView(), new o7h() { // from class: sxq
                @Override // defpackage.o7h
                public final WindowInsetsCompat a(View view3, WindowInsetsCompat windowInsetsCompat) {
                    return ViewUiUtils.fitFullScreen$lambda$14$lambda$13(function2, view, view2, view3, windowInsetsCompat);
                }
            });
        }
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, 0, null, 0, 0.0f, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262142, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fitFullScreen$default(ViewUiUtils viewUiUtils, Activity activity, View view, View view2, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            view2 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        viewUiUtils.fitFullScreen(activity, view, view2, (Function2<? super View, ? super WindowInsetsCompat, Unit>) function2);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, null, 0, 0.0f, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262140, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, 0, 0.0f, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262136, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, 0.0f, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262128, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262112, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262080, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, 0, null, 0, 0, 0, 0, 0, null, 0, null, null, 262016, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, null, 0, 0, 0, 0, 0, null, 0, null, null, 261888, null);
    }

    public final void fitFullScreen(@NotNull Activity activity, @Nullable final View view, @Nullable final View view2, @Nullable final Function2<? super View, ? super WindowInsetsCompat, Unit> function2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            activity.getWindow().setDecorFitsSystemWindows(false);
        } else {
            Window window = activity.getWindow();
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        c.H0(activity.getWindow().getDecorView(), new o7h() { // from class: txq
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view3, WindowInsetsCompat windowInsetsCompat) {
                return ViewUiUtils.fitFullScreen$lambda$16(function2, view, view2, view3, windowInsetsCompat);
            }
        });
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, 0, 0, 0, 0, 0, null, 0, null, null, 261632, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, 0, 0, 0, 0, null, 0, null, null, 261120, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, 0, 0, 0, null, 0, null, null, 260096, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, i8, 0, 0, null, 0, null, null, 258048, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, i8, i9, 0, null, 0, null, null, 253952, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, i8, i9, i10, null, 0, null, null, 245760, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8, int i9, int i10, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, i8, i9, i10, num3, 0, null, null, 229376, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8, int i9, int i10, @Nullable Integer num3, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, i8, i9, i10, num3, i11, null, null, 196608, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8, int i9, int i10, @Nullable Integer num3, int i11, @Nullable View view2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        showSnackbarToast$default(this, view, message, i, num, i2, f, i3, i4, i5, num2, i6, i7, i8, i9, i10, num3, i11, view2, null, 131072, null);
    }

    @JvmOverloads
    public final void showSnackbarToast(@NotNull View view, @NotNull Object message, int i, @Nullable Integer num, int i2, float f, int i3, int i4, int i5, @Nullable Integer num2, int i6, int i7, int i8, int i9, int i10, @Nullable Integer num3, int i11, @Nullable View view2, @Nullable Function1<? super Snackbar, Unit> function1) {
        CharSequence string;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof Integer) {
            string = view.getContext().getText(((Number) message).intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getText(...)");
        } else {
            string = message instanceof CharSequence ? (CharSequence) message : message.toString();
        }
        Snackbar snackbarF0 = Snackbar.f0(view, string, i);
        if (view2 != null) {
            snackbarF0.O(view2);
        }
        if (function1 != null) {
            Intrinsics.checkNotNull(snackbarF0);
            function1.invoke2(snackbarF0);
        }
        Intrinsics.checkNotNullExpressionValue(snackbarF0, "apply(...)");
        View viewC = snackbarF0.C();
        ViewUiUtils viewUiUtils = INSTANCE;
        Intrinsics.checkNotNull(viewC);
        viewUiUtils.reLayout(viewC, i7);
        viewC.setPaddingRelative(0, 0, 0, 0);
        if (num2 != null) {
            viewC.setBackground(ni4.e(viewC.getContext(), num2.intValue()));
        }
        c.z0(viewC, ExtUtilsKt.getDpFloat(Float.valueOf(100.0f)));
        Intrinsics.checkNotNullExpressionValue(viewC, "apply(...)");
        TextView textView = (TextView) viewC.findViewById(iqi.Y);
        textView.setMaxWidth(i6);
        int i12 = i9 + i10;
        textView.setPaddingRelative(i8, i12, i8, i12);
        textView.setGravity(16);
        textView.setTextSize(f);
        if (num3 != null) {
            textView.setTextColor(ni4.c(view.getContext(), num3.intValue()));
        }
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, 1, 2);
        textView.setMaxLines(i5);
        if (num != null) {
            Drawable drawableE = ni4.e(view.getContext(), num.intValue());
            if (drawableE != null) {
                int lineHeight = textView.getLineHeight() + i2;
                drawableE.setBounds(0, 0, (drawableE.getIntrinsicWidth() * lineHeight) / drawableE.getIntrinsicHeight(), lineHeight);
                textView.setCompoundDrawablesRelative(drawableE, null, null, null);
            }
        }
        textView.setCompoundDrawablePadding(i11);
        snackbarF0.T();
    }
}
