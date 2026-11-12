package di;

import ci.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.u0;
import p13.y;
import vb.h;
import vh.e0;
import vh.i0;
import vh.m0;
import vh.q;
import vh.r;
import vh.t;
import vh.u;
import vh.v;
import vh.w;
import vh.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldi/e;", "", "Lvh/e0$b;", "variables", "", "rootKey", "Lci/c;", "cacheKeyGenerator", "<init>", "(Lvh/e0$b;Ljava/lang/String;Lci/c;)V", "a", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.b f59700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ci.c f59702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f59703d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi/e$a;", "", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f59704a = new ArrayList();
    }

    public e(e0.b bVar, String str, ci.c cVar) {
        bVar.getClass();
        str.getClass();
        cVar.getClass();
        this.f59700a = bVar;
        this.f59701b = str;
        this.f59702c = cVar;
        this.f59703d = new LinkedHashMap();
    }

    public static void b(List list, String str, String str2, a aVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof q) {
                aVar.f59704a.add(wVar);
            } else if (wVar instanceof r) {
                r rVar = (r) wVar;
                if (h0.R(rVar.f178383b, str2) || s.g(rVar.f178382a, str)) {
                    b(rVar.f178385d, str, str2, aVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    public final ci.b a(String str, Map map, List list, String str2) {
        e0.b bVar;
        p pVar;
        Object obj = map.get("__typename");
        String str3 = obj instanceof String ? (String) obj : null;
        a aVar = new a();
        b(list, str2, str3, aVar);
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : aVar.f59704a) {
                q qVar = (q) obj2;
                String str4 = qVar.f178372c;
                if (str4 == null) {
                    str4 = qVar.f178370a;
                }
                if (s.g(str4, entry.getKey())) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                pVar = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    bVar = this.f59700a;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (!zf.b.O((q) next, bVar.f178306a)) {
                        arrayList3.add(next);
                    }
                }
                if (arrayList3.isEmpty()) {
                    pVar = null;
                } else {
                    q qVar2 = (q) h0.b0(arrayList3);
                    qVar2.getClass();
                    q.a aVar2 = new q.a(qVar2);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        d0.v(arrayList4, ((q) it3.next()).f178375f);
                    }
                    aVar2.f178381f = arrayList4;
                    j0 j0Var = j0.f134944a;
                    j0Var.getClass();
                    aVar2.f178379d = j0Var;
                    q qVarC = aVar2.c();
                    String strA = qVarC.a(bVar);
                    ci.b.f27594b.getClass();
                    String str5 = s.g(str, ci.b.f27596d.f27597a) ? null : str;
                    pVar = new p(strA, c(entry.getValue(), qVarC, qVarC.f178371b, str5 == null ? strA : str5 + '.' + strA));
                }
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        n nVar = new n(str, u0.l(arrayList), null, 4, null);
        LinkedHashMap linkedHashMap = this.f59703d;
        n nVar2 = (n) linkedHashMap.get(str);
        if (nVar2 != null) {
            nVar = nVar2.b(nVar, null).f128594a;
        }
        linkedHashMap.put(str, nVar);
        return new ci.b(str);
    }

    public final Object c(Object obj, q qVar, x xVar, String str) {
        String str2;
        if (xVar instanceof v) {
            if (obj == null) {
                h.z("Check failed.");
                return null;
            }
            xVar = ((v) xVar).f178394a;
        } else if (obj == null) {
            return null;
        }
        if (!(xVar instanceof t)) {
            if (xVar instanceof u) {
                u uVar = (u) xVar;
                int i14 = vh.s.f178391a;
                if (uVar instanceof vh.u0 ? true : uVar instanceof i0 ? true : uVar instanceof m0) {
                    if (!(obj instanceof Map)) {
                        h.z("Check failed.");
                        return null;
                    }
                    Map<String, ? extends Object> map = (Map) obj;
                    ci.b bVarA = this.f59702c.a(map, new ci.d(qVar, this.f59700a));
                    if (bVarA != null && (str2 = bVarA.f27597a) != null) {
                        str = str2;
                    }
                    return a(str, map, qVar.f178375f, qVar.f178371b.a().f178393a);
                }
            }
            return obj;
        }
        if (!(obj instanceof List)) {
            h.z("Check failed.");
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        int i15 = 0;
        for (Object obj2 : iterable) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            x xVar2 = ((t) xVar).f178392a;
            String strValueOf = String.valueOf(i15);
            if (str != null) {
                strValueOf = str + '.' + strValueOf;
            }
            arrayList.add(c(obj2, qVar, xVar2, strValueOf));
            i15 = i16;
        }
        return arrayList;
    }
}
