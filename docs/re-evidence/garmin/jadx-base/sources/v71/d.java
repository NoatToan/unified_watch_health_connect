package v71;

import b63.o;
import c83.a0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ln61/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.data.repository.EnduranceScoreRepoImpl$getMonthlyEnduranceScoreStats$2", f = "EnduranceScoreRepoImpl.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super a0<n61.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f176131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f176132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f176133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, o oVar, o oVar2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f176131b = fVar;
        this.f176132c = oVar;
        this.f176133d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f176131b, this.f176132c, this.f176133d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<n61.f>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176130a;
        f fVar = this.f176131b;
        if (i14 == 0) {
            r.b(obj);
            u71.a aVar2 = fVar.f176138a;
            fz0.c cVarA = fz0.d.a(this.f176132c);
            fz0.c cVarA2 = fz0.d.a(this.f176133d);
            String str = m61.a.MONTHLY.f116886a;
            this.f176130a = 1;
            obj = aVar2.b(cVarA, cVarA2, str, this);
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
        a0 a0Var = (a0) obj;
        n61.f fVar2 = (n61.f) a0Var.f25746b;
        n61.c enduranceScore = fVar2 != null ? fVar2.getEnduranceScore() : null;
        if (enduranceScore != null) {
            fVar.f176139b.getClass();
            p2 p2Var = y71.a.f194693b;
            if (p2Var.getValue() == null) {
                fVar.f176139b.getClass();
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, enduranceScore));
            }
        }
        return a0Var;
    }
}
