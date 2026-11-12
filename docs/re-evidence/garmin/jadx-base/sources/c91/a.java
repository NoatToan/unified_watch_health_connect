package c91;

import c22.k;
import f12.l;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lc91/a;", "La80/a;", "Lc91/b;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a80.a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f26051a;

    static {
        new C0396a(null);
    }

    public a(l lVar) {
        lVar.getClass();
        this.f26051a = lVar;
    }

    @Override // a80.a, c91.b
    public final boolean a() {
        return ((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("cppi_beta");
    }

    @Override // a80.a
    public final boolean b() {
        return this.f26051a.W2("keyHasSeenInsightsPermissionDialog", false);
    }

    @Override // a80.a
    public final Set<String> c() {
        l lVar = this.f26051a;
        long jL3 = lVar.l3("keyAiSupportedLanguagesLastRefreshed");
        if (jL3 >= 0) {
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            if (!LocalDateTime.ofEpochSecond(jL3, 0, zoneOffset).isBefore(LocalDateTime.now(zoneOffset).minusDays(1L))) {
                return lVar.L1("keyAiSupportedLanguages");
            }
        }
        return l0.f134950a;
    }

    @Override // c91.b
    public final void d() {
        this.f26051a.O2("keyPersonalizedInsightsTooltipViewed", true);
    }

    @Override // a80.a
    public final void e(boolean z14) {
        this.f26051a.O2("keyHasSeenInsightsPermissionDialog", z14);
    }

    @Override // a80.a
    public final void f(Set<String> set) {
        set.getClass();
        l lVar = this.f26051a;
        lVar.X1("keyAiSupportedLanguages", set);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        lVar.h2(LocalDateTime.now(zoneOffset).toEpochSecond(zoneOffset), "keyAiSupportedLanguagesLastRefreshed");
    }

    @Override // c91.b
    public final boolean g() {
        return this.f26051a.W2("keyPersonalizedInsightsTooltipViewed", false);
    }

    /* JADX INFO: renamed from: c91.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lc91/a$a;", "", "<init>", "()V", "", "AI_SUPPORTED_LANGUAGES", "Ljava/lang/String;", "AI_SUPPORTED_LANGUAGES_LAST_REFRESHED", "HAS_SEEN_INSIGHTS_PERMISSION_DIALOG", "INSIGHTS_TOOLTIP_VIEWED", "BETA", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0396a {
        public /* synthetic */ C0396a(j jVar) {
            this();
        }

        private C0396a() {
        }
    }
}
