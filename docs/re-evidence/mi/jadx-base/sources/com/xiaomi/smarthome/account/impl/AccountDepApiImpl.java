package com.xiaomi.smarthome.account.impl;

import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.account.AccountType;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.smarthome.core.server.internal.account.UserDegreeManager;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AccountDepApiImpl extends AccountDepApi {
    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void cleanDirty() {
        UserDegreeManager.getInstance().cleanDirty();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearAllAccount() {
        MiJiaAccountManager.getInstance().clearAllAccount();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearAllMiServiceTokenInSystem() {
        MiJiaAccountManager.getInstance().clearAllMiServiceTokenInSystem();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearMiAccount() {
        MiJiaAccountManager.getInstance().clearMiAccount();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearMiServiceTokenInSystem(String str) {
        MiJiaAccountManager.getInstance().clearMiServiceTokenInSystem(str);
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public AccountType getAccountType() {
        return MiJiaAccountManager.getInstance().getAccountType();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public LoginMiAccount getMiAccount() {
        return MiJiaAccountManager.getInstance().getMiAccount();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public String getMiId() {
        return MiJiaAccountManager.getInstance().getMiId();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public String getMiPassToken() {
        return MiJiaAccountManager.getInstance().getMiPassToken();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public MiServiceTokenInfo getMiServiceToken(String str) {
        return MiJiaAccountManager.getInstance().getMiServiceToken(str);
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public long getTokenTime(String str) {
        return MiJiaAccountManager.getInstance().getTokenTime(str);
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isDebugUser() {
        return MiJiaAccountManager.getInstance().isDebugUser();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isDirty() {
        return UserDegreeManager.getInstance().isDirty();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isGreyUser() {
        return MiJiaAccountManager.getInstance().isGreyUser();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isMiLoggedIn() {
        return MiJiaAccountManager.getInstance().isMiLoggedIn();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isMiSystemAccount() {
        return MiJiaAccountManager.getInstance().isMiSystemAccount();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void saveAccount() {
        MiJiaAccountManager.getInstance().saveAccount();
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void setMiAccount(LoginMiAccount loginMiAccount) {
        MiJiaAccountManager.getInstance().setMiAccount(loginMiAccount);
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void setMiServiceToken(String str, String str2, String str3, String str4, String str5, long j) {
        MiJiaAccountManager.getInstance().setMiServiceToken(str, str2, str3, str4, str5, j);
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void setUserDegree(JSONObject jSONObject) {
        MiJiaAccountManager.getInstance().setUserDegree(jSONObject);
    }
}
