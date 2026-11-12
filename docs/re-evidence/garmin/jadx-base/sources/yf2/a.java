package yf2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yf2.a[], still in use, count: 1, list:
  (r0v1 yf2.a[]) from 0x0012: CONSTRUCTOR (r0v1 yf2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyf2/a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    VO2_MAX("VO2_MAX");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3687a f196894b = new C3687a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c f196897e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196898a;

    static {
        f196897e = new c(new a[]{r0});
    }

    private a(String str) {
        super(str, i);
        this.f196898a = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f196896d.clone();
    }

    /* JADX INFO: renamed from: yf2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyf2/a$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3687a {
        public /* synthetic */ C3687a(j jVar) {
            this();
        }

        public static a a(String str) {
            Object next;
            c cVar = a.f196897e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((a) next).f196898a, str)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        private C3687a() {
        }
    }
}
