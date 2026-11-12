package n12;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln12/b;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "columnCount", "idealItemWidth", "", "isSubscriber", "<init>", "(IIZ)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f122220c;

    public b(int i14, int i15, boolean z14) {
        this.f122218a = i14;
        this.f122219b = i15;
        this.f122220c = z14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        if (!this.f122220c) {
            if (childAdapterPosition == 0) {
                return;
            } else {
                childAdapterPosition--;
            }
        }
        int i14 = this.f122218a;
        int i15 = childAdapterPosition % i14;
        int width = (recyclerView.getWidth() - (this.f122219b * i14)) / (i14 - 1);
        rect.left = (i15 * width) / i14;
        rect.right = width - (((i15 + 1) * width) / i14);
    }

    public /* synthetic */ b(int i14, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? false : z14);
    }
}
