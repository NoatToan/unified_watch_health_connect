package pa0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionViewModel$initializeState$2", f = "LteSubscriptionViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f136755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f136755b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f136755b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136754a;
        i iVar = this.f136755b;
        if (i14 == 0) {
            r.b(obj);
            x80.b bVar = iVar.f136738c;
            long j8 = iVar.f136736a;
            String str = iVar.f136737b;
            this.f136754a = 1;
            obj = bVar.l(j8, str, this);
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
        j90.h hVar = (j90.h) obj;
        p2 p2Var = iVar.f136739d;
        if (hVar instanceof j90.h.b) {
            do {
                value5 = p2Var.getValue();
            } while (!p2Var.b(value5, h.a((h) value5, ((j90.h.b) hVar).f97819a, m.c.f136761a, null, 4)));
        } else if (hVar instanceof j90.h.c) {
            do {
                value4 = p2Var.getValue();
            } while (!p2Var.b(value4, h.a((h) value4, null, m.a.f136759a, null, 5)));
        } else if (hVar instanceof j90.h.d) {
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, h.a((h) value3, null, m.g.f136765a, null, 5)));
        } else if (hVar instanceof j90.h.e) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, h.a((h) value2, null, m.h.f136766a, null, 5)));
        } else {
            if (!(hVar instanceof j90.h.a)) {
                u0.r();
                return null;
            }
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, h.a((h) value, null, m.c.f136761a, null, 5)));
        }
        a2 a2Var = a2.DEVICE_SETUP;
        String str2 = "LTE transfer state initialized: " + ((h) p2Var.getValue()).f136733b + ", devices: " + ((h) p2Var.getValue()).f136732a.size();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LteSubscriptionViewModel", str2);
        return Unit.INSTANCE;
    }
}
