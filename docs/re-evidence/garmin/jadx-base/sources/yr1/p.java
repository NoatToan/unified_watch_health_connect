package yr1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f199121b;

    public /* synthetic */ p(q qVar, int i14) {
        this.f199120a = i14;
        this.f199121b = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f199120a) {
            case 0:
                return this.f199121b.f199125e.e();
            default:
                this.f199121b.e();
                return Unit.INSTANCE;
        }
    }
}
