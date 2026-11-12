package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r7t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bbt f32301b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<cbt> f32300a = new ArrayList();
    public ArrayList<cbt> c = new ArrayList<>();

    public class a implements Comparator<cbt> {
        public a() {
        }

        public static int a(cbt cbtVar, cbt cbtVar2) {
            return cbtVar2.c - cbtVar.c;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(cbt cbtVar, cbt cbtVar2) {
            return a(cbtVar, cbtVar2);
        }
    }

    public static List<cbt> a(List<cbt> list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            cbt cbtVar = list.get(i);
            map.put(Integer.valueOf(cbtVar.c), cbtVar);
        }
        arrayList.addAll(map.values());
        return arrayList;
    }

    public static boolean c(List<cbt> list, List<cbt> list2) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            int i = size + size2;
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            HashMap map = new HashMap(list.size());
            Iterator<cbt> it = list.iterator();
            while (it.hasNext()) {
                map.put(Long.valueOf(it.next().f5174a), 1);
            }
            Iterator<cbt> it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (((Integer) map.get(Long.valueOf(it2.next().f5174a))) != null) {
                    i2++;
                }
            }
            if (((double) i2) * 2.0d >= ((double) i) * 0.5d) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(bbt bbtVar, long j, long j2) {
        return j > 0 && j2 - j < ((long) ((bbtVar.g > 10.0f ? 1 : (bbtVar.g == 10.0f ? 0 : -1)) >= 0 ? 2000 : 3500));
    }

    public final List<cbt> b(bbt bbtVar, List<cbt> list, boolean z, long j, long j2) {
        if (!h(bbtVar, list, z, j, j2)) {
            return null;
        }
        g(this.c, list);
        this.f32300a.clear();
        this.f32300a.addAll(list);
        this.f32301b = bbtVar;
        return this.c;
    }

    public final boolean d(bbt bbtVar) {
        float f = bbtVar.g;
        float f2 = 10.0f;
        if (f > 10.0f) {
            f2 = 200.0f;
        } else if (f > 2.0f) {
            f2 = 50.0f;
        }
        return bbtVar.a(this.f32301b) > ((double) f2);
    }

    public final List<cbt> f(List<cbt> list) {
        Collections.sort(list, new a());
        return list;
    }

    public final void g(List<cbt> list, List<cbt> list2) {
        list.clear();
        if (list2 != null) {
            List<cbt> listF = f(a(list2));
            int size = listF.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(listF.get(i));
            }
        }
    }

    public final boolean h(bbt bbtVar, List<cbt> list, boolean z, long j, long j2) {
        if (!z || !e(bbtVar, j, j2) || list == null || list.size() <= 0) {
            return false;
        }
        if (this.f32301b == null) {
            return true;
        }
        boolean zD = d(bbtVar);
        return !zD ? true ^ c(list, this.f32300a) : zD;
    }
}
