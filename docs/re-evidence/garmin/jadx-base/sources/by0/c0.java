package by0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmm1/b;", "<anonymous>", "(Lo53/b0;)Lmm1/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getSleepDailySummary$result$1", f = "MultiDayActivityDataSource.kt", l = {255}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super mm1.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f21733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f21734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by0.a f21735e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmm1/b;", "<anonymous>", "(Lo53/b0;)Lmm1/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getSleepDailySummary$result$1$batchResults$1$1", f = "MultiDayActivityDataSource.kt", l = {254}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super mm1.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ by0.a f21737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f21738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b63.o f21739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(by0.a aVar, b63.o oVar, b63.o oVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21737b = aVar;
            this.f21738c = oVar;
            this.f21739d = oVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f21737b, this.f21738c, this.f21739d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super mm1.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21736a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f21736a = 1;
                Object objB = by0.a.b(this.f21737b, this.f21738c, this.f21739d, this);
                return objB == aVar ? aVar : objB;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b63.o oVar, b63.o oVar2, by0.a aVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f21733c = oVar;
        this.f21734d = oVar2;
        this.f21735e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f21733c, this.f21734d, this.f21735e, dVar);
        c0Var.f21732b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super mm1.b> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f21732b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21731a;
        mm1.a aVar2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVar = this.f21733c;
            oVar.getClass();
            b63.o oVar2 = this.f21734d;
            oVar2.getClass();
            j23.l lVarO = j23.t.o(0, (int) Math.ceil(((double) (Math.abs(b63.p.a(oVar, oVar2)) + 1)) / ((double) 28)));
            ArrayList arrayList = new ArrayList(p13.y.r(lVarO, 10));
            Iterator<Integer> it = lVarO.iterator();
            while (((j23.k) it).f96801c) {
                int iNextInt = ((p13.p0) it).nextInt();
                b63.i.INSTANCE.getClass();
                b63.i.c cVar = b63.i.f16190d;
                b63.o oVarE = b63.q.e(oVar, 28 * iNextInt, cVar);
                b63.o oVarC = b63.q.c(b63.q.e(oVar, (iNextInt + 1) * 28, cVar), 1, cVar);
                if (oVarC.compareTo(oVar2) > 0) {
                    oVarC = oVar2;
                }
                arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f21735e, oVarE, oVarC, null), 3));
            }
            this.f21732b = null;
            this.f21731a = 1;
            obj = g8.i.o(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        ArrayList arrayListZ = p13.h0.Z((Iterable) obj);
        if (arrayListZ.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayListZ.iterator();
        while (it3.hasNext()) {
            List<mm1.c> listB = ((mm1.b) it3.next()).b();
            if (listB == null) {
                listB = p13.j0.f134944a;
            }
            p13.d0.v(arrayList2, listB);
        }
        Iterator it4 = arrayListZ.iterator();
        while (it4.hasNext()) {
            mm1.a overallStats = ((mm1.b) it4.next()).getOverallStats();
            if (overallStats != null) {
                aVar2 = overallStats;
                break;
            }
        }
        return new mm1.b(arrayList2, aVar2);
    }
}
