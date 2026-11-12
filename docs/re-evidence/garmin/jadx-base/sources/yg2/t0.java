package yg2;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewKt$WorkoutView$2$1$2", f = "WorkoutView.kt", l = {215}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.m0 f197206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f197207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f197208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f197209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p005kotlin.jvm.internal.m0 m0Var, o oVar, h0 h0Var, e2.i0 i0Var, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f197206b = m0Var;
        this.f197207c = oVar;
        this.f197208d = h0Var;
        this.f197209e = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f197206b, this.f197207c, this.f197208d, this.f197209e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197205a;
        p005kotlin.jvm.internal.m0 m0Var = this.f197206b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (m0Var.f105804a) {
                o oVar = this.f197207c;
                i53.c<a> cVarB = oVar.b();
                h0 h0Var = this.f197208d;
                int iG0 = p13.h0.g0(h0Var != null ? fg2.h0.f(h0Var, oVar) : null, cVarB);
                if (iG0 >= 0) {
                    j23.l lVarO = j23.t.o(0, iG0);
                    ArrayList arrayList = new ArrayList(p13.y.r(lVarO, 10));
                    Iterator<Integer> it = lVarO.iterator();
                    while (((j23.k) it).f96801c) {
                        int iNextInt = ((p13.p0) it).nextInt();
                        arrayList.add(new Integer(oVar.b().get(iNextInt).getEndStepIndex() - oVar.b().get(iNextInt).getStartStepIndex() > 0 ? 2 : 1));
                    }
                    int iR0 = p13.h0.R0(arrayList);
                    this.f197205a = 1;
                    if (e2.i0.f(this.f197209e, iR0, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        m0Var.f105804a = false;
        return Unit.INSTANCE;
    }
}
