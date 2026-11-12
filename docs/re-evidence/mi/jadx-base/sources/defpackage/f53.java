package defpackage;

import java.security.Permission;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class f53 implements fei {
    public static Permission g = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalEcImplicitlyCa");
    public static Permission h = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "ecImplicitlyCa");
    public static Permission i = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalDhDefaultParams");
    public static Permission j = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "DhDefaultParams");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Permission f17412k = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "acceptableEcCurves");
    public static Permission l = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "additionalEcParameters");
    public volatile f97 c;
    public volatile Object d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadLocal f17413a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadLocal f17414b = new ThreadLocal();
    public volatile Set e = new HashSet();
    public volatile Map f = new HashMap();

    @Override // defpackage.fei
    public f97 a() {
        f97 f97Var = (f97) this.f17413a.get();
        return f97Var != null ? f97Var : this.c;
    }

    @Override // defpackage.fei
    public Set b() {
        return Collections.unmodifiableSet(this.e);
    }

    @Override // defpackage.fei
    public Map c() {
        return Collections.unmodifiableMap(this.f);
    }

    public void d(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals("threadLocalEcImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(g);
            }
            f97 f97VarG = ((obj instanceof f97) || obj == null) ? (f97) obj : t77.g((ECParameterSpec) obj, false);
            if (f97VarG != null) {
                this.f17413a.set(f97VarG);
                return;
            }
            threadLocal = this.f17413a;
        } else {
            if (str.equals("ecImplicitlyCa")) {
                if (securityManager != null) {
                    securityManager.checkPermission(h);
                }
                if ((obj instanceof f97) || obj == null) {
                    this.c = (f97) obj;
                    return;
                } else {
                    this.c = t77.g((ECParameterSpec) obj, false);
                    return;
                }
            }
            if (!str.equals("threadLocalDhDefaultParams")) {
                if (str.equals("DhDefaultParams")) {
                    if (securityManager != null) {
                        securityManager.checkPermission(j);
                    }
                    if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                        throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                    }
                    this.d = obj;
                    return;
                }
                if (str.equals("acceptableEcCurves")) {
                    if (securityManager != null) {
                        securityManager.checkPermission(f17412k);
                    }
                    this.e = (Set) obj;
                    return;
                } else {
                    if (str.equals("additionalEcParameters")) {
                        if (securityManager != null) {
                            securityManager.checkPermission(l);
                        }
                        this.f = (Map) obj;
                        return;
                    }
                    return;
                }
            }
            if (securityManager != null) {
                securityManager.checkPermission(i);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.f17414b;
            if (obj != null) {
                threadLocal.set(obj);
                return;
            }
        }
        threadLocal.remove();
    }
}
