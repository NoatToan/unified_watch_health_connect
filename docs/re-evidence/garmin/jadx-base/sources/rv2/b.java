package rv2;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f154763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f154764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f154765c;

    public b(a aVar, RecyclerView recyclerView, int i14) {
        this.f154763a = aVar;
        this.f154764b = recyclerView;
        this.f154765c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f154763a;
        aVar.f154757f.setSmoothScrollingEnabled(true);
        NestedScrollView nestedScrollView = aVar.f154757f;
        nestedScrollView.p(0 - nestedScrollView.getScrollX(), ((int) this.f154764b.getChildAt(this.f154765c).getY()) - nestedScrollView.getScrollY(), 500, false);
    }
}
