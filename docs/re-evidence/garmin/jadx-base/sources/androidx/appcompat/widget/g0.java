package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f5115a;

    public g0(i0 i0Var) {
        this.f5115a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.f5115a;
        View view2 = i0Var.f5146o;
        if (view2 == null || view2.getWindowToken() == null) {
            return;
        }
        i0Var.show();
    }
}
