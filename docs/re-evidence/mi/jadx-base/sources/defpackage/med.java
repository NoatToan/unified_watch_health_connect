package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class med extends ak8<med> {
    public static volatile med[] h;
    public int c = 0;
    public Object d;
    public int e;
    public String f;
    public String g;

    public static final class a extends ak8<a> {
        public med[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            med[] medVarArr = this.c;
            if (medVarArr != null && medVarArr.length > 0) {
                int i = 0;
                while (true) {
                    med[] medVarArr2 = this.c;
                    if (i >= medVarArr2.length) {
                        break;
                    }
                    med medVar = medVarArr2[i];
                    if (medVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, medVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            med[] medVarArr = this.c;
            if (medVarArr != null && medVarArr.length > 0) {
                int i = 0;
                while (true) {
                    med[] medVarArr2 = this.c;
                    if (i >= medVarArr2.length) {
                        break;
                    }
                    med medVar = medVarArr2[i];
                    if (medVar != null) {
                        codedOutputByteBufferNano.Y(1, medVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = med.o();
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
                    med[] medVarArr = this.c;
                    int length = medVarArr == null ? 0 : medVarArr.length;
                    int i = iA2 + length;
                    med[] medVarArr2 = new med[i];
                    if (length != 0) {
                        System.arraycopy(medVarArr, 0, medVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        med medVar = new med();
                        medVarArr2[length] = medVar;
                        o34Var.q(medVar);
                        o34Var.A();
                        length++;
                    }
                    med medVar2 = new med();
                    medVarArr2[length] = medVar2;
                    o34Var.q(medVar2);
                    this.c = medVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public med() {
        m();
    }

    public static med[] o() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new med[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e) + CodedOutputByteBufferNano.v(2, this.f) + CodedOutputByteBufferNano.v(3, this.g);
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        return this.c == 6 ? iB + CodedOutputByteBufferNano.n(6, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        codedOutputByteBufferNano.m0(2, this.f);
        codedOutputByteBufferNano.m0(3, this.g);
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.Y(6, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public med m() {
        this.e = 1;
        this.f = "";
        this.g = "";
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public med n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public med e(o34 o34Var) throws IOException {
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
                    case 7:
                        this.e = iP;
                        break;
                }
            } else if (iA == 18) {
                this.f = o34Var.z();
            } else if (iA == 26) {
                this.g = o34Var.z();
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new idd();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (iA == 42) {
                if (this.c != 5) {
                    this.d = new ted();
                }
                o34Var.q((dsf) this.d);
                this.c = 5;
            } else if (iA == 50) {
                if (this.c != 6) {
                    this.d = new tdd();
                }
                o34Var.q((dsf) this.d);
                this.c = 6;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public med q(idd iddVar) {
        iddVar.getClass();
        this.c = 4;
        this.d = iddVar;
        return this;
    }

    public med r(tdd tddVar) {
        tddVar.getClass();
        this.c = 6;
        this.d = tddVar;
        return this;
    }

    public med s(ted tedVar) {
        tedVar.getClass();
        this.c = 5;
        this.d = tedVar;
        return this;
    }
}
