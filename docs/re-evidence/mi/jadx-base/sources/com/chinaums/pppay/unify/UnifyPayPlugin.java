package com.chinaums.pppay.unify;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.amap.api.services.core.AMapException;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UnifyPayPlugin {
    private static final String TAG = "SdkManager";
    private static UnifyPayPlugin mInstance;
    private static Object mLock = new Object();
    private IWXAPI api;
    private String mAppId;
    private WeakReference<Context> mContext;
    private UnifyPayListener mListener;
    private WeixinPayHandler mWeixinPayHandler;

    private UnifyPayPlugin(Context context) {
        this.mContext = new WeakReference<>(context);
        this.api = WXAPIFactory.createWXAPI(context, null);
        this.mWeixinPayHandler = new WeixinPayHandler(context.getApplicationContext());
    }

    public static UnifyPayPlugin getInstance(Context context) {
        if (mInstance == null) {
            synchronized (mLock) {
                try {
                    if (mInstance == null) {
                        mInstance = new UnifyPayPlugin(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public static String getUnifyErrMessage(String str) {
        if (UnifyPayListener.ERR_OK.equals(str)) {
            return "支付请求发送成功，商户订单是否成功支付应该以商户后台收到支付结果";
        }
        if (UnifyPayListener.ERR_COMM.equals(str)) {
            return "其他支付错误";
        }
        if (UnifyPayListener.ERR_PARARM.equals(str)) {
            return "参数错误";
        }
        if (UnifyPayListener.ERR_CLIENT_UNINSTALL.equals(str)) {
            return "支付客户端未安装";
        }
        if (UnifyPayListener.ERR_ORDER_PROCESS.equals(str)) {
            return "订单处理中，支付结果未知(有可能已经支付成功)，请通过后台接口查询订单状态";
        }
        if (UnifyPayListener.ERR_ORDER_DUPLICATE.equals(str)) {
            return "订单号重复";
        }
        if (UnifyPayListener.ERR_PAY_FAIL.equals(str)) {
            return "订单支付失败";
        }
        if (UnifyPayListener.ERR_AUTH_DENIED.equals(str)) {
            return "认证被否决";
        }
        if (UnifyPayListener.ERR_USER_CANCEL.equals(str)) {
            return "用户取消支付";
        }
        if (UnifyPayListener.ERR_SENT_FAILED.equals(str)) {
            return "网络连接错误";
        }
        if (UnifyPayListener.ERR_UNSUPPORT.equals(str)) {
            return "不支持错误";
        }
        return UnifyPayListener.ERR_BAN.equals(str) ? "被屏蔽所有操作，可能由于签名不正确或无权限" : AMapException.AMAP_CLIENT_UNKNOWN_ERROR;
    }

    private void toast(String str) {
        Context context = this.mContext.get();
        if (context != null) {
            Toast.makeText(context, str, 1).show();
        }
    }

    public void clean() {
        IWXAPI iwxapi = this.api;
        if (iwxapi != null) {
            iwxapi.detach();
            this.api = null;
        }
        WeixinPayHandler weixinPayHandler = this.mWeixinPayHandler;
        if (weixinPayHandler != null) {
            weixinPayHandler.detach();
        }
        mInstance = null;
        this.mContext = null;
        System.gc();
    }

    public String encodURL(String str) {
        StringBuilder sb;
        String str2;
        if (TextUtils.isEmpty(str)) {
            sb = new StringBuilder();
            str2 = "URLEncoded Empty error:";
        } else {
            try {
                return URLEncoder.encode(new String(str.getBytes(), "UTF-8"), "UTF-8");
            } catch (Exception unused) {
                sb = new StringBuilder();
                str2 = "URLEncoded error:";
            }
        }
        sb.append(str2);
        sb.append(str);
        return "";
    }

    public String getAppId() {
        return this.mAppId;
    }

    public UnifyPayListener getListener() {
        return this.mListener;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[PHI: r6
      0x0053: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v2 java.lang.String) binds: [B:21:0x0051, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    public String getScheme(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length <= 1 && !strArrSplit[0].contains(":")) {
            String str2 = strArrSplit[0];
            if (str2.contains("://")) {
                return str2;
            }
            return str2 + "://";
        }
        String strReplace = "";
        for (String str3 : strArrSplit) {
            if (str3 != null && !str3.equals("")) {
                String strTrim = str3.trim();
                String str4 = "Android:";
                if (strTrim.startsWith("Android:")) {
                    strReplace = strTrim.replace(str4, "");
                } else {
                    str4 = "android:";
                    if (strTrim.startsWith("android:")) {
                        strReplace = strTrim.replace(str4, "");
                    }
                }
            }
        }
        if (!strReplace.contains("://")) {
            strReplace = strReplace + "://";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("310 result = ");
        sb.append(strReplace);
        return strReplace;
    }

    public WXPayResultListener getWXListener() {
        return this.mWeixinPayHandler;
    }

    public void initialize(String str) {
        this.mAppId = str;
    }

    public void jumpAlipayMiniPro(Context context, String str, String str2, String str3, String str4) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("alipays://platformapi/startapp?thirdPartSchema=");
            sb.append(str2);
            sb.append("&ap_framework_sceneId=1300&chInfo=ch_outerUrl&appId=");
            sb.append(str);
            sb.append("&page=");
            sb.append(str3);
            sb.append("?");
            sb.append(encodURL("appPayRequest=" + str4));
            sb.append("&query=");
            sb.append(encodURL("ap_framework_sceneId=1300"));
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("jumpAlipayMiniPro  uri = ");
            sb2.append(string);
            Intent uri = Intent.parseUri(string, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            context.startActivity(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendPayRequest(UnifyPayRequest unifyPayRequest) {
        UnifyPayListener unifyPayListener;
        String strCreateResultInfo;
        try {
            JSONObject jSONObject = new JSONObject(unifyPayRequest.payData);
            boolean zEquals = "01".equals(unifyPayRequest.payChannel);
            String str = UnifyPayListener.ERR_COMM;
            if (!zEquals) {
                if ("02".equals(unifyPayRequest.payChannel)) {
                    String[] strArrSplit = jSONObject.getString("qrCode").split("/");
                    Context context = this.mContext.get();
                    if (context == null) {
                        unifyPayListener = this.mListener;
                        if (unifyPayListener == null) {
                            return;
                        }
                    } else {
                        if (UnifyUtils.hasInstalledAlipayClient(context)) {
                            UnifyUtils.startAlipayClient(context, strArrSplit[strArrSplit.length - 1]);
                            return;
                        }
                        UnifyPayListener unifyPayListener2 = this.mListener;
                        if (unifyPayListener2 == null) {
                            return;
                        }
                        String strCreateResultInfo2 = UnifyUtils.createResultInfo(getUnifyErrMessage(UnifyPayListener.ERR_CLIENT_UNINSTALL), null, null);
                        str = UnifyPayListener.ERR_CLIENT_UNINSTALL;
                        unifyPayListener = unifyPayListener2;
                        strCreateResultInfo = strCreateResultInfo2;
                    }
                    unifyPayListener.onResult(str, strCreateResultInfo);
                    return;
                }
                if ("04".equals(unifyPayRequest.payChannel)) {
                    String strOptString = jSONObject.optString("miniuser");
                    String strOptString2 = jSONObject.optString("minipath");
                    String scheme = getScheme(jSONObject.optString("appScheme"));
                    if (TextUtils.isEmpty(scheme)) {
                        toast(UnifyPayRequest.APP_SCHEME_NO_SET);
                    }
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        Context context2 = this.mContext.get();
                        if (context2 != null) {
                            jumpAlipayMiniPro(context2, strOptString, scheme, strOptString2, unifyPayRequest.payData);
                            return;
                        } else {
                            unifyPayListener = this.mListener;
                            if (unifyPayListener == null) {
                                return;
                            }
                        }
                    }
                    toast(UnifyPayRequest.APPID_NO_SET);
                    return;
                }
                return;
                strCreateResultInfo = UnifyUtils.createResultInfo("传入的上下文环境不能为空", "context被系统回收", null);
                unifyPayListener.onResult(str, strCreateResultInfo);
                return;
            }
            String string = "";
            String str2 = "pages/appPay/index?appPayRequest=";
            String str3 = "gh_744d2ebca056";
            try {
                string = jSONObject.getString("appid");
                String strOptString3 = jSONObject.optString("miniuser");
                String strOptString4 = jSONObject.optString("minipath");
                if (!TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                    str3 = TextUtils.isEmpty(strOptString3) ? "gh_744d2ebca056" : strOptString3;
                    if (!TextUtils.isEmpty(strOptString4)) {
                        str2 = strOptString4 + "?appPayRequest=";
                    }
                    Context context3 = this.mContext.get();
                    if (context3 == null) {
                        UnifyPayListener unifyPayListener3 = this.mListener;
                        if (unifyPayListener3 != null) {
                            unifyPayListener3.onResult(UnifyPayListener.ERR_COMM, UnifyUtils.createResultInfo("传入的上下文环境不能为空", "context被系统回收", null));
                            return;
                        }
                        return;
                    }
                    IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context3, string);
                    String str4 = str2 + encodURL(unifyPayRequest.payData);
                    WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
                    req.userName = str3;
                    req.path = str4;
                    req.miniprogramType = 0;
                    iwxapiCreateWXAPI.sendReq(req);
                    return;
                }
                toast(UnifyPayRequest.APPID_NO_SET);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public UnifyPayPlugin setListener(UnifyPayListener unifyPayListener) {
        this.mListener = unifyPayListener;
        return this;
    }
}
