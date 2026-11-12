package defpackage;

import java.security.SecureRandom;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.TokenGenerator;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zvz implements TokenGenerator {
    private static final Logger d = aaex.a((Class<?>) zvz.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecureRandom f54656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54657b;

    public zvz(Configuration configuration) {
        if (configuration == null) {
            throw new NullPointerException("NetworkConfig must not be null");
        }
        SecureRandom secureRandom = new SecureRandom();
        this.f54656a = secureRandom;
        secureRandom.nextInt(10);
        int iIntValue = ((Integer) configuration.c(CoapConfig.au)).intValue();
        this.f54657b = iIntValue;
        d.info("using tokens of {} bytes in length", Integer.valueOf(iIntValue));
    }

    @Override // org.eclipse.californium.core.network.TokenGenerator
    public zve createToken(TokenGenerator.Scope scope) {
        byte[] bArr = new byte[this.f54657b];
        this.f54656a.nextBytes(bArr);
        int i = AnonymousClass3.d[scope.ordinal()];
        if (i == 1) {
            bArr[0] = (byte) (bArr[0] | 1);
        } else if (i == 2) {
            byte b2 = (byte) (bArr[0] & 252);
            bArr[0] = b2;
            bArr[0] = (byte) (b2 | 2);
        } else if (i == 3) {
            bArr[0] = (byte) (bArr[0] & 252);
        }
        return zve.e(bArr);
    }

    /* JADX INFO: renamed from: zvz$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[TokenGenerator.Scope.values().length];
            d = iArr;
            try {
                iArr[TokenGenerator.Scope.LONG_TERM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[TokenGenerator.Scope.SHORT_TERM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[TokenGenerator.Scope.SHORT_TERM_CLIENT_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // org.eclipse.californium.core.network.TokenGenerator
    public TokenGenerator.Scope getScope(zve zveVar) {
        if (zveVar.c() != this.f54657b) {
            return TokenGenerator.Scope.SHORT_TERM_CLIENT_LOCAL;
        }
        int i = zveVar.d()[0] & 3;
        if (i == 0) {
            return TokenGenerator.Scope.SHORT_TERM_CLIENT_LOCAL;
        }
        if (i == 2) {
            return TokenGenerator.Scope.SHORT_TERM;
        }
        return TokenGenerator.Scope.LONG_TERM;
    }

    @Override // org.eclipse.californium.core.network.TokenGenerator
    public zvt getKeyToken(zve zveVar, Object obj) {
        if (getScope(zveVar) != TokenGenerator.Scope.SHORT_TERM_CLIENT_LOCAL) {
            return new zvt(zveVar, null);
        }
        if (obj == null) {
            throw new IllegalArgumentException("client-local token requires peer!");
        }
        return new zvt(zveVar, obj);
    }
}
