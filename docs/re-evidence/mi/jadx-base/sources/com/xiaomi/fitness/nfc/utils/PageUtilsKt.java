package com.xiaomi.fitness.nfc.utils;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.cih;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n\u001a0\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"gotoPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "clazz", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "isParcelable", "", "gotoPageForResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "nfc_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PageUtilsKt {
    public static final void gotoPage(@NotNull Activity activity, @NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        gotoPage(activity, clazz, bundle, true);
    }

    public static /* synthetic */ void gotoPage$default(Activity activity, Class cls, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        gotoPage(activity, cls, bundle);
    }

    public static final void gotoPageForResult(@NotNull Activity activity, @NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        cih.a().c(activity, new FragmentParams.b().e(clazz).c(bundle).a(true).b(), i);
    }

    public static final void gotoPage(@NotNull Activity activity, @NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        cih.a().b(activity, new FragmentParams.b().e(clazz).c(bundle).a(true).b(), z);
    }

    public static /* synthetic */ void gotoPage$default(Activity activity, Class cls, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        gotoPage(activity, cls, bundle, z);
    }
}
