package z10;

import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowViewModel$fetchIncidentDetectionConsentText$1", f = "ChildConsentsFlowViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f201309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f201309b = b0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f201309b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201308a;
        b0 b0Var = this.f201309b;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.p2 p2Var = b0Var.f200893c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, i2.a((i2) value, true, null, 14)));
            p92.o oVar = p92.o.f136619a;
            q92.w wVar = q92.w.DI_CONNECT_IDTERMS;
            this.f201308a = 1;
            obj = oVar.e(wVar, Locale.getDefault(), this);
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
        s92.g gVar = (s92.g) obj;
        if (gVar == null) {
            r53.p2 p2Var2 = b0Var.f200893c;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, new i2(false, true, ((i2) value3).f201045c + 1, null)));
        } else {
            r53.p2 p2Var3 = b0Var.f200893c;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, i2.a((i2) value2, false, gVar, 4)));
        }
        return Unit.INSTANCE;
    }
}
