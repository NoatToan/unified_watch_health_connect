package org.eclipse.californium.scandium.dtls.cipher;

import defpackage.aacj;
import defpackage.aaco;
import defpackage.aacp;
import defpackage.aacq;
import defpackage.aadd;
import defpackage.aaex;
import defpackage.zzg;
import defpackage.zzm;
import defpackage.zzp;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.EllipticCurve;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.security.auth.Destroyable;
import org.eclipse.californium.elements.util.JceNames;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class XECDHECryptography implements Destroyable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<EllipticCurve, SupportedGroup> f44579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    protected static final Logger f44580b = aaex.a((Class<?>) XECDHECryptography.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, SupportedGroup> f44581c;
    public static final aacq d;
    private static final aacp e;
    private static final aaco f;
    private static final aaco g;
    private static final aacp h;
    private static volatile XDHPublicKeyApi i;
    private static final aacq j;
    private final SupportedGroup k;
    private PrivateKey m;
    private final byte[] n;
    private final PublicKey o;

    public interface XDHPublicKeyApi {
        String getCurveName(PublicKey publicKey) throws GeneralSecurityException;

        boolean isSupporting(PublicKey publicKey);
    }

    static {
        zzm.d();
        g = new aaco(JceNames.EC);
        f = new aaco("XDH");
        j = new aacq(JceNames.EC);
        d = new aacq("XDH");
        e = new aacp("ECDH");
        h = new aacp("XDH");
        i = d.a();
        f44581c = new HashMap();
        f44579a = new HashMap();
    }

    public XECDHECryptography(SupportedGroup supportedGroup) throws GeneralSecurityException {
        KeyPair keyPairGenerateKeyPair;
        if (supportedGroup.getAlgorithmName().equals(JceNames.EC)) {
            KeyPairGenerator keyPairGeneratorD = g.d();
            keyPairGeneratorD.initialize(new ECGenParameterSpec(supportedGroup.name()), aacj.b());
            keyPairGenerateKeyPair = keyPairGeneratorD.generateKeyPair();
        } else if (supportedGroup.getAlgorithmName().equals("XDH")) {
            KeyPairGenerator keyPairGeneratorD2 = f.d();
            keyPairGeneratorD2.initialize(new ECGenParameterSpec(supportedGroup.name()), aacj.b());
            keyPairGenerateKeyPair = keyPairGeneratorD2.generateKeyPair();
        } else {
            throw new GeneralSecurityException(supportedGroup.name() + " not supported by KeyPairGenerator!");
        }
        this.m = keyPairGenerateKeyPair.getPrivate();
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        this.o = publicKey;
        this.k = supportedGroup;
        byte[] bArrEncodedPoint = supportedGroup.encodedPoint(publicKey);
        this.n = bArrEncodedPoint;
        c("OUT: ", publicKey, bArrEncodedPoint);
    }

    public SupportedGroup f() {
        return this.k;
    }

    public byte[] j() {
        return this.n;
    }

    public SecretKey b(byte[] bArr) throws GeneralSecurityException {
        KeyAgreement keyAgreementD;
        if (this.m == null) {
            throw new IllegalStateException("private key must not be destroyed");
        }
        PublicKey publicKeyDecodedPoint = this.k.decodedPoint(bArr);
        if (this.k.getAlgorithmName().equals(JceNames.EC)) {
            keyAgreementD = e.d();
        } else if (i != null && this.k.getAlgorithmName().equals("XDH")) {
            keyAgreementD = h.d();
        } else {
            throw new GeneralSecurityException(this.k.name() + " not supported by JCE!");
        }
        c("IN: ", publicKeyDecodedPoint, bArr);
        try {
            keyAgreementD.init(this.m);
            keyAgreementD.doPhase(publicKeyDecodedPoint, true);
            byte[] bArrGenerateSecret = keyAgreementD.generateSecret();
            SecretKey secretKeyE = aadd.e(bArrGenerateSecret, "TlsPremasterSecret");
            zzg.a(bArrGenerateSecret);
            return secretKeyE;
        } catch (InvalidKeyException e2) {
            f44580b.warn("Fail: {} {}", this.k.name(), e2.getMessage());
            throw e2;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        this.m = null;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.m == null;
    }

    private void c(String str, PublicKey publicKey, byte[] bArr) throws GeneralSecurityException {
        Logger logger = f44580b;
        if (logger.isDebugEnabled()) {
            byte[] encoded = publicKey.getEncoded();
            String strB = zzp.b(encoded);
            String strB2 = zzp.b(bArr);
            if (strB2.length() < strB.length()) {
                strB2 = String.format("%" + strB.length() + "s", strB2);
            }
            logger.debug("{}ASN1 encoded '{}'", str, strB);
            logger.debug("{}DHE  encoded '{}'", str, strB2);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (bArr[(bArr.length - i2) - 1] != encoded[(encoded.length - i2) - 1]) {
                    throw new GeneralSecurityException("DHE: failed to encoded point! " + this.k.name() + ", position: " + i2);
                }
            }
        }
    }

    public enum SupportedGroup {
        sect163k1(1, false),
        sect163r1(2, false),
        sect163r2(3, false),
        sect193r1(4, false),
        sect193r2(5, false),
        sect233k1(6, false),
        sect233r1(7, false),
        sect239k1(8, false),
        sect283k1(9, false),
        sect283r1(10, false),
        sect409k1(11, false),
        sect409r1(12, false),
        sect571k1(13, false),
        sect571r1(14, false),
        secp160k1(15, false),
        secp160r1(16, false),
        secp160r2(17, false),
        secp192k1(18, false),
        secp192r1(19, false),
        secp224k1(20, false),
        secp224r1(21, false),
        secp256k1(22, false),
        secp256r1(23, true),
        secp384r1(24, true),
        secp521r1(25, false),
        brainpoolP256r1(26, false),
        brainpoolP384r1(27, false),
        brainpoolP512r1(28, false),
        X25519(29, 32, "XDH", true),
        X448(30, 56, "XDH", true),
        ffdhe2048(256, false),
        ffdhe3072(257, false),
        ffdhe4096(258, false),
        ffdhe6144(259, false),
        ffdhe8192(260, false),
        arbitrary_explicit_prime_curves(65281, false),
        arbitrary_explicit_char2_curves(65282, false);

        private final String algorithmName;
        private final byte[] asn1header;
        private final int encodedPointSizeInBytes;
        private final int id;
        private final aacq keyFactory;
        private final int keySizeInBytes;
        private final boolean recommended;
        private final boolean usable;

        /* JADX WARN: Code duplicated, block: B:18:0x007d  */
        SupportedGroup(int i, boolean z) {
            int fieldSize;
            int i2;
            Throwable th;
            byte[] encoded;
            EllipticCurve curve;
            byte[] bArrCopyOf;
            this.id = i;
            this.algorithmName = JceNames.EC;
            this.recommended = z;
            try {
                KeyPairGenerator keyPairGeneratorD = XECDHECryptography.g.d();
                keyPairGeneratorD.initialize(new ECGenParameterSpec(name()), aacj.b());
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGeneratorD.generateKeyPair().getPublic();
                curve = eCPublicKey.getParams().getCurve();
                fieldSize = (curve.getField().getFieldSize() + 7) / 8;
                i2 = (fieldSize * 2) + 1;
                try {
                    XECDHECryptography.f44579a.put(curve, this);
                    encoded = eCPublicKey.getEncoded();
                    try {
                        bArrCopyOf = Arrays.copyOf(encoded, encoded.length - i2);
                    } catch (Throwable th2) {
                        th = th2;
                        XECDHECryptography.f44580b.trace("Group [{}] is not supported by JCE! {}", name(), th.getMessage());
                        curve = null;
                        bArrCopyOf = encoded;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    encoded = null;
                    XECDHECryptography.f44580b.trace("Group [{}] is not supported by JCE! {}", name(), th.getMessage());
                    curve = null;
                    bArrCopyOf = encoded;
                    this.keySizeInBytes = fieldSize;
                    this.encodedPointSizeInBytes = i2;
                    this.asn1header = bArrCopyOf;
                    this.usable = curve != null;
                    this.keyFactory = XECDHECryptography.j;
                    XECDHECryptography.f44581c.put(Integer.valueOf(i), this);
                }
            } catch (Throwable th4) {
                th = th4;
                fieldSize = 0;
                i2 = 0;
            }
            this.keySizeInBytes = fieldSize;
            this.encodedPointSizeInBytes = i2;
            this.asn1header = bArrCopyOf;
            this.usable = curve != null;
            this.keyFactory = XECDHECryptography.j;
            XECDHECryptography.f44581c.put(Integer.valueOf(i), this);
        }

        SupportedGroup(int i, int i2, String str, boolean z) {
            boolean z2;
            this.id = i;
            this.algorithmName = str;
            this.keySizeInBytes = i2;
            this.encodedPointSizeInBytes = i2;
            this.recommended = z;
            byte[] bArrCopyOf = null;
            try {
                KeyPairGenerator keyPairGeneratorD = XECDHECryptography.f.d();
                keyPairGeneratorD.initialize(new ECGenParameterSpec(name()), aacj.b());
                byte[] encoded = keyPairGeneratorD.generateKeyPair().getPublic().getEncoded();
                bArrCopyOf = Arrays.copyOf(encoded, encoded.length - i2);
                z2 = true;
            } catch (Throwable th) {
                XECDHECryptography.f44580b.trace("Group [{}] is not supported by JCE! {}", name(), th.getMessage());
                z2 = false;
            }
            this.usable = z2;
            this.asn1header = bArrCopyOf;
            this.keyFactory = XECDHECryptography.d;
            XECDHECryptography.f44581c.put(Integer.valueOf(i), this);
        }

        public int getId() {
            return this.id;
        }

        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public byte[] encodedPoint(PublicKey publicKey) throws GeneralSecurityException {
            if (publicKey == null) {
                throw new NullPointerException("public key must not be null!");
            }
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new GeneralSecurityException(name() + " not supported!");
            }
            return Arrays.copyOfRange(encoded, this.asn1header.length, encoded.length);
        }

        public PublicKey decodedPoint(byte[] bArr) throws GeneralSecurityException {
            if (bArr == null) {
                throw new NullPointerException("encoded point must not be null!");
            }
            if (this.encodedPointSizeInBytes != bArr.length) {
                throw new IllegalArgumentException("encoded point must have " + this.encodedPointSizeInBytes + " bytes, not " + bArr.length + "!");
            }
            return this.keyFactory.d().generatePublic(new X509EncodedKeySpec(zzg.c(this.asn1header, bArr)));
        }

        public static SupportedGroup fromId(int i) {
            return (SupportedGroup) XECDHECryptography.f44581c.get(Integer.valueOf(i));
        }

        public static SupportedGroup fromPublicKey(PublicKey publicKey) {
            if (publicKey != null) {
                if (!(publicKey instanceof ECPublicKey)) {
                    if (XECDHECryptography.i != null && XECDHECryptography.i.isSupporting(publicKey)) {
                        try {
                            return valueOf(XECDHECryptography.i.getCurveName(publicKey));
                        } catch (GeneralSecurityException unused) {
                        }
                    } else {
                        String strE = zzm.e(publicKey.getAlgorithm(), null);
                        if (JceNames.OID_ED25519.equals(strE) || JceNames.EDDSA.equalsIgnoreCase(strE)) {
                            return X25519;
                        }
                        if (JceNames.OID_ED448.equals(strE)) {
                            return X448;
                        }
                        XECDHECryptography.f44580b.warn("No supported curve {}/{}", publicKey.getAlgorithm(), strE);
                    }
                } else {
                    return (SupportedGroup) XECDHECryptography.f44579a.get(((ECPublicKey) publicKey).getParams().getCurve());
                }
            }
            return null;
        }

        public static boolean isEcPublicKey(PublicKey publicKey) {
            if (publicKey instanceof ECPublicKey) {
                return true;
            }
            return XECDHECryptography.i != null && XECDHECryptography.i.isSupporting(publicKey);
        }

        public static boolean isSupported(List<SupportedGroup> list, List<X509Certificate> list2) {
            SupportedGroup supportedGroupFromPublicKey;
            Iterator<X509Certificate> it = list2.iterator();
            while (it.hasNext()) {
                PublicKey publicKey = it.next().getPublicKey();
                if (isEcPublicKey(publicKey) && ((supportedGroupFromPublicKey = fromPublicKey(publicKey)) == null || !supportedGroupFromPublicKey.isUsable() || !list.contains(supportedGroupFromPublicKey))) {
                    return false;
                }
            }
            return true;
        }

        public int getKeySizeInBytes() {
            return this.keySizeInBytes;
        }

        public int getEncodedPointSizeInBytes() {
            return this.encodedPointSizeInBytes;
        }

        public boolean isUsable() {
            return this.usable;
        }

        public boolean isRecommended() {
            return this.recommended;
        }

        public static List<SupportedGroup> getUsableGroups() {
            return c.f44582b;
        }

        public static SupportedGroup[] getUsableGroupsArray() {
            return (SupportedGroup[]) c.f44582b.toArray(new SupportedGroup[c.f44582b.size()]);
        }

        public static List<SupportedGroup> getPreferredGroups() {
            return c.e;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final List<SupportedGroup> f44582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final SupportedGroup[] f44583c = {SupportedGroup.secp256r1, SupportedGroup.X25519, SupportedGroup.X448, SupportedGroup.secp384r1};
        private static final List<SupportedGroup> e;

        static {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (SupportedGroup supportedGroup : SupportedGroup.values()) {
                if (supportedGroup.isUsable()) {
                    arrayList.add(supportedGroup);
                }
            }
            for (SupportedGroup supportedGroup2 : f44583c) {
                if (supportedGroup2.isUsable()) {
                    arrayList2.add(supportedGroup2);
                }
            }
            if (arrayList2.isEmpty() && !arrayList.isEmpty()) {
                arrayList2.add(arrayList.get(0));
            }
            f44582b = Collections.unmodifiableList(arrayList);
            e = Collections.unmodifiableList(arrayList2);
        }
    }

    static class d implements XDHPublicKeyApi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f44584a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f44585c;
        private final Class<?> d;

        private d(Class<?> cls) {
            if (cls == null) {
                throw new NullPointerException("XECPublicKeyClass must not be null!");
            }
            this.d = cls;
            this.f44584a = null;
            this.f44585c = null;
        }

        private d(Class<?> cls, Method method, Method method2) {
            if (cls == null) {
                throw new NullPointerException("XECPublicKeyClass must not be null!");
            }
            if (method == null) {
                throw new NullPointerException("XECPublicKeyGetParams must not be null!");
            }
            if (method2 == null) {
                throw new NullPointerException("NamedParameterSpecGetName must not be null!");
            }
            this.d = cls;
            this.f44584a = method;
            this.f44585c = method2;
        }

        @Override // org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography.XDHPublicKeyApi
        public boolean isSupporting(PublicKey publicKey) {
            return this.d.isInstance(publicKey);
        }

        @Override // org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography.XDHPublicKeyApi
        public String getCurveName(PublicKey publicKey) throws GeneralSecurityException {
            if (this.d.isInstance(publicKey)) {
                Method method = this.f44584a;
                if (method != null && this.f44585c != null) {
                    try {
                        return (String) this.f44585c.invoke(method.invoke(publicKey, new Object[0]), new Object[0]);
                    } catch (Exception e) {
                        throw new GeneralSecurityException("X25519/X448 not supported by JRE!", e);
                    }
                }
                return publicKey.getAlgorithm();
            }
            throw new GeneralSecurityException(publicKey.getAlgorithm() + " not supported!");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XDHPublicKeyApi a() {
            try {
                if (zzm.a()) {
                    return new d(Class.forName("org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey"));
                }
                Method method = Class.forName("java.security.spec.NamedParameterSpec").getMethod("getName", new Class[0]);
                Class<?> cls = Class.forName("java.security.interfaces.XECPublicKey");
                return new d(cls, cls.getMethod("getParams", new Class[0]), method);
            } catch (Throwable unused) {
                XECDHECryptography.f44580b.info("X25519/X448 not supported!");
                return null;
            }
        }
    }
}
