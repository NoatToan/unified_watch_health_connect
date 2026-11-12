package o70;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import f72.bh;
import f72.da;
import f72.k2;
import f72.oe;
import f72.z2;
import p005kotlin.Metadata;
import u62.f3;

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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo70/e;", "", "Lu4/d;", "image", "", "textRes", "Lc22/c3;", "onDemandTextRes", "", "analyticsType", "<init>", "(Ljava/lang/String;ILu4/d;ILc22/c3;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f129951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f129952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f129953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f129954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f129955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f129956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f129957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f129958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ e[] f129959m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f129960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f129962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f129963d;

    static {
        s62.a.f157643a.getClass();
        t62.a aVar = t62.a.f162797a;
        e eVar = new e("RECORD_ACTIVITY", 0, f3.a(aVar), R.string.lbl_record_activity, null, "Record Activity", 4, null);
        f129951e = eVar;
        e eVar2 = new e("ACTIVITY_IN_PROGRESS", 1, f3.a(aVar), R.string.lbl_activity_in_progress, null, "Activity in progress", 4, null);
        f129952f = eVar2;
        t62.c cVar = t62.c.f162799a;
        e eVar3 = new e("WEIGHT", 2, oe.a(cVar), R.string.lbl_weight, null, "Weight", 4, null);
        f129953g = eVar3;
        int i14 = 4;
        p005kotlin.jvm.internal.j jVar = null;
        c3 c3Var = null;
        e eVar4 = new e("HYDRATION", 3, k2.a(cVar), R.string.lbl_hydration_title, c3Var, "Hydration", i14, jVar);
        f129954h = eVar4;
        e eVar5 = new e("NUTRITION", 4, da.a(cVar), R.string.lbl_nutrition, c3Var, "Nutrition", i14, jVar);
        f129955i = eVar5;
        e eVar6 = new e("MENSTRUAL_CYCLE_SYMPTOMS", 5, bh.a(cVar), R.string.lbl_mct_symptoms, c3Var, "MCT Symptoms", i14, jVar);
        f129956j = eVar6;
        e eVar7 = new e("LIFESTYLE_LOGGING", 6, z2.a(cVar), R.string.lbl_lifestyle_logging, c3Var, "Lifestyle Logging", i14, jVar);
        f129957k = eVar7;
        e eVar8 = new e("BLOOD_PRESSURE", 7, f72.g.a(cVar), R.string.lbl_blood_pressure, c3Var, "Blood Pressure", i14, jVar);
        f129958l = eVar8;
        f129959m = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
    }

    public /* synthetic */ e(String str, int i14, u4.d dVar, int i15, c3 c3Var, String str2, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, dVar, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? null : c3Var, str2);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f129959m.clone();
    }

    private e(String str, int i14, u4.d dVar, int i15, c3 c3Var, String str2) {
        super(str, i14);
        this.f129960a = dVar;
        this.f129961b = i15;
        this.f129962c = c3Var;
        this.f129963d = str2;
    }
}
