package vn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s0 implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f178948b;

    public /* synthetic */ s0(v0 v0Var, int i14) {
        this.f178947a = i14;
        this.f178948b = v0Var;
    }

    @Override // u03.a
    public final void run() {
        int i14 = this.f178947a;
        v0 v0Var = this.f178948b;
        switch (i14) {
            case 0:
                v0.f178959c.error("It should not happened, server should return user's info");
                v0Var.getView().D1(0);
                break;
            default:
                Logger logger = v0.f178959c;
                v0Var.getView().u9();
                break;
        }
    }
}
