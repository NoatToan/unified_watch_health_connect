package defpackage;

import java.security.Provider;
import java.security.Security;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class mt1 extends hei {
    public mt1() {
        super(b());
    }

    public static Provider b() {
        return Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null ? Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) : new BouncyCastleProvider();
    }
}
