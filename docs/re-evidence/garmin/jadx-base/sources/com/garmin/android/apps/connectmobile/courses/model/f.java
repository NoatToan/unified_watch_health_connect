package com.garmin.android.apps.connectmobile.courses.model;

import c22.c3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.garmin.android.apps.connectmobile.courses.model.f[], still in use, count: 1, list:
  (r0v4 com.garmin.android.apps.connectmobile.courses.model.f[]) from 0x06e9: CONSTRUCTOR (r0v4 com.garmin.android.apps.connectmobile.courses.model.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010BO\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0012\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/f;", "", "", Action.KEY_ATTRIBUTE, "", "poiImageRes", "imageRes", "poiLabel", "poiAbbreviatedLabel", "", "distanceInMeters", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "pointOfInterestType", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIIIDLcom/garmin/android/apps/connectmobile/courses/model/h;)V", "(Ljava/lang/String;ILcom/garmin/android/apps/connectmobile/courses/model/h;Ljava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    GENERIC("GENERIC", R.drawable.generic_marker, 0, R.string.lbl_generic_course_point, 0, 0.0d, null, 116, null),
    DISTANCE("MILE_MARKER", R.drawable.distance_marker, 0, R.string.lbl_course_point_distance_marker, 0, 0.0d, null, 116, null),
    INFO("INFO", R.drawable.info, 0, R.string.lbl_course_point_info, 0, 0.0d, null, 116, null),
    SERVICE("SERVICE", R.drawable.service, 0, R.string.lbl_course_point_service, 0, 0.0d, null, 116, null),
    AID_STATION("AID_STATION", R.drawable.aid_station, 0, R.string.lbl_course_points_aid_station, 0, 0.0d, null, 116, null),
    FIRST_AID("FIRST_AID", R.drawable.aid, 0, R.string.lbl_first_aid, 0, 0.0d, null, 116, null),
    FOOD("FOOD", R.drawable.food, 0, R.string.common_food_lbl, 0, 0.0d, null, 116, null),
    WATER("WATER", R.drawable.water_stop, 0, R.string.lbl_water, 0, 0.0d, null, 116, null),
    ENERGY_GEL("ENERGY_GEL", R.drawable.energy_gel, 0, R.string.lbl_course_point_energy_gel, 0, 0.0d, null, 116, null),
    SPORTS_DRINK("SPORTS_DRINK", R.drawable.sports_drink, 0, R.string.lbl_course_point_sports_drink, 0, 0.0d, null, 116, null),
    SPRINT("SPRINT", R.drawable.course_point_sprint, R.drawable.sprint, R.string.lbl_segment_classification_sprint, 0, 0.0d, null, 112, null),
    HC_CLIMB("HORS_CATEGORY", R.drawable.course_point_climb_hc, R.drawable.climb_hc, R.string.lbl_hc_climb, 0, 0.0d, null, 112, null),
    CATEGORY_T1_CLIMB("FIRST_CATEGORY", R.drawable.course_point_climb_1, R.drawable.climb_1, R.string.lbl_category_climb, R.string.lbl_abbreviated_category_climb, 0.0d, null, 96, null),
    CATEGORY_T2_CLIMB("SECOND_CATEGORY", R.drawable.course_point_climb_2, R.drawable.climb_2, R.string.lbl_category_climb, R.string.lbl_abbreviated_category_climb, 0.0d, null, 96, null),
    CATEGORY_T3_CLIMB("THIRD_CATEGORY", R.drawable.course_point_climb_3, R.drawable.climb_3, R.string.lbl_category_climb, R.string.lbl_abbreviated_category_climb, 0.0d, null, 96, null),
    CATEGORY_T4_CLIMB("FOURTH_CATEGORY", R.drawable.course_point_climb_4, R.drawable.climb_4, R.string.lbl_category_climb, R.string.lbl_abbreviated_category_climb, 0.0d, null, 96, null),
    TOILET("TOILET", R.drawable.restroom, 0, R.string.lbl_course_point_toilet, 0, 0.0d, null, 116, null),
    SHOWER("SHOWER", R.drawable.shower, 0, R.string.lbl_course_point_shower, 0, 0.0d, null, 116, null),
    GEAR("GEAR", R.drawable.gear, 0, R.string.lbl_course_point_gear, 0, 0.0d, null, 116, null),
    NAV_AID("NAVAID", R.drawable.nav_aid, 0, R.string.lbl_course_point_nav_aid, 0, 0.0d, null, 116, null),
    TRANSPORT("TRANSPORT", R.drawable.transport, 0, R.string.lbl_course_point_transport, 0, 0.0d, null, 116, null),
    TRANSITION("TRANSITION", R.drawable.transition, 0, R.string.lbl_course_point_transition, 0, 0.0d, null, 116, null),
    CHECKPOINT("CHECKPOINT", R.drawable.checkpoint, 0, R.string.lbl_course_point_checkpoint, 0, 0.0d, null, 116, null),
    MEETING_SPOT("MEETING_SPOT", R.drawable.meeting_spot, 0, R.string.lbl_course_point_meeting_spot, 0, 0.0d, null, 116, null),
    CAMPSITE("CAMPSITE", R.drawable.camping, 0, R.string.lbl_course_point_campsite, 0, 0.0d, null, 116, null),
    SHELTER("SHELTER", R.drawable.shelter, 0, R.string.lbl_course_point_shelter, 0, 0.0d, null, 116, null),
    REST_AREA("REST_AREA", R.drawable.rest_area, 0, R.string.lbl_course_point_rest_area, 0, 0.0d, null, 116, null),
    SUMMIT("SUMMIT", R.drawable.summit, 0, R.string.lbl_summit, 0, 0.0d, null, 116, null),
    TUNNEL("TUNNEL", R.drawable.tunnel, 0, R.string.lbl_course_point_tunnel, 0, 0.0d, null, 116, null),
    BRIDGE("BRIDGE", R.drawable.bridge, 0, R.string.lbl_course_point_bridge, 0, 0.0d, null, 116, null),
    VALLEY("VALLEY", R.drawable.valley, 0, R.string.lbl_valley, 0, 0.0d, null, 116, null),
    OVERLOOK("OVERLOOK", R.drawable.overlook, 0, R.string.lbl_course_point_overlook, 0, 0.0d, null, 116, null),
    STORE("STORE", R.drawable.store, 0, R.string.lbl_course_point_store, 0, 0.0d, null, 116, null),
    RACE_OBSTACLE_START("RACE_OBSTACLE_START", R.drawable.poi_obstacle_start, 0, R.string.lbl_ocr_course_point_obstacle_start, 0, 0.0d, null, 116, null),
    RACE_OBSTACLE_END("RACE_OBSTACLE_END", R.drawable.poi_obstacle_stop, 0, R.string.lbl_ocr_course_point_obstacle_end, 0, 0.0d, null, 116, null),
    ALERT("ALERT", R.drawable.alert, 0, R.string.lbl_course_point_alert, 0, 0.0d, null, 116, null),
    DANGER("DANGER", R.drawable.sym_exclamation, 0, R.string.lbl_danger, 0, 0.0d, null, 116, null),
    OBSTACLE("OBSTACLE", R.drawable.obstacle, 0, R.string.lbl_course_point_obstacle, 0, 0.0d, null, 116, null),
    CROSSING("CROSSING", R.drawable.crossing, 0, R.string.lbl_course_point_crossing, 0, 0.0d, null, 116, null),
    STEEP_INCLINE("STEEP_INCLINE", R.drawable.steep_incline, 0, R.string.lbl_course_point_steep_incline, 0, 0.0d, null, 116, null),
    SHARP_CURVE("SHARP_CURVE", R.drawable.sharp_curve, 0, R.string.lbl_course_point_sharp_curve, 0, 0.0d, null, 116, null),
    MARKER_KILOMETER("MARKER_KILOMETER", R.drawable.gcm_transparent, 0, R.string.lbl_km_markers, 0, 1000.0d, null, 84, null),
    MARKER_MILE("MARKER_MILE", R.drawable.gcm_transparent, 0, R.string.lbl_mile_markers, 0, 1609.344d, null, 84, null),
    MARKER_HALF_MARATHON("MARKER_HALF_MARATHON", R.drawable.gcm_transparent, 0, R.string.pacepro_lbl_distance_half_marathon, 0, 21097.5d, null, 84, null),
    COURSE_START("COURSE_START", R.drawable.start, 0, R.string.lbl_start, 0, 0.0d, null, 116, null),
    COURSE_FINISH("COURSE_FINISH", R.drawable.stop, 0, R.string.lbl_finish, 0, 0.0d, null, 116, null),
    BIKE_SHOP_AND_REPAIR(h.f32951i, "BIKE_SHOP_OR_BIKE_REPAIR"),
    CONVENIENCE(h.f32947e, null, 2, null),
    COFFEE_SHOP(h.f32950h, null, 2, null),
    PARK(h.f32952j, null, 2, null),
    WINERY_OR_BREWERY(h.f32953k, "WINERY_BREWERY_OR_DISTILLERY"),
    BANK_OR_ATM(h.f32954l, null, 2, null),
    RESTAURANT(h.f32955m, "RESTAURANTS"),
    EMERGENCY(h.f32956n, null, 2, null),
    RECREATION(h.f32957o, null, 2, null),
    ATTRACTION(h.f32958p, null, 2, null),
    LODGING(h.f32959q, null, 2, null),
    SHOPPING(h.f32961t, null, 2, null),
    COMMUNITY(h.f32962v, null, 2, null);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32898h = new a(null);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final /* synthetic */ w13.c f32910m1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f32927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f32928g;

    static {
        f32910m1 = new w13.c(new f[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r0, r51, r52, r53, r1, r55, r0, r57, r58, r59, r60, r61, r62});
    }

    public /* synthetic */ f(String str, int i14, int i15, int i16, int i17, double d14, h hVar, int i18, p005kotlin.jvm.internal.j jVar) {
        this(str, i, str, i14, (i18 & 4) != 0 ? i14 : i15, i16, (i18 & 16) != 0 ? i16 : i17, (i18 & 32) != 0 ? 0.0d : d14, (i18 & 64) != 0 ? null : hVar);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f32908l1.clone();
    }

    public final c3 a() {
        c3 c3Var;
        h hVar = this.f32928g;
        return (hVar == null || (c3Var = hVar.f32967c) == null) ? c22.i.b(this.f32925d) : c3Var;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/f$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(String str) {
            Object next;
            if (str == null || str.length() == 0) {
                return f.GENERIC;
            }
            w13.c cVar = f.f32910m1;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!u.q(((f) next).f32922a, str, true));
            f fVar = (f) next;
            return fVar == null ? f.GENERIC : fVar;
        }

        private a() {
        }
    }

    private f(String str, int i14, String str2, int i15, int i16, int i17, int i18, double d14, h hVar) {
        super(str, i14);
        this.f32922a = str2;
        this.f32923b = i15;
        this.f32924c = i16;
        this.f32925d = i17;
        this.f32926e = i18;
        this.f32927f = d14;
        this.f32928g = hVar;
    }

    public f(h hVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, (i14 & 2) != 0 ? hVar.f32965a : str);
    }

    private f(h hVar, String str) {
        this(str, 0, 0, 0, 0, 0.0d, hVar, 52, null);
    }
}
