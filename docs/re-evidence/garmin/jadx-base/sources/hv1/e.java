package hv1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hv1.e[], still in use, count: 1, list:
  (r0v1 hv1.e[]) from 0x0036: CONSTRUCTOR (r0v1 hv1.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhv1/e;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    FLAT("FLAT", R.string.lbl_course_profile_flat),
    /* JADX INFO: Fake field, exist only in values array */
    ROLLING("ROLLING", R.string.lbl_course_hill_type_rolling),
    /* JADX INFO: Fake field, exist only in values array */
    SHORT_AND_STEEP("SHORT_AND_STEEP", R.string.lbl_course_hill_type_short_and_steep),
    /* JADX INFO: Fake field, exist only in values array */
    LONG("LONG", R.string.lbl_course_hill_type_long);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f85844c = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f85847f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85849b;

    static {
        f85847f = new w13.c(new e[]{r0, new e("ROLLING", R.string.lbl_course_hill_type_rolling), new e("SHORT_AND_STEEP", R.string.lbl_course_hill_type_short_and_steep), new e("LONG", R.string.lbl_course_hill_type_long)});
    }

    private e(String str, int i14) {
        super(str, i);
        this.f85848a = str;
        this.f85849b = i14;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f85846e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhv1/e$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e a(String str) {
            Object next;
            w13.c cVar = e.f85847f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((e) next).f85848a, str)) {
                    return (e) next;
                }
            }
            next = null;
            return (e) next;
        }

        private a() {
        }
    }
}
