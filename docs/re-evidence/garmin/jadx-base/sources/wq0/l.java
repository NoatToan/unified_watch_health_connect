package wq0;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.t0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwq0/l;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Lar0/a;", "insightsRepo", "<init>", "(Landroidx/lifecycle/j1;Lar0/a;)V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ar0.a f186607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<tq0.f> f186608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<tq0.a> f186609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f186610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f186611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f186612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f186613g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((a0.b) t7).f186582b.f166055a), Integer.valueOf(((a0.b) t14).f186582b.f166055a));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    public l(j1 j1Var, ar0.a aVar) {
        j1Var.getClass();
        aVar.getClass();
        this.f186607a = aVar;
        zq0.b.INSTANCE.getClass();
        zq0.b bVar = (zq0.b) gl.b.S(j1Var, s0.f105811a.b(zq0.b.class), zq0.b.f206631d);
        List<tq0.f> list = bVar.f206632a;
        this.f186608b = list;
        this.f186609c = bVar.f206633b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((tq0.f) obj).f166056b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((tq0.f) obj2).f166056b) {
                arrayList2.add(obj2);
            }
        }
        List listN0 = h0.N0(arrayList, new s());
        ArrayList arrayList3 = new ArrayList(p13.y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList3.add(((tq0.f) it.next()).f166057c);
        }
        this.f186612f = arrayList3;
        List listN1 = h0.N0(arrayList2, new t());
        ArrayList arrayList4 = new ArrayList(p13.y.r(listN1, 10));
        Iterator it3 = listN1.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((tq0.f) it3.next()).f166057c);
        }
        this.f186613g = arrayList4;
        int iA = t0.a(p13.y.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        Iterator<T> it4 = list.iterator();
        while (true) {
            Object obj3 = null;
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            tq0.f fVar = (tq0.f) next;
            for (Object obj4 : this.f186609c) {
                tq0.m.a aVar2 = tq0.m.f166103c;
                String str = ((tq0.a) obj4).f166036a;
                aVar2.getClass();
                if (p005kotlin.jvm.internal.s.g(tq0.m.a.a(str), fVar.f166057c)) {
                    obj3 = obj4;
                    break;
                }
            }
            linkedHashMap.put(next, (tq0.a) obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((tq0.f) entry.getKey()).f166056b && entry.getValue() != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            tq0.a aVar3 = (tq0.a) entry2.getValue();
            a0.b bVar2 = aVar3 != null ? new a0.b((tq0.f) entry2.getKey(), aVar3) : null;
            if (bVar2 != null) {
                arrayList5.add(bVar2);
            }
        }
        List listN2 = h0.N0(arrayList5, new u());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            if (!((tq0.f) entry3.getKey()).f166056b && entry3.getValue() != null) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            tq0.a aVar4 = (tq0.a) entry4.getValue();
            a0.b bVar3 = aVar4 != null ? new a0.b((tq0.f) entry4.getKey(), aVar4) : null;
            if (bVar3 != null) {
                arrayList6.add(bVar3);
            }
        }
        p2 p2VarA = q2.a(new z(false, listN2, h0.N0(arrayList6, new v()), false, false, false, 57, null));
        this.f186610d = p2VarA;
        this.f186611e = p2VarA;
        j0 j0Var = j0.f134944a;
        this.f186612f = j0Var;
        this.f186613g = j0Var;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.lang.Object] */
    public final boolean x4() {
        p2 p2Var = this.f186610d;
        List listN0 = h0.N0(((z) p2Var.getValue()).f186617b, new q());
        ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(((a0.b) it.next()).f186582b.f166057c);
        }
        List listN1 = h0.N0(((z) p2Var.getValue()).f186618c, new r());
        ArrayList arrayList2 = new ArrayList(p13.y.r(listN1, 10));
        Iterator it3 = listN1.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((a0.b) it3.next()).f186582b.f166057c);
        }
        if (!arrayList.equals(this.f186612f) || !arrayList2.equals(this.f186613g)) {
            return true;
        }
        List listN2 = h0.N0(((z) p2Var.getValue()).f186617b, new o());
        ArrayList arrayList3 = new ArrayList(p13.y.r(listN2, 10));
        Iterator it4 = listN2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((a0.b) it4.next()).f186582b.f166057c);
        }
        List listN3 = h0.N0(((z) p2Var.getValue()).f186618c, new p());
        ArrayList arrayList4 = new ArrayList(p13.y.r(listN3, 10));
        Iterator it5 = listN3.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((a0.b) it5.next()).f186582b.f166057c);
        }
        return !h0.C0(arrayList3, arrayList4).equals(h0.C0(this.f186612f, this.f186613g));
    }

    public final void y4(int i14, int i15) {
        p2 p2Var;
        Object value;
        z zVarA;
        a0.b bVar;
        do {
            p2Var = this.f186610d;
            value = p2Var.getValue();
            zVarA = (z) value;
            List<a0.b> list = zVarA.f186617b;
            a0.b bVar2 = (a0.b) h0.e0(i14, list);
            if (bVar2 != null && (bVar = (a0.b) h0.e0(i15, list)) != null) {
                tq0.f fVar = bVar.f186582b;
                tq0.f fVar2 = bVar2.f186582b;
                int i16 = fVar2.f166055a;
                a0.b bVarA = a0.b.a(bVar2, tq0.f.b(fVar2, fVar.f166055a, false, 6));
                a0.b bVarA2 = a0.b.a(bVar, tq0.f.b(fVar, i16, false, 6));
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i14, bVarA2);
                arrayList.set(i15, bVarA);
                Unit unit = Unit.INSTANCE;
                zVarA = z.a(zVarA, false, h0.N0(arrayList, new b()), null, false, false, false, 61);
            }
        } while (!p2Var.b(value, zVarA));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lwq0/l$a;", "", "<init>", "()V", "", "HIDDEN_ITEMS_KEY", "Ljava/lang/String;", "VISIBLE_ITEMS_KEY", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
