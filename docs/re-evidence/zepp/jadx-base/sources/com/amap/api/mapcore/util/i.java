package com.amap.api.mapcore.util;

import android.content.Context;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends gb<String, a> {
    private boolean j;
    private int[] k;

    public static class a {
        public String b;
        public String c;
        public int a = -1;
        public boolean d = false;
    }

    public i(Context context, String str) {
        super(context, str);
        this.j = true;
        this.k = new int[]{10000, 0, 10018, 10019, 10020, 10021, 10022, 10023};
        ((gb) this).h = "/feedback";
        this.isPostFlag = false;
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.mapcore.util.gb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(String str) throws ga {
        String strOptString;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = -1;
            String strOptString2 = "";
            if (jSONObject.has("errcode")) {
                iOptInt = jSONObject.optInt("errcode");
                strOptString2 = jSONObject.optString("errmsg");
                strOptString = jSONObject.optString("errdetail");
            } else {
                strOptString = "";
            }
            a aVar = new a();
            aVar.a = iOptInt;
            aVar.b = strOptString2;
            aVar.c = strOptString;
            aVar.d = false;
            for (int i : this.k) {
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

    @Override // com.amap.api.mapcore.util.gb
    public final String d() {
        return null;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getIPV6URL() {
        return er.a(getURL());
    }

    @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", gj.f(((gb) this).g));
        if (this.j) {
            hashtable.put("pname", "3dmap");
        }
        String strA = gm.a();
        String strA2 = gm.a(((gb) this).g, strA, gu.b(hashtable));
        hashtable.put(AuthHandler.d, strA);
        hashtable.put("scode", strA2);
        return hashtable;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + ((gb) this).h;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final boolean isSupportIPV6() {
        return true;
    }
}
