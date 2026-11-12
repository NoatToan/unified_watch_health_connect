package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.ic;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dft extends szs<String, a> {
    public boolean w;
    public int[] x;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15499b;
        public String c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15498a = -1;
        public boolean d = false;
    }

    public dft(Context context, String str) {
        super(context, str);
        this.x = new int[]{10000, 0, 10018, 10019, 10020, ErrorCode.SE_APP_NOT_FOUND, 10022, 10023};
        this.u = "/feedback";
        this.isPostFlag = false;
        this.w = true;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return zns.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", e0t.k(this.t));
        if (this.w) {
            hashtable.put("pname", "3dmap");
        }
        String strA = g0t.a();
        String strC = g0t.c(this.t, strA, p0t.q(hashtable));
        hashtable.put(DeviceTagInterface.TAG_DATA_START, strA);
        hashtable.put("scode", strC);
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + this.u;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // defpackage.szs
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final a e(String str) throws ic {
        String strOptString;
        int iOptInt;
        String strOptString2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(CommonConstants.KEY_ERR_CODE)) {
                iOptInt = jSONObject.optInt(CommonConstants.KEY_ERR_CODE);
                strOptString = jSONObject.optString("errmsg");
                strOptString2 = jSONObject.optString("errdetail");
            } else {
                strOptString = "";
                iOptInt = -1;
                strOptString2 = "";
            }
            a aVar = new a();
            aVar.f15498a = iOptInt;
            aVar.f15499b = strOptString;
            aVar.c = strOptString2;
            aVar.d = false;
            for (int i : this.x) {
                if (i == iOptInt) {
                    aVar.d = true;
                    break;
                }
            }
            return aVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
