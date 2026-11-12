package com.xiaomi.fitness.nfc.utils;

import android.app.Activity;
import android.os.Bundle;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/utils/AccountUtils;", "", "<init>", "()V", "gotoLoginPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountUtils {

    @NotNull
    public static final AccountUtils INSTANCE = new AccountUtils();

    private AccountUtils() {
    }

    public final void gotoLoginPage(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_ME());
        MainExtKt.showMainActivity(activity, null, bundle);
    }
}
