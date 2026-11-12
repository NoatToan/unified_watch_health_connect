package aq1;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 aq1.a[], still in use, count: 1, list:
  (r3v2 aq1.a[]) from 0x001b: CONSTRUCTOR (r3v2 aq1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq1/a;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {
    /* JADX INFO: Fake field, exist only in values array */
    CN { // from class: aq1.a.a
        @Override // aq1.a
        public final boolean a(q92.v vVar) {
            return (((vVar != null) && (((vVar != null ? vVar.f143786d : null) == q92.b.NONE) || (vVar != null ? vVar.b() : false))) || ((vVar != null ? vVar.f143785c : null) == q92.u.EXPIRED)) ? false : true;
        }

        @Override // aq1.a
        public final boolean b(q92.v vVar) {
            return ((vVar.f143786d == q92.b.NONE) || vVar.b() || (vVar.f143785c == q92.u.EXPIRED)) ? false : true;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    KR { // from class: aq1.a.b
        @Override // aq1.a
        public final boolean a(q92.v vVar) {
            if (vVar != null) {
                return b(vVar);
            }
            return true;
        }

        @Override // aq1.a
        public final boolean b(q92.v vVar) {
            vVar.getClass();
            boolean zB = vVar.b();
            q92.u uVar = vVar.f143785c;
            return (((uVar == q92.u.CUSTOMER) && zB) || (uVar == q92.u.EXPIRED)) ? false : true;
        }
    };


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w13.c f12344b;

    static {
        f12344b = new w13.c(aVarArr);
    }

    public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, i14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12343a.clone();
    }

    public abstract boolean a(q92.v vVar);

    public abstract boolean b(q92.v vVar);

    private a(String str, int i14) {
        super(str, i14);
    }
}
