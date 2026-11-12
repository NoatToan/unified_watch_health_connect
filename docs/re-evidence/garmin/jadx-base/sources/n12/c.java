package n12;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln12/c;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "columnCount", "viewHolderWidthRes", "<init>", "(II)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122224b;

    public c(int i14, int i15) {
        this.f122223a = i14;
        this.f122224b = i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        int i14 = this.f122223a;
        int i15 = childAdapterPosition % i14;
        int width = (recyclerView.getWidth() - (((int) recyclerView.getContext().getResources().getDimension(this.f122224b)) * i14)) / (i14 - 1);
        rect.left = (i15 * width) / i14;
        rect.right = width - (((i15 + 1) * width) / i14);
    }
}
