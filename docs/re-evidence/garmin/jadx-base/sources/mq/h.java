package mq;

import am.x0;
import am.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import ps.d0;
import ps.q1;

/* JADX INFO: loaded from: classes7.dex */
public class h extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<l> f120180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rs.b f120181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f120182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final to.j f120183f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120184a;

        static {
            int[] iArr = new int[mq.a.values().length];
            f120184a = iArr;
            try {
                iArr[mq.a.INTERVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120184a[mq.a.INTERVAL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120184a[mq.a.SPLIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120184a[mq.a.RUN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120184a[mq.a.SKI_RUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f120184a[mq.a.LAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f120184a[mq.a.SPLIT_TYPE_LANDSCAPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f120184a[mq.a.SPLIT_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f120184a[mq.a.TARGET_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f120184a[mq.a.TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f120184a[mq.a.TOTAL_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f120184a[mq.a.LAP_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f120184a[mq.a.CUMULATIVE_TIME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f120184a[mq.a.MOVING_TIME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f120184a[mq.a.RUN_MOVING_TIME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f120184a[mq.a.IDLE_TIME.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f120184a[mq.a.DANCE_TIME.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f120184a[mq.a.LR_BALANCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f120184a[mq.a.LR_TORQUE_EFFECTIVENESS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f120184a[mq.a.LR_PEDAL_SMOOTHNESS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f120184a[mq.a.AVG_SWOLF.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f120184a[mq.a.BEST_SWOLF.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f120184a[mq.a.SWIM_STROKE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f120184a[mq.a.DRILL_TYPE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f120184a[mq.a.TOTAL_STROKES.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f120184a[mq.a.LENGTHS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f120184a[mq.a.FLOORS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f120184a[mq.a.FLOW.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f120184a[mq.a.GRIT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f120184a[mq.a.JUMP_COUNT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f120184a[mq.a.SONG.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f120184a[mq.a.SEATED_TIME.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f120184a[mq.a.AT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f120184a[mq.a.LT.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f120184a[mq.a.UT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f120184a[mq.a.STANDING_TIME.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f120184a[mq.a.CALORIES.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f120184a[mq.a.DISTANCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f120184a[mq.a.DISTANCE_SHORT.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f120184a[mq.a.SWIM_DISTANCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f120184a[mq.a.LAP_DISTANCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f120184a[mq.a.ELEV_GAIN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f120184a[mq.a.FLYING_ELEV_GAIN.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f120184a[mq.a.ASCENT_ELEV_GAIN.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f120184a[mq.a.ELEV_LOSS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f120184a[mq.a.FLYING_ELEV_LOSS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f120184a[mq.a.DESCENT_ELEV_LOSS.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f120184a[mq.a.MAX_DEPTH.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f120184a[mq.a.AVG_SPEED.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f120184a[mq.a.AVG_NAUT_SOG.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f120184a[mq.a.AVG_VERTICAL_SPEED.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f120184a[mq.a.AVG_MOVING_SPEED.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f120184a[mq.a.MAX_SPEED.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f120184a[mq.a.MAX_NAUT_SOG.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f120184a[mq.a.MAX_NAUT_SOG_SHORT.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f120184a[mq.a.AVG_SPEED_IN_USER_UNIT.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f120184a[mq.a.MAX_SPEED_IN_USER_UNIT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f120184a[mq.a.AVG_PACE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f120184a[mq.a.AVG_GAP.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f120184a[mq.a.AVG_MOVING_PACE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f120184a[mq.a.BEST_PACE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f120184a[mq.a.AVG_SWIM_PACE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f120184a[mq.a.AVG_SWIM_MOVING_PACE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f120184a[mq.a.BEST_SWIM_PACE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f120184a[mq.a.FLOOR_SPEED.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f120184a[mq.a.AVG_HR.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f120184a[mq.a.AVG_HR_SHORT.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f120184a[mq.a.MAX_HR.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f120184a[mq.a.MAX_HR_SHORT.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f120184a[mq.a.AVG_NAUTICAL_STROKE_RATE.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f120184a[mq.a.MAX_NAUTICAL_STROKE_RATE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f120184a[mq.a.MIN_STROKES.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f120184a[mq.a.AVG_STROKE_RATE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f120184a[mq.a.MAX_STROKE_RATE.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f120184a[mq.a.AVG_RUN_CADENCE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f120184a[mq.a.MAX_RUN_CADENCE.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f120184a[mq.a.AVG_SWIM_CADENCE.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f120184a[mq.a.MAX_SWIM_CADENCE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f120184a[mq.a.AVG_CADENCE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f120184a[mq.a.MAX_CADENCE.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f120184a[mq.a.AVG_WHEELCHAIR_CADENCE.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f120184a[mq.a.MAX_WHEELCHAIR_CADENCE.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f120184a[mq.a.AVG_TEMPO.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f120184a[mq.a.AVG_SKI_CADENCE.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f120184a[mq.a.MAX_SKI_CADENCE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f120184a[mq.a.AVG_BIKE_CADENCE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f120184a[mq.a.MAX_BIKE_CADENCE.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f120184a[mq.a.AVG_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f120184a[mq.a.MAX_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                f120184a[mq.a.NORMALIZED_POWER.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f120184a[mq.a.AVG_POWER.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f120184a[mq.a.MAX_POWER.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f120184a[mq.a.AAP.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f120184a[mq.a.MAP.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f120184a[mq.a.ALP.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f120184a[mq.a.MLP.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f120184a[mq.a.AUP.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f120184a[mq.a.MUP.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f120184a[mq.a.AVG_SEATED_POWER.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f120184a[mq.a.MAX_SEATED_POWER.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f120184a[mq.a.AVG_STANDING_POWER.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f120184a[mq.a.MAX_STANDING_POWER.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f120184a[mq.a.ATA.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f120184a[mq.a.AATA.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f120184a[mq.a.ALTA.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f120184a[mq.a.AUTA.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f120184a[mq.a.ASTA.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f120184a[mq.a.AVG_STEP_SPEED_LOSS.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f120184a[mq.a.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f120184a[mq.a.AVG_STRIDE_LENGTH.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f120184a[mq.a.AVG_STROKES.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f120184a[mq.a.AVG_TEMPERATURE.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f120184a[mq.a.MIN_TEMPERATURE.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f120184a[mq.a.MAX_TEMPERATURE.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f120184a[mq.a.MIN_WATER_TEMP.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f120184a[mq.a.AVG_DISTANCE_STROKE.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f120184a[mq.a.JUMP_ROPE_SPEED.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f120184a[mq.a.AVG_BIKE_FORCE.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f120184a[mq.a.MAX_BIKE_FORCE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f120184a[mq.a.NORMALIZED_FORCE.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public h(Context context, List<l> list, List<l> list2, rs.b bVar, to.j jVar, Boolean bool) {
        super(context, list);
        this.f120180c = list2;
        this.f120181d = bVar;
        this.f120183f = jVar;
        this.f120182e = bool;
    }

    public static String f(Context context, l lVar, ar.c cVar, Boolean bool) {
        int i14;
        m3 m3Var;
        int i15;
        int i16;
        String str = cVar.f12517a;
        boolean zI = z0.I(str);
        boolean zI0 = z0.i0(str);
        boolean zJ0 = z0.j0(str);
        f12.l.a aVar = f12.l.f68084a;
        boolean z14 = am.j.z(aVar);
        boolean zG = ar.b.g(cVar, z14);
        boolean zC = f12.l.a.a().c();
        switch (a.f120184a[((mq.a) lVar).ordinal()]) {
            case 37:
                return context.getString(R.string.calories_abbreviation);
            case 38:
            case 39:
                if (zI0) {
                    i14 = m3.NAUTICAL.f23164e;
                } else if (zJ0 || z0.b(x0.I0, str)) {
                    i14 = m3.METER.f23164e;
                } else {
                    i14 = (bool != null ? bool.booleanValue() : am.j.z(aVar) ? m3.KILOMETER : m3.MILE).f23164e;
                }
                return context.getString(i14);
            case 40:
                return context.getString((zG ? m3.METER : m3.YARD).f23164e);
            case 41:
                if (zJ0) {
                    m3Var = m3.METER;
                } else {
                    m3Var = bool != null ? bool.booleanValue() : am.j.z(aVar) ? m3.KILOMETER : m3.MILE;
                }
                return context.getString(m3Var.f23164e);
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                return context.getString((z14 ? m3.METER : m3.FOOT).f23164e);
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                if (zI) {
                    i15 = q3.NAUTICAL_MILES_PER_HOUR.f23223e;
                } else {
                    i15 = ((z14 || zJ0) ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR).f23223e;
                }
                return context.getString(i15);
            case 56:
            case 57:
                return context.getString(((z14 || zJ0) ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR).f23223e);
            case 58:
            case 59:
            case 60:
            case 61:
                if (zJ0) {
                    i16 = R.string.lbl_minute_500_meters;
                } else if (zI) {
                    i16 = R.string.lbl_minute_per_nautical_mile;
                } else {
                    i16 = bool != null ? bool.booleanValue() : am.j.z(aVar) ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile;
                }
                return context.getString(i16);
            case 62:
            case 63:
            case 64:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(context.getString(R.string.lbl_minute));
                sb3.append("/100");
                sb3.append(context.getString(zG ? R.string.lbl_meter : R.string.lbl_yard));
                return sb3.toString();
            case 65:
                return context.getString(R.string.activities_floors_per_minute);
            case 66:
            case 67:
            case 68:
            case 69:
                return context.getString(R.string.lbl_bpm);
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                return context.getString(R.string.lbl_spm);
            case 84:
            case 85:
                return context.getString(R.string.common_abbrev_glides_per_minute);
            case 86:
            case 87:
            case 88:
            case 89:
                return context.getString(R.string.lbl_rpm);
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
                return context.getString(R.string.lbl_watts);
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
                return context.getString(R.string.lbl_degree_sign);
            case 108:
                return context.getString(R.string.common_abbrev_centimeters_per_second);
            case 109:
                return context.getString(R.string.percent_sign);
            case 110:
                return context.getString(m3.METER.f23164e);
            case 111:
                return "/" + context.getString(R.string.lbl_length);
            case 112:
            case 113:
            case 114:
            case 115:
                return context.getString(zC ? R.string.lbl_fahrenheit : R.string.lbl_celsius);
            case 116:
                return context.getString(ar.g.a(str).f23164e);
            case 117:
                return context.getString(R.string.lbl_reps_per_minute);
            case 118:
            case 119:
            case 120:
                return context.getString(R.string.lbl_newton_abbreviation);
            default:
                return "";
        }
    }

    @SuppressLint({"InflateParams"})
    public final LinearLayout c(List list, ArrayList arrayList, double d14) {
        l lVar;
        LinearLayout linearLayout;
        l lVar2;
        StringBuilder sb3;
        Context context = this.f120192b.get();
        o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
        String str = null;
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
        if (linearLayout2 != null) {
            List<l> list2 = this.f120180c;
            l lVar3 = list2.get(0);
            for (l lVar4 : list2) {
                int iC = lVar4.getF120187a();
                int iG = g(lVar4);
                TextView textViewA = a(R.layout.activity_stats_laps_list_data_row_item_3_0, iC, str, str);
                if (textViewA != null) {
                    textViewA.setLayoutParams(new LinearLayout.LayoutParams(iG, -2));
                }
                if (textViewA != null) {
                    if (lVar3 == mq.a.LAP) {
                        sr.b bVar = new sr.b(context);
                        int i14 = this.f120183f.f165807b;
                        StringBuilder sb4 = new StringBuilder();
                        int size = list.size();
                        List<l> list3 = this.f120191a;
                        if (i14 == size) {
                            q1 q1Var = this.f120181d.f154296b;
                            sb4.append(context.getString(R.string.lbl_total));
                            sb3 = sb4;
                            sb3.append(g.d(context, q1Var, list3, this.f120183f, o0VarG, d14, this.f120181d, bVar, Boolean.TRUE, this.f120182e));
                            lVar = lVar3;
                            lVar2 = lVar4;
                        } else {
                            sb3 = sb4;
                            ps.x0 x0Var = (ps.x0) list.get(i14);
                            sb3.append(lVar3 + StringUtils.SPACE + (i14 + 1));
                            o0 o0Var = o0VarG;
                            lVar = lVar3;
                            lVar2 = lVar4;
                            o0VarG = o0Var;
                            sb3.append(g.c(context, x0Var, list, list3, this.f120183f, o0Var, arrayList, d14, this.f120181d, bVar, Boolean.TRUE, this.f120182e));
                        }
                        textViewA.setContentDescription(sb3);
                    } else {
                        textViewA = textViewA;
                        lVar = lVar3;
                        lVar2 = lVar4;
                        linearLayout2 = linearLayout2;
                    }
                    if (n.b(lVar2.getF120187a())) {
                        textViewA.setTextAlignment(2);
                    }
                    linearLayout = linearLayout2;
                    linearLayout.addView(textViewA);
                } else {
                    lVar = lVar3;
                    linearLayout = linearLayout2;
                }
                linearLayout2 = linearLayout;
                lVar3 = lVar;
                str = null;
            }
        }
        return linearLayout2;
    }

    @SuppressLint({"InflateParams"})
    public final View d(double d14, List list, List list2) {
        LinearLayout linearLayout;
        to.j jVar;
        int i14;
        Iterator<l> it;
        l lVar;
        LinearLayout linearLayout2;
        TextView textView;
        to.j jVar2;
        h hVar = this;
        Context context = hVar.f120192b.get();
        o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
        String str = null;
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout3 = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
        if (linearLayout3 != null) {
            l lVar2 = hVar.f120180c.get(0);
            sr.b bVar = new sr.b(context);
            to.j jVar3 = hVar.f120183f;
            int i15 = jVar3.f165807b;
            Iterator<l> it3 = hVar.f120191a.iterator();
            while (it3.hasNext()) {
                l next = it3.next();
                int iC = next.getF120187a();
                int iG = hVar.g(next);
                TextView textViewA = hVar.a(R.layout.activity_stats_laps_list_data_row_item_3_0, iC, str, str);
                if (textViewA != null) {
                    textViewA.setLayoutParams(new LinearLayout.LayoutParams(iG, -2));
                }
                if (textViewA != null) {
                    if (lVar2 == mq.a.LAP) {
                        boolean z14 = next instanceof mq.a;
                        rs.b bVar2 = hVar.f120181d;
                        String string = "";
                        String strL = z14 ? bVar.l(f(context, next, bVar2.f154298d, hVar.f120182e)) : "";
                        it = it3;
                        linearLayout2 = linearLayout3;
                        if (i15 != list.size()) {
                            ps.x0 x0Var = (ps.x0) list.get(i15);
                            i14 = i15;
                            int i16 = i14 + 1;
                            if (z14) {
                                o0 o0Var = o0VarG;
                                lVar = next;
                                jVar2 = jVar3;
                                textView = textViewA;
                                o0VarG = o0Var;
                                string = g.e(context, (mq.a) next, list, x0Var, hVar.f120183f, o0Var, list2, Double.valueOf(d14));
                            } else {
                                lVar = next;
                                jVar2 = jVar3;
                                textView = textViewA;
                                if (lVar instanceof j) {
                                    string = g.f(context, (j) lVar, x0Var);
                                }
                            }
                            textView.setContentDescription(lVar2 + StringUtils.SPACE + i16 + ", " + lVar.d(context, bVar) + ", " + string + strL);
                            jVar = jVar2;
                        } else {
                            lVar = next;
                            to.j jVar4 = jVar3;
                            i14 = i15;
                            textView = textViewA;
                            q1 q1Var = bVar2.f154296b;
                            if (z14) {
                                jVar = jVar4;
                                string = g.g(context, (mq.a) lVar, q1Var, jVar.f165809d, o0VarG, jVar.f165810e, Double.valueOf(d14));
                            } else {
                                jVar = jVar4;
                                if (lVar instanceof j) {
                                    string = context.getString(R.string.lbl_none);
                                }
                            }
                            textView.setContentDescription(context.getString(R.string.lbl_total) + StringUtils.SPACE + lVar.d(context, bVar) + ", " + string + strL);
                        }
                    } else {
                        lVar = next;
                        linearLayout2 = linearLayout3;
                        jVar = jVar3;
                        i14 = i15;
                        it = it3;
                        textView = textViewA;
                    }
                    if (n.b(lVar.getF120187a())) {
                        textView.setTextAlignment(2);
                    }
                    linearLayout = linearLayout2;
                    linearLayout.addView(textView);
                } else {
                    linearLayout = linearLayout3;
                    jVar = jVar3;
                    i14 = i15;
                    it = it3;
                }
                hVar = this;
                linearLayout3 = linearLayout;
                jVar3 = jVar;
                it3 = it;
                i15 = i14;
                str = null;
            }
        }
        return linearLayout3;
    }

    @SuppressLint({"InflateParams"})
    public final LinearLayout e(List list, boolean z14) {
        int i14;
        TextView textViewA;
        int i15;
        TextView textViewA2;
        int i16;
        String strK;
        WeakReference<Context> weakReference = this.f120192b;
        Context context = weakReference.get();
        ViewGroup viewGroup = null;
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
        int iE = fb2.g.e(16, context);
        if (linearLayout == null || list.isEmpty()) {
            return linearLayout;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            int iC = lVar.getF120187a();
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_header_layout, viewGroup);
            rs.b bVar = this.f120181d;
            String strF = "";
            String strA = (z14 && bVar.f154300f) ? "" : lVar.a(context);
            if (lVar instanceof j) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA.concat("  "));
                i14 = 2;
                spannableStringBuilder.setSpan(new ImageSpan(context, 2131231978, 1), strA.length() + 1, strA.length() + 2, 33);
                int iC2 = lVar.getF120187a();
                int iG = g(lVar);
                new sr.b(weakReference.get());
                textViewA = a(R.layout.activity_stats_laps_list_header_item_3_0, iC2, spannableStringBuilder, spannableStringBuilder.toString());
                if (textViewA != null) {
                    textViewA.setLayoutParams(new LinearLayout.LayoutParams(iG, -2));
                }
                int iC3 = lVar.getF120187a();
                d0 d0Var = ((j) lVar).f120189c;
                if (d0Var != null && (strK = d0Var.getUnitLabel()) != null) {
                    strF = strK;
                }
                int iG2 = g(lVar);
                textViewA2 = a(R.layout.activity_stats_laps_units_header_item, iC3, strF, strF);
                if (textViewA2 != null) {
                    textViewA2.setLayoutParams(new LinearLayout.LayoutParams(iG2, -2));
                }
            } else {
                i14 = 2;
                boolean z15 = lVar instanceof mq.a;
                strF = z15 ? f(context, lVar, bVar.f154298d, this.f120182e) : "";
                ls.e eVarA = z15 ? b.a((mq.a) lVar) : null;
                int iC4 = lVar.getF120187a();
                int iG3 = g(lVar);
                textViewA = a(R.layout.activity_stats_laps_list_header_item_3_0, iC4, strA, eVarA != null ? new sr.b(weakReference.get()).j(eVarA) : strA.toString());
                if (textViewA != null) {
                    i15 = -2;
                    textViewA.setLayoutParams(new LinearLayout.LayoutParams(iG3, -2));
                } else {
                    i15 = -2;
                }
                int iC5 = lVar.getF120187a();
                int iG4 = g(lVar);
                textViewA2 = a(R.layout.activity_stats_laps_units_header_item, iC5, strF, strF);
                if (textViewA2 != null) {
                    textViewA2.setLayoutParams(new LinearLayout.LayoutParams(iG4, i15));
                }
            }
            if (textViewA != null) {
                if (n.b(iC)) {
                    i16 = i14;
                    textViewA.setTextAlignment(i16);
                } else {
                    i16 = i14;
                }
                linearLayout2.addView(textViewA);
            } else {
                i16 = i14;
            }
            if (textViewA2 != null) {
                if (n.b(iC)) {
                    textViewA2.setTextAlignment(i16);
                }
                linearLayout2.addView(textViewA2);
            }
            if (z14) {
                linearLayout.setPadding(iE, 0, 0, 0);
            } else {
                linearLayout.setPadding(0, 0, iE, 0);
            }
            linearLayout.addView(linearLayout2);
            viewGroup = null;
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.measure(0, 0);
        linearLayout3.addView(linearLayout);
        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(linearLayout.getMeasuredWidth(), -1));
        linearLayout3.setBackgroundColor(a7.b.getColor(context, R.color.gcm_surface_1));
        LayoutInflater.from(context).inflate(R.layout.gcm_divider_line_thin, linearLayout3);
        return linearLayout3;
    }

    public final int g(l lVar) {
        return (int) (lVar.getF120143b() * this.f120192b.get().getResources().getDimension(R.dimen.activities_laps_column_base_width));
    }
}
