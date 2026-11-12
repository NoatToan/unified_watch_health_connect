package com.garmin.android.apps.connectmobile.settings.devices.activityoptions;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.e;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u0;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB'\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/b;", "", "Lcom/garmin/android/apps/connectmobile/settings/devices/e$a;", "sport", "Lcom/garmin/android/apps/connectmobile/settings/devices/e$b;", "subSport", "", "displayResId", "<init>", "(Ljava/lang/String;ILcom/garmin/android/apps/connectmobile/settings/devices/e$a;Lcom/garmin/android/apps/connectmobile/settings/devices/e$b;Ljava/lang/Integer;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f42547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f42548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f42551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f42552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b[] f42553j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.a f42554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.b f42555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f42556c;

    /* JADX INFO: Fake field, exist only in values array */
    b EF1;

    static {
        e.a aVar = e.a.WALKING;
        e.b bVar = e.b.GENERIC;
        b bVar2 = new b("WALKING", 0, aVar, bVar, Integer.valueOf(R.string.activity_options_walk_title));
        b bVar3 = new b("WALKING_INDOOR", 1, aVar, e.b.INDOOR_WALKING, Integer.valueOf(R.string.lbl_walk_indoor));
        e.a aVar2 = e.a.RUNNING;
        b bVar4 = new b("RUNNING", 2, aVar2, bVar, Integer.valueOf(R.string.lbl_run));
        e.a aVar3 = e.a.CYCLING;
        b bVar5 = new b("CYCLING", 3, aVar3, bVar, Integer.valueOf(R.string.activity_options_bike_title));
        b bVar6 = new b("RUNNING_TREADMILL", 4, aVar2, e.b.TREADMILL, Integer.valueOf(R.string.lbl_treadmill));
        b bVar7 = new b("RUNNING_INDOOR", 5, aVar2, e.b.INDOOR_RUNNING, Integer.valueOf(R.string.lbl_indoor_track));
        e.a aVar4 = e.a.TRAINING;
        b bVar8 = new b("STRENGTH_TRAINING", 6, aVar4, e.b.STRENGTH_TRAINING, Integer.valueOf(R.string.lbl_strength));
        b bVar9 = new b("CARDIO_TRAINING", 7, aVar4, e.b.CARDIO_TRAINING, Integer.valueOf(R.string.lbl_cardio));
        e.a aVar5 = e.a.FITNESS_EQUIPMENT;
        b bVar10 = new b("ELLIPTICAL", 8, aVar5, e.b.ELLIPTICAL, Integer.valueOf(R.string.lbl_elliptical));
        e.a aVar6 = e.a.SWIMMING;
        Integer numValueOf = Integer.valueOf(R.string.lbl_swimming);
        b bVar11 = new b("SWIMMING", 9, aVar6, bVar, numValueOf);
        b bVar12 = new b("LAP_SWIMMING", 10, aVar6, e.b.LAP_SWIMMING, Integer.valueOf(R.string.workout_pool_swim));
        b bVar13 = new b("STAIR_CLIMBING", 11, aVar5, e.b.STAIR_CLIMBING, Integer.valueOf(R.string.lbl_stair_climbing));
        b bVar14 = new b("YOGA", 12, aVar4, e.b.YOGA, Integer.valueOf(R.string.activity_type_yoga));
        e.a aVar7 = e.a.GENERIC;
        Integer numValueOf2 = Integer.valueOf(R.string.lbl_other);
        b bVar15 = new b("GENERIC", 13, aVar7, bVar, numValueOf2);
        b bVar16 = new b("OTHER", 14, e.a.OTHER, bVar, numValueOf2);
        b bVar17 = new b("CYCLING_INDOOR", 15, aVar3, e.b.INDOOR_CYCLING, Integer.valueOf(R.string.lbl_bike_indoor));
        b bVar18 = new b("TOETOTOE", 16, aVar, e.b.CHALLENGE, Integer.valueOf(R.string.device_settings_toe_to_toe_trademarked));
        b bVar19 = new b("PILATES", 17, aVar5, e.b.PILATES, Integer.valueOf(R.string.activity_type_pilates));
        b bVar20 = new b("BREATHWORK", 18, aVar4, e.b.BREATHING, Integer.valueOf(R.string.activity_type_breathwork));
        b bVar21 = new b("HIIT", 19, e.a.HIIT, bVar, Integer.valueOf(R.string.lbl_hiit));
        e.a aVar8 = e.a.ROWING;
        b bVar22 = new b("ROW_INDOOR", 20, aVar8, e.b.INDOOR_ROWING, Integer.valueOf(R.string.lbl_row_indoor));
        b bVar23 = new b("DANCE", 21, e.a.DANCE, bVar, Integer.valueOf(R.string.dance_fitness));
        b bVar24 = new b("MEDITATION", 22, e.a.MEDITATION, bVar, Integer.valueOf(R.string.activity_type_meditation));
        b bVar25 = new b("JUMP_ROPE", 23, e.a.JUMP_ROPE, bVar, Integer.valueOf(R.string.lbl_jump_rope_activity));
        e.a aVar9 = e.a.WHEELCHAIR_PUSH_RUN;
        b bVar26 = new b("WHEELCHAIR_RUN", 24, aVar9, bVar, Integer.valueOf(R.string.activity_type_push_run_speed_v2));
        b bVar27 = new b("RUNNING_TRAIL", 25, aVar2, e.b.TRAIL, Integer.valueOf(R.string.activity_type_trail_run));
        b bVar28 = new b("RUNNING_TRACK", 26, aVar2, e.b.TRACK, Integer.valueOf(R.string.activity_type_track_run));
        b bVar29 = new b("WHEELCHAIR_RUN_INDOOR", 27, aVar9, e.b.INDOOR_WHEELCHAIR_RUN, Integer.valueOf(R.string.activity_type_push_indoor_run_speed));
        b bVar30 = new b("OBSTACLE_RACING", 28, aVar2, e.b.OBSTACLE, Integer.valueOf(R.string.activity_type_obstacle_racing));
        b bVar31 = new b("HANDCYCLING", 29, aVar3, e.b.HAND_CYCLING, Integer.valueOf(R.string.activity_type_handcycling));
        b bVar32 = new b("HANDCYCLING_INDOOR", 30, aVar3, e.b.INDOOR_HAND_CYCLING, Integer.valueOf(R.string.activity_type_indoor_handcycling));
        b bVar33 = new b("MOUNTAIN_BIKING", 31, aVar3, e.b.MOUNTAIN, Integer.valueOf(R.string.activity_type_mtb));
        b bVar34 = new b("BIKE_COMMUTE", 32, aVar3, e.b.COMMUTING, Integer.valueOf(R.string.activity_type_bike_commute));
        b bVar35 = new b("E_BIKING", 33, aVar3, e.b.E_BIKE_FITNESS, Integer.valueOf(R.string.startup_activity_profile_type_ebike));
        b bVar36 = new b("E_MTB", 34, aVar3, e.b.E_BIKE_ENDURO, Integer.valueOf(R.string.activity_type_emtb));
        b bVar37 = new b("GRAVEL_CYCLING", 35, aVar3, e.b.GRAVEL_CYCLING, Integer.valueOf(R.string.lbl_gravel_cycling));
        b bVar38 = new b("BIKING_TOUR", 36, aVar3, e.b.MIXED_SURFACE, Integer.valueOf(R.string.activity_type_bike_tour));
        b bVar39 = new b("CYCLING_ROAD", 37, aVar3, e.b.ROAD, Integer.valueOf(R.string.activity_type_road_bike));
        b bVar40 = new b("BMX", 38, aVar3, e.b.BMX, Integer.valueOf(R.string.lbl_bmx));
        b bVar41 = new b("HIKING", 39, e.a.HIKING, bVar, Integer.valueOf(R.string.social_adventure_type_hike));
        e.a aVar10 = e.a.WHEELCHAIR_PUSH_WALK;
        b bVar42 = new b("WHEELCHAIR_WALK", 40, aVar10, bVar, Integer.valueOf(R.string.activity_type_push_walk_speed_v2));
        b bVar43 = new b("GOLF", 41, e.a.GOLF, bVar, Integer.valueOf(R.string.lbl_golf));
        b bVar44 = new b("MOUNTAINEERING", 42, e.a.MOUNTAINEERING, bVar, Integer.valueOf(R.string.lbl_mountaineering));
        e.a aVar11 = e.a.DISC_GOLF;
        b bVar45 = new b("DISC_GOLF", 43, aVar11, bVar, Integer.valueOf(R.string.lbl_disc_golf));
        b bVar46 = new b("HORSEBACK_RIDING", 44, e.a.HORSEBACK_RIDING, bVar, Integer.valueOf(R.string.activity_type_horseback));
        b bVar47 = new b("ARCHERY", 45, e.a.ARCHERY, bVar, Integer.valueOf(R.string.lbl_archery));
        b bVar48 = new b("INLINE_SKATING", 46, e.a.INLINE_SKATING, bVar, Integer.valueOf(R.string.lbl_inline_skating));
        b bVar49 = new b("MOBILITY", 47, e.a.MOBILITY, bVar, Integer.valueOf(R.string.lbl_mobility));
        b bVar50 = new b("WHEELCHAIR_PUSH_WALK", 48, aVar10, e.b.INDOOR_WHEELCHAIR_WALK, Integer.valueOf(R.string.activity_type_push_indoor_walk_speed));
        e.a aVar12 = e.a.ROCK_CLIMBING;
        b bVar51 = new b("CLIMB_INDOOR", 49, aVar12, e.b.INDOOR_CLIMBING, Integer.valueOf(R.string.activity_type_climb_indoor));
        b bVar52 = new b("BOULDERING", 50, aVar12, e.b.BOULDERING, Integer.valueOf(R.string.lbl_bouldering));
        b bVar53 = new b("BOXING", 51, e.a.BOXING, bVar, Integer.valueOf(R.string.lbl_boxing));
        b bVar54 = new b("MIXED_MARTIAL_ARTS", 52, e.a.MIXED_MARTIAL_ARTS, bVar, Integer.valueOf(R.string.lbl_mixed_martial_arts));
        e.a aVar13 = e.a.TENNIS;
        b bVar55 = new b("TENNIS", 53, aVar13, bVar, Integer.valueOf(R.string.type_key_tennis));
        e.a aVar14 = e.a.RACKET;
        b bVar56 = new b("PICKLEBALL", 54, aVar14, e.b.PICKLEBALL, Integer.valueOf(R.string.lbl_pickleball));
        b bVar57 = new b("PADEL", 55, aVar14, e.b.PADEL, Integer.valueOf(R.string.lbl_padel));
        b bVar58 = new b("RACQUETBALL", 56, aVar14, e.b.RACQUETBALL, Integer.valueOf(R.string.lbl_racquetball));
        b bVar59 = new b("SQUASH", 57, aVar14, e.b.SQUASH, Integer.valueOf(R.string.lbl_squash));
        b bVar60 = new b("BADMINTON", 58, aVar14, e.b.BADMINTON, Integer.valueOf(R.string.lbl_badminton));
        b bVar61 = new b("TABLE_TENNIS", 59, aVar13, e.b.TABLE_TENNIS, Integer.valueOf(R.string.lbl_table_tennis));
        b bVar62 = new b("SOCCER", 60, e.a.SOCCER, bVar, Integer.valueOf(R.string.lbl_soccer));
        b bVar63 = new b("AMERICAN_FOOTER", 61, e.a.AMERICAN_FOOTBALL, bVar, Integer.valueOf(R.string.lbl_american_football));
        b bVar64 = new b("BASKETBALL", 62, e.a.BASKETBALL, bVar, Integer.valueOf(R.string.lbl_basketball));
        b bVar65 = new b("BASEBALL", 63, e.a.BASEBALL, bVar, Integer.valueOf(R.string.lbl_baseball));
        b bVar66 = new b("SOFTBALL", 64, e.a.SOFTBALL_FAST_PITCH, bVar, Integer.valueOf(R.string.lbl_softball));
        b bVar67 = new b("VOLLEYBALL", 65, e.a.VOLLEYBALL, bVar, Integer.valueOf(R.string.lbl_volleyball));
        b bVar68 = new b("CRICKET", 66, e.a.CRICKET, bVar, Integer.valueOf(R.string.lbl_cricket));
        b bVar69 = new b("LACROSSE", 67, e.a.LACROSSE, bVar, Integer.valueOf(R.string.lbl_lacrosse));
        b bVar70 = new b("RUGBY", 68, e.a.RUGBY, bVar, Integer.valueOf(R.string.lbl_rugby));
        e.a aVar15 = e.a.HOCKEY;
        b bVar71 = new b("FIELD_HOCKEY", 69, aVar15, e.b.FIELD, Integer.valueOf(R.string.lbl_field_hockey));
        b bVar72 = new b("ICE_HOCKEY", 70, aVar15, e.b.ICE, Integer.valueOf(R.string.lbl_ice_hockey));
        b bVar73 = new b("ULTIMATE_DISC", 71, aVar11, e.b.ULTIMATE, Integer.valueOf(R.string.lbl_ultimate_disc));
        b bVar74 = new b("GAMING", 72, e.a.VIDEO_GAMING, e.b.ESPORT, Integer.valueOf(R.string.activity_type_gaming));
        b bVar75 = new b("SKI", 73, e.a.ALPINE_SKIING, bVar, Integer.valueOf(R.string.lbl_activity_group_ski));
        b bVar76 = new b("SNOWBOARD", 74, e.a.SNOWBOARDING, bVar, Integer.valueOf(R.string.lbl_activity_group_snowboard));
        e.a aVar16 = e.a.CROSS_COUNTRY_SKIING;
        b bVar77 = new b("XC_CLASIC_SKI", 75, aVar16, bVar, Integer.valueOf(R.string.activity_type_xc_classic_ski));
        b bVar78 = new b("XC_SKATE_SKI", 76, aVar16, e.b.SKATE_SKIING, Integer.valueOf(R.string.activity_type_xc_skate_ski));
        b bVar79 = new b("SNOWSHOE", 77, e.a.SNOWSHOEING, bVar, Integer.valueOf(R.string.activity_type_snowshoe));
        b bVar80 = new b("ICE_SKATING", 78, e.a.ICE_SKATING, bVar, Integer.valueOf(R.string.activity_type_ice_skating));
        b bVar81 = new b("SUP", 79, e.a.STAND_UP_PADDLEBOARDING, bVar, Integer.valueOf(R.string.activity_type_sup));
        b bVar82 = new b("KAYAKING", 80, e.a.KAYAKING, bVar, Integer.valueOf(R.string.activity_type_kayak));
        b bVar83 = new b("ROWING", 81, aVar8, bVar, Integer.valueOf(R.string.lbl_activity_group_rowing));
        b bVar84 = new b("SNORKELING", 82, e.a.SNORKELING, bVar, Integer.valueOf(R.string.activity_type_snorkel));
        b bVar85 = new b("BOATING", 83, e.a.BOATING, bVar, Integer.valueOf(R.string.activity_type_boat));
        b bVar86 = new b("FISHING", 84, e.a.FISHING, bVar, Integer.valueOf(R.string.activity_type_fish));
        b bVar87 = new b("TIMED_ACTIVITY", 85, aVar4, e.b.ACTIVITY_TIMER, Integer.valueOf(R.string.activity_type_timed_activity));
        f42553j = new b[]{bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40, bVar41, bVar42, bVar43, bVar44, bVar45, bVar46, bVar47, bVar48, bVar49, bVar50, bVar51, bVar52, bVar53, bVar54, bVar55, bVar56, bVar57, bVar58, bVar59, bVar60, bVar61, bVar62, bVar63, bVar64, bVar65, bVar66, bVar67, bVar68, bVar69, bVar70, bVar71, bVar72, bVar73, bVar74, bVar75, bVar76, bVar77, bVar78, bVar79, bVar80, bVar81, bVar82, bVar83, bVar84, bVar85, bVar86, bVar87};
        f42547d = new a(null);
        f42548e = u0.e(new p(Integer.valueOf(R.string.lbl_running), x.k(bVar4, bVar26, bVar27, bVar6, bVar7, bVar28, bVar29, bVar30)), new p(Integer.valueOf(R.string.lbl_cycling), x.k(bVar5, bVar31, bVar17, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40)), new p(numValueOf, x.k(bVar11, bVar12)), new p(Integer.valueOf(R.string.activity_options_outdoor_title), x.k(bVar41, bVar2, bVar42, bVar43, bVar44, bVar45, bVar46, bVar47, bVar48)), new p(Integer.valueOf(R.string.lbl_activity_group_gym), x.k(bVar8, bVar9, bVar49, bVar21, bVar14, bVar19, bVar10, bVar13, bVar22, bVar3, bVar50, bVar51, bVar52, bVar53, bVar54, bVar25)), new p(Integer.valueOf(R.string.lbl_racket_sports), x.k(bVar55, bVar56, bVar57, bVar58, bVar59, bVar60, bVar61)), new p(Integer.valueOf(R.string.lbl_team_sports), x.k(bVar62, bVar63, bVar64, bVar65, bVar66, bVar67, bVar68, bVar69, bVar70, bVar71, bVar72, bVar73, bVar74)), new p(Integer.valueOf(R.string.lbl_winter_sports), x.k(bVar75, bVar76, bVar77, bVar78, bVar79, bVar80)), new p(Integer.valueOf(R.string.lbl_water_sports), x.k(bVar81, bVar82, bVar83, bVar84, bVar85, bVar86)), new p(Integer.valueOf(R.string.lbl_others), x.k(bVar20, bVar24, bVar23, bVar18, bVar87, bVar15, bVar16)));
        f42549f = R.string.lbl_run;
        f42550g = R.string.activity_options_walk_title;
        f42551h = R.string.workout_pool_swim;
        f42552i = R.string.lbl_open_water_swim;
    }

    private b(String str, int i14, e.a aVar, e.b bVar, Integer num) {
        super(str, i14);
        this.f42554a = aVar;
        this.f42555b = bVar;
        this.f42556c = num;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f42553j.clone();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/b$a;", "", "<init>", "()V", "", "", "", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/b;", "activityGroups", "Ljava/util/Map;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
