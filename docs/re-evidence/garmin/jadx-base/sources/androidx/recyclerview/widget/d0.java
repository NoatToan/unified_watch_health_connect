package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f10437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f10439c;

    private d0(RecyclerView.p pVar) {
        this.f10438b = Integer.MIN_VALUE;
        this.f10439c = new Rect();
        this.f10437a = pVar;
    }

    public static d0 a(RecyclerView.p pVar, int i14) {
        if (i14 == 0) {
            return new b0(pVar);
        }
        if (i14 == 1) {
            return new c0(pVar);
        }
        vb.h.s("invalid orientation");
        return null;
    }

    public abstract int b(View view2);

    public abstract int c(View view2);

    public abstract int d(View view2);

    public abstract int e(View view2);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f10438b) {
            return 0;
        }
        return l() - this.f10438b;
    }

    public abstract int n(View view2);

    public abstract int o(View view2);

    public abstract void p(int i14);

    public /* synthetic */ d0(RecyclerView.p pVar, b0 b0Var) {
        this(pVar);
    }
}
