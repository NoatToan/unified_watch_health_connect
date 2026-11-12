package e11;

import l72.i3;
import p005kotlin.Unit;
import p006l2.y1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f61945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f61946c;

    public /* synthetic */ s(m4.q qVar, e23.a aVar, int i14) {
        this.f61944a = i14;
        this.f61945b = qVar;
        this.f61946c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f61944a) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "SAVE")) {
                    this.f61945b.y(false);
                    this.f61946c.invoke();
                }
                break;
            default:
                ((y1) obj).getClass();
                this.f61945b.y(false);
                this.f61946c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
