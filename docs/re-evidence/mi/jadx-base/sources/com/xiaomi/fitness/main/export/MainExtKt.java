package com.xiaomi.fitness.main.export;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.export.MainExtKt;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.kb;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"\u001f\u0010\u0015\u001a\u00020\u0016*\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"MAIN_ACTIVITY_PATH", "", "showLoginDialog", "", "getShowLoginDialog", "()Z", "setShowLoginDialog", "(Z)V", "bindNew", "getBindNew", "setBindNew", "showMainActivity", "", "context", "Landroid/content/Context;", "action", "extras", "Landroid/os/Bundle;", "showTabWithIndex", "int", "", "instance", "Lcom/xiaomi/fitness/main/export/MainHelper;", "Lcom/xiaomi/fitness/main/export/MainHelper$Companion;", "getInstance", "(Lcom/xiaomi/fitness/main/export/MainHelper$Companion;)Lcom/xiaomi/fitness/main/export/MainHelper;", "instance$delegate", "Lkotlin/Lazy;", "main-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MainExtKt {

    @NotNull
    public static final String MAIN_ACTIVITY_PATH = "/main/activity/main";
    private static boolean bindNew;

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s1f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainExtKt.instance_delegate$lambda$0();
        }
    });
    private static boolean showLoginDialog;

    public static final boolean getBindNew() {
        return bindNew;
    }

    @NotNull
    public static final MainHelper getInstance(@NotNull MainHelper.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (MainHelper) instance$delegate.getValue();
    }

    public static final boolean getShowLoginDialog() {
        return showLoginDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MainHelper instance_delegate$lambda$0() {
        return ((MainHelperPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), MainHelperPoint.class)).getMainHelper();
    }

    public static final void setBindNew(boolean z) {
        bindNew = z;
    }

    public static final void setShowLoginDialog(boolean z) {
        showLoginDialog = z;
    }

    public static final void showMainActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.e("showMainActivity() called with extras = " + bundle, new Exception());
        kb.c().a(MAIN_ACTIVITY_PATH).withAction(str).with(bundle).withFlags(((context instanceof Activity) || (context instanceof FragmentActivity)) ? 67108864 : 335577088).withTransition(0, 0).navigation(context);
    }

    public static /* synthetic */ void showMainActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        showMainActivity(context, str, bundle);
    }

    public static final void showTabWithIndex(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", i);
        showMainActivity(context, null, bundle);
    }
}
