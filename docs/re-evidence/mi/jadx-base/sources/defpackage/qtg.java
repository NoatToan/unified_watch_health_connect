package defpackage;

import com.xiaomi.mi_connect.nfc.exception.NfcParseDeviceRecordException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class qtg implements uuc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f31829b;
    public byte c;
    public Map<Short, byte[]> d;

    public qtg(short s, byte b2, byte b3, Map<Short, byte[]> map) {
        this.d = map;
        this.f31829b = b3;
        this.c = b2;
        this.f31828a = s;
    }

    public static qtg b(byte[] bArr) throws NfcParseDeviceRecordException {
        int i = 4;
        if (bArr.length < 4) {
            throw new NfcParseDeviceRecordException("invalidate record data");
        }
        short sA = fbm.a(bArr);
        if (sA <= 0 || sA >= 8) {
            throw new NfcParseDeviceRecordException("invalidate device type");
        }
        byte b2 = bArr[2];
        byte b3 = bArr[3];
        HashMap map = 4 < bArr.length + (-1) ? new HashMap() : null;
        while (i < bArr.length) {
            try {
                short sB = fbm.b(bArr, i);
                if (sB >= 19 || sB <= 0) {
                    throw new NfcParseDeviceRecordException("invalidated attribute type");
                }
                int iB = fbm.b(bArr, i + 2);
                if (iB <= 0) {
                    throw new NfcParseDeviceRecordException("invalidate attribute length");
                }
                int i2 = i + 4;
                byte[] bArr2 = new byte[iB];
                System.arraycopy(bArr, i2, bArr2, 0, iB);
                i = i2 + iB;
                if (sB == 13) {
                    byte[] bytes = "mxD".getBytes();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bytes.length) {
                            int length = bytes.length;
                            while (length < iB) {
                                short sB2 = fbm.b(bArr2, length);
                                int iB2 = fbm.b(bArr2, length + 2);
                                int i4 = length + 4;
                                byte[] bArr3 = new byte[iB2];
                                System.arraycopy(bArr2, i4, bArr3, 0, iB2);
                                length = i4 + iB2;
                                map.put(Short.valueOf(sB2), bArr3);
                            }
                            break;
                        }
                        if (bArr2[i3] != bytes[i3]) {
                            break;
                        }
                        i3++;
                    }
                }
                map.put(Short.valueOf(sB), bArr2);
            } catch (IndexOutOfBoundsException unused) {
                throw new NfcParseDeviceRecordException("index out of bounds");
            }
        }
        return new qtg(sA, b3, b2, map);
    }

    @Override // defpackage.uuc
    public <T extends uuc> T a(Class<T> cls) {
        if (cls.equals(qtg.class)) {
            return this;
        }
        return null;
    }

    public Map<Short, byte[]> c() {
        return this.d;
    }
}
