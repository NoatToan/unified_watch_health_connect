package ww0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v30 ww0.t[], still in use, count: 1, list:
  (r0v30 ww0.t[]) from 0x0190: CONSTRUCTOR (r0v30 ww0.t[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lww0/t;", "Lww0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements f {
    ACNE,
    BACKACHE,
    BLOATING,
    BODY_ACHES,
    CONSTIPATION,
    CRAMPS,
    CRAVINGS,
    DIARRHEA,
    DIZZINESS,
    FATIGUE,
    HEADACHE,
    INSOMNIA,
    NAUSEA,
    TENDER_BREASTS,
    CONTRACTIONS,
    TROUBLE_BREATHING,
    FREQUENT_URINATION,
    VOMITING,
    ROUND_LIGAMENT_PAIN,
    HEARTBURN,
    SWELLING,
    CHILLS,
    DISTRACTED,
    DRY_SKIN,
    HAIR_LOSS,
    HOT_FLASHES,
    NIGHT_SWEATS,
    URINE_LEAKAGE,
    VAGINAL_DRYNESS,
    WEIGHT_GAIN;

    public static final /* synthetic */ w13.c X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<t> f187659b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187683a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.ACNE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.BACKACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.BLOATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.BODY_ACHES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.CONSTIPATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.CRAMPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.CRAVINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.CONTRACTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.DIARRHEA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[t.DIZZINESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[t.FATIGUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[t.HEADACHE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[t.INSOMNIA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[t.NAUSEA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[t.TENDER_BREASTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[t.CHILLS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[t.DISTRACTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[t.DRY_SKIN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[t.FREQUENT_URINATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[t.HAIR_LOSS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[t.HOT_FLASHES.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[t.NIGHT_SWEATS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[t.TROUBLE_BREATHING.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[t.URINE_LEAKAGE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[t.VAGINAL_DRYNESS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[t.VOMITING.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[t.WEIGHT_GAIN.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[t.ROUND_LIGAMENT_PAIN.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[t.HEARTBURN.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[t.SWELLING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            f187683a = iArr;
        }
    }

    static {
        t tVar = CONTRACTIONS;
        t tVar2 = TROUBLE_BREATHING;
        t tVar3 = VOMITING;
        t tVar4 = ROUND_LIGAMENT_PAIN;
        t tVar5 = HEARTBURN;
        t tVar6 = SWELLING;
        X = new w13.c(tVarArr);
        f187658a = new a(null);
        f187659b = x.k(tVar, tVar2, tVar3, tVar4, tVar5, tVar6);
    }

    private t() {
        super(str, i);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) T.clone();
    }

    @Override // ww0.f
    public final String a(Context context) {
        int i14;
        context.getClass();
        switch (b.f187683a[ordinal()]) {
            case 1:
                i14 = R.string.mct_acne;
                break;
            case 2:
                i14 = R.string.mct_backache;
                break;
            case 3:
                i14 = R.string.mct_bloating;
                break;
            case 4:
                i14 = R.string.mct_body_aches;
                break;
            case 5:
                i14 = R.string.mct_constipation;
                break;
            case 6:
                i14 = R.string.mct_cramps;
                break;
            case 7:
                i14 = R.string.mct_cravings;
                break;
            case 8:
                i14 = R.string.pregnancy_contractions;
                break;
            case 9:
                i14 = R.string.mct_diarrhea;
                break;
            case 10:
                i14 = R.string.pregnancy_dizziness;
                break;
            case 11:
                i14 = R.string.mct_fatigue;
                break;
            case 12:
                i14 = R.string.mct_headache;
                break;
            case 13:
                i14 = R.string.mct_trouble_sleeping;
                break;
            case 14:
                i14 = R.string.mct_nausea;
                break;
            case 15:
                i14 = R.string.mct_tender_breasts;
                break;
            case 16:
                i14 = R.string.mct_chills;
                break;
            case 17:
                i14 = R.string.mct_distracted;
                break;
            case 18:
                i14 = R.string.mct_dry_skin;
                break;
            case 19:
                i14 = R.string.mct_frequent_urination;
                break;
            case 20:
                i14 = R.string.mct_hair_loss;
                break;
            case 21:
                i14 = R.string.mct_hot_flashes;
                break;
            case 22:
                i14 = R.string.mct_night_sweats;
                break;
            case 23:
                i14 = R.string.pregnancy_trouble_breathing;
                break;
            case 24:
                i14 = R.string.mct_urine_leakage;
                break;
            case 25:
                i14 = R.string.mct_vaginal_dryness;
                break;
            case 26:
                i14 = R.string.pregnancy_vomiting;
                break;
            case 27:
                i14 = R.string.mct_weight_gain;
                break;
            case 28:
                i14 = R.string.pregnancy_round_ligament_pain;
                break;
            case 29:
                i14 = R.string.pregnancy_heartburn;
                break;
            case 30:
                i14 = R.string.pregnancy_swelling;
                break;
            default:
                u0.r();
                return null;
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    @Override // ww0.f
    public final int b() {
        switch (b.f187683a[ordinal()]) {
            case 1:
                return R.raw.icon_mct_symptom_acne;
            case 2:
                return R.raw.icon_mct_symptom_backache;
            case 3:
                return R.raw.icon_mct_symptom_bloating;
            case 4:
                return R.raw.icon_mct_symptom_bodyache;
            case 5:
                return R.raw.icon_mct_symptom_constipation;
            case 6:
                return R.raw.icon_mct_symptom_cramps;
            case 7:
                return R.raw.icon_mct_symptom_craving;
            case 8:
                return R.raw.icon_mct_symptom_contraction;
            case 9:
                return R.raw.icon_mct_symptom_diarrhea;
            case 10:
                return R.raw.icon_mct_symptom_confusion;
            case 11:
                return R.raw.icon_mct_symptom_fatigue;
            case 12:
                return R.raw.icon_mct_symptom_headache;
            case 13:
                return R.raw.icon_mct_symptom_nosleep;
            case 14:
                return R.raw.icon_mct_symptom_nausea;
            case 15:
                return R.raw.icon_mct_symptom_tender_breasts;
            case 16:
                return R.raw.icon_mct_symptom_chills;
            case 17:
                return R.raw.icon_mct_symptom_distracted;
            case 18:
                return R.raw.icon_mct_symptom_dry_skin;
            case 19:
                return R.raw.icon_mct_symptom_frequent_urination;
            case 20:
                return R.raw.icon_mct_symptom_hairloss;
            case 21:
                return R.raw.icon_mct_symptom_hotflashes;
            case 22:
                return R.raw.icon_mct_symptom_night_sweats;
            case 23:
                return R.raw.icon_mct_symptom_breath;
            case 24:
                return R.raw.icon_mct_symptom_urine_leakage;
            case 25:
                return R.raw.icon_mct_symptom_vaginal_dryness;
            case 26:
                return R.raw.icon_mct_symptom_vomit;
            case 27:
                return R.raw.icon_mct_symptom_weight_gain;
            case 28:
                return R.raw.icon_mct_symptom_round_ligament_pain;
            case 29:
                return R.raw.icon_mct_symptoms_heartburn;
            case 30:
                return R.raw.icon_mct_symptoms_swelling;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lww0/t$a;", "", "<init>", "()V", "", "Lww0/t;", "excludeFromMenopauseList", "Ljava/util/List;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: ww0.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3490a<T> implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f187682a;

            public C3490a(Comparator comparator) {
                this.f187682a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return this.f187682a.compare(((t) t7).name(), ((t) t14).name());
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static List a(Context context, List list) {
            list.getClass();
            Collator collator = Collator.getInstance();
            collator.setStrength(1);
            return h0.N0(list, new C3490a(collator));
        }

        private a() {
        }
    }
}
