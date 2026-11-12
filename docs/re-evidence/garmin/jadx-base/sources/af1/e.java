package af1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Laf1/e;", "", "", "classificationStringResId", "feedbackPhraseStringID", "sortOrder", "Lo13/p;", "", "gaugeRange", "<init>", "(Ljava/lang/String;IIIILo13/p;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f3072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f3073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f3074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f3075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f3076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f3077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f3078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f3079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f3080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ e[] f3081n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.p<Double, Double> f3085d;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        e eVar = new e("RECREATIONAL", 0, R.string.lbl_endurance_score_recreational, R.string.running_economy_feedback_recreational, 0, new o13.p(dValueOf, Double.valueOf(0.18d)));
        f3072e = eVar;
        e eVar2 = new e("INTERMEDIATE", 1, R.string.lbl_endurance_score_intermediate, R.string.running_economy_feedback_intermediate, 1, new o13.p(Double.valueOf(0.19d), Double.valueOf(0.36d)));
        f3073f = eVar2;
        e eVar3 = new e("TRAINED", 2, R.string.lbl_endurance_score_trained, R.string.running_economy_feedback_trained, 2, new o13.p(Double.valueOf(0.37d), Double.valueOf(0.54d)));
        f3074g = eVar3;
        e eVar4 = new e("WELL_TRAINED", 3, R.string.lbl_endurance_score_well_trained_v2, R.string.running_economy_feedback_well_trained, 3, new o13.p(Double.valueOf(0.55d), Double.valueOf(0.72d)));
        f3075h = eVar4;
        e eVar5 = new e("EXPERT", 4, R.string.lbl_endurance_score_expert, R.string.running_economy_feedback_expert, 4, new o13.p(Double.valueOf(0.73d), Double.valueOf(0.81d)));
        f3076i = eVar5;
        e eVar6 = new e("SUPERIOR", 5, R.string.lbl_endurance_score_superior, R.string.running_economy_feedback_superior, 5, new o13.p(Double.valueOf(0.82d), Double.valueOf(0.9d)));
        f3077j = eVar6;
        Double dValueOf2 = Double.valueOf(0.91d);
        Double dValueOf3 = Double.valueOf(1.0d);
        e eVar7 = new e("ELITE", 6, R.string.lbl_endurance_score_elite, R.string.running_economy_feedback_elite, 6, new o13.p(dValueOf2, dValueOf3));
        f3078k = eVar7;
        e eVar8 = new e("INVALID", 7, R.string.lbl_empty_string, R.string.lbl_empty_string, 7, new o13.p(dValueOf, dValueOf3));
        f3079l = eVar8;
        e eVar9 = new e("UNKNOWN", 8, R.string.lbl_empty_string, R.string.lbl_empty_string, 8, new o13.p(dValueOf, dValueOf3));
        f3080m = eVar9;
        f3081n = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
    }

    private e(String str, int i14, int i15, int i16, int i17, o13.p pVar) {
        super(str, i14);
        this.f3082a = i15;
        this.f3083b = i16;
        this.f3084c = i17;
        this.f3085d = pVar;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3081n.clone();
    }
}
