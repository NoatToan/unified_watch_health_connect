package ey1;

import android.app.Activity;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$skipDeloadWeek$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {854, 855, 864, 872}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f67444c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$skipDeloadWeek$1$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {865, 867}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f67446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67446b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67446b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        
            if (r7 == r0) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67445a;
            j jVar = this.f67446b;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f67445a = 1;
                if (j.y4(jVar, this) != obj2) {
                }
                return obj2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            tw1.m mVar = (tw1.m) jVar.f67350q.getValue();
            if (mVar != null && mVar.e0()) {
                this.f67445a = 2;
                st1.a aVar = jVar.f67339f;
                aVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new st1.b(aVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j jVar, Activity activity, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f67443b = jVar;
        this.f67444c = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f67443b, this.f67444c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        x53.b bVar;
        a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67442a;
        j jVar = this.f67443b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = jVar.f67355x;
            Boolean bool = Boolean.TRUE;
            this.f67442a = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                j.B4(jVar, this.f67444c, 4);
                sn.a.o(f12.l.f68084a, true);
                x53.c cVar = s0.f129406a;
                bVar = x53.b.f189152a;
                aVar = new a(jVar, null);
                this.f67442a = 3;
                if (ge1.b.e0(bVar, aVar, this) != aVar2) {
                }
                return aVar2;
            }
            jVar.C4();
            p2 p2Var2 = jVar.f67355x;
            Boolean bool2 = Boolean.FALSE;
            this.f67442a = 4;
            p2Var2.k(null, bool2);
        } else if (i14 == 3) {
            o13.r.b(obj);
            p2 p2Var3 = jVar.f67355x;
            Boolean bool3 = Boolean.FALSE;
            this.f67442a = 4;
            p2Var3.k(null, bool3);
        } else {
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        nx1.o oVar = jVar.f67342i;
        long j8 = jVar.f67334a;
        this.f67442a = 2;
        obj = f0.J(oVar.f128250a, new uw1.k(j8, null), this);
        if (obj != aVar2) {
            v2Var = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                jVar.C4();
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                j.B4(jVar, this.f67444c, 4);
                sn.a.o(f12.l.f68084a, true);
                x53.c cVar2 = s0.f129406a;
                bVar = x53.b.f189152a;
                aVar = new a(jVar, null);
                this.f67442a = 3;
                if (ge1.b.e0(bVar, aVar, this) != aVar2) {
                }
            }
            p2 p2Var4 = jVar.f67355x;
            Boolean bool4 = Boolean.FALSE;
            this.f67442a = 4;
            p2Var4.k(null, bool4);
        }
        return aVar2;
    }
}
