package r22;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class k1 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f149741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149743c;

    public k1(Context context, int i14, boolean z14) {
        this.f149741a = context;
        this.f149742b = i14;
        this.f149743c = z14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            int i14 = ((GridLayoutManager) recyclerView.getLayoutManager()).f10242b;
            GridLayoutManager.b bVar = (GridLayoutManager.b) view2.getLayoutParams();
            int i15 = bVar.f10249a;
            int i16 = bVar.f10250b;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
            int i17 = (int) ((this.f149742b * this.f149741a.getResources().getDisplayMetrics().density) + 0.5f);
            if (this.f149743c) {
                if (i15 == 0) {
                    rect.left = i17;
                } else {
                    rect.left = i17 / 2;
                }
                if (i16 + i15 == i14) {
                    rect.right = i17;
                } else {
                    rect.right = i17 / 2;
                }
            }
            if (childAdapterPosition > i15) {
                rect.top = i17;
            }
        }
    }
}
