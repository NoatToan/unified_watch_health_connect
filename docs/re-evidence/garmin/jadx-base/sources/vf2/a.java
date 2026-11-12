package vf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vf2.a[], still in use, count: 1, list:
  (r0v1 vf2.a[]) from 0x0036: CONSTRUCTOR (r0v1 vf2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvf2/a;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    PENDING(0),
    ACTIVE(1),
    SKIPPED(2),
    /* JADX INFO: Fake field, exist only in values array */
    DELETED(3),
    COMPLETED(4);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3328a f177914b = new C3328a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f177919g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177920a;

    static {
        f177919g = new w13.c(new a[]{r0, r1, r2, r3, r4});
    }

    private a(int i14) {
        super(str, i);
        this.f177920a = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f177918f.clone();
    }

    /* JADX INFO: renamed from: vf2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf2/a$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3328a {
        public /* synthetic */ C3328a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3328a() {
        }
    }
}
