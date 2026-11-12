package nm1;

import c22.j0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnm1/m;", "Lpm1/g;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements pm1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f126651a;

    static {
        new a(null);
    }

    public m(f12.l lVar) {
        lVar.getClass();
        this.f126651a = lVar;
    }

    @Override // pm1.g
    public final rl1.i a() {
        String strA4 = this.f126651a.A4("key_sleep_selected_overlays", "");
        Object obj = null;
        if (strA4 == null || strA4.length() <= 0) {
            return null;
        }
        w13.c cVar = rl1.i.f153434o;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (s.g(String.valueOf(((rl1.i) next).f153435a), strA4)) {
                obj = next;
                break;
            }
        }
        return (rl1.i) obj;
    }

    @Override // pm1.g
    public final boolean b() {
        return this.f126651a.W2("show_sleep_factors_hint", true);
    }

    @Override // pm1.g
    public final void c(boolean z14) {
        this.f126651a.O2("show_skin_temperature_hint", z14);
    }

    @Override // pm1.g
    public final boolean d() {
        return this.f126651a.W2("show_breathing_variations_onboarding", true);
    }

    @Override // pm1.g
    public final void e(boolean z14) {
        this.f126651a.O2("show_sleep_factors_hint", z14);
    }

    @Override // pm1.g
    public final void f(rl1.i iVar) {
        String strValueOf;
        if (iVar == null || (strValueOf = String.valueOf(iVar.f153435a)) == null) {
            strValueOf = "";
        }
        this.f126651a.S("key_sleep_selected_overlays", strValueOf);
    }

    @Override // pm1.g
    public final void g(LocalDate localDate) {
        String string = localDate.toString("yyyy-MM-dd");
        string.getClass();
        this.f126651a.S("last_sleep_data_request_date", string);
    }

    @Override // pm1.g
    public final boolean h() {
        return this.f126651a.W2("is_sleep_timeline_selected", true);
    }

    @Override // pm1.g
    public final void i() {
        this.f126651a.O2("show_skin_temperature_onboarding", false);
    }

    @Override // pm1.g
    public final void j(LocalDate localDate) {
        String string = localDate.toString("yyyy-MM-dd");
        string.getClass();
        this.f126651a.S("last_date_with_sleep_data", string);
    }

    @Override // pm1.g
    public final boolean k() {
        return this.f126651a.W2("show_skin_temperature_hint", true);
    }

    @Override // pm1.g
    public final void l() {
        this.f126651a.O2("show_breathing_variations_onboarding", false);
    }

    @Override // pm1.g
    public final boolean m() {
        return this.f126651a.W2("show_skin_temperature_onboarding", true);
    }

    @Override // pm1.g
    public final void n(boolean z14) {
        this.f126651a.O2("is_sleep_timeline_selected", z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm1.g
    public final LocalDate o() {
        String strA4 = this.f126651a.A4("last_date_with_sleep_data", null);
        if (strA4 == 0) {
            return (LocalDate) strA4;
        }
        DateTime dateTimeK = j0.K(strA4, "yyyy-MM-dd");
        if (dateTimeK != null) {
            return dateTimeK.toLocalDate();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm1.g
    public final LocalDate p() {
        String strA4 = this.f126651a.A4("last_sleep_data_request_date", null);
        if (strA4 == 0) {
            return (LocalDate) strA4;
        }
        DateTime dateTimeK = j0.K(strA4, "yyyy-MM-dd");
        if (dateTimeK != null) {
            return dateTimeK.toLocalDate();
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lnm1/m$a;", "", "<init>", "()V", "", "SLEEP_DATE_FORMAT_YEAR_MONTH_DAY", "Ljava/lang/String;", "PREF_LAST_DATE_WITH_SLEEP_DATA", "PREF_LAST_SLEEP_DATA_REQUEST_DATE", "PREF_SHOW_SLEEP_FACTORS_HINT", "PREF_SHOW_SKIN_TEMPERATURE_ONBOARDING", "PREF_SHOW_SKIN_TEMPERATURE_HINT", "PREF_IS_SLEEP_TIMELINE_SELECTED", "PREF_SHOW_BREATHING_VARIATIONS_ONBOARDING", "USER_SLEEP_TIMELINE_SELECTED_OVERLAYS", "PREF_SHOW_SLEEP_FEATURE_ONBOARDING", "EMPTY_STRING", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
