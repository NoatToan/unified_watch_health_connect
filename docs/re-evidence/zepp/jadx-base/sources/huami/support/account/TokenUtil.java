package huami.support.account;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.ext.GsonRequest;
import com.android.volley.toolbox.ext.RequestManager;
import com.huami.passport.AccountManager;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.Keeper;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.entity.Device;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Token;
import com.huami.passport.net.WebAPI;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import huami.support.account.TokenUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class TokenUtil {
    public static Token createCredentials(Context context, String str, String str2, String str3) {
        return createCredentials(context, str, "mi", str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(String str, String str2, String str3, String str4) {
        return "createCredentials provider:" + str + " thirdName:" + str2 + " userId:" + str3 + " security:" + str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(String str, Map map) {
        return "request params " + str + "\n" + Utils.encodeParameters(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "TokenInfo object is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(LoginToken loginToken) {
        return "Save loginToken " + loginToken;
    }

    public static Token createCredentials(Context context, final String str, final String str2, final String str3, final String str4) {
        Context applicationContext = context.getApplicationContext();
        HMLog.debug(new Function0() { // from class: zq7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenUtil.e(str, str2, str3, str4);
            }
        });
        Token token = new Token();
        if (!TextUtils.equals("mifit", str)) {
            token.setErrorCode(ErrorCode.NOT_SUPPORT_ERROR);
            return token;
        }
        AppInfo appInfo = Utils.getAppInfo(applicationContext);
        Device deviceCache = Utils.getDeviceCache(applicationContext);
        RequestFuture requestFutureNewFuture = RequestFuture.newFuture();
        final HashMap map = new HashMap();
        map.put("third_name", str2);
        map.put(Configs.Params.THIRD_ID, str3);
        map.put("security", str4);
        map.put("app_name", appInfo.getAppId());
        map.put("device_id_type", deviceCache.getDeviceidType());
        map.put("device_id", deviceCache.getDeviceid());
        map.put("lang", Locale.getDefault().getLanguage());
        map.put("source", appInfo.buildParams());
        map.put(Configs.Params.DEVICE_MODEL, deviceCache.getDeviceModel());
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        final String str5 = Configs.ID_SERVER_CN_PRODUCT + "/v1/client/login_by_security";
        if (Integer.parseInt(str3) < 1540000000) {
            if (Configs.isDebugMode) {
                str5 = Configs.ID_SERVER_CN_TEST + "/v1/client/login_by_security";
            }
        } else if (Configs.isDebugMode) {
            str5 = Configs.ID_SERVER_US_TEST + "/v1/client/login_by_security";
        } else {
            str5 = Configs.ID_SERVER_US_PRODUCT + "/v1/client/login_by_security";
        }
        GsonRequest gsonRequest = new GsonRequest(1, str5, map, LoginToken.class, requestFutureNewFuture, requestFutureNewFuture);
        gsonRequest.setShouldCache(false);
        RequestManager.getDefault(applicationContext).add(WebAPI.setRetryPolicy(gsonRequest));
        HMLog.debug(new Function0() { // from class: ar7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenUtil.f(str5, map);
            }
        });
        try {
            final LoginToken loginToken = (LoginToken) requestFutureNewFuture.get();
            String errorCode = loginToken.getErrorCode();
            if (!TextUtils.isEmpty(errorCode)) {
                token.setErrorCode(errorCode);
                return token;
            }
            if (loginToken.getTokenInfo() == null) {
                HMLog.debug(new Function0() { // from class: br7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TokenUtil.g();
                    }
                });
                token.setErrorCode(ErrorCode.ID_AUTH_FORMAT_ERROR);
                return token;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            loginToken.getTokenInfo().setLastUpdateAppTtl(jCurrentTimeMillis);
            loginToken.getTokenInfo().setLastUpdateTtl(jCurrentTimeMillis);
            loginToken.setProvider(str);
            HMLog.debug(new Function0() { // from class: yq7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TokenUtil.h(loginToken);
                }
            });
            if (Keeper.saveToken(applicationContext, loginToken)) {
                return AccountManager.getDefault(applicationContext).getToken();
            }
            token.setErrorCode(ErrorCode.INNER_HANDLE_ERROR);
            return token;
        } catch (Exception e) {
            token.setErrorCode(WebAPI.getError(e));
            return token;
        }
    }
}
