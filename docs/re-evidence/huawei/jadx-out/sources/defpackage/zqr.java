package defpackage;

import net.openid.appauth.browser.BrowserMatcher;
import net.openid.appauth.connectivity.ConnectionBuilder;

/* JADX INFO: loaded from: classes20.dex */
public class zqr {
    public static final zqr d = new a().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionBuilder f54487b;
    private final BrowserMatcher e;

    private zqr(BrowserMatcher browserMatcher, ConnectionBuilder connectionBuilder, Boolean bool) {
        this.e = browserMatcher;
        this.f54487b = connectionBuilder;
        this.f54486a = bool.booleanValue();
    }

    public BrowserMatcher a() {
        return this.e;
    }

    public ConnectionBuilder e() {
        return this.f54487b;
    }

    public boolean d() {
        return this.f54486a;
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f54490c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BrowserMatcher f54489b = zrm.d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ConnectionBuilder f54488a = zrr.f54554a;

        public a c(BrowserMatcher browserMatcher) {
            zre.c(browserMatcher, "browserMatcher cannot be null");
            this.f54489b = browserMatcher;
            return this;
        }

        public a b(ConnectionBuilder connectionBuilder) {
            zre.c(connectionBuilder, "connectionBuilder cannot be null");
            this.f54488a = connectionBuilder;
            return this;
        }

        public zqr d() {
            return new zqr(this.f54489b, this.f54488a, Boolean.valueOf(this.f54490c));
        }
    }
}
