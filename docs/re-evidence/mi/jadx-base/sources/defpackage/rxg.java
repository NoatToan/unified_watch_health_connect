package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rxg extends ak8<rxg> {
    public static volatile rxg[] s;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f33036k;
    public int l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f33037r;

    public static final class a extends ak8<a> {
        public int c;
        public f d;
        public f e;
        public f f;
        public e g;
        public boolean h;
        public int i;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            f fVar = this.d;
            if (fVar != null) {
                iB += CodedOutputByteBufferNano.n(2, fVar);
            }
            f fVar2 = this.e;
            if (fVar2 != null) {
                iB += CodedOutputByteBufferNano.n(3, fVar2);
            }
            f fVar3 = this.f;
            if (fVar3 != null) {
                iB += CodedOutputByteBufferNano.n(4, fVar3);
            }
            e eVar = this.g;
            if (eVar != null) {
                iB += CodedOutputByteBufferNano.n(5, eVar);
            }
            boolean z = this.h;
            if (z) {
                iB += CodedOutputByteBufferNano.b(6, z);
            }
            int i = this.i;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(7, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            f fVar = this.d;
            if (fVar != null) {
                codedOutputByteBufferNano.Y(2, fVar);
            }
            f fVar2 = this.e;
            if (fVar2 != null) {
                codedOutputByteBufferNano.Y(3, fVar2);
            }
            f fVar3 = this.f;
            if (fVar3 != null) {
                codedOutputByteBufferNano.Y(4, fVar3);
            }
            e eVar = this.g;
            if (eVar != null) {
                codedOutputByteBufferNano.Y(5, eVar);
            }
            boolean z = this.h;
            if (z) {
                codedOutputByteBufferNano.M(6, z);
            }
            int i = this.i;
            if (i != 0) {
                codedOutputByteBufferNano.p0(7, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            this.i = 0;
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
                    this.c = o34Var.B();
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new f();
                    }
                    o34Var.q(this.d);
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new f();
                    }
                    o34Var.q(this.e);
                } else if (iA == 34) {
                    if (this.f == null) {
                        this.f = new f();
                    }
                    o34Var.q(this.f);
                } else if (iA == 42) {
                    if (this.g == null) {
                        this.g = new e();
                    }
                    o34Var.q(this.g);
                } else if (iA == 48) {
                    this.h = o34Var.k();
                } else if (iA == 56) {
                    this.i = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public String d;
        public c e;
        public c f;
        public e g;
        public boolean h;
        public int i;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
            c cVar = this.e;
            if (cVar != null) {
                iB += CodedOutputByteBufferNano.n(3, cVar);
            }
            c cVar2 = this.f;
            if (cVar2 != null) {
                iB += CodedOutputByteBufferNano.n(4, cVar2);
            }
            e eVar = this.g;
            if (eVar != null) {
                iB += CodedOutputByteBufferNano.n(5, eVar);
            }
            boolean z = this.h;
            if (z) {
                iB += CodedOutputByteBufferNano.b(6, z);
            }
            int i = this.i;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(7, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.m0(2, this.d);
            c cVar = this.e;
            if (cVar != null) {
                codedOutputByteBufferNano.Y(3, cVar);
            }
            c cVar2 = this.f;
            if (cVar2 != null) {
                codedOutputByteBufferNano.Y(4, cVar2);
            }
            e eVar = this.g;
            if (eVar != null) {
                codedOutputByteBufferNano.Y(5, eVar);
            }
            boolean z = this.h;
            if (z) {
                codedOutputByteBufferNano.M(6, z);
            }
            int i = this.i;
            if (i != 0) {
                codedOutputByteBufferNano.p0(7, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = "";
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            this.i = 0;
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
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new c();
                    }
                    o34Var.q(this.e);
                } else if (iA == 34) {
                    if (this.f == null) {
                        this.f = new c();
                    }
                    o34Var.q(this.f);
                } else if (iA == 42) {
                    if (this.g == null) {
                        this.g = new e();
                    }
                    o34Var.q(this.g);
                } else if (iA == 48) {
                    this.h = o34Var.k();
                } else if (iA == 56) {
                    this.i = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public f c;
        public f d;
        public f e;
        public f f;
        public f g;
        public byte[] h;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            f fVar = this.c;
            if (fVar != null) {
                iB += CodedOutputByteBufferNano.n(1, fVar);
            }
            f fVar2 = this.d;
            if (fVar2 != null) {
                iB += CodedOutputByteBufferNano.n(2, fVar2);
            }
            f fVar3 = this.e;
            if (fVar3 != null) {
                iB += CodedOutputByteBufferNano.n(3, fVar3);
            }
            f fVar4 = this.f;
            if (fVar4 != null) {
                iB += CodedOutputByteBufferNano.n(4, fVar4);
            }
            f fVar5 = this.g;
            if (fVar5 != null) {
                iB += CodedOutputByteBufferNano.n(5, fVar5);
            }
            return !Arrays.equals(this.h, bmr.h) ? iB + CodedOutputByteBufferNano.d(6, this.h) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            f fVar = this.c;
            if (fVar != null) {
                codedOutputByteBufferNano.Y(1, fVar);
            }
            f fVar2 = this.d;
            if (fVar2 != null) {
                codedOutputByteBufferNano.Y(2, fVar2);
            }
            f fVar3 = this.e;
            if (fVar3 != null) {
                codedOutputByteBufferNano.Y(3, fVar3);
            }
            f fVar4 = this.f;
            if (fVar4 != null) {
                codedOutputByteBufferNano.Y(4, fVar4);
            }
            f fVar5 = this.g;
            if (fVar5 != null) {
                codedOutputByteBufferNano.Y(5, fVar5);
            }
            if (!Arrays.equals(this.h, bmr.h)) {
                codedOutputByteBufferNano.O(6, this.h);
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = bmr.h;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    if (this.c == null) {
                        this.c = new f();
                    }
                    o34Var.q(this.c);
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new f();
                    }
                    o34Var.q(this.d);
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new f();
                    }
                    o34Var.q(this.e);
                } else if (iA == 34) {
                    if (this.f == null) {
                        this.f = new f();
                    }
                    o34Var.q(this.f);
                } else if (iA == 42) {
                    if (this.g == null) {
                        this.g = new f();
                    }
                    o34Var.q(this.g);
                } else if (iA == 50) {
                    this.h = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public rxg[] c;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            rxg[] rxgVarArr = this.c;
            if (rxgVarArr != null && rxgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    rxg[] rxgVarArr2 = this.c;
                    if (i >= rxgVarArr2.length) {
                        break;
                    }
                    rxg rxgVar = rxgVarArr2[i];
                    if (rxgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, rxgVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            rxg[] rxgVarArr = this.c;
            if (rxgVarArr != null && rxgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    rxg[] rxgVarArr2 = this.c;
                    if (i >= rxgVarArr2.length) {
                        break;
                    }
                    rxg rxgVar = rxgVarArr2[i];
                    if (rxgVar != null) {
                        codedOutputByteBufferNano.Y(1, rxgVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = rxg.n();
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public d e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    rxg[] rxgVarArr = this.c;
                    int length = rxgVarArr == null ? 0 : rxgVarArr.length;
                    int i = iA2 + length;
                    rxg[] rxgVarArr2 = new rxg[i];
                    if (length != 0) {
                        System.arraycopy(rxgVarArr, 0, rxgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        rxg rxgVar = new rxg();
                        rxgVarArr2[length] = rxgVar;
                        o34Var.q(rxgVar);
                        o34Var.A();
                        length++;
                    }
                    rxg rxgVar2 = new rxg();
                    rxgVarArr2[length] = rxgVar2;
                    o34Var.q(rxgVar2);
                    this.c = rxgVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class e extends ak8<e> {
        public int c;
        public int d;
        public byte[] e;

        public e() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            return !Arrays.equals(this.e, bmr.h) ? iB + CodedOutputByteBufferNano.d(3, this.e) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            if (!Arrays.equals(this.e, bmr.h)) {
                codedOutputByteBufferNano.O(3, this.e);
            }
            super.j(codedOutputByteBufferNano);
        }

        public e m() {
            this.c = 0;
            this.d = 0;
            this.e = bmr.h;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public e e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    this.e = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class f extends ak8<f> {
        public String c;
        public byte[] d;

        public f() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
            return !Arrays.equals(this.d, bmr.h) ? iB + CodedOutputByteBufferNano.d(2, this.d) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            if (!Arrays.equals(this.d, bmr.h)) {
                codedOutputByteBufferNano.O(2, this.d);
            }
            super.j(codedOutputByteBufferNano);
        }

        public f m() {
            this.c = "";
            this.d = bmr.h;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 18) {
                    this.d = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public rxg() {
        m();
    }

    public static rxg[] n() {
        if (s == null) {
            synchronized (afd.c) {
                try {
                    if (s == null) {
                        s = new rxg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return s;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.v(4, this.f) + CodedOutputByteBufferNano.v(5, this.g) + CodedOutputByteBufferNano.v(6, this.h) + CodedOutputByteBufferNano.y(7, this.i);
        int i = this.l;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(8, i);
        }
        if (!this.j.equals("")) {
            iB += CodedOutputByteBufferNano.v(9, this.j);
        }
        if (!this.m.equals("")) {
            iB += CodedOutputByteBufferNano.v(10, this.m);
        }
        boolean z = this.n;
        if (z) {
            iB += CodedOutputByteBufferNano.b(11, z);
        }
        if (!this.f33036k.equals("")) {
            iB += CodedOutputByteBufferNano.v(12, this.f33036k);
        }
        boolean z2 = this.o;
        if (z2) {
            iB += CodedOutputByteBufferNano.b(13, z2);
        }
        a aVar = this.q;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(14, aVar);
        }
        b bVar = this.f33037r;
        if (bVar != null) {
            iB += CodedOutputByteBufferNano.n(15, bVar);
        }
        boolean z3 = this.p;
        return z3 ? iB + CodedOutputByteBufferNano.b(16, z3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.m0(4, this.f);
        codedOutputByteBufferNano.m0(5, this.g);
        codedOutputByteBufferNano.m0(6, this.h);
        codedOutputByteBufferNano.p0(7, this.i);
        int i = this.l;
        if (i != 0) {
            codedOutputByteBufferNano.W(8, i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.m0(9, this.j);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.m0(10, this.m);
        }
        boolean z = this.n;
        if (z) {
            codedOutputByteBufferNano.M(11, z);
        }
        if (!this.f33036k.equals("")) {
            codedOutputByteBufferNano.m0(12, this.f33036k);
        }
        boolean z2 = this.o;
        if (z2) {
            codedOutputByteBufferNano.M(13, z2);
        }
        a aVar = this.q;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(14, aVar);
        }
        b bVar = this.f33037r;
        if (bVar != null) {
            codedOutputByteBufferNano.Y(15, bVar);
        }
        boolean z3 = this.p;
        if (z3) {
            codedOutputByteBufferNano.M(16, z3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public rxg m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = 0;
        this.j = "";
        this.f33036k = "";
        this.l = 0;
        this.m = "";
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = null;
        this.f33037r = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public rxg e(o34 o34Var) throws IOException {
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
                case 56:
                    this.i = o34Var.B();
                    break;
                case 64:
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.l = iP;
                    }
                    break;
                case 74:
                    this.j = o34Var.z();
                    break;
                case 82:
                    this.m = o34Var.z();
                    break;
                case 88:
                    this.n = o34Var.k();
                    break;
                case 98:
                    this.f33036k = o34Var.z();
                    break;
                case 104:
                    this.o = o34Var.k();
                    break;
                case 114:
                    if (this.q == null) {
                        this.q = new a();
                    }
                    o34Var.q(this.q);
                    break;
                case 122:
                    if (this.f33037r == null) {
                        this.f33037r = new b();
                    }
                    o34Var.q(this.f33037r);
                    break;
                case 128:
                    this.p = o34Var.k();
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
