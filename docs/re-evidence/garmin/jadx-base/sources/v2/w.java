package v2;

import kotlin.m3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f175188b;

    public /* synthetic */ w(y yVar, int i14) {
        this.f175187a = i14;
        this.f175188b = yVar;
    }

    @Override // e23.a
    public final Object invoke() {
        m3 m3Var;
        switch (this.f175187a) {
            case 0:
                h5.k.d(this.f175188b);
                return Unit.INSTANCE;
            case 1:
                this.f175188b.f175261j.n(true);
                return Boolean.TRUE;
            case 2:
                this.f175188b.f175261j.j(true);
                return Boolean.TRUE;
            case 3:
                this.f175188b.f175261j.l();
                return Boolean.TRUE;
            case 4:
                h5.k.d(this.f175188b);
                return Unit.INSTANCE;
            case 5:
                this.f175188b.f175261j.w();
                return Boolean.TRUE;
            case 6:
                y yVar = this.f175188b;
                yVar.f175256e.f108413w.invoke(x5.p.a(yVar.f175262k.f188936e));
                return Boolean.TRUE;
            default:
                y yVar2 = this.f175188b;
                p006l2.b2 b2Var = yVar2.f175256e;
                m4.b0 b0Var = yVar2.f175263l;
                boolean z14 = yVar2.f175257f;
                if (!b2Var.b()) {
                    m4.b0.a(b0Var);
                } else if (!z14 && (m3Var = b2Var.f108393c) != null) {
                    m3Var.show();
                }
                return Boolean.TRUE;
        }
    }
}
