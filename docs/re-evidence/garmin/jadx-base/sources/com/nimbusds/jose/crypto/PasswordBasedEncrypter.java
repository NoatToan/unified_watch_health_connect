package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.AESKW;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.JWEHeaderValidation;
import com.nimbusds.jose.crypto.impl.PBKDF2;
import com.nimbusds.jose.crypto.impl.PRFParams;
import com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.util.Arrays;
import javax.crypto.SecretKey;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class PasswordBasedEncrypter extends PasswordBasedCryptoProvider implements JWEEncrypter {
    public static final int MIN_RECOMMENDED_ITERATION_COUNT = 1000;
    public static final int MIN_SALT_LENGTH = 8;
    private final int iterationCount;
    private final int saltLength;

    public PasswordBasedEncrypter(byte[] bArr, int i14, int i15) {
        super(bArr);
        if (i14 < 8) {
            h.s("The minimum salt length (p2s) is 8 bytes");
            throw null;
        }
        this.saltLength = i14;
        if (i15 >= 1000) {
            this.iterationCount = i15;
        } else {
            h.s("The minimum recommended iteration count (p2c) is 1000");
            throw null;
        }
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws JOSEException {
        JWEAlgorithm algorithmAndEnsureNotNull = JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        byte[] bArr3 = new byte[this.saltLength];
        getJCAContext().getSecureRandom().nextBytes(bArr3);
        SecretKey secretKeyDeriveKey = PBKDF2.deriveKey(getPassword(), PBKDF2.formatSalt(algorithmAndEnsureNotNull, bArr3), this.iterationCount, PRFParams.resolve(algorithmAndEnsureNotNull, getJCAContext().getMACProvider()), getJCAContext().getProvider());
        JWEHeader jWEHeaderBuild = new JWEHeader.Builder(jWEHeader).pbes2Salt(Base64URL.encode(bArr3)).pbes2Count(this.iterationCount).build();
        SecretKey secretKeyGenerateCEK = ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
        Base64URL base64URLEncode = Base64URL.encode(AESKW.wrapCEK(secretKeyGenerateCEK, secretKeyDeriveKey, getJCAContext().getKeyEncryptionProvider()));
        if (Arrays.equals(AAD.compute(jWEHeader), bArr2)) {
            bArr2 = AAD.compute(jWEHeaderBuild);
        }
        return ContentCryptoProvider.encrypt(jWEHeaderBuild, bArr, bArr2, secretKeyGenerateCEK, base64URLEncode, getJCAContext());
    }

    public int getIterationCount() {
        return this.iterationCount;
    }

    public int getSaltLength() {
        return this.saltLength;
    }

    public PasswordBasedEncrypter(String str, int i14, int i15) {
        this(str.getBytes(StandardCharset.UTF_8), i14, i15);
    }

    @Deprecated
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) {
        return encrypt(jWEHeader, bArr, AAD.compute(jWEHeader));
    }
}
