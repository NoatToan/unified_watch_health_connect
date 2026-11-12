package com.huami.account.di;

import com.huami.account.HMLoginManager;
import com.huami.account.service.LoginManagerDelegate;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/account/di/LoginManagerDelegateImpl;", "Lcom/huami/account/service/LoginManagerDelegate;", "", "getValidUid", "", "isInChina", "isInMainland", "isUnknown", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginManagerDelegateImpl implements LoginManagerDelegate {
    @Override // com.huami.account.service.LoginManagerDelegate
    public long getValidUid() {
        return HMLoginManager.getValidUid();
    }

    @Override // com.huami.account.service.LoginManagerDelegate
    public boolean isInChina() {
        return HMLoginManager.isInChina();
    }

    @Override // com.huami.account.service.LoginManagerDelegate
    public boolean isInMainland() {
        return HMLoginManager.isInMainland();
    }

    @Override // com.huami.account.service.LoginManagerDelegate
    public boolean isUnknown() {
        return HMLoginManager.isUnknown();
    }
}
