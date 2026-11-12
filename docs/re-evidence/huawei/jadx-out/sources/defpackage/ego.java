package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.CallbackBetweenClientAndController;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand;
import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.CommandArrayList;
import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.Receiver;
import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeRealData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ego extends egj implements Receiver.CommandReceiveCallback {
    private String f;
    private CallbackBetweenClientAndController g;
    private int h;
    private boolean i;
    private BluetoothGattService k;
    private BluetoothGattCharacteristic l;
    private Queue<AbstractCommand> m;
    private egq n;
    private BluetoothGattCharacteristic o;
    private int q;
    private Set<Integer> s;
    private int t;
    private static final UUID j = UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb");
    private static final UUID e = UUID.fromString("0000fff2-0000-1000-8000-00805f9b34fb");
    private static final UUID d = UUID.fromString("0000fff1-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UUID f32949b = UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb");

    private boolean b(int i) {
        return i > 255 || i < 0;
    }

    public ego(CallbackBetweenClientAndController callbackBetweenClientAndController, Object obj) {
        this(null, callbackBetweenClientAndController, obj);
    }

    public ego(BluetoothGatt bluetoothGatt, CallbackBetweenClientAndController callbackBetweenClientAndController, Object obj) {
        super(bluetoothGatt, obj);
        this.i = false;
        this.h = 0;
        this.q = 0;
        this.t = 0;
        LogUtil.a("PDROPE_RopeController", "RopeController constructor");
        this.n = new egq();
        this.g = callbackBetweenClientAndController;
        b();
    }

    private void b() {
        HashSet hashSet = new HashSet(10);
        this.s = hashSet;
        hashSet.add(1);
        this.s.add(2);
        this.s.add(3);
        this.s.add(10);
        this.s.add(9);
        this.s.add(11);
        this.s.add(12);
    }

    public void e(String str) {
        this.f = str;
    }

    public void a(BluetoothGatt bluetoothGatt, int i) {
        if (i == 0) {
            d(bluetoothGatt, false);
        } else {
            this.g.notifyStateChanged(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
        }
    }

    public void d(BluetoothGatt bluetoothGatt, boolean z) {
        if (bluetoothGatt == null) {
            LogUtil.a("PDROPE_RopeController", "cannot get service bcz gatt is null");
            this.g.notifyStateChanged(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        UUID uuid = j;
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        this.k = service;
        if (service == null) {
            LogUtil.d("PDROPE_RopeController", "getService, mRopeService is null:", uuid);
        }
        if (this.k == null) {
            this.g.notifyStateChanged(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        LogUtil.a("PDROPE_RopeController", "Rope Service found , isReconnect:", Boolean.valueOf(z));
        this.g.setBreakBySelf(false);
        if (z) {
            this.g.notifyStateChanged(AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED);
        } else {
            this.g.notifyStateChanged(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
            this.g.notifyDataChange(901, null);
        }
        ThreadPoolManager.c().execute(new c(bluetoothGatt, true, this.k));
    }

    public void e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f32941a.b(false);
        if (i != 0) {
            return;
        }
        LogUtil.a("PDROPE_RopeController", "ROPE onCharacteristicRead readCount:", Integer.valueOf(this.q));
        this.q++;
        if (bluetoothGattCharacteristic != null) {
            if (bluetoothGattCharacteristic.getUuid() != null) {
                LogUtil.d("PDROPE_RopeController", "onFitnessCharacteristicRead , value:", erh.a(bluetoothGattCharacteristic.getValue(), ""));
                return;
            } else {
                LogUtil.a("PDROPE_RopeController", "ROPE onCharacteristicRead, charUUID is null");
                return;
            }
        }
        LogUtil.a("PDROPE_RopeController", "ROPE onCharacteristicRead characteristic is null");
    }

    public void b(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length <= 0) {
            LogUtil.j("PDROPE_RopeController", "onFitnessCharacteristicChanged, invalid parameter");
            return;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String strA = erh.a(bArr, "");
        if ("0000fff1-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
            ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "onFitnessCharacteristicChanged, ROPE_DATA:", strA);
            BaseRopeData baseRopeDataD = this.n.d(bArr);
            if (!e(baseRopeDataD) || baseRopeDataD == null) {
                return;
            }
            b(baseRopeDataD);
            Bundle bundle = new Bundle();
            bundle.putInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE", baseRopeDataD.getFitnessDataType());
            bundle.putSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA", baseRopeDataD.getFitnessHashMap());
            this.g.notifyDataChange(902, bundle);
            return;
        }
        if ("0000fff3-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
            ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "device --> app: onFitnessCharacteristicChanged, ROPE_CONFIG_DATA:", strA);
            Receiver.c().c(this);
            Receiver.c().d(bArr);
            return;
        }
        LogUtil.a("PDROPE_RopeController", "onFitnessCharacteristicChanged, value:", strA);
    }

    private void b(BaseRopeData baseRopeData) {
        if (baseRopeData.getFitnessDataType() == 23 && (baseRopeData instanceof DeviceInformation)) {
            LogUtil.a("PDROPE_RopeController", "registerDataClient");
            DeviceInformation deviceInformation = (DeviceInformation) baseRopeData;
            MeasurableDevice bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(this.f, false);
            if (bondedDeviceByUniqueId == null) {
                LogUtil.j("PDROPE_RopeController", "registerDataClient device is null");
                return;
            }
            String productId = bondedDeviceByUniqueId.getProductId();
            if (era.g(productId)) {
                LogUtil.a("PDROPE_RopeController", "registerDataClient isIntelligentDevice");
                esf esfVar = new esf();
                esfVar.c(esfVar.a(new esf.d(productId, this.f).a(deviceInformation)), null);
            }
        }
    }

    private boolean e(BaseRopeData baseRopeData) {
        if (baseRopeData == null || !baseRopeData.isAllSet()) {
            LogUtil.a("PDROPE_RopeController", "onFitnessCharacteristicChanged, data is null or not ready");
            return false;
        }
        if (baseRopeData instanceof RopeRealData) {
            egt.a((RopeRealData) baseRopeData);
            return true;
        }
        if (!(baseRopeData instanceof DeviceInformation)) {
            return true;
        }
        this.f32942c = (DeviceInformation) baseRopeData;
        return true;
    }

    public void a() {
        this.f32941a.b(false);
        int i = this.t + 1;
        this.t = i;
        LogUtil.a("PDROPE_RopeController", "onFitnessCharacteristicWrite writeCount:", Integer.valueOf(i));
        if (njy.b(this.m)) {
            c(this.l, true, true);
        }
    }

    public void d() {
        AbstractCommand abstractCommandPoll;
        this.f32941a.b(false);
        this.h++;
        if (!njy.b(this.m) || (abstractCommandPoll = this.m.poll()) == null) {
            return;
        }
        d(this.l, abstractCommandPoll.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, boolean z) {
        LogUtil.a("PDROPE_RopeController", "setRopeCharacteristicNotification(), isEnabled = ", Boolean.valueOf(z));
        if (z) {
            BluetoothGattService service = bluetoothGatt.getService(j);
            if (service != null) {
                e(service);
                a(service);
                LogUtil.a("PDROPE_RopeController", "start ropeDataNotifyCharacteristic");
                d(d(service, d));
                if (this.l != null) {
                    LogUtil.a("PDROPE_RopeController", "start ropeConfigNotifyCharacteristic");
                    d(d(service, f32949b));
                }
                if (this.o != null) {
                    int i = 0;
                    while (this.h != 1 && i < 5) {
                        c(100L);
                        i++;
                    }
                    LogUtil.d("PDROPE_RopeController", "setRopeCharacteristicNotification() =", Boolean.valueOf(i < 5));
                    return;
                }
                return;
            }
            LogUtil.a("PDROPE_RopeController", "setRopeCharacteristicNotification(), gattService == null");
        }
    }

    private BluetoothGattCharacteristic d(BluetoothGattService bluetoothGattService, UUID uuid) {
        return bluetoothGattService.getCharacteristic(uuid);
    }

    private void d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            this.h = 0;
            c(bluetoothGattCharacteristic, true, true);
        } else {
            this.h = 1;
            LogUtil.a("PDROPE_RopeController", "setRopeCharacteristicNotification() bluetoothGattCharacteristic is null");
        }
    }

    private void e(BluetoothGattService bluetoothGattService) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(e);
        LogUtil.a("PDROPE_RopeController", "setRopeCharacteristicNotification() controlPointCharacteristic is null ", Boolean.valueOf(characteristic == null));
        this.o = characteristic;
    }

    private void a(BluetoothGattService bluetoothGattService) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(f32949b);
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "setRopeCharacteristicNotification() ropeConfigCharacteristic is null ", Boolean.valueOf(characteristic == null));
        this.l = characteristic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(BluetoothGattService bluetoothGattService) {
        c(200L);
        LogUtil.d("PDROPE_RopeController", "begin readCharacteristic");
        if (bluetoothGattService == null || this.o == null) {
            LogUtil.a("PDROPE_RopeController", "ropeService or mRopeControlCharacteristic is null");
            return false;
        }
        this.t = 0;
        return i();
    }

    private boolean i() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        LogUtil.a("PDROPE_RopeController", "readCharacteristic(dataTime) timeStamp:", Integer.valueOf(iCurrentTimeMillis));
        if (!a(1, 0, new int[]{iCurrentTimeMillis})) {
            LogUtil.d("PDROPE_RopeController", "readCharacteristic: OP_COMMAND_SET_DATE failed");
            this.t++;
        }
        if (!a(1)) {
            return false;
        }
        LogUtil.a("PDROPE_RopeController", "readCharacteristic(OP_COMMAND_DEVICE_INFO)");
        if (!a(4, 0, null)) {
            LogUtil.d("PDROPE_RopeController", "readCharacteristic: OP_COMMAND_DEVICE_INFO failed");
            this.t++;
        }
        if (eqt.c().d()) {
            ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "syncHistory");
            if (!a(3, 7, new int[]{0})) {
                LogUtil.d("PDROPE_RopeController", "syncHistory failed");
            }
            eqt.c().e(false);
        }
        if (!a(2) || !emh.b().g()) {
            return false;
        }
        e();
        return true;
    }

    private void e() {
        LogUtil.a("PDROPE_RopeController", "ROPE ACTION_READ_SUCCESS");
        this.i = true;
        this.g.notifyStateChanged(AbstractFitnessClient.ACTION_READ_SUCCESS);
        qpx.e(HuaweiHealth.a(), HuaweiHealth.a().getResources().getString(R.string.IDS_fitness_equip_blutooth_connected));
    }

    private boolean a(int i) {
        LogUtil.a("PDROPE_RopeController", "readCharacter: writeCount = ", Integer.valueOf(this.t), ", writeType = ", Integer.valueOf(i));
        int i2 = 0;
        while (this.t != i && i2 < 10) {
            c(100L);
            i2++;
        }
        if (i2 < 10) {
            return true;
        }
        LogUtil.d("PDROPE_RopeController", "FTMP_TS before readCharacteristic(): type = ", Integer.valueOf(i), ", return false");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j2) {
        try {
            Thread.sleep(j2);
        } catch (InterruptedException unused) {
            LogUtil.a("PDROPE_RopeController", "InterruptedException");
        }
    }

    public boolean a(int i, int[] iArr) {
        byte[] bArrE;
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "setFitnessMachineControl opCommand : ", 3, " code ", Integer.valueOf(i), " para:", Arrays.toString(iArr));
        if (b(i)) {
            return false;
        }
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
                bArrE = new byte[]{3, (byte) (i & 255), 0, 0};
                break;
            case 2:
            case 3:
            case 8:
                int i2 = iArr[0];
                LogUtil.d("PDROPE_RopeController", "setFitnessMachineControl: ", Integer.valueOf(i), ",parm:", Integer.valueOf(i2));
                bArrE = new byte[]{3, (byte) (i & 255), (byte) (i2 & 255), (byte) ((i2 >> 8) & 255)};
                break;
            case 10:
                byte[] bArrD = d(i, iArr);
                LogUtil.a("PDROPE_RopeController", "setFitnessMachineControl: ", Integer.valueOf(i), ",parm:", iArr);
                bArrE = bArrD;
                break;
            case 11:
            case 12:
                bArrE = e(3, i, iArr[0], 0);
                break;
            default:
                bArrE = null;
                break;
        }
        if (bArrE == null) {
            return false;
        }
        return b(i, bArrE);
    }

    private byte[] d(int i, int[] iArr) {
        byte[] bArr = new byte[9];
        ehn.a(bArr, 3, 0);
        ehn.a(bArr, i, 1);
        ehn.e(bArr, 2, iArr, 0, 3);
        ehn.a(bArr, iArr[3], 8);
        return bArr;
    }

    private byte[] e(int i, int i2, int i3, int i4) {
        byte[] bArr = new byte[4];
        ehn.a(bArr, i, i4);
        ehn.a(bArr, i2, i4 + 1);
        ehn.b(bArr, i3, i4 + 2);
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    public boolean a(int i, int i2, int[] iArr) {
        byte[] bArr;
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "setFitnessMachineControl opCommand : ", Integer.valueOf(i), " code ", Integer.valueOf(i2));
        if (!b(i) && !b(i2) && emh.b().g()) {
            if (i == 1) {
                int i3 = iArr[0];
                bArr = new byte[]{(byte) (i & 255), 0, (byte) (i3 & 255), (byte) ((i3 >> 8) & 255), (byte) ((i3 >> 16) & 255), (byte) ((i3 >> 24) & 255)};
            } else if (i == 2) {
                bArr = new byte[]{(byte) (i & 255), 0};
            } else {
                if (i == 3) {
                    return a(i2, iArr);
                }
                if (i == 4) {
                    bArr = new byte[]{(byte) (i & 255), 0};
                } else if (i != 5) {
                    bArr = null;
                } else {
                    byte[] bArr2 = {(byte) (i & 255), 0, (byte) (iArr[0] & 255)};
                    emh.b().a(iArr[0]);
                    bArr = bArr2;
                }
            }
            if (bArr == null) {
                return false;
            }
            if (d(this.o, bArr)) {
                LogUtil.a("PDROPE_RopeController", "writeCharacteristicValueBytes success");
                return true;
            }
            LogUtil.a("PDROPE_RopeController", "writeCharacteristicValueBytes failed");
        }
        return false;
    }

    public void d(int i, int i2, int[] iArr) {
        BaseRopeData baseRopeDataE;
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "app --> device:setFitnessRopeConfig opCommand: ", Integer.valueOf(i), " opCode ", Integer.valueOf(i2));
        if (b(i) || b(i2) || (baseRopeDataE = this.n.e(i)) == null) {
            return;
        }
        baseRopeDataE.setCode(i2);
        baseRopeDataE.setCommand(i);
        baseRopeDataE.setPara(iArr);
        egx transmitCommand = baseRopeDataE.getTransmitCommand();
        if (transmitCommand == null) {
            LogUtil.a("PDROPE_RopeController", "setFitnessRopeConfig command is null");
            return;
        }
        if (this.m == null) {
            this.m = new ArrayDeque();
        }
        Iterator<AbstractCommand> it = transmitCommand.b().iterator();
        while (it.hasNext()) {
            this.m.offer(it.next());
        }
        c(this.l, true, true);
    }

    private boolean b(int i, byte[] bArr) {
        if (d(this.o, bArr)) {
            ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "writeCharacteristicValueBytes success");
            if (this.s.contains(Integer.valueOf(i))) {
                egt.b();
                return true;
            }
            if (i == 6) {
                egt.e();
                return true;
            }
            LogUtil.a("PDROPE_RopeController", "setFitnessMachineControl else");
            return true;
        }
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeController", "writeCharacteristicValueBytes failed");
        return false;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.Receiver.CommandReceiveCallback
    public void onReceiveSuccess(CommandArrayList commandArrayList) {
        BaseRopeData baseRopeDataA = this.n.a(commandArrayList);
        if (baseRopeDataA == null) {
            LogUtil.a("PDROPE_RopeController", "baseRopeData is null");
            return;
        }
        Bundle bundle = new Bundle();
        LogUtil.a("PDROPE_RopeController", "onReceiveSuccess, baseRopeData.getFitnessDataType() = ", Integer.valueOf(baseRopeDataA.getFitnessDataType()));
        bundle.putInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE", baseRopeDataA.getFitnessDataType());
        bundle.putSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA", baseRopeDataA.getFitnessHashMap());
        this.g.notifyDataChange(902, bundle);
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f32950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BluetoothGatt f32951b;
        private BluetoothGattService d;

        c(BluetoothGatt bluetoothGatt, boolean z, BluetoothGattService bluetoothGattService) {
            LogUtil.a("PDROPE_RopeController", "RopeNotificationSettingAndReadThread constructor");
            this.f32951b = bluetoothGatt;
            this.f32950a = z;
            this.d = bluetoothGattService;
        }

        @Override // java.lang.Runnable
        public void run() {
            ego.this.c(200L);
            ego.this.c(this.f32951b, this.f32950a);
            if (esh.c()) {
                ego.this.i = true;
                ego.this.g.notifyStateChanged(AbstractFitnessClient.ACTION_READ_SUCCESS);
                qpx.e(HuaweiHealth.a(), HuaweiHealth.a().getResources().getString(R.string.IDS_fitness_equip_blutooth_connected));
                return;
            }
            int i = 0;
            ego.this.i = false;
            while (!ego.this.b(this.d) && i <= 10 && emh.b().g()) {
                i++;
            }
            if (!ego.this.i) {
                ego.this.g.notifyStateChanged(AbstractFitnessClient.ACTION_INVALID_DEVICE_INFO);
            }
            LogUtil.d("PDROPE_RopeController", "is read completed: ", Boolean.valueOf(ego.this.i), " count: ", Integer.valueOf(i));
        }
    }
}
