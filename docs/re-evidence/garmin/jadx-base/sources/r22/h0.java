package r22;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f149665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f149666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f149667d;

    public h0() {
        this.f149664a = 10;
        this.f149667d = 1;
    }

    public abstract void a(int i14, int i15);

    public void b(boolean z14) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i14, int i15, int i16) {
        int i17;
        boolean z14 = false;
        boolean z15 = i16 > 0 && i15 + i14 >= i16;
        if (!this.f149665b && z15 && !this.f149666c && (i17 = this.f149667d) > 1) {
            this.f149666c = true;
            a(i17, this.f149664a);
        }
        int top = (absListView == null || absListView.getChildCount() == 0) ? 0 : absListView.getChildAt(0).getTop();
        if (i14 == 0 && top >= 0) {
            z14 = true;
        }
        b(z14);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i14) {
    }

    public h0(int i14) {
        this.f149667d = 1;
        this.f149664a = i14;
    }
}
