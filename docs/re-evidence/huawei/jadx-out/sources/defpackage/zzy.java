package defpackage;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.config.BasicDefinition;
import org.eclipse.californium.elements.config.BasicListDefinition;
import org.eclipse.californium.elements.config.CertificateAuthenticationMode;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.scandium.ConnectionListener;
import org.eclipse.californium.scandium.DatagramFilter;
import org.eclipse.californium.scandium.DtlsHealth;
import org.eclipse.californium.scandium.auth.ApplicationLevelInfoSupplier;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;
import org.eclipse.californium.scandium.dtls.HelloExtension;
import org.eclipse.californium.scandium.dtls.SessionListener;
import org.eclipse.californium.scandium.dtls.SessionStore;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuiteSelector;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore;
import org.eclipse.californium.scandium.dtls.resumption.ResumptionVerifier;
import org.eclipse.californium.scandium.dtls.x509.CertificateProvider;
import org.eclipse.californium.scandium.dtls.x509.ConfigurationHelperSetup;
import org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier;

/* JADX INFO: loaded from: classes20.dex */
public final class zzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ApplicationLevelInfoSupplier f54853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InetSocketAddress f54854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdvancedPskStore f54855c;
    private aada d;
    private NewAdvancedCertificateVerifier e;
    private ConnectionListener f;
    private Configuration g;
    private CipherSuiteSelector h;
    private ConnectionIdGenerator i;
    private CertificateProvider j;
    private aabl k;
    private String l;
    private DatagramFilter m;
    private DtlsHealth n;
    private ResumptionVerifier o;
    private String p;
    private List<CipherSuite.CertificateKeyAlgorithm> q;
    private SessionStore r;
    private List<CipherSuite> s;
    private SessionListener t;
    private List<XECDHECryptography.SupportedGroup> u;
    private Boolean v;
    private List<SignatureAndHashAlgorithm> x;

    private zzy(Configuration configuration) {
        if (configuration == null) {
            throw new NullPointerException("Configuration must not be null!");
        }
        this.g = new Configuration(configuration);
    }

    public Configuration j() {
        return this.g;
    }

    public <T> T c(BasicDefinition<T> basicDefinition) {
        return (T) this.g.c(basicDefinition);
    }

    public Long c(zyy zyyVar, TimeUnit timeUnit) {
        return this.g.e(zyyVar, timeUnit);
    }

    public int b(zyy zyyVar, TimeUnit timeUnit) {
        return this.g.d(zyyVar, timeUnit);
    }

    public aabl q() {
        return this.k;
    }

    public Integer g() {
        Integer num = (Integer) this.g.c(DtlsConfig.aj);
        return num == null ? Integer.valueOf(((Integer) this.g.c(DtlsConfig.u)).intValue() / 2) : num;
    }

    public Boolean z() {
        return this.v;
    }

    public ConnectionIdGenerator h() {
        return this.i;
    }

    public InetSocketAddress a() {
        return this.f54854b;
    }

    public CertificateProvider i() {
        return this.j;
    }

    public CipherSuiteSelector f() {
        return this.h;
    }

    public List<CipherSuite.CertificateKeyAlgorithm> v() {
        return this.q;
    }

    public List<CipherSuite> x() {
        return this.s;
    }

    public List<SignatureAndHashAlgorithm> w() {
        return this.x;
    }

    public List<XECDHECryptography.SupportedGroup> y() {
        return this.u;
    }

    public AdvancedPskStore c() {
        return this.f54855c;
    }

    public NewAdvancedCertificateVerifier b() {
        return this.e;
    }

    public ApplicationLevelInfoSupplier e() {
        return this.f54853a;
    }

    public String k() {
        if (this.g.c(DtlsConfig.ap) == DtlsConfig.DtlsRole.SERVER_ONLY) {
            return "none";
        }
        return (String) this.g.c(DtlsConfig.m);
    }

    public List<CertificateType> l() {
        CertificateProvider certificateProvider = this.j;
        if (certificateProvider == null) {
            return null;
        }
        return certificateProvider.getSupportedCertificateTypes();
    }

    public List<CertificateType> aa() {
        NewAdvancedCertificateVerifier newAdvancedCertificateVerifier = this.e;
        if (newAdvancedCertificateVerifier == null) {
            return null;
        }
        return newAdvancedCertificateVerifier.getSupportedCertificateTypes();
    }

    public Long d() {
        Long lE = this.g.e(DtlsConfig.d, TimeUnit.MILLISECONDS);
        if (lE == null || lE.longValue() > 0) {
            return lE;
        }
        return null;
    }

    public ConnectionListener o() {
        return this.f;
    }

    public SessionListener s() {
        return this.t;
    }

    public DatagramFilter n() {
        return this.m;
    }

    public SessionStore u() {
        return this.r;
    }

    public ResumptionVerifier t() {
        return this.o;
    }

    public String r() {
        return this.l;
    }

    public String p() {
        return this.p;
    }

    public DtlsHealth m() {
        return this.n;
    }

    protected Object clone() {
        zzy zzyVar = new zzy(this.g);
        zzyVar.f54854b = this.f54854b;
        zzyVar.e = this.e;
        zzyVar.v = this.v;
        zzyVar.k = this.k;
        zzyVar.f54855c = this.f54855c;
        zzyVar.j = this.j;
        zzyVar.d = this.d;
        zzyVar.h = this.h;
        zzyVar.q = this.q;
        zzyVar.s = this.s;
        zzyVar.x = this.x;
        zzyVar.u = this.u;
        zzyVar.l = this.l;
        zzyVar.p = this.p;
        zzyVar.i = this.i;
        zzyVar.f54853a = this.f54853a;
        zzyVar.f = this.f;
        zzyVar.t = this.t;
        zzyVar.m = this.m;
        zzyVar.r = this.r;
        zzyVar.o = this.o;
        zzyVar.n = this.n;
        return zzyVar;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private zzy f54856a;

        public e(Configuration configuration) {
            this.f54856a = new zzy(configuration);
        }

        public <T> e a(BasicDefinition<T> basicDefinition, T t) {
            this.f54856a.g.e(basicDefinition, t);
            return this;
        }

        public <T> e c(BasicListDefinition<T> basicListDefinition, T... tArr) {
            this.f54856a.g.e((BasicListDefinition) basicListDefinition, (Object[]) tArr);
            return this;
        }

        public e d(InetSocketAddress inetSocketAddress) {
            if (!inetSocketAddress.isUnresolved()) {
                this.f54856a.f54854b = inetSocketAddress;
                return this;
            }
            throw new IllegalArgumentException("Bind address must not be unresolved");
        }

        public e d(AdvancedPskStore advancedPskStore) {
            this.f54856a.f54855c = advancedPskStore;
            return this;
        }

        public e e(NewAdvancedCertificateVerifier newAdvancedCertificateVerifier) {
            if (newAdvancedCertificateVerifier != null) {
                this.f54856a.e = newAdvancedCertificateVerifier;
                return this;
            }
            throw new NullPointerException("CertificateVerifier must not be null");
        }

        public e c(ConnectionIdGenerator connectionIdGenerator) {
            this.f54856a.i = connectionIdGenerator;
            return this;
        }

        public zzy b() {
            zzy zzyVar = this.f54856a;
            zzyVar.l = zzp.j(zzyVar.l);
            if (this.f54856a.f54854b == null) {
                this.f54856a.f54854b = new InetSocketAddress(0);
            }
            if (this.f54856a.v == null) {
                this.f54856a.v = Boolean.FALSE;
            }
            int iIntValue = ((Integer) this.f54856a.c(DtlsConfig.u)).intValue();
            if (iIntValue >= 1) {
                Integer num = (Integer) this.f54856a.g.c(DtlsConfig.aj);
                if (num != null && num.intValue() >= iIntValue) {
                    throw new IllegalStateException("Backoff for handshake retransmissions (" + num + ") must be less than the maximum retransmissions (" + iIntValue + ")!");
                }
                int iB = this.f54856a.b(DtlsConfig.ao, TimeUnit.MILLISECONDS);
                int iB2 = this.f54856a.b(DtlsConfig.ad, TimeUnit.MILLISECONDS);
                if (iB > iB2) {
                    throw new IllegalStateException("Retransmission timeout " + iB + " is more than the maximum " + iB2 + "!");
                }
                if (iB <= 0) {
                    throw new IllegalStateException("Retransmission timeout " + iB + " must not be 0 or less!");
                }
                if (iB2 <= 0) {
                    throw new IllegalStateException("Maximum retransmission timeout " + iB2 + " must not be 0 or less!");
                }
                if (((Float) this.f54856a.c(DtlsConfig.an)).floatValue() < 1.0f) {
                    throw new IllegalStateException("Retransmission timeout random factor " + this.f54856a.c(DtlsConfig.an) + " must not be less than 1.0!");
                }
                if (((Float) this.f54856a.c(DtlsConfig.aq)).floatValue() < 1.0f) {
                    throw new IllegalStateException("Retransmission timeout scale factor " + this.f54856a.c(DtlsConfig.aq) + " must not be less than 1.0!");
                }
                Integer num2 = (Integer) this.f54856a.c(DtlsConfig.aa);
                Integer num3 = (Integer) this.f54856a.c(DtlsConfig.ac);
                if (num2 != null && num3 != null && num2.intValue() > num3.intValue()) {
                    throw new IllegalStateException("MTU (" + num2 + " bytes) is larger than the limit (" + num3 + " bytes)!");
                }
                Integer num4 = (Integer) this.f54856a.c(DtlsConfig.ak);
                if (num4 != null && num4.intValue() > 16384) {
                    throw new IllegalStateException("Record size limit " + num4 + " must be less than 16384!");
                }
                DtlsConfig.DtlsRole dtlsRole = (DtlsConfig.DtlsRole) this.f54856a.c(DtlsConfig.ap);
                if (dtlsRole == DtlsConfig.DtlsRole.SERVER_ONLY) {
                    if (this.f54856a.c(DtlsConfig.j) == CertificateAuthenticationMode.NONE && this.f54856a.e != null) {
                        throw new IllegalStateException("configured certificate verifier is not used for client authentication mode NONE!");
                    }
                    if (this.f54856a.d() != null) {
                        throw new IllegalStateException("DTLS_AUTO_HANDSHAKE_TIMEOUT must not be used with SERVER_ONLY!");
                    }
                }
                if (((Boolean) this.f54856a.c(DtlsConfig.al)).booleanValue() && !((Boolean) this.f54856a.c(DtlsConfig.ae)).booleanValue()) {
                    throw new IllegalStateException("Removing stale double principals requires the read-write-lock connection store!!");
                }
                long jLongValue = this.f54856a.c(DtlsConfig.o, TimeUnit.NANOSECONDS).longValue();
                int iIntValue2 = ((Integer) this.f54856a.c(DtlsConfig.t)).intValue();
                if (!((jLongValue == 0) ^ (iIntValue2 == 0))) {
                    if (this.f54856a.m == null && ((Boolean) this.f54856a.c(DtlsConfig.bh)).booleanValue()) {
                        zzy zzyVar2 = this.f54856a;
                        zzyVar2.m = new zzu(zzyVar2.g);
                    }
                    if (this.f54856a.m == null && iIntValue2 > 0) {
                        throw new IllegalStateException("Enabled DTLS MAC error filter requires a record-filter!");
                    }
                    Integer num5 = (Integer) this.f54856a.c(DtlsConfig.bf);
                    if (num5 != null) {
                        HelloExtension.ExtensionType extensionTypeById = HelloExtension.ExtensionType.getExtensionTypeById(num5.intValue());
                        if (extensionTypeById == null) {
                            throw new IllegalStateException(num5 + " code point is not supported for extensions!");
                        }
                        if (extensionTypeById != HelloExtension.ExtensionType.CONNECTION_ID && extensionTypeById.getReplacementType() != HelloExtension.ExtensionType.CONNECTION_ID) {
                            throw new IllegalStateException(num5 + " (" + extensionTypeById + ") is no supported CID extension code point!");
                        }
                    }
                    zzy zzyVar3 = this.f54856a;
                    zzyVar3.u = (List) zzyVar3.g.c(DtlsConfig.n);
                    if (this.f54856a.u == null) {
                        this.f54856a.u = Collections.EMPTY_LIST;
                    }
                    zzy zzyVar4 = this.f54856a;
                    zzyVar4.x = (List) zzyVar4.g.c(DtlsConfig.au);
                    if (this.f54856a.x == null) {
                        this.f54856a.x = Collections.EMPTY_LIST;
                    }
                    zzy zzyVar5 = this.f54856a;
                    zzyVar5.q = (List) zzyVar5.g.c(DtlsConfig.f44541a);
                    if (this.f54856a.q == null) {
                        this.f54856a.q = Collections.EMPTY_LIST;
                    }
                    if (this.f54856a.h == null && dtlsRole != DtlsConfig.DtlsRole.CLIENT_ONLY) {
                        this.f54856a.h = new aach();
                    }
                    if (this.f54856a.o == null && ((Boolean) this.f54856a.c(DtlsConfig.av)).booleanValue() && dtlsRole != DtlsConfig.DtlsRole.CLIENT_ONLY) {
                        this.f54856a.o = new aacu();
                    }
                    CertificateProvider certificateProvider = this.f54856a.j;
                    NewAdvancedCertificateVerifier newAdvancedCertificateVerifier = this.f54856a.e;
                    if (this.f54856a.d == null) {
                        aada aadaVar = new aada();
                        if (certificateProvider instanceof ConfigurationHelperSetup) {
                            ((ConfigurationHelperSetup) certificateProvider).setupConfigurationHelper(aadaVar);
                            this.f54856a.d = aadaVar;
                        }
                        if (newAdvancedCertificateVerifier instanceof ConfigurationHelperSetup) {
                            ((ConfigurationHelperSetup) newAdvancedCertificateVerifier).setupConfigurationHelper(aadaVar);
                            this.f54856a.d = aadaVar;
                        }
                    }
                    zzy zzyVar6 = this.f54856a;
                    zzyVar6.s = (List) zzyVar6.g.c(DtlsConfig.i);
                    if (this.f54856a.s == null || this.f54856a.s.isEmpty()) {
                        a();
                    }
                    if (this.f54856a.s.isEmpty()) {
                        throw new IllegalStateException("Supported cipher suites must be set either explicitly or implicitly by means of setting the identity or PSK store");
                    }
                    if (((Boolean) this.f54856a.c(DtlsConfig.ai)).booleanValue()) {
                        d(this.f54856a.s);
                    }
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (CipherSuite cipherSuite : this.f54856a.s) {
                        if (cipherSuite.isPskBased()) {
                            a(cipherSuite);
                            z = true;
                        } else if (cipherSuite.requiresServerCertificateMessage()) {
                            e(cipherSuite);
                            z2 = true;
                        }
                        if (cipherSuite.isEccBased()) {
                            z3 = true;
                        }
                    }
                    if (!z && this.f54856a.f54855c != null) {
                        throw new IllegalStateException("Advanced PSK store set, but no PSK cipher suite!");
                    }
                    if (z2) {
                        if (this.f54856a.x.isEmpty()) {
                            ArrayList arrayList = new ArrayList(SignatureAndHashAlgorithm.f44563a);
                            if (this.f54856a.d != null) {
                                aacx.d(arrayList, this.f54856a.d.a());
                            }
                            this.f54856a.x = arrayList;
                        }
                        if (this.f54856a.q.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            if (SignatureAndHashAlgorithm.d((List<SignatureAndHashAlgorithm>) this.f54856a.x, CipherSuite.CertificateKeyAlgorithm.EC)) {
                                aacx.c(arrayList2, CipherSuite.CertificateKeyAlgorithm.EC);
                            }
                            if (SignatureAndHashAlgorithm.d((List<SignatureAndHashAlgorithm>) this.f54856a.x, CipherSuite.CertificateKeyAlgorithm.RSA)) {
                                aacx.c(arrayList2, CipherSuite.CertificateKeyAlgorithm.RSA);
                            }
                            if (this.f54856a.j().c(DtlsConfig.ap) == DtlsConfig.DtlsRole.CLIENT_ONLY) {
                                aacx.c(arrayList2, CipherSuite.CertificateKeyAlgorithm.EC);
                            }
                            this.f54856a.q = arrayList2;
                        }
                    } else {
                        if (!this.f54856a.x.isEmpty()) {
                            throw new IllegalStateException("supported signature and hash algorithms set, but no ecdhe based cipher suite!");
                        }
                        if (certificateProvider == null) {
                            if (this.f54856a.e != null) {
                                throw new IllegalStateException("certificate trust set, but no certificate based cipher suite!");
                            }
                        } else {
                            throw new IllegalStateException("certificate identity set, but no certificate based cipher suite!");
                        }
                    }
                    if (z3) {
                        if (this.f54856a.u.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(XECDHECryptography.SupportedGroup.getPreferredGroups());
                            if (this.f54856a.d != null) {
                                aacx.d(arrayList3, this.f54856a.d.e());
                            }
                            this.f54856a.u = arrayList3;
                        }
                    } else if (!this.f54856a.u.isEmpty()) {
                        throw new IllegalStateException("supported groups set, but no ecdhe based cipher suite!");
                    }
                    if (((Boolean) this.f54856a.c(DtlsConfig.ag)).booleanValue()) {
                        e(this.f54856a.u);
                    }
                    if (((Boolean) this.f54856a.c(DtlsConfig.am)).booleanValue()) {
                        a(this.f54856a.x);
                    }
                    if (this.f54856a.d != null) {
                        this.f54856a.d.c(this.f54856a.x);
                        this.f54856a.d.a(this.f54856a.u);
                        if (certificateProvider != null && certificateProvider.getSupportedCertificateTypes().contains(CertificateType.X_509)) {
                            if (dtlsRole == DtlsConfig.DtlsRole.CLIENT_ONLY) {
                                if (!this.f54856a.d.b(true)) {
                                    throw new IllegalStateException("certificate has no proper key usage for clients!");
                                }
                            } else if (dtlsRole == DtlsConfig.DtlsRole.SERVER_ONLY) {
                                if (!this.f54856a.d.b(false)) {
                                    throw new IllegalStateException("certificate has no proper key usage for servers!");
                                }
                            } else if (this.f54856a.d.b(true)) {
                                if (!this.f54856a.d.b(false)) {
                                    throw new IllegalStateException("certificate has no proper key usage as servers!");
                                }
                            } else {
                                throw new IllegalStateException("certificate has no proper key usage as clients!");
                            }
                        }
                    }
                    if (((Boolean) this.f54856a.c(DtlsConfig.be)).booleanValue() && !((Boolean) this.f54856a.c(DtlsConfig.bl)).booleanValue() && !CipherSuite.containsPskBasedCipherSuite(this.f54856a.s)) {
                        throw new IllegalStateException("HELLO_VERIFY_REQUEST disabled for PSK, requires at least one PSK cipher suite!");
                    }
                    zzy zzyVar7 = this.f54856a;
                    zzyVar7.q = aacx.e(zzyVar7.q);
                    zzy zzyVar8 = this.f54856a;
                    zzyVar8.s = aacx.e(zzyVar8.s);
                    zzy zzyVar9 = this.f54856a;
                    zzyVar9.u = aacx.e(zzyVar9.u);
                    zzy zzyVar10 = this.f54856a;
                    zzyVar10.x = aacx.e(zzyVar10.x);
                    if (this.f54856a.i == null) {
                        Integer num6 = (Integer) this.f54856a.g.c(DtlsConfig.g);
                        Integer num7 = (Integer) this.f54856a.g.c(DtlsConfig.f);
                        if (num6 != null) {
                            if (num7 != null) {
                                if (num6.intValue() <= 4) {
                                    throw new IllegalStateException(num6 + " bytes are too small for multiple nodes CID! At least, 5 bytes are required.");
                                }
                                c(new aabk(num7.intValue(), num6.intValue()));
                            } else {
                                c(new aacg(num6.intValue()));
                            }
                        }
                    }
                    return this.f54856a;
                }
                throw new IllegalStateException("DTLS MAC error filter configuration ambig! Use 0 for both, or larger than 0 for both!");
            }
            throw new IllegalStateException("Maximum retransmissions " + iIntValue + " must not be less than 1!");
        }

        private void a(CipherSuite cipherSuite) {
            if (this.f54856a.f54855c != null) {
                if (this.f54856a.f54855c.hasEcdhePskSupported() || !cipherSuite.isEccBased()) {
                    return;
                }
                throw new IllegalStateException("PSK store doesn't support ECDHE! " + cipherSuite.name());
            }
            throw new IllegalStateException("PSK store must be set for configured " + cipherSuite.name());
        }

        private void e(CipherSuite cipherSuite) {
            if (this.f54856a.c(DtlsConfig.ap) == DtlsConfig.DtlsRole.CLIENT_ONLY) {
                if (this.f54856a.e != null) {
                    return;
                }
                throw new IllegalStateException("certificate verifier must be set on client for configured " + cipherSuite.name());
            }
            if (this.f54856a.j == null) {
                throw new IllegalStateException("Identity must be set for configured " + cipherSuite.name());
            }
            List<CipherSuite.CertificateKeyAlgorithm> supportedCertificateKeyAlgorithms = this.f54856a.j.getSupportedCertificateKeyAlgorithms();
            if (!supportedCertificateKeyAlgorithms.contains(cipherSuite.getCertificateKeyAlgorithm())) {
                throw new IllegalStateException("One of the keys (" + supportedCertificateKeyAlgorithms + ") must be capable for configured " + cipherSuite.name());
            }
            if (this.f54856a.c(DtlsConfig.j) == CertificateAuthenticationMode.NONE || this.f54856a.e != null) {
                return;
            }
            throw new IllegalStateException("certificate verifier must be set for authentication using the configured " + cipherSuite.name());
        }

        private void d(List<CipherSuite> list) {
            StringBuilder sb = new StringBuilder();
            for (CipherSuite cipherSuite : list) {
                if (!cipherSuite.isRecommended()) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(cipherSuite.name());
                }
            }
            if (sb.length() <= 0) {
                return;
            }
            throw new IllegalStateException("Not recommended cipher suites " + ((Object) sb) + " used! (Requires to set DTLS_RECOMMENDED_CIPHER_SUITES_ONLY to false.)");
        }

        private void e(List<XECDHECryptography.SupportedGroup> list) {
            StringBuilder sb = new StringBuilder();
            for (XECDHECryptography.SupportedGroup supportedGroup : list) {
                if (!supportedGroup.isRecommended()) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(supportedGroup.name());
                }
            }
            if (sb.length() <= 0) {
                return;
            }
            throw new IllegalStateException("Not recommended supported groups (curves) " + ((Object) sb) + " used! (Requires to set DTLS_RECOMMENDED_CURVES_ONLY to false.)");
        }

        private void a(List<SignatureAndHashAlgorithm> list) {
            StringBuilder sb = new StringBuilder();
            for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : list) {
                if (!signatureAndHashAlgorithm.d()) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(signatureAndHashAlgorithm.e());
                }
            }
            if (sb.length() <= 0) {
                return;
            }
            throw new IllegalStateException("Not recommended signature and hash algorithms " + ((Object) sb) + " used! (Requires to set DTLS_RECOMMENDED_SIGNATURE_AND_HASH_ALGORITHMS_ONLY to false.)");
        }

        private void a() {
            List arrayList = new ArrayList();
            if (this.f54856a.j != null || this.f54856a.e != null) {
                ArrayList arrayList2 = new ArrayList();
                if (this.f54856a.j().c(DtlsConfig.ap) == DtlsConfig.DtlsRole.CLIENT_ONLY) {
                    if (!this.f54856a.q.isEmpty()) {
                        aacx.d(arrayList2, this.f54856a.q);
                    } else {
                        aacx.c(arrayList2, CipherSuite.CertificateKeyAlgorithm.EC);
                        if (this.f54856a.j != null) {
                            aacx.d(arrayList2, this.f54856a.j.getSupportedCertificateKeyAlgorithms());
                        }
                    }
                } else if (this.f54856a.j != null) {
                    aacx.d(arrayList2, this.f54856a.j.getSupportedCertificateKeyAlgorithms());
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(CipherSuite.getCertificateCipherSuites(((Boolean) this.f54856a.c(DtlsConfig.ai)).booleanValue(), arrayList2));
                }
            }
            if (this.f54856a.f54855c != null) {
                if (this.f54856a.f54855c.hasEcdhePskSupported()) {
                    arrayList.addAll(CipherSuite.getCipherSuitesByKeyExchangeAlgorithm(((Boolean) this.f54856a.c(DtlsConfig.ai)).booleanValue(), CipherSuite.KeyExchangeAlgorithm.ECDHE_PSK));
                }
                arrayList.addAll(CipherSuite.getCipherSuitesByKeyExchangeAlgorithm(((Boolean) this.f54856a.c(DtlsConfig.ai)).booleanValue(), CipherSuite.KeyExchangeAlgorithm.PSK));
            }
            List list = (List) this.f54856a.c(DtlsConfig.ab);
            if (list != null && !list.isEmpty()) {
                arrayList = CipherSuite.preselectCipherSuites(arrayList, list);
            }
            this.f54856a.s = arrayList;
        }
    }
}
