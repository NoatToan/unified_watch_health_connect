package zb0;

import android.os.Handler;

/* JADX INFO: loaded from: classes8.dex */
public class r implements xt2.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f203621a;

    public r(o oVar) {
        this.f203621a = oVar;
    }

    @Override // xt2.a.d
    public final void c(rs2.c cVar) {
        Handler handler = this.f203621a.f203590l;
        if (handler != null) {
            handler.post(new q(this, 0));
        }
    }

    @Override // xt2.a.d
    public final void d(rs2.c cVar) {
        Handler handler = this.f203621a.f203590l;
        if (handler != null) {
            handler.post(new q(this, 1));
        }
    }
}
