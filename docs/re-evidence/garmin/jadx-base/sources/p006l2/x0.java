package p006l2;

import e23.l;
import f5.c0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.c2;
import s5.c;
import s5.w0;
import x5.l0;
import x5.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f108872b;

    public /* synthetic */ x0(b2 b2Var, int i14) {
        this.f108871a = i14;
        this.f108872b = b2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f108871a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f108872b.f108407q.setValue(bool);
                return Unit.INSTANCE;
            case 1:
                c0 c0Var = (c0) obj;
                i3 i3VarD = this.f108872b.d();
                if (i3VarD != null) {
                    i3VarD.f108577c = c0Var;
                }
                return Unit.INSTANCE;
            case 2:
                b2 b2Var = this.f108872b;
                c2 c2Var = b2Var.f108410t;
                l0 l0Var = (l0) obj;
                String str = l0Var.f188878a.f157138b;
                c cVar = b2Var.f108400j;
                if (!s.g(str, cVar != null ? cVar.f157138b : null)) {
                    b2Var.f108401k.setValue(m1.None);
                    if (((Boolean) c2Var.getF182175a()).booleanValue()) {
                        c2Var.setValue(Boolean.FALSE);
                    } else {
                        b2Var.f108409s.setValue(Boolean.FALSE);
                    }
                }
                w0.f157315b.getClass();
                long j8 = w0.f157316c;
                b2Var.A.setValue(w0.a(j8));
                b2Var.B.setValue(w0.a(j8));
                b2Var.f108411u.invoke(l0Var);
                b2Var.f108392b.invalidate();
                return Unit.INSTANCE;
            case 3:
                this.f108872b.f108408r.b(((p) obj).f188927a);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(this.f108872b.f108408r.b(((p) obj).f188927a));
        }
    }
}
