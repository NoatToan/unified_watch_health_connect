package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class tzs extends a6t {
    public static AtomicBoolean f;
    public static final UUID g = tet.F("1811");
    public static final UUID h = tet.F("2A46");
    public static final UUID i = tet.F("2A44");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGattCharacteristic f35231b;
    public BluetoothGattCharacteristic c;
    public int d;
    public final AtomicBoolean e;

    public tzs(jet jetVar) {
        super(jetVar);
        this.f35231b = null;
        this.c = null;
        this.d = 0;
        this.e = new AtomicBoolean(false);
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        b(byteArrayOutputStream, str, Charset.defaultCharset());
    }

    public static void b(ByteArrayOutputStream byteArrayOutputStream, String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        byteArrayOutputStream.write(bytes, 0, bytes.length);
    }

    public static byte[] d(ivs ivsVar, int i2) {
        byte[] bArrG;
        if (ivsVar.k() == 3 || ivsVar.k() == 2 || ivsVar.k() == 4) {
            return null;
        }
        fd fdVarH = ivsVar.h();
        String strJ = ivsVar.j();
        String strG = ivsVar.g();
        String strE = ivsVar.e();
        if (i2 != 0) {
            bArrG = i(strJ, strG, strE, i2, ivsVar.m());
        } else {
            bArrG = g(strJ, 20 - (fdVarH != fd.ALERT_THIRD_APP ? 2 : 3));
        }
        int length = bArrG == null ? 0 : bArrG.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(fdVarH.a());
        byteArrayOutputStream.write(ivsVar.k());
        if (fdVarH == fd.ALERT_THIRD_APP) {
            byteArrayOutputStream.write(ivsVar.a().getValue());
        }
        if (length > 0) {
            byteArrayOutputStream.write(bArrG, 0, length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        t5t.m("HMAlertServiceProfile", "getAlertCmd:" + tet.x(byteArray) + ",len:" + byteArray.length);
        return byteArray;
    }

    public static byte[] g(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strCutString = ProfileUtils.cutString(str, i2);
        if (TextUtils.isEmpty(strCutString)) {
            return null;
        }
        return strCutString.getBytes(Charset.defaultCharset());
    }

    public static byte[] h(String str, String str2, String str3, int i2, int i3) {
        int length = TextUtils.isEmpty(str3) ? 0 : str3.getBytes(Charset.defaultCharset()).length;
        if (length > 30) {
            length = 30;
        }
        if (i2 != 2) {
            i3 = 240;
        }
        int i4 = i3 - length;
        int length2 = TextUtils.isEmpty(str) ? 0 : str.getBytes(Charset.defaultCharset()).length;
        if (length2 <= i4) {
            i4 = length2;
        }
        int i5 = i3 - i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!TextUtils.isEmpty(str)) {
            String strCutString = ProfileUtils.cutString(str, i4);
            if (!TextUtils.isEmpty(strCutString)) {
                byteArrayOutputStream.write(strCutString.getBytes(Charset.defaultCharset()), 0, strCutString.getBytes(Charset.defaultCharset()).length);
            }
        }
        byteArrayOutputStream.write(0);
        if (!TextUtils.isEmpty(str2)) {
            int length3 = str2.getBytes(Charset.defaultCharset()).length;
            boolean z = length3 > i5;
            if (z) {
                length3 = i5 - "...".getBytes().length;
            }
            String strCutString2 = ProfileUtils.cutString(str2, length3);
            if (!TextUtils.isEmpty(strCutString2)) {
                if (z) {
                    strCutString2 = strCutString2 + "...";
                }
                byteArrayOutputStream.write(strCutString2.getBytes(Charset.defaultCharset()), 0, strCutString2.getBytes(Charset.defaultCharset()).length);
            }
        }
        byteArrayOutputStream.write(0);
        if (!TextUtils.isEmpty(str3)) {
            String strCutString3 = ProfileUtils.cutString(str3, length);
            t5t.m("HMAlertServiceProfile", "cutAppName:" + strCutString3);
            if (!TextUtils.isEmpty(strCutString3)) {
                byteArrayOutputStream.write(strCutString3.getBytes(Charset.defaultCharset()), 0, strCutString3.getBytes(Charset.defaultCharset()).length);
            }
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] i(String str, String str2, String str3, int i2, boolean z) {
        return h(str, str2, str3, i2, z ? 1000 : 400);
    }

    public boolean c(ivs ivsVar) {
        if (this.f35231b == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = f;
        byte[] bArrD = d(ivsVar, (atomicBoolean == null || !atomicBoolean.get()) ? 0 : 1);
        return bArrD != null && bArrD.length > 0 && write(this.f35231b, bArrD);
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return true;
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
    public byte[] f(ivs ivsVar, boolean z) {
        int i2;
        String strI;
        fd fdVar;
        boolean z2;
        byte[] bArrH;
        int length;
        fd fdVarH = ivsVar.h();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(fdVarH.a());
        byte[] bArrP = tet.p(ivsVar.f());
        byte bK = ivsVar.k();
        if (bK != 0) {
            if (bK == 1) {
                byteArrayOutputStream.write(bK == 1 ? 0 : 4);
                byteArrayOutputStream.write(bArrP, 0, bArrP.length);
                String strJ = ivsVar.j();
                String strG = ivsVar.g();
                String strE = ivsVar.e();
                if (ivsVar.m()) {
                    i2 = 1000;
                } else {
                    i2 = 400;
                }
                strI = ivsVar.i();
                fdVar = fd.ALERT_INCALL;
                if (fdVarH == fdVar || !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (strI != null) {
                        length = strI.length();
                    } else {
                        length = 1;
                    }
                    i2 -= length;
                }
                bArrH = h(strJ, strG, strE, 2, i2);
                if (fdVarH == fd.ALERT_THIRD_APP) {
                    byteArrayOutputStream.write(ivsVar.a().getValue());
                }
                if (bArrH != null) {
                    byteArrayOutputStream.write(bArrH, 0, bArrH.length);
                }
                if (z2) {
                    if (strI != null) {
                        a(byteArrayOutputStream, strI);
                    }
                    byteArrayOutputStream.write(0);
                }
                if (fdVarH == fdVar && this.d >= 6) {
                    byteArrayOutputStream.write(ivsVar.n() ? 2 : 1);
                }
            } else if (bK == 2) {
                byteArrayOutputStream.write(2);
                byteArrayOutputStream.write(bArrP, 0, bArrP.length);
            } else if (bK == 3) {
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(bArrP, 0, bArrP.length);
            } else if (bK == 4) {
                byteArrayOutputStream.write(bK == 1 ? 0 : 4);
                byteArrayOutputStream.write(bArrP, 0, bArrP.length);
                String strJ2 = ivsVar.j();
                String strG2 = ivsVar.g();
                String strE2 = ivsVar.e();
                if (ivsVar.m()) {
                    i2 = 1000;
                } else {
                    i2 = 400;
                }
                strI = ivsVar.i();
                fdVar = fd.ALERT_INCALL;
                if (fdVarH == fdVar) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (strI != null) {
                        length = strI.length();
                    } else {
                        length = 1;
                    }
                    i2 -= length;
                }
                bArrH = h(strJ2, strG2, strE2, 2, i2);
                if (fdVarH == fd.ALERT_THIRD_APP) {
                    byteArrayOutputStream.write(ivsVar.a().getValue());
                }
                if (bArrH != null) {
                    byteArrayOutputStream.write(bArrH, 0, bArrH.length);
                }
                if (z2) {
                    if (strI != null) {
                        a(byteArrayOutputStream, strI);
                    }
                    byteArrayOutputStream.write(0);
                }
                if (fdVarH == fdVar) {
                    byteArrayOutputStream.write(ivsVar.n() ? 2 : 1);
                }
            }
        } else {
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(bArrP, 0, bArrP.length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        t5t.m("HMAlertServiceProfile", "getAlertCmdNew:" + tet.x(byteArray) + ",len:" + byteArray.length);
        return byteArray;
    }

    @Override // defpackage.a6t
    public boolean init() {
        UUID uuid = g;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d("HMAlertServiceProfile", uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = h;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f35231b = characteristic;
        if (characteristic == null) {
            t5t.d("HMAlertServiceProfile", uuid2 + " is null!!!");
            return false;
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(tet.f34632b);
        if (f == null && descriptor != null) {
            byte[] bArr = read(descriptor);
            t5t.d("HMAlertServiceProfile", "descriptor value:" + tet.x(bArr));
            if (bArr != null && bArr.length > 0) {
                String str = new String(bArr, Charset.defaultCharset());
                t5t.d("HMAlertServiceProfile", "descriptor string:" + str);
                f = new AtomicBoolean("Long Value".equals(str));
            }
        }
        this.c = service.getCharacteristic(i);
        return true;
    }

    public synchronized boolean m() {
        jet peripheral;
        peripheral = getPeripheral();
        return peripheral != null && peripheral.z0() >= 4;
    }

    public final int n() {
        UUID uuid = g;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d("HMAlertServiceProfile", uuid + " is null!!!");
            return -1;
        }
        UUID uuid2 = h;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            t5t.d("HMAlertServiceProfile", uuid2 + " is null!!!");
            return -1;
        }
        if ((characteristic.getProperties() & 2) != 0) {
            byte[] bArr = read(characteristic);
            t5t.d("HMAlertServiceProfile", "alert data:" + tet.x(bArr));
            if (bArr == null || bArr.length < 1) {
                return 0;
            }
            return bArr[0] & 255;
        }
        t5t.d("HMAlertServiceProfile", uuid2 + " no read property");
        qe qeVarSendCommandWithResponse = sendCommandWithResponse(service.getCharacteristic(i), new byte[]{2});
        if (qeVarSendCommandWithResponse == null || qeVarSendCommandWithResponse.i() == null) {
            return 0;
        }
        return qeVarSendCommandWithResponse.i()[0] & 255;
    }

    public boolean o() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.c;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-127});
    }

    public void p() {
        t5t.d("HMAlertServiceProfile", "resetVersion");
        this.d = -1;
        this.e.set(false);
    }

    public synchronized void q() {
        if (this.d == -1) {
            this.d = n();
            t5t.d("HMAlertServiceProfile", "update ans version, version: " + this.d);
            this.e.set(this.d != -1);
        }
    }

    public synchronized boolean r() {
        try {
            t5t.d("HMAlertServiceProfile", "ANS version now: " + this.d + "； and has refreshed: " + this.e.get());
            if (this.d == -1 && this.e.compareAndSet(false, true)) {
                this.d = n();
            }
            t5t.d("HMAlertServiceProfile", "ANS version refresh: " + this.d);
        } catch (Throwable th) {
            throw th;
        }
        return this.d >= 5;
    }
}
