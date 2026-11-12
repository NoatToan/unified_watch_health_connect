package com.loc;

import android.content.Context;
import com.huami.account.UserLegalInfoManager;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.loopj.android.http.AsyncHttpClient;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public final class ed {
    private static ed b;
    public aq a;
    private Context c;
    private int d = ei.g;
    private boolean e = false;
    private int f = 0;

    private ed(Context context) {
        this.a = null;
        this.c = null;
        try {
            p.a().a(context);
        } catch (Throwable unused) {
        }
        this.c = context;
        this.a = aq.a();
    }

    public static ed a(Context context) {
        if (b == null) {
            b = new ed(context);
        }
        return b;
    }

    public final int a() {
        return this.d;
    }

    public final av a(ee eeVar) throws Throwable {
        return aq.a(eeVar, this.e || eo.k(this.c));
    }

    public final av a(ee eeVar, int i) throws Throwable {
        return aq.a(eeVar, this.e || eo.k(this.c), i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00df A[Catch: all -> 0x0116, TRY_ENTER, TryCatch #1 {all -> 0x0116, blocks: (B:4:0x001b, B:6:0x0078, B:7:0x0087, B:10:0x008f, B:17:0x00e5, B:19:0x00ec, B:21:0x00fc, B:23:0x0102, B:25:0x010a, B:15:0x00df), top: B:32:0x001b }] */
    public final ee a(Context context, byte[] bArr, String str, String str2, boolean z, boolean z2) {
        String str3;
        try {
            HashMap map = new HashMap(16);
            ee eeVar = new ee(context, ei.c());
            try {
                map.put("Content-Type", "application/octet-stream");
                map.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                map.put("gzipped", "1");
                map.put("Connection", "Keep-Alive");
                map.put("User-Agent", "AMAP_Location_SDK_Android 5.0.0");
                map.put("KEY", k.f(context));
                map.put("enginever", "5.1");
                String strA = m.a();
                String strA2 = m.a(context, strA, "key=" + k.f(context));
                map.put(AuthHandler.d, strA);
                map.put("scode", strA2);
                map.put("encr", "1");
                if (z2) {
                    map.put("lct", String.valueOf(eh.d(this.c)));
                }
                eeVar.f = map;
                String str4 = z ? "loc" : "locf";
                eeVar.n = true;
                eeVar.l = String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "5.0.0", str4, 3);
                eeVar.k = z;
                eeVar.g = str;
                eeVar.h = str2;
                eeVar.i = eo.a(bArr);
                eeVar.a(s.a(context));
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
                eeVar.m = map2;
                eeVar.a(this.d);
                eeVar.b(this.d);
                if ((!this.e && !eo.k(context)) || !str.startsWith("http:")) {
                    return eeVar;
                }
                eeVar.g = eeVar.c().replace("https:", "https:");
                return eeVar;
            } catch (Throwable unused) {
                return eeVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f9 A[Catch: all -> 0x0118, TryCatch #3 {all -> 0x0118, blocks: (B:31:0x00ed, B:33:0x00f9, B:35:0x010e, B:34:0x0108), top: B:56:0x00ed, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0108 A[Catch: all -> 0x0118, TryCatch #3 {all -> 0x0118, blocks: (B:31:0x00ed, B:33:0x00f9, B:35:0x010e, B:34:0x0108), top: B:56:0x00ed, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x004a A[Catch: all -> 0x012d, TRY_ENTER, TryCatch #5 {all -> 0x012d, blocks: (B:3:0x0001, B:10:0x0050, B:12:0x0058, B:17:0x00a3, B:30:0x00b9, B:38:0x0119, B:20:0x00a8, B:28:0x00b5, B:42:0x0124, B:46:0x012c, B:45:0x0129, B:8:0x004a, B:26:0x00b0, B:31:0x00ed, B:33:0x00f9, B:35:0x010e, B:34:0x0108), top: B:60:0x0001, inners: #0, #1, #2, #3 }] */
    public final String a(Context context, double d, double d2) {
        byte[] bArrB;
        ByteArrayOutputStream byteArrayOutputStream;
        String str;
        try {
            HashMap map = new HashMap(16);
            ee eeVar = new ee(context, ei.c());
            map.clear();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Connection", "Keep-Alive");
            map.put("User-Agent", "AMAP_Location_SDK_Android 5.0.0");
            HashMap map2 = new HashMap(16);
            map2.put("custom", "26260A1F00020002");
            map2.put("key", k.f(context));
            int i = this.f;
            if (i == 0) {
                map2.remove(UserLegalInfoManager.KEY_LANGUAGE);
            } else {
                if (i == 1) {
                    str = "zh-CN";
                } else if (i != 2) {
                    map2.remove(UserLegalInfoManager.KEY_LANGUAGE);
                } else {
                    str = "en";
                }
                map2.put(UserLegalInfoManager.KEY_LANGUAGE, str);
            }
            try {
                String strA = m.a();
                String strA2 = m.a(context, strA, u.b(map2));
                map2.put(AuthHandler.d, strA);
                map2.put("scode", strA2);
                byte[] bytes = ("output=json&radius=1000&extensions=all&location=" + d2 + "," + d).getBytes("UTF-8");
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    if (bytes != null) {
                        try {
                            byteArrayOutputStream.write(u.a(bytes.length));
                            byteArrayOutputStream.write(bytes);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                th.printStackTrace();
                                if (byteArrayOutputStream == null) {
                                    eeVar.n = false;
                                    eeVar.k = true;
                                    eeVar.l = String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "5.0.0", "loc", 3);
                                    eeVar.m = map2;
                                    eeVar.f = map;
                                    eeVar.a(s.a(context));
                                    eeVar.a(ei.g);
                                    eeVar.b(ei.g);
                                    eeVar.h = "http://dualstack-restapi.amap.com/v3/geocode/regeo";
                                    if (eo.k(context)) {
                                        eeVar.g = "http://restapi.amap.com/v3/geocode/regeo".replace("http:", "https:");
                                        bArrB = aq.a(eeVar);
                                    } else {
                                        eeVar.g = "http://restapi.amap.com/v3/geocode/regeo";
                                        bArrB = aq.b(eeVar);
                                    }
                                    return new String(bArrB, "utf-8");
                                }
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                throw th2;
                            }
                            return null;
                        }
                    }
                    eeVar.j = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            eeVar.n = false;
            eeVar.k = true;
            eeVar.l = String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "5.0.0", "loc", 3);
            eeVar.m = map2;
            eeVar.f = map;
            eeVar.a(s.a(context));
            eeVar.a(ei.g);
            eeVar.b(ei.g);
            try {
                eeVar.h = "http://dualstack-restapi.amap.com/v3/geocode/regeo";
                if (eo.k(context)) {
                    eeVar.g = "http://restapi.amap.com/v3/geocode/regeo".replace("http:", "https:");
                    bArrB = aq.a(eeVar);
                } else {
                    eeVar.g = "http://restapi.amap.com/v3/geocode/regeo";
                    bArrB = aq.b(eeVar);
                }
                return new String(bArrB, "utf-8");
            } catch (Throwable th4) {
                ei.a(th4, "LocNetManager", DataItem.HTTP_METHOD_POST);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(long j, boolean z, int i) {
        try {
            this.e = z;
            try {
                p.a().a(z);
            } catch (Throwable unused) {
            }
            this.d = Long.valueOf(j).intValue();
            this.f = i;
        } catch (Throwable th) {
            ei.a(th, "LocNetManager", "setOption");
        }
    }
}
