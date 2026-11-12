package com.garmin.android.apps.connectmobile.devices;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    LEGACY,
    AGGREGATED,
    DYNAMIC,
    REALTIME;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0573a f33827a = new C0573a(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0573a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0574a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f33833a;

            static {
                int[] iArr = new int[yl2.b.values().length];
                try {
                    iArr[yl2.b.f197693g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yl2.b.f197700h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yl2.b.f197707i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[yl2.b.f197714j.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[yl2.b.f197721k.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[yl2.b.f197729l.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[yl2.b.f197736m.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[yl2.b.f197743n.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[yl2.b.f197750o.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[yl2.b.f197757p.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[yl2.b.Z.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[yl2.b.f197722k0.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[yl2.b.H0.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[yl2.b.I0.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[yl2.b.J0.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[yl2.b.K0.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[yl2.b.L0.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[yl2.b.U0.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[yl2.b.f197765q1.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[yl2.b.f197772r1.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[yl2.b.f197778s1.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[yl2.b.f197785t1.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[yl2.b.f197798v1.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[yl2.b.f197805w1.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[yl2.b.C1.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[yl2.b.D1.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[yl2.b.E1.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[yl2.b.F1.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[yl2.b.G1.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[yl2.b.H1.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[yl2.b.M1.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[yl2.b.N1.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[yl2.b.O1.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[yl2.b.P1.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[yl2.b.Q1.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[yl2.b.T1.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[yl2.b.U1.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[yl2.b.V1.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[yl2.b.W1.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[yl2.b.X1.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[yl2.b.Y1.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[yl2.b.Z1.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[yl2.b.H2.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[yl2.b.I2.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[yl2.b.J2.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[yl2.b.K2.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[yl2.b.L2.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[yl2.b.U2.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[yl2.b.F4.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[yl2.b.G4.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[yl2.b.H4.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[yl2.b.I4.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[yl2.b.J4.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[yl2.b.K4.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[yl2.b.L4.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[yl2.b.M4.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[yl2.b.N4.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[yl2.b.O4.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[yl2.b.P4.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[yl2.b.Q4.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[yl2.b.R4.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[yl2.b.S4.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[yl2.b.T4.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[yl2.b.U4.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[yl2.b.V4.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[yl2.b.W4.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[yl2.b.X4.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[yl2.b.Y4.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[yl2.b.f197673c5.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[yl2.b.f197691f5.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[yl2.b.f197679d5.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[yl2.b.f197684e5.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[yl2.b.f197698g5.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[yl2.b.f197705h5.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[yl2.b.f197712i5.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[yl2.b.f197789t5.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[yl2.b.f197809w5.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[yl2.b.f197748n5.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[yl2.b.f197795u5.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[yl2.b.F5.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[yl2.b.G5.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[yl2.b.f197719j5.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[yl2.b.f197727k5.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[yl2.b.f197734l5.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[yl2.b.f197741m5.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[yl2.b.f197755o5.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[yl2.b.f197762p5.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[yl2.b.H5.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[yl2.b.B5.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[yl2.b.C5.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[yl2.b.N5.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[yl2.b.O5.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[yl2.b.f197674c6.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[yl2.b.f197764q.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[yl2.b.f197771r.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[yl2.b.f197797v.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[yl2.b.C.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[yl2.b.f197804w.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[yl2.b.f197784t.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[yl2.b.f197811x.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[yl2.b.f197818y.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[yl2.b.f197825z.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[yl2.b.A.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[yl2.b.B.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[yl2.b.D.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[yl2.b.E.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[yl2.b.F.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[yl2.b.I.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[yl2.b.P.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[yl2.b.T.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[yl2.b.X.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[yl2.b.Y.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[yl2.b.M0.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[yl2.b.N0.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[yl2.b.S0.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[yl2.b.T0.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[yl2.b.V0.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[yl2.b.f197812x1.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[yl2.b.f197819y1.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[yl2.b.f197826z1.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[yl2.b.I1.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[yl2.b.J1.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[yl2.b.R1.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[yl2.b.f197658a2.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[yl2.b.f197664b2.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[yl2.b.f197670c2.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[yl2.b.f197676d2.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[yl2.b.f197682e2.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[yl2.b.f197688f2.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[yl2.b.f197695g2.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[yl2.b.f197702h2.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[yl2.b.f197709i2.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[yl2.b.f197738m2.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[yl2.b.f197759p2.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr[yl2.b.f197766q2.ordinal()] = 135;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr[yl2.b.f197773r2.ordinal()] = 136;
                } catch (NoSuchFieldError unused136) {
                }
                try {
                    iArr[yl2.b.f197779s2.ordinal()] = 137;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr[yl2.b.f197786t2.ordinal()] = 138;
                } catch (NoSuchFieldError unused138) {
                }
                try {
                    iArr[yl2.b.f197792u2.ordinal()] = 139;
                } catch (NoSuchFieldError unused139) {
                }
                try {
                    iArr[yl2.b.f197799v2.ordinal()] = 140;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr[yl2.b.f197806w2.ordinal()] = 141;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr[yl2.b.M2.ordinal()] = 142;
                } catch (NoSuchFieldError unused142) {
                }
                try {
                    iArr[yl2.b.N2.ordinal()] = 143;
                } catch (NoSuchFieldError unused143) {
                }
                try {
                    iArr[yl2.b.O2.ordinal()] = 144;
                } catch (NoSuchFieldError unused144) {
                }
                try {
                    iArr[yl2.b.P2.ordinal()] = 145;
                } catch (NoSuchFieldError unused145) {
                }
                try {
                    iArr[yl2.b.Q2.ordinal()] = 146;
                } catch (NoSuchFieldError unused146) {
                }
                try {
                    iArr[yl2.b.R2.ordinal()] = 147;
                } catch (NoSuchFieldError unused147) {
                }
                try {
                    iArr[yl2.b.S2.ordinal()] = 148;
                } catch (NoSuchFieldError unused148) {
                }
                try {
                    iArr[yl2.b.Y2.ordinal()] = 149;
                } catch (NoSuchFieldError unused149) {
                }
                try {
                    iArr[yl2.b.Z2.ordinal()] = 150;
                } catch (NoSuchFieldError unused150) {
                }
                try {
                    iArr[yl2.b.f197659a3.ordinal()] = 151;
                } catch (NoSuchFieldError unused151) {
                }
                try {
                    iArr[yl2.b.f197665b3.ordinal()] = 152;
                } catch (NoSuchFieldError unused152) {
                }
                try {
                    iArr[yl2.b.f197683e3.ordinal()] = 153;
                } catch (NoSuchFieldError unused153) {
                }
                try {
                    iArr[yl2.b.T2.ordinal()] = 154;
                } catch (NoSuchFieldError unused154) {
                }
                try {
                    iArr[yl2.b.f197689f3.ordinal()] = 155;
                } catch (NoSuchFieldError unused155) {
                }
                try {
                    iArr[yl2.b.f197788t4.ordinal()] = 156;
                } catch (NoSuchFieldError unused156) {
                }
                try {
                    iArr[yl2.b.f197794u4.ordinal()] = 157;
                } catch (NoSuchFieldError unused157) {
                }
                try {
                    iArr[yl2.b.f197801v4.ordinal()] = 158;
                } catch (NoSuchFieldError unused158) {
                }
                try {
                    iArr[yl2.b.f197808w4.ordinal()] = 159;
                } catch (NoSuchFieldError unused159) {
                }
                try {
                    iArr[yl2.b.f197822y4.ordinal()] = 160;
                } catch (NoSuchFieldError unused160) {
                }
                try {
                    iArr[yl2.b.f197829z4.ordinal()] = 161;
                } catch (NoSuchFieldError unused161) {
                }
                try {
                    iArr[yl2.b.A4.ordinal()] = 162;
                } catch (NoSuchFieldError unused162) {
                }
                try {
                    iArr[yl2.b.B4.ordinal()] = 163;
                } catch (NoSuchFieldError unused163) {
                }
                try {
                    iArr[yl2.b.V2.ordinal()] = 164;
                } catch (NoSuchFieldError unused164) {
                }
                try {
                    iArr[yl2.b.W2.ordinal()] = 165;
                } catch (NoSuchFieldError unused165) {
                }
                try {
                    iArr[yl2.b.X2.ordinal()] = 166;
                } catch (NoSuchFieldError unused166) {
                }
                try {
                    iArr[yl2.b.f197769q5.ordinal()] = 167;
                } catch (NoSuchFieldError unused167) {
                }
                try {
                    iArr[yl2.b.P5.ordinal()] = 168;
                } catch (NoSuchFieldError unused168) {
                }
                try {
                    iArr[yl2.b.Q5.ordinal()] = 169;
                } catch (NoSuchFieldError unused169) {
                }
                try {
                    iArr[yl2.b.f197668b6.ordinal()] = 170;
                } catch (NoSuchFieldError unused170) {
                }
                try {
                    iArr[yl2.b.Z5.ordinal()] = 171;
                } catch (NoSuchFieldError unused171) {
                }
                try {
                    iArr[yl2.b.f197662a6.ordinal()] = 172;
                } catch (NoSuchFieldError unused172) {
                }
                try {
                    iArr[yl2.b.f197699g6.ordinal()] = 173;
                } catch (NoSuchFieldError unused173) {
                }
                try {
                    iArr[yl2.b.f197706h6.ordinal()] = 174;
                } catch (NoSuchFieldError unused174) {
                }
                try {
                    iArr[yl2.b.f197713i6.ordinal()] = 175;
                } catch (NoSuchFieldError unused175) {
                }
                try {
                    iArr[yl2.b.f197720j6.ordinal()] = 176;
                } catch (NoSuchFieldError unused176) {
                }
                try {
                    iArr[yl2.b.f197728k6.ordinal()] = 177;
                } catch (NoSuchFieldError unused177) {
                }
                try {
                    iArr[yl2.b.f197735l6.ordinal()] = 178;
                } catch (NoSuchFieldError unused178) {
                }
                try {
                    iArr[yl2.b.W0.ordinal()] = 179;
                } catch (NoSuchFieldError unused179) {
                }
                try {
                    iArr[yl2.b.f197791u1.ordinal()] = 180;
                } catch (NoSuchFieldError unused180) {
                }
                try {
                    iArr[yl2.b.A1.ordinal()] = 181;
                } catch (NoSuchFieldError unused181) {
                }
                try {
                    iArr[yl2.b.B1.ordinal()] = 182;
                } catch (NoSuchFieldError unused182) {
                }
                try {
                    iArr[yl2.b.K1.ordinal()] = 183;
                } catch (NoSuchFieldError unused183) {
                }
                try {
                    iArr[yl2.b.E2.ordinal()] = 184;
                } catch (NoSuchFieldError unused184) {
                }
                f33833a = iArr;
            }
        }

        public /* synthetic */ C0573a(j jVar) {
            this();
        }

        public static a a(String str) {
            a aVar;
            yl2.b bVar = (yl2.b) yl2.b.B6.get(str == null ? "" : str);
            if (bVar == null) {
                bVar = yl2.b.f197686f;
            }
            switch (C0574a.f33833a[bVar.ordinal()]) {
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
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
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
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
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                    aVar = a.LEGACY;
                    break;
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
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                case 137:
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case SyslogConstants.LOG_LOCAL3 /* 152 */:
                case 153:
                case 154:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 156:
                case 157:
                case 158:
                case 159:
                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 169:
                case 170:
                case 171:
                case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                case 173:
                case 174:
                case 175:
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                case 177:
                case 178:
                    aVar = a.AGGREGATED;
                    break;
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case SyslogConstants.LOG_LOCAL7 /* 184 */:
                    aVar = a.DYNAMIC;
                    break;
                default:
                    aVar = a.REALTIME;
                    break;
            }
            String str2 = "DeviceSettingsType for productNumber " + str + " [GarminDeviceType." + bVar + "] is " + aVar;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "DeviceSettingsType", str2);
            return aVar;
        }

        private C0573a() {
        }
    }
}
