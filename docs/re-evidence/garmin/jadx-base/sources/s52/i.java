package s52;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import l52.y;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$resetBenchmarkExercise$1", f = "BenchmarkViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<Unit>> f157428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f157429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f157430d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$resetBenchmarkExercise$1$1", f = "BenchmarkViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f157432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f157433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<Unit>> f157434d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, Long l14, y0<fw.m<Unit>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157432b = hVar;
            this.f157433c = l14;
            this.f157434d = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157432b, this.f157433c, this.f157434d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157431a;
            h hVar = this.f157432b;
            if (i14 == 0) {
                r.b(obj);
                y yVar = hVar.f157410a;
                long jLongValue = this.f157433c.longValue();
                this.f157431a = 1;
                obj = yVar.L(jLongValue, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            y0<fw.m<Unit>> y0Var = this.f157434d;
            if (z14) {
                y0Var.j(fw.m.a.g(fw.m.f73767e, null, 3));
                hVar.z4();
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                y0Var.j(fw.m.a.d(fw.m.f73767e, ((v2.a) v2Var).f47383a));
            }
            hVar.f157412c = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y0<fw.m<Unit>> y0Var, h hVar, Long l14, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f157428b = y0Var;
        this.f157429c = hVar;
        this.f157430d = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f157428b, this.f157429c, this.f157430d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157427a;
        if (i14 == 0) {
            r.b(obj);
            fw.m.a aVar2 = fw.m.f73767e;
            fw.m<Unit> mVarF = fw.m.a.f(aVar2, null, null, 3);
            y0<fw.m<Unit>> y0Var = this.f157428b;
            y0Var.m(mVarF);
            h hVar = this.f157429c;
            hVar.f157413d.m(fw.m.a.f(aVar2, null, hVar.A4(), 1));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(hVar, this.f157430d, y0Var, null);
            this.f157427a = 1;
            if (ge1.b.e0(bVar, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
