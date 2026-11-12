package nq1;

import c02.n;
import e32.o;
import f12.l;
import hd1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n70.a0;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001BC\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lnq1/h;", "Ln70/a0;", "Lr53/i;", "Lyz1/a0$a;", "Lj70/j;", "", "", "Lhd1/q;", "data", "Lae0/b;", "userSummariesUseCase", "Lae0/e;", "getUserGoalsDataUseCase", "Lf12/l;", "userSettings", "<init>", "(Lr53/i;Lae0/b;Lae0/e;Lf12/l;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements a0<r53.i<? extends yz1.a0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.j<List<String>, q>> f126935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.e f126936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f126937c;

    public h(r53.i<j70.j<List<String>, q>> iVar, ae0.b bVar, ae0.e eVar, l lVar) {
        iVar.getClass();
        bVar.getClass();
        eVar.getClass();
        lVar.getClass();
        this.f126935a = iVar;
        this.f126936b = eVar;
        this.f126937c = lVar;
    }

    public static Integer c(hs1.j jVar, q qVar, e23.l lVar, zk0.e eVar) {
        Integer goal;
        DateTime dateTimeF;
        if (eVar != null) {
            goal = Integer.valueOf((int) eVar.getGoalValue());
        } else {
            goal = jVar != null ? jVar.getGoal() : null;
        }
        Integer num = (Integer) lVar.invoke(qVar);
        long millis = (eVar == null || (dateTimeF = eVar.f()) == null) ? 0L : dateTimeF.getMillis();
        long j8 = qVar != null ? qVar.f83396a : 0L;
        if (goal == null || num == null) {
            return goal == null ? num : goal;
        }
        return Integer.valueOf((j8 < millis || num.intValue() <= 0) ? goal.intValue() : num.intValue());
    }

    public static Integer d(hs1.j jVar, Integer num) {
        Integer value;
        Integer value2 = jVar != null ? jVar.getValue() : null;
        if (value2 == null || num == null) {
            return (jVar == null || (value = jVar.getValue()) == null) ? num : value;
        }
        return Integer.valueOf(Math.max(value2.intValue(), num.intValue()));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public final <T extends q> yz1.a0.a e(j70.j<List<String>, T> jVar, e23.l<? super hs1.d, hs1.j> lVar, e23.l<? super T, Integer> lVar2, e23.l<? super T, Integer> lVar3) {
        Object next;
        boolean z14;
        Integer value;
        T t7 = jVar.f97544c;
        List<String> list = jVar.f97543b;
        List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, o.f62807j);
        zk0.e eVarB = this.f126936b.b(list != null ? (String) h0.e0(1, list) : null);
        Iterator it = listA.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!g22.k.g(((hs1.d) next).b(), LocalDate.now()));
        hs1.d dVar = (hs1.d) next;
        Integer numInvoke = lVar2.invoke(t7);
        Iterator it3 = listA.iterator();
        int iIntValue = 0;
        while (it3.hasNext()) {
            hs1.j jVarInvoke = lVar.invoke((hs1.d) it3.next());
            iIntValue += (jVarInvoke == null || (value = jVarInvoke.getValue()) == null) ? 0 : value.intValue();
        }
        if (iIntValue > 0) {
            z14 = true;
        } else if ((numInvoke != null ? numInvoke.intValue() : 0) > 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            hs1.d dVar2 = (hs1.d) obj;
            hs1.j jVarInvoke2 = lVar.invoke(dVar2);
            Integer numD = s.g(dVar, dVar2) ? d(jVarInvoke2, numInvoke) : jVarInvoke2 != null ? jVarInvoke2.getValue() : null;
            Integer numC = s.g(dVar, dVar2) ? c(jVarInvoke2, t7, lVar3, eVarB) : jVarInvoke2 != null ? jVarInvoke2.getGoal() : null;
            if ((numD == null || numC == null || numD.intValue() < numC.intValue()) ? false : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            LocalDate localDateB = ((hs1.d) it4.next()).b();
            c02.c cVarC = localDateB != null ? n.c(localDateB) : null;
            if (cVarC != null) {
                arrayList2.add(cVarC);
            }
        }
        i53.f fVarJ = i53.a.j(arrayList2);
        yz1.d dVar3 = jVar.f97542a;
        Integer numD2 = d(lVar.invoke(dVar), numInvoke);
        Double dValueOf = numD2 != null ? Double.valueOf(numD2.intValue()) : null;
        Integer numC2 = c(lVar.invoke(dVar), t7, lVar3, eVarB);
        Double dValueOf2 = numC2 != null ? Double.valueOf(numC2.intValue()) : null;
        i53.f fVar = z14 ? fVarJ : null;
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return new yz1.a0.a(dVar3, dValueOf, dValueOf2, fVar, n.c(localDateNow));
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetStepsDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends yz1.a0.a> invoke() {
        return r53.s.A(new g(this.f126935a, this), s0.f129406a);
    }
}
