package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.CallbackBetweenClientAndController;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.device.model.FitnessData;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.indoorequip.datastruct.MachineStatus;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.datastruct.TrainingStatus;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes12.dex */
public class nxl extends nxi {
    private int aa;
    private int ab;
    private nxp ac;
    private BluetoothGattCharacteristic ad;
    private d ae;
    private nxq af;
    private Handler ag;
    private BluetoothGattCharacteristic ah;
    private boolean ai;
    private Set<Integer> aj;
    private int ak;
    private boolean al;
    private int[] am;
    private int an;
    private int ar;
    private SupportDataRange as;
    private nxr z;
    private static final UUID l = UUID.fromString("00002ACC-0000-1000-8000-00805f9b34fb");
    private static final UUID s = UUID.fromString("00002ACD-0000-1000-8000-00805f9b34fb");
    private static final UUID n = UUID.fromString("00002AD1-0000-1000-8000-00805f9b34fb");
    private static final UUID k = UUID.fromString("00002AD2-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UUID f43895b = UUID.fromString("00002ACE-0000-1000-8000-00805f9b34fb");
    private static final UUID t = UUID.fromString("00002AD3-0000-1000-8000-00805f9b34fb");
    private static final UUID m = UUID.fromString("00002AD9-0000-1000-8000-00805f9b34fb");
    private static final UUID o = UUID.fromString("00002ADA-0000-1000-8000-00805f9b34fb");
    private static final UUID v = UUID.fromString("00002AD4-0000-1000-8000-00805f9b34fb");
    private static final UUID u = UUID.fromString("00002AD5-0000-1000-8000-00805f9b34fb");
    private static final UUID y = UUID.fromString("00002AD6-0000-1000-8000-00805f9b34fb");
    private static final UUID w = UUID.fromString("00002AD7-0000-1000-8000-00805f9b34fb");
    private static final UUID x = UUID.fromString("00002AD8-0000-1000-8000-00805f9b34fb");
    private static final UUID f = UUID.fromString("00002A29-0000-1000-8000-00805f9b34fb");
    private static final UUID h = UUID.fromString("00002A24-0000-1000-8000-00805f9b34fb");
    private static final UUID i = UUID.fromString("00002A25-0000-1000-8000-00805f9b34fb");
    private static final UUID d = UUID.fromString("00002A27-0000-1000-8000-00805f9b34fb");
    private static final UUID e = UUID.fromString("00002A26-0000-1000-8000-00805f9b34fb");
    private static final UUID g = UUID.fromString("00002A28-0000-1000-8000-00805f9b34fb");
    private static final UUID j = UUID.fromString("00002A23-0000-1000-8000-00805f9b34fb");
    private static final UUID r = UUID.fromString("00001826-0000-1000-8000-00805f9b34fb");
    private static final UUID q = UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb");
    private static final UUID p = UUID.fromString("d18d2c10-c44c-11e8-a355-529269fb1459");

    public nxl(BluetoothGatt bluetoothGatt, CallbackBetweenClientAndController callbackBetweenClientAndController, Object obj) {
        super(bluetoothGatt, callbackBetweenClientAndController, obj);
        this.ag = new Handler(Looper.getMainLooper()) { // from class: nxl.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                Bundle data = message.getData();
                if (data == null) {
                    return;
                }
                byte[] byteArray = data.getByteArray("speed");
                byte[] byteArray2 = data.getByteArray("power");
                byte[] byteArray3 = data.getByteArray("cadence");
                int i2 = data.getInt("opCode");
                int[] intArray = data.getIntArray("para");
                int i3 = message.what;
                if (i3 == 1) {
                    nxl.this.d(byteArray, byteArray2, byteArray3);
                    return;
                }
                if (i3 == 2) {
                    nxl.this.d(byteArray, message);
                    return;
                }
                if (i3 == 3) {
                    nxl.this.c(byteArray2, message);
                    return;
                }
                if (i3 == 4) {
                    nxl.this.e(byteArray3, message);
                } else {
                    if (i3 != 5) {
                        return;
                    }
                    LogUtil.a("Track_IDEQ_FtmpController", "start reSend");
                    nxl.this.c(i2, intArray);
                }
            }
        };
        this.ai = false;
        this.aa = -1;
        this.al = false;
        this.ab = 0;
        this.an = -1;
        this.ar = 1;
        this.af = new nxq();
        this.ac = new nxp();
        this.z = new nxr(this.af.d(), this.ac.d(), this.af, true);
        this.ad = null;
        HashSet hashSet = new HashSet();
        this.aj = hashSet;
        hashSet.add(12);
        this.aj.add(13);
        this.as = new SupportDataRange();
    }

    @Override // defpackage.nxi
    public void d(BluetoothGatt bluetoothGatt) {
        super.d(bluetoothGatt);
    }

    public void a() {
        this.aa = -1;
        this.ar = 1;
    }

    public void a(boolean z) {
        this.ai = z;
    }

    @Override // defpackage.nxi
    public DeviceInformation h() {
        return this.ac.d();
    }

    public void e() {
        LogUtil.a("Track_IDEQ_FtmpController", "sendResitanceRange MIN_LEVEL ", Integer.valueOf(this.as.getMinLevel()), ", MAX_LEVEL ", Integer.valueOf(this.as.getMaxLevel()), ", INCREMENT_LEVEL ", Integer.valueOf(this.as.getMinIncrementLevel()));
        c(this.as);
    }

    public void a(byte[] bArr) {
        LogUtil.a("Track_IDEQ_FtmpController", "sendByteToEquip For FTMP, will writeCharacteristicValueBytes");
        d(this.ad, bArr);
    }

