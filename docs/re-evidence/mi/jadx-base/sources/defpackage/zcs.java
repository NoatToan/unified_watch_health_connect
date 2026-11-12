package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zcs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zcs f41133b;
    public static a4t c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41134a;

    public zcs(Context context) {
        this.f41134a = context;
        c = j(context);
    }

    public static zcs b(Context context) {
        if (f41133b == null) {
            synchronized (zcs.class) {
                try {
                    if (f41133b == null) {
                        f41133b = new zcs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41133b;
    }

    public static List<String> d(List<ocs> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            Iterator<ocs> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }

    public static void h(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        String strB = ocs.b(str);
        if (c.o(strB, ocs.class).size() > 0) {
            c.j(strB, ocs.class);
        }
        String[] strArrSplit = str2.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            arrayList.add(new ocs(str, str3));
        }
        c.l(arrayList);
    }

    public static a4t j(Context context) {
        try {
            return new a4t(context, vcs.a());
        } catch (Throwable th) {
            m2t.r(th, "OfflineDB", "getDB");
            th.printStackTrace();
            return null;
        }
    }

    public final synchronized gcs a(String str) {
        if (!l()) {
            return null;
        }
        List listO = c.o(scs.f(str), gcs.class);
        if (listO.size() <= 0) {
            return null;
        }
        return (gcs) listO.get(0);
    }

    public final ArrayList<gcs> c() {
        ArrayList<gcs> arrayList = new ArrayList<>();
        if (!l()) {
            return arrayList;
        }
        Iterator it = c.o("", gcs.class).iterator();
        while (it.hasNext()) {
            arrayList.add((gcs) it.next());
        }
        return arrayList;
    }

    public final synchronized void e(gcs gcsVar) {
        if (l()) {
            c.h(gcsVar, scs.h(gcsVar.j()));
            h(gcsVar.e(), gcsVar.k());
        }
    }

    public final void f(String str, int i, long j, long j2, long j3) {
        if (l()) {
            g(str, i, j, new long[]{j2, 0, 0, 0, 0}, new long[]{j3, 0, 0, 0, 0});
        }
    }

    public final synchronized void g(String str, int i, long j, long[] jArr, long[] jArr2) {
        if (l()) {
            c.h(new kcs(str, j, i, jArr[0], jArr2[0]), kcs.a(str));
        }
    }

    public final synchronized List<String> i(String str) {
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return arrayList;
        }
        arrayList.addAll(d(c.o(ocs.b(str), ocs.class)));
        return arrayList;
    }

    public final synchronized void k(gcs gcsVar) {
        if (l()) {
            c.j(scs.h(gcsVar.j()), scs.class);
            c.j(ocs.b(gcsVar.e()), ocs.class);
            c.j(kcs.a(gcsVar.e()), kcs.class);
        }
    }

    public final boolean l() {
        if (c == null) {
            c = j(this.f41134a);
        }
        return c != null;
    }

    public final synchronized void m(String str) {
        if (l()) {
            c.j(scs.f(str), scs.class);
            c.j(ocs.b(str), ocs.class);
            c.j(kcs.a(str), kcs.class);
        }
    }

    public final synchronized String n(String str) {
        if (!l()) {
            return null;
        }
        List listO = c.o(scs.h(str), scs.class);
        return listO.size() > 0 ? ((scs) listO.get(0)).c() : null;
    }
}
