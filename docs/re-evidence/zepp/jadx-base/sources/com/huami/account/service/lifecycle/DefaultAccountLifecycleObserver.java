package com.huami.account.service.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lcom/huami/account/service/lifecycle/DefaultAccountLifecycleObserver;", "Lcom/huami/account/service/lifecycle/AccountLifecycleObserver;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "state", "", "onChanged", "", "isFromBoot", "onLoginSuccessful", "Lcom/huami/account/service/lifecycle/LogoutStateType;", "type", "onLogoutSuccessful", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
public abstract class DefaultAccountLifecycleObserver implements AccountLifecycleObserver {
    @Override // com.huami.account.service.lifecycle.AccountLifecycleObserver
    public void onChanged(@NotNull AccountLifecycle.State state) {
        if (state instanceof AccountLifecycle.State.NewUser) {
            return;
        }
        if (state instanceof AccountLifecycle.State.Logout) {
            onLogoutSuccessful(((AccountLifecycle.State.Logout) state).getType());
        } else if (state instanceof AccountLifecycle.State.LoggedIn) {
            onLoginSuccessful(((AccountLifecycle.State.LoggedIn) state).getType() == LoginStateType.BOOT);
        }
    }

    public abstract void onLoginSuccessful(boolean isFromBoot);

    public abstract void onLogoutSuccessful(@NotNull LogoutStateType type);
}
