package mq;

import am.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import ps.d0;
import ps.q1;
import ps.u0;
import ps.w;
import ps.x0;
import qs.p;
import qs.t;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120179a;

        static {
            int[] iArr = new int[mq.a.values().length];
            f120179a = iArr;
            try {
                iArr[mq.a.INTERVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120179a[mq.a.INTERVAL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120179a[mq.a.SPLIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120179a[mq.a.LAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120179a[mq.a.RUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f120179a[mq.a.SKI_RUN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f120179a[mq.a.DIVE_NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f120179a[mq.a.DIVE_NUMBER_LANDSCAPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f120179a[mq.a.SPLIT_TYPE_LANDSCAPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f120179a[mq.a.ROUTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f120179a[mq.a.ROUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f120179a[mq.a.SONG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f120179a[mq.a.INTERVAL_LENGTH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f120179a[mq.a.SPLIT_TYPE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f120179a[mq.a.TIME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f120179a[mq.a.TOTAL_TIME.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f120179a[mq.a.LAP_TIME.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f120179a[mq.a.CUMULATIVE_TIME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f120179a[mq.a.IDLE_TIME.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f120179a[mq.a.JUMP_TIME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f120179a[mq.a.MOVING_TIME.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f120179a[mq.a.RUN_MOVING_TIME.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f120179a[mq.a.DANCE_TIME.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f120179a[mq.a.DISTANCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f120179a[mq.a.DISTANCE_SHORT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f120179a[mq.a.SWIM_DISTANCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f120179a[mq.a.LAP_DISTANCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f120179a[mq.a.ELEV_GAIN.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f120179a[mq.a.FLYING_ELEV_GAIN.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f120179a[mq.a.ASCENT_ELEV_GAIN.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f120179a[mq.a.ELEV_LOSS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f120179a[mq.a.FLYING_ELEV_LOSS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f120179a[mq.a.DESCENT_ELEV_LOSS.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f120179a[mq.a.AVG_SPEED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f120179a[mq.a.AVG_NAUT_SOG.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f120179a[mq.a.AVG_SPEED_IN_USER_UNIT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f120179a[mq.a.AVG_VERTICAL_SPEED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f120179a[mq.a.AVG_MOVING_SPEED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f120179a[mq.a.MAX_SPEED.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f120179a[mq.a.MAX_NAUT_SOG.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f120179a[mq.a.MAX_NAUT_SOG_SHORT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f120179a[mq.a.MAX_SPEED_IN_USER_UNIT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f120179a[mq.a.AVG_PACE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f120179a[mq.a.AVG_GAP.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f120179a[mq.a.AVG_MOVING_PACE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f120179a[mq.a.BEST_PACE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f120179a[mq.a.AVG_SWIM_PACE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f120179a[mq.a.AVG_SWIM_MOVING_PACE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f120179a[mq.a.BEST_SWIM_PACE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f120179a[mq.a.FLOOR_SPEED.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f120179a[mq.a.AVG_HR.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f120179a[mq.a.AVG_HR_SHORT.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f120179a[mq.a.MAX_HR.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f120179a[mq.a.MAX_HR_SHORT.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f120179a[mq.a.AVG_RUN_CADENCE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f120179a[mq.a.AVG_SKI_CADENCE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f120179a[mq.a.AVG_CADENCE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f120179a[mq.a.AVG_TEMPO.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f120179a[mq.a.MAX_RUN_CADENCE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f120179a[mq.a.MAX_SKI_CADENCE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f120179a[mq.a.MAX_CADENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f120179a[mq.a.AVG_BIKE_CADENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f120179a[mq.a.AVG_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f120179a[mq.a.MAX_BIKE_CADENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f120179a[mq.a.MAX_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f120179a[mq.a.AVG_WHEELCHAIR_CADENCE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f120179a[mq.a.MAX_WHEELCHAIR_CADENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f120179a[mq.a.NORMALIZED_POWER.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f120179a[mq.a.LR_BALANCE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f120179a[mq.a.LR_TORQUE_EFFECTIVENESS.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f120179a[mq.a.LR_PEDAL_SMOOTHNESS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f120179a[mq.a.AVG_POWER.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f120179a[mq.a.MAX_POWER.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f120179a[mq.a.AVG_BIKE_FORCE.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f120179a[mq.a.MAX_BIKE_FORCE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f120179a[mq.a.NORMALIZED_FORCE.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f120179a[mq.a.WEIGHT_AVG_POWER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f120179a[mq.a.WEIGHT_MAX_POWER.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f120179a[mq.a.SEATED_TIME.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f120179a[mq.a.STANDING_TIME.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f120179a[mq.a.ATA.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f120179a[mq.a.AATA.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f120179a[mq.a.ALTA.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f120179a[mq.a.AUTA.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f120179a[mq.a.ASTA.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f120179a[mq.a.AT.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f120179a[mq.a.LT.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f120179a[mq.a.UT.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f120179a[mq.a.AAP.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                f120179a[mq.a.MAP.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f120179a[mq.a.ALP.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f120179a[mq.a.MLP.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f120179a[mq.a.AUP.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f120179a[mq.a.MUP.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f120179a[mq.a.AVG_SEATED_POWER.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f120179a[mq.a.MAX_SEATED_POWER.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f120179a[mq.a.AVG_STANDING_POWER.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f120179a[mq.a.MAX_STANDING_POWER.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f120179a[mq.a.AVG_STRIDE_LENGTH.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f120179a[mq.a.AVG_SWOLF.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f120179a[mq.a.BEST_SWOLF.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f120179a[mq.a.AVG_SWIM_CADENCE.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f120179a[mq.a.MAX_SWIM_CADENCE.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f120179a[mq.a.SWIM_STROKE.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f120179a[mq.a.DRILL_TYPE.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f120179a[mq.a.MIN_STROKES.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f120179a[mq.a.AVG_STROKES.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f120179a[mq.a.TOTAL_STROKES.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f120179a[mq.a.LENGTHS.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f120179a[mq.a.MIN_TEMPERATURE.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f120179a[mq.a.MIN_WATER_TEMP.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f120179a[mq.a.MAX_TEMPERATURE.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f120179a[mq.a.AVG_TEMPERATURE.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f120179a[mq.a.CALORIES.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f120179a[mq.a.AVG_STROKE_RATE.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f120179a[mq.a.AVG_NAUTICAL_STROKE_RATE.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f120179a[mq.a.MAX_NAUTICAL_STROKE_RATE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f120179a[mq.a.MAX_STROKE_RATE.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f120179a[mq.a.AVG_DISTANCE_STROKE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f120179a[mq.a.FLOORS.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                f120179a[mq.a.BOTTOM_TIME.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                f120179a[mq.a.SURFACE_INTERVAL.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                f120179a[mq.a.MAX_DEPTH.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                f120179a[mq.a.ENTRY_LOCATION.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                f120179a[mq.a.FLOW.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                f120179a[mq.a.GRIT.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                f120179a[mq.a.JUMP_COUNT.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                f120179a[mq.a.TARGET_TYPE.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                f120179a[mq.a.AVG_GCT.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                f120179a[mq.a.AVG_GCT_BAL.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                f120179a[mq.a.AVG_STEP_SPEED_LOSS.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                f120179a[mq.a.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                f120179a[mq.a.AVG_VERT_OSC.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                f120179a[mq.a.AVG_VERT_OSC_RATIO.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                f120179a[mq.a.STATUS.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                f120179a[mq.a.FALLS.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                f120179a[mq.a.DIFFICULTY.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                f120179a[mq.a.REPS.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                f120179a[mq.a.JUMP_ROPE_SPEED.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                f120179a[mq.a.SURFACE_TYPE_PAVED_PERCENTAGE.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                f120179a[mq.a.SURFACE_TYPE_UNPAVED_PERCENTAGE.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
        }
    }

    public static void a(Context context, o oVar, List list, List list2, to.j jVar, ArrayList arrayList, Double d14, Integer num) {
        String strF;
        int i14;
        int i15;
        to.j jVar2 = jVar;
        x0 x0Var = (x0) list2.get(jVar2.f165806a);
        View view2 = oVar.f120193a;
        ArrayList arrayList2 = oVar.f120194b;
        view2.setBackgroundColor(aq.a.h0(num.intValue() + 1, context));
        o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            l lVar = (l) list.get(i16);
            TextView textView = (TextView) arrayList2.get(i16);
            if (lVar instanceof mq.a) {
                strF = e(context, (mq.a) lVar, list2, x0Var, jVar2, o0VarG, arrayList, d14);
                if (x0Var != null && x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != null) {
                    if (x0Var.S0() == p.ASCENT) {
                        i14 = R.drawable.ic_arrow_up_filled;
                        i15 = R.color.gcm_polyline_activity_lap_ascent;
                    } else if (x0Var.S0() == p.DESCENT) {
                        i14 = R.drawable.ic_arrow_down_filled;
                        i15 = R.color.gcm_polyline_activity_lap_descent;
                    } else {
                        i14 = 0;
                        i15 = 0;
                    }
                    Drawable drawable = i14 > 0 ? a7.b.getDrawable(context, i14) : null;
                    if (drawable != null) {
                        drawable.mutate().setTint(a7.b.getColor(context, i15));
                    }
                    if (lVar == mq.a.SPLIT_TYPE) {
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else if (lVar == mq.a.SPLIT_TYPE_LANDSCAPE) {
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    }
                }
            } else {
                strF = lVar instanceof j ? f(context, (j) lVar, x0Var) : "";
            }
            textView.setText(strF);
            i16++;
            jVar2 = jVar;
        }
    }

    public static void b(Context context, o oVar, List<l> list, q1 q1Var, to.j jVar, Double d14, Integer num) {
        q1 q1Var2;
        Double d15;
        Context context2;
        String string;
        View view2 = oVar.f120193a;
        ArrayList arrayList = oVar.f120194b;
        view2.setBackgroundColor(aq.a.h0(num.intValue() + 1, context));
        o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
        int i14 = 0;
        while (i14 < arrayList.size()) {
            l lVar = list.get(i14);
            if (lVar instanceof mq.a) {
                Context context3 = context;
                q1Var2 = q1Var;
                d15 = d14;
                string = g(context3, (mq.a) lVar, q1Var2, jVar.f165809d, o0VarG, jVar.f165810e, d15);
                context2 = context3;
            } else {
                q1Var2 = q1Var;
                d15 = d14;
                context2 = context;
                string = lVar instanceof j ? context2.getString(R.string.no_value) : "";
            }
            ((TextView) arrayList.get(i14)).setText(string);
            i14++;
            context = context2;
            q1Var = q1Var2;
            d14 = d15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static String c(Context context, x0 x0Var, List<x0> list, List<l> list2, to.j jVar, o0 o0Var, List<String> list3, double d14, rs.b bVar, sr.b bVar2, Boolean bool, Boolean bool2) {
        String strL;
        String strF;
        StringBuilder sb3 = new StringBuilder();
        for (?? r14 = !bool.booleanValue(); r14 < list2.size(); r14++) {
            l lVar = list2.get(r14);
            if (lVar instanceof mq.a) {
                strF = e(context, (mq.a) lVar, list, x0Var, jVar, o0Var, list3, Double.valueOf(d14));
                strL = bVar2.l(h.f(context, lVar, bVar.f154298d, bool2));
            } else {
                strL = "";
                strF = lVar instanceof j ? f(context, (j) lVar, x0Var) : "";
            }
            sb3.append(", ");
            sb3.append(lVar.d(context, bVar2));
            sb3.append(", ");
            sb3.append(strF);
            sb3.append(strL);
        }
        return sb3.toString();
    }

    public static String d(Context context, q1 q1Var, List<l> list, to.j jVar, o0 o0Var, double d14, rs.b bVar, sr.b bVar2, Boolean bool, Boolean bool2) {
        String strL;
        String string;
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = !bool.booleanValue() ? 1 : 0; i14 < list.size(); i14++) {
            l lVar = list.get(i14);
            if (lVar instanceof mq.a) {
                string = g(context, (mq.a) lVar, q1Var, jVar.f165809d, o0Var, jVar.f165810e, Double.valueOf(d14));
                strL = bVar2.l(h.f(context, lVar, bVar.f154298d, bool2));
            } else {
                strL = "";
                string = lVar instanceof j ? context.getString(R.string.lbl_none) : "";
            }
            sb3.append(", ");
            sb3.append(lVar.d(context, bVar2));
            sb3.append(", ");
            sb3.append(string);
            sb3.append(strL);
        }
        return sb3.toString();
    }

    public static String e(Context context, mq.a aVar, List<x0> list, x0 x0Var, to.j jVar, o0 o0Var, List<String> list2, Double d14) {
        String strP;
        String strD0;
        t tVar;
        t tVar2;
        String strT0;
        String strB;
        String strP2;
        String strJ0;
        String strValueOf;
        String strO0;
        String str = jVar.f165810e;
        boolean zI = z0.I(str);
        boolean zI0 = z0.i0(str);
        boolean zO = z0.O(str);
        boolean zJ0 = z0.j0(str);
        am.x0 x0Var2 = am.x0.I0;
        z0.b(x0Var2, str);
        int i14 = jVar.f165807b;
        boolean z14 = jVar.f165809d;
        switch (a.f120179a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return aq.a.u(i14);
            case 13:
                int i15 = jVar.f165808c;
                aq.a aVar2 = aq.a.f11807a;
                if (i14 <= 0) {
                    return "";
                }
                String string = context.getString(R.string.string_dot_string_pattern, String.valueOf(i15), String.valueOf(i14));
                string.getClass();
                return string;
            case 14:
                return "";
            case 15:
            case 16:
                return aq.a.W(context, x0Var.getDuration());
            case 17:
                Double duration = x0Var.getDuration();
                return zO ? aq.a.Y(context, duration) : aq.a.W(context, duration);
            case 18:
                double dDoubleValue = 0.0d;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    x0 x0Var3 = list.get(i16);
                    if (x0Var3.getDuration() == null) {
                        dDoubleValue = Double.NaN;
                    } else {
                        dDoubleValue += x0Var3.getDuration().doubleValue();
                        if (!x0Var3.equals(x0Var)) {
                        }
                    }
                    return aq.a.W(context, Double.valueOf(dDoubleValue));
                }
                dDoubleValue = Double.NaN;
                return aq.a.W(context, Double.valueOf(dDoubleValue));
            case 19:
                return aq.a.W(context, Double.valueOf((x0Var.getDuration() == null ? 0.0d : x0Var.getDuration().doubleValue()) - (x0Var.getMovingDuration() == null ? 0.0d : x0Var.getMovingDuration().doubleValue())));
            case 20:
            case 21:
            case 22:
                return aq.a.W(context, x0Var.getMovingDuration());
            case 23:
                return aq.a.Z(context, x0Var.getMovingDuration());
            case 24:
            case 25:
                if (z0.b(x0Var2, str)) {
                    return aq.a.d0(context, x0Var.getDistance());
                }
                if (!zI0) {
                    if (z0.Q(str)) {
                        return aq.a.G(context, x0Var.getDistance());
                    }
                    return (z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str)) ? aq.a.r(context, x0Var.getDistance()) : aq.a.f(context, x0Var.getDistance());
                }
                Double distance = x0Var.getDistance();
                aq.a aVar3 = aq.a.f11807a;
                if (distance != null) {
                    l3.a aVar4 = l3.f23124b;
                    double dDoubleValue2 = distance.doubleValue();
                    m3 m3Var = m3.NAUTICAL;
                    DecimalFormat decimalFormat = l3.f23129g;
                    String string2 = context.getString(R.string.no_value);
                    aVar4.getClass();
                    strP = l3.a.P(context, dDoubleValue2, m3Var, decimalFormat, false, string2);
                } else {
                    strP = null;
                }
                return aq.a.A(context, strP);
            case 26:
                return aq.a.S(context, x0Var.getDistance(), z14);
            case 27:
                if (z0.b(x0Var2, str)) {
                    return aq.a.d0(context, x0Var.getDistance());
                }
                if (z0.Q(str)) {
                    return aq.a.G(context, x0Var.getDistance());
                }
                return (z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str)) ? aq.a.r(context, x0Var.getDistance()) : aq.a.f(context, x0Var.getDistance());
            case 28:
            case 29:
                Double elevationGain = x0Var.getElevationGain();
                aq.a aVar5 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.j(context, elevationGain, o0Var);
            case 30:
                Double elevationGain2 = x0Var.getElevationGain();
                aq.a aVar6 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.J(context, elevationGain2, o0Var);
            case 31:
            case 32:
                Double elevationLoss = x0Var.getElevationLoss();
                aq.a aVar7 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.j(context, elevationLoss, o0Var);
            case 33:
                Double elevationLoss2 = x0Var.getElevationLoss();
                aq.a aVar8 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.J(context, elevationLoss2, o0Var);
            case 34:
            case 35:
                Double averageSpeed = x0Var.getAverageSpeed();
                if (zI) {
                    return aq.a.z(context, averageSpeed);
                }
                return aq.a.K(context, averageSpeed, z14 || zJ0);
            case 36:
                return aq.a.K(context, x0Var.getAverageSpeed(), z14 || zJ0);
            case 37:
                return zI ? aq.a.z(context, x0Var.getAverageVerticalSpeed()) : aq.a.K(context, x0Var.getAverageVerticalSpeed(), z14);
            case 38:
                if (zI) {
                    return aq.a.z(context, x0Var.getAverageMovingSpeed());
                }
                return aq.a.K(context, x0Var.getAverageMovingSpeed(), z14 || zJ0);
            case 39:
            case 40:
            case 41:
                Double maxSpeed = x0Var.getMaxSpeed();
                if (zI) {
                    return aq.a.z(context, maxSpeed);
                }
                return aq.a.K(context, maxSpeed, z14 || zJ0);
            case 42:
                return aq.a.K(context, x0Var.getMaxSpeed(), z14 || zJ0);
            case 43:
                if (zJ0) {
                    return aq.a.H(context, x0Var.getAverageSpeed());
                }
                return zI ? aq.a.y(context, x0Var.getAverageSpeed()) : aq.a.D(context, x0Var.getAverageSpeed(), z14);
            case 44:
                return aq.a.D(context, x0Var.getAverageGradeAdjustedSpeed(), z14);
            case 45:
                if (zJ0) {
                    return aq.a.H(context, x0Var.getAverageMovingSpeed());
                }
                return zI ? aq.a.y(context, x0Var.getAverageMovingSpeed()) : aq.a.D(context, x0Var.getAverageMovingSpeed(), z14);
            case 46:
                if (zJ0) {
                    return aq.a.H(context, x0Var.getMaxSpeed());
                }
                return zI ? aq.a.y(context, x0Var.getMaxSpeed()) : aq.a.D(context, x0Var.getMaxSpeed(), z14);
            case 47:
                return z0.b(am.x0.f4317p1, str) ? aq.a.C(context, x0Var.getAverageSpeed(), z14) : aq.a.T(context, x0Var.getAverageSpeed(), z14);
            case 48:
                return z0.b(am.x0.f4317p1, str) ? aq.a.C(context, x0Var.getAverageMovingSpeed(), z14) : aq.a.T(context, x0Var.getAverageMovingSpeed(), z14);
            case 49:
                return z0.b(am.x0.f4317p1, str) ? aq.a.C(context, x0Var.getMaxSpeed(), z14) : aq.a.T(context, x0Var.getMaxSpeed(), z14);
            case 50:
                Double averageVerticalSpeed = x0Var.getAverageVerticalSpeed();
                aq.a aVar9 = aq.a.f11807a;
                if (averageVerticalSpeed != null) {
                    l3.a aVar10 = l3.f23124b;
                    double dDoubleValue3 = averageVerticalSpeed.doubleValue();
                    aVar10.getClass();
                    strD0 = l3.a.d0(l3.a.A(dDoubleValue3), context, false);
                } else {
                    strD0 = null;
                }
                return aq.a.A(context, strD0);
            case 51:
            case 52:
                return aq.a.q(context, x0Var.getAverageHR());
            case 53:
            case 54:
                return aq.a.q(context, x0Var.getMaxHR());
            case 55:
            case 56:
            case 57:
            case 58:
                return aq.a.I(context, x0Var.getAverageRunCadence());
            case 59:
            case 60:
            case 61:
                return aq.a.I(context, x0Var.getMaxRunCadence());
            case 62:
            case 63:
                return aq.a.c(context, x0Var.getAverageBikeCadence());
            case 64:
            case 65:
                return aq.a.c(context, x0Var.getMaxBikeCadence());
            case 66:
                return aq.a.I(context, x0Var.getAvgWheelchairCadence());
            case 67:
                return aq.a.I(context, x0Var.getMaxWheelchairCadence());
            case 68:
                return aq.a.E(context, x0Var.getNormalizedPower());
            case 69:
                return aq.a.e(context, x0Var.getLeftBalance(), x0Var.getRightBalance());
            case 70:
                return aq.a.e(context, x0Var.getLeftTorqueEffectiveness(), x0Var.getRightTorqueEffectiveness());
            case 71:
                return aq.a.e(context, x0Var.getLeftPedalSmoothness(), x0Var.getRightPedalSmoothness());
            case 72:
                return aq.a.E(context, x0Var.getAveragePower());
            case 73:
                return aq.a.E(context, x0Var.getMaxPower());
            case 74:
                return aq.a.m(context, x0Var.getAvgBikeForce());
            case 75:
                return aq.a.m(context, x0Var.getMaxBikeForce());
            case 76:
                return aq.a.m(context, x0Var.getNormalizedForce());
            case 77:
                return aq.a.F(context, x0Var.getAveragePower(), d14.doubleValue());
            case 78:
                return aq.a.F(context, x0Var.getMaxPower(), d14.doubleValue());
            case 79:
                return aq.a.W(context, x0Var.getSeatedTime());
            case 80:
                return aq.a.W(context, x0Var.getStandingTime());
            case 81:
                return aq.a.b0(context, x0Var.getAvgRiderTorsoAngle());
            case 82:
                return aq.a.b0(context, x0Var.getAvgAeroTorsoAngle());
            case 83:
                return aq.a.b0(context, x0Var.getAvgLoweredTorsoAngle());
            case 84:
                return aq.a.b0(context, x0Var.getAvgUprightTorsoAngle());
            case 85:
                return aq.a.b0(context, x0Var.getAvgStandingTorsoAngle());
            case 86:
                return aq.a.W(context, x0Var.getAeroTime());
            case 87:
                return aq.a.W(context, x0Var.getLoweredTime());
            case 88:
                return aq.a.W(context, x0Var.getUprightTime());
            case 89:
                return aq.a.E(context, x0Var.getAvgAeroPower());
            case 90:
                return aq.a.E(context, x0Var.getMaxAeroPower());
            case 91:
                return aq.a.E(context, x0Var.getAvgLoweredPower());
            case 92:
                return aq.a.E(context, x0Var.getMaxLoweredPower());
            case 93:
                return aq.a.E(context, x0Var.getAvgUprightPower());
            case 94:
                return aq.a.E(context, x0Var.getMaxUprightPower());
            case 95:
                return aq.a.E(context, x0Var.getAverageSeatedPower());
            case 96:
                return aq.a.E(context, x0Var.getMaxSeatedPower());
            case 97:
                return aq.a.E(context, x0Var.getAverageStandingPower());
            case 98:
                return aq.a.E(context, x0Var.getMaxStandingPower());
            case 99:
                return aq.a.O(context, x0Var.getStrideLength());
            case 100:
                return aq.a.U(context, x0Var.getAverageSWOLF());
            case 101:
                return aq.a.U(context, x0Var.getMinSWOLF());
            case 102:
                return aq.a.R(context, x0Var.getAverageSwimCadence());
            case 103:
                return aq.a.R(context, x0Var.getMaxSwimCadence());
            case 104:
                if (jVar.f165808c <= 0) {
                    t tVarB = ar.h.b(x0Var);
                    aq.a aVar11 = aq.a.f11807a;
                    tVarB.getClass();
                    String string3 = context.getString(tVarB.f147172b);
                    string3.getClass();
                    return aq.a.A(context, string3);
                }
                List<ps.z0> listC1 = x0Var.c1();
                if (listC1 == null || listC1.isEmpty()) {
                    tVar = t.UNKNOWN;
                } else {
                    Iterator<ps.z0> it = listC1.iterator();
                    tVar = null;
                    while (it.hasNext()) {
                        String swimStroke = it.next().getSwimStroke();
                        if (swimStroke != null) {
                            int length = swimStroke.length();
                            int iCharCount = 0;
                            while (true) {
                                if (iCharCount < length) {
                                    int iCodePointAt = swimStroke.codePointAt(iCharCount);
                                    if (Character.isWhitespace(iCodePointAt)) {
                                        iCharCount += Character.charCount(iCodePointAt);
                                    } else {
                                        tVar2 = t.UNKNOWN;
                                        for (t tVar3 : t.values()) {
                                            if (tVar3.f147171a.equals(swimStroke)) {
                                                tVar2 = tVar3;
                                            }
                                        }
                                    }
                                } else {
                                    tVar2 = t.UNKNOWN;
                                }
                            }
                        } else {
                            tVar2 = t.UNKNOWN;
                        }
                        if (tVar == null) {
                            tVar = tVar2;
                        } else if (tVar != tVar2) {
                            tVar = t.MIXED;
                        }
                    }
                    if (tVar == null) {
                        tVar = t.UNKNOWN;
                    }
                }
                aq.a aVar12 = aq.a.f11807a;
                tVar.getClass();
                String string4 = context.getString(tVar.f147172b);
                string4.getClass();
                return aq.a.A(context, string4);
            case 105:
                qs.f fVarA = ar.h.a(x0Var);
                aq.a aVar13 = aq.a.f11807a;
                fVarA.getClass();
                String string5 = context.getString(fVarA.f147069b);
                string5.getClass();
                return aq.a.A(context, string5);
            case 106:
                Double minStrokes = x0Var.getMinStrokes();
                if (minStrokes != null) {
                    aq.a aVar14 = aq.a.f11807a;
                    l3.a aVar15 = l3.f23124b;
                    double dDoubleValue4 = minStrokes.doubleValue();
                    aVar15.getClass();
                    strT0 = l3.a.T0(dDoubleValue4, context, false);
                } else {
                    strT0 = null;
                }
                return aq.a.A(context, strT0);
            case 107:
                return aq.a.P(context, x0Var.getAverageStrokes());
            case 108:
                Double totalNumberOfStrokes = x0Var.getTotalNumberOfStrokes();
                if (totalNumberOfStrokes != null) {
                    aq.a aVar16 = aq.a.f11807a;
                    l3.a aVar17 = l3.f23124b;
                    double dDoubleValue5 = totalNumberOfStrokes.doubleValue();
                    aVar17.getClass();
                    strB = l3.a.B(dDoubleValue5);
                } else {
                    strB = null;
                }
                return aq.a.A(context, strB);
            case 109:
                return aq.a.v(context, x0Var.getNumberOfActiveLengths());
            case 110:
            case 111:
                return aq.a.V(context, x0Var.getMinTemperature());
            case 112:
                return aq.a.V(context, x0Var.getMaxTemperature());
            case 113:
                return aq.a.V(context, x0Var.getAverageTemperature());
            case 114:
                return aq.a.d(context, x0Var.getCalories());
            case 115:
            case 116:
                return aq.a.b(context, x0Var.getAverageStrokeCadence());
            case 117:
            case 118:
                return aq.a.x(context, x0Var.getMaxStrokeCadence());
            case 119:
                Double averageStrokeDistance = x0Var.getAverageStrokeDistance();
                m3 m3VarA = ar.g.a(str);
                aq.a aVar18 = aq.a.f11807a;
                m3VarA.getClass();
                if (averageStrokeDistance != null) {
                    l3.a aVar19 = l3.f23124b;
                    double dDoubleValue6 = averageStrokeDistance.doubleValue();
                    DecimalFormat decimalFormat2 = l3.f23129g;
                    aVar19.getClass();
                    strP2 = l3.a.P(context, dDoubleValue6, m3VarA, decimalFormat2, false, null);
                } else {
                    strP2 = null;
                }
                return aq.a.A(context, strP2);
            case 120:
                return aq.a.k(context, x0Var.getFloorsClimbed());
            case 121:
                return aq.a.W(context, x0Var.getBottomTime());
            case 122:
                Double surfaceInterval = x0Var.getSurfaceInterval();
                aq.a aVar20 = aq.a.f11807a;
                return aq.a.X(new l22.a(context), surfaceInterval);
            case 123:
                return aq.a.i(new l22.a(context), x0Var.getMaxDepth());
            case 124:
                Double startLatitude = x0Var.getStartLatitude();
                Double startLongitude = x0Var.getStartLongitude();
                aq.a aVar21 = aq.a.f11807a;
                return aq.a.w(new l22.a(context), startLatitude, startLongitude);
            case 125:
                return aq.a.l(context, x0Var.getAverageFlow());
            case 126:
                return aq.a.p(context, x0Var.getGrit());
            case 127:
                return aq.a.t(context, x0Var.getJumpCount());
            case 128:
                int lapIndex = x0Var.getLapIndex() - 1;
                aq.a aVar22 = aq.a.f11807a;
                if (list2 != null && !list2.isEmpty() && list2.size() > lapIndex) {
                    return list2.get(lapIndex);
                }
                String string6 = context.getString(R.string.no_value);
                string6.getClass();
                return string6;
            case 129:
                return aq.a.n(context, x0Var.getGroundContactTime());
            case 130:
                Double groundContactBalanceLeft = x0Var.getGroundContactBalanceLeft();
                aq.a aVar23 = aq.a.f11807a;
                if (groundContactBalanceLeft != null) {
                    l3.a aVar24 = l3.f23124b;
                    l22.a aVar25 = new l22.a(context);
                    double dDoubleValue7 = groundContactBalanceLeft.doubleValue();
                    aVar24.getClass();
                    strJ0 = l3.a.j0(aVar25, dDoubleValue7);
                } else {
                    strJ0 = null;
                }
                return aq.a.A(context, strJ0);
            case 131:
                return aq.a.M(context, x0Var.getAverageStepSpeedLoss());
            case 132:
                return aq.a.N(context, x0Var.getAverageStepSpeedLossPercent());
            case 133:
                return aq.a.f0(context, x0Var.getVerticalOscillation());
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return aq.a.g0(context, x0Var.getAverageVerticalRatio());
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                return aq.a.A(context, x0Var.R0() == null ? null : context.getString(x0Var.R0().f147195b));
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                return aq.a.A(context, x0Var.getNumFalls() == null ? null : String.valueOf(x0Var.getNumFalls()));
            case 137:
                u0 difficulty = x0Var.getDifficulty();
                return aq.a.A(context, (x0Var.getNumFalls() == null || difficulty == null) ? null : difficulty.getValueKey());
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                Integer totalReps = x0Var.getTotalReps();
                if (totalReps != null) {
                    aq.a aVar26 = aq.a.f11807a;
                    strValueOf = String.valueOf(totalReps.intValue());
                } else {
                    strValueOf = null;
                }
                return aq.a.A(context, strValueOf);
            case 139:
                Double avgJumpRopeCadence = x0Var.getAvgJumpRopeCadence();
                if (avgJumpRopeCadence != null) {
                    aq.a aVar27 = aq.a.f11807a;
                    l3.a aVar28 = l3.f23124b;
                    double dDoubleValue8 = avgJumpRopeCadence.doubleValue();
                    aVar28.getClass();
                    strO0 = l3.a.o0(new l22.a(context), dDoubleValue8, false);
                } else {
                    strO0 = null;
                }
                return aq.a.A(context, strO0);
            case 140:
                return aq.a.Q(context, x0Var.k3());
            case 141:
                return aq.a.Q(context, x0Var.getSurfaceTypeUnpavedPercentage());
            default:
                return context.getString(R.string.no_value);
        }
    }

    public static String f(Context context, j jVar, x0 x0Var) {
        w next;
        Integer num;
        d0 d0Var = jVar.f120189c;
        if (x0Var != null) {
            String str = jVar.f120188b;
            int iIntValue = (d0Var == null || (num = d0Var.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? -1 : num.intValue();
            List<w> listN0 = x0Var.n0();
            if (!TextUtils.isEmpty(str) && iIntValue > -1 && listN0 != null) {
                Iterator<w> it = listN0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (str.equalsIgnoreCase(next.getAppID()) && next.getDeveloperFieldNumber().intValue() == iIntValue) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
            if (next != null) {
                return com.garmin.android.apps.connectmobile.activities.newmodel.m.a(d0Var != null ? d0Var.getPrecision() : 1, next.getValue());
            }
        }
        return context.getString(R.string.no_value);
    }

    public static String g(Context context, mq.a aVar, q1 q1Var, boolean z14, o0 o0Var, String str, Double d14) {
        boolean zI = z0.I(str);
        z0.i0(str);
        boolean zO = z0.O(str);
        boolean zJ0 = z0.j0(str);
        String strT0 = null;
        boolean z15 = true;
        switch (a.f120179a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 11:
            case 12:
                return context.getString(R.string.challenge_leaderboard_header_total_label);
            case 7:
            case 8:
            case 10:
            case 13:
            case 37:
            case 104:
            case 105:
            case 111:
            case 121:
            case 122:
            case 123:
            case 124:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 137:
            default:
                return context.getString(R.string.no_value);
            case 14:
            case 128:
                return "";
            case 15:
            case 16:
            case 17:
            case 18:
                Double duration = q1Var.getDuration();
                return zO ? aq.a.Y(context, duration) : aq.a.W(context, duration);
            case 19:
                return aq.a.W(context, Double.valueOf(q1Var.getDuration().doubleValue() - q1Var.getMovingDuration().doubleValue()));
            case 20:
            case 21:
            case 22:
                return aq.a.W(context, q1Var.getMovingDuration());
            case 23:
                return aq.a.Z(context, q1Var.getMovingDuration());
            case 24:
            case 25:
                am.x0 x0Var = am.x0.I0;
                if (!z0.b(x0Var, str) && !z0.b(x0Var, str)) {
                    if (z0.Q(str)) {
                        return aq.a.G(context, q1Var.getDistance());
                    }
                    return (z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str)) ? aq.a.r(context, q1Var.getDistance()) : aq.a.f(context, q1Var.getDistance());
                }
                return aq.a.d0(context, q1Var.getDistance());
            case 26:
                return aq.a.S(context, q1Var.getDistance(), z14);
            case 27:
                return aq.a.f(context, q1Var.getDistance());
            case 28:
            case 29:
                Double elevationGain = q1Var.getElevationGain();
                aq.a aVar2 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.j(context, elevationGain, o0Var);
            case 30:
                Double elevationGain2 = q1Var.getElevationGain();
                aq.a aVar3 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.J(context, elevationGain2, o0Var);
            case 31:
            case 32:
                Double elevationLoss = q1Var.getElevationLoss();
                aq.a aVar4 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.j(context, elevationLoss, o0Var);
            case 33:
                Double elevationLoss2 = q1Var.getElevationLoss();
                aq.a aVar5 = aq.a.f11807a;
                o0Var.getClass();
                return aq.a.J(context, elevationLoss2, o0Var);
            case 34:
            case 35:
                if (zI) {
                    return aq.a.z(context, q1Var.getAverageSpeed());
                }
                Double averageSpeed = q1Var.getAverageSpeed();
                if (!z14 && !zJ0) {
                    z15 = false;
                }
                return aq.a.K(context, averageSpeed, z15);
            case 36:
                Double averageSpeed2 = q1Var.getAverageSpeed();
                if (!z14 && !zJ0) {
                    z15 = false;
                }
                return aq.a.K(context, averageSpeed2, z15);
            case 38:
                if (zI) {
                    return aq.a.z(context, q1Var.getAverageMovingSpeed());
                }
                Double averageMovingSpeed = q1Var.getAverageMovingSpeed();
                if (!z14 && !zJ0) {
                    z15 = false;
                }
                return aq.a.K(context, averageMovingSpeed, z15);
            case 39:
            case 40:
            case 41:
                if (zI) {
                    return aq.a.z(context, q1Var.getMaxSpeed());
                }
                Double maxSpeed = q1Var.getMaxSpeed();
                if (!z14 && !zJ0) {
                    z15 = false;
                }
                return aq.a.K(context, maxSpeed, z15);
            case 42:
                Double maxSpeed2 = q1Var.getMaxSpeed();
                if (!z14 && !zJ0) {
                    z15 = false;
                }
                return aq.a.K(context, maxSpeed2, z15);
            case 43:
                if (zJ0) {
                    return aq.a.H(context, q1Var.getAverageSpeed());
                }
                return zI ? aq.a.y(context, q1Var.getAverageSpeed()) : aq.a.D(context, q1Var.getAverageSpeed(), z14);
            case 44:
                return aq.a.D(context, q1Var.getAverageGradeAdjustedSpeed(), z14);
            case 45:
                if (zJ0) {
                    return aq.a.H(context, q1Var.getAverageMovingSpeed());
                }
                return zI ? aq.a.y(context, q1Var.getAverageMovingSpeed()) : aq.a.D(context, q1Var.getAverageMovingSpeed(), z14);
            case 46:
                if (zJ0) {
                    return aq.a.H(context, q1Var.getMaxSpeed());
                }
                return zI ? aq.a.y(context, q1Var.getMaxSpeed()) : aq.a.D(context, q1Var.getMaxSpeed(), z14);
            case 47:
                return z0.b(am.x0.f4317p1, str) ? aq.a.C(context, q1Var.getAverageSpeed(), z14) : aq.a.T(context, q1Var.getAverageSpeed(), z14);
            case 48:
                return z0.b(am.x0.f4317p1, str) ? aq.a.C(context, q1Var.getAverageMovingSpeed(), z14) : aq.a.T(context, q1Var.getAverageMovingSpeed(), z14);
            case 49:
                return z0.b(am.x0.f4317p1, str) ? aq.a.C(context, q1Var.getMaxSpeed(), z14) : aq.a.T(context, q1Var.getMaxSpeed(), z14);
            case 50:
                double dDoubleValue = q1Var.getAverageVerticalSpeed().doubleValue();
                l3.f23124b.getClass();
                return l3.a.d0(l3.a.A(dDoubleValue), context, false);
            case 51:
            case 52:
                return aq.a.q(context, q1Var.getAverageHR());
            case 53:
            case 54:
                return aq.a.q(context, q1Var.getMaxHR());
            case 55:
            case 56:
            case 57:
            case 58:
                return aq.a.I(context, q1Var.getAverageRunCadence());
            case 59:
            case 60:
            case 61:
                return aq.a.I(context, q1Var.getMaxRunCadence());
            case 62:
            case 63:
                return aq.a.c(context, q1Var.getAverageBikeCadence());
            case 64:
            case 65:
                return aq.a.c(context, q1Var.getMaxBikeCadence());
            case 66:
                return aq.a.I(context, q1Var.getAvgWheelchairCadence());
            case 67:
                return aq.a.I(context, q1Var.getMaxWheelchairCadence());
            case 68:
                return aq.a.E(context, q1Var.getNormalizedPower());
            case 69:
                return aq.a.e(context, q1Var.getLeftBalance(), q1Var.getRightBalance());
            case 70:
                return aq.a.e(context, q1Var.getLeftTorqueEffectiveness(), q1Var.getRightTorqueEffectiveness());
            case 71:
                return aq.a.e(context, q1Var.getLeftPedalSmoothness(), q1Var.getRightPedalSmoothness());
            case 72:
                return aq.a.E(context, q1Var.getAveragePower());
            case 73:
                return aq.a.E(context, q1Var.getMaxPower());
            case 74:
                return aq.a.m(context, q1Var.getAvgBikeForce());
            case 75:
                return aq.a.m(context, q1Var.getMaxBikeForce());
            case 76:
                return aq.a.m(context, q1Var.getNormalizedForce());
            case 77:
                return aq.a.F(context, q1Var.getAveragePower(), d14.doubleValue());
            case 78:
                return aq.a.F(context, q1Var.getMaxPower(), d14.doubleValue());
            case 79:
                return aq.a.W(context, q1Var.getSeatedTime());
            case 80:
                return aq.a.W(context, q1Var.getStandingTime());
            case 81:
                return aq.a.b0(context, q1Var.getAvgRiderTorsoAngle());
            case 82:
                return aq.a.b0(context, q1Var.getAvgAeroTorsoAngle());
            case 83:
                return aq.a.b0(context, q1Var.getAvgLoweredTorsoAngle());
            case 84:
                return aq.a.b0(context, q1Var.getAvgUprightTorsoAngle());
            case 85:
                return aq.a.b0(context, q1Var.getAvgStandingTorsoAngle());
            case 86:
                return aq.a.W(context, q1Var.getAeroTime());
            case 87:
                return aq.a.W(context, q1Var.getLoweredTime());
            case 88:
                return aq.a.W(context, q1Var.getUprightTime());
            case 89:
                return aq.a.E(context, q1Var.getAvgAeroPower());
            case 90:
                return aq.a.E(context, q1Var.getMaxAeroPower());
            case 91:
                return aq.a.E(context, q1Var.getAvgLoweredPower());
            case 92:
                return aq.a.E(context, q1Var.getMaxLoweredPower());
            case 93:
                return aq.a.E(context, q1Var.getAvgUprightPower());
            case 94:
                return aq.a.E(context, q1Var.getMaxUprightPower());
            case 95:
                return aq.a.E(context, q1Var.getAverageSeatedPower());
            case 96:
                return aq.a.E(context, q1Var.getMaxSeatedPower());
            case 97:
                return aq.a.E(context, q1Var.getAverageStandingPower());
            case 98:
                return aq.a.E(context, q1Var.getMaxStandingPower());
            case 99:
                return aq.a.O(context, q1Var.getStrideLength());
            case 100:
                return aq.a.U(context, q1Var.getAverageSWOLF());
            case 101:
                return aq.a.U(context, q1Var.getMinSWOLF());
            case 102:
                return aq.a.R(context, q1Var.getAverageSwimCadence());
            case 103:
                return aq.a.R(context, q1Var.getMaxSwimCadence());
            case 106:
                Double minStrokes = q1Var.getMinStrokes();
                if (minStrokes != null) {
                    aq.a aVar6 = aq.a.f11807a;
                    l3.a aVar7 = l3.f23124b;
                    double dDoubleValue2 = minStrokes.doubleValue();
                    aVar7.getClass();
                    strT0 = l3.a.T0(dDoubleValue2, context, false);
                }
                return aq.a.A(context, strT0);
            case 107:
                return aq.a.P(context, q1Var.getAverageStrokes());
            case 108:
                Double totalNumberOfStrokes = q1Var.getTotalNumberOfStrokes();
                if (totalNumberOfStrokes != null) {
                    aq.a aVar8 = aq.a.f11807a;
                    l3.a aVar9 = l3.f23124b;
                    double dDoubleValue3 = totalNumberOfStrokes.doubleValue();
                    aVar9.getClass();
                    strT0 = l3.a.B(dDoubleValue3);
                }
                return aq.a.A(context, strT0);
            case 109:
                return aq.a.v(context, q1Var.getNumberOfActiveLengths());
            case 110:
                return aq.a.V(context, q1Var.getMinTemperature());
            case 112:
                return aq.a.V(context, q1Var.getMaxTemperature());
            case 113:
                return aq.a.V(context, q1Var.getAverageTemperature());
            case 114:
                return aq.a.d(context, q1Var.getCalories());
            case 115:
            case 116:
                return aq.a.b(context, q1Var.getAverageStrokeCadence());
            case 117:
            case 118:
                return aq.a.x(context, q1Var.getMaxStrokeCadence());
            case 119:
                Double averageStrokeDistance = q1Var.getAverageStrokeDistance();
                m3 m3VarA = ar.g.a(str);
                aq.a aVar10 = aq.a.f11807a;
                m3VarA.getClass();
                if (averageStrokeDistance != null) {
                    l3.a aVar11 = l3.f23124b;
                    double dDoubleValue4 = averageStrokeDistance.doubleValue();
                    DecimalFormat decimalFormat = l3.f23129g;
                    aVar11.getClass();
                    strT0 = l3.a.P(context, dDoubleValue4, m3VarA, decimalFormat, false, null);
                }
                return aq.a.A(context, strT0);
            case 120:
                return aq.a.k(context, q1Var.getFloorsClimbed());
            case 125:
                return aq.a.l(context, q1Var.getAverageFlow());
            case 126:
                return aq.a.p(context, q1Var.getGrit());
            case 127:
                return aq.a.t(context, q1Var.getJumpCount());
            case 129:
                return aq.a.n(context, q1Var.getGroundContactTime());
            case 130:
                l22.a aVar12 = new l22.a(context);
                double dDoubleValue5 = q1Var.getGroundContactBalanceLeft().doubleValue();
                l3.f23124b.getClass();
                return l3.a.j0(aVar12, dDoubleValue5);
            case 131:
                return aq.a.M(context, q1Var.getAvgStepSpeedLoss());
            case 132:
                return aq.a.N(context, q1Var.getAvgStepSpeedLossPercent());
            case 133:
                return aq.a.f0(context, q1Var.getVerticalOscillation());
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return aq.a.g0(context, q1Var.getAverageVerticalRatio());
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                Integer totalReps = q1Var.getTotalReps();
                if (totalReps != null) {
                    aq.a aVar13 = aq.a.f11807a;
                    strT0 = String.valueOf(totalReps.intValue());
                }
                return aq.a.A(context, strT0);
            case 139:
                Double avgJumpRopeCadence = q1Var.getAvgJumpRopeCadence();
                if (avgJumpRopeCadence != null) {
                    aq.a aVar14 = aq.a.f11807a;
                    l3.a aVar15 = l3.f23124b;
                    double dDoubleValue6 = avgJumpRopeCadence.doubleValue();
                    aVar15.getClass();
                    strT0 = l3.a.o0(new l22.a(context), dDoubleValue6, false);
                }
                return aq.a.A(context, strT0);
            case 140:
                return aq.a.Q(context, q1Var.h5());
            case 141:
                return aq.a.Q(context, q1Var.getSurfaceTypeUnpavedPercentage());
        }
    }
}
