package defpackage;

import androidx.compose.ui.graphics.ColorKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jk7 {
    public static boolean a(SystemUiController _this) {
        return _this.getStatusBarDarkContentEnabled() && _this.getNavigationBarDarkContentEnabled();
    }

    public static boolean b(SystemUiController _this) {
        return _this.isNavigationBarVisible() && _this.isStatusBarVisible();
    }

    public static void c(SystemUiController _this, long j, boolean z, @NotNull boolean z2, Function1 function1) {
        _this.mo3318setStatusBarColorek8zF_U(j, z, function1);
        _this.mo3317setNavigationBarColorIv8Zu3U(j, z, z2, function1);
    }

    public static void d(SystemUiController _this, boolean z) {
        _this.setStatusBarDarkContentEnabled(z);
        _this.setNavigationBarDarkContentEnabled(z);
    }

    public static void e(SystemUiController _this, boolean z) {
        _this.setStatusBarVisible(z);
        _this.setNavigationBarVisible(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(SystemUiController systemUiController, long j, boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
        }
        if ((i & 2) != 0) {
            z = ColorKt.m1265luminance8_81llA(j) > 0.5f;
        }
        boolean z3 = z;
        boolean z4 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            function1 = SystemUiControllerKt.b;
        }
        systemUiController.mo3317setNavigationBarColorIv8Zu3U(j, z3, z4, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(SystemUiController systemUiController, long j, boolean z, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
        }
        if ((i & 2) != 0) {
            z = ColorKt.m1265luminance8_81llA(j) > 0.5f;
        }
        if ((i & 4) != 0) {
            function1 = SystemUiControllerKt.b;
        }
        systemUiController.mo3318setStatusBarColorek8zF_U(j, z, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(SystemUiController systemUiController, long j, boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
        }
        if ((i & 2) != 0) {
            z = ColorKt.m1265luminance8_81llA(j) > 0.5f;
        }
        boolean z3 = z;
        boolean z4 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            function1 = SystemUiControllerKt.b;
        }
        systemUiController.mo3319setSystemBarsColorIv8Zu3U(j, z3, z4, function1);
    }
}
