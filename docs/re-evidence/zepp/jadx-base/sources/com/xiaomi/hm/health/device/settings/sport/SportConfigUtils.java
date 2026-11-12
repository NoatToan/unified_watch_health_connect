package com.xiaomi.hm.health.device.settings.sport;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportConfigUtils;", "", "<init>", "()V", "Companion", "SportDataCategory", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportConfigUtils {

    @NotNull
    private static final Map<Integer, Integer> O1;
    private static final int a = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private static final int k = 10;
    private static final int l = 11;
    private static final int m = 12;
    private static final int n = 13;
    private static final int o = 14;
    private static final int p = 15;
    private static final int q = 16;
    private static final int r = 17;
    private static final int s = 18;
    private static final int t = 19;
    private static final int u = 20;
    private static final int v = 21;
    private static final int w = 22;
    private static final int x = 23;
    private static final int y = 24;
    private static final int z = 25;
    private static final int A = 26;
    private static final int B = 27;
    private static final int C = 28;
    private static final int D = 29;
    private static final int E = 30;
    private static final int F = 31;
    private static final int G = 32;
    private static final int H = 33;
    private static final int I = 34;
    private static final int J = 35;
    private static final int K = 36;
    private static final int L = 37;
    private static final int M = 38;
    private static final int N = 39;
    private static final int O = 40;
    private static final int P = 41;
    private static final int Q = 42;
    private static final int R = 43;
    private static final int S = 44;
    private static final int T = 45;
    private static final int U = 46;
    private static final int V = 47;
    private static final int W = 48;
    private static final int X = 49;
    private static final int Y = 50;
    private static final int Z = 51;
    private static final int a0 = 52;
    private static final int b0 = 53;
    private static final int c0 = 54;
    private static final int d0 = 55;
    private static final int e0 = 56;
    private static final int f0 = 57;
    private static final int g0 = 58;
    private static final int h0 = 59;
    private static final int i0 = 60;
    private static final int j0 = 61;
    private static final int k0 = 62;
    private static final int l0 = 63;
    private static final int m0 = 64;
    private static final int n0 = 65;
    private static final int o0 = 66;
    private static final int p0 = 67;
    private static final int q0 = 68;
    private static final int r0 = 69;
    private static final int s0 = 70;
    private static final int t0 = 71;
    private static final int u0 = 72;
    private static final int v0 = 73;
    private static final int w0 = 74;
    private static final int x0 = 75;
    private static final int y0 = 76;
    private static final int z0 = 77;
    private static final int A0 = 78;
    private static final int B0 = 79;
    private static final int C0 = 80;
    private static final int D0 = 81;
    private static final int E0 = 82;
    private static final int F0 = 83;
    private static final int G0 = 84;
    private static final int H0 = 85;
    private static final int I0 = 86;
    private static final int J0 = 87;
    private static final int K0 = 88;
    private static final int L0 = 89;
    private static final int M0 = 90;
    private static final int N0 = 91;
    private static final int O0 = 92;
    private static final int P0 = 93;
    private static final int Q0 = 94;
    private static final int R0 = 95;
    private static final int S0 = 96;
    private static final int T0 = 97;
    private static final int U0 = 98;
    private static final int V0 = 99;
    private static final int W0 = 100;
    private static final int X0 = 101;
    private static final int Y0 = 102;
    private static final int Z0 = 103;
    private static final int a1 = 104;
    private static final int b1 = 105;
    private static final int c1 = 106;
    private static final int d1 = 107;
    private static final int e1 = 108;
    private static final int f1 = 109;
    private static final int g1 = 110;
    private static final int h1 = 111;
    private static final int i1 = 112;
    private static final int j1 = 113;
    private static final int k1 = 114;
    private static final int l1 = 115;
    private static final int m1 = 116;
    private static final int n1 = 117;
    private static final int o1 = 118;
    private static final int p1 = 119;
    private static final int q1 = 120;
    private static final int r1 = 121;
    private static final int s1 = 122;
    private static final int t1 = 123;
    private static final int u1 = 124;
    private static final int v1 = 125;
    private static final int w1 = 126;
    private static final int x1 = 127;
    private static final int y1 = 128;
    private static final int z1 = 129;
    private static final int A1 = 130;
    private static final int B1 = 131;
    private static final int C1 = 132;
    private static final int D1 = 133;
    private static final int E1 = 134;
    private static final int F1 = 135;
    private static final int G1 = 250;
    private static final int H1 = 251;
    private static final int I1 = 252;
    private static final int J1 = PageType.PAGE_SHORTCUT;
    private static final int K1 = 254;
    private static final int L1 = 255;
    private static final int M1 = 256;
    private static final int N1 = 65535;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b¤\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¯\u0002\u0010°\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001c\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001c\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001c\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001c\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001c\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001c\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001c\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001c\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001c\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001c\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u001c\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001c\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u001c\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u001c\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u001c\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u001c\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u001c\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001c\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u001c\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u001c\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001c\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u001c\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u001c\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001c\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u001c\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\fR\u001c\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u001c\u0010U\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u001c\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR\u001c\u0010Y\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u001c\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u001c\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u001c\u0010_\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001c\u0010a\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u001c\u0010c\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR\u001c\u0010e\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\fR\u001c\u0010g\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u001c\u0010i\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bi\u0010\n\u001a\u0004\bj\u0010\fR\u001c\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u001c\u0010m\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u001c\u0010o\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u001c\u0010q\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR\u001c\u0010s\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR\u001c\u0010u\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bu\u0010\n\u001a\u0004\bv\u0010\fR\u001c\u0010w\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bx\u0010\fR\u001c\u0010y\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010\n\u001a\u0004\bz\u0010\fR\u001c\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b{\u0010\n\u001a\u0004\b|\u0010\fR\u001c\u0010}\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b~\u0010\fR\u001d\u0010\u007f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010\fR\u001f\u0010\u0081\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\n\u001a\u0005\b\u0082\u0001\u0010\fR\u001f\u0010\u0083\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\fR\u001f\u0010\u0085\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0086\u0001\u0010\fR\u001f\u0010\u0087\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\n\u001a\u0005\b\u0088\u0001\u0010\fR\u001f\u0010\u0089\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\fR\u001f\u0010\u008b\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010\fR\u001f\u0010\u008d\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\n\u001a\u0005\b\u008e\u0001\u0010\fR\u001f\u0010\u008f\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\n\u001a\u0005\b\u0090\u0001\u0010\fR\u001f\u0010\u0091\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\n\u001a\u0005\b\u0092\u0001\u0010\fR\u001f\u0010\u0093\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\n\u001a\u0005\b\u0094\u0001\u0010\fR\u001f\u0010\u0095\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\n\u001a\u0005\b\u0096\u0001\u0010\fR\u001f\u0010\u0097\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\n\u001a\u0005\b\u0098\u0001\u0010\fR\u001f\u0010\u0099\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\n\u001a\u0005\b\u009a\u0001\u0010\fR\u001f\u0010\u009b\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\n\u001a\u0005\b\u009c\u0001\u0010\fR\u001f\u0010\u009d\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\n\u001a\u0005\b\u009e\u0001\u0010\fR\u001f\u0010\u009f\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\n\u001a\u0005\b \u0001\u0010\fR\u001f\u0010¡\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¡\u0001\u0010\n\u001a\u0005\b¢\u0001\u0010\fR\u001f\u0010£\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b£\u0001\u0010\n\u001a\u0005\b¤\u0001\u0010\fR\u001f\u0010¥\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¥\u0001\u0010\n\u001a\u0005\b¦\u0001\u0010\fR\u001f\u0010§\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b§\u0001\u0010\n\u001a\u0005\b¨\u0001\u0010\fR\u001f\u0010©\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b©\u0001\u0010\n\u001a\u0005\bª\u0001\u0010\fR\u001f\u0010«\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b«\u0001\u0010\n\u001a\u0005\b¬\u0001\u0010\fR\u001f\u0010\u00ad\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\n\u001a\u0005\b®\u0001\u0010\fR\u001f\u0010¯\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¯\u0001\u0010\n\u001a\u0005\b°\u0001\u0010\fR\u001f\u0010±\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b±\u0001\u0010\n\u001a\u0005\b²\u0001\u0010\fR\u001f\u0010³\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b³\u0001\u0010\n\u001a\u0005\b´\u0001\u0010\fR\u001f\u0010µ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bµ\u0001\u0010\n\u001a\u0005\b¶\u0001\u0010\fR\u001f\u0010·\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b·\u0001\u0010\n\u001a\u0005\b¸\u0001\u0010\fR\u001f\u0010¹\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¹\u0001\u0010\n\u001a\u0005\bº\u0001\u0010\fR\u001f\u0010»\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b»\u0001\u0010\n\u001a\u0005\b¼\u0001\u0010\fR\u001f\u0010½\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b½\u0001\u0010\n\u001a\u0005\b¾\u0001\u0010\fR\u001f\u0010¿\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¿\u0001\u0010\n\u001a\u0005\bÀ\u0001\u0010\fR\u001f\u0010Á\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\n\u001a\u0005\bÂ\u0001\u0010\fR\u001f\u0010Ã\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\n\u001a\u0005\bÄ\u0001\u0010\fR\u001f\u0010Å\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\n\u001a\u0005\bÆ\u0001\u0010\fR\u001f\u0010Ç\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\n\u001a\u0005\bÈ\u0001\u0010\fR\u001f\u0010É\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\n\u001a\u0005\bÊ\u0001\u0010\fR\u001f\u0010Ë\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bË\u0001\u0010\n\u001a\u0005\bÌ\u0001\u0010\fR\u001f\u0010Í\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\n\u001a\u0005\bÎ\u0001\u0010\fR\u001f\u0010Ï\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\n\u001a\u0005\bÐ\u0001\u0010\fR\u001f\u0010Ñ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\n\u001a\u0005\bÒ\u0001\u0010\fR\u001f\u0010Ó\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\n\u001a\u0005\bÔ\u0001\u0010\fR\u001f\u0010Õ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\n\u001a\u0005\bÖ\u0001\u0010\fR\u001f\u0010×\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b×\u0001\u0010\n\u001a\u0005\bØ\u0001\u0010\fR\u001f\u0010Ù\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\n\u001a\u0005\bÚ\u0001\u0010\fR\u001f\u0010Û\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\n\u001a\u0005\bÜ\u0001\u0010\fR\u001f\u0010Ý\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\n\u001a\u0005\bÞ\u0001\u0010\fR\u001f\u0010ß\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bß\u0001\u0010\n\u001a\u0005\bà\u0001\u0010\fR\u001f\u0010á\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bá\u0001\u0010\n\u001a\u0005\bâ\u0001\u0010\fR\u001f\u0010ã\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bã\u0001\u0010\n\u001a\u0005\bä\u0001\u0010\fR\u001f\u0010å\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bå\u0001\u0010\n\u001a\u0005\bæ\u0001\u0010\fR\u001f\u0010ç\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bç\u0001\u0010\n\u001a\u0005\bè\u0001\u0010\fR\u001f\u0010é\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bé\u0001\u0010\n\u001a\u0005\bê\u0001\u0010\fR\u001f\u0010ë\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bë\u0001\u0010\n\u001a\u0005\bì\u0001\u0010\fR\u001f\u0010í\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bí\u0001\u0010\n\u001a\u0005\bî\u0001\u0010\fR\u001f\u0010ï\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bï\u0001\u0010\n\u001a\u0005\bð\u0001\u0010\fR\u001f\u0010ñ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bñ\u0001\u0010\n\u001a\u0005\bò\u0001\u0010\fR\u001f\u0010ó\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bó\u0001\u0010\n\u001a\u0005\bô\u0001\u0010\fR\u001f\u0010õ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bõ\u0001\u0010\n\u001a\u0005\bö\u0001\u0010\fR\u001f\u0010÷\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b÷\u0001\u0010\n\u001a\u0005\bø\u0001\u0010\fR\u001f\u0010ù\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bù\u0001\u0010\n\u001a\u0005\bú\u0001\u0010\fR\u001f\u0010û\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bû\u0001\u0010\n\u001a\u0005\bü\u0001\u0010\fR\u001f\u0010ý\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bý\u0001\u0010\n\u001a\u0005\bþ\u0001\u0010\fR\u001f\u0010ÿ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\bÿ\u0001\u0010\n\u001a\u0005\b\u0080\u0002\u0010\fR\u001f\u0010\u0081\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0081\u0002\u0010\n\u001a\u0005\b\u0082\u0002\u0010\fR\u001f\u0010\u0083\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0083\u0002\u0010\n\u001a\u0005\b\u0084\u0002\u0010\fR\u001f\u0010\u0085\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0085\u0002\u0010\n\u001a\u0005\b\u0086\u0002\u0010\fR\u001f\u0010\u0087\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\n\u001a\u0005\b\u0088\u0002\u0010\fR\u001f\u0010\u0089\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0089\u0002\u0010\n\u001a\u0005\b\u008a\u0002\u0010\fR\u001f\u0010\u008b\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008b\u0002\u0010\n\u001a\u0005\b\u008c\u0002\u0010\fR\u001f\u0010\u008d\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\n\u001a\u0005\b\u008e\u0002\u0010\fR\u001f\u0010\u008f\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008f\u0002\u0010\n\u001a\u0005\b\u0090\u0002\u0010\fR\u001f\u0010\u0091\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0091\u0002\u0010\n\u001a\u0005\b\u0092\u0002\u0010\fR\u001f\u0010\u0093\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\n\u001a\u0005\b\u0094\u0002\u0010\fR\u001f\u0010\u0095\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0095\u0002\u0010\n\u001a\u0005\b\u0096\u0002\u0010\fR\u001f\u0010\u0097\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0097\u0002\u0010\n\u001a\u0005\b\u0098\u0002\u0010\fR\u001f\u0010\u0099\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010\n\u001a\u0005\b\u009a\u0002\u0010\fR\u001f\u0010\u009b\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009b\u0002\u0010\n\u001a\u0005\b\u009c\u0002\u0010\fR\u001f\u0010\u009d\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009d\u0002\u0010\n\u001a\u0005\b\u009e\u0002\u0010\fR\u001f\u0010\u009f\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009f\u0002\u0010\n\u001a\u0005\b \u0002\u0010\fR\u001f\u0010¡\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¡\u0002\u0010\n\u001a\u0005\b¢\u0002\u0010\fR\u001f\u0010£\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b£\u0002\u0010\n\u001a\u0005\b¤\u0002\u0010\fR\u001f\u0010¥\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b¥\u0002\u0010\n\u001a\u0005\b¦\u0002\u0010\fR\u001f\u0010§\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b§\u0002\u0010\n\u001a\u0005\b¨\u0002\u0010\fR\u001f\u0010©\u0002\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b©\u0002\u0010\n\u001a\u0005\bª\u0002\u0010\fR*\u0010¬\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020«\u00028\u0006@\u0006¢\u0006\u000f\n\u0006\b¬\u0002\u0010\u00ad\u0002\u001a\u0005\b\b\u0010®\u0002¨\u0006±\u0002"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportConfigUtils$Companion;", "", "", "type", "Landroid/content/Context;", "ctx", "", "getNameByType", "getSportDataItemName", "DATA_ITEM_NONE", LogUtil.I, "getDATA_ITEM_NONE", "()I", "DATA_ITEM_TIME_COST", "getDATA_ITEM_TIME_COST", "DATA_ITEM_DISTANCE", "getDATA_ITEM_DISTANCE", "DATA_ITEM_PACE", "getDATA_ITEM_PACE", "DATA_ITEM_AVG_PACE", "getDATA_ITEM_AVG_PACE", "DATA_ITEM_HEARTRATE", "getDATA_ITEM_HEARTRATE", "DATA_ITEM_CALARIE", "getDATA_ITEM_CALARIE", "DATA_ITEM_ABSOLUTE_ALTITUDE", "getDATA_ITEM_ABSOLUTE_ALTITUDE", "DATA_ITEM_CUMULATIVE_CLIMB", "getDATA_ITEM_CUMULATIVE_CLIMB", "DATA_ITEM_CUMULATIVE_DECREASE", "getDATA_ITEM_CUMULATIVE_DECREASE", "DATA_ITEM_SPEED", "getDATA_ITEM_SPEED", "DATA_ITEM_AVG_SPEED", "getDATA_ITEM_AVG_SPEED", "DATA_ITEM_STEP_FREQ", "getDATA_ITEM_STEP_FREQ", "DATA_ITEM_GROUND_SPEED_DISTANCE", "getDATA_ITEM_GROUND_SPEED_DISTANCE", "DATA_ITEM_STEP_COUNT", "getDATA_ITEM_STEP_COUNT", "DATA_ITEM_CADENCE", "getDATA_ITEM_CADENCE", "DATA_ITEM_TRIPS", "getDATA_ITEM_TRIPS", "DATA_ITEM_DPS", "getDATA_ITEM_DPS", "DATA_ITEM_RT_STROKE_SPEED", "getDATA_ITEM_RT_STROKE_SPEED", "DATA_ITEM_AVG_STROKE_SPEED", "getDATA_ITEM_AVG_STROKE_SPEED", "DATA_ITEM_SWIM_RT_PACE", "getDATA_ITEM_SWIM_RT_PACE", "DATA_ITEM_SWIM_AVG_PACE", "getDATA_ITEM_SWIM_AVG_PACE", "DATA_ITEM_SWIM_DISTANCE", "getDATA_ITEM_SWIM_DISTANCE", "DATA_ITEM_RT_TE", "getDATA_ITEM_RT_TE", "DATA_ITEM_VERTICAL_VELOCITY", "getDATA_ITEM_VERTICAL_VELOCITY", "DATA_ITEM_DOWNHILL_AVG_SPEED", "getDATA_ITEM_DOWNHILL_AVG_SPEED", "DATA_ITEM_DOWNHILL_MAX_SPEED", "getDATA_ITEM_DOWNHILL_MAX_SPEED", "DATA_ITEM_DOWNHILL_NUMS", "getDATA_ITEM_DOWNHILL_NUMS", "DATA_ITEM_DOWNHILL_SINGLE_DISTANCE", "getDATA_ITEM_DOWNHILL_SINGLE_DISTANCE", "DATA_ITEM_DOWNHILL_TOTAL_DISTANCE", "getDATA_ITEM_DOWNHILL_TOTAL_DISTANCE", "DATA_ITEM_DOWNHILL_SINGLE_ELEVATION_LOSS", "getDATA_ITEM_DOWNHILL_SINGLE_ELEVATION_LOSS", "DATA_ITEM_TENNIS_STROKES", "getDATA_ITEM_TENNIS_STROKES", "DATA_ITEM_LAST_LAP_TIME", "getDATA_ITEM_LAST_LAP_TIME", "DATA_ITEM_LAST_LAP_PACE", "getDATA_ITEM_LAST_LAP_PACE", "DATA_ITEM_LAST_LAP_SPEED", "getDATA_ITEM_LAST_LAP_SPEED", "DATA_ITEM_LAST_LAP_HEART_RATE", "getDATA_ITEM_LAST_LAP_HEART_RATE", "DATA_ITEM_LAST_LAP_STEP_FREQ", "getDATA_ITEM_LAST_LAP_STEP_FREQ", "DATA_ITEM_LAST_SWIM_LAP_PACE", "getDATA_ITEM_LAST_SWIM_LAP_PACE", "DATA_ITEM_CURRNET_FREQUENCY", "getDATA_ITEM_CURRNET_FREQUENCY", "DATA_ITEM_TOTAL_COUNT", "getDATA_ITEM_TOTAL_COUNT", "DATA_ITEM_AVG_FREQUENCY", "getDATA_ITEM_AVG_FREQUENCY", "DATA_ITEM_CURRNET_GROUP_COUNT", "getDATA_ITEM_CURRNET_GROUP_COUNT", "DATA_ITEM_THIS_GROUP_COUNT", "getDATA_ITEM_THIS_GROUP_COUNT", "DATA_ITEM_THIS_GROUP_COST_TIME", "getDATA_ITEM_THIS_GROUP_COST_TIME", "DATA_ITEM_THIS_GROUP_AVG_FREQUENCY", "getDATA_ITEM_THIS_GROUP_AVG_FREQUENCY", "DATA_ITEM_CUR_LAP_TIME", "getDATA_ITEM_CUR_LAP_TIME", "DATA_ITEM_CUR_LAP_DISTANCE", "getDATA_ITEM_CUR_LAP_DISTANCE", "DATA_ITEM_CUR_LAP_PACE", "getDATA_ITEM_CUR_LAP_PACE", "DATA_ITEM_CUR_LAP_SPEED", "getDATA_ITEM_CUR_LAP_SPEED", "DATA_ITEM_CUR_LAP_HEART_RATE", "getDATA_ITEM_CUR_LAP_HEART_RATE", "DATA_ITEM_CUR_LAP_STEP_FREQ", "getDATA_ITEM_CUR_LAP_STEP_FREQ", "DATA_ITEM_SLOPE", "getDATA_ITEM_SLOPE", "DATA_ITEM_THIS_GROUP_CALORIE", "getDATA_ITEM_THIS_GROUP_CALORIE", "DATA_ITEM_THIS_GROUP_AVG_HR", "getDATA_ITEM_THIS_GROUP_AVG_HR", "DATA_ITEM_THIS_GROUP_STROKE_COUNT", "getDATA_ITEM_THIS_GROUP_STROKE_COUNT", "DATA_ITEM_THIS_GROUP_AVG_STROKE_FREQUENCY", "getDATA_ITEM_THIS_GROUP_AVG_STROKE_FREQUENCY", "DATA_ITEM_TOTAL_STROKES", "getDATA_ITEM_TOTAL_STROKES", "DATA_ITEM_STROKE_FREQUENCY", "getDATA_ITEM_STROKE_FREQUENCY", "DATA_ITEM_PULL_TIME", "getDATA_ITEM_PULL_TIME", "DATA_ITEM_RETURN_TIME", "getDATA_ITEM_RETURN_TIME", "DATA_ITEM_AVG_STROKE_FREQ", "getDATA_ITEM_AVG_STROKE_FREQ", "DATA_ITEM_AVG_STEP_FREQ", "getDATA_ITEM_AVG_STEP_FREQ", "DATA_ITEM_LAST_LAP_DISTANCE", "getDATA_ITEM_LAST_LAP_DISTANCE", "DATA_ITEM_TOTAL_TIME", "getDATA_ITEM_TOTAL_TIME", "DATA_ITEM_LAPS_AVG_TIME", "getDATA_ITEM_LAPS_AVG_TIME", "DATA_ITEM_FITNESS_CURRNET_GROUP_COUNT", "getDATA_ITEM_FITNESS_CURRNET_GROUP_COUNT", "DATA_ITEM_DOWNHILL_TOTAL_ELEVATION_LOSS", "getDATA_ITEM_DOWNHILL_TOTAL_ELEVATION_LOSS", "DATA_ITEM_UPSTAIRS_FLOORS", "getDATA_ITEM_UPSTAIRS_FLOORS", "DATA_ITEM_CURRENT_LAP_UPSTAIRS_FLOORS", "getDATA_ITEM_CURRENT_LAP_UPSTAIRS_FLOORS", "DATA_ITEM_LAST_LAP_UPSTAIRS_FLOORS", "getDATA_ITEM_LAST_LAP_UPSTAIRS_FLOORS", "DATA_ITEM_DOWNSTAIRS_FLOORS", "getDATA_ITEM_DOWNSTAIRS_FLOORS", "DATA_ITEM_CURRENT_LAP_DOWNSTAIRS_FLOORS", "getDATA_ITEM_CURRENT_LAP_DOWNSTAIRS_FLOORS", "DATA_ITEM_LAST_LAP_DOWNSTAIRS_FLOORS", "getDATA_ITEM_LAST_LAP_DOWNSTAIRS_FLOORS", "DATA_ITEM_AVG_MIN_UPSTAIRS_FLOORS", "getDATA_ITEM_AVG_MIN_UPSTAIRS_FLOORS", "DATA_ITEM_UPSTAIRS_HEIGHT", "getDATA_ITEM_UPSTAIRS_HEIGHT", "DATA_ITEM_CURRENT_LAP_UPSTAIRS_HEIGHT", "getDATA_ITEM_CURRENT_LAP_UPSTAIRS_HEIGHT", "DATA_ITEM_LAST_LAP_UPSTAIRS_HEIGHT", "getDATA_ITEM_LAST_LAP_UPSTAIRS_HEIGHT", "DATA_ITEM_DOWNSTAIRS_HEIGHT", "getDATA_ITEM_DOWNSTAIRS_HEIGHT", "DATA_ITEM_CURRENT_LAP_DOWNSTAIRS_HEIGHT", "getDATA_ITEM_CURRENT_LAP_DOWNSTAIRS_HEIGHT", "DATA_ITEM_LAST_LAP_DOWNSTAIRS_HEIGHT", "getDATA_ITEM_LAST_LAP_DOWNSTAIRS_HEIGHT", "DATA_ITEM_CURRENT_LAP_TRIPS", "getDATA_ITEM_CURRENT_LAP_TRIPS", "DATA_ITEM_LAST_LAP_TRIPS", "getDATA_ITEM_LAST_LAP_TRIPS", "DATA_ITEM_TOTAL_STROKE_COUNT", "getDATA_ITEM_TOTAL_STROKE_COUNT", "DATA_ITEM_CURRENT_STROKE_COUNT", "getDATA_ITEM_CURRENT_STROKE_COUNT", "DATA_ITEM_LAST_STROKE_COUNT", "getDATA_ITEM_LAST_STROKE_COUNT", "DATA_ITEM_LAPS_AVG_STROKE_COUNT", "getDATA_ITEM_LAPS_AVG_STROKE_COUNT", "DATA_ITEM_CURRENT_LAP_STROKE_SPEED", "getDATA_ITEM_CURRENT_LAP_STROKE_SPEED", "DATA_ITEM_LAST_LAP_STROKE_SPEED", "getDATA_ITEM_LAST_LAP_STROKE_SPEED", "DATA_ITEM_AVG_SWOLF", "getDATA_ITEM_AVG_SWOLF", "DATA_ITEM_CURRENT_LAP_SWOLF", "getDATA_ITEM_CURRENT_LAP_SWOLF", "DATA_ITEM_LAST_LAP_SWOLF", "getDATA_ITEM_LAST_LAP_SWOLF", "DATA_ITEM_STRIDE", "getDATA_ITEM_STRIDE", "DATA_ITEM_AVG_STRIDE", "getDATA_ITEM_AVG_STRIDE", "DATA_ITEM_CURRENT_LAP_STRIDE", "getDATA_ITEM_CURRENT_LAP_STRIDE", "DATA_ITEM_LAST_LAP_STRIDE", "getDATA_ITEM_LAST_LAP_STRIDE", "DATA_ITEM_MAX_SPEED", "getDATA_ITEM_MAX_SPEED", "DATA_ITEM_MAX_ALTITUDE", "getDATA_ITEM_MAX_ALTITUDE", "DATA_ITEM_MIN_ALTITUDE", "getDATA_ITEM_MIN_ALTITUDE", "DATA_ITEM_AVG_ALTITUDE", "getDATA_ITEM_AVG_ALTITUDE", "DATA_ITEM_CURRENT_GROUND_SPEED_DISTANCE", "getDATA_ITEM_CURRENT_GROUND_SPEED_DISTANCE", "DATA_ITEM_LAST_GROUND_SPEED_DISTANCE", "getDATA_ITEM_LAST_GROUND_SPEED_DISTANCE", "DATA_ITEM_CURRENT_CUMULATIVE_CLIMB", "getDATA_ITEM_CURRENT_CUMULATIVE_CLIMB", "DATA_ITEM_LAST_CUMULATIVE_CLIMB", "getDATA_ITEM_LAST_CUMULATIVE_CLIMB", "DATA_ITEM_CURRENT_CUMULATIVE_DECREASE", "getDATA_ITEM_CURRENT_CUMULATIVE_DECREASE", "DATA_ITEM_LAST_CUMULATIVE_DECREASE", "getDATA_ITEM_LAST_CUMULATIVE_DECREASE", "DATA_ITEM_AVG_SLOPE", "getDATA_ITEM_AVG_SLOPE", "DATA_ITEM_CURRENT_LAP_SLOPE", "getDATA_ITEM_CURRENT_LAP_SLOPE", "DATA_ITEM_LAST_LAP_SLOPE", "getDATA_ITEM_LAST_LAP_SLOPE", "DATA_ITEM_FOREHAND_SWING_TIMES", "getDATA_ITEM_FOREHAND_SWING_TIMES", "DATA_ITEM_BACKHAND_SWING_TIMES", "getDATA_ITEM_BACKHAND_SWING_TIMES", "DATA_ITEM_TENNIS_SERVE_TIMES", "getDATA_ITEM_TENNIS_SERVE_TIMES", "DATA_ITEM_AVG_HEARTRATE", "getDATA_ITEM_AVG_HEARTRATE", "DATA_ITEM_HR_ZONE", "getDATA_ITEM_HR_ZONE", "DATA_ITEM_MAX_HR_PERCENT", "getDATA_ITEM_MAX_HR_PERCENT", "DATA_ITEM_BAK_HR_PERCENT", "getDATA_ITEM_BAK_HR_PERCENT", "DATA_ITEM_AVG_MAX_HR_PERCENT", "getDATA_ITEM_AVG_MAX_HR_PERCENT", "DATA_ITEM_AVG_BAK_HR_PERCENT", "getDATA_ITEM_AVG_BAK_HR_PERCENT", "DATA_ITEM_CUR_LAP_HR_MAX_PERCENT", "getDATA_ITEM_CUR_LAP_HR_MAX_PERCENT", "DATA_ITEM_CUR_LAP_HR_BAK_PERCENT", "getDATA_ITEM_CUR_LAP_HR_BAK_PERCENT", "DATA_ITEM_LAST_LAP_HR_MAX_PERCENT", "getDATA_ITEM_LAST_LAP_HR_MAX_PERCENT", "DATA_ITEM_LAST_LAP_HR_BAK_PERCENT", "getDATA_ITEM_LAST_LAP_HR_BAK_PERCENT", "DATA_ITEM_TEMPERATURE", "getDATA_ITEM_TEMPERATURE", "DATA_ITEM_MAX_TEMPERATURE", "getDATA_ITEM_MAX_TEMPERATURE", "DATA_ITEM_MIN_TEMPERATURE", "getDATA_ITEM_MIN_TEMPERATURE", "DATA_ITEM_ANAEROBIC_TE", "getDATA_ITEM_ANAEROBIC_TE", "DATA_ITEM_TRAIN_LOAD", "getDATA_ITEM_TRAIN_LOAD", "DATA_ITEM_SUNRISE_TIME", "getDATA_ITEM_SUNRISE_TIME", "DATA_ITEM_SUNSET_TIME", "getDATA_ITEM_SUNSET_TIME", "DATA_ITEM_BAROMETER", "getDATA_ITEM_BAROMETER", "DATA_ITEM_SYSTEM_TIME", "getDATA_ITEM_SYSTEM_TIME", "DATA_ITEM_FITNESS_GROUP_COUNT", "getDATA_ITEM_FITNESS_GROUP_COUNT", "DATA_ITEM_FITNESS_GROUP_TIME", "getDATA_ITEM_FITNESS_GROUP_TIME", "DATA_ITEM_FITNESS_GROUP_CALIRIE", "getDATA_ITEM_FITNESS_GROUP_CALIRIE", "DATA_ITEM_ROWING_CURRNET_GROUP_COUNT", "getDATA_ITEM_ROWING_CURRNET_GROUP_COUNT", "DATA_ITEM_ROWING_THIS_GROUP_COST_TIME", "getDATA_ITEM_ROWING_THIS_GROUP_COST_TIME", "DATA_ITEM_LAST_DOWNHILL_SPEED", "getDATA_ITEM_LAST_DOWNHILL_SPEED", "DATA_ITEM_SURPLUS_DISTANCE", "getDATA_ITEM_SURPLUS_DISTANCE", "DATA_ITEM_TRAIN_TOTAL_DISTANCE", "getDATA_ITEM_TRAIN_TOTAL_DISTANCE", "DATA_ITEM_TRAIN_TOTAL_TIMES", "getDATA_ITEM_TRAIN_TOTAL_TIMES", "DATA_ITEM_SURPLUS_TIME", "getDATA_ITEM_SURPLUS_TIME", "DATA_ITEM_KEYPRESS_DISTANCE", "getDATA_ITEM_KEYPRESS_DISTANCE", "DATA_ITEM_REST", "getDATA_ITEM_REST", "DATA_ITEM_REST_BY_KEYPRESS", "getDATA_ITEM_REST_BY_KEYPRESS", "DATA_ITEM_END", "getDATA_ITEM_END", "", "sportDataItemName", "Ljava/util/Map;", "()Ljava/util/Map;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDATA_ITEM_ABSOLUTE_ALTITUDE() {
            return SportConfigUtils.h;
        }

        public final int getDATA_ITEM_ANAEROBIC_TE() {
            return SportConfigUtils.u1;
        }

        public final int getDATA_ITEM_AVG_ALTITUDE() {
            return SportConfigUtils.U0;
        }

        public final int getDATA_ITEM_AVG_BAK_HR_PERCENT() {
            return SportConfigUtils.m1;
        }

        public final int getDATA_ITEM_AVG_FREQUENCY() {
            return SportConfigUtils.O;
        }

        public final int getDATA_ITEM_AVG_HEARTRATE() {
            return SportConfigUtils.h1;
        }

        public final int getDATA_ITEM_AVG_MAX_HR_PERCENT() {
            return SportConfigUtils.l1;
        }

        public final int getDATA_ITEM_AVG_MIN_UPSTAIRS_FLOORS() {
            return SportConfigUtils.v0;
        }

        public final int getDATA_ITEM_AVG_PACE() {
            return SportConfigUtils.e;
        }

        public final int getDATA_ITEM_AVG_SLOPE() {
            return SportConfigUtils.b1;
        }

        public final int getDATA_ITEM_AVG_SPEED() {
            return SportConfigUtils.l;
        }

        public final int getDATA_ITEM_AVG_STEP_FREQ() {
            return SportConfigUtils.j0;
        }

        public final int getDATA_ITEM_AVG_STRIDE() {
            return SportConfigUtils.O0;
        }

        public final int getDATA_ITEM_AVG_STROKE_FREQ() {
            return SportConfigUtils.i0;
        }

        public final int getDATA_ITEM_AVG_STROKE_SPEED() {
            return SportConfigUtils.t;
        }

        public final int getDATA_ITEM_AVG_SWOLF() {
            return SportConfigUtils.K0;
        }

        public final int getDATA_ITEM_BACKHAND_SWING_TIMES() {
            return SportConfigUtils.f1;
        }

        public final int getDATA_ITEM_BAK_HR_PERCENT() {
            return SportConfigUtils.k1;
        }

        public final int getDATA_ITEM_BAROMETER() {
            return SportConfigUtils.y1;
        }

        public final int getDATA_ITEM_CADENCE() {
            return SportConfigUtils.p;
        }

        public final int getDATA_ITEM_CALARIE() {
            return SportConfigUtils.g;
        }

        public final int getDATA_ITEM_CUMULATIVE_CLIMB() {
            return SportConfigUtils.i;
        }

        public final int getDATA_ITEM_CUMULATIVE_DECREASE() {
            return SportConfigUtils.j;
        }

        public final int getDATA_ITEM_CURRENT_CUMULATIVE_CLIMB() {
            return SportConfigUtils.X0;
        }

        public final int getDATA_ITEM_CURRENT_CUMULATIVE_DECREASE() {
            return SportConfigUtils.Z0;
        }

        public final int getDATA_ITEM_CURRENT_GROUND_SPEED_DISTANCE() {
            return SportConfigUtils.V0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_DOWNSTAIRS_FLOORS() {
            return SportConfigUtils.t0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_DOWNSTAIRS_HEIGHT() {
            return SportConfigUtils.A0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_SLOPE() {
            return SportConfigUtils.c1;
        }

        public final int getDATA_ITEM_CURRENT_LAP_STRIDE() {
            return SportConfigUtils.P0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_STROKE_SPEED() {
            return SportConfigUtils.I0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_SWOLF() {
            return SportConfigUtils.L0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_TRIPS() {
            return SportConfigUtils.C0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_UPSTAIRS_FLOORS() {
            return SportConfigUtils.q0;
        }

        public final int getDATA_ITEM_CURRENT_LAP_UPSTAIRS_HEIGHT() {
            return SportConfigUtils.x0;
        }

        public final int getDATA_ITEM_CURRENT_STROKE_COUNT() {
            return SportConfigUtils.F0;
        }

        public final int getDATA_ITEM_CURRNET_FREQUENCY() {
            return SportConfigUtils.M;
        }

        public final int getDATA_ITEM_CURRNET_GROUP_COUNT() {
            return SportConfigUtils.P;
        }

        public final int getDATA_ITEM_CUR_LAP_DISTANCE() {
            return SportConfigUtils.U;
        }

        public final int getDATA_ITEM_CUR_LAP_HEART_RATE() {
            return SportConfigUtils.X;
        }

        public final int getDATA_ITEM_CUR_LAP_HR_BAK_PERCENT() {
            return SportConfigUtils.o1;
        }

        public final int getDATA_ITEM_CUR_LAP_HR_MAX_PERCENT() {
            return SportConfigUtils.n1;
        }

        public final int getDATA_ITEM_CUR_LAP_PACE() {
            return SportConfigUtils.V;
        }

        public final int getDATA_ITEM_CUR_LAP_SPEED() {
            return SportConfigUtils.W;
        }

        public final int getDATA_ITEM_CUR_LAP_STEP_FREQ() {
            return SportConfigUtils.Y;
        }

        public final int getDATA_ITEM_CUR_LAP_TIME() {
            return SportConfigUtils.T;
        }

        public final int getDATA_ITEM_DISTANCE() {
            return SportConfigUtils.c;
        }

        public final int getDATA_ITEM_DOWNHILL_AVG_SPEED() {
            return SportConfigUtils.z;
        }

        public final int getDATA_ITEM_DOWNHILL_MAX_SPEED() {
            return SportConfigUtils.A;
        }

        public final int getDATA_ITEM_DOWNHILL_NUMS() {
            return SportConfigUtils.B;
        }

        public final int getDATA_ITEM_DOWNHILL_SINGLE_DISTANCE() {
            return SportConfigUtils.C;
        }

        public final int getDATA_ITEM_DOWNHILL_SINGLE_ELEVATION_LOSS() {
            return SportConfigUtils.E;
        }

        public final int getDATA_ITEM_DOWNHILL_TOTAL_DISTANCE() {
            return SportConfigUtils.D;
        }

        public final int getDATA_ITEM_DOWNHILL_TOTAL_ELEVATION_LOSS() {
            return SportConfigUtils.o0;
        }

        public final int getDATA_ITEM_DOWNSTAIRS_FLOORS() {
            return SportConfigUtils.s0;
        }

        public final int getDATA_ITEM_DOWNSTAIRS_HEIGHT() {
            return SportConfigUtils.z0;
        }

        public final int getDATA_ITEM_DPS() {
            return SportConfigUtils.r;
        }

        public final int getDATA_ITEM_END() {
            return SportConfigUtils.N1;
        }

        public final int getDATA_ITEM_FITNESS_CURRNET_GROUP_COUNT() {
            return SportConfigUtils.n0;
        }

        public final int getDATA_ITEM_FITNESS_GROUP_CALIRIE() {
            return SportConfigUtils.C1;
        }

        public final int getDATA_ITEM_FITNESS_GROUP_COUNT() {
            return SportConfigUtils.A1;
        }

        public final int getDATA_ITEM_FITNESS_GROUP_TIME() {
            return SportConfigUtils.B1;
        }

        public final int getDATA_ITEM_FOREHAND_SWING_TIMES() {
            return SportConfigUtils.e1;
        }

        public final int getDATA_ITEM_GROUND_SPEED_DISTANCE() {
            return SportConfigUtils.n;
        }

        public final int getDATA_ITEM_HEARTRATE() {
            return SportConfigUtils.f;
        }

        public final int getDATA_ITEM_HR_ZONE() {
            return SportConfigUtils.i1;
        }

        public final int getDATA_ITEM_KEYPRESS_DISTANCE() {
            return SportConfigUtils.K1;
        }

        public final int getDATA_ITEM_LAPS_AVG_STROKE_COUNT() {
            return SportConfigUtils.H0;
        }

        public final int getDATA_ITEM_LAPS_AVG_TIME() {
            return SportConfigUtils.m0;
        }

        public final int getDATA_ITEM_LAST_CUMULATIVE_CLIMB() {
            return SportConfigUtils.Y0;
        }

        public final int getDATA_ITEM_LAST_CUMULATIVE_DECREASE() {
            return SportConfigUtils.a1;
        }

        public final int getDATA_ITEM_LAST_DOWNHILL_SPEED() {
            return SportConfigUtils.F1;
        }

        public final int getDATA_ITEM_LAST_GROUND_SPEED_DISTANCE() {
            return SportConfigUtils.W0;
        }

        public final int getDATA_ITEM_LAST_LAP_DISTANCE() {
            return SportConfigUtils.k0;
        }

        public final int getDATA_ITEM_LAST_LAP_DOWNSTAIRS_FLOORS() {
            return SportConfigUtils.u0;
        }

        public final int getDATA_ITEM_LAST_LAP_DOWNSTAIRS_HEIGHT() {
            return SportConfigUtils.B0;
        }

        public final int getDATA_ITEM_LAST_LAP_HEART_RATE() {
            return SportConfigUtils.J;
        }

        public final int getDATA_ITEM_LAST_LAP_HR_BAK_PERCENT() {
            return SportConfigUtils.q1;
        }

        public final int getDATA_ITEM_LAST_LAP_HR_MAX_PERCENT() {
            return SportConfigUtils.p1;
        }

        public final int getDATA_ITEM_LAST_LAP_PACE() {
            return SportConfigUtils.H;
        }

        public final int getDATA_ITEM_LAST_LAP_SLOPE() {
            return SportConfigUtils.d1;
        }

        public final int getDATA_ITEM_LAST_LAP_SPEED() {
            return SportConfigUtils.I;
        }

        public final int getDATA_ITEM_LAST_LAP_STEP_FREQ() {
            return SportConfigUtils.K;
        }

        public final int getDATA_ITEM_LAST_LAP_STRIDE() {
            return SportConfigUtils.Q0;
        }

        public final int getDATA_ITEM_LAST_LAP_STROKE_SPEED() {
            return SportConfigUtils.J0;
        }

        public final int getDATA_ITEM_LAST_LAP_SWOLF() {
            return SportConfigUtils.M0;
        }

        public final int getDATA_ITEM_LAST_LAP_TIME() {
            return SportConfigUtils.G;
        }

        public final int getDATA_ITEM_LAST_LAP_TRIPS() {
            return SportConfigUtils.D0;
        }

        public final int getDATA_ITEM_LAST_LAP_UPSTAIRS_FLOORS() {
            return SportConfigUtils.r0;
        }

        public final int getDATA_ITEM_LAST_LAP_UPSTAIRS_HEIGHT() {
            return SportConfigUtils.y0;
        }

        public final int getDATA_ITEM_LAST_STROKE_COUNT() {
            return SportConfigUtils.G0;
        }

        public final int getDATA_ITEM_LAST_SWIM_LAP_PACE() {
            return SportConfigUtils.L;
        }

        public final int getDATA_ITEM_MAX_ALTITUDE() {
            return SportConfigUtils.S0;
        }

        public final int getDATA_ITEM_MAX_HR_PERCENT() {
            return SportConfigUtils.j1;
        }

        public final int getDATA_ITEM_MAX_SPEED() {
            return SportConfigUtils.R0;
        }

        public final int getDATA_ITEM_MAX_TEMPERATURE() {
            return SportConfigUtils.s1;
        }

        public final int getDATA_ITEM_MIN_ALTITUDE() {
            return SportConfigUtils.T0;
        }

        public final int getDATA_ITEM_MIN_TEMPERATURE() {
            return SportConfigUtils.t1;
        }

        public final int getDATA_ITEM_NONE() {
            return SportConfigUtils.a;
        }

        public final int getDATA_ITEM_PACE() {
            return SportConfigUtils.d;
        }

        public final int getDATA_ITEM_PULL_TIME() {
            return SportConfigUtils.g0;
        }

        public final int getDATA_ITEM_REST() {
            return SportConfigUtils.L1;
        }

        public final int getDATA_ITEM_REST_BY_KEYPRESS() {
            return SportConfigUtils.M1;
        }

        public final int getDATA_ITEM_RETURN_TIME() {
            return SportConfigUtils.h0;
        }

        public final int getDATA_ITEM_ROWING_CURRNET_GROUP_COUNT() {
            return SportConfigUtils.D1;
        }

        public final int getDATA_ITEM_ROWING_THIS_GROUP_COST_TIME() {
            return SportConfigUtils.E1;
        }

        public final int getDATA_ITEM_RT_STROKE_SPEED() {
            return SportConfigUtils.s;
        }

        public final int getDATA_ITEM_RT_TE() {
            return SportConfigUtils.x;
        }

        public final int getDATA_ITEM_SLOPE() {
            return SportConfigUtils.Z;
        }

        public final int getDATA_ITEM_SPEED() {
            return SportConfigUtils.k;
        }

        public final int getDATA_ITEM_STEP_COUNT() {
            return SportConfigUtils.o;
        }

        public final int getDATA_ITEM_STEP_FREQ() {
            return SportConfigUtils.m;
        }

        public final int getDATA_ITEM_STRIDE() {
            return SportConfigUtils.N0;
        }

        public final int getDATA_ITEM_STROKE_FREQUENCY() {
            return SportConfigUtils.f0;
        }

        public final int getDATA_ITEM_SUNRISE_TIME() {
            return SportConfigUtils.w1;
        }

        public final int getDATA_ITEM_SUNSET_TIME() {
            return SportConfigUtils.x1;
        }

        public final int getDATA_ITEM_SURPLUS_DISTANCE() {
            return SportConfigUtils.G1;
        }

        public final int getDATA_ITEM_SURPLUS_TIME() {
            return SportConfigUtils.J1;
        }

        public final int getDATA_ITEM_SWIM_AVG_PACE() {
            return SportConfigUtils.v;
        }

        public final int getDATA_ITEM_SWIM_DISTANCE() {
            return SportConfigUtils.w;
        }

        public final int getDATA_ITEM_SWIM_RT_PACE() {
            return SportConfigUtils.u;
        }

        public final int getDATA_ITEM_SYSTEM_TIME() {
            return SportConfigUtils.z1;
        }

        public final int getDATA_ITEM_TEMPERATURE() {
            return SportConfigUtils.r1;
        }

        public final int getDATA_ITEM_TENNIS_SERVE_TIMES() {
            return SportConfigUtils.g1;
        }

        public final int getDATA_ITEM_TENNIS_STROKES() {
            return SportConfigUtils.F;
        }

        public final int getDATA_ITEM_THIS_GROUP_AVG_FREQUENCY() {
            return SportConfigUtils.S;
        }

        public final int getDATA_ITEM_THIS_GROUP_AVG_HR() {
            return SportConfigUtils.b0;
        }

        public final int getDATA_ITEM_THIS_GROUP_AVG_STROKE_FREQUENCY() {
            return SportConfigUtils.d0;
        }

        public final int getDATA_ITEM_THIS_GROUP_CALORIE() {
            return SportConfigUtils.a0;
        }

        public final int getDATA_ITEM_THIS_GROUP_COST_TIME() {
            return SportConfigUtils.R;
        }

        public final int getDATA_ITEM_THIS_GROUP_COUNT() {
            return SportConfigUtils.Q;
        }

        public final int getDATA_ITEM_THIS_GROUP_STROKE_COUNT() {
            return SportConfigUtils.c0;
        }

        public final int getDATA_ITEM_TIME_COST() {
            return SportConfigUtils.b;
        }

        public final int getDATA_ITEM_TOTAL_COUNT() {
            return SportConfigUtils.N;
        }

        public final int getDATA_ITEM_TOTAL_STROKES() {
            return SportConfigUtils.e0;
        }

        public final int getDATA_ITEM_TOTAL_STROKE_COUNT() {
            return SportConfigUtils.E0;
        }

        public final int getDATA_ITEM_TOTAL_TIME() {
            return SportConfigUtils.l0;
        }

        public final int getDATA_ITEM_TRAIN_LOAD() {
            return SportConfigUtils.v1;
        }

        public final int getDATA_ITEM_TRAIN_TOTAL_DISTANCE() {
            return SportConfigUtils.H1;
        }

        public final int getDATA_ITEM_TRAIN_TOTAL_TIMES() {
            return SportConfigUtils.I1;
        }

        public final int getDATA_ITEM_TRIPS() {
            return SportConfigUtils.q;
        }

        public final int getDATA_ITEM_UPSTAIRS_FLOORS() {
            return SportConfigUtils.p0;
        }

        public final int getDATA_ITEM_UPSTAIRS_HEIGHT() {
            return SportConfigUtils.w0;
        }

        public final int getDATA_ITEM_VERTICAL_VELOCITY() {
            return SportConfigUtils.y;
        }

        @NotNull
        public final String getNameByType(int type, @NotNull Context ctx) {
            int i;
            if (type == 1) {
                i = R.string.running_sports_type_running;
            } else if (type == 2001) {
                i = R.string.sports_type_triathlon;
            } else if (type != 2002) {
                switch (type) {
                    case 6:
                        i = R.string.running_sports_type_walking;
                        break;
                    case 7:
                        i = R.string.running_sports_type_crosscountry;
                        break;
                    case 8:
                        i = R.string.runnings_sport_type_treadmill;
                        break;
                    case 9:
                        i = R.string.sports_type_bike_ride;
                        break;
                    case 10:
                        i = R.string.sports_type_bike_indoor_ride;
                        break;
                    case 11:
                        i = R.string.sport_type_ski;
                        break;
                    case 12:
                        i = R.string.sports_type_elliptical_trainer;
                        break;
                    case 13:
                        i = R.string.sports_type_mountain_climb;
                        break;
                    case 14:
                        i = R.string.sports_type_swim_indoor;
                        break;
                    case 15:
                        i = R.string.sports_type_swim_outdoor;
                        break;
                    case 16:
                        i = R.string.sports_type_work_out;
                        break;
                    case 17:
                        i = R.string.tennis;
                        break;
                    case 18:
                        i = R.string.football;
                        break;
                    default:
                        switch (type) {
                            case 21:
                                i = R.string.rope_skipping;
                                break;
                            case 22:
                                i = R.string.sports_type_hiking;
                                break;
                            case 23:
                                i = R.string.sport_type_rowing_machine;
                                break;
                            case 24:
                                i = R.string.sport_type_indoor_fitness;
                                break;
                            default:
                                switch (type) {
                                    case 40:
                                        i = R.string.sport_type_indoor_walk;
                                        break;
                                    case 41:
                                        i = R.string.sport_type_curling;
                                        break;
                                    case 42:
                                        i = R.string.sport_type_board_skiing;
                                        break;
                                    case 43:
                                        i = R.string.sport_type_alpine_skiing;
                                        break;
                                    case 44:
                                        i = R.string.sport_type_outdoor_skating;
                                        break;
                                    case 45:
                                        i = R.string.sport_type_indoor_skating;
                                        break;
                                    case 46:
                                        i = R.string.sport_type_cross_country_skiing;
                                        break;
                                    case 47:
                                        i = R.string.sport_type_mountain_riding;
                                        break;
                                    case 48:
                                        i = R.string.sport_type_bmx;
                                        break;
                                    case 49:
                                        i = R.string.sport_type_high_intensity_training;
                                        break;
                                    case 50:
                                        i = R.string.sport_type_core_training;
                                        break;
                                    case 51:
                                        i = R.string.sport_type_mixed_aerobic;
                                        break;
                                    case 52:
                                        i = R.string.sport_type_strength_training;
                                        break;
                                    case 53:
                                        i = R.string.sport_type_stretch_training;
                                        break;
                                    case 54:
                                        i = R.string.sport_type_climbing_training;
                                        break;
                                    case 55:
                                        i = R.string.sport_type_flexible_training;
                                        break;
                                    default:
                                        switch (type) {
                                            case 57:
                                                i = R.string.sport_type_step_training;
                                                break;
                                            case 58:
                                                i = R.string.sport_type_stepper;
                                                break;
                                            case 59:
                                                i = R.string.sport_type_gymnastics;
                                                break;
                                            case 60:
                                                i = R.string.sport_type_yoga;
                                                break;
                                            case 61:
                                                i = R.string.sport_type_pilates;
                                                break;
                                            case 62:
                                                i = R.string.sport_type_surfing;
                                                break;
                                            case 63:
                                                i = R.string.sport_type_hunting;
                                                break;
                                            case 64:
                                                i = R.string.sport_type_fishing;
                                                break;
                                            case 65:
                                                i = R.string.sport_type_sailing;
                                                break;
                                            case 66:
                                                i = R.string.sport_type_outdoor_boating;
                                                break;
                                            case 67:
                                                i = R.string.sport_type_skateboarding;
                                                break;
                                            case 68:
                                                i = R.string.sport_type_paddle_surfing;
                                                break;
                                            case 69:
                                                i = R.string.sport_type_roller_skating;
                                                break;
                                            case 70:
                                                i = R.string.sport_type_rock_climbing;
                                                break;
                                            case 71:
                                                i = R.string.sport_type_ballet_dance;
                                                break;
                                            case 72:
                                                i = R.string.sport_type_belly_dance;
                                                break;
                                            case 73:
                                                i = R.string.sport_type_square_dance;
                                                break;
                                            case 74:
                                                i = R.string.sport_type_street_dance;
                                                break;
                                            case 75:
                                                i = R.string.sport_type_social_dance;
                                                break;
                                            case 76:
                                                i = R.string.sport_type_dance;
                                                break;
                                            case 77:
                                                i = R.string.sport_type_zumba_dance;
                                                break;
                                            case 78:
                                                i = R.string.sport_type_cricket_ball;
                                                break;
                                            case 79:
                                                i = R.string.sport_type_baseball;
                                                break;
                                            case 80:
                                                i = R.string.sport_type_bowling;
                                                break;
                                            case 81:
                                                i = R.string.sport_type_squash_ball;
                                                break;
                                            case 82:
                                                i = R.string.sport_type_football_us;
                                                break;
                                            case 83:
                                                i = R.string.sport_type_golf;
                                                break;
                                            case 84:
                                                i = R.string.sport_type_golf_swing;
                                                break;
                                            case 85:
                                                i = R.string.sport_type_basketball;
                                                break;
                                            case 86:
                                                i = R.string.sport_type_softball;
                                                break;
                                            case 87:
                                                i = R.string.sport_type_gateball;
                                                break;
                                            case 88:
                                                i = R.string.sport_type_volleyball;
                                                break;
                                            case 89:
                                                i = R.string.sport_type_pingpong;
                                                break;
                                            case 90:
                                                i = R.string.sport_type_hockey_ball;
                                                break;
                                            case 91:
                                                i = R.string.sport_type_handball;
                                                break;
                                            case 92:
                                                i = R.string.sport_type_badminton;
                                                break;
                                            case 93:
                                                i = R.string.sport_type_archery;
                                                break;
                                            case 94:
                                                i = R.string.sport_type_equestian;
                                                break;
                                            case 95:
                                                i = R.string.sport_type_fencing;
                                                break;
                                            case 96:
                                                i = R.string.sport_type_karate;
                                                break;
                                            case 97:
                                                i = R.string.sport_type_boxing;
                                                break;
                                            case 98:
                                                i = R.string.sport_type_judo;
                                                break;
                                            case 99:
                                                i = R.string.sport_type_wrestling;
                                                break;
                                            case 100:
                                                i = R.string.sport_type_taichi;
                                                break;
                                            case 101:
                                                i = R.string.sport_type_muay_thai;
                                                break;
                                            case 102:
                                                i = R.string.sport_type_taekwondo;
                                                break;
                                            case 103:
                                                i = R.string.sport_type_martial_arts;
                                                break;
                                            case 104:
                                                i = R.string.sport_type_free_sparring;
                                                break;
                                            case 105:
                                                i = R.string.sport_type_cross_double_skiing;
                                                break;
                                            case 106:
                                                i = R.string.sport_type_kite_surfing;
                                                break;
                                            default:
                                                switch (type) {
                                                    case 108:
                                                        i = R.string.sport_type_climbing_stairs;
                                                        break;
                                                    case 109:
                                                        i = R.string.sport_type_aerobics;
                                                        break;
                                                    case 110:
                                                        i = R.string.sport_type_orienteering;
                                                        break;
                                                    case 111:
                                                        i = R.string.sport_type_group_calisthenics;
                                                        break;
                                                    case 112:
                                                        i = R.string.sport_type_latin_dance;
                                                        break;
                                                    case 113:
                                                        i = R.string.sport_type_jazz;
                                                        break;
                                                    case 114:
                                                        i = R.string.sport_type_kickboxing;
                                                        break;
                                                    case 115:
                                                        i = R.string.sport_type_hu_la_hoop;
                                                        break;
                                                    case 116:
                                                        i = R.string.sport_type_frisbee;
                                                        break;
                                                    case 117:
                                                        i = R.string.sport_type_darts;
                                                        break;
                                                    case 118:
                                                        i = R.string.sport_type_fly_a_kite;
                                                        break;
                                                    case 119:
                                                        i = R.string.sport_type_tug_of_war;
                                                        break;
                                                    case 120:
                                                        i = R.string.sport_type_kick_shuttlecock;
                                                        break;
                                                    case 121:
                                                        i = R.string.sport_type_beach_soccer;
                                                        break;
                                                    case 122:
                                                        i = R.string.sport_type_beach_volleyball;
                                                        break;
                                                    case 123:
                                                        i = R.string.sport_type_drifting;
                                                        break;
                                                    case 124:
                                                        i = R.string.sport_type_motorboat;
                                                        break;
                                                    case 125:
                                                        i = R.string.sport_type_snowmobile;
                                                        break;
                                                    case 126:
                                                        i = R.string.sport_type_sled;
                                                        break;
                                                    case 127:
                                                        i = R.string.sport_type_orienteering_skiing;
                                                        break;
                                                    case 128:
                                                        i = R.string.sport_type_biathlon;
                                                        break;
                                                    case 129:
                                                        i = R.string.sport_type_parkour;
                                                        break;
                                                    case 130:
                                                        i = R.string.sport_type_cross_training;
                                                        break;
                                                    case 131:
                                                        i = R.string.sport_type_race_walking;
                                                        break;
                                                    case 132:
                                                        i = R.string.sport_type_drive;
                                                        break;
                                                    case 133:
                                                        i = R.string.sport_type_paragliding;
                                                        break;
                                                    default:
                                                        i = R.string.running_sports_type_running;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i = R.string.compound_movement;
            }
            return ctx.getResources().getString(i);
        }

        @NotNull
        public final Map<Integer, Integer> getSportDataItemName() {
            return SportConfigUtils.O1;
        }

        @NotNull
        public final String getSportDataItemName(int type, @NotNull Context ctx) {
            Integer num = getSportDataItemName().get(Integer.valueOf(type));
            if (num == null) {
                return "Unknown";
            }
            return ctx.getResources().getString(num.intValue());
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TIME' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportConfigUtils$SportDataCategory;", "", "", "namename", "Ljava/lang/String;", "getNamename", "()Ljava/lang/String;", "", "", "dataTypes", "[Ljava/lang/Integer;", "getDataTypes", "()[Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Integer;)V", "TIME", "DISTANCE", "COUNT", "DOWNHILL", "STAIRS", "SWIM", "PACE", "STEP", "SPEED", "ALTITUDE", "SLOPE", "SWING", "CALORIE", "BOAT", "FREQUENCY", "HEART_RATE", SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, MeasureStateValue.OTHER, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SportDataCategory {
        private static final /* synthetic */ SportDataCategory[] $VALUES;
        public static final SportDataCategory ALTITUDE;
        public static final SportDataCategory BOAT;
        public static final SportDataCategory CALORIE;
        public static final SportDataCategory COUNT;
        public static final SportDataCategory DISTANCE;
        public static final SportDataCategory DOWNHILL;
        public static final SportDataCategory FREQUENCY;
        public static final SportDataCategory HEART_RATE;
        public static final SportDataCategory OTHER;
        public static final SportDataCategory PACE;
        public static final SportDataCategory SLOPE;
        public static final SportDataCategory SPEED;
        public static final SportDataCategory STAIRS;
        public static final SportDataCategory STEP;
        public static final SportDataCategory SWIM;
        public static final SportDataCategory SWING;
        public static final SportDataCategory TEMPERATURE;
        public static final SportDataCategory TIME;

        @NotNull
        private final Integer[] dataTypes;

        @NotNull
        private final String namename;

        static {
            Companion companion = SportConfigUtils.INSTANCE;
            TIME = new SportDataCategory("TIME", 0, "用时类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_TOTAL_TIME()), Integer.valueOf(companion.getDATA_ITEM_TIME_COST()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_TIME()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_TIME()), Integer.valueOf(companion.getDATA_ITEM_LAPS_AVG_TIME()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_COST_TIME())});
            DISTANCE = new SportDataCategory("DISTANCE", 1, "距离类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_DISTANCE())});
            COUNT = new SportDataCategory("COUNT", 2, "计数类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_TOTAL_COUNT()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_COUNT()), Integer.valueOf(companion.getDATA_ITEM_TOTAL_STROKES()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_STROKE_COUNT()), Integer.valueOf(companion.getDATA_ITEM_FITNESS_CURRNET_GROUP_COUNT())});
            DOWNHILL = new SportDataCategory("DOWNHILL", 3, "滑降类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_NUMS()), Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_TOTAL_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_SINGLE_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_TOTAL_ELEVATION_LOSS()), Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_SINGLE_ELEVATION_LOSS())});
            STAIRS = new SportDataCategory("STAIRS", 4, "爬楼类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_UPSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_UPSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_UPSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_DOWNSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_DOWNSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_DOWNSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_AVG_MIN_UPSTAIRS_FLOORS()), Integer.valueOf(companion.getDATA_ITEM_UPSTAIRS_HEIGHT()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_UPSTAIRS_HEIGHT()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_UPSTAIRS_HEIGHT()), Integer.valueOf(companion.getDATA_ITEM_DOWNSTAIRS_HEIGHT()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_DOWNSTAIRS_HEIGHT()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_DOWNSTAIRS_HEIGHT())});
            SWIM = new SportDataCategory("SWIM", 5, "游泳类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_TRIPS()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_TRIPS()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_TRIPS()), Integer.valueOf(companion.getDATA_ITEM_TOTAL_STROKE_COUNT()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_STROKE_COUNT()), Integer.valueOf(companion.getDATA_ITEM_LAST_STROKE_COUNT()), Integer.valueOf(companion.getDATA_ITEM_DPS()), Integer.valueOf(companion.getDATA_ITEM_LAPS_AVG_STROKE_COUNT()), Integer.valueOf(companion.getDATA_ITEM_RT_STROKE_SPEED()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_STROKE_SPEED()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_STROKE_SPEED()), Integer.valueOf(companion.getDATA_ITEM_AVG_STROKE_SPEED()), Integer.valueOf(companion.getDATA_ITEM_AVG_SWOLF()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_SWOLF()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_SWOLF())});
            PACE = new SportDataCategory("PACE", 6, "配速类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_PACE()), Integer.valueOf(companion.getDATA_ITEM_AVG_PACE()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_PACE()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_PACE())});
            STEP = new SportDataCategory("STEP", 7, "步伐类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_STEP_FREQ()), Integer.valueOf(companion.getDATA_ITEM_AVG_STEP_FREQ()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_STEP_FREQ()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_STEP_FREQ()), Integer.valueOf(companion.getDATA_ITEM_STRIDE()), Integer.valueOf(companion.getDATA_ITEM_AVG_STRIDE()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_STRIDE()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_STRIDE()), Integer.valueOf(companion.getDATA_ITEM_STEP_COUNT())});
            SPEED = new SportDataCategory("SPEED", 8, "速度类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_SPEED()), Integer.valueOf(companion.getDATA_ITEM_AVG_SPEED()), Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_AVG_SPEED()), Integer.valueOf(companion.getDATA_ITEM_LAST_DOWNHILL_SPEED()), Integer.valueOf(companion.getDATA_ITEM_DOWNHILL_MAX_SPEED()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_SPEED()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_SPEED()), Integer.valueOf(companion.getDATA_ITEM_MAX_SPEED()), Integer.valueOf(companion.getDATA_ITEM_VERTICAL_VELOCITY())});
            ALTITUDE = new SportDataCategory("ALTITUDE", 9, "海拔类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_ABSOLUTE_ALTITUDE()), Integer.valueOf(companion.getDATA_ITEM_MAX_ALTITUDE()), Integer.valueOf(companion.getDATA_ITEM_MIN_ALTITUDE()), Integer.valueOf(companion.getDATA_ITEM_AVG_ALTITUDE()), Integer.valueOf(companion.getDATA_ITEM_GROUND_SPEED_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_GROUND_SPEED_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_LAST_GROUND_SPEED_DISTANCE()), Integer.valueOf(companion.getDATA_ITEM_CUMULATIVE_CLIMB()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_CUMULATIVE_CLIMB()), Integer.valueOf(companion.getDATA_ITEM_LAST_CUMULATIVE_CLIMB()), Integer.valueOf(companion.getDATA_ITEM_CUMULATIVE_DECREASE()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_CUMULATIVE_DECREASE()), Integer.valueOf(companion.getDATA_ITEM_LAST_CUMULATIVE_DECREASE())});
            SLOPE = new SportDataCategory("SLOPE", 10, "坡度类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_SLOPE()), Integer.valueOf(companion.getDATA_ITEM_AVG_SLOPE()), Integer.valueOf(companion.getDATA_ITEM_CURRENT_LAP_SLOPE()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_SLOPE())});
            SWING = new SportDataCategory("SWING", 11, "挥拍类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_TENNIS_STROKES()), Integer.valueOf(companion.getDATA_ITEM_FOREHAND_SWING_TIMES()), Integer.valueOf(companion.getDATA_ITEM_BACKHAND_SWING_TIMES()), Integer.valueOf(companion.getDATA_ITEM_TENNIS_SERVE_TIMES())});
            CALORIE = new SportDataCategory("CALORIE", 12, "消耗类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_CALARIE()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_CALORIE())});
            BOAT = new SportDataCategory("BOAT", 13, "划船类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_STROKE_FREQUENCY()), Integer.valueOf(companion.getDATA_ITEM_AVG_STROKE_FREQ()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_AVG_STROKE_FREQUENCY()), Integer.valueOf(companion.getDATA_ITEM_PULL_TIME()), Integer.valueOf(companion.getDATA_ITEM_RETURN_TIME())});
            FREQUENCY = new SportDataCategory("FREQUENCY", 14, "频率类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_CURRNET_FREQUENCY()), Integer.valueOf(companion.getDATA_ITEM_AVG_FREQUENCY()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_AVG_FREQUENCY())});
            HEART_RATE = new SportDataCategory("HEART_RATE", 15, "心率类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_HEARTRATE()), Integer.valueOf(companion.getDATA_ITEM_AVG_HEARTRATE()), Integer.valueOf(companion.getDATA_ITEM_THIS_GROUP_AVG_HR()), Integer.valueOf(companion.getDATA_ITEM_HR_ZONE()), Integer.valueOf(companion.getDATA_ITEM_MAX_HR_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_BAK_HR_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_AVG_MAX_HR_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_AVG_BAK_HR_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_HEART_RATE()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_HR_MAX_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_CUR_LAP_HR_BAK_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_HEART_RATE()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_HR_MAX_PERCENT()), Integer.valueOf(companion.getDATA_ITEM_LAST_LAP_HR_BAK_PERCENT())});
            TEMPERATURE = new SportDataCategory(SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, 16, "温度类", new Integer[]{Integer.valueOf(companion.getDATA_ITEM_TEMPERATURE()), Integer.valueOf(companion.getDATA_ITEM_MAX_TEMPERATURE()), Integer.valueOf(companion.getDATA_ITEM_MIN_TEMPERATURE())});
            OTHER = new SportDataCategory(MeasureStateValue.OTHER, 17, "其他类", new Integer[0]);
            $VALUES = a();
        }

        private SportDataCategory(String str, int i, String str2, Integer[] numArr) {
            super(str, i);
            this.namename = str2;
            this.dataTypes = numArr;
        }

        private static final /* synthetic */ SportDataCategory[] a() {
            return new SportDataCategory[]{TIME, DISTANCE, COUNT, DOWNHILL, STAIRS, SWIM, PACE, STEP, SPEED, ALTITUDE, SLOPE, SWING, CALORIE, BOAT, FREQUENCY, HEART_RATE, TEMPERATURE, OTHER};
        }

        public static SportDataCategory valueOf(String str) {
            return (SportDataCategory) Enum.valueOf(SportDataCategory.class, str);
        }

        public static SportDataCategory[] values() {
            return (SportDataCategory[]) $VALUES.clone();
        }

        @NotNull
        public final Integer[] getDataTypes() {
            return this.dataTypes;
        }

        @NotNull
        public final String getNamename() {
            return this.namename;
        }
    }

    static {
        int i2 = R.string.data_item_distance;
        int i3 = R.string.data_item_pace;
        int i4 = R.string.data_item_last_lap_pace;
        O1 = r.mapOf(TuplesKt.to(1, Integer.valueOf(R.string.data_item_time_cost)), TuplesKt.to(2, Integer.valueOf(i2)), TuplesKt.to(3, Integer.valueOf(i3)), TuplesKt.to(5, Integer.valueOf(R.string.data_item_heartrate)), TuplesKt.to(6, Integer.valueOf(R.string.data_item_calarie)), TuplesKt.to(10, Integer.valueOf(R.string.data_item_speed)), TuplesKt.to(12, Integer.valueOf(R.string.data_item_step_freq)), TuplesKt.to(4, Integer.valueOf(R.string.data_item_average_moving_pace)), TuplesKt.to(11, Integer.valueOf(R.string.data_item_average_moving_speed)), TuplesKt.to(7, Integer.valueOf(R.string.data_item_altitude)), TuplesKt.to(8, Integer.valueOf(R.string.data_item_elevation_gain_altitude)), TuplesKt.to(9, Integer.valueOf(R.string.data_item_elevation_loss_altitude)), TuplesKt.to(13, Integer.valueOf(R.string.data_item_group_speed_distance_climb)), TuplesKt.to(14, Integer.valueOf(R.string.data_item_step_count)), TuplesKt.to(15, Integer.valueOf(R.string.data_item_cadence)), TuplesKt.to(16, Integer.valueOf(R.string.data_item_trips)), TuplesKt.to(17, Integer.valueOf(R.string.data_item_dps)), TuplesKt.to(18, Integer.valueOf(R.string.data_item_rt_stroke_speed)), TuplesKt.to(19, Integer.valueOf(R.string.data_item_avg_stroke_speed)), TuplesKt.to(20, Integer.valueOf(i3)), TuplesKt.to(21, Integer.valueOf(R.string.data_item_avg_pace)), TuplesKt.to(22, Integer.valueOf(i2)), TuplesKt.to(23, Integer.valueOf(R.string.data_item_te)), TuplesKt.to(24, Integer.valueOf(R.string.data_item_vertical_speed)), TuplesKt.to(25, Integer.valueOf(R.string.data_item_downhill_avg_speed)), TuplesKt.to(26, Integer.valueOf(R.string.data_item_downhill_max_speed)), TuplesKt.to(27, Integer.valueOf(R.string.data_item_downhill_number)), TuplesKt.to(28, Integer.valueOf(R.string.data_item_downhill_single_distance)), TuplesKt.to(29, Integer.valueOf(R.string.data_item_downhill_total_distance)), TuplesKt.to(30, Integer.valueOf(R.string.data_item_downhill_single_elevation_loss)), TuplesKt.to(31, Integer.valueOf(R.string.data_item_tennis_strokes)), TuplesKt.to(32, Integer.valueOf(R.string.data_item_last_lap_time)), TuplesKt.to(33, Integer.valueOf(i4)), TuplesKt.to(34, Integer.valueOf(R.string.data_item_last_lap_speed)), TuplesKt.to(35, Integer.valueOf(R.string.data_item_last_lap_hr)), TuplesKt.to(36, Integer.valueOf(R.string.data_item_last_lap_step_freq)), TuplesKt.to(37, Integer.valueOf(i4)), TuplesKt.to(38, Integer.valueOf(R.string.data_item_current_frequency)), TuplesKt.to(39, Integer.valueOf(R.string.data_item_total_count)), TuplesKt.to(40, Integer.valueOf(R.string.data_item_average_frequency)), TuplesKt.to(41, Integer.valueOf(R.string.data_item_current_group_count)), TuplesKt.to(42, Integer.valueOf(R.string.data_item_this_group_count)), TuplesKt.to(43, Integer.valueOf(R.string.data_item_this_group_cost_time)), TuplesKt.to(44, Integer.valueOf(R.string.data_item_this_group_count_average_frequency)), TuplesKt.to(45, Integer.valueOf(R.string.data_item_cur_lap_time)), TuplesKt.to(46, Integer.valueOf(R.string.data_item_cur_lap_dis)), TuplesKt.to(47, Integer.valueOf(R.string.data_item_cur_lap_pace)), TuplesKt.to(48, Integer.valueOf(R.string.data_item_cur_lap_speed)), TuplesKt.to(49, Integer.valueOf(R.string.data_item_cur_lap_hr)), TuplesKt.to(50, Integer.valueOf(R.string.data_item_cur_lap_step_freq)), TuplesKt.to(51, Integer.valueOf(R.string.data_item_slope)), TuplesKt.to(52, Integer.valueOf(R.string.data_item_cur_group_calorie)), TuplesKt.to(53, Integer.valueOf(R.string.data_item_cur_group_avg_hr)), TuplesKt.to(54, Integer.valueOf(R.string.data_item_cur_group_stroke_count)), TuplesKt.to(55, Integer.valueOf(R.string.data_item_cur_geoup_avg_stroke_freq)), TuplesKt.to(56, Integer.valueOf(R.string.data_item_total_stroke)), TuplesKt.to(57, Integer.valueOf(R.string.data_item_stroke_freq)), TuplesKt.to(58, Integer.valueOf(R.string.data_item_pull_time)), TuplesKt.to(59, Integer.valueOf(R.string.data_item_return_time)), TuplesKt.to(60, Integer.valueOf(R.string.data_item_avg_stroke_freq)), TuplesKt.to(61, Integer.valueOf(R.string.data_item_step_avg_freq)), TuplesKt.to(62, Integer.valueOf(R.string.data_item_last_lap_distance)), TuplesKt.to(63, Integer.valueOf(R.string.data_item_total_time)), TuplesKt.to(64, Integer.valueOf(R.string.data_item_laps_avg_time)), TuplesKt.to(65, Integer.valueOf(R.string.data_item_fitness_current_group_count)), TuplesKt.to(66, Integer.valueOf(R.string.data_item_downhill_total_elevation_loss)), TuplesKt.to(67, Integer.valueOf(R.string.data_item_upstairs_floors)), TuplesKt.to(68, Integer.valueOf(R.string.data_item_current_lap_upstairs_floors)), TuplesKt.to(69, Integer.valueOf(R.string.data_item_last_lap_upstairs_floors)), TuplesKt.to(70, Integer.valueOf(R.string.data_item_downstairs_floors)), TuplesKt.to(71, Integer.valueOf(R.string.data_item_current_lap_downstairs_floors)), TuplesKt.to(72, Integer.valueOf(R.string.data_item_last_lap_downstairs_floors)), TuplesKt.to(73, Integer.valueOf(R.string.data_item_avg_min_upstairs_floors)), TuplesKt.to(74, Integer.valueOf(R.string.data_item_upstairs_height)), TuplesKt.to(75, Integer.valueOf(R.string.data_item_current_lap_upstairs_height)), TuplesKt.to(76, Integer.valueOf(R.string.data_item_last_lap_upstairs_height)), TuplesKt.to(77, Integer.valueOf(R.string.data_item_downstairs_height)), TuplesKt.to(78, Integer.valueOf(R.string.data_item_current_lap_downstairs_height)), TuplesKt.to(79, Integer.valueOf(R.string.data_item_last_lap_downstairs_height)), TuplesKt.to(80, Integer.valueOf(R.string.data_item_current_lap_trips)), TuplesKt.to(81, Integer.valueOf(R.string.data_item_last_lap_trips)), TuplesKt.to(82, Integer.valueOf(R.string.data_item_total_stroke_count)), TuplesKt.to(83, Integer.valueOf(R.string.data_item_current_stroke_count)), TuplesKt.to(84, Integer.valueOf(R.string.data_item_last_stroke_count)), TuplesKt.to(85, Integer.valueOf(R.string.data_item_laps_avg_stroke_count)), TuplesKt.to(86, Integer.valueOf(R.string.data_item_current_lap_stroke_speed)), TuplesKt.to(87, Integer.valueOf(R.string.data_item_last_lap_stroke_speed)), TuplesKt.to(88, Integer.valueOf(R.string.data_item_avg_swolf)), TuplesKt.to(89, Integer.valueOf(R.string.data_item_current_lap_swolf)), TuplesKt.to(90, Integer.valueOf(R.string.data_item_last_lap_swolf)), TuplesKt.to(91, Integer.valueOf(R.string.data_item_stride)), TuplesKt.to(92, Integer.valueOf(R.string.data_item_avg_stride)), TuplesKt.to(93, Integer.valueOf(R.string.data_item_current_lap_stride)), TuplesKt.to(94, Integer.valueOf(R.string.data_item_last_lap_stride)), TuplesKt.to(95, Integer.valueOf(R.string.data_item_max_speed)), TuplesKt.to(96, Integer.valueOf(R.string.data_item_max_altitude)), TuplesKt.to(97, Integer.valueOf(R.string.data_item_min_altitude)), TuplesKt.to(98, Integer.valueOf(R.string.data_item_avg_altitude)), TuplesKt.to(99, Integer.valueOf(R.string.data_item_current_ground_speed_distance)), TuplesKt.to(100, Integer.valueOf(R.string.data_item_last_ground_speed_distance)), TuplesKt.to(101, Integer.valueOf(R.string.data_item_current_cumulative_climb)), TuplesKt.to(102, Integer.valueOf(R.string.data_item_last_cumulative_climb)), TuplesKt.to(103, Integer.valueOf(R.string.data_item_current_cumulative_decrease)), TuplesKt.to(104, Integer.valueOf(R.string.data_item_last_cumulative_decrease)), TuplesKt.to(105, Integer.valueOf(R.string.data_item_avg_slope)), TuplesKt.to(106, Integer.valueOf(R.string.data_item_current_lap_slope)), TuplesKt.to(107, Integer.valueOf(R.string.data_item_last_lap_slope)), TuplesKt.to(108, Integer.valueOf(R.string.data_item_forehand_swing_times)), TuplesKt.to(109, Integer.valueOf(R.string.data_item_backhand_swing_times)), TuplesKt.to(110, Integer.valueOf(R.string.data_item_tennis_serve_times)), TuplesKt.to(111, Integer.valueOf(R.string.data_item_avg_heartrate)), TuplesKt.to(112, Integer.valueOf(R.string.data_item_hr_zone)), TuplesKt.to(113, Integer.valueOf(R.string.data_item_max_hr_percent)), TuplesKt.to(114, Integer.valueOf(R.string.data_item_bak_hr_percent)), TuplesKt.to(115, Integer.valueOf(R.string.data_item_avg_max_hr_percent)), TuplesKt.to(116, Integer.valueOf(R.string.data_item_avg_bak_hr_percent)), TuplesKt.to(117, Integer.valueOf(R.string.data_item_cur_lap_hr_max_percent)), TuplesKt.to(118, Integer.valueOf(R.string.data_item_cur_lap_hr_bak_percent)), TuplesKt.to(119, Integer.valueOf(R.string.data_item_last_lap_hr_max_percent)), TuplesKt.to(120, Integer.valueOf(R.string.data_item_last_lap_hr_bak_percent)), TuplesKt.to(121, Integer.valueOf(R.string.data_item_temperature)), TuplesKt.to(122, Integer.valueOf(R.string.data_item_max_temperature)), TuplesKt.to(123, Integer.valueOf(R.string.data_item_min_temperature)), TuplesKt.to(124, Integer.valueOf(R.string.data_item_anaerobic_te)), TuplesKt.to(125, Integer.valueOf(R.string.data_item_train_load)), TuplesKt.to(126, Integer.valueOf(R.string.data_item_sunrise_time)), TuplesKt.to(127, Integer.valueOf(R.string.data_item_sunset_time)), TuplesKt.to(128, Integer.valueOf(R.string.data_item_barometer)), TuplesKt.to(129, Integer.valueOf(R.string.data_item_system_time)), TuplesKt.to(130, Integer.valueOf(R.string.data_item_fitness_group_count)), TuplesKt.to(131, Integer.valueOf(R.string.data_item_fitness_group_time)), TuplesKt.to(132, Integer.valueOf(R.string.data_item_fitness_group_calirie)), TuplesKt.to(133, Integer.valueOf(R.string.data_item_rowing_currnet_group_count)), TuplesKt.to(134, Integer.valueOf(R.string.data_item_rowing_this_group_cost_time)), TuplesKt.to(135, Integer.valueOf(R.string.data_item_last_downhill_speed)), TuplesKt.to(250, Integer.valueOf(R.string.data_item_surplus_distance)), TuplesKt.to(251, Integer.valueOf(R.string.data_item_train_total_distance)), TuplesKt.to(252, Integer.valueOf(R.string.data_item_train_total_times)), TuplesKt.to(Integer.valueOf(PageType.PAGE_SHORTCUT), Integer.valueOf(R.string.data_item_surplus_time)), TuplesKt.to(254, Integer.valueOf(R.string.data_iten_keypress_distance)), TuplesKt.to(255, Integer.valueOf(R.string.data_iten_rest)), TuplesKt.to(256, Integer.valueOf(R.string.data_iten_rest_by_keypress)));
    }
}
