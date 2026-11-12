package p73;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p73.a[], still in use, count: 1, list:
  (r0v1 p73.a[]) from 0x0038: CONSTRUCTOR (r0v1 p73.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp73/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    ZERO,
    /* JADX INFO: Fake field, exist only in values array */
    ONE,
    /* JADX INFO: Fake field, exist only in values array */
    TWO,
    /* JADX INFO: Fake field, exist only in values array */
    FEW,
    /* JADX INFO: Fake field, exist only in values array */
    MANY,
    /* JADX INFO: Fake field, exist only in values array */
    OTHER;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2582a f136337a = new C2582a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c f136339c = new c(new a[]{new a(), new a(), new a(), new a(), new a(), new a()});

    static {
    }

    private a() {
        super(str, i);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f136338b.clone();
    }

    /* JADX INFO: renamed from: p73.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp73/a$a;", "", "<init>", "()V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C2582a {
        public /* synthetic */ C2582a(j jVar) {
            this();
        }

        private C2582a() {
        }
    }
}
