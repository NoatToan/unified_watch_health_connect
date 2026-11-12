package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class eik implements HealthDataParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f33031b = new Object();

    @Override // com.huawei.health.device.open.data.HealthDataParser
    public HealthData parseData(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("BloodPressureDataParser", "parseData data is null");
            return new HealthData();
        }
        b bVar = new b(bArr);
        int iD = bVar.d(17, 0);
        boolean z = (iD & 2) != 0;
        boolean z2 = (iD & 4) != 0;
        float fC = bVar.c(50, 1);
        float fC2 = bVar.c(50, 3);
        if (fC <= 0.0f || fC2 <= 0.0f) {
            LogUtil.j("BloodPressureDataParser", "parseData invalid bloodPressure");
            return new HealthData();
        }
        Calendar calendar = Calendar.getInstance();
        int i = 7;
        if (z) {
            calendar.set(1, bVar.d(18, 7));
            calendar.set(2, bVar.d(17, 9) - 1);
            calendar.set(5, bVar.d(17, 10));
            calendar.set(11, bVar.d(17, 11));
            calendar.set(12, bVar.d(17, 12));
            calendar.set(13, bVar.d(17, 13));
            i = 14;
        }
        float fC3 = z2 ? bVar.c(50, i) : 0.0f;
        eni eniVar = new eni();
        eniVar.setSystolic((short) fC);
        eniVar.setDiastolic((short) fC2);
        eniVar.setType(HealthData.BLOODPRESURE);
        if (fC3 > 0.0f) {
            eniVar.setHeartRate((short) fC3);
        }
        LogUtil.a("BloodPressureDataParser", "parseData date is ", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime()));
        return d(calendar, eniVar, z);
    }

    private HealthData d(Calendar calendar, eni eniVar, boolean z) {
        ReleaseLogUtil.d("BTSYNC_BloodPressureDataParser", "parseData date is ", Long.valueOf(calendar.getTimeInMillis()), " data year: ", Integer.valueOf(calendar.get(1)));
        if (calendar.get(1) < 2021 || !z) {
            LogUtil.a("BloodPressureDataParser", "time is invalid");
            eniVar.setStartTime(System.currentTimeMillis());
            eniVar.setEndTime(System.currentTimeMillis());
            return eniVar;
        }
        LogUtil.a("BloodPressureDataParser", "time is valid");
        eniVar.setStartTime(calendar.getTimeInMillis());
        eniVar.setEndTime(calendar.getTimeInMillis());
        return eniVar;
    }

    public int e(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("BloodPressureDataParser", "parseData data is null");
            return -1;
        }
        b bVar = new b(bArr);
        int iD = bVar.d(17, 0);
        if (iD > 255 || iD < 0) {
            LogUtil.a("BloodPressureDataParser", "parseRopeDataCharacteristic, invalid command!");
            return -1;
        }
        if (iD != 1) {
            LogUtil.a("BloodPressureDataParser", "parseBleControlCharacteristic, Unrecognized Blp control Data!");
            return -1;
        }
        int iD2 = bVar.d(17, 1);
        LogUtil.a("BloodPressureDataParser", "OP_COMMAND_START_MEASURING measuringData is ", Integer.valueOf(iD2));
        return iD2;
    }

    public boolean e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, int i2) {
        byte[] bArr;
        LogUtil.a("BloodPressureDataParser", "setBlpControl opCode: ", Integer.valueOf(i2));
        if (i > 255 || i < 0) {
            LogUtil.a("BloodPressureDataParser", "setBloodPressureControlUtil, invalid opCommand!");
            return false;
        }
        if (i2 > 255 || i2 < 0) {
            LogUtil.a("BloodPressureDataParser", "setBloodPressureControlUtil, invalid opcode!");
            return false;
        }
        if (i == 1) {
            bArr = new byte[]{(byte) (i & 255), (byte) (i2 & 255), 0, 0};
            LogUtil.a("BloodPressureDataParser", "setBloodPressureControlUtil opCommand: ", Integer.valueOf(i));
        } else {
            bArr = null;
        }
        if (bArr == null) {
            return false;
        }
        if (bluetoothGattCharacteristic != null) {
            if (d(bluetoothGatt, bluetoothGattCharacteristic, bArr)) {
                LogUtil.a("BloodPressureDataParser", "writeCharacteristicValueBytes success");
                return true;
            }
            LogUtil.a("BloodPressureDataParser", "writeCharacteristicValueBytes failed");
            return false;
        }
        LogUtil.a("BloodPressureDataParser", "mMeasuringCharacteristic is null");
        return false;
    }

    private boolean d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        synchronized (f33031b) {
            if (bluetoothGattCharacteristic != null && bluetoothGatt != null && bArr != null) {
                try {
                    bluetoothGattCharacteristic.setValue(bArr);
                    return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                } catch (SecurityException e) {
                    LogUtil.e("BloodPressureDataParser", "writeCharacteristicValueBytes SecurityException:", ExceptionUtils.c(e));
                    return false;
                }
            }
            LogUtil.j("BloodPressureDataParser", "WriteValueBytes: something is null.");
            if (bluetoothGattCharacteristic == null) {
                LogUtil.j("BloodPressureDataParser", "WriteValueBytes: characteristic is null.");
            }
            if (bluetoothGatt == null) {
                LogUtil.j("BloodPressureDataParser", "WriteValueBytes: mBluetoothGatt is null.");
            }
            return false;
        }
    }

    static class b {
        private byte[] e;

        private int a(int i, int i2) {
            int i3 = 1 << (i2 - 1);
            return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
        }

        private int b(byte b2) {
            return b2 & 255;
        }

        private int b(int i) {
            return i & 15;
        }

        b(byte[] bArr) {
            this.e = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d(int i, int i2) {
            int iB = b(i);
            byte[] bArr = this.e;
            if (iB + i2 > bArr.length) {
                return -1;
            }
            if (i == 17) {
                return b(bArr[i2]);
            }
            if (i == 18) {
                return a(bArr[i2], bArr[i2 + 1]);
            }
            if (i != 20) {
                return -1;
            }
            return e(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float c(int i, int i2) {
            int iB = b(i);
            byte[] bArr = this.e;
            if (iB + i2 <= bArr.length && i == 50) {
                return d(bArr[i2], bArr[i2 + 1]);
            }
            return -1.0f;
        }

        private int a(byte b2, byte b3) {
            return b(b2) + (b(b3) << 8);
        }

        private int e(byte b2, byte b3, byte b4, byte b5) {
            return b(b2) + (b(b3) << 8) + (b(b4) << 16) + (b(b5) << 24);
        }

        private float d(byte b2, byte b3) {
            return (float) (((double) a(b(b2) + ((b(b3) & 15) << 8), 12)) * Math.pow(10.0d, a(b(b3) >> 4, 4)));
        }
    }
}
