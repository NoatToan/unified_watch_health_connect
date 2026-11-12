package mx1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mx1.d[], still in use, count: 1, list:
  (r0v1 mx1.d[]) from 0x0050: CONSTRUCTOR (r0v1 mx1.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmx1/d;", "", "", Action.KEY_ATTRIBUTE, "", "titleStringRes", "descriptionStringRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    INCREASE_MAX_STRENGTH("increaseMaxStrength", R.string.lbl_stp_increase_max_strength, R.string.lbl_stp_increase_max_strength_explanation),
    BUILD_MUSCLE_MASS("buildMuscleMass", R.string.lbl_stp_build_muscle_mass, R.string.lbl_stp_build_muscle_mass_explanation),
    GET_FIT("getFit", R.string.lbl_stp_get_fit, R.string.lbl_stp_get_fit_explanation),
    CUSTOM("custom", R.string.lbl_stp_custom, R.string.lbl_stp_custom_explanation);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f121381h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121383b;

    static {
        f121381h = new w13.c(dVarArr);
        new a(null);
    }

    private d(String str, int i14, int i15) {
        super(str, i);
        this.f121382a = i14;
        this.f121383b = i15;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f121380g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmx1/d$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
