package cq0;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.SafetyEventViewModel$fetchEmergencyContacts$1", f = "SafetyEventViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f55173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f55173b = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f55173b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<l20.a> listF;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55172a;
        y yVar = this.f55173b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                iq0.c cVar = yVar.f55176a;
                this.f55172a = 1;
                cVar.getClass();
                o53.k kVar = new o53.k(u13.f.b(this), 1);
                kVar.q();
                kVar.r(new iq0.a(cVar.f94736a.q(new iq0.b(kVar))));
                obj = kVar.p();
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
            l20.r rVar = (l20.r) obj;
            c2 c2Var = yVar.f55179d;
            if (rVar == null || (listF = rVar.f()) == null) {
                listF = j0.f134944a;
            }
            c2Var.setValue(listF);
        } catch (Exception unused) {
            yVar.f55179d.setValue(j0.f134944a);
        }
        return Unit.INSTANCE;
    }
}
