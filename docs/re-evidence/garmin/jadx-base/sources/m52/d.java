package m52;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m52.d[], still in use, count: 1, list:
  (r0v1 m52.d[]) from 0x0068: CONSTRUCTOR (r0v1 m52.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lm52/d;", "", "", TtmlNode.ATTR_ID, "aliasId", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    WARM_UP(1, 1),
    COOL_DOWN(2, 2),
    INTERVAL(3, 3),
    RECOVERY(4, 4),
    REST(5, 5),
    REPEAT(6, 6),
    OTHER(7, 7),
    MAIN(8, 8),
    WALK(4, 100);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f116681c = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f116692n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116694b;

    static {
        f116692n = new w13.c(new d[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    private d(int i14, int i15) {
        super(str, i);
        this.f116693a = i14;
        this.f116694b = i15;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f116691m.clone();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lm52/d$a;", "", "<init>", "()V", "", "WALK_STEP_CATEGORY", "Ljava/lang/String;", "WALK_STEP_EXERCISE_NAME", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
