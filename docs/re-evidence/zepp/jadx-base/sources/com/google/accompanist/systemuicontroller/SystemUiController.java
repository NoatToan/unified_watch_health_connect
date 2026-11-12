package com.google.accompanist.systemuicontroller;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\bg\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJG\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0013\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001c\u0010\u001e\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001c\u0010!\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R$\u0010$\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010\u0010\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0014\"\u0004\b%\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006&"}, d2 = {"Lcom/google/accompanist/systemuicontroller/SystemUiController;", "", "Landroidx/compose/ui/graphics/Color;", "color", "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "", "setStatusBarColor-ek8zF_U", "(JZLkotlin/jvm/functions/Function1;)V", "setStatusBarColor", "navigationBarContrastEnforced", "setNavigationBarColor-Iv8Zu3U", "(JZZLkotlin/jvm/functions/Function1;)V", "setNavigationBarColor", "isNavigationBarContrastEnforced", "setSystemBarsColor-Iv8Zu3U", "setSystemBarsColor", "isStatusBarVisible", "()Z", "setStatusBarVisible", "(Z)V", "isNavigationBarVisible", "setNavigationBarVisible", "value", "isSystemBarsVisible", "setSystemBarsVisible", "getStatusBarDarkContentEnabled", "setStatusBarDarkContentEnabled", "statusBarDarkContentEnabled", "getNavigationBarDarkContentEnabled", "setNavigationBarDarkContentEnabled", "navigationBarDarkContentEnabled", "getSystemBarsDarkContentEnabled", "setSystemBarsDarkContentEnabled", "systemBarsDarkContentEnabled", "setNavigationBarContrastEnforced", "systemuicontroller_release"}, k = 1, mv = {1, 5, 1})
public interface SystemUiController {
    boolean getNavigationBarDarkContentEnabled();

    boolean getStatusBarDarkContentEnabled();

    boolean getSystemBarsDarkContentEnabled();

    boolean isNavigationBarContrastEnforced();

    boolean isNavigationBarVisible();

    boolean isStatusBarVisible();

    boolean isSystemBarsVisible();

    /* JADX INFO: renamed from: setNavigationBarColor-Iv8Zu3U */
    void mo3317setNavigationBarColorIv8Zu3U(long color, boolean darkIcons, boolean navigationBarContrastEnforced, @NotNull Function1<? super Color, Color> transformColorForLightContent);

    void setNavigationBarContrastEnforced(boolean z);

    void setNavigationBarDarkContentEnabled(boolean z);

    void setNavigationBarVisible(boolean z);

    /* JADX INFO: renamed from: setStatusBarColor-ek8zF_U */
    void mo3318setStatusBarColorek8zF_U(long color, boolean darkIcons, @NotNull Function1<? super Color, Color> transformColorForLightContent);

    void setStatusBarDarkContentEnabled(boolean z);

    void setStatusBarVisible(boolean z);

    /* JADX INFO: renamed from: setSystemBarsColor-Iv8Zu3U */
    void mo3319setSystemBarsColorIv8Zu3U(long color, boolean darkIcons, boolean isNavigationBarContrastEnforced, @NotNull Function1<? super Color, Color> transformColorForLightContent);

    void setSystemBarsDarkContentEnabled(boolean z);

    void setSystemBarsVisible(boolean z);
}
