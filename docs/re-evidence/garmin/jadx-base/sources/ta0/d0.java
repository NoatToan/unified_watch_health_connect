package ta0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f163265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f163266b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$startDeviceDiscovery$3$2$1", f = "DeviceDiscoveryViewModel.kt", l = {239}, m = "emit", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f163267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0<T> f163268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f163269c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d0<? super T> d0Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f163268b = d0Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f163267a = obj;
            this.f163269c |= Integer.MIN_VALUE;
            return this.f163268b.emit(null, this);
        }
    }

    public d0(o53.b0 b0Var, x xVar) {
        this.f163265a = b0Var;
        this.f163266b = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r53.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(l90.g gVar, t13.d<? super Unit> dVar) {
        a aVar;
        Object value;
        Object value2;
        Object value3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f163269c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f163269c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object objAwait = aVar.f163267a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f163269c;
        x xVar = this.f163266b;
        if (i15 == 0) {
            o13.r.b(objAwait);
            if (gVar instanceof l90.g.a) {
                l90.g.a aVar3 = (l90.g.a) gVar;
                l90.b bVar = aVar3.f111555b;
                dk2.d dVar2 = aVar3.f111554a;
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "DeviceDiscoveryViewModel", "Device found, navigating to device confirm screen: " + dVar2);
                p2 p2Var = xVar.f163464h;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, xVar.z4(bVar, dVar2)));
                o53.r<l90.c> rVar = aVar3.f111556c;
                xVar.f163480z = rVar;
                aVar.f163269c = 1;
                objAwait = rVar.await(aVar);
                if (objAwait == aVar2) {
                    return aVar2;
                }
            } else {
                if (!p005kotlin.jvm.internal.s.g(gVar, l90.g.b.f111557a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Device discovery timed out, enabling troubleshooting");
                p2 p2Var2 = xVar.f163472p;
                do {
                    value = p2Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var2.b(value, Boolean.TRUE));
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objAwait);
        if (((l90.c) objAwait) == l90.c.CONFIRM) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DeviceDiscoveryViewModel", "User confirmed device, canceling discovery job");
            xVar.x4();
        } else {
            a2 a2Var3 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DeviceDiscoveryViewModel", "User did not confirm device, keep scanning for devices");
            p2 p2Var3 = xVar.f163464h;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, null));
        }
        return Unit.INSTANCE;
    }
}
