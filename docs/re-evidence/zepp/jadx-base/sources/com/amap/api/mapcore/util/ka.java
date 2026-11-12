package com.amap.api.mapcore.util;

import android.content.Context;
import com.loopj.android.http.AsyncHttpClient;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ka {
    private static ka b;
    public ik a;
    private Context c;
    private int d = ke.i;
    private boolean e = false;
    private int f = 0;

    private ka(Context context) {
        this.a = null;
        this.c = null;
        try {
            gp.a().a(context);
        } catch (Throwable unused) {
        }
        this.c = context;
        this.a = ik.a();
    }

    public static ka a(Context context) {
        if (b == null) {
            b = new ka(context);
        }
        return b;
    }

    public final is a(kb kbVar) throws Throwable {
        if (this.e) {
            kbVar.setHttpProtocol(ir.c.HTTPS);
        }
        return ik.b(kbVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00d8 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:4:0x0012, B:6:0x007a, B:7:0x0081, B:14:0x00de, B:16:0x00e5, B:18:0x00f5, B:12:0x00d8), top: B:25:0x0012 }] */
    public final kb a(Context context, byte[] bArr, String str, String str2) {
        String str3;
        try {
            HashMap map = new HashMap(16);
            kb kbVar = new kb(context, ke.c());
            try {
                map.put("Content-Type", "application/octet-stream");
                map.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                map.put("gzipped", "1");
                map.put("Connection", "Keep-Alive");
                map.put("User-Agent", "AMAP_Location_SDK_Android 5.3.1");
                map.put("KEY", gj.f(context));
                map.put("enginever", ke.a);
                String strA = gm.a();
                String strA2 = gm.a(context, strA, "key=" + gj.f(context));
                map.put(AuthHandler.d, strA);
                map.put("scode", strA2);
                if (Double.valueOf(ke.a).doubleValue() >= 5.3d) {
                    map.put("aps_s_src", "openapi");
                }
                map.put("encr", "1");
                kbVar.g = map;
                kbVar.o = true;
                kbVar.m = String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "5.3.1", "loc", 3);
                kbVar.l = true;
                kbVar.h = str;
                kbVar.i = str2;
                kbVar.j = ki.a(bArr);
                kbVar.setProxy(gs.a(context));
                HashMap map2 = new HashMap(16);
                map2.put("output", "bin");
                map2.put("policy", "3103");
                int i = this.f;
                if (i == 0) {
                    map2.remove("custom");
                } else {
                    if (i == 1) {
                        str3 = "language:cn";
                    } else if (i != 2) {
                        map2.remove("custom");
                    } else {
                        str3 = "language:en";
                    }
                    map2.put("custom", str3);
                }
                kbVar.n = map2;
                kbVar.setConnectionTimeout(this.d);
                kbVar.setSoTimeout(this.d);
                if (!this.e) {
                    return kbVar;
                }
                kbVar.setHttpProtocol(ir.c.HTTPS);
                return kbVar;
            } catch (Throwable unused) {
                return kbVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final void a(long j, boolean z) {
        try {
            this.e = z;
            this.d = Long.valueOf(j).intValue();
            this.f = 0;
        } catch (Throwable th) {
            ke.a(th, "LocNetManager", "setOption");
        }
    }
}
