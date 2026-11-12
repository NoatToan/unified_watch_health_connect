package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18733a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static eu f18734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f18735c;
    private static Boolean d;
    private static Boolean e;
    private String f;

    public boolean b(Context context) {
        if (f18735c == null) {
            f18735c = Boolean.valueOf(cc.a(context).d());
        }
        if (d == null) {
            d = Boolean.valueOf(cc.b(context));
        }
        if (e == null) {
            e = Boolean.valueOf(com.huawei.openalliance.ad.utils.ab.o(context) || com.huawei.openalliance.ad.utils.ab.n(context));
        }
        hw.a("CaHandler", "check result [" + d + " " + f18735c + " " + e + "]");
        return f18735c.booleanValue() && d.booleanValue() && e.booleanValue() && cc.a(context).l();
    }

    public void a(String str) {
        this.f = str;
    }

    public String a(Context context) {
        if (context == null || com.huawei.openalliance.ad.utils.dg.b(this.f) || !b(context)) {
            return "";
        }
        try {
            if (System.currentTimeMillis() - new JSONObject(this.f).optLong(Constants.CA_LOCATION_UPDATE_TIME) > fp.b(context).ar()) {
                hw.c("CaHandler", "Invalid time");
                this.f = "";
            }
            return this.f;
        } catch (Exception unused) {
            hw.d("CaHandler", "Get valid ca exception");
            return "";
        }
    }

    public static eu a() {
        synchronized (f18733a) {
            if (f18734b == null) {
                f18734b = new eu();
            }
        }
        return f18734b;
    }

    private eu() {
    }
}
