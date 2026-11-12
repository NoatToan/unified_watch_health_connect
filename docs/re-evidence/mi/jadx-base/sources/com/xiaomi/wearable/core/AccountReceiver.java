package com.xiaomi.wearable.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.core.AccountReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/wearable/core/AccountReceiver;", "", "<init>", "()V", "TAG", "", "receiver", "Lcom/xiaomi/wearable/core/AccountReceiver$AccountBroadcastReceiver;", "getReceiver", "()Lcom/xiaomi/wearable/core/AccountReceiver$AccountBroadcastReceiver;", "receiver$delegate", "Lkotlin/Lazy;", "list", "", "Lcom/xiaomi/wearable/core/AccountReceiver$AccountChangeReceiver;", LoginPreferenceConfig.TYPE_REGISTER, "", "unregister", "addAccountReceiver", "removeAccountReceiver", "notifyAccountChange", "login", "", "AccountChangeReceiver", "AccountBroadcastReceiver", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBroadcastReceiver.kt\ncom/xiaomi/wearable/core/AccountReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1863#2,2:121\n*S KotlinDebug\n*F\n+ 1 AccountBroadcastReceiver.kt\ncom/xiaomi/wearable/core/AccountReceiver\n*L\n58#1:121,2\n*E\n"})
public final class AccountReceiver {

    @NotNull
    private static final String TAG = "AccountBroadcastReceive";

    @NotNull
    public static final AccountReceiver INSTANCE = new AccountReceiver();

    /* JADX INFO: renamed from: receiver$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy receiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oc0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountReceiver.receiver_delegate$lambda$0();
        }
    });

    @NotNull
    private static final List<AccountChangeReceiver> list = new ArrayList();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/wearable/core/AccountReceiver$AccountBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccountBroadcastReceiver extends BroadcastReceiver {

        @NotNull
        public static final String APP_ACCOUNT_REFRESH = "APP_ACCOUNT_REFRESH";

        @NotNull
        private static final String EXTRA_LOCAL_FLAG = "extra_local_flag";

        @NotNull
        public static final String EXTRA_UPDATE_TYPE = "extra_update_type";

        @NotNull
        public static final String SYSTEM_LOGIN_ACCOUNTS_POST_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";

        @NotNull
        public static final String SYSTEM_LOGIN_ACCOUNTS_PRE_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_PRE_CHANGED";
        private static final int TYPE_ADD = 2;
        public static final int TYPE_REFRESH = 3;
        private static final int TYPE_REMOVE = 1;

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("extra_update_type", 0)) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                AccountReceiver.INSTANCE.notifyAccountChange(false);
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                AccountReceiver.INSTANCE.notifyAccountChange(true);
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                AccountReceiver.INSTANCE.notifyAccountChange(true);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/core/AccountReceiver$AccountChangeReceiver;", "", "onAccountChanged", "", "login", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AccountChangeReceiver {
        void onAccountChanged(boolean login);
    }

    private AccountReceiver() {
    }

    private final AccountBroadcastReceiver getReceiver() {
        return (AccountBroadcastReceiver) receiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAccountChange(boolean login) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((AccountChangeReceiver) it.next()).onAccountChanged(login);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountBroadcastReceiver receiver_delegate$lambda$0() {
        return new AccountBroadcastReceiver();
    }

    public final void addAccountReceiver(@NotNull AccountChangeReceiver receiver2) {
        Intrinsics.checkNotNullParameter(receiver2, "receiver");
        List<AccountChangeReceiver> list2 = list;
        if (list2.contains(receiver2)) {
            return;
        }
        list2.add(receiver2);
    }

    public final void register() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_POST_CHANGED");
        intentFilter.addAction(AccountBroadcastReceiver.SYSTEM_LOGIN_ACCOUNTS_PRE_CHANGED_ACTION);
        intentFilter.addAction("com.xiaomi.accounts.LOGIN_ACCOUNTS_PRE_CHANGED");
        intentFilter.addAction("com.xiaomi.accounts.LOGIN_ACCOUNTS_POST_CHANGED");
        intentFilter.addAction("APP_ACCOUNT_REFRESH");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getReceiver(), intentFilter, 2);
            } else {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getReceiver(), intentFilter);
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "register error", e);
        }
    }

    public final void removeAccountReceiver(@NotNull AccountChangeReceiver receiver2) {
        Intrinsics.checkNotNullParameter(receiver2, "receiver");
        list.remove(receiver2);
    }

    public final void unregister() {
        try {
            com.xiaomi.wearable.CoreExtKt.getContext().unregisterReceiver(getReceiver());
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "unregister error", e);
        }
    }
}
