package r22;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i0 extends RecyclerView.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f149676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f149679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f149680e;

    public i0(RecyclerView.p pVar, int i14) {
        this.f149677b = 1;
        this.f149676a = pVar;
        this.f149678c = i14;
    }

    public void a(int i14) {
    }

    public abstract void b(int i14, int i15);

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i14) {
        int iFindFirstVisibleItemPosition;
        super.onScrollStateChanged(recyclerView, i14);
        RecyclerView.p pVar = this.f149676a;
        if (pVar != null) {
            if (pVar instanceof LinearLayoutManager) {
                iFindFirstVisibleItemPosition = ((LinearLayoutManager) pVar).findFirstVisibleItemPosition();
            } else if (pVar instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) pVar;
                int i15 = staggeredGridLayoutManager.f10347a;
                int[] iArr = new int[i15];
                for (int i16 = 0; i16 < staggeredGridLayoutManager.f10347a; i16++) {
                    StaggeredGridLayoutManager.f fVar = staggeredGridLayoutManager.f10348b[i16];
                    boolean z14 = StaggeredGridLayoutManager.this.f10354h;
                    ArrayList<View> arrayList = fVar.f10394a;
                    iArr[i16] = z14 ? fVar.e(arrayList.size() - 1, -1, true, true, false) : fVar.e(0, arrayList.size(), true, true, false);
                }
                iFindFirstVisibleItemPosition = iArr[0];
                for (int i17 = 1; i17 < i15; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > iFindFirstVisibleItemPosition) {
                        iFindFirstVisibleItemPosition = i18;
                    }
                }
            } else {
                iFindFirstVisibleItemPosition = 0;
            }
            int childCount = pVar.getChildCount();
            int itemCount = pVar.getItemCount();
            if (this.f149679d || iFindFirstVisibleItemPosition + childCount < itemCount) {
                return;
            }
            if ((iFindFirstVisibleItemPosition == 0 && childCount == 0) || this.f149680e) {
                return;
            }
            this.f149680e = true;
            b(this.f149677b, this.f149678c);
        }
    }

    public i0(RecyclerView.p pVar) {
        this(pVar, 10);
    }
}
