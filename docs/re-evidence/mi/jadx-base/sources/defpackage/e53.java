package defpackage;

import java.security.Permission;
import java.security.spec.ECParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class e53 implements eei {
    public static Permission e = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalEcImplicitlyCa");
    public static Permission f = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "ecImplicitlyCa");
    public static Permission g = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalDhDefaultParams");
    public static Permission h = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "DhDefaultParams");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadLocal f16273a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadLocal f16274b = new ThreadLocal();
    public volatile e97 c;
    public volatile Object d;

    @Override // defpackage.eei
    public e97 a() {
        e97 e97Var = (e97) this.f16273a.get();
        return e97Var != null ? e97Var : this.c;
    }

    public void b(String str, Object obj) {
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals("threadLocalEcImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(e);
            }
            e97 e97VarF = ((obj instanceof e97) || obj == null) ? (e97) obj : s77.f((ECParameterSpec) obj, false);
            if (e97VarF == null) {
                this.f16273a.remove();
                return;
            } else {
                this.f16273a.set(e97VarF);
                return;
            }
        }
        if (str.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(f);
            }
            if ((obj instanceof e97) || obj == null) {
                this.c = (e97) obj;
                return;
            } else {
                this.c = s77.f((ECParameterSpec) obj, false);
                return;
            }
        }
        if (!str.equals("threadLocalDhDefaultParams")) {
            if (str.equals("DhDefaultParams")) {
                if (securityManager != null) {
                    securityManager.checkPermission(h);
                }
                if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                    throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                }
                this.d = obj;
                return;
            }
            return;
        }
        if (securityManager != null) {
            securityManager.checkPermission(g);
        }
        if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
            throw new IllegalArgumentException("not a valid DHParameterSpec");
        }
        if (obj == null) {
            this.f16274b.remove();
        } else {
            this.f16274b.set(obj);
        }
    }
}
