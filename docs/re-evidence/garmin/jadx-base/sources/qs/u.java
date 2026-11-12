package qs;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.u[], still in use, count: 1, list:
  (r0v1 qs.u[]) from 0x00ac: CONSTRUCTOR (r0v1 qs.u[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lqs/u;", "", "", "apiKey", "", "primaryBenefitTitle", "primaryBenefitDescription", "colorIndicator", "primaryBenefitCategory", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIII)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {
    /* JADX INFO: Fake field, exist only in values array */
    SPEED("SPEED", R.string.lbl_segment_classification_sprint, R.string.activities_training_effect_sprint_description, R.color.gcm3_training_effect_anaerobic, R.string.activity_anaerobic_label),
    /* JADX INFO: Fake field, exist only in values array */
    ANAEROBIC_CAPACITY("ANAEROBIC_CAPACITY", R.string.activities_training_effect_anaerobic_capacity, R.string.activities_training_effect_anaerobic_capacity_description, R.color.gcm3_training_effect_anaerobic, R.string.activity_anaerobic_label),
    VO2MAX("VO2MAX", R.string.activities_training_effect_vo2_max, R.string.activities_training_effect_vo2max_description, R.color.gcm3_training_effect_high_aerobic, R.string.activities_high_aerobic_title),
    LACTATE_THRESHOLD("LACTATE_THRESHOLD", R.string.activities_training_effect_threshold, R.string.training_effect_threshold_description, R.color.gcm3_training_effect_high_aerobic, R.string.activities_high_aerobic_title),
    TEMPO("TEMPO", R.string.activities_training_effect_tempo, R.string.activities_training_effect_tempo_description, R.color.gcm3_training_effect_high_aerobic, R.string.activities_high_aerobic_title),
    AEROBIC_BASE("AEROBIC_BASE", R.string.activities_training_effect_aerobic_base, R.string.activities_training_effect_base_description, R.color.gcm3_training_effect_low_aerobic, R.string.activities_low_aerobic_title),
    RECOVERY("RECOVERY", R.string.activities_training_effect_recovery, R.string.activities_training_effect_recovery_description, R.color.gcm3_training_effect_low_aerobic, R.string.activities_low_aerobic_title);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f147173f = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147180m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f147184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f147185e;

    static {
        f147180m = new w13.c(new u[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private u(String str, int i14, int i15, int i16, int i17) {
        super(str, i);
        this.f147181a = str;
        this.f147182b = i14;
        this.f147183c = i15;
        this.f147184d = i16;
        this.f147185e = i17;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f147179l.clone();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lqs/u$a;", "", "<init>", "()V", "", "TRAINING_EFFECT_MODE_AEROBIC", "I", "TRAINING_EFFECT_MODE_ANAEROBIC", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u a(String str) {
            Object next;
            w13.c cVar = u.f147180m;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((u) next).f147181a, str)) {
                    return (u) next;
                }
            }
            next = null;
            return (u) next;
        }

        private a() {
        }
    }
}
