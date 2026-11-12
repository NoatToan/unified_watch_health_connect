package defpackage;

import java.security.GeneralSecurityException;
import java.security.Principal;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.eclipse.californium.scandium.auth.PrincipalSerializer;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.PseudoRandomFunction;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.eclipse.californium.scandium.util.ServerName;

/* JADX INFO: loaded from: classes20.dex */
public final class aaam implements Destroyable {
    private static final zzs.b d = new zzs.b(3, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompressionMethod f43b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CipherSuite f44c;
    private XECDHECryptography.SupportedGroup e;
    private int f;
    private Principal g;
    private SecretKey h;
    private String i;
    private boolean j;
    private boolean k;
    private Integer l;
    private boolean m;
    private CertificateType n;
    private aabl o;
    private aacd p;
    private aade r;
    private CertificateType s;
    private SignatureAndHashAlgorithm t;

    public aaam() {
        this.p = aacd.e();
        this.o = aabl.f90a;
        this.f = 16384;
        this.f44c = CipherSuite.TLS_NULL_WITH_NULL_NULL;
        this.f43b = CompressionMethod.NULL;
        this.h = null;
        this.s = CertificateType.X_509;
        this.n = CertificateType.X_509;
        this.f42a = System.currentTimeMillis();
    }

    public aaam(aaam aaamVar) {
        this.p = aacd.e();
        this.o = aabl.f90a;
        this.f = 16384;
        this.f44c = CipherSuite.TLS_NULL_WITH_NULL_NULL;
        this.f43b = CompressionMethod.NULL;
        this.h = null;
        this.s = CertificateType.X_509;
        this.n = CertificateType.X_509;
        c(aaamVar);
    }

    public void c(aaam aaamVar) {
        this.f42a = aaamVar.c();
        this.p = aaamVar.l();
        this.o = aaamVar.k();
        this.h = aaamVar.g();
        this.g = aaamVar.n();
        this.f44c = aaamVar.a();
        this.f43b = aaamVar.e();
        this.t = aaamVar.t();
        this.e = aaamVar.d();
        this.j = aaamVar.q();
        this.k = aaamVar.x();
        this.s = aaamVar.r();
        this.n = aaamVar.s();
        this.l = aaamVar.o();
        this.f = aaamVar.h();
        c(aaamVar.m());
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.e(this.h);
        this.h = null;
        this.j = false;
        this.k = false;
        this.f44c = CipherSuite.TLS_NULL_WITH_NULL_NULL;
        this.f43b = CompressionMethod.NULL;
        this.t = null;
        this.e = null;
        this.g = null;
        this.s = CertificateType.X_509;
        this.n = CertificateType.X_509;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return aadd.a(this.h);
    }

    public aacd l() {
        return this.p;
    }

    void d(aacd aacdVar) {
        if (aacdVar == null) {
            throw new NullPointerException("session identifier must not be null!");
        }
        if (!aacdVar.equals(this.p) || aacdVar.b()) {
            aadd.e(this.h);
            this.h = null;
            this.p = aacdVar;
            return;
        }
        throw new IllegalArgumentException("no new session identifier?");
    }

    public aabl k() {
        return this.o;
    }

    void e(aabl aablVar) {
        if (!aabl.f90a.equals(aablVar)) {
            throw new IllegalArgumentException(aablVar + " is not supported!");
        }
        this.o = aabl.f90a;
    }

    public long c() {
        return this.f42a;
    }

    public String j() {
        return this.i;
    }

    public void b(String str) {
        this.r = null;
        this.i = str;
        if (str != null) {
            this.r = aade.c(ServerName.a(ServerName.NameType.HOST_NAME, str.getBytes(ServerName.d)));
        }
    }

    public aade m() {
        return this.r;
    }

    public void c(aade aadeVar) {
        ServerName serverNameB;
        this.i = null;
        this.r = aadeVar;
        if (aadeVar == null || (serverNameB = aadeVar.b(ServerName.NameType.HOST_NAME)) == null) {
            return;
        }
        this.i = serverNameB.b();
    }

    public boolean p() {
        return this.m;
    }

    void e(boolean z) {
        this.m = z;
    }

    public void d(zya.e eVar) {
        zzg zzgVar;
        if (this.p.b()) {
            zzgVar = new zzg(("TIME:" + Long.toString(this.f42a)).getBytes());
        } else {
            zzgVar = this.p;
        }
        eVar.d(zxu.t, zzgVar);
        eVar.d(zxu.g, this.f44c.name());
        if (this.j) {
            eVar.d(zxu.j, Boolean.TRUE);
        }
        if (this.k) {
            eVar.d(zxu.p, Boolean.TRUE);
        }
    }

    public CipherSuite a() {
        return this.f44c;
    }

    void d(CipherSuite cipherSuite) {
        if (cipherSuite == null) {
            throw new NullPointerException("Negotiated cipher suite must not be null!");
        }
        if (!cipherSuite.isValidForNegotiation()) {
            throw new IllegalArgumentException("Negotiated cipher suite must be valid for negotiation!");
        }
        this.f44c = cipherSuite;
    }

    public CompressionMethod e() {
        return this.f43b;
    }

    void c(CompressionMethod compressionMethod) {
        this.f43b = compressionMethod;
    }

    public final CipherSuite.KeyExchangeAlgorithm i() {
        CipherSuite cipherSuite = this.f44c;
        if (cipherSuite == null) {
            throw new IllegalStateException("Cipher suite has not been set (yet)");
        }
        return cipherSuite.getKeyExchange();
    }

    public void c(boolean z) {
        this.j = z;
    }

    public boolean q() {
        return this.j;
    }

    public void d(boolean z) {
        this.k = z;
    }

    public boolean x() {
        return this.k;
    }

    public SecretKey g() {
        return aadd.d(this.h);
    }

    public void e(SecretKey secretKey) {
        if (this.h == null) {
            if (!this.p.b()) {
                if (secretKey == null) {
                    throw new NullPointerException("Master secret must not be null");
                }
                byte[] encoded = secretKey.getEncoded();
                zzg.a(encoded);
                if (encoded.length != PseudoRandomFunction.Label.MASTER_SECRET_LABEL.length()) {
                    throw new IllegalArgumentException(String.format("Master secret must consist of of exactly %d bytes but has %d bytes", Integer.valueOf(PseudoRandomFunction.Label.MASTER_SECRET_LABEL.length()), Integer.valueOf(encoded.length)));
                }
                this.h = aadd.d(secretKey);
            }
            this.f42a = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException("master secret already available!");
    }

    public int f() {
        CipherSuite cipherSuite = this.f44c;
        if (cipherSuite == null) {
            throw new IllegalStateException("Missing cipher suite.");
        }
        return cipherSuite.getMaxCiphertextExpansion();
    }

    void c(int i) {
        if (i < 0 || i > 16384) {
            throw new IllegalArgumentException("Max. fragment length must be in range [0...16384]");
        }
        this.f = i;
    }

    public int h() {
        return this.f;
    }

    void e(int i) {
        this.l = Integer.valueOf(aabu.b(i));
    }

    public Integer o() {
        return this.l;
    }

    public int b() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        return this.f;
    }

    CertificateType r() {
        return this.s;
    }

    void c(CertificateType certificateType) {
        this.s = certificateType;
    }

    public CertificateType s() {
        return this.n;
    }

    void b(CertificateType certificateType) {
        this.n = certificateType;
    }

    public SignatureAndHashAlgorithm t() {
        return this.t;
    }

    void a(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        this.t = signatureAndHashAlgorithm;
    }

    public XECDHECryptography.SupportedGroup d() {
        return this.e;
    }

    void c(XECDHECryptography.SupportedGroup supportedGroup) {
        this.e = supportedGroup;
    }

    public Principal n() {
        return this.g;
    }

    public void d(Principal principal) {
        if (principal == null) {
            throw new NullPointerException("Peer identity must not be null");
        }
        this.g = principal;
    }

    public int hashCode() {
        aacd aacdVar = this.p;
        return aacdVar == null ? (int) this.f42a : aacdVar.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaam aaamVar = (aaam) obj;
        return aadd.e(this.h, aaamVar.h) && zzg.c(this.p, aaamVar.p) && this.f44c == aaamVar.f44c && this.f43b == aaamVar.f43b && this.j == aaamVar.j && this.k == aaamVar.k && this.m == aaamVar.m && this.s == aaamVar.s && this.n == aaamVar.n && this.e == aaamVar.e && this.f42a == aaamVar.f42a && Objects.equals(this.t, aaamVar.t) && Objects.equals(this.r, aaamVar.r) && Objects.equals(this.l, aaamVar.l) && Objects.equals(this.g, aaamVar.g) && Objects.equals(this.o, aaamVar.o);
    }

    public void c(zzl zzlVar) {
        int iE = zzs.e(zzlVar, 3, 16);
        zzlVar.e(this.f42a, 64);
        if (this.r == null) {
            zzlVar.d(0, 8);
        } else {
            zzlVar.d(1, 8);
            this.r.b(zzlVar);
        }
        Integer num = this.l;
        if (num != null) {
            zzlVar.d(num.intValue(), 16);
        } else {
            zzlVar.d(65535, 16);
        }
        zzlVar.d(this.f, 16);
        zzlVar.c(this.p, 8);
        zzlVar.d(this.f44c.getCode(), 16);
        zzlVar.d(this.f43b.getCode(), 8);
        zzlVar.d(this.s.getCode(), 8);
        zzlVar.d(this.n.getCode(), 8);
        zzlVar.d(this.k ? 1 : 0, 8);
        zzlVar.d(this.j ? 1 : 0, 8);
        aacy.b(zzlVar, this.h);
        if (this.t == null) {
            zzlVar.d(0, 8);
        } else {
            zzlVar.d(1, 8);
            zzlVar.d(this.t.c().getCode(), 8);
            zzlVar.d(this.t.b().getCode(), 8);
        }
        if (this.e == null) {
            zzlVar.d(0, 8);
        } else {
            zzlVar.d(1, 8);
            zzlVar.d(this.e.getId(), 16);
        }
        if (this.g == null) {
            zzlVar.d(0, 8);
        } else {
            zzlVar.d(1, 8);
            PrincipalSerializer.c(this.g, zzlVar);
        }
        zzs.a(zzlVar, iE, 16);
    }

    public static aaam c(zzf zzfVar) {
        zzs.a aVarE = d.e();
        int iB = zzs.b(zzfVar, aVarE, 16);
        if (iB <= 0) {
            return null;
        }
        return new aaam(aVarE.c(), zzfVar.d(iB));
    }

    private aaam(int i, zzf zzfVar) {
        this.p = aacd.e();
        this.o = aabl.f90a;
        this.f = 16384;
        this.f44c = CipherSuite.TLS_NULL_WITH_NULL_NULL;
        this.f43b = CompressionMethod.NULL;
        this.h = null;
        this.s = CertificateType.X_509;
        this.n = CertificateType.X_509;
        this.f42a = zzfVar.e(64);
        if (zzfVar.e() == 1) {
            aade aadeVarB = aade.b();
            this.r = aadeVarB;
            try {
                aadeVarB.c(zzfVar);
                ServerName serverNameB = this.r.b(ServerName.NameType.HOST_NAME);
                if (serverNameB != null) {
                    this.i = serverNameB.b();
                }
            } catch (IllegalArgumentException unused) {
                this.r = null;
            }
        }
        int iA = zzfVar.a(16);
        if (iA < 65535) {
            this.l = Integer.valueOf(iA);
        }
        this.f = zzfVar.a(16);
        byte[] bArrJ = zzfVar.j(8);
        if (bArrJ != null) {
            this.p = new aacd(bArrJ);
        }
        int iA2 = zzfVar.a(16);
        CipherSuite typeByCode = CipherSuite.getTypeByCode(iA2);
        this.f44c = typeByCode;
        if (typeByCode == null) {
            throw new IllegalArgumentException("unknown cipher suite 0x" + Integer.toHexString(iA2) + "!");
        }
        int iA3 = zzfVar.a(8);
        CompressionMethod methodByCode = CompressionMethod.getMethodByCode(iA3);
        this.f43b = methodByCode;
        if (methodByCode == null) {
            throw new IllegalArgumentException("unknown compression method 0x" + Integer.toHexString(iA3) + "!");
        }
        int iA4 = zzfVar.a(8);
        CertificateType typeFromCode = CertificateType.getTypeFromCode(iA4);
        this.s = typeFromCode;
        if (typeFromCode == null) {
            throw new IllegalArgumentException("unknown send certificate type 0x" + Integer.toHexString(iA4) + "!");
        }
        int iA5 = zzfVar.a(8);
        CertificateType typeFromCode2 = CertificateType.getTypeFromCode(iA5);
        this.n = typeFromCode2;
        if (typeFromCode2 == null) {
            throw new IllegalArgumentException("unknown send certificate type 0x" + Integer.toHexString(iA5) + "!");
        }
        if (i > 2) {
            this.k = zzfVar.a(8) == 1;
        }
        this.j = zzfVar.a(8) == 1;
        this.h = aacy.c(zzfVar);
        if (zzfVar.e() == 1) {
            this.t = new SignatureAndHashAlgorithm(zzfVar.a(8), zzfVar.a(8));
        }
        if (zzfVar.e() == 1) {
            int iA6 = zzfVar.a(16);
            XECDHECryptography.SupportedGroup supportedGroupFromId = XECDHECryptography.SupportedGroup.fromId(iA6);
            this.e = supportedGroupFromId;
            if (supportedGroupFromId == null) {
                throw new IllegalArgumentException("unknown ec-group 0x" + Integer.toHexString(iA6) + "!");
            }
        }
        if (zzfVar.e() == 1) {
            try {
                this.g = PrincipalSerializer.e(zzfVar);
            } catch (GeneralSecurityException e) {
                throw new IllegalArgumentException("principal failure", e);
            }
        }
        zzfVar.b("dtls-session");
    }
}
