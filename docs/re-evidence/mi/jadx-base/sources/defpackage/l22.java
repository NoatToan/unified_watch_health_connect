package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.miot.core.bluetooth.TransferLoggerKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import no.nordicsemi.android.ble.data.Data;
import no.nordicsemi.android.ble.x;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l22 extends pr2 implements jpc {
    public BluetoothGatt j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<BluetoothGattCharacteristic, j> f24540k;
    public final Map<UUID, List<ht2<byte[]>>> l;

    public class a implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f24541a;

        public a(ht2 ht2Var) {
            this.f24541a = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f24541a.onResponse(bluetoothDevice.getName());
        }
    }

    public class b implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f24543a;

        public b(ht2 ht2Var) {
            this.f24543a = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f24543a.onResponse(null);
        }
    }

    public class c implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f24545a;

        public c(ht2 ht2Var) {
            this.f24545a = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f24545a.onResponse(null);
        }
    }

    public class d implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f24547a;

        public d(ht2 ht2Var) {
            this.f24547a = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f24547a.onResponse(null);
        }
    }

    public class e implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f24549a;

        public e(ht2 ht2Var) {
            this.f24549a = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f24549a.onResponse(null);
        }
    }

    public class f implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ht2 f24551a;

        public f(ht2 ht2Var) {
            this.f24551a = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            this.f24551a.onResponse(null);
        }
    }

    public class g implements cpo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BluetoothGattCharacteristic f24553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ht2 f24554b;

        public g(BluetoothGattCharacteristic bluetoothGattCharacteristic, ht2 ht2Var) {
            this.f24553a = bluetoothGattCharacteristic;
            this.f24554b = ht2Var;
        }

        @Override // defpackage.cpo
        public void a(BluetoothDevice bluetoothDevice) {
            l22.this.f24540k.remove(this.f24553a);
            this.f24554b.onResponse(null);
        }
    }

    public class h extends pr2.b {
        public h() {
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        public void W1() {
            l22 l22Var = l22.this;
            l22Var.j = null;
            l22Var.f24540k.clear();
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        public boolean l1(BluetoothGatt bluetoothGatt) {
            l22.this.j = bluetoothGatt;
            return true;
        }
    }

    public static class i implements a89, ehd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ht2 f24555a;

        public i(ht2 ht2Var) {
            this.f24555a = ht2Var;
        }

        @Override // defpackage.a89
        public void a(BluetoothDevice bluetoothDevice, int i) {
            this.f24555a.onFailed(i);
        }

        @Override // defpackage.ehd
        public void b() {
            this.f24555a.onFailed(-1000000);
        }
    }

    public class j implements an5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BluetoothGattCharacteristic f24556a;

        public j(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.f24556a = bluetoothGattCharacteristic;
        }

        @Override // defpackage.an5
        public void a(BluetoothDevice bluetoothDevice, Data data) {
            List list = (List) l22.this.l.get(this.f24556a.getUuid());
            if (list != null) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    ((ht2) it.next()).onResponse(data.d());
                }
            }
        }
    }

    public l22(Context context, qr2 qr2Var) {
        super(context);
        this.f24540k = new HashMap();
        this.l = new HashMap();
        K(qr2Var);
    }

    @Override // defpackage.pr2
    public void D(int i2, String str) {
        if (i2 == 4) {
            TransferLoggerKt.logger.i("BleManager", str);
            return;
        }
        if (i2 == 5) {
            TransferLoggerKt.logger.w("BleManager", str, new Object[0]);
        } else if (i2 == 6 || i2 == 7) {
            TransferLoggerKt.logger.e("BleManager", str, new Object[0]);
        } else {
            TransferLoggerKt.logger.d("BleManager", str, new Object[0]);
        }
    }

    public final void R(x xVar, ht2 ht2Var) {
        i iVar = new i(ht2Var);
        xVar.k(iVar).l(iVar).j();
    }

    public BluetoothGattCharacteristic S(UUID uuid, UUID uuid2) {
        return U(uuid, uuid2, true);
    }

    public final BluetoothGattCharacteristic T(UUID uuid, UUID uuid2, ht2 ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicS = S(uuid, uuid2);
        if (bluetoothGattCharacteristicS != null) {
            return bluetoothGattCharacteristicS;
        }
        if (isConnected()) {
            ht2Var.onFailed(-3);
            return null;
        }
        ht2Var.onFailed(-1);
        return null;
    }

    public final BluetoothGattCharacteristic U(UUID uuid, UUID uuid2, boolean z) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.j;
        if (bluetoothGatt != null && (service = bluetoothGatt.getService(uuid)) != null) {
            return service.getCharacteristic(uuid2);
        }
        if (!z) {
            return null;
        }
        D(5, "characteristic (" + uuid2 + ") not exist");
        return null;
    }

    public void V(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f24540k.get(bluetoothGattCharacteristic) == null) {
            j jVar = new j(bluetoothGattCharacteristic);
            L(bluetoothGattCharacteristic).f(jVar);
            this.f24540k.put(bluetoothGattCharacteristic, jVar);
        }
    }

    @Override // defpackage.jpc
    public boolean a(UUID uuid, UUID uuid2) {
        return U(uuid, uuid2, false) != null;
    }

    @Override // defpackage.jpc
    public void b(ht2<Void> ht2Var) {
        R(t().i(new b(ht2Var)), ht2Var);
    }

    @Override // defpackage.jpc
    public void c(String str, ht2<String> ht2Var) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            R(q(defaultAdapter.getRemoteDevice(str)).R(false).O(3, 100).i(new a(ht2Var)), ht2Var);
        }
    }

    @Override // defpackage.jpc
    public void d(UUID uuid, UUID uuid2, ht2<byte[]> ht2Var) {
        List<ht2<byte[]>> list = this.l.get(uuid2);
        if (list != null) {
            list.remove(ht2Var);
        }
    }

    @Override // defpackage.jpc
    public void destroy() {
    }

    @Override // defpackage.jpc
    public boolean e() {
        return A();
    }

    @Override // defpackage.jpc
    public boolean f(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicS = S(uuid, uuid2);
        if (bluetoothGattCharacteristicS == null) {
            return false;
        }
        V(bluetoothGattCharacteristicS);
        return true;
    }

    @Override // defpackage.jpc
    public void g(UUID uuid, UUID uuid2, byte[] bArr, ht2<Void> ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicT = T(uuid, uuid2, ht2Var);
        if (bluetoothGattCharacteristicT != null) {
            R(O(bluetoothGattCharacteristicT, bArr).i(new e(ht2Var)), ht2Var);
        }
    }

    @Override // defpackage.jpc
    public void j(ht2<Void> ht2Var) {
        R(r().i(new c(ht2Var)), ht2Var);
    }

    @Override // defpackage.jpc
    public void k(UUID uuid, UUID uuid2, ht2<Void> ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicT = T(uuid, uuid2, ht2Var);
        if (bluetoothGattCharacteristicT != null) {
            R(s(bluetoothGattCharacteristicT).i(new g(bluetoothGattCharacteristicT, ht2Var)), ht2Var);
        }
    }

    @Override // defpackage.jpc
    public void l(UUID uuid, UUID uuid2, ht2<byte[]> ht2Var) {
        List<ht2<byte[]>> arrayList = this.l.get(uuid2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.l.put(uuid2, arrayList);
        }
        if (arrayList.contains(ht2Var)) {
            return;
        }
        arrayList.add(ht2Var);
    }

    @Override // defpackage.jpc
    public void n(ht2<Void> ht2Var) {
        R(I().i(new d(ht2Var)), ht2Var);
    }

    @Override // defpackage.jpc
    public int o() {
        return y();
    }

    @Override // defpackage.jpc
    public void p(UUID uuid, UUID uuid2, ht2<Void> ht2Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicT = T(uuid, uuid2, ht2Var);
        StringBuilder sb = new StringBuilder();
        sb.append("enableNotification() called with: serviceUUID = [");
        sb.append(uuid);
        sb.append("], characteristicUUID = [");
        sb.append(uuid2);
        sb.append("], response = [");
        sb.append(ht2Var);
        sb.append("]");
        if (bluetoothGattCharacteristicT != null) {
            R(v(bluetoothGattCharacteristicT).i(new f(ht2Var)), ht2Var);
        }
    }
}
