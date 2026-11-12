package ss;

import am.x0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.e0;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ms.a0;
import ms.b0;
import ms.z;
import ns.a1;
import ns.a2;
import ns.a3;
import ns.b1;
import ns.b2;
import ns.b3;
import ns.c0;
import ns.c1;
import ns.c2;
import ns.c3;
import ns.d0;
import ns.d1;
import ns.d2;
import ns.d3;
import ns.e1;
import ns.e2;
import ns.e3;
import ns.f0;
import ns.f1;
import ns.f2;
import ns.f3;
import ns.g0;
import ns.g1;
import ns.g2;
import ns.g3;
import ns.h1;
import ns.h2;
import ns.h3;
import ns.i0;
import ns.i1;
import ns.i2;
import ns.i3;
import ns.j0;
import ns.j1;
import ns.j2;
import ns.j3;
import ns.k0;
import ns.k1;
import ns.k2;
import ns.k3;
import ns.l0;
import ns.l1;
import ns.l2;
import ns.l3;
import ns.m0;
import ns.m1;
import ns.m2;
import ns.m3;
import ns.n0;
import ns.n1;
import ns.n2;
import ns.n3;
import ns.o;
import ns.o0;
import ns.o1;
import ns.o2;
import ns.o3;
import ns.p;
import ns.p0;
import ns.p1;
import ns.p2;
import ns.p3;
import ns.q;
import ns.q0;
import ns.q1;
import ns.q2;
import ns.q3;
import ns.r;
import ns.r0;
import ns.r1;
import ns.r2;
import ns.r3;
import ns.s;
import ns.s0;
import ns.s1;
import ns.s2;
import ns.s3;
import ns.t;
import ns.t0;
import ns.t1;
import ns.t2;
import ns.u;
import ns.u0;
import ns.u1;
import ns.u2;
import ns.v;
import ns.v0;
import ns.v1;
import ns.v2;
import ns.w;
import ns.w0;
import ns.w1;
import ns.w2;
import ns.x;
import ns.x1;
import ns.y0;
import ns.y1;
import ns.y2;
import ns.z0;
import ns.z1;
import ns.z2;
import okhttp3.internal.http.StatusLine;
import org.koin.java.KoinJavaComponent;
import p005kotlin.math.MathKt;
import ps.h0;
import ps.y;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160607a;

        static {
            int[] iArr = new int[ls.e.values().length];
            try {
                iArr[ls.e.AVERAGE_HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ls.e.AVERAGE_STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ls.e.MAX_STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ls.e.AVERAGE_SPEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ls.e.AVERAGE_PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ls.e.MAX_GROUND_SPEED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ls.e.AVERAGE_GROUND_SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ls.e.SWIMMING_PACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ls.e.ROWING_PACE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ls.e.CALORIES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ls.e.PACK_CALORIES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ls.e.DISTANCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_DISTANCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ls.e.SKI_RUN_DISTANCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ls.e.DISTANCE_METERS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ls.e.DISTANCE_METERS_OR_FEET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ls.e.DISTANCE_METERS_ROUNDED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ls.e.SWIMMING_DISTANCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ls.e.POOL_SIZE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ls.e.MAX_HEART_RATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ls.e.TIME.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ls.e.TOTAL_TIME.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ls.e.TOTAL_TIME_MILLIS_EXTENDED_PRECISION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ls.e.TOTAL_TIME_MILLIS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ls.e.TOTAL_FLYING_TIME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ls.e.SESSION_TIME.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ls.e.ASCENT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ls.e.TOTAL_ASCENT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ls.e.TOTAL_CLIMB_ASCENT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ls.e.DESCENT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ls.e.TOTAL_DESCENT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_TOTAL_DESCENT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ls.e.SKI_RUN_TOTAL_DESCENT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ls.e.LONGEST_RUN.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ls.e.LONGEST_RUN_EXTENDED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ls.e.RUNS_COUNT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ls.e.RUNS.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ls.e.WAVES.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ls.e.TOTAL_RUNS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ls.e.TOTAL_WAVES.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ls.e.CLIMB_TIME.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ls.e.ACTIVE_SPLIT_MODE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ls.e.ROWING_STROKES.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ls.e.WORK_TIME.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ls.e.AVERAGE_POWER.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ls.e.MAX_SURFING_SPEED.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ls.e.MAX_ROWING_SPEED.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ls.e.MAX_SPEED.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[ls.e.MAX_NAUTICAL_SPEED.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[ls.e.MAX_NAUTICAL_SOG.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_MAX_DESCENT_SPEED.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[ls.e.SKI_RUN_MAX_SPEED.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[ls.e.LONGEST_WAVE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[ls.e.AVERAGE_RESPIRATION_RATE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[ls.e.FLOORS_CLIMBED.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[ls.e.GYM_FLOORS_CLIMBED.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[ls.e.AVERAGE_FLOOR_CLIMBING_SPEED.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[ls.e.START_TIME.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[ls.e.LOCATION.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[ls.e.BOTTOM_TIME.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[ls.e.LONGEST_DIVE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[ls.e.LONGEST_DIVE_INTERVAL.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[ls.e.DEEPEST_DIVE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[ls.e.MAX_DEPTH.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[ls.e.TOTAL_DIVES.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[ls.e.INTERVALS.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[ls.e.TOTAL_SURFACE_INTERVAL_TIME.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[ls.e.GAS.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[ls.e.JUMP_TIME.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[ls.e.JUMP_ROPE_TOTAL_REPS.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[ls.e.TOTAL_REPS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[ls.e.AVERAGE_JUMP_ROPE_SPEED.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[ls.e.MAX_JUMP_ROPE_SPEED.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[ls.e.STEPS.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[ls.e.SONG_COUNT.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[ls.e.AVERAGE_TEMPO.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[ls.e.MAX_TEMPO.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[ls.e.TOP_SONG_TEMPO.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[ls.e.STRENGTH_SETS.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[ls.e.SKI_RUN_MOVING_TIME.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[ls.e.SKI_RUN_IDLE_TIME.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[ls.e.SKI_LIFT_TIME.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[ls.e.TOTAL_ROUTES.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[ls.e.MAX_CLIMB_DIFFICULTY.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[ls.e.MAX_DIFFICULTY.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[ls.e.NAUTICAL_DISTANCE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[ls.e.PACK_WEIGHT.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[ls.e.MAX_PACK_WEIGHT.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[ls.e.AVERAGE_PACK_WEIGHT.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[ls.e.AVERAGE_OFFSHORE_CADENCE.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[ls.e.AVERAGE_ONSHORE_CADENCE.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_MOVING_TIME.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_IDLE_TIME.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[ls.e.CYCLING_LIFT_TIME.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[ls.e.TOTAL_SETS.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[ls.e.NET_IMPACT.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[ls.e.BODY_BATTERY_DRAIN.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[ls.e.AVERAGE_SPO2.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[ls.e.MAX_SPO2.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[ls.e.MIN_SPO2.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[ls.e.STRESS_CHANGE.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[ls.e.AEROBIC_EFFECT.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[ls.e.ACTIVE_CALORIES.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[ls.e.ALTITUDE_GAIN.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[ls.e.ALTITUDE_LOSS.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[ls.e.ACTIVE_TIME.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[ls.e.ANAEROBIC_EFFECT.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[ls.e.AVERAGE_CLIMB_ASCENT.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[ls.e.AVERAGE_CYCLING_CADENCE.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[ls.e.AVERAGE_BIKE_FORCE.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[ls.e.AVERAGE_CYCLING_SPLIT_POWER.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[ls.e.AVERAGE_ROWING_DISTANCE_PER_STROKE.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[ls.e.AVERAGE_DISTANCE_PER_STROKE.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[ls.e.AVERAGE_DIVE_VELOCITY.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[ls.e.AVERAGE_GRADE_ADJUSTED_PACE.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[ls.e.AVERAGE_GRADE_ADJUSTED_SPEED.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[ls.e.AVERAGE_GRADE_ADJUSTED_PACE_RUN_ACTIVE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[ls.e.AVERAGE_GROUND_CONTACT_TIME.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[ls.e.AVERAGE_GROUND_CONTACT_TIME_ACTIVE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[ls.e.AVERAGE_GROUND_CONTACT_TIME_BALANCE.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[ls.e.AVERAGE_GROUND_CONTACT_TIME_BALANCE_ACTIVE.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[ls.e.AVERAGE_MOVING_PACE.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[ls.e.AVERAGE_MOVING_SPEED.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[ls.e.AVERAGE_NAUTICAL_MOVING_PACE.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[ls.e.AVERAGE_NAUTICAL_MOVING_SPEED.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[ls.e.AVERAGE_ROWING_MOVING_SPEED.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_AVG_MOVING_SPEED.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[ls.e.SKI_RUN_AVG_MOVING_SPEED.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[ls.e.AVERAGE_ROWING_MOVING_PACE.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[ls.e.AVERAGE_MOVING_PACE_RUN_ACTIVE.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[ls.e.AVERAGE_MOVING_SWIM_SPEED.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[ls.e.AVERAGE_NAUTICAL_STROKE_RATE.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[ls.e.AVERAGE_NAUTICAL_SOG.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[ls.e.AVERAGE_NAUTICAL_SPEED.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[ls.e.AVERAGE_NAUTICAL_PACE.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[ls.e.AVERAGE_PACE_RUN_ACTIVE.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[ls.e.AVERAGE_SPLIT_PACE.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[ls.e.AVERAGE_POWER_PER_KG.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[ls.e.AVERAGE_PUSH_CADENCE.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[ls.e.AVERAGE_ROWING_PACE.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[ls.e.AVERAGE_RUN_CADENCE.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[ls.e.AVERAGE_SKI_CADENCE.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[ls.e.AVERAGE_RUN_CADENCE_ACTIVE.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[ls.e.AVERAGE_SURFING_SPEED.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[ls.e.AVERAGE_SKI_POWER.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[ls.e.AVERAGE_ROWING_SPEED.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[ls.e.CYCLING_RUN_AVG_SPEED.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[ls.e.SKI_RUN_AVG_SPEED.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[ls.e.AVERAGE_STEP_SPEED_LOSS.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[ls.e.AVERAGE_STRIDE_LENGTH.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[ls.e.AVERAGE_STRIDE_LENGTH_ACTIVE.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[ls.e.AVERAGE_STROKE_RATE.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[ls.e.AVERAGE_STROKES.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[ls.e.AVERAGE_SWOLF.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[ls.e.AVERAGE_SWIM_CADENCE.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[ls.e.AVERAGE_SWIM_SPEED.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[ls.e.AVERAGE_TEMPERATURE.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[ls.e.AVERAGE_TIME_PER_MOVE.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[ls.e.AVERAGE_TIME_PER_POSE.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[ls.e.AVERAGE_VERTICAL_RATIO.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[ls.e.AVERAGE_VERTICAL_RATIO_ACTIVE.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[ls.e.AVERAGE_VERTICAL_OSCILLATION.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[ls.e.AVERAGE_VERTICAL_OSCILLATION_ACTIVE.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[ls.e.AVERAGE_WALK_CADENCE.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[ls.e.BEGINNING_POTENTIAL.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[ls.e.BEST_GRADE_ADJUSTED_PACE.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[ls.e.BEST_LAP_AVERAGE_PACE.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[ls.e.BEST_LAP_TIME.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[ls.e.BEST_PACE.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[ls.e.BEST_PACE_RUN_ACTIVE.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[ls.e.BEST_ROWING_PACE.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[ls.e.BEST_NAUTICAL_PACE.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[ls.e.BEST_SWOLF.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[ls.e.BIKE_TIME.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[ls.e.BIKE_DISTANCE.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[ls.e.BIKE_SPEED.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[ls.e.BREATH_HOLD_TIME.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[ls.e.CALORIES_CONSUMED.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[ls.e.CALORIES_BURNED.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[ls.e.CALORIES_NET.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[ls.e.NON_PACK_CALORIES.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[ls.e.TOTAL_REST.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[ls.e.CLIMB_FALLS.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[ls.e.CLIMB_ROUTES_ATTEMPTED.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[ls.e.CLIMB_ROUTES_COMPLETED.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[ls.e.CLIMB_SENDS.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[ls.e.DANCE_TIME.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[ls.e.DIVE_DYNAMIC_AVERAGE_VELOCITY.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[ls.e.DIVE_DYNAMIC_AVG_HR.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[ls.e.DIVE_DYNAMIC_MAX_HR.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[ls.e.DIVE_DYNAMIC_MAX_VELOCITY.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[ls.e.DIVE_DYNAMIC_MIN_HR.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[ls.e.DIVE_REST_AVG_HR.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[ls.e.DIVE_REST_MAX_HR.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[ls.e.DIVE_REST_MIN_HR.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[ls.e.DIVE_STATIC_AVG_HR.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[ls.e.DIVE_STATIC_MAX_HR.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[ls.e.DIVE_STATIC_MIN_HR.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[ls.e.ENDING_POTENTIAL.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[ls.e.ENDING_STRESS_LEVEL.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[ls.e.ELAPSED_TIME.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[ls.e.ELAPSED_TIME_MILLIS.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[ls.e.ELEVATION.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[ls.e.ESTIMATED_SWEAT_LOSS.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[ls.e.EXERCISE_LOAD.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[ls.e.FLOW.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[ls.e.FLUID_CONSUMED.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[ls.e.FLUID_NET.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[ls.e.FTP.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[ls.e.GAME_NAME.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[ls.e.GAME_TYPE.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[ls.e.GRIT.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[ls.e.IDLE_TIME.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[ls.e.INTENSITY_FACTOR.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[ls.e.LAP_DISTANCE.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[ls.e.LEFT_BALANCE.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[ls.e.LEFT_GROUND_CONTACT_TIME_BALANCE.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[ls.e.LEFT_PEAK_POWER_PHASE_INTERVAL.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[ls.e.LEFT_PEAK_POWER_PHASE_ARC_LENGTH.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[ls.e.LEFT_PCO.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[ls.e.LEFT_POWER_PHASE_INTERVAL.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[ls.e.LEFT_POWER_PHASE_ARC_LENGTH.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[ls.e.LEFT_RIGHT_BALANCE.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[ls.e.LEFT_RIGHT_PEDAL_SMOOTHNESS.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[ls.e.LEFT_RIGHT_TORQUE_EFFECTIVENESS.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[ls.e.LONGEST_DISTANCE.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[ls.e.LONGEST_DIVE_DYNAMIC_DISTANCE.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[ls.e.MAX_ALTITUDE.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[ls.e.MAX_AVERAGE_20_MINUTES.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[ls.e.MAX_CLIMB_ASCENT.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[ls.e.MAX_OFFSHORE_CADENCE.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[ls.e.MAX_CYCLING_CADENCE.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[ls.e.MAX_BIKE_FORCE.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[ls.e.MAX_CYCLING_SPLIT_POWER.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[ls.e.MAX_ELEVATION.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[ls.e.MAX_FLOOR_CLIMBING_SPEED.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[ls.e.MAX_NAUTICAL_STROKE_RATE.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[ls.e.MAX_POWER.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[ls.e.MAX_POWER_PER_KG.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[ls.e.MAX_PUSH_CADENCE.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[ls.e.MAX_SKI_POWER.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[ls.e.MAX_SPLIT_POWER.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[ls.e.MAX_SPLIT_POWER_PER_KG.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[ls.e.MAX_RESPIRATION_RATE.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[ls.e.MIN_RESPIRATION_RATE.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[ls.e.MAX_RUN_CADENCE.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[ls.e.MAX_SKI_CADENCE.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[ls.e.MAX_RUN_CADENCE_ACTIVE.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[ls.e.BEST_SPLIT_PACE.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[ls.e.MAX_STROKE_RATE.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[ls.e.MAX_SWIM_CADENCE.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[ls.e.MAX_SWIM_SPEED.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[ls.e.MAX_TEMPERATURE.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[ls.e.MAX_WALK_CADENCE.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[ls.e.MIN_ACTUAL.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[ls.e.MIN_ALTITUDE.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[ls.e.MIN_ELEVATION.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[ls.e.MIN_HEART_RATE.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[ls.e.MIN_TEMPERATURE.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[ls.e.MODERATE_INTENSITY.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[ls.e.MOVING_TIME.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[ls.e.MOVING_TIME_MILLIS.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[ls.e.NORMALIZED_FORCE.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[ls.e.NORMALIZED_POWER.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr[ls.e.OBSTACLE_TIME.ordinal()] = 266;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr[ls.e.PRIMARY_BENEFIT.ordinal()] = 267;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr[ls.e.RACE_LOCATION.ordinal()] = 268;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr[ls.e.RECOVERY_HEART_RATE.ordinal()] = 269;
            } catch (NoSuchFieldError unused269) {
            }
            try {
                iArr[ls.e.RUN_REST_TIME.ordinal()] = 270;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr[ls.e.REST_TIME.ordinal()] = 271;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr[ls.e.RESTING_CALORIES.ordinal()] = 272;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr[ls.e.RIGHT_BALANCE.ordinal()] = 273;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr[ls.e.RIGHT_GROUND_CONTACT_TIME_BALANCE.ordinal()] = 274;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr[ls.e.RIGHT_PEAK_POWER_PHASE_INTERVAL.ordinal()] = 275;
            } catch (NoSuchFieldError unused275) {
            }
            try {
                iArr[ls.e.RIGHT_PEAK_POWER_PHASE_ARC_LENGTH.ordinal()] = 276;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr[ls.e.RIGHT_PCO.ordinal()] = 277;
            } catch (NoSuchFieldError unused277) {
            }
            try {
                iArr[ls.e.RIGHT_POWER_PHASE_INTERVAL.ordinal()] = 278;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr[ls.e.RIGHT_POWER_PHASE_ARC_LENGTH.ordinal()] = 279;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr[ls.e.TOTAL_SWIMMING_STROKES.ordinal()] = 280;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr[ls.e.TOTAL_CYCLING_STROKES.ordinal()] = 281;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr[ls.e.TOTAL_RUN_DISTANCE.ordinal()] = 282;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr[ls.e.RUN_AVERAGE_PACE.ordinal()] = 283;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr[ls.e.RUN_DISTANCE.ordinal()] = 284;
            } catch (NoSuchFieldError unused284) {
            }
            try {
                iArr[ls.e.RUN_DISTANCE_METERS.ordinal()] = 285;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr[ls.e.RUN_TIME.ordinal()] = 286;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr[ls.e.SEATED_AVERAGE_POWER.ordinal()] = 287;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr[ls.e.SEATED_MAX_POWER.ordinal()] = 288;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr[ls.e.SEATED_TIME.ordinal()] = 289;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr[ls.e.STANDING_AVERAGE_POWER.ordinal()] = 290;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr[ls.e.STANDING_MAX_POWER.ordinal()] = 291;
            } catch (NoSuchFieldError unused291) {
            }
            try {
                iArr[ls.e.STANDING_TIME.ordinal()] = 292;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr[ls.e.STARTING_STRESS_LEVEL.ordinal()] = 293;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr[ls.e.SURF_DISTANCE.ordinal()] = 294;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr[ls.e.SURF_TIME.ordinal()] = 295;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr[ls.e.WAKE_SPORT_ACTIVE_TIME.ordinal()] = 296;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr[ls.e.AVERAGE_MOVING_SWIMMING_PACE.ordinal()] = 297;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr[ls.e.BEST_SWIMMING_PACE.ordinal()] = 298;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_DYNAMIC_DISTANCE.ordinal()] = 299;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_DYNAMIC_INTERVALS.ordinal()] = 300;
            } catch (NoSuchFieldError unused300) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_DYNAMIC_TIME.ordinal()] = 301;
            } catch (NoSuchFieldError unused301) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_REST_INTERVALS.ordinal()] = 302;
            } catch (NoSuchFieldError unused302) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_REST_TIME.ordinal()] = 303;
            } catch (NoSuchFieldError unused303) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_STATIC_INTERVALS.ordinal()] = 304;
            } catch (NoSuchFieldError unused304) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_STATIC_TIME.ordinal()] = 305;
            } catch (NoSuchFieldError unused305) {
            }
            try {
                iArr[ls.e.TOTAL_DISTANCE.ordinal()] = 306;
            } catch (NoSuchFieldError unused306) {
            }
            try {
                iArr[ls.e.GYM_TOTAL_DISTANCE.ordinal()] = 307;
            } catch (NoSuchFieldError unused307) {
            }
            try {
                iArr[ls.e.TOTAL_FLOORS_ASCENT.ordinal()] = 308;
            } catch (NoSuchFieldError unused308) {
            }
            try {
                iArr[ls.e.TOTAL_FLOORS_DESCENT.ordinal()] = 309;
            } catch (NoSuchFieldError unused309) {
            }
            try {
                iArr[ls.e.TOTAL_LAPS.ordinal()] = 310;
            } catch (NoSuchFieldError unused310) {
            }
            try {
                iArr[ls.e.TOTAL_INTENSITY.ordinal()] = 311;
            } catch (NoSuchFieldError unused311) {
            }
            try {
                iArr[ls.e.TOTAL_JUMPS.ordinal()] = 312;
            } catch (NoSuchFieldError unused312) {
            }
            try {
                iArr[ls.e.TOTAL_MOVES.ordinal()] = 313;
            } catch (NoSuchFieldError unused313) {
            }
            try {
                iArr[ls.e.TOTAL_POSES.ordinal()] = 314;
            } catch (NoSuchFieldError unused314) {
            }
            try {
                iArr[ls.e.TOTAL_PUSHES.ordinal()] = 315;
            } catch (NoSuchFieldError unused315) {
            }
            try {
                iArr[ls.e.TRAINING_STRESS_SCORE.ordinal()] = 316;
            } catch (NoSuchFieldError unused316) {
            }
            try {
                iArr[ls.e.VIGOROUS_INTENSITY.ordinal()] = 317;
            } catch (NoSuchFieldError unused317) {
            }
            try {
                iArr[ls.e.WALK_TIME.ordinal()] = 318;
            } catch (NoSuchFieldError unused318) {
            }
            try {
                iArr[ls.e.WIND_DATA.ordinal()] = 319;
            } catch (NoSuchFieldError unused319) {
            }
            try {
                iArr[ls.e.WORKOUT_RUN_TIME.ordinal()] = 320;
            } catch (NoSuchFieldError unused320) {
            }
            try {
                iArr[ls.e.WORK.ordinal()] = 321;
            } catch (NoSuchFieldError unused321) {
            }
            try {
                iArr[ls.e.IMPACT_LOAD.ordinal()] = 322;
            } catch (NoSuchFieldError unused322) {
            }
            try {
                iArr[ls.e.REAL_DISTANCE.ordinal()] = 323;
            } catch (NoSuchFieldError unused323) {
            }
            try {
                iArr[ls.e.TOTAL_ROUNDS.ordinal()] = 324;
            } catch (NoSuchFieldError unused324) {
            }
            try {
                iArr[ls.e.AVERAGE_REPS_PER_ROUND.ordinal()] = 325;
            } catch (NoSuchFieldError unused325) {
            }
            try {
                iArr[ls.e.JUMP_ROPE_MAX_STREAK.ordinal()] = 326;
            } catch (NoSuchFieldError unused326) {
            }
            try {
                iArr[ls.e.ROUTES_ATTEMPTED.ordinal()] = 327;
            } catch (NoSuchFieldError unused327) {
            }
            try {
                iArr[ls.e.ROUTES_COMPLETED.ordinal()] = 328;
            } catch (NoSuchFieldError unused328) {
            }
            try {
                iArr[ls.e.TOTAL_HIIT_REPS.ordinal()] = 329;
            } catch (NoSuchFieldError unused329) {
            }
            try {
                iArr[ls.e.TOTAL_HIIT_SETS.ordinal()] = 330;
            } catch (NoSuchFieldError unused330) {
            }
            try {
                iArr[ls.e.AVERAGE_REPS_SET.ordinal()] = 331;
            } catch (NoSuchFieldError unused331) {
            }
            try {
                iArr[ls.e.TOTAL_HIIT_VOLUME.ordinal()] = 332;
            } catch (NoSuchFieldError unused332) {
            }
            try {
                iArr[ls.e.EXERCISE_REST_TIME.ordinal()] = 333;
            } catch (NoSuchFieldError unused333) {
            }
            try {
                iArr[ls.e.EXERCISE_WORK_TIME.ordinal()] = 334;
            } catch (NoSuchFieldError unused334) {
            }
            try {
                iArr[ls.e.AVERAGE_TIME_PER_SET.ordinal()] = 335;
            } catch (NoSuchFieldError unused335) {
            }
            try {
                iArr[ls.e.TOTAL_VOLUME.ordinal()] = 336;
            } catch (NoSuchFieldError unused336) {
            }
            try {
                iArr[ls.e.AVERAGE_DEPTH.ordinal()] = 337;
            } catch (NoSuchFieldError unused337) {
            }
            try {
                iArr[ls.e.ROAD_SURFACE_UNPAVED.ordinal()] = 338;
            } catch (NoSuchFieldError unused338) {
            }
            try {
                iArr[ls.e.ROAD_SURFACE_PAVED.ordinal()] = 339;
            } catch (NoSuchFieldError unused339) {
            }
            try {
                iArr[ls.e.AIR_TEMPERATURE.ordinal()] = 340;
            } catch (NoSuchFieldError unused340) {
            }
            try {
                iArr[ls.e.AVERAGE_WATER_TEMPERATURE.ordinal()] = 341;
            } catch (NoSuchFieldError unused341) {
            }
            try {
                iArr[ls.e.DIVE_BOTTOM_TIME.ordinal()] = 342;
            } catch (NoSuchFieldError unused342) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_TIME.ordinal()] = 343;
            } catch (NoSuchFieldError unused343) {
            }
            try {
                iArr[ls.e.DIVE_LOCATION_NAME.ordinal()] = 344;
            } catch (NoSuchFieldError unused344) {
            }
            try {
                iArr[ls.e.DIVE_WEIGHT.ordinal()] = 345;
            } catch (NoSuchFieldError unused345) {
            }
            try {
                iArr[ls.e.DIVING_CONSERVATISM.ordinal()] = 346;
            } catch (NoSuchFieldError unused346) {
            }
            try {
                iArr[ls.e.ENTERING_CNS.ordinal()] = 347;
            } catch (NoSuchFieldError unused347) {
            }
            try {
                iArr[ls.e.ENTERING_NITROGEN.ordinal()] = 348;
            } catch (NoSuchFieldError unused348) {
            }
            try {
                iArr[ls.e.ENTRY_COORDINATES.ordinal()] = 349;
            } catch (NoSuchFieldError unused349) {
            }
            try {
                iArr[ls.e.ENTRY_TYPE.ordinal()] = 350;
            } catch (NoSuchFieldError unused350) {
            }
            try {
                iArr[ls.e.EXIT_COORDINATES.ordinal()] = 351;
            } catch (NoSuchFieldError unused351) {
            }
            try {
                iArr[ls.e.HIGH_DEPT_SET_POINT.ordinal()] = 352;
            } catch (NoSuchFieldError unused352) {
            }
            try {
                iArr[ls.e.HIGH_SET_POINT.ordinal()] = 353;
            } catch (NoSuchFieldError unused353) {
            }
            try {
                iArr[ls.e.LEAVING_CNS.ordinal()] = 354;
            } catch (NoSuchFieldError unused354) {
            }
            try {
                iArr[ls.e.LEAVING_NITROGEN.ordinal()] = 355;
            } catch (NoSuchFieldError unused355) {
            }
            try {
                iArr[ls.e.LOW_DEPTH_SET_POINT.ordinal()] = 356;
            } catch (NoSuchFieldError unused356) {
            }
            try {
                iArr[ls.e.LOW_SET_POINT.ordinal()] = 357;
            } catch (NoSuchFieldError unused357) {
            }
            try {
                iArr[ls.e.MAX_WATER_TEMPERATURE.ordinal()] = 358;
            } catch (NoSuchFieldError unused358) {
            }
            try {
                iArr[ls.e.MIN_WATER_TEMPERATURE.ordinal()] = 359;
            } catch (NoSuchFieldError unused359) {
            }
            try {
                iArr[ls.e.SUIT_THICKNESS.ordinal()] = 360;
            } catch (NoSuchFieldError unused360) {
            }
            try {
                iArr[ls.e.SUIT_TYPE.ordinal()] = 361;
            } catch (NoSuchFieldError unused361) {
            }
            try {
                iArr[ls.e.SURFACE_CONDITION.ordinal()] = 362;
            } catch (NoSuchFieldError unused362) {
            }
            try {
                iArr[ls.e.WATER_CURRENT.ordinal()] = 363;
            } catch (NoSuchFieldError unused363) {
            }
            try {
                iArr[ls.e.WATER_TYPE_AND_DENSITY.ordinal()] = 364;
            } catch (NoSuchFieldError unused364) {
            }
            try {
                iArr[ls.e.WATER_VISIBILITY.ordinal()] = 365;
            } catch (NoSuchFieldError unused365) {
            }
            try {
                iArr[ls.e.WEATHER.ordinal()] = 366;
            } catch (NoSuchFieldError unused366) {
            }
            try {
                iArr[ls.e.AVERAGE_MOVING_GROUND_SPEED.ordinal()] = 367;
            } catch (NoSuchFieldError unused367) {
            }
            try {
                iArr[ls.e.TA.ordinal()] = 368;
            } catch (NoSuchFieldError unused368) {
            }
            try {
                iArr[ls.e.ATA.ordinal()] = 369;
            } catch (NoSuchFieldError unused369) {
            }
            try {
                iArr[ls.e.LTA.ordinal()] = 370;
            } catch (NoSuchFieldError unused370) {
            }
            try {
                iArr[ls.e.UTA.ordinal()] = 371;
            } catch (NoSuchFieldError unused371) {
            }
            try {
                iArr[ls.e.STA.ordinal()] = 372;
            } catch (NoSuchFieldError unused372) {
            }
            try {
                iArr[ls.e.AT.ordinal()] = 373;
            } catch (NoSuchFieldError unused373) {
            }
            try {
                iArr[ls.e.LT.ordinal()] = 374;
            } catch (NoSuchFieldError unused374) {
            }
            try {
                iArr[ls.e.UT.ordinal()] = 375;
            } catch (NoSuchFieldError unused375) {
            }
            try {
                iArr[ls.e.AAP.ordinal()] = 376;
            } catch (NoSuchFieldError unused376) {
            }
            try {
                iArr[ls.e.AMP.ordinal()] = 377;
            } catch (NoSuchFieldError unused377) {
            }
            try {
                iArr[ls.e.LAP.ordinal()] = 378;
            } catch (NoSuchFieldError unused378) {
            }
            try {
                iArr[ls.e.LMP.ordinal()] = 379;
            } catch (NoSuchFieldError unused379) {
            }
            try {
                iArr[ls.e.UAP.ordinal()] = 380;
            } catch (NoSuchFieldError unused380) {
            }
            try {
                iArr[ls.e.UMP.ordinal()] = 381;
            } catch (NoSuchFieldError unused381) {
            }
            try {
                iArr[ls.e.GAS_MODE.ordinal()] = 382;
            } catch (NoSuchFieldError unused382) {
            }
            try {
                iArr[ls.e.COMMON_TYPE.ordinal()] = 383;
            } catch (NoSuchFieldError unused383) {
            }
            try {
                iArr[ls.e.GAS_TYPE.ordinal()] = 384;
            } catch (NoSuchFieldError unused384) {
            }
            try {
                iArr[ls.e.GAS_MIXTURE.ordinal()] = 385;
            } catch (NoSuchFieldError unused385) {
            }
            try {
                iArr[ls.e.TANK_TYPE.ordinal()] = 386;
            } catch (NoSuchFieldError unused386) {
            }
            try {
                iArr[ls.e.TANK_SIZE.ordinal()] = 387;
            } catch (NoSuchFieldError unused387) {
            }
            try {
                iArr[ls.e.TANK_START_PRESSURE.ordinal()] = 388;
            } catch (NoSuchFieldError unused388) {
            }
            try {
                iArr[ls.e.TANK_END_PRESSURE.ordinal()] = 389;
            } catch (NoSuchFieldError unused389) {
            }
            try {
                iArr[ls.e.TANK_USED_PRESSURE.ordinal()] = 390;
            } catch (NoSuchFieldError unused390) {
            }
            try {
                iArr[ls.e.GAS_VOLUME.ordinal()] = 391;
            } catch (NoSuchFieldError unused391) {
            }
            try {
                iArr[ls.e.PRESSURE_RATE.ordinal()] = 392;
            } catch (NoSuchFieldError unused392) {
            }
            try {
                iArr[ls.e.HANG_TIME.ordinal()] = 393;
            } catch (NoSuchFieldError unused393) {
            }
            try {
                iArr[ls.e.JUMP_SPEED.ordinal()] = 394;
            } catch (NoSuchFieldError unused394) {
            }
            try {
                iArr[ls.e.START_ROUNDS.ordinal()] = 395;
            } catch (NoSuchFieldError unused395) {
            }
            try {
                iArr[ls.e.END_ROUNDS.ordinal()] = 396;
            } catch (NoSuchFieldError unused396) {
            }
            try {
                iArr[ls.e.EXERCISE_NAME.ordinal()] = 397;
            } catch (NoSuchFieldError unused397) {
            }
            try {
                iArr[ls.e.AVERAGE_TANK_PRESSURE.ordinal()] = 398;
            } catch (NoSuchFieldError unused398) {
            }
            try {
                iArr[ls.e.MAX_TANK_PRESSURE.ordinal()] = 399;
            } catch (NoSuchFieldError unused399) {
            }
            try {
                iArr[ls.e.DRILL_TYPE.ordinal()] = 400;
            } catch (NoSuchFieldError unused400) {
            }
            f160607a = iArr;
        }
    }

    public static final e0 a(String str) {
        if (!g22.n.d(str)) {
            return ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? e0.METRIC : e0.STATUTE;
        }
        e0 e0VarValueOf = e0.valueOf(str);
        return e0VarValueOf == e0.NAUTICAL ? e0.AVIATION : e0VarValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.j, ms.b, u00.c] */
    /* JADX WARN: Type inference failed for: r3v570 */
    public static final String b(ls.e eVar, l22.b bVar, Object obj, int i14) {
        Double d14;
        eVar.getClass();
        bVar.getClass();
        boolean z14 = false;
        int i15 = 2;
        Object obj2 = 0;
        numValueOf = null;
        Integer numValueOf = null;
        switch (a.f160607a[eVar.ordinal()]) {
            case 1:
            case 190:
            case 194:
            case 197:
                return u00.b.c(new q0(bVar, q0.a.Avg, null, 4, null), obj instanceof Double ? (Double) obj : 0, i14, 4);
            case 2:
                return u00.b.c(new j2(bVar, j2.a.Avg, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 3:
                return u00.b.c(new j2(bVar, j2.a.Max, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 4:
            case 46:
            case 48:
            case 51:
            case 52:
            case 116:
            case 123:
            case 127:
            case 128:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 147:
            case 148:
            case 177:
                return u00.b.c(new e2(bVar, false, null, 6, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 5:
            case 115:
            case 117:
            case 122:
            case 130:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 137:
            case 167:
            case 168:
            case 170:
            case 171:
            case 250:
            case 283:
                return u00.b.c(new h1(bVar, false, null, 6, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 6:
            case 7:
            case 367:
                return u00.b.c(new ns.d(bVar, obj2, i15, obj2), obj instanceof ls.b ? (ls.b) obj : null, i14, 4);
            case 8:
            case 9:
            case 297:
            case 298:
                return u00.b.c(new j3(bVar, obj2, i15, obj2), obj instanceof ls.h ? (ls.h) obj : null, i14, 4);
            case 10:
            case 11:
            case 103:
            case 179:
            case 180:
            case 181:
            case 182:
            case 272:
                return u00.b.c(new ns.h(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 12:
            case 13:
            case 14:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 216:
            case 284:
            case 306:
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
            case 352:
            case 356:
                return u00.b.c(new p(bVar, false, false, null, null, 30, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 15:
            case 112:
            case 285:
                return u00.b.c(new r(bVar), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 16:
            case 282:
            case 294:
            case 365:
                return u00.b.c(new q(bVar, z14, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 17:
                return u00.b.c(new s(bVar), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 18:
                return u00.b.c(new q2(bVar, obj2, i15, obj2), obj instanceof ls.g ? (ls.g) obj : null, i14, 4);
            case 19:
                return u00.b.c(new l1(bVar, obj2, i15, obj2), obj instanceof ls.g ? (ls.g) obj : null, i14, 4);
            case 20:
            case 191:
            case 195:
            case 198:
                return u00.b.c(new q0(bVar, q0.a.Max, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 21:
            case 22:
            case 26:
            case 41:
            case 60:
            case 69:
            case 80:
            case 81:
            case 82:
            case 92:
            case 93:
            case 94:
            case 106:
            case 159:
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 175:
            case 178:
            case 183:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
            case 202:
            case 214:
            case 262:
            case 266:
            case 270:
            case 271:
            case 286:
            case 295:
            case 296:
            case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
            case 303:
            case 305:
            case 318:
            case 320:
            case 333:
            case 334:
            case 335:
            case 342:
            case 343:
                return u00.b.c(new g3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 23:
            case 169:
                return u00.b.c(new b3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 24:
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
            case 263:
                return u00.b.c(new c3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 25:
                return u00.b.c(new f0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 27:
                return u00.b.c(new ns.c(bVar, x.a.Ascent), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 28:
            case 29:
            case 104:
            case 108:
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
            case 229:
            case 231:
            case 236:
            case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
            case 258:
                return u00.b.c(new x(bVar, x.a.Ascent, false, null, 12, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 30:
                return u00.b.c(new ns.c(bVar, x.a.Descent), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 31:
            case 32:
            case 33:
            case 105:
                return u00.b.c(new x(bVar, x.a.Descent, false, null, 12, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 34:
            case 53:
                return u00.b.c(new c1(bVar, z14, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 35:
                return u00.b.c(new b1(bVar, z14, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 36:
                return u00.b.c(new y1(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 37:
                return u00.b.c(new z1(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 38:
                return u00.b.c(new n3(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 39:
            case 40:
            case 310:
            case 313:
            case 314:
            case 327:
            case 328:
            case 329:
            case 330:
            case 391:
                return u00.b.c(new r0(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 42:
                return u00.b.c(new ns.b(bVar, obj2, i15, obj2), obj instanceof ns.a ? (ns.a) obj : null, i14, 4);
            case 43:
                return u00.b.c(new f3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 44:
                return u00.b.c(new s3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 45:
            case 111:
            case 145:
            case 287:
            case 290:
            case 376:
            case 378:
            case 380:
                return u00.b.c(new m1(bVar, m1.a.Avg, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 47:
            case 126:
            case 146:
                return u00.b.c(new e2(bVar, true, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 49:
            case 50:
            case 125:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return u00.b.c(new g1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 54:
                return u00.b.c(new t1(bVar, t1.a.Avg, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 55:
            case 56:
                return u00.b.c(new d0(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 57:
            case 237:
                return u00.b.c(new c0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 58:
                return u00.b.c(new a3(bVar, obj2, i15, obj2), obj instanceof String ? (String) obj : null, i14, 4);
            case 59:
                return u00.b.c(new z0(bVar, obj2, i15, obj2), obj instanceof String ? (String) obj : null, i14, 4);
            case 61:
                return u00.b.c(new a1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 62:
                return u00.b.c(new a1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 63:
                return u00.b.c(new u(bVar, u.a.Deepest, false, null, 12, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 64:
                return u00.b.c(new u(bVar, u.a.Max, false, null, 12, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 65:
                return u00.b.c(new d3(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 66:
            case 300:
            case 302:
            case 304:
                return u00.b.c(new u0(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 67:
                return u00.b.c(new o2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 68:
                return u00.b.c(new k0(bVar, obj2, i15, obj2), obj instanceof v ? (v) obj : null, i14, 4);
            case 70:
                return u00.b.c(new s1(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 71:
                return u00.b.c(new s1(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 72:
            case 73:
                return u00.b.c(new v0(bVar), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 74:
                return u00.b.c(new h2(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 75:
                return u00.b.c(new c2(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 76:
            case 77:
            case 78:
                return u00.b.c(new v2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 79:
            case 95:
                return u00.b.c(new a2(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 83:
                return u00.b.c(new v1(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 84:
                d1 d1Var = new d1(bVar, x0.f4352y2, null, 4, null);
                y yVar = obj instanceof y ? (y) obj : null;
                return u00.b.c(d1Var, yVar != null ? yVar.f140409b : null, i14, 4);
            case 85:
                return u00.b.c(new d1(bVar, x0.f4356z2, null, 4, null), obj instanceof String ? (String) obj : null, i14, 4);
            case 86:
                return u00.b.c(new e1(bVar, z14, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 87:
            case 88:
            case 89:
                return u00.b.c(new o3(bVar, true, new z()), obj instanceof h0 ? (h0) obj : null, i14, 4);
            case 90:
            case 91:
            case 109:
            case 232:
            case 233:
                return u00.b.c(new ns.k(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 96:
                return u00.b.c(new ns.g(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 97:
                return u00.b.c(new ns.f(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 98:
            case 99:
            case 100:
                return u00.b.c(new r1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 101:
                b2 b2Var = new b2(bVar, obj2, i15, obj2);
                Double d15 = obj instanceof Double ? (Double) obj : null;
                return u00.b.c(b2Var, d15 != null ? Integer.valueOf(MathKt.b(d15.doubleValue())) : null, i14, 4);
            case 102:
            case 107:
                return u00.b.c(new h3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 110:
            case 234:
            case 264:
                return u00.b.c(new g0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 113:
                return u00.b.c(new t(bVar, z14, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 114:
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
            case 192:
                return u00.b.c(new k1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 118:
            case 119:
                return u00.b.c(new o0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 120:
            case 121:
                return u00.b.c(new n0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 124:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case 173:
                return u00.b.c(new f1(bVar), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 129:
            case 140:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                return u00.b.c(new j3(bVar, obj2, i15, obj2), obj instanceof ls.h ? (ls.h) obj : null, i14, 4);
            case 131:
            case 157:
            case 253:
                return u00.b.c(new r2(bVar, obj2, i15, obj2), obj instanceof ls.g ? (ls.g) obj : null, i14, 4);
            case 132:
            case 153:
            case 156:
            case 238:
            case 251:
            case 252:
                return u00.b.c(new m2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
            case 244:
                return u00.b.c(new n1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 139:
            case 141:
            case 143:
            case 165:
            case 241:
            case 247:
            case 249:
            case 255:
                return u00.b.c(new w1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 142:
            case 248:
                return u00.b.c(new x1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 149:
                return u00.b.c(new g2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 150:
                return u00.b.c(new i1(bVar, 2, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 151:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                return u00.b.c(new k2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 154:
                return u00.b.c(new n2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 174:
                return u00.b.c(new s2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 158:
            case 254:
            case 260:
            case 340:
            case 341:
            case 358:
            case 359:
                return u00.b.c(new u2(bVar, false, null, 6, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 161:
            case 162:
            case 218:
            case 274:
            case 347:
            case 348:
            case 354:
            case 355:
                return u00.b.c(new i1(bVar, 0, null, 6, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 163:
            case 164:
                return u00.b.c(new k3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 166:
            case 200:
            case 256:
                return u00.b.c(new f2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
            case 185:
            case 186:
            case 187:
                r0 r0Var = new r0(bVar, obj2, i15, obj2);
                y yVar2 = obj instanceof y ? (y) obj : null;
                if (yVar2 != null && (d14 = yVar2.f140408a) != null) {
                    numValueOf = Integer.valueOf((int) d14.doubleValue());
                }
                return u00.b.c(r0Var, numValueOf, i14, 4);
            case 193:
            case 196:
            case 199:
            case 259:
                return u00.b.c(new q0(bVar, q0.a.Min, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 201:
            case 293:
                return u00.b.c(new j2(bVar, j2.a.Avg, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
            case 208:
            case 209:
                return u00.b.c(new ns.e0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                return u00.b.c(new ns.y(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
            case 213:
            case 331:
                return u00.b.c(new d2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 210:
            case 230:
            case 265:
                return u00.b.c(new m1(bVar, m1.a.Other, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 211:
            case 268:
            case 344:
            case 350:
            case 361:
            case 362:
            case 363:
            case 366:
            case 386:
                return u00.b.c(new l2(bVar, obj2, i15, obj2), obj instanceof String ? (String) obj : null, i14, 4);
            case 212:
                return u00.b.c(new ns.h0(bVar, obj2, i15, obj2), obj instanceof com.garmin.android.apps.connectmobile.activities.newmodel.v ? (com.garmin.android.apps.connectmobile.activities.newmodel.v) obj : null, i14, 4);
            case 215:
                return u00.b.c(new s0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 217:
            case 273:
                return u00.b.c(new ns.x0(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 219:
            case 222:
            case 275:
            case 278:
                return u00.b.c(new ns.n(bVar, obj2, i15, obj2), obj instanceof ps.g0 ? (ps.g0) obj : null, i14, 4);
            case 220:
            case 223:
            case 276:
            case 279:
            case 368:
            case 369:
            case 370:
            case 371:
            case 372:
                return u00.b.c(new o(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 221:
            case 277:
                return u00.b.c(new j1(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 224:
                return u00.b.c(new ns.l(bVar, obj2, i15, obj2), obj instanceof ps.g0 ? (ps.g0) obj : null, i14, 4);
            case 225:
            case 226:
                return u00.b.c(new ns.m(bVar, obj2, i15, obj2), obj instanceof ps.g0 ? (ps.g0) obj : null, i14, 4);
            case 227:
            case 228:
            case 299:
                q2 q2Var = new q2(bVar, obj2, i15, obj2);
                boolean z15 = am.j.z(f12.l.f68084a);
                Double d16 = obj instanceof Double ? (Double) obj : null;
                return u00.b.c(q2Var, new ls.g(z15, d16 != null ? d16.doubleValue() : 0.0d), i14, 4);
            case 235:
            case 239:
            case 242:
            case 243:
            case 288:
            case 291:
            case 377:
            case 379:
            case 381:
                return u00.b.c(new m1(bVar, m1.a.Max, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 245:
            case 246:
                return u00.b.c(new t1(bVar, t1.a.Other, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 261:
            case 311:
            case 317:
                return u00.b.c(new t0(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 267:
                return u00.b.c(new q1(bVar, obj2, i15, obj2), obj instanceof qs.u ? (qs.u) obj : null, i14, 4);
            case 269:
                return u00.b.c(new q0(bVar, q0.a.Other, new a0()), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 280:
            case 281:
            case 315:
                return u00.b.c(new f3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 289:
            case 292:
            case 373:
            case 374:
            case 375:
                return u00.b.c(new y2(bVar, obj2, i15, obj2), obj instanceof ps.g0 ? (ps.g0) obj : null, i14, 4);
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return u00.b.c(new ns.a0(bVar, x.a.Ascent), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 309:
                return u00.b.c(new ns.a0(bVar, x.a.Descent), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 312:
                return u00.b.c(new e3(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 316:
                return u00.b.c(new i3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 319:
                return u00.b.c(new q3(bVar, obj2, i15, obj2), obj instanceof ps.e2 ? (ps.e2) obj : null, i14, 4);
            case 321:
                return u00.b.c(new r3(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 322:
                return u00.b.c(new p(bVar, false, false, null, null, 26, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 323:
                return u00.b.c(new p(bVar, false, false, null, null, 26, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 324:
                return u00.b.c(new u1(bVar, u1.a.Total, null, 4, null), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 325:
                return u00.b.c(new d2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 326:
                return u00.b.c(new p0(bVar, obj2, i15, obj2), obj instanceof Integer ? (Integer) obj : null, i14, 4);
            case 332:
            case 336:
                return u00.b.c(new p3(bVar, false, null, 6, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 337:
                return u00.b.c(new u(bVar, u.a.Avg, false, null, 12, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 338:
            case 339:
                return u00.b.c(new p2(bVar, obj2, i15, obj2), obj instanceof ls.f ? (ls.f) obj : null, i14, 4);
            case 345:
                return u00.b.c(new o3(bVar, false, null, 4, null), obj instanceof h0 ? (h0) obj : null, i14, 4);
            case 346:
                return u00.b.c(new ns.i(bVar, obj2, i15, obj2), obj instanceof qs.c ? (qs.c) obj : null, i14, 4);
            case 349:
            case 351:
                return u00.b.c(new ns.j(bVar, obj2, i15, obj2), obj instanceof ps.f0 ? (ps.f0) obj : null, i14, 4);
            case 353:
            case 357:
                return u00.b.c(new ns.e(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 360:
                return u00.b.c(new w2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 364:
                return u00.b.c(new m3(bVar, obj2, i15, obj2), obj instanceof l3 ? (l3) obj : null, i14, 4);
            case 382:
                return u00.b.c(new j0(bVar, obj2, i15, obj2), obj instanceof qs.l ? (qs.l) obj : null, i14, 4);
            case 383:
                return u00.b.c(new l0(bVar, obj2, i15, obj2), obj instanceof qs.m ? (qs.m) obj : null, i14, 4);
            case 384:
                return u00.b.c(new m0(bVar, obj2, i15, obj2), obj instanceof v ? (v) obj : null, i14, 4);
            case 385:
                return u00.b.c(new i0(bVar, obj2, i15, obj2), obj instanceof v ? (v) obj : null, i14, 4);
            case 387:
                return u00.b.c(new y0(bVar, obj2, i15, obj2), obj instanceof h0 ? (h0) obj : null, i14, 4);
            case 388:
            case 389:
            case 390:
            case 398:
            case 399:
                return u00.b.c(new t2(bVar, false, null, 6, null), obj instanceof ps.k1 ? (ps.k1) obj : null, i14, 4);
            case 392:
                return u00.b.c(new p1(bVar, obj2, i15, obj2), obj instanceof h0 ? (h0) obj : null, i14, 4);
            case 393:
                return u00.b.c(new z2(bVar, obj2, i15, obj2), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 394:
                return u00.b.c(new w0(bVar, false, null, 6, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 395:
            case 396:
                return u00.b.c(new o1(bVar, o1.a.Other, null, 4, null), obj instanceof Double ? (Double) obj : null, i14, 4);
            case 397:
                return u00.b.c(new ns.z(bVar, obj2, i15, obj2), obj instanceof String ? (String) obj : null, i14, 4);
            case 400:
                return u00.b.c(new w(bVar, obj2, i15, obj2), obj instanceof qs.f ? (qs.f) obj : null, i14, 4);
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final int c(ls.e eVar) {
        eVar.getClass();
        int i14 = a.f160607a[eVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 29 || i14 == 30 || i14 == 49 || i14 == 50 || i14 == 70 || i14 == 71) {
            return 73;
        }
        switch (i14) {
            case 10:
            case 103:
                return 88;
            case 20:
            case 27:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 74:
            case 79:
            case 96:
            case 97:
                return 73;
            default:
                switch (i14) {
                    case 34:
                    case 35:
                    case 37:
                    case 38:
                        return 73;
                    case 36:
                        return 88;
                    default:
                        switch (i14) {
                            case 44:
                            case 45:
                            case 46:
                                return 73;
                            default:
                                switch (i14) {
                                    case 53:
                                    case 54:
                                    case 55:
                                        return 73;
                                    default:
                                        switch (i14) {
                                            case 83:
                                            case 84:
                                            case 85:
                                                return 73;
                                            default:
                                                switch (i14) {
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                        return 73;
                                                    default:
                                                        return 9;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static final int d(ls.e eVar) {
        int i14 = a.f160607a[eVar.ordinal()];
        return (i14 == 10 || i14 == 74 || i14 == 97 || i14 == 103) ? 24 : 9;
    }

    public static final rf2.b e(List<rf2.b> list, rf2.a aVar) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((rf2.b) next).f152455a == aVar) {
                return (rf2.b) next;
            }
        }
        next = null;
        return (rf2.b) next;
    }

    public static final int f(ls.e eVar) {
        int i14 = a.f160607a[eVar.ordinal()];
        if (i14 == 2 || i14 == 3) {
            return SyslogConstants.LOG_LOCAL1;
        }
        if (i14 == 15) {
            return 265;
        }
        if (i14 == 37 || i14 == 38) {
            return 72;
        }
        return d(eVar);
    }

    public static final int g(ls.e eVar) {
        int i14 = a.f160607a[eVar.ordinal()];
        if (i14 == 2 || i14 == 3 || i14 == 10 || i14 == 11 || i14 == 36 || i14 == 96 || i14 == 103 || i14 == 201 || i14 == 272 || i14 == 293 || i14 == 310 || i14 == 55 || i14 == 56 || i14 == 338 || i14 == 339) {
            return 16;
        }
        switch (i14) {
            case 179:
            case 180:
            case 181:
            case 182:
                return 16;
            default:
                return 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.j, ms.b, u00.c] */
    /* JADX WARN: Type inference failed for: r3v237 */
    public static final String h(ls.e eVar, l22.b bVar, Object obj) {
        c22.q3 q3Var;
        e0 speedDisplayMeasureUnit;
        eVar.getClass();
        bVar.getClass();
        boolean z14 = false;
        int i14 = 2;
        Object obj2 = 0;
        switch (a.f160607a[eVar.ordinal()]) {
            case 1:
                return new q0(bVar, q0.a.Avg, null, 4, null).h(obj instanceof Double ? (Double) obj : 0);
            case 2:
                new j2(bVar, j2.a.Avg, null, 4, null);
                return null;
            case 3:
            case 19:
            case 36:
            case 39:
            case 40:
            case 66:
            case 68:
            case 83:
            case 85:
            case 91:
            case 95:
            case 97:
            case 178:
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 211:
            case 228:
            case 259:
            case 268:
            case 299:
            case 300:
            case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
            case 302:
            case 303:
            case 304:
            case 305:
            case 310:
            case 313:
            case 314:
            case 327:
            case 328:
            case 329:
            case 330:
            case 344:
            case 346:
            case 347:
            case 348:
            case 349:
            case 350:
            case 351:
            case 354:
            case 355:
            case 361:
            case 362:
            case 363:
            case 366:
            case 382:
            case 383:
            case 384:
            case 385:
            case 386:
            case 387:
            case 388:
            case 389:
            case 390:
            case 391:
            case 392:
            default:
                return null;
            case 4:
            case 46:
            case 48:
            case 51:
            case 52:
            case 116:
            case 123:
            case 127:
            case 128:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 147:
            case 148:
            case 177:
                return new e2(bVar, false, null, 6, null).k(obj instanceof Double ? (Double) obj : null);
            case 5:
            case 115:
            case 117:
            case 122:
            case 130:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 137:
            case 167:
            case 168:
            case 170:
            case 171:
            case 250:
            case 283:
                return new h1(bVar, false, null, 6, null).k(obj instanceof Double ? (Double) obj : null);
            case 6:
            case 7:
            case 367:
                ns.d dVar = new ns.d(bVar, obj2, i14, obj2);
                ls.b bVar2 = obj instanceof ls.b ? (ls.b) obj : null;
                if (bVar2 == null || (speedDisplayMeasureUnit = bVar2.getSpeedDisplayMeasureUnit()) == null || (q3Var = speedDisplayMeasureUnit.f29425a) == null) {
                    q3Var = c22.q3.METERS_PER_SECOND;
                }
                return dVar.f127630c.getString(q3Var.f23223e);
            case 8:
            case 9:
            case 297:
            case 298:
                return new j3(bVar, obj2, i14, obj2).i(obj instanceof ls.h ? (ls.h) obj : null);
            case 10:
            case 11:
            case 103:
            case 179:
            case 180:
            case 181:
            case 182:
            case 272:
                return new ns.h(bVar, obj2, i14, obj2).f127655c.getString(R.string.calories_abbreviation);
            case 12:
            case 13:
            case 14:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 216:
            case 284:
            case 306:
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
            case 352:
            case 356:
                return new p(bVar, false, false, null, null, 30, null).m(obj instanceof Double ? (Double) obj : null);
            case 15:
            case 17:
            case 112:
            case 285:
                return new r(bVar).m(obj instanceof Double ? (Double) obj : null);
            case 16:
            case 34:
            case 282:
            case 294:
            case 365:
                return new q(bVar, z14, i14, obj2).m(obj instanceof Double ? (Double) obj : null);
            case 18:
                return new q2(bVar, obj2, i14, obj2).i(obj instanceof ls.g ? (ls.g) obj : null);
            case 20:
                return new q0(bVar, q0.a.Max, null, 4, null).h(obj instanceof Double ? (Double) obj : null);
            case 21:
            case 22:
            case 26:
            case 41:
            case 60:
            case 61:
            case 62:
            case 69:
            case 80:
            case 81:
            case 82:
            case 92:
            case 93:
            case 94:
            case 106:
            case 159:
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 175:
            case 183:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
            case 202:
            case 214:
            case 262:
            case 266:
            case 270:
            case 271:
            case 286:
            case 295:
            case 296:
            case 318:
            case 320:
            case 333:
            case 334:
            case 335:
            case 342:
            case 343:
                new g3(bVar, obj2, i14, obj2);
                return null;
            case 23:
            case 169:
                new b3(bVar, obj2, i14, obj2);
                return null;
            case 24:
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
            case 263:
                new c3(bVar, obj2, i14, obj2);
                return null;
            case 25:
                new f0(bVar, obj2, i14, obj2);
                return null;
            case 27:
                return new x(bVar, x.a.Ascent, false, null, 12, null).k(obj instanceof Double ? (Double) obj : null);
            case 28:
            case 29:
            case 104:
            case 108:
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
            case 229:
            case 231:
            case 236:
            case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
            case 258:
                return new x(bVar, x.a.Ascent, false, null, 12, null).k(obj instanceof Double ? (Double) obj : null);
            case 30:
                return new x(bVar, x.a.Descent, false, null, 12, null).k(obj instanceof Double ? (Double) obj : null);
            case 31:
            case 32:
            case 33:
            case 105:
                return new x(bVar, x.a.Descent, false, null, 12, null).k(obj instanceof Double ? (Double) obj : null);
            case 35:
                return new b1(bVar, z14, i14, obj2).m(obj instanceof Double ? (Double) obj : null);
            case 37:
                new z1(bVar, obj2, i14, obj2);
                return null;
            case 38:
                new n3(bVar, obj2, i14, obj2);
                return null;
            case 42:
                new ns.b(bVar, obj2, i14, obj2);
                return null;
            case 43:
                new f3(bVar, obj2, i14, obj2);
                return null;
            case 44:
                new s3(bVar, obj2, i14, obj2);
                return null;
            case 45:
            case 111:
            case 145:
            case 287:
            case 290:
            case 376:
            case 378:
            case 380:
                return new m1(bVar, m1.a.Avg, null, 4, null).i(obj instanceof Double ? (Double) obj : null);
            case 47:
            case 126:
            case 146:
                return new e2(bVar, true, null, 4, null).k(obj instanceof Double ? (Double) obj : null);
            case 49:
            case 50:
            case 125:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                g1 g1Var = new g1(bVar, obj2, i14, obj2);
                int i15 = g1Var.f127649d.f23223e;
                l22.b bVar3 = g1Var.f127648c;
                String string = bVar3.getString(i15);
                if (u00.b.g(1)) {
                    return string;
                }
                oi0.b bVar4 = new oi0.b(bVar3, string);
                bVar4.u();
                return bVar4.f132238b;
            case 53:
                return new c1(bVar, z14, i14, obj2).m(obj instanceof Double ? (Double) obj : null);
            case 54:
                return new t1(bVar, t1.a.Avg, null, 4, null).h(obj instanceof Double ? (Double) obj : null);
            case 55:
            case 56:
                new d0(bVar, obj2, i14, obj2);
                return null;
            case 57:
            case 237:
                return new c0(bVar, obj2, i14, obj2).h(16, obj instanceof Double ? (Double) obj : null);
            case 58:
                new a3(bVar, obj2, i14, obj2);
                return null;
            case 59:
                new z0(bVar, obj2, i14, obj2);
                return null;
            case 63:
                return new u(bVar, u.a.Deepest, false, null, 12, null).i(obj instanceof Double ? (Double) obj : null);
            case 64:
                return new u(bVar, u.a.Max, false, null, 12, null).i(obj instanceof Double ? (Double) obj : null);
            case 65:
                new c2(bVar, obj2, i14, obj2);
                return null;
            case 67:
                new o2(bVar, obj2, i14, obj2);
                return null;
            case 70:
                new s1(bVar, obj2, i14, obj2);
                return null;
            case 71:
                new s1(bVar, obj2, i14, obj2);
                return null;
            case 72:
            case 73:
                return new v0(bVar).k(obj instanceof Double ? (Double) obj : null);
            case 74:
                h2 h2Var = new h2(bVar, obj2, i14, obj2);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                l22.b bVar5 = h2Var.f127659c;
                return iIntValue == 1 ? bVar5.getString(R.string.step_unit) : bVar5.getString(R.string.steps_unit);
            case 75:
                new c2(bVar, obj2, i14, obj2);
                return null;
            case 76:
            case 77:
            case 78:
                return new v2(bVar, obj2, i14, obj2).f127786c.getString(R.string.lbl_spm);
            case 79:
                new a2(bVar, obj2, i14, obj2);
                return null;
            case 84:
                new l2(bVar, obj2, i14, obj2);
                return null;
            case 86:
                return new e1(bVar, z14, i14, obj2).m(obj instanceof Double ? (Double) obj : null);
            case 87:
            case 88:
            case 89:
                return new o3(bVar, true, new z()).h(obj instanceof h0 ? (h0) obj : null);
            case 90:
            case 109:
            case 232:
            case 233:
                l22.b bVar6 = new ns.k(bVar, obj2, i14, obj2).f127681c;
                String string2 = bVar6.getString(R.string.lbl_rpm);
                if (u00.b.g(1)) {
                    return string2;
                }
                oi0.b bVar7 = new oi0.b(bVar6, string2);
                bVar7.T();
                return bVar7.f132238b;
            case 96:
                new ns.g(bVar, obj2, i14, obj2);
                return null;
            case 98:
            case 99:
            case 100:
                return new i1(bVar, 0, null, 6, null).h(obj instanceof Double ? (Double) obj : null);
            case 101:
                new i2(bVar, obj2, i14, obj2);
                return null;
            case 102:
            case 107:
                new h3(bVar, obj2, i14, obj2);
                return null;
            case 110:
            case 234:
            case 264:
                return new g0(bVar, obj2, i14, obj2).i(obj instanceof Double ? (Double) obj : null);
            case 113:
                return new t(bVar, z14, i14, obj2).m(obj instanceof Double ? (Double) obj : null);
            case 114:
                k1 k1Var = new k1(bVar, obj2, i14, obj2);
                Double d14 = obj instanceof Double ? (Double) obj : null;
                String string3 = k1Var.f127683c.getString(k1.i().f23223e);
                return u00.b.g(1) ? string3 : k1Var.h(d14, string3);
            case 118:
            case 119:
                l22.b bVar8 = new o0(bVar, obj2, i14, obj2).f127712c;
                String string4 = bVar8.getString(R.string.lbl_ms);
                if (u00.b.g(1)) {
                    return string4;
                }
                oi0.b bVar9 = new oi0.b(bVar8, string4);
                bVar9.K();
                return bVar9.f132238b;
            case 120:
            case 121:
                return new n0(bVar, obj2, i14, obj2).f127707c.getString(R.string.percent_sign);
            case 124:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case 173:
                return new f1(bVar).k(obj instanceof Double ? (Double) obj : null);
            case 129:
            case 140:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                return new j3(bVar, obj2, i14, obj2).i(obj instanceof ls.h ? (ls.h) obj : null);
            case 131:
            case 157:
            case 253:
                r2 r2Var = new r2(bVar, obj2, i14, obj2);
                ls.g gVar = obj instanceof ls.g ? (ls.g) obj : null;
                boolean isUsingMetric = gVar != null ? gVar.getIsUsingMetric() : ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                int i16 = (isUsingMetric ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR).f23223e;
                l22.b bVar10 = r2Var.f127748c;
                String string5 = bVar10.getString(i16);
                if (u00.b.g(1)) {
                    return string5;
                }
                oi0.b bVar11 = new oi0.b(bVar10, string5);
                if (isUsingMetric) {
                    bVar11.t();
                    return bVar11.f132238b;
                }
                bVar11.C();
                return bVar11.f132238b;
            case 132:
            case 153:
            case 156:
            case 238:
            case 251:
            case 252:
                return new m2(bVar, obj2, i14, obj2).h(1, obj instanceof Double ? (Double) obj : null);
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
            case 244:
                return new n1(bVar, obj2, i14, obj2).h(1, obj instanceof Double ? (Double) obj : null);
            case 139:
            case 141:
            case 143:
            case 165:
            case 241:
            case 247:
            case 249:
            case 255:
                return new w1(bVar, obj2, i14, obj2).i(obj instanceof Double ? (Double) obj : null);
            case 142:
            case 248:
                return new x1(bVar, obj2, i14, obj2).i(obj instanceof Double ? (Double) obj : null);
            case 149:
                l22.b bVar12 = new g2(bVar, obj2, i14, obj2).f127653c;
                String string6 = bVar12.getString(R.string.common_abbrev_centimeters_per_second);
                if (u00.b.g(1)) {
                    return string6;
                }
                oi0.b bVar13 = new oi0.b(bVar12, string6);
                String str = bVar13.f132238b;
                l22.b bVar14 = bVar13.f132237a;
                String strV = d53.u.v(str, bVar14.getString(R.string.common_abbrev_centimeters_per_second), bVar14.getString(R.string.lbl_centimeters_per_second), false);
                bVar13.f132238b = strV;
                return strV;
            case 150:
            case 161:
            case 162:
            case 218:
            case 274:
                return new i1(bVar, 0, null, 6, null).h(obj instanceof Double ? (Double) obj : null);
            case 151:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                k2 k2Var = new k2(bVar, obj2, i14, obj2);
                Double d15 = obj instanceof Double ? (Double) obj : null;
                l22.b bVar15 = k2Var.f127684c;
                String string7 = bVar15.getString(R.string.lbl_meter);
                if (u00.b.g(1)) {
                    return string7;
                }
                c22.l3.a aVar = c22.l3.f23124b;
                float fDoubleValue = d15 != null ? (float) d15.doubleValue() : 0.0f;
                aVar.getClass();
                boolean z15 = c22.l3.a.b(fDoubleValue) == 1.0f;
                oi0.b bVar16 = new oi0.b(bVar15, string7);
                if (z15) {
                    bVar16.x();
                    return bVar16.f132238b;
                }
                bVar16.y();
                return bVar16.f132238b;
            case 154:
                l22.b bVar17 = new n2(bVar, obj2, i14, obj2).f127709c;
                String string8 = bVar17.getString(R.string.activity_details_per_length);
                if (u00.b.g(1)) {
                    return string8;
                }
                oi0.b bVar18 = new oi0.b(bVar17, string8);
                bVar18.P((2 & 1) == 0, false);
                return bVar18.f132238b;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 174:
                new s2(bVar, obj2, i14, obj2);
                return null;
            case 158:
            case 254:
            case 260:
            case 340:
            case 341:
            case 358:
            case 359:
                u2 u2Var = new u2(bVar, false, null, 6, null);
                boolean zH = oe2.f.H(1, 4);
                boolean z16 = u2Var.f127781d;
                l22.b bVar19 = u2Var.f127780c;
                if (zH) {
                    return bVar19.getString(z16 ? R.string.lbl_fahrenheit_degrees : R.string.lbl_celsius_degrees);
                }
                return bVar19.getString(z16 ? R.string.lbl_fahrenheit : R.string.lbl_celsius);
            case 163:
            case 164:
                l22.b bVar20 = new k3(bVar, obj2, i14, obj2).f127685c;
                String string9 = bVar20.getString(R.string.lbl_cm);
                if (u00.b.g(1)) {
                    return string9;
                }
                oi0.b bVar21 = new oi0.b(bVar20, string9);
                bVar21.m();
                return bVar21.f132238b;
            case 166:
            case 200:
            case 256:
                return new f2(bVar, obj2, i14, obj2).f127645c.getString(R.string.percent_sign);
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
            case 185:
            case 186:
            case 187:
                new r0(bVar, obj2, i14, obj2);
                return null;
            case 201:
            case 293:
                new j2(bVar, null, null, 4, null);
                return null;
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
            case 208:
            case 209:
                ns.e0 e0Var = new ns.e0(bVar, obj2, i14, obj2);
                Double d16 = obj instanceof Double ? (Double) obj : null;
                boolean zG = u00.b.g(1);
                l22.b bVar22 = e0Var.f127638c;
                if (zG) {
                    return bVar22.getString(R.string.lbl_unit_milliliter_abr);
                }
                return p005kotlin.jvm.internal.s.c(d16, 1.0d) ? bVar22.getString(R.string.common_milliliter) : bVar22.getString(R.string.common_milliliters);
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                new ns.y(bVar, obj2, i14, obj2);
                return null;
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
            case 213:
            case 331:
                new d2(bVar, obj2, i14, obj2);
                return null;
            case 210:
            case 230:
            case 265:
                return new m1(bVar, m1.a.Other, null, 4, null).i(obj instanceof Double ? (Double) obj : null);
            case 212:
                new ns.h0(bVar, obj2, i14, obj2);
                return null;
            case 215:
                new s0(bVar, obj2, i14, obj2);
                return null;
            case 217:
            case 273:
                return new ns.x0(bVar, obj2, i14, obj2).f127800c.getString(R.string.percent_sign);
            case 219:
            case 222:
            case 275:
            case 278:
                new ns.n(bVar, obj2, i14, obj2);
                return null;
            case 220:
            case 223:
            case 276:
            case 279:
            case 368:
            case 369:
            case 370:
            case 371:
            case 372:
                return new o(bVar, obj2, i14, obj2).h(16, obj instanceof Double ? (Double) obj : null);
            case 221:
            case 277:
                return new j1(bVar, obj2, i14, obj2).f127670c.getString(R.string.lbl_mm);
            case 224:
                new ns.l(bVar, obj2, i14, obj2);
                return null;
            case 225:
            case 226:
                new ns.m(bVar, obj2, i14, obj2);
                return null;
            case 227:
                q2 q2Var = new q2(bVar, obj2, i14, obj2);
                boolean z17 = am.j.z(f12.l.f68084a);
                Double d17 = obj instanceof Double ? (Double) obj : null;
                return q2Var.i(new ls.g(z17, d17 != null ? d17.doubleValue() : 0.0d));
            case 235:
            case 239:
            case 242:
            case 243:
            case 288:
            case 291:
            case 377:
            case 379:
            case 381:
                return new m1(bVar, m1.a.Max, null, 4, null).i(obj instanceof Double ? (Double) obj : null);
            case 245:
            case 246:
                return new t1(bVar, t1.a.Other, null, 4, null).h(obj instanceof Double ? (Double) obj : null);
            case 261:
            case 311:
            case 317:
                return new t0(bVar, obj2, i14, obj2).f127756c.getString(R.string.common_min_abbreviated_without_period);
            case 267:
                new q1(bVar, obj2, i14, obj2);
                return null;
            case 269:
                return new q0(bVar, q0.a.Other, new a0()).h(obj instanceof Double ? (Double) obj : null);
            case 280:
            case 281:
            case 315:
                new f3(bVar, obj2, i14, obj2);
                return null;
            case 289:
            case 292:
            case 373:
            case 374:
            case 375:
                new y2(bVar, obj2, i14, obj2);
                return null;
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return new ns.a0(bVar, x.a.Ascent).k(obj instanceof Double ? (Double) obj : null);
            case 309:
                return new ns.a0(bVar, x.a.Descent).k(obj instanceof Double ? (Double) obj : null);
            case 312:
                new e3(bVar, obj2, i14, obj2);
                return null;
            case 316:
                new i3(bVar, obj2, i14, obj2);
                return null;
            case 319:
                l22.b bVar23 = new q3(bVar, obj2, i14, obj2).f127744c;
                String string10 = bVar23.getString(R.string.lbl_watts);
                if (!oe2.f.H(1, 2)) {
                    return string10;
                }
                oi0.b bVar24 = new oi0.b(bVar23, string10);
                bVar24.X();
                return bVar24.f132238b;
            case 321:
                return new r3(bVar, obj2, i14, obj2).h(1, obj instanceof Double ? (Double) obj : null);
            case 322:
                return new p(bVar, false, false, null, null, 30, null).m(obj instanceof Double ? (Double) obj : null);
            case 323:
                return new p(bVar, false, false, null, null, 30, null).m(obj instanceof Double ? (Double) obj : null);
            case 324:
                u1 u1Var = new u1(bVar, u1.a.Total, null, 4, null);
                Integer num2 = obj instanceof Integer ? (Integer) obj : null;
                int i17 = u1.b.f127779a[u1Var.f127775d.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        lc.u0.r();
                    } else if (num2 != null) {
                        return u1Var.f127774c.getString(R.string.lbl_rounds);
                    }
                }
                return null;
            case 325:
                new d2(bVar, obj2, i14, obj2);
                return null;
            case 326:
                new p0(bVar, obj2, i14, obj2);
                return null;
            case 332:
            case 336:
                return new p3(bVar, false, null, 6, null).h(1, obj instanceof Double ? (Double) obj : null);
            case 337:
                return new u(bVar, u.a.Avg, false, null, 12, null).i(obj instanceof Double ? (Double) obj : null);
            case 338:
            case 339:
                new p2(bVar, obj2, i14, obj2);
                return null;
            case 345:
                return new o3(bVar, false, null, 6, null).h(obj instanceof h0 ? (h0) obj : null);
            case 353:
            case 357:
                return new ns.e(bVar, obj2, i14, obj2).f127637c.getString(R.string.lbl_bar);
            case 360:
                w2 w2Var = new w2(bVar, obj2, i14, obj2);
                Double d18 = obj instanceof Double ? (Double) obj : null;
                String string11 = w2Var.f127791c.getString(c22.m3.MILLIMETER.f23164e);
                return u00.b.g(1) ? string11 : w2Var.h(string11, p005kotlin.jvm.internal.s.c(d18, 1.0d));
            case 364:
                return new m3(bVar, obj2, i14, obj2).h(obj instanceof l3 ? (l3) obj : null, 1);
            case 393:
                new z2(bVar, obj2, i14, obj2);
                return null;
            case 394:
                return new w0(bVar, false, null, 6, null).k(obj instanceof Double ? (Double) obj : null);
            case 395:
            case 396:
                o1 o1Var = new o1(bVar, o1.a.Other, null, 4, null);
                Double d19 = obj instanceof Double ? (Double) obj : null;
                int i18 = o1.b.f127718a[o1Var.f127714d.ordinal()];
                if (i18 != 1) {
                    if (i18 != 2) {
                        lc.u0.r();
                    } else if (d19 != null) {
                        return o1Var.f127713c.getString(R.string.lbl_rounds);
                    }
                }
                return null;
            case 397:
                new ns.z(bVar, obj2, i14, obj2);
                return null;
            case 398:
            case 399:
                t2 t2Var = new t2(bVar, false, null, 6, null);
                int i19 = (t2Var.f127764d ? c22.o3.BAR : c22.o3.PSI).f23186c;
                l22.b bVar25 = t2Var.f127763c;
                String string12 = bVar25.getString(i19);
                if (u00.b.g(1)) {
                    return string12;
                }
                oi0.b bVar26 = new oi0.b(bVar25, string12);
                bVar26.S();
                return bVar26.f132238b;
        }
    }

    public static final Integer i(Integer num, Integer num2) {
        if ((num == null || num.intValue() <= 0) && (num2 == null || num2.intValue() <= 0)) {
            return null;
        }
        int iIntValue = 0;
        int iIntValue2 = (num == null || num.intValue() <= 0) ? 0 : num.intValue();
        if (num2 != null && num2.intValue() > 0) {
            iIntValue = num2.intValue();
        }
        return Integer.valueOf((iIntValue * 2) + iIntValue2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1693:0x143b  */
    /* JADX WARN: Code duplicated, block: B:1695:0x1441  */
    /* JADX WARN: Code duplicated, block: B:1712:0x1490  */
    /* JADX WARN: Code duplicated, block: B:1714:0x1496  */
    /* JADX WARN: Code duplicated, block: B:1966:0x17d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:391:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:407:0x04f8  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v39 java.lang.Object, still in use, count: 2, list:
          (r1v39 java.lang.Object) from 0x14e1: PHI (r1 I:??) = (r1v37 java.lang.Object), (r1v39 java.lang.Object) binds: [B:1728:0x14e0, B:2183:0x14e1] A[DONT_GENERATE, DONT_INLINE]
          (r1v39 java.lang.Object) from 0x14cd: CHECK_CAST (ps.o1) (r1v39 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final java.lang.Object j(ls.e r24, ls.a r25) {
        /*
            Method dump skipped, instruction units count: 7296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.k.j(ls.e, ls.a):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object k(ls.e eVar, ps.q qVar) {
        to.i iVarValueOf;
        double dA0;
        Double dY;
        c22.m3 m3VarD;
        double dH0;
        Double dC;
        Integer numC0;
        Double dC0;
        eVar.getClass();
        qVar.getClass();
        switch (a.f160607a[eVar.ordinal()]) {
            case 1:
                return Double.valueOf(qVar.getAverageHR());
            case 2:
                return Double.valueOf(qVar.getAvgStress());
            case 3:
                return Double.valueOf(qVar.getMaxStress());
            case 4:
            case 5:
                return Double.valueOf(qVar.getAverageSpeed());
            case 6:
                return new ls.b(a(qVar.getSpeedDeviceDisplayMeasure()), Double.valueOf(qVar.getMaxSpeed()));
            case 7:
                return new ls.b(a(qVar.getSpeedDeviceDisplayMeasure()), Double.valueOf(qVar.getAverageSpeed()));
            case 8:
            case 9:
                return new ls.h(ar.b.g(new ar.c(qVar.getActivityTypeKey(), new ps.z1(Double.valueOf(qVar.getFactor()), Integer.valueOf(qVar.getUnitId()), qVar.getUnitKey()), Double.valueOf(qVar.getDistance()), null), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()), qVar.getAverageSpeed(), m(eVar));
            case 10:
                return qVar.getCalories();
            case 11:
                return qVar.getPackWeightCalories();
            case 12:
                return Double.valueOf(qVar.getDistance());
            case 13:
            case 14:
                if (qVar.getActiveSplitSummaryDistance() == null || Double.isNaN(qVar.getActiveSplitSummaryDistance().doubleValue())) {
                    ps.o1 o1VarJ1 = qVar.getSplitSummary();
                    dA0 = (o1VarJ1 == null || (dY = o1VarJ1.getDistance()) == null) ? qVar.getDistance() : dY.doubleValue();
                } else {
                    dA0 = qVar.getActiveSplitSummaryDistance().doubleValue();
                }
                return Double.valueOf(dA0);
            case 15:
            case 16:
            case 17:
                return Double.valueOf(qVar.getDistance());
            case 18:
                return new ls.g(ar.b.g(new ar.c(qVar.getActivityTypeKey(), new ps.z1(Double.valueOf(qVar.getFactor()), Integer.valueOf(qVar.getUnitId()), qVar.getUnitKey()), Double.valueOf(qVar.getDistance()), null), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()), qVar.getDistance());
            case 19:
                ar.c cVar = new ar.c(qVar.getActivityTypeKey(), new ps.z1(Double.valueOf(qVar.getFactor()), Integer.valueOf(qVar.getUnitId()), qVar.getUnitKey()), qVar.getPoolLength(), null);
                boolean z14 = false;
                ps.z1 z1Var = cVar.f12518b;
                if (z1Var != null && (m3VarD = z1Var.d()) != null && m3VarD.f23160a) {
                    z14 = true;
                }
                boolean zG = ar.b.g(cVar, z14);
                Double dB1 = qVar.getPoolLength();
                return new ls.g(zG, dB1 != null ? dB1.doubleValue() : -1.0d);
            case 20:
                return Double.valueOf(qVar.getMaxHR());
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return Double.valueOf(qVar.getDuration());
            case 27:
            case 28:
                return Double.valueOf(qVar.getElevationGain());
            case 29:
                ps.o1 o1VarJ2 = qVar.getSplitSummary();
                if (o1VarJ2 != null) {
                    return o1VarJ2.getElevationGain();
                }
                return null;
            case 30:
            case 31:
                return Double.valueOf(qVar.getElevationLoss());
            case 32:
            case 33:
                if (qVar.getActiveSplitSummaryElevationLoss() == null || Double.isNaN(qVar.getActiveSplitSummaryElevationLoss().doubleValue())) {
                    ps.o1 o1VarJ3 = qVar.getSplitSummary();
                    dH0 = (o1VarJ3 == null || (dC = o1VarJ3.getElevationLoss()) == null) ? qVar.getElevationLoss() : dC.doubleValue();
                } else {
                    dH0 = qVar.getActiveSplitSummaryElevationLoss().doubleValue();
                }
                return Double.valueOf(dH0);
            case 34:
            case 35:
                ps.o1 o1VarJ4 = qVar.getSplitSummary();
                if (o1VarJ4 != null) {
                    return o1VarJ4.getMaxDistance();
                }
                return null;
            case 36:
                ps.o1 o1VarJ5 = qVar.getSplitSummary();
                return Integer.valueOf((o1VarJ5 == null || (numC0 = o1VarJ5.getNoOfSplits()) == null) ? qVar.getLapCount() : numC0.intValue());
            case 37:
            case 38:
            case 39:
            case 40:
                ps.o1 o1VarJ6 = qVar.getSplitSummary();
                if (o1VarJ6 != null) {
                    return o1VarJ6.getNoOfSplits();
                }
                return null;
            case 41:
                return Double.valueOf(qVar.getActiveSplitTime());
            case 42:
                try {
                    String strM = qVar.getClimbMode();
                    if (strM == null) {
                        strM = "";
                    }
                    iVarValueOf = to.i.valueOf(strM);
                    break;
                } catch (Exception unused) {
                    iVarValueOf = null;
                }
                if (iVarValueOf != null) {
                    return new ns.a(iVarValueOf, Double.valueOf(qVar.getElevationGain()), qVar.getMaxDiffKey());
                }
                return null;
            case 43:
                return Double.valueOf(qVar.getStrokes());
            case 44:
                if (qVar.U1()) {
                    return qVar.getWorkoutTime();
                }
                return null;
            case 45:
                return Double.valueOf(qVar.getAveragePower());
            case 46:
                return Double.valueOf(qVar.getSurfingMaxSpeed());
            case 47:
            case 48:
            case 49:
            case 50:
                return Double.valueOf(qVar.getMaxSpeed());
            case 51:
            case 52:
                return Double.valueOf((qVar.getMaxSplitSpeed() == null || Double.isNaN(qVar.getMaxSplitSpeed().doubleValue())) ? qVar.getMaxSpeed() : qVar.getMaxSplitSpeed().doubleValue());
            case 53:
                ps.o1 o1VarJ7 = qVar.getSplitSummary();
                if (o1VarJ7 != null) {
                    return o1VarJ7.getMaxDistance();
                }
                return null;
            case 54:
                return Double.valueOf(qVar.getAverageRespirationRate());
            case 55:
            case 56:
                return Integer.valueOf(qVar.getFloorsClimbed());
            case 57:
                return Double.valueOf(qVar.getAverageVerticalSpeed());
            case 58:
                return qVar.getStartTimeLocal();
            case 59:
                return qVar.getLocationName();
            case 60:
                return Double.valueOf(qVar.getActivityBottomTime());
            case 61:
                return qVar.getLongestDiveDuration();
            case 62:
                return qVar.getLongestPoolApneaInterval();
            case 63:
            case 64:
                return Double.valueOf(qVar.getMaxDepth());
            case 65:
                return qVar.getDiveCount();
            case 66:
                return qVar.getDiveCount();
            case 67:
                return qVar.getTotalSurfaceInterval();
            case 68:
                return qVar.getDivingGas();
            case 69:
                return qVar.getWorkoutTime();
            case 70:
                return qVar.getTotalReps();
            case 71:
                return qVar.getTotalReps();
            case 72:
                return qVar.getAvgJumpRopeCadence();
            case 73:
                return qVar.getMaxJumpRopeCadence();
            case 74:
                return qVar.getSteps();
            case 75:
                return Integer.valueOf(qVar.getLapCount());
            case 76:
                return Double.valueOf(qVar.getAverageRunCadence());
            case 77:
                return Double.valueOf(qVar.getMaxRunCadence());
            case 78:
                return Double.valueOf(qVar.getMaxLapAvgRunCadence());
            case 79:
                return Integer.valueOf(qVar.getActiveSets());
            case 80:
                return qVar.getActiveSplitMovingTime();
            case 81:
                return qVar.getActiveSplitIdleTime();
            case 82:
                return qVar.getRestSplitTime();
            case 83:
                return Integer.valueOf(qVar.getClimbRoutes());
            case 84:
                return new y(null, qVar.getMaxDiffKey(), qVar.getClimbMode(), 1, null);
            case 85:
                return qVar.getMaxDiffKey();
            case 86:
                return Double.valueOf(qVar.getDistance());
            case 87:
                ps.o1 o1VarJ8 = qVar.getSplitSummary();
                return new h0(p005kotlin.jvm.internal.s.g(o1VarJ8 != null ? o1VarJ8.getSplitType() : null, qs.x.PACK_WEIGHT.f147220a) ? null : qVar.getPackWeight(), new ps.z1((Double) null, (Integer) null, (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null));
            case 88:
                String str = (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a;
                ps.o1 o1VarJ9 = qVar.getSplitSummary();
                if (o1VarJ9 == null || (dC0 = o1VarJ9.getMaxPackWeight()) == null) {
                    dC0 = qVar.getMaxPackWeight();
                }
                return new h0(dC0, new ps.z1((Double) null, (Integer) null, str, 3, (p005kotlin.jvm.internal.j) null));
            case 89:
                return new h0(qVar.getAvgPackWeight(), new ps.z1((Double) null, (Integer) null, (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null));
            case 90:
            case 91:
                return Double.valueOf(qVar.getAverageBikingCadenceInRevPerMinute());
            case 92:
                return qVar.getActiveSplitMovingTime();
            case 93:
                return qVar.getActiveSplitIdleTime();
            case 94:
                return qVar.getRestSplitTime();
            case 95:
                return Integer.valueOf(qVar.getTotalSets());
            case 96:
            case 97:
                return qVar.getBodyBatteryNetImpact();
            case 98:
                return qVar.getAvgSpO2();
            case 99:
                return qVar.getMaxSpO2();
            case 100:
                return qVar.getMinSpO2();
            case 101:
                return Double.valueOf(qVar.getStressChange());
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final String l(ls.e eVar, List<rf2.b> list, ah2.d dVar, boolean z14, boolean z15, boolean z16) {
        rf2.b bVarE;
        list.getClass();
        dVar.getClass();
        int i14 = a.f160607a[eVar.ordinal()];
        if (i14 == 4) {
            rf2.b bVarE2 = e(list, rf2.a.SPEED_AVG);
            if (bVarE2 != null) {
                Float f14 = bVarE2.f152460f;
                if (!p005kotlin.jvm.internal.s.e(f14, 0.0f)) {
                    return dVar.a(f14, z14);
                }
            }
        } else if (i14 == 5) {
            rf2.b bVarE3 = e(list, rf2.a.PACE_AVG);
            if (bVarE3 != null) {
                return dVar.A(bVarE3.f152460f, z14, !z14);
            }
        } else if (i14 == 9) {
            rf2.b bVarE4 = e(list, rf2.a.PACE_AVG);
            if (bVarE4 != null) {
                return dVar.n(bVarE4.f152460f);
            }
        } else if (i14 == 10) {
            rf2.b bVarE5 = e(list, rf2.a.CALORIES);
            if (bVarE5 != null) {
                return dVar.p(bVarE5.f152460f);
            }
        } else if (i14 == 44) {
            rf2.b bVarE6 = e(list, rf2.a.TIME_ACTIVE);
            if (bVarE6 != null) {
                Float f15 = bVarE6.f152460f;
                if (z15) {
                    return dVar.u(f15);
                }
                rf2.b bVarE7 = e(list, rf2.a.TIME_LAP);
                if (bVarE7 != null) {
                    Float f16 = bVarE7.f152460f;
                    if (f15 != null && !Float.isNaN(f15.floatValue()) && f16 != null && !Float.isNaN(f16.floatValue())) {
                        return dVar.u(Float.valueOf(f16.floatValue() + f15.floatValue()));
                    }
                }
            }
        } else if (i14 != 45) {
            switch (i14) {
                case 1:
                    rf2.b bVarE8 = e(list, rf2.a.HEART_RATE_AVG);
                    if (bVarE8 != null) {
                        return dVar.q(bVarE8.f152460f);
                    }
                    break;
                case 12:
                    rf2.b bVarE9 = e(list, rf2.a.DISTANCE);
                    if (bVarE9 != null) {
                        return dVar.t(bVarE9.f152460f);
                    }
                    break;
                case 15:
                    rf2.b bVarE10 = e(list, rf2.a.DISTANCE);
                    if (bVarE10 != null) {
                        return dVar.y(bVarE10.f152460f, ah2.h.b.METERS, ah2.h.a.INT, true);
                    }
                    break;
                case 22:
                    rf2.b bVarE11 = e(list, rf2.a.TIME);
                    if (bVarE11 != null) {
                        return dVar.u(bVarE11.f152460f);
                    }
                    break;
                case 27:
                    rf2.b bVarE12 = e(list, rf2.a.TOTAL_ASCENT);
                    if (bVarE12 != null && !p005kotlin.jvm.internal.s.g(bVarE12.f152461g, "--")) {
                        Float f17 = bVarE12.f152460f;
                        return dVar.j(z14, f17 != null ? Integer.valueOf((int) f17.floatValue()) : null);
                    }
                    break;
                case 41:
                    rf2.b bVarE13 = e(list, rf2.a.TIME);
                    if (bVarE13 != null) {
                        return dVar.u(bVarE13.f152460f);
                    }
                    break;
                case 55:
                    rf2.b bVarE14 = e(list, rf2.a.FLOORS_CLIMBED);
                    if (bVarE14 != null && !p005kotlin.jvm.internal.s.g(bVarE14.f152461g, "--")) {
                        return dVar.g(bVarE14.f152460f);
                    }
                    break;
                case 71:
                    if (!z16 && (bVarE = e(list, rf2.a.JUMP_ROPE_NUM_COUNT)) != null) {
                        return dVar.m(bVarE.f152460f);
                    }
                    break;
                case 74:
                    rf2.b bVarE15 = e(list, rf2.a.STEPS);
                    if (bVarE15 != null) {
                        return dVar.k(bVarE15.f152460f);
                    }
                    break;
                case 79:
                    rf2.b bVarE16 = e(list, rf2.a.WORKOUT_SET_COUNT);
                    if (bVarE16 != null) {
                        return dVar.d(bVarE16.f152460f);
                    }
                    break;
                case 216:
                    rf2.b bVarE17 = e(list, rf2.a.DISTANCE_LAP);
                    if (bVarE17 != null) {
                        return dVar.t(bVarE17.f152460f);
                    }
                    break;
                case 310:
                    rf2.b bVarE18 = e(list, rf2.a.LAPS);
                    if (bVarE18 != null) {
                        return dVar.f(bVarE18.f152460f);
                    }
                    break;
            }
        } else {
            rf2.b bVarE19 = e(list, rf2.a.POWER_AVG);
            if (bVarE19 != null && !p005kotlin.jvm.internal.s.g(bVarE19.f152461g, "--")) {
                return dVar.e(bVarE19.f152460f);
            }
        }
        return null;
    }

    public static final int m(ls.e eVar) {
        int i14 = a.f160607a[eVar.ordinal()];
        if (i14 == 8) {
            return 100;
        }
        if (i14 == 9 || i14 == 129 || i14 == 140 || i14 == 172) {
            return 500;
        }
        return (i14 == 297 || i14 == 298) ? 100 : 0;
    }

    public static final boolean n(ls.e eVar) {
        return a.f160607a[eVar.ordinal()] == 64;
    }

    public static final Double o(ps.q1 q1Var) {
        ArrayList arrayListC = p13.u.C(new Double[]{q1Var != null ? q1Var.getSeatedTime() : null, q1Var != null ? q1Var.getAeroTime() : null, q1Var != null ? q1Var.getLoweredTime() : null, q1Var != null ? q1Var.getUprightTime() : null, q1Var != null ? q1Var.getStandingTime() : null});
        if (arrayListC.isEmpty()) {
            arrayListC = null;
        }
        if (arrayListC != null) {
            return Double.valueOf(p13.h0.P0(arrayListC));
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:114:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x0150  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:131:0x0188  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019f  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:169:0x0202  */
    /* JADX WARN: Code duplicated, block: B:172:0x020a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0213  */
    /* JADX WARN: Code duplicated, block: B:177:0x021b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0224  */
    /* JADX WARN: Code duplicated, block: B:182:0x022c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0235  */
    /* JADX WARN: Code duplicated, block: B:187:0x023b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0244  */
    /* JADX WARN: Code duplicated, block: B:192:0x024c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0255  */
    /* JADX WARN: Code duplicated, block: B:197:0x025d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0266  */
    /* JADX WARN: Code duplicated, block: B:205:0x0273  */
    /* JADX WARN: Code duplicated, block: B:207:0x027c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0281 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:211:0x0283  */
    /* JADX WARN: Code duplicated, block: B:213:0x028c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0294  */
    /* JADX WARN: Code duplicated, block: B:218:0x029d  */
    /* JADX WARN: Code duplicated, block: B:221:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:223:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:226:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:228:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:239:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:242:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:245:0x0301  */
    /* JADX WARN: Code duplicated, block: B:247:0x030a  */
    /* JADX WARN: Code duplicated, block: B:248:0x030d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0315  */
    /* JADX WARN: Code duplicated, block: B:254:0x0322  */
    /* JADX WARN: Code duplicated, block: B:256:0x032b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0333  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:261:0x033c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0344  */
    /* JADX WARN: Code duplicated, block: B:266:0x034d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0350  */
    /* JADX WARN: Code duplicated, block: B:270:0x0358  */
    /* JADX WARN: Code duplicated, block: B:273:0x0361  */
    /* JADX WARN: Code duplicated, block: B:275:0x036a  */
    /* JADX WARN: Code duplicated, block: B:278:0x0372  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:280:0x037b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0383  */
    /* JADX WARN: Code duplicated, block: B:285:0x038c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Instruction removed from duplicated block: B:7:0x001c, please report this as an issue */
    public static final boolean p(ls.e eVar, Object obj) {
        ls.b bVar;
        ls.g gVar;
        ls.g gVar2;
        ps.g0 g0Var;
        ps.g0 g0Var2;
        ps.f0 f0Var;
        Double d14;
        ps.k1 k1Var;
        Double d15;
        h0 h0Var;
        Double d16;
        qs.y yVarH;
        ps.z1 z1Var;
        eVar.getClass();
        if (eVar.b()) {
            bv.b.f21239a.getClass();
            bv.b.a();
            if (com.garmin.android.apps.connectmobile.k1.f37122a.t()) {
                yVarH = null;
                yVarH = null;
                switch (a.f160607a[eVar.ordinal()]) {
                    case 1:
                    case 20:
                    case 190:
                    case 191:
                    case 193:
                    case 194:
                    case 195:
                    case 196:
                    case 197:
                    case 198:
                    case 199:
                    case 259:
                        return new ms.p().a(obj instanceof Double ? (Double) obj : null);
                    case 2:
                    case 3:
                    case 4:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 41:
                    case 44:
                    case 45:
                    case 47:
                    case 48:
                    case 49:
                    case 51:
                    case 52:
                    case 53:
                    case 57:
                    case 60:
                    case 62:
                    case 67:
                    case 69:
                    case 72:
                    case 73:
                    case 76:
                    case 77:
                    case 78:
                    case 80:
                    case 81:
                    case 82:
                    case 86:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 104:
                    case 105:
                    case 106:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 114:
                    case 118:
                    case 119:
                    case 123:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    case 137:
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    case 141:
                    case 142:
                    case 143:
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 151:
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 159:
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 163:
                    case 164:
                    case 165:
                    case 167:
                    case 168:
                    case 169:
                    case 174:
                    case 175:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 177:
                    case 178:
                    case 183:
                    case TsExtractor.TS_PACKET_SIZE /* 188 */:
                    case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                    case 192:
                    case 202:
                    case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                    case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                    case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                    case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                    case 210:
                    case 213:
                    case 214:
                    case 216:
                    case 220:
                    case 223:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                    case 239:
                    case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                    case 242:
                    case 243:
                    case 244:
                    case 247:
                    case 248:
                    case 249:
                    case 250:
                    case 255:
                    case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                    case 258:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                    case 269:
                    case 270:
                    case 271:
                    case 276:
                    case 279:
                    case 282:
                    case 283:
                    case 284:
                    case 285:
                    case 286:
                    case 287:
                    case 288:
                    case 290:
                    case 291:
                    case 294:
                    case 295:
                    case 296:
                    case 299:
                    case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                    case 303:
                    case 305:
                    case 306:
                    case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                    case 309:
                    case 318:
                    case 320:
                    case 322:
                    case 323:
                    case 325:
                    case 331:
                    case 333:
                    case 334:
                    case 335:
                    case 336:
                    case 342:
                    case 343:
                    case 376:
                    case 377:
                    case 378:
                    case 379:
                    case 380:
                    case 381:
                    case 393:
                    case 394:
                        return new a0().a(obj instanceof Double ? (Double) obj : null);
                    case 5:
                    case 115:
                    case 117:
                    case 122:
                    case 124:
                    case 130:
                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 170:
                    case 171:
                    case 173:
                        return new ms.x().a(obj instanceof Double ? (Double) obj : null);
                    case 6:
                    case 7:
                    case 367:
                        new ms.b();
                        if (obj instanceof ls.b) {
                            bVar = (ls.b) obj;
                        } else {
                            bVar = null;
                        }
                        return new a0().a(bVar != null ? bVar.getData() : null);
                    case 8:
                    case 9:
                    case 129:
                    case 140:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                    case 297:
                    case 298:
                        new ms.j0();
                        return ms.j0.b(obj instanceof ls.h ? (ls.h) obj : null);
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 43:
                    case 46:
                    case 50:
                    case 63:
                    case 64:
                    case 101:
                    case 103:
                    case 112:
                    case 113:
                    case 132:
                    case 133:
                    case 139:
                    case 153:
                    case 154:
                    case 156:
                    case 158:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 201:
                    case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                    case 208:
                    case 209:
                    case 215:
                    case 221:
                    case 238:
                    case 241:
                    case 251:
                    case 252:
                    case 254:
                    case 260:
                    case 272:
                    case 277:
                    case 280:
                    case 281:
                    case 293:
                    case 315:
                    case 337:
                    case 340:
                    case 341:
                    case 358:
                    case 359:
                    case 365:
                    case 368:
                    case 369:
                    case 370:
                    case 371:
                    case 372:
                        return new ms.r().a(obj instanceof Double ? (Double) obj : null);
                    case 18:
                        new ms.g0();
                        if (obj instanceof ls.g) {
                            gVar = (ls.g) obj;
                        } else {
                            gVar = null;
                        }
                        return new ms.r().a(gVar != null ? Double.valueOf(gVar.getData()) : null);
                    case 19:
                    case 131:
                    case 157:
                    case 253:
                        new ms.h0();
                        if (obj instanceof ls.g) {
                            gVar2 = (ls.g) obj;
                        } else {
                            gVar2 = null;
                        }
                        return new a0().a(gVar2 != null ? Double.valueOf(gVar2.getData()) : null);
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 55:
                    case 66:
                    case 70:
                    case 71:
                    case 74:
                    case 75:
                    case 83:
                    case 95:
                    case 261:
                    case 300:
                    case 302:
                    case 304:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 317:
                    case 324:
                    case 326:
                    case 327:
                    case 328:
                    case 329:
                    case 330:
                        new ms.c0();
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        return num == null && ((double) num.intValue()) >= 0.0d;
                    case 42:
                        new ms.a();
                        obj.getClass();
                        return ms.a.b((ns.a) obj);
                    case 54:
                    case 245:
                    case 246:
                    case 316:
                    case 321:
                    case 332:
                    case 352:
                    case 353:
                    case 356:
                    case 357:
                    case 360:
                    case 391:
                        return new b0().a(obj instanceof Double ? (Double) obj : null);
                    case 56:
                        return new ms.n().a(obj instanceof Integer ? (Integer) obj : null);
                    case 58:
                    case 59:
                    case 68:
                    case 85:
                    case 211:
                    case 268:
                    case 344:
                    case 350:
                    case 361:
                    case 362:
                    case 363:
                    case 366:
                    case 386:
                    case 397:
                        new ms.v();
                        return g22.n.d(obj instanceof String ? (String) obj : null);
                    case 61:
                    case 65:
                        new ms.t();
                        if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                            return true;
                        }
                        break;
                    case 79:
                        new ms.u();
                        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
                        return num2 == null && num2.intValue() > 0;
                    case 84:
                        return new ms.q().a(obj instanceof y ? (y) obj : null);
                    case 87:
                    case 88:
                    case 89:
                        return new z().a(obj instanceof h0 ? (h0) obj : null);
                    case 96:
                    case 97:
                        new ms.t();
                        if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                            return true;
                        }
                        break;
                    case 98:
                    case 99:
                    case 100:
                        return new ms.y().a(obj instanceof Double ? (Double) obj : null);
                    case 102:
                    case 107:
                        return new ms.i0().a(obj instanceof Double ? (Double) obj : null);
                    case 116:
                        return new ms.m().a(obj instanceof Double ? (Double) obj : null);
                    case 120:
                    case 121:
                    case 150:
                    case 161:
                    case 162:
                    case 166:
                    case 200:
                    case 217:
                    case 218:
                    case 256:
                    case 273:
                    case 274:
                    case 347:
                    case 348:
                    case 354:
                    case 355:
                        return new ms.y().a(obj instanceof Double ? (Double) obj : null);
                    case SyslogConstants.LOG_LOCAL7 /* 184 */:
                    case 185:
                    case 186:
                    case 187:
                        return new ms.c().a(obj instanceof y ? (y) obj : null);
                    case 212:
                        new ms.s();
                        if ((obj instanceof com.garmin.android.apps.connectmobile.activities.newmodel.v ? (com.garmin.android.apps.connectmobile.activities.newmodel.v) obj : null) != null) {
                            return true;
                        }
                        break;
                    case 219:
                    case 222:
                    case 225:
                    case 226:
                    case 275:
                    case 278:
                        new ms.g();
                        if (obj instanceof ps.g0) {
                            g0Var = (ps.g0) obj;
                        } else {
                            g0Var = null;
                        }
                        return (g0Var != null ? g0Var.f139822a : null) == null && g0Var.f139823b != null;
                    case 224:
                        ms.f fVar = new ms.f();
                        obj.getClass();
                        return fVar.a((ps.g0) obj);
                    case 267:
                        new ms.w();
                        if ((obj instanceof qs.u ? (qs.u) obj : null) != null) {
                            return true;
                        }
                        break;
                    case 289:
                    case 292:
                    case 373:
                    case 374:
                    case 375:
                        a0 a0Var = new a0();
                        if (obj instanceof ps.g0) {
                            g0Var2 = (ps.g0) obj;
                        } else {
                            g0Var2 = null;
                        }
                        return a0Var.a(g0Var2 != null ? g0Var2.f139822a : null);
                    case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                        new ms.o();
                        Double d17 = obj instanceof Double ? (Double) obj : null;
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        return !com.garmin.android.apps.connectmobile.k1.f37122a.q() && new a0().a(d17);
                    case 319:
                        new ms.k0();
                        obj.getClass();
                        if (((ps.e2) obj).f139810a != null) {
                            return true;
                        }
                        return false;
                    case 338:
                    case 339:
                        new ms.f0();
                        return ms.f0.b(obj instanceof ls.f ? (ls.f) obj : null);
                    case 345:
                    case 387:
                        return new ms.d0().a(obj instanceof h0 ? (h0) obj : null);
                    case 346:
                        new ms.d();
                        qs.c cVar = obj instanceof qs.c ? (qs.c) obj : null;
                        return cVar == null && cVar != qs.c.Default;
                    case 349:
                    case 351:
                        new ms.e();
                        if (obj instanceof ps.f0) {
                            f0Var = (ps.f0) obj;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            d14 = f0Var.f139813b;
                        } else {
                            d14 = null;
                        }
                        if (zf.b.D(d14)) {
                            if (zf.b.D(f0Var != null ? f0Var.f139812a : null)) {
                                return true;
                            }
                        }
                        return false;
                    case 364:
                        new ms.w();
                        if ((obj instanceof l3 ? (l3) obj : null) != null) {
                            return true;
                        }
                        break;
                    case 382:
                        new ms.j();
                        qs.l lVar = obj instanceof qs.l ? (qs.l) obj : null;
                        return lVar == null && lVar != qs.l.INVALID;
                    case 383:
                        new ms.k();
                        qs.m mVar = obj instanceof qs.m ? (qs.m) obj : null;
                        return mVar == null && mVar != qs.m.DISABLED;
                    case 384:
                    case 385:
                        new ms.l();
                        return ms.l.b(obj instanceof v ? (v) obj : null);
                    case 388:
                    case 389:
                    case 390:
                    case 398:
                    case 399:
                        new ms.e0();
                        if (obj instanceof ps.k1) {
                            k1Var = (ps.k1) obj;
                        } else {
                            k1Var = null;
                        }
                        if (k1Var != null) {
                            d15 = k1Var.f139897a;
                        } else {
                            d15 = null;
                        }
                        if (zf.b.D(d15)) {
                            if ((k1Var != null ? k1Var.f139898b : null) != null) {
                                return true;
                            }
                        }
                        return false;
                    case 392:
                        new ms.h();
                        if (obj instanceof h0) {
                            h0Var = (h0) obj;
                        } else {
                            h0Var = null;
                        }
                        if (h0Var != null) {
                            d16 = h0Var.f139838a;
                        } else {
                            d16 = null;
                        }
                        if (zf.b.D(d16)) {
                            if (h0Var != null && (z1Var = h0Var.f139839b) != null) {
                                yVarH = z1Var.h();
                            }
                            if (yVarH != null) {
                                return true;
                            }
                        }
                        return false;
                    case 395:
                    case 396:
                        return new a0().a(obj instanceof Double ? (Double) obj : null);
                    case 400:
                        new ms.i();
                        qs.f fVar2 = obj instanceof qs.f ? (qs.f) obj : null;
                        return (fVar2 != null || fVar2 == qs.f.NULL || fVar2 == qs.f.NONE) ? false : true;
                    default:
                        return true;
                }
            }
        } else {
            yVarH = null;
            yVarH = null;
            switch (a.f160607a[eVar.ordinal()]) {
                case 1:
                case 20:
                case 190:
                case 191:
                case 193:
                case 194:
                case 195:
                case 196:
                case 197:
                case 198:
                case 199:
                case 259:
                    return new ms.p().a(obj instanceof Double ? (Double) obj : null);
                case 2:
                case 3:
                case 4:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 41:
                case 44:
                case 45:
                case 47:
                case 48:
                case 49:
                case 51:
                case 52:
                case 53:
                case 57:
                case 60:
                case 62:
                case 67:
                case 69:
                case 72:
                case 73:
                case 76:
                case 77:
                case 78:
                case 80:
                case 81:
                case 82:
                case 86:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 104:
                case 105:
                case 106:
                case 108:
                case 109:
                case 110:
                case 111:
                case 114:
                case 118:
                case 119:
                case 123:
                case 125:
                case 126:
                case 127:
                case 128:
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                case 137:
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                case 141:
                case 142:
                case 143:
                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 151:
                case SyslogConstants.LOG_LOCAL3 /* 152 */:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 159:
                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                case 163:
                case 164:
                case 165:
                case 167:
                case 168:
                case 169:
                case 174:
                case 175:
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                case 177:
                case 178:
                case 183:
                case TsExtractor.TS_PACKET_SIZE /* 188 */:
                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                case 192:
                case 202:
                case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                case 210:
                case 213:
                case 214:
                case 216:
                case 220:
                case 223:
                case 227:
                case 228:
                case 229:
                case 230:
                case 231:
                case 232:
                case 233:
                case 234:
                case 235:
                case 236:
                case 237:
                case 239:
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                case 242:
                case 243:
                case 244:
                case 247:
                case 248:
                case 249:
                case 250:
                case 255:
                case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                case 258:
                case 262:
                case 263:
                case 264:
                case 265:
                case 266:
                case 269:
                case 270:
                case 271:
                case 276:
                case 279:
                case 282:
                case 283:
                case 284:
                case 285:
                case 286:
                case 287:
                case 288:
                case 290:
                case 291:
                case 294:
                case 295:
                case 296:
                case 299:
                case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                case 303:
                case 305:
                case 306:
                case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                case 309:
                case 318:
                case 320:
                case 322:
                case 323:
                case 325:
                case 331:
                case 333:
                case 334:
                case 335:
                case 336:
                case 342:
                case 343:
                case 376:
                case 377:
                case 378:
                case 379:
                case 380:
                case 381:
                case 393:
                case 394:
                    return new a0().a(obj instanceof Double ? (Double) obj : null);
                case 5:
                case 115:
                case 117:
                case 122:
                case 124:
                case 130:
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                case 170:
                case 171:
                case 173:
                    return new ms.x().a(obj instanceof Double ? (Double) obj : null);
                case 6:
                case 7:
                case 367:
                    new ms.b();
                    if (obj instanceof ls.b) {
                        bVar = (ls.b) obj;
                    } else {
                        bVar = null;
                    }
                    return new a0().a(bVar != null ? bVar.getData() : null);
                case 8:
                case 9:
                case 129:
                case 140:
                case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                case 297:
                case 298:
                    new ms.j0();
                    return ms.j0.b(obj instanceof ls.h ? (ls.h) obj : null);
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 43:
                case 46:
                case 50:
                case 63:
                case 64:
                case 101:
                case 103:
                case 112:
                case 113:
                case 132:
                case 133:
                case 139:
                case 153:
                case 154:
                case 156:
                case 158:
                case 179:
                case 180:
                case 181:
                case 182:
                case 201:
                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                case 208:
                case 209:
                case 215:
                case 221:
                case 238:
                case 241:
                case 251:
                case 252:
                case 254:
                case 260:
                case 272:
                case 277:
                case 280:
                case 281:
                case 293:
                case 315:
                case 337:
                case 340:
                case 341:
                case 358:
                case 359:
                case 365:
                case 368:
                case 369:
                case 370:
                case 371:
                case 372:
                    return new ms.r().a(obj instanceof Double ? (Double) obj : null);
                case 18:
                    new ms.g0();
                    if (obj instanceof ls.g) {
                        gVar = (ls.g) obj;
                    } else {
                        gVar = null;
                    }
                    return new ms.r().a(gVar != null ? Double.valueOf(gVar.getData()) : null);
                case 19:
                case 131:
                case 157:
                case 253:
                    new ms.h0();
                    if (obj instanceof ls.g) {
                        gVar2 = (ls.g) obj;
                    } else {
                        gVar2 = null;
                    }
                    return new a0().a(gVar2 != null ? Double.valueOf(gVar2.getData()) : null);
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 55:
                case 66:
                case 70:
                case 71:
                case 74:
                case 75:
                case 83:
                case 95:
                case 261:
                case 300:
                case 302:
                case 304:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 317:
                case 324:
                case 326:
                case 327:
                case 328:
                case 329:
                case 330:
                    new ms.c0();
                    if (obj instanceof Integer) {
                    }
                    if (num == null) {
                    }
                    break;
                case 42:
                    new ms.a();
                    obj.getClass();
                    return ms.a.b((ns.a) obj);
                case 54:
                case 245:
                case 246:
                case 316:
                case 321:
                case 332:
                case 352:
                case 353:
                case 356:
                case 357:
                case 360:
                case 391:
                    return new b0().a(obj instanceof Double ? (Double) obj : null);
                case 56:
                    return new ms.n().a(obj instanceof Integer ? (Integer) obj : null);
                case 58:
                case 59:
                case 68:
                case 85:
                case 211:
                case 268:
                case 344:
                case 350:
                case 361:
                case 362:
                case 363:
                case 366:
                case 386:
                case 397:
                    new ms.v();
                    return g22.n.d(obj instanceof String ? (String) obj : null);
                case 61:
                case 65:
                    new ms.t();
                    if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                        return true;
                    }
                    break;
                case 79:
                    new ms.u();
                    if (obj instanceof Integer) {
                    }
                    if (num2 == null) {
                    }
                    break;
                case 84:
                    return new ms.q().a(obj instanceof y ? (y) obj : null);
                case 87:
                case 88:
                case 89:
                    return new z().a(obj instanceof h0 ? (h0) obj : null);
                case 96:
                case 97:
                    new ms.t();
                    if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                        return true;
                    }
                    break;
                case 98:
                case 99:
                case 100:
                    return new ms.y().a(obj instanceof Double ? (Double) obj : null);
                case 102:
                case 107:
                    return new ms.i0().a(obj instanceof Double ? (Double) obj : null);
                case 116:
                    return new ms.m().a(obj instanceof Double ? (Double) obj : null);
                case 120:
                case 121:
                case 150:
                case 161:
                case 162:
                case 166:
                case 200:
                case 217:
                case 218:
                case 256:
                case 273:
                case 274:
                case 347:
                case 348:
                case 354:
                case 355:
                    return new ms.y().a(obj instanceof Double ? (Double) obj : null);
                case SyslogConstants.LOG_LOCAL7 /* 184 */:
                case 185:
                case 186:
                case 187:
                    return new ms.c().a(obj instanceof y ? (y) obj : null);
                case 212:
                    new ms.s();
                    if ((obj instanceof com.garmin.android.apps.connectmobile.activities.newmodel.v ? (com.garmin.android.apps.connectmobile.activities.newmodel.v) obj : null) != null) {
                        return true;
                    }
                    break;
                case 219:
                case 222:
                case 225:
                case 226:
                case 275:
                case 278:
                    new ms.g();
                    if (obj instanceof ps.g0) {
                        g0Var = (ps.g0) obj;
                    } else {
                        g0Var = null;
                    }
                    if ((g0Var != null ? g0Var.f139822a : null) == null) {
                    }
                    break;
                case 224:
                    ms.f fVar3 = new ms.f();
                    obj.getClass();
                    return fVar3.a((ps.g0) obj);
                case 267:
                    new ms.w();
                    if ((obj instanceof qs.u ? (qs.u) obj : null) != null) {
                        return true;
                    }
                    break;
                case 289:
                case 292:
                case 373:
                case 374:
                case 375:
                    a0 a0Var2 = new a0();
                    if (obj instanceof ps.g0) {
                        g0Var2 = (ps.g0) obj;
                    } else {
                        g0Var2 = null;
                    }
                    return a0Var2.a(g0Var2 != null ? g0Var2.f139822a : null);
                case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                    new ms.o();
                    if (obj instanceof Double) {
                    }
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (com.garmin.android.apps.connectmobile.k1.f37122a.q()) {
                    }
                case 319:
                    new ms.k0();
                    obj.getClass();
                    if (((ps.e2) obj).f139810a != null) {
                        return true;
                    }
                    return false;
                case 338:
                case 339:
                    new ms.f0();
                    return ms.f0.b(obj instanceof ls.f ? (ls.f) obj : null);
                case 345:
                case 387:
                    return new ms.d0().a(obj instanceof h0 ? (h0) obj : null);
                case 346:
                    new ms.d();
                    if (obj instanceof qs.c) {
                    }
                    if (cVar == null) {
                    }
                    break;
                case 349:
                case 351:
                    new ms.e();
                    if (obj instanceof ps.f0) {
                        f0Var = (ps.f0) obj;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var != null) {
                        d14 = f0Var.f139813b;
                    } else {
                        d14 = null;
                    }
                    if (zf.b.D(d14)) {
                        if (zf.b.D(f0Var != null ? f0Var.f139812a : null)) {
                            return true;
                        }
                    }
                    return false;
                case 364:
                    new ms.w();
                    if ((obj instanceof l3 ? (l3) obj : null) != null) {
                        return true;
                    }
                    break;
                case 382:
                    new ms.j();
                    if (obj instanceof qs.l) {
                    }
                    if (lVar == null) {
                    }
                    break;
                case 383:
                    new ms.k();
                    if (obj instanceof qs.m) {
                    }
                    if (mVar == null) {
                    }
                    break;
                case 384:
                case 385:
                    new ms.l();
                    return ms.l.b(obj instanceof v ? (v) obj : null);
                case 388:
                case 389:
                case 390:
                case 398:
                case 399:
                    new ms.e0();
                    if (obj instanceof ps.k1) {
                        k1Var = (ps.k1) obj;
                    } else {
                        k1Var = null;
                    }
                    if (k1Var != null) {
                        d15 = k1Var.f139897a;
                    } else {
                        d15 = null;
                    }
                    if (zf.b.D(d15)) {
                        if ((k1Var != null ? k1Var.f139898b : null) != null) {
                            return true;
                        }
                    }
                    return false;
                case 392:
                    new ms.h();
                    if (obj instanceof h0) {
                        h0Var = (h0) obj;
                    } else {
                        h0Var = null;
                    }
                    if (h0Var != null) {
                        d16 = h0Var.f139838a;
                    } else {
                        d16 = null;
                    }
                    if (zf.b.D(d16)) {
                        if (h0Var != null) {
                            yVarH = z1Var.h();
                        }
                        if (yVarH != null) {
                            return true;
                        }
                    }
                    return false;
                case 395:
                case 396:
                    return new a0().a(obj instanceof Double ? (Double) obj : null);
                case 400:
                    new ms.i();
                    if (obj instanceof qs.f) {
                    }
                    if (fVar2 != null) {
                    }
                    break;
                default:
                    return true;
            }
        }
        return false;
    }
}
