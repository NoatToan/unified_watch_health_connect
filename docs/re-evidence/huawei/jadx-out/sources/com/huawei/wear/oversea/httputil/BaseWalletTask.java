package com.huawei.wear.oversea.httputil;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import defpackage.xmp;
import defpackage.xms;
import defpackage.xnd;
import defpackage.xnl;
import defpackage.xnx;
import defpackage.xov;
import defpackage.xpi;
import defpackage.xpn;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
@Deprecated
public abstract class BaseWalletTask<Result, RequestParams> extends HttpConnTask<Result, RequestParams> {
    private static final String TAG = "BaseWalletTask";
    private String mUrl;

    protected abstract String getTag();

    protected abstract void makeResponseData(xnl xnlVar, JSONObject jSONObject) throws JSONException;

    public BaseWalletTask(Context context, String str) {
        super(context, str);
        this.mUrl = str;
    }

    public BaseWalletTask(Context context, String str, int i, int i2) {
        super(context, str, i, i2);
    }

    public BaseWalletTask(Context context, String str, int i, Map<String, String> map, Map<String, String> map2) {
        super(context, str, i, map, map2);
    }

    protected void resolveResponse(xnl xnlVar, String str) {
        String tag = getTag();
        if (xpi.d(str, true)) {
            xnd.d(tag, "responseStr is null", false);
            xnlVar.f53201b = -99;
            return;
        }
        try {
            boolean zE = xmp.e(this.mUrl);
            xnd.d(TAG, "resolveResponse restUrlCheck isRestFul : " + zE);
            if (!zE) {
                JSONObject jSONObject = new JSONObject(str);
                String strD = xpn.d(jSONObject, "merchantID");
                int iB = xpn.b(jSONObject, "keyIndex");
                String strD2 = xpn.d(jSONObject, "response");
                String strD3 = xpn.d(jSONObject, "errorCode");
                String strD4 = xpn.d(jSONObject, "errorMsg");
                if (strD3 != null) {
                    xnd.d(TAG, ", " + (" code:" + strD3 + " msg:" + strD4), false);
                    xnlVar.f53201b = Integer.parseInt(strD3);
                    return;
                }
                if (xov.a().equals(strD) && !xpi.d(strD2, true) && iB == -1) {
                    str = strD2;
                }
                xnd.c(TAG, ", unexpected error from server.", false);
                xnlVar.f53201b = -99;
                return;
            }
            xnd.c(TAG, ", decryptedResponse : " + str, true);
            JSONObject jSONObject2 = new JSONObject(str);
            String strD5 = xpn.d(jSONObject2, "returnCode");
            String strD6 = xpn.d(jSONObject2, "returnDesc");
            String strD7 = xpn.d(jSONObject2, "header");
            if (!TextUtils.isEmpty(strD7)) {
                xnlVar.e = (xms) new Gson().fromJson(strD7, xms.class);
            }
            if (strD5 == null) {
                xnd.c(TAG, ", returnCode is invalid.", false);
                xnlVar.f53201b = -99;
                return;
            }
            xnlVar.f53201b = Integer.parseInt(strD5);
            if (!TextUtils.isEmpty(strD6)) {
                xnlVar.g = strD6;
            }
            if (xnlVar.f53201b != 0) {
                xnd.d(TAG, ", returnDesc : ", false);
            } else {
                makeResponseData(xnlVar, jSONObject2);
            }
        } catch (JsonSyntaxException unused) {
            xnd.d(TAG, ", JsonSyntaxException : ", true);
            xnlVar.f53201b = -99;
        } catch (NoSuchMethodError unused2) {
            xnd.d(TAG, ", NoSuchMethodError : ", true);
            xnlVar.f53201b = -99;
        } catch (NumberFormatException unused3) {
            xnd.d(TAG, ", NumberFormatException : ", true);
            xnlVar.f53201b = -99;
        } catch (JSONException unused4) {
            xnd.d(TAG, ", JSONException : ", true);
            xnlVar.f53201b = -99;
        }
    }

    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    protected void onReportEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3)) {
            str3 = getTag();
        }
        String str7 = "commander:" + str3 + "; srcTranID:" + str5 + ";  ; result:" + str + "; returnCode:" + str2 + "; ";
        xnd.b(getTag(), "HttpConnTask onReportEvent, action:" + str4 + ", Report data: " + str7, false);
        xnx.b(str4, str7 + " exception:" + str6);
    }
}
