package defpackage;

import com.nimbusds.jose.JOSEException;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class wee {
    public static k0 a(SecretKey secretKey, boolean z) {
        k0 k0Var = new k0();
        k0Var.a(z, new c0e(secretKey.getEncoded()));
        return k0Var;
    }

    public static qua b(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        qua quaVar = new qua(a(secretKey, z));
        quaVar.i(z, new c0(new c0e(secretKey.getEncoded()), 128, bArr, bArr2));
        return quaVar;
    }

    public static xq1 c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws JOSEException {
        qua quaVarB = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[quaVarB.h(bArr2.length)];
        int iM = quaVarB.m(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int iB = (iM + quaVarB.b(bArr4, iM)) - 16;
            byte[] bArr5 = new byte[iB];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, iB);
            System.arraycopy(bArr4, iB, bArr6, 0, 16);
            return new xq1(bArr5, bArr6);
        } catch (InvalidCipherTextException e) {
            throw new JOSEException("Couldn't generate GCM authentication tag: " + e.getMessage(), e);
        }
    }
}
