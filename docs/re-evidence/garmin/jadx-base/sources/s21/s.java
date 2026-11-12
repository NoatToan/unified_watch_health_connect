package s21;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s21.s[], still in use, count: 1, list:
  (r0v1 s21.s[]) from 0x0036: CONSTRUCTOR (r0v1 s21.s[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ls21/s;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class s {
    MAINTAIN_WEIGHT("MAINTAIN"),
    LOSE_WEIGHT("LOSS"),
    GAIN_WEIGHT("GAIN"),
    NO_GOAL("NO_GOAL");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f156163b = o13.m.a(o13.n.PUBLICATION, new ro0.h(17));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f156169h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156170a;

    static {
        f156169h = new w13.c(new s[]{r0, r1, r2, r3});
    }

    private s(String str) {
        super(str, i);
        this.f156170a = str;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f156168g.clone();
    }

    /* JADX INFO: renamed from: s21.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls21/s$a;", "", "<init>", "()V", "Li63/c;", "Ls21/s;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: s21.s$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2951a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156171a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.LOSE_WEIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.MAINTAIN_WEIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.GAIN_WEIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s.NO_GOAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f156171a = iArr;
            }
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static s a(String str) {
            Object next;
            w13.c cVar = s.f156169h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((s) next).f156170a, str));
            s sVar = (s) next;
            return sVar == null ? s.NO_GOAL : sVar;
        }

        public static String b(s sVar, p3.m mVar) {
            int i14;
            int i15;
            sVar.getClass();
            x1 x1Var = p3.n.f135158a;
            int i16 = C2951a.f156171a[sVar.ordinal()];
            if (i16 == 1) {
                i14 = 976030890;
                i15 = R.string.lose_weight;
            } else if (i16 == 2) {
                i14 = 976033198;
                i15 = R.string.maintain_weight;
            } else if (i16 == 3) {
                i14 = 976035498;
                i15 = R.string.gain_weight;
            } else {
                if (i16 != 4) {
                    throw n23.j.m(mVar, 976029713);
                }
                i14 = 976037542;
                i15 = R.string.no_goal;
            }
            return sn.a.h(mVar, i14, i15, mVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<s> serializer() {
            return (i63.c) s.f156163b.getValue();
        }

        private Companion() {
        }
    }
}
