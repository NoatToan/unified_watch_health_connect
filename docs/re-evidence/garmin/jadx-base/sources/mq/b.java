package mq;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120144a;

        static {
            int[] iArr = new int[mq.a.values().length];
            try {
                iArr[mq.a.CUMULATIVE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mq.a.LAP_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mq.a.TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mq.a.TOTAL_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mq.a.IDLE_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mq.a.MOVING_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mq.a.RUN_MOVING_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mq.a.JUMP_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mq.a.DANCE_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mq.a.DISTANCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mq.a.LAP_DISTANCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mq.a.DISTANCE_SHORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[mq.a.SWIM_DISTANCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[mq.a.ASCENT_ELEV_GAIN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[mq.a.ELEV_GAIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[mq.a.FLYING_ELEV_GAIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[mq.a.DESCENT_ELEV_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[mq.a.ELEV_LOSS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[mq.a.FLYING_ELEV_LOSS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[mq.a.AVG_PACE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[mq.a.AVG_SPEED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[mq.a.AVG_NAUT_SOG.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[mq.a.AVG_SPEED_IN_USER_UNIT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[mq.a.AVG_SWIM_PACE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[mq.a.AVG_MOVING_SPEED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[mq.a.BEST_PACE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[mq.a.BEST_SWIM_PACE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[mq.a.MAX_SPEED.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[mq.a.MAX_NAUT_SOG.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[mq.a.MAX_NAUT_SOG_SHORT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[mq.a.MAX_SPEED_IN_USER_UNIT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[mq.a.AVG_GAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[mq.a.AVG_MOVING_PACE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[mq.a.AVG_SWIM_MOVING_PACE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[mq.a.AVG_HR.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[mq.a.AVG_HR_SHORT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[mq.a.MAX_HR.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[mq.a.MAX_HR_SHORT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[mq.a.AVG_CADENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[mq.a.AVG_RUN_CADENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[mq.a.AVG_SKI_CADENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[mq.a.AVG_TEMPO.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[mq.a.MAX_CADENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[mq.a.MAX_RUN_CADENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[mq.a.MAX_SKI_CADENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[mq.a.AVG_BIKE_CADENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[mq.a.AVG_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[mq.a.MAX_BIKE_CADENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[mq.a.MAX_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[mq.a.SEATED_TIME.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[mq.a.STANDING_TIME.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[mq.a.ATA.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[mq.a.AATA.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[mq.a.ALTA.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[mq.a.AUTA.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[mq.a.ASTA.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[mq.a.AT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[mq.a.LT.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[mq.a.UT.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[mq.a.AAP.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[mq.a.MAP.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[mq.a.ALP.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[mq.a.MLP.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[mq.a.AUP.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[mq.a.MUP.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[mq.a.AVG_BIKE_FORCE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[mq.a.MAX_BIKE_FORCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[mq.a.NORMALIZED_FORCE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[mq.a.NORMALIZED_POWER.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[mq.a.LR_BALANCE.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[mq.a.LR_TORQUE_EFFECTIVENESS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[mq.a.LR_PEDAL_SMOOTHNESS.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[mq.a.AVG_POWER.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[mq.a.MAX_POWER.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[mq.a.WEIGHT_AVG_POWER.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[mq.a.WEIGHT_MAX_POWER.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[mq.a.AVG_SEATED_POWER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[mq.a.MAX_SEATED_POWER.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[mq.a.AVG_STANDING_POWER.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[mq.a.MAX_STANDING_POWER.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[mq.a.AVG_STEP_SPEED_LOSS.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[mq.a.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[mq.a.AVG_STRIDE_LENGTH.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[mq.a.TOTAL_STROKES.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[mq.a.MIN_TEMPERATURE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[mq.a.MAX_TEMPERATURE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[mq.a.AVG_TEMPERATURE.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[mq.a.CALORIES.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[mq.a.AVG_STROKE_RATE.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[mq.a.MAX_STROKE_RATE.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[mq.a.AVG_NAUTICAL_STROKE_RATE.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[mq.a.MAX_NAUTICAL_STROKE_RATE.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[mq.a.FLOW.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[mq.a.GRIT.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[mq.a.JUMP_COUNT.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[mq.a.AVG_GCT.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[mq.a.AVG_GCT_BAL.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[mq.a.AVG_VERT_OSC.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[mq.a.AVG_VERT_OSC_RATIO.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[mq.a.AVG_VERTICAL_SPEED.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[mq.a.FLOOR_SPEED.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[mq.a.AVG_SWIM_CADENCE.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[mq.a.MAX_SWIM_CADENCE.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[mq.a.AVG_SWOLF.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[mq.a.BEST_SWOLF.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[mq.a.SWIM_STROKE.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[mq.a.DRILL_TYPE.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[mq.a.MIN_STROKES.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[mq.a.AVG_STROKES.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[mq.a.LENGTHS.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[mq.a.AVG_DISTANCE_STROKE.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[mq.a.FLOORS.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[mq.a.BOTTOM_TIME.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[mq.a.MAX_DEPTH.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[mq.a.SURFACE_INTERVAL.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[mq.a.MIN_WATER_TEMP.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[mq.a.DIFFICULTY.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[mq.a.FALLS.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[mq.a.STATUS.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[mq.a.REPS.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[mq.a.JUMP_ROPE_SPEED.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[mq.a.AVG_WHEELCHAIR_CADENCE.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[mq.a.MAX_WHEELCHAIR_CADENCE.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[mq.a.SURFACE_TYPE_UNPAVED_PERCENTAGE.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[mq.a.SURFACE_TYPE_PAVED_PERCENTAGE.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[mq.a.ENTRY_LOCATION.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            f120144a = iArr;
        }
    }

    public static final ls.e a(mq.a aVar) {
        aVar.getClass();
        switch (a.f120144a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return ls.e.TOTAL_TIME;
            case 5:
                return ls.e.IDLE_TIME;
            case 6:
                return ls.e.MOVING_TIME;
            case 7:
                return ls.e.CYCLING_RUN_MOVING_TIME;
            case 8:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            case 23:
            case 24:
            case 27:
            case 31:
            case 34:
            case 41:
            case 42:
            case 45:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            default:
                return null;
            case 9:
                return ls.e.DANCE_TIME;
            case 10:
                return ls.e.DISTANCE;
            case 11:
                return ls.e.DISTANCE;
            case 12:
                return ls.e.DISTANCE;
            case 15:
                return ls.e.TOTAL_ASCENT;
            case 18:
                return ls.e.TOTAL_DESCENT;
            case 20:
                return ls.e.AVERAGE_PACE;
            case 21:
            case 22:
                return ls.e.AVERAGE_SPEED;
            case 25:
                return ls.e.AVERAGE_MOVING_SPEED;
            case 26:
                return ls.e.BEST_PACE;
            case 28:
            case 29:
            case 30:
                return ls.e.MAX_SPEED;
            case 32:
                return ls.e.AVERAGE_GRADE_ADJUSTED_PACE;
            case 33:
                return ls.e.AVERAGE_MOVING_PACE;
            case 35:
            case 36:
                return ls.e.AVERAGE_HEART_RATE;
            case 37:
            case 38:
                return ls.e.MAX_HEART_RATE;
            case 39:
                return ls.e.AVERAGE_WALK_CADENCE;
            case 40:
                return ls.e.AVERAGE_RUN_CADENCE;
            case 43:
                return ls.e.MAX_WALK_CADENCE;
            case 44:
                return ls.e.MAX_RUN_CADENCE;
            case 46:
            case 47:
                return ls.e.AVERAGE_CYCLING_CADENCE;
            case 48:
            case 49:
                return ls.e.MAX_CYCLING_CADENCE;
            case 50:
                return ls.e.SEATED_TIME;
            case 51:
                return ls.e.STANDING_TIME;
            case 52:
                return ls.e.TA;
            case 53:
                return ls.e.ATA;
            case 54:
                return ls.e.LTA;
            case 55:
                return ls.e.UTA;
            case 56:
                return ls.e.STA;
            case 57:
                return ls.e.AT;
            case 58:
                return ls.e.LT;
            case 59:
                return ls.e.UT;
            case 60:
                return ls.e.AAP;
            case 61:
                return ls.e.AMP;
            case 62:
                return ls.e.LAP;
            case 63:
                return ls.e.LMP;
            case 64:
                return ls.e.UAP;
            case 65:
                return ls.e.UMP;
            case 66:
                return ls.e.AVERAGE_BIKE_FORCE;
            case 67:
                return ls.e.MAX_BIKE_FORCE;
            case 68:
                return ls.e.NORMALIZED_FORCE;
            case 69:
                return ls.e.NORMALIZED_POWER;
            case 70:
                return ls.e.LEFT_RIGHT_BALANCE;
            case 71:
                return ls.e.LEFT_RIGHT_TORQUE_EFFECTIVENESS;
            case 72:
                return ls.e.LEFT_RIGHT_PEDAL_SMOOTHNESS;
            case 73:
                return ls.e.AVERAGE_POWER;
            case 74:
                return ls.e.MAX_POWER;
            case 75:
                return ls.e.AVERAGE_POWER_PER_KG;
            case 76:
                return ls.e.MAX_POWER_PER_KG;
            case 77:
                return ls.e.SEATED_AVERAGE_POWER;
            case 78:
                return ls.e.SEATED_MAX_POWER;
            case 79:
                return ls.e.STANDING_AVERAGE_POWER;
            case 80:
                return ls.e.STANDING_MAX_POWER;
            case 81:
                return ls.e.AVERAGE_STEP_SPEED_LOSS;
            case 82:
                return ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT;
            case 83:
                return ls.e.AVERAGE_STRIDE_LENGTH;
            case 84:
                return ls.e.TOTAL_SWIMMING_STROKES;
            case 85:
                return ls.e.MIN_TEMPERATURE;
            case 86:
                return ls.e.MAX_TEMPERATURE;
            case 87:
                return ls.e.AVERAGE_TEMPERATURE;
            case 88:
                return ls.e.CALORIES;
            case 89:
                return ls.e.AVERAGE_STROKE_RATE;
            case 90:
                return ls.e.MAX_STROKE_RATE;
            case 91:
                return ls.e.AVERAGE_NAUTICAL_STROKE_RATE;
            case 92:
                return ls.e.MAX_NAUTICAL_STROKE_RATE;
            case 93:
                return ls.e.FLOW;
            case 94:
                return ls.e.GRIT;
            case 95:
                return ls.e.TOTAL_JUMPS;
            case 96:
                return ls.e.AVERAGE_GROUND_CONTACT_TIME;
            case 97:
                return ls.e.AVERAGE_GROUND_CONTACT_TIME_BALANCE;
            case 98:
                return ls.e.AVERAGE_VERTICAL_OSCILLATION;
            case 99:
                return ls.e.AVERAGE_VERTICAL_RATIO;
            case 107:
                return ls.e.DRILL_TYPE;
            case 113:
                return ls.e.DIVE_BOTTOM_TIME;
            case 114:
                return ls.e.MAX_DEPTH;
            case 115:
                return ls.e.TOTAL_SURFACE_INTERVAL_TIME;
            case 116:
                return ls.e.MIN_WATER_TEMPERATURE;
        }
    }
}
