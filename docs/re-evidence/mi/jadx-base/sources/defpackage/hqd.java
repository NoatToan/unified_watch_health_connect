package defpackage;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public final class hqd extends gpd {
    public Provider c;
    public Provider d;
    public Provider e;

    public hqd() {
        this(null, null, null, null, null);
    }

    public Provider c() {
        Provider provider = this.d;
        return provider != null ? provider : a();
    }

    public Provider d() {
        Provider provider = this.c;
        return provider != null ? provider : a();
    }

    public Provider e() {
        Provider provider = this.e;
        return provider != null ? provider : a();
    }

    public hqd(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }
}
