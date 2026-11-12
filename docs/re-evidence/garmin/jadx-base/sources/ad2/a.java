package ad2;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ad2.a[], still in use, count: 1, list:
  (r0v1 ad2.a[]) from 0x002c: CONSTRUCTOR (r0v1 ad2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lad2/a;", "", "", "baseUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    PROD("api.gcs.garmin.com"),
    CHINA("api.gcs.garmin.cn"),
    TEST("api.gcs.test.garmin.com");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f2773f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2774a;

    static {
        f2773f = new w13.c(aVarArr);
    }

    private a(String str) {
        super(str, i);
        this.f2774a = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2772e.clone();
    }
}
