package cg2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 cg2.a[], still in use, count: 1, list:
  (r0v17 cg2.a[]) from 0x00c9: CONSTRUCTOR (r0v17 cg2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcg2/a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    ABS("ABS"),
    BICEPS("BICEPS"),
    CALVES("CALVES"),
    CHEST("CHEST"),
    FOREARM("FOREARM"),
    GLUTES("GLUTES"),
    HAMSTRINGS("HAMSTRINGS"),
    ABDUCTORS("ABDUCTORS"),
    ADDUCTORS("ADDUCTORS"),
    HIPS("HIPS"),
    LATS("LATS"),
    LOWER_BACK("LOWER_BACK"),
    OBLIQUES("OBLIQUES"),
    QUADS("QUADS"),
    SHOULDERS("SHOULDERS"),
    TRAPS("TRAPS"),
    TRICEPS("TRICEPS");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0418a f27225b = new C0418a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w13.c f27244w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27245a;

    static {
        f27244w = new w13.c(new a[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1});
    }

    private a(String str) {
        super(str, i);
        this.f27245a = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27243v.clone();
    }

    /* JADX INFO: renamed from: cg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcg2/a$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0418a {
        public /* synthetic */ C0418a(j jVar) {
            this();
        }

        public static a a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = a.f27244w;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((a) next).f27245a, str)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        private C0418a() {
        }
    }
}
