package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f2965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f2966b;
    public final RecyclerView.s c = new a();

    public class a extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2967a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f2967a) {
                this.f2967a = false;
                x.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2967a = true;
        }
    }

    public class b extends n {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.n, androidx.recyclerview.widget.RecyclerView.y
        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            x xVar = x.this;
            RecyclerView recyclerView = xVar.f2965a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrC = xVar.c(recyclerView.getLayoutManager(), view);
            int i = iArrC[0];
            int i2 = iArrC[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.f2965a.getLayoutManager();
        if (layoutManager == null || this.f2965a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2965a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && k(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f2965a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f2965a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f2966b = new Scroller(this.f2965a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] d(int i, int i2) {
        this.f2966b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f2966b.getFinalX(), this.f2966b.getFinalY()};
    }

    public RecyclerView.y e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @Deprecated
    public n f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new b(this.f2965a.getContext());
        }
        return null;
    }

    public final void g() {
        this.f2965a.removeOnScrollListener(this.c);
        this.f2965a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View h(RecyclerView.o oVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int i(RecyclerView.o oVar, int i, int i2);

    public final void j() throws IllegalStateException {
        if (this.f2965a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f2965a.addOnScrollListener(this.c);
        this.f2965a.setOnFlingListener(this);
    }

    public final boolean k(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.y yVarE;
        int i3;
        if (!(oVar instanceof RecyclerView.y.b) || (yVarE = e(oVar)) == null || (i3 = i(oVar, i, i2)) == -1) {
            return false;
        }
        yVarE.setTargetPosition(i3);
        oVar.startSmoothScroll(yVarE);
        return true;
    }

    public void l() {
        RecyclerView.o layoutManager;
        View viewH;
        RecyclerView recyclerView = this.f2965a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewH = h(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewH);
        int i = iArrC[0];
        if (i == 0 && iArrC[1] == 0) {
            return;
        }
        this.f2965a.smoothScrollBy(i, iArrC[1]);
    }
}
