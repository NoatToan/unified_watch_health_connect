package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.IntegerOverflowException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class od5 extends jh4 {
    public static void b(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            if (encryptionMethod.cekBitLength() == y73.e(secretKey.getEncoded())) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + encryptionMethod + " must be " + encryptionMethod.cekBitLength() + " bits");
        } catch (IntegerOverflowException e) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    public static eqd c(JWEHeader jWEHeader, byte[] bArr, SecretKey secretKey, Base64URL base64URL, hqd hqdVar, byte[] bArr2) throws JOSEException {
        xq1 xq1VarC;
        byte[] bArrE;
        b(secretKey, jWEHeader.getEncryptionMethod());
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            byte[] bArrE2 = g0.e(hqdVar.b());
            xq1VarC = g0.c(secretKey, bArrE2, bArr, bArr2, hqdVar.c(), hqdVar.e());
            bArrE = bArrE2;
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            ch4 ch4Var = new ch4(q0.d(hqdVar.b()));
            xq1VarC = q0.c(secretKey, ch4Var, bArr, bArr2, hqdVar.c());
            bArrE = (byte[]) ch4Var.a();
        } else {
            if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                throw new JOSEException(x51.b(jWEHeader.getEncryptionMethod(), jh4.f22794a));
            }
            bArrE = g0.e(hqdVar.b());
            xq1VarC = g0.d(jWEHeader, secretKey, base64URL, bArrE, bArr, hqdVar.c(), hqdVar.e());
        }
        return new eqd(jWEHeader, base64URL, Base64URL.encode(bArrE), Base64URL.encode(xq1VarC.b()), Base64URL.encode(xq1VarC.a()));
    }
}
