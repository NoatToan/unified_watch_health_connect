package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import defpackage.ak8;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ak8<M extends ak8<M>> extends dsf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public al9 f1122b;

    @Override // defpackage.dsf
    public int b() {
        if (this.f1122b == null) {
            return 0;
        }
        int iC = 0;
        for (int i = 0; i < this.f1122b.k(); i++) {
            iC += this.f1122b.e(i).c();
        }
        return iC;
    }

    @Override // defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.f1122b == null) {
            return;
        }
        for (int i = 0; i < this.f1122b.k(); i++) {
            this.f1122b.e(i).e(codedOutputByteBufferNano);
        }
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public M clone() throws CloneNotSupportedException {
        M m = (M) super.clone();
        afd.a(this, m);
        return m;
    }

    public final boolean l(o34 o34Var, int i) throws IOException {
        bl9 bl9VarG;
        int iF = o34Var.f();
        if (!o34Var.F(i)) {
            return false;
        }
        int iB = bmr.b(i);
        jaq jaqVar = new jaq(i, o34Var.e(iF, o34Var.f() - iF));
        al9 al9Var = this.f1122b;
        if (al9Var == null) {
            this.f1122b = new al9();
            bl9VarG = null;
        } else {
            bl9VarG = al9Var.g(iB);
        }
        if (bl9VarG == null) {
            bl9VarG = new bl9();
            this.f1122b.j(iB, bl9VarG);
        }
        bl9VarG.a(jaqVar);
        return true;
    }
}
