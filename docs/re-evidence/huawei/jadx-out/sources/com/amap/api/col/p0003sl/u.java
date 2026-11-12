package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends id<String, a> {
    private boolean j;
    private int[] k;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3292c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3290a = -1;
        public boolean d = false;
    }

    @Override // com.amap.api.col.p0003sl.id
    protected final String c() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    public u(Context context, String str) {
        super(context, str);
        this.j = true;
        this.k = new int[]{10000, 0, 10018, 10019, 10020, 10021, 10022, 10023};
        this.h = "/feedback";
        this.isPostFlag = false;
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.id
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(String str) throws ic {
        String strOptString;
        int iOptInt;
        String strOptString2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("errcode")) {
                strOptString = "";
                iOptInt = -1;
                strOptString2 = "";
            } else {
                iOptInt = jSONObject.optInt("errcode");
                strOptString = jSONObject.optString("errmsg");
                strOptString2 = jSONObject.optString("errdetail");
            }
            a aVar = new a();
            aVar.f3290a = iOptInt;
            aVar.f3291b = strOptString;
            aVar.f3292c = strOptString2;
            aVar.d = false;
            for (int i : this.k) {
                if (i == iOptInt) {
                    aVar.d = true;
                    return aVar;
                }
            }
            return aVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put(MedalConstants.EVENT_KEY, il.f(this.g));
        if (this.j) {
            hashtable.put("pname", "3dmap");
        }
        String strA = io.a();
        String strA2 = io.a(this.g, strA, iy.b(hashtable));
        hashtable.put("ts", strA);
        hashtable.put("scode", strA2);
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + this.h;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return eb.a(getURL());
    }
}
