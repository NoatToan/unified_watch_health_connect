package gu1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgu1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lgu1/a;", "api", "<init>", "(Lgu1/a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f79047b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu1.a f79048a;

    /* JADX INFO: renamed from: gu1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo", f = "ATPRepo.kt", l = {19}, m = "getActiveGarminCoachPlans", v = 2)
    public static final class C1594b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f79049a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79051c;

        public C1594b(t13.d<? super C1594b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f79049a = obj;
            this.f79051c |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lxw1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo$getActiveGarminCoachPlans$2", f = "ATPRepo.kt", l = {19}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super a0<List<? extends xw1.d>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79052a;

        public c(t13.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<List<? extends xw1.d>>> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79052a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<List<xw1.d>>> i0VarA = b.this.f79048a.a();
            this.f79052a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public b(gu1.a aVar) {
        aVar.getClass();
        this.f79048a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(t13.d<? super v2<xw1.d>> dVar) {
        C1594b c1594b;
        Object next;
        xw1.d dVar2;
        xw1.d dVar3;
        if (dVar instanceof C1594b) {
            c1594b = (C1594b) dVar;
            int i14 = c1594b.f79051c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1594b.f79051c = i14 - Integer.MIN_VALUE;
            } else {
                c1594b = new C1594b(dVar);
            }
        } else {
            c1594b = new C1594b(dVar);
        }
        Object objJ = c1594b.f79049a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1594b.f79051c;
        if (i15 == 0) {
            r.b(objJ);
            c cVar = new c(null);
            c1594b.f79051c = 1;
            objJ = f0.J(this, cVar, c1594b);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        if (bVar.f47387b == 204) {
            dVar2 = null;
        } else {
            Iterator it = ((Iterable) bVar.f47386a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                dVar3 = (xw1.d) next;
                if (dVar3.Z()) {
                    break;
                }
            } while (!dVar3.e0());
            dVar2 = (xw1.d) next;
        }
        if (dVar2 != null && dVar2.getAthletePlanId() > 0) {
            ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.ENTERED_GARMIN_COACH);
        }
        return new v2.b(dVar2, bVar.f47387b, null, null, 12, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgu1/b$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(a aVar) {
            gu1.a aVar2 = (gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            aVar2.getClass();
            return new b(aVar2);
        }

        private a() {
        }
    }
}
