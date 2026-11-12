package defpackage;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Base64;

/* JADX INFO: loaded from: classes21.dex */
public class qu extends Algorithm {
    public qu() {
        super("none", "none");
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public void verify(DecodedJWT decodedJWT) throws rc {
        try {
            if (Base64.getUrlDecoder().decode(decodedJWT.getSignature()).length <= 0) {
            } else {
                throw new rc(this);
            }
        } catch (IllegalArgumentException e) {
            throw new rc(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr, byte[] bArr2) throws rg {
        return new byte[0];
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr) throws rg {
        return new byte[0];
    }
}
