package vn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f178958b;

    public /* synthetic */ v(b0 b0Var, int i14) {
        this.f178957a = i14;
        this.f178958b = b0Var;
    }

    @Override // u03.a
    public final void run() {
        int i14 = this.f178957a;
        b0 b0Var = this.f178958b;
        switch (i14) {
            case 0:
                Logger logger = b0.f178864c;
                b0Var.getView().v9(b0Var.f0().getDeviceUnitId(), b0Var.f0().getCid());
                b0Var.getView().hideProgressOverlay();
                break;
            case 1:
                Logger logger2 = b0.f178864c;
                b0Var.getView().v9(b0Var.f0().getDeviceUnitId(), b0Var.f0().getCid());
                b0Var.getView().hideProgressOverlay();
                break;
            default:
                Logger logger3 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().hideProgressOverlay();
                b0Var.getView().V7(wr2.q.b.REMOVED_COMPLETELY, b0Var.f0().getDeviceUnitId(), p13.w.c(b0Var.f0().getDeviceName()));
                break;
        }
    }
}
