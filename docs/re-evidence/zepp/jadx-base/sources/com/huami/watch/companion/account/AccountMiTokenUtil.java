package com.huami.watch.companion.account;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.XiaoMiHelper;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.passport.entity.Token;
import com.huami.watch.companion.account.AccountMiTokenUtil;
import com.huami.watch.companion.util.Broadcaster;
import com.huami.watch.util.Box;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;

/* JADX INFO: loaded from: classes16.dex */
public class AccountMiTokenUtil {
    public static final String ACTION_MI_AUTH = "com.huami.watch.companion.action.AccountThirdPartyMiAuth";
    public static final String KEY_MI_AUTH_SUCCESS = "MiAuthSuccess";
    public static final String KEY_MI_AUTH_TIP = "MiAuthTip";
    public static final String MI_REDIRECT_URL = "https://hm.xiaomi.com/watch.do";
    public static final String MI_THIRD_NAME = "mi-watch";
    private static final String a = "Account-MiToken";
    private static final String b = "MiAccessToken";
    private static final String c = "MiRefreshToken";
    private static final String d = "MiTokenExpiresIn";
    private static final String e = "MiTokenUpdateTime";

    public class a implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ ThirdPartyToken a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ DoLooper.Result c;

        /* JADX INFO: renamed from: com.huami.watch.companion.account.AccountMiTokenUtil$a$a, reason: collision with other inner class name */
        public class C0648a implements IAccount.Callback<ThirdPartyToken, ErrorCode> {
            public C0648a() {
            }

            @Override // com.huami.passport.IAccount.Callback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onError(ErrorCode errorCode) {
                Log.d(AccountMiTokenUtil.a, "Refresh MiToken Error: " + errorCode, new Object[0]);
                a.this.c.finish = true;
            }

            @Override // com.huami.passport.IAccount.Callback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ThirdPartyToken thirdPartyToken) {
                Log.d(AccountMiTokenUtil.a, "Refresh MiToken Success: " + thirdPartyToken, new Object[0]);
                a.this.a.setScope(thirdPartyToken.getScope());
                a.this.a.setAccessToken(thirdPartyToken.getAccessToken());
                a.this.a.setRefreshToken(thirdPartyToken.getRefreshToken());
                a.this.a.setExpiresIn(thirdPartyToken.getExpiresIn());
                AccountMiTokenUtil.saveMiToken(a.this.a);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Log.d(AccountMiTokenUtil.a, "Update MiToken: " + TimeUtil.formatDateTime(jCurrentTimeMillis), new Object[0]);
                Box.get().put("MiTokenUpdateTime", jCurrentTimeMillis);
                DoLooper.Result result = a.this.c;
                result.finish = true;
                result.success = true;
            }
        }

        public a(ThirdPartyToken thirdPartyToken, Context context, DoLooper.Result result) {
            this.a = thirdPartyToken;
            this.b = context;
            this.c = result;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(ErrorCode errorCode) {
            Log.d(AccountMiTokenUtil.a, "Get HuamiToken Error: " + errorCode, new Object[0]);
            this.c.finish = true;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Token token) {
            Log.d(AccountMiTokenUtil.a, "Get HuamiToken Success: " + token, new Object[0]);
            XiaoMiHelper.refreshToken(this.b.getApplicationContext(), AccountMiTokenUtil.MI_THIRD_NAME, token.getAccessToken(), this.a.getRefreshToken(), new C0648a());
        }
    }

    private static boolean b(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = (jCurrentTimeMillis / 1000) - (j / 1000);
        long j4 = (j2 * 3) / 4;
        Log.d(a, "CurrentTime: " + TimeUtil.formatDateTime(jCurrentTimeMillis) + ", LastUpdateTime: " + TimeUtil.formatDateTime(j) + ", Diff(s): " + j3 + ", ExpiresIn(s): " + j4, new Object[0]);
        return j3 > j4;
    }

    public static void broadcastMiAuthState(Context context, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("Auth", z);
        Broadcaster.sendLocalBroadcast(context, ACTION_MI_AUTH, bundle);
    }

    private static boolean c(Context context, ThirdPartyToken thirdPartyToken) {
        com.huami.passport.entity.UserInfo userInfo;
        if (!checkMiTokenExists(thirdPartyToken) && e() && (userInfo = AccountManager.getDefault(context).getUserInfo()) != null) {
            thirdPartyToken.setAccessToken(userInfo.getAccessToken());
            thirdPartyToken.setRefreshToken(userInfo.getRefreshToken());
            thirdPartyToken.setExpiresIn(userInfo.getExpiresIn());
            saveMiToken(thirdPartyToken);
        }
        boolean z = thirdPartyToken.getRefreshToken() == null;
        if (z) {
            Log.w(a, "No MiToken exists, need to Auth!!", new Object[0]);
        }
        return z;
    }

    public static boolean checkMiTokenExists(@NonNull ThirdPartyToken thirdPartyToken) {
        return (TextUtils.isEmpty(thirdPartyToken.getAccessToken()) || TextUtils.isEmpty(thirdPartyToken.getRefreshToken())) ? false : true;
    }

    public static boolean checkNeedMiAuth(Context context) {
        return c(context, d());
    }

    public static void clearMiToken() {
        Box.get().remove("MiAccessToken");
        Box.get().remove("MiRefreshToken");
        Box.get().remove("MiTokenExpiresIn");
        Log.i(a, "Clear MiToken!!", new Object[0]);
    }

    @NonNull
    private static ThirdPartyToken d() {
        ThirdPartyToken thirdPartyToken = new ThirdPartyToken();
        String string = Box.get().getString("MiAccessToken");
        if (string != null) {
            thirdPartyToken.setAccessToken(string);
        }
        String string2 = Box.get().getString("MiRefreshToken");
        if (string2 != null) {
            thirdPartyToken.setRefreshToken(string2);
        }
        long j = Box.get().getLong("MiTokenExpiresIn", -1L);
        if (j > -1) {
            thirdPartyToken.setExpiresIn(j);
        }
        Log.d(a, "Read MiToken: " + thirdPartyToken, new Object[0]);
        return thirdPartyToken;
    }

    private static boolean e() {
        return Box.get().getBoolean("MiAuthSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result f(DoLooper.Result result) throws Exception {
        return result;
    }

    @WorkerThread
    public static synchronized ThirdPartyToken getMiToken(Context context) {
        ThirdPartyToken thirdPartyTokenD = d();
        if (c(context, thirdPartyTokenD)) {
            return null;
        }
        if (checkMiTokenExists(thirdPartyTokenD) && !b(Box.get().getLong("MiTokenUpdateTime", 0L), thirdPartyTokenD.getExpiresIn())) {
            Log.i(a, "MiToken is Valid!!", new Object[0]);
            return thirdPartyTokenD;
        }
        final DoLooper.Result result = new DoLooper.Result();
        AccountManager.getDefault(context).getToken(new a(thirdPartyTokenD, context, result));
        DoLooper.doLoop(new DoLooper.Function() { // from class: w4
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return AccountMiTokenUtil.f(result);
            }
        }, 1000, 10);
        Log.i(a, "MiToken is Refreshed!!", new Object[0]);
        return thirdPartyTokenD;
    }

    public static void saveMiToken(ThirdPartyToken thirdPartyToken) {
        Box.get().put("MiAccessToken", thirdPartyToken.getAccessToken());
        Box.get().put("MiRefreshToken", thirdPartyToken.getRefreshToken());
        Box.get().put("MiTokenExpiresIn", thirdPartyToken.getExpiresIn());
        Log.d(a, "Save MiToken: " + thirdPartyToken, new Object[0]);
    }
}
