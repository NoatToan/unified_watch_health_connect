package n20;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln20/b;", "Landroidx/recyclerview/widget/RecyclerView$o;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f122356a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122357b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f122358c;

    static {
        new a(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        RecyclerView.h adapter;
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        if (childAdapterPosition == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemViewType = adapter.getItemViewType(childAdapterPosition);
        int i14 = this.f122357b;
        if ((i14 != -1 && itemViewType != i14) || childAdapterPosition >= adapter.getItemCount() - 1) {
            rect.setEmpty();
        } else {
            Drawable drawable = this.f122358c;
            rect.set(0, 0, 0, drawable != null ? drawable.getIntrinsicHeight() : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int width;
        int paddingLeft;
        canvas.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount() - 1;
            for (int i14 = 0; i14 < itemCount; i14++) {
                View childAt = recyclerView.getChildAt(i14);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    RecyclerView.h adapter2 = recyclerView.getAdapter();
                    Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(childAdapterPosition)) : null;
                    int i15 = this.f122357b;
                    if (i15 == -1 || (numValueOf != null && numValueOf.intValue() == i15)) {
                        Rect rect = this.f122356a;
                        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                        int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                        Drawable drawable = this.f122358c;
                        int intrinsicHeight = iRound - (drawable != null ? drawable.getIntrinsicHeight() : 0);
                        Drawable drawable2 = this.f122358c;
                        if (drawable2 != null) {
                            drawable2.setBounds(paddingLeft, intrinsicHeight, width, iRound);
                        }
                        Drawable drawable3 = this.f122358c;
                        if (drawable3 != null) {
                            drawable3.draw(canvas);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln20/b$a;", "", "<init>", "()V", "", "INVALID_ITEM_TYPE", "I", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
