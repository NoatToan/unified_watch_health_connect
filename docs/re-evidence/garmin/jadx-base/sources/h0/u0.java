package h0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80579a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f80580b;

    public /* synthetic */ u0(v0 v0Var) {
        this.f80580b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f80579a) {
            case 0:
                v0 v0Var = this.f80580b;
                v0Var.f();
                if (v0Var.d() != null) {
                    v0Var.d().getClass();
                }
                break;
            default:
                v0 v0Var2 = this.f80580b;
                v0Var2.f();
                if (v0Var2.d() != null) {
                    v0Var2.d().getClass();
                }
                break;
        }
    }

    public /* synthetic */ u0(v0 v0Var, Bitmap bitmap) {
        this.f80580b = v0Var;
    }
}
