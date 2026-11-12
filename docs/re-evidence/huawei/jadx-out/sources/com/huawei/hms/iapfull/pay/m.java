package com.huawei.hms.iapfull.pay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.a1;
import com.huawei.hms.iapfull.network.model.AliPaySignResponse;
import com.huawei.hms.iapfull.y0;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.secure.android.common.intent.IntentUtils;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f13756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f13757b;

    interface a {
    }

    static void a(m mVar, Map map) {
        String strOptString;
        String strOptString2;
        String str;
        String strOptString3 = "";
        mVar.getClass();
        y0.b("ThirdPayHelper", "alipay result -->");
        if (map == null || map.isEmpty()) {
            y0.b("ThirdPayHelper", "resultMap is empty");
            return;
        }
        String str2 = (String) map.get("resultStatus");
        if (TextUtils.isEmpty(str2)) {
            str2 = "4000";
        }
        y0.b("ThirdPayHelper", "AliPay back resultStatus ->" + str2);
        if ("9000".equals(str2)) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("result"));
                strOptString = jSONObject.has(HwPayConstant.KEY_SIGN) ? jSONObject.optString(HwPayConstant.KEY_SIGN) : "";
                try {
                    if (jSONObject.has("alipay_trade_app_pay_response")) {
                        strOptString2 = jSONObject.optString("alipay_trade_app_pay_response");
                        try {
                            JSONObject jSONObject2 = new JSONObject(strOptString2);
                            if (jSONObject2.has("out_trade_no")) {
                                strOptString3 = jSONObject2.optString("out_trade_no");
                            }
                        } catch (JSONException unused) {
                            y0.a("ThirdPayHelper", "dealAlipaySuccessResult jsonException");
                        }
                        str = strOptString3;
                        strOptString3 = strOptString2;
                    } else {
                        str = "";
                    }
                } catch (JSONException unused2) {
                    strOptString2 = "";
                }
            } catch (JSONException unused3) {
                strOptString = "";
                strOptString2 = strOptString;
            }
            a aVar = mVar.f13757b;
            if (aVar != null) {
                ((j) aVar).a("success", strOptString3, strOptString, str);
            }
        }
    }

    protected void a(a aVar) {
        this.f13757b = aVar;
    }

    protected void a(AliPaySignResponse aliPaySignResponse) {
        a(this.f13756a, aliPaySignResponse.getAliPayUri());
    }

    public static boolean a(Activity activity, String str, String str2) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(activity, str);
        iwxapiCreateWXAPI.registerApp(str);
        WXOpenBusinessWebview.Req req = new WXOpenBusinessWebview.Req();
        req.businessType = 12;
        HashMap<String, String> map = new HashMap<>();
        map.put("pre_entrustweb_id", str2);
        req.queryInfo = map;
        boolean zSendReq = iwxapiCreateWXAPI.sendReq(req);
        if (!zSendReq) {
            y0.a("ThirdPayHelper", "callWechatSign activity is not found");
            a1.a(activity, R.string.hwpay_wechat_pay_err_tips, 0);
        }
        y0.b("ThirdPayHelper", "callWechatSign result " + zSendReq);
        return zSendReq;
    }

    public static boolean a(Activity activity, String str) {
        return a(activity, Uri.parse(str));
    }

    private static boolean a(Activity activity, Uri uri) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        intent.setPackage("com.eg.android.AlipayGphone");
        boolean zSafeStartActivityForResultStatic = IntentUtils.safeStartActivityForResultStatic(activity, intent, 1);
        if (!zSafeStartActivityForResultStatic) {
            y0.a("ThirdPayHelper", "callAliPaySignAPK alipays activity is not found");
            a1.a(activity, R.string.hwpay_alipay_app_not_found, 0);
        }
        return zSafeStartActivityForResultStatic;
    }

    protected m(Activity activity, String str) {
        this.f13756a = activity;
    }
}
