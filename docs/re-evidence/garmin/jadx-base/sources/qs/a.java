package qs;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqs/a;", "", "", Action.KEY_ATTRIBUTE, "", "shortPhrase", "longPhrase", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    LEVEL_0("MINOR_AEROBIC_BENEFIT_0", R.string.aerobic_minor_benefit, R.string.aerobic_detail_minor_benefit),
    LEVEL_1("MAINTAINING_AEROBIC_FITNESS_1", R.string.aerobic_maintaining_fitness, R.string.aerobic_detail_maintaining_fitness),
    LEVEL_2("IMPROVING_AEROBIC_FITNESS_2", R.string.aerobic_improving_fitness, R.string.aerobic_detail_improving_fitness),
    LEVEL_3("HIGHLY_IMPROVING_AEROBIC_FITNESS_3", R.string.aerobic_highly_improving_fitness, R.string.aerobic_detail_highly_improving_fitness),
    LEVEL_4("OVERREACHING_4", R.string.aerobic_overreaching, R.string.aerobic_detail_overreaching_fitness),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_5("RECOVERY_5", R.string.workout_step_type_recovery, R.string.aerobic_detail_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_6("MINOR_AEROBIC_BENEFIT_6", R.string.aerobic_minor_benefit, R.string.aerobic_detail_some_benefit),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_7("MAINTAINING_AEROBIC_BASE_7", R.string.aerobic_maintaining_base, R.string.aerobic_detail_maintaining_base),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_8("IMPROVING_AEROBIC_BASE_8", R.string.aerobic_improving_base, R.string.aerobic_detail_improving_base),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_9("IMPROVING_AEROBIC_ENDURANCE_9", R.string.aerobic_improving_endurance, R.string.aerobic_detail_improving_endurance),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_10("HIGHLY_IMPROVING_AEROBIC_ENDURANCE_10", R.string.aerobic_highly_improving_endurance, R.string.aerobic_detail_highly_improving_endurance),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_11("OVERREACHING_11", R.string.aerobic_overreaching, R.string.aerobic_detail_overreaching_endurance),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_12("IMPROVING_LACTATE_THRESHOLD_12", R.string.aerobic_improving_lactate_threshold, R.string.aerobic_detail_improving_lactate_threshold),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_13("HIGHLY_IMPROVING_LACTATE_THRESHOLD_13", R.string.aerobic_highly_improving_lactate_threshold, R.string.aerobic_detail_highly_improving_lactate_threshold),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_14("OVERREACHING_14", R.string.aerobic_overreaching, R.string.aerobic_detail_overreaching_lactate_threshold),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_16("IMPROVING_VO2_MAX_15", R.string.aerobic_improving_vo2, R.string.aerobic_detail_improving_vo2),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_16("HIGHLY_IMPROVING_VO2_MAX_16", R.string.aerobic_highly_improving_vo2, R.string.aerobic_detail_highly_improving_vo2),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_17("OVERREACHING_17", R.string.aerobic_overreaching, R.string.aerobic_detail_overreaching_vo2),
    LEVEL_18("NO_AEROBIC_BENEFIT_18", R.string.aerobic_no_benefit, R.string.aerobic_detail_no_benefit),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_19("MAINTAINING_LACTATE_THRESHOLD_19", R.string.aerobic_maintaining_threshold_short, R.string.aerobic_maintaining_threshold),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_20("MAINTAINING_VO2_MAX_20", R.string.aerobic_maintaining_vo2max_short, R.string.aerobic_maintaining_vo2max),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_21("MAINTAINING_TEMPO_21", R.string.aerobic_maintaining_tempo_short, R.string.aerobic_maintaining_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_22("IMPACTING_TEMPO_22", R.string.aerobic_impacting_tempo_short, R.string.aerobic_impacting_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_23("HIGHLY_IMPACTING_TEMPO_23", R.string.aerobic_maintaining_highly_impacting_tempo_short, R.string.aerobic_maintaining_highly_impacting_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_24("OVERREACHING_TEMPO_24", R.string.aerobic_maintaining_highly_overreaching_tempo_short, R.string.aerobic_maintaining_highly_overreaching_tempo);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2767a f146981d = new C2767a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146991c;

    a(String str, int i14, int i15) {
        this.f146989a = str;
        this.f146990b = i14;
        this.f146991c = i15;
    }

    /* JADX INFO: renamed from: qs.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/a$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2767a {
        public /* synthetic */ C2767a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2767a() {
        }
    }
}
