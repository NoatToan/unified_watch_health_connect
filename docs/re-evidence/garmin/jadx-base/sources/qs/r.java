package qs;

import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.r[], still in use, count: 1, list:
  (r0v1 qs.r[]) from 0x004e: CONSTRUCTOR (r0v1 qs.r[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqs/r;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {
    SEATED(0),
    STANDING(1),
    TRANSITION_TO_SEATED(2),
    TRANSITION_TO_STANDING(3),
    A(4),
    L(5),
    U(6);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f147152b = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147161k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147162a;

    static {
        f147161k = new w13.c(new r[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private r(int i14) {
        super(str, i);
        this.f147162a = i14;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f147160j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/r$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static r a(double d14) {
            Double dValueOf = Double.valueOf(d14);
            Object obj = null;
            if (Double.isNaN(d14)) {
                dValueOf = null;
            }
            Integer numValueOf = dValueOf != null ? Integer.valueOf(MathKt.b(dValueOf.doubleValue())) : null;
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            r.f147152b.getClass();
            w13.c cVar = r.f147161k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                Object next = bVarN.next();
                if (((r) next).f147162a == iIntValue) {
                    obj = next;
                    break;
                }
            }
            return (r) obj;
        }

        private a() {
        }
    }
}
