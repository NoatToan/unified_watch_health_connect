package org.bouncycastle.pqc.jcajce.provider;

import defpackage.al1;
import defpackage.ee;
import defpackage.fei;
import defpackage.md4;
import defpackage.w51;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BouncyCastlePQCProvider extends Provider implements md4 {
    private static final String ALGORITHM_PACKAGE = "org.bouncycastle.pqc.jcajce.provider.";
    public static final fei CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";
    private static String info = "BouncyCastle Post-Quantum Security Provider v1.59";
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] ALGORITHMS = {"Rainbow", "McEliece", "SPHINCS", "NH", "XMSS"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastlePQCProvider.this.setup();
            return null;
        }
    }

    public static class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29524a;

        public b(String str) {
            this.f29524a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f29524a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.59d, info);
        AccessController.doPrivileged(new a());
    }

    private static al1 getAsymmetricKeyInfoConverter(ee eeVar) {
        al1 al1Var;
        Map map = keyInfoConverters;
        synchronized (map) {
            al1Var = (al1) map.get(eeVar);
        }
        return al1Var;
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        al1 asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(privateKeyInfo.i().g());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.a(privateKeyInfo);
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        al1 asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(subjectPublicKeyInfo.g().g());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.b(subjectPublicKeyInfo);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class clsLoadClass = loadClass(BouncyCastlePQCProvider.class, str + strArr[i] + "$Mappings");
            if (clsLoadClass != null) {
                try {
                    ((w51) clsLoadClass.newInstance()).a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    public static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
    }

    public void addAlgorithm(String str, ee eeVar, String str2) {
        if (!containsKey(str + "." + str2)) {
            throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
        }
        addAlgorithm(str + "." + eeVar, str2);
        addAlgorithm(str + ".OID." + eeVar, str2);
    }

    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    public void addKeyInfoConverter(ee eeVar, al1 al1Var) {
        Map map = keyInfoConverters;
        synchronized (map) {
            map.put(eeVar, al1Var);
        }
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
        synchronized (CONFIGURATION) {
        }
    }

    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }
}
