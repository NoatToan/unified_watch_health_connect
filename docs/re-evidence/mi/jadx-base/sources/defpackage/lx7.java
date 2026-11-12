package defpackage;

import com.amap.api.maps.utils.SpatialRelationUtil;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.miui.tsmclient.model.ErrorCode;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class lx7 extends ak8<lx7> {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25514k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25515r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public lx7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g) + CodedOutputByteBufferNano.y(6, this.h) + CodedOutputByteBufferNano.y(7, this.i) + CodedOutputByteBufferNano.y(8, this.j) + CodedOutputByteBufferNano.y(9, this.f25514k) + CodedOutputByteBufferNano.y(10, this.l) + CodedOutputByteBufferNano.y(11, this.m) + CodedOutputByteBufferNano.y(12, this.n) + CodedOutputByteBufferNano.y(13, this.o) + CodedOutputByteBufferNano.y(14, this.p) + CodedOutputByteBufferNano.y(15, this.q) + CodedOutputByteBufferNano.y(16, this.f25515r) + CodedOutputByteBufferNano.y(17, this.s) + CodedOutputByteBufferNano.y(18, this.t) + CodedOutputByteBufferNano.y(19, this.u) + CodedOutputByteBufferNano.y(20, this.v) + CodedOutputByteBufferNano.y(21, this.w) + CodedOutputByteBufferNano.y(22, this.x) + CodedOutputByteBufferNano.y(23, this.y) + CodedOutputByteBufferNano.y(24, this.z) + CodedOutputByteBufferNano.y(25, this.A) + CodedOutputByteBufferNano.y(26, this.B) + CodedOutputByteBufferNano.y(27, this.C) + CodedOutputByteBufferNano.y(28, this.D) + CodedOutputByteBufferNano.y(29, this.E) + CodedOutputByteBufferNano.y(30, this.F) + CodedOutputByteBufferNano.y(31, this.G) + CodedOutputByteBufferNano.y(32, this.H) + CodedOutputByteBufferNano.y(33, this.I) + CodedOutputByteBufferNano.y(34, this.J) + CodedOutputByteBufferNano.y(35, this.K) + CodedOutputByteBufferNano.y(36, this.L) + CodedOutputByteBufferNano.y(37, this.M) + CodedOutputByteBufferNano.y(38, this.N) + CodedOutputByteBufferNano.y(39, this.O) + CodedOutputByteBufferNano.y(40, this.P) + CodedOutputByteBufferNano.y(41, this.Q) + CodedOutputByteBufferNano.y(42, this.R) + CodedOutputByteBufferNano.y(43, this.S) + CodedOutputByteBufferNano.y(44, this.T) + CodedOutputByteBufferNano.y(45, this.U) + CodedOutputByteBufferNano.y(46, this.V) + CodedOutputByteBufferNano.y(47, this.W) + CodedOutputByteBufferNano.y(48, this.X) + CodedOutputByteBufferNano.y(49, this.Y) + CodedOutputByteBufferNano.y(50, this.Z) + CodedOutputByteBufferNano.y(51, this.a0) + CodedOutputByteBufferNano.y(52, this.b0) + CodedOutputByteBufferNano.y(53, this.c0) + CodedOutputByteBufferNano.y(54, this.d0) + CodedOutputByteBufferNano.y(55, this.e0) + CodedOutputByteBufferNano.y(56, this.f0) + CodedOutputByteBufferNano.y(57, this.g0);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        codedOutputByteBufferNano.p0(6, this.h);
        codedOutputByteBufferNano.p0(7, this.i);
        codedOutputByteBufferNano.p0(8, this.j);
        codedOutputByteBufferNano.p0(9, this.f25514k);
        codedOutputByteBufferNano.p0(10, this.l);
        codedOutputByteBufferNano.p0(11, this.m);
        codedOutputByteBufferNano.p0(12, this.n);
        codedOutputByteBufferNano.p0(13, this.o);
        codedOutputByteBufferNano.p0(14, this.p);
        codedOutputByteBufferNano.p0(15, this.q);
        codedOutputByteBufferNano.p0(16, this.f25515r);
        codedOutputByteBufferNano.p0(17, this.s);
        codedOutputByteBufferNano.p0(18, this.t);
        codedOutputByteBufferNano.p0(19, this.u);
        codedOutputByteBufferNano.p0(20, this.v);
        codedOutputByteBufferNano.p0(21, this.w);
        codedOutputByteBufferNano.p0(22, this.x);
        codedOutputByteBufferNano.p0(23, this.y);
        codedOutputByteBufferNano.p0(24, this.z);
        codedOutputByteBufferNano.p0(25, this.A);
        codedOutputByteBufferNano.p0(26, this.B);
        codedOutputByteBufferNano.p0(27, this.C);
        codedOutputByteBufferNano.p0(28, this.D);
        codedOutputByteBufferNano.p0(29, this.E);
        codedOutputByteBufferNano.p0(30, this.F);
        codedOutputByteBufferNano.p0(31, this.G);
        codedOutputByteBufferNano.p0(32, this.H);
        codedOutputByteBufferNano.p0(33, this.I);
        codedOutputByteBufferNano.p0(34, this.J);
        codedOutputByteBufferNano.p0(35, this.K);
        codedOutputByteBufferNano.p0(36, this.L);
        codedOutputByteBufferNano.p0(37, this.M);
        codedOutputByteBufferNano.p0(38, this.N);
        codedOutputByteBufferNano.p0(39, this.O);
        codedOutputByteBufferNano.p0(40, this.P);
        codedOutputByteBufferNano.p0(41, this.Q);
        codedOutputByteBufferNano.p0(42, this.R);
        codedOutputByteBufferNano.p0(43, this.S);
        codedOutputByteBufferNano.p0(44, this.T);
        codedOutputByteBufferNano.p0(45, this.U);
        codedOutputByteBufferNano.p0(46, this.V);
        codedOutputByteBufferNano.p0(47, this.W);
        codedOutputByteBufferNano.p0(48, this.X);
        codedOutputByteBufferNano.p0(49, this.Y);
        codedOutputByteBufferNano.p0(50, this.Z);
        codedOutputByteBufferNano.p0(51, this.a0);
        codedOutputByteBufferNano.p0(52, this.b0);
        codedOutputByteBufferNano.p0(53, this.c0);
        codedOutputByteBufferNano.p0(54, this.d0);
        codedOutputByteBufferNano.p0(55, this.e0);
        codedOutputByteBufferNano.p0(56, this.f0);
        codedOutputByteBufferNano.p0(57, this.g0);
        super.j(codedOutputByteBufferNano);
    }

    public lx7 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f25514k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f25515r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public lx7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.c = o34Var.B();
                    break;
                case 16:
                    this.d = o34Var.B();
                    break;
                case 24:
                    this.e = o34Var.B();
                    break;
                case 32:
                    this.f = o34Var.B();
                    break;
                case 40:
                    this.g = o34Var.B();
                    break;
                case 48:
                    this.h = o34Var.B();
                    break;
                case 56:
                    this.i = o34Var.B();
                    break;
                case 64:
                    this.j = o34Var.B();
                    break;
                case 72:
                    this.f25514k = o34Var.B();
                    break;
                case 80:
                    this.l = o34Var.B();
                    break;
                case 88:
                    this.m = o34Var.B();
                    break;
                case 96:
                    this.n = o34Var.B();
                    break;
                case 104:
                    this.o = o34Var.B();
                    break;
                case 112:
                    this.p = o34Var.B();
                    break;
                case 120:
                    this.q = o34Var.B();
                    break;
                case 128:
                    this.f25515r = o34Var.B();
                    break;
                case 136:
                    this.s = o34Var.B();
                    break;
                case 144:
                    this.t = o34Var.B();
                    break;
                case 152:
                    this.u = o34Var.B();
                    break;
                case 160:
                    this.v = o34Var.B();
                    break;
                case 168:
                    this.w = o34Var.B();
                    break;
                case 176:
                    this.x = o34Var.B();
                    break;
                case SportReportBaseParser.ReportType.exitTime /* 184 */:
                    this.y = o34Var.B();
                    break;
                case 192:
                    this.z = o34Var.B();
                    break;
                case 200:
                    this.A = o34Var.B();
                    break;
                case 208:
                    this.B = o34Var.B();
                    break;
                case 216:
                    this.C = o34Var.B();
                    break;
                case SportReportBaseParser.ReportType.avgFreq /* 224 */:
                    this.D = o34Var.B();
                    break;
                case ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE /* 232 */:
                    this.E = o34Var.B();
                    break;
                case 240:
                    this.F = o34Var.B();
                    break;
                case 248:
                    this.G = o34Var.B();
                    break;
                case 256:
                    this.H = o34Var.B();
                    break;
                case 264:
                    this.I = o34Var.B();
                    break;
                case 272:
                    this.J = o34Var.B();
                    break;
                case 280:
                    this.K = o34Var.B();
                    break;
                case 288:
                    this.L = o34Var.B();
                    break;
                case 296:
                    this.M = o34Var.B();
                    break;
                case 304:
                    this.N = o34Var.B();
                    break;
                case 312:
                    this.O = o34Var.B();
                    break;
                case 320:
                    this.P = o34Var.B();
                    break;
                case 328:
                    this.Q = o34Var.B();
                    break;
                case 336:
                    this.R = o34Var.B();
                    break;
                case 344:
                    this.S = o34Var.B();
                    break;
                case 352:
                    this.T = o34Var.B();
                    break;
                case SpatialRelationUtil.A_CIRCLE_DEGREE /* 360 */:
                    this.U = o34Var.B();
                    break;
                case 368:
                    this.V = o34Var.B();
                    break;
                case 376:
                    this.W = o34Var.B();
                    break;
                case 384:
                    this.X = o34Var.B();
                    break;
                case 392:
                    this.Y = o34Var.B();
                    break;
                case 400:
                    this.Z = o34Var.B();
                    break;
                case 408:
                    this.a0 = o34Var.B();
                    break;
                case 416:
                    this.b0 = o34Var.B();
                    break;
                case 424:
                    this.c0 = o34Var.B();
                    break;
                case 432:
                    this.d0 = o34Var.B();
                    break;
                case 440:
                    this.e0 = o34Var.B();
                    break;
                case FileUtils.S_IRWXU /* 448 */:
                    this.f0 = o34Var.B();
                    break;
                case 456:
                    this.g0 = o34Var.B();
                    break;
                default:
                    if (!l(o34Var, iA)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }
}
