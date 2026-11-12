package org.spongycastle.pqc.jcajce.provider;

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
public class BouncyCastlePQCProvider extends Provider implements ld4 {
    private static final String ALGORITHM_PACKAGE = "org.spongycastle.pqc.jcajce.provider.";
    public static final eei CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";
    private static String info = "BouncyCastle Post-Quantum Security Provider v1.54";
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] ALGORITHMS = {"Rainbow", "McEliece"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastlePQCProvider.this.setup();
            return null;
        }
    }

    public BouncyCastlePQCProvider() {
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
                ClassLoader classLoader = getClass().getClassLoader();
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
        loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
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
        synchronized (CONFIGURATION) {
        }
    }

    public void addAlgorithm(String str, fe feVar, String str2) {
        if (containsKey(str + "." + str2)) {
            addAlgorithm(str + "." + feVar, str2);
            addAlgorithm(str + ".OID." + feVar, str2);
            return;
        }
        throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
    }
}
