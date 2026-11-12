package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import defpackage.jk7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J9\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJA\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010&\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010)\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R$\u0010*\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lcom/google/accompanist/systemuicontroller/AndroidSystemUiController;", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "Landroid/content/Context;", "Landroid/view/Window;", "a", "Landroidx/compose/ui/graphics/Color;", "color", "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "", "setStatusBarColor-ek8zF_U", "(JZLkotlin/jvm/functions/Function1;)V", "setStatusBarColor", "navigationBarContrastEnforced", "setNavigationBarColor-Iv8Zu3U", "(JZZLkotlin/jvm/functions/Function1;)V", "setNavigationBarColor", "Landroid/view/View;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "b", "Landroid/view/Window;", "window", "Landroidx/core/view/WindowInsetsControllerCompat;", "c", "Landroidx/core/view/WindowInsetsControllerCompat;", "windowInsetsController", "value", "isStatusBarVisible", "()Z", "setStatusBarVisible", "(Z)V", "isNavigationBarVisible", "setNavigationBarVisible", "getStatusBarDarkContentEnabled", "setStatusBarDarkContentEnabled", "statusBarDarkContentEnabled", "getNavigationBarDarkContentEnabled", "setNavigationBarDarkContentEnabled", "navigationBarDarkContentEnabled", "isNavigationBarContrastEnforced", "setNavigationBarContrastEnforced", "<init>", "(Landroid/view/View;)V", "systemuicontroller_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidSystemUiController implements SystemUiController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Window window;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WindowInsetsControllerCompat windowInsetsController;

    public AndroidSystemUiController(@NotNull View view) {
        this.view = view;
        this.window = a(view.getContext());
        this.windowInsetsController = ViewCompat.getWindowInsetsController(view);
    }

    private final Window a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean getNavigationBarDarkContentEnabled() {
        return this.windowInsetsController.isAppearanceLightNavigationBars();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean getStatusBarDarkContentEnabled() {
        return this.windowInsetsController.isAppearanceLightStatusBars();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public /* synthetic */ boolean getSystemBarsDarkContentEnabled() {
        return jk7.a(this);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isNavigationBarContrastEnforced() {
        if (Build.VERSION.SDK_INT >= 29) {
            Window window = this.window;
            if (window != null && window.isNavigationBarContrastEnforced()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isNavigationBarVisible() {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.view);
        return rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.Type.navigationBars());
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isStatusBarVisible() {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.view);
        return rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.Type.statusBars());
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public /* synthetic */ boolean isSystemBarsVisible() {
        return jk7.b(this);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* JADX INFO: renamed from: setNavigationBarColor-Iv8Zu3U, reason: not valid java name */
    public void mo3317setNavigationBarColorIv8Zu3U(long color, boolean darkIcons, boolean navigationBarContrastEnforced, @NotNull Function1<? super Color, Color> transformColorForLightContent) {
        setNavigationBarDarkContentEnabled(darkIcons);
        setNavigationBarContrastEnforced(navigationBarContrastEnforced);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && !this.windowInsetsController.isAppearanceLightNavigationBars()) {
            color = transformColorForLightContent.invoke(Color.m1202boximpl(color)).m1222unboximpl();
        }
        window.setNavigationBarColor(ColorKt.m1267toArgb8_81llA(color));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarContrastEnforced(boolean z) {
        Window window;
        if (Build.VERSION.SDK_INT < 29 || (window = this.window) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarDarkContentEnabled(boolean z) {
        this.windowInsetsController.setAppearanceLightNavigationBars(z);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarVisible(boolean z) {
        if (z) {
            this.windowInsetsController.show(WindowInsetsCompat.Type.navigationBars());
        } else {
            this.windowInsetsController.hide(WindowInsetsCompat.Type.navigationBars());
        }
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* JADX INFO: renamed from: setStatusBarColor-ek8zF_U, reason: not valid java name */
    public void mo3318setStatusBarColorek8zF_U(long color, boolean darkIcons, @NotNull Function1<? super Color, Color> transformColorForLightContent) {
        setStatusBarDarkContentEnabled(darkIcons);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && !this.windowInsetsController.isAppearanceLightStatusBars()) {
            color = transformColorForLightContent.invoke(Color.m1202boximpl(color)).m1222unboximpl();
        }
        window.setStatusBarColor(ColorKt.m1267toArgb8_81llA(color));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarDarkContentEnabled(boolean z) {
        this.windowInsetsController.setAppearanceLightStatusBars(z);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarVisible(boolean z) {
        if (z) {
            this.windowInsetsController.show(WindowInsetsCompat.Type.statusBars());
        } else {
            this.windowInsetsController.hide(WindowInsetsCompat.Type.statusBars());
        }
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* JADX INFO: renamed from: setSystemBarsColor-Iv8Zu3U, reason: not valid java name */
    public /* synthetic */ void mo3319setSystemBarsColorIv8Zu3U(long j, boolean z, boolean z2, Function1 function1) {
        jk7.c(this, j, z, z2, function1);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public /* synthetic */ void setSystemBarsDarkContentEnabled(boolean z) {
        jk7.d(this, z);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public /* synthetic */ void setSystemBarsVisible(boolean z) {
        jk7.e(this, z);
    }
}
