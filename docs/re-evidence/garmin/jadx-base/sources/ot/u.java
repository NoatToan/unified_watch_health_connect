package ot;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.p0;
import p13.t0;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lot/u;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/i;", "reportDTO", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/i;Lot/x;)V", "b", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends l implements bu.g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f133675x = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt.i f133676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f133677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f133678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f133679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f133680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f133681w;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133687a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.J0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.D2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.L0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.M0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.I0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.N0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.f4268a3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.f4271b3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.O0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.f4292i3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.E2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[x0.R1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[x0.f4280e3.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[x0.N1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[x0.f4340v2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[x0.H0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[x0.K0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[x0.f4312o.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[x0.Q0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[x0.V0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[x0.f4269b1.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[x0.f4272c1.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[x0.S0.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[x0.T0.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[x0.U0.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[x0.Z0.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[x0.Y0.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[x0.R0.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[x0.f4281f1.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[x0.f4284g1.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[x0.Y2.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[x0.Z2.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[x0.f4283f3.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[x0.P1.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[x0.E3.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[x0.f4320q.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[x0.C1.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[x0.Q1.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[x0.F2.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[x0.B3.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[x0.f4311n3.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[x0.B1.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[x0.D1.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[x0.f4299k3.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[x0.f4315o3.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[x0.f4289h3.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[x0.W0.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[x0.X0.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[x0.f4266a1.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[x0.S1.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[x0.L2.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[x0.J1.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[x0.f4323q3.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[x0.f4353y3.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[x0.f4337u3.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[x0.f4349x3.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[x0.f4341v3.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[x0.f4345w3.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[x0.f4327r3.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[x0.f4334t3.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[x0.f4330s3.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[x0.f4354z.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[x0.A.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[x0.P0.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[x0.f4275d1.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[x0.f4278e1.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[x0.f4287h1.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[x0.f4267a2.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[x0.Y1.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[x0.V1.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[x0.W1.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[x0.f4279e2.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[x0.X1.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[x0.f4270b2.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[x0.f4348x2.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[x0.f4344w2.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[x0.f4285g2.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[x0.f4288h2.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[x0.f4295j3.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[x0.f4291i2.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[x0.f4282f2.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[x0.f4324r.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[x0.f4317p1.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[x0.f4313o1.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[x0.D.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[x0.f4310n2.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[x0.f4314o2.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[x0.A2.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[x0.f4318p2.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[x0.f4276d2.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[x0.B2.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[x0.f4273c2.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[x0.f4296k0.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[x0.f4294j2.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[x0.T1.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[x0.f4306m2.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[x0.f4302l2.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[x0.I1.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[x0.K1.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[x0.H2.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[x0.I2.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[x0.J2.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[x0.M1.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[x0.K2.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[x0.X2.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[x0.G2.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[x0.M2.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[x0.N2.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[x0.O2.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[x0.P2.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[x0.Q2.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[x0.R2.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[x0.S2.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[x0.T2.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[x0.U2.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[x0.V2.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[x0.W2.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[x0.f4326r2.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[x0.f4331t.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[x0.f4274c3.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[x0.f4329s2.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[x0.B.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[x0.f4321q1.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[x0.f4325r1.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[x0.f4309n1.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[x0.f4293j1.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[x0.f4290i1.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[x0.f4297k1.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[x0.f4301l1.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[x0.f4305m1.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[x0.f4333t2.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[x0.C2.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[x0.f4357z3.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[x0.A3.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[x0.C3.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[x0.D3.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[x0.f4286g3.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[x0.f4316p.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[x0.f4346x.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[x0.F.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[x0.f4277d3.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[x0.f4307m3.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[x0.f4319p3.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[x0.f4303l3.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[x0.F3.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[x0.C.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[x0.f4338v.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[x0.f4342w.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[x0.f4328s1.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[x0.f4332t1.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[x0.f4335u1.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[x0.f4339v1.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[x0.f4343w1.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[x0.f4347x1.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[x0.I.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[x0.P.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[x0.X.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[x0.Z.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[x0.Y.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[x0.T.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[x0.O1.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[x0.f4304m.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[x0.f4350y.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[x0.E.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[x0.f4351y1.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[x0.f4355z1.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[x0.A1.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[x0.E1.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[x0.F1.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[x0.G1.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[x0.H1.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[x0.L1.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[x0.U1.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[x0.Z1.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[x0.f4298k2.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[x0.f4336u2.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            f133687a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.RecapChapter$handleLottieDrawable$1", f = "RecapChapter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LottieDrawable f133689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f133690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LottieDrawable lottieDrawable, Context context, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f133689b = lottieDrawable;
            this.f133690c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u.this.new d(this.f133689b, this.f133690c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String profileImg;
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = u.f133675x;
            u uVar = u.this;
            int size = uVar.f133681w.size();
            LottieDrawable lottieDrawable = this.f133689b;
            if (size <= 0) {
                Iterator it = uVar.f133650d.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((Marker) next).getName(), "Recap_List"));
                Marker marker = (Marker) next;
                if (marker != null) {
                    uVar.a(lottieDrawable, p13.w.c(marker));
                }
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            tt.n coverPage = uVar.f133676r.getCoverPage();
            Context context = this.f133690c;
            LottieDrawable lottieDrawable2 = this.f133689b;
            if (coverPage != null && (profileImg = coverPage.getProfileImg()) != null) {
                x53.c cVar = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new v(context, profileImg, atomicBoolean, uVar, lottieDrawable2, null), 3);
            }
            zp0.c.f206560v.getClass();
            zp0.c cVarA = zp0.c.a.a(context);
            cVarA.f206567g = R.drawable.avatar_default;
            Bitmap bitmapC = cVarA.c();
            if (bitmapC != null && !atomicBoolean.get()) {
                if ((lottieDrawable2 != null ? lottieDrawable2.getComposition() : null) != null) {
                    int i15 = uVar.f133678t;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, i15, i15, false);
                    bitmapCreateScaledBitmap.getClass();
                    lottieDrawable2.updateBitmap("image_0", bitmapCreateScaledBitmap);
                }
            }
            uVar.t(this.f133690c, lottieDrawable, 0);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, tt.i iVar, x xVar) {
        super(context, xVar);
        context.getClass();
        iVar.getClass();
        xVar.getClass();
        this.f133676r = iVar;
        this.f133677s = "RecapChapter";
        this.f133678t = 121;
        this.f133679u = 96;
        this.f133681w = new ArrayList();
        oe2.f.P(context);
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133671n() {
        return this.f133677s;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/recap";
    }

    /* JADX WARN: Code duplicated, block: B:121:0x037f  */
    /* JADX WARN: Code duplicated, block: B:40:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3 A[PHI: r11
      0x01c3: PHI (r11v22 ot.u$b) = (r11v1 ot.u$b), (r11v3 ot.u$b) binds: [B:62:0x01c1, B:70:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0215  */
    /* JADX WARN: Code duplicated, block: B:79:0x026a  */
    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        b bVar7;
        b bVar8;
        b bVar9;
        b bVar10;
        TextPaint textPaintS;
        TextPaint textPaintS2;
        Float fR;
        Double totalCalories;
        Double totalElevationGain;
        Double totalDistance;
        Double totalDuration;
        List<tt.h> listC;
        tt.h hVar;
        int color;
        Integer activityCount;
        Integer totalPushes;
        Integer totalSteps;
        String fullName;
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "RecapChapter", "calculateShareAreaMargin");
        float asFloat = jsonObjectC.get("h").getAsFloat();
        i2.a.b(a2Var, "RecapChapter", "rootHeight: " + asFloat);
        i2.a.b(a2Var, "RecapChapter", "finalContentAreaSize: " + this.f133655i);
        Integer numValueOf = Integer.valueOf((int) ((182.0f / asFloat) * this.f133655i.f128595b.floatValue()));
        this.f133680v = numValueOf;
        i2.a.b(a2Var, "RecapChapter", "calculated rectangle height: " + numValueOf);
        pt.i.f140571a.getClass();
        JsonObject jsonObjectH = pt.i.h(jsonObjectC, "image_0");
        if (jsonObjectH != null) {
            JsonElement jsonElement = jsonObjectH.get("w");
            Integer numValueOf2 = jsonElement != null ? Integer.valueOf(jsonElement.getAsInt()) : null;
            if (numValueOf2 != null) {
                this.f133678t = numValueOf2.intValue();
            }
        }
        JsonObject jsonObjectH2 = pt.i.h(jsonObjectC, "image_1");
        if (jsonObjectH2 != null) {
            JsonElement jsonElement2 = jsonObjectH2.get("w");
            Integer numValueOf3 = jsonElement2 != null ? Integer.valueOf(jsonElement2.getAsInt()) : null;
            if (numValueOf3 != null) {
                this.f133679u = numValueOf3.intValue();
            }
        }
        JsonObject jsonObjectM = pt.i.m(jsonObjectC, "User_Name");
        tt.i iVar = this.f133676r;
        if (jsonObjectM != null) {
            String strP = pt.i.p(jsonObjectM);
            if (strP == null) {
                strP = "";
            }
            tt.n coverPage = iVar.getCoverPage();
            String str = (coverPage == null || (fullName = coverPage.getFullName()) == null) ? strP : fullName;
            pt.i.g(context, jsonObjectC, "User_Name", str);
            pt.i.y(jsonObjectC, "User_Name", pt.i.a(context, jsonObjectC, "User_Name", this.f133656j, str, true));
        }
        ArrayList arrayList = this.f133681w;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        tt.r steps = iVar.getSteps();
        if (steps == null || (totalSteps = steps.getTotalSteps()) == null) {
            bVar = null;
        } else {
            l3.f23124b.getClass();
            String str2 = l3.f23131i.format(totalSteps);
            if (str2 == null) {
                bVar = null;
            } else {
                String string = context.getString(R.string.lbl_steps);
                string.getClass();
                bVar = new b("icon_steps", str2, string, null, null, 24, null);
            }
        }
        if (bVar != null) {
            arrayList2.add(bVar);
        }
        tt.o pushes = iVar.getPushes();
        if (pushes == null || (totalPushes = pushes.getTotalPushes()) == null) {
            bVar2 = null;
        } else {
            l3.f23124b.getClass();
            String str3 = l3.f23131i.format(totalPushes);
            if (str3 == null) {
                bVar2 = null;
            } else {
                String string2 = context.getString(R.string.lbl_pushes);
                string2.getClass();
                bVar2 = new b("icon_pushes", str3, string2, null, null, 24, null);
            }
        }
        if (bVar2 != null) {
            arrayList2.add(bVar2);
        }
        tt.q sleepScore = iVar.getSleepScore();
        if (sleepScore != null) {
            String string3 = context.getString(R.string.sleep_lbl_average_prefix);
            string3.getClass();
            String lowerCase = string3.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Integer avgSleepScore = sleepScore.getAvgSleepScore();
            if (avgSleepScore != null) {
                l3.f23124b.getClass();
                String str4 = l3.f23131i.format(avgSleepScore);
                if (str4 != null) {
                    String str5 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{str4, lowerCase}, 2));
                    String string4 = context.getString(R.string.lbl_sleep_score);
                    string4.getClass();
                    bVar3 = new b("icon_sleep_score", str5, string4, null, null, 24, null);
                } else {
                    bVar3 = null;
                }
            } else {
                bVar3 = null;
            }
        } else {
            bVar3 = null;
        }
        if (bVar3 == null) {
            tt.p sleep = iVar.getSleep();
            if (sleep != null) {
                String string5 = context.getString(R.string.sleep_lbl_average_prefix);
                string5.getClass();
                String lowerCase2 = string5.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer avgSleepSeconds = sleep.getAvgSleepSeconds();
                if (avgSleepSeconds != null) {
                    int iIntValue = avgSleepSeconds.intValue();
                    pt.h.f140570a.getClass();
                    String str6 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{pt.h.c(iIntValue, context), lowerCase2}, 2));
                    String string6 = context.getString(R.string.sleep_lbl_sleep);
                    string6.getClass();
                    bVar3 = new b("icon_sleep", str6, string6, null, null, 24, null);
                } else {
                    bVar3 = null;
                }
            } else {
                bVar3 = null;
            }
            if (bVar3 != null) {
                arrayList2.add(bVar3);
            }
        } else {
            arrayList2.add(bVar3);
        }
        tt.l bodyBattery = iVar.getBodyBattery();
        if (bodyBattery != null) {
            String string7 = context.getString(R.string.lbl_avg_high);
            string7.getClass();
            String lowerCase3 = string7.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            Integer avgDailyBbHigh = bodyBattery.getAvgDailyBbHigh();
            if (avgDailyBbHigh != null) {
                l3.f23124b.getClass();
                String str7 = l3.f23131i.format(avgDailyBbHigh);
                if (str7 != null) {
                    String str8 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{str7, lowerCase3}, 2));
                    String string8 = context.getString(R.string.gcm_body_battery_lbl_body_battery);
                    string8.getClass();
                    bVar4 = new b("icon_body_battery", str8, string8, null, null, 24, null);
                } else {
                    bVar4 = null;
                }
            } else {
                bVar4 = null;
            }
        } else {
            bVar4 = null;
        }
        if (bVar4 != null) {
            arrayList2.add(bVar4);
        }
        tt.f activitySummary = iVar.getActivitySummary();
        if (activitySummary == null || (activityCount = activitySummary.getActivityCount()) == null) {
            bVar5 = null;
        } else {
            int iIntValue2 = activityCount.intValue();
            l3.f23124b.getClass();
            String str9 = l3.f23131i.format(Integer.valueOf(iIntValue2));
            String string9 = context.getString(R.string.annual_report_recap_sub_total_activities);
            string9.getClass();
            str9.getClass();
            bVar5 = new b("icon_activity", str9, string9, null, null, 24, null);
        }
        if (bVar5 != null) {
            arrayList2.add(bVar5);
        }
        tt.f activitySummary2 = iVar.getActivitySummary();
        if (activitySummary2 == null || (listC = activitySummary2.c()) == null || (hVar = (tt.h) h0.d0(listC)) == null) {
            bVar6 = null;
        } else {
            to.o activityType = hVar.getActivityType();
            x0 x0VarL = z0.l(x0.f4346x, activityType != null ? activityType.j() : null);
            int i15 = x0VarL.f4361d;
            switch (c.f133687a[x0VarL.ordinal()]) {
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
                    color = context.getColor(R.color.gds_data_viz_red_secondary);
                    break;
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
                    color = context.getColor(R.color.gds_data_viz_green_secondary);
                    break;
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
                    color = context.getColor(R.color.gcm_light_green_section);
                    break;
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
                    color = context.getColor(R.color.gcm_light_blue_section);
                    break;
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
                    color = context.getColor(R.color.gds_data_viz_blue_secondary);
                    break;
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                    color = context.getColor(R.color.gds_data_viz_purple_secondary);
                    break;
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
                    color = context.getColor(R.color.gds_data_viz_orange_secondary);
                    break;
                case 143:
                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                    color = context.getColor(R.color.gcm_system_static_white);
                    break;
                case 150:
                case 151:
                case SyslogConstants.LOG_LOCAL3 /* 152 */:
                case 153:
                case 154:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 156:
                case 157:
                case 158:
                    color = context.getColor(R.color.gcm_system_static_white);
                    break;
                case 159:
                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                    color = context.getColor(R.color.gds_data_viz_blue_secondary);
                    break;
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
                case 179:
                case 180:
                    color = context.getColor(R.color.gcm_system_static_white);
                    break;
                default:
                    u0.r();
                    return null;
            }
            String lowerCase4 = dh.b.A(context, x0VarL.f4360c).toLowerCase(Locale.ROOT);
            lowerCase4.getClass();
            Integer count = hVar.getCount();
            if (count != null) {
                l3.f23124b.getClass();
                String str10 = l3.f23131i.format(count);
                if (str10 == null) {
                    bVar6 = null;
                } else {
                    String str11 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{str10, lowerCase4}, 2));
                    String string10 = context.getString(R.string.annual_report_recap_sub_top_activity);
                    string10.getClass();
                    bVar6 = new b("icon_activity", str11, string10, Integer.valueOf(i15), Integer.valueOf(color));
                }
            } else {
                bVar6 = null;
            }
        }
        if (bVar6 != null) {
            arrayList2.add(bVar6);
        }
        tt.g activityTime = iVar.getActivityTime();
        if (activityTime == null || (totalDuration = activityTime.getTotalDuration()) == null) {
            bVar7 = null;
        } else {
            double dDoubleValue = totalDuration.doubleValue();
            pt.h.f140570a.getClass();
            String strC = pt.h.c((int) dDoubleValue, context);
            String string11 = context.getString(R.string.lbl_activity_time);
            string11.getClass();
            bVar7 = new b("icon_time", strC, string11, null, null, 24, null);
        }
        if (bVar7 != null) {
            arrayList2.add(bVar7);
        }
        tt.c activityDistance = iVar.getActivityDistance();
        if (activityDistance == null || (totalDistance = activityDistance.getTotalDistance()) == null) {
            bVar8 = null;
        } else {
            double dDoubleValue2 = totalDistance.doubleValue();
            pt.h hVar2 = pt.h.f140570a;
            Integer numValueOf4 = Integer.valueOf((int) dDoubleValue2);
            hVar2.getClass();
            String strB = pt.h.b(numValueOf4, context);
            String string12 = context.getString(R.string.lbl_activity_distance);
            string12.getClass();
            bVar8 = new b("icon_distance", strB, string12, null, null, 24, null);
        }
        if (bVar8 != null) {
            arrayList2.add(bVar8);
        }
        tt.d activityElevation = iVar.getActivityElevation();
        if (activityElevation == null || (totalElevationGain = activityElevation.getTotalElevationGain()) == null) {
            bVar9 = null;
        } else {
            double dDoubleValue3 = totalElevationGain.doubleValue();
            pt.h.f140570a.getClass();
            String strD = pt.h.d(context, dDoubleValue3);
            String string13 = context.getString(R.string.lbl_activity_ascent);
            string13.getClass();
            bVar9 = new b("icon_ascent", strD, string13, null, null, 24, null);
        }
        if (bVar9 != null) {
            arrayList2.add(bVar9);
        }
        tt.b activityCalories = iVar.getActivityCalories();
        if (activityCalories == null || (totalCalories = activityCalories.getTotalCalories()) == null) {
            bVar10 = null;
        } else {
            double dDoubleValue4 = totalCalories.doubleValue();
            l3.f23124b.getClass();
            String str12 = l3.f23131i.format(dDoubleValue4);
            String string14 = context.getString(R.string.lbl_activity_calories);
            string14.getClass();
            str12.getClass();
            bVar10 = new b("icon_calories", str12, string14, null, null, 24, null);
        }
        if (bVar10 != null) {
            arrayList2.add(bVar10);
        }
        arrayList.addAll(h0.b1(arrayList2));
        r(context, jsonObjectC, 279.0f);
        s(jsonObjectC);
        String string15 = context.getString(R.string.annual_report_recap_intro_text);
        string15.getClass();
        pt.i.z(jsonObjectC, "intro_layer_name", string15, oe2.f.Q(context));
        pt.i.f(jsonObjectC, this.f133656j);
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        String string16 = context.getString(R.string.annual_report_recap_sub_content_text);
        string16.getClass();
        pt.i.z(jsonObjectC, "Sub_Content", String.format(string16, Arrays.copyOf(new Object[]{2026}, 1)), oe2.f.T(context));
        JsonObject jsonObjectM2 = pt.i.m(jsonObjectC, "intro_layer_name");
        if (jsonObjectM2 != null && (textPaintS2 = pt.i.s(jsonObjectM2, oe2.f.Q(context))) != null && (fR = pt.i.r(jsonObjectM2)) != null) {
            float fFloatValue = fR.floatValue();
            pt.h.f140570a.getClass();
            int i16 = pt.h.g(string15, 330.0f, textPaintS2).f140607b - 4;
            if (i16 > 0) {
                pt.i.A(jsonObjectC, "Sub_Content", (-fFloatValue) * i16);
            }
        }
        String string17 = context.getString(R.string.annual_report_recap_sub_title_text);
        string17.getClass();
        pt.i.z(jsonObjectC, "Text_Subtitle", string17, oe2.f.S(context));
        String string18 = context.getString(R.string.annual_report_recap_sub_title_2_text);
        string18.getClass();
        pt.i.z(jsonObjectC, "Text_Subtitle_2", string18, oe2.f.S(context));
        JsonObject jsonObjectM3 = pt.i.m(jsonObjectC, "Text_Subtitle_2");
        if (jsonObjectM3 != null && (textPaintS = pt.i.s(jsonObjectM3, oe2.f.S(context))) != null) {
            pt.h.f140570a.getClass();
            if (pt.h.g(string18, 330.0f, textPaintS).f140607b > 1) {
                pt.i.A(jsonObjectC, "Text_Subtitle_2", 11.0f);
            }
        }
        String string19 = jsonObjectC.toString();
        string19.getClass();
        byte[] bytes = string19.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new d(lottieDrawable, context, null), 3);
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.STEPS_PUSHES;
    }

    @Override // ot.l
    public final Map<String, String> l() {
        return t0.b(new o13.p("image_10", "sharing_bg.png"));
    }

    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        if (this.f133681w.size() <= 0) {
            return Unit.INSTANCE;
        }
        LottieDrawable lottieDrawable = new LottieDrawable();
        JsonObject jsonObjectK = k(context, this, "sharing.json");
        if (jsonObjectK != null) {
            r(context, jsonObjectK, 202.0f);
            s(jsonObjectK);
        }
        q(context, jsonObjectK, lottieDrawable);
        t(context, lottieDrawable, -1);
        Object objO = o(context, p13.w.c(new l.a(this, lottieDrawable, "RecapChapter")), oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    @Override // ot.l
    public final boolean n() {
        if (e() == null) {
            return false;
        }
        tt.i iVar = this.f133676r;
        return (iVar.getSteps() == null && iVar.getPushes() == null && iVar.getSleep() == null && iVar.getSleepScore() == null && iVar.getBodyBattery() == null && iVar.getActivitySummary() == null && iVar.getActivityTime() == null && iVar.getActivityDistance() == null && iVar.getActivityElevation() == null && iVar.getActivityCalories() == null && iVar.getAchievements() == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0204  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Context context, JsonObject jsonObject, float f14) {
        o13.p pVar;
        int i14;
        float asFloat;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        T t7;
        String strP;
        JsonArray jsonArrayL;
        JsonElement jsonElement4;
        TextPaint textPaint = new TextPaint();
        r0 r0Var = new r0();
        Iterator it = this.f133681w.iterator();
        int i15 = 0;
        int i16 = 0;
        Float fValueOf = null;
        while (it.hasNext()) {
            Object next = it.next();
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            b bVar = (b) next;
            String strH = am.j.h(i17, "Data_");
            String strH2 = am.j.h(i17, "Section_");
            JsonObject jsonObjectM = pt.i.m(jsonObject, strH);
            if (i16 == 0) {
                JsonObject jsonObjectM2 = pt.i.m(jsonObject, strH2);
                if (jsonObjectM2 != null) {
                    pt.i.f140571a.getClass();
                    JsonObject jsonObjectU = pt.i.u(jsonObjectM2);
                    if (jsonObjectU != null) {
                        JsonElement jsonElement5 = jsonObjectU.get("p");
                        JsonObject asJsonObject = jsonElement5 != null ? jsonElement5.getAsJsonObject() : null;
                        if (asJsonObject != null && (jsonArrayL = pt.i.l(asJsonObject)) != null && (jsonElement4 = jsonArrayL.get(i15)) != null) {
                            fValueOf = Float.valueOf(jsonElement4.getAsFloat());
                        }
                    }
                }
                if (jsonObjectM == null || (strP = pt.i.p(jsonObjectM)) == null) {
                    t7 = strP;
                    t7 = "0";
                }
                t7 = strP;
                r0Var.f105810a = t7;
            }
            Float fT = pt.i.t(jsonObjectM);
            float fFloatValue = fT != null ? fT.floatValue() : 20.0f;
            textPaint.setTypeface(oe2.f.S(context));
            textPaint.setTextSize(fFloatValue);
            float fMeasureText = textPaint.measureText((String) r0Var.f105810a);
            String str = "nmData: " + strH + ", defaultValue: " + r0Var.f105810a + ", defaultTextSize: " + fFloatValue;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "RecapChapter", str);
            String str2 = bVar.f133683b;
            r0 r0Var2 = r0Var;
            float fMeasureText2 = textPaint.measureText(str2);
            float f15 = fMeasureText2 - fMeasureText;
            Iterator it3 = it;
            Float f16 = fValueOf;
            StringBuilder sbI = e0.i("defaultDataTextWidth: ", fMeasureText, ", dataTextWidth:", fMeasureText2, ", textWidthChange:");
            sbI.append(f15);
            i2.a.b(a2Var, "RecapChapter", sbI.toString());
            String str3 = bVar.f133684c;
            Float fT2 = pt.i.t(pt.i.m(jsonObject, strH2));
            float fFloatValue2 = fT2 != null ? fT2.floatValue() : 15.0f;
            textPaint.setTypeface(oe2.f.T(context));
            textPaint.setTextSize(fFloatValue2);
            float fMeasureText3 = textPaint.measureText(str3);
            i2.a.b(a2Var, "RecapChapter", "sectionText: " + str3 + ", sectionTextWidth: " + fMeasureText3);
            if ((fMeasureText3 / 2) + f15 > f14) {
                textPaint.setTypeface(oe2.f.S(context));
                textPaint.setTextSize(fFloatValue);
                pVar = new o13.p(TextUtils.ellipsize(str2, textPaint, (f14 + fMeasureText) - fMeasureText3, TextUtils.TruncateAt.END).toString(), str3);
            } else if (fMeasureText3 + f15 > f14) {
                textPaint.setTypeface(oe2.f.T(context));
                textPaint.setTextSize(fFloatValue2);
                pVar = new o13.p(str2, TextUtils.ellipsize(str3, textPaint, f14 - f15, TextUtils.TruncateAt.END).toString());
            } else {
                pVar = new o13.p(str2, str3);
            }
            String str4 = (String) pVar.f128594a;
            String str5 = (String) pVar.f128595b;
            pt.i.y(jsonObject, strH, str4);
            textPaint.setTypeface(oe2.f.S(context));
            textPaint.setTextSize(fFloatValue);
            float fMeasureText4 = textPaint.measureText(str4) - fMeasureText;
            JsonObject jsonObjectM3 = pt.i.m(jsonObject, strH2);
            if (jsonObjectM3 != null) {
                pt.i.f140571a.getClass();
                JsonObject jsonObjectU2 = pt.i.u(jsonObjectM3);
                if (jsonObjectU2 == null) {
                    i14 = 0;
                } else {
                    JsonElement jsonElement6 = jsonObjectU2.get("p");
                    JsonObject asJsonObject2 = jsonElement6 != null ? jsonElement6.getAsJsonObject() : null;
                    if (asJsonObject2 != null) {
                        JsonArray jsonArrayL2 = pt.i.l(asJsonObject2);
                        float asFloat2 = 0.0f;
                        if (f16 != null) {
                            asFloat = f16.floatValue();
                            i14 = 0;
                        } else {
                            i14 = 0;
                            asFloat = (jsonArrayL2 == null || (jsonElement = jsonArrayL2.get(0)) == null) ? 0.0f : jsonElement.getAsFloat();
                        }
                        float asFloat3 = (jsonArrayL2 == null || (jsonElement3 = jsonArrayL2.get(1)) == null) ? 0.0f : jsonElement3.getAsFloat();
                        if (jsonArrayL2 != null && (jsonElement2 = jsonArrayL2.get(2)) != null) {
                            asFloat2 = jsonElement2.getAsFloat();
                        }
                        float f17 = asFloat + fMeasureText4;
                        JsonArray jsonArray = new JsonArray();
                        jsonArray.add(Float.valueOf(f17));
                        jsonArray.add(Float.valueOf(asFloat3));
                        jsonArray.add(Float.valueOf(asFloat2));
                        asJsonObject2.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray);
                    } else {
                        i14 = 0;
                    }
                }
            } else {
                i14 = 0;
            }
            pt.i.y(jsonObject, strH2, str5);
            i15 = i14;
            r0Var = r0Var2;
            it = it3;
            fValueOf = f16;
            i16 = i17;
        }
    }

    public final void s(JsonObject jsonObject) {
        j23.l lVar = new j23.l(this.f133681w.size() + 1, 10);
        ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((j23.k) it).f96801c) {
            int iNextInt = ((p0) it).nextInt();
            arrayList.add(p13.x.k(pt.i.m(jsonObject, String.format("Icon_%1$s.png", Arrays.copyOf(new Object[]{Integer.valueOf(iNextInt)}, 1))), pt.i.m(jsonObject, am.j.h(iNextInt, "Data_")), pt.i.m(jsonObject, am.j.h(iNextInt, "Section_"))));
        }
        JsonObject[] jsonObjectArr = (JsonObject[]) h0.Z(p13.y.s(arrayList)).toArray(new JsonObject[0]);
        pt.i.w((JsonObject[]) Arrays.copyOf(jsonObjectArr, jsonObjectArr.length));
    }

    public final void t(Context context, LottieDrawable lottieDrawable, int i14) throws Throwable {
        int i15 = 0;
        for (Object obj : this.f133681w) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            b bVar = (b) obj;
            try {
                String str = "image_" + (i16 + i14);
                Integer num = bVar.f133685d;
                Integer num2 = bVar.f133686e;
                if (num == null || num2 == null) {
                    bu.f fVar = bu.f.f21180a;
                    String str2 = bVar.f133682a + ".png";
                    fVar.getClass();
                    Bitmap bitmapD = bu.f.d(context, this, str2);
                    if (bitmapD == null) {
                        return;
                    }
                    if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) == null) {
                        return;
                    }
                    int i17 = this.f133679u;
                    lottieDrawable.updateBitmap(str, Bitmap.createScaledBitmap(bitmapD, i17, i17, false));
                } else {
                    zp0.c.f206560v.getClass();
                    zp0.c cVarA = zp0.c.a.a(context);
                    cVarA.f206567g = num.intValue();
                    Bitmap bitmapC = cVarA.c();
                    if (bitmapC == null) {
                        return;
                    }
                    if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) == null) {
                        return;
                    }
                    int i18 = this.f133679u;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, i18, i18, false);
                    Paint paint = new Paint();
                    paint.setColorFilter(new PorterDuffColorFilter(num2.intValue(), PorterDuff.Mode.SRC_IN));
                    int width = bitmapCreateScaledBitmap.getWidth();
                    int height = bitmapCreateScaledBitmap.getHeight();
                    Bitmap.Config config = bitmapCreateScaledBitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
                    bitmapCreateScaledBitmap.recycle();
                    lottieDrawable.updateBitmap(str, bitmapCreateBitmap);
                }
            } catch (Exception e4) {
                String str3 = "updateRecapLayerIcons: Error happened when adding recap layer icon. Icon data = " + bVar + ". Error = " + e4.getMessage();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "RecapChapter", str3);
            }
            i15 = i16;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0006¨\u0006("}, d2 = {"Lot/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "NM_SUB_CONTENT", "NM_TEXT_SUBTITLE", "NM_TEXT_SUBTITLE_2", "", "PROFILE_IMAGE_SIZE", "I", "REVIEW_ICON_SIZE", "", "RECAP_TOP_AREA_CONTENT_HEIGHT", "F", "RECAP_TOP_AREA_BOTTOM_PADDING", "RECAP_MAIN_CONTENT_WIDTH", "SHARING_RECAP_MAIN_CONTENT_WIDTH", "SHARE_IMAGE_ID_OFFSET", "DEFAULT_DATA_TEXT_SIZE", "DEFAULT_SECTION_TEXT_SIZE", "ICON_PLACE_HOLDER", "SECTION_PREFIX", "DATA_PREFIX", "FOLDER", "VALUE_UNIT_PLACE_HOLDER", "ICON_STEPS", "ICON_PUSHES", "ICON_SC", "ICON_SLEEP", "ICON_BB", "ICON_ACTIVITIES", "ICON_TIME", "ICON_DISTANCE", "ICON_ASCENT", "ICON_CALORIES", "RECAP_LIST_MARKER_NAME", "RECAP_SHARE_IMAGE_FILE_NAME", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lot/u$b;", "", "", "iconFilename", "dataString", "sectionString", "", "iconRes", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f133682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f133683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f133684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f133685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f133686e;

        public /* synthetic */ b(String str, String str2, String str3, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, str3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f133682a, bVar.f133682a) && p005kotlin.jvm.internal.s.g(this.f133683b, bVar.f133683b) && p005kotlin.jvm.internal.s.g(this.f133684c, bVar.f133684c) && p005kotlin.jvm.internal.s.g(this.f133685d, bVar.f133685d) && p005kotlin.jvm.internal.s.g(this.f133686e, bVar.f133686e);
        }

        public final int hashCode() {
            int iJ = wr.g.j(wr.g.j(this.f133682a.hashCode() * 31, 31, this.f133683b), 31, this.f133684c);
            Integer num = this.f133685d;
            int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f133686e;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("ReviewData(iconFilename=", this.f133682a, ", dataString=", this.f133683b, ", sectionString=");
            fb1.c.u(this.f133685d, this.f133684c, ", iconRes=", ", tintColor=", sbI);
            return f3.i(sbI, this.f133686e, ")");
        }

        public b(String str, String str2, String str3, Integer num, Integer num2) {
            com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
            this.f133682a = str;
            this.f133683b = str2;
            this.f133684c = str3;
            this.f133685d = num;
            this.f133686e = num2;
        }
    }
}
