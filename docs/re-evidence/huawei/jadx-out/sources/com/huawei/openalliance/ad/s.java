package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.inter.AdContentResponseParser;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class s extends j {
    public boolean d;

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        String str2;
        if (hw.a()) {
            hw.a("JsbParseApiAd", "param content: %s", str);
        }
        JSONObject jSONObject = new JSONObject(str);
        int iOptInt = jSONObject.optInt(JsbMapKeyNames.JSSDK_VER, 2);
        Integer[] numArrB = com.huawei.openalliance.ad.utils.dg.b(jSONObject.optJSONArray(JsbMapKeyNames.H5_AD_TYPES));
        String strOptString = jSONObject.optString(JsbMapKeyNames.H5_API_RSP);
        boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.RETURN_FROM_THREAD, false);
        this.d = zOptBoolean;
        hw.b("JsbParseApiAd", "returnFromThread: %s", Boolean.valueOf(zOptBoolean));
        if (com.huawei.openalliance.ad.utils.bm.a(numArrB)) {
            str2 = "adType is empty";
        } else {
            if (!TextUtils.isEmpty(strOptString)) {
                hw.b("JsbParseApiAd", "parse api response.");
                if (hw.a()) {
                    hw.a("JsbParseApiAd", "rsp: %s", strOptString);
                }
                AdContentResponseParser adContentResponseParserA = a(context, remoteCallResultCallback, numArrB, strOptString, iOptInt);
                if (a(numArrB, 13)) {
                    adContentResponseParserA.processAdResponse(strOptString, true);
                    return;
                } else {
                    adContentResponseParserA.processAdResponse(strOptString);
                    return;
                }
            }
            str2 = "rsp is empty";
        }
        hw.c("JsbParseApiAd", str2);
        a(remoteCallResultCallback, true);
    }

    private boolean a(Integer[] numArr, int i) {
        if (com.huawei.openalliance.ad.utils.bm.a(numArr)) {
            return false;
        }
        for (Integer num : numArr) {
            if (num.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    private AdContentResponseParser a(Context context, RemoteCallResultCallback<String> remoteCallResultCallback, Integer[] numArr, String str, int i) {
        AdContentResponseParser.Builder builder = new AdContentResponseParser.Builder(context);
        builder.enableDirectReturnVideoAd(true);
        if (a(numArr, 3)) {
            builder.setNativeAdListener(new x.a(context, remoteCallResultCallback, this.f19295a, 3, i));
            builder.setAdsReturnedFromThread(this.d);
        } else if (a(numArr, 9)) {
            builder.setIconAdListener(new x.a(context, remoteCallResultCallback, this.f19295a, 9, i));
        } else if (a(numArr, 13)) {
            builder.setSearchAdListener(new x.a(context, remoteCallResultCallback, this.f19295a, 13, i));
        } else if (a(numArr, 7)) {
            builder.setRewardAdListener(new z.a(context, remoteCallResultCallback, this.f19295a));
        } else if (a(numArr, 12)) {
            builder.a(new w.a(context, remoteCallResultCallback, this.f19295a));
        }
        return builder.build();
    }

    public s() {
        super("pps.api.parse.ad");
    }
}
