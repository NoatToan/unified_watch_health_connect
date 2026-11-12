package em0;

import am.x0;
import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lem0/a;", "", "<init>", "()V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1371a f64581a = new C1371a(null);

    /* JADX INFO: renamed from: em0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lem0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MIN_SDK_VERSION", "I", "GHC_SHARED_PREFERENCE_KEY", "GHC_SYNC_TIME_SHARED_PREFERENCE_KEY", "GHC_USER_PROPERTY_STATE", "GHC_PERMISSIONS_REJECTION_COUNT_PREFERENCE_KEY", "GHC_DISCONNECTED_TRIGGERED", "", "METERS_TO_FLOORS", "D", "b", "d", "a", "c", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1371a {

        /* JADX INFO: renamed from: em0.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lem0/a$a$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum EnumC1372a {
            DIRECT_SPEED("directSpeed"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_RUN_CADENCE("directRunCadence"),
            DIRECT_BIKE_CADENCE("directBikeCadence"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_DOUBLE_CADENCE("directDoubleCadence"),
            DIRECT_ELEVATION("directElevation"),
            /* JADX INFO: Fake field, exist only in values array */
            SUM_DISTANCE("sumDistance"),
            /* JADX INFO: Fake field, exist only in values array */
            SUM_ELAPSED_DURATION("sumElapsedDuration"),
            SUM_DURATION("sumDuration"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_BODY_BATTERY("directBodyBattery"),
            DIRECT_HEART_RATE("directHeartRate"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_FRACTIONAL_CADENCE("directFractionalCadence"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_TIMESTAMP("directTimestamp"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_GRADED_ADJUSTED_SPEED("directGradeAdjustedSpeed"),
            /* JADX INFO: Fake field, exist only in values array */
            SUM_MOVING_DURATION("sumMovingDuration"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_POWER("directPower"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_VERTICAL_SPEED("directVerticalSpeed"),
            /* JADX INFO: Fake field, exist only in values array */
            SUM_ACCUMULATED_POWER("sumAccumulatedPower"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_VERTICAL_OSCILLATION("directVerticalOscillation"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_VERTICAL_RATIO("directVerticalRatio"),
            /* JADX INFO: Fake field, exist only in values array */
            DIRECT_STRIDE_LENGTH("directStrideLength");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64588a;

            EnumC1372a(String str) {
                this.f64588a = str;
            }
        }

        /* JADX INFO: renamed from: em0.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem0/a$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum b {
            INDEX_SCALE,
            MFP,
            CHANGE_LOG,
            MANUAL,
            USER_SETTING,
            BIC,
            PARTNER,
            /* JADX INFO: Fake field, exist only in values array */
            UNKNOWN
        }

        /* JADX INFO: renamed from: em0.a$a$e */
        public static final /* synthetic */ class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f64613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f64614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ int[] f64615d;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.MFP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.MANUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.USER_SETTING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.BIC.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.PARTNER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.CHANGE_LOG.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.INDEX_SCALE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f64612a = iArr;
                int[] iArr2 = new int[x0.values().length];
                try {
                    iArr2[x0.f4327r3.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[x0.f4283f3.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[x0.f4286g3.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[x0.f4312o.ordinal()] = 4;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[x0.R0.ordinal()] = 5;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[x0.U0.ordinal()] = 6;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[x0.V0.ordinal()] = 7;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[x0.W0.ordinal()] = 8;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[x0.X0.ordinal()] = 9;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[x0.Y0.ordinal()] = 10;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[x0.Q0.ordinal()] = 11;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[x0.Z0.ordinal()] = 12;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[x0.f4266a1.ordinal()] = 13;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr2[x0.f4269b1.ordinal()] = 14;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr2[x0.f4272c1.ordinal()] = 15;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr2[x0.f4357z3.ordinal()] = 16;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr2[x0.f4289h3.ordinal()] = 17;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr2[x0.C3.ordinal()] = 18;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr2[x0.f4290i1.ordinal()] = 19;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr2[x0.f4280e3.ordinal()] = 20;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr2[x0.F2.ordinal()] = 21;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr2[x0.f4315o3.ordinal()] = 22;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr2[x0.P1.ordinal()] = 23;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr2[x0.C2.ordinal()] = 24;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr2[x0.f4320q.ordinal()] = 25;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr2[x0.f4295j3.ordinal()] = 26;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr2[x0.f4326r2.ordinal()] = 27;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr2[x0.f4341v3.ordinal()] = 28;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr2[x0.G1.ordinal()] = 29;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr2[x0.S1.ordinal()] = 30;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr2[x0.f4292i3.ordinal()] = 31;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr2[x0.f4273c2.ordinal()] = 32;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr2[x0.S2.ordinal()] = 33;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr2[x0.f4297k1.ordinal()] = 34;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr2[x0.f4301l1.ordinal()] = 35;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr2[x0.f4303l3.ordinal()] = 36;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr2[x0.f4308n.ordinal()] = 37;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr2[x0.H0.ordinal()] = 38;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr2[x0.I0.ordinal()] = 39;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr2[x0.J0.ordinal()] = 40;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr2[x0.N0.ordinal()] = 41;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr2[x0.O0.ordinal()] = 42;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr2[x0.M0.ordinal()] = 43;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr2[x0.D2.ordinal()] = 44;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr2[x0.K0.ordinal()] = 45;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr2[x0.L0.ordinal()] = 46;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr2[x0.f4276d2.ordinal()] = 47;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr2[x0.T2.ordinal()] = 48;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr2[x0.D.ordinal()] = 49;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr2[x0.f4285g2.ordinal()] = 50;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr2[x0.R1.ordinal()] = 51;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr2[x0.f4267a2.ordinal()] = 52;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr2[x0.W1.ordinal()] = 53;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr2[x0.Y1.ordinal()] = 54;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr2[x0.f4270b2.ordinal()] = 55;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr2[x0.X1.ordinal()] = 56;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr2[x0.f4291i2.ordinal()] = 57;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr2[x0.f4307m3.ordinal()] = 58;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr2[x0.f4311n3.ordinal()] = 59;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr2[x0.f4345w3.ordinal()] = 60;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr2[x0.f4305m1.ordinal()] = 61;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr2[x0.f4309n1.ordinal()] = 62;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr2[x0.f4316p.ordinal()] = 63;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr2[x0.I1.ordinal()] = 64;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr2[x0.V2.ordinal()] = 65;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr2[x0.f4313o1.ordinal()] = 66;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr2[x0.f4324r.ordinal()] = 67;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr2[x0.f4317p1.ordinal()] = 68;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr2[x0.f4349x3.ordinal()] = 69;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr2[x0.J1.ordinal()] = 70;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr2[x0.f4319p3.ordinal()] = 71;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr2[x0.f4331t.ordinal()] = 72;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr2[x0.f4325r1.ordinal()] = 73;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr2[x0.f4321q1.ordinal()] = 74;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr2[x0.B.ordinal()] = 75;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr2[x0.f4322q2.ordinal()] = 76;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr2[x0.M1.ordinal()] = 77;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr2[x0.N1.ordinal()] = 78;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr2[x0.O1.ordinal()] = 79;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr2[x0.f4354z.ordinal()] = 80;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr2[x0.A.ordinal()] = 81;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr2[x0.f4288h2.ordinal()] = 82;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr2[x0.F1.ordinal()] = 83;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr2[x0.f4281f1.ordinal()] = 84;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr2[x0.f4284g1.ordinal()] = 85;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr2[x0.f4275d1.ordinal()] = 86;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr2[x0.f4278e1.ordinal()] = 87;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr2[x0.f4338v.ordinal()] = 88;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr2[x0.f4342w.ordinal()] = 89;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr2[x0.f4335u1.ordinal()] = 90;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr2[x0.f4339v1.ordinal()] = 91;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr2[x0.f4343w1.ordinal()] = 92;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr2[x0.f4347x1.ordinal()] = 93;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr2[x0.f4328s1.ordinal()] = 94;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr2[x0.f4332t1.ordinal()] = 95;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr2[x0.C.ordinal()] = 96;
                } catch (NoSuchFieldError unused103) {
                }
                f64613b = iArr2;
                int[] iArr3 = new int[d.values().length];
                try {
                    iArr3[d.DEEP.ordinal()] = 1;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr3[d.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr3[d.REM.ordinal()] = 3;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr3[d.AWAKE.ordinal()] = 4;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr3[d.MANUAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr3[d.UNMEASURED.ordinal()] = 6;
                } catch (NoSuchFieldError unused109) {
                }
                f64614c = iArr3;
                int[] iArr4 = new int[u0.values().length];
                try {
                    iArr4[u0.F4.ordinal()] = 1;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr4[u0.G4.ordinal()] = 2;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr4[u0.H4.ordinal()] = 3;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr4[u0.I4.ordinal()] = 4;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr4[u0.J4.ordinal()] = 5;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr4[u0.L4.ordinal()] = 6;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr4[u0.M4.ordinal()] = 7;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr4[u0.N4.ordinal()] = 8;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr4[u0.O4.ordinal()] = 9;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr4[u0.P4.ordinal()] = 10;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr4[u0.Q4.ordinal()] = 11;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr4[u0.R4.ordinal()] = 12;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr4[u0.S4.ordinal()] = 13;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr4[u0.K4.ordinal()] = 14;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr4[u0.T4.ordinal()] = 15;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr4[u0.W4.ordinal()] = 16;
                } catch (NoSuchFieldError unused125) {
                }
                f64615d = iArr4;
            }
        }

        public /* synthetic */ C1371a(j jVar) {
            this();
        }

        public static long a(String str) {
            return ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0).getLong(str, 0L);
        }

        public static void b(long j8, String str) {
            String strD = n23.j.d(j8, "Setting latest data time for ", str, " as ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GoogleHealthConnectUtil", strD);
            SharedPreferences sharedPreferences = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(str, j8);
            editorEdit.apply();
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 em0.a$a$c[], still in use, count: 1, list:
          (r0v1 em0.a$a$c[]) from 0x005a: CONSTRUCTOR (r0v1 em0.a$a$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
        /* JADX INFO: renamed from: em0.a$a$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lem0/a$a$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c {
            /* JADX INFO: Fake field, exist only in values array */
            UNCONFIRMED("unconfirmed"),
            /* JADX INFO: Fake field, exist only in values array */
            DEVICE_CONFIRMED("device_confirmed"),
            MANUALLY_CONFIRMED("manually_confirmed"),
            /* JADX INFO: Fake field, exist only in values array */
            AUTO_CONFIRMED("auto_confirmed"),
            /* JADX INFO: Fake field, exist only in values array */
            AUTO_CONFIRMED_FINAL("auto_confirmed_final"),
            /* JADX INFO: Fake field, exist only in values array */
            OFF_WRIST("off_wrist"),
            /* JADX INFO: Fake field, exist only in values array */
            ENHANCED_CONFIRMED("enhanced_confirmed"),
            /* JADX INFO: Fake field, exist only in values array */
            ENHANCED_CONFIRMED_FINAL("enhanced_confirmed_final");


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C1373a f64597b = new C1373a(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ w13.c f64600e;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64601a;

            static {
                f64600e = new w13.c(new c[]{r0, r1, r2, new c("auto_confirmed"), new c("auto_confirmed_final"), new c("off_wrist"), new c("enhanced_confirmed"), new c("enhanced_confirmed_final")});
            }

            private c(String str) {
                super(str, i);
                this.f64601a = str;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f64599d.clone();
            }

            /* JADX INFO: renamed from: em0.a$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem0/a$a$c$a;", "", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C1373a {
                public /* synthetic */ C1373a(j jVar) {
                    this();
                }

                private C1373a() {
                }
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 em0.a$a$d[], still in use, count: 1, list:
          (r0v1 em0.a$a$d[]) from 0x0045: CONSTRUCTOR (r0v1 em0.a$a$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
        /* JADX INFO: renamed from: em0.a$a$d */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lem0/a$a$d;", "", "", "activityLevel", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d {
            DEEP(0),
            LIGHT(1),
            REM(2),
            AWAKE(3),
            MANUAL(4),
            UNMEASURED(-1);


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C1374a f64602b = new C1374a(null);

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ w13.c f64610j;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f64611a;

            static {
                f64610j = new w13.c(new d[]{r0, r1, r2, r3, r4, r5});
            }

            private d(int i14) {
                super(str, i);
                this.f64611a = i14;
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) f64609i.clone();
            }

            /* JADX INFO: renamed from: em0.a$a$d$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem0/a$a$d$a;", "", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C1374a {
                public /* synthetic */ C1374a(j jVar) {
                    this();
                }

                private C1374a() {
                }
            }
        }

        private C1371a() {
        }
    }
}
