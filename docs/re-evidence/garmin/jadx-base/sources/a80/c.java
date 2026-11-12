package a80;

import f12.l;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La80/c;", "La80/b;", "Lf12/l;", "sharedPreferences", "<init>", "(Lf12/l;)V", "a", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f1927a;

    static {
        new a(null);
    }

    public c(l lVar) {
        lVar.getClass();
        this.f1927a = lVar;
    }

    @Override // a80.b
    public final r53.b a() {
        return s.f(new h(this, null));
    }

    @Override // a80.b
    public final r53.b b() {
        return s.f(new g(this, null));
    }

    @Override // a80.b
    public final void c(boolean z14) {
        this.f1927a.O2("key_should_use_contentful_test_environment", z14);
    }

    @Override // a80.b
    public final boolean d() {
        return this.f1927a.W2("key_should_use_contentful_test_environment", false);
    }

    @Override // a80.b
    public final void e(boolean z14) {
        this.f1927a.O2("key_should_show_unpublished_contentful_content", z14);
    }

    @Override // a80.b
    public final DateTime f() {
        return new DateTime(this.f1927a.D3(0L, "keyPendingSubscriptionDate"));
    }

    @Override // a80.b
    public final void g(boolean z14) {
        this.f1927a.O2("keyHasEnteredExclusiveOffersPage", z14);
    }

    @Override // a80.b
    public final boolean h() {
        return this.f1927a.W2("key_should_show_unpublished_contentful_content", false);
    }

    @Override // a80.b
    public final boolean i() {
        return !this.f1927a.L1("keyDisplayedWelcomeCardForSubIds").isEmpty();
    }

    @Override // a80.b
    public final r53.b j() {
        return s.f(new e(this, null));
    }

    @Override // a80.b
    public final void k(DateTime dateTime) {
        this.f1927a.h2(dateTime.getMillis(), "keyPendingSubscriptionDate");
    }

    @Override // a80.b
    public final r53.b l() {
        return s.f(new f(this, null));
    }

    @Override // a80.b
    public final boolean m() {
        return this.f1927a.W2("keyHasEnteredExclusiveOffersPage", false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"La80/c$a;", "", "<init>", "()V", "", "SHOULD_TARGET_UAC", "Ljava/lang/String;", "SHOULD_SHOW_UNPUBLISHED_CONTENTFUL_CONTENT", "SHOULD_USE_CONTENTFUL_TEST_ENVIRONMENT", "PENDING_SUBSCRIPTION_DATE", "DISPLAYED_WELCOME_CARD_FOR_SUB_IDS", "HAS_ENTERED_EXCLUSIVE_OFFERS_PAGE", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
