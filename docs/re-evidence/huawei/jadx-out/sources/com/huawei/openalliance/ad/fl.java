package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class fl implements gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18802a = new byte[0];
    private static gh e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f18803b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18804c;
    private final SharedPreferences d;

    @Override // com.huawei.openalliance.ad.gh
    public void a(Map<String, String> map) {
        synchronized (this.f18803b) {
            if (!com.huawei.openalliance.ad.utils.br.a(map)) {
                Map map2 = (Map) com.huawei.openalliance.ad.utils.bk.b(this.d.getString("splashPreloadMode", ""), Map.class, new Class[0]);
                if (com.huawei.openalliance.ad.utils.br.a(map2)) {
                    map2 = new HashMap();
                }
                map2.putAll(map);
                this.d.edit().putString("splashPreloadMode", com.huawei.openalliance.ad.utils.bk.b(map2)).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gh
    public String a() {
        String string;
        synchronized (this.f18803b) {
            string = this.d.getString("splashPreloadMode", "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gh
    public int a(String str) {
        Integer numJ;
        synchronized (this.f18803b) {
            Map map = (Map) com.huawei.openalliance.ad.utils.bk.b(this.d.getString("splashPreloadMode", ""), Map.class, new Class[0]);
            if (!com.huawei.openalliance.ad.utils.br.a(map) && (numJ = com.huawei.openalliance.ad.utils.dg.j((String) map.get(str))) != null && numJ.intValue() >= 0) {
                return numJ.intValue();
            }
            return 1;
        }
    }

    private static gh b(Context context) {
        gh ghVar;
        synchronized (f18802a) {
            if (e == null) {
                e = new fl(context);
            }
            ghVar = e;
        }
        return ghVar;
    }

    public static gh a(Context context) {
        return b(context);
    }

    private fl(Context context) {
        Context contextI = com.huawei.openalliance.ad.utils.ab.i(context.getApplicationContext());
        this.f18804c = contextI;
        this.d = contextI.getSharedPreferences("HiAd_preload_sp", 0);
    }
}
