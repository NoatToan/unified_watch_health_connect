package lq;

import am.z0;
import android.content.Context;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import f12.l;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.o;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import ps.q1;
import ps.x0;
import to.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq/d;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f114281a = new d();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114282a;

        static {
            int[] iArr = new int[mq.a.values().length];
            try {
                iArr[mq.a.INTERVAL_SPLIT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mq.a.INTERVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mq.a.INTERVAL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mq.a.SPLIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mq.a.RUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mq.a.SKI_RUN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mq.a.LAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mq.a.SPLIT_TYPE_LANDSCAPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mq.a.SPLIT_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mq.a.INTERVAL_SPLIT_TYPE_LANDSCAPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mq.a.TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mq.a.TOTAL_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[mq.a.LAP_TIME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[mq.a.CUMULATIVE_TIME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[mq.a.IDLE_TIME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[mq.a.MOVING_TIME.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[mq.a.RUN_MOVING_TIME.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[mq.a.DISTANCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[mq.a.DISTANCE_SHORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[mq.a.LAP_DISTANCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[mq.a.ELEV_GAIN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[mq.a.ASCENT_ELEV_GAIN.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[mq.a.ELEV_LOSS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[mq.a.DESCENT_ELEV_LOSS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[mq.a.AVG_SPEED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[mq.a.AVG_NAUT_SOG.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[mq.a.AVG_VERTICAL_SPEED.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[mq.a.AVG_MOVING_SPEED.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[mq.a.MAX_SPEED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[mq.a.MAX_NAUT_SOG.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[mq.a.MAX_NAUT_SOG_SHORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[mq.a.AVG_GAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[mq.a.AVG_PACE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[mq.a.AVG_MOVING_PACE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[mq.a.BEST_PACE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[mq.a.AVG_HR.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[mq.a.AVG_HR_SHORT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[mq.a.MAX_HR_SHORT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[mq.a.MAX_HR.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[mq.a.AVG_TEMPO.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[mq.a.AVG_RUN_CADENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[mq.a.MAX_RUN_CADENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[mq.a.AVG_BIKE_CADENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[mq.a.AVG_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[mq.a.MAX_BIKE_CADENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[mq.a.MAX_BIKE_CADENCE_DEFAULT_LABEL.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[mq.a.AVG_WHEELCHAIR_CADENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[mq.a.MAX_WHEELCHAIR_CADENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[mq.a.NORMALIZED_POWER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[mq.a.LR_BALANCE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[mq.a.LR_TORQUE_EFFECTIVENESS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[mq.a.LR_PEDAL_SMOOTHNESS.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[mq.a.AVG_POWER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[mq.a.MAX_POWER.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[mq.a.AVG_BIKE_FORCE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[mq.a.MAX_BIKE_FORCE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[mq.a.NORMALIZED_FORCE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[mq.a.WEIGHT_AVG_POWER.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[mq.a.WEIGHT_MAX_POWER.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[mq.a.SEATED_TIME.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[mq.a.STANDING_TIME.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[mq.a.ATA.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[mq.a.AATA.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[mq.a.ALTA.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[mq.a.AUTA.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[mq.a.ASTA.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[mq.a.AT.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[mq.a.LT.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[mq.a.UT.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[mq.a.AAP.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[mq.a.MAP.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[mq.a.ALP.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[mq.a.MLP.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[mq.a.AUP.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[mq.a.MUP.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[mq.a.AVG_SEATED_POWER.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[mq.a.MAX_SEATED_POWER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[mq.a.AVG_STANDING_POWER.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[mq.a.MAX_STANDING_POWER.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[mq.a.AVG_STEP_SPEED_LOSS.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[mq.a.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[mq.a.AVG_STRIDE_LENGTH.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[mq.a.AVG_TEMPERATURE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[mq.a.MIN_TEMPERATURE.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[mq.a.MAX_TEMPERATURE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[mq.a.CALORIES.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[mq.a.FLOORS.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[mq.a.FLOW.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[mq.a.GRIT.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[mq.a.JUMP_COUNT.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[mq.a.TARGET_TYPE.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[mq.a.AVG_GCT.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[mq.a.AVG_GCT_BAL.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[mq.a.AVG_VERT_OSC.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[mq.a.AVG_VERT_OSC_RATIO.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[mq.a.AVG_STROKE_RATE.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[mq.a.MAX_STROKE_RATE.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[mq.a.AVG_DISTANCE_STROKE.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[mq.a.SONG.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            f114282a = iArr;
        }
    }

    private d() {
    }

    /* JADX WARN: Code duplicated, block: B:102:0x051f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0527  */
    /* JADX WARN: Code duplicated, block: B:109:0x053a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0542  */
    /* JADX WARN: Code duplicated, block: B:112:0x0553  */
    /* JADX WARN: Code duplicated, block: B:117:0x0566  */
    /* JADX WARN: Code duplicated, block: B:119:0x056e  */
    /* JADX WARN: Code duplicated, block: B:120:0x057f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0590  */
    /* JADX WARN: Code duplicated, block: B:122:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:126:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:129:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:138:0x060d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0617  */
    /* JADX WARN: Code duplicated, block: B:140:0x0628  */
    /* JADX WARN: Code duplicated, block: B:142:0x0635  */
    /* JADX WARN: Code duplicated, block: B:143:0x063a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0642  */
    /* JADX WARN: Code duplicated, block: B:148:0x0652  */
    /* JADX WARN: Code duplicated, block: B:151:0x0663  */
    /* JADX WARN: Code duplicated, block: B:153:0x066f  */
    /* JADX WARN: Code duplicated, block: B:157:0x067e A[LOOP:1: B:149:0x065f->B:157:0x067e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x068b  */
    /* JADX WARN: Code duplicated, block: B:160:0x069c  */
    /* JADX WARN: Code duplicated, block: B:161:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:163:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:165:0x06db  */
    /* JADX WARN: Code duplicated, block: B:167:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:168:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:170:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:172:0x0701  */
    /* JADX WARN: Code duplicated, block: B:195:0x0681 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x067b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:37:0x013b  */
    /* JADX WARN: Code duplicated, block: B:38:0x014b  */
    /* JADX WARN: Code duplicated, block: B:39:0x015b  */
    /* JADX WARN: Code duplicated, block: B:40:0x016b  */
    /* JADX WARN: Code duplicated, block: B:41:0x017c  */
    /* JADX WARN: Code duplicated, block: B:42:0x018d  */
    /* JADX WARN: Code duplicated, block: B:43:0x019e  */
    /* JADX WARN: Code duplicated, block: B:44:0x01af  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0204  */
    /* JADX WARN: Code duplicated, block: B:50:0x0215  */
    /* JADX WARN: Code duplicated, block: B:51:0x0226  */
    /* JADX WARN: Code duplicated, block: B:52:0x0237  */
    /* JADX WARN: Code duplicated, block: B:53:0x0248  */
    /* JADX WARN: Code duplicated, block: B:54:0x0259  */
    /* JADX WARN: Code duplicated, block: B:55:0x026a  */
    /* JADX WARN: Code duplicated, block: B:56:0x027b  */
    /* JADX WARN: Code duplicated, block: B:57:0x028c  */
    /* JADX WARN: Code duplicated, block: B:58:0x029d  */
    /* JADX WARN: Code duplicated, block: B:59:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0303  */
    /* JADX WARN: Code duplicated, block: B:65:0x0314  */
    /* JADX WARN: Code duplicated, block: B:66:0x0325  */
    /* JADX WARN: Code duplicated, block: B:67:0x0336  */
    /* JADX WARN: Code duplicated, block: B:68:0x0347  */
    /* JADX WARN: Code duplicated, block: B:69:0x0365  */
    /* JADX WARN: Code duplicated, block: B:70:0x0383  */
    /* JADX WARN: Code duplicated, block: B:71:0x0394  */
    /* JADX WARN: Code duplicated, block: B:72:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x0402  */
    /* JADX WARN: Code duplicated, block: B:78:0x0417  */
    /* JADX WARN: Code duplicated, block: B:79:0x0428  */
    /* JADX WARN: Code duplicated, block: B:80:0x0439  */
    /* JADX WARN: Code duplicated, block: B:81:0x044a  */
    /* JADX WARN: Code duplicated, block: B:82:0x045b  */
    /* JADX WARN: Code duplicated, block: B:83:0x046c  */
    /* JADX WARN: Code duplicated, block: B:84:0x047d  */
    /* JADX WARN: Code duplicated, block: B:85:0x048e  */
    /* JADX WARN: Code duplicated, block: B:86:0x049f  */
    /* JADX WARN: Code duplicated, block: B:87:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:91:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:92:0x04de  */
    /* JADX WARN: Code duplicated, block: B:94:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x050c  */
    public static void a(Context context, o oVar, ArrayList arrayList, b.a aVar, List list, int i14, j jVar) {
        Object obj;
        char c14;
        ArrayList arrayList2;
        String string;
        ArrayList arrayList3;
        boolean z14;
        boolean zB;
        double dDoubleValue;
        int size;
        int i15;
        double d14;
        x0 x0Var;
        Double duration;
        double dDoubleValue2;
        Object obj2;
        boolean z15;
        boolean z16;
        boolean z17;
        m3 m3Var;
        Double averageStrokeDistance;
        String strP;
        boolean z18 = jVar.f165809d;
        aVar.getClass();
        String str = aVar.f114265f;
        Object obj3 = null;
        char c15 = 6;
        o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
        ArrayList arrayList4 = oVar.f120194b;
        int size2 = arrayList4.size();
        int i16 = 0;
        while (i16 < size2) {
            mq.l lVar = (mq.l) arrayList.get(i16);
            if (lVar instanceof mq.a) {
                mq.a aVar2 = (mq.a) lVar;
                x0 x0Var2 = (x0) h0.e0(i14, list);
                if (x0Var2 == null) {
                    string = context.getString(R.string.no_value);
                    string.getClass();
                    size2 = size2;
                    obj = null;
                    c14 = 6;
                    arrayList2 = arrayList4;
                } else {
                    String str2 = jVar.f165810e;
                    if (z0.Q(str2)) {
                        arrayList3 = arrayList4;
                    } else {
                        arrayList3 = arrayList4;
                        if (!z0.b(am.x0.f4297k1, str2) && !z0.b(am.x0.f4301l1, str2)) {
                            z14 = false;
                        }
                        zB = z0.b(am.x0.I0, str2);
                        dDoubleValue = 0.0d;
                        switch (a.f114282a[aVar2.ordinal()]) {
                            case 1:
                            case 10:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                g0.f29436c.getClass();
                                if (g0.a.a(str) != g0.ACTIVE) {
                                    string = context.getString(g0.a.a(str).f29447b);
                                    string.getClass();
                                } else if (z0.b(am.x0.f4308n, str2)) {
                                    if (z0.b(am.x0.f4312o, str2)) {
                                        string = context.getString(R.string.lbl_bike);
                                    } else {
                                        string = context.getString(g0.a.a(str).f29447b);
                                    }
                                    string.getClass();
                                } else {
                                    string = context.getString(R.string.lbl_run);
                                    string.getClass();
                                    continue;
                                    continue;
                                }
                                break;
                            case 2:
                            case 3:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                string = aq.a.u(0);
                                continue;
                                continue;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                string = aq.a.u(jVar.f165807b);
                                continue;
                                continue;
                            case 8:
                            case 9:
                            case 40:
                            case 87:
                            case 91:
                            default:
                                string = context.getString(R.string.no_value);
                                string.getClass();
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                continue;
                                continue;
                            case 11:
                            case 12:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getDuration());
                                continue;
                                continue;
                            case 13:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getDuration());
                                continue;
                                continue;
                            case 14:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                size = list.size();
                                i15 = 0;
                                while (true) {
                                    d14 = Double.NaN;
                                    if (i15 >= size) {
                                        x0Var = (x0) list.get(i15);
                                        Double duration2 = x0Var.getDuration();
                                        dDoubleValue += duration2 != null ? duration2.doubleValue() : Double.NaN;
                                        if (x0Var.equals(x0Var2)) {
                                            d14 = dDoubleValue;
                                        } else {
                                            i15++;
                                        }
                                    }
                                }
                                string = aq.a.W(context, Double.valueOf(d14));
                                continue;
                                continue;
                            case 15:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                duration = x0Var2.getDuration();
                                if (duration != null) {
                                    dDoubleValue2 = duration.doubleValue();
                                } else {
                                    dDoubleValue2 = 0.0d;
                                }
                                Double movingDuration = x0Var2.getMovingDuration();
                                string = aq.a.W(context, Double.valueOf(dDoubleValue2 - (movingDuration != null ? movingDuration.doubleValue() : 0.0d)));
                                continue;
                                continue;
                            case 16:
                            case 17:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getMovingDuration());
                                continue;
                                continue;
                            case 18:
                            case 19:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj = null;
                                c14 = 6;
                                if (z0.Q(str2)) {
                                    string = aq.a.G(context, x0Var2.getDistance());
                                    continue;
                                    continue;
                                } else if (z0.b(am.x0.f4297k1, str2) || z0.b(am.x0.f4301l1, str2)) {
                                    string = aq.a.r(context, x0Var2.getDistance());
                                } else {
                                    string = !zB ? aq.a.f(context, x0Var2.getDistance()) : aq.a.d0(context, x0Var2.getDistance());
                                }
                                break;
                            case 20:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                if (zB) {
                                    string = aq.a.f(context, x0Var2.getDistance());
                                } else {
                                    string = aq.a.d0(context, x0Var2.getDistance());
                                }
                                break;
                            case 21:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.j(context, x0Var2.getElevationGain(), o0VarG);
                                break;
                            case 22:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.J(context, x0Var2.getElevationGain(), o0VarG);
                                break;
                            case 23:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.j(context, x0Var2.getElevationLoss(), o0VarG);
                                break;
                            case 24:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.J(context, x0Var2.getElevationLoss(), o0VarG);
                                break;
                            case 25:
                            case 26:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                Double averageSpeed = x0Var2.getAverageSpeed();
                                if (!z18 || z14) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                string = aq.a.K(context, averageSpeed, z15);
                                break;
                            case 27:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.K(context, x0Var2.getAverageVerticalSpeed(), z18);
                                break;
                            case 28:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                Double averageMovingSpeed = x0Var2.getAverageMovingSpeed();
                                if (!z18 || z14) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                string = aq.a.K(context, averageMovingSpeed, z16);
                                break;
                            case 29:
                            case 30:
                            case 31:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                Double maxSpeed = x0Var2.getMaxSpeed();
                                if (!z18 || z14) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                string = aq.a.K(context, maxSpeed, z17);
                                break;
                            case 32:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.D(context, x0Var2.getAverageGradeAdjustedSpeed(), z18);
                                break;
                            case 33:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                if (z14) {
                                    string = aq.a.D(context, x0Var2.getAverageSpeed(), z18);
                                } else {
                                    string = aq.a.H(context, x0Var2.getAverageSpeed());
                                }
                                break;
                            case 34:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.D(context, x0Var2.getAverageMovingSpeed(), z18);
                                break;
                            case 35:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                if (z14) {
                                    string = aq.a.D(context, x0Var2.getMaxSpeed(), z18);
                                } else {
                                    string = aq.a.H(context, x0Var2.getMaxSpeed());
                                }
                                break;
                            case 36:
                            case 37:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.q(context, x0Var2.getAverageHR());
                                break;
                            case 38:
                            case 39:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.q(context, x0Var2.getMaxHR());
                                break;
                            case 41:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.I(context, x0Var2.getAverageRunCadence());
                                break;
                            case 42:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.I(context, x0Var2.getMaxRunCadence());
                                break;
                            case 43:
                            case 44:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.c(context, x0Var2.getAverageBikeCadence());
                                break;
                            case 45:
                            case 46:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.c(context, x0Var2.getMaxBikeCadence());
                                break;
                            case 47:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.I(context, x0Var2.getAvgWheelchairCadence());
                                break;
                            case 48:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.I(context, x0Var2.getMaxWheelchairCadence());
                                break;
                            case 49:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getNormalizedPower());
                                break;
                            case 50:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.e(context, x0Var2.getLeftBalance(), x0Var2.getRightBalance());
                                break;
                            case 51:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.e(context, x0Var2.getLeftTorqueEffectiveness(), x0Var2.getRightTorqueEffectiveness());
                                break;
                            case 52:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.e(context, x0Var2.getLeftPedalSmoothness(), x0Var2.getRightPedalSmoothness());
                                break;
                            case 53:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getAveragePower());
                                break;
                            case 54:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getMaxPower());
                                break;
                            case 55:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.m(context, x0Var2.getAvgBikeForce());
                                break;
                            case 56:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.m(context, x0Var2.getMaxBikeForce());
                                break;
                            case 57:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.m(context, x0Var2.getNormalizedForce());
                                break;
                            case 58:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                Double averagePower = x0Var2.getAveragePower();
                                l.f68084a.getClass();
                                string = aq.a.F(context, averagePower, l.a.a().v3());
                                break;
                            case 59:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                Double maxPower = x0Var2.getMaxPower();
                                l.f68084a.getClass();
                                string = aq.a.F(context, maxPower, l.a.a().v3());
                                break;
                            case 60:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getSeatedTime());
                                break;
                            case 61:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getStandingTime());
                                break;
                            case 62:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.b0(context, x0Var2.getAvgRiderTorsoAngle());
                                break;
                            case 63:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.b0(context, x0Var2.getAvgAeroTorsoAngle());
                                break;
                            case 64:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.b0(context, x0Var2.getAvgLoweredTorsoAngle());
                                break;
                            case 65:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.b0(context, x0Var2.getAvgUprightTorsoAngle());
                                break;
                            case 66:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.b0(context, x0Var2.getAvgStandingTorsoAngle());
                                break;
                            case 67:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getAeroTime());
                                break;
                            case 68:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getLoweredTime());
                                break;
                            case 69:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.W(context, x0Var2.getUprightTime());
                                break;
                            case 70:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getAvgAeroPower());
                                break;
                            case 71:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getMaxAeroPower());
                                break;
                            case 72:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getAvgLoweredPower());
                                break;
                            case 73:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getMaxLoweredPower());
                                break;
                            case 74:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getAvgUprightPower());
                                break;
                            case 75:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getMaxUprightPower());
                                break;
                            case 76:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getAverageSeatedPower());
                                break;
                            case 77:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getMaxSeatedPower());
                                break;
                            case 78:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getAverageStandingPower());
                                break;
                            case 79:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.E(context, x0Var2.getMaxStandingPower());
                                break;
                            case 80:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.M(context, x0Var2.getAverageStepSpeedLoss());
                                break;
                            case 81:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.N(context, x0Var2.getAverageStepSpeedLossPercent());
                                break;
                            case 82:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.O(context, x0Var2.getStrideLength());
                                break;
                            case 83:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.V(context, x0Var2.getAverageTemperature());
                                break;
                            case 84:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.V(context, x0Var2.getMinTemperature());
                                break;
                            case 85:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.V(context, x0Var2.getMaxTemperature());
                                break;
                            case 86:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.d(context, x0Var2.getCalories());
                                break;
                            case 88:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.l(context, x0Var2.getAverageFlow());
                                break;
                            case 89:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.p(context, x0Var2.getGrit());
                                break;
                            case 90:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.t(context, x0Var2.getJumpCount());
                                break;
                            case 92:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.n(context, x0Var2.getGroundContactTime());
                                break;
                            case 93:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.o(context, x0Var2.getGroundContactBalanceLeft());
                                break;
                            case 94:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.f0(context, x0Var2.getVerticalOscillation());
                                break;
                            case 95:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.g0(context, x0Var2.getAverageVerticalRatio());
                                break;
                            case 96:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.b(context, x0Var2.getAverageStrokeCadence());
                                break;
                            case 97:
                                size2 = size2;
                                arrayList2 = arrayList3;
                                obj2 = null;
                                c14 = 6;
                                string = aq.a.x(context, x0Var2.getMaxStrokeCadence());
                                break;
                            case 98:
                                c14 = 6;
                                if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
                                    m3Var = m3.METER;
                                } else {
                                    m3Var = m3.FOOT;
                                }
                                averageStrokeDistance = x0Var2.getAverageStrokeDistance();
                                aq.a aVar3 = aq.a.f11807a;
                                m3Var.getClass();
                                if (averageStrokeDistance != null) {
                                    l3.a aVar4 = l3.f23124b;
                                    double dDoubleValue3 = averageStrokeDistance.doubleValue();
                                    DecimalFormat decimalFormat = l3.f23129g;
                                    aVar4.getClass();
                                    strP = l3.a.P(context, dDoubleValue3, m3Var, decimalFormat, false, null);
                                } else {
                                    strP = null;
                                }
                                string = aq.a.A(context, strP);
                                i16 = i16;
                                obj = null;
                                arrayList2 = arrayList3;
                                continue;
                                continue;
                        }
                        obj = obj2;
                    }
                    z14 = true;
                    zB = z0.b(am.x0.I0, str2);
                    dDoubleValue = 0.0d;
                    switch (a.f114282a[aVar2.ordinal()]) {
                        case 1:
                        case 10:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            g0.f29436c.getClass();
                            if (g0.a.a(str) != g0.ACTIVE) {
                                string = context.getString(g0.a.a(str).f29447b);
                                string.getClass();
                            } else if (z0.b(am.x0.f4308n, str2)) {
                                if (z0.b(am.x0.f4312o, str2)) {
                                    string = context.getString(R.string.lbl_bike);
                                } else {
                                    string = context.getString(g0.a.a(str).f29447b);
                                }
                                string.getClass();
                            } else {
                                string = context.getString(R.string.lbl_run);
                                string.getClass();
                                continue;
                                continue;
                            }
                            break;
                        case 2:
                        case 3:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            string = aq.a.u(0);
                            continue;
                            continue;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            string = aq.a.u(jVar.f165807b);
                            continue;
                            continue;
                        case 8:
                        case 9:
                        case 40:
                        case 87:
                        case 91:
                        default:
                            string = context.getString(R.string.no_value);
                            string.getClass();
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            continue;
                            continue;
                        case 11:
                        case 12:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getDuration());
                            continue;
                            continue;
                        case 13:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getDuration());
                            continue;
                            continue;
                        case 14:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            size = list.size();
                            i15 = 0;
                            while (true) {
                                d14 = Double.NaN;
                                if (i15 >= size) {
                                    x0Var = (x0) list.get(i15);
                                    Double duration3 = x0Var.getDuration();
                                    dDoubleValue += duration3 != null ? duration3.doubleValue() : Double.NaN;
                                    if (x0Var.equals(x0Var2)) {
                                        d14 = dDoubleValue;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            string = aq.a.W(context, Double.valueOf(d14));
                            continue;
                            continue;
                        case 15:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            duration = x0Var2.getDuration();
                            if (duration != null) {
                                dDoubleValue2 = duration.doubleValue();
                            } else {
                                dDoubleValue2 = 0.0d;
                            }
                            Double movingDuration2 = x0Var2.getMovingDuration();
                            string = aq.a.W(context, Double.valueOf(dDoubleValue2 - (movingDuration2 != null ? movingDuration2.doubleValue() : 0.0d)));
                            continue;
                            continue;
                        case 16:
                        case 17:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getMovingDuration());
                            continue;
                            continue;
                        case 18:
                        case 19:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj = null;
                            c14 = 6;
                            if (z0.Q(str2)) {
                                string = aq.a.G(context, x0Var2.getDistance());
                                continue;
                                continue;
                            } else if (z0.b(am.x0.f4297k1, str2)) {
                                string = aq.a.r(context, x0Var2.getDistance());
                            } else {
                                string = aq.a.r(context, x0Var2.getDistance());
                            }
                            break;
                        case 20:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            if (zB) {
                                string = aq.a.f(context, x0Var2.getDistance());
                            } else {
                                string = aq.a.d0(context, x0Var2.getDistance());
                            }
                            break;
                        case 21:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.j(context, x0Var2.getElevationGain(), o0VarG);
                            break;
                        case 22:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.J(context, x0Var2.getElevationGain(), o0VarG);
                            break;
                        case 23:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.j(context, x0Var2.getElevationLoss(), o0VarG);
                            break;
                        case 24:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.J(context, x0Var2.getElevationLoss(), o0VarG);
                            break;
                        case 25:
                        case 26:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            Double averageSpeed2 = x0Var2.getAverageSpeed();
                            if (z18) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            string = aq.a.K(context, averageSpeed2, z15);
                            break;
                        case 27:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.K(context, x0Var2.getAverageVerticalSpeed(), z18);
                            break;
                        case 28:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            Double averageMovingSpeed2 = x0Var2.getAverageMovingSpeed();
                            if (z18) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            string = aq.a.K(context, averageMovingSpeed2, z16);
                            break;
                        case 29:
                        case 30:
                        case 31:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            Double maxSpeed2 = x0Var2.getMaxSpeed();
                            if (z18) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            string = aq.a.K(context, maxSpeed2, z17);
                            break;
                        case 32:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.D(context, x0Var2.getAverageGradeAdjustedSpeed(), z18);
                            break;
                        case 33:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            if (z14) {
                                string = aq.a.D(context, x0Var2.getAverageSpeed(), z18);
                            } else {
                                string = aq.a.H(context, x0Var2.getAverageSpeed());
                            }
                            break;
                        case 34:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.D(context, x0Var2.getAverageMovingSpeed(), z18);
                            break;
                        case 35:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            if (z14) {
                                string = aq.a.D(context, x0Var2.getMaxSpeed(), z18);
                            } else {
                                string = aq.a.H(context, x0Var2.getMaxSpeed());
                            }
                            break;
                        case 36:
                        case 37:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.q(context, x0Var2.getAverageHR());
                            break;
                        case 38:
                        case 39:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.q(context, x0Var2.getMaxHR());
                            break;
                        case 41:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.I(context, x0Var2.getAverageRunCadence());
                            break;
                        case 42:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.I(context, x0Var2.getMaxRunCadence());
                            break;
                        case 43:
                        case 44:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.c(context, x0Var2.getAverageBikeCadence());
                            break;
                        case 45:
                        case 46:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.c(context, x0Var2.getMaxBikeCadence());
                            break;
                        case 47:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.I(context, x0Var2.getAvgWheelchairCadence());
                            break;
                        case 48:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.I(context, x0Var2.getMaxWheelchairCadence());
                            break;
                        case 49:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getNormalizedPower());
                            break;
                        case 50:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.e(context, x0Var2.getLeftBalance(), x0Var2.getRightBalance());
                            break;
                        case 51:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.e(context, x0Var2.getLeftTorqueEffectiveness(), x0Var2.getRightTorqueEffectiveness());
                            break;
                        case 52:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.e(context, x0Var2.getLeftPedalSmoothness(), x0Var2.getRightPedalSmoothness());
                            break;
                        case 53:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getAveragePower());
                            break;
                        case 54:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getMaxPower());
                            break;
                        case 55:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.m(context, x0Var2.getAvgBikeForce());
                            break;
                        case 56:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.m(context, x0Var2.getMaxBikeForce());
                            break;
                        case 57:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.m(context, x0Var2.getNormalizedForce());
                            break;
                        case 58:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            Double averagePower2 = x0Var2.getAveragePower();
                            l.f68084a.getClass();
                            string = aq.a.F(context, averagePower2, l.a.a().v3());
                            break;
                        case 59:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            Double maxPower2 = x0Var2.getMaxPower();
                            l.f68084a.getClass();
                            string = aq.a.F(context, maxPower2, l.a.a().v3());
                            break;
                        case 60:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getSeatedTime());
                            break;
                        case 61:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getStandingTime());
                            break;
                        case 62:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.b0(context, x0Var2.getAvgRiderTorsoAngle());
                            break;
                        case 63:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.b0(context, x0Var2.getAvgAeroTorsoAngle());
                            break;
                        case 64:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.b0(context, x0Var2.getAvgLoweredTorsoAngle());
                            break;
                        case 65:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.b0(context, x0Var2.getAvgUprightTorsoAngle());
                            break;
                        case 66:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.b0(context, x0Var2.getAvgStandingTorsoAngle());
                            break;
                        case 67:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getAeroTime());
                            break;
                        case 68:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getLoweredTime());
                            break;
                        case 69:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.W(context, x0Var2.getUprightTime());
                            break;
                        case 70:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getAvgAeroPower());
                            break;
                        case 71:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getMaxAeroPower());
                            break;
                        case 72:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getAvgLoweredPower());
                            break;
                        case 73:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getMaxLoweredPower());
                            break;
                        case 74:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getAvgUprightPower());
                            break;
                        case 75:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getMaxUprightPower());
                            break;
                        case 76:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getAverageSeatedPower());
                            break;
                        case 77:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getMaxSeatedPower());
                            break;
                        case 78:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getAverageStandingPower());
                            break;
                        case 79:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.E(context, x0Var2.getMaxStandingPower());
                            break;
                        case 80:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.M(context, x0Var2.getAverageStepSpeedLoss());
                            break;
                        case 81:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.N(context, x0Var2.getAverageStepSpeedLossPercent());
                            break;
                        case 82:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.O(context, x0Var2.getStrideLength());
                            break;
                        case 83:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.V(context, x0Var2.getAverageTemperature());
                            break;
                        case 84:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.V(context, x0Var2.getMinTemperature());
                            break;
                        case 85:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.V(context, x0Var2.getMaxTemperature());
                            break;
                        case 86:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.d(context, x0Var2.getCalories());
                            break;
                        case 88:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.l(context, x0Var2.getAverageFlow());
                            break;
                        case 89:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.p(context, x0Var2.getGrit());
                            break;
                        case 90:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.t(context, x0Var2.getJumpCount());
                            break;
                        case 92:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.n(context, x0Var2.getGroundContactTime());
                            break;
                        case 93:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.o(context, x0Var2.getGroundContactBalanceLeft());
                            break;
                        case 94:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.f0(context, x0Var2.getVerticalOscillation());
                            break;
                        case 95:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.g0(context, x0Var2.getAverageVerticalRatio());
                            break;
                        case 96:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.b(context, x0Var2.getAverageStrokeCadence());
                            break;
                        case 97:
                            size2 = size2;
                            arrayList2 = arrayList3;
                            obj2 = null;
                            c14 = 6;
                            string = aq.a.x(context, x0Var2.getMaxStrokeCadence());
                            break;
                        case 98:
                            c14 = 6;
                            if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
                                m3Var = m3.METER;
                            } else {
                                m3Var = m3.FOOT;
                            }
                            averageStrokeDistance = x0Var2.getAverageStrokeDistance();
                            aq.a aVar5 = aq.a.f11807a;
                            m3Var.getClass();
                            if (averageStrokeDistance != null) {
                                l3.a aVar6 = l3.f23124b;
                                double dDoubleValue4 = averageStrokeDistance.doubleValue();
                                DecimalFormat decimalFormat2 = l3.f23129g;
                                aVar6.getClass();
                                strP = l3.a.P(context, dDoubleValue4, m3Var, decimalFormat2, false, null);
                            } else {
                                strP = null;
                            }
                            string = aq.a.A(context, strP);
                            i16 = i16;
                            obj = null;
                            arrayList2 = arrayList3;
                            continue;
                            continue;
                    }
                    obj = obj2;
                }
            } else {
                size2 = size2;
                obj = obj3;
                c14 = c15;
                arrayList2 = arrayList4;
                string = "";
            }
            ((TextView) arrayList2.get(i16)).setText(string);
            oVar.f120193a.setBackgroundColor(e(jVar.f165806a + 1, context));
            i16++;
            arrayList4 = arrayList2;
            obj3 = obj;
            size2 = size2;
            c15 = c14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0222  */
    /* JADX WARN: Code duplicated, block: B:103:0x0231  */
    /* JADX WARN: Code duplicated, block: B:106:0x023b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0247  */
    /* JADX WARN: Code duplicated, block: B:109:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x025e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0268  */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:118:0x0279  */
    /* JADX WARN: Code duplicated, block: B:121:0x028b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0295  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x0305  */
    /* JADX WARN: Code duplicated, block: B:148:0x030a  */
    /* JADX WARN: Code duplicated, block: B:151:0x031a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0323  */
    /* JADX WARN: Code duplicated, block: B:155:0x032d  */
    /* JADX WARN: Code duplicated, block: B:163:0x034e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0356 A[LOOP:14: B:149:0x030c->B:164:0x0356, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x035b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0365  */
    /* JADX WARN: Code duplicated, block: B:170:0x0371  */
    /* JADX WARN: Code duplicated, block: B:171:0x0376  */
    /* JADX WARN: Code duplicated, block: B:174:0x0388  */
    /* JADX WARN: Code duplicated, block: B:176:0x0392  */
    /* JADX WARN: Code duplicated, block: B:177:0x0394  */
    /* JADX WARN: Code duplicated, block: B:180:0x039f  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:186:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f9 A[LOOP:16: B:184:0x03af->B:199:0x03f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:203:0x0406  */
    /* JADX WARN: Code duplicated, block: B:205:0x0412  */
    /* JADX WARN: Code duplicated, block: B:206:0x0417  */
    /* JADX WARN: Code duplicated, block: B:209:0x0429  */
    /* JADX WARN: Code duplicated, block: B:211:0x0433  */
    /* JADX WARN: Code duplicated, block: B:212:0x0435  */
    /* JADX WARN: Code duplicated, block: B:215:0x0440  */
    /* JADX WARN: Code duplicated, block: B:217:0x0449  */
    /* JADX WARN: Code duplicated, block: B:218:0x044e  */
    /* JADX WARN: Code duplicated, block: B:221:0x045e  */
    /* JADX WARN: Code duplicated, block: B:222:0x046b  */
    /* JADX WARN: Code duplicated, block: B:225:0x0477  */
    /* JADX WARN: Code duplicated, block: B:226:0x047a  */
    /* JADX WARN: Code duplicated, block: B:234:0x049a A[LOOP:18: B:219:0x0450->B:234:0x049a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x049d  */
    /* JADX WARN: Code duplicated, block: B:238:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:240:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:241:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:246:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:253:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:256:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:257:0x050c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0518  */
    /* JADX WARN: Code duplicated, block: B:261:0x051b  */
    /* JADX WARN: Code duplicated, block: B:269:0x053b A[LOOP:20: B:254:0x04f1->B:269:0x053b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x053e  */
    /* JADX WARN: Code duplicated, block: B:273:0x0548  */
    /* JADX WARN: Code duplicated, block: B:275:0x0554  */
    /* JADX WARN: Code duplicated, block: B:276:0x0559  */
    /* JADX WARN: Code duplicated, block: B:279:0x056b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0575  */
    /* JADX WARN: Code duplicated, block: B:282:0x0577  */
    /* JADX WARN: Code duplicated, block: B:285:0x0582  */
    /* JADX WARN: Code duplicated, block: B:287:0x058b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0590  */
    /* JADX WARN: Code duplicated, block: B:291:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:292:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:296:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:304:0x05dc A[LOOP:22: B:289:0x0592->B:304:0x05dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x05df  */
    /* JADX WARN: Code duplicated, block: B:308:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:310:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:311:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:314:0x060c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0616  */
    /* JADX WARN: Code duplicated, block: B:319:0x0622  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:320:0x0627  */
    /* JADX WARN: Code duplicated, block: B:323:0x0636  */
    /* JADX WARN: Code duplicated, block: B:326:0x0640  */
    /* JADX WARN: Code duplicated, block: B:328:0x064c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0651  */
    /* JADX WARN: Code duplicated, block: B:332:0x0660  */
    /* JADX WARN: Code duplicated, block: B:335:0x066a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0676  */
    /* JADX WARN: Code duplicated, block: B:338:0x067b  */
    /* JADX WARN: Code duplicated, block: B:341:0x068a  */
    /* JADX WARN: Code duplicated, block: B:344:0x0694  */
    /* JADX WARN: Code duplicated, block: B:346:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:347:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:350:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:353:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:355:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:356:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:359:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:362:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:364:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:365:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:368:0x0711  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:371:0x071b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0727  */
    /* JADX WARN: Code duplicated, block: B:374:0x072c  */
    /* JADX WARN: Code duplicated, block: B:377:0x073e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:380:0x0748  */
    /* JADX WARN: Code duplicated, block: B:382:0x0754  */
    /* JADX WARN: Code duplicated, block: B:383:0x0759  */
    /* JADX WARN: Code duplicated, block: B:386:0x076b  */
    /* JADX WARN: Code duplicated, block: B:389:0x0775  */
    /* JADX WARN: Code duplicated, block: B:391:0x0781  */
    /* JADX WARN: Code duplicated, block: B:392:0x0786  */
    /* JADX WARN: Code duplicated, block: B:395:0x0795  */
    /* JADX WARN: Code duplicated, block: B:398:0x079f  */
    /* JADX WARN: Code duplicated, block: B:400:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:401:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:404:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:406:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:407:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:410:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:412:0x07df  */
    /* JADX WARN: Code duplicated, block: B:413:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:416:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:417:0x0801  */
    /* JADX WARN: Code duplicated, block: B:420:0x080d  */
    /* JADX WARN: Code duplicated, block: B:421:0x0810  */
    /* JADX WARN: Code duplicated, block: B:429:0x083d A[LOOP:34: B:414:0x07e6->B:429:0x083d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:430:0x0840  */
    /* JADX WARN: Code duplicated, block: B:433:0x084a  */
    /* JADX WARN: Code duplicated, block: B:435:0x0856  */
    /* JADX WARN: Code duplicated, block: B:436:0x085b  */
    /* JADX WARN: Code duplicated, block: B:439:0x087b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:442:0x0885  */
    /* JADX WARN: Code duplicated, block: B:444:0x0891  */
    /* JADX WARN: Code duplicated, block: B:445:0x0896  */
    /* JADX WARN: Code duplicated, block: B:448:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:450:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:451:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:454:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:456:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:457:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:460:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:461:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:464:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:465:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:473:0x0919 A[LOOP:37: B:458:0x08cf->B:473:0x0919, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:474:0x091c  */
    /* JADX WARN: Code duplicated, block: B:477:0x0926  */
    /* JADX WARN: Code duplicated, block: B:479:0x0932  */
    /* JADX WARN: Code duplicated, block: B:480:0x0937  */
    /* JADX WARN: Code duplicated, block: B:483:0x0949  */
    /* JADX WARN: Code duplicated, block: B:485:0x0953  */
    /* JADX WARN: Code duplicated, block: B:486:0x0955  */
    /* JADX WARN: Code duplicated, block: B:489:0x0960  */
    /* JADX WARN: Code duplicated, block: B:491:0x0969  */
    /* JADX WARN: Code duplicated, block: B:492:0x096e  */
    /* JADX WARN: Code duplicated, block: B:495:0x097e  */
    /* JADX WARN: Code duplicated, block: B:496:0x098b  */
    /* JADX WARN: Code duplicated, block: B:499:0x0997  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:500:0x099a  */
    /* JADX WARN: Code duplicated, block: B:508:0x09ba A[LOOP:39: B:493:0x0970->B:508:0x09ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:509:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:512:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:514:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:515:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:518:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:521:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:523:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:546:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:548:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:557:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:558:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    /* JADX WARN: Code duplicated, block: B:563:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:565:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:566:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:569:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:572:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:574:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:578:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:580:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:586:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:591:0x0b55  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:603:0x0b84 A[LOOP:48: B:588:0x0b3a->B:603:0x0b84, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:604:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:607:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:609:0x0b9d  */
    /* JADX WARN: Code duplicated, block: B:610:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:613:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:615:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:616:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:619:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:621:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:622:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:625:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:626:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:630:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:638:0x0c25 A[LOOP:50: B:623:0x0bdb->B:638:0x0c25, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:639:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:642:0x0c32  */
    /* JADX WARN: Code duplicated, block: B:644:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:645:0x0c43  */
    /* JADX WARN: Code duplicated, block: B:648:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:650:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:651:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:654:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:656:0x0c75  */
    /* JADX WARN: Code duplicated, block: B:657:0x0c7a  */
    /* JADX WARN: Code duplicated, block: B:660:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:661:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:664:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:665:0x0ca6  */
    /* JADX WARN: Code duplicated, block: B:673:0x0cc6 A[LOOP:52: B:658:0x0c7c->B:673:0x0cc6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:674:0x0cc9  */
    /* JADX WARN: Code duplicated, block: B:677:0x0cd3  */
    /* JADX WARN: Code duplicated, block: B:679:0x0cdf  */
    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:680:0x0ce4  */
    /* JADX WARN: Code duplicated, block: B:683:0x0cf6  */
    /* JADX WARN: Code duplicated, block: B:685:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:686:0x0d02  */
    /* JADX WARN: Code duplicated, block: B:689:0x0d0d  */
    /* JADX WARN: Code duplicated, block: B:691:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:692:0x0d1b  */
    /* JADX WARN: Code duplicated, block: B:695:0x0d2b  */
    /* JADX WARN: Code duplicated, block: B:696:0x0d38  */
    /* JADX WARN: Code duplicated, block: B:699:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:700:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:711:0x0d77 A[LOOP:54: B:693:0x0d1d->B:711:0x0d77, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:712:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:713:0x0d84 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:714:0x0d86  */
    /* JADX WARN: Code duplicated, block: B:715:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:716:0x0d96  */
    /* JADX WARN: Code duplicated, block: B:719:0x0da0  */
    /* JADX WARN: Code duplicated, block: B:721:0x0dac  */
    /* JADX WARN: Code duplicated, block: B:722:0x0db1  */
    /* JADX WARN: Code duplicated, block: B:725:0x0dc7  */
    /* JADX WARN: Code duplicated, block: B:727:0x0dd1  */
    /* JADX WARN: Code duplicated, block: B:728:0x0dd3  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:731:0x0dde  */
    /* JADX WARN: Code duplicated, block: B:733:0x0de7  */
    /* JADX WARN: Code duplicated, block: B:734:0x0dec  */
    /* JADX WARN: Code duplicated, block: B:737:0x0dfc  */
    /* JADX WARN: Code duplicated, block: B:738:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:741:0x0e15  */
    /* JADX WARN: Code duplicated, block: B:742:0x0e18  */
    /* JADX WARN: Code duplicated, block: B:750:0x0e3c A[LOOP:56: B:735:0x0dee->B:750:0x0e3c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:751:0x0e3f  */
    /* JADX WARN: Code duplicated, block: B:752:0x0e49  */
    /* JADX WARN: Code duplicated, block: B:753:0x0e53  */
    /* JADX WARN: Code duplicated, block: B:756:0x0e5d  */
    /* JADX WARN: Code duplicated, block: B:758:0x0e69  */
    /* JADX WARN: Code duplicated, block: B:759:0x0e6e  */
    /* JADX WARN: Code duplicated, block: B:762:0x0e7d  */
    /* JADX WARN: Code duplicated, block: B:765:0x0e87  */
    /* JADX WARN: Code duplicated, block: B:767:0x0e93  */
    /* JADX WARN: Code duplicated, block: B:768:0x0e98  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:771:0x0ea7  */
    /* JADX WARN: Code duplicated, block: B:773:0x0eb1  */
    /* JADX WARN: Code duplicated, block: B:774:0x0eb7  */
    /* JADX WARN: Code duplicated, block: B:776:0x0ec3  */
    /* JADX WARN: Code duplicated, block: B:779:0x0ed0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:780:0x0ed2  */
    /* JADX WARN: Code duplicated, block: B:781:0x0ed8  */
    /* JADX WARN: Code duplicated, block: B:782:0x0ede  */
    /* JADX WARN: Code duplicated, block: B:783:0x0ee4  */
    /* JADX WARN: Code duplicated, block: B:784:0x0eea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:785:0x0eec  */
    /* JADX WARN: Code duplicated, block: B:786:0x0ef1  */
    /* JADX WARN: Code duplicated, block: B:788:0x0ef5  */
    /* JADX WARN: Code duplicated, block: B:790:0x0f05  */
    /* JADX WARN: Code duplicated, block: B:791:0x0f16  */
    /* JADX WARN: Code duplicated, block: B:792:0x0f1f  */
    /* JADX WARN: Code duplicated, block: B:795:0x0f27  */
    /* JADX WARN: Code duplicated, block: B:796:0x0f2e  */
    /* JADX WARN: Code duplicated, block: B:797:0x0f37  */
    /* JADX WARN: Code duplicated, block: B:799:0x0f3f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:801:0x0f4b  */
    /* JADX WARN: Code duplicated, block: B:802:0x0f53  */
    /* JADX WARN: Code duplicated, block: B:804:0x0f5f  */
    /* JADX WARN: Code duplicated, block: B:805:0x0f67  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:854:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:859:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:864:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:869:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:874:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:909:0x0818 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:917:0x0901 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:922:0x09a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:948:0x0b6c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0207  */
    /* JADX WARN: Code duplicated, block: B:953:0x0c0d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:958:0x0cae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:963:0x0d4f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:968:0x0e20 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x021d  */
    public static void b(Context context, o oVar, ArrayList arrayList, b.a aVar, List list, int i14, int i15, j jVar) {
        mq.a aVar2;
        boolean z14;
        boolean z15;
        boolean zB;
        double d14;
        double dDoubleValue;
        Iterator it;
        Double elevationGain;
        double dDoubleValue2;
        Iterator it3;
        Double elevationLoss;
        double dDoubleValue3;
        Iterator it4;
        Object next;
        Double maxSpeed;
        double dDoubleValue4;
        Object next2;
        Double maxSpeed2;
        double dDoubleValue5;
        x0 x0Var;
        Double maxSpeed3;
        Iterator it5;
        Double averageGradeAdjustedSpeed;
        double dDoubleValue6;
        Iterator it6;
        Object next3;
        Double maxSpeed4;
        double dDoubleValue7;
        Object next4;
        Double maxSpeed5;
        double dDoubleValue8;
        x0 x0Var2;
        Double maxSpeed6;
        Iterator it7;
        Double averageHR;
        double dDoubleValue9;
        Iterator it8;
        Object next5;
        Double maxHR;
        double dDoubleValue10;
        Object next6;
        Double maxHR2;
        double dDoubleValue11;
        x0 x0Var3;
        Double maxHR3;
        Iterator it9;
        Double averageRunCadence;
        double dDoubleValue12;
        Iterator it10;
        Object next7;
        Double maxRunCadence;
        double dDoubleValue13;
        Object next8;
        Double maxRunCadence2;
        double dDoubleValue14;
        x0 x0Var4;
        Double maxRunCadence3;
        Iterator it11;
        Double averageBikeCadence;
        double dDoubleValue15;
        Iterator it12;
        Object next9;
        Double maxBikeCadence;
        double dDoubleValue16;
        Object next10;
        Double maxBikeCadence2;
        double dDoubleValue17;
        x0 x0Var5;
        Double maxBikeCadence3;
        Iterator it13;
        Double normalizedPower;
        double dDoubleValue18;
        Iterator it14;
        double d15;
        Iterator it15;
        Double rightBalance;
        double dDoubleValue19;
        Double leftBalance;
        double dDoubleValue20;
        Iterator it16;
        double d16;
        Iterator it17;
        Double rightTorqueEffectiveness;
        double dDoubleValue21;
        Double leftTorqueEffectiveness;
        double dDoubleValue22;
        Iterator it18;
        double d17;
        Iterator it19;
        Double rightPedalSmoothness;
        double dDoubleValue23;
        Double leftPedalSmoothness;
        double dDoubleValue24;
        Iterator it20;
        Double averagePower;
        double dDoubleValue25;
        Iterator it21;
        Object next11;
        Double maxPower;
        double dDoubleValue26;
        Object next12;
        Double maxPower2;
        double dDoubleValue27;
        x0 x0Var6;
        Double maxPower3;
        Iterator it22;
        Double avgBikeForce;
        double dDoubleValue28;
        Iterator it23;
        Object next13;
        Double maxBikeForce;
        double dDoubleValue29;
        Object next14;
        Double maxBikeForce2;
        double dDoubleValue30;
        x0 x0Var7;
        Double maxBikeForce3;
        Iterator it24;
        Double normalizedForce;
        double dDoubleValue31;
        Iterator it25;
        Double averagePower2;
        double dDoubleValue32;
        Iterator it26;
        Object next15;
        Double maxPower4;
        double dDoubleValue33;
        Object next16;
        Double maxPower5;
        double dDoubleValue34;
        x0 x0Var8;
        Double maxPower6;
        Iterator it27;
        Double seatedTime;
        double dDoubleValue35;
        Iterator it28;
        Double standingTime;
        double dDoubleValue36;
        Iterator it29;
        Double avgRiderTorsoAngle;
        double dDoubleValue37;
        Iterator it30;
        Double avgAeroTorsoAngle;
        double dDoubleValue38;
        Iterator it31;
        Double avgLoweredTorsoAngle;
        double dDoubleValue39;
        Iterator it32;
        Double avgUprightTorsoAngle;
        double dDoubleValue40;
        Iterator it33;
        Double avgStandingTorsoAngle;
        double dDoubleValue41;
        Iterator it34;
        Double aeroTime;
        double dDoubleValue42;
        Iterator it35;
        Double loweredTime;
        double dDoubleValue43;
        Iterator it36;
        Double uprightTime;
        double dDoubleValue44;
        Iterator it37;
        Double avgAeroPower;
        double dDoubleValue45;
        Iterator it38;
        Object next17;
        Double maxAeroPower;
        double dDoubleValue46;
        Object next18;
        Double maxAeroPower2;
        double dDoubleValue47;
        x0 x0Var9;
        Double maxAeroPower3;
        Iterator it39;
        Double avgLoweredPower;
        double dDoubleValue48;
        Iterator it40;
        Object next19;
        Double maxLoweredPower;
        double dDoubleValue49;
        Object next20;
        Double maxLoweredPower2;
        double dDoubleValue50;
        x0 x0Var10;
        Double maxLoweredPower3;
        Iterator it41;
        Double avgUprightPower;
        double dDoubleValue51;
        Iterator it42;
        Object next21;
        Double maxUprightPower;
        double dDoubleValue52;
        Object next22;
        Double maxUprightPower2;
        double dDoubleValue53;
        x0 x0Var11;
        Double maxUprightPower3;
        Iterator it43;
        Double averageSeatedPower;
        double dDoubleValue54;
        Iterator it44;
        Object next23;
        Double maxSeatedPower;
        double dDoubleValue55;
        Object next24;
        Double maxSeatedPower2;
        double dDoubleValue56;
        x0 x0Var12;
        Double maxSeatedPower3;
        Iterator it45;
        Double averageStandingPower;
        double dDoubleValue57;
        Iterator it46;
        Object next25;
        Double maxStandingPower;
        double dDoubleValue58;
        Object next26;
        Double maxStandingPower2;
        double dDoubleValue59;
        x0 x0Var13;
        Double maxStandingPower3;
        Iterator it47;
        Double averageStepSpeedLoss;
        double dDoubleValue60;
        Iterator it48;
        Double averageStepSpeedLossPercent;
        double dDoubleValue61;
        Iterator it49;
        Double strideLength;
        double dDoubleValue62;
        Iterator it50;
        Double averageTemperature;
        double dDoubleValue63;
        Iterator it51;
        Double calories;
        double dDoubleValue64;
        Iterator it52;
        Double averageFlow;
        double dDoubleValue65;
        Iterator it53;
        Double grit;
        double dDoubleValue66;
        Iterator it54;
        int i16;
        Integer jumpCount;
        int iIntValue;
        Iterator it55;
        Double groundContactTime;
        double dDoubleValue67;
        Iterator it56;
        Double groundContactBalanceLeft;
        double dDoubleValue68;
        Iterator it57;
        Double verticalOscillation;
        double dDoubleValue69;
        Iterator it58;
        Double averageVerticalRatio;
        double dDoubleValue70;
        b.a aVar3 = aVar;
        aVar3.getClass();
        ArrayList arrayList2 = oVar.f120194b;
        List<Integer> list2 = aVar3.f114266g;
        Double d18 = aVar3.f114263d;
        Double d19 = aVar3.f114264e;
        Double d24 = aVar3.f114260a;
        Double d25 = aVar3.f114261b;
        Double d26 = aVar3.f114262c;
        int size = list2 != null ? list2.size() : 0;
        ArrayList arrayList3 = new ArrayList();
        Iterator it59 = list.iterator();
        while (it59.hasNext()) {
            x0 x0Var14 = (x0) it59.next();
            if (list2 != null && list2.contains(Integer.valueOf(x0Var14.getLapIndex()))) {
                arrayList3.add(x0Var14);
            }
        }
        o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
        int size2 = arrayList2.size();
        int i17 = 0;
        while (i17 < size2) {
            int i18 = size2;
            mq.l lVar = (mq.l) arrayList.get(i17);
            ArrayList arrayList4 = arrayList3;
            String string = "";
            if (lVar instanceof mq.a) {
                mq.a aVar4 = (mq.a) lVar;
                g0.a aVar5 = g0.f29436c;
                String str = aVar3.f114265f;
                aVar5.getClass();
                g0 g0VarA = g0.a.a(str);
                if (!z0.Q(jVar.getF165810e())) {
                    aVar2 = aVar4;
                    if (!z0.b(am.x0.f4297k1, jVar.getF165810e())) {
                        if (!z0.b(am.x0.f4301l1, jVar.getF165810e())) {
                            z14 = false;
                        }
                    }
                    z15 = z14;
                    zB = z0.b(am.x0.I0, jVar.getF165810e());
                    d14 = 0.0d;
                    switch (a.f114282a[aVar2.ordinal()]) {
                        case 1:
                        case 10:
                            if (g0VarA == g0.ACTIVE) {
                                string = context.getString(g0VarA.f29447b);
                            } else if (z0.b(am.x0.f4308n, jVar.getF165810e())) {
                                string = context.getString(R.string.lbl_run);
                            } else if (z0.b(am.x0.f4312o, jVar.getF165810e())) {
                                string = context.getString(g0VarA.f29447b);
                            } else {
                                string = context.getString(R.string.lbl_bike);
                            }
                            break;
                        case 2:
                        case 3:
                            string = aq.a.u(i15);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 99:
                            if (size <= 1) {
                                string = aq.a.u(jVar.f165807b);
                            }
                            break;
                        case 8:
                        case 9:
                        case 13:
                        case 20:
                        case 22:
                        case 24:
                        case 27:
                        case 40:
                        case 47:
                        case 48:
                        case 84:
                        case 85:
                        case 87:
                        case 91:
                        case 96:
                        case 97:
                        case 98:
                        default:
                            string = context.getString(R.string.no_value);
                            break;
                        case 11:
                        case 12:
                            string = aq.a.W(context, d18);
                            break;
                        case 14:
                            string = aq.a.W(context, Double.valueOf(d(i14, list)));
                            break;
                        case 15:
                            if (d18 != null) {
                                dDoubleValue = d18.doubleValue();
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            string = aq.a.W(context, Double.valueOf(dDoubleValue - (d19 != null ? d19.doubleValue() : 0.0d)));
                            break;
                        case 16:
                        case 17:
                            string = aq.a.W(context, d19);
                            break;
                        case 18:
                        case 19:
                            if (z0.Q(jVar.getF165810e())) {
                                string = aq.a.G(context, d26);
                            } else if (!z0.b(am.x0.f4297k1, jVar.getF165810e())) {
                                string = aq.a.r(context, d26);
                            } else if (z0.b(am.x0.f4301l1, jVar.getF165810e())) {
                                string = aq.a.r(context, d26);
                            } else if (zB) {
                                string = aq.a.d0(context, d26);
                            } else {
                                string = aq.a.f(context, d26);
                            }
                            break;
                        case 21:
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                                elevationGain = ((x0) it.next()).getElevationGain();
                                if (elevationGain != null) {
                                    dDoubleValue2 = elevationGain.doubleValue();
                                } else {
                                    dDoubleValue2 = Double.NaN;
                                }
                                d14 += dDoubleValue2;
                            }
                            string = aq.a.j(context, Double.valueOf(d14), o0VarG);
                            break;
                        case 23:
                            it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                elevationLoss = ((x0) it3.next()).getElevationLoss();
                                if (elevationLoss != null) {
                                    dDoubleValue3 = elevationLoss.doubleValue();
                                } else {
                                    dDoubleValue3 = Double.NaN;
                                }
                                d14 += dDoubleValue3;
                            }
                            string = aq.a.j(context, Double.valueOf(d14), o0VarG);
                            break;
                        case 25:
                        case 26:
                            string = aq.a.K(context, d24, jVar.getF165809d());
                            break;
                        case 28:
                            string = aq.a.K(context, d25, jVar.getF165809d());
                            break;
                        case 29:
                        case 30:
                        case 31:
                            it4 = arrayList4.iterator();
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (it4.hasNext()) {
                                    maxSpeed = ((x0) next).getMaxSpeed();
                                    if (maxSpeed != null) {
                                        dDoubleValue4 = maxSpeed.doubleValue();
                                    } else {
                                        dDoubleValue4 = Double.NaN;
                                    }
                                    while (true) {
                                        next2 = it4.next();
                                        maxSpeed2 = ((x0) next2).getMaxSpeed();
                                        if (maxSpeed2 != null) {
                                            dDoubleValue5 = maxSpeed2.doubleValue();
                                        } else {
                                            dDoubleValue5 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue4, dDoubleValue5) < 0) {
                                            dDoubleValue4 = dDoubleValue5;
                                            next = next2;
                                        } else {
                                            next = next;
                                        }
                                        if (!it4.hasNext()) {
                                            it4 = it4;
                                        }
                                    }
                                }
                            } else {
                                next = null;
                            }
                            x0Var = (x0) next;
                            if (x0Var == null && (maxSpeed3 = x0Var.getMaxSpeed()) != null) {
                                string = aq.a.K(context, Double.valueOf(maxSpeed3.doubleValue()), jVar.getF165809d());
                            } else {
                                string = null;
                            }
                            break;
                        case 32:
                            it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                averageGradeAdjustedSpeed = ((x0) it5.next()).getAverageGradeAdjustedSpeed();
                                if (averageGradeAdjustedSpeed != null) {
                                    dDoubleValue6 = averageGradeAdjustedSpeed.doubleValue();
                                } else {
                                    dDoubleValue6 = Double.NaN;
                                }
                                d14 += dDoubleValue6;
                            }
                            string = aq.a.D(context, Double.valueOf(d14 / ((double) size)), jVar.getF165809d());
                            break;
                        case 33:
                            if (z15) {
                                string = aq.a.H(context, d24);
                            } else {
                                string = aq.a.D(context, d24, jVar.getF165809d());
                            }
                            break;
                        case 34:
                            string = aq.a.D(context, d25, jVar.getF165809d());
                            break;
                        case 35:
                            it6 = arrayList4.iterator();
                            if (it6.hasNext()) {
                                next3 = it6.next();
                                if (it6.hasNext()) {
                                    maxSpeed4 = ((x0) next3).getMaxSpeed();
                                    if (maxSpeed4 != null) {
                                        dDoubleValue7 = maxSpeed4.doubleValue();
                                    } else {
                                        dDoubleValue7 = Double.NaN;
                                    }
                                    while (true) {
                                        next4 = it6.next();
                                        maxSpeed5 = ((x0) next4).getMaxSpeed();
                                        if (maxSpeed5 != null) {
                                            dDoubleValue8 = maxSpeed5.doubleValue();
                                        } else {
                                            dDoubleValue8 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue7, dDoubleValue8) < 0) {
                                            dDoubleValue7 = dDoubleValue8;
                                            next3 = next4;
                                        } else {
                                            next3 = next3;
                                        }
                                        if (!it6.hasNext()) {
                                            it6 = it6;
                                        }
                                    }
                                }
                            } else {
                                next3 = null;
                            }
                            x0Var2 = (x0) next3;
                            if (x0Var2 == null && (maxSpeed6 = x0Var2.getMaxSpeed()) != null) {
                                double dDoubleValue71 = maxSpeed6.doubleValue();
                                string = z15 ? aq.a.H(context, Double.valueOf(dDoubleValue71)) : aq.a.D(context, Double.valueOf(dDoubleValue71), jVar.getF165809d());
                            } else {
                                string = null;
                            }
                            break;
                        case 36:
                        case 37:
                            it7 = arrayList4.iterator();
                            while (it7.hasNext()) {
                                averageHR = ((x0) it7.next()).getAverageHR();
                                if (averageHR != null) {
                                    dDoubleValue9 = averageHR.doubleValue();
                                } else {
                                    dDoubleValue9 = Double.NaN;
                                }
                                d14 += dDoubleValue9;
                            }
                            string = aq.a.q(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 38:
                        case 39:
                            it8 = arrayList4.iterator();
                            if (it8.hasNext()) {
                                next5 = it8.next();
                                if (it8.hasNext()) {
                                    maxHR = ((x0) next5).getMaxHR();
                                    if (maxHR != null) {
                                        dDoubleValue10 = maxHR.doubleValue();
                                    } else {
                                        dDoubleValue10 = Double.NaN;
                                    }
                                    while (true) {
                                        next6 = it8.next();
                                        maxHR2 = ((x0) next6).getMaxHR();
                                        if (maxHR2 != null) {
                                            dDoubleValue11 = maxHR2.doubleValue();
                                        } else {
                                            dDoubleValue11 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue10, dDoubleValue11) < 0) {
                                            dDoubleValue10 = dDoubleValue11;
                                            next5 = next6;
                                        } else {
                                            next5 = next5;
                                        }
                                        if (!it8.hasNext()) {
                                            it8 = it8;
                                        }
                                    }
                                }
                            } else {
                                next5 = null;
                            }
                            x0Var3 = (x0) next5;
                            if (x0Var3 == null && (maxHR3 = x0Var3.getMaxHR()) != null) {
                                string = aq.a.q(context, Double.valueOf(maxHR3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 41:
                            it9 = arrayList4.iterator();
                            while (it9.hasNext()) {
                                averageRunCadence = ((x0) it9.next()).getAverageRunCadence();
                                if (averageRunCadence != null) {
                                    dDoubleValue12 = averageRunCadence.doubleValue();
                                } else {
                                    dDoubleValue12 = Double.NaN;
                                }
                                d14 += dDoubleValue12;
                            }
                            string = aq.a.I(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 42:
                            it10 = arrayList4.iterator();
                            if (it10.hasNext()) {
                                next7 = it10.next();
                                if (it10.hasNext()) {
                                    maxRunCadence = ((x0) next7).getMaxRunCadence();
                                    if (maxRunCadence != null) {
                                        dDoubleValue13 = maxRunCadence.doubleValue();
                                    } else {
                                        dDoubleValue13 = Double.NaN;
                                    }
                                    while (true) {
                                        next8 = it10.next();
                                        maxRunCadence2 = ((x0) next8).getMaxRunCadence();
                                        if (maxRunCadence2 != null) {
                                            dDoubleValue14 = maxRunCadence2.doubleValue();
                                        } else {
                                            dDoubleValue14 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue13, dDoubleValue14) < 0) {
                                            dDoubleValue13 = dDoubleValue14;
                                            next7 = next8;
                                        } else {
                                            next7 = next7;
                                        }
                                        if (!it10.hasNext()) {
                                            it10 = it10;
                                        }
                                    }
                                }
                            } else {
                                next7 = null;
                            }
                            x0Var4 = (x0) next7;
                            if (x0Var4 == null && (maxRunCadence3 = x0Var4.getMaxRunCadence()) != null) {
                                string = aq.a.I(context, Double.valueOf(maxRunCadence3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 43:
                        case 44:
                            it11 = arrayList4.iterator();
                            while (it11.hasNext()) {
                                averageBikeCadence = ((x0) it11.next()).getAverageBikeCadence();
                                if (averageBikeCadence != null) {
                                    dDoubleValue15 = averageBikeCadence.doubleValue();
                                } else {
                                    dDoubleValue15 = Double.NaN;
                                }
                                d14 += dDoubleValue15;
                            }
                            string = aq.a.c(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 45:
                        case 46:
                            it12 = arrayList4.iterator();
                            if (it12.hasNext()) {
                                next9 = it12.next();
                                if (it12.hasNext()) {
                                    maxBikeCadence = ((x0) next9).getMaxBikeCadence();
                                    if (maxBikeCadence != null) {
                                        dDoubleValue16 = maxBikeCadence.doubleValue();
                                    } else {
                                        dDoubleValue16 = Double.NaN;
                                    }
                                    while (true) {
                                        next10 = it12.next();
                                        maxBikeCadence2 = ((x0) next10).getMaxBikeCadence();
                                        if (maxBikeCadence2 != null) {
                                            dDoubleValue17 = maxBikeCadence2.doubleValue();
                                        } else {
                                            dDoubleValue17 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue16, dDoubleValue17) < 0) {
                                            dDoubleValue16 = dDoubleValue17;
                                            next9 = next10;
                                        } else {
                                            next9 = next9;
                                        }
                                        if (!it12.hasNext()) {
                                            it12 = it12;
                                        }
                                    }
                                }
                            } else {
                                next9 = null;
                            }
                            x0Var5 = (x0) next9;
                            if (x0Var5 == null && (maxBikeCadence3 = x0Var5.getMaxBikeCadence()) != null) {
                                string = aq.a.c(context, Double.valueOf(maxBikeCadence3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 49:
                            it13 = arrayList4.iterator();
                            while (it13.hasNext()) {
                                normalizedPower = ((x0) it13.next()).getNormalizedPower();
                                if (normalizedPower != null) {
                                    dDoubleValue18 = normalizedPower.doubleValue();
                                } else {
                                    dDoubleValue18 = Double.NaN;
                                }
                                d14 += dDoubleValue18;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 50:
                            it14 = arrayList4.iterator();
                            d15 = 0.0d;
                            while (it14.hasNext()) {
                                leftBalance = ((x0) it14.next()).getLeftBalance();
                                if (leftBalance != null) {
                                    dDoubleValue20 = leftBalance.doubleValue();
                                } else {
                                    dDoubleValue20 = Double.NaN;
                                }
                                d15 += dDoubleValue20;
                            }
                            double d27 = size;
                            Double dValueOf = Double.valueOf(d15 / d27);
                            it15 = arrayList4.iterator();
                            while (it15.hasNext()) {
                                rightBalance = ((x0) it15.next()).getRightBalance();
                                if (rightBalance != null) {
                                    dDoubleValue19 = rightBalance.doubleValue();
                                } else {
                                    dDoubleValue19 = Double.NaN;
                                }
                                d14 += dDoubleValue19;
                            }
                            string = aq.a.e(context, dValueOf, Double.valueOf(d14 / d27));
                            break;
                        case 51:
                            it16 = arrayList4.iterator();
                            d16 = 0.0d;
                            while (it16.hasNext()) {
                                leftTorqueEffectiveness = ((x0) it16.next()).getLeftTorqueEffectiveness();
                                if (leftTorqueEffectiveness != null) {
                                    dDoubleValue22 = leftTorqueEffectiveness.doubleValue();
                                } else {
                                    dDoubleValue22 = Double.NaN;
                                }
                                d16 += dDoubleValue22;
                            }
                            double d28 = size;
                            Double dValueOf2 = Double.valueOf(d16 / d28);
                            it17 = arrayList4.iterator();
                            while (it17.hasNext()) {
                                rightTorqueEffectiveness = ((x0) it17.next()).getRightTorqueEffectiveness();
                                if (rightTorqueEffectiveness != null) {
                                    dDoubleValue21 = rightTorqueEffectiveness.doubleValue();
                                } else {
                                    dDoubleValue21 = Double.NaN;
                                }
                                d14 += dDoubleValue21;
                            }
                            string = aq.a.e(context, dValueOf2, Double.valueOf(d14 / d28));
                            break;
                        case 52:
                            it18 = arrayList4.iterator();
                            d17 = 0.0d;
                            while (it18.hasNext()) {
                                leftPedalSmoothness = ((x0) it18.next()).getLeftPedalSmoothness();
                                if (leftPedalSmoothness != null) {
                                    dDoubleValue24 = leftPedalSmoothness.doubleValue();
                                } else {
                                    dDoubleValue24 = Double.NaN;
                                }
                                d17 += dDoubleValue24;
                            }
                            double d29 = size;
                            Double dValueOf3 = Double.valueOf(d17 / d29);
                            it19 = arrayList4.iterator();
                            while (it19.hasNext()) {
                                rightPedalSmoothness = ((x0) it19.next()).getRightPedalSmoothness();
                                if (rightPedalSmoothness != null) {
                                    dDoubleValue23 = rightPedalSmoothness.doubleValue();
                                } else {
                                    dDoubleValue23 = Double.NaN;
                                }
                                d14 += dDoubleValue23;
                            }
                            string = aq.a.e(context, dValueOf3, Double.valueOf(d14 / d29));
                            break;
                        case 53:
                            it20 = arrayList4.iterator();
                            while (it20.hasNext()) {
                                averagePower = ((x0) it20.next()).getAveragePower();
                                if (averagePower != null) {
                                    dDoubleValue25 = averagePower.doubleValue();
                                } else {
                                    dDoubleValue25 = Double.NaN;
                                }
                                d14 += dDoubleValue25;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 54:
                            it21 = arrayList4.iterator();
                            if (it21.hasNext()) {
                                next11 = it21.next();
                                if (it21.hasNext()) {
                                    maxPower = ((x0) next11).getMaxPower();
                                    if (maxPower != null) {
                                        dDoubleValue26 = maxPower.doubleValue();
                                    } else {
                                        dDoubleValue26 = Double.NaN;
                                    }
                                    while (true) {
                                        next12 = it21.next();
                                        maxPower2 = ((x0) next12).getMaxPower();
                                        if (maxPower2 != null) {
                                            dDoubleValue27 = maxPower2.doubleValue();
                                        } else {
                                            dDoubleValue27 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue26, dDoubleValue27) < 0) {
                                            dDoubleValue26 = dDoubleValue27;
                                            next11 = next12;
                                        } else {
                                            next11 = next11;
                                        }
                                        if (!it21.hasNext()) {
                                            it21 = it21;
                                        }
                                    }
                                }
                            } else {
                                next11 = null;
                            }
                            x0Var6 = (x0) next11;
                            if (x0Var6 == null && (maxPower3 = x0Var6.getMaxPower()) != null) {
                                string = aq.a.E(context, Double.valueOf(maxPower3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 55:
                            it22 = arrayList4.iterator();
                            while (it22.hasNext()) {
                                avgBikeForce = ((x0) it22.next()).getAvgBikeForce();
                                if (avgBikeForce != null) {
                                    dDoubleValue28 = avgBikeForce.doubleValue();
                                } else {
                                    dDoubleValue28 = Double.NaN;
                                }
                                d14 += dDoubleValue28;
                            }
                            string = aq.a.m(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 56:
                            it23 = arrayList4.iterator();
                            if (it23.hasNext()) {
                                next13 = it23.next();
                                if (it23.hasNext()) {
                                    maxBikeForce = ((x0) next13).getMaxBikeForce();
                                    if (maxBikeForce != null) {
                                        dDoubleValue29 = maxBikeForce.doubleValue();
                                    } else {
                                        dDoubleValue29 = Double.NaN;
                                    }
                                    while (true) {
                                        next14 = it23.next();
                                        maxBikeForce2 = ((x0) next14).getMaxBikeForce();
                                        if (maxBikeForce2 != null) {
                                            dDoubleValue30 = maxBikeForce2.doubleValue();
                                        } else {
                                            dDoubleValue30 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue29, dDoubleValue30) < 0) {
                                            dDoubleValue29 = dDoubleValue30;
                                            next13 = next14;
                                        } else {
                                            next13 = next13;
                                        }
                                        if (!it23.hasNext()) {
                                            it23 = it23;
                                        }
                                    }
                                }
                            } else {
                                next13 = null;
                            }
                            x0Var7 = (x0) next13;
                            if (x0Var7 == null && (maxBikeForce3 = x0Var7.getMaxBikeForce()) != null) {
                                string = aq.a.m(context, Double.valueOf(maxBikeForce3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 57:
                            it24 = arrayList4.iterator();
                            while (it24.hasNext()) {
                                normalizedForce = ((x0) it24.next()).getNormalizedForce();
                                if (normalizedForce != null) {
                                    dDoubleValue31 = normalizedForce.doubleValue();
                                } else {
                                    dDoubleValue31 = Double.NaN;
                                }
                                d14 += dDoubleValue31;
                            }
                            string = aq.a.m(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 58:
                            it25 = arrayList4.iterator();
                            while (it25.hasNext()) {
                                averagePower2 = ((x0) it25.next()).getAveragePower();
                                if (averagePower2 != null) {
                                    dDoubleValue32 = averagePower2.doubleValue();
                                } else {
                                    dDoubleValue32 = Double.NaN;
                                }
                                d14 += dDoubleValue32;
                            }
                            double d34 = size;
                            Double dValueOf4 = Double.valueOf(d14 / d34);
                            l.f68084a.getClass();
                            string = aq.a.F(context, dValueOf4, l.a.a().v3() * d34);
                            break;
                        case 59:
                            it26 = arrayList4.iterator();
                            if (it26.hasNext()) {
                                next15 = it26.next();
                                if (it26.hasNext()) {
                                    maxPower4 = ((x0) next15).getMaxPower();
                                    if (maxPower4 != null) {
                                        dDoubleValue33 = maxPower4.doubleValue();
                                    } else {
                                        dDoubleValue33 = Double.NaN;
                                    }
                                    while (true) {
                                        next16 = it26.next();
                                        maxPower5 = ((x0) next16).getMaxPower();
                                        if (maxPower5 != null) {
                                            dDoubleValue34 = maxPower5.doubleValue();
                                        } else {
                                            dDoubleValue34 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue33, dDoubleValue34) < 0) {
                                            dDoubleValue33 = dDoubleValue34;
                                            next15 = next16;
                                        } else {
                                            next15 = next15;
                                        }
                                        if (!it26.hasNext()) {
                                            it26 = it26;
                                        }
                                    }
                                }
                            } else {
                                next15 = null;
                            }
                            x0Var8 = (x0) next15;
                            if (x0Var8 == null && (maxPower6 = x0Var8.getMaxPower()) != null) {
                                Double dValueOf5 = Double.valueOf(maxPower6.doubleValue());
                                l.f68084a.getClass();
                                string = aq.a.F(context, dValueOf5, l.a.a().v3());
                            } else {
                                string = null;
                            }
                            break;
                        case 60:
                            it27 = arrayList4.iterator();
                            while (it27.hasNext()) {
                                seatedTime = ((x0) it27.next()).getSeatedTime();
                                if (seatedTime != null) {
                                    dDoubleValue35 = seatedTime.doubleValue();
                                } else {
                                    dDoubleValue35 = Double.NaN;
                                }
                                d14 += dDoubleValue35;
                            }
                            string = aq.a.W(context, Double.valueOf(d14));
                            break;
                        case 61:
                            it28 = arrayList4.iterator();
                            while (it28.hasNext()) {
                                standingTime = ((x0) it28.next()).getStandingTime();
                                if (standingTime != null) {
                                    dDoubleValue36 = standingTime.doubleValue();
                                } else {
                                    dDoubleValue36 = Double.NaN;
                                }
                                d14 += dDoubleValue36;
                            }
                            string = aq.a.W(context, Double.valueOf(d14));
                            break;
                        case 62:
                            it29 = arrayList4.iterator();
                            while (it29.hasNext()) {
                                avgRiderTorsoAngle = ((x0) it29.next()).getAvgRiderTorsoAngle();
                                if (avgRiderTorsoAngle != null) {
                                    dDoubleValue37 = avgRiderTorsoAngle.doubleValue();
                                } else {
                                    dDoubleValue37 = Double.NaN;
                                }
                                d14 += dDoubleValue37;
                            }
                            string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 63:
                            it30 = arrayList4.iterator();
                            while (it30.hasNext()) {
                                avgAeroTorsoAngle = ((x0) it30.next()).getAvgAeroTorsoAngle();
                                if (avgAeroTorsoAngle != null) {
                                    dDoubleValue38 = avgAeroTorsoAngle.doubleValue();
                                } else {
                                    dDoubleValue38 = Double.NaN;
                                }
                                d14 += dDoubleValue38;
                            }
                            string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 64:
                            it31 = arrayList4.iterator();
                            while (it31.hasNext()) {
                                avgLoweredTorsoAngle = ((x0) it31.next()).getAvgLoweredTorsoAngle();
                                if (avgLoweredTorsoAngle != null) {
                                    dDoubleValue39 = avgLoweredTorsoAngle.doubleValue();
                                } else {
                                    dDoubleValue39 = Double.NaN;
                                }
                                d14 += dDoubleValue39;
                            }
                            string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 65:
                            it32 = arrayList4.iterator();
                            while (it32.hasNext()) {
                                avgUprightTorsoAngle = ((x0) it32.next()).getAvgUprightTorsoAngle();
                                if (avgUprightTorsoAngle != null) {
                                    dDoubleValue40 = avgUprightTorsoAngle.doubleValue();
                                } else {
                                    dDoubleValue40 = Double.NaN;
                                }
                                d14 += dDoubleValue40;
                            }
                            string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 66:
                            it33 = arrayList4.iterator();
                            while (it33.hasNext()) {
                                avgStandingTorsoAngle = ((x0) it33.next()).getAvgStandingTorsoAngle();
                                if (avgStandingTorsoAngle != null) {
                                    dDoubleValue41 = avgStandingTorsoAngle.doubleValue();
                                } else {
                                    dDoubleValue41 = Double.NaN;
                                }
                                d14 += dDoubleValue41;
                            }
                            string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 67:
                            it34 = arrayList4.iterator();
                            while (it34.hasNext()) {
                                aeroTime = ((x0) it34.next()).getAeroTime();
                                if (aeroTime != null) {
                                    dDoubleValue42 = aeroTime.doubleValue();
                                } else {
                                    dDoubleValue42 = Double.NaN;
                                }
                                d14 += dDoubleValue42;
                            }
                            string = aq.a.W(context, Double.valueOf(d14));
                            break;
                        case 68:
                            it35 = arrayList4.iterator();
                            while (it35.hasNext()) {
                                loweredTime = ((x0) it35.next()).getLoweredTime();
                                if (loweredTime != null) {
                                    dDoubleValue43 = loweredTime.doubleValue();
                                } else {
                                    dDoubleValue43 = Double.NaN;
                                }
                                d14 += dDoubleValue43;
                            }
                            string = aq.a.W(context, Double.valueOf(d14));
                            break;
                        case 69:
                            it36 = arrayList4.iterator();
                            while (it36.hasNext()) {
                                uprightTime = ((x0) it36.next()).getUprightTime();
                                if (uprightTime != null) {
                                    dDoubleValue44 = uprightTime.doubleValue();
                                } else {
                                    dDoubleValue44 = Double.NaN;
                                }
                                d14 += dDoubleValue44;
                            }
                            string = aq.a.W(context, Double.valueOf(d14));
                            break;
                        case 70:
                            it37 = arrayList4.iterator();
                            while (it37.hasNext()) {
                                avgAeroPower = ((x0) it37.next()).getAvgAeroPower();
                                if (avgAeroPower != null) {
                                    dDoubleValue45 = avgAeroPower.doubleValue();
                                } else {
                                    dDoubleValue45 = Double.NaN;
                                }
                                d14 += dDoubleValue45;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 71:
                            it38 = arrayList4.iterator();
                            if (it38.hasNext()) {
                                next17 = it38.next();
                                if (it38.hasNext()) {
                                    maxAeroPower = ((x0) next17).getMaxAeroPower();
                                    if (maxAeroPower != null) {
                                        dDoubleValue46 = maxAeroPower.doubleValue();
                                    } else {
                                        dDoubleValue46 = Double.NaN;
                                    }
                                    while (true) {
                                        next18 = it38.next();
                                        maxAeroPower2 = ((x0) next18).getMaxAeroPower();
                                        if (maxAeroPower2 != null) {
                                            dDoubleValue47 = maxAeroPower2.doubleValue();
                                        } else {
                                            dDoubleValue47 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue46, dDoubleValue47) < 0) {
                                            dDoubleValue46 = dDoubleValue47;
                                            next17 = next18;
                                        } else {
                                            next17 = next17;
                                        }
                                        if (!it38.hasNext()) {
                                            it38 = it38;
                                        }
                                    }
                                }
                            } else {
                                next17 = null;
                            }
                            x0Var9 = (x0) next17;
                            if (x0Var9 == null && (maxAeroPower3 = x0Var9.getMaxAeroPower()) != null) {
                                string = aq.a.E(context, Double.valueOf(maxAeroPower3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 72:
                            it39 = arrayList4.iterator();
                            while (it39.hasNext()) {
                                avgLoweredPower = ((x0) it39.next()).getAvgLoweredPower();
                                if (avgLoweredPower != null) {
                                    dDoubleValue48 = avgLoweredPower.doubleValue();
                                } else {
                                    dDoubleValue48 = Double.NaN;
                                }
                                d14 += dDoubleValue48;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 73:
                            it40 = arrayList4.iterator();
                            if (it40.hasNext()) {
                                next19 = it40.next();
                                if (it40.hasNext()) {
                                    maxLoweredPower = ((x0) next19).getMaxLoweredPower();
                                    if (maxLoweredPower != null) {
                                        dDoubleValue49 = maxLoweredPower.doubleValue();
                                    } else {
                                        dDoubleValue49 = Double.NaN;
                                    }
                                    while (true) {
                                        next20 = it40.next();
                                        maxLoweredPower2 = ((x0) next20).getMaxLoweredPower();
                                        if (maxLoweredPower2 != null) {
                                            dDoubleValue50 = maxLoweredPower2.doubleValue();
                                        } else {
                                            dDoubleValue50 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue49, dDoubleValue50) < 0) {
                                            dDoubleValue49 = dDoubleValue50;
                                            next19 = next20;
                                        } else {
                                            next19 = next19;
                                        }
                                        if (!it40.hasNext()) {
                                            it40 = it40;
                                        }
                                    }
                                }
                            } else {
                                next19 = null;
                            }
                            x0Var10 = (x0) next19;
                            if (x0Var10 == null && (maxLoweredPower3 = x0Var10.getMaxLoweredPower()) != null) {
                                string = aq.a.E(context, Double.valueOf(maxLoweredPower3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 74:
                            it41 = arrayList4.iterator();
                            while (it41.hasNext()) {
                                avgUprightPower = ((x0) it41.next()).getAvgUprightPower();
                                if (avgUprightPower != null) {
                                    dDoubleValue51 = avgUprightPower.doubleValue();
                                } else {
                                    dDoubleValue51 = Double.NaN;
                                }
                                d14 += dDoubleValue51;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 75:
                            it42 = arrayList4.iterator();
                            if (it42.hasNext()) {
                                next21 = it42.next();
                                if (it42.hasNext()) {
                                    maxUprightPower = ((x0) next21).getMaxUprightPower();
                                    if (maxUprightPower != null) {
                                        dDoubleValue52 = maxUprightPower.doubleValue();
                                    } else {
                                        dDoubleValue52 = Double.NaN;
                                    }
                                    while (true) {
                                        next22 = it42.next();
                                        maxUprightPower2 = ((x0) next22).getMaxUprightPower();
                                        if (maxUprightPower2 != null) {
                                            dDoubleValue53 = maxUprightPower2.doubleValue();
                                        } else {
                                            dDoubleValue53 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue52, dDoubleValue53) < 0) {
                                            dDoubleValue52 = dDoubleValue53;
                                            next21 = next22;
                                        } else {
                                            next21 = next21;
                                        }
                                        if (!it42.hasNext()) {
                                            it42 = it42;
                                        }
                                    }
                                }
                            } else {
                                next21 = null;
                            }
                            x0Var11 = (x0) next21;
                            if (x0Var11 == null && (maxUprightPower3 = x0Var11.getMaxUprightPower()) != null) {
                                string = aq.a.E(context, Double.valueOf(maxUprightPower3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 76:
                            it43 = arrayList4.iterator();
                            while (it43.hasNext()) {
                                averageSeatedPower = ((x0) it43.next()).getAverageSeatedPower();
                                if (averageSeatedPower != null) {
                                    dDoubleValue54 = averageSeatedPower.doubleValue();
                                } else {
                                    dDoubleValue54 = Double.NaN;
                                }
                                d14 += dDoubleValue54;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 77:
                            it44 = arrayList4.iterator();
                            if (it44.hasNext()) {
                                next23 = it44.next();
                                if (it44.hasNext()) {
                                    maxSeatedPower = ((x0) next23).getMaxSeatedPower();
                                    if (maxSeatedPower != null) {
                                        dDoubleValue55 = maxSeatedPower.doubleValue();
                                    } else {
                                        dDoubleValue55 = Double.NaN;
                                    }
                                    while (true) {
                                        next24 = it44.next();
                                        maxSeatedPower2 = ((x0) next24).getMaxSeatedPower();
                                        if (maxSeatedPower2 != null) {
                                            dDoubleValue56 = maxSeatedPower2.doubleValue();
                                        } else {
                                            dDoubleValue56 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue55, dDoubleValue56) < 0) {
                                            dDoubleValue55 = dDoubleValue56;
                                            next23 = next24;
                                        } else {
                                            next23 = next23;
                                        }
                                        if (!it44.hasNext()) {
                                            it44 = it44;
                                        }
                                    }
                                }
                            } else {
                                next23 = null;
                            }
                            x0Var12 = (x0) next23;
                            if (x0Var12 == null && (maxSeatedPower3 = x0Var12.getMaxSeatedPower()) != null) {
                                string = aq.a.E(context, Double.valueOf(maxSeatedPower3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 78:
                            it45 = arrayList4.iterator();
                            while (it45.hasNext()) {
                                averageStandingPower = ((x0) it45.next()).getAverageStandingPower();
                                if (averageStandingPower != null) {
                                    dDoubleValue57 = averageStandingPower.doubleValue();
                                } else {
                                    dDoubleValue57 = Double.NaN;
                                }
                                d14 += dDoubleValue57;
                            }
                            string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 79:
                            it46 = arrayList4.iterator();
                            if (it46.hasNext()) {
                                next25 = it46.next();
                                if (it46.hasNext()) {
                                    maxStandingPower = ((x0) next25).getMaxStandingPower();
                                    if (maxStandingPower != null) {
                                        dDoubleValue58 = maxStandingPower.doubleValue();
                                    } else {
                                        dDoubleValue58 = Double.NaN;
                                    }
                                    while (true) {
                                        next26 = it46.next();
                                        maxStandingPower2 = ((x0) next26).getMaxStandingPower();
                                        if (maxStandingPower2 != null) {
                                            dDoubleValue59 = maxStandingPower2.doubleValue();
                                        } else {
                                            dDoubleValue59 = Double.NaN;
                                        }
                                        if (Double.compare(dDoubleValue58, dDoubleValue59) < 0) {
                                            dDoubleValue58 = dDoubleValue59;
                                            next25 = next26;
                                        }
                                        if (!it46.hasNext()) {
                                            it46 = it46;
                                        }
                                    }
                                }
                            } else {
                                next25 = null;
                            }
                            x0Var13 = (x0) next25;
                            if (x0Var13 == null && (maxStandingPower3 = x0Var13.getMaxStandingPower()) != null) {
                                string = aq.a.E(context, Double.valueOf(maxStandingPower3.doubleValue()));
                            } else {
                                string = null;
                            }
                            break;
                        case 80:
                            it47 = arrayList4.iterator();
                            while (it47.hasNext()) {
                                averageStepSpeedLoss = ((x0) it47.next()).getAverageStepSpeedLoss();
                                if (averageStepSpeedLoss != null) {
                                    dDoubleValue60 = averageStepSpeedLoss.doubleValue();
                                } else {
                                    dDoubleValue60 = Double.NaN;
                                }
                                d14 += dDoubleValue60;
                            }
                            string = aq.a.M(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 81:
                            it48 = arrayList4.iterator();
                            while (it48.hasNext()) {
                                averageStepSpeedLossPercent = ((x0) it48.next()).getAverageStepSpeedLossPercent();
                                if (averageStepSpeedLossPercent != null) {
                                    dDoubleValue61 = averageStepSpeedLossPercent.doubleValue();
                                } else {
                                    dDoubleValue61 = Double.NaN;
                                }
                                d14 += dDoubleValue61;
                            }
                            string = aq.a.N(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 82:
                            it49 = arrayList4.iterator();
                            while (it49.hasNext()) {
                                strideLength = ((x0) it49.next()).getStrideLength();
                                if (strideLength != null) {
                                    dDoubleValue62 = strideLength.doubleValue();
                                } else {
                                    dDoubleValue62 = Double.NaN;
                                }
                                d14 += dDoubleValue62;
                            }
                            string = aq.a.O(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 83:
                            it50 = arrayList4.iterator();
                            while (it50.hasNext()) {
                                averageTemperature = ((x0) it50.next()).getAverageTemperature();
                                if (averageTemperature != null) {
                                    dDoubleValue63 = averageTemperature.doubleValue();
                                } else {
                                    dDoubleValue63 = Double.NaN;
                                }
                                d14 += dDoubleValue63;
                            }
                            string = aq.a.V(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 86:
                            it51 = arrayList4.iterator();
                            while (it51.hasNext()) {
                                calories = ((x0) it51.next()).getCalories();
                                if (calories != null) {
                                    dDoubleValue64 = calories.doubleValue();
                                } else {
                                    dDoubleValue64 = Double.NaN;
                                }
                                d14 += dDoubleValue64;
                            }
                            string = aq.a.d(context, Double.valueOf(d14));
                            break;
                        case 88:
                            l3.a aVar6 = l3.f23124b;
                            it52 = arrayList4.iterator();
                            while (it52.hasNext()) {
                                averageFlow = ((x0) it52.next()).getAverageFlow();
                                if (averageFlow != null) {
                                    dDoubleValue65 = averageFlow.doubleValue();
                                } else {
                                    dDoubleValue65 = Double.NaN;
                                }
                                d14 += dDoubleValue65;
                            }
                            aVar6.getClass();
                            string = l3.a.e0(context, d14 / ((double) size));
                            break;
                        case 89:
                            l3.a aVar7 = l3.f23124b;
                            it53 = arrayList4.iterator();
                            while (it53.hasNext()) {
                                grit = ((x0) it53.next()).getGrit();
                                if (grit != null) {
                                    dDoubleValue66 = grit.doubleValue();
                                } else {
                                    dDoubleValue66 = Double.NaN;
                                }
                                d14 += dDoubleValue66;
                            }
                            aVar7.getClass();
                            string = l3.a.h0(context, d14 / ((double) size));
                            break;
                        case 90:
                            it54 = arrayList4.iterator();
                            i16 = 0;
                            while (it54.hasNext()) {
                                jumpCount = ((x0) it54.next()).getJumpCount();
                                if (jumpCount != null) {
                                    iIntValue = jumpCount.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                i16 += iIntValue;
                            }
                            string = String.valueOf(i16);
                            break;
                        case 92:
                            it55 = arrayList4.iterator();
                            while (it55.hasNext()) {
                                groundContactTime = ((x0) it55.next()).getGroundContactTime();
                                if (groundContactTime != null) {
                                    dDoubleValue67 = groundContactTime.doubleValue();
                                } else {
                                    dDoubleValue67 = Double.NaN;
                                }
                                d14 += dDoubleValue67;
                            }
                            string = aq.a.n(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 93:
                            it56 = arrayList4.iterator();
                            while (it56.hasNext()) {
                                groundContactBalanceLeft = ((x0) it56.next()).getGroundContactBalanceLeft();
                                if (groundContactBalanceLeft != null) {
                                    dDoubleValue68 = groundContactBalanceLeft.doubleValue();
                                } else {
                                    dDoubleValue68 = Double.NaN;
                                }
                                d14 += dDoubleValue68;
                            }
                            string = aq.a.o(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 94:
                            it57 = arrayList4.iterator();
                            while (it57.hasNext()) {
                                verticalOscillation = ((x0) it57.next()).getVerticalOscillation();
                                if (verticalOscillation != null) {
                                    dDoubleValue69 = verticalOscillation.doubleValue();
                                } else {
                                    dDoubleValue69 = Double.NaN;
                                }
                                d14 += dDoubleValue69;
                            }
                            string = aq.a.f0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                        case 95:
                            it58 = arrayList4.iterator();
                            while (it58.hasNext()) {
                                averageVerticalRatio = ((x0) it58.next()).getAverageVerticalRatio();
                                if (averageVerticalRatio != null) {
                                    dDoubleValue70 = averageVerticalRatio.doubleValue();
                                } else {
                                    dDoubleValue70 = Double.NaN;
                                }
                                d14 += dDoubleValue70;
                            }
                            string = aq.a.g0(context, Double.valueOf(d14 / ((double) size)));
                            break;
                    }
                } else {
                    aVar2 = aVar4;
                }
                z14 = true;
                z15 = z14;
                zB = z0.b(am.x0.I0, jVar.getF165810e());
                d14 = 0.0d;
                switch (a.f114282a[aVar2.ordinal()]) {
                    case 1:
                    case 10:
                        if (g0VarA == g0.ACTIVE) {
                            string = context.getString(g0VarA.f29447b);
                        } else if (z0.b(am.x0.f4308n, jVar.getF165810e())) {
                            string = context.getString(R.string.lbl_run);
                        } else if (z0.b(am.x0.f4312o, jVar.getF165810e())) {
                            string = context.getString(g0VarA.f29447b);
                        } else {
                            string = context.getString(R.string.lbl_bike);
                        }
                        break;
                    case 2:
                    case 3:
                        string = aq.a.u(i15);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 99:
                        if (size <= 1) {
                            string = aq.a.u(jVar.f165807b);
                        }
                        break;
                    case 8:
                    case 9:
                    case 13:
                    case 20:
                    case 22:
                    case 24:
                    case 27:
                    case 40:
                    case 47:
                    case 48:
                    case 84:
                    case 85:
                    case 87:
                    case 91:
                    case 96:
                    case 97:
                    case 98:
                    default:
                        string = context.getString(R.string.no_value);
                        break;
                    case 11:
                    case 12:
                        string = aq.a.W(context, d18);
                        break;
                    case 14:
                        string = aq.a.W(context, Double.valueOf(d(i14, list)));
                        break;
                    case 15:
                        if (d18 != null) {
                            dDoubleValue = d18.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        string = aq.a.W(context, Double.valueOf(dDoubleValue - (d19 != null ? d19.doubleValue() : 0.0d)));
                        break;
                    case 16:
                    case 17:
                        string = aq.a.W(context, d19);
                        break;
                    case 18:
                    case 19:
                        if (z0.Q(jVar.getF165810e())) {
                            string = aq.a.G(context, d26);
                        } else if (!z0.b(am.x0.f4297k1, jVar.getF165810e())) {
                            string = aq.a.r(context, d26);
                        } else if (z0.b(am.x0.f4301l1, jVar.getF165810e())) {
                            string = aq.a.r(context, d26);
                        } else if (zB) {
                            string = aq.a.d0(context, d26);
                        } else {
                            string = aq.a.f(context, d26);
                        }
                        break;
                    case 21:
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            elevationGain = ((x0) it.next()).getElevationGain();
                            if (elevationGain != null) {
                                dDoubleValue2 = elevationGain.doubleValue();
                            } else {
                                dDoubleValue2 = Double.NaN;
                            }
                            d14 += dDoubleValue2;
                        }
                        string = aq.a.j(context, Double.valueOf(d14), o0VarG);
                        break;
                    case 23:
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            elevationLoss = ((x0) it3.next()).getElevationLoss();
                            if (elevationLoss != null) {
                                dDoubleValue3 = elevationLoss.doubleValue();
                            } else {
                                dDoubleValue3 = Double.NaN;
                            }
                            d14 += dDoubleValue3;
                        }
                        string = aq.a.j(context, Double.valueOf(d14), o0VarG);
                        break;
                    case 25:
                    case 26:
                        string = aq.a.K(context, d24, jVar.getF165809d());
                        break;
                    case 28:
                        string = aq.a.K(context, d25, jVar.getF165809d());
                        break;
                    case 29:
                    case 30:
                    case 31:
                        it4 = arrayList4.iterator();
                        if (it4.hasNext()) {
                            next = null;
                        } else {
                            next = it4.next();
                            if (it4.hasNext()) {
                                maxSpeed = ((x0) next).getMaxSpeed();
                                if (maxSpeed != null) {
                                    dDoubleValue4 = maxSpeed.doubleValue();
                                } else {
                                    dDoubleValue4 = Double.NaN;
                                }
                                while (true) {
                                    next2 = it4.next();
                                    maxSpeed2 = ((x0) next2).getMaxSpeed();
                                    if (maxSpeed2 != null) {
                                        dDoubleValue5 = maxSpeed2.doubleValue();
                                    } else {
                                        dDoubleValue5 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue4, dDoubleValue5) < 0) {
                                        dDoubleValue4 = dDoubleValue5;
                                        next = next2;
                                    } else {
                                        next = next;
                                    }
                                    if (!it4.hasNext()) {
                                        it4 = it4;
                                    }
                                }
                            }
                        }
                        x0Var = (x0) next;
                        if (x0Var == null) {
                        }
                        string = null;
                        break;
                    case 32:
                        it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            averageGradeAdjustedSpeed = ((x0) it5.next()).getAverageGradeAdjustedSpeed();
                            if (averageGradeAdjustedSpeed != null) {
                                dDoubleValue6 = averageGradeAdjustedSpeed.doubleValue();
                            } else {
                                dDoubleValue6 = Double.NaN;
                            }
                            d14 += dDoubleValue6;
                        }
                        string = aq.a.D(context, Double.valueOf(d14 / ((double) size)), jVar.getF165809d());
                        break;
                    case 33:
                        if (z15) {
                            string = aq.a.H(context, d24);
                        } else {
                            string = aq.a.D(context, d24, jVar.getF165809d());
                        }
                        break;
                    case 34:
                        string = aq.a.D(context, d25, jVar.getF165809d());
                        break;
                    case 35:
                        it6 = arrayList4.iterator();
                        if (it6.hasNext()) {
                            next3 = null;
                        } else {
                            next3 = it6.next();
                            if (it6.hasNext()) {
                                maxSpeed4 = ((x0) next3).getMaxSpeed();
                                if (maxSpeed4 != null) {
                                    dDoubleValue7 = maxSpeed4.doubleValue();
                                } else {
                                    dDoubleValue7 = Double.NaN;
                                }
                                while (true) {
                                    next4 = it6.next();
                                    maxSpeed5 = ((x0) next4).getMaxSpeed();
                                    if (maxSpeed5 != null) {
                                        dDoubleValue8 = maxSpeed5.doubleValue();
                                    } else {
                                        dDoubleValue8 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue7, dDoubleValue8) < 0) {
                                        dDoubleValue7 = dDoubleValue8;
                                        next3 = next4;
                                    } else {
                                        next3 = next3;
                                    }
                                    if (!it6.hasNext()) {
                                        it6 = it6;
                                    }
                                }
                            }
                        }
                        x0Var2 = (x0) next3;
                        if (x0Var2 == null) {
                        }
                        string = null;
                        break;
                    case 36:
                    case 37:
                        it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            averageHR = ((x0) it7.next()).getAverageHR();
                            if (averageHR != null) {
                                dDoubleValue9 = averageHR.doubleValue();
                            } else {
                                dDoubleValue9 = Double.NaN;
                            }
                            d14 += dDoubleValue9;
                        }
                        string = aq.a.q(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 38:
                    case 39:
                        it8 = arrayList4.iterator();
                        if (it8.hasNext()) {
                            next5 = null;
                        } else {
                            next5 = it8.next();
                            if (it8.hasNext()) {
                                maxHR = ((x0) next5).getMaxHR();
                                if (maxHR != null) {
                                    dDoubleValue10 = maxHR.doubleValue();
                                } else {
                                    dDoubleValue10 = Double.NaN;
                                }
                                while (true) {
                                    next6 = it8.next();
                                    maxHR2 = ((x0) next6).getMaxHR();
                                    if (maxHR2 != null) {
                                        dDoubleValue11 = maxHR2.doubleValue();
                                    } else {
                                        dDoubleValue11 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue10, dDoubleValue11) < 0) {
                                        dDoubleValue10 = dDoubleValue11;
                                        next5 = next6;
                                    } else {
                                        next5 = next5;
                                    }
                                    if (!it8.hasNext()) {
                                        it8 = it8;
                                    }
                                }
                            }
                        }
                        x0Var3 = (x0) next5;
                        if (x0Var3 == null) {
                        }
                        string = null;
                        break;
                    case 41:
                        it9 = arrayList4.iterator();
                        while (it9.hasNext()) {
                            averageRunCadence = ((x0) it9.next()).getAverageRunCadence();
                            if (averageRunCadence != null) {
                                dDoubleValue12 = averageRunCadence.doubleValue();
                            } else {
                                dDoubleValue12 = Double.NaN;
                            }
                            d14 += dDoubleValue12;
                        }
                        string = aq.a.I(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 42:
                        it10 = arrayList4.iterator();
                        if (it10.hasNext()) {
                            next7 = null;
                        } else {
                            next7 = it10.next();
                            if (it10.hasNext()) {
                                maxRunCadence = ((x0) next7).getMaxRunCadence();
                                if (maxRunCadence != null) {
                                    dDoubleValue13 = maxRunCadence.doubleValue();
                                } else {
                                    dDoubleValue13 = Double.NaN;
                                }
                                while (true) {
                                    next8 = it10.next();
                                    maxRunCadence2 = ((x0) next8).getMaxRunCadence();
                                    if (maxRunCadence2 != null) {
                                        dDoubleValue14 = maxRunCadence2.doubleValue();
                                    } else {
                                        dDoubleValue14 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue13, dDoubleValue14) < 0) {
                                        dDoubleValue13 = dDoubleValue14;
                                        next7 = next8;
                                    } else {
                                        next7 = next7;
                                    }
                                    if (!it10.hasNext()) {
                                        it10 = it10;
                                    }
                                }
                            }
                        }
                        x0Var4 = (x0) next7;
                        if (x0Var4 == null) {
                        }
                        string = null;
                        break;
                    case 43:
                    case 44:
                        it11 = arrayList4.iterator();
                        while (it11.hasNext()) {
                            averageBikeCadence = ((x0) it11.next()).getAverageBikeCadence();
                            if (averageBikeCadence != null) {
                                dDoubleValue15 = averageBikeCadence.doubleValue();
                            } else {
                                dDoubleValue15 = Double.NaN;
                            }
                            d14 += dDoubleValue15;
                        }
                        string = aq.a.c(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 45:
                    case 46:
                        it12 = arrayList4.iterator();
                        if (it12.hasNext()) {
                            next9 = null;
                        } else {
                            next9 = it12.next();
                            if (it12.hasNext()) {
                                maxBikeCadence = ((x0) next9).getMaxBikeCadence();
                                if (maxBikeCadence != null) {
                                    dDoubleValue16 = maxBikeCadence.doubleValue();
                                } else {
                                    dDoubleValue16 = Double.NaN;
                                }
                                while (true) {
                                    next10 = it12.next();
                                    maxBikeCadence2 = ((x0) next10).getMaxBikeCadence();
                                    if (maxBikeCadence2 != null) {
                                        dDoubleValue17 = maxBikeCadence2.doubleValue();
                                    } else {
                                        dDoubleValue17 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue16, dDoubleValue17) < 0) {
                                        dDoubleValue16 = dDoubleValue17;
                                        next9 = next10;
                                    } else {
                                        next9 = next9;
                                    }
                                    if (!it12.hasNext()) {
                                        it12 = it12;
                                    }
                                }
                            }
                        }
                        x0Var5 = (x0) next9;
                        if (x0Var5 == null) {
                        }
                        string = null;
                        break;
                    case 49:
                        it13 = arrayList4.iterator();
                        while (it13.hasNext()) {
                            normalizedPower = ((x0) it13.next()).getNormalizedPower();
                            if (normalizedPower != null) {
                                dDoubleValue18 = normalizedPower.doubleValue();
                            } else {
                                dDoubleValue18 = Double.NaN;
                            }
                            d14 += dDoubleValue18;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 50:
                        it14 = arrayList4.iterator();
                        d15 = 0.0d;
                        while (it14.hasNext()) {
                            leftBalance = ((x0) it14.next()).getLeftBalance();
                            if (leftBalance != null) {
                                dDoubleValue20 = leftBalance.doubleValue();
                            } else {
                                dDoubleValue20 = Double.NaN;
                            }
                            d15 += dDoubleValue20;
                        }
                        double d210 = size;
                        Double dValueOf6 = Double.valueOf(d15 / d210);
                        it15 = arrayList4.iterator();
                        while (it15.hasNext()) {
                            rightBalance = ((x0) it15.next()).getRightBalance();
                            if (rightBalance != null) {
                                dDoubleValue19 = rightBalance.doubleValue();
                            } else {
                                dDoubleValue19 = Double.NaN;
                            }
                            d14 += dDoubleValue19;
                        }
                        string = aq.a.e(context, dValueOf6, Double.valueOf(d14 / d210));
                        break;
                    case 51:
                        it16 = arrayList4.iterator();
                        d16 = 0.0d;
                        while (it16.hasNext()) {
                            leftTorqueEffectiveness = ((x0) it16.next()).getLeftTorqueEffectiveness();
                            if (leftTorqueEffectiveness != null) {
                                dDoubleValue22 = leftTorqueEffectiveness.doubleValue();
                            } else {
                                dDoubleValue22 = Double.NaN;
                            }
                            d16 += dDoubleValue22;
                        }
                        double d211 = size;
                        Double dValueOf7 = Double.valueOf(d16 / d211);
                        it17 = arrayList4.iterator();
                        while (it17.hasNext()) {
                            rightTorqueEffectiveness = ((x0) it17.next()).getRightTorqueEffectiveness();
                            if (rightTorqueEffectiveness != null) {
                                dDoubleValue21 = rightTorqueEffectiveness.doubleValue();
                            } else {
                                dDoubleValue21 = Double.NaN;
                            }
                            d14 += dDoubleValue21;
                        }
                        string = aq.a.e(context, dValueOf7, Double.valueOf(d14 / d211));
                        break;
                    case 52:
                        it18 = arrayList4.iterator();
                        d17 = 0.0d;
                        while (it18.hasNext()) {
                            leftPedalSmoothness = ((x0) it18.next()).getLeftPedalSmoothness();
                            if (leftPedalSmoothness != null) {
                                dDoubleValue24 = leftPedalSmoothness.doubleValue();
                            } else {
                                dDoubleValue24 = Double.NaN;
                            }
                            d17 += dDoubleValue24;
                        }
                        double d212 = size;
                        Double dValueOf8 = Double.valueOf(d17 / d212);
                        it19 = arrayList4.iterator();
                        while (it19.hasNext()) {
                            rightPedalSmoothness = ((x0) it19.next()).getRightPedalSmoothness();
                            if (rightPedalSmoothness != null) {
                                dDoubleValue23 = rightPedalSmoothness.doubleValue();
                            } else {
                                dDoubleValue23 = Double.NaN;
                            }
                            d14 += dDoubleValue23;
                        }
                        string = aq.a.e(context, dValueOf8, Double.valueOf(d14 / d212));
                        break;
                    case 53:
                        it20 = arrayList4.iterator();
                        while (it20.hasNext()) {
                            averagePower = ((x0) it20.next()).getAveragePower();
                            if (averagePower != null) {
                                dDoubleValue25 = averagePower.doubleValue();
                            } else {
                                dDoubleValue25 = Double.NaN;
                            }
                            d14 += dDoubleValue25;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 54:
                        it21 = arrayList4.iterator();
                        if (it21.hasNext()) {
                            next11 = null;
                        } else {
                            next11 = it21.next();
                            if (it21.hasNext()) {
                                maxPower = ((x0) next11).getMaxPower();
                                if (maxPower != null) {
                                    dDoubleValue26 = maxPower.doubleValue();
                                } else {
                                    dDoubleValue26 = Double.NaN;
                                }
                                while (true) {
                                    next12 = it21.next();
                                    maxPower2 = ((x0) next12).getMaxPower();
                                    if (maxPower2 != null) {
                                        dDoubleValue27 = maxPower2.doubleValue();
                                    } else {
                                        dDoubleValue27 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue26, dDoubleValue27) < 0) {
                                        dDoubleValue26 = dDoubleValue27;
                                        next11 = next12;
                                    } else {
                                        next11 = next11;
                                    }
                                    if (!it21.hasNext()) {
                                        it21 = it21;
                                    }
                                }
                            }
                        }
                        x0Var6 = (x0) next11;
                        if (x0Var6 == null) {
                        }
                        string = null;
                        break;
                    case 55:
                        it22 = arrayList4.iterator();
                        while (it22.hasNext()) {
                            avgBikeForce = ((x0) it22.next()).getAvgBikeForce();
                            if (avgBikeForce != null) {
                                dDoubleValue28 = avgBikeForce.doubleValue();
                            } else {
                                dDoubleValue28 = Double.NaN;
                            }
                            d14 += dDoubleValue28;
                        }
                        string = aq.a.m(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 56:
                        it23 = arrayList4.iterator();
                        if (it23.hasNext()) {
                            next13 = null;
                        } else {
                            next13 = it23.next();
                            if (it23.hasNext()) {
                                maxBikeForce = ((x0) next13).getMaxBikeForce();
                                if (maxBikeForce != null) {
                                    dDoubleValue29 = maxBikeForce.doubleValue();
                                } else {
                                    dDoubleValue29 = Double.NaN;
                                }
                                while (true) {
                                    next14 = it23.next();
                                    maxBikeForce2 = ((x0) next14).getMaxBikeForce();
                                    if (maxBikeForce2 != null) {
                                        dDoubleValue30 = maxBikeForce2.doubleValue();
                                    } else {
                                        dDoubleValue30 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue29, dDoubleValue30) < 0) {
                                        dDoubleValue29 = dDoubleValue30;
                                        next13 = next14;
                                    } else {
                                        next13 = next13;
                                    }
                                    if (!it23.hasNext()) {
                                        it23 = it23;
                                    }
                                }
                            }
                        }
                        x0Var7 = (x0) next13;
                        if (x0Var7 == null) {
                        }
                        string = null;
                        break;
                    case 57:
                        it24 = arrayList4.iterator();
                        while (it24.hasNext()) {
                            normalizedForce = ((x0) it24.next()).getNormalizedForce();
                            if (normalizedForce != null) {
                                dDoubleValue31 = normalizedForce.doubleValue();
                            } else {
                                dDoubleValue31 = Double.NaN;
                            }
                            d14 += dDoubleValue31;
                        }
                        string = aq.a.m(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 58:
                        it25 = arrayList4.iterator();
                        while (it25.hasNext()) {
                            averagePower2 = ((x0) it25.next()).getAveragePower();
                            if (averagePower2 != null) {
                                dDoubleValue32 = averagePower2.doubleValue();
                            } else {
                                dDoubleValue32 = Double.NaN;
                            }
                            d14 += dDoubleValue32;
                        }
                        double d35 = size;
                        Double dValueOf9 = Double.valueOf(d14 / d35);
                        l.f68084a.getClass();
                        string = aq.a.F(context, dValueOf9, l.a.a().v3() * d35);
                        break;
                    case 59:
                        it26 = arrayList4.iterator();
                        if (it26.hasNext()) {
                            next15 = null;
                        } else {
                            next15 = it26.next();
                            if (it26.hasNext()) {
                                maxPower4 = ((x0) next15).getMaxPower();
                                if (maxPower4 != null) {
                                    dDoubleValue33 = maxPower4.doubleValue();
                                } else {
                                    dDoubleValue33 = Double.NaN;
                                }
                                while (true) {
                                    next16 = it26.next();
                                    maxPower5 = ((x0) next16).getMaxPower();
                                    if (maxPower5 != null) {
                                        dDoubleValue34 = maxPower5.doubleValue();
                                    } else {
                                        dDoubleValue34 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue33, dDoubleValue34) < 0) {
                                        dDoubleValue33 = dDoubleValue34;
                                        next15 = next16;
                                    } else {
                                        next15 = next15;
                                    }
                                    if (!it26.hasNext()) {
                                        it26 = it26;
                                    }
                                }
                            }
                        }
                        x0Var8 = (x0) next15;
                        if (x0Var8 == null) {
                        }
                        string = null;
                        break;
                    case 60:
                        it27 = arrayList4.iterator();
                        while (it27.hasNext()) {
                            seatedTime = ((x0) it27.next()).getSeatedTime();
                            if (seatedTime != null) {
                                dDoubleValue35 = seatedTime.doubleValue();
                            } else {
                                dDoubleValue35 = Double.NaN;
                            }
                            d14 += dDoubleValue35;
                        }
                        string = aq.a.W(context, Double.valueOf(d14));
                        break;
                    case 61:
                        it28 = arrayList4.iterator();
                        while (it28.hasNext()) {
                            standingTime = ((x0) it28.next()).getStandingTime();
                            if (standingTime != null) {
                                dDoubleValue36 = standingTime.doubleValue();
                            } else {
                                dDoubleValue36 = Double.NaN;
                            }
                            d14 += dDoubleValue36;
                        }
                        string = aq.a.W(context, Double.valueOf(d14));
                        break;
                    case 62:
                        it29 = arrayList4.iterator();
                        while (it29.hasNext()) {
                            avgRiderTorsoAngle = ((x0) it29.next()).getAvgRiderTorsoAngle();
                            if (avgRiderTorsoAngle != null) {
                                dDoubleValue37 = avgRiderTorsoAngle.doubleValue();
                            } else {
                                dDoubleValue37 = Double.NaN;
                            }
                            d14 += dDoubleValue37;
                        }
                        string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 63:
                        it30 = arrayList4.iterator();
                        while (it30.hasNext()) {
                            avgAeroTorsoAngle = ((x0) it30.next()).getAvgAeroTorsoAngle();
                            if (avgAeroTorsoAngle != null) {
                                dDoubleValue38 = avgAeroTorsoAngle.doubleValue();
                            } else {
                                dDoubleValue38 = Double.NaN;
                            }
                            d14 += dDoubleValue38;
                        }
                        string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 64:
                        it31 = arrayList4.iterator();
                        while (it31.hasNext()) {
                            avgLoweredTorsoAngle = ((x0) it31.next()).getAvgLoweredTorsoAngle();
                            if (avgLoweredTorsoAngle != null) {
                                dDoubleValue39 = avgLoweredTorsoAngle.doubleValue();
                            } else {
                                dDoubleValue39 = Double.NaN;
                            }
                            d14 += dDoubleValue39;
                        }
                        string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 65:
                        it32 = arrayList4.iterator();
                        while (it32.hasNext()) {
                            avgUprightTorsoAngle = ((x0) it32.next()).getAvgUprightTorsoAngle();
                            if (avgUprightTorsoAngle != null) {
                                dDoubleValue40 = avgUprightTorsoAngle.doubleValue();
                            } else {
                                dDoubleValue40 = Double.NaN;
                            }
                            d14 += dDoubleValue40;
                        }
                        string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 66:
                        it33 = arrayList4.iterator();
                        while (it33.hasNext()) {
                            avgStandingTorsoAngle = ((x0) it33.next()).getAvgStandingTorsoAngle();
                            if (avgStandingTorsoAngle != null) {
                                dDoubleValue41 = avgStandingTorsoAngle.doubleValue();
                            } else {
                                dDoubleValue41 = Double.NaN;
                            }
                            d14 += dDoubleValue41;
                        }
                        string = aq.a.b0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 67:
                        it34 = arrayList4.iterator();
                        while (it34.hasNext()) {
                            aeroTime = ((x0) it34.next()).getAeroTime();
                            if (aeroTime != null) {
                                dDoubleValue42 = aeroTime.doubleValue();
                            } else {
                                dDoubleValue42 = Double.NaN;
                            }
                            d14 += dDoubleValue42;
                        }
                        string = aq.a.W(context, Double.valueOf(d14));
                        break;
                    case 68:
                        it35 = arrayList4.iterator();
                        while (it35.hasNext()) {
                            loweredTime = ((x0) it35.next()).getLoweredTime();
                            if (loweredTime != null) {
                                dDoubleValue43 = loweredTime.doubleValue();
                            } else {
                                dDoubleValue43 = Double.NaN;
                            }
                            d14 += dDoubleValue43;
                        }
                        string = aq.a.W(context, Double.valueOf(d14));
                        break;
                    case 69:
                        it36 = arrayList4.iterator();
                        while (it36.hasNext()) {
                            uprightTime = ((x0) it36.next()).getUprightTime();
                            if (uprightTime != null) {
                                dDoubleValue44 = uprightTime.doubleValue();
                            } else {
                                dDoubleValue44 = Double.NaN;
                            }
                            d14 += dDoubleValue44;
                        }
                        string = aq.a.W(context, Double.valueOf(d14));
                        break;
                    case 70:
                        it37 = arrayList4.iterator();
                        while (it37.hasNext()) {
                            avgAeroPower = ((x0) it37.next()).getAvgAeroPower();
                            if (avgAeroPower != null) {
                                dDoubleValue45 = avgAeroPower.doubleValue();
                            } else {
                                dDoubleValue45 = Double.NaN;
                            }
                            d14 += dDoubleValue45;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 71:
                        it38 = arrayList4.iterator();
                        if (it38.hasNext()) {
                            next17 = null;
                        } else {
                            next17 = it38.next();
                            if (it38.hasNext()) {
                                maxAeroPower = ((x0) next17).getMaxAeroPower();
                                if (maxAeroPower != null) {
                                    dDoubleValue46 = maxAeroPower.doubleValue();
                                } else {
                                    dDoubleValue46 = Double.NaN;
                                }
                                while (true) {
                                    next18 = it38.next();
                                    maxAeroPower2 = ((x0) next18).getMaxAeroPower();
                                    if (maxAeroPower2 != null) {
                                        dDoubleValue47 = maxAeroPower2.doubleValue();
                                    } else {
                                        dDoubleValue47 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue46, dDoubleValue47) < 0) {
                                        dDoubleValue46 = dDoubleValue47;
                                        next17 = next18;
                                    } else {
                                        next17 = next17;
                                    }
                                    if (!it38.hasNext()) {
                                        it38 = it38;
                                    }
                                }
                            }
                        }
                        x0Var9 = (x0) next17;
                        if (x0Var9 == null) {
                        }
                        string = null;
                        break;
                    case 72:
                        it39 = arrayList4.iterator();
                        while (it39.hasNext()) {
                            avgLoweredPower = ((x0) it39.next()).getAvgLoweredPower();
                            if (avgLoweredPower != null) {
                                dDoubleValue48 = avgLoweredPower.doubleValue();
                            } else {
                                dDoubleValue48 = Double.NaN;
                            }
                            d14 += dDoubleValue48;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 73:
                        it40 = arrayList4.iterator();
                        if (it40.hasNext()) {
                            next19 = null;
                        } else {
                            next19 = it40.next();
                            if (it40.hasNext()) {
                                maxLoweredPower = ((x0) next19).getMaxLoweredPower();
                                if (maxLoweredPower != null) {
                                    dDoubleValue49 = maxLoweredPower.doubleValue();
                                } else {
                                    dDoubleValue49 = Double.NaN;
                                }
                                while (true) {
                                    next20 = it40.next();
                                    maxLoweredPower2 = ((x0) next20).getMaxLoweredPower();
                                    if (maxLoweredPower2 != null) {
                                        dDoubleValue50 = maxLoweredPower2.doubleValue();
                                    } else {
                                        dDoubleValue50 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue49, dDoubleValue50) < 0) {
                                        dDoubleValue49 = dDoubleValue50;
                                        next19 = next20;
                                    } else {
                                        next19 = next19;
                                    }
                                    if (!it40.hasNext()) {
                                        it40 = it40;
                                    }
                                }
                            }
                        }
                        x0Var10 = (x0) next19;
                        if (x0Var10 == null) {
                        }
                        string = null;
                        break;
                    case 74:
                        it41 = arrayList4.iterator();
                        while (it41.hasNext()) {
                            avgUprightPower = ((x0) it41.next()).getAvgUprightPower();
                            if (avgUprightPower != null) {
                                dDoubleValue51 = avgUprightPower.doubleValue();
                            } else {
                                dDoubleValue51 = Double.NaN;
                            }
                            d14 += dDoubleValue51;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 75:
                        it42 = arrayList4.iterator();
                        if (it42.hasNext()) {
                            next21 = null;
                        } else {
                            next21 = it42.next();
                            if (it42.hasNext()) {
                                maxUprightPower = ((x0) next21).getMaxUprightPower();
                                if (maxUprightPower != null) {
                                    dDoubleValue52 = maxUprightPower.doubleValue();
                                } else {
                                    dDoubleValue52 = Double.NaN;
                                }
                                while (true) {
                                    next22 = it42.next();
                                    maxUprightPower2 = ((x0) next22).getMaxUprightPower();
                                    if (maxUprightPower2 != null) {
                                        dDoubleValue53 = maxUprightPower2.doubleValue();
                                    } else {
                                        dDoubleValue53 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue52, dDoubleValue53) < 0) {
                                        dDoubleValue52 = dDoubleValue53;
                                        next21 = next22;
                                    } else {
                                        next21 = next21;
                                    }
                                    if (!it42.hasNext()) {
                                        it42 = it42;
                                    }
                                }
                            }
                        }
                        x0Var11 = (x0) next21;
                        if (x0Var11 == null) {
                        }
                        string = null;
                        break;
                    case 76:
                        it43 = arrayList4.iterator();
                        while (it43.hasNext()) {
                            averageSeatedPower = ((x0) it43.next()).getAverageSeatedPower();
                            if (averageSeatedPower != null) {
                                dDoubleValue54 = averageSeatedPower.doubleValue();
                            } else {
                                dDoubleValue54 = Double.NaN;
                            }
                            d14 += dDoubleValue54;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 77:
                        it44 = arrayList4.iterator();
                        if (it44.hasNext()) {
                            next23 = null;
                        } else {
                            next23 = it44.next();
                            if (it44.hasNext()) {
                                maxSeatedPower = ((x0) next23).getMaxSeatedPower();
                                if (maxSeatedPower != null) {
                                    dDoubleValue55 = maxSeatedPower.doubleValue();
                                } else {
                                    dDoubleValue55 = Double.NaN;
                                }
                                while (true) {
                                    next24 = it44.next();
                                    maxSeatedPower2 = ((x0) next24).getMaxSeatedPower();
                                    if (maxSeatedPower2 != null) {
                                        dDoubleValue56 = maxSeatedPower2.doubleValue();
                                    } else {
                                        dDoubleValue56 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue55, dDoubleValue56) < 0) {
                                        dDoubleValue55 = dDoubleValue56;
                                        next23 = next24;
                                    } else {
                                        next23 = next23;
                                    }
                                    if (!it44.hasNext()) {
                                        it44 = it44;
                                    }
                                }
                            }
                        }
                        x0Var12 = (x0) next23;
                        if (x0Var12 == null) {
                        }
                        string = null;
                        break;
                    case 78:
                        it45 = arrayList4.iterator();
                        while (it45.hasNext()) {
                            averageStandingPower = ((x0) it45.next()).getAverageStandingPower();
                            if (averageStandingPower != null) {
                                dDoubleValue57 = averageStandingPower.doubleValue();
                            } else {
                                dDoubleValue57 = Double.NaN;
                            }
                            d14 += dDoubleValue57;
                        }
                        string = aq.a.E(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 79:
                        it46 = arrayList4.iterator();
                        if (it46.hasNext()) {
                            next25 = null;
                        } else {
                            next25 = it46.next();
                            if (it46.hasNext()) {
                                maxStandingPower = ((x0) next25).getMaxStandingPower();
                                if (maxStandingPower != null) {
                                    dDoubleValue58 = maxStandingPower.doubleValue();
                                } else {
                                    dDoubleValue58 = Double.NaN;
                                }
                                while (true) {
                                    next26 = it46.next();
                                    maxStandingPower2 = ((x0) next26).getMaxStandingPower();
                                    if (maxStandingPower2 != null) {
                                        dDoubleValue59 = maxStandingPower2.doubleValue();
                                    } else {
                                        dDoubleValue59 = Double.NaN;
                                    }
                                    if (Double.compare(dDoubleValue58, dDoubleValue59) < 0) {
                                        dDoubleValue58 = dDoubleValue59;
                                        next25 = next26;
                                    }
                                    if (!it46.hasNext()) {
                                        it46 = it46;
                                    }
                                }
                            }
                        }
                        x0Var13 = (x0) next25;
                        if (x0Var13 == null) {
                        }
                        string = null;
                        break;
                    case 80:
                        it47 = arrayList4.iterator();
                        while (it47.hasNext()) {
                            averageStepSpeedLoss = ((x0) it47.next()).getAverageStepSpeedLoss();
                            if (averageStepSpeedLoss != null) {
                                dDoubleValue60 = averageStepSpeedLoss.doubleValue();
                            } else {
                                dDoubleValue60 = Double.NaN;
                            }
                            d14 += dDoubleValue60;
                        }
                        string = aq.a.M(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 81:
                        it48 = arrayList4.iterator();
                        while (it48.hasNext()) {
                            averageStepSpeedLossPercent = ((x0) it48.next()).getAverageStepSpeedLossPercent();
                            if (averageStepSpeedLossPercent != null) {
                                dDoubleValue61 = averageStepSpeedLossPercent.doubleValue();
                            } else {
                                dDoubleValue61 = Double.NaN;
                            }
                            d14 += dDoubleValue61;
                        }
                        string = aq.a.N(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 82:
                        it49 = arrayList4.iterator();
                        while (it49.hasNext()) {
                            strideLength = ((x0) it49.next()).getStrideLength();
                            if (strideLength != null) {
                                dDoubleValue62 = strideLength.doubleValue();
                            } else {
                                dDoubleValue62 = Double.NaN;
                            }
                            d14 += dDoubleValue62;
                        }
                        string = aq.a.O(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 83:
                        it50 = arrayList4.iterator();
                        while (it50.hasNext()) {
                            averageTemperature = ((x0) it50.next()).getAverageTemperature();
                            if (averageTemperature != null) {
                                dDoubleValue63 = averageTemperature.doubleValue();
                            } else {
                                dDoubleValue63 = Double.NaN;
                            }
                            d14 += dDoubleValue63;
                        }
                        string = aq.a.V(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 86:
                        it51 = arrayList4.iterator();
                        while (it51.hasNext()) {
                            calories = ((x0) it51.next()).getCalories();
                            if (calories != null) {
                                dDoubleValue64 = calories.doubleValue();
                            } else {
                                dDoubleValue64 = Double.NaN;
                            }
                            d14 += dDoubleValue64;
                        }
                        string = aq.a.d(context, Double.valueOf(d14));
                        break;
                    case 88:
                        l3.a aVar8 = l3.f23124b;
                        it52 = arrayList4.iterator();
                        while (it52.hasNext()) {
                            averageFlow = ((x0) it52.next()).getAverageFlow();
                            if (averageFlow != null) {
                                dDoubleValue65 = averageFlow.doubleValue();
                            } else {
                                dDoubleValue65 = Double.NaN;
                            }
                            d14 += dDoubleValue65;
                        }
                        aVar8.getClass();
                        string = l3.a.e0(context, d14 / ((double) size));
                        break;
                    case 89:
                        l3.a aVar9 = l3.f23124b;
                        it53 = arrayList4.iterator();
                        while (it53.hasNext()) {
                            grit = ((x0) it53.next()).getGrit();
                            if (grit != null) {
                                dDoubleValue66 = grit.doubleValue();
                            } else {
                                dDoubleValue66 = Double.NaN;
                            }
                            d14 += dDoubleValue66;
                        }
                        aVar9.getClass();
                        string = l3.a.h0(context, d14 / ((double) size));
                        break;
                    case 90:
                        it54 = arrayList4.iterator();
                        i16 = 0;
                        while (it54.hasNext()) {
                            jumpCount = ((x0) it54.next()).getJumpCount();
                            if (jumpCount != null) {
                                iIntValue = jumpCount.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            i16 += iIntValue;
                        }
                        string = String.valueOf(i16);
                        break;
                    case 92:
                        it55 = arrayList4.iterator();
                        while (it55.hasNext()) {
                            groundContactTime = ((x0) it55.next()).getGroundContactTime();
                            if (groundContactTime != null) {
                                dDoubleValue67 = groundContactTime.doubleValue();
                            } else {
                                dDoubleValue67 = Double.NaN;
                            }
                            d14 += dDoubleValue67;
                        }
                        string = aq.a.n(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 93:
                        it56 = arrayList4.iterator();
                        while (it56.hasNext()) {
                            groundContactBalanceLeft = ((x0) it56.next()).getGroundContactBalanceLeft();
                            if (groundContactBalanceLeft != null) {
                                dDoubleValue68 = groundContactBalanceLeft.doubleValue();
                            } else {
                                dDoubleValue68 = Double.NaN;
                            }
                            d14 += dDoubleValue68;
                        }
                        string = aq.a.o(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 94:
                        it57 = arrayList4.iterator();
                        while (it57.hasNext()) {
                            verticalOscillation = ((x0) it57.next()).getVerticalOscillation();
                            if (verticalOscillation != null) {
                                dDoubleValue69 = verticalOscillation.doubleValue();
                            } else {
                                dDoubleValue69 = Double.NaN;
                            }
                            d14 += dDoubleValue69;
                        }
                        string = aq.a.f0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                    case 95:
                        it58 = arrayList4.iterator();
                        while (it58.hasNext()) {
                            averageVerticalRatio = ((x0) it58.next()).getAverageVerticalRatio();
                            if (averageVerticalRatio != null) {
                                dDoubleValue70 = averageVerticalRatio.doubleValue();
                            } else {
                                dDoubleValue70 = Double.NaN;
                            }
                            d14 += dDoubleValue70;
                        }
                        string = aq.a.g0(context, Double.valueOf(d14 / ((double) size)));
                        break;
                }
            }
            ((TextView) arrayList2.get(i17)).setText(string);
            oVar.f120193a.setBackgroundColor(e(jVar.f165806a + 1, context));
            i17++;
            aVar3 = aVar;
            arrayList3 = arrayList4;
            size2 = i18;
        }
    }

    public static void c(Context context, o oVar, ArrayList arrayList, q1 q1Var, j jVar) {
        boolean z14 = jVar.f165809d;
        q1Var.getClass();
        o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
        ArrayList arrayList2 = oVar.f120194b;
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            mq.l lVar = (mq.l) arrayList.get(i14);
            String string = "";
            if (lVar instanceof mq.a) {
                mq.a aVar = (mq.a) lVar;
                String str = jVar.f165810e;
                boolean z15 = z0.Q(str) || z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str);
                boolean zB = z0.b(am.x0.I0, str);
                switch (a.f114282a[aVar.ordinal()]) {
                    case 1:
                        string = context.getString(R.string.challenge_leaderboard_header_total_label);
                        string.getClass();
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 91:
                        break;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        string = aq.a.W(context, q1Var.getDuration());
                        break;
                    case 15:
                        Double duration = q1Var.getDuration();
                        double dDoubleValue = duration != null ? duration.doubleValue() : 0.0d;
                        Double movingDuration = q1Var.getMovingDuration();
                        string = aq.a.W(context, Double.valueOf(dDoubleValue - (movingDuration != null ? movingDuration.doubleValue() : 0.0d)));
                        break;
                    case 16:
                    case 17:
                        string = aq.a.W(context, q1Var.getMovingDuration());
                        break;
                    case 18:
                    case 19:
                    case 20:
                        if (z0.Q(str)) {
                            string = aq.a.G(context, q1Var.getDistance());
                        } else if (z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str)) {
                            string = aq.a.r(context, q1Var.getDistance());
                        } else {
                            string = zB ? aq.a.d0(context, q1Var.getDistance()) : aq.a.f(context, q1Var.getDistance());
                        }
                        break;
                    case 21:
                        string = aq.a.j(context, q1Var.getElevationGain(), o0VarG);
                        break;
                    case 22:
                        string = aq.a.J(context, q1Var.getElevationGain(), o0VarG);
                        break;
                    case 23:
                        string = aq.a.j(context, q1Var.getElevationLoss(), o0VarG);
                        break;
                    case 24:
                        string = aq.a.J(context, q1Var.getElevationLoss(), o0VarG);
                        break;
                    case 25:
                    case 26:
                        string = aq.a.K(context, q1Var.getAverageSpeed(), z14);
                        break;
                    case 27:
                        string = aq.a.K(context, q1Var.getAverageVerticalSpeed(), z14);
                        break;
                    case 28:
                        string = aq.a.K(context, q1Var.getAverageMovingSpeed(), z14);
                        break;
                    case 29:
                    case 30:
                    case 31:
                        string = aq.a.K(context, q1Var.getMaxSpeed(), z14);
                        break;
                    case 32:
                        string = aq.a.D(context, q1Var.getAverageGradeAdjustedSpeed(), z14);
                        break;
                    case 33:
                        string = z15 ? aq.a.H(context, q1Var.getAverageSpeed()) : aq.a.D(context, q1Var.getAverageSpeed(), z14);
                        break;
                    case 34:
                        string = aq.a.D(context, q1Var.getAverageMovingSpeed(), z14);
                        break;
                    case 35:
                        string = z15 ? aq.a.H(context, q1Var.getMaxSpeed()) : aq.a.D(context, q1Var.getMaxSpeed(), z14);
                        break;
                    case 36:
                    case 37:
                        string = aq.a.q(context, q1Var.getAverageHR());
                        break;
                    case 38:
                    case 39:
                        string = aq.a.q(context, q1Var.getMaxHR());
                        break;
                    case 40:
                    case 41:
                        string = aq.a.I(context, q1Var.getAverageRunCadence());
                        break;
                    case 42:
                        string = aq.a.I(context, q1Var.getMaxRunCadence());
                        break;
                    case 43:
                    case 44:
                        string = aq.a.c(context, q1Var.getAverageBikeCadence());
                        break;
                    case 45:
                    case 46:
                        string = aq.a.c(context, q1Var.getMaxBikeCadence());
                        break;
                    case 47:
                        string = aq.a.I(context, q1Var.getAvgWheelchairCadence());
                        break;
                    case 48:
                        string = aq.a.I(context, q1Var.getMaxWheelchairCadence());
                        break;
                    case 49:
                        string = aq.a.E(context, q1Var.getNormalizedPower());
                        break;
                    case 50:
                        string = aq.a.e(context, q1Var.getLeftBalance(), q1Var.getRightBalance());
                        break;
                    case 51:
                        string = aq.a.e(context, q1Var.getLeftTorqueEffectiveness(), q1Var.getRightTorqueEffectiveness());
                        break;
                    case 52:
                        string = aq.a.e(context, q1Var.getLeftPedalSmoothness(), q1Var.getRightPedalSmoothness());
                        break;
                    case 53:
                        string = aq.a.E(context, q1Var.getAveragePower());
                        break;
                    case 54:
                        string = aq.a.E(context, q1Var.getMaxPower());
                        break;
                    case 55:
                        string = aq.a.m(context, q1Var.getAvgBikeForce());
                        break;
                    case 56:
                        string = aq.a.m(context, q1Var.getMaxBikeForce());
                        break;
                    case 57:
                        string = aq.a.m(context, q1Var.getNormalizedForce());
                        break;
                    case 58:
                        Double averagePower = q1Var.getAveragePower();
                        l.f68084a.getClass();
                        string = aq.a.F(context, averagePower, l.a.a().v3());
                        break;
                    case 59:
                        Double maxPower = q1Var.getMaxPower();
                        l.f68084a.getClass();
                        string = aq.a.F(context, maxPower, l.a.a().v3());
                        break;
                    case 60:
                        string = aq.a.W(context, q1Var.getSeatedTime());
                        break;
                    case 61:
                        string = aq.a.W(context, q1Var.getStandingTime());
                        break;
                    case 62:
                        string = aq.a.b0(context, q1Var.getAvgRiderTorsoAngle());
                        break;
                    case 63:
                        string = aq.a.b0(context, q1Var.getAvgAeroTorsoAngle());
                        break;
                    case 64:
                        string = aq.a.b0(context, q1Var.getAvgLoweredTorsoAngle());
                        break;
                    case 65:
                        string = aq.a.b0(context, q1Var.getAvgUprightTorsoAngle());
                        break;
                    case 66:
                        string = aq.a.b0(context, q1Var.getAvgStandingTorsoAngle());
                        break;
                    case 67:
                        string = aq.a.W(context, q1Var.getAeroTime());
                        break;
                    case 68:
                        string = aq.a.W(context, q1Var.getLoweredTime());
                        break;
                    case 69:
                        string = aq.a.W(context, q1Var.getUprightTime());
                        break;
                    case 70:
                        string = aq.a.E(context, q1Var.getAvgAeroPower());
                        break;
                    case 71:
                        string = aq.a.E(context, q1Var.getMaxAeroPower());
                        break;
                    case 72:
                        string = aq.a.E(context, q1Var.getAvgLoweredPower());
                        break;
                    case 73:
                        string = aq.a.E(context, q1Var.getMaxLoweredPower());
                        break;
                    case 74:
                        string = aq.a.E(context, q1Var.getAvgUprightPower());
                        break;
                    case 75:
                        string = aq.a.E(context, q1Var.getMaxUprightPower());
                        break;
                    case 76:
                        string = aq.a.E(context, q1Var.getAverageSeatedPower());
                        break;
                    case 77:
                        string = aq.a.E(context, q1Var.getMaxSeatedPower());
                        break;
                    case 78:
                        string = aq.a.E(context, q1Var.getAverageStandingPower());
                        break;
                    case 79:
                        string = aq.a.E(context, q1Var.getMaxStandingPower());
                        break;
                    case 80:
                        string = aq.a.M(context, q1Var.getAvgStepSpeedLoss());
                        break;
                    case 81:
                        string = aq.a.N(context, q1Var.getAvgStepSpeedLossPercent());
                        break;
                    case 82:
                        string = aq.a.O(context, q1Var.getStrideLength());
                        break;
                    case 83:
                        string = aq.a.V(context, q1Var.getAverageTemperature());
                        break;
                    case 84:
                        string = aq.a.V(context, q1Var.getMinTemperature());
                        break;
                    case 85:
                        string = aq.a.V(context, q1Var.getMaxTemperature());
                        break;
                    case 86:
                        string = aq.a.d(context, q1Var.getCalories());
                        break;
                    case 87:
                        string = aq.a.k(context, q1Var.getFloorsClimbed());
                        break;
                    case 88:
                        string = aq.a.l(context, q1Var.getAverageFlow());
                        break;
                    case 89:
                        string = aq.a.p(context, q1Var.getGrit());
                        break;
                    case 90:
                        string = aq.a.t(context, q1Var.getJumpCount());
                        break;
                    case 92:
                        string = aq.a.n(context, q1Var.getGroundContactTime());
                        break;
                    case 93:
                        string = aq.a.o(context, q1Var.getGroundContactBalanceLeft());
                        break;
                    case 94:
                        string = aq.a.f0(context, q1Var.getVerticalOscillation());
                        break;
                    case 95:
                        string = aq.a.g0(context, q1Var.getAverageVerticalRatio());
                        break;
                    case 96:
                        string = aq.a.b(context, q1Var.getAverageStrokeCadence());
                        break;
                    case 97:
                        string = aq.a.x(context, q1Var.getMaxStrokeCadence());
                        break;
                    default:
                        string = context.getString(R.string.no_value);
                        string.getClass();
                        break;
                }
            } else if (lVar instanceof mq.j) {
                string = context.getString(R.string.no_value);
            }
            ((TextView) arrayList2.get(i14)).setText(string);
            oVar.f120193a.setBackgroundColor(e(jVar.f165806a + 1, context));
        }
    }

    public static double d(int i14, List list) {
        Double duration;
        int i15 = 1;
        if (1 > i14) {
            return 0.0d;
        }
        double dDoubleValue = 0.0d;
        while (true) {
            x0 x0Var = (x0) h0.e0(i15 - 1, list);
            dDoubleValue += (x0Var == null || (duration = x0Var.getDuration()) == null) ? 0.0d : duration.doubleValue();
            if (i15 == i14) {
                return dDoubleValue;
            }
            i15++;
        }
    }

    public static int e(int i14, Context context) {
        return i14 % 2 == 0 ? a7.b.getColor(context, R.color.gcm_table_row_even) : a7.b.getColor(context, R.color.gcm_table_row_odd);
    }
}
