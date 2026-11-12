package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class au9 extends ak8<au9> {
    public int A;
    public int B;
    public int c;
    public int d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3452k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3453r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public au9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(1, i);
        }
        int i2 = this.d;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(2, i2);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(3, this.e);
        }
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(4, this.f);
        }
        int i3 = this.g;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i4);
        }
        int i5 = this.i;
        if (i5 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i5);
        }
        int i6 = this.j;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.l(8, i6);
        }
        int i7 = this.f3452k;
        if (i7 != 0) {
            iB += CodedOutputByteBufferNano.y(9, i7);
        }
        int i8 = this.l;
        if (i8 != 0) {
            iB += CodedOutputByteBufferNano.y(10, i8);
        }
        int i9 = this.m;
        if (i9 != 0) {
            iB += CodedOutputByteBufferNano.y(11, i9);
        }
        int i10 = this.n;
        if (i10 != 0) {
            iB += CodedOutputByteBufferNano.y(12, i10);
        }
        int i11 = this.o;
        if (i11 != 0) {
            iB += CodedOutputByteBufferNano.y(13, i11);
        }
        int i12 = this.p;
        if (i12 != 0) {
            iB += CodedOutputByteBufferNano.y(14, i12);
        }
        int i13 = this.q;
        if (i13 != 0) {
            iB += CodedOutputByteBufferNano.y(15, i13);
        }
        int i14 = this.s;
        if (i14 != 0) {
            iB += CodedOutputByteBufferNano.y(16, i14);
        }
        int i15 = this.t;
        if (i15 != 0) {
            iB += CodedOutputByteBufferNano.y(17, i15);
        }
        int i16 = this.u;
        if (i16 != 0) {
            iB += CodedOutputByteBufferNano.y(18, i16);
        }
        int i17 = this.v;
        if (i17 != 0) {
            iB += CodedOutputByteBufferNano.y(19, i17);
        }
        int i18 = this.f3453r;
        if (i18 != 0) {
            iB += CodedOutputByteBufferNano.y(20, i18);
        }
        int i19 = this.w;
        if (i19 != 0) {
            iB += CodedOutputByteBufferNano.y(21, i19);
        }
        int i20 = this.x;
        if (i20 != 0) {
            iB += CodedOutputByteBufferNano.y(22, i20);
        }
        int i21 = this.y;
        if (i21 != 0) {
            iB += CodedOutputByteBufferNano.y(23, i21);
        }
        int i22 = this.z;
        if (i22 != 0) {
            iB += CodedOutputByteBufferNano.y(24, i22);
        }
        int i23 = this.A;
        if (i23 != 0) {
            iB += CodedOutputByteBufferNano.y(25, i23);
        }
        int i24 = this.B;
        return i24 != 0 ? iB + CodedOutputByteBufferNano.y(26, i24) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.p0(1, i);
        }
        int i2 = this.d;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(2, i2);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(3, this.e);
        }
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(4, this.f);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(5, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(6, i4);
        }
        int i5 = this.i;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(7, i5);
        }
        int i6 = this.j;
        if (i6 != 0) {
            codedOutputByteBufferNano.W(8, i6);
        }
        int i7 = this.f3452k;
        if (i7 != 0) {
            codedOutputByteBufferNano.p0(9, i7);
        }
        int i8 = this.l;
        if (i8 != 0) {
            codedOutputByteBufferNano.p0(10, i8);
        }
        int i9 = this.m;
        if (i9 != 0) {
            codedOutputByteBufferNano.p0(11, i9);
        }
        int i10 = this.n;
        if (i10 != 0) {
            codedOutputByteBufferNano.p0(12, i10);
        }
        int i11 = this.o;
        if (i11 != 0) {
            codedOutputByteBufferNano.p0(13, i11);
        }
        int i12 = this.p;
        if (i12 != 0) {
            codedOutputByteBufferNano.p0(14, i12);
        }
        int i13 = this.q;
        if (i13 != 0) {
            codedOutputByteBufferNano.p0(15, i13);
        }
        int i14 = this.s;
        if (i14 != 0) {
            codedOutputByteBufferNano.p0(16, i14);
        }
        int i15 = this.t;
        if (i15 != 0) {
            codedOutputByteBufferNano.p0(17, i15);
        }
        int i16 = this.u;
        if (i16 != 0) {
            codedOutputByteBufferNano.p0(18, i16);
        }
        int i17 = this.v;
        if (i17 != 0) {
            codedOutputByteBufferNano.p0(19, i17);
        }
        int i18 = this.f3453r;
        if (i18 != 0) {
            codedOutputByteBufferNano.p0(20, i18);
        }
        int i19 = this.w;
        if (i19 != 0) {
            codedOutputByteBufferNano.p0(21, i19);
        }
        int i20 = this.x;
        if (i20 != 0) {
            codedOutputByteBufferNano.p0(22, i20);
        }
        int i21 = this.y;
        if (i21 != 0) {
            codedOutputByteBufferNano.p0(23, i21);
        }
        int i22 = this.z;
        if (i22 != 0) {
            codedOutputByteBufferNano.p0(24, i22);
        }
        int i23 = this.A;
        if (i23 != 0) {
            codedOutputByteBufferNano.p0(25, i23);
        }
        int i24 = this.B;
        if (i24 != 0) {
            codedOutputByteBufferNano.p0(26, i24);
        }
        super.j(codedOutputByteBufferNano);
    }

    public au9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f3452k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f3453r = 0;
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
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public au9 e(o34 o34Var) throws IOException {
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
                case 29:
                    this.e = o34Var.o();
                    break;
                case 37:
                    this.f = o34Var.o();
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
                    this.j = o34Var.p();
                    break;
                case 72:
                    this.f3452k = o34Var.B();
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
                    this.s = o34Var.B();
                    break;
                case 136:
                    this.t = o34Var.B();
                    break;
                case 144:
                    this.u = o34Var.B();
                    break;
                case 152:
                    this.v = o34Var.B();
                    break;
                case 160:
                    this.f3453r = o34Var.B();
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
