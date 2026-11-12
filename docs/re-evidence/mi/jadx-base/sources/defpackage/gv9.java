package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gv9 extends ak8<gv9> {
    public int c;
    public int d;
    public int e;
    public int f;
    public a g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19364k;
    public float l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19365r;
    public int s;

    public static final class a extends ak8<a> {
        public boolean c;
        public int d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            boolean z = this.c;
            if (z) {
                iB += CodedOutputByteBufferNano.b(1, z);
            }
            int i = this.d;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.c;
            if (z) {
                codedOutputByteBufferNano.M(1, z);
            }
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.p0(2, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = false;
            this.d = 0;
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
                if (iA == 8) {
                    this.c = o34Var.k();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public gv9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        int i = this.e;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(3, i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i2);
        }
        a aVar = this.g;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(5, aVar);
        }
        int i3 = this.h;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i4);
        }
        int i5 = this.j;
        if (i5 != 0) {
            iB += CodedOutputByteBufferNano.y(8, i5);
        }
        int i6 = this.m;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.y(9, i6);
        }
        int i7 = this.n;
        if (i7 != 0) {
            iB += CodedOutputByteBufferNano.y(10, i7);
        }
        int i8 = this.o;
        if (i8 != 0) {
            iB += CodedOutputByteBufferNano.y(11, i8);
        }
        int i9 = this.p;
        if (i9 != 0) {
            iB += CodedOutputByteBufferNano.y(12, i9);
        }
        int i10 = this.q;
        if (i10 != 0) {
            iB += CodedOutputByteBufferNano.y(13, i10);
        }
        int i11 = this.f19364k;
        if (i11 != 0) {
            iB += CodedOutputByteBufferNano.y(14, i11);
        }
        if (Float.floatToIntBits(this.l) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(15, this.l);
        }
        int i12 = this.f19365r;
        if (i12 != 0) {
            iB += CodedOutputByteBufferNano.y(16, i12);
        }
        int i13 = this.s;
        return i13 != 0 ? iB + CodedOutputByteBufferNano.y(17, i13) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(4, i2);
        }
        a aVar = this.g;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(5, aVar);
        }
        int i3 = this.h;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(6, i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(7, i4);
        }
        int i5 = this.j;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(8, i5);
        }
        int i6 = this.m;
        if (i6 != 0) {
            codedOutputByteBufferNano.p0(9, i6);
        }
        int i7 = this.n;
        if (i7 != 0) {
            codedOutputByteBufferNano.p0(10, i7);
        }
        int i8 = this.o;
        if (i8 != 0) {
            codedOutputByteBufferNano.p0(11, i8);
        }
        int i9 = this.p;
        if (i9 != 0) {
            codedOutputByteBufferNano.p0(12, i9);
        }
        int i10 = this.q;
        if (i10 != 0) {
            codedOutputByteBufferNano.p0(13, i10);
        }
        int i11 = this.f19364k;
        if (i11 != 0) {
            codedOutputByteBufferNano.p0(14, i11);
        }
        if (Float.floatToIntBits(this.l) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(15, this.l);
        }
        int i12 = this.f19365r;
        if (i12 != 0) {
            codedOutputByteBufferNano.p0(16, i12);
        }
        int i13 = this.s;
        if (i13 != 0) {
            codedOutputByteBufferNano.p0(17, i13);
        }
        super.j(codedOutputByteBufferNano);
    }

    public gv9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f19364k = 0;
        this.l = 0.0f;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f19365r = 0;
        this.s = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public gv9 e(o34 o34Var) throws IOException {
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
                case 42:
                    if (this.g == null) {
                        this.g = new a();
                    }
                    o34Var.q(this.g);
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
                    this.m = o34Var.B();
                    break;
                case 80:
                    this.n = o34Var.B();
                    break;
                case 88:
                    this.o = o34Var.B();
                    break;
                case 96:
                    this.p = o34Var.B();
                    break;
                case 104:
                    this.q = o34Var.B();
                    break;
                case 112:
                    this.f19364k = o34Var.B();
                    break;
                case 125:
                    this.l = o34Var.o();
                    break;
                case 128:
                    this.f19365r = o34Var.B();
                    break;
                case 136:
                    this.s = o34Var.B();
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
