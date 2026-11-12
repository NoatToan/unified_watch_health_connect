package f01;

import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 f01.f[], still in use, count: 1, list:
  (r0v1 f01.f[]) from 0x0082: CONSTRUCTOR (r0v1 f01.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf01/f;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "Lc22/g2;", "onDemandResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    DAILY("DAILY", R.string.device_settings_frequency_daily, null, 4, null),
    BREAKFAST("BREAKFAST", R.string.breakfast, null, 4, null),
    LUNCH("LUNCH", R.string.lunch, null, 4, null),
    DINNER("DINNER", R.string.dinner, null, 4, null),
    CUSTOM_MEAL_1("CUSTOM_MEAL_1", 0, x0.f23661ud),
    CUSTOM_MEAL_2("CUSTOM_MEAL_2", 0, x0.f23677vd),
    CUSTOM_MEAL_3("CUSTOM_MEAL_3", 0, x0.f23694wd);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f67690b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f67699k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67700a;

    static {
        x0.f23314a.getClass();
        f67699k = new w13.c(fVarArr);
        f67690b = new a(null);
    }

    public /* synthetic */ f(String str, int i14, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? null : str2);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f67698j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf01/f$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(String str) {
            Object next;
            w13.c cVar = f.f67699k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((f) next).name(), str)) {
                    return (f) next;
                }
            }
            next = null;
            return (f) next;
        }

        public static boolean b(String str) {
            return a(str) == f.DAILY;
        }

        private a() {
        }
    }

    private f(String str, int i14, String str2) {
        super(str, i);
        this.f67700a = str;
    }
}
