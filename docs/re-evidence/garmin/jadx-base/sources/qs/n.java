package qs;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.n[], still in use, count: 1, list:
  (r0v1 qs.n[]) from 0x0063: CONSTRUCTOR (r0v1 qs.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqs/n;", "", "", "labelResId", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    WARMUP(R.string.workout_step_type_warmup),
    ACTIVE(R.string.lbl_run),
    RECOVERY(R.string.workout_step_type_recovery),
    REST(R.string.workout_step_type_rest),
    COOLDOWN(R.string.workout_step_type_cooldown),
    OTHER(R.string.lbl_other),
    WALK(R.string.activity_options_walk_title);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f147118b = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147127k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147128a;

    static {
        f147127k = new w13.c(new n[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private n(int i14) {
        super(str, i);
        this.f147128a = i14;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f147126j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/n$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public static n a(String str) {
            for (n nVar : n.values()) {
                if (p005kotlin.jvm.internal.s.g(nVar.name(), str)) {
                    if (nVar == null) {
                        return n.ACTIVE;
                    }
                    return nVar;
                }
            }
            nVar = null;
            if (nVar == null) {
                return n.ACTIVE;
            }
            return nVar;
        }

        private a() {
        }
    }
}
