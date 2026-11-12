package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rBM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/u;", "", "", "weekNumber", "babySizeImage", "babySize", "myDayBabySize", "", "educationalContent", "learnMoreLinkText", "learnMoreLink", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f40867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f40868h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f40870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f40871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40874f;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        GarminConnectMobileApp.f28685g.getClass();
        String string = GarminConnectMobileApp.a.a().getString(R.string.pregnancy_educational_content1);
        string.getClass();
        u uVar = new u("WEEK_1", 0, 1, null, null, null, string, R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/week-by-week/1-and-2-weeks-pregnant/");
        u uVar2 = new u("WEEK_2", 1, 2, null, null, null, fb1.c.l(R.string.pregnancy_educational_content2), R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/week-by-week/1-and-2-weeks-pregnant/");
        u uVar3 = new u("WEEK_3", 2, 3, null, Integer.valueOf(R.string.pregnancy_grain_of_sand), Integer.valueOf(R.string.pregnancy_sand), fb1.c.l(R.string.pregnancy_educational_content3), R.string.pregnancy_learn_more_whrc, "https://www.healthywomen.org/content/article/3-weeks-pregnant-symptoms-and-signs");
        Integer numValueOf = Integer.valueOf(R.string.pregnancy_poppy_seed);
        u uVar4 = new u("WEEK_4", 3, 4, null, numValueOf, numValueOf, fb1.c.l(R.string.pregnancy_educational_content4), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20047208");
        Integer numValueOf2 = Integer.valueOf(R.string.pregnancy_peppercorn);
        u uVar5 = new u("WEEK_5", 4, 5, null, numValueOf2, numValueOf2, fb1.c.l(R.string.pregnancy_educational_content5), R.string.pregnancy_learn_more_cdc, "https://www.cdc.gov/folic-acid/about/");
        Integer numValueOf3 = Integer.valueOf(R.string.pregnancy_pea);
        u uVar6 = new u("WEEK_6", 5, 6, 2131231106, numValueOf3, numValueOf3, fb1.c.l(R.string.pregnancy_educational_content6), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy-nutrition/art-20043844");
        Integer numValueOf4 = Integer.valueOf(R.string.pregnancy_blueberry);
        u uVar7 = new u("WEEK_7", 6, 7, 2131231107, numValueOf4, numValueOf4, fb1.c.l(R.string.pregnancy_educational_content7), R.string.pregnancy_learn_more_journal_womens_health, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC2990891/");
        Integer numValueOf5 = Integer.valueOf(R.string.pregnancy_raspberry);
        u uVar8 = new u("WEEK_8", 7, 8, 2131231108, numValueOf5, numValueOf5, fb1.c.l(R.string.pregnancy_educational_content8), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
        Integer numValueOf6 = Integer.valueOf(R.string.pregnancy_cherry);
        u uVar9 = new u("WEEK_9", 8, 9, 2131231109, numValueOf6, numValueOf6, fb1.c.l(R.string.pregnancy_educational_content9), R.string.pregnancy_learn_more_ncbi, "https://www.ncbi.nlm.nih.gov/books/NBK430821/");
        Integer numValueOf7 = Integer.valueOf(R.string.pregnancy_strawberry);
        u uVar10 = new u("WEEK_10", 9, 10, 2131231075, numValueOf7, numValueOf7, fb1.c.l(R.string.pregnancy_educational_content10), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20047208");
        Integer numValueOf8 = Integer.valueOf(R.string.pregnancy_brussels_sprout);
        u uVar11 = new u("WEEK_11", 10, 11, 2131231076, numValueOf8, numValueOf8, "", R.string.pregnancy_learn_more_acog, "https://www.acog.org/Patients/FAQs/Nutrition-During-Pregnancy?IsMobileSet=false");
        Integer numValueOf9 = Integer.valueOf(R.string.pregnancy_lime);
        u uVar12 = new u("WEEK_12", 11, 12, 2131231077, numValueOf9, numValueOf9, fb1.c.l(R.string.pregnancy_educational_content12), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/expert-answers/exercise-during-pregnancy/faq-20058359");
        Integer numValueOf10 = Integer.valueOf(R.string.pregnancy_lemon);
        u uVar13 = new u("WEEK_13", 12, 13, 2131231078, numValueOf10, numValueOf10, fb1.c.l(R.string.pregnancy_educational_content13), R.string.pregnancy_learn_more_nsf, "https://www.sleepfoundation.org/articles/sleeping-trimesters-1st-trimester");
        Integer numValueOf11 = Integer.valueOf(R.string.pregnancy_peach);
        u uVar14 = new u("WEEK_14", 13, 14, 2131231079, numValueOf11, numValueOf11, fb1.c.l(R.string.pregnancy_educational_content14), R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/pregnancy-health/lack-energy-pregnancy/");
        Integer numValueOf12 = Integer.valueOf(R.string.pregnancy_apple);
        u uVar15 = new u("WEEK_15", 14, 15, 2131231080, numValueOf12, numValueOf12, "", R.string.pregnancy_learn_more_cdc, "https://www.cdc.gov/maternal-infant-health/pregnancy-weight");
        Integer numValueOf13 = Integer.valueOf(R.string.pregnancy_avocado);
        u uVar16 = new u("WEEK_16", 15, 16, 2131231081, numValueOf13, numValueOf13, fb1.c.l(R.string.pregnancy_educational_content16), R.string.pregnancy_learn_more_acog, "https://www.acog.org/patient-resources/faqs/pregnancy/nutrition-during-pregnancy");
        Integer numValueOf14 = Integer.valueOf(R.string.pregnancy_pear);
        u uVar17 = new u("WEEK_17", 16, 17, 2131231082, numValueOf14, numValueOf14, fb1.c.l(R.string.pregnancy_educational_content17), R.string.pregnancy_learn_more_psychology_associtation, "https://www.apa.org/monitor/2018/06/stress-pregnancy");
        Integer numValueOf15 = Integer.valueOf(R.string.pregnancy_sweet_potato);
        u uVar18 = new u("WEEK_18", 17, 18, 2131231083, numValueOf15, numValueOf15, fb1.c.l(R.string.pregnancy_educational_content18), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy-nutrition/art-20046955");
        Integer numValueOf16 = Integer.valueOf(R.string.pregnancy_mango);
        u uVar19 = new u("WEEK_19", 18, 19, 2131231084, numValueOf16, numValueOf16, fb1.c.l(R.string.pregnancy_educational_content19), R.string.pregnancy_learn_more_owh, "https://www.womenshealth.gov/pregnancy/youre-pregnant-now-what/body-changes-and-discomforts");
        Integer numValueOf17 = Integer.valueOf(R.string.pregnancy_artichoke);
        u uVar20 = new u("WEEK_20", 19, 20, 2131231085, numValueOf17, numValueOf17, fb1.c.l(R.string.pregnancy_educational_content20), R.string.pregnancy_learn_more_nih, "https://ods.od.nih.gov/factsheets/Iron-HealthProfessional/#h7");
        Integer numValueOf18 = Integer.valueOf(R.string.pregnancy_papaya);
        u uVar21 = new u("WEEK_21", 20, 21, 2131231086, numValueOf18, numValueOf18, fb1.c.l(R.string.pregnancy_educational_content21), R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/week-by-week/21-weeks-pregnant/");
        Integer numValueOf19 = Integer.valueOf(R.string.pregnancy_grapefruit);
        u uVar22 = new u("WEEK_22", 21, 22, 2131231087, numValueOf19, numValueOf19, fb1.c.l(R.string.pregnancy_educational_content22), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/expert-answers/exercise-during-pregnancy/faq-20058359");
        Integer numValueOf20 = Integer.valueOf(R.string.pregnancy_eggplant);
        u uVar23 = new u("WEEK_23", 22, 23, 2131231088, numValueOf20, numValueOf20, fb1.c.l(R.string.pregnancy_educational_content23), R.string.pregnancy_learn_more_nsf, "https://www.sleepfoundation.org/articles/sleeping-trimesters-2nd-trimester");
        Integer numValueOf21 = Integer.valueOf(R.string.pregnancy_sweet_corn);
        u uVar24 = new u("WEEK_24", 23, 24, 2131231089, numValueOf21, numValueOf21, fb1.c.l(R.string.pregnancy_educational_content24), R.string.pregnancy_learn_more_acog, "https://www.acog.org/patient-resources/faqs/pregnancy/exercise-during-pregnancy");
        Integer numValueOf22 = Integer.valueOf(R.string.pregnancy_acorn_squash);
        Integer numValueOf23 = Integer.valueOf(R.string.pregnancy_squash);
        u uVar25 = new u("WEEK_25", 24, 25, 2131231090, numValueOf22, numValueOf23, "", R.string.pregnancy_learn_more_jpe, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC1595116/");
        Integer numValueOf24 = Integer.valueOf(R.string.pregnancy_red_cabbage);
        u uVar26 = new u("WEEK_26", 25, 26, 2131231091, numValueOf24, numValueOf24, fb1.c.l(R.string.pregnancy_educational_content26), R.string.pregnancy_learn_more_nih, "https://medlineplus.gov/ency/article/002398.htm");
        Integer numValueOf25 = Integer.valueOf(R.string.pregnancy_head_of_lettuce);
        Integer numValueOf26 = Integer.valueOf(R.string.pregnancy_lettuce);
        u uVar27 = new u("WEEK_27", 26, 27, 2131231092, numValueOf25, numValueOf26, "", R.string.pregnancy_learn_more_cdc, "https://www.cdc.gov/maternal-infant-health/pregnancy-weight");
        Integer numValueOf27 = Integer.valueOf(R.string.pregnancy_cauliflower);
        u uVar28 = new u("WEEK_28", 27, 28, 2131231093, numValueOf27, numValueOf27, fb1.c.l(R.string.pregnancy_educational_content28), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20046767");
        Integer numValueOf28 = Integer.valueOf(R.string.pregnancy_coconut);
        u uVar29 = new u("WEEK_29", 28, 29, 2131231094, numValueOf28, numValueOf28, fb1.c.l(R.string.pregnancy_educational_content29), R.string.pregnancy_learn_more_nsf, "https://www.sleepfoundation.org/articles/sleeping-trimesters-3rd-trimester");
        u uVar30 = new u("WEEK_30", 29, 30, 2131231095, Integer.valueOf(R.string.pregnancy_butternut_squash), numValueOf23, fb1.c.l(R.string.pregnancy_educational_content30), R.string.pregnancy_learn_more_cdc, "https://www.cdc.gov/pregnancy/diabetes-gestational.html");
        Integer numValueOf29 = Integer.valueOf(R.string.pregnancy_cabbage);
        u uVar31 = new u("WEEK_31", 30, 31, 2131231096, numValueOf29, numValueOf29, fb1.c.l(R.string.pregnancy_educational_content31), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy-nutrition/art-20045082");
        Integer numValueOf30 = Integer.valueOf(R.string.pregnancy_jicama);
        u uVar32 = new u("WEEK_32", 31, 32, 2131231097, numValueOf30, numValueOf30, fb1.c.l(R.string.pregnancy_educational_content32), R.string.pregnancy_learn_more_acog, "https://www.acog.org/patient-resources/faqs/pregnancy/exercise-during-pregnancy");
        Integer numValueOf31 = Integer.valueOf(R.string.pregnancy_pineapple);
        u uVar33 = new u("WEEK_33", 32, 33, 2131231098, numValueOf31, numValueOf31, fb1.c.l(R.string.pregnancy_educational_content33), R.string.pregnancy_learn_more_aafp, "https://familydoctor.org/eating-healthy-during-pregnancy/");
        Integer numValueOf32 = Integer.valueOf(R.string.pregnancy_canteloupe);
        f40868h = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, new u("WEEK_34", 33, 34, 2131231099, numValueOf32, numValueOf32, fb1.c.l(R.string.pregnancy_educational_content34), R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/pregnancy-health/skin-changes-during-pregnancy/"), new u("WEEK_35", 34, 35, 2131231100, Integer.valueOf(R.string.pregnancy_honeydew), Integer.valueOf(R.string.pregnancy_honeydew), fb1.c.l(R.string.pregnancy_educational_content35), R.string.pregnancy_learn_more_ace, "https://www.acefitness.org/education-and-resources/professional/certified/february-2017/6242/training-the-prenatal-client-specific-considerations-and-exercises-for-late-term-pregnancy"), new u("WEEK_36", 35, 36, 2131231101, Integer.valueOf(R.string.pregnancy_head_of_romaine_lettuce), numValueOf26, fb1.c.l(R.string.pregnancy_educational_content36), R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/pregnancy-complications/abdominal-pain-during-pregnancy/"), new u("WEEK_37", 36, 37, 2131231102, Integer.valueOf(R.string.pregnancy_winter_melon), Integer.valueOf(R.string.pregnancy_winter_melon), fb1.c.l(R.string.pregnancy_educational_content37), R.string.pregnancy_learn_more_mayo_clinic, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy-and-exercise/art-20046896"), new u("WEEK_38", 37, 38, 2131231103, Integer.valueOf(R.string.pregnancy_small_pumpkin), Integer.valueOf(R.string.pregnancy_pumpkin), "", R.string.pregnancy_learn_more_jpe, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC1595116/"), new u("WEEK_39", 38, 39, 2131231104, Integer.valueOf(R.string.pregnancy_watermelon), Integer.valueOf(R.string.pregnancy_watermelon), fb1.c.l(R.string.pregnancy_educational_content39), R.string.pregnancy_learn_more_pregnancy_association, "https://americanpregnancy.org/pregnancy-health/breast-changes-during-pregnancy/"), new u("WEEK_40", 39, 40, 2131231105, Integer.valueOf(R.string.pregnancy_jackfruit), Integer.valueOf(R.string.pregnancy_jackfruit), fb1.c.l(R.string.pregnancy_educational_content40), R.string.pregnancy_learn_more_owh, "https://www.womenshealth.gov/pregnancy/childbirth-and-beyond/labor-and-birth")};
        f40867g = new a(null);
    }

    private u(String str, int i14, int i15, Integer num, Integer num2, Integer num3, String str2, int i16, String str3) {
        super(str, i14);
        this.f40869a = i15;
        this.f40870b = num;
        this.f40871c = num2;
        this.f40872d = str2;
        this.f40873e = i16;
        this.f40874f = str3;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f40868h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/u$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
