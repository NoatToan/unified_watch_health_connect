package defpackage;

import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes20.dex */
public class aabn extends zzg {
    public aabn() {
        this(e());
    }

    public aabn(byte[] bArr) {
        super(bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Random bytes array's length must be 32");
        }
    }

    public String e(int i) {
        StringBuilder sb = new StringBuilder();
        byte[] bArrD = d();
        Date date = new Date(((long) (((bArrD[0] & 255) << 24) | ((bArrD[1] & 255) << 16) | ((bArrD[2] & 255) << 8) | (bArrD[3] & 255))) * 1000);
        String strD = zzp.d(i);
        sb.append(strD);
        sb.append("GMT Unix Time: ");
        sb.append(date);
        sb.append(zzp.c());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrD, 4, 32);
        sb.append(strD);
        sb.append("Random Bytes: ");
        sb.append(zzp.b(bArrCopyOfRange));
        sb.append(zzp.c());
        return sb.toString();
    }

    @Override // defpackage.zzg
    public String toString() {
        return e(0);
    }

    public static byte[] e() {
        byte[] bArrE = zzg.e(aacj.b(), 32);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArrE[0] = (byte) (iCurrentTimeMillis >> 24);
        bArrE[1] = (byte) (iCurrentTimeMillis >> 16);
        bArrE[2] = (byte) (iCurrentTimeMillis >> 8);
        bArrE[3] = (byte) iCurrentTimeMillis;
        return bArrE;
    }
}
