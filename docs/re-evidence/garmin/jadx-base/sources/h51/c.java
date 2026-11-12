package h51;

import e23.l;
import p005kotlin.Unit;
import p3.o1;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82079a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f82080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f82081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f82082d;

    public /* synthetic */ c(l lVar, o1 o1Var, p1 p1Var) {
        this.f82081c = lVar;
        this.f82082d = o1Var;
        this.f82080b = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f82079a) {
            case 0:
                this.f82081c.invoke(Long.valueOf(this.f82082d.j()));
                this.f82080b.setValue(Boolean.FALSE);
                break;
            default:
                this.f82080b.setValue(Boolean.FALSE);
                this.f82081c.invoke(this.f82082d.getF182175a());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(p1 p1Var, l lVar, o1 o1Var) {
        this.f82080b = p1Var;
        this.f82081c = lVar;
        this.f82082d = o1Var;
    }
}
