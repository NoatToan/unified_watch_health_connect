package n20;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln20/a;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "verticalSpaceHeight", "<init>", "(I)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122355a;

    public a(int i14) {
        this.f122355a = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        if (childAdapterPosition > -1) {
            int i14 = childAdapterPosition + 1;
            RecyclerView.h adapter = recyclerView.getAdapter();
            if (i14 < (adapter != null ? adapter.getItemCount() : -1)) {
                RecyclerView.h adapter2 = recyclerView.getAdapter();
                Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(childAdapterPosition)) : null;
                RecyclerView.h adapter3 = recyclerView.getAdapter();
                if (s.g(numValueOf, adapter3 != null ? Integer.valueOf(adapter3.getItemViewType(i14)) : null)) {
                    return;
                }
                int i15 = this.f122355a;
                rect.bottom = i15;
                rect.top = i15;
            }
        }
    }
}
