package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.passport.sim.SIMInfo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class xys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z5s f39597a = new z5s(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile int f39598b = -1;
    public static long c = System.currentTimeMillis();
    public static final Object d = new Object();
    public static List<a> e = Collections.synchronizedList(new ArrayList());
    public static String f = "";
    public static m3s g = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f39599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f39600b;
        public int c;
        public int d;
        public String e;
        public long f;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.f39599a = str;
            this.f39600b = j;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.f = j2;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.f39599a, this.f39599a) && TextUtils.equals(aVar.e, this.e) && aVar.c == this.c && aVar.d == this.d && Math.abs(aVar.f39600b - this.f39600b) <= 5000;
        }
    }

    public static int a(Context context) {
        if (f39598b == -1) {
            f39598b = n(context);
        }
        return f39598b;
    }

    public static int b(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    public static long c(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = c;
            c = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    public static m3s d(Context context) {
        m3s m3sVar = g;
        if (m3sVar != null) {
            return m3sVar;
        }
        m3s m3sVar2 = new m3s(context);
        g = m3sVar2;
        return m3sVar2;
    }

    public static synchronized String f(Context context) {
        if (TextUtils.isEmpty(f)) {
            return "";
        }
        return f;
    }

    public static void h(Context context) {
        f39598b = n(context);
    }

    public static void i(Context context, String str, long j, boolean z, long j2) {
        int iA;
        boolean zIsEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (iA = a(context))) {
            return;
        }
        synchronized (d) {
            try {
                zIsEmpty = e.isEmpty();
                l(new a(str, j2, iA, z ? 1 : 0, iA == 0 ? f(context) : "", j));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsEmpty) {
            f39597a.f(new yys(context), 5000L);
        }
    }

    public static void j(Context context, String str, long j, boolean z, boolean z2, long j2) {
        i(context, str, c(a(context), j, z, j2, z2), z, j2);
    }

    public static void l(a aVar) {
        for (a aVar2 : e) {
            if (aVar2.a(aVar)) {
                aVar2.f += aVar.f;
                return;
            }
        }
        e.add(aVar);
    }

    public static synchronized void m(String str) {
        if (!y0t.t() && !TextUtils.isEmpty(str)) {
            f = str;
        }
    }

    public static int n(Context context) {
        xbs xbsVarE = obs.e();
        if (xbsVarE == null) {
            return -1;
        }
        return xbsVarE.a();
    }

    public static void o(Context context, List<a> list) {
        try {
            synchronized (m3s.f25728b) {
                try {
                    SQLiteDatabase writableDatabase = d(context).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        for (a aVar : list) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("package_name", aVar.f39599a);
                            contentValues.put("message_ts", Long.valueOf(aVar.f39600b));
                            contentValues.put("network_type", Integer.valueOf(aVar.c));
                            contentValues.put("bytes", Long.valueOf(aVar.f));
                            contentValues.put("rcv", Integer.valueOf(aVar.d));
                            contentValues.put(SIMInfo.SIM_INFO_TYPE_IMSI, aVar.e);
                            writableDatabase.insert("traffic", null, contentValues);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            x9s.s(th3);
        }
    }
}
