package m0;

import b0.l0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements l0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115496b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f115495a = i14;
        this.f115496b = obj;
    }

    @Override // b0.l0.k
    public final void a() {
        switch (this.f115495a) {
            case 0:
                h hVar = (h) this.f115496b;
                synchronized (hVar.f115499b) {
                    hVar.c();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                ((androidx.concurrent.futures.b.a) this.f115496b).b(null);
                return;
        }
    }
}
