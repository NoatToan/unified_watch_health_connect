package com.garmin.device.nfc;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import pl2.o;

/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50907a;

    public enum a {
        GARMIN_DEVICE(0),
        COMPANION_APPLICATION(1),
        NONE(2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final SparseArray<a> f50911e = new SparseArray<>(values().length);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50913a;

        static {
            for (a aVar : values()) {
                f50911e.put(aVar.f50913a, aVar);
            }
        }

        a(int i14) {
            this.f50913a = i14;
        }
    }

    private i(int i14, byte[] bArr) {
        byte[] bArrC = o.c(i14);
        int length = bArr == null ? 0 : bArr.length;
        byte[] bArrC2 = o.c(length);
        byte[] bArr2 = new byte[bArrC.length + 1 + bArrC2.length + length + 1];
        this.f50907a = bArr2;
        System.arraycopy(bArrC, 0, bArr2, 1, bArrC.length);
        int length2 = bArrC.length + 1;
        System.arraycopy(bArrC2, 0, bArr2, length2, bArrC2.length);
        int length3 = length2 + bArrC2.length;
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, length3, bArr.length);
        }
    }

    public final byte[] a() {
        int i14 = 0;
        byte b14 = 0;
        while (true) {
            byte[] bArr = this.f50907a;
            if (i14 >= bArr.length - 1) {
                bArr[bArr.length - 1] = b14;
                return bArr;
            }
            b14 = (byte) (b14 ^ bArr[i14]);
            i14++;
        }
    }

    public final int b() {
        return o.b(1, this.f50907a);
    }

    public final int c() {
        byte[] bArr = this.f50907a;
        if (bArr == null) {
            return -1;
        }
        return bArr[0] & Ascii.DEL;
    }

    public final byte[] d() {
        int iB;
        byte[] bArr = this.f50907a;
        int iA = o.a(o.a(1, bArr) + 1, bArr);
        int iA2 = o.a(1, bArr) + 1;
        if (iA == 1) {
            iB = bArr[iA2];
        } else {
            iB = iA > 1 ? o.b(iA2, bArr) : 0;
        }
        if (iB <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[iB];
        System.arraycopy(bArr, o.a(o.a(1, bArr) + 1, bArr) + o.a(1, bArr) + 1, bArr2, 0, iB);
        return bArr2;
    }

    public final void e(int i14, a aVar) {
        if (i14 < 0 || i14 > 127) {
            return;
        }
        byte b14 = (byte) i14;
        byte[] bArr = this.f50907a;
        bArr[0] = b14;
        if (aVar == a.COMPANION_APPLICATION) {
            bArr[0] = (byte) (b14 | UnsignedBytes.MAX_POWER_OF_TWO);
        } else if (aVar == a.GARMIN_DEVICE) {
            bArr[0] = (byte) (b14 & Ascii.DEL);
        }
    }

    public final a f() {
        a aVar = a.NONE;
        byte[] bArr = this.f50907a;
        if (bArr == null || bArr.length <= 0) {
            return aVar;
        }
        return (bArr[0] & UnsignedBytes.MAX_POWER_OF_TWO) == 128 ? a.COMPANION_APPLICATION : a.GARMIN_DEVICE;
    }

    public final String toString() {
        String string = "NfcTransportMessage {\n  source=" + f() + "\n  txnId =" + c() + "\n  msgId =" + b();
        if (b() == NfcCommandHandler.b.APDU_TRANSFER_STATUS_NOTIFICATION.f50819a) {
            StringBuilder sbI = sn.a.i(string, "\n  apdu transfer status = ");
            sbI.append(d()[0] == 1 ? "available" : "unavailable");
            string = sbI.toString();
        }
        StringBuilder sbI2 = sn.a.i(string, "\n  ");
        sbI2.append(j.a(a()));
        return sbI2.toString().concat("\n}");
    }

    public i(NfcCommandHandler.b bVar) {
        this(bVar, (byte[]) null);
    }

    public i(NfcCommandHandler.b bVar, byte b14) {
        this(bVar, new byte[]{b14});
    }

    public i(byte[] bArr) {
        this.f50907a = bArr;
    }

    public i(NfcCommandHandler.b bVar, byte[] bArr) {
        this((byte) bVar.f50819a, bArr);
    }
}
