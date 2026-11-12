package tw1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tw1.k[], still in use, count: 1, list:
  (r0v1 tw1.k[]) from 0x002e: CONSTRUCTOR (r0v1 tw1.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ltw1/k;", "", "", "levelId", "", "levelKey", "nameResId", "descriptionResId", "<init>", "(Ljava/lang/String;IILjava/lang/String;II)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    BEGINNER(2, "Beginner", R.string.coach_difficulty_challenger, R.string.coach_difficulty_challenger_description),
    INTERMEDIATE(3, "Intermediate", R.string.coach_difficulty_achiever, R.string.coach_difficulty_achiever_description);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f166742d = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f166746h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166749c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f166751b;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180176g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f166750a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.BEGINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[k.INTERMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f166751b = iArr2;
        }
    }

    static {
        f166746h = new w13.c(new k[]{r0, r1});
    }

    private k(int i14, String str, int i15, int i16) {
        super(str, i);
        this.f166747a = i14;
        this.f166748b = str;
        this.f166749c = i15;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f166745g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltw1/k$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static k a(int i14) {
            Object next;
            w13.c cVar = k.f166746h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (((k) next).f166747a != i14);
            k kVar = (k) next;
            return kVar == null ? k.INTERMEDIATE : kVar;
        }

        private a() {
        }
    }
}
