package m52;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import d53.u;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m52.c[], still in use, count: 1, list:
  (r0v1 m52.c[]) from 0x0085: CONSTRUCTOR (r0v1 m52.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lm52/c;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "order", "stringName", "", "minSpeedInSeconds", "", "maxSpeedInSeconds", "defaultSpeedInSeconds", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIJDJ)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    OPEN_WATER_SWIMMING("open_water_swimming", 0, R.string.lbl_swim, 50L, 300.0d, 120L),
    LAP_SWIMMING("lap_swimming", 0, R.string.lbl_swim, 50L, 300.0d, 120L),
    SWIMMING("swimming", 0, R.string.lbl_swim, 50L, 300.0d, 120L),
    CYCLING("cycling", 1, R.string.lbl_bike, 0L, 80.9d, 6L),
    RUNNING("running", 2, R.string.lbl_run, 0L, 1200.0d, 600L);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f116667g = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f116674n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f116678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f116679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f116680f;

    static {
        f116674n = new w13.c(new c[]{r0, r1, r2, r3, r4});
    }

    private c(String str, int i14, int i15, long j8, double d14, long j14) {
        super(str, i);
        this.f116675a = str;
        this.f116676b = i14;
        this.f116677c = i15;
        this.f116678d = j8;
        this.f116679e = d14;
        this.f116680f = j14;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f116673m.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm52/c$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(String str) {
            Object next;
            w13.c cVar = c.f116674n;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (u.q(((c) next).f116675a, str, true)) {
                    return (c) next;
                }
            }
            next = null;
            return (c) next;
        }

        private a() {
        }
    }
}
