package lo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.manual.ActivityDiveWaterTypesActivity;
import com.garmin.android.apps.connectmobile.activities.manual.eventType.ActivitiesEventTypeActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t extends Fragment implements f0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f113949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ht.e f113950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollView f113951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f113952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f113953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f113954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f113955g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113956a;

        static {
            int[] iArr = new int[am.x0.values().length];
            f113956a = iArr;
            try {
                iArr[am.x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113956a[am.x0.H0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113956a[am.x0.I0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113956a[am.x0.J0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113956a[am.x0.D2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f113956a[am.x0.M0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f113956a[am.x0.O0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f113956a[am.x0.L0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f113956a[am.x0.N0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f113956a[am.x0.K0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f113956a[am.x0.f4312o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f113956a[am.x0.V0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f113956a[am.x0.B2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f113956a[am.x0.A2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f113956a[am.x0.P2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f113956a[am.x0.O2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f113956a[am.x0.Q0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f113956a[am.x0.R0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f113956a[am.x0.S0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f113956a[am.x0.T0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f113956a[am.x0.U0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f113956a[am.x0.W0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f113956a[am.x0.X0.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f113956a[am.x0.f4266a1.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f113956a[am.x0.Y0.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f113956a[am.x0.f4272c1.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f113956a[am.x0.f4269b1.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f113956a[am.x0.Y2.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f113956a[am.x0.Z2.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f113956a[am.x0.N1.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f113956a[am.x0.O1.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f113956a[am.x0.F1.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f113956a[am.x0.f4354z.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f113956a[am.x0.M1.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f113956a[am.x0.K2.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f113956a[am.x0.f4322q2.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f113956a[am.x0.f4331t.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f113956a[am.x0.f4321q1.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f113956a[am.x0.f4276d2.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f113956a[am.x0.T2.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f113956a[am.x0.B.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f113956a[am.x0.f4310n2.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f113956a[am.x0.f4314o2.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f113956a[am.x0.N2.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f113956a[am.x0.f4318p2.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f113956a[am.x0.W2.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f113956a[am.x0.I1.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f113956a[am.x0.V2.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f113956a[am.x0.G2.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f113956a[am.x0.K1.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f113956a[am.x0.H2.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f113956a[am.x0.I2.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f113956a[am.x0.J2.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f113956a[am.x0.f4326r2.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f113956a[am.x0.X2.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f113956a[am.x0.f4288h2.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f113956a[am.x0.H1.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f113956a[am.x0.E1.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f113956a[am.x0.L1.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f113956a[am.x0.Q1.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f113956a[am.x0.f4281f1.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f113956a[am.x0.f4275d1.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f113956a[am.x0.B1.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f113956a[am.x0.C1.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f113956a[am.x0.D1.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f113956a[am.x0.L2.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f113956a[am.x0.P1.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f113956a[am.x0.f4290i1.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f113956a[am.x0.f4309n1.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f113956a[am.x0.f4325r1.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f113956a[am.x0.f4298k2.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f113956a[am.x0.R2.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f113956a[am.x0.f4302l2.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f113956a[am.x0.f4306m2.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f113956a[am.x0.M2.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f113956a[am.x0.C3.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f113956a[am.x0.f4316p.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f113956a[am.x0.f4293j1.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f113956a[am.x0.f4320q.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f113956a[am.x0.F2.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f113956a[am.x0.f4357z3.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f113956a[am.x0.A3.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f113956a[am.x0.f4324r.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f113956a[am.x0.f4313o1.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f113956a[am.x0.f4317p1.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f113956a[am.x0.E3.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f113956a[am.x0.f4333t2.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f113956a[am.x0.f4297k1.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f113956a[am.x0.f4301l1.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                f113956a[am.x0.V1.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f113956a[am.x0.W1.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f113956a[am.x0.X1.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f113956a[am.x0.T1.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f113956a[am.x0.Q2.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f113956a[am.x0.f4267a2.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f113956a[am.x0.f4270b2.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f113956a[am.x0.Z1.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f113956a[am.x0.f4273c2.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f113956a[am.x0.S2.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f113956a[am.x0.f4285g2.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f113956a[am.x0.f4294j2.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f113956a[am.x0.U2.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f113956a[am.x0.f4323q3.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f113956a[am.x0.f4327r3.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f113956a[am.x0.f4330s3.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f113956a[am.x0.f4334t3.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f113956a[am.x0.f4337u3.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f113956a[am.x0.f4341v3.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f113956a[am.x0.f4345w3.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f113956a[am.x0.f4349x3.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f113956a[am.x0.J1.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f113956a[am.x0.f4353y3.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f113956a[am.x0.Y1.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f113956a[am.x0.f4279e2.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f113956a[am.x0.f4291i2.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f113956a[am.x0.C2.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f113956a[am.x0.f4277d3.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f113956a[am.x0.f4282f2.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f113956a[am.x0.P0.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f113956a[am.x0.f4305m1.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                f113956a[am.x0.G1.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                f113956a[am.x0.f4352y2.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                f113956a[am.x0.f4356z2.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                f113956a[am.x0.R1.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                f113956a[am.x0.D3.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                f113956a[am.x0.S1.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                f113956a[am.x0.f4271b3.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                f113956a[am.x0.f4274c3.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                f113956a[am.x0.f4268a3.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
    public static double u6(am.x0 x0Var, double d14, double d15) {
        f12.l.f68084a.getClass();
        double dV3 = f12.l.a.a().v3();
        double d16 = 0.0d;
        if (dV3 <= 0.0d || x0Var == null || d14 <= 0.0d) {
            return 0.0d;
        }
        double d17 = d14 / 3600.0d;
        double dRound = Math.round(((d15 / d17) * 6.21371192E-4d) * 10.0d) / 10.0d;
        switch (a.f113956a[x0Var.ordinal()]) {
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
                if (dRound < 5.2d) {
                    d16 = 8.0d;
                } else if (dRound < 5.5d) {
                    d16 = 9.0d;
                } else if (dRound < 5.7d) {
                    d16 = 9.3d;
                } else if (dRound < 6.0d) {
                    d16 = 9.7d;
                } else if (dRound < 6.3d) {
                    d16 = 10.0d;
                } else if (dRound < 6.7d) {
                    d16 = 10.5d;
                } else if (dRound < 7.0d) {
                    d16 = 11.0d;
                } else if (dRound < 7.5d) {
                    d16 = 11.5d;
                } else if (dRound < 8.0d) {
                    d16 = 12.5d;
                } else if (dRound < 8.6d) {
                    d16 = 13.5d;
                } else if (dRound < 9.0d) {
                    d16 = 14.0d;
                } else if (dRound >= 10.0d) {
                    d16 = dRound >= 10.9d ? 18.0d : 16.0d;
                } else {
                    d16 = 15.0d;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                if (dRound == 0.0d) {
                    d16 = 8.0d;
                } else if (dRound < 10.0d) {
                    d16 = 4.0d;
                } else if (dRound < 12.0d) {
                    d16 = 6.0d;
                } else if (dRound < 14.0d) {
                    d16 = 8.0d;
                } else if (dRound >= 16.0d) {
                    d16 = 12.0d;
                } else {
                    d16 = 10.0d;
                }
                break;
            case 30:
            case 31:
            case 32:
                d16 = 2.0d;
                break;
            case 33:
            case 34:
            case 35:
            case 36:
                d16 = 2.5d;
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                d16 = 3.0d;
                break;
            case 56:
            case 57:
            case 58:
            case 59:
                d16 = 3.5d;
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                d16 = 4.0d;
                break;
            case 67:
                d16 = 4.5d;
                break;
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                d16 = 5.0d;
                break;
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                d16 = 6.0d;
                break;
            case 87:
                d16 = 6.4d;
                break;
            case 88:
            case 89:
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
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
                d16 = 7.0d;
                break;
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
                d16 = 8.0d;
                break;
            case 119:
                d16 = 8.5d;
                break;
            case 120:
                d16 = 9.0d;
                break;
            case 121:
            case 122:
            case 123:
                d16 = 11.0d;
                break;
            case 124:
            case 125:
                d16 = 12.0d;
                break;
            case 126:
                d16 = 16.5d;
                break;
            case 127:
            case 128:
            case 129:
                if (dRound < 1.5d) {
                    d16 = 2.2439d;
                    break;
                } else if (dRound < 2.0d) {
                    d16 = 2.6936d;
                    break;
                } else {
                    if (dRound < 2.5d) {
                        d16 = 3.1433d;
                    } else if (dRound < 3.0d) {
                        d16 = 3.593d;
                    } else if (dRound < 3.5d) {
                        d16 = 4.0427d;
                    } else if (dRound < 4.0d) {
                        d16 = 4.4924d;
                    } else if (dRound < 4.5d) {
                        d16 = 4.9421d;
                    } else if (dRound < 5.0d) {
                        d16 = 5.3918d;
                    } else if (dRound < 5.5d) {
                        d16 = 5.8415d;
                    } else if (dRound < 6.0d) {
                        d16 = 6.2912d;
                    } else if (dRound < 6.5d) {
                        d16 = 6.7409d;
                    } else if (dRound < 7.0d) {
                        d16 = 7.1906d;
                    } else if (dRound < 7.5d) {
                        d16 = 7.6403d;
                    } else if (dRound < 8.0d) {
                        d16 = 8.09d;
                    } else if (dRound < 8.5d) {
                        d16 = 8.5397d;
                    } else if (dRound < 9.0d) {
                        d16 = 8.9894d;
                    } else if (dRound < 9.5d) {
                        d16 = 9.4391d;
                    } else if (dRound < 10.0d) {
                        d16 = 9.8888d;
                    } else if (dRound < 10.5d) {
                        d16 = 10.3385d;
                    } else if (dRound < 11.0d) {
                        d16 = 10.7882d;
                    } else if (dRound < 11.5d) {
                        d16 = 11.2379d;
                    } else if (dRound < 12.0d) {
                        d16 = 11.6876d;
                    } else if (dRound >= 12.5d) {
                        d16 = dRound >= 13.0d ? 13.0367d : 12.587d;
                    } else {
                        d16 = 12.1373d;
                    }
                    break;
                }
                break;
        }
        double dRound2 = Math.round(d16 * dV3 * d17);
        if (dRound2 > 65534.0d) {
            return 65534.0d;
        }
        return dRound2;
    }

    public static double v6(double d14) {
        f12.l.f68084a.getClass();
        double dV3 = f12.l.a.a().v3();
        if (dV3 <= 0.0d || d14 <= 0.0d) {
            return 0.0d;
        }
        return Math.round((d14 / 3600.0d) * dV3);
    }

    public void A0() {
    }

    public final void A6(String str, String str2, double d14, final int i14, final int i15) {
        int i16;
        String str3;
        int i17 = 1;
        if ("bestLapTime".equalsIgnoreCase(str)) {
            r22.c2.S0.getClass();
            Bundle bundle = new Bundle();
            r22.c2 c2Var = new r22.c2();
            bundle.putInt("EXTRA_MILLISECONDS", (int) d14);
            c2Var.setArguments(bundle);
            c2Var.T = new l(this, str, i17);
            r22.f0.U0.getClass();
            String str4 = r22.f0.V0;
            androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
            if (childFragmentManager.G(str4) == null) {
                c2Var.show(childFragmentManager, str4);
                return;
            }
            return;
        }
        if ("duration".equalsIgnoreCase(str) || "elapsed_time".equalsIgnoreCase(str) || "bottom_time".equalsIgnoreCase(str) || "surface_interval".equalsIgnoreCase(str) || "totalSurfaceTime".equalsIgnoreCase(str) || "splitsDuration".equalsIgnoreCase(str) || "activeSplitsDuration".equalsIgnoreCase(str) || "restSplitsDuration".equalsIgnoreCase(str) || "activeSplitsIdleDuration".equalsIgnoreCase(str) || "activeSplitsMovingDuration".equalsIgnoreCase(str)) {
            String str5 = this.f113949a.J1.f4358a;
            am.z0 z0Var = am.z0.f4390a;
            am.x0 x0Var = am.x0.O1;
            boolean zB = am.z0.b(x0Var, str5);
            boolean zB2 = am.z0.b(x0Var, this.f113949a.J1.f4358a);
            int iRound = (int) Math.round(d14);
            if (am.z0.b(x0Var, this.f113949a.J1.f4358a)) {
                c22.l3.f23124b.getClass();
                iRound = (int) (((double) ((int) ((Math.ceil(d14) + 59.0d) / 60.0d))) * 60.0d);
            }
            r22.f0.U0.getClass();
            r22.f0 f0VarA = r22.f0.a.a(iRound, 500, false, zB, zB2);
            f0VarA.T = new l(this, str, 3);
            String str6 = r22.f0.V0;
            androidx.fragment.app.v childFragmentManager2 = getChildFragmentManager();
            if (childFragmentManager2.G(str6) == null) {
                f0VarA.show(childFragmentManager2, str6);
                return;
            }
            return;
        }
        int i18 = 17;
        if ("duration_millis".equalsIgnoreCase(str)) {
            r22.e2 e2Var = new r22.e2(1, d14, new l3.p1(i18, this, str));
            androidx.fragment.app.v childFragmentManager3 = getChildFragmentManager();
            r22.f0.U0.getClass();
            e2Var.show(childFragmentManager3, r22.f0.V0);
            return;
        }
        if ("po2MinValue".equalsIgnoreCase(str) || "po2MaxValue".equalsIgnoreCase(str)) {
            new r22.h1(requireContext(), new m(this, 5), str, d14, "po2MinValue".equalsIgnoreCase(str) ? this.f113949a.d0() > 0.0d ? this.f113949a.d0() - 0.1d : 2.0d : this.f113949a.e0() > 0.0d ? 0.1d + this.f113949a.e0() : 0.1d);
            return;
        }
        if ("max_speed".equalsIgnoreCase(str) || "racingMaxSpeed".equalsIgnoreCase(str) || "splitsMaxSpeed".equalsIgnoreCase(str)) {
            z6(str, d14, i15, i.b.MAX_SPEED);
            return;
        }
        if ("racingMinSpeed".equalsIgnoreCase(str)) {
            z6(str, d14, i15, i.b.MIN_SPEED);
            return;
        }
        if ("best_pace".equalsIgnoreCase(str)) {
            z6(str, d14, i15, i.b.PACE);
            return;
        }
        if (!"po2LowPointDepth".equalsIgnoreCase(str) && !"po2HighPointDepth".equalsIgnoreCase(str)) {
            View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.gcm_create_manual_activity_number_of_lengths, (ViewGroup) null);
            NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
            numberPicker.setMinValue(i14);
            numberPicker.setMaxValue(i15);
            int iRound2 = (Double.isNaN(d14) || d14 < ((double) i14)) ? i14 : (int) Math.round(d14);
            if (iRound2 > i15) {
                iRound2 = i15;
            }
            numberPicker.setValue(iRound2);
            numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: lo.q
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker2, int i19, int i24) {
                    int i25 = i15;
                    if (i24 > i25 || i24 < (i25 = i14)) {
                        i24 = i25;
                    }
                    numberPicker2.setValue(i24);
                }
            });
            str3 = TextUtils.isEmpty(str2) ? "" : str2;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
            aVar.setTitle(str3).setView(viewInflate).setPositiveButton(R.string.lbl_ok, new bi2.k(this, 23, numberPicker, str)).setNegativeButton(R.string.lbl_cancel, new jm0.c(16));
            oe2.f.X(aVar.show());
            return;
        }
        View viewInflate2 = LayoutInflater.from(requireContext()).inflate(R.layout.gcm_create_manual_activity_number_of_lengths, (ViewGroup) null);
        NumberPicker numberPicker2 = (NumberPicker) viewInflate2.findViewById(R.id.create_activity_number_of_lengths_number_picker);
        int i19 = i15 - i14;
        String[] strArr = new String[i19 + 2];
        strArr[0] = getString(R.string.no_value);
        int i24 = 0;
        while (true) {
            i16 = i19 + 1;
            if (i24 >= i16) {
                break;
            }
            int i25 = i24 + 1;
            strArr[i25] = Integer.toString(i24 + i14);
            i24 = i25;
        }
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(i16);
        numberPicker2.setDisplayedValues(strArr);
        int iRound3 = d14 < ((double) i14) ? i14 : (int) Math.round(d14);
        if (iRound3 > i15) {
            iRound3 = i15;
        }
        numberPicker2.setValue(Double.isNaN(d14) ? 0 : (iRound3 - i14) + 1);
        numberPicker2.setOnValueChangedListener(new p(0));
        str3 = TextUtils.isEmpty(str2) ? "" : str2;
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(requireActivity());
        aVar2.setTitle(str3).setView(viewInflate2).setPositiveButton(R.string.lbl_ok, new c32.c((Object) this, numberPicker2, (Object) str, (Object) strArr, 8)).setNegativeButton(R.string.lbl_cancel, new jm0.c(17));
        aVar2.show();
    }

    public final void C6(double d14, boolean z14, boolean z15) {
        m32.c.b(requireContext(), Double.valueOf(d14), z14, R.string.lbl_pack_weight, z14 ? 100.0d : 220.0d, new o(this, z14, z15, 0)).show();
    }

    public final void E6(String str, String str2) {
        switch (str) {
            case "entry_type":
                HashMap map = new HashMap();
                map.put(getString(R.string.lbl_entry_type_shore), getString(R.string.lbl_entry_type_shore));
                map.put(getString(R.string.lbl_entry_type_boat), getString(R.string.lbl_entry_type_boat));
                I6(getString(R.string.activity_details_entry_type), str, map, str2);
                break;
            case "suit_type":
                HashMap map2 = new HashMap();
                map2.put(getString(R.string.lbl_dive_no_suit), getString(R.string.lbl_dive_no_suit));
                map2.put(getString(R.string.lbl_dive_suit_shorty), getString(R.string.lbl_dive_suit_shorty));
                map2.put(getString(R.string.lbl_dive_suit_semi_dry), getString(R.string.lbl_dive_suit_semi_dry));
                map2.put(getString(R.string.lbl_dive_suit_dry), getString(R.string.lbl_dive_suit_dry));
                map2.put(getString(R.string.lbl_dive_suit_wet), getString(R.string.lbl_dive_suit_wet));
                I6(getString(R.string.activity_details_suit_type), str, map2, str2);
                break;
            case "difficultyScale":
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = this.f113949a.J1.f4358a;
                am.v1 v1Var = am.v1.f4245a;
                str3.getClass();
                am.v1.f4245a.getClass();
                for (String str4 : p13.h0.b1(am.v1.b(str3).keySet())) {
                    linkedHashMap.put(str4, str4);
                }
                I6(getString(R.string.lbl_activity_details_climb_difficulty_grading_system), str, linkedHashMap, str2);
                break;
            case "current":
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(getString(R.string.lbl_current_light), getString(R.string.lbl_current_light));
                linkedHashMap2.put(getString(R.string.lbl_moderate), getString(R.string.lbl_moderate));
                linkedHashMap2.put(getString(R.string.lbl_current_strong), getString(R.string.lbl_current_strong));
                linkedHashMap2.put(getString(R.string.lbl_none), getString(R.string.lbl_none));
                I6(getString(R.string.activity_details_water_current), str, linkedHashMap2, str2);
                break;
            case "surface_conditions":
                HashMap map3 = new HashMap();
                map3.put(getString(R.string.lbl_surface_conditions_large_waves), getString(R.string.lbl_surface_conditions_large_waves));
                map3.put(getString(R.string.lbl_surface_conditions_small_waves), getString(R.string.lbl_surface_conditions_small_waves));
                map3.put(getString(R.string.lbl_surface_conditions_flat), getString(R.string.lbl_surface_conditions_flat));
                I6(getString(R.string.activity_details_surface_condition), str, map3, str2);
                break;
        }
    }

    public final void F6(int i14, int i15, String str, String str2, String str3, String str4) {
        View viewInflate = getLayoutInflater().inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_edit_text);
        str.getClass();
        switch (str) {
            case "max_temperature":
            case "average_temperature":
            case "min_temperature":
                editText.setFilters(new InputFilter[]{new o3(i14, i15)});
                editText.setInputType(4098);
                break;
            case "name":
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i15)});
                editText.setInputType(16385);
                break;
            case "notes":
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i15)});
                editText.setInputType(147457);
                break;
        }
        editText.setHint(str2);
        editText.setText(str4);
        if (!TextUtils.isEmpty(str4)) {
            if (str4.length() <= i15) {
                i15 = str4.length();
            }
            editText.setSelection(i15);
        }
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireActivity()).setTitle(str3).setCancelable(!str.equals("notes")).setView(viewInflate).setPositiveButton(R.string.lbl_done, new bi2.k(this, 22, viewInflate, str)).create();
        Window window = eVarCreate.getWindow();
        Objects.requireNonNull(window);
        window.setSoftInputMode(4);
        eVarCreate.show();
    }

    public final void G6(double d14, boolean z14) {
        r22.e eVarY6 = r22.e.y6(false);
        eVarY6.f149839m = 0;
        eVarY6.f149836j = true;
        eVarY6.f149840n = 999;
        eVarY6.v6((int) d14);
        ArrayList<l3> arrayListA = p3.a(requireContext(), Arrays.asList(getString(l3.METER.f113908b), getString(l3.FOOT.f113908b)));
        l3 l3Var = z14 ? arrayListA.get(0) : arrayListA.get(1);
        if (l3Var != null) {
            eVarY6.E = l3Var;
        }
        eVarY6.w6(arrayListA);
        eVarY6.X = new m(this, 0);
        eVarY6.show(getChildFragmentManager(), "ActivityDistanceSegmentedPickerDialogFragment");
    }

    public final void H6(com.garmin.android.apps.connectmobile.activities.newmodel.t tVar) {
        int i14 = ActivityDiveWaterTypesActivity.f29137j;
        Intent intent = new Intent(getActivity(), (Class<?>) ActivityDiveWaterTypesActivity.class);
        if (tVar != null) {
            Integer num = tVar.f29674e;
            if (num != null) {
                intent.putExtra("activity_dive_water_type", num.intValue());
            }
            Double d14 = tVar.f29675f;
            if (d14 != null) {
                intent.putExtra("activity_dive_water_density", d14.doubleValue());
            }
        }
        startActivityForResult(intent, 14);
    }

    public final void I6(String str, String str2, HashMap map, Object obj) {
        new r22.y1().a(requireActivity(), str, map, obj, new l(this, str2, 0));
    }

    public void S4() {
    }

    public void j0() {
    }

    public void j1() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 != -1) {
            if (i15 == 0) {
                if (i14 == 35 || i14 == 36 || i14 == 37) {
                    requireActivity().setResult(1);
                    requireActivity().finish();
                    return;
                }
                return;
            }
            return;
        }
        if (i14 != 35 && i14 != 36 && i14 != 37) {
            w6();
        }
        if (i14 == 38) {
            String stringExtra = intent.getStringExtra("GCM_extra_event_type");
            qs.g.f147071e.getClass();
            qs.g gVarA = qs.g.a.a(stringExtra);
            f0 f0Var = this.f113949a;
            f0Var.L1 = gVarA;
            GCMComplexTwoLineButton gCMComplexTwoLineButton = f0Var.f113811o;
            if (gCMComplexTwoLineButton != null) {
                f0.v0(gCMComplexTwoLineButton, gCMComplexTwoLineButton.getContext().getString(gVarA.f147087d));
            }
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = f0Var.f113815p;
            if (gCMComplexTwoLineButton2 != null) {
                f0.v0(gCMComplexTwoLineButton2, gCMComplexTwoLineButton2.getContext().getString(gVarA.f147087d));
            }
            w6();
            return;
        }
        switch (i14) {
            case 10:
                this.f113949a.Q0(am.z0.l(am.x0.f4308n, intent.getStringExtra("GCM_extra_activity_type")));
                break;
            case 11:
                this.f113949a.N0(intent.getDoubleExtra("GCM_extra_activity_pool_length_value", 0.0d), intent.getStringExtra("GCM_extra_activity_pool_length_unit"));
                break;
            case 12:
                String stringExtra2 = intent.getStringExtra("GCM_extra_activity_type");
                am.l.f4047c.getClass();
                this.f113949a.O0(am.l.a.a(stringExtra2, am.l.f4051g));
                break;
            case 13:
                Bundle extras = intent.getExtras();
                com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) am.a2.c(extras, "extra_selected_course");
                this.f113953e = am.a2.d(extras, "extra_course_list");
                f0 f0Var2 = this.f113949a;
                Context context = f0Var2.O.getContext();
                f0Var2.f113806m2 = dVar;
                f0.v0(f0Var2.O, dVar != null ? dVar.courseName : context.getString(R.string.no_value));
                break;
            case 14:
                int intExtra = intent.getIntExtra("activity_dive_water_type", -1);
                double doubleExtra = intent.getDoubleExtra("activity_dive_water_density", -1.0d);
                if (intExtra != -1) {
                    f0 f0Var3 = this.f113949a;
                    if (f0Var3.K1 == null) {
                        f0Var3.K1 = new com.garmin.android.apps.connectmobile.activities.newmodel.t();
                    }
                    f0Var3.K1.f29674e = Integer.valueOf(intExtra);
                    if (intExtra == 3) {
                        f0Var3.K1.f29675f = Double.valueOf(doubleExtra * 1000.0d);
                    }
                    GCMComplexTwoLineButton gCMComplexTwoLineButton3 = f0Var3.Z;
                    if (gCMComplexTwoLineButton3 != null) {
                        f0Var3.c1("water_type", ar.d.a(gCMComplexTwoLineButton3.getContext(), f0Var3.K1));
                    }
                }
                break;
            case 15:
                ArrayList arrayListD = am.a2.d(intent.getExtras(), "extra.activity.dive.gases");
                f0 f0Var4 = this.f113949a;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = f0Var4.f113778f2;
                if (hVar != null) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.s sVar = hVar.f29461n;
                    sVar.f29669n = arrayListD;
                    f0Var4.F0(sVar);
                }
                if (this.f113950b == null) {
                    this.f113950b = new ht.e(false, false, false, false);
                }
                this.f113950b.f85468a = true;
                break;
            case 16:
                this.f113949a.X0(intent.getDoubleExtra("latitude", 0.0d), intent.getDoubleExtra("longitude", 0.0d));
                break;
            case 17:
                this.f113949a.Y0(intent.getDoubleExtra("latitude", 0.0d), intent.getDoubleExtra("longitude", 0.0d));
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        return layoutInflater.inflate(R.layout.gcm3_activities_create_edit_activity_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(this.f113954f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        TextView textView;
        super.onViewCreated(view2, bundle);
        this.f113952d = view2.findViewById(R.id.activity_more_data_scroll_point);
        this.f113951c = (ScrollView) view2.findViewById(R.id.activity_scroll_container);
        if (getView() == null || (textView = (TextView) getView().findViewById(R.id.activity_privacy_label)) == null) {
            return;
        }
        textView.setOnClickListener(new js0.d(this, 14));
    }

    public void u() {
    }

    public void w6() {
    }

    public final void y6(qs.g gVar, am.x0 x0Var, Calendar calendar, long j8, boolean z14) {
        c22.j0 j0Var = c22.j0.f23099a;
        calendar.getClass();
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(calendar.getTime());
        str.getClass();
        ActivitiesEventTypeActivity.f29178b.getClass();
        gVar.getClass();
        x0Var.getClass();
        Intent intent = new Intent(getActivity(), (Class<?>) ActivitiesEventTypeActivity.class);
        intent.putExtra("GCM_extra_start_date", str);
        intent.putExtra("GCM_extra_event_type", gVar);
        intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
        intent.putExtra("GCM_extra_activity_id", j8);
        intent.putExtra("CAN_TRIATHLON_ACTIVITY_LINKED", z14);
        startActivityForResult(intent, 38);
    }

    public final void z6(String str, double d14, int i14, i.b bVar) {
        f0 f0Var = this.f113949a;
        i iVarT6 = i.T6(d14, i14, f0Var.J1, f0Var.k0(), bVar);
        iVarT6.Y0 = new l(this, str, 2);
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.G(IntegerTokenConverter.CONVERTER_KEY) == null) {
            iVarT6.show(childFragmentManager, IntegerTokenConverter.CONVERTER_KEY);
        }
    }
}
