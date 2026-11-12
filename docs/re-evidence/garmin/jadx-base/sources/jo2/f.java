package jo2;

import java.security.Provider;
import java.security.Security;
import org.conscrypt.Conscrypt;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo2/f;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f99840a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f99841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Provider f99842c;

    static {
        int i14 = gt2.c.f79010a;
        f99841b = gt2.b.f79005a.h("PAY#NEW_FITPAY#SecurityProvider");
    }

    private f() {
    }

    public static void a() {
        try {
            if (f99842c == null && Conscrypt.isAvailable()) {
                f99842c = Conscrypt.newProvider();
            }
            Provider provider = f99842c;
            if (provider != null) {
                Security.removeProvider(provider.getName());
                Security.insertProviderAt(f99842c, 1);
            }
        } catch (Exception e4) {
            f99841b.error("error while initializing security provider...", (Throwable) e4);
        }
    }
}
