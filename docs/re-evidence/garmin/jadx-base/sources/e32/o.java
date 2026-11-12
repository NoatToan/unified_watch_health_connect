package e32;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fBG\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Le32/o;", "", "", "dayCount", "labelRes", "", "optionalLabel", "intervalType", "contentDescriptionRes", "optionalContentDescription", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f62804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f62805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f62806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f62807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f62808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f62809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f62810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f62811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o f62812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o f62813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o f62814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f62815r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f62816t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o[] f62817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w13.c f62818w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f62822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f62823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f62824f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o oVar = new o("CURRENT", 0, 0, R.string.lbl_personal_records_current_record, null, null, Integer.valueOf(R.string.lbl_personal_records_current_record), null, 36, null);
        f62805h = oVar;
        Object[] objArr = null == true ? 1 : 0;
        o oVar2 = new o("DAILY", 1, 1, R.string.mct_steps_day_segment, objArr, 1, Integer.valueOf(R.string.mct_next_phase_day), null, 36, null);
        f62806i = oVar2;
        o oVar3 = new o("SEVEN_DAYS", 2, 7, R.string.lbl_seven_days, null, 4, Integer.valueOf(R.string.mct_next_phase_days), "7", 4, null);
        f62807j = oVar3;
        Integer numValueOf = Integer.valueOf(R.string.lbl_weeks);
        o oVar4 = new o("FOUR_WEEKS", 3, 28, R.string.lbl_four_weeks, null, 5, numValueOf, "4", 4, null);
        f62808k = oVar4;
        o oVar5 = new o("MONTHLY", 4, -1, R.string.lbl_number_of_months_abbreviation, null, 3, Integer.valueOf(R.string.common_monthly), null, 36, null);
        f62809l = oVar5;
        o oVar6 = new o("TWELVE_WEEKS", 5, 84, R.string.common_lbl_twelve_weeks, null, 10, numValueOf, "12", 4, null);
        f62810m = oVar6;
        Integer numValueOf2 = Integer.valueOf(R.string.lbl_number_of_months);
        o oVar7 = new o("THREE_MONTHS", 6, 92, R.string.lbl_number_of_months_abbreviation, "3", 11, numValueOf2, "3");
        f62811n = oVar7;
        o oVar8 = new o("SIX_MONTHS", 7, 168, R.string.lbl_number_of_months_abbreviation, "6", 7, numValueOf2, "6");
        f62812o = oVar8;
        o oVar9 = new o("TWENTY_SIX_WEEKS", 8, 182, R.string.lbl_number_of_months_abbreviation, "6", 9, numValueOf2, "6");
        f62813p = oVar9;
        Integer numValueOf3 = Integer.valueOf(R.string.lbl_one_year);
        o oVar10 = new o("TWELVE_MONTHS", 9, 365, R.string.lbl_one_year_abbr, null, 6, numValueOf3, null, 36, null);
        f62814q = oVar10;
        int i14 = 36;
        p005kotlin.jvm.internal.j jVar = null;
        int i15 = R.string.lbl_one_year_abbr;
        String str = null;
        String str2 = null;
        o oVar11 = new o("TWELVE_MONTHS_DAILY", 10, -1, i15, str, 12, numValueOf3, str2, i14, jVar);
        f62815r = oVar11;
        o oVar12 = new o("FIFTY_TWO_WEEKS", 11, 364, i15, str, 13, numValueOf3, str2, i14, jVar);
        f62816t = oVar12;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12};
        f62817v = oVarArr;
        f62818w = new w13.c(oVarArr);
        f62804g = new a(null);
    }

    public /* synthetic */ o(String str, int i14, int i15, int i16, String str2, Integer num, Integer num2, String str3, int i17, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, i16, (i17 & 4) != 0 ? null : str2, num, (i17 & 16) != 0 ? null : num2, (i17 & 32) != 0 ? null : str3);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f62817v.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le32/o$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(int i14) {
            Object next;
            w13.c cVar = o.f62818w;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                Integer num = ((o) next).f62822d;
                if (num != null && num.intValue() == i14) {
                    return (o) next;
                }
            }
            next = null;
            return (o) next;
        }

        private a() {
        }
    }

    private o(String str, int i14, int i15, int i16, String str2, Integer num, Integer num2, String str3) {
        super(str, i14);
        this.f62819a = i15;
        this.f62820b = i16;
        this.f62821c = str2;
        this.f62822d = num;
        this.f62823e = num2;
        this.f62824f = str3;
    }
}
