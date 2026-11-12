package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tu9 extends ak8<tu9> {
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35051k;
    public int l;
    public int m;
    public float n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35052r;
    public int s;
    public int t;
    public int u;
    public a v;
    public String w;
    public String x;
    public String y;

    public static final class a extends ak8<a> {
        public String c;
        public String d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.m0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = "";
            this.e = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public int d;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            int i = this.d;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.p0(2, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public tu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(1, i);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(2, this.d);
        }
        int i2 = this.e;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.l(4, i3);
        }
        int i4 = this.f35051k;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i4);
        }
        int i5 = this.l;
        if (i5 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i5);
        }
        int i6 = this.m;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i6);
        }
        if (Float.floatToIntBits(this.n) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(8, this.n);
        }
        int i7 = this.o;
        if (i7 != 0) {
            iB += CodedOutputByteBufferNano.y(9, i7);
        }
        int i8 = this.p;
        if (i8 != 0) {
            iB += CodedOutputByteBufferNano.y(10, i8);
        }
        int i9 = this.q;
        if (i9 != 0) {
            iB += CodedOutputByteBufferNano.y(11, i9);
        }
        int i10 = this.g;
        if (i10 != 0) {
            iB += CodedOutputByteBufferNano.y(12, i10);
        }
        int i11 = this.h;
        if (i11 != 0) {
            iB += CodedOutputByteBufferNano.y(13, i11);
        }
        int i12 = this.i;
        if (i12 != 0) {
            iB += CodedOutputByteBufferNano.y(14, i12);
        }
        int i13 = this.j;
        if (i13 != 0) {
            iB += CodedOutputByteBufferNano.y(15, i13);
        }
        if (!this.f35052r.equals("")) {
            iB += CodedOutputByteBufferNano.v(16, this.f35052r);
        }
        int i14 = this.s;
        if (i14 != 0) {
            iB += CodedOutputByteBufferNano.y(17, i14);
        }
        int i15 = this.t;
        if (i15 != 0) {
            iB += CodedOutputByteBufferNano.y(18, i15);
        }
        int i16 = this.u;
        if (i16 != 0) {
            iB += CodedOutputByteBufferNano.y(19, i16);
        }
        a aVar = this.v;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(20, aVar);
        }
        if (!this.w.equals("")) {
            iB += CodedOutputByteBufferNano.v(21, this.w);
        }
        if (!this.x.equals("")) {
            iB += CodedOutputByteBufferNano.v(22, this.x);
        }
        return !this.y.equals("") ? iB + CodedOutputByteBufferNano.v(23, this.y) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.p0(1, i);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(2, this.d);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(4, i3);
        }
        int i4 = this.f35051k;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(5, i4);
        }
        int i5 = this.l;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(6, i5);
        }
        int i6 = this.m;
        if (i6 != 0) {
            codedOutputByteBufferNano.p0(7, i6);
        }
        if (Float.floatToIntBits(this.n) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(8, this.n);
        }
        int i7 = this.o;
        if (i7 != 0) {
            codedOutputByteBufferNano.p0(9, i7);
        }
        int i8 = this.p;
        if (i8 != 0) {
            codedOutputByteBufferNano.p0(10, i8);
        }
        int i9 = this.q;
        if (i9 != 0) {
            codedOutputByteBufferNano.p0(11, i9);
        }
        int i10 = this.g;
        if (i10 != 0) {
            codedOutputByteBufferNano.p0(12, i10);
        }
        int i11 = this.h;
        if (i11 != 0) {
            codedOutputByteBufferNano.p0(13, i11);
        }
        int i12 = this.i;
        if (i12 != 0) {
            codedOutputByteBufferNano.p0(14, i12);
        }
        int i13 = this.j;
        if (i13 != 0) {
            codedOutputByteBufferNano.p0(15, i13);
        }
        if (!this.f35052r.equals("")) {
            codedOutputByteBufferNano.m0(16, this.f35052r);
        }
        int i14 = this.s;
        if (i14 != 0) {
            codedOutputByteBufferNano.p0(17, i14);
        }
        int i15 = this.t;
        if (i15 != 0) {
            codedOutputByteBufferNano.p0(18, i15);
        }
        int i16 = this.u;
        if (i16 != 0) {
            codedOutputByteBufferNano.p0(19, i16);
        }
        a aVar = this.v;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(20, aVar);
        }
        if (!this.w.equals("")) {
            codedOutputByteBufferNano.m0(21, this.w);
        }
        if (!this.x.equals("")) {
            codedOutputByteBufferNano.m0(22, this.x);
        }
        if (!this.y.equals("")) {
            codedOutputByteBufferNano.m0(23, this.y);
        }
        super.j(codedOutputByteBufferNano);
    }

    public tu9 m() {
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f35051k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f35052r = "";
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = null;
        this.w = "";
        this.x = "";
        this.y = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public tu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.c = o34Var.B();
                    break;
                case 21:
                    this.d = o34Var.o();
                    break;
                case 24:
                    this.e = o34Var.B();
                    break;
                case 32:
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2) {
                        this.f = iP;
                    }
                    break;
                case 40:
                    this.f35051k = o34Var.B();
                    break;
                case 48:
                    this.l = o34Var.B();
                    break;
                case 56:
                    this.m = o34Var.B();
                    break;
                case 69:
                    this.n = o34Var.o();
                    break;
                case 72:
                    this.o = o34Var.B();
                    break;
                case 80:
                    this.p = o34Var.B();
                    break;
                case 88:
                    this.q = o34Var.B();
                    break;
                case 96:
                    this.g = o34Var.B();
                    break;
                case 104:
                    this.h = o34Var.B();
                    break;
                case 112:
                    this.i = o34Var.B();
                    break;
                case 120:
                    this.j = o34Var.B();
                    break;
                case 130:
                    this.f35052r = o34Var.z();
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
                case 162:
                    if (this.v == null) {
                        this.v = new a();
                    }
                    o34Var.q(this.v);
                    break;
                case 170:
                    this.w = o34Var.z();
                    break;
                case 178:
                    this.x = o34Var.z();
                    break;
                case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                    this.y = o34Var.z();
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
