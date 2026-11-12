package u40;

import c22.c3;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lu40/e;", "", "Lc22/c3;", "title", "", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "pointTypes", "<init>", "(Ljava/lang/String;ILc22/c3;Ljava/util/List;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f168556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f168557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f168558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f168559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f168560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f168561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f168562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f168563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f168564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ e[] f168565l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f168566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.f> f168567b;

    static {
        e eVar = new e("GENERIC", 0, c22.i.b(R.string.lbl_general), x.k(com.garmin.android.apps.connectmobile.courses.model.f.GENERIC, com.garmin.android.apps.connectmobile.courses.model.f.DISTANCE, com.garmin.android.apps.connectmobile.courses.model.f.INFO, com.garmin.android.apps.connectmobile.courses.model.f.SERVICE));
        f168557d = eVar;
        e eVar2 = new e("AID_STATION", 1, c22.i.b(R.string.lbl_course_points_aid_station), x.k(com.garmin.android.apps.connectmobile.courses.model.f.AID_STATION, com.garmin.android.apps.connectmobile.courses.model.f.FIRST_AID, com.garmin.android.apps.connectmobile.courses.model.f.FOOD, com.garmin.android.apps.connectmobile.courses.model.f.WATER, com.garmin.android.apps.connectmobile.courses.model.f.ENERGY_GEL, com.garmin.android.apps.connectmobile.courses.model.f.SPORTS_DRINK));
        f168558e = eVar2;
        e eVar3 = new e("CYCLING", 2, c22.i.b(R.string.snapshot_cycle), x.k(com.garmin.android.apps.connectmobile.courses.model.f.SPRINT, com.garmin.android.apps.connectmobile.courses.model.f.HC_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T1_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T2_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T3_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T4_CLIMB));
        f168559f = eVar3;
        e eVar4 = new e("PERSONAL", 3, c22.i.b(R.string.lbl_course_points_personal), x.k(com.garmin.android.apps.connectmobile.courses.model.f.TOILET, com.garmin.android.apps.connectmobile.courses.model.f.SHOWER, com.garmin.android.apps.connectmobile.courses.model.f.GEAR, com.garmin.android.apps.connectmobile.courses.model.f.NAV_AID, com.garmin.android.apps.connectmobile.courses.model.f.TRANSPORT));
        f168560g = eVar4;
        c22.i iVarB = c22.i.b(R.string.lbl_course_points_landmarks);
        com.garmin.android.apps.connectmobile.courses.model.f fVar = com.garmin.android.apps.connectmobile.courses.model.f.TRANSITION;
        com.garmin.android.apps.connectmobile.courses.model.f fVar2 = com.garmin.android.apps.connectmobile.courses.model.f.CHECKPOINT;
        com.garmin.android.apps.connectmobile.courses.model.f fVar3 = com.garmin.android.apps.connectmobile.courses.model.f.MEETING_SPOT;
        com.garmin.android.apps.connectmobile.courses.model.f fVar4 = com.garmin.android.apps.connectmobile.courses.model.f.CAMPSITE;
        com.garmin.android.apps.connectmobile.courses.model.f fVar5 = com.garmin.android.apps.connectmobile.courses.model.f.SHELTER;
        com.garmin.android.apps.connectmobile.courses.model.f fVar6 = com.garmin.android.apps.connectmobile.courses.model.f.REST_AREA;
        com.garmin.android.apps.connectmobile.courses.model.f fVar7 = com.garmin.android.apps.connectmobile.courses.model.f.SUMMIT;
        com.garmin.android.apps.connectmobile.courses.model.f fVar8 = com.garmin.android.apps.connectmobile.courses.model.f.TUNNEL;
        com.garmin.android.apps.connectmobile.courses.model.f fVar9 = com.garmin.android.apps.connectmobile.courses.model.f.BRIDGE;
        com.garmin.android.apps.connectmobile.courses.model.f fVar10 = com.garmin.android.apps.connectmobile.courses.model.f.VALLEY;
        com.garmin.android.apps.connectmobile.courses.model.f fVar11 = com.garmin.android.apps.connectmobile.courses.model.f.OVERLOOK;
        com.garmin.android.apps.connectmobile.courses.model.f fVar12 = com.garmin.android.apps.connectmobile.courses.model.f.STORE;
        e eVar5 = new e("LANDMARKS", 4, iVarB, x.k(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, com.garmin.android.apps.connectmobile.courses.model.f.RACE_OBSTACLE_START, com.garmin.android.apps.connectmobile.courses.model.f.RACE_OBSTACLE_END));
        f168561h = eVar5;
        e eVar6 = new e("LANDMARKS_NO_OBSTACLE", 5, c22.i.b(R.string.lbl_course_points_landmarks), x.k(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12));
        f168562i = eVar6;
        e eVar7 = new e("HAZARD", 6, c22.i.b(R.string.lbl_course_points_hazard), x.k(com.garmin.android.apps.connectmobile.courses.model.f.ALERT, com.garmin.android.apps.connectmobile.courses.model.f.DANGER, com.garmin.android.apps.connectmobile.courses.model.f.OBSTACLE, com.garmin.android.apps.connectmobile.courses.model.f.CROSSING, com.garmin.android.apps.connectmobile.courses.model.f.STEEP_INCLINE, com.garmin.android.apps.connectmobile.courses.model.f.SHARP_CURVE));
        f168563j = eVar7;
        x0.f23314a.getClass();
        e eVar8 = new e("POINTS_OF_INTEREST", 7, g2.b(x0.Hc), x.k(com.garmin.android.apps.connectmobile.courses.model.f.BIKE_SHOP_AND_REPAIR, com.garmin.android.apps.connectmobile.courses.model.f.CONVENIENCE, com.garmin.android.apps.connectmobile.courses.model.f.COFFEE_SHOP, com.garmin.android.apps.connectmobile.courses.model.f.PARK, com.garmin.android.apps.connectmobile.courses.model.f.WINERY_OR_BREWERY, com.garmin.android.apps.connectmobile.courses.model.f.BANK_OR_ATM, com.garmin.android.apps.connectmobile.courses.model.f.RESTAURANT, com.garmin.android.apps.connectmobile.courses.model.f.EMERGENCY, com.garmin.android.apps.connectmobile.courses.model.f.RECREATION, com.garmin.android.apps.connectmobile.courses.model.f.ATTRACTION, com.garmin.android.apps.connectmobile.courses.model.f.LODGING, com.garmin.android.apps.connectmobile.courses.model.f.SHOPPING, com.garmin.android.apps.connectmobile.courses.model.f.COMMUNITY));
        f168564k = eVar8;
        f168565l = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        f168556c = new a(null);
    }

    private e(String str, int i14, c3 c3Var, List list) {
        super(str, i14);
        this.f168566a = c3Var;
        this.f168567b = list;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f168565l.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu40/e$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
