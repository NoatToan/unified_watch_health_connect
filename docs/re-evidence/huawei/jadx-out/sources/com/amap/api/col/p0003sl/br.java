package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile br f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ke f2284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2285c;

    public static br a(Context context) {
        if (f2283a == null) {
            synchronized (br.class) {
                if (f2283a == null) {
                    f2283a = new br(context);
                }
            }
        }
        return f2283a;
    }

    private br(Context context) {
        this.f2285c = context;
        f2284b = b(context);
    }

    private static ke b(Context context) {
        try {
            return new ke(context, bq.a());
        } catch (Throwable th) {
            jv.c(th, "OfflineDB", "getDB");
            th.printStackTrace();
            return null;
        }
    }

    private boolean b() {
        if (f2284b == null) {
            f2284b = b(this.f2285c);
        }
        return f2284b != null;
    }

    public final ArrayList<bm> a() {
        ArrayList<bm> arrayList = new ArrayList<>();
        if (b()) {
            Iterator it = f2284b.b("", bm.class).iterator();
            while (it.hasNext()) {
                arrayList.add((bm) it.next());
            }
        }
        return arrayList;
    }

    public final bm a(String str) {
        synchronized (this) {
            if (!b()) {
                return null;
            }
            List listB = f2284b.b(bm.e(str), bm.class);
            if (listB.size() <= 0) {
                return null;
            }
            return (bm) listB.get(0);
        }
    }

    public final void a(bm bmVar) {
        synchronized (this) {
            if (b()) {
                f2284b.a(bmVar, bm.f(bmVar.h()));
                a(bmVar.e(), bmVar.a());
            }
        }
    }

    private static void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        String strA = bo.a(str);
        if (f2284b.b(strA, bo.class).size() > 0) {
            f2284b.a(strA, bo.class);
        }
        String[] strArrSplit = str2.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            arrayList.add(new bo(str, str3));
        }
        f2284b.a((List) arrayList);
    }

    public final List<String> b(String str) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (!b()) {
                return arrayList;
            }
            arrayList.addAll(a((List<bo>) f2284b.b(bo.a(str), bo.class)));
            return arrayList;
        }
    }

    private static List<String> a(List<bo> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            Iterator<bo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }

    public final void c(String str) {
        synchronized (this) {
            if (b()) {
                f2284b.a(bp.e(str), bp.class);
                f2284b.a(bo.a(str), bo.class);
                f2284b.a(bn.a(str), bn.class);
            }
        }
    }

    public final void b(bm bmVar) {
        synchronized (this) {
            if (b()) {
                f2284b.a(bp.f(bmVar.h()), bp.class);
                f2284b.a(bo.a(bmVar.e()), bo.class);
                f2284b.a(bn.a(bmVar.e()), bn.class);
            }
        }
    }

    public final void a(String str, int i, long j, long j2, long j3) {
        if (b()) {
            a(str, i, j, new long[]{j2, 0, 0, 0, 0}, new long[]{j3, 0, 0, 0, 0});
        }
    }

    private void a(String str, int i, long j, long[] jArr, long[] jArr2) {
        synchronized (this) {
            if (b()) {
                f2284b.a(new bn(str, j, i, jArr[0], jArr2[0]), bn.a(str));
            }
        }
    }

    public final String d(String str) {
        synchronized (this) {
            if (!b()) {
                return null;
            }
            List listB = f2284b.b(bp.f(str), bp.class);
            return listB.size() > 0 ? ((bp) listB.get(0)).d() : null;
        }
    }
}
