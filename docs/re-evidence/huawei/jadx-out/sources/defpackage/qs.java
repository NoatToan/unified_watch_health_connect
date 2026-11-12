package defpackage;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

/* JADX INFO: loaded from: classes21.dex */
public class qs extends Algorithm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qw f46733c;
    private final byte[] d;

    qs(qw qwVar, String str, String str2, byte[] bArr) throws IllegalArgumentException {
        super(str, str2);
        if (bArr == null) {
            throw new IllegalArgumentException("The Secret cannot be null");
        }
        this.d = Arrays.copyOf(bArr, bArr.length);
        this.f46733c = qwVar;
    }

    public qs(String str, String str2, byte[] bArr) throws IllegalArgumentException {
        this(new qw(), str, str2, bArr);
    }

    public qs(String str, String str2, String str3) throws IllegalArgumentException {
        this(new qw(), str, str2, b(str3));
    }

    static byte[] b(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("The Secret cannot be null");
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public void verify(DecodedJWT decodedJWT) throws rc {
        try {
            if (this.f46733c.c(getDescription(), this.d, decodedJWT.getHeader(), decodedJWT.getPayload(), Base64.getUrlDecoder().decode(decodedJWT.getSignature()))) {
            } else {
                throw new rc(this);
            }
        } catch (IllegalArgumentException | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException e) {
            throw new rc(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr, byte[] bArr2) throws rg {
        try {
            return this.f46733c.d(getDescription(), this.d, bArr, bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new rg(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr) throws rg {
        try {
            return this.f46733c.a(getDescription(), this.d, bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new rg(this, e);
        }
    }
}
