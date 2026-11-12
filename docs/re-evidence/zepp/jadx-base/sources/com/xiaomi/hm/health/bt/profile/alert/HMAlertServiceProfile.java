package com.xiaomi.hm.health.bt.profile.alert;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class HMAlertServiceProfile extends HMBaseProfile {
    public static final int VERSION_4 = 4;
    public static final int VERSION_5 = 5;
    private static final String f = "HMAlertServiceProfile";
    private static final int g = -1;
    private static final int h = 6;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    private static final int l = 240;
    private static final int m = 400;
    private static final int n = 1000;
    private static final String o = "...";
    private static final int p = 36;
    private static final int q = 174;
    private static final int r = 30;
    private static final String s = "Long Value";
    private static AtomicBoolean t = null;
    private static final UUID u = GattUtils.uuid16("1811");
    private static final UUID v = GattUtils.uuid16("2A46");
    private static final UUID w = GattUtils.uuid16("2A44");
    private static final byte x = -126;
    private BluetoothGattCharacteristic b;
    private BluetoothGattCharacteristic c;
    private int d;
    private final AtomicBoolean e;

    public HMAlertServiceProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = new AtomicBoolean(false);
    }

    private static byte[] b(String title, String message, String appName, int type, int maxPdLength) {
        int length = TextUtils.isEmpty(appName) ? 0 : appName.getBytes(Charset.defaultCharset()).length;
        if (length > 30) {
            length = 30;
        }
        if (type != 2) {
            maxPdLength = 240;
        }
        int i2 = maxPdLength - length;
        int length2 = TextUtils.isEmpty(title) ? 0 : title.getBytes(Charset.defaultCharset()).length;
        if (length2 <= i2) {
            i2 = length2;
        }
        int i3 = maxPdLength - i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!TextUtils.isEmpty(title)) {
            String strCutString = ProfileUtils.cutString(title, i2);
            if (!TextUtils.isEmpty(strCutString)) {
                byteArrayOutputStream.write(strCutString.getBytes(Charset.defaultCharset()), 0, strCutString.getBytes(Charset.defaultCharset()).length);
            }
        }
        byteArrayOutputStream.write(0);
        if (!TextUtils.isEmpty(message)) {
            int length3 = message.getBytes(Charset.defaultCharset()).length;
            boolean z = length3 > i3;
            if (z) {
                length3 = i3 - o.getBytes().length;
            }
            String strCutString2 = ProfileUtils.cutString(message, length3);
            if (!TextUtils.isEmpty(strCutString2)) {
                if (z) {
                    strCutString2 = strCutString2 + o;
                }
                byteArrayOutputStream.write(strCutString2.getBytes(Charset.defaultCharset()), 0, strCutString2.getBytes(Charset.defaultCharset()).length);
            }
        }
        byteArrayOutputStream.write(0);
        if (!TextUtils.isEmpty(appName)) {
            String strCutString3 = ProfileUtils.cutString(appName, length);
            Debug.i(f, "cutAppName:" + strCutString3);
            if (!TextUtils.isEmpty(strCutString3)) {
                byteArrayOutputStream.write(strCutString3.getBytes(Charset.defaultCharset()), 0, strCutString3.getBytes(Charset.defaultCharset()).length);
            }
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] c(String title, String message, String appName, int type, boolean isAlertMaxLength) {
        return b(title, message, appName, type, isAlertMaxLength ? 1000 : 400);
    }

    private static byte[] d(String title, int max) {
        if (TextUtils.isEmpty(title)) {
            return null;
        }
        String strCutString = ProfileUtils.cutString(title, max);
        if (TextUtils.isEmpty(strCutString)) {
            return null;
        }
        return strCutString.getBytes(Charset.defaultCharset());
    }

    private int e() {
        UUID uuid = u;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(f, uuid + " is null!!!");
            return -1;
        }
        UUID uuid2 = v;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Debug.fi(f, uuid2 + " is null!!!");
            return -1;
        }
        if ((characteristic.getProperties() & 2) != 0) {
            byte[] bArr = read(characteristic);
            Debug.fi(f, "alert data:" + GattUtils.bytesToHexString(bArr));
            if (bArr == null || bArr.length < 1) {
                return 0;
            }
            return bArr[0] & 255;
        }
        Debug.fi(f, uuid2 + " no read property");
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(service.getCharacteristic(w), new byte[]{2});
        if (hMNotifyResponseSendCommandWithResponse == null || hMNotifyResponseSendCommandWithResponse.getData() == null) {
            return 0;
        }
        return hMNotifyResponseSendCommandWithResponse.getData()[0] & 255;
    }

    public static byte[] getAlertCmd(HMAlertModeExt modeExt, int type) {
        byte[] bArrD;
        if (modeExt.getType() == 3 || modeExt.getType() == 2 || modeExt.getType() == 4) {
            return null;
        }
        HMAlertMode mode = modeExt.getMode();
        String title = modeExt.getTitle();
        String message = modeExt.getMessage();
        String appName = modeExt.getAppName();
        if (type != 0) {
            bArrD = c(title, message, appName, type, modeExt.isAlertMaxLength());
        } else {
            bArrD = d(title, 20 - (mode != HMAlertMode.ALERT_THIRD_APP ? 2 : 3));
        }
        int length = bArrD == null ? 0 : bArrD.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(mode.getValue());
        byteArrayOutputStream.write(modeExt.getType());
        if (mode == HMAlertMode.ALERT_THIRD_APP) {
            byteArrayOutputStream.write(modeExt.getAlertApp().getValue());
        }
        if (length > 0) {
            byteArrayOutputStream.write(bArrD, 0, length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Debug.i(f, "getAlertCmd:" + GattUtils.bytesToHexString(byteArray) + ",len:" + byteArray.length);
        return byteArray;
    }

    private static void h(@NonNull ByteArrayOutputStream bos, @NonNull String str) {
        i(bos, str, Charset.defaultCharset());
    }

    private static void i(@NonNull ByteArrayOutputStream bos, @NonNull String str, @NonNull Charset charset) {
        byte[] bytes = str.getBytes(charset);
        bos.write(bytes, 0, bytes.length);
    }

    public boolean alert(HMAlertModeExt modeExt) {
        if (this.b == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = t;
        byte[] alertCmd = getAlertCmd(modeExt, (atomicBoolean == null || !atomicBoolean.get()) ? 0 : 1);
        return alertCmd != null && alertCmd.length > 0 && write(this.b, alertCmd);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    public void f() {
        Debug.fi(f, "resetVersion");
        this.d = -1;
        this.e.set(false);
    }

    public synchronized boolean g() {
        Debug.fi(f, "ANS version now: " + this.d + "； and has refreshed: " + this.e.get());
        if (this.d == -1 && this.e.compareAndSet(false, true)) {
            this.d = e();
        }
        Debug.fi(f, "ANS version refresh: " + this.d);
        return this.d >= 5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    public byte[] getAlertCmdNew(HMAlertModeExt modeExt, boolean supportCallReply) {
        int i2;
        String phoneNo;
        HMAlertMode hMAlertMode;
        boolean z;
        byte[] bArrB;
        int length;
        HMAlertMode mode = modeExt.getMode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(mode.getValue());
        byte[] bArrIntToBytes = GattUtils.intToBytes(modeExt.getId());
        byte type = modeExt.getType();
        if (type != 0) {
            if (type == 1) {
                byteArrayOutputStream.write(type == 1 ? 0 : 4);
                byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
                String title = modeExt.getTitle();
                String message = modeExt.getMessage();
                String appName = modeExt.getAppName();
                if (modeExt.isAlertMaxLength()) {
                    i2 = 1000;
                } else {
                    i2 = 400;
                }
                phoneNo = modeExt.getPhoneNo();
                hMAlertMode = HMAlertMode.ALERT_INCALL;
                if (mode == hMAlertMode || !supportCallReply) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (phoneNo != null) {
                        length = phoneNo.length();
                    } else {
                        length = 1;
                    }
                    i2 -= length;
                }
                bArrB = b(title, message, appName, 2, i2);
                if (mode == HMAlertMode.ALERT_THIRD_APP) {
                    byteArrayOutputStream.write(modeExt.getAlertApp().getValue());
                }
                if (bArrB != null) {
                    byteArrayOutputStream.write(bArrB, 0, bArrB.length);
                }
                if (z) {
                    if (phoneNo != null) {
                        h(byteArrayOutputStream, phoneNo);
                    }
                    byteArrayOutputStream.write(0);
                }
                if (mode == hMAlertMode && this.d >= 6) {
                    byteArrayOutputStream.write(modeExt.isSupportHangUp() ? 2 : 1);
                }
            } else if (type == 2) {
                byteArrayOutputStream.write(2);
                byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
            } else if (type == 3) {
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
            } else if (type == 4) {
                byteArrayOutputStream.write(type == 1 ? 0 : 4);
                byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
                String title2 = modeExt.getTitle();
                String message2 = modeExt.getMessage();
                String appName2 = modeExt.getAppName();
                if (modeExt.isAlertMaxLength()) {
                    i2 = 1000;
                } else {
                    i2 = 400;
                }
                phoneNo = modeExt.getPhoneNo();
                hMAlertMode = HMAlertMode.ALERT_INCALL;
                if (mode == hMAlertMode) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    if (phoneNo != null) {
                        length = phoneNo.length();
                    } else {
                        length = 1;
                    }
                    i2 -= length;
                }
                bArrB = b(title2, message2, appName2, 2, i2);
                if (mode == HMAlertMode.ALERT_THIRD_APP) {
                    byteArrayOutputStream.write(modeExt.getAlertApp().getValue());
                }
                if (bArrB != null) {
                    byteArrayOutputStream.write(bArrB, 0, bArrB.length);
                }
                if (z) {
                    if (phoneNo != null) {
                        h(byteArrayOutputStream, phoneNo);
                    }
                    byteArrayOutputStream.write(0);
                }
                if (mode == hMAlertMode) {
                    byteArrayOutputStream.write(modeExt.isSupportHangUp() ? 2 : 1);
                }
            }
        } else {
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Debug.i(f, "getAlertCmdNew:" + GattUtils.bytesToHexString(byteArray) + ",len:" + byteArray.length);
        return byteArray;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        UUID uuid = u;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(f, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = v;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.b = characteristic;
        if (characteristic == null) {
            Debug.fi(f, uuid2 + " is null!!!");
            return false;
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(GattUtils.UUID_DESCRIPTOR_CHARACTERISTIC_USER_CONFIGURATION);
        if (t == null && descriptor != null) {
            byte[] bArr = read(descriptor);
            Debug.fi(f, "descriptor value:" + GattUtils.bytesToHexString(bArr));
            if (bArr != null && bArr.length > 0) {
                String str = new String(bArr, Charset.defaultCharset());
                Debug.fi(f, "descriptor string:" + str);
                t = new AtomicBoolean(s.equals(str));
            }
        }
        this.c = service.getCharacteristic(w);
        return true;
    }

    public synchronized boolean isAlterMaxLength() {
        GattPeripheral peripheral;
        peripheral = getPeripheral();
        return peripheral != null && peripheral.getPieceProfileVersion() >= 4;
    }

    public boolean pair() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.c;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-127});
    }

    public boolean setBtPhoneDelay(byte delay) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.c;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{x, delay});
    }

    public synchronized void updateVersion() {
        if (this.d == -1) {
            this.d = e();
            Debug.fi(f, "update ans version, version: " + this.d);
            this.e.set(this.d != -1);
        }
    }
}
