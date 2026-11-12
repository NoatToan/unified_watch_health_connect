package defpackage;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public class gpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider f19210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f19211b;

    public gpd() {
        this(null, null);
    }

    public Provider a() {
        return this.f19210a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f19211b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    public gpd(Provider provider, SecureRandom secureRandom) {
        this.f19210a = provider;
        this.f19211b = secureRandom;
    }
}
