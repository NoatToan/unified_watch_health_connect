package fn0;

import c22.c3;
import c22.g2;
import c22.i;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fn0.c[], still in use, count: 1, list:
  (r0v1 fn0.c[]) from 0x00d4: CONSTRUCTOR (r0v1 fn0.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lfn0/c;", "", "", Action.KEY_ATTRIBUTE, "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "", "imageRes", "highlightedImageRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    AGGRESSIVE_ANIMAL("AGGRESSIVE_ANIMAL", i.b(R.string.lbl_hazard_animal), R.drawable.hazard_indicator_animal_default, R.drawable.hazard_indicator_animal_hover),
    POTHOLE("POTHOLE", i.b(R.string.lbl_hazard_pothole), R.drawable.hazard_indicator_pothole_default, R.drawable.hazard_indicator_pothole_hover),
    OBSTRUCTION("OBSTRUCTION", i.b(R.string.lbl_hazard_obstruction), R.drawable.hazard_indicator_treefall_default, R.drawable.hazard_indicator_treefall_hover),
    SLIPPERY("SLIPPERY", i.b(R.string.lbl_hazard_slippery), R.drawable.hazard_indicator_slippery_default, R.drawable.hazard_indicator_slippery_hover),
    ROAD_CLOSURE("ROAD_CLOSURE", g2.b(x0.Jc), R.drawable.hazard_indicator_road_closure_default, R.drawable.hazard_indicator_road_closure_hover),
    GENERIC("GENERIC", i.b(R.string.lbl_general_hazard), R.drawable.hazard_indicator_warning_exclamation_default, R.drawable.hazard_indicator_warning_exclamation_hover),
    OTHER("OTHER", i.b(R.string.lbl_other), R.drawable.hazard_indicator_warning_exclamation_default, R.drawable.hazard_indicator_warning_exclamation_hover),
    UNKNOWN("", i.b(R.string.lbl_course_points_hazard), R.drawable.hazard_indicator_warning_exclamation_default, R.drawable.hazard_indicator_warning_exclamation_hover);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f72162e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w13.c f72172o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f72174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72176d;

    static {
        x0.f23314a.getClass();
        f72172o = new w13.c(cVarArr);
        f72162e = new a(null);
    }

    private c(String str, c3 c3Var, int i14, int i15) {
        super(str, i);
        this.f72173a = str;
        this.f72174b = c3Var;
        this.f72175c = i14;
        this.f72176d = i15;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f72171n.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfn0/c$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
