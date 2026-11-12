package ii0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f93759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f93760c;

    public /* synthetic */ y(zc.d dVar, p1 p1Var, int i14) {
        this.f93758a = i14;
        this.f93759b = dVar;
        this.f93760c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f93758a) {
            case 0:
                this.f93760c.setValue(Boolean.TRUE);
                this.f93759b.e();
                break;
            case 1:
                this.f93760c.setValue(Boolean.TRUE);
                this.f93759b.e();
                break;
            case 2:
                this.f93760c.setValue(Boolean.TRUE);
                this.f93759b.e();
                break;
            default:
                this.f93760c.setValue(Boolean.TRUE);
                this.f93759b.e();
                break;
        }
        return Unit.INSTANCE;
    }
}
