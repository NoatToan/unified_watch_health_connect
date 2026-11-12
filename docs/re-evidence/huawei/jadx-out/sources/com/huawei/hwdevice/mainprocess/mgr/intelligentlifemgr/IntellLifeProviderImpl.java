package com.huawei.hwdevice.mainprocess.mgr.intelligentlifemgr;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.account.AccountInfo;
import com.huawei.profile.account.AccountProvider;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class IntellLifeProviderImpl implements AccountProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f17391a = "";
    private static String d = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f17392b;

    public IntellLifeProviderImpl(Context context) {
        this.f17392b = context;
    }

    @Override // com.huawei.profile.account.AccountProvider
    public AccountInfo getAccountInfo() {
        LogUtil.a("IntellLifeProviderImpl", "getAccountInfo enter");
        LoginInit loginInit = LoginInit.getInstance(this.f17392b);
        String accountInfo = loginInit.getAccountInfo(1008);
        String accountInfo2 = loginInit.getAccountInfo(1011);
        int i = 0;
        if (!TextUtils.isEmpty(accountInfo) && !TextUtils.isEmpty(accountInfo2)) {
            a(accountInfo);
            c(accountInfo2);
        } else if (!TextUtils.isEmpty(f17391a) && !TextUtils.isEmpty(d)) {
            LogUtil.j("IntellLifeProviderImpl", "getAccountInfo return local at and id");
            accountInfo2 = d;
            accountInfo = f17391a;
        } else {
            LogUtil.j("IntellLifeProviderImpl", "getAccountInfo accessToken or userId is empty");
            i = 2001;
        }
        AccountInfo accountInfo3 = new AccountInfo();
        accountInfo3.setUserId(accountInfo2);
        accountInfo3.setAccessToken(accountInfo);
        accountInfo3.setRetCode(i);
        accountInfo3.setExpireTime(CommonUtil.i(LoginInit.getInstance(this.f17392b).getAccountInfo(1016)));
        return accountInfo3;
    }

    @Override // com.huawei.profile.account.AccountProvider
    public void setAccessTokenInvalid() {
        LogUtil.j("IntellLifeProviderImpl", "setAccessTokenInvalid start to call setAccessTokenInvalid");
    }

    public static void c(String str) {
        d = str;
    }

    public static void a(String str) {
        f17391a = str;
    }
}
