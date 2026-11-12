package vn2;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f178937b;

    public /* synthetic */ r(s sVar, int i14) {
        this.f178936a = i14;
        this.f178937b = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f178936a) {
            case 0:
                return s.U1(this.f178937b);
            case 1:
                return s.H1(this.f178937b);
            case 2:
                return s.S1(this.f178937b);
            case 3:
                return s.x1(this.f178937b);
            case 4:
                return s.O1(this.f178937b);
            default:
                return s.P1(this.f178937b);
        }
    }
}
