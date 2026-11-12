package com.huami.account.lifecycle;

import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.AccountLifecycleObserver;
import com.huami.account.service.lifecycle.LogoutStateType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/account/lifecycle/AccountLifecycleRegistry;", "Lcom/huami/account/service/lifecycle/AccountLifecycle;", "Lcom/huami/account/lifecycle/AccountLifecycleDispatcher;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "getCurrentState", "Lcom/huami/account/service/lifecycle/AccountLifecycleObserver;", "observer", "", "addObserver", "removeObserver", "state", "dispatch", "", "a", "Ljava/util/List;", "observers", "b", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "lastState", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountLifecycleRegistry implements AccountLifecycle, AccountLifecycleDispatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<AccountLifecycleObserver> observers = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private AccountLifecycle.State lastState = new AccountLifecycle.State.Logout(LogoutStateType.BOOT);

    @Override // com.huami.account.service.lifecycle.AccountLifecycle
    public void addObserver(@NotNull AccountLifecycleObserver observer) {
        this.observers.add(observer);
    }

    @Override // com.huami.account.lifecycle.AccountLifecycleDispatcher
    public void dispatch(@NotNull AccountLifecycle.State state) {
        this.lastState = state;
        Iterator<T> it2 = this.observers.iterator();
        while (it2.hasNext()) {
            ((AccountLifecycleObserver) it2.next()).onChanged(state);
        }
    }

    @Override // com.huami.account.service.lifecycle.AccountLifecycle
    @NotNull
    /* JADX INFO: renamed from: getCurrentState, reason: from getter */
    public AccountLifecycle.State getLastState() {
        return this.lastState;
    }

    @Override // com.huami.account.service.lifecycle.AccountLifecycle
    public void removeObserver(@NotNull AccountLifecycleObserver observer) {
        this.observers.remove(observer);
    }
}
