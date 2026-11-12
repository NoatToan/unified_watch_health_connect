package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getTriathlonTypes$1", f = "AddTIEventViewModel.kt", l = {1465}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> f121890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121891c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getTriathlonTypes$1$1", f = "AddTIEventViewModel.kt", l = {1466}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f121893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> f121894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AddTIEventViewModel addTIEventViewModel, androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f121893b = addTIEventViewModel;
            this.f121894c = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f121893b, this.f121894c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121892a;
            if (i14 == 0) {
                o13.r.b(obj);
                d60.b bVar = this.f121893b.f46429p2;
                this.f121892a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new d60.e0(bVar, null), this);
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
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> y0Var = this.f121894c;
            if (z14) {
                y0Var.j(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                y0Var.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> y0Var, AddTIEventViewModel addTIEventViewModel, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f121890b = y0Var;
        this.f121891c = addTIEventViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f121890b, this.f121891c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121889a;
        if (i14 == 0) {
            o13.r.b(obj);
            fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>> mVarF = fw.m.a.f(fw.m.f73767e, null, null, 3);
            androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> y0Var = this.f121890b;
            y0Var.m(mVarF);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f121891c, y0Var, null);
            this.f121889a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
