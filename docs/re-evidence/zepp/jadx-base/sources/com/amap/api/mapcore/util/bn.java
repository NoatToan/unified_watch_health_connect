package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class bn {
    private static volatile bn a;
    private static hr b;
    private Context c;

    private bn(Context context) {
        this.c = context;
        b = b(context);
    }

    public static bn a(Context context) {
        if (a == null) {
            synchronized (bn.class) {
                if (a == null) {
                    a = new bn(context);
                }
            }
        }
        return a;
    }

    private static hr b(Context context) {
        try {
            return new hr(context, bm.a());
        } catch (Throwable th) {
            hn.c(th, "OfflineDB", "getDB");
            th.printStackTrace();
            return null;
        }
    }

    public final synchronized void c(String str) {
        if (b()) {
            b.a(bl.e(str), bl.class);
            b.a(bk.a(str), bk.class);
            b.a(bj.a(str), bj.class);
        }
    }

    public final synchronized String d(String str) {
        if (!b()) {
            return null;
        }
        List listB = b.b(bl.f(str), bl.class);
        return listB.size() > 0 ? ((bl) listB.get(0)).d() : null;
    }

    private boolean b() {
        if (b == null) {
            b = b(this.c);
        }
        return b != null;
    }

    public final ArrayList<bi> a() {
        ArrayList<bi> arrayList = new ArrayList<>();
        if (!b()) {
            return arrayList;
        }
        Iterator it2 = b.b("", bi.class).iterator();
        while (it2.hasNext()) {
            arrayList.add((bi) it2.next());
        }
        return arrayList;
    }

    public final synchronized List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!b()) {
            return arrayList;
        }
        arrayList.addAll(a((List<bk>) b.b(bk.a(str), bk.class)));
        return arrayList;
    }

    public final synchronized bi a(String str) {
        if (!b()) {
            return null;
        }
        List listB = b.b(bl.e(str), bi.class);
        if (listB.size() <= 0) {
            return null;
        }
        return (bi) listB.get(0);
    }

    public final synchronized void b(bi biVar) {
        if (b()) {
            b.a(bl.f(biVar.m), bl.class);
            b.a(bk.a(biVar.e()), bk.class);
            b.a(bj.a(biVar.e()), bj.class);
        }
    }

    public final synchronized void a(bi biVar) {
        if (b()) {
            b.a(biVar, bl.f(biVar.m));
            String strA = biVar.a();
            String strE = biVar.e();
            if (strA != null && strA.length() > 0) {
                String strA2 = bk.a(strE);
                if (b.b(strA2, bk.class).size() > 0) {
                    b.a(strA2, bk.class);
                }
                String[] strArrSplit = strA.split(";");
                ArrayList arrayList = new ArrayList();
                for (String str : strArrSplit) {
                    arrayList.add(new bk(strE, str));
                }
                b.a(arrayList);
            }
        }
    }

    private static List<String> a(List<bk> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            Iterator<bk> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a());
            }
        }
        return arrayList;
    }

    public final void a(String str, int i, long j, long j2, long j3) {
        if (b()) {
            a(str, i, j, new long[]{j2, 0, 0, 0, 0}, new long[]{j3, 0, 0, 0, 0});
        }
    }

    private synchronized void a(String str, int i, long j, long[] jArr, long[] jArr2) {
        if (b()) {
            b.a(new bj(str, j, i, jArr[0], jArr2[0]), bj.a(str));
        }
    }
}