    @Override // defpackage.nxi
    public void f() {
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "resetControllerData");
        this.ai = false;
        this.z.d();
    }

    @Override // defpackage.nxi
    public void c(boolean z) {
        d dVar = this.ae;
        if (dVar != null) {
            dVar.a(z);
        }
    }

    @Override // defpackage.nxi
    public void b(BluetoothGatt bluetoothGatt, int i2) {
        super.b(bluetoothGatt, i2);
        if (i2 == 0) {
            c(bluetoothGatt, false);
        } else {
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
        }
    }

    @Override // defpackage.nxi
    public void c(BluetoothGatt bluetoothGatt, int i2) {
        if (i2 == 0) {
            c(bluetoothGatt, true);
        } else {
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
        }
    }

    public void c(BluetoothGatt bluetoothGatt, boolean z) {
        if (bluetoothGatt == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "cannot get service bcz mGatt is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        BluetoothGattService service = bluetoothGatt.getService(r);
        BluetoothGattService service2 = bluetoothGatt.getService(q);
        if (service != null) {
            LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS mFtmsService found");
            if (this.f43891a != null) {
                this.f43891a.setBreakBySelf(false);
            }
            LogUtil.a("Track_IDEQ_FtmpController", "isReconnect:", Boolean.valueOf(z));
            a();
            if (z) {
                e(AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED);
            } else {
                e(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
                a(0);
                d(901, (String) null);
                this.ai = false;
            }
            d dVar = new d(bluetoothGatt, true, service, service2);
            this.ae = dVar;
            lsy.a(dVar);
            return;
        }
        e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
        LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS mFtmsService not found");
    }

    @Override // defpackage.nxi
    public void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        int i3 = this.ak + 1;
        this.ak = i3;
        LogUtil.a("Track_IDEQ_FtmpController", "onFitnessCharacteristicRead mReadCount ", Integer.valueOf(i3));
        super.c(bluetoothGatt, bluetoothGattCharacteristic, i2);
        if (bluetoothGattCharacteristic != null) {
            try {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                if (uuid != null) {
                    String upperCase = uuid.toString().toUpperCase(Locale.ENGLISH);
                    String strD = nzc.d(bluetoothGattCharacteristic.getValue());
                    ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "onFitnessCharacteristicRead value ", strD);
                    if ("00002A29-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_MANUFACTURER_NAME:", strD);
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_BLE_DEVICE_NAME:", bluetoothGatt.getDevice().getName());
                        this.ac.d(bluetoothGatt.getDevice().getName(), 20014);
                        a(bluetoothGattCharacteristic, 20006);
                        return;
                    }
                    if ("00002A24-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_MODEL_NUMBER:", strD);
                        a(bluetoothGattCharacteristic, 20007);
                        return;
                    }
                    if ("00002A25-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_SERIAL_NUMBER:", strD);
                        a(bluetoothGattCharacteristic, 20010);
                        return;
                    }
                    if ("00002A27-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_HARDWARE_REVISION:", strD);
                        a(bluetoothGattCharacteristic, CapabilityStatus.AWA_CAP_CODE_WIFI);
                        return;
                    }
                    if ("00002A26-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_FIRMWARE_REVISION:", strD);
                        a(bluetoothGattCharacteristic, 20015);
                        return;
                    }
                    if ("00002A28-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_SOFTWARE_REVISION:", strD);
                        a(bluetoothGattCharacteristic, CapabilityStatus.AWA_CAP_CODE_APPLICATION);
                        return;
                    } else if ("00002A23-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_DIS_SYSTEM_ID:", strD);
                        a(bluetoothGattCharacteristic, 20016);
                        return;
                    } else if ("00002ACC-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                        LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_MACHINE_FEATURE:", strD);
                        c(this.af.c(bluetoothGattCharacteristic.getValue()));
                        return;
                    } else {
                        a(bluetoothGattCharacteristic, upperCase);
                        return;
                    }
                }
                LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead, charUUID is null");
            } catch (SecurityException e2) {
                LogUtil.e("Track_IDEQ_FtmpController", "onFitnessCharacteristicRead SecurityException:", ExceptionUtils.c(e2));
            }
        }
    }

    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        DeviceInformation deviceInformationB = this.ac.b(bluetoothGattCharacteristic.getValue(), i2);
        deviceInformationB.setDeviceType(nzc.a(this.f43892c));
        c(deviceInformationB);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0141  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
        SupportDataRange supportDataRangeI;
        if ("00002AD3-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
            TrainingStatus trainingStatusH = this.af.h(bluetoothGattCharacteristic.getValue());
            this.z.c();
            LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_TRAINING_STATUS:", nzc.d(bluetoothGattCharacteristic.getValue()), ", isCurrentRunning:", Boolean.valueOf(d(trainingStatusH)));
            c(trainingStatusH);
        } else {
            if ("00002AD4-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_SUPPORT_SPEED_RANGE:", nzc.d(bluetoothGattCharacteristic.getValue()));
                supportDataRangeI = this.af.j(bluetoothGattCharacteristic.getValue());
            } else if ("00002AD5-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_SUPPORT_INCLINATION_RANGE:", nzc.d(bluetoothGattCharacteristic.getValue()));
                supportDataRangeI = this.af.a(bluetoothGattCharacteristic.getValue());
            } else if ("00002AD6-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead, charUUID is CHARACTERISTIC_SUPPORT_RESISTANCE_LEVEL_RANGE:", nzc.d(bluetoothGattCharacteristic.getValue()));
                supportDataRangeI = this.af.g(bluetoothGattCharacteristic.getValue());
                this.z.c();
                this.as.setMinLevel(supportDataRangeI.getMinLevel());
                this.as.setMaxLevel(supportDataRangeI.getMaxLevel());
                this.as.setMinIncrementLevel(supportDataRangeI.getMinIncrementLevel());
            } else if ("00002AD7-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_SUPPORT_HEART_RATE_RANGE:", nzc.d(bluetoothGattCharacteristic.getValue()));
                supportDataRangeI = this.af.d(bluetoothGattCharacteristic.getValue());
            } else if ("00002AD8-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_SUPPORT_POWER_RANGE:", nzc.d(bluetoothGattCharacteristic.getValue()));
                supportDataRangeI = this.af.i(bluetoothGattCharacteristic.getValue());
            } else {
                LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead, charUUID is NOT SUPPORT");
            }
            if (supportDataRangeI != null) {
                c(supportDataRangeI);
            }
        }
        supportDataRangeI = null;
        if (supportDataRangeI != null) {
            c(supportDataRangeI);
        }
    }

    private boolean a(String str) {
        return "00002ACD-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str) || "00002AD1-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str) || "00002AD2-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str) || "00002ACE-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str);
    }

    @Override // defpackage.nxi
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        FitnessData fitnessDataA;
        LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onFitnessCharacteristicChanged");
        super.b(bluetoothGatt, bluetoothGattCharacteristic);
        if (bluetoothGattCharacteristic == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "characteristic is null");
            return;
        }
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        LogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "onFitnessCharacteristicChanged charUuid = ", uuid);
        if (uuid != null) {
            String upperCase = uuid.toString().toUpperCase(Locale.ENGLISH);
            String strD = nzc.d(bluetoothGattCharacteristic.getValue());
            ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "onFitnessCharacteristicChanged value = ", strD);
            if (a(upperCase)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_IndoorEquipment_DATA:", strD);
                fitnessDataA = this.af.a(bluetoothGattCharacteristic.getValue(), upperCase);
                this.z.c();
            } else if ("00002AD3-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_TRAINING_STATUS:", strD);
                fitnessDataA = this.af.h(bluetoothGattCharacteristic.getValue());
                this.z.c();
            } else if ("00002ADA-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
                LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicRead charUUID is", "CHARACTERISTIC_MACHINE_STATUS:", strD);
                fitnessDataA = a(bluetoothGattCharacteristic);
                if (fitnessDataA == null) {
                    return;
                }
            } else {
                a(bluetoothGattCharacteristic, upperCase, strD);
                return;
            }
            c(fitnessDataA);
            return;
        }
        LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, charUUID is null");
    }

    private FitnessData a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        MachineStatus machineStatusB = this.af.b(bluetoothGattCharacteristic.getValue());
        if (machineStatusB != null) {
            this.z.c();
            if (e(machineStatusB)) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged get start signal!");
                this.ai = true;
            }
            if (machineStatusB.getOpCode() == 2 && machineStatusB.getMachineStatusCharacteristic() == 2) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged get pause signal, ", "set mIsExperiencedStateOfStart true as well");
                this.ai = true;
            }
            boolean zB = b(machineStatusB);
            if (zB) {
                this.f43891a.onStopByUser();
            }
            if (this.ai && zB) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, get finish signal!");
                c(true, true, false, false);
                this.ai = false;
            }
            if (machineStatusB.getOpCode() == 255) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, get lost signal!");
                c(true, true, false, false);
            }
        }
        return machineStatusB;
    }

    public boolean e(MachineStatus machineStatus) {
        return machineStatus.getOpCode() == 4;
    }

    public boolean b(MachineStatus machineStatus) {
        return machineStatus.getOpCode() == 3 || (machineStatus.getOpCode() == 2 && machineStatus.getMachineStatusCharacteristic() == 1);
    }

    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str, String str2) {
        if ("00002AD9-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
            LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, charUUID is ", "CHARACTERISTIC_MACHINE_CONTROL_POINT:", str2);
            FitnessData fitnessDataE = this.af.e(bluetoothGattCharacteristic.getValue());
            if (!(fitnessDataE instanceof MachineControlPointResponse)) {
                LogUtil.e("Track_IDEQ_FtmpController", " fitnessData instanceof MachineControlPointResponse is false");
                return;
            }
            MachineControlPointResponse machineControlPointResponse = (MachineControlPointResponse) fitnessDataE;
            c(machineControlPointResponse);
            LogUtil.d("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, charUUID is CHARACTERISTIC_MACHINE_CONTROL_POINT:", "RequestOpCode is", Integer.valueOf(machineControlPointResponse.getRequestOpCode()), ", ResultCode is ", Integer.valueOf(machineControlPointResponse.getResultCode()));
            if (machineControlPointResponse.getRequestOpCode() == 7 && machineControlPointResponse.getResultCode() == 1) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, get start signal!");
                this.ai = true;
            }
            if (this.ai && machineControlPointResponse.getRequestOpCode() == 8 && machineControlPointResponse.getResultCode() == 1 && machineControlPointResponse.getResultIntParameter() == 1) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, get finish signal!");
                c(true, true, false, false);
                return;
            }
            return;
        }
        LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, charUUID is NOT SUPPORT:", nzc.d(bluetoothGattCharacteristic.getValue()));
    }

    @Override // defpackage.nxi
    public void e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        super.e(bluetoothGatt, bluetoothGattCharacteristic, i2);
        if (bluetoothGattCharacteristic == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "onCharacteristicWrite: characteristic is null");
            return;
        }
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "onFitnessCharacteristicWrite value ", nzc.d(bluetoothGattCharacteristic.getValue()));
        if (m.equals(uuid)) {
            LogUtil.a("Track_IDEQ_FtmpController", "onCharacteristicWrite: characteristic ", uuid.toString());
        }
    }

    @Override // defpackage.nxi
    public void e(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        int i3 = this.ab + 1;
        this.ab = i3;
        LogUtil.a("Track_IDEQ_FtmpController", "onDescriptorWrite: mDescriptorWriteCount:", Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, boolean z) {
        LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification(), mIsEnabled = ", Boolean.valueOf(z));
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString("00001826-0000-1000-8000-00805f9b34fb"));
        if (service != null) {
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(m);
            if (characteristic != null) {
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS controlPointCharacteristic is not null");
                this.ad = characteristic;
            } else {
                LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() controlPointCharacteristic is null");
                this.ad = null;
            }
            BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(o);
            if (characteristic2 != null) {
                this.ab = 0;
                try {
                    Thread.sleep(150L);
                } catch (InterruptedException unused) {
                    LogUtil.e("Track_IDEQ_FtmpController", "InterruptedException");
                }
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() machineStatusCharacteristic is not null");
                e(characteristic2, true, true);
            } else {
                this.ab = 1;
                LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() machineStatusCharacteristic is null");
            }
            BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(t);
            if (characteristic3 != null) {
                if (c(1)) {
                    LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS checkWriteCount TRAINING_STATUS_WRITE_COUNT success");
                } else {
                    this.ab++;
                }
                LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() trainingStatusCharacteristic is not null");
                e(characteristic3, true, true);
            } else {
                this.ab++;
                LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() trainingStatusCharacteristic is null");
            }
            c(service);
        }
    }

    private boolean c(int i2) {
        LogUtil.a("Track_IDEQ_FtmpController", "checkWriteCount, writeCount:", Integer.valueOf(this.ab));
        int i3 = 0;
        while (this.ab != i2 && i3 < 5) {
            try {
                Thread.sleep(100L);
                i3++;
            } catch (InterruptedException unused) {
                LogUtil.e("Track_IDEQ_FtmpController", "InterruptedException");
            }
        }
        if (i3 < 5) {
            return true;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "checkWriteCount type = ", Integer.valueOf(i2), ", return false");
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    private UUID b() {
        byte b2;
        UUID uuid = s;
        String str = this.f43892c;
        str.hashCode();
        switch (str) {
            case "259":
                b2 = 0;
                break;
            case "260":
                b2 = 1;
                break;
            case "261":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return k;
        }
        if (b2 != 1) {
            return b2 != 2 ? uuid : n;
        }
        return f43895b;
    }

    private void c(BluetoothGattService bluetoothGattService) {
        UUID uuidB = b();
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuidB);
        if (characteristic != null) {
            if (c(2)) {
                LogUtil.a("Track_IDEQ_FtmpController", "checkWriteCount TRAINER_DATA_WRITE_COUNT success");
            } else {
                this.ab++;
            }
            LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() dataCharacteristic is not null", uuidB);
            e(characteristic, true, true);
        } else {
            this.ab++;
            LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() dataCharacteristic is null", uuidB);
        }
        if (this.ad == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() mControlPointCharacteristic is null");
            this.ab++;
        } else {
            if (c(3)) {
                LogUtil.a("Track_IDEQ_FtmpController", "checkWriteCount CONTROL_POINT_WRITE_COUNT success");
            } else {
                this.ab++;
            }
            LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification() mControlPointCharacteristic is not null");
            b(this.ad, true, true);
            if (c(4)) {
                LogUtil.a("Track_IDEQ_FtmpController", "checkWriteCount REQUEST_CONTROL_WRITE_COUNT success");
            } else {
                this.ab++;
            }
            LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS setFtmpCharacteristicNotification(), now setFitnessMachineControl(write)");
            c(0, (int[]) null);
        }
        this.ah = bluetoothGattService.getCharacteristic(p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2) {
        if (bluetoothGatt == null || bluetoothGattService == null) {
            return false;
        }
        try {
            Thread.sleep(300L);
        } catch (InterruptedException unused) {
            LogUtil.e("Track_IDEQ_FtmpController", "InterruptedException");
        }
        this.ak = -1;
        if (!b(bluetoothGatt, bluetoothGattService) || !a(bluetoothGatt, bluetoothGattService) || !d(bluetoothGatt, bluetoothGattService2)) {
            return false;
        }
        this.al = true;
        e(AbstractFitnessClient.ACTION_READ_SUCCESS);
        return true;
    }

    private boolean b(BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService) {
        LogUtil.a("Track_IDEQ_FtmpController", "readFtmpCharacter");
        if (!c(bluetoothGatt, bluetoothGattService, 0, l, "machineFeatureChar")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read machineFeatureChar fail");
            return false;
        }
        if (c(bluetoothGatt, bluetoothGattService, 1, t, "trainingState")) {
            return true;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "read trainingState fail");
        return false;
    }

    private boolean a(BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService) {
        if (!b(bluetoothGatt, bluetoothGattService, 2, v, "supportSpeedRange")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read supportSpeedRange fail");
            return false;
        }
        if (!b(bluetoothGatt, bluetoothGattService, 3, u, "supportInclinationRange")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read supportInclinationRange fail");
            return false;
        }
        if (!b(bluetoothGatt, bluetoothGattService, 4, y, "supportResistanceLevelRange")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read supportResistanceLevelRange fail");
            return false;
        }
        if (!b(bluetoothGatt, bluetoothGattService, 5, w, "supportHeartRateRange")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read supportHeartRateRange fail");
            return false;
        }
        if (b(bluetoothGatt, bluetoothGattService, 6, x, "supportPowerRange")) {
            return true;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "read supportPowerRange fail");
        return false;
    }

    private boolean d(BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService) {
        if (bluetoothGattService == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS mDisService not found");
            return false;
        }
        if (!c(bluetoothGatt, bluetoothGattService, 7, f, "Manufacturer Name String")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read Manufacturer Name String fail");
            return false;
        }
        if (!c(bluetoothGatt, bluetoothGattService, 8, h, "Model Number String")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read Model Number String fail");
            return false;
        }
        if (!c(bluetoothGatt, bluetoothGattService, 9, i, "Serial Number String")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read Serial Number String fail");
            return false;
        }
        if (!c(bluetoothGatt, bluetoothGattService, 10, d, "Hardware Revision String")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read Hardware Revision String fail");
            return false;
        }
        if (!c(bluetoothGatt, bluetoothGattService, 11, e, "Firmware Revision String")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read Firmware Revision String fail");
            return false;
        }
        if (!c(bluetoothGatt, bluetoothGattService, 12, g, "Software Revision String")) {
            LogUtil.a("Track_IDEQ_FtmpController", "read Software Revision String fail");
            return false;
        }
        if (c(bluetoothGatt, bluetoothGattService, 13, j, "System ID")) {
            return true;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "read System ID fail");
        return false;
    }

    private boolean c(BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, int i2, UUID uuid, String str) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        LogUtil.a("Track_IDEQ_FtmpController", "enter isReadCharacteristicSuccess, tag is : ", str);
        if (characteristic == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS readCharacteristic : ", str, " is null");
            return false;
        }
        return b(bluetoothGatt, i2, str, characteristic);
    }

    private boolean b(BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, int i2, UUID uuid, String str) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        LogUtil.a("Track_IDEQ_FtmpController", "enter isReadSupportRangeCharacterSuccess, tag is ：", str);
        if (characteristic == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "FTMP_TS readCharacteristic: ", str, " is null");
            this.ak++;
            return true;
        }
        return b(bluetoothGatt, i2, str, characteristic);
    }

    private boolean b(BluetoothGatt bluetoothGatt, int i2, String str, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        boolean characteristic;
        LogUtil.a("Track_IDEQ_FtmpController", " readCount = ", Integer.valueOf(i2), " CurrentReadCount = ", Integer.valueOf(this.ak));
        try {
            characteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
        } catch (SecurityException e2) {
            ReleaseLogUtil.a("R_EcologyDevice_Track_IDEQ_FtmpController", "waitingReadResult, ", ExceptionUtils.c(e2));
            characteristic = false;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "FTMP readCharacteristic: ", str, " isSuccess = ", Boolean.valueOf(characteristic));
        if (!characteristic) {
            return false;
        }
        int i3 = 0;
        while (a(i2, i3)) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                LogUtil.e("Track_IDEQ_FtmpController", "InterruptedException");
            }
            i3++;
        }
        if (i3 < 10 && nxs.d().h()) {
            return true;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "readCharacteristic(", str, Constants.RIGHT_BRACKET_ONLY, "loop larger than 10 times, fail");
        return false;
    }

    private boolean a(int i2, int i3) {
        boolean z = this.ak != i2 && i3 < 10 && nxs.d().h();
        LogUtil.a("Track_IDEQ_FtmpController", "isReadSuccess ", Boolean.valueOf(z), " mReadCount ", Integer.valueOf(this.ak));
        return z;
    }

    public void a(int[] iArr) {
        e(MachineControlPointResponse.OP_CODE_EXTENSION_SET_UNLOCK_CODE, iArr, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    public void c(Map<String, String> map) {
        if (map == null) {
            LogUtil.j("Track_IDEQ_FtmpController", "map is null");
            return;
        }
        TreeMap<Integer, byte[]> treeMap = new TreeMap<>();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (!it.hasNext()) {
                if (i2 == 0) {
                    LogUtil.j("Track_IDEQ_FtmpController", "valueLength is null");
                    return;
                }
                byte[] bArr = new byte[i2 + 2];
                bArr[0] = (byte) (i3 & 255);
                bArr[1] = (byte) ((i3 >> 8) & 255);
                for (Map.Entry<Integer, byte[]> entry : treeMap.entrySet()) {
                    for (byte b2 : entry.getValue()) {
                        i4++;
                        bArr[i4] = b2;
                    }
                    LogUtil.a("Track_IDEQ_FtmpController", "allValueMap key is ", entry.getKey());
                }
                b(bArr);
                return;
            }
            Map.Entry<String, String> next = it.next();
            String value = next.getValue();
            LogUtil.a("Track_IDEQ_FtmpController", next.getKey(), ":", value);
            String key = next.getKey();
            key.hashCode();
            switch (key) {
                case "targetedExpendedEnergy":
                    if (d(treeMap, value, 6)) {
                        i3 += 64;
                        i2 += 2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "totalEnergy":
                    if (d(treeMap, value, 2)) {
                        i3 += 4;
                        i2 += 2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "unlockCode":
                    if (b(treeMap, value)) {
                        i3++;
                        i2 += 6;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "dynamicEnergy":
                    if (d(treeMap, value, 3)) {
                        i3 += 8;
                        i2 += 2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "heartRate":
                    if (c(treeMap, value, 1)) {
                        i3 += 2;
                        i2++;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "suppressAutoPause":
                    if (c(treeMap, value, 5)) {
                        i3 += 32;
                        i2++;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "stepCount":
                    if (d(treeMap, value, 4)) {
                        i3 += 16;
                        i2 += 2;
                        break;
                    } else {
                        break;
                    }
                    break;
            }
        }
    }

    private boolean b(TreeMap<Integer, byte[]> treeMap, String str) {
        if (TextUtils.isEmpty(str) || str.length() != 6) {
            LogUtil.a("Track_IDEQ_FtmpController", "unlock code is error");
            return false;
        }
        byte[] bArr = new byte[6];
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i2] = (byte) (CommonUtil.b(String.valueOf(str.charAt(i2)), 10) & 255);
            LogUtil.a("Track_IDEQ_FtmpController", "addUnlockCode unlockCode: " + ((int) bArr[i2]));
        }
        treeMap.put(0, bArr);
        return true;
    }

    private boolean c(TreeMap<Integer, byte[]> treeMap, String str, int i2) {
        int iB = CommonUtil.b(str, 10);
        if (iB < 0 || iB > 255) {
            return false;
        }
        treeMap.put(Integer.valueOf(i2), new byte[]{(byte) (iB & 255)});
        return true;
    }

    private boolean d(TreeMap<Integer, byte[]> treeMap, String str, int i2) {
        int iB = CommonUtil.b(str, 10);
        if (iB < 0 || iB > 65535) {
            return false;
        }
        treeMap.put(Integer.valueOf(i2), new byte[]{(byte) (iB & 255), (byte) ((iB >> 8) & 255)});
        return true;
    }

    public void d(int i2, int[] iArr) {
        c(nzc.e(i2), iArr);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    public void c(int i2, int[] iArr) {
        byte[] bArrI = null;
        if (this.aa != 1 && this.aj.contains(Integer.valueOf(i2))) {
            LogUtil.a("Track_IDEQ_FtmpController", "setFitnessMachineControl request control");
            c(0, (int[]) null);
            this.an = i2;
            this.am = iArr;
            return;
        }
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "setFitnessMachineControl opCode = ", Integer.valueOf(i2), " para = ", Arrays.toString(iArr));
        if (e(i2, iArr)) {
            return;
        }
        if (i2 > 255 || i2 < 0) {
            LogUtil.d("Track_IDEQ_FtmpController", "setFitnessMachineControl, invalid opcode!");
            return;
        }
        if (i2 == 0 || i2 == 1) {
            bArrI = new byte[]{(byte) (i2 & 255)};
        } else if (i2 == 2 || i2 == 3 || i2 == 5) {
            bArrI = i(i2, iArr);
        } else if (i2 != 21) {
            switch (i2) {
                case 7:
                    bArrI = new byte[]{(byte) (i2 & 255)};
                    break;
                case 8:
                    bArrI = h(i2, iArr);
                    break;
                case 9:
                case 10:
                case 11:
                case 13:
                    bArrI = i(i2, iArr);
                    break;
                case 12:
                    bArrI = j(i2, iArr);
                    break;
                default:
                    e(i2);
                    break;
            }
        } else {
            bArrI = f(i2, iArr);
        }
        LogUtil.d("Track_IDEQ_FtmpController", "setControlPoint, value is  ", Arrays.toString(bArrI));
        e(i2, iArr, d(this.ad, bArrI));
    }

    private void e(int i2, int[] iArr, boolean z) {
        LogUtil.d("Track_IDEQ_FtmpController", "reSendMessage, isSuccess is  ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "reSend");
        Bundle bundle = new Bundle();
        bundle.putInt("opCode", i2);
        bundle.putIntArray("para", iArr);
        Message messageObtainMessage = this.ag.obtainMessage();
        messageObtainMessage.what = 5;
        messageObtainMessage.setData(bundle);
        this.ag.sendMessageDelayed(messageObtainMessage, 500L);
        LogUtil.a("Track_IDEQ_FtmpController", "reSend end");
    }

    private void e(int i2) {
        if (i2 != 4 && i2 != 6) {
            switch (i2) {
            }
            return;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "op code ", Integer.valueOf(i2), "do not support yet!");
    }

    private byte[] j(int i2, int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl, para is null");
            return null;
        }
        int i3 = iArr[0];
        if (i3 > 16777215 || i3 < 0) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl, para is invalid");
            return null;
        }
        return new byte[]{(byte) (i2 & 255), (byte) (i3 & 255), (byte) ((i3 >> 8) & 255), (byte) ((i3 >> 16) & 255)};
    }

    private byte[] h(int i2, int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl, para is null");
            return null;
        }
        int i3 = iArr[0];
        if (i3 > 255 || i3 < 0) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl, para is invalid");
            return null;
        }
        return new byte[]{(byte) (i2 & 255), (byte) (i3 & 255)};
    }

    private byte[] i(int i2, int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl para is null");
            return null;
        }
        int i3 = iArr[0];
        if (i3 > 65535 || i3 < 0) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl para is invalid");
            return null;
        }
        return new byte[]{(byte) (i2 & 255), (byte) (i3 & 255), (byte) ((i3 >> 8) & 255)};
    }

    private byte[] f(int i2, int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl para is null");
            return null;
        }
        int i3 = iArr[0];
        if (i3 > 65535 || i3 < 0) {
            LogUtil.e("Track_IDEQ_FtmpController", "setFitnessMachineControl para is invalid");
            return null;
        }
        return new byte[]{(byte) (i2 & 255), (byte) (i3 & 255)};
    }

    private boolean e(int i2, int[] iArr) {
        if (i2 > 65535 || i2 < 0) {
            LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl para is invalid");
            return true;
        }
        return b(i2, iArr);
    }

    private boolean b(int i2, int[] iArr) {
        byte[] bArrD;
        switch (i2) {
            case 160:
                if (d(iArr)) {
                    return true;
                }
                bArrD = d(iArr, 2);
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY /* 161 */:
                if (b(iArr)) {
                    return true;
                }
                bArrD = c(iArr, 4);
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY /* 162 */:
                if (b(iArr)) {
                    return true;
                }
                bArrD = c(iArr, 8);
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT /* 163 */:
                if (b(iArr)) {
                    return true;
                }
                bArrD = c(iArr, 16);
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA /* 164 */:
                if (e(iArr)) {
                    return true;
                }
                bArrD = b(iArr, 18);
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_UNLOCK_CODE /* 165 */:
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE /* 166 */:
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY /* 167 */:
                return a(i2, iArr);
            default:
                return false;
        }
        return b(bArrD);
    }

    private boolean a(int i2, int[] iArr) {
        byte[] bArrE;
        int i3;
        switch (i2) {
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_UNLOCK_CODE /* 165 */:
                if (c(iArr)) {
                    LogUtil.a("Track_IDEQ_FtmpController", "para is null or unlock code is error");
                    return true;
                }
                bArrE = e(iArr, 1);
                break;
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE /* 166 */:
                if (iArr == null || (i3 = iArr[0]) > 255 || i3 < 0) {
                    LogUtil.a("Track_IDEQ_FtmpController", "para is null or para[0] is invalid");
                    return true;
                }
                bArrE = a(iArr, 32);
                break;
                break;
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY /* 167 */:
                if (b(iArr)) {
                    return true;
                }
                bArrE = c(iArr, 64);
                break;
            default:
                bArrE = null;
                break;
        }
        return b(bArrE);
    }

    private byte[] a(int[] iArr, int i2) {
        byte[] bArr = new byte[3];
        bArr[e(bArr, i2)] = (byte) (iArr[0] & 255);
        return bArr;
    }

    private int e(byte[] bArr, int i2) {
        bArr[0] = (byte) (i2 & 255);
        bArr[1] = (byte) ((i2 >> 8) & 255);
        return 2;
    }

    private boolean c(int[] iArr) {
        return iArr == null || iArr.length > 6;
    }

    public boolean c(int i2, int i3) {
        byte[] bArrI = i(2, new int[]{i2 * 100});
        byte[] bArrI2 = i(5, new int[]{i3});
        byte[] bArrI3 = i(20, new int[]{i2 * 2});
        if (bArrI2 == null || bArrI == null || bArrI3 == null) {
            LogUtil.a("Track_IDEQ_FtmpController", "cadence or power is null");
            return false;
        }
        d(bArrI, bArrI2, bArrI3);
        return true;
    }

    public void d(boolean z) {
        c(MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE, new int[]{z ? 1 : 0});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        LogUtil.a("Track_IDEQ_FtmpController", "handleResistanceCommand");
        if (g()) {
            this.ag.sendMessageDelayed(a(bArr, bArr2, bArr3, 1), 100L);
        } else {
            e(bArr, bArr2, bArr3);
        }
    }

    private Message a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("speed", bArr);
        bundle.putByteArray("power", bArr2);
        bundle.putByteArray("cadence", bArr3);
        Message messageObtainMessage = this.ag.obtainMessage();
        messageObtainMessage.what = i2;
        messageObtainMessage.setData(bundle);
        return messageObtainMessage;
    }

    private void e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        LogUtil.a("Track_IDEQ_FtmpController", "sendIndoorBikeResistance");
        boolean zD = d(this.ad, bArr);
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "sendIndoorBikeResistance sendSpeed result ", Boolean.valueOf(zD));
        if (!zD) {
            this.ag.sendMessageDelayed(a(bArr, bArr2, bArr3, 2), 100L);
            return;
        }
        boolean zD2 = d(this.ad, bArr2);
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "sendIndoorBikeResistance sendPower result ", Boolean.valueOf(zD2));
        if (!zD2) {
            this.ag.sendMessageDelayed(a(bArr, bArr2, bArr3, 3), 100L);
            return;
        }
        boolean zD3 = d(this.ad, bArr3);
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "sendIndoorBikeResistance sendCadence result = ", Boolean.valueOf(zD3));
        if (!zD3) {
            this.ag.sendMessageDelayed(a(bArr, bArr2, bArr3, 4), 100L);
        } else {
            ObserverManagerUtil.e("DEVICE_CONTROL", "INDOOR_BIKE_RESISTANCE_CONTROL", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(byte[] bArr, Message message) {
        LogUtil.a("Track_IDEQ_FtmpController", "sendSpeed");
        boolean zD = d(this.ad, bArr);
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "sendSpeed result ", Boolean.valueOf(zD));
        if (!zD) {
            this.ag.sendMessageDelayed(Message.obtain(message), 100L);
            return;
        }
        Message messageObtain = Message.obtain(message);
        messageObtain.what = 3;
        this.ag.sendMessageDelayed(messageObtain, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr, Message message) {
        LogUtil.a("Track_IDEQ_FtmpController", "sendPower");
        boolean zD = d(this.ad, bArr);
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "sendPower result ", Boolean.valueOf(zD));
        if (!zD) {
            this.ag.sendMessageDelayed(Message.obtain(message), 100L);
            return;
        }
        Message messageObtain = Message.obtain(message);
        messageObtain.what = 4;
        this.ag.sendMessageDelayed(messageObtain, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr, Message message) {
        LogUtil.a("Track_IDEQ_FtmpController", "sendCadence");
        boolean zD = d(this.ad, bArr);
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "sendCadence result ", Boolean.valueOf(zD));
        if (!zD) {
            this.ag.sendMessageDelayed(Message.obtain(message), 100L);
        } else {
            ObserverManagerUtil.e("DEVICE_CONTROL", "INDOOR_BIKE_RESISTANCE_CONTROL", 1);
        }
    }

    private byte[] e(int[] iArr, int i2) {
        byte[] bArr = new byte[8];
        for (int iE = e(bArr, i2); iE < iArr.length + 2; iE++) {
            bArr[iE] = (byte) (iArr[iE - 2] & 255);
            LogUtil.a("Track_IDEQ_FtmpController", "parseParaOfExtensionMultiData: " + ((int) bArr[iE]));
        }
        LogUtil.a("Track_IDEQ_FtmpController", "parseParaOfExtensionMultiData value : " + Arrays.toString(bArr));
        return bArr;
    }

    private boolean b(byte[] bArr) {
        if (this.ah == null) {
            LogUtil.a("Track_IDEQ_FtmpController", "HuaWeiExtensionCharacteristic is null");
            return false;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "handleHuaWeiExtensionMachineControl, value is ", Arrays.toString(bArr));
        d(this.ah, bArr);
        return true;
    }

    private void c(MachineControlPointResponse machineControlPointResponse) {
        int responseOpCode = machineControlPointResponse.getResponseOpCode();
        LogUtil.a("Track_IDEQ_FtmpController", "(FTMP_TS) in processMachineControlPointIndication, responseOpCode is ", Integer.valueOf(responseOpCode));
        if (responseOpCode != 128) {
            LogUtil.d("Track_IDEQ_FtmpController", "processMachineControlPointIndication error");
            return;
        }
        int requestOpCode = machineControlPointResponse.getRequestOpCode();
        int resultCode = machineControlPointResponse.getResultCode();
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FtmpController", "requestOpCode is ", Integer.valueOf(requestOpCode), " resultCode is ", Integer.valueOf(resultCode));
        String str = "set_target_failed";
        switch (requestOpCode) {
            case 0:
                if (this.an == -1) {
                    b(resultCode);
                } else {
                    d(resultCode);
                }
                break;
            case 1:
                this.aa = 0;
                if (this.an == -1) {
                    d(912, EventType.FAILED);
                } else if (resultCode == 1) {
                    c(0, (int[]) null);
                } else {
                    c("set_target_failed");
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
                if (!this.aj.contains(Integer.valueOf(requestOpCode))) {
                    j(resultCode);
                } else {
                    if (resultCode == 1) {
                        str = "set_target_success";
                    }
                    c(str);
                }
                break;
        }
        LogUtil.a("Track_IDEQ_FtmpController", "control result(mIsControlAllowed):", Integer.valueOf(this.aa));
    }

    private void j(int i2) {
        if (i2 == 1) {
            d(912, "success");
        } else {
            d(912, EventType.FAILED);
        }
    }

    private void b(int i2) {
        if (i2 == 1) {
            this.aa = 1;
            LogUtil.a("Track_IDEQ_FtmpController", "FTMP_TS onCharacteristicChanged, AbstractFitnessClient.ACTION_REQUEST_MACHINE_CONTROL_SUCCESS");
            e(AbstractFitnessClient.ACTION_REQUEST_MACHINE_CONTROL_SUCCESS);
        } else {
            this.aa = 0;
            d(912, EventType.FAILED);
        }
    }

    private void d(int i2) {
        LogUtil.a("Track_IDEQ_FtmpController", "responseControlForSetTarget resultCode is ", Integer.valueOf(i2));
        if (i2 == 1) {
            this.aa = 1;
            c(this.an, this.am);
            return;
        }
        if (i2 == 4) {
            this.aa = 0;
            int i3 = this.ar;
            if (i3 > 0) {
                this.ar = i3 - 1;
                c(1, (int[]) null);
                return;
            } else {
                c("set_target_failed");
                return;
            }
        }
        this.aa = 0;
        c("set_target_failed");
    }

    private void c(String str) {
        LogUtil.a("Track_IDEQ_FtmpController", "setTargetNotify message is ", str);
        d(912, str);
        this.an = -1;
    }

    private boolean d(TrainingStatus trainingStatus) {
        return trainingStatus.getTrainingStatus() != 1;
    }

    private byte[] d(int[] iArr, int i2) {
        byte[] bArr = new byte[3];
        bArr[e(bArr, i2)] = (byte) (iArr[0] & 255);
        return bArr;
    }

    private byte[] c(int[] iArr, int i2) {
        int i3 = iArr[0];
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) (i3 & 255), (byte) ((i3 >> 8) & 255)};
    }

    private byte[] b(int[] iArr, int i2) {
        byte b2 = (byte) (iArr[0] & 255);
        int i3 = iArr[1];
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), b2, (byte) (i3 & 255), (byte) ((i3 >> 8) & 255)};
    }

    private boolean d(int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl para is null");
            return true;
        }
        int i2 = iArr[0];
        if (i2 <= 255 && i2 >= 0) {
            return false;
        }
        LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para is invalid");
        return true;
    }

    private boolean b(int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para is null");
            return true;
        }
        int i2 = iArr[0];
        if (i2 <= 65535 && i2 >= 0) {
            return false;
        }
        LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para is invalid");
        return true;
    }

    private boolean e(int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para is null");
            return true;
        }
        if (iArr.length < 2) {
            LogUtil.j("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para length is ", Integer.valueOf(iArr.length));
            return true;
        }
        int i2 = iArr[0];
        if (i2 > 255 || i2 < 0) {
            LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para[0] is invalid");
            return true;
        }
        int i3 = iArr[1];
        if (i3 <= 65535 && i3 >= 0) {
            return false;
        }
        LogUtil.e("Track_IDEQ_FtmpController", "handleHuaweiExtensionMachineControl, para[1] is invalid");
        return true;
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43897b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BluetoothGattService f43898c;
        private BluetoothGattService d;
        private BluetoothGatt e;
        private boolean j;

        d(BluetoothGatt bluetoothGatt, boolean z, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2) {
            this.e = bluetoothGatt;
            this.j = z;
            this.f43898c = bluetoothGattService;
            this.d = bluetoothGattService2;
        }

        public void a(boolean z) {
            this.f43897b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                LogUtil.e("Track_IDEQ_FtmpController", "InterruptedException");
            }
            nxl.this.b(this.e, this.j);
            if (this.f43897b) {
                nxl.this.al = false;
                int i = 0;
                while (!nxl.this.a(this.e, this.f43898c, this.d) && i <= 5) {
                    if (!this.f43897b) {
                        return;
                    } else {
                        i++;
                    }
                }
                if (i > 5 || !nxs.d().h()) {
                    nxl.this.al = false;
                    LogUtil.a("Track_IDEQ_FtmpController", "initCount large than LOOP_FIVE");
                    nxl.this.e(AbstractFitnessClient.ACTION_INVALID_DEVICE_INFO);
                }
                LogUtil.a("Track_IDEQ_FtmpController", "is read completed: ", Boolean.valueOf(nxl.this.al));
            }
        }
    }

    public void d() {
        if (this.ag != null) {
            LogUtil.a("Track_IDEQ_FtmpController", "mHandler will removeHandleMassage");
            this.ag.removeCallbacksAndMessages(null);
        }
    }
}
