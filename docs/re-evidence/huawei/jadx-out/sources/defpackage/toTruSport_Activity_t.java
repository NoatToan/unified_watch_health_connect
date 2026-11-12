package defpackage;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.health.h5pro.utils.RequestCode;
import com.huawei.health.trusport_ee.Activity;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.openalliance.ad.constant.Constants;
import kotlin.Metadata;

/* JADX INFO: renamed from: ime, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"toTruSport_Activity_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_Activity_t;", "kotlin.jvm.PlatformType", "Lcom/huawei/health/trusport_ee/Activity;", "(Lcom/huawei/health/trusport_ee/Activity;)Lcom/huawei/health/trusport_ee_jni/TruSport_Activity_t;", "toActivity", "trusport_ee_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class toTruSport_Activity_t {
    public static final iml c(Activity activity) {
        zcp.c(activity, "");
        switch (a.f37817a[activity.ordinal()]) {
            case 1:
                return iml.bp;
            case 2:
                return iml.bb;
            case 3:
                return iml.bn;
            case 4:
                return iml.ba;
            case 5:
                return iml.bo;
            case 6:
                return iml.at;
            case 7:
                return iml.ab;
            case 8:
                return iml.cb;
            case 9:
                return iml.ca;
            case 10:
                return iml.bi;
            case 11:
                return iml.bm;
            case 12:
                return iml.ao;
            case 13:
                return iml.da;
            case 14:
                return iml.dd;
            case 15:
                return iml.bl;
            case 16:
                return iml.ch;
            case 17:
                return iml.ck;
            case 18:
                return iml.v;
            case 19:
                return iml.ad;
            case 20:
                return iml.an;
            case 21:
                return iml.ay;
            case 22:
                return iml.ah;
            case 23:
                return iml.s;
            case 24:
                return iml.ct;
            case 25:
                return iml.cq;
            case 26:
                return iml.cm;
            case 27:
                return iml.e;
            case 28:
                return iml.ar;
            case 29:
                return iml.f37830c;
            case 30:
                return iml.am;
            case 31:
                return iml.dg;
            case 32:
                return iml.bw;
            case 33:
                return iml.u;
            case 34:
                return iml.al;
            case 35:
                return iml.bt;
            case 36:
                return iml.cz;
            case 37:
                return iml.p;
            case 38:
                return iml.af;
            case 39:
                return iml.bc;
            case 40:
                return iml.ai;
            case 41:
                return iml.t;
            case 42:
                return iml.o;
            case 43:
                return iml.bd;
            case 44:
                return iml.cf;
            case 45:
                return iml.br;
            case 46:
                return iml.h;
            case 47:
                return iml.az;
            case 48:
                return iml.bg;
            case 49:
                return iml.i;
            case 50:
                return iml.cn;
            case 51:
                return iml.bv;
            case 52:
                return iml.w;
            case 53:
                return iml.bz;
            case 54:
                return iml.be;
            case 55:
                return iml.cy;
            case 56:
                return iml.ax;
            case 57:
                return iml.ak;
            case 58:
                return iml.aa;
            case 59:
                return iml.f37829b;
            case 60:
                return iml.ap;
            case 61:
                return iml.bf;
            case 62:
                return iml.bh;
            case 63:
                return iml.db;
            case 64:
                return iml.cr;
            case 65:
                return iml.co;
            case 66:
                return iml.bj;
            case 67:
                return iml.ae;
            case 68:
                return iml.d;
            case 69:
                return iml.cx;
            case 70:
                return iml.cw;
            case 71:
                return iml.bu;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return iml.m;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return iml.de;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL /* 74 */:
                return iml.cc;
            case ExerciseSessionRecord.EXERCISE_TYPE_TABLE_TENNIS /* 75 */:
                return iml.aq;
            case 76:
                return iml.g;
            case 77:
                return iml.ci;
            case ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL /* 78 */:
                return iml.y;
            case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
                return iml.ag;
            case 80:
                return iml.j;
            case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
                return iml.f;
            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                return iml.aj;
            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                return iml.as;
            case 84:
                return iml.cp;
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                return iml.cd;
            case RequestCode.SCANNER_PERMISSION_REQUEST_CODE /* 86 */:
                return iml.z;
            case 87:
                return iml.ce;
            case 88:
                return iml.cv;
            case 89:
                return iml.by;
            case 90:
                return iml.ac;
            case 91:
                return iml.q;
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
                return iml.cg;
            case 93:
                return iml.df;
            case 94:
                return iml.cs;
            case 95:
                return iml.aw;
            case 96:
                return iml.av;
            case 97:
                return iml.x;
            case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                return iml.l;
            case 99:
                return iml.cl;
            case 100:
                return iml.n;
            case 101:
                return iml.cj;
            case 102:
                return iml.bx;
            case 103:
                return iml.r;
            case 104:
                return iml.bs;
            case 105:
                return iml.k;
            case 106:
                return iml.bk;
            case 107:
                return iml.bq;
            case 108:
                return iml.f37828a;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                return iml.cu;
            case 110:
                return iml.au;
            default:
                return iml.dc;
        }
    }

    /* JADX INFO: renamed from: ime$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37817a;

        static {
            int[] iArr = new int[Activity.values().length];
            try {
                iArr[Activity.TS_ACTIVITY_OUTDOOR_RUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_INDOOR_RUN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_OUTDOOR_WALK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_INDOOR_WALK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_OUTDOOR_CYCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_INDOOR_CYCLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ELLIPTICAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ROWER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_POOL_SWIM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_OPEN_WATER_SWIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_MOUNTAIN_HIKE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_HIKE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TRAIL_RUN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TRIATHLON.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_OTHER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SKIING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SNOWBOARDING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_CROSS_COUNTRY_SKIING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_DRIVING_RANGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_GOLF_COURSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_JUMP_ROPE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FREEDIVING.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BREATHHOLD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_STRENGTH.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SPINNING.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_STEPPER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_AIR_WALKER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_HIIT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_AEROBICS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_GROUP_TRAINING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_YOGA.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_PILATES.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_CROSS_FIT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FUNCTIONAL_TRAINING.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_PHYSICAL_TRAINING.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TAEKWONDO.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BOXING.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FREE_SPARRING.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_KARATE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FENCING.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_CORE_TRAINING.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BODY_COMBAT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_KENDO.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SINGLE_BAR.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_PARALLEL_BARS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BELLY_DANCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_JAZZ_DANCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_LATIN_DANCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BALLET.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_STREET_DANCE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_PLAZA_DANCING.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_DANCE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ROLLER_SKATING.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_MARTIAL_ARTS.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TAI_CHI.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_HULA_HOOP.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FRISBEE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_DARTS.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ARCHERY.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_HORSE_RIDING.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_LASER_TAG.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_KITE_FLYING.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TUG_OF_WAR.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SWINGING.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_STAIR_CLIMBING.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_OBSTACLE_RACE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FISHING.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BADMINTON.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TABLE_TENNIS.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_TENNIS.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_POOL.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BOWLING.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_VOLLEYBALL.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SHUTTLECOCK.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_HANDBALL.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BASEBALL.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SOFTBALL.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_CRICKET.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_FOOTBALL.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BEACH_SOCCER.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BEACH_VOLLEYBALL.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_GATEBALL.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_HOCKEY.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SQUASH.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SEPAK_TAKRAW.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_DODGEBALL.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SAILING.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SURFING.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_RAFTING.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_DRAGON_BOATING.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_CANOEING.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ROWING.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_WATER_SCOOTER.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SUP.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ICE_SKATING.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ICE_HOCKEY.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_CURLING.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BOBSLEIGH.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SLEDDING.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BIATHLON.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SKATEBOARDING.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ROCK_CLIMBING.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BUNGEE_JUMPING.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_PARKOUR.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_BMX.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_ORIENTEERING.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_PARACHUTING.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_AUTO_RACING.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_SWIMMING.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[Activity.TS_ACTIVITY_IDLE.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            f37817a = iArr;
        }
    }
}
