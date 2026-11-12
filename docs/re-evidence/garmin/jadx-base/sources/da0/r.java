package da0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f58852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f58854d;

    public /* synthetic */ r(int i14, int i15, e23.l lVar, p1 p1Var) {
        this.f58851a = i15;
        this.f58852b = lVar;
        this.f58853c = i14;
        this.f58854d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f58851a) {
            case 0:
                this.f58854d.setValue(Boolean.FALSE);
                this.f58852b.invoke(Integer.valueOf(this.f58853c));
                break;
            case 1:
                this.f58854d.setValue(Boolean.FALSE);
                this.f58852b.invoke(Integer.valueOf(this.f58853c));
                break;
            case 2:
                this.f58854d.setValue(Boolean.FALSE);
                this.f58852b.invoke(Integer.valueOf(this.f58853c));
                break;
            case 3:
                this.f58852b.invoke(Integer.valueOf(this.f58853c));
                yg2.t.b(this.f58854d, false);
                break;
            case 4:
                this.f58852b.invoke(Integer.valueOf(this.f58853c));
                yg2.t.b(this.f58854d, false);
                break;
            default:
                this.f58852b.invoke(Integer.valueOf(this.f58853c));
                yg2.t.b(this.f58854d, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
