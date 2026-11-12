package kb0;

import androidx.lifecycle.u1;
import b63.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.t;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.y;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkb0/r;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f103807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f103808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f103809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f103810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f103811e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103812a;

        static {
            int[] iArr = new int[mb0.c.values().length];
            try {
                iArr[mb0.c.UNSELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mb0.c.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mb0.c.ALREADY_SELECTED_CLICKABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mb0.c.ALREADY_SELECTED_NOT_CLICKABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f103812a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"kb0/r$b", "Ljava/util/Comparator;", "Lmb0/h;", "Lkotlin/Comparator;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Comparator<mb0.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f103813a = o13.m.b(new k62.l(25));

        @Override // java.util.Comparator
        public final int compare(mb0.h hVar, mb0.h hVar2) {
            mb0.h hVar3 = hVar;
            mb0.h hVar4 = hVar2;
            hVar3.getClass();
            hVar4.getClass();
            mb0.h hVar5 = (mb0.h) r13.b.e(hVar3, hVar4);
            mb0.h hVar6 = (mb0.h) r13.b.d(hVar3, hVar4);
            t tVar = this.f103813a;
            return (hVar5.compareTo((mb0.h) tVar.getValue()) >= 0 || hVar6.compareTo((mb0.h) tVar.getValue()) < 0) ? hVar3.compareTo(hVar4) : hVar4.compareTo(hVar3);
        }
    }

    public r() {
        p2 p2VarA = q2.a(new mb0.f(null, null, null, null, null, 31, null));
        this.f103807a = p2VarA;
        this.f103808b = p2VarA;
        this.f103809c = new ArrayList();
        this.f103810d = new b();
    }

    public static boolean A4(List list, ArrayList arrayList, v vVar, v vVar2) {
        Object next;
        Object next2;
        Object next3;
        int secondOfDay = vVar.f16219a.toSecondOfDay();
        int secondOfDay2 = vVar2.f16219a.toSecondOfDay();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    mb0.h hVar = (mb0.h) it3.next();
                    mb0.h.f117739d.getClass();
                    hVar.getClass();
                    Iterator<T> it4 = mb0.h.f117748m.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (((mb0.h) next).ordinal() != hVar.ordinal() - 1);
                    mb0.h hVar2 = (mb0.h) next;
                    if (hVar2 == null) {
                        hVar2 = mb0.h.SUNDAY;
                    }
                    if (!arrayList.contains(hVar2)) {
                        Iterator it5 = list.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it5.next();
                        } while (!((z80.j) next2).f203062a.contains(hVar2));
                        z80.j jVar = (z80.j) next2;
                        if (jVar != null && secondOfDay > secondOfDay2 && jVar.f203064c.compareTo(vVar) > 0) {
                            break;
                        }
                    }
                }
                return false;
            }
            mb0.h hVar3 = (mb0.h) it.next();
            mb0.h.f117739d.getClass();
            hVar3.getClass();
            Iterator<T> it6 = mb0.h.f117748m.iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (((mb0.h) next3).ordinal() != hVar3.ordinal() + 1);
            mb0.h hVar4 = (mb0.h) next3;
            if (hVar4 == null) {
                hVar4 = mb0.h.MONDAY;
            }
            if (!arrayList.contains(hVar4)) {
                for (Object obj2 : list) {
                    if (((z80.j) obj2).f203062a.contains(hVar4)) {
                        obj = obj2;
                        break;
                    }
                }
                z80.j jVar2 = (z80.j) obj;
                if (jVar2 != null) {
                    v vVar3 = jVar2.f203063b;
                    if (vVar3.compareTo(jVar2.f203064c) > 0 && vVar2.compareTo(vVar3) > 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public final void B4(int i14, int i15, String str, Boolean bool, List<z80.j> list) {
        p2 p2Var;
        Object value;
        mb0.f fVar;
        mb0.e eVar;
        mb0.a aVarA;
        str.getClass();
        list.getClass();
        if (this.f103811e) {
            return;
        }
        this.f103811e = true;
        do {
            p2Var = this.f103807a;
            value = p2Var.getValue();
            fVar = (mb0.f) value;
            eVar = new mb0.e(i14, i15);
            aVarA = mb0.a.a(fVar.f117731b, i14, i15, list, z4(list), false, 16);
            z80.h.f203056a.getClass();
        } while (!p2Var.b(value, mb0.f.a(fVar, eVar, aVarA, null, bool != null ? new z80.h.a(bool.booleanValue()) : z80.h.c.f203058b, str, 4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList C4(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            z80.j jVar = (z80.j) obj;
            o13.p pVar = new o13.p(jVar.f203063b, jVar.f203064c);
            Object arrayList2 = linkedHashMap.get(pVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(pVar, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            o13.p pVar2 = (o13.p) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d0.v(arrayList4, ((z80.j) it.next()).f203062a);
            }
            arrayList3.add(new z80.j(h0.N0(h0.g1(arrayList4), this.f103810d), (v) pVar2.f128594a, (v) pVar2.f128595b));
        }
        return arrayList3;
    }

    public final void D4(v vVar) {
        p2 p2Var;
        Object value;
        mb0.f fVar;
        vVar.getClass();
        do {
            p2Var = this.f103807a;
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(fVar.f117731b, 0, vVar.f16219a.toSecondOfDay(), null, null, false, 29), null, null, null, 29)));
    }

    public final void E4(v vVar) {
        p2 p2Var;
        Object value;
        mb0.f fVar;
        vVar.getClass();
        do {
            p2Var = this.f103807a;
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(fVar.f117731b, vVar.f16219a.toSecondOfDay(), 0, null, null, false, 30), null, null, null, 29)));
    }

    public final void F4() {
        p2 p2Var;
        Object value;
        mb0.f fVar;
        do {
            p2Var = this.f103807a;
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(fVar.f117731b, 0, 0, null, null, false, 15), null, null, null, 29)));
    }

    public final void G4(mb0.h hVar, mb0.c cVar) {
        Object value;
        mb0.f fVar;
        p2 p2Var = this.f103807a;
        List<mb0.b> list = ((mb0.f) p2Var.getValue()).f117732c.f117724b;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (mb0.b bVarA : list) {
            if (bVarA.f117715a == hVar) {
                bVarA = mb0.b.a(bVarA, cVar);
            }
            arrayList.add(bVarA);
        }
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, null, mb0.d.a(fVar.f117732c, arrayList, null, null, null, 29), null, null, 27)));
    }

    public final void H4() {
        Object value;
        mb0.f fVar;
        mb0.a aVar;
        List list;
        Object value2;
        mb0.f fVar2;
        ArrayList arrayList = this.f103809c;
        boolean zIsEmpty = arrayList.isEmpty();
        p2 p2Var = this.f103807a;
        if (zIsEmpty) {
            do {
                value = p2Var.getValue();
                fVar = (mb0.f) value;
                aVar = fVar.f117731b;
                list = j0.f134944a;
            } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(aVar, 0, 0, list, z4(list), false, 3), null, null, null, 29)));
            return;
        }
        z80.j jVar = (z80.j) arrayList.remove(arrayList.size() - 1);
        List<z80.j> list2 = ((mb0.f) p2Var.getValue()).f117731b.f117712c;
        ArrayList arrayList2 = new ArrayList();
        for (z80.j jVar2 : list2) {
            List listZ0 = h0.z0(jVar2.f203062a, h0.g1(jVar.f203062a));
            z80.j jVarA = !listZ0.isEmpty() ? z80.j.a(jVar2, listZ0) : null;
            if (jVarA != null) {
                arrayList2.add(jVarA);
            }
        }
        do {
            value2 = p2Var.getValue();
            fVar2 = (mb0.f) value2;
        } while (!p2Var.b(value2, mb0.f.a(fVar2, null, mb0.a.a(fVar2.f117731b, !arrayList2.isEmpty() ? ((z80.j) h0.m0(arrayList2)).f203063b.f16219a.toSecondOfDay() : 79200, !arrayList2.isEmpty() ? ((z80.j) h0.m0(arrayList2)).f203064c.f16219a.toSecondOfDay() : 21600, arrayList2, z4(arrayList2), false, 16), null, null, null, 29)));
    }

    public final boolean x4() {
        List<z80.j> list = ((mb0.f) this.f103807a.getValue()).f117731b.f117712c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((z80.j) it.next()).f203062a);
        }
        return h0.g1(arrayList).size() == mb0.h.f117748m.getF168272d();
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f103807a;
            value = p2Var.getValue();
        } while (!p2Var.b(value, mb0.f.a((mb0.f) value, null, null, new mb0.d(null, null, null, null, null, 31, null), null, null, 27)));
    }

    public final ArrayList z4(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((z80.j) it.next()).f203062a);
        }
        Set setG1 = h0.g1(arrayList);
        List<mb0.h> listN0 = h0.N0(mb0.h.f117748m, this.f103810d);
        ArrayList arrayList2 = new ArrayList(y.r(listN0, 10));
        for (mb0.h hVar : listN0) {
            arrayList2.add(new mb0.b(hVar, setG1.contains(hVar) ? mb0.c.ALREADY_SELECTED_NOT_CLICKABLE : mb0.c.UNSELECTED));
        }
        return arrayList2;
    }
}
