package yk0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fz0.c;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u62.z;
import v13.e;
import v13.i;
import vb.h;
import zk0.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.goals.domain.GetWeightGoalUseCase$fetchWeightGoal$1", f = "GetWeightGoalUseCase.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<g>> f197593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f197594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y0<g3<g>> y0Var, b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f197593b = y0Var;
        this.f197594c = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f197593b, this.f197594c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197592a;
        y0<g3<g>> y0Var = this.f197593b;
        if (i14 == 0) {
            r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            al0.a aVar2 = this.f197594c.f197595a;
            c cVarB = fz0.d.b(new DateTime());
            c cVarB2 = fz0.d.b(new DateTime());
            this.f197592a = 1;
            aVar2.getClass();
            obj = f0.J(aVar2, new al0.e(aVar2, cVarB, cVarB2, null), this);
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
        if (v2Var instanceof v2.b) {
            z.h(g3.f35298f, ((v2.b) v2Var).f47386a, y0Var);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            y0Var.j(g3.a.a(g3.f35298f, aVar3.f47383a.toString(), aVar3.f47383a, null, aVar3.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}
