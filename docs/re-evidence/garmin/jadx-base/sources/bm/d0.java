package bm;

import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityViewModel$saveTrimmedMultisport$1", f = "TrimActivityViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f18780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ to.n f18783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.newmodel.h f18784f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, to.n nVar, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, t13.d<? super d0> dVar2) {
        super(2, dVar2);
        this.f18782d = dVar;
        this.f18783e = nVar;
        this.f18784f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f18782d, this.f18783e, this.f18784f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dc  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar;
        yo.a0 a0Var;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        Object objAwait;
        c83.a0 a0Var2;
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18781c;
        if (i14 == 0) {
            o13.r.b(obj);
            dVar = this.f18782d;
            yo.w wVar = dVar.D;
            if (wVar != null) {
                to.n nVar = this.f18783e;
                long startTime = nVar.getStartTime();
                long endTime = nVar.getEndTime();
                List<yo.c> listA = wVar.f().getReconstruct().a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    yo.c cVar = (yo.c) obj2;
                    long startTime2 = cVar.getStartTime();
                    if (startTime > startTime2 || startTime2 > endTime) {
                        long endTime2 = cVar.getEndTime();
                        if (startTime > endTime2 || endTime2 > endTime) {
                        }
                    }
                    arrayList.add(obj2);
                }
                List<yo.c> listA2 = wVar.f().getReconstruct().a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listA2) {
                    if (!arrayList.contains((yo.c) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                    yo.c cVar2 = (yo.c) it.next();
                    arrayList3.add(yo.c.a(cVar2, yo.b.EDIT.f198220a, j23.t.h(cVar2.getStartTime(), new j23.o(startTime, endTime)), j23.t.h(cVar2.getEndTime(), new j23.o(startTime, endTime)), 5));
                }
                ArrayList arrayListD1 = p13.h0.d1(p13.h0.N0(arrayList3, new yo.v()));
                yo.c cVar3 = (yo.c) p13.h0.d0(arrayListD1);
                if (cVar3 != null && cVar3.getStartTime() > startTime) {
                    ((yo.c) arrayList.get(0)).g(startTime);
                }
                yo.c cVar4 = (yo.c) p13.h0.n0(arrayListD1);
                if (cVar4 != null && cVar4.getEndTime() < endTime) {
                    ((yo.c) am.j.f(1, arrayList)).f(endTime);
                }
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(yo.c.a((yo.c) it3.next(), yo.b.DELETE.f198220a, 0L, 0L, 29));
                }
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayListD1);
                arrayList5.addAll(arrayList4);
                a0Var = new yo.a0(arrayList5);
            } else {
                a0Var = null;
            }
            if (a0Var != null) {
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f18784f;
                try {
                    o53.i0<c83.a0<Object>> i0VarB = ((yo.q) dVar.f28876n.getValue()).b(hVar2.f29448a, a0Var);
                    this.f18779a = dVar;
                    this.f18780b = hVar2;
                    this.f18781c = 1;
                    objAwait = i0VarB.await(this);
                    if (objAwait == aVar) {
                        return aVar;
                    }
                    hVar = hVar2;
                } catch (Exception unused) {
                    hVar = hVar2;
                    a0Var2 = null;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hVar = this.f18780b;
        dVar = this.f18779a;
        try {
            o13.r.b(obj);
            objAwait = obj;
        } catch (Exception unused2) {
            a0Var2 = null;
        }
        a0Var2 = (c83.a0) objAwait;
        if (a0Var2 != null) {
            Response response = a0Var2.f25745a;
            if (response.isSuccessful()) {
                List listK = p13.x.k(a0Var2.f25746b, new TreeMap(response.headers().toMultimap()));
                ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).e0(hVar.f29448a);
                y0 y0Var2 = dVar.f28868f;
                if (y0Var2 == null) {
                    y0Var2 = null;
                }
                if (y0Var2 != null) {
                    y0Var2.j(new fw.m(null, fw.p.SUCCESS, listK, null, 9, null));
                }
            } else {
                y0Var = dVar.f28868f;
                if (y0Var == null) {
                    y0Var = null;
                }
                if (y0Var != null) {
                    y0Var.j(new fw.m(null, fw.p.ERROR, a0Var2, null, 9, null));
                }
            }
        } else {
            y0Var = dVar.f28868f;
            if (y0Var == null) {
                y0Var = null;
            }
            if (y0Var != null) {
                y0Var.j(new fw.m(null, fw.p.ERROR, a0Var2, null, 9, null));
            }
        }
        return Unit.INSTANCE;
    }
}
