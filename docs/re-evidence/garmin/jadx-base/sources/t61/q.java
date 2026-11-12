package t61;

import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import im.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lo61/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectViewModel$getTrainingEffectDailySummary$1", f = "TrainingEffectViewModel.kt", l = {41, 43, 47, 49}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super g3<? extends o61.j>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f162793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f162794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o61.l f162795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, o61.l lVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f162794c = rVar;
        this.f162795d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f162794c, this.f162795d, dVar);
        qVar.f162793b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super g3<? extends o61.j>> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[LOOP:0: B:40:0x00c8->B:42:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:2: B:26:0x006b->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:3: B:31:0x0081->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objE;
        List<v2> list;
        Iterator it;
        g3.a aVar;
        ArrayList<String> arrayList;
        double d14;
        double d15;
        ArrayList arrayList2;
        String str;
        String str2;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        i0 i0Var;
        double d16;
        r53.j jVar = (r53.j) this.f162793b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162792a;
        o61.l lVar = this.f162795d;
        r rVar = this.f162794c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f162793b = jVar;
            this.f162792a = 1;
            if (jVar.emit(g3VarC, this) != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            objE = obj;
            list = (List) objE;
            if (list != null || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (!(((v2) it.next()) instanceof v2.b)) {
                        aVar = g3.f35298f;
                        for (Object obj2 : list) {
                            if (((v2) obj2) instanceof v2.a) {
                                obj2.getClass();
                                g3 g3VarA = g3.a.a(aVar, ((v2.a) obj2).f47383a.getMessage(), null, null, null, 14);
                                this.f162793b = null;
                                this.f162792a = 4;
                            }
                        }
                        n23.j.s("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
            }
            arrayList = new ArrayList(y.r(list, 10));
            for (v2 v2Var : list) {
                v2Var.getClass();
                arrayList.add((String) ((v2.b) v2Var).f47386a);
            }
            g3.a aVar3 = g3.f35298f;
            rVar.getClass();
            if (lVar != null) {
                d14 = lVar.f129606b;
            } else {
                d14 = Double.NaN;
            }
            d15 = lVar != null ? lVar.f129607c : Double.NaN;
            arrayList2 = new ArrayList();
            str = null;
            str2 = null;
            for (String str3 : arrayList) {
                hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
                hVar.m(str3);
                i0Var = hVar.f29460m;
                d16 = d15;
                if (i0Var == null) {
                    if (i0Var.X0 == d14) {
                        str = i0Var.f29489b1;
                        arrayList2.add(hVar);
                    }
                    if (i0Var.Y0 == d16) {
                        str2 = i0Var.f29485a1;
                        if (!arrayList2.contains(hVar)) {
                            arrayList2.add(hVar);
                        }
                    }
                }
                d15 = d16;
            }
            o61.j jVar2 = new o61.j(new d0(d14, str), new d0(d15, str2), arrayList2);
            aVar3.getClass();
            g3 g3VarD = g3.a.d(jVar2);
            this.f162793b = null;
            this.f162792a = 3;
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f162793b = jVar;
        this.f162792a = 2;
        rVar.getClass();
        objE = c0.e(new o(rVar, lVar, null), this);
        if (objE != aVar2) {
            list = (List) objE;
            if (list != null) {
            }
            it = list.iterator();
            while (it.hasNext()) {
                if (!(((v2) it.next()) instanceof v2.b)) {
                    aVar = g3.f35298f;
                    while (r3.hasNext()) {
                        if (((v2) obj2) instanceof v2.a) {
                            obj2.getClass();
                            g3 g3VarA2 = g3.a.a(aVar, ((v2.a) obj2).f47383a.getMessage(), null, null, null, 14);
                            this.f162793b = null;
                            this.f162792a = 4;
                        }
                    }
                    n23.j.s("Collection contains no element matching the predicate.");
                    return null;
                }
            }
            arrayList = new ArrayList(y.r(list, 10));
            while (r3.hasNext()) {
                v2Var.getClass();
                arrayList.add((String) ((v2.b) v2Var).f47386a);
            }
            g3.a aVar4 = g3.f35298f;
            rVar.getClass();
            if (lVar != null) {
                d14 = lVar.f129606b;
            } else {
                d14 = Double.NaN;
            }
            if (lVar != null) {
            }
            arrayList2 = new ArrayList();
            str = null;
            str2 = null;
            while (r5.hasNext()) {
                hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
                hVar.m(str3);
                i0Var = hVar.f29460m;
                d16 = d15;
                if (i0Var == null) {
                    if (i0Var.X0 == d14) {
                        str = i0Var.f29489b1;
                        arrayList2.add(hVar);
                    }
                    if (i0Var.Y0 == d16) {
                        str2 = i0Var.f29485a1;
                        if (!arrayList2.contains(hVar)) {
                            arrayList2.add(hVar);
                        }
                    }
                }
                d15 = d16;
            }
            o61.j jVar3 = new o61.j(new d0(d14, str), new d0(d15, str2), arrayList2);
            aVar4.getClass();
            g3 g3VarD2 = g3.a.d(jVar3);
            this.f162793b = null;
            this.f162792a = 3;
        }
        return aVar2;
    }
}
