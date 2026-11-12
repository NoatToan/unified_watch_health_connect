package b63;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b63.j[], still in use, count: 1, list:
  (r0v1 b63.j[]) from 0x0040: CONSTRUCTOR (r0v1 b63.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/j;", "", "<init>", "(Ljava/lang/String;I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {
    /* JADX INFO: Fake field, exist only in values array */
    MONDAY,
    /* JADX INFO: Fake field, exist only in values array */
    TUESDAY,
    /* JADX INFO: Fake field, exist only in values array */
    WEDNESDAY,
    /* JADX INFO: Fake field, exist only in values array */
    THURSDAY,
    /* JADX INFO: Fake field, exist only in values array */
    FRIDAY,
    /* JADX INFO: Fake field, exist only in values array */
    SATURDAY,
    /* JADX INFO: Fake field, exist only in values array */
    SUNDAY;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w13.c f16200b;

    static {
        f16200b = new w13.c(jVarArr);
    }

    private j() {
        super(str, i);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f16199a.clone();
    }
}
