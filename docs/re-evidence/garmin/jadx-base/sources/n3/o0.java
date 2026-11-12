package n3;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln3/o0;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 {
    public static final long A;
    public static final long B;
    public static final long C;
    public static final long D;
    public static final long E;
    public static final long F;
    public static final long G;
    public static final long H;
    public static final long I;
    public static final long J;
    public static final long K;
    public static final long L;
    public static final long M;
    public static final long N;
    public static final long O;
    public static final long P;
    public static final long Q;
    public static final long R;
    public static final long S;
    public static final long T;
    public static final long U;
    public static final long V;
    public static final long W;
    public static final long X;
    public static final long Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f123188a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f123189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f123190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f123191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f123192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f123193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f123194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f123195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f123196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f123197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f123198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f123199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f123200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f123201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f123202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f123203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f123204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f123205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f123206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f123207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f123208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f123209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f123210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f123211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f123212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f123213z;

    static {
        o4.f0.c(0, 0, 0);
        o4.f0.c(0, 0, 0);
        f123189b = o4.f0.c(65, 14, 11);
        f123190c = o4.f0.c(255, 255, 255);
        f123191d = o4.f0.c(96, 20, 16);
        f123192e = o4.f0.c(140, 29, 24);
        f123193f = o4.f0.c(179, 38, 30);
        o4.f0.c(220, 54, 46);
        o4.f0.c(228, 105, 98);
        o4.f0.c(236, 146, 142);
        f123194g = o4.f0.c(242, SyslogConstants.LOG_LOCAL7, 181);
        f123195h = o4.f0.c(249, 222, 220);
        o4.f0.c(252, 238, 238);
        o4.f0.c(255, 251, 249);
        f123196i = o4.f0.c(0, 0, 0);
        f123197j = o4.f0.c(29, 27, 32);
        f123198k = o4.f0.c(255, 255, 255);
        f123199l = o4.f0.c(33, 31, 38);
        f123200m = o4.f0.c(43, 41, 48);
        f123201n = o4.f0.c(50, 47, 53);
        f123202o = o4.f0.c(54, 52, 59);
        f123203p = o4.f0.c(59, 56, 62);
        o4.f0.c(72, 70, 76);
        f123204q = o4.f0.c(15, 13, 19);
        o4.f0.c(96, 93, 100);
        o4.f0.c(121, 118, 125);
        f123205r = o4.f0.c(20, 18, 24);
        o4.f0.c(147, 143, 150);
        o4.f0.c(174, 169, 177);
        o4.f0.c(202, 197, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
        f123206s = o4.f0.c(222, 216, 225);
        f123207t = o4.f0.c(230, 224, 233);
        f123208u = o4.f0.c(236, 230, PsExtractor.VIDEO_STREAM_MASK);
        f123209v = o4.f0.c(243, 237, 247);
        f123210w = o4.f0.c(245, 239, 247);
        f123211x = o4.f0.c(247, 242, 250);
        f123212y = o4.f0.c(254, 247, 255);
        o4.f0.c(255, 251, 255);
        o4.f0.c(0, 0, 0);
        o4.f0.c(29, 26, 34);
        o4.f0.c(255, 255, 255);
        o4.f0.c(50, 47, 55);
        f123213z = o4.f0.c(73, 69, 79);
        o4.f0.c(96, 93, 102);
        A = o4.f0.c(121, 116, 126);
        B = o4.f0.c(147, 143, 153);
        o4.f0.c(174, 169, 180);
        C = o4.f0.c(202, 196, 208);
        D = o4.f0.c(231, 224, 236);
        o4.f0.c(245, 238, 250);
        o4.f0.c(255, 251, 254);
        o4.f0.c(0, 0, 0);
        E = o4.f0.c(33, 0, 93);
        F = o4.f0.c(255, 255, 255);
        G = o4.f0.c(56, 30, 114);
        H = o4.f0.c(79, 55, 139);
        I = o4.f0.c(103, 80, 164);
        o4.f0.c(127, 103, 190);
        o4.f0.c(154, 130, 219);
        o4.f0.c(182, 157, 248);
        J = o4.f0.c(208, TsExtractor.TS_PACKET_SIZE, 255);
        K = o4.f0.c(234, 221, 255);
        o4.f0.c(246, 237, 255);
        o4.f0.c(255, 251, 254);
        o4.f0.c(0, 0, 0);
        L = o4.f0.c(29, 25, 43);
        M = o4.f0.c(255, 255, 255);
        N = o4.f0.c(51, 45, 65);
        O = o4.f0.c(74, 68, 88);
        P = o4.f0.c(98, 91, 113);
        o4.f0.c(122, 114, 137);
        o4.f0.c(149, 141, 165);
        o4.f0.c(SyslogConstants.LOG_LOCAL6, 167, 192);
        Q = o4.f0.c(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 194, 220);
        R = o4.f0.c(232, 222, 248);
        o4.f0.c(246, 237, 255);
        o4.f0.c(255, 251, 254);
        o4.f0.c(0, 0, 0);
        S = o4.f0.c(49, 17, 29);
        T = o4.f0.c(255, 255, 255);
        U = o4.f0.c(73, 37, 50);
        V = o4.f0.c(99, 59, 72);
        W = o4.f0.c(125, 82, 96);
        o4.f0.c(SyslogConstants.LOG_LOCAL3, 105, 119);
        o4.f0.c(181, 131, 146);
        o4.f0.c(210, 157, TsExtractor.TS_STREAM_TYPE_AC4);
        X = o4.f0.c(239, SyslogConstants.LOG_LOCAL7, 200);
        Y = o4.f0.c(255, 216, 228);
        o4.f0.c(255, 236, 241);
        o4.f0.c(255, 251, 250);
        o4.f0.c(255, 255, 255);
    }

    private o0() {
    }
}
