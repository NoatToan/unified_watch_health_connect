package com.google.accompanist.systemuicontroller;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.o1;
import androidx.core.view.s0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import java.util.WeakHashMap;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R$\u0010*\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R$\u0010-\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R$\u0010.\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/google/accompanist/systemuicontroller/AndroidSystemUiController;", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "<init>", "(Landroid/view/View;Landroid/view/Window;)V", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "", "setStatusBarColor-ek8zF_U", "(JZLe23/l;)V", "setStatusBarColor", "navigationBarContrastEnforced", "setNavigationBarColor-Iv8Zu3U", "(JZZLe23/l;)V", "setNavigationBarColor", "Landroid/view/View;", "Landroid/view/Window;", "Landroidx/core/view/o1;", "windowInsetsController", "Landroidx/core/view/o1;", "", "value", "getSystemBarsBehavior", "()I", "setSystemBarsBehavior", "(I)V", "systemBarsBehavior", "isStatusBarVisible", "()Z", "setStatusBarVisible", "(Z)V", "isNavigationBarVisible", "setNavigationBarVisible", "getStatusBarDarkContentEnabled", "setStatusBarDarkContentEnabled", "statusBarDarkContentEnabled", "getNavigationBarDarkContentEnabled", "setNavigationBarDarkContentEnabled", "navigationBarDarkContentEnabled", "isNavigationBarContrastEnforced", "setNavigationBarContrastEnforced", "systemuicontroller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidSystemUiController implements SystemUiController {
    private final View view;
    private final Window window;
    private final o1 windowInsetsController;

    public AndroidSystemUiController(View view2, Window window) {
        view2.getClass();
        this.view = view2;
        this.window = window;
        this.windowInsetsController = window != null ? new o1(window, view2) : null;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean getNavigationBarDarkContentEnabled() {
        o1 o1Var = this.windowInsetsController;
        return o1Var != null && o1Var.f6545a.c();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean getStatusBarDarkContentEnabled() {
        o1 o1Var = this.windowInsetsController;
        return o1Var != null && o1Var.f6545a.d();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public int getSystemBarsBehavior() {
        o1 o1Var = this.windowInsetsController;
        if (o1Var != null) {
            return o1Var.f6545a.a();
        }
        return 0;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isNavigationBarContrastEnforced() {
        Window window;
        return Build.VERSION.SDK_INT >= 29 && (window = this.window) != null && window.isNavigationBarContrastEnforced();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isNavigationBarVisible() {
        View view2 = this.view;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        m1 m1VarA = s0.e.a(view2);
        return m1VarA != null && m1VarA.f6508a.u(2);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isStatusBarVisible() {
        View view2 = this.view;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        m1 m1VarA = s0.e.a(view2);
        return m1VarA != null && m1VarA.f6508a.u(1);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* JADX INFO: renamed from: setNavigationBarColor-Iv8Zu3U, reason: not valid java name */
    public void mo91setNavigationBarColorIv8Zu3U(long color, boolean darkIcons, boolean navigationBarContrastEnforced, l<? super d0, d0> transformColorForLightContent) {
        o1 o1Var;
        transformColorForLightContent.getClass();
        setNavigationBarDarkContentEnabled(darkIcons);
        setNavigationBarContrastEnforced(navigationBarContrastEnforced);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && ((o1Var = this.windowInsetsController) == null || !o1Var.f6545a.c())) {
            color = transformColorForLightContent.invoke(d0.a(color)).f128833a;
        }
        window.setNavigationBarColor(f0.j(color));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarContrastEnforced(boolean z14) {
        Window window;
        if (Build.VERSION.SDK_INT < 29 || (window = this.window) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z14);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarDarkContentEnabled(boolean z14) {
        o1 o1Var = this.windowInsetsController;
        if (o1Var == null) {
            return;
        }
        o1Var.a(z14);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarVisible(boolean z14) {
        o1 o1Var = this.windowInsetsController;
        if (z14) {
            if (o1Var != null) {
                o1Var.f6545a.h(2);
            }
        } else if (o1Var != null) {
            o1Var.f6545a.b(2);
        }
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* JADX INFO: renamed from: setStatusBarColor-ek8zF_U, reason: not valid java name */
    public void mo92setStatusBarColorek8zF_U(long color, boolean darkIcons, l<? super d0, d0> transformColorForLightContent) {
        o1 o1Var;
        transformColorForLightContent.getClass();
        setStatusBarDarkContentEnabled(darkIcons);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && ((o1Var = this.windowInsetsController) == null || !o1Var.f6545a.d())) {
            color = transformColorForLightContent.invoke(d0.a(color)).f128833a;
        }
        window.setStatusBarColor(f0.j(color));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarDarkContentEnabled(boolean z14) {
        o1 o1Var = this.windowInsetsController;
        if (o1Var == null) {
            return;
        }
        o1Var.b(z14);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarVisible(boolean z14) {
        o1 o1Var = this.windowInsetsController;
        if (z14) {
            if (o1Var != null) {
                o1Var.f6545a.h(1);
            }
        } else if (o1Var != null) {
            o1Var.f6545a.b(1);
        }
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setSystemBarsBehavior(int i14) {
        o1 o1Var = this.windowInsetsController;
        if (o1Var == null) {
            return;
        }
        o1Var.f6545a.g(i14);
    }
}
