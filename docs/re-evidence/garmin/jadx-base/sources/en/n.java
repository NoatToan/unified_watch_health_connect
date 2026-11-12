package en;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 en.n[], still in use, count: 1, list:
  (r0v1 en.n[]) from 0x00b7: CONSTRUCTOR (r0v1 en.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B;\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Len/n;", "", "", "headerImage", "appIcon", "appTitle", "headerLabelRes", "bodyTextRes", "<init>", "(Ljava/lang/String;IIIIII)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    DIVE(2131231181, 2131231554, R.string.diving_app_title, R.string.lbl_install_dive_subtitle, R.string.lbl_install_dive_description),
    DEZL(2131232536, R.drawable.ic_dezl_app, R.string.dezl_app_title, R.string.lbl_install_dezl_subtitle, R.string.lbl_install_dezl_description),
    GARMIN_MESSENGER(2131233005, R.drawable.messenger_app_icon, R.string.lbl_garmin_messenger_app_name, R.string.lbl_messenger_connections_description, R.string.msg_get_inreach_direct_activation),
    AB_SYNAPSE(2131232456, 2131232455, R.string.lbl_ab_synapse_app_promotion_title, R.string.ab_synapse_app_onboarding_item_caption, R.string.lbl_app_synapse_app_promotion_body),
    AB_QUANTUM(2131230896, R.drawable.ab_quantum_app_icon, R.string.ab_quantum_promo_screen_title, R.string.ab_quantum_onboarding_item_caption, R.string.ab_quantum_promo_screen_content),
    GARMIN_PILOT(2131231780, R.drawable.garmin_pilot_app_icon, R.string.garmin_pilot_name, R.string.lbl_garmin_pilot_install_subtitle, R.string.lbl_garmin_pilot_install_description),
    CONNECT_IQ(R.drawable.ciq_app_intro_image_new, 2131231376, R.string.connect_iq_apps_title, R.string.onboarding_widget_list_dialog_title, R.string.connect_iq_app_info_message_alt);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f64676n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64681e;

    static {
        f64676n = new w13.c(nVarArr);
    }

    private n(int i14, int i15, int i16, int i17, int i18) {
        super(str, i);
        this.f64677a = i14;
        this.f64678b = i15;
        this.f64679c = i16;
        this.f64680d = i17;
        this.f64681e = i18;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f64675m.clone();
    }
}
