package ma1;

import c22.c3;
import c22.i;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ma1.a[], still in use, count: 1, list:
  (r0v1 ma1.a[]) from 0x003c: CONSTRUCTOR (r0v1 ma1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lma1/a;", "", "", Action.KEY_ATTRIBUTE, "Lc22/c3;", "powerCurveTitle", "powerRecordsLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;Lc22/c3;)V", "a", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    CYCLING("cycling", i.b(R.string.cycling_power_curve_label), i.b(R.string.cycling_power_curve_records_title)),
    ROWING("rowing", i.b(R.string.rowing_power_curve_label), i.b(R.string.rowing_power_curve_records_title));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2227a f117623d = new C2227a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c f117627h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f117629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f117630c;

    static {
        f117627h = new c(new a[]{r0, r1});
    }

    private a(String str, c3 c3Var, c3 c3Var2) {
        super(str, i);
        this.f117628a = str;
        this.f117629b = c3Var;
        this.f117630c = c3Var2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f117626g.clone();
    }

    /* JADX INFO: renamed from: ma1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lma1/a$a;", "", "<init>", "()V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2227a {
        public /* synthetic */ C2227a(j jVar) {
            this();
        }

        public static a a(String str) {
            Object next;
            c cVar = a.f117627h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((a) next).f117628a, str)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        private C2227a() {
        }
    }
}
