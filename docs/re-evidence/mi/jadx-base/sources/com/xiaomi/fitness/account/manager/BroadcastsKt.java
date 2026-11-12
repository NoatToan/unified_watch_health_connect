package com.xiaomi.fitness.account.manager;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a(\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\b¨\u0006\t"}, d2 = {"broadcastLogout", "", "broadcastLogin", "intent", "Landroid/content/Intent;", "block", "Lkotlin/Function1;", "broadcastCancelLogin", "Landroid/content/Context;", "account_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BroadcastsKt {
    public static final void broadcastCancelLogin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent();
        intent.setAction(AccountBroadcastReceiver.APP_ACCOUNT_LOGIN_CANCEL);
        intent.putExtra("extra_update_type", 4);
        context.sendBroadcast(intent);
    }

    public static final void broadcastLogin(@Nullable Intent intent, @Nullable Function1<? super Intent, Unit> function1) {
        Intent intent2 = new Intent(AccountContractConstants.ACTION_LOGIN);
        intent2.putExtra("key_intent", intent);
        if (function1 != null) {
            function1.invoke2(intent2);
        }
        ApplicationExtKt.getApplication().sendBroadcast(intent2);
    }

    public static /* synthetic */ void broadcastLogin$default(Intent intent, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        broadcastLogin(intent, function1);
    }

    public static final void broadcastLogout() {
        Intent intent = new Intent("com.xiaomi.wearable.device.logout");
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }
}
