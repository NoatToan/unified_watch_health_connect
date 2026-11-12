package ii0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f93560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f93561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f93562d;

    public /* synthetic */ b0(zc.d dVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f93559a = i14;
        this.f93560b = dVar;
        this.f93561c = p1Var;
        this.f93562d = p1Var2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f93559a) {
            case 0:
                Boolean bool = Boolean.TRUE;
                this.f93561c.setValue(bool);
                this.f93562d.setValue(bool);
                this.f93560b.e();
                break;
            default:
                Boolean bool2 = Boolean.TRUE;
                this.f93561c.setValue(bool2);
                this.f93560b.e();
                this.f93562d.setValue(bool2);
                break;
        }
        return Unit.INSTANCE;
    }
}
