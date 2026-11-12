package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes22.dex */
public class cx {
    private static C1648r a = new C1648r(true);
    private static volatile int b = -1;
    private static long c = System.currentTimeMillis();
    private static final Object d = new Object();
    private static List<a> e = Collections.synchronizedList(new ArrayList());
    private static String f = "";
    private static com.xiaomi.push.providers.a g = null;

    public static class a {
        public String a;
        public long b;
        public int c;
        public int d;
        public String e;
        public long f;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.a = "";
            this.b = 0L;
            this.c = -1;
            this.d = -1;
            this.e = "";
            this.f = 0L;
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.f = j2;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.a, this.a) && TextUtils.equals(aVar.e, this.e) && aVar.c == this.c && aVar.d == this.d && Math.abs(aVar.b - this.b) <= 5000;
        }
    }

    public static int a(Context context) {
        if (b == -1) {
            b = j(context);
        }
        return b;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m3649a(Context context) {
        b = j(context);
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        g(context, str, b(a(context), j, z, j2, z2), z, j2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized void m3650a(String str) {
        if (!com.xiaomi.channel.commonutils.android.f.m3430c() && !TextUtils.isEmpty(str)) {
            f = str;
        }
    }

    private static long b(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = c;
            c = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    private static com.xiaomi.push.providers.a c(Context context) {
        com.xiaomi.push.providers.a aVar = g;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        g = aVar2;
        return aVar2;
    }

    private static synchronized String e(Context context) {
        if (TextUtils.isEmpty(f)) {
            return "";
        }
        return f;
    }

    private static void g(Context context, String str, long j, boolean z, long j2) {
        int iA;
        boolean zIsEmpty;
        if (context == null || TextUtils.isEmpty(str) || !PkgNameConstants.XMSF.equals(context.getPackageName()) || PkgNameConstants.XMSF.equals(str) || -1 == (iA = a(context))) {
            return;
        }
        synchronized (d) {
            zIsEmpty = e.isEmpty();
            i(new a(str, j2, iA, z ? 1 : 0, iA == 0 ? e(context) : "", j));
        }
        if (zIsEmpty) {
            a.a(new o0(context), 5000L);
        }
    }

    private static void i(a aVar) {
        for (a aVar2 : e) {
            if (aVar2.a(aVar)) {
                aVar2.f += aVar.f;
                return;
            }
        }
        e.add(aVar);
    }

    private static int j(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.a) {
                SQLiteDatabase writableDatabase = c(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (a aVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", aVar.a);
                        contentValues.put("message_ts", Long.valueOf(aVar.b));
                        contentValues.put("network_type", Integer.valueOf(aVar.c));
                        contentValues.put(HTTP.CONTENT_RANGE_BYTES, Long.valueOf(aVar.f));
                        contentValues.put("rcv", Integer.valueOf(aVar.d));
                        contentValues.put("imsi", aVar.e);
                        writableDatabase.insert("traffic", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
        }
    }
}
