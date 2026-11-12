package com.xiaomi.fitness.account.manager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountContractConstants;", "", "<init>", "()V", "MI_ACCOUNT_PACKAGE_NAME", "", "MI_ACCOUNT_TYPE", "MI_ACCOUNT_ACTIVITY_ACTION", "ACTION_LOGIN", "KEY_INTENT", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountContractConstants {

    @NotNull
    public static final String ACTION_LOGIN = "action_login";

    @NotNull
    public static final AccountContractConstants INSTANCE = new AccountContractConstants();

    @NotNull
    public static final String KEY_INTENT = "key_intent";

    @NotNull
    public static final String MI_ACCOUNT_ACTIVITY_ACTION = "android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS";

    @NotNull
    public static final String MI_ACCOUNT_PACKAGE_NAME = "com.xiaomi.account";

    @NotNull
    public static final String MI_ACCOUNT_TYPE = "com.xiaomi";

    private AccountContractConstants() {
    }
}
