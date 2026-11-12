package b11;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b11.p[], still in use, count: 1, list:
  (r0v1 b11.p[]) from 0x003e: CONSTRUCTOR (r0v1 b11.p[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb11/p;", "", "", Action.KEY_ATTRIBUTE, "", "abbreviationResId", "nameResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {
    GRAMS("g", R.string.unit_g, R.string.lbl_grams_lowercase),
    MICROGRAMS("mcg", R.string.micrograms_abbreviation, R.string.micrograms),
    MILLIGRAMS("mg", R.string.milligrams_abbreviation, R.string.milligrams);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14358d = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f14363i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14366c;

    static {
        f14363i = new w13.c(new p[]{r0, r1, r2});
    }

    private p(String str, int i14, int i15) {
        super(str, i);
        this.f14364a = str;
        this.f14365b = i14;
        this.f14366c = i15;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f14362h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb11/p$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(String str, l22.b bVar, boolean z14) {
            Object next;
            bVar.getClass();
            w13.c cVar = p.f14363i;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((p) next).f14364a, str));
            p pVar = (p) next;
            String string = z14 ? bVar.getString(R.string.lbl_grams_lowercase) : bVar.getString(R.string.unit_g);
            if (pVar == null) {
                return str == null ? string : str;
            }
            return z14 ? bVar.getString(pVar.f14366c) : bVar.getString(pVar.f14365b);
        }

        private a() {
        }
    }
}
