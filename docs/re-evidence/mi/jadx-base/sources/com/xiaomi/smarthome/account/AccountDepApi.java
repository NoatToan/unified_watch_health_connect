package com.xiaomi.smarthome.account;

import com.xiaomi.smarthome.core.entity.account.AccountType;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountDepApi {
    public static volatile AccountDepApi sInstance = new AccountDepApiDefaultImpl();

    public static AccountDepApi getInstance() {
        return sInstance;
    }

    public abstract void cleanDirty();

    public abstract void clearAllAccount();

    public abstract void clearAllMiServiceTokenInSystem();

    public abstract void clearMiAccount();

    public abstract void clearMiServiceTokenInSystem(String str);

    public abstract AccountType getAccountType();

    public abstract LoginMiAccount getMiAccount();

    public abstract String getMiId();

    public abstract String getMiPassToken();

    public abstract MiServiceTokenInfo getMiServiceToken(String str);

    public abstract long getTokenTime(String str);

    public abstract boolean isDebugUser();

    public abstract boolean isDirty();

    public abstract boolean isGreyUser();

    public abstract boolean isMiLoggedIn();

    public abstract boolean isMiSystemAccount();

    public abstract void saveAccount();

    public abstract void setMiAccount(LoginMiAccount loginMiAccount);

    public abstract void setMiServiceToken(String str, String str2, String str3, String str4, String str5, long j);

    public abstract void setUserDegree(JSONObject jSONObject);
}
