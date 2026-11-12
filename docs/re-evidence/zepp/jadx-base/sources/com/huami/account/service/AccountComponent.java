package com.huami.account.service;

import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.AccountLifecycleOwner;
import com.huami.account.service.proxy.KoinProxyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/account/service/AccountComponent;", "", "Lcom/huami/account/service/lifecycle/AccountLifecycle;", "getAccountLifecycle", "Lcom/huami/account/service/AccountService;", "getAccountService", "Lcom/huami/account/service/UserInfoService;", "getUserInfoService", "service_release"}, k = 1, mv = {1, 5, 1})
public interface AccountComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static AccountLifecycle getAccountLifecycle(@NotNull AccountComponent accountComponent) {
            return ((AccountLifecycleOwner) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountLifecycleOwner.class), null, null)).getLifecycle();
        }

        @NotNull
        public static AccountService getAccountService(@NotNull AccountComponent accountComponent) {
            return (AccountService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
        }

        @NotNull
        public static UserInfoService getUserInfoService(@NotNull AccountComponent accountComponent) {
            return (UserInfoService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoService.class), null, null);
        }
    }

    @NotNull
    AccountLifecycle getAccountLifecycle();

    @NotNull
    AccountService getAccountService();

    @NotNull
    UserInfoService getUserInfoService();
}
