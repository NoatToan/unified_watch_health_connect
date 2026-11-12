package com.xiaomi.smarthome.account;

import com.xiaomi.smarthome.core.entity.account.AccountType;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AccountDepApiDefaultImpl extends AccountDepApi {
    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void cleanDirty() {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearAllAccount() {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearAllMiServiceTokenInSystem() {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearMiAccount() {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void clearMiServiceTokenInSystem(String str) {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public AccountType getAccountType() {
        return null;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public LoginMiAccount getMiAccount() {
        return null;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public String getMiId() {
        return "0";
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public String getMiPassToken() {
        return null;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public MiServiceTokenInfo getMiServiceToken(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public long getTokenTime(String str) {
        return 0L;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isDebugUser() {
        return false;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isDirty() {
        return false;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isGreyUser() {
        return false;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isMiLoggedIn() {
        return false;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public boolean isMiSystemAccount() {
        return false;
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void saveAccount() {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void setMiAccount(LoginMiAccount loginMiAccount) {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void setMiServiceToken(String str, String str2, String str3, String str4, String str5, long j) {
    }

    @Override // com.xiaomi.smarthome.account.AccountDepApi
    public void setUserDegree(JSONObject jSONObject) {
    }
}
