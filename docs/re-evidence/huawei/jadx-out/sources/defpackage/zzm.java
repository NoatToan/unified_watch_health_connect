package defpackage;

import com.huawei.hms.network.embedded.a2;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.Cipher;
import org.eclipse.californium.elements.util.JceNames;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54820a = aaex.a((Class<?>) zzm.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[][] f54821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f54822c;
    private static volatile zzm d;
    private static final String[] e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final boolean i;
    private final boolean j;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    public static void d() {
    }

    static {
        String[] strArr = {JceNames.ED25519, "1.3.101.112", JceNames.OID_ED25519, JceNames.EDDSA, JceNames.ED25519v2};
        f54822c = strArr;
        String[] strArr2 = {JceNames.ED448, "1.3.101.113", JceNames.OID_ED448, JceNames.EDDSA, JceNames.ED448v2};
        e = strArr2;
        f54821b = new String[][]{new String[]{JceNames.DH, "DiffieHellman"}, new String[]{JceNames.EC, JceNames.ECv2}, strArr, strArr2, new String[]{JceNames.X25519, JceNames.X25519v2, JceNames.OID_X25519}, new String[]{JceNames.X448, JceNames.X448v2, JceNames.OID_X448}};
        try {
            try {
                Class.forName(AccessController.class.getName());
                h();
            } catch (Throwable th) {
                f54820a.error("JCE:", th);
            }
        } catch (ClassNotFoundException unused) {
            j();
        }
    }

    private static void h() {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: zzm.5
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void run() {
                try {
                    zzm.j();
                    return null;
                } catch (Throwable th) {
                    zzm.f54820a.error("JCE:", th);
                    return null;
                }
            }
        });
    }

    private static boolean d(Provider provider) {
        return provider != null && provider.getName().equals(JceNames.JCE_PROVIDER_BOUNCY_CASTLE);
    }

    private static boolean a(Provider provider) {
        return provider != null && provider.getClass().getName().equals("net.i2p.crypto.eddsa.EdDSASecurityProvider");
    }

    private static void d(Provider provider, String str, String str2) {
        if (str2.equals(provider.getProperty(str))) {
            return;
        }
        provider.setProperty(str, str2);
    }

    private static Provider d(String str) {
        try {
            Provider provider = (Provider) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            f54820a.debug("Loaded {}", str);
            return provider;
        } catch (Throwable th) {
            Logger logger = f54820a;
            if (logger.isTraceEnabled()) {
                logger.trace("Loading {} failed!", str, th);
                return null;
            }
            logger.debug("Loading {} failed!", str);
            return null;
        }
    }

    private static void f() {
        try {
            Class<?> cls = Class.forName("org.slf4j.bridge.SLF4JBridgeHandler");
            cls.getMethod("removeHandlersForRootLogger", new Class[0]).invoke(null, new Object[0]);
            cls.getMethod(JsbMapKeyNames.H5_TEXT_DOWNLOAD_INSTALL, new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException unused) {
            f54820a.warn("Setup BC logging failed, missing logging bridge 'jul-to-slf4j'!");
        } catch (Throwable th) {
            f54820a.warn("Setup BC logging failed!", th);
        }
    }

    private static String i() {
        String property = Security.getProperty("securerandom.strongAlgorithms");
        if (property != null) {
            if (property.contains("NativePRNGBlocking")) {
                Security.setProperty("securerandom.strongAlgorithms", property.replaceAll("NativePRNGBlocking", "NativePRNGNonBlocking"));
                return property;
            }
            SecureRandom secureRandom = new SecureRandom();
            String str = secureRandom.getAlgorithm() + ":";
            if (!property.contains(str)) {
                Security.setProperty("securerandom.strongAlgorithms", str + secureRandom.getProvider().getName() + "," + property);
                return property;
            }
            f54820a.info("Random: {} already in {}", str, property);
        }
        return property;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:105:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0253  */
    /* JADX WARN: Code duplicated, block: B:122:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0275  */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:132:0x028b A[LOOP:0: B:130:0x0288->B:132:0x028b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e0  */
    public static void j() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Provider provider;
        int maxAllowedKeyLength;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        Logger logger;
        String string;
        boolean z9;
        boolean z10;
        boolean z11;
        zzm zzmVar;
        Logger logger2;
        Provider[] providers;
        boolean z12;
        boolean z13;
        String strB;
        boolean zVerify;
        Provider providerD;
        String strI;
        Provider providerD2;
        String property;
        Provider providerD3;
        String strB2 = zzp.b(JceNames.CALIFORNIUM_JCE_PROVIDER);
        try {
            try {
                try {
                    try {
                        if (strB2 != null && !strB2.isEmpty()) {
                            f54820a.info("JCE setup: {}", strB2);
                            if (!JceNames.JCE_PROVIDER_SYSTEM.equalsIgnoreCase(strB2)) {
                                if (JceNames.JCE_PROVIDER_BOUNCY_CASTLE.equalsIgnoreCase(strB2)) {
                                    z3 = true;
                                    z = false;
                                    z4 = false;
                                    z2 = false;
                                } else if (JceNames.JCE_PROVIDER_BOUNCY_CASTLE_NON_BLOCKING_RANDOM.equalsIgnoreCase(strB2)) {
                                    z3 = true;
                                    z4 = true;
                                    z = false;
                                    z2 = false;
                                } else if (JceNames.JCE_PROVIDER_NET_I2P_CRYPTO.equalsIgnoreCase(strB2)) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                Provider provider2 = null;
                                provider = KeyFactory.getInstance(JceNames.EDDSA).getProvider();
                                if (z) {
                                    try {
                                        f54820a.trace("EdDSA from default jce {}", provider.getName());
                                    } catch (NoSuchAlgorithmException unused) {
                                    }
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5 && z3) {
                                    if (d(provider)) {
                                        f54820a.trace("EdDSA from BC");
                                        z5 = true;
                                    } else {
                                        f();
                                        if (z4) {
                                            strI = i();
                                        } else {
                                            strI = null;
                                        }
                                        providerD2 = d("org.bouncycastle.jce.provider.BouncyCastleProvider");
                                        if (providerD2 != null) {
                                            try {
                                                KeyFactory.getInstance(JceNames.EDDSA, providerD2);
                                                Security.removeProvider(providerD2.getName());
                                                Security.insertProviderAt(providerD2, 1);
                                                try {
                                                    new SecureRandom().nextInt();
                                                    property = Security.getProperty("securerandom.strongAlgorithms");
                                                    if (property == null) {
                                                        property = "not available";
                                                    }
                                                    Logger logger3 = f54820a;
                                                    logger3.info("StrongRandom: {}", property);
                                                    logger3.trace("EdDSA added from BC");
                                                } catch (SecurityException | NoSuchAlgorithmException unused2) {
                                                }
                                                z5 = true;
                                                provider = providerD2;
                                            } catch (SecurityException | NoSuchAlgorithmException unused3) {
                                            }
                                        }
                                        if (strI != null) {
                                            Security.setProperty("securerandom.strongAlgorithms", strI);
                                        }
                                        if (z5 && Security.getProvider("BCJSSE") == null && (providerD3 = d("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider")) != null) {
                                            Security.setProperty("ssl.KeyManagerFactory.algorithm", "PKIX");
                                            Security.setProperty("ssl.TrustManagerFactory.algorithm", "PKIX");
                                            try {
                                                Security.insertProviderAt(providerD3, 2);
                                                f54820a.trace("TLS from added BC");
                                            } catch (SecurityException unused4) {
                                            }
                                        }
                                    }
                                }
                                if (!z5 && z2) {
                                    if (a(provider)) {
                                        f54820a.trace("EdDSA from {}", "net.i2p.crypto.eddsa");
                                        z5 = true;
                                    } else {
                                        providerD = d("net.i2p.crypto.eddsa.EdDSASecurityProvider");
                                        if (providerD != null) {
                                            try {
                                                KeyFactory.getInstance(JceNames.EDDSA, providerD);
                                                Security.removeProvider(providerD.getName());
                                                Security.addProvider(providerD);
                                                try {
                                                    f54820a.trace("EdDSA added from {}", "net.i2p.crypto.eddsa");
                                                } catch (SecurityException | NoSuchAlgorithmException unused5) {
                                                }
                                                z5 = true;
                                                provider = providerD;
                                            } catch (SecurityException | NoSuchAlgorithmException unused6) {
                                            }
                                        }
                                    }
                                }
                                maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength("AES");
                                if (maxAllowedKeyLength == Integer.MAX_VALUE) {
                                    str = "not restricted";
                                } else {
                                    try {
                                        str = "restricted to " + maxAllowedKeyLength + " bits key length";
                                    } catch (NoSuchAlgorithmException unused7) {
                                        str = a2.d;
                                    }
                                }
                                f54820a.debug("AES: {}", str);
                                KeyFactory.getInstance(JceNames.RSA);
                                z6 = true;
                                f54820a.debug("RSA: {}", Boolean.valueOf(z6));
                                KeyFactory.getInstance(JceNames.EC);
                                z7 = true;
                                f54820a.debug("EC: {}", Boolean.valueOf(z7));
                                if (z7 || ((strB = zzp.b(JceNames.CALIFORNIUM_JCE_ECDSA_FIX)) != null && strB.equalsIgnoreCase("false"))) {
                                    z8 = false;
                                } else {
                                    try {
                                        Signature signature = Signature.getInstance("SHA256withECDSA");
                                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(JceNames.EC);
                                        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                                        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                                        byte[] bArrD = zzp.d("3006020100020100");
                                        signature.initVerify(keyPairGenerateKeyPair.getPublic());
                                        signature.update(bArrD);
                                        zVerify = signature.verify(bArrD);
                                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException unused8) {
                                        zVerify = true;
                                    }
                                    f54820a.debug("ECDSA {}vulnerable.", zVerify ? "" : "not ");
                                    z8 = zVerify;
                                }
                                logger = f54820a;
                                if (!logger.isDebugEnabled()) {
                                    logger.info("RSA: {}, EC: {}, AES: {}", Boolean.valueOf(z6), Boolean.valueOf(z7), str);
                                }
                                if (provider == null) {
                                    string = "n.a.";
                                } else {
                                    string = Double.toString(provider.getVersion());
                                }
                                String str2 = string;
                                if (!z5 && provider != null) {
                                    if (d(provider)) {
                                        d(provider, "Alg.Alias.KeyFactory.OID.1.3.101.112", JceNames.ED25519);
                                        d(provider, "Alg.Alias.KeyFactory.OID.1.3.101.113", JceNames.ED448);
                                    } else if (a(provider)) {
                                        d(provider, "Alg.Alias.KeyFactory.Ed25519", JceNames.EDDSA);
                                        d(provider, "Alg.Alias.Signature.Ed25519", "NONEwithEdDSA");
                                    }
                                    try {
                                        KeyFactory.getInstance(JceNames.ED25519);
                                        z12 = true;
                                    } catch (NoSuchAlgorithmException unused9) {
                                        z12 = false;
                                    }
                                    try {
                                        KeyFactory.getInstance(JceNames.ED448);
                                        z13 = true;
                                    } catch (NoSuchAlgorithmException unused10) {
                                        z13 = false;
                                    }
                                    f54820a.info("EdDSA supported by {}, Ed25519: {}, Ed448: {}", provider.getName(), Boolean.valueOf(z12), Boolean.valueOf(z13));
                                    z9 = z12;
                                    z10 = z13;
                                    provider2 = provider;
                                } else {
                                    logger.info("EdDSA not supported!");
                                    z9 = false;
                                    z10 = false;
                                }
                                boolean zD = d(provider2);
                                if (maxAllowedKeyLength >= 256) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                zzmVar = new zzm(zD, z6, z7, z9, z10, z11, z8, str2);
                                if (!zzmVar.equals(d)) {
                                    d = zzmVar;
                                }
                                logger2 = f54820a;
                                logger2.info("JCE setup: {}, ready.", provider2);
                                if (logger2.isDebugEnabled()) {
                                    providers = Security.getProviders();
                                    for (int i = 0; i < providers.length; i++) {
                                        f54820a.debug("Security Provider [{}]: {}.", Integer.valueOf(i), providers[i]);
                                    }
                                    f54820a.trace("JCE setup callstack:", new Throwable("JCE setup"));
                                }
                            }
                            z = true;
                            z3 = false;
                            z4 = false;
                            z2 = false;
                            Provider provider3 = null;
                            provider = KeyFactory.getInstance(JceNames.EDDSA).getProvider();
                            if (z) {
                                f54820a.trace("EdDSA from default jce {}", provider.getName());
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                if (d(provider)) {
                                    f54820a.trace("EdDSA from BC");
                                    z5 = true;
                                } else {
                                    f();
                                    if (z4) {
                                        strI = i();
                                    } else {
                                        strI = null;
                                    }
                                    providerD2 = d("org.bouncycastle.jce.provider.BouncyCastleProvider");
                                    if (providerD2 != null) {
                                        KeyFactory.getInstance(JceNames.EDDSA, providerD2);
                                        Security.removeProvider(providerD2.getName());
                                        Security.insertProviderAt(providerD2, 1);
                                        new SecureRandom().nextInt();
                                        property = Security.getProperty("securerandom.strongAlgorithms");
                                        if (property == null) {
                                            property = "not available";
                                        }
                                        Logger logger4 = f54820a;
                                        logger4.info("StrongRandom: {}", property);
                                        logger4.trace("EdDSA added from BC");
                                        z5 = true;
                                        provider = providerD2;
                                    }
                                    if (strI != null) {
                                        Security.setProperty("securerandom.strongAlgorithms", strI);
                                    }
                                    if (z5) {
                                        Security.setProperty("ssl.KeyManagerFactory.algorithm", "PKIX");
                                        Security.setProperty("ssl.TrustManagerFactory.algorithm", "PKIX");
                                        Security.insertProviderAt(providerD3, 2);
                                        f54820a.trace("TLS from added BC");
                                    }
                                }
                            }
                            if (!z5) {
                                if (a(provider)) {
                                    f54820a.trace("EdDSA from {}", "net.i2p.crypto.eddsa");
                                    z5 = true;
                                } else {
                                    providerD = d("net.i2p.crypto.eddsa.EdDSASecurityProvider");
                                    if (providerD != null) {
                                        KeyFactory.getInstance(JceNames.EDDSA, providerD);
                                        Security.removeProvider(providerD.getName());
                                        Security.addProvider(providerD);
                                        f54820a.trace("EdDSA added from {}", "net.i2p.crypto.eddsa");
                                        z5 = true;
                                        provider = providerD;
                                    }
                                }
                            }
                            maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength("AES");
                            if (maxAllowedKeyLength == Integer.MAX_VALUE) {
                                str = "not restricted";
                            } else {
                                str = "restricted to " + maxAllowedKeyLength + " bits key length";
                            }
                            f54820a.debug("AES: {}", str);
                            KeyFactory.getInstance(JceNames.RSA);
                            z6 = true;
                            f54820a.debug("RSA: {}", Boolean.valueOf(z6));
                            KeyFactory.getInstance(JceNames.EC);
                            z7 = true;
                            f54820a.debug("EC: {}", Boolean.valueOf(z7));
                            if (z7) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            logger = f54820a;
                            if (!logger.isDebugEnabled()) {
                                logger.info("RSA: {}, EC: {}, AES: {}", Boolean.valueOf(z6), Boolean.valueOf(z7), str);
                            }
                            if (provider == null) {
                                string = "n.a.";
                            } else {
                                string = Double.toString(provider.getVersion());
                            }
                            String str3 = string;
                            if (!z5) {
                                logger.info("EdDSA not supported!");
                                z9 = false;
                                z10 = false;
                            } else {
                                logger.info("EdDSA not supported!");
                                z9 = false;
                                z10 = false;
                            }
                            boolean zD2 = d(provider3);
                            if (maxAllowedKeyLength >= 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zzmVar = new zzm(zD2, z6, z7, z9, z10, z11, z8, str3);
                            if (!zzmVar.equals(d)) {
                                d = zzmVar;
                            }
                            logger2 = f54820a;
                            logger2.info("JCE setup: {}, ready.", provider3);
                            if (logger2.isDebugEnabled()) {
                                providers = Security.getProviders();
                                while (i < providers.length) {
                                    f54820a.debug("Security Provider [{}]: {}.", Integer.valueOf(i), providers[i]);
                                }
                                f54820a.trace("JCE setup callstack:", new Throwable("JCE setup"));
                            }
                        }
                        f54820a.info("JCE default setup");
                        z = true;
                        KeyFactory.getInstance(JceNames.EC);
                        z7 = true;
                    } catch (NoSuchAlgorithmException unused11) {
                        z7 = false;
                    }
                    maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength("AES");
                    if (maxAllowedKeyLength == Integer.MAX_VALUE) {
                        str = "not restricted";
                    } else {
                        str = "restricted to " + maxAllowedKeyLength + " bits key length";
                    }
                } catch (NoSuchAlgorithmException unused12) {
                    maxAllowedKeyLength = 0;
                }
                provider = KeyFactory.getInstance(JceNames.EDDSA).getProvider();
                if (z) {
                    f54820a.trace("EdDSA from default jce {}", provider.getName());
                    z5 = true;
                } else {
                    z5 = false;
                }
            } catch (NoSuchAlgorithmException unused13) {
                z5 = false;
                provider = null;
            }
            KeyFactory.getInstance(JceNames.RSA);
            z6 = true;
        } catch (NoSuchAlgorithmException unused14) {
            z6 = false;
        }
        z2 = true;
        z3 = false;
        z4 = false;
        Provider provider4 = null;
        if (!z5) {
            if (d(provider)) {
                f54820a.trace("EdDSA from BC");
                z5 = true;
            } else {
                f();
                if (z4) {
                    strI = i();
                } else {
                    strI = null;
                }
                providerD2 = d("org.bouncycastle.jce.provider.BouncyCastleProvider");
                if (providerD2 != null) {
                    KeyFactory.getInstance(JceNames.EDDSA, providerD2);
                    Security.removeProvider(providerD2.getName());
                    Security.insertProviderAt(providerD2, 1);
                    new SecureRandom().nextInt();
                    property = Security.getProperty("securerandom.strongAlgorithms");
                    if (property == null) {
                        property = "not available";
                    }
                    Logger logger5 = f54820a;
                    logger5.info("StrongRandom: {}", property);
                    logger5.trace("EdDSA added from BC");
                    z5 = true;
                    provider = providerD2;
                }
                if (strI != null) {
                    Security.setProperty("securerandom.strongAlgorithms", strI);
                }
                if (z5) {
                    Security.setProperty("ssl.KeyManagerFactory.algorithm", "PKIX");
                    Security.setProperty("ssl.TrustManagerFactory.algorithm", "PKIX");
                    Security.insertProviderAt(providerD3, 2);
                    f54820a.trace("TLS from added BC");
                }
            }
        }
        if (!z5) {
            if (a(provider)) {
                f54820a.trace("EdDSA from {}", "net.i2p.crypto.eddsa");
                z5 = true;
            } else {
                providerD = d("net.i2p.crypto.eddsa.EdDSASecurityProvider");
                if (providerD != null) {
                    KeyFactory.getInstance(JceNames.EDDSA, providerD);
                    Security.removeProvider(providerD.getName());
                    Security.addProvider(providerD);
                    f54820a.trace("EdDSA added from {}", "net.i2p.crypto.eddsa");
                    z5 = true;
                    provider = providerD;
                }
            }
        }
        f54820a.debug("AES: {}", str);
        f54820a.debug("RSA: {}", Boolean.valueOf(z6));
        f54820a.debug("EC: {}", Boolean.valueOf(z7));
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        logger = f54820a;
        if (!logger.isDebugEnabled()) {
            logger.info("RSA: {}, EC: {}, AES: {}", Boolean.valueOf(z6), Boolean.valueOf(z7), str);
        }
        if (provider == null) {
            string = "n.a.";
        } else {
            string = Double.toString(provider.getVersion());
        }
        String str4 = string;
        if (!z5) {
            logger.info("EdDSA not supported!");
            z9 = false;
            z10 = false;
        } else {
            logger.info("EdDSA not supported!");
            z9 = false;
            z10 = false;
        }
        boolean zD3 = d(provider4);
        if (maxAllowedKeyLength >= 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzmVar = new zzm(zD3, z6, z7, z9, z10, z11, z8, str4);
        if (!zzmVar.equals(d)) {
            d = zzmVar;
        }
        logger2 = f54820a;
        logger2.info("JCE setup: {}, ready.", provider4);
        if (logger2.isDebugEnabled()) {
            providers = Security.getProviders();
            while (i < providers.length) {
                f54820a.debug("Security Provider [{}]: {}.", Integer.valueOf(i), providers[i]);
            }
            f54820a.trace("JCE setup callstack:", new Throwable("JCE setup"));
        }
    }

    public static boolean a() {
        return d.o;
    }

    public static boolean b() {
        return d.j;
    }

    public static boolean b(String str) {
        if (JceNames.EC.equalsIgnoreCase(str)) {
            return d.f;
        }
        if (JceNames.RSA.equalsIgnoreCase(str)) {
            return d.m;
        }
        String strE = e(str, null);
        if (JceNames.OID_ED25519.equals(strE)) {
            return d.i;
        }
        if (JceNames.OID_ED448.equals(strE)) {
            return d.g;
        }
        if (JceNames.EDDSA.equalsIgnoreCase(str)) {
            return d.i || d.g;
        }
        return false;
    }

    public static String e(String str, String str2) {
        if (JceNames.EDDSA.equalsIgnoreCase(str)) {
            return JceNames.EDDSA;
        }
        if (zzp.a(f54822c, str)) {
            return JceNames.OID_ED25519;
        }
        return zzp.a(e, str) ? JceNames.OID_ED448 : str2;
    }

    public static boolean c(String str, String str2) {
        if (str != null && str.equals(str2)) {
            return true;
        }
        for (String[] strArr : f54821b) {
            if (zzp.a(strArr, str) && zzp.a(strArr, str2)) {
                return true;
            }
        }
        return false;
    }

    private zzm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str) {
        this.o = z;
        this.m = z2;
        this.f = z3;
        this.i = z4;
        this.g = z5;
        this.n = z6;
        this.j = z7;
        this.h = str;
    }

    public int hashCode() {
        int i = this.i ? 41 : 37;
        int i2 = this.g ? 41 : 37;
        int i3 = this.n ? 41 : 37;
        int i4 = this.f ? 41 : 37;
        return ((((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (this.m ? 41 : 37)) * 31) + (this.o ? 41 : 37)) * 31) + this.h.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.i == zzmVar.i && this.g == zzmVar.g && this.n == zzmVar.n && this.f == zzmVar.f && this.m == zzmVar.m && this.o == zzmVar.o && this.h.equals(zzmVar.h);
    }
}
