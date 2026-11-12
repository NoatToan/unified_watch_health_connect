package ta0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.BtcDeviceDiscoveryViewModel$startDeviceDiscovery$1", f = "BtcDeviceDiscoveryViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f163220b;

    /* JADX INFO: renamed from: ta0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3072a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f163221a;

        public C3072a(b bVar) {
            this.f163221a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            va0.a aVar;
            ArrayList arrayListD1;
            z80.c cVar = (z80.c) obj;
            boolean z14 = cVar instanceof z80.c.a;
            b bVar = this.f163221a;
            if (z14) {
                p2 p2Var = bVar.f163235b;
                do {
                    value4 = p2Var.getValue();
                    aVar = (va0.a) value4;
                    arrayListD1 = p13.h0.d1(aVar.f176568b);
                    arrayListD1.add(((z80.c.a) cVar).f202980a);
                    Unit unit = Unit.INSTANCE;
                } while (!p2Var.b(value4, va0.a.a(aVar, arrayListD1, false, false, 13)));
            } else if (cVar instanceof z80.c.d) {
                p2 p2Var2 = bVar.f163235b;
                do {
                    value3 = p2Var2.getValue();
                } while (!p2Var2.b(value3, va0.a.a((va0.a) value3, p13.j0.f134944a, false, false, 1)));
            } else if (cVar instanceof z80.c.C3785c) {
                p2 p2Var3 = bVar.f163235b;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, va0.a.a((va0.a) value2, null, false, true, 7)));
            } else {
                if (!(cVar instanceof z80.c.b)) {
                    lc.u0.r();
                    return null;
                }
                p2 p2Var4 = bVar.f163235b;
                do {
                    value = p2Var4.getValue();
                } while (!p2Var4.b(value, va0.a.a((va0.a) value, null, true, false, 11)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f163220b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f163220b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163219a;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = this.f163220b;
            k90.q qVar = bVar.f163234a;
            qVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BtcDeviceDiscoveryUseCase", "Starting BTC device discovery");
            k90.r rVar = new k90.r(qVar.f103592a.a(), qVar);
            C3072a c3072a = new C3072a(bVar);
            this.f163219a = 1;
            if (rVar.collect(c3072a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
