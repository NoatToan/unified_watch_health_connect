package v41;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.DeletePlanUseCase$deletePlan$1", f = "DeletePlanUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a f175577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a f175578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f175580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f175581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f175582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f175580d = dVar;
        this.f175581e = aVar;
        this.f175582f = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f175580d, this.f175581e, this.f175582f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        e23.a<Unit> aVar;
        Object objJ;
        e23.a<Unit> aVar2;
        z1<u41.b> z1Var;
        u41.b value2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175579c;
        d dVar = this.f175580d;
        if (i14 == 0) {
            o13.r.b(obj);
            z1<u41.b> z1Var2 = dVar.f175586c;
            do {
                value = z1Var2.getValue();
            } while (!z1Var2.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, true, false, false, 14335)));
            Long l14 = dVar.f175586c.getValue().f168609a.f39760b.f39764a;
            if (l14 != null) {
                r41.a aVar4 = dVar.f175585b;
                long jLongValue = l14.longValue();
                aVar = this.f175581e;
                this.f175577a = aVar;
                e23.a<Unit> aVar5 = this.f175582f;
                this.f175578b = aVar5;
                this.f175579c = 1;
                objJ = com.garmin.android.apps.connectmobile.f0.J(aVar4, new r41.c(aVar4, jLongValue, null), this);
                if (objJ == aVar3) {
                    return aVar3;
                }
                aVar2 = aVar5;
            }
            z1Var = dVar.f175586c;
            do {
                value2 = z1Var.getValue();
            } while (!z1Var.b(value2, u41.b.a(value2, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 14335)));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar2 = this.f175578b;
        aVar = this.f175577a;
        o13.r.b(obj);
        objJ = obj;
        if (((v2) objJ) instanceof v2.b) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
        z1Var = dVar.f175586c;
        do {
            value2 = z1Var.getValue();
        } while (!z1Var.b(value2, u41.b.a(value2, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 14335)));
        return Unit.INSTANCE;
    }
}
