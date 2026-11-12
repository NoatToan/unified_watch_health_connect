package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hwcloudjs.a;
import com.huawei.hwcloudmodel.R;
import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTideDataBean;
import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTideStationBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.CommonApi;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lqh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f40627b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40628c = new Object();
    private static lqh e;
    private HttpClient d;

    private lqh() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        this.d = new HttpClient.Builder().connectTimeout(30000).readTimeout(10000).writeTimeout(10000).build();
    }

    static String b() {
        if (!TextUtils.isEmpty(f40627b) && f40627b.length() > 16) {
            return f40627b;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "hag_device_uuid");
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String strReplace = UUID.randomUUID().toString().replace(Constants.LINK, "");
        String strE2 = lqn.e(strReplace);
        if (TextUtils.isEmpty(strE2) || strE2.length() < 32) {
            return strReplace;
        }
        String strSubstring = strE2.substring(0, 32);
        int iE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "hag_device_uuid", strSubstring, new StorageParams(0));
        if (iE == 0) {
            f40627b = strSubstring;
        }
        LogUtil.a("HagHttpUtils", "deviceUdid is saved:", Integer.valueOf(iE));
        return strSubstring;
    }

    public static lqh d() {
        lqh lqhVar;
        synchronized (f40628c) {
            if (e == null) {
                e = new lqh();
            }
            lqhVar = e;
        }
        return lqhVar;
    }

    private String e() {
        return b() + Constants.LINK + System.currentTimeMillis();
    }

    public lqq e(boolean z, double d, double d2) {
        LogUtil.a("HagHttpUtils", "hagWeatherInfo");
        lqq lqqVar = new lqq();
        lqqVar.d(-99);
        lqqVar.e(-99);
        lqqVar.a(-99);
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("weatherKitUrl", lqn.d());
        String strA = a(d, d2);
        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(noCheckUrl)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strB = b(b(noCheckUrl) + "/v4/weather/weatherInfo/query", strA);
            lqq lqqVarD = lqi.d(strB);
            lqqVarD.b(e(System.currentTimeMillis() - jCurrentTimeMillis));
            if (z) {
                lqqVarD.a(a(strB));
            }
            LogUtil.a("HagHttpUtils", "hagWeatherInfo:", lqqVarD.toString());
            return lqqVarD;
        }
        LogUtil.j("HagHttpUtils", "assemblyBodyJson is empty or url is null");
        return lqqVar;
    }

    public lqv c(double d, double d2) {
        lqq lqqVarE = e(false, d, d2);
        if (lqqVarE == null || lqqVarE.n() == -99) {
            return null;
        }
        lqv lqvVar = new lqv();
        lqvVar.d(lqqVarE.v());
        lqvVar.c(lqqVarE.n());
        lqvVar.a(lqqVarE.j());
        lqvVar.a(lqqVarE.f());
        lqvVar.e(lqqVarE.y());
        lqvVar.b(lqqVarE.w());
        lqvVar.f(lqqVarE.m());
        return lqvVar;
    }

    private HagTideDataBean a(String str) {
        HagTideDataBean hagTideDataBean = new HagTideDataBean();
        hagTideDataBean.setHagReportBiMap(e(System.currentTimeMillis() - System.currentTimeMillis()));
        List<HagTideStationBean> listC = lqg.c(str);
        if (listC == null) {
            LogUtil.j("HagHttpUtils", "hagTideInfo tideStations is null");
            return hagTideDataBean;
        }
        hagTideDataBean.setTideStations(listC);
        LogUtil.a("HagHttpUtils", "hagTideInfo:", listC.toString());
        return hagTideDataBean;
    }

    public lqp e(double d, double d2) {
        lqp lqpVar = new lqp();
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("weatherKitUrl", lqn.d());
        String strA = a(d, d2);
        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(noCheckUrl)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            lqpVar = lqd.a(b(noCheckUrl + "/v4/weather/weatherInfo/query", strA));
            lqpVar.a(e(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        LogUtil.a("HagHttpUtils", "getHagAtmosphereInfo() atmosphereInfo:", lqpVar.toString());
        return lqpVar;
    }

    private Map<String, Object> e(long j) {
        HashMap map = new HashMap(16);
        map.put("event_time", Long.valueOf(System.currentTimeMillis()));
        map.put("device_version", Build.BRAND + "_" + Build.VERSION.RELEASE);
        map.put("device_model", Build.MODEL);
        map.put("device_id", b());
        map.put(a.d, "com.huawei.health.app");
        map.put("product_version", "com.huawei.health.app_" + CommonUtil.a(BaseApplication.getContext()));
        map.put("service_type", "WeatherKit");
        map.put(DeviceCategoryFragment.DEVICE_TYPE, 0);
        map.put("ability_id", "BUILTIN_WEATHER");
        map.put("trace_id", e());
        map.put("service_delay", Long.valueOf(j));
        return map;
    }

    private String b(String str) {
        if (!lqj.b()) {
            LogUtil.j("HagHttpUtils", "convertWeatherHttpUrl() is not developer");
            return str;
        }
        String strD = lqj.d();
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        LogUtil.j("HagHttpUtils", "convertWeatherHttpUrl() developerWeatherUrl is empty");
        return str;
    }

    private String b(String str, String str2) {
        try {
            String strE = e();
            String strA = CommonUtil.a(BaseApplication.getContext());
            String strA2 = a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = "appId=EE5934D4C9500BFB6B86D8E0B2999A74,nonce=" + strA2 + ",timestamp=" + jCurrentTimeMillis + ",versionCode=" + strA + ",digest=security:" + llu.a(d(llu.d(BaseApplication.getContext().getResources().getString(R.string.weather_kti_word_key1) + BaseApplication.getContext().getResources().getString(R.string.weather_kti_word_key2)), ("EE5934D4C9500BFB6B86D8E0B2999A74:" + strA2 + ":" + jCurrentTimeMillis + ":" + strA).getBytes(StandardCharsets.UTF_8)), true);
            HashMap map = new HashMap();
            map.put("Content-Type", "application/json");
            map.put("Authorization", str3);
            map.put("clientVersion", strA);
            map.put("homsNext", "0");
            map.put("additionalId", "oaid");
            map.put("isChinaVersion", String.valueOf(Utils.o()));
            map.put(WatchFaceConstant.X_CLIENTTRACEID, strE);
            map.put("appId", "EE5934D4C9500BFB6B86D8E0B2999A74");
            ReleaseLogUtil.d("DEVMGR_HagHttpUtils", "x-hag-trace-id: ", strE);
            CommonApi commonApi = (CommonApi) oet.c(this.d).e(CommonApi.class);
            if (commonApi == null) {
                LogUtil.j("HagHttpUtils", "postWeatherKit, hagInfoApi is null");
                return String.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR);
            }
            Response<String> responseExecute = commonApi.commonPost(str, map, str2).execute();
            if (responseExecute == null) {
                LogUtil.j("HagHttpUtils", "postWeatherKit result is empty");
                return String.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR);
            }
            if (responseExecute.isOK()) {
                String body = responseExecute.getBody();
                LogUtil.a("HagHttpUtils", "postWeatherKit:", body);
                if (!TextUtils.isEmpty(body)) {
                    return body;
                }
                LogUtil.j("HagHttpUtils", "postWeatherKit result is empty");
                return String.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR);
            }
            ReleaseLogUtil.e("DEVMGR_HagHttpUtils", "postWeatherKit code:", Integer.valueOf(responseExecute.getCode()), ",message:", responseExecute.getMessage(), ",getErrorBody:", new String(responseExecute.getErrorBody(), StandardCharsets.UTF_8));
            return String.valueOf(responseExecute.getCode());
        } catch (IOException e2) {
            ReleaseLogUtil.e("DEVMGR_HagHttpUtils", "postWeatherKit IOException", ExceptionUtils.c(e2));
            return String.valueOf(600);
        } catch (IllegalArgumentException e3) {
            e = e3;
            ReleaseLogUtil.e("DEVMGR_HagHttpUtils", "post() IllegalArgumentException/NoSuchAlgorithmException/InvalidKeyException", ExceptionUtils.c(e));
            return String.valueOf(601);
        } catch (InvalidKeyException e4) {
            e = e4;
            ReleaseLogUtil.e("DEVMGR_HagHttpUtils", "post() IllegalArgumentException/NoSuchAlgorithmException/InvalidKeyException", ExceptionUtils.c(e));
            return String.valueOf(601);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            ReleaseLogUtil.e("DEVMGR_HagHttpUtils", "post() IllegalArgumentException/NoSuchAlgorithmException/InvalidKeyException", ExceptionUtils.c(e));
            return String.valueOf(601);
        }
    }

    private String a(double d, double d2) {
        JSONObject jSONObject = new JSONObject();
        try {
            String lowerCase = CommonUtil.z().toLowerCase(Locale.ENGLISH);
            jSONObject.put(JsbMapKeyNames.H5_LOC_LON, String.valueOf(d2));
            jSONObject.put(JsbMapKeyNames.H5_LOC_LAT, String.valueOf(d));
            if ("zh-cht".equals(lowerCase)) {
                lowerCase = "zh-hant";
            }
            jSONObject.put("language", lowerCase);
            jSONObject.put("phoneType", Build.MODEL);
        } catch (JSONException e2) {
            LogUtil.a("HagHttpUtils", "getAssemblyBodyJson JSONException", ExceptionUtils.c(e2));
        }
        LogUtil.a("HagHttpUtils", "getAssemblyBodyJson Body is ", jSONObject.toString());
        return jSONObject.toString();
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        if (bArr == null || bArr2 == null) {
            LogUtil.e("HagHttpUtils", "encryptHmacSha256 input param is invalid.");
            return new byte[0];
        }
        LogUtil.a("HagHttpUtils", "encryptHmacSha256 start");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(bArr2);
    }

    private SecureRandom c() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e2) {
            ReleaseLogUtil.a("HagHttpUtils", "getSecureRandom exception ", e2);
            return new SecureRandom();
        }
    }

    private String a() {
        byte[] bArr = new byte[48];
        c().nextBytes(bArr);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bArr);
    }
}
