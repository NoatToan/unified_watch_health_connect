package com.huami.passport.v2;

import android.app.Activity;
import android.content.Context;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginToken;

/* JADX INFO: loaded from: classes12.dex */
public interface IAccountV2 extends IAccount {
    void login(Activity activity, String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback);

    void login(Activity activity, String str, String str2, String str3, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback);

    void login(Activity activity, String str, String str2, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback);

    void tokenLogin(Context context, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback);
}
