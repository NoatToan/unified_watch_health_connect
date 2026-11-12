package ec0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.sharing.management.dtos.BluetoothConnectionType;
import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import d53.u;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lec0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f63766g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f63767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f63768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sd2.f f63769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2.g f63771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f63772f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ec0/a$b", "Landroid/content/BroadcastReceiver;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
        
            if (r8.equals("com.garmin.android.gdi.ACTION_DEVICE_CONNECTING_FAILURE") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
        
            if (r8.equals("com.garmin.android.gdi.ACTION_DEVICE_CONNECTING_TIMEOUT") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
        
            if (r8.equals("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
        
            com.garmin.android.apps.connectmobile.i2.a.b(r1, "BLEUpgradeCoordinator", "onReceive: Failed to bond. Unregistering broadcast receiver.");
            r8 = ec0.a.f63766g;
            r3.c();
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) throws Throwable {
            Parcelable parcelable;
            context.getClass();
            intent.getClass();
            String strN = fb1.c.n("onReceive: ", intent.getAction());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "BLEUpgradeCoordinator", strN);
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                a aVar2 = a.this;
                switch (iHashCode) {
                    case 966126499:
                        break;
                    case 1411406370:
                        break;
                    case 1638743627:
                        break;
                    case 2116862345:
                        if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                            } else {
                                Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                if (!(parcelableExtra instanceof BluetoothDevice)) {
                                    parcelableExtra = null;
                                }
                                parcelable = (BluetoothDevice) parcelableExtra;
                            }
                            BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
                            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                            int i14 = a.f63766g;
                            aVar2.getClass();
                            i2.a.b(a2Var, "BLEUpgradeCoordinator", "handleBondStateChange");
                            String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
                            if (bluetoothDevice != null && address != null && u.q(bluetoothDevice.getAddress(), address, true)) {
                                switch (intExtra) {
                                    case 10:
                                        i2.a.b(a2Var, "BLEUpgradeCoordinator", "Bond state changed to NONE");
                                        if (intExtra2 == 12 && !aVar2.b()) {
                                            aVar2.c();
                                            break;
                                        }
                                        break;
                                    case 11:
                                        i2.a.b(a2Var, "BLEUpgradeCoordinator", "Bond state changed to BONDING");
                                        break;
                                    case 12:
                                        i2.a.b(a2Var, "BLEUpgradeCoordinator", "Bond state changed to BONDED");
                                        i2.a.b(a2Var, "BLEUpgradeCoordinator", "Starting post bonded tasks for: ".concat(address));
                                        ge1.b.W(t13.h.f161748a, new d(aVar2, address, null));
                                        break;
                                    default:
                                        i2.a.b(a2Var, "BLEUpgradeCoordinator", "Bond state changed to " + intExtra);
                                        aVar2.c();
                                        break;
                                }
                            }
                        }
                        break;
                }
                return;
            }
            i2.a.b(a2Var, "BLEUpgradeCoordinator", "onReceive: Waiting for state to change");
        }
    }

    static {
        new C1346a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f63767a = new byte[0];
        this.f63768b = context;
        yl2.b bVar = yl2.b.f197686f;
        this.f63771e = lm2.h.c();
        this.f63772f = new b();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        if (dn2.d.f(r14, r12, r4, r0) == r1) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00bb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00db, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, v13.c cVar) throws Throwable {
        e eVar;
        Long l14;
        byte[] bArr;
        Object objE0;
        sd2.f fVar;
        Integer num;
        BluetoothConnectionType bluetoothConnectionType;
        String strB;
        aVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f63786e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f63786e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar, cVar);
            }
        } else {
            eVar = new e(aVar, cVar);
        }
        Object obj = eVar.f63784c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f63786e;
        if (i15 != 0) {
            if (i15 == 1) {
                Long l15 = eVar.f63783b;
                String str2 = eVar.f63782a;
                r.b(obj);
                l14 = l15;
                str = str2;
                objE0 = obj;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "4.- uploadNewDeviceInfo");
        sd2.f fVar2 = aVar.f63769c;
        l14 = fVar2 != null ? new Long(fVar2.getUnitID()) : null;
        if (l14 == null) {
            bArr = null;
            fVar = aVar.f63769c;
            if (fVar != null) {
                num = new Integer(fVar.getConnectionType());
            } else {
                num = null;
            }
            if (num == null && num.intValue() == 1) {
                bluetoothConnectionType = BluetoothConnectionType.LOW_ENERGY;
            } else {
                bluetoothConnectionType = BluetoothConnectionType.CLASSIC;
            }
            fn2.a.f72254a.getClass();
            strB = fn2.a.b(bArr);
            if (strB == null) {
                String str3 = "uploadNewDeviceInfo " + l14 + " skipped, missing capabilities";
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.p(a2Var2, "BLEUpgradeCoordinator", str3);
                return Unit.INSTANCE;
            }
            ConnectionInfoDto connectionInfoDto = new ConnectionInfoDto(str, strB, null, bluetoothConnectionType);
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var3, "BLEUpgradeCoordinator", "uploadNewDeviceInfo: Attempting GC connection info update " + l14);
            if (l14 != null) {
                long jLongValue = l14.longValue();
                im2.c.f94215e.getClass();
                dn2.d dVarA = im2.c.a.a();
                eVar.f63782a = null;
                eVar.f63783b = null;
                eVar.f63786e = 2;
            }
            return Unit.INSTANCE;
        }
        long jLongValue2 = l14.longValue();
        eVar.f63782a = str;
        eVar.f63783b = l14;
        eVar.f63786e = 1;
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "getDeviceCapabilities: " + jLongValue2);
        x53.c cVar2 = s0.f129406a;
        objE0 = ge1.b.e0(x53.b.f189152a, new c(jLongValue2, aVar, null), eVar);
        return aVar2;
        bArr = (byte[]) objE0;
        fVar = aVar.f63769c;
        if (fVar != null) {
            num = new Integer(fVar.getConnectionType());
        } else {
            num = null;
        }
        if (num == null) {
            bluetoothConnectionType = BluetoothConnectionType.CLASSIC;
        } else {
            bluetoothConnectionType = BluetoothConnectionType.LOW_ENERGY;
        }
        fn2.a.f72254a.getClass();
        strB = fn2.a.b(bArr);
        if (strB == null) {
            String str4 = "uploadNewDeviceInfo " + l14 + " skipped, missing capabilities";
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar6.getClass();
            i2.a.p(a2Var4, "BLEUpgradeCoordinator", str4);
            return Unit.INSTANCE;
        }
        ConnectionInfoDto connectionInfoDto2 = new ConnectionInfoDto(str, strB, null, bluetoothConnectionType);
        i2.a aVar7 = i2.f36769a;
        a2 a2Var5 = a2.GENERAL;
        aVar7.getClass();
        i2.a.b(a2Var5, "BLEUpgradeCoordinator", "uploadNewDeviceInfo: Attempting GC connection info update " + l14);
        if (l14 != null) {
            long jLongValue3 = l14.longValue();
            im2.c.f94215e.getClass();
            dn2.d dVarA2 = im2.c.a.a();
            eVar.f63782a = null;
            eVar.f63783b = null;
            eVar.f63786e = 2;
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"MissingPermission"})
    public final boolean b() {
        String strN = fb1.c.n("changeConnectionToSystemLevelBond: ", this.f63770d);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BLEUpgradeCoordinator", strN);
        BluetoothAdapter bluetoothAdapterA = oa2.a.a(this.f63768b);
        BluetoothDevice remoteDevice = bluetoothAdapterA != null ? bluetoothAdapterA.getRemoteDevice(this.f63770d) : null;
        if (remoteDevice == null) {
            i2.a.f(a2Var, "BLEUpgradeCoordinator", "device is null");
            return false;
        }
        String address = remoteDevice.getAddress();
        if (address == null) {
            i2.a.f(a2Var, "BLEUpgradeCoordinator", "address is null");
            return false;
        }
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "pairing device");
        ((fm2.c) this.f63771e).l(address);
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "creating bond");
        return remoteDevice.createBond();
    }

    public final void c() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "unregisterReceiver");
        zo0.g.f206137d.getClass();
        zo0.g.f206138e.set(false);
        this.f63768b.unregisterReceiver(this.f63772f);
    }

    /* JADX INFO: renamed from: ec0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lec0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1346a {
        public /* synthetic */ C1346a(j jVar) {
            this();
        }

        private C1346a() {
        }
    }
}
