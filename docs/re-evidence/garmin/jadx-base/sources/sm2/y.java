package sm2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import bd0.c0;
import com.garmin.device.pairing.PairingException;
import java.io.IOException;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class y extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm2.f f160362i;

    public class a implements lm2.f.a<Void> {
        public a(lm2.g gVar) {
        }

        @Override // lm2.f.a
        public final void a() {
            y yVar = y.this;
            rm2.c cVar = yVar.f160342h;
            if (cVar != null) {
                cVar.v(qm2.k.SAVED_DEVICE_TO_LOCAL_DATABASE);
            }
            lm2.h.d();
            yVar.d();
        }

        @Override // lm2.f.a
        public final void onFailure(Throwable th3) {
            yl2.e eVar = yl2.e.NETWORK;
            y yVar = y.this;
            yVar.e(new PairingException(yVar, eVar));
        }
    }

    public y(Context context, yl2.d dVar, rm2.c cVar, lm2.f fVar) {
        super(context, dVar, cVar, "SaveDeviceToDbOperation");
        this.f160362i = fVar;
    }

    @Override // sm2.r
    @SuppressLint({"MissingPermission"})
    public final void h() throws PairingException, IOException {
        String strA;
        yl2.d dVar = this.f160338d;
        dVar.f197854p = false;
        bm2.d dVar2 = dVar.f197842d;
        Logger logger = this.f160340f;
        if (dVar2 == null) {
            logger.error(".saveDeviceToLocalDatabase() -- deviceInfo is null");
            throw new PairingException(this, yl2.e.DEVICE_INFO_OBJ_NULL, "DeviceInfoDTO is null");
        }
        lm2.g gVarC = lm2.h.c();
        String f197656b = dVar.getF197656b();
        String strP = null;
        try {
            if (((fm2.c) gVarC).f(f197656b) == null) {
                vm2.a.f178815a.getClass();
                if (!vm2.a.a(f197656b)) {
                    logger.warn(".saveDeviceToLocalDatabase() no OS bond or Garmin Auth");
                    BluetoothManager bluetoothManager = (BluetoothManager) ((c0) lm2.h.d()).f17547a.getSystemService("bluetooth");
                    BluetoothAdapter adapter = bluetoothManager == null ? null : bluetoothManager.getAdapter();
                    if (adapter != null) {
                        BluetoothDevice remoteDevice = adapter.getRemoteDevice(f197656b);
                        if (remoteDevice.getBondState() == 10 && bluetoothManager.getConnectionState(remoteDevice, 7) == 2) {
                            remoteDevice.createBond();
                        } else {
                            logger.warn("Device not currently able to add system bonding.");
                        }
                    }
                }
            }
        } catch (Exception e4) {
            logger.warn(".saveDeviceToLocalDatabase() device authentication missing", (Throwable) e4);
        }
        logger.debug(".saveDeviceToLocalDatabase()");
        int i14 = vm2.c.f178817a;
        bm2.d dVar3 = dVar.f197842d;
        String string = dVar3 != null ? Integer.valueOf(dVar3.getF92744h()).toString() : null;
        if (string == null || (strA = ((c0) lm2.h.d()).a(string)) == null) {
            bm2.f fVar = dVar.f197840b;
            bm2.c cVar = fVar instanceof bm2.c ? (bm2.c) fVar : null;
            String[] strArr = cVar != null ? cVar.f18932r : null;
            if (strArr != null) {
                strP = p13.u.P(strArr, null, null, null, null, 63);
            }
        } else {
            strP = strA;
        }
        this.f160362i.i(dVar, this.f160339e, strP, new a(gVarC));
    }
}
