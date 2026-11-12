package b11;

import c22.c3;
import c22.g2;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b11.c[], still in use, count: 1, list:
  (r0v1 b11.c[]) from 0x0088: CONSTRUCTOR (r0v1 b11.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lb11/c;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "Lc22/g2;", "onDemandResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    /* JADX INFO: Fake field, exist only in values array */
    BREAKFAST("BREAKFAST", R.string.breakfast, null, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    LUNCH("LUNCH", R.string.lunch, null, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    DINNER("DINNER", R.string.dinner, null, 4, null),
    SNACKS("SNACKS", R.string.snacks, null, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MEAL_1("CUSTOM_MEAL_1", 0, x0.f23661ud),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MEAL_2("CUSTOM_MEAL_2", 0, x0.f23677vd),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MEAL_3("CUSTOM_MEAL_3", 0, x0.f23694wd),
    UNCATEGORIZED("UNCATEGORIZED", R.string.lbl_uncategorized, null, 4, null);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14245d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f14249h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14252c;

    static {
        x0.f23314a.getClass();
        f14249h = new w13.c(cVarArr);
        f14245d = new a(null);
    }

    public /* synthetic */ c(String str, int i14, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, (i15 & 4) != 0 ? null : str2);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f14248g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb11/c$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c3 a(String str) {
            Object next;
            w13.c cVar = c.f14249h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((c) next).f14250a, str));
            c cVar2 = (c) next;
            if (cVar2 != null) {
                int i14 = cVar2.f14251b;
                if (i14 != 0) {
                    return c22.i.b(i14);
                }
                String str2 = cVar2.f14252c;
                if (str2 != null) {
                    return g2.b(str2);
                }
            }
            return null;
        }

        public static String b(String str, l22.b bVar, boolean z14) {
            Object next;
            str.getClass();
            bVar.getClass();
            if (z14) {
                return str;
            }
            w13.c cVar = c.f14249h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((c) next).f14250a, str));
            c cVar2 = (c) next;
            if (cVar2 == null) {
                return str;
            }
            int i14 = cVar2.f14251b;
            if (i14 != 0) {
                return bVar.getString(i14);
            }
            String str2 = cVar2.f14252c;
            return str2 != null ? bVar.b(g2.b(str2)) : str;
        }

        private a() {
        }
    }

    private c(String str, int i14, String str2) {
        super(str, i);
        this.f14250a = str;
        this.f14251b = i14;
        this.f14252c = str2;
    }
}
