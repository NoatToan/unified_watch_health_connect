package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.BuildConfig;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.network.embedded.y;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.CommonApi;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import io.jsonwebtoken.JwsHeader;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.californium.elements.util.JceNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, RSAPublicKey> f41646a = new HashMap();

    public static void a(int i, Intent intent, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("IdTokenUtils", "getAccountResult, call back is null");
            return;
        }
        if (intent == null) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        if (-1 != i) {
            LogUtil.a("IdTokenUtils", "getAccountResult is error: ", intent.getStringExtra("reason"), "  errCode: ", Integer.valueOf(intent.getIntExtra("resultCode", 0)));
            iBaseResponseCallback.a(-1, null);
            return;
        }
        LogUtil.a("IdTokenUtils", "getAccountResult: ", Integer.valueOf(i), " ", intent.getDataString());
        String stringExtra = intent.getStringExtra(CommonConstant.KEY_ID_TOKEN);
        LogUtil.a("IdTokenUtils", "getAccountResult idToken: ", stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            iBaseResponseCallback.a(-1, null);
        } else {
            b(stringExtra, iBaseResponseCallback);
        }
    }

    public static void a(DeviceInfo deviceInfo, int i, int i2) {
        if (deviceInfo == null) {
            LogUtil.j("IdTokenUtils", "sendVerifyAccountResult, deviceInfo is null");
            return;
        }
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.account.verify");
        eeeVar.setWearPkgName("hw.watch.account.verify");
        eeeVar.setCommandId(2);
        eeeVar.a(800100024L);
        eeeVar.a(0);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("verifyResult", i);
            jSONObject.put("trace", i2);
            eeeVar.e(eeq.c(eeq.a(jSONObject.toString())));
            edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "IdTokenUtils");
        } catch (JSONException unused) {
            LogUtil.e("IdTokenUtils", "sendVerifyAccountResult, json is error");
        }
    }

    public static void a(Activity activity) {
        if (activity == null) {
            LogUtil.j("IdTokenUtils", "startAccount, activity is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(activity, "com.huawei.ui.device.activity.pairing.VerifyAccountActivity");
            activity.startActivityForResult(intent, 10006);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("IdTokenUtils", "startAccount, activity is not found");
        }
    }

    private static void b(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("IdTokenUtils", "validateIdToken: ", str);
        final DecodedJWT decodedJWTD = px.d(str);
        final String keyId = decodedJWTD.getKeyId();
        if (TextUtils.isEmpty(keyId)) {
            iBaseResponseCallback.a(-1, null);
        } else {
            ThreadPoolManager.c().a("IdTokenUtils", new Runnable() { // from class: mgh.1
                @Override // java.lang.Runnable
                public void run() {
                    mgh.c(keyId, decodedJWTD, iBaseResponseCallback);
                }
            });
        }
    }

    private static RSAPublicKey a(JSONArray jSONArray, String str) {
        LogUtil.a("IdTokenUtils", "enter setPublicKey");
        try {
            if (f41646a.get(str) != null) {
                return f41646a.get(str);
            }
            if (f41646a.size() > 4) {
                f41646a.clear();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString(JwsHeader.KEY_ID);
                RSAPublicKey rSAPublicKeyD = d(jSONArray.getJSONObject(i));
                if (rSAPublicKeyD != null && TextUtils.equals(str, string)) {
                    return rSAPublicKeyD;
                }
            }
            return null;
        } catch (JSONException unused) {
            LogUtil.e("IdTokenUtils", "setPublicKey json is exception");
            return null;
        }
    }

    private static void a(DecodedJWT decodedJWT, IBaseResponseCallback iBaseResponseCallback, RSAPublicKey rSAPublicKey) {
        if (!d(decodedJWT, rSAPublicKey)) {
            ReleaseLogUtil.e("R_IdTokenUtils", "isVerifySuccess is false");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        String issuer = decodedJWT.getIssuer();
        if (TextUtils.isEmpty(issuer) || !issuer.equals("https://accounts.huawei.com")) {
            ReleaseLogUtil.e("R_IdTokenUtils", "verifyIss is false");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        String str = decodedJWT.getAudience().get(0);
        if (TextUtils.isEmpty(str) || !str.equals(String.valueOf(BuildConfig.HMS_APPLICATION_ID))) {
            ReleaseLogUtil.e("R_IdTokenUtils", "verifyAud is false");
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(0, null);
        }
    }

    private static boolean d(DecodedJWT decodedJWT, RSAPublicKey rSAPublicKey) {
        try {
            if (rSAPublicKey == null) {
                LogUtil.j("IdTokenUtils", "verifyRSAPublicKey, rsaPublicKey is null");
                return false;
            }
            px.a(Algorithm.RSA256(rSAPublicKey, null)).ignoreIssuedAt().build().verify(decodedJWT);
            return true;
        } catch (rd e) {
            LogUtil.e("IdTokenUtils", "verifyRSAPublicKey is error: ", ExceptionUtils.c(e));
            return false;
        }
    }

    private static RSAPublicKey d(JSONObject jSONObject) {
        try {
            if (!JceNames.RSA.equalsIgnoreCase(jSONObject.getString("kty"))) {
                LogUtil.j("IdTokenUtils", "getPublicKey is error");
                return null;
            }
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(JceNames.RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.getUrlDecoder().decode(jSONObject.getString("n"))), new BigInteger(1, Base64.getUrlDecoder().decode(jSONObject.getString(FitRunPlayAudio.OPPORTUNITY_E)))));
            if (publicKeyGeneratePublic instanceof RSAPublicKey) {
                return (RSAPublicKey) publicKeyGeneratePublic;
            }
            return null;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | JSONException unused) {
            LogUtil.e("IdTokenUtils", "getRsaPublicKeyByJwk is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final String str, final DecodedJWT decodedJWT, final IBaseResponseCallback iBaseResponseCallback) {
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainMyHuaweiOauthLogin", GRSManager.c(BaseApplication.getContext()).getCountryCode());
        if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j("IdTokenUtils", "get cer url is empty");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        String str2 = noCheckUrl + "/oauth2/v3/certs";
        CommonApi commonApi = (CommonApi) oet.c(a()).e(CommonApi.class);
        if (commonApi == null) {
            iBaseResponseCallback.a(-1, null);
        } else {
            LogUtil.j("IdTokenUtils", "checkAccountUrl: ", str2);
            commonApi.commonGet(str2, new HashMap()).enqueue(new ResultCallback<String>() { // from class: mgh.3
                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onResponse(Response<String> response) {
                    mgh.d(str, decodedJWT, response, iBaseResponseCallback);
                }

                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("IdTokenUtils", "checkAccountUrl is error: ", th.getMessage());
                    iBaseResponseCallback.a(-1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, DecodedJWT decodedJWT, Response<String> response, IBaseResponseCallback iBaseResponseCallback) {
        try {
            if (!response.isOK()) {
                iBaseResponseCallback.a(-1, null);
                LogUtil.j("IdTokenUtils", "getJsonWebKeys is error");
                return;
            }
            String body = response.getBody();
            LogUtil.a("IdTokenUtils", "getJsonWebKeys res is: ", body);
            JSONArray jSONArray = new JSONObject(body).getJSONArray("keys");
            LogUtil.a("IdTokenUtils", "jsonArray is: ", jSONArray);
            a(decodedJWT, iBaseResponseCallback, a(jSONArray, str));
        } catch (JSONException unused) {
            LogUtil.j("IdTokenUtils", "getJsonWebKeys is error");
            iBaseResponseCallback.a(-1, null);
        }
    }

    private static HttpClient a() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(y.f15619c).writeTimeout(5000).readTimeout(5000).build();
    }

    public static boolean a(int i, int i2, Intent intent, DeviceInfo deviceInfo) {
        if (i != 10006) {
            return false;
        }
        if (deviceInfo == null) {
            LogUtil.j("IdTokenUtils", "deviceInfo is null");
            return false;
        }
        if (i2 == -1) {
            LogUtil.a("IdTokenUtils", "agreeVerifyAccount: ", Boolean.valueOf(lvb.e().b("notify_account_verify_finish", deviceInfo, 0, "notify_account_verify_success")));
            return true;
        }
        LogUtil.a("IdTokenUtils", "cancel VerifyAccount: ", Boolean.valueOf(lvb.e().b("notify_account_verify_finish", deviceInfo, 0, "notify_account_verify_failed")));
        return true;
    }
}
