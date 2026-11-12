package ty0;

import c22.c3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ty0.g[], still in use, count: 1, list:
  (r0v1 ty0.g[]) from 0x00ea: CONSTRUCTOR (r0v1 ty0.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B'\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lty0/g;", "Lty0/j;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "Lc22/c3;", "onDemandLabelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILc22/c3;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements j {
    ESSENTIALS("ESSENTIALS", R.string.lbl_essentials, null, 4, null),
    IN_FOCUS("IN_FOCUS", R.string.lbl_in_focus, null, 4, null),
    EDIT_IN_FOCUS("EDIT_IN_FOCUS", R.string.title_edit_in_focus, null, 4, null),
    SLEEP_COACH("HOME_SETTINGS_SLEEP_COACH", R.string.lbl_sleep_coach, null, 4, null),
    AT_A_GLANCE("AT_A_GLANCE", R.string.lbl_at_a_glance, null, 4, null),
    EDIT_AT_A_GLANCE("EDIT_AT_A_GLANCE", R.string.title_edit_at_a_glance, null, 4, null),
    EVENTS("HOME_SETTINGS_EVENTS", R.string.lbl_events, null, 4, null),
    GARMIN_COACH_PLANS("HOME_SETTINGS_GARMIN_COACH_PLANS", R.string.atp_lbl_plans_section_title, null, 4, null),
    CHALLENGES("HOME_SETTINGS_CHALLENGES", R.string.concept_challenges, null, 4, null),
    YESTERDAY_SUMMARY("YESTERDAY_SUMMARY", R.string.social_elapsed_time_yesterday, null, 4, null),
    LAST_7_DAYS_SUMMARY("LAST_7_DAYS_SUMMARY", R.string.lbl_last_7_days, null, 4, null),
    GARMIN_CONNECT_PLUS_SETTINGS("GARMIN_CONNECT_PLUS_SETTINGS", R.string.gc_plus_settings, null, 4, null);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w13.c f166971q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f166974c;

    static {
        f166971q = new w13.c(gVarArr);
    }

    public /* synthetic */ g(String str, int i14, c3 c3Var, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i, str, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? null : c3Var);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f166970p.clone();
    }

    @Override // ty0.j
    public final String b(l22.b bVar) {
        c3 c3Var = this.f166974c;
        return c3Var != null ? bVar.b(c3Var) : bVar.getString(this.f166973b);
    }

    @Override // ty0.j
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF166972a() {
        return this.f166972a;
    }

    private g(String str, int i14, String str2, int i15, c3 c3Var) {
        super(str, i14);
        this.f166972a = str2;
        this.f166973b = i15;
        this.f166974c = c3Var;
    }
}
