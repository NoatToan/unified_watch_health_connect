package qv0;

import c22.w2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pv0.y;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqv0/c;", "Lqv0/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qv0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f147923b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f147924a;

    static {
        new a(null);
    }

    public c(l lVar) {
        lVar.getClass();
        this.f147924a = lVar;
    }

    @Override // qv0.a
    public final void a(boolean z14) {
        this.f147924a.O2("show_lifestyle_logging_pregnancy_banner", z14);
    }

    @Override // qv0.a
    public final pd1.c b() {
        String strA4 = this.f147924a.A4("keyLifestyleLoggingReminder", null);
        if (strA4 == null) {
            return null;
        }
        return (pd1.c) GsonUtil.f47253b.fromJson(strA4, pd1.c.class);
    }

    @Override // qv0.a
    public final y.a c() {
        Object next;
        int iI2 = this.f147924a.i2(-1, "keyLastSelectedAlcoholSubtypeId");
        w13.c cVar = y.a.f141464g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((y.a) next).f141465a != iI2);
        y.a aVar = (y.a) next;
        return aVar == null ? y.a.BEER : aVar;
    }

    @Override // qv0.a
    public final void d(pd1.c cVar) {
        cVar.getClass();
        this.f147924a.S("keyLifestyleLoggingReminder", GsonUtil.a(cVar));
    }

    @Override // qv0.a
    public final void e() {
        this.f147924a.O2("keyLifestyleLoggingOnboardingCompleted", false);
    }

    @Override // qv0.a
    public final void f(y.b bVar) {
        bVar.getClass();
        this.f147924a.u2(bVar.f141473a, "keyLastSelectedCaffeineSubtypeId");
    }

    @Override // qv0.a
    public final void g(boolean z14) {
        this.f147924a.O2("show_lifestyle_logging_auto_logging_behaviors_banner", z14);
    }

    @Override // qv0.a
    public final void h(y.a aVar) {
        aVar.getClass();
        this.f147924a.u2(aVar.f141465a, "keyLastSelectedAlcoholSubtypeId");
    }

    @Override // qv0.a
    public final boolean i() {
        return this.f147924a.W2("show_lifestyle_logging_auto_logging_behaviors_banner", true);
    }

    @Override // qv0.a
    public final void j() {
        this.f147924a.O2("show_lifestyle_logging_cross_selling_item", false);
    }

    @Override // qv0.a
    public final boolean k() {
        return this.f147924a.W2("keyLifestyleLoggingOnboardingCompleted", false);
    }

    @Override // qv0.a
    public final boolean l() {
        return this.f147924a.W2("show_lifestyle_logging_cross_selling_item", true);
    }

    @Override // qv0.a
    public final void m() {
        this.f147924a.O2("lifestyle_logging_has_seen_auto_logging_feature", true);
    }

    @Override // qv0.a
    public final void n(boolean z14) {
        this.f147924a.O2("show_lifestyle_logging_reports_hint", z14);
    }

    @Override // qv0.a
    public final boolean o() {
        return this.f147924a.W2("lifestyle_logging_has_seen_auto_logging_feature", false);
    }

    @Override // qv0.a
    public final void p(boolean z14) {
        this.f147924a.O2("show_lifestyle_logging_behavior_details_hint", z14);
    }

    @Override // qv0.a
    public final boolean q() {
        return this.f147924a.W2("show_lifestyle_logging_behavior_details_hint", true);
    }

    @Override // qv0.a
    public final boolean r() {
        return this.f147924a.W2("show_lifestyle_logging_reports_hint", true);
    }

    @Override // qv0.a
    public final void s() {
        this.f147924a.O2("keyLifestyleLoggingOnboardingCompleted", true);
    }

    @Override // qv0.a
    public final r53.b t() {
        return s.f(new w2(new b(this, 1), this.f147924a, "keyLastSelectedCaffeineSubtypeId", null));
    }

    @Override // qv0.a
    public final boolean u() {
        return this.f147924a.W2("show_lifestyle_logging_pregnancy_banner", true);
    }

    @Override // qv0.a
    public final y.b v() {
        Object next;
        int iI2 = this.f147924a.i2(-1, "keyLastSelectedCaffeineSubtypeId");
        w13.c cVar = y.b.f141472h;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((y.b) next).f141473a != iI2);
        y.b bVar = (y.b) next;
        return bVar == null ? y.b.COFFEE : bVar;
    }

    @Override // qv0.a
    public final r53.b w() {
        return s.f(new w2(new b(this, 0), this.f147924a, "keyLastSelectedAlcoholSubtypeId", null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lqv0/c$a;", "", "<init>", "()V", "", "KEY_LIFESTYLE_LOGGING_ONBOARDING_COMPLETED", "Ljava/lang/String;", "KEY_LIFESTYLE_LOGGING_REMINDER", "KEY_LAST_SELECTED_ALCOHOL_SUBTYPE_ID", "KEY_LAST_SELECTED_CAFFEINE_SUBTYPE_ID", "KEY_LIFESTYLE_LOGGING_REMINDER_SCHEDULED", "PREF_SHOW_LIFESTYLE_LOGGING_REPORTS_HINT", "PREF_SHOW_LIFESTYLE_LOGGING_BEHAVIOR_DETAILS_HINT", "PREF_SHOW_LIFESTYLE_LOGGING_PREGNANCY_BANNER", "PREF_SHOW_LIFESTYLE_LOGGING_CROSS_SELLING_ITEM", "PREF_SHOW_LIFESTYLE_LOGGING_AUTO_LOGGING_BEHAVIORS_BANNER", "PREF_LIFESTYLE_LOGGING_HAS_SEEN_AUTO_LOGGING_FEATURE", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
