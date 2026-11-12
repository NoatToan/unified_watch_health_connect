package org.spongycastle.jce.provider;

import cn.hutool.crypto.digest.SM3;
import cn.hutool.crypto.symmetric.SM4;
import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.e53;
import defpackage.eai;
import defpackage.eei;
import defpackage.fe;
import defpackage.ld4;
import defpackage.rno;
import defpackage.v51;
import defpackage.zk1;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BouncyCastleProvider extends Provider implements ld4 {
    private static final String ASYMMETRIC_PACKAGE = "org.spongycastle.jcajce.provider.asymmetric.";
    private static final String DIGEST_PACKAGE = "org.spongycastle.jcajce.provider.digest.";
    private static final String KEYSTORE_PACKAGE = "org.spongycastle.jcajce.provider.keystore.";
    public static final String PROVIDER_NAME = "SC";
    private static final String SYMMETRIC_PACKAGE = "org.spongycastle.jcajce.provider.symmetric.";
    private static String info = "BouncyCastle Security Provider v1.54";
    public static final eei CONFIGURATION = new e53();
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] SYMMETRIC_GENERIC = {"PBEPBKDF2", "PBEPKCS12"};
    private static final String[] SYMMETRIC_MACS = {"SipHash"};
    private static final String[] SYMMETRIC_CIPHERS = {"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", SM4.ALGORITHM_NAME, "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF"};
    private static final String[] ASYMMETRIC_GENERIC = {"X509", "IES"};
    private static final String[] ASYMMETRIC_CIPHERS = {"DSA", "DH", "EC", SignUtils.KEY_RSA, "GOST", "ECGOST", "ElGamal", "DSTU4145"};
    private static final String[] DIGESTS = {"GOST3411", "Keccak", "MD2", "MD4", Coder.KEY_MD5, "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", SM3.ALGORITHM_NAME, "Tiger", "Whirlpool", "Blake2b"};
    private static final String[] KEYSTORES = {org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, "PKCS12"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastleProvider.this.setup();
            return null;
        }
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.54d, info);
        AccessController.doPrivileged(new a());
    }

    public static PrivateKey getPrivateKey(eai eaiVar) throws IOException {
        zk1 zk1Var = (zk1) keyInfoConverters.get(eaiVar.i().g());
        if (zk1Var == null) {
            return null;
        }
        return zk1Var.b(eaiVar);
    }

    public static PublicKey getPublicKey(rno rnoVar) throws IOException {
        zk1 zk1Var = (zk1) keyInfoConverters.get(rnoVar.g().g());
        if (zk1Var == null) {
            return null;
        }
        return zk1Var.a(rnoVar);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        Class<?> clsLoadClass;
        for (int i = 0; i != strArr.length; i++) {
            try {
                ClassLoader classLoader = BouncyCastleProvider.class.getClassLoader();
                clsLoadClass = classLoader != null ? classLoader.loadClass(str + strArr[i] + "$Mappings") : Class.forName(str + strArr[i] + "$Mappings");
            } catch (ClassNotFoundException unused) {
                clsLoadClass = null;
            }
            if (clsLoadClass != null) {
                try {
                    ((v51) clsLoadClass.newInstance()).a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(DIGEST_PACKAGE, DIGESTS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_GENERIC);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_MACS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_CIPHERS);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_GENERIC);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_CIPHERS);
        loadAlgorithms(KEYSTORE_PACKAGE, KEYSTORES);
        put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    public void addKeyInfoConverter(fe feVar, zk1 zk1Var) {
        keyInfoConverters.put(feVar, zk1Var);
    }

    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    public void setParameter(String str, Object obj) {
        eei eeiVar = CONFIGURATION;
        synchronized (eeiVar) {
            ((e53) eeiVar).b(str, obj);
        }
    }

    public void addAlgorithm(String str, fe feVar, String str2) {
        addAlgorithm(str + "." + feVar, str2);
        addAlgorithm(str + ".OID." + feVar, str2);
    }
}
