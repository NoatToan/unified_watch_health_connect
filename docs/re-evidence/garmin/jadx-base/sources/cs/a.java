package cs;

import com.garmin.android.apps.connectmobile.R;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB1\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcs/a;", "", "", "labelRes", "descriptionRes", "colorRes", "categoryRes", "<init>", "(Ljava/lang/String;IIIII)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    ANAEROBIC(R.string.activities_training_effect_anaerobic_capacity, R.string.activities_training_effect_anaerobic_capacity_description, R.color.gcm3_training_effect_anaerobic, R.string.activity_anaerobic_label),
    SPRINT(R.string.lbl_segment_classification_sprint, R.string.activities_training_effect_sprint_description, R.color.gcm3_training_effect_anaerobic, R.string.activity_anaerobic_label),
    TEMPO(R.string.activities_training_effect_tempo, R.string.activities_training_effect_tempo_description, R.color.gcm3_training_effect_high_aerobic, R.string.activities_high_aerobic_title),
    THRESHOLD(R.string.activities_training_effect_threshold, R.string.training_effect_threshold_description, R.color.gcm3_training_effect_high_aerobic, R.string.activities_high_aerobic_title),
    VO2MAX(R.string.activities_training_effect_vo2_max, R.string.activities_training_effect_vo2max_description, R.color.gcm3_training_effect_high_aerobic, R.string.activities_high_aerobic_title),
    BASE(R.string.activities_training_effect_aerobic_base, R.string.activities_training_effect_base_description, R.color.gcm3_training_effect_low_aerobic, R.string.activities_low_aerobic_title),
    RECOVERY(R.string.activities_training_effect_recovery, R.string.activities_training_effect_recovery_description, R.color.gcm3_training_effect_low_aerobic, R.string.activities_low_aerobic_title),
    UNKNOWN(R.string.lbl_empty_string, R.string.lbl_empty_string, R.color.gcm_exercise_load_gray, R.string.lbl_empty_string);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1200a f55432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f55433f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55446d;

    static {
        a aVar = ANAEROBIC;
        a aVar2 = SPRINT;
        a aVar3 = TEMPO;
        a aVar4 = THRESHOLD;
        a aVar5 = VO2MAX;
        a aVar6 = BASE;
        a aVar7 = RECOVERY;
        f55432e = new C1200a(null);
        f55433f = u0.e(new p("ANAEROBIC_CAPACITY", aVar), new p("SPEED", aVar2), new p("TEMPO", aVar3), new p("LACTATE_THRESHOLD", aVar4), new p("VO2MAX", aVar5), new p("AEROBIC_BASE", aVar6), new p("RECOVERY", aVar7));
    }

    a(int i14, int i15, int i16, int i17) {
        this.f55443a = i14;
        this.f55444b = i15;
        this.f55445c = i16;
        this.f55446d = i17;
    }

    /* JADX INFO: renamed from: cs.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcs/a$a;", "", "<init>", "()V", "", "", "Lcs/a;", "keyMap", "Ljava/util/Map;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1200a {
        public /* synthetic */ C1200a(j jVar) {
            this();
        }

        private C1200a() {
        }
    }
}
