package wn0;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusReportsViewModel$getDevicePulseOxSettingsNavArgs$1", f = "HealthStatusReportsViewModel.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f186157b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f186157b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186156a;
        l lVar = this.f186157b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = lVar.f186138i;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p.a((p) value, true, null, false, false, 14)));
            long jS4 = lVar.f186135f.s4();
            mn0.c cVar = lVar.f186134e;
            this.f186156a = 1;
            objA = cVar.a(jS4, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = ((o13.q) obj).f128597a;
        }
        int i15 = o13.q.f128596b;
        if (!(objA instanceof o13.q.b)) {
            vn0.a aVar2 = (vn0.a) objA;
            p2 p2Var2 = lVar.f186138i;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, p.a((p) value3, false, aVar2, false, false, 12)));
        }
        if (o13.q.b(objA) != null) {
            p2 p2Var3 = lVar.f186138i;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, p.a((p) value2, false, null, true, false, 10)));
        }
        return Unit.INSTANCE;
    }
}
