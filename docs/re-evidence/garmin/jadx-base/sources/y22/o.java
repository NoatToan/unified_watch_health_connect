package y22;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f194269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f194270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f194271d;

    public /* synthetic */ o(j jVar, w wVar, p1 p1Var, int i14) {
        this.f194268a = i14;
        this.f194269b = jVar;
        this.f194270c = wVar;
        this.f194271d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f194268a) {
            case 0:
                this.f194269b.n4(this.f194270c);
                this.f194271d.setValue(null);
                break;
            default:
                this.f194269b.n4(this.f194270c);
                this.f194271d.setValue(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
