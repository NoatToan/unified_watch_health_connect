package ey1;

import com.garmin.android.apps.connectmobile.f0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$confirmBenchmarks$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {241, 256}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67386b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$confirmBenchmarks$1$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f67388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f67389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67388b = jVar;
            this.f67389c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67388b, this.f67389c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67387a;
            if (i14 == 0) {
                o13.r.b(obj);
                iy1.c cVar = this.f67388b.f67348o;
                List list = this.f67389c;
                if (list == null) {
                    list = j0.f134944a;
                }
                this.f67387a = 1;
                cVar.getClass();
                if (f0.J(cVar, new iy1.e(cVar, list, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f67386b = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f67386b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (ge1.b.e0(r9, r3, r8) == r0) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        i53.c<dy1.d> cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67385a;
        j jVar = this.f67386b;
        if (i14 != 0) {
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
        }
        o13.r.b(obj);
        p2 p2Var = jVar.f67355x;
        Boolean bool = Boolean.TRUE;
        this.f67385a = 1;
        p2Var.k(null, bool);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        dy1.c cVar2 = (dy1.c) jVar.f67357z.getValue();
        if (cVar2 == null || (cVar = cVar2.f61536b) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (dy1.d dVar : cVar) {
                dy1.b bVar = dVar.f61541b ? dVar.f61542c : dVar.f61543d;
                com.garmin.android.apps.connectmobile.workouts.data.model.b bVarA = (!zf.b.D(bVar != null ? bVar.f61529b : null) || bVar == null) ? null : dy1.s.a(bVar, dVar.f61540a, dVar.f61541b);
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
        }
        x53.c cVar3 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        a aVar2 = new a(jVar, arrayList, null);
        this.f67385a = 2;
    }
}
