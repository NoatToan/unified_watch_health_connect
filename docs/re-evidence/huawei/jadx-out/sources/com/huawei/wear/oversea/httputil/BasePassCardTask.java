package com.huawei.wear.oversea.httputil;

import android.content.Context;
import com.amap.api.maps.model.MyLocationStyle;
import defpackage.xnd;
import defpackage.xnl;
import defpackage.xno;
import defpackage.xpi;
import defpackage.xpn;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public abstract class BasePassCardTask<Result, RequestParams> extends BaseWalletTask<Result, RequestParams> {
    private static final String TAG = "BasePassCardTask";

    public BasePassCardTask(Context context, String str) {
        super(context, str);
    }

    public BasePassCardTask(Context context, String str, int i, int i2) {
        super(context, str, i, i2);
    }

    public BasePassCardTask(Context context, String str, int i, Map<String, String> map) {
        super(context, str, i, map, null);
    }

    @Override // com.huawei.wear.oversea.httputil.BaseWalletTask
    protected void resolveResponse(xnl xnlVar, String str) {
        String tag = getTag();
        if (xpi.d(str, true)) {
            xnd.d(tag, "resolveResponse responseStr is null", false);
            xnlVar.f53201b = -99;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strD = xpn.d(jSONObject, "errorCode");
            String strD2 = xpn.d(jSONObject, "errorMsg");
            if (strD != null) {
                String str2 = TAG;
                xnd.d(str2, ", " + (" code:" + strD + " msg:" + strD2), false);
                xnlVar.f53201b = Integer.parseInt(strD);
                return;
            }
            String strD3 = xpn.d(jSONObject, "returnCode");
            String strD4 = xpn.d(jSONObject, "returnDesc");
            if (jSONObject.has(MyLocationStyle.ERROR_INFO)) {
                xnlVar.c(xno.b(jSONObject.getJSONObject(MyLocationStyle.ERROR_INFO)));
            }
            if (strD3 == null) {
                xnd.d(TAG, ", returnCode is invalid.", false);
                xnlVar.f53201b = -99;
                return;
            }
            xnlVar.f53201b = Integer.parseInt(strD3);
            if (xnlVar.f53201b != 0) {
                String str3 = " code:" + xnlVar.f53201b + " desc:" + strD4;
                xnd.d(TAG, ", returnDesc : err " + str3, false);
                return;
            }
            makeResponseData(xnlVar, jSONObject);
        } catch (NoSuchMethodError unused) {
            xnd.c(TAG, "resolveResponse, NoSuchMethodError", false);
            xnlVar.f53201b = -99;
        } catch (NumberFormatException unused2) {
            xnd.c(TAG, "resolveResponse, NumberFormatException", false);
            xnlVar.f53201b = -99;
        } catch (JSONException unused3) {
            xnd.c(TAG, "resolveResponse, JSONException", false);
            xnlVar.f53201b = -99;
        }
    }
}
