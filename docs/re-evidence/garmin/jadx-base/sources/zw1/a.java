package zw1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 zw1.a[], still in use, count: 1, list:
  (r0v1 zw1.a[]) from 0x0158: CONSTRUCTOR (r0v1 zw1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzw1/a;", "", "", Action.KEY_ATTRIBUTE, "", "lblMuscle", "iconResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    ABS("ABS", R.string.lbl_muscles_abs, R.drawable.muscle_group_abs),
    BICEPS("BICEPS", R.string.lbl_muscles_biceps, R.drawable.muscle_group_biceps),
    CALVES("CALVES", R.string.lbl_muscles_calves, R.drawable.muscle_group_calves),
    CHEST("CHEST", R.string.lbl_muscles_chest, R.drawable.muscle_group_chest),
    FOREARM("FOREARM", R.string.lbl_muscles_forearms, R.drawable.muscle_group_forearms),
    GLUTES("GLUTES", R.string.lbl_muscles_glutes, R.drawable.muscle_group_glutes),
    HAMSTRINGS("HAMSTRINGS", R.string.lbl_muscles_hamstrings, R.drawable.muscle_group_hamstring),
    ABDUCTORS("ABDUCTORS", R.string.lbl_muscles_hip_adductors, R.drawable.muscle_group_hip_abductors),
    ADDUCTORS("ADDUCTORS", R.string.lbl_muscles_hip_adductors, R.drawable.muscle_group_hip_adductors),
    HIPS("HIPS", R.string.lbl_muscles_lower_back, R.drawable.muscle_group_hip_flexors),
    LATS("LATS", R.string.lbl_muscles_lats, R.drawable.muscle_group_lats),
    LOWER_BACK("LOWER_BACK", R.string.lbl_muscles_lower_back, R.drawable.muscle_group_lowerback),
    OBLIQUES("OBLIQUES", R.string.lbl_muscles_obliques, R.drawable.muscle_group_obliques),
    QUADS("QUADS", R.string.lbl_muscles_quads, R.drawable.muscle_group_quads),
    SHOULDERS("SHOULDERS", R.string.lbl_muscles_shoulders, R.drawable.muscle_group_shoulders),
    TRAPS("TRAPS", R.string.lbl_muscles_traps, R.drawable.muscle_group_traps),
    TRICEPS("TRICEPS", R.string.lbl_muscles_triceps, R.drawable.muscle_group_triceps);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3865a f207205d = new C3865a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w13.c f207224y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207227c;

    static {
        f207224y = new w13.c(new a[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r16});
    }

    private a(String str, int i14, int i15) {
        super(str, i);
        this.f207225a = str;
        this.f207226b = i14;
        this.f207227c = i15;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f207223x.clone();
    }

    /* JADX INFO: renamed from: zw1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw1/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3865a {
        public /* synthetic */ C3865a(j jVar) {
            this();
        }

        public static a a(String str) {
            str.getClass();
            for (a aVar : a.values()) {
                if (s.g(aVar.f207225a, str)) {
                    return aVar;
                }
            }
            return null;
        }

        private C3865a() {
        }
    }
}
