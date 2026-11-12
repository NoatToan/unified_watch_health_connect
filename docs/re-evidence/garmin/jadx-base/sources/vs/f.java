package vs;

import bs2.nv;
import bs2.sw;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF7' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvs/f;", "", "", "activityTypeKey", "", "icon", Constants.ScionAnalytics.PARAM_LABEL, "Lbs2/nv;", "sport", "Lbs2/sw;", "subSport", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILbs2/nv;Lbs2/sw;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f179708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f179709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f179710h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f179712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f179713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nv f179714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sw f179715e;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    /* JADX INFO: Fake field, exist only in values array */
    f EF1;

    /* JADX INFO: Fake field, exist only in values array */
    f EF2;

    /* JADX INFO: Fake field, exist only in values array */
    f EF3;

    /* JADX INFO: Fake field, exist only in values array */
    f EF4;

    /* JADX INFO: Fake field, exist only in values array */
    f EF5;

    /* JADX INFO: Fake field, exist only in values array */
    f EF6;

    /* JADX INFO: Fake field, exist only in values array */
    f EF7;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f fVar = new f("Baseball", 0, "baseball", c10.a.f22451h.f22488a, R.string.lbl_baseball, nv.BASEBALL, null, 16, null);
        f fVar2 = new f("Basketball", 1, "basketball", R.drawable.basketball, R.string.lbl_basketball, nv.BASKETBALL, null, 16, null);
        f fVar3 = new f("Boxing", 2, "boxing", R.drawable.boxing, R.string.lbl_boxing, nv.BOXING, null, 16, null);
        f fVar4 = new f("Cardio", 3, "cardio", c10.a.f22466o.f22488a, R.string.lbl_cardio, nv.TRAINING, sw.CARDIO_TRAINING);
        f fVar5 = new f("Cricket", 4, "cricket", R.drawable.cricket, R.string.lbl_cricket, nv.CRICKET, 0 == true ? 1 : 0, 16, null);
        f fVar6 = new f("Cycling", 5, "cycling", c10.a.f22453i.f22488a, R.string.lbl_cycling, nv.CYCLING, null, 16, null);
        f fVar7 = new f("AmericanFootball", 6, "american_football", R.drawable.football, R.string.lbl_american_football, nv.AMERICAN_FOOTBALL, null, 16, null);
        nv nvVar = nv.HOCKEY;
        f fVar8 = new f("FieldHockey", 7, "field_hockey", R.drawable.hockey_field, R.string.lbl_field_hockey, nvVar, sw.FIELD);
        f fVar9 = new f("Hockey", 8, "hockey", R.drawable.hockey_ice, R.string.lbl_ice_hockey, nvVar, sw.ICE);
        f fVar10 = new f("Lacrosse", 9, "lacrosse", R.drawable.lacrosse, R.string.lbl_lacrosse, nv.LACROSSE, null, 16, null);
        f fVar11 = new f("MixedMartialArts", 10, "mixed_martial_arts", R.drawable.mixed_martial_arts, R.string.lbl_mixed_martial_arts, nv.MIXED_MARTIAL_ARTS, null, 16, null);
        f fVar12 = new f("Rugby", 11, "rugby", R.drawable.rugby, R.string.lbl_rugby, nv.RUGBY, null, 16, null);
        f fVar13 = new f("Running", 12, "running", c10.a.f22465n1.f22488a, R.string.lbl_running, nv.RUNNING, null, 16, null);
        f fVar14 = new f("Soccer", 13, "soccer", R.drawable.soccer, R.string.lbl_soccer, nv.SOCCER, null, 16, null);
        f fVar15 = new f("Softball", 14, "softball", R.drawable.softball, R.string.lbl_softball, nv.SOFTBALL_FAST_PITCH, null, 16, null);
        f fVar16 = new f("UltimateDisc", 15, "ultimate_disc", R.drawable.ultimatefrisbee, R.string.lbl_ultimate_disc, nv.DISC_GOLF, sw.ULTIMATE);
        f fVar17 = new f("Volleyball", 16, "volleyball", R.drawable.volleyball, R.string.lbl_volleyball, nv.VOLLEYBALL, 0 == true ? 1 : 0, 16, null);
        f fVar18 = new f("Other", 17, "other", c10.a.f22442c1.f22488a, R.string.lbl_other, nv.GENERIC, null, 16, null);
        f179708f = fVar18;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18};
        f179709g = fVarArr;
        f179710h = new w13.c(fVarArr);
    }

    public /* synthetic */ f(String str, int i14, String str2, int i15, int i16, nv nvVar, sw swVar, int i17, j jVar) {
        this(str, i14, str2, i15, i16, (i17 & 8) != 0 ? nv.INVALID : nvVar, (i17 & 16) != 0 ? sw.GENERIC : swVar);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f179709g.clone();
    }

    private f(String str, int i14, String str2, int i15, int i16, nv nvVar, sw swVar) {
        super(str, i14);
        this.f179711a = str2;
        this.f179712b = i15;
        this.f179713c = i16;
        this.f179714d = nvVar;
        this.f179715e = swVar;
    }
}
