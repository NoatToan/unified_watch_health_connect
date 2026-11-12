package com.xiaomi.fitness.push.request;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.push.request.PushHelper;
import com.xiaomi.fitness.push.sp.PushPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/push/request/PushHelper;", "", "<init>", "()V", "pushRequest", "Lcom/xiaomi/fitness/push/request/PushRequest;", "isUploadClientId", "", "accountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "registerPushId", "", "clientId", "", "unRegisterPushId", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushHelper {
    private static boolean isUploadClientId;

    @NotNull
    public static final PushHelper INSTANCE = new PushHelper();

    @NotNull
    private static final PushRequest pushRequest = new PushRequest();

    @NotNull
    private static AccountManager accountManager = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);

    private PushHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPushId$lambda$0() {
        PushPreference.INSTANCE.setOpenPush(true);
        isUploadClientId = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unRegisterPushId$lambda$1(boolean z) {
        PushPreference.INSTANCE.setOpenPush(false);
        isUploadClientId = false;
        return Unit.INSTANCE;
    }

    @NotNull
    public final AccountManager getAccountManager() {
        return accountManager;
    }

    public final void registerPushId(@NotNull String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        if (isUploadClientId || !accountManager.isLogin()) {
            PushPreference.INSTANCE.setOpenPush(true);
        } else {
            pushRequest.register(clientId, new Function0() { // from class: vei
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PushHelper.registerPushId$lambda$0();
                }
            });
        }
    }

    public final void setAccountManager(@NotNull AccountManager accountManager2) {
        Intrinsics.checkNotNullParameter(accountManager2, "<set-?>");
        accountManager = accountManager2;
    }

    public final void unRegisterPushId() {
        PushPreference.INSTANCE.setOpenPush(false);
        pushRequest.unRegister(new Function1() { // from class: wei
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PushHelper.unRegisterPushId$lambda$1(((Boolean) obj).booleanValue());
            }
        });
    }
}
