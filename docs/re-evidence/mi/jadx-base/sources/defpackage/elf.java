package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class elf extends ak8<elf> {
    public static volatile elf[] f;
    public int c;
    public String d;
    public int e;

    public static final class a extends ak8<a> {
        public int c;
        public int d;
        public String e;
        public byte[] f;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            if (!this.e.equals("")) {
                iB += CodedOutputByteBufferNano.v(3, this.e);
            }
            return !Arrays.equals(this.f, bmr.h) ? iB + CodedOutputByteBufferNano.d(4, this.f) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            if (!this.e.equals("")) {
                codedOutputByteBufferNano.m0(3, this.e);
            }
            if (!Arrays.equals(this.f, bmr.h)) {
                codedOutputByteBufferNano.O(4, this.f);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 1;
            this.d = 0;
            this.e = "";
            this.f = bmr.h;
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
                    int iP = o34Var.p();
                    switch (iP) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.c = iP;
                            break;
                    }
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    this.e = o34Var.z();
                } else if (iA == 34) {
                    this.f = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public byte[] d;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
            return !Arrays.equals(this.d, bmr.h) ? iB + CodedOutputByteBufferNano.d(2, this.d) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            if (!Arrays.equals(this.d, bmr.h)) {
                codedOutputByteBufferNano.O(2, this.d);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = bmr.h;
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
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                        this.c = iP;
                    }
                } else if (iA == 18) {
                    this.d = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public elf() {
        m();
    }

    public static elf[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new elf[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public elf m() {
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public elf e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
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
