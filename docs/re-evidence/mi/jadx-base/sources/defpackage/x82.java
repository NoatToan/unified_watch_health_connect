package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.android.ble.data.Data;
import com.xiaomi.android.ble.v;
import com.xiaomi.miot.core.bluetooth.TransferLoggerKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class x82 extends com.xiaomi.android.ble.d<qr2> implements jpc {
    public final boolean D;
    public final boolean E;
    public boolean F;
    public int G;
    public final Map<BluetoothGattCharacteristic, j> H;
    public final Map<UUID, List<ht2<byte[]>>> I;

    public class a implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f38805a;

        public a(ht2 ht2Var) {
            this.f38805a = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f38805a.onResponse(bluetoothDevice.getName());
        }
    }

    public class b implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f38807a;

        public b(ht2 ht2Var) {
            this.f38807a = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f38807a.onResponse(null);
        }
    }

    public class c implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f38809a;

        public c(ht2 ht2Var) {
            this.f38809a = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f38809a.onResponse(null);
        }
    }

    public class d implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f38811a;

        public d(ht2 ht2Var) {
            this.f38811a = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f38811a.onResponse(null);
        }
    }

    public class e implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f38813a;

        public e(ht2 ht2Var) {
            this.f38813a = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f38813a.onResponse(null);
        }
    }

    public class f implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f38815a;

        public f(ht2 ht2Var) {
            this.f38815a = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f38815a.onResponse(null);
        }
    }

    public class g implements dpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BluetoothGattCharacteristic f38817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ht2 f38818b;

        public g(BluetoothGattCharacteristic bluetoothGattCharacteristic, ht2 ht2Var) {
            this.f38817a = bluetoothGattCharacteristic;
            this.f38818b = ht2Var;
        }

        @Override // defpackage.dpo
        public void a(BluetoothDevice bluetoothDevice) {
            x82.this.H.remove(this.f38817a);
            this.f38818b.onResponse(null);
        }
    }

    public class h extends com.xiaomi.android.ble.d<qr2>.e {

        public class a implements n9g {
            public a() {
            }

            @Override // defpackage.n9g
            public void a(BluetoothDevice bluetoothDevice, int i) {
                x82.this.F = true;
            }
        }

        public class b implements bn5 {
            public b() {
            }

            @Override // defpackage.bn5
            public void a(BluetoothDevice bluetoothDevice, Data data) {
                byte b2;
                byte[] bArrA = data.a();
                if (bArrA != null) {
                    int i = 0;
                    while (i < bArrA.length && i < 3) {
                        x82 x82Var = x82.this;
                        int i2 = x82Var.G;
                        byte b3 = bArrA[i];
                        if (i == 0) {
                            b2 = 16;
                        } else {
                            b2 = i == 1 ? (byte) 8 : (byte) 0;
                        }
                        x82Var.G = i2 + (b3 << b2);
                        i++;
                    }
                }
            }
        }

        public h() {
            super();
        }

        @Override // com.xiaomi.android.ble.d.e
        public void c0() {
            if (x82.this.D && !x82.this.F) {
                x82.this.m1(512).A(new a()).e();
            }
            x82.this.G = 0;
            BluetoothGattCharacteristic bluetoothGattCharacteristicG1 = x82.this.G1(qf4.f31472a, qf4.f31473b);
            if (bluetoothGattCharacteristicG1 != null) {
                x82.this.k1(bluetoothGattCharacteristicG1).A(new b()).e();
            }
        }

        @Override // com.xiaomi.android.ble.d.e
        public boolean f0(rye ryeVar) {
            return true;
        }

        @Override // com.xiaomi.android.ble.d.e
        public void v0() {
            x82.this.f1(23);
            x82.this.F = false;
            x82.this.G = 0;
        }
    }

    public static class i implements b89, fhd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ht2 f38821a;

        public i(ht2 ht2Var) {
            this.f38821a = ht2Var;
        }

        @Override // defpackage.b89
        public void a(BluetoothDevice bluetoothDevice, int i) {
            this.f38821a.onFailed(i);
        }

        @Override // defpackage.fhd
        public void b() {
            this.f38821a.onFailed(-1000000);
        }
    }

    public class j implements bn5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BluetoothGattCharacteristic f38822a;

        public j(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.f38822a = bluetoothGattCharacteristic;
        }

        @Override // defpackage.bn5
        public void a(BluetoothDevice bluetoothDevice, Data data) {
            List list = (List) x82.this.I.get(this.f38822a.getUuid());
            if (list != null) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    ((ht2) it.next()).onResponse(data.a());
                }
            }
        }
    }

    public x82(Context context, boolean z, qr2 qr2Var, boolean z2) {
        super(context);
        this.F = false;
        this.G = 0;
        this.H = new HashMap();
        this.I = new HashMap();
        o1(qr2Var);
        this.D = z;
        this.E = z2;
    }

    private BluetoothGattCharacteristic H1(UUID uuid, UUID uuid2, ht2 ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicG1 = G1(uuid, uuid2);
        if (bluetoothGattCharacteristicG1 != null) {
            return bluetoothGattCharacteristicG1;
        }
        if (isConnected()) {
            ht2Var.onFailed(-3);
            return null;
        }
        ht2Var.onFailed(-1);
        return null;
    }

    private BluetoothGattCharacteristic I1(UUID uuid, UUID uuid2, boolean z) {
        BluetoothGattService bluetoothGattServiceU;
        rye ryeVar = this.d;
        if (ryeVar != null && (bluetoothGattServiceU = ryeVar.u(uuid)) != null) {
            return bluetoothGattServiceU.getCharacteristic(uuid2);
        }
        if (!z) {
            return null;
        }
        d1(5, "characteristic (" + uuid2 + ") not exist");
        return null;
    }

    @Override // com.xiaomi.android.ble.d
    public com.xiaomi.android.ble.d<qr2>.e E0() {
        return new h();
    }

    public void E1(String str, boolean z, ht2<String> ht2Var) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
            d1(4, "bluetoothDevice type = " + remoteDevice.getType());
            F1(w0(remoteDevice, z).H(false).E(3, 100).d(new a(ht2Var)), ht2Var);
        }
    }

    public final void F1(v vVar, ht2 ht2Var) {
        i iVar = new i(ht2Var);
        vVar.f(iVar).g(iVar).e();
    }

    public BluetoothGattCharacteristic G1(UUID uuid, UUID uuid2) {
        return I1(uuid, uuid2, true);
    }

    public long J1() {
        rye ryeVar = this.d;
        if (ryeVar == null) {
            return 0L;
        }
        return ryeVar.t();
    }

    public boolean K1() {
        rye ryeVar = this.d;
        return ryeVar != null && ryeVar.v();
    }

    public void L1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.H.get(bluetoothGattCharacteristic) == null) {
            j jVar = new j(bluetoothGattCharacteristic);
            p1(bluetoothGattCharacteristic).c(jVar);
            this.H.put(bluetoothGattCharacteristic, jVar);
        }
    }

    @Override // defpackage.jpc
    public boolean a(UUID uuid, UUID uuid2) {
        return I1(uuid, uuid2, false) != null;
    }

    @Override // defpackage.jpc
    public void b(ht2<Void> ht2Var) {
        F1(z0().d(new b(ht2Var)), ht2Var);
    }

    @Override // defpackage.jpc
    public void c(String str, ht2<String> ht2Var) {
        E1(str, false, ht2Var);
    }

    @Override // defpackage.jpc
    public void d(UUID uuid, UUID uuid2, ht2<byte[]> ht2Var) {
        List<ht2<byte[]>> list = this.I.get(uuid2);
        if (list != null) {
            list.remove(ht2Var);
        }
    }

    @Override // com.xiaomi.android.ble.d
    public void d1(int i2, String str) {
        if (i2 == 4) {
            TransferLoggerKt.logger.i("MIBleManager", str);
            return;
        }
        if (i2 == 5) {
            TransferLoggerKt.logger.w("MIBleManager", str, new Object[0]);
        } else if (i2 == 6 || i2 == 7) {
            TransferLoggerKt.logger.e("MIBleManager", str, new Object[0]);
        } else {
            TransferLoggerKt.logger.d("MIBleManager", str, new Object[0]);
        }
    }

    @Override // com.xiaomi.android.ble.d, defpackage.jpc
    public void destroy() {
        super.destroy();
    }

    @Override // defpackage.jpc
    public boolean e() {
        return a1();
    }

    @Override // defpackage.jpc
    public boolean f(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicG1 = G1(uuid, uuid2);
        if (bluetoothGattCharacteristicG1 == null) {
            return false;
        }
        L1(bluetoothGattCharacteristicG1);
        return true;
    }

    @Override // defpackage.jpc
    public void g(UUID uuid, UUID uuid2, byte[] bArr, ht2<Void> ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicH1 = H1(uuid, uuid2, ht2Var);
        if (bluetoothGattCharacteristicH1 != null) {
            F1(s1(bluetoothGattCharacteristicH1, bArr).d(new e(ht2Var)), ht2Var);
        }
    }

    @Override // defpackage.jpc
    public int getVersion() {
        return this.G;
    }

    @Override // defpackage.jpc
    public String getVersionName() {
        return "0.0.0";
    }

    @Override // defpackage.jpc
    public void j(ht2<Void> ht2Var) {
        F1(x0().d(new c(ht2Var)), ht2Var);
    }

    @Override // defpackage.jpc
    public void k(UUID uuid, UUID uuid2, ht2<Void> ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicH1 = H1(uuid, uuid2, ht2Var);
        if (bluetoothGattCharacteristicH1 != null) {
            F1(y0(bluetoothGattCharacteristicH1).d(new g(bluetoothGattCharacteristicH1, ht2Var)), ht2Var);
        }
    }

    @Override // defpackage.jpc
    public void l(UUID uuid, UUID uuid2, ht2<byte[]> ht2Var) {
        List<ht2<byte[]>> arrayList = this.I.get(uuid2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.I.put(uuid2, arrayList);
        }
        if (arrayList.contains(ht2Var)) {
            return;
        }
        arrayList.add(ht2Var);
    }

    @Override // defpackage.jpc
    public void n(ht2<Void> ht2Var) {
        F1(l1().d(new d(ht2Var)), ht2Var);
    }

    @Override // defpackage.jpc
    public int o() {
        return F0();
    }

    @Override // defpackage.jpc
    public void p(UUID uuid, UUID uuid2, ht2<Void> ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicH1 = H1(uuid, uuid2, ht2Var);
        if (bluetoothGattCharacteristicH1 != null) {
            F1(A0(bluetoothGattCharacteristicH1).d(new f(ht2Var)), ht2Var);
        }
    }

    @Override // com.xiaomi.android.ble.d
    public boolean q1() {
        return this.E;
    }
}
