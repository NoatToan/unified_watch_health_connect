package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class qs5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uak f31794a = new uak(cya.l);

    public final void a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f31794a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public ts5 b(cp2 cp2Var, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException e;
        ep2 ep2Var = new ep2(cp2Var);
        FormatException formatException = null;
        try {
            return c(ep2Var, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                ep2Var.f();
                ep2Var.g(true);
                ep2Var.e();
                ep2Var.d();
                ep2Var.b();
                ts5 ts5VarC = c(ep2Var, map);
                ts5VarC.m(new jfi(true));
                return ts5VarC;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            ep2Var.f();
            ep2Var.g(true);
            ep2Var.e();
            ep2Var.d();
            ep2Var.b();
            ts5 ts5VarC2 = c(ep2Var, map);
            ts5VarC2.m(new jfi(true));
            return ts5VarC2;
        }
    }

    public final ts5 c(ep2 ep2Var, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        bpq bpqVarE = ep2Var.e();
        ErrorCorrectionLevel errorCorrectionLevelD = ep2Var.d().d();
        tk5[] tk5VarArrB = tk5.b(ep2Var.c(), bpqVarE, errorCorrectionLevelD);
        int iC = 0;
        for (tk5 tk5Var : tk5VarArrB) {
            iC += tk5Var.c();
        }
        byte[] bArr = new byte[iC];
        int i = 0;
        for (tk5 tk5Var2 : tk5VarArrB) {
            byte[] bArrA = tk5Var2.a();
            int iC2 = tk5Var2.c();
            a(bArrA, iC2);
            int i2 = 0;
            while (i2 < iC2) {
                bArr[i] = bArrA[i2];
                i2++;
                i++;
            }
        }
        return is5.a(bArr, bpqVarE, errorCorrectionLevelD, map);
    }
}
