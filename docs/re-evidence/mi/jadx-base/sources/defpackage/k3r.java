package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.onetrack.c.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class k3r {
    public static void a(JSONObject jSONObject) {
        PayReq payReq = new PayReq();
        payReq.appId = jSONObject.optString(q.f13858b);
        payReq.partnerId = jSONObject.optString(TSMAuthContants.PARAM_PARTNER_ID);
        payReq.prepayId = jSONObject.optString("prepayId");
        String strOptString = jSONObject.optString("packageValue");
        payReq.packageValue = strOptString;
        if (TextUtils.isEmpty(strOptString)) {
            payReq.packageValue = jSONObject.optString("packageValueValue");
        }
        payReq.nonceStr = jSONObject.optString("nonceStr");
        payReq.timeStamp = jSONObject.optString(SportConstants.KEY_TIMESTAMP);
        payReq.sign = jSONObject.optString("sign");
        vqg.d("wxjson = " + h4b.c(payReq));
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(AppUtil.getApp(), payReq.appId);
        iwxapiCreateWXAPI.registerApp(payReq.appId);
        iwxapiCreateWXAPI.sendReq(payReq);
    }

    public static boolean b(String str) {
        return WXAPIFactory.createWXAPI(AppUtil.getApp(), str).isWXAppInstalled();
    }
}
