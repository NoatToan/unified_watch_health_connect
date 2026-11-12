package defpackage;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class nt1 extends iei {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Provider f28344b;

    public nt1() {
        super(b());
    }

    public static Provider b() {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null) {
            return Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        }
        if (f28344b != null) {
            return f28344b;
        }
        f28344b = new BouncyCastleProvider();
        return f28344b;
    }
}
