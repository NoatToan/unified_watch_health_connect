package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes5.dex */
public final class os5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uak f29645a = new uak(cya.m);

    public final void a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f29645a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public ts5 b(cp2 cp2Var) throws ChecksumException, FormatException {
        fp2 fp2Var = new fp2(cp2Var);
        uk5[] uk5VarArrB = uk5.b(fp2Var.c(), fp2Var.b());
        int iC = 0;
        for (uk5 uk5Var : uk5VarArrB) {
            iC += uk5Var.c();
        }
        byte[] bArr = new byte[iC];
        int length = uk5VarArrB.length;
        for (int i = 0; i < length; i++) {
            uk5 uk5Var2 = uk5VarArrB[i];
            byte[] bArrA = uk5Var2.a();
            int iC2 = uk5Var2.c();
            a(bArrA, iC2);
            for (int i2 = 0; i2 < iC2; i2++) {
                bArr[(i2 * length) + i] = bArrA[i2];
            }
        }
        return fs5.a(bArr);
    }
}
