package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dlf extends ak8<dlf> {
    public int c;
    public int d;
    public int e;
    public elf[] f;

    public dlf() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        elf[] elfVarArr = this.f;
        if (elfVarArr != null && elfVarArr.length > 0) {
            int i = 0;
            while (true) {
                elf[] elfVarArr2 = this.f;
                if (i >= elfVarArr2.length) {
                    break;
                }
                elf elfVar = elfVarArr2[i];
                if (elfVar != null) {
                    iB += CodedOutputByteBufferNano.n(4, elfVar);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        elf[] elfVarArr = this.f;
        if (elfVarArr != null && elfVarArr.length > 0) {
            int i = 0;
            while (true) {
                elf[] elfVarArr2 = this.f;
                if (i >= elfVarArr2.length) {
                    break;
                }
                elf elfVar = elfVarArr2[i];
                if (elfVar != null) {
                    codedOutputByteBufferNano.Y(4, elfVar);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public dlf m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = elf.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dlf e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 34) {
                int iA2 = bmr.a(o34Var, 34);
                elf[] elfVarArr = this.f;
                int length = elfVarArr == null ? 0 : elfVarArr.length;
                int i = iA2 + length;
                elf[] elfVarArr2 = new elf[i];
                if (length != 0) {
                    System.arraycopy(elfVarArr, 0, elfVarArr2, 0, length);
                }
                while (length < i - 1) {
                    elf elfVar = new elf();
                    elfVarArr2[length] = elfVar;
                    o34Var.q(elfVar);
                    o34Var.A();
                    length++;
                }
                elf elfVar2 = new elf();
                elfVarArr2[length] = elfVar2;
                o34Var.q(elfVar2);
                this.f = elfVarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
