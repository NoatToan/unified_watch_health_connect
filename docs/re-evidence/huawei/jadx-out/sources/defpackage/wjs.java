package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcloudmodel.agreement.AgrHttp;
import com.huawei.hwcloudmodel.agreement.QueryAgreementRequestBean;
import com.huawei.hwcloudmodel.agreement.QueryAgreementRequestInfo;
import com.huawei.hwcloudmodel.agreement.SignAgreementRequestBean;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.operation.utils.Constants;
import com.huawei.utils.RiskBiAnalytics;
import defpackage.wjs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wjs {
    public static boolean a() {
        boolean zB = SharedPreferenceManager.e(Integer.toString(10000), "is_agr_change_user") ? SharedPreferenceManager.b(Integer.toString(10000), "is_agr_change_user", false) : false;
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "isChangeNewUser, isChangeUser is ", Boolean.valueOf(zB));
        return zB;
    }

    public static boolean e() {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        boolean zB = false;
        if (!loginInit.getIsLogined()) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "saveUserSignAgr do not login");
            return false;
        }
        String accountInfo = loginInit.getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "saveUserSignAgr signUserId is empty");
            return false;
        }
        if (SharedPreferenceManager.e(Integer.toString(10000), "is_agr_sign" + accountInfo)) {
            zB = SharedPreferenceManager.b(Integer.toString(10000), "is_agr_sign" + accountInfo, false);
        }
        LogUtil.b("R_PrivacyAgreementUtil", "isUserSignAgr, isSignAgr is ", Boolean.valueOf(zB));
        return zB;
    }

    public static void f(Context context, Handler handler) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c(context);
        long jM = CommonUtil.m(context, SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time"));
        float fCurrentTimeMillis = (System.currentTimeMillis() - jM) / 60000.0f;
        if (jM != 0 && fCurrentTimeMillis <= 1440.0f && "1".equals(a(context))) {
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "shouldQuery show privacy oversea dialog");
            handler.sendEmptyMessage(10091);
        } else {
            h(context, handler);
        }
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "shouldQuery finished intervalTime = ", Float.valueOf(fCurrentTimeMillis), " lastQueryTime = ", jM + ", time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public static String a(Context context) {
        return SharedPreferenceManager.e(context, Integer.toString(10000), "agr_if_agree_authorize");
    }

    public static boolean e(Context context) {
        boolean zAb = CommonUtil.ab(context);
        boolean zD = wsp.d();
        boolean isLogined = LoginInit.getInstance(context).getIsLogined();
        boolean zB = b();
        LogUtil.b("R_PrivacyAgreementUtil", "isCheckBetaAgrUpdate isNetworkConnected:", Boolean.valueOf(zAb), " isChinaBeta:", Boolean.valueOf(zD), " isLogin:", Boolean.valueOf(isLogined), " isSignBetaPrivacy:", Boolean.valueOf(zB));
        return zAb && zD && isLogined && zB;
    }

    private static void c(Context context) {
        String str;
        if (context == null) {
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(context);
        if (loginInit.getIsLogined()) {
            String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_user_id");
            String accountInfo = loginInit.getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo)) {
                str = accountInfo;
                str = Constants.NULL;
            }
            str = accountInfo;
            if (!TextUtils.isEmpty(strE) && !Constants.NULL.equals(str) && !Constants.NULL.equals(strE) && !str.equals(strE)) {
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "initAgreementQueryInfo change user is true");
                SharedPreferenceManager.a(Integer.toString(10000), "is_agr_change_user", true);
                d(false);
            }
            if (TextUtils.isEmpty(strE) || !strE.equals(str)) {
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "initAgreementQueryInfo queryTime reset");
                SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_user_id", str, new StorageParams(1));
                SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time", "", null);
                SharedPreferenceManager.e(context, Integer.toString(10000), "beta_agr_last_query_time", "", null);
                SharedPreferenceManager.e(context, Integer.toString(10000), "if_first_agr_sign", "", null);
            }
        }
    }

    private static void h(final Context context, final Handler handler) {
        if (context == null) {
            context = com.huawei.haf.application.BaseApplication.b();
        }
        ThreadPoolManager.d().execute(new Runnable() { // from class: wjt
            @Override // java.lang.Runnable
            public final void run() {
                wjs.a(context, handler);
            }
        });
    }

    static /* synthetic */ void a(Context context, Handler handler) {
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1015);
        if (!TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "obtainTokenInThread token is not empty");
            c(context, handler, url, accountInfo);
        } else {
            d(context, handler, url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, Handler handler, String str, String str2) {
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "enter_MSG_OBTAIN_TOKEN");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "MSG_OBTAIN_TOKEN token or agrUrl is empty");
            return;
        }
        d(context);
        if (TextUtils.isEmpty(SharedPreferenceManager.e(context, Integer.toString(10000), "if_first_agr_sign")) && !a()) {
            d(context, handler, str, str2);
            return;
        }
        if ("0".equals(a(context))) {
            Bundle bundle = new Bundle();
            bundle.putString("token", str2);
            bundle.putString("agrUrl", str);
            Message messageObtainMessage = handler.obtainMessage(10090);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            return;
        }
        a(context, handler, str, str2);
    }

    private static void d(final Context context, final Handler handler, final String str, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "agrSign MainActivty_signAgrHttp aToken is null");
            return;
        }
        if (context == null) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "agrSign MainActivty context is null");
            return;
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "agrSign MainActivty_signAgrHttp country is ", accountInfo);
        if (TextUtils.isEmpty(accountInfo)) {
            return;
        }
        ThreadPoolManager.d().execute(new Runnable() { // from class: wju
            @Override // java.lang.Runnable
            public final void run() {
                wjs.e(str, str2, context, handler);
            }
        });
    }

    static /* synthetic */ void e(String str, String str2, Context context, Handler handler) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
        arrayList.add(10009);
        b(str, str2, true, arrayList, new c(context, handler, str, str2, arrayList));
    }

    public static void b(String str, String str2, boolean z, List<Integer> list, HttpResCallBack httpResCallBack) {
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreement isAgree = ", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || CollectionUtils.a(list)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "mAgreementUrl, mToken or mSignTypeTmp is empty.");
            return;
        }
        String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1010);
        String country = com.huawei.haf.application.BaseApplication.b().getResources().getConfiguration().locale.getCountry();
        String language = com.huawei.haf.application.BaseApplication.b().getResources().getConfiguration().locale.getLanguage();
        AgrHttp agrHttp = new AgrHttp();
        agrHttp.signHttpReq(str2, str, agrHttp.composeSignAgrReqBean(accountInfo, language + "_" + country, z, list), httpResCallBack);
    }

    public static void a(Context context, HttpResCallBack httpResCallBack) {
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreementRedPoint");
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(url) || context == null) {
            LogUtil.e("R_PrivacyAgreementUtil", "signAgreementRedPoint token or url is empty, context is null");
            return;
        }
        String accountInfo2 = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1010);
        String country = com.huawei.haf.application.BaseApplication.b().getResources().getConfiguration().locale.getCountry();
        String language = com.huawei.haf.application.BaseApplication.b().getResources().getConfiguration().locale.getLanguage();
        AgrHttp agrHttp = new AgrHttp();
        ArrayList arrayList = new ArrayList();
        arrayList.add(10009);
        SignAgreementRequestBean signAgreementRequestBeanComposeSignAgrReqBean = agrHttp.composeSignAgrReqBean(accountInfo2, language + "_" + country, true, arrayList);
        signAgreementRequestBeanComposeSignAgrReqBean.setUsbm(1);
        agrHttp.signHttpReq(accountInfo, url, signAgreementRequestBeanComposeSignAgrReqBean, httpResCallBack);
    }

    private static void d(final Context context) {
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreement");
        if (context == null) {
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreement context == null");
            return;
        }
        if (!wsp.d()) {
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreement isChinaBeta = false");
        } else if (b()) {
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreement isSignBetaPrivacy = true");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.privacy.util.PrivacyAgrUtil$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    wjs.b(context);
                }
            });
        }
    }

    public static /* synthetic */ void b(Context context) {
        LoginInit loginInit = LoginInit.getInstance(context);
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = loginInit.getAccountInfo(1015);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(AgrConstant.BETA_USER_AGREEMENT_CODE));
        LogUtil.b("R_PrivacyAgreementUtil", "signAgreement: url " + url, " token ", accountInfo);
        b(url, accountInfo, true, arrayList, new HttpResCallBack() { // from class: wjv
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public final void onFinished(int i, String str) {
                wjs.b(i, str);
            }
        });
    }

    static /* synthetic */ void b(int i, String str) {
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "signAgreement: resultCode " + i, " result ", str);
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Context context, final Handler handler, final String str, final String str2) {
        ThreadPoolManager.d().execute(new Runnable() { // from class: wkc
            @Override // java.lang.Runnable
            public final void run() {
                wjs.e(context, str2, str, handler);
            }
        });
    }

    static /* synthetic */ void e(Context context, String str, String str2, Handler handler) {
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "agrQuery MainActivty_signAgrHttp aToken");
        AgrHttp agrHttp = new AgrHttp();
        agrHttp.queryHttpReq(str, str2, agrHttp.composeQueryAgrReqBean(LoginInit.getInstance(context).getAccountInfo(1010), false), new e(context, handler, str2, str));
    }

    static class c implements HttpResCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f52112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Handler> f52113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f52114c;
        private final String d;
        private final List<Integer> e;

        public c(Context context, Handler handler, String str, String str2, List<Integer> list) {
            this.f52113b = new WeakReference<>(handler);
            this.f52112a = context;
            this.f52114c = str;
            this.d = str2;
            this.e = list;
        }

        @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
        public void onFinished(int i, String str) {
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "agrSign First sign resultCode = ", Integer.valueOf(i), " result = ", str);
            if (i != 200 || !wvi.c(str)) {
                ReleaseLogUtil.e("R_PrivacyAgreementUtil", "agrSign privacy sign failed");
                RiskBiAnalytics.a(RiskBiAnalytics.PrivacyAgrRiskType.RISK_TYPE_AGR_SIGN.value(), "agr sign resultCode", Integer.valueOf(i), "result", str);
                return;
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "if_first_agr_sign", "1", null);
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "agr_authorized_versions", new Gson().toJson(this.e), new StorageParams());
            wjs.d(true);
            Handler handler = this.f52113b.get();
            if (handler == null) {
                ReleaseLogUtil.e("R_PrivacyAgreementUtil", "agrSign First sign handler is null");
                return;
            }
            Message messageObtainMessage = handler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.d);
            bundle.putString("agrUrl", this.f52114c);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            wjs.a(this.f52112a, handler, this.f52114c, this.d);
        }
    }

    static class e implements HttpResCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f52115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f52116b;
        private final String d;
        private final WeakReference<Handler> e;

        public e(Context context, Handler handler, String str, String str2) {
            this.e = new WeakReference<>(handler);
            this.f52115a = context;
            this.f52116b = str;
            this.d = str2;
        }

        @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
        public void onFinished(int i, String str) {
            Handler handler = this.e.get();
            if (handler == null) {
                return;
            }
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "agr_query_sign_response resultCode:", Integer.valueOf(i), " result:", str);
            if (i == 200) {
                Bundle bundle = new Bundle();
                bundle.putString("result", str);
                bundle.putString("token", this.d);
                bundle.putString("agrUrl", this.f52116b);
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                wjs.b(this.f52115a, handler, messageObtainMessage);
                return;
            }
            RiskBiAnalytics.a(RiskBiAnalytics.PrivacyAgrRiskType.RISK_TYPE_AGR_QUERY.value(), "agr query resCode:", Integer.valueOf(i), "result:", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Handler handler, Message message) {
        int i;
        Bundle data = message.getData();
        if (data == null) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "handleAgrResData resultbundle == null");
            return;
        }
        String string = data.getString("result");
        if (context == null || !wvi.c(string)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "handleAgrResData privacy query failed");
            return;
        }
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "enter_handleAgrResData");
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time", Long.toString(System.currentTimeMillis()), null);
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("growUpSignIndication") && (i = jSONObject.getInt("growUpSignIndication")) != 0) {
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "growUpSignIndication is ", Integer.valueOf(i));
                g(context, handler);
                return;
            }
            ArrayList<Integer> arrayListD = d(context, handler, jSONObject);
            if (CollectionUtils.a(arrayListD)) {
                ReleaseLogUtil.e("R_PrivacyAgreementUtil", "handleAgrResData QueryAgrResInfo list isEmpty");
                handler.sendEmptyMessage(10091);
            } else if (a() && !e()) {
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "handleAgrResData, need show Privacy");
                handler.sendEmptyMessage(Constants.FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5);
            } else {
                message.what = 20251106;
                data.putIntegerArrayList("needSign_agr_list", arrayListD);
                handler.sendMessage(message);
            }
        } catch (JSONException e2) {
            String strB = LogAnonymous.b(e2);
            ReleaseLogUtil.a("R_PrivacyAgreementUtil", "handleAgrResData Show Sign Dialog JSONException exception ", strB);
            RiskBiAnalytics.a(RiskBiAnalytics.PrivacyAgrRiskType.RISK_TYPE_AGR_QUERY.value(), "agr query handleAgrResData JSONException exception", strB);
        }
    }

    private static ArrayList<Integer> d(Context context, Handler handler, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.VMALL_SIGN_INFO);
        LogUtil.b("R_PrivacyAgreementUtil", "handleAgrResData agr_query_sign_response JSONArray : ", Integer.valueOf(jSONArray.length()));
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (jSONArray.length() > 0) {
            if (!b(context, jSONObject, jSONArray, arrayList)) {
                return arrayList;
            }
            g(context, handler);
            return null;
        }
        arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
        arrayList.add(10009);
        return arrayList;
    }

    private static boolean b(Context context, JSONObject jSONObject, JSONArray jSONArray, List<Integer> list) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int iOptInt = jSONObject2.optInt(Constants.VMALL_ARG_TYPE);
            if (iOptInt == 118 || iOptInt == 10009) {
                if (jSONObject2.optBoolean("needSign")) {
                    ReleaseLogUtil.d("R_PrivacyAgreementUtil", "handleAgrResData agr_query_sign_response agrType = ", Integer.valueOf(iOptInt));
                    list.add(Integer.valueOf(iOptInt));
                } else if (c(context, jSONObject2.optLong("signTime"))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void g(Context context, Handler handler) {
        handler.sendEmptyMessage(10086);
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time", "", null);
        SharedPreferenceManager.e(context, Integer.toString(10000), "if_first_agr_sign", "", null);
    }

    private static boolean c(Context context, long j) {
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1006);
        if (TextUtils.isEmpty(accountInfo)) {
            return false;
        }
        int iN = CommonUtil.n(context, accountInfo) + 180000;
        int iA = DateFormatUtil.a(j);
        int iA2 = DateFormatUtil.a(System.currentTimeMillis());
        boolean zIsMinorAccount = LoginInit.getInstance(context).isMinorAccount();
        LogUtil.b("R_PrivacyAgreementUtil", "handleAgrResData, growUpDate:", Integer.valueOf(iN), " signDate:", Integer.valueOf(iA), " currentDate:", Integer.valueOf(iA2), "  isMinorAccount:", Boolean.valueOf(zIsMinorAccount));
        if (iA > iN || iN >= iA2 || zIsMinorAccount) {
            return false;
        }
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "handleAgrResData, minor grown up need show Privacy");
        return true;
    }

    private static void d(final Context context, final Handler handler, final String str) {
        LoginInit.getInstance(context).refreshAccessToken(new ILoginCallback() { // from class: wjs.3
            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginSuccess(Object obj) {
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "obtainTokenInThread token login success");
                if (obj instanceof String) {
                    wjs.c(context, handler, str, (String) obj);
                } else {
                    ReleaseLogUtil.e("R_PrivacyAgreementUtil", "obtainTokenInThread object convert fail");
                }
            }

            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginFailed(Object obj) {
                ReleaseLogUtil.e("R_PrivacyAgreementUtil", "obtainTokenInThread token login failed");
            }
        });
    }

    public static void d(final Context context, final Handler handler) {
        long jM = CommonUtil.m(context, lua.h(Integer.toString(10000), "agr_red_point_last_query_time"));
        float fCurrentTimeMillis = (System.currentTimeMillis() - jM) / 60000.0f;
        if (jM != 0 && fCurrentTimeMillis <= 1440.0f) {
            LogUtil.b("R_PrivacyAgreementUtil", "agrQueryRedPoint intervalTime:", Float.valueOf(fCurrentTimeMillis), ",lastQueryTime:", Long.valueOf(jM));
        } else {
            ThreadPoolManager.d().execute(new Runnable() { // from class: wjw
                @Override // java.lang.Runnable
                public final void run() {
                    wjs.b(context, handler);
                }
            });
        }
    }

    static /* synthetic */ void b(Context context, Handler handler) {
        LogUtil.b("R_PrivacyAgreementUtil", "agrQueryRedPoint signAgrHttp aToken");
        LoginInit loginInit = LoginInit.getInstance(context);
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = loginInit.getAccountInfo(1015);
        AgrHttp agrHttp = new AgrHttp();
        String accountInfo2 = LoginInit.getInstance(context).getAccountInfo(1010);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new QueryAgreementRequestInfo(10009, accountInfo2));
        QueryAgreementRequestBean queryAgreementRequestBean = new QueryAgreementRequestBean(arrayList);
        queryAgreementRequestBean.setUsbm(1);
        agrHttp.queryHttpReq(accountInfo, url, queryAgreementRequestBean, new b(handler));
    }

    static class b implements HttpResCallBack {
        private final WeakReference<Handler> e;

        b(Handler handler) {
            this.e = new WeakReference<>(handler);
        }

        @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
        public void onFinished(int i, String str) {
            Handler handler = this.e.get();
            if (handler == null) {
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "agrQueryRedPoint handler == null");
                return;
            }
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "agrQueryRedPoint response resCode ", Integer.valueOf(i));
            if (i == 200) {
                wjs.d(handler, str);
                LogUtil.b("R_PrivacyAgreementUtil", "agrQueryRedPoint response data is ", str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Handler handler, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "handleAgrRedPointResult resultBundle == null");
            return;
        }
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "enter_handleAgrRedPointResult");
        if (!wvi.c(str)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "handleAgrRedPointResult privacy query failed");
            return;
        }
        lua.c(Integer.toString(10000), "agr_red_point_last_query_time", Long.toString(System.currentTimeMillis()), null);
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Constants.VMALL_SIGN_INFO);
            ReleaseLogUtil.d("R_PrivacyAgreementUtil", "handleAgrRedPointResult agr_query_sign_response JSONArray : ", Integer.valueOf(jSONArray.length()));
            if (jSONArray.length() <= 0) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt(Constants.VMALL_ARG_TYPE);
                ReleaseLogUtil.d("R_PrivacyAgreementUtil", "handleAgrRedPointResult response agrType = ", Integer.valueOf(iOptInt));
                if (iOptInt == 10009 && jSONObject.has("rpt")) {
                    int i2 = jSONObject.getInt("rpt");
                    ReleaseLogUtil.d("R_PrivacyAgreementUtil", "rpt is ", Integer.valueOf(i2));
                    lua.d(Integer.toString(10000), "agr_query_rpt", i2 == 1);
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.what = 15;
                    messageObtainMessage.arg1 = i2;
                    handler.sendMessage(messageObtainMessage);
                }
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.a("R_PrivacyAgreementUtil", "handleAgrRedPointResult exception ", LogAnonymous.b(e2));
        }
    }

    private static boolean b() {
        String strE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), Integer.toString(10000), "beta_agr_if_agree_authorize");
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "isSignBetaPrivacy betaSign:", strE);
        return "1".equals(strE);
    }

    public static void c(final Context context, final Handler handler) {
        long jM = CommonUtil.m(context, SharedPreferenceManager.e(context, Integer.toString(10000), "beta_agr_last_query_time"));
        float fCurrentTimeMillis = (System.currentTimeMillis() - jM) / 60000.0f;
        if (jM != 0 && fCurrentTimeMillis <= 1440.0f) {
            LogUtil.b("R_PrivacyAgreementUtil", "agrQueryBeta lastQueryTime:", Long.valueOf(jM));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wjx
                @Override // java.lang.Runnable
                public final void run() {
                    wjs.e(context, handler);
                }
            });
        }
    }

    static /* synthetic */ void e(Context context, Handler handler) {
        LogUtil.b("R_PrivacyAgreementUtil", "agrQueryBeta MainActivty_signAgrHttp aToken");
        LoginInit loginInit = LoginInit.getInstance(context);
        String url = GRSManager.c(context).getUrl("agreementservice");
        new AgrHttp().queryHttpBetaReq(loginInit.getAccountInfo(1015), url, new a(handler));
    }

    static class a implements HttpResCallBack {
        private final WeakReference<Handler> e;

        a(Handler handler) {
            this.e = new WeakReference<>(handler);
        }

        @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
        public void onFinished(int i, String str) {
            Handler handler = this.e.get();
            if (handler == null) {
                LogUtil.b("R_PrivacyAgreementUtil", "agrQueryBeta handler == null");
            } else if (i == 200) {
                wjs.c(handler, str);
                LogUtil.b("R_PrivacyAgreementUtil", "agrQueryBeta response data is ", str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Handler handler, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("R_PrivacyAgreementUtil", "handleAgrBetaResult resultBundle == null");
            return;
        }
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "enter_handleAgrBetaResult");
        if (!wvi.c(str)) {
            LogUtil.e("R_PrivacyAgreementUtil", "handleAgrBetaResult privacy query failed");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "beta_agr_last_query_time", Long.toString(System.currentTimeMillis()), null);
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Constants.VMALL_SIGN_INFO);
            LogUtil.b("R_PrivacyAgreementUtil", "handleAgrBetaResult agr_query_sign_response JSONArray : ", Integer.valueOf(jSONArray.length()));
            if (jSONArray.length() <= 0) {
                e(false);
                handler.sendEmptyMessage(20231123);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.optBoolean("needSign")) {
                    int iOptInt = jSONObject.optInt(Constants.VMALL_ARG_TYPE);
                    LogUtil.b("R_PrivacyAgreementUtil", "handleAgrBetaResult agr_query_sign_response agrType = ", Integer.valueOf(iOptInt));
                    if (iOptInt == 10000050) {
                        arrayList.add(Integer.valueOf(iOptInt));
                    }
                }
            }
            LogUtil.b("R_PrivacyAgreementUtil", "handleAgrBetaResult QueryAgrResInfo list size ", Integer.valueOf(arrayList.size()));
            if (arrayList.isEmpty()) {
                return;
            }
            e(false);
            handler.sendEmptyMessage(20231123);
        } catch (JSONException e2) {
            LogUtil.d("R_PrivacyAgreementUtil", "handleAgrBetaResult exception ", LogAnonymous.b(e2));
        }
    }

    public static void d(boolean z) {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (!loginInit.getIsLogined()) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "saveUserSignAgr do not login");
            return;
        }
        String accountInfo = loginInit.getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("R_PrivacyAgreementUtil", "saveUserSignAgr signUserId is empty");
            return;
        }
        ReleaseLogUtil.d("R_PrivacyAgreementUtil", "saveUserSignAgr isAgree is ", Boolean.valueOf(z));
        SharedPreferenceManager.a(Integer.toString(10000), "is_agr_sign" + accountInfo, z);
    }

    private static void e(boolean z) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "beta_agr_if_agree_authorize", z ? "1" : "0", new StorageParams());
    }
}
