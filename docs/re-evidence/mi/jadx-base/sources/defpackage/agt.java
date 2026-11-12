package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class agt extends a6t implements zh.b {
    public static final UUID n = tet.C(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f1005b;
    public final byte c;
    public final byte d;
    public final byte e;
    public final byte f;
    public final byte g;
    public BluetoothGattCharacteristic h;
    public byte[] i;
    public byte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f1006k;
    public byte l;
    public Feature m;

    public agt(jet jetVar) {
        super(jetVar);
        this.f1005b = (byte) 1;
        this.c = (byte) 2;
        this.d = (byte) 3;
        this.e = (byte) 4;
        this.f = (byte) 5;
        this.g = (byte) 6;
        this.h = null;
        this.i = null;
        this.j = wbt.h;
        this.f1006k = null;
        this.l = (byte) 0;
        this.m = null;
    }

    public static byte[] d(String str, byte[] bArr) {
        if (!BluetoothAdapter.checkBluetoothAddress(str) || bArr == null || bArr.length == 0) {
            return null;
        }
        String[] strArrSplit = str.split(":");
        byte[] bArr2 = new byte[strArrSplit.length + bArr.length];
        int i = 0;
        while (i < strArrSplit.length) {
            bArr2[i] = Integer.decode("0x" + strArrSplit[i]).byteValue();
            i++;
        }
        System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        return bArr2;
    }

    public static byte[] s(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e) {
            t5t.d(a6t.TAG, "sha256 Exception:" + e.getMessage());
            return null;
        }
    }

    public AuthResult a(String str) {
        t5t.d(a6t.TAG, "auth:" + str);
        byte[] bArrR = r();
        this.f1006k = bArrR;
        t5t.m(a6t.TAG, "random:" + tet.x(bArrR));
        if (bArrR == null || bArrR.length != 16) {
            t5t.d(a6t.TAG, "wrong data from device!!!");
            return new AuthResult(0, y.REQUEST_RANDOM_FAIL);
        }
        byte[] bArrMd5 = md5(str);
        t5t.m(a6t.TAG, "key:" + tet.x(bArrMd5));
        if (bArrMd5 == null || bArrMd5.length != 16) {
            t5t.d(a6t.TAG, "wrong key!!!");
            return new AuthResult(0, y.MD5_FAIL);
        }
        byte[] bArrEncrypt = encrypt(bArrR, bArrMd5);
        t5t.m(a6t.TAG, "encrypt:" + tet.x(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return k(bArrEncrypt);
        }
        t5t.d(a6t.TAG, "wrong chip from local encrypt!!!");
        return new AuthResult(0, y.ENCRYPT_FAIL);
    }

    public AuthResult b(byte[] bArr, byte[] bArr2) {
        qe qeVarG;
        this.i = null;
        byte[] bArr3 = new byte[bArr.length + bArr2.length + 2];
        bArr3[0] = -125;
        bArr3[1] = this.j;
        System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 2, bArr2.length);
        if (!patchWrite(bArr3, 4)) {
            t5t.d(a6t.TAG, "AUTH patchWrite failed!!!");
            return new AuthResult(2, y.VERIFY_SIGNATURE_FAIL);
        }
        if (this.i == null) {
            waiting(this.h, 15000);
        }
        byte[] bArr4 = this.i;
        if (bArr4 != null && (qeVarG = qe.g(bArr4)) != null) {
            if (!qeVarG.d(bArr3[0])) {
                return new AuthResult(2, new mp(qeVarG.f()));
            }
            this.i = null;
            return new AuthResult(1, rm.u);
        }
        return new AuthResult(2, y.VERIFY_SIGNATURE_FAIL);
    }

    public void c(Feature feature) {
        this.m = feature;
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.h;
        return bluetoothGattCharacteristic == null || unregisterNotification(bluetoothGattCharacteristic);
    }

    @Override // zh.b
    public void e(byte[] bArr) {
        t5t.d(a6t.TAG, "notify:" + tet.x(bArr));
        this.i = bArr;
        watingNotify(this.h);
    }

    public AuthResult f(String str) {
        t5t.d(a6t.TAG, "pairWithNoResponse:" + str);
        byte[] bArrMd5 = md5(str);
        if (bArrMd5 == null || bArrMd5.length != 16) {
            t5t.d(a6t.TAG, "wrong key!!!");
            return new AuthResult(0, y.KEY_ERROR);
        }
        this.i = null;
        return o(bArrMd5);
    }

    public void g(byte b2) {
        this.j = b2;
    }

    public void h(byte b2) {
        this.l = b2;
    }

    public boolean i(String str) {
        t5t.d(a6t.TAG, "unbind:" + str);
        byte[] bArrR = r();
        this.f1006k = bArrR;
        t5t.m(a6t.TAG, "random:" + tet.x(bArrR));
        if (bArrR == null || bArrR.length != 16) {
            t5t.d(a6t.TAG, "wrong data from device!!!");
            return false;
        }
        byte[] bArrY = this.l == -128 ? tet.y(str) : md5(str);
        t5t.m(a6t.TAG, "key:" + tet.x(bArrY));
        if (bArrY == null || bArrY.length != 16) {
            t5t.d(a6t.TAG, "wrong key!!!");
            return false;
        }
        byte[] bArrEncrypt = encrypt(bArrR, bArrY);
        t5t.m(a6t.TAG, "encrypt:" + tet.x(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return q(bArrEncrypt);
        }
        t5t.d(a6t.TAG, "wrong chip from local encrypt!!!");
        return false;
    }

    @Override // defpackage.a6t
    public boolean init() {
        UUID uuid = a6t.UUID_SERVICE_MILI_SECONDARY_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            service = getService(a6t.UUID_SERVICE_MILI_SERVICE);
        }
        if (service == null) {
            t5t.d(a6t.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = n;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.h = characteristic;
        if (characteristic != null) {
            if (registerNotification(characteristic, this)) {
                return true;
            }
            t5t.d(a6t.TAG, "registerNotification m_CharAuth failed!!!");
            return false;
        }
        t5t.d(a6t.TAG, uuid2 + " is null!!!");
        return false;
    }

    public AuthResult j(byte[] bArr) {
        t5t.d(a6t.TAG, "auth:" + tet.x(bArr));
        byte[] bArrR = r();
        this.f1006k = bArrR;
        t5t.m(a6t.TAG, "random:" + tet.x(bArrR));
        if (bArrR == null || bArrR.length != 16) {
            t5t.d(a6t.TAG, "wrong data from device!!!");
            return new AuthResult(0, y.REQUEST_RANDOM_FAIL);
        }
        byte[] bArrEncrypt = encrypt(bArrR, bArr);
        t5t.m(a6t.TAG, "encrypt:" + tet.x(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return k(bArrEncrypt);
        }
        t5t.d(a6t.TAG, "wrong chip from local encrypt!!!");
        return new AuthResult(0, y.ENCRYPT_FAIL);
    }

    public final AuthResult k(byte[] bArr) {
        byte[] bArr2 = new byte[18];
        bArr2[0] = (byte) (this.l | 3);
        bArr2[1] = this.j;
        System.arraycopy(bArr, 0, bArr2, 2, 16);
        qe qeVarL = l(bArr2);
        if (qeVarL == null) {
            return new AuthResult(0, y.AUTHORIZE_FAIL);
        }
        byte bF = qeVarL.f();
        return bF == 1 ? new AuthResult(1, rm.u) : new AuthResult(bF, new mp(bF));
    }

    public final qe l(byte[] bArr) {
        t5t.d(a6t.TAG, "sendChipCommand: " + tet.x(bArr));
        this.i = null;
        if (!write(this.h, bArr)) {
            t5t.d(a6t.TAG, "write cmd failed!!!");
            return null;
        }
        if (this.i == null) {
            waiting(this.h, 30000);
        }
        byte[] bArr2 = this.i;
        if (bArr2 == null || bArr2.length < 3) {
            return null;
        }
        return qe.g(bArr2);
    }

    public final qe m(byte[] bArr) {
        t5t.d(a6t.TAG, "sendCommand:" + tet.x(bArr));
        this.i = null;
        if (!write(this.h, bArr)) {
            t5t.d(a6t.TAG, "write cmd failed!!!");
            return null;
        }
        if (this.i == null) {
            waiting(this.h, 30000);
        }
        return qe.g(this.i);
    }

    public final boolean n(byte[] bArr) {
        t5t.d(a6t.TAG, "sendCommandWithNoResponse:" + tet.x(bArr));
        boolean zWrite = write(this.h, bArr);
        t5t.d(a6t.TAG, "write cmd ret:" + zWrite);
        return zWrite;
    }

    public final AuthResult o(byte[] bArr) {
        t5t.m(a6t.TAG, "key:" + tet.x(bArr));
        if (bArr == null || bArr.length != 16) {
            return new AuthResult(0, y.KEY_ERROR);
        }
        byte[] bArr2 = new byte[18];
        bArr2[0] = 1;
        bArr2[1] = this.j;
        System.arraycopy(bArr, 0, bArr2, 2, 16);
        this.i = null;
        return n(bArr2) ? new AuthResult(1, rm.u) : new AuthResult(0, y.SEND_NO_RESPONSE_KEY_FAIL);
    }

    public ydt p() {
        byte[] bArrJ;
        qe qeVarM = m(new byte[]{1, this.j});
        if (qeVarM == null || (bArrJ = qeVarM.j()) == null || bArrJ.length < 4 || bArrJ[0] != 16 || (bArrJ[1] & 255) != 1 || bArrJ[2] != -127) {
            return null;
        }
        ydt ydtVar = new ydt();
        if (bArrJ.length == 4) {
            ydtVar.d(bArrJ[3] & 255);
        } else if (bArrJ.length == 20) {
            ydtVar.d(bArrJ[3] & 15);
            ydtVar.b((bArrJ[3] >> 4) & 15);
            byte[] bArr = new byte[16];
            System.arraycopy(bArrJ, 4, bArr, 0, 16);
            ydtVar.c(bArr);
        }
        return ydtVar;
    }

    public final boolean q(byte[] bArr) {
        byte[] bArr2 = new byte[18];
        bArr2[0] = 6;
        bArr2[1] = this.j;
        System.arraycopy(bArr, 0, bArr2, 2, 16);
        qe qeVarM = m(bArr2);
        return qeVarM != null && qeVarM.d((byte) 6);
    }

    public byte[] r() {
        byte[] bArr;
        byte b2 = (byte) (this.l | 2);
        Feature feature = this.m;
        if (feature == null || !feature.hasBase(2)) {
            bArr = new byte[]{b2, this.j, 2};
        } else {
            int i = wbt.g;
            bArr = new byte[]{b2, this.j, 2, (byte) (i & 255), (byte) ((i >> 8) & 255)};
        }
        qe qeVarM = m(bArr);
        if (qeVarM != null && qeVarM.d(b2)) {
            return qeVarM.i();
        }
        qe qeVarM2 = m(new byte[]{b2, this.j});
        if (qeVarM2 == null || !qeVarM2.d(b2)) {
            return null;
        }
        return qeVarM2.i();
    }

    public byte[] t() {
        return this.f1006k;
    }

    public AuthResult u() {
        if (this.i == null) {
            waiting(this.h, 30000);
        }
        qe qeVarG = qe.g(this.i);
        if (qeVarG == null || qeVarG.a() != 1) {
            return new AuthResult(3, y.VERIFY_NOT_RESPONSE);
        }
        byte bF = qeVarG.f();
        return bF == 1 ? new AuthResult(1, rm.u) : new AuthResult(bF, new mp(bF));
    }
}
