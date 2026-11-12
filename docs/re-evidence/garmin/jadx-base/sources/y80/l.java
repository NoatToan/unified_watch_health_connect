package y80;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lz80/c;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.BtcDeviceScanRepositoryImpl$startDeviceScan$1", f = "BtcDeviceScanRepositoryImpl.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<q53.t<? super z80.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f195170c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y80/l$a", "Ljk2/b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements jk2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q53.t<z80.c> f195171a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q53.t<? super z80.c> tVar) {
            this.f195171a = tVar;
        }

        @Override // jk2.b
        public final void a(BluetoothDevice bluetoothDevice) {
            z80.c.a aVar = new z80.c.a(bluetoothDevice);
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BtcDeviceScanRepository", "onDeviceFound() - " + aVar);
            String name = aVar.f202980a.getName();
            if (name == null || d53.w.J(name)) {
                i2.a.b(a2Var, "BtcDeviceScanRepository", "onDeviceFound() - Ignoring device with null or blank name");
            } else {
                this.f195171a.i(aVar);
            }
        }

        @Override // jk2.b
        public final void b(int i14) {
            Logger logger = jk2.a.f99425k;
            String str = i14 == 6 ? "onBluetoothAdapterDisabledException" : "onBluetoothAdapterNotFoundException";
            a2 a2Var = a2.DEVICE_SETUP;
            String strE = o2.c.e(i14, "onScanFailed() - errorCode[", "] error[", str, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BtcDeviceScanRepository", strE);
            this.f195171a.i(z80.c.b.f202981a);
        }

        @Override // jk2.b
        public final void c() {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BtcDeviceScanRepository", "onScanFinished()");
            this.f195171a.i(z80.c.C3785c.f202982a);
        }

        @Override // jk2.b
        public final void d() {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BtcDeviceScanRepository", "onScanStarted()");
            this.f195171a.i(z80.c.d.f202983a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f195170c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f195170c, dVar);
        lVar.f195169b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super z80.c> tVar, t13.d<? super Unit> dVar) {
        return ((l) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f195169b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195168a;
        if (i14 == 0) {
            o13.r.b(obj);
            k kVar = this.f195170c;
            jk2.a aVar2 = kVar.f195164b;
            Context context = kVar.f195163a;
            if (aVar2 != null) {
                a2 a2Var = a2.DEVICE_SETUP;
                i2.a aVar3 = i2.f36769a;
                aVar3.getClass();
                i2.a.b(a2Var, "BtcDeviceScanRepository", "Stopping previous device scan if any");
                aVar3.getClass();
                i2.a.b(a2Var, "BtcDeviceScanRepository", "stopDeviceScan() - Stopping device scan");
                jk2.a aVar4 = kVar.f195164b;
                if (aVar4 != null) {
                    aVar4.c(context);
                }
                kVar.f195164b = null;
            }
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "BtcDeviceScanRepository", "startDeviceScan()");
            jk2.a aVar5 = new jk2.a(new a(tVar));
            Logger logger = jk2.a.f99425k;
            logger.debug("***** START DEVICE SCANNING *****");
            jk2.b bVar = aVar5.f99427b;
            if (bVar != null) {
                bVar.d();
            }
            aVar5.f99428c = BluetoothAdapter.getDefaultAdapter();
            aVar5.f99431f = 0;
            ConcurrentHashMap concurrentHashMap = aVar5.f99429d;
            concurrentHashMap.clear();
            if (!aVar5.f99433h) {
                aVar5.f99433h = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
                intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                context.registerReceiver(aVar5.f99434i, intentFilter);
            }
            aVar5.b(3055L);
            for (BluetoothDevice bluetoothDevice : aVar5.f99428c.getBondedDevices()) {
                logger.debug("Bonded device:" + bluetoothDevice);
                if (bluetoothDevice.getType() == 1) {
                    concurrentHashMap.put(bluetoothDevice.getAddress(), bluetoothDevice);
                    if (bVar != null) {
                        bVar.a(bluetoothDevice);
                    }
                }
            }
            kVar.f195164b = aVar5;
            xr.a aVar6 = new xr.a(11, tVar, kVar);
            this.f195169b = null;
            this.f195168a = 1;
            if (q53.r.a(tVar, aVar6, this) == aVar) {
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
