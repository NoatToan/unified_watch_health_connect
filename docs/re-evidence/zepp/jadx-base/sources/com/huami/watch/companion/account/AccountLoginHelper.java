package com.huami.watch.companion.account;

import android.content.Context;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginToken;
import com.huami.watch.util.Log;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class AccountLoginHelper {
    public static final int STATE_FAIL = -2;
    public static final int STATE_NONE = 0;
    public static final int STATE_START = 1;
    public static final int STATE_SUCCESS = -1;
    private static final String a = "Account-LoginHelper";

    public class a implements IAccount.Callback<LoginToken, ErrorCode> {
        public final /* synthetic */ Consumer a;

        public a(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(ErrorCode errorCode) {
            Log.d(AccountLoginHelper.a, "Re-login Error : " + errorCode, new Object[0]);
            try {
                this.a.accept(-2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(LoginToken loginToken) {
            Log.d(AccountLoginHelper.a, "Re-login Success : " + loginToken, new Object[0]);
            try {
                this.a.accept(-1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static AccountLoginHelper getHelper() {
        return new AccountLoginHelper();
    }

    public void reLogin(Context context, Consumer<Integer> consumer) {
        Log.d(a, "Re-login...", new Object[0]);
        try {
            consumer.accept(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AccountManager.getDefault(context).relogin(new a(consumer));
    }
}
