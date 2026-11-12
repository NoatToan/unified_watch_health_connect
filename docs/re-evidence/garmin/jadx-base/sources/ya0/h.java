package ya0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.CompanionDeviceRouteViewModel$disconnectUnknownDevices$1", f = "CompanionDeviceRouteViewModel.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f195440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f195441c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.CompanionDeviceRouteViewModel$disconnectUnknownDevices$1$2", f = "CompanionDeviceRouteViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super o13.q<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f195442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f195443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f195443b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f195443b, dVar);
            aVar.f195442a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.q<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Context context = this.f195443b;
            try {
                int i14 = o13.q.f128596b;
                la2.e eVar = da2.d.c(context).f58886a;
                Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
                bondedDevices.getClass();
                ArrayList<BluetoothDevice> arrayList = new ArrayList();
                for (Object obj2 : bondedDevices) {
                    rd2.j jVar = rd2.f.a().f152045a;
                    String address = ((BluetoothDevice) obj2).getAddress();
                    jVar.getClass();
                    sd2.j jVarF = rd2.j.f(address);
                    if (jVarF == null || !jVarF.isPaired()) {
                        arrayList.add(obj2);
                    }
                }
                for (BluetoothDevice bluetoothDevice : arrayList) {
                    a2 a2Var = a2.DEVICE_SETUP;
                    String str = "Disconnecting unknown device " + bluetoothDevice.getName() + " - " + bluetoothDevice.getAddress();
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "CompanionDeviceRouteViewModel", str);
                    String address2 = bluetoothDevice.getAddress();
                    address2.getClass();
                    eVar.e(address2);
                }
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                a2 a2Var2 = a2.DEVICE_SETUP;
                String strP = am.j.p("Failed to disconnect unknown devices ", thB);
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "CompanionDeviceRouteViewModel", strP);
            }
            return o13.q.a(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f195440b = context;
        this.f195441c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f195440b, this.f195441c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195439a;
        g gVar = this.f195441c;
        if (i14 == 0) {
            o13.r.b(obj);
            j22.b.f96736a.getClass();
            Context context = this.f195440b;
            if (j22.b.b(context)) {
                p2 p2Var = gVar.f195432b;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, Boolean.FALSE));
                o53.z zVar = gVar.f195431a;
                a aVar2 = new a(context, null);
                this.f195439a = 1;
                if (ge1.b.e0(zVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        p2 p2Var2 = gVar.f195432b;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, Boolean.TRUE));
        return Unit.INSTANCE;
    }
}
