package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f5194b;

    public o0(p0 p0Var, View view2) {
        this.f5194b = p0Var;
        this.f5193a = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view2 = this.f5193a;
        int left = view2.getLeft();
        p0 p0Var = this.f5194b;
        p0Var.smoothScrollTo(left - ((p0Var.getWidth() - view2.getWidth()) / 2), 0);
        p0Var.f5195a = null;
    }
}
