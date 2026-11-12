package defpackage;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class k1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.b f23324a;

    public k1e(a.b bVar) {
        this.f23324a = bVar;
    }

    public static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static k1e i() {
        return new k1e(a.L());
    }

    public static k1e j(i1e i1eVar) {
        return new k1e(i1eVar.f().toBuilder());
    }

    public synchronized k1e a(KeyTemplate keyTemplate) throws GeneralSecurityException {
        b(keyTemplate.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(k0e k0eVar, boolean z) throws GeneralSecurityException {
        a.c cVarE;
        try {
            cVarE = e(k0eVar);
            this.f23324a.t(cVarE);
            if (z) {
                this.f23324a.x(cVarE.I());
            }
        } catch (Throwable th) {
            throw th;
        }
        return cVarE.I();
    }

    public synchronized i1e c() throws GeneralSecurityException {
        return i1e.e(this.f23324a.build());
    }

    public final synchronized boolean d(int i) {
        Iterator<a.c> it = this.f23324a.w().iterator();
        while (it.hasNext()) {
            if (it.next().I() == i) {
                return true;
            }
        }
        return false;
    }

    public final synchronized a.c e(k0e k0eVar) throws GeneralSecurityException {
        KeyData keyDataP;
        int iF;
        OutputPrefixType outputPrefixTypeH;
        try {
            keyDataP = cdk.p(k0eVar);
            iF = f();
            outputPrefixTypeH = k0eVar.H();
            if (outputPrefixTypeH == OutputPrefixType.UNKNOWN_PREFIX) {
                outputPrefixTypeH = OutputPrefixType.TINK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a.c.M().t(keyDataP).u(iF).w(KeyStatusType.ENABLED).v(outputPrefixTypeH).build();
    }

    public final synchronized int f() {
        int iG;
        iG = g();
        while (d(iG)) {
            iG = g();
        }
        return iG;
    }

    public synchronized k1e h(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.f23324a.v(); i2++) {
            a.c cVarU = this.f23324a.u(i2);
            if (cVarU.I() == i) {
                if (!cVarU.K().equals(KeyStatusType.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                this.f23324a.x(i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
