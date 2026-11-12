package vf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vf2.g[], still in use, count: 1, list:
  (r0v1 vf2.g[]) from 0x0058: CONSTRUCTOR (r0v1 vf2.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvf2/g;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    FIT_INTENSITY_ACTIVE(0),
    FIT_INTENSITY_REST(1),
    FIT_INTENSITY_WARMUP(2),
    FIT_INTENSITY_COOLDOWN(3),
    FIT_INTENSITY_RECOVERY(4),
    FIT_INTENSITY_INTERVAL(5),
    FIT_INTENSITY_OTHER(6),
    FIT_INTENSITY_MAIN(7);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f177936b = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f177946l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177947a;

    static {
        f177946l = new w13.c(new g[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private g(int i14) {
        super(str, i);
        this.f177947a = i14;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f177945k.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf2/g$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
