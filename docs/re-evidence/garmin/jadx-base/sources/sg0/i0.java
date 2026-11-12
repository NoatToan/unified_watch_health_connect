package sg0;

import ch.qos.logback.core.net.SyslogConstants;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$generateViewOnlyUri$1", f = "ManageChildViewModel.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f159098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, String str, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f159098b = f0Var;
        this.f159099c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f159098b, this.f159099c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159097a;
        f0 f0Var = this.f159098b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = f0Var.f159087f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, true, null, false, false, false, null, null, 8159)));
            f0Var.f159088g.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
            te0.e eVar = f0Var.f159084c;
            this.f159097a = 1;
            objA = eVar.a(this.f159099c, true, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA = obj;
        }
        fw.m mVar = (fw.m) objA;
        p2 p2Var2 = f0Var.f159087f;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, false, null, false, false, false, null, null, 8159)));
        c2 c2Var = f0Var.f159089h;
        if (c2Var != null && !c2Var.isCancelled()) {
            f0Var.f159088g.setValue(mVar);
        }
        return Unit.INSTANCE;
    }
}
