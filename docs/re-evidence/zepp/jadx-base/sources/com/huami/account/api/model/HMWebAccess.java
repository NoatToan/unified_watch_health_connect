package com.huami.account.api.model;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.event.NextAction;
import com.huami.account.service.AnonymousInfo;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.NextActions;
import com.huami.passport.entity.Token;
import com.huami.tools.log.HMLog;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class HMWebAccess {
    public static final String AUTH_SERVER_ERROR_ACCOUNT_ALREADY_REGISTER = "0118";
    public static final String AUTH_SERVER_ERROR_ACCOUNT_DISABLE = "0115";
    public static final String AUTH_SERVER_ERROR_ACCOUNT_NOT_REGISTER = "0117";
    public static final String AUTH_SERVER_ERROR_DISABLE_APP_LOGIN = "0114";
    public static final String AUTH_SERVER_ERROR_FROZEN = "0121";
    public static final String AUTH_SERVER_ERROR_MUTUAL_EXCLUSION = "0108";
    public static final String AUTH_SERVER_ERROR_RIGHTS_RESTRICTIVE = "0122";
    public static final String AUTH_SERVER_ERROR_THIRD_ID_ALREADY_BIND = "0111";
    public static final String AUTH_SERVER_ERROR_THIRD_ID_EXCEPTION = "0112";
    public static final String AUTH_SERVER_ERROR_USER_IN_ERROR_REGION = "0113";
    public static final String AUTH_SERVER_ERROR_VERIFICATION_FAILED = "0106";
    public static final String REGISTER_ERROR_CUSTOM_TIP = "0129";
    public static final String REQUEST_MAX_ATTEMPTS_LIMIT = "429";
    private static final String a = "HMWebAccess";
    private static final String b = "0100";
    private static final String c = "0101";
    private static final String d = "0102";
    private static final String e = "0103";
    private static final String f = "0105";
    private static final String g = "0107";
    private static final String h = "0109";
    private static final String i = "0110";
    private static final String j = "0123";
    private static AtomicBoolean k = new AtomicBoolean(true);

    public interface Callback {
        void onError();

        void onSuccess(String str);
    }

    public static String getToken() {
        Token token;
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        if (anonymousInfo != null) {
            return anonymousInfo.getToken();
        }
        if (k.getAndSet(true)) {
            token = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getToken();
        } else {
            HMLog.v(a, "fresh Token", new Object[0]);
            token = AccountManager.getDefault(AccountExternalsKt.getAppContext()).syncRefreshToken();
        }
        if (!TextUtils.isEmpty(token.getErrorCode())) {
            k.set(false);
            tokenError(token.getErrorCode(), token.getMutimeLong());
        }
        List<NextActions> nextActions = token.getNextActions();
        String href = (nextActions == null || nextActions.size() == 0) ? null : nextActions.get(0).getHref();
        if (!TextUtils.isEmpty(href)) {
            HMLoginManager.verifyHref(href);
            EventBus.getDefault().post(new NextAction());
        }
        HMLoginManager.refreshHttpDns();
        return token.getAccessToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(String str) {
        return "errorCode:" + str;
    }

    public static void setHadFreshToken(boolean z) {
        k.set(z);
    }

    public static void tokenError(final String str, long j2) {
        Handler handler = new Handler(Looper.getMainLooper());
        str.hashCode();
        switch (str) {
            case "0100":
            case "0101":
            case "0105":
                handler.post(new Runnable() { // from class: ep3
                    @Override // java.lang.Runnable
                    public final void run() {
                        HMLogoutManager.logout(2);
                    }
                });
                break;
            case "0108":
                HMLogoutManager.mutex(j2);
                break;
            case "0114":
            case "0115":
                handler.post(new Runnable() { // from class: cp3
                    @Override // java.lang.Runnable
                    public final void run() {
                        HMLogoutManager.logout(4);
                    }
                });
                break;
            case "0122":
                handler.post(new Runnable() { // from class: dp3
                    @Override // java.lang.Runnable
                    public final void run() {
                        HMLogoutManager.logout(5);
                    }
                });
                break;
            case "0123":
                handler.post(new Runnable() { // from class: bp3
                    @Override // java.lang.Runnable
                    public final void run() {
                        HMLogoutManager.logout(5);
                    }
                });
                break;
        }
        HMLog.info(a, new Function0() { // from class: fp3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMWebAccess.j(str);
            }
        });
    }
}
