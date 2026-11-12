package com.xiaomi.fitness.account.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/account/broadcast/UserInfoBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInfoBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private static final String ACTION_SEND_GOAL_UPDATE = "action.USER_GOAL_UPDATE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/account/broadcast/UserInfoBroadcastReceiver$Companion;", "", "<init>", "()V", "ACTION_SEND_GOAL_UPDATE", "", LoginPreferenceConfig.TYPE_REGISTER, "", "broadcast", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void broadcast() {
            ApplicationExtKt.getApplication().sendBroadcast(new Intent("action.USER_GOAL_UPDATE"));
        }

        public final void register() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("action.USER_GOAL_UPDATE");
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationExtKt.getApplication().registerReceiver(new UserInfoBroadcastReceiver(), intentFilter, 2);
            } else {
                ApplicationExtKt.getApplication().registerReceiver(new UserInfoBroadcastReceiver(), intentFilter);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        LogExtKt.logi("onReceive: " + intent);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).notifyUserGoalChanged();
    }
}
