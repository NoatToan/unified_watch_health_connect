package com.google.accompanist.systemuicontroller;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import o4.d0;
import o4.f0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\bg\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJG\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0018\u001a\u00020\u00138&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR$\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001c\u0010$\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001c\u0010'\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR$\u0010*\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\u0010\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b+\u0010\u001cø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lcom/google/accompanist/systemuicontroller/SystemUiController;", "", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "", "setStatusBarColor-ek8zF_U", "(JZLe23/l;)V", "setStatusBarColor", "navigationBarContrastEnforced", "setNavigationBarColor-Iv8Zu3U", "(JZZLe23/l;)V", "setNavigationBarColor", "isNavigationBarContrastEnforced", "setSystemBarsColor-Iv8Zu3U", "setSystemBarsColor", "", "getSystemBarsBehavior", "()I", "setSystemBarsBehavior", "(I)V", "systemBarsBehavior", "isStatusBarVisible", "()Z", "setStatusBarVisible", "(Z)V", "isNavigationBarVisible", "setNavigationBarVisible", "value", "isSystemBarsVisible", "setSystemBarsVisible", "getStatusBarDarkContentEnabled", "setStatusBarDarkContentEnabled", "statusBarDarkContentEnabled", "getNavigationBarDarkContentEnabled", "setNavigationBarDarkContentEnabled", "navigationBarDarkContentEnabled", "getSystemBarsDarkContentEnabled", "setSystemBarsDarkContentEnabled", "systemBarsDarkContentEnabled", "setNavigationBarContrastEnforced", "systemuicontroller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SystemUiController {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setNavigationBarColor-Iv8Zu3U$default, reason: not valid java name */
    static /* synthetic */ void m93setNavigationBarColorIv8Zu3U$default(SystemUiController systemUiController, long j8, boolean z14, boolean z15, l lVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
            return;
        }
        if ((i14 & 2) != 0) {
            z14 = f0.i(j8) > 0.5f;
        }
        boolean z16 = z14;
        boolean z17 = (i14 & 4) != 0 ? true : z15;
        if ((i14 & 8) != 0) {
            lVar = SystemUiControllerKt.BlackScrimmed;
        }
        systemUiController.mo91setNavigationBarColorIv8Zu3U(j8, z16, z17, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setStatusBarColor-ek8zF_U$default, reason: not valid java name */
    static /* synthetic */ void m94setStatusBarColorek8zF_U$default(SystemUiController systemUiController, long j8, boolean z14, l lVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
            return;
        }
        if ((i14 & 2) != 0) {
            z14 = f0.i(j8) > 0.5f;
        }
        if ((i14 & 4) != 0) {
            lVar = SystemUiControllerKt.BlackScrimmed;
        }
        systemUiController.mo92setStatusBarColorek8zF_U(j8, z14, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setSystemBarsColor-Iv8Zu3U$default, reason: not valid java name */
    static /* synthetic */ void m95setSystemBarsColorIv8Zu3U$default(SystemUiController systemUiController, long j8, boolean z14, boolean z15, l lVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
            return;
        }
        if ((i14 & 2) != 0) {
            z14 = f0.i(j8) > 0.5f;
        }
        boolean z16 = z14;
        boolean z17 = (i14 & 4) != 0 ? true : z15;
        if ((i14 & 8) != 0) {
            lVar = SystemUiControllerKt.BlackScrimmed;
        }
        systemUiController.m96setSystemBarsColorIv8Zu3U(j8, z16, z17, lVar);
    }

    boolean getNavigationBarDarkContentEnabled();

    boolean getStatusBarDarkContentEnabled();

    int getSystemBarsBehavior();

    default boolean getSystemBarsDarkContentEnabled() {
        return getStatusBarDarkContentEnabled() && getNavigationBarDarkContentEnabled();
    }

    boolean isNavigationBarContrastEnforced();

    boolean isNavigationBarVisible();

    boolean isStatusBarVisible();

    default boolean isSystemBarsVisible() {
        return isNavigationBarVisible() && isStatusBarVisible();
    }

    /* JADX INFO: renamed from: setNavigationBarColor-Iv8Zu3U */
    void mo91setNavigationBarColorIv8Zu3U(long color, boolean darkIcons, boolean navigationBarContrastEnforced, l<? super d0, d0> transformColorForLightContent);

    void setNavigationBarContrastEnforced(boolean z14);

    void setNavigationBarDarkContentEnabled(boolean z14);

    void setNavigationBarVisible(boolean z14);

    /* JADX INFO: renamed from: setStatusBarColor-ek8zF_U */
    void mo92setStatusBarColorek8zF_U(long color, boolean darkIcons, l<? super d0, d0> transformColorForLightContent);

    void setStatusBarDarkContentEnabled(boolean z14);

    void setStatusBarVisible(boolean z14);

    void setSystemBarsBehavior(int i14);

    /* JADX INFO: renamed from: setSystemBarsColor-Iv8Zu3U, reason: not valid java name */
    default void m96setSystemBarsColorIv8Zu3U(long color, boolean darkIcons, boolean isNavigationBarContrastEnforced, l<? super d0, d0> transformColorForLightContent) {
        transformColorForLightContent.getClass();
        mo92setStatusBarColorek8zF_U(color, darkIcons, transformColorForLightContent);
        mo91setNavigationBarColorIv8Zu3U(color, darkIcons, isNavigationBarContrastEnforced, transformColorForLightContent);
    }

    default void setSystemBarsDarkContentEnabled(boolean z14) {
        setStatusBarDarkContentEnabled(z14);
        setNavigationBarDarkContentEnabled(z14);
    }

    default void setSystemBarsVisible(boolean z14) {
        setStatusBarVisible(z14);
        setNavigationBarVisible(z14);
    }
}
