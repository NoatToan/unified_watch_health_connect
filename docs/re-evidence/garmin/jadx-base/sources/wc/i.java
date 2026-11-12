package wc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwc/i;", "", "<init>", "()V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f184244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f184245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f184246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p13.k<e<?>> f184247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p13.k<e<?>> f184248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e<?> f184249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f184250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f184251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f184252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f184253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f184254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f184255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f184256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f184257n;

    public i() {
        p2 p2VarA = q2.a(j.b.f184258a);
        this.f184244a = p2VarA;
        s.d(p2VarA);
        p2 p2VarA2 = q2.a(new f());
        this.f184245b = p2VarA2;
        this.f184246c = s.d(p2VarA2);
        this.f184247d = new p13.k<>();
        this.f184248e = new p13.k<>();
        this.f184252i = new LinkedHashSet();
        this.f184253j = new LinkedHashSet();
        this.f184254k = new LinkedHashSet();
    }

    public final void a(c cVar, h hVar, int i14) {
        LinkedHashSet linkedHashSet;
        boolean z14;
        cVar.getClass();
        if (hVar.f184242a != null) {
            StringBuilder sb3 = new StringBuilder("Input '");
            sb3.append(hVar);
            c cVar2 = hVar.f184242a;
            sb3.append("' is already added to dispatcher ");
            sb3.append(cVar2);
            sb3.append('.');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (i14 != 0) {
            linkedHashSet = i14 != 1 ? this.f184252i : this.f184253j;
        } else {
            linkedHashSet = this.f184254k;
        }
        linkedHashSet.add(hVar);
        hVar.f184242a = cVar;
        ((f) this.f184246c.f150540a.getValue()).getClass();
        if (i14 != 0) {
            z14 = i14 != 1 ? this.f184257n : this.f184255l;
        } else {
            z14 = this.f184256m;
        }
        hVar.b(z14);
    }

    public final void b() {
        boolean z14;
        boolean z15;
        p13.k<e<?>> kVar = this.f184247d;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<e<?>> it = kVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    e<?> next = it.next();
                    if (next.a() || next.b()) {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
            }
        } else {
            z14 = false;
        }
        p13.k<e<?>> kVar2 = this.f184248e;
        if (kVar2 == null || !kVar2.isEmpty()) {
            Iterator<e<?>> it3 = kVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    e<?> next2 = it3.next();
                    if (next2.a() || next2.b()) {
                        z15 = true;
                    }
                } else {
                    z15 = false;
                }
            }
        } else {
            z15 = false;
        }
        boolean z16 = z14 || z15;
        boolean z17 = this.f184256m != z14;
        boolean z18 = this.f184255l != z15;
        boolean z19 = this.f184257n != z16;
        if (z17) {
            Iterator it4 = this.f184254k.iterator();
            while (it4.hasNext()) {
                ((h) it4.next()).b(z14);
            }
        }
        if (z18) {
            Iterator it5 = this.f184253j.iterator();
            while (it5.hasNext()) {
                ((h) it5.next()).b(z15);
            }
        }
        if (z19) {
            Iterator it6 = this.f184252i.iterator();
            while (it6.hasNext()) {
                ((h) it6.next()).b(z16);
            }
        }
        this.f184256m = z14;
        this.f184255l = z15;
        this.f184257n = z16;
        e<?> eVarC = this.f184249f;
        if (eVarC == null) {
            eVarC = c(0);
        }
        d(eVarC);
    }

    public final e<?> c(int i14) {
        e<?> next;
        e<?> next2;
        e<?> eVar;
        e<?> next3;
        p13.k<e<?>> kVar = this.f184248e;
        p13.k<e<?>> kVar2 = this.f184247d;
        e<?> eVar2 = null;
        if (i14 == -1) {
            Iterator<e<?>> it = kVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.a());
            e<?> eVar3 = next;
            if (eVar3 != null) {
                return eVar3;
            }
            for (e<?> eVar4 : kVar) {
                if (eVar4.a()) {
                    eVar2 = eVar4;
                    break;
                }
            }
            return eVar2;
        }
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i14 + "'.").toString());
            }
            Iterator<e<?>> it3 = kVar2.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!next3.b());
            e<?> eVar5 = next3;
            if (eVar5 != null) {
                return eVar5;
            }
            for (e<?> eVar6 : kVar) {
                if (eVar6.b()) {
                    eVar2 = eVar6;
                    break;
                }
            }
            return eVar2;
        }
        Iterator<e<?>> it4 = kVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
            eVar = next2;
            if (eVar.a()) {
                break;
            }
        } while (!eVar.b());
        e<?> eVar7 = next2;
        if (eVar7 != null) {
            return eVar7;
        }
        for (e<?> eVar8 : kVar) {
            e<?> eVar9 = eVar8;
            if (eVar9.a() || eVar9.b()) {
                eVar2 = eVar8;
                break;
            }
        }
        return eVar2;
    }

    public final void d(e<?> eVar) {
        f fVar;
        e<?> eVarC = this.f184249f;
        if (eVarC == null) {
            eVarC = c(0);
        }
        if (p005kotlin.jvm.internal.s.g(eVarC, eVar)) {
            if (eVarC == null) {
                fVar = new f();
            } else {
                ArrayList arrayList = new ArrayList();
                for (e<?> eVar2 : this.f184247d) {
                    if (eVar2.a() && !eVar2.f184234b.isEmpty()) {
                        arrayList.addAll(eVar2.f184234b);
                    }
                }
                for (e<?> eVar3 : this.f184248e) {
                    if (eVar3.a() && !eVar3.f184234b.isEmpty()) {
                        arrayList.addAll(eVar3.f184234b);
                    }
                }
                fVar = new f(eVarC.f184233a, arrayList, eVarC.f184235c);
            }
            p2 p2Var = this.f184245b;
            if (p005kotlin.jvm.internal.s.g((f) p2Var.getValue(), fVar)) {
                return;
            }
            p2Var.k(null, fVar);
            Iterator it = this.f184254k.iterator();
            while (it.hasNext()) {
                ((h) it.next()).getClass();
            }
            Iterator it3 = this.f184253j.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).getClass();
            }
            Iterator it4 = this.f184252i.iterator();
            while (it4.hasNext()) {
                ((h) it4.next()).getClass();
            }
        }
    }
}
