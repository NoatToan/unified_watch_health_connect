package to1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lto1/a;", "Landroidx/recyclerview/widget/RecyclerView$o;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.o {
    static {
        new C3118a(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        RecyclerView.h adapter = recyclerView.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        int width = (int) (((double) recyclerView.getWidth()) * 0.03d);
        if (childAdapterPosition == 0 || childAdapterPosition == 1) {
            rect.left = width;
            return;
        }
        int i14 = childAdapterPosition + 1;
        if (numValueOf == null || i14 != numValueOf.intValue()) {
            if (childAdapterPosition % 2 != 0) {
                return;
            }
            int i15 = childAdapterPosition + 2;
            if (numValueOf == null || i15 != numValueOf.intValue()) {
                return;
            }
        }
        rect.right = width;
    }

    /* JADX INFO: renamed from: to1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lto1/a$a;", "", "<init>", "()V", "", "HORIZONTAL_MARGIN_PERCENTAGE", "D", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3118a {
        public /* synthetic */ C3118a(j jVar) {
            this();
        }

        private C3118a() {
        }
    }
}
