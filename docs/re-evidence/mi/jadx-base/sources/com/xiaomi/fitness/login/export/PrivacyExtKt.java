package com.xiaomi.fitness.login.export;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import defpackage.kb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"PRIVACY_PATH", "", "showPrivacyActivity", "", "context", "Landroid/content/Context;", "action", "extras", "Landroid/os/Bundle;", "login-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PrivacyExtKt {

    @NotNull
    public static final String PRIVACY_PATH = "/login/activity/privacy";

    public static final void showPrivacyActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(PRIVACY_PATH).withAction(str).with(bundle).withFlags(((context instanceof Activity) || (context instanceof FragmentActivity)) ? 67108864 : 335577088).navigation(context);
    }

    public static /* synthetic */ void showPrivacyActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        showPrivacyActivity(context, str, bundle);
    }
}
