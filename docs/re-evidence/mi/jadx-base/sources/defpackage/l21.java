package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l21 extends ak8<l21> {
    public static volatile l21[] m;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public k21 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m21 f24539k;
    public String l;

    public static final class a extends ak8<a> {
        public l21[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            l21[] l21VarArr = this.c;
            if (l21VarArr != null && l21VarArr.length > 0) {
                int i = 0;
                while (true) {
                    l21[] l21VarArr2 = this.c;
                    if (i >= l21VarArr2.length) {
                        break;
                    }
                    l21 l21Var = l21VarArr2[i];
                    if (l21Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, l21Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            l21[] l21VarArr = this.c;
            if (l21VarArr != null && l21VarArr.length > 0) {
                int i = 0;
                while (true) {
                    l21[] l21VarArr2 = this.c;
                    if (i >= l21VarArr2.length) {
                        break;
                    }
                    l21 l21Var = l21VarArr2[i];
                    if (l21Var != null) {
                        codedOutputByteBufferNano.Y(1, l21Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = l21.n();
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
                    l21[] l21VarArr = this.c;
                    int length = l21VarArr == null ? 0 : l21VarArr.length;
                    int i = iA2 + length;
                    l21[] l21VarArr2 = new l21[i];
                    if (length != 0) {
                        System.arraycopy(l21VarArr, 0, l21VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        l21 l21Var = new l21();
                        l21VarArr2[length] = l21Var;
                        o34Var.q(l21Var);
                        o34Var.A();
                        length++;
                    }
                    l21 l21Var2 = new l21();
                    l21VarArr2[length] = l21Var2;
                    o34Var.q(l21Var2);
                    this.c = l21VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public l21() {
        m();
    }

    public static l21[] n() {
        if (m == null) {
            synchronized (afd.c) {
                try {
                    if (m == null) {
                        m = new l21[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        if (!this.h.equals("")) {
            iB += CodedOutputByteBufferNano.v(6, this.h);
        }
        if (!this.i.equals("")) {
            iB += CodedOutputByteBufferNano.v(7, this.i);
        }
        k21 k21Var = this.j;
        if (k21Var != null) {
            iB += CodedOutputByteBufferNano.n(8, k21Var);
        }
        m21 m21Var = this.f24539k;
        if (m21Var != null) {
            iB += CodedOutputByteBufferNano.n(9, m21Var);
        }
        return !this.l.equals("") ? iB + CodedOutputByteBufferNano.v(10, this.l) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.m0(7, this.i);
        }
        k21 k21Var = this.j;
        if (k21Var != null) {
            codedOutputByteBufferNano.Y(8, k21Var);
        }
        m21 m21Var = this.f24539k;
        if (m21Var != null) {
            codedOutputByteBufferNano.Y(9, m21Var);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.m0(10, this.l);
        }
        super.j(codedOutputByteBufferNano);
    }

    public l21 m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = null;
        this.f24539k = null;
        this.l = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l21 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    this.c = o34Var.z();
                    break;
                case 18:
                    this.d = o34Var.z();
                    break;
                case 26:
                    this.e = o34Var.z();
                    break;
                case 34:
                    this.f = o34Var.z();
                    break;
                case 42:
                    this.g = o34Var.z();
                    break;
                case 50:
                    this.h = o34Var.z();
                    break;
                case 58:
                    this.i = o34Var.z();
                    break;
                case 66:
                    if (this.j == null) {
                        this.j = new k21();
                    }
                    o34Var.q(this.j);
                    break;
                case 74:
                    if (this.f24539k == null) {
                        this.f24539k = new m21();
                    }
                    o34Var.q(this.f24539k);
                    break;
                case 82:
                    this.l = o34Var.z();
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
