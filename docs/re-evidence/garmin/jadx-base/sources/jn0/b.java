package jn0;

import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljn0/b;", "Ljn0/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements jn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f99603a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f99603a = lVar;
    }

    @Override // jn0.a
    public final void a(boolean z14) {
        this.f99603a.O2("key_health_status_outliers_notification_enabled", z14);
    }

    @Override // jn0.a
    public final void b() {
        this.f99603a.O2("key_has_viewed_health_status_feature", true);
    }

    @Override // jn0.a
    public final boolean c() {
        return this.f99603a.W2("key_health_status_outliers_notification_enabled", true);
    }

    @Override // jn0.a
    public final boolean d() {
        return this.f99603a.W2("key_has_viewed_health_status_feature", false);
    }

    @Override // jn0.a
    public final boolean e() {
        return this.f99603a.W2("key_health_status_tracking_banner", true);
    }

    @Override // jn0.a
    public final void f(boolean z14) {
        this.f99603a.O2("key_health_status_tracking_banner", z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ljn0/b$a;", "", "<init>", "()V", "", "HEALTH_STATUS_OUTLIERS_NOTIFICATION_ENABLED", "Ljava/lang/String;", "HEALTH_STATUS_TRACKING_BANNER", "HAS_VIEWED_HEALTH_STATUS_FEATURE", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
