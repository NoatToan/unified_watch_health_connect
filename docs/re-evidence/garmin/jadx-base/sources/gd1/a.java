package gd1;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fd1.d;
import fd1.e;
import j53.l;
import java.util.ArrayList;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r1.q2;
import r53.b2;
import r53.p2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgd1/a;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", "applicationContext", "Lzc1/a;", "racePredictorRepository", "Lf12/b;", "userAccount", "<init>", "(Landroid/content/Context;Lzc1/a;Lf12/b;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc1.a f76965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.b f76966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f76967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f76968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u82.a<o82.a, d> f76969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a<o82.a, e> f76970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a<o82.a, e> f76971h;

    /* JADX INFO: renamed from: gd1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lfd1/d;", "<anonymous>", "(Lo82/a;)Lfd1/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.racepredictor.presentation.viewmodel.RacePredictorViewModel$currentRacePredictorPageState$1", f = "RacePredictorViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class C1551a extends i implements p<o82.a, t13.d<? super d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f76972a;

        public C1551a(t13.d<? super C1551a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new C1551a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super d> dVar) {
            return ((C1551a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f76972a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                String userDisplayName = aVar2.f76966c.getUserDisplayName();
                zc1.a aVar3 = aVar2.f76965b;
                this.f76972a = 1;
                obj = aVar3.c(userDisplayName, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching current race predictor data!");
                return null;
            }
            ed1.b bVar = ed1.b.f63874a;
            r61.a aVar4 = (r61.a) ((v2.b) v2Var).f47386a;
            bVar.getClass();
            return ed1.b.a(aVar4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lfd1/e;", "<anonymous>", "(Lo82/a;)Lfd1/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.racepredictor.presentation.viewmodel.RacePredictorViewModel$dailyRacePredictorPageState$1", f = "RacePredictorViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<o82.a, t13.d<? super e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f76974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f76975b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f76975b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super e> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i53.c cVarB;
            o82.a aVar = (o82.a) this.f76975b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f76974a;
            a aVar3 = a.this;
            if (i14 == 0) {
                r.b(obj);
                String userDisplayName = aVar3.f76966c.getUserDisplayName();
                zc1.a aVar4 = aVar3.f76965b;
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                this.f76975b = aVar;
                this.f76974a = 1;
                obj = aVar4.a(userDisplayName, cVarA, cVarA2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Iterable<r61.a> iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList(y.r(iterable, 10));
                for (r61.a aVar5 : iterable) {
                    ed1.b.f63874a.getClass();
                    arrayList.add(ed1.b.a(aVar5));
                }
                cVarB = i53.a.e(arrayList);
            } else {
                cVarB = l.b();
            }
            ed1.b bVar = ed1.b.f63874a;
            Context context = aVar3.f76964a;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            bVar.getClass();
            return ed1.b.b(cVarB, context, aVar, zY);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lfd1/e;", "<anonymous>", "(Lo82/a;)Lfd1/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.racepredictor.presentation.viewmodel.RacePredictorViewModel$monthlyRacePredictorPageState$1", f = "RacePredictorViewModel.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<o82.a, t13.d<? super e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f76977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f76978b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = a.this.new c(dVar);
            cVar.f76978b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super e> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i53.c cVarB;
            o82.a aVar = (o82.a) this.f76978b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f76977a;
            a aVar3 = a.this;
            if (i14 == 0) {
                r.b(obj);
                String userDisplayName = aVar3.f76966c.getUserDisplayName();
                zc1.a aVar4 = aVar3.f76965b;
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                this.f76978b = aVar;
                this.f76977a = 1;
                obj = aVar4.b(userDisplayName, cVarA, cVarA2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Iterable<r61.a> iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList(y.r(iterable, 10));
                for (r61.a aVar5 : iterable) {
                    ed1.b.f63874a.getClass();
                    arrayList.add(ed1.b.a(aVar5));
                }
                cVarB = i53.a.e(arrayList);
            } else {
                cVarB = l.b();
            }
            ed1.b bVar = ed1.b.f63874a;
            Context context = aVar3.f76964a;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            bVar.getClass();
            return ed1.b.b(cVarB, context, aVar, zY);
        }
    }

    public a(Context context, zc1.a aVar, f12.b bVar) {
        context.getClass();
        aVar.getClass();
        bVar.getClass();
        this.f76964a = context;
        this.f76965b = aVar;
        this.f76966c = bVar;
        p2 p2VarA = r53.q2.a(i53.a.e(ad1.b.f2763k));
        this.f76967d = p2VarA;
        this.f76968e = s.d(p2VarA);
        this.f76969f = new u82.a<>(v1.a(this), new y82.e(new y82.c(new C1551a(null)), null, 2, null), false, 4, null);
        this.f76970g = new u82.a<>(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
        this.f76971h = new u82.a<>(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
    }
}
