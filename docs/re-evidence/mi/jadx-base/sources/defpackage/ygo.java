package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ygo extends ak8<ygo> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile ygo[] f40164k;
    public String c;
    public String d;
    public String e;
    public float f;
    public float g;
    public int h;
    public int i;
    public int j;

    public static final class a extends ak8<a> {
        public ygo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ygo[] ygoVarArr = this.c;
            if (ygoVarArr != null && ygoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    ygo[] ygoVarArr2 = this.c;
                    if (i >= ygoVarArr2.length) {
                        break;
                    }
                    ygo ygoVar = ygoVarArr2[i];
                    if (ygoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, ygoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ygo[] ygoVarArr = this.c;
            if (ygoVarArr != null && ygoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    ygo[] ygoVarArr2 = this.c;
                    if (i >= ygoVarArr2.length) {
                        break;
                    }
                    ygo ygoVar = ygoVarArr2[i];
                    if (ygoVar != null) {
                        codedOutputByteBufferNano.Y(1, ygoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = ygo.n();
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
                    int iA2 = bmr.a(o34Var, 10);
                    ygo[] ygoVarArr = this.c;
                    int length = ygoVarArr == null ? 0 : ygoVarArr.length;
                    int i = iA2 + length;
                    ygo[] ygoVarArr2 = new ygo[i];
                    if (length != 0) {
                        System.arraycopy(ygoVarArr, 0, ygoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ygo ygoVar = new ygo();
                        ygoVarArr2[length] = ygoVar;
                        o34Var.q(ygoVar);
                        o34Var.A();
                        length++;
                    }
                    ygo ygoVar2 = new ygo();
                    ygoVarArr2[length] = ygoVar2;
                    o34Var.q(ygoVar2);
                    this.c = ygoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ygo() {
        m();
    }

    public static ygo[] n() {
        if (f40164k == null) {
            synchronized (afd.c) {
                try {
                    if (f40164k == null) {
                        f40164k = new ygo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f40164k;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        return iB + CodedOutputByteBufferNano.j(4, this.f) + CodedOutputByteBufferNano.j(5, this.g) + CodedOutputByteBufferNano.y(6, this.h) + CodedOutputByteBufferNano.y(7, this.i) + CodedOutputByteBufferNano.y(8, this.j);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        codedOutputByteBufferNano.U(4, this.f);
        codedOutputByteBufferNano.U(5, this.g);
        codedOutputByteBufferNano.p0(6, this.h);
        codedOutputByteBufferNano.p0(7, this.i);
        codedOutputByteBufferNano.p0(8, this.j);
        super.j(codedOutputByteBufferNano);
    }

    public ygo m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ygo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 37) {
                this.f = o34Var.o();
            } else if (iA == 45) {
                this.g = o34Var.o();
            } else if (iA == 48) {
                this.h = o34Var.B();
            } else if (iA == 56) {
                this.i = o34Var.B();
            } else if (iA == 64) {
                this.j = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
