package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class yrg extends ak8<yrg> {
    public static volatile yrg[] e;
    public byte[] c;
    public String d;

    public static final class a extends ak8<a> {
        public yrg[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            yrg[] yrgVarArr = this.c;
            if (yrgVarArr != null && yrgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    yrg[] yrgVarArr2 = this.c;
                    if (i >= yrgVarArr2.length) {
                        break;
                    }
                    yrg yrgVar = yrgVarArr2[i];
                    if (yrgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, yrgVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            yrg[] yrgVarArr = this.c;
            if (yrgVarArr != null && yrgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    yrg[] yrgVarArr2 = this.c;
                    if (i >= yrgVarArr2.length) {
                        break;
                    }
                    yrg yrgVar = yrgVarArr2[i];
                    if (yrgVar != null) {
                        codedOutputByteBufferNano.Y(1, yrgVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = yrg.n();
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
                    yrg[] yrgVarArr = this.c;
                    int length = yrgVarArr == null ? 0 : yrgVarArr.length;
                    int i = iA2 + length;
                    yrg[] yrgVarArr2 = new yrg[i];
                    if (length != 0) {
                        System.arraycopy(yrgVarArr, 0, yrgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        yrg yrgVar = new yrg();
                        yrgVarArr2[length] = yrgVar;
                        o34Var.q(yrgVar);
                        o34Var.A();
                        length++;
                    }
                    yrg yrgVar2 = new yrg();
                    yrgVarArr2[length] = yrgVar2;
                    o34Var.q(yrgVar2);
                    this.c = yrgVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public yrg() {
        m();
    }

    public static yrg[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new yrg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.d(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public yrg m() {
        this.c = bmr.h;
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public yrg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
