package yd1;

import com.garmin.android.apps.connectmobile.R;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yd1.b[], still in use, count: 1, list:
  (r0v1 yd1.b[]) from 0x0022: CONSTRUCTOR (r0v1 yd1.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyd1/b;", "", "", "title", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    WEEKLY(R.string.common_lbl_weekly_totals),
    MONTHLY(R.string.lbl_monthly_totals);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f196755b = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f196759f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196760a;

    static {
        f196759f = new w13.c(new b[]{r0, r1});
    }

    private b(int i14) {
        super(str, i);
        this.f196760a = i14;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f196758e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyd1/b$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(String str) {
            Object next;
            w13.c cVar = b.f196759f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!u.q(((b) next).name(), str, true));
            b bVar = (b) next;
            return bVar == null ? b.WEEKLY : bVar;
        }

        private a() {
        }
    }
}
