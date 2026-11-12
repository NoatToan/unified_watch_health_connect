package sr;

import android.content.Context;
import c22.c3;
import c22.g2;
import c22.l3;
import c22.x0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import d53.w;
import java.text.DecimalFormat;
import p005kotlin.Metadata;
import ps.h1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsr/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f160541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f160542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f160543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f160544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f160545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f160546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f160547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f160548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.t f160549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f160550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.t f160551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f160552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o13.t f160553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o13.t f160554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o13.t f160555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o13.t f160556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o13.t f160557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o13.t f160558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o13.t f160559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o13.t f160560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f160561v;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f160563b;

        static {
            int[] iArr = new int[jr.k.values().length];
            try {
                iArr[jr.k.ACTIVITY_LEGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.k.BADGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.k.DIVE_BUDDY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jr.k.DIVE_EQUIPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jr.k.LOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jr.k.CLIMBS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[jr.k.SEGMENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[jr.k.DOGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[jr.k.PERSONAL_RECORDS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[jr.k.REPORTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[jr.k.E_BIKE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[jr.k.SOLAR_RIDE_TIME_GAINED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[jr.k.TIMING_GATES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[jr.k.ELECTRONIC_SHIFTING_DATA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[jr.k.WORKOUT_BENEFIT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[jr.k.PRIMARY_BENEFIT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[jr.k.CONNECT_IQ.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[jr.k.CONNECTED_APP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f160562a = iArr;
            int[] iArr2 = new int[jr.j.values().length];
            try {
                iArr2[jr.j.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[jr.j.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[jr.j.DEVICES_AND_APPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[jr.j.ALTITUDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[jr.j.ASCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[jr.j.BIKE_FORCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[jr.j.BIKE_WORKOUT_INTERVALS.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[jr.j.BODY_BATTERY.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[jr.j.BOTTOM_GAS.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[jr.j.BOTTOM_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[jr.j.CADENCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[jr.j.CYCLING_CADENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[jr.j.CALORIES.ordinal()] = 13;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[jr.j.CALORIES_HYDRATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[jr.j.CNS.ordinal()] = 15;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[jr.j.CYCLING_DYNAMICS_TIME_IN_POSITION.ordinal()] = 16;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[jr.j.CYCLING_DYNAMICS_POWER_IN_POSITION.ordinal()] = 17;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[jr.j.CYCLING_DYNAMICS_POWER_PHASE.ordinal()] = 18;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[jr.j.CYCLING_STROKES.ordinal()] = 19;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[jr.j.DANCE_METRICS.ordinal()] = 20;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[jr.j.DEPTH.ordinal()] = 21;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[jr.j.DILUENT_GAS.ordinal()] = 22;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[jr.j.DISTANCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[jr.j.DIVE_ADVANCED_DETAILS.ordinal()] = 24;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[jr.j.DIVE_ENVIRONMENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[jr.j.DIVE_LOCATION.ordinal()] = 26;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[jr.j.DIVE_LOG_SUMMARY.ordinal()] = 27;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[jr.j.DIVE_SESSION.ordinal()] = 28;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[jr.j.DIVING_CONSERVATISM.ordinal()] = 29;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[jr.j.ELEVATION.ordinal()] = 30;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[jr.j.EXPOSURE_SUIT.ordinal()] = 31;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[jr.j.FLOORS.ordinal()] = 32;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[jr.j.GAME_INFO.ordinal()] = 33;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[jr.j.HEART_RATE.ordinal()] = 34;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[jr.j.IMPACT_LOAD.ordinal()] = 35;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[jr.j.INTENSITY_MINUTES.ordinal()] = 36;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[jr.j.JUMP_ROPE_METRICS.ordinal()] = 37;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[jr.j.MOBILITY_WORKOUT_DETAILS.ordinal()] = 38;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[jr.j.MOUNTAIN_BIKE_METRICS.ordinal()] = 39;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[jr.j.N2.ordinal()] = 40;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[jr.j.NAUTICAL_SPEED.ordinal()] = 41;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[jr.j.PACE.ordinal()] = 42;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[jr.j.PACK_WEIGHT.ordinal()] = 43;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[jr.j.PILATES_WORKOUT_DETAILS.ordinal()] = 44;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr2[jr.j.PLATFORM_CENTER_OFFSET.ordinal()] = 45;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr2[jr.j.PO2.ordinal()] = 46;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr2[jr.j.POOL_SIZE.ordinal()] = 47;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr2[jr.j.POWER.ordinal()] = 48;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr2[jr.j.PULSE_OX.ordinal()] = 49;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr2[jr.j.PUSHES.ordinal()] = 50;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr2[jr.j.RACE_LOCATION.ordinal()] = 51;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr2[jr.j.RESPIRATION_RATE.ordinal()] = 52;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr2[jr.j.ROAD_SURFACE.ordinal()] = 53;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr2[jr.j.ROUTES.ordinal()] = 54;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr2[jr.j.ROWING_STROKES.ordinal()] = 55;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr2[jr.j.RUN_WORKOUT_INTERVALS.ordinal()] = 56;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr2[jr.j.RUN_WALK_DETECTION.ordinal()] = 57;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr2[jr.j.RUNNING_DYNAMICS.ordinal()] = 58;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr2[jr.j.STRESS_LEVEL.ordinal()] = 59;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr2[jr.j.SPEED.ordinal()] = 60;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr2[jr.j.STAMINA.ordinal()] = 61;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr2[jr.j.SUMMARY.ordinal()] = 62;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr2[jr.j.SURFACE_CONDITION.ordinal()] = 63;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr2[jr.j.SWIM_STROKES.ordinal()] = 64;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr2[jr.j.SWIMMING_DYNAMICS.ordinal()] = 65;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr2[jr.j.TEMPERATURE.ordinal()] = 66;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr2[jr.j.TIME.ordinal()] = 67;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr2[jr.j.TRAINING_EFFECT.ordinal()] = 68;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr2[jr.j.WALKING_DYNAMICS.ordinal()] = 69;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr2[jr.j.WATER.ordinal()] = 70;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr2[jr.j.WEIGHT.ordinal()] = 71;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr2[jr.j.WORKOUT_DETAILS.ordinal()] = 72;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr2[jr.j.HIIT_WORKOUT_DETAILS.ordinal()] = 73;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr2[jr.j.DIVE_DYNAMIC_INTERVALS.ordinal()] = 74;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr2[jr.j.DIVE_REST_INTERVALS.ordinal()] = 75;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr2[jr.j.DIVE_STATIC_INTERVALS.ordinal()] = 76;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr2[jr.j.CDTA.ordinal()] = 77;
            } catch (NoSuchFieldError unused95) {
            }
            f160563b = iArr2;
        }
    }

    public b(Context context) {
        context.getClass();
        this.f160540a = context;
        this.f160541b = new l22.a(context);
        final int i14 = 0;
        this.f160542c = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i15 = 2;
        this.f160543d = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i16 = 3;
        this.f160544e = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i17 = 4;
        this.f160545f = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i18 = 5;
        this.f160546g = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i19 = 6;
        this.f160547h = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i24 = 7;
        this.f160548i = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i25 = 8;
        this.f160549j = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i26 = 9;
        this.f160550k = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i27 = 10;
        this.f160551l = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i28 = 11;
        this.f160552m = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i29 = 12;
        this.f160553n = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i30 = 13;
        this.f160554o = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i34 = 14;
        this.f160555p = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i35 = 15;
        this.f160556q = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i36 = 16;
        this.f160557r = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i37 = 17;
        this.f160558s = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i37) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i38 = 18;
        this.f160559t = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i39 = 19;
        this.f160560u = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i39) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
        final int i44 = 1;
        this.f160561v = o13.m.b(new e23.a(this) { // from class: sr.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f160539b;

            {
                this.f160539b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        return new r(this.f160539b.f160541b);
                    case 1:
                        return new pi0.e(this.f160539b.f160540a);
                    case 2:
                        return new f(this.f160539b.f160541b);
                    case 3:
                        return new h(this.f160539b.f160541b);
                    case 4:
                        return new s(this.f160539b.f160541b);
                    case 5:
                        return new e(this.f160539b.f160541b);
                    case 6:
                        return new d(this.f160539b.f160541b);
                    case 7:
                        return new n(this.f160539b.f160541b);
                    case 8:
                        return new p(this.f160539b.f160541b);
                    case 9:
                        b bVar = this.f160539b;
                        return new m(bVar.f160541b, new pi0.e(bVar.f160540a));
                    case 10:
                        return new l(this.f160539b.f160541b);
                    case 11:
                        return new c(this.f160539b.f160541b);
                    case 12:
                        b bVar2 = this.f160539b;
                        return new u(bVar2.f160541b, new pi0.e(bVar2.f160540a));
                    case 13:
                        return new k(this.f160539b.f160541b);
                    case 14:
                        return new q(this.f160539b.f160541b);
                    case 15:
                        return new j(this.f160539b.f160541b);
                    case 16:
                        return new i(this.f160539b.f160541b);
                    case 17:
                        return new g(this.f160539b.f160540a);
                    case 18:
                        return new t(this.f160539b.f160541b);
                    default:
                        return new o(this.f160539b.f160541b);
                }
            }
        });
    }

    public static /* synthetic */ String h(b bVar, jr.k kVar, c3 c3Var, int i14) {
        if ((i14 & 2) != 0) {
            c3Var = null;
        }
        return bVar.g(kVar, c3Var, null);
    }

    public final String a(double d14, double d15, boolean z14) {
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(d14, d15, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        ie2.n.f93149a.getClass();
        com.garmin.android.library.mapsdkadapter.i.b bVarC = com.garmin.android.library.mapsdkadapter.m.c(fVar.f50283a, ((qw0.i) ie2.n.a()).b());
        if (z14 && bVarC == com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
            return "";
        }
        if (bVarC == com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
            fVar = fVar.f();
        }
        LatLng latLng = fVar.f50283a;
        DecimalFormat decimalFormat = l3.f23136n;
        String str = decimalFormat.format(latLng.latitude);
        String str2 = decimalFormat.format(latLng.longitude);
        str.getClass();
        str2.getClass();
        return this.f160541b.a(R.string.string_comma_string_pattern, str, str2);
    }

    public final c b() {
        return (c) this.f160552m.getValue();
    }

    public final String c() {
        x0.f23314a.getClass();
        g2 g2VarB = g2.b(x0.f23377da);
        l22.a aVar = this.f160541b;
        aVar.getClass();
        return dh.b.A(aVar.f109162a, g2VarB);
    }

    public final i d() {
        return (i) this.f160557r.getValue();
    }

    public final String e(String str, am.x0 x0Var, boolean z14) {
        l22.a aVar = this.f160541b;
        if (!z14 || x0Var == null) {
            return (str == null || w.J(str)) ? aVar.getString(R.string.txt_untitle) : str;
        }
        return aVar.b(x0Var.f4360c);
    }

    public final String f(jr.k kVar) {
        Integer numValueOf;
        kVar.getClass();
        switch (a.f160562a[kVar.ordinal()]) {
            case 15:
                numValueOf = Integer.valueOf(R.string.workout_benefit);
                break;
            case 16:
                numValueOf = Integer.valueOf(R.string.activities_primary_benefit);
                break;
            case 17:
                numValueOf = Integer.valueOf(R.string.lbl_connect_iq_app);
                break;
            case 18:
                numValueOf = Integer.valueOf(R.string.lbl_connected_app);
                break;
            default:
                numValueOf = null;
                break;
        }
        return o(numValueOf);
    }

    public final String g(jr.k kVar, c3 c3Var, c3 c3Var2) {
        kVar.getClass();
        int i14 = a.f160562a[kVar.ordinal()];
        String string = null;
        l22.a aVar = this.f160541b;
        switch (i14) {
            case 1:
                string = aVar.getString(R.string.edit_legs_activity_legs);
                break;
            case 2:
                string = aVar.getString(R.string.concept_badges);
                break;
            case 3:
                string = aVar.getString(R.string.activity_details_buddy);
                break;
            case 4:
                string = aVar.getString(R.string.activity_details_equipment);
                break;
            case 5:
                string = aVar.getString(R.string.lbl_location);
                break;
            case 6:
                string = aVar.getString(R.string.lbl_view_climbs);
                break;
            case 7:
                string = aVar.getString(R.string.activity_view_all_segments_label);
                break;
            case 8:
                x0.f23314a.getClass();
                g2 g2VarB = g2.b(x0.f23441h8);
                aVar.getClass();
                string = dh.b.A(aVar.f109162a, g2VarB);
                break;
            case 9:
                if (c3Var2 != null) {
                    aVar.getClass();
                    string = aVar.a(R.string.lbl_activity_type_personal_records, dh.b.A(aVar.f109162a, c3Var2));
                }
                break;
            case 10:
                if (c3Var != null) {
                    aVar.getClass();
                    string = aVar.a(R.string.lbl_activity_type_reports, dh.b.A(aVar.f109162a, c3Var));
                }
                break;
            case 11:
                string = aVar.getString(R.string.lbl_e_bike_performance);
                break;
            case 12:
                string = aVar.getString(R.string.lbl_solar_ride_time_gained);
                break;
            case 13:
                string = aVar.getString(R.string.lbl_timing_gates_title);
                break;
            case 14:
                string = aVar.getString(R.string.lbl_electronic_shifting_data);
                break;
        }
        return string == null ? "" : string;
    }

    public final String i(ls.e eVar) {
        int i14 = ss.k.a.f160607a[eVar.ordinal()];
        return n((i14 == 1 || i14 == 56 || i14 == 67 || i14 == 201 || i14 == 282 || i14 == 293 || i14 == 294) ? eVar.f114678a : eVar.f114679b);
    }

    public final String j(ls.e eVar) {
        eVar.getClass();
        l22.a aVar = this.f160541b;
        aVar.getClass();
        c3 c3Var = eVar.f114678a;
        String strA = c3Var != null ? dh.b.A(aVar.f109162a, c3Var) : null;
        if (strA == null) {
            strA = "";
        }
        oi0.b bVar = new oi0.b(aVar, strA);
        bVar.a();
        String str = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        bVar.f132238b = d53.u.v(str, bVar2.getString(R.string.common_max), bVar2.getString(R.string.lbl_maximum), false);
        bVar.E();
        bVar.f();
        String strV = d53.u.v(bVar.f132238b, bVar2.getString(R.string.lbl_estimated_abbrev), bVar2.getString(R.string.common_lbl_estimated), false);
        bVar.f132238b = strV;
        return strV;
    }

    public final String k(jr.j jVar) {
        Integer numValueOf = Integer.valueOf(R.string.lbl_workout_intervals);
        Integer numValueOf2 = Integer.valueOf(R.string.strength_training_workout_details_label);
        int[] iArr = a.f160563b;
        switch (iArr[jVar.ordinal()]) {
            case 1:
                numValueOf = Integer.valueOf(R.string.lbl_elevation_value);
                break;
            case 2:
                numValueOf = Integer.valueOf(R.string.lbl_navigate_up);
                break;
            case 3:
                numValueOf = Integer.valueOf(R.string.concept_devices);
                break;
            case 4:
                numValueOf = Integer.valueOf(R.string.activity_details_altitude);
                break;
            case 5:
                numValueOf = Integer.valueOf(R.string.activities_ascent_label);
                break;
            case 6:
                numValueOf = Integer.valueOf(R.string.lbl_force);
                break;
            case 7:
            case 56:
                break;
            case 8:
                numValueOf = Integer.valueOf(R.string.gcm_body_battery_lbl_body_battery);
                break;
            case 9:
                numValueOf = Integer.valueOf(R.string.activity_details_bottom_gas);
                break;
            case 10:
                numValueOf = Integer.valueOf(R.string.activity_details_bottom_time);
                break;
            case 11:
                numValueOf = Integer.valueOf(R.string.activity_details_cadence);
                break;
            case 12:
                numValueOf = Integer.valueOf(R.string.lbl_cadence_cap);
                break;
            case 13:
                numValueOf = Integer.valueOf(R.string.lbl_calories);
                break;
            case 14:
                numValueOf = Integer.valueOf(R.string.activity_details_nutrition_and_hydration);
                break;
            case 15:
                numValueOf = Integer.valueOf(R.string.activity_details_cns_loading);
                break;
            case 16:
                numValueOf = Integer.valueOf(R.string.lbl_cycling_dynamics_time_in_pos);
                break;
            case 17:
                numValueOf = Integer.valueOf(R.string.lbl_cycling_dynamics_power_in_pos);
                break;
            case 18:
                numValueOf = Integer.valueOf(R.string.lbl_cycling_dynamics_pp);
                break;
            case 19:
                numValueOf = Integer.valueOf(R.string.label_strokes_pedaling);
                break;
            case 20:
                numValueOf = Integer.valueOf(R.string.dance_metrics);
                break;
            case 21:
                numValueOf = Integer.valueOf(R.string.lbl_depth);
                break;
            case 22:
                numValueOf = Integer.valueOf(R.string.lbl_diluent_gas);
                break;
            case 23:
                numValueOf = Integer.valueOf(R.string.lbl_distance);
                break;
            case 24:
                numValueOf = Integer.valueOf(R.string.lbl_advanced_details);
                break;
            case 25:
                numValueOf = Integer.valueOf(R.string.lbl_environment);
                break;
            case 26:
                numValueOf = Integer.valueOf(R.string.activity_details_dive_location);
                break;
            case 27:
                numValueOf = Integer.valueOf(R.string.lbl_log_summary);
                break;
            case 28:
                numValueOf = Integer.valueOf(R.string.lbl_apnea_dive_this_session);
                break;
            case 29:
                numValueOf = Integer.valueOf(R.string.activity_details_conservatism);
                break;
            case 30:
                numValueOf = Integer.valueOf(R.string.activity_details_elevation);
                break;
            case 31:
                numValueOf = Integer.valueOf(R.string.activity_details_exposure_suit);
                break;
            case 32:
                numValueOf = Integer.valueOf(R.string.floors_title);
                break;
            case 33:
                numValueOf = Integer.valueOf(R.string.activities_game_information);
                break;
            case 34:
                numValueOf = Integer.valueOf(R.string.lbl_heart_rate_cap);
                break;
            case 35:
                numValueOf = Integer.valueOf(R.string.impact_load);
                break;
            case 36:
                numValueOf = Integer.valueOf(R.string.title_intensity_minutes);
                break;
            case 37:
                numValueOf = Integer.valueOf(R.string.lbl_jump_rope_metrics);
                break;
            case 38:
            case 44:
            case 72:
            case 73:
                numValueOf = numValueOf2;
                break;
            case 39:
                numValueOf = Integer.valueOf(R.string.mtb_details_title);
                break;
            case 40:
                numValueOf = Integer.valueOf(R.string.activity_details_n2_loading);
                break;
            case 41:
                numValueOf = Integer.valueOf(R.string.title_nautical_speed);
                break;
            case 42:
                numValueOf = Integer.valueOf(R.string.lbl_pace);
                break;
            case 43:
                numValueOf = Integer.valueOf(R.string.lbl_pack_weight);
                break;
            case 45:
                numValueOf = Integer.valueOf(R.string.lbl_cycling_dynamics_avg_pco);
                break;
            case 46:
                numValueOf = Integer.valueOf(R.string.activity_details_po2_set_points);
                break;
            case 47:
                numValueOf = Integer.valueOf(R.string.workout_pool_size);
                break;
            case 48:
                numValueOf = Integer.valueOf(R.string.activity_details_power);
                break;
            case 49:
                numValueOf = Integer.valueOf(R.string.device_settings_pulse_ox);
                break;
            case 50:
                numValueOf = Integer.valueOf(R.string.lbl_pushes);
                break;
            case 51:
                numValueOf = Integer.valueOf(R.string.lbl_race_location);
                break;
            case 52:
                numValueOf = Integer.valueOf(R.string.activities_respiration_rate);
                break;
            case 53:
                numValueOf = Integer.valueOf(R.string.road_surface);
                break;
            case 54:
                numValueOf = Integer.valueOf(R.string.lbl_routes);
                break;
            case 55:
                numValueOf = Integer.valueOf(R.string.lbl_rowing_strokes);
                break;
            case 57:
                numValueOf = Integer.valueOf(R.string.activity_details_run_walk_detection);
                break;
            case 58:
                numValueOf = Integer.valueOf(R.string.activity_details_running_dynamics_title);
                break;
            case 59:
                numValueOf = Integer.valueOf(R.string.title_stress);
                break;
            case 60:
                numValueOf = Integer.valueOf(R.string.lbl_speed);
                break;
            case 61:
                numValueOf = Integer.valueOf(R.string.lbl_stamina);
                break;
            case 62:
                numValueOf = Integer.valueOf(R.string.activity_details_summary);
                break;
            case 63:
                numValueOf = Integer.valueOf(R.string.activity_details_conditions);
                break;
            case 64:
                numValueOf = Integer.valueOf(R.string.activity_details_strokes);
                break;
            case 65:
                numValueOf = Integer.valueOf(R.string.activity_details_swimming_dynamics_title);
                break;
            case 66:
                numValueOf = Integer.valueOf(R.string.lbl_temperature_cap);
                break;
            case 67:
                numValueOf = Integer.valueOf(R.string.activity_details_timing);
                break;
            case 68:
                numValueOf = Integer.valueOf(R.string.activity_details_training_effect);
                break;
            case 69:
                numValueOf = Integer.valueOf(R.string.activity_details_running_cadence);
                break;
            case 70:
                numValueOf = Integer.valueOf(R.string.lbl_water);
                break;
            case 71:
                numValueOf = Integer.valueOf(R.string.lbl_weight);
                break;
            default:
                numValueOf = null;
                break;
        }
        int i14 = iArr[jVar.ordinal()];
        l22.a aVar = this.f160541b;
        switch (i14) {
            case 74:
                return aVar.a(R.string.lbl_x_pool_apnea_intervals, aVar.getString(h1.DYN.b()));
            case 75:
                return aVar.a(R.string.lbl_x_pool_apnea_intervals, aVar.getString(h1.REST.b()));
            case 76:
                return aVar.a(R.string.lbl_x_pool_apnea_intervals, aVar.getString(h1.STA.b()));
            case 77:
                x0.f23314a.getClass();
                g2 g2VarB = g2.b(x0.f23459i9);
                aVar.getClass();
                return dh.b.A(aVar.f109162a, g2VarB);
            default:
                return numValueOf == null ? "" : aVar.getString(numValueOf.intValue());
        }
    }

    public final String l(String str) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f160541b, str);
        String str2 = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        bVar.f132238b = d53.u.v(str2, bVar2.getString(R.string.common_abbrev_centimeters_per_second), bVar2.getString(R.string.lbl_centimeters_per_second), false);
        bVar.t();
        bVar.z();
        bVar.h();
        bVar.C();
        bVar.f132238b = d53.u.v(bVar.f132238b, bVar2.getString(R.string.lbl_spm), bVar2.getString(R.string.lbl_steps_per_minute), false);
        bVar.b();
        bVar.F();
        bVar.G();
        bVar.H();
        bVar.X();
        bVar.f132238b = d53.u.v(bVar.f132238b, bVar2.getString(R.string.lbl_newton_abbreviation), bVar2.getString(R.string.lbl_newtons), false);
        bVar.b0();
        bVar.q();
        bVar.R();
        return bVar.f132238b;
    }

    public final String m(String str, String str2) {
        if (!g22.n.d(str2)) {
            return str;
        }
        return this.f160541b.a(R.string.string_comma_string_pattern, str, str2.toString());
    }

    public final String n(c3 c3Var) {
        if (c3Var == null) {
            return "";
        }
        l22.a aVar = this.f160541b;
        aVar.getClass();
        return dh.b.A(aVar.f109162a, c3Var);
    }

    public final String o(Integer num) {
        if (num == null) {
            return "";
        }
        return this.f160541b.getString(num.intValue());
    }
}
