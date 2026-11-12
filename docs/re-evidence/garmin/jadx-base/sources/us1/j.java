package us1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 us1.j[], still in use, count: 1, list:
  (r0v1 us1.j[]) from 0x003a: CONSTRUCTOR (r0v1 us1.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lus1/j;", "", "", "value", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    /* JADX INFO: Fake field, exist only in values array */
    ONE_STAR(1.0f, "1 ★"),
    /* JADX INFO: Fake field, exist only in values array */
    TWO_STARS(2.0f, "2 ★"),
    /* JADX INFO: Fake field, exist only in values array */
    THREE_STARS(3.0f, "3 ★"),
    FOUR_STARS_AND_MORE(4.0f, "4+ ★");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f172419c = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172422f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f172423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172424b;

    static {
        f172422f = new w13.c(new j[]{r0, r1, r2, r3});
    }

    private j(float f14, String str) {
        super(str, i);
        this.f172423a = f14;
        this.f172424b = str;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f172421e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus1/j$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
