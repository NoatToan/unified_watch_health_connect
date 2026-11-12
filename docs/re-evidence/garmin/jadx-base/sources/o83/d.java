package o83;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o83.d, still in use, count: 1, list:
  (r0v0 o83.d) from 0x000e: INVOKE (r0v0 o83.d) STATIC call: j83.e.e(j83.e$a):j83.e A[MD:<T>:(j83.e$a<T>):j83.e<T> (m), WRAPPED]
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
public final class d implements j83.e.a<Object> {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j83.e<Object> f130871a;

    static {
        f130871a = j83.e.e(dVar);
    }

    private d() {
        super(str, i);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f130872b.clone();
    }

    @Override // n83.b
    public final void call(Object obj) {
        ((j83.n) obj).a();
    }
}
