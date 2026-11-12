package com.xiaomi.fitness.habit.register;

import com.xiaomi.fitness.access.preference.AccessPreference;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.request.MiscModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.habit.register.AccessComponet;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.hbp;
import defpackage.obk;
import defpackage.omc;
import defpackage.xfl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/habit/register/AccessComponet;", "", "<init>", "()V", "registerActivityCreate", "", "revertWechatStepSyncToOldVersionIfNeed", "reportWechatStepsSynRevertToServerIfNeed", "callback", "Lkotlin/Function0;", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "access")
public final class AccessComponet {

    @NotNull
    public static final String TAG = "AccessComponet";

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.register.AccessComponet$revertWechatStepSyncToOldVersionIfNeed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/habit/register/AccessComponet$revertWechatStepSyncToOldVersionIfNeed$1", "Lkotlin/Function1;", "", "", "invoke", "loggedIn", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements Function1<Boolean, Unit> {
        final /* synthetic */ AccountManager $accountManager;

        public AnonymousClass1(AccountManager accountManager) {
            this.$accountManager = accountManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(AccountManager accountManager, AnonymousClass1 this$0) {
            Intrinsics.checkNotNullParameter(accountManager, "$accountManager");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            accountManager.removeAccountListener(this$0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public void invoke(boolean loggedIn) {
            if (loggedIn) {
                AccessComponet accessComponet = AccessComponet.this;
                final AccountManager accountManager = this.$accountManager;
                accessComponet.reportWechatStepsSynRevertToServerIfNeed(new Function0() { // from class: w30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccessComponet.AnonymousClass1.invoke$lambda$0(accountManager, this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportWechatStepsSynRevertToServerIfNeed(final Function0<Unit> callback) {
        new AccessRequest().bindWechat(2, new Function1() { // from class: u30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessComponet.reportWechatStepsSynRevertToServerIfNeed$lambda$0(callback, (MiscModel.WechatBindResult) obj);
            }
        }, new Function1() { // from class: v30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessComponet.reportWechatStepsSynRevertToServerIfNeed$lambda$1((ApiException) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportWechatStepsSynRevertToServerIfNeed$default(AccessComponet accessComponet, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        accessComponet.reportWechatStepsSynRevertToServerIfNeed(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportWechatStepsSynRevertToServerIfNeed$lambda$0(Function0 function0, MiscModel.WechatBindResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccessPreference.INSTANCE.setWECHAT_STEPS_VERSION_REVERTED(true);
        Logger.i(TAG, "revertWechatStepSyncToOldVersionIfNeed bindWechat success. ");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportWechatStepsSynRevertToServerIfNeed$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "revertWechatStepSyncToOldVersionIfNeed bindWechat error=" + it);
        return Unit.INSTANCE;
    }

    private final void revertWechatStepSyncToOldVersionIfNeed() {
        AccessPreference accessPreference = AccessPreference.INSTANCE;
        Logger.i(TAG, "revertWechatStepSyncToOldVersionIfNeed WECHAT_STEPS_SWITCH_INITIALIZED=" + accessPreference.getWECHAT_STEPS_SWITCH_INITIALIZED() + " WECHAT_STEPS_VERSION_REVERTED=" + accessPreference.getWECHAT_STEPS_VERSION_REVERTED());
        if (!accessPreference.getWECHAT_STEPS_SWITCH_INITIALIZED() || accessPreference.getWECHAT_STEPS_VERSION_REVERTED()) {
            return;
        }
        AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        if (accountManagerExtKt.isLogin()) {
            reportWechatStepsSynRevertToServerIfNeed$default(this, null, 1, null);
        } else {
            accountManagerExtKt.addAccountListener(new AnonymousClass1(accountManagerExtKt));
        }
    }

    @ComponentTask(notLaterThan = 2, onMainThread = false)
    public final void registerActivityCreate() {
        Logger.i(TAG, "registerActivityCreate");
        xfl.a().d(new omc());
        xfl.a().d(new obk());
        xfl.a().d(new hbp());
        revertWechatStepSyncToOldVersionIfNeed();
    }
}
