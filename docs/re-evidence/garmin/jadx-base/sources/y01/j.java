package y01;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f193010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b11.l f193011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f193012d;

    public /* synthetic */ j(e23.l lVar, b11.l lVar2, p1 p1Var, int i14) {
        this.f193009a = i14;
        this.f193010b = lVar;
        this.f193011c = lVar2;
        this.f193012d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f193009a) {
            case 0:
                this.f193012d.setValue(Boolean.FALSE);
                this.f193010b.invoke(this.f193011c);
                break;
            default:
                this.f193012d.setValue(Boolean.FALSE);
                this.f193010b.invoke(this.f193011c);
                break;
        }
        return Unit.INSTANCE;
    }
}
