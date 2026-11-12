package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.inter.AdContentRequestFactory;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class q extends j {
    private Context d;

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) throws JSONException {
        this.d = context.getApplicationContext();
        hw.b("JsbGetApiReqBody", "get js api req body.");
        if (hw.a()) {
            hw.a("JsbGetApiReqBody", str);
        }
        JSONObject jSONObject = new JSONObject(str);
        String[] strArrA = com.huawei.openalliance.ad.utils.dg.a(jSONObject.optJSONArray(JsbMapKeyNames.H5_SLOT_IDS));
        int iOptInt = jSONObject.optInt("adType", -1);
        int iOptInt2 = jSONObject.optInt("deviceType", 4);
        RequestOptions requestOptionsC = c(context, str);
        com.huawei.hms.ads.jsb.inner.data.a.C0095a c0095a = new com.huawei.hms.ads.jsb.inner.data.a.C0095a();
        a(jSONObject, str, c0095a);
        com.huawei.hms.ads.jsb.inner.data.a aVarA = c0095a.a();
        boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.SUPPORT_TEMPLATE_AD, false);
        String strOptString = jSONObject.optString(JsbMapKeyNames.JSSDK_VERSION);
        aVarA.a(zOptBoolean);
        if (com.huawei.openalliance.ad.utils.dg.d(strOptString)) {
            aVarA.a(strOptString);
        }
        String strA = a(strArrA, iOptInt, iOptInt2, requestOptionsC, aVarA);
        if (TextUtils.isEmpty(strA)) {
            a(remoteCallResultCallback, this.f19295a, 4001, (Object) null, true);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", strA);
        jSONObject2.put("complete", true);
        jSONObject2.put("callBackName", (Object) null);
        hw.b("JsbGetApiReqBody", "notifyResultCallback by callBackJson.");
        a(remoteCallResultCallback, this.f19295a, 1000, jSONObject2);
    }

    private void a(JSONObject jSONObject, String str, com.huawei.hms.ads.jsb.inner.data.a.C0095a c0095a) {
        Integer numValueOf;
        bo boVar;
        String strOptString = jSONObject.optString(JsbMapKeyNames.CREATIVE_TYPES);
        int iOptInt = jSONObject.optInt(JsbMapKeyNames.MEDIA_DIRECTION, -111111);
        int iOptInt2 = jSONObject.optInt(JsbMapKeyNames.MEDIA_ASPECT, -111111);
        int iOptInt3 = jSONObject.optInt(JsbMapKeyNames.AD_WIDTH, -111111);
        int iOptInt4 = jSONObject.optInt(JsbMapKeyNames.AD_HEIGHT, -111111);
        String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_MEDIA_CONTENT);
        if (!TextUtils.isEmpty(strOptString)) {
            List<Integer> listB = com.huawei.openalliance.ad.utils.dg.b(strOptString, ";");
            if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
                c0095a.a(listB);
            }
        }
        if (iOptInt != -111111) {
            if (iOptInt == 0) {
                boVar = bo.ANY;
            } else if (iOptInt != 1) {
                boVar = iOptInt != 2 ? bo.UNKNOWN : bo.LAND;
            } else {
                boVar = bo.PORTRAIT;
            }
            numValueOf = Integer.valueOf(boVar.a());
        } else {
            numValueOf = null;
        }
        if (iOptInt2 != -111111 && bo.ANY.a(iOptInt2)) {
            numValueOf = Integer.valueOf(iOptInt2);
        }
        if (numValueOf != null) {
            c0095a.a(numValueOf.intValue() == bo.CUSTOM.a() ? 0 : Integer.valueOf(numValueOf.intValue() + 2));
        }
        if (iOptInt4 != -111111 && iOptInt3 != -111111) {
            c0095a.b(Integer.valueOf(iOptInt3));
            c0095a.c(Integer.valueOf(iOptInt4));
        }
        try {
            c0095a.a(g(str));
        } catch (Throwable unused) {
            hw.c("JsbGetApiReqBody", "get loc error.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        c0095a.a(strOptString2);
    }

    private String a(String[] strArr, int i, int i2, RequestOptions requestOptions, com.huawei.hms.ads.jsb.inner.data.a aVar) {
        String strA;
        if (com.huawei.openalliance.ad.utils.bm.a(strArr) || -1 == i) {
            hw.b("JsbGetApiReqBody", "get body without slotId and type.");
            strA = AdContentRequestFactory.a(this.d, i2, requestOptions, aVar);
        } else {
            hw.b("JsbGetApiReqBody", "get req body.");
            strA = AdContentRequestFactory.a(this.d, strArr, i, i2, requestOptions, aVar, null);
        }
        if (hw.a()) {
            hw.a("JsbGetApiReqBody", "reqBody: %s", strA);
        }
        return strA;
    }

    public q() {
        super("pps.api.req.getbody");
    }
}
