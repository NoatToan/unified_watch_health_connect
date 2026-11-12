package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.u;
import com.amap.api.services.core.AMapException;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class qxs extends u<String, String> {
    public String y;

    public qxs(Context context, String str) {
        super(context, str);
        this.y = str;
    }

    private static String b(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strV = fvs.v(jSONObject, "code");
            String strV2 = fvs.v(jSONObject, "message");
            if ("1".equals(strV)) {
                return fvs.v(jSONObject, "transfer_url");
            }
            if ("0".equals(strV)) {
                throw new AMapException(AMapException.AMAP_SERVICE_UNKNOWN_ERROR, 0, strV2);
            }
            if ("2".equals(strV)) {
                throw new AMapException(AMapException.AMAP_SHARE_FAILURE, 0, strV2);
            }
            if ("3".equals(strV)) {
                throw new AMapException(AMapException.AMAP_SERVICE_INVALID_PARAMS, 0, strV2);
            }
            if ("4".equals(strV)) {
                throw new AMapException("用户签名未通过", 0, strV2);
            }
            if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equals(strV)) {
                throw new AMapException(AMapException.AMAP_SHARE_LICENSE_IS_EXPIRED, 0, strV2);
            }
            return null;
        } catch (JSONException e) {
            xts.i(e, "ShareUrlSearchHandler", "paseJSON");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.u
    public final /* synthetic */ String e(String str) throws AMapException {
        return b(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        byte[] bArrA;
        StringBuilder sb = new StringBuilder();
        sb.append("channel=open_api&flag=1");
        sb.append("&address=" + URLEncoder.encode(this.y));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("open_api1");
        stringBuffer.append(this.y);
        stringBuffer.append("@8UbJH6N2szojnTHONAWzB6K7N1kaj7Y0iUMarxac");
        String strD = m0t.d(stringBuffer.toString());
        sb.append("&sign=");
        sb.append(strD.toUpperCase(Locale.US));
        sb.append("&output=json");
        try {
            bArrA = nys.a(sb.toString().getBytes("utf-8"), "Yaynpa84IKOfasFx".getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            xts.i(e, "ShareUrlSearchHandler", "getParams");
            bArrA = null;
        }
        HashMap map = new HashMap();
        map.put("ent", "2");
        map.put("in", j0t.f(bArrA));
        map.put("keyt", "openapi");
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.h();
    }
}
