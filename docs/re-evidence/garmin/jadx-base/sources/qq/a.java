package qq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqq/a;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "borderColor", "borderThickness", "padding", "<init>", "(Landroid/content/Context;III)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f146038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146040c;

    public a(Context context, int i14, int i15, int i16) {
        context.getClass();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a7.b.getColor(context, i14));
        this.f146038a = paint;
        this.f146039b = (int) context.getResources().getDimension(i15);
        this.f146040c = (int) context.getResources().getDimension(i16);
    }

    public static boolean e(View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.getClass();
        int viewAdapterPosition = ((RecyclerView.q) layoutParams).getViewAdapterPosition();
        int i14 = viewAdapterPosition + 1;
        if (b0Var.f10291g) {
            return false;
        }
        if (i14 < b0Var.b()) {
            return i14 >= 0 && i14 < adapter.getItemCount() && adapter.getItemViewType(i14) == -1 && viewAdapterPosition >= 0 && viewAdapterPosition < b0Var.b() && adapter.getItemViewType(viewAdapterPosition) != -1;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        if (e(view2, recyclerView, b0Var)) {
            rect.set(0, 0, 0, this.f146040c);
        } else {
            rect.setEmpty();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Canvas canvas2;
        canvas.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int childCount = recyclerView.getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = recyclerView.getChildAt(i14);
            childAt.getClass();
            if (e(childAt, recyclerView, b0Var)) {
                canvas2 = canvas;
                canvas2.drawRect(childAt.getLeft(), childAt.getBottom(), childAt.getRight(), childAt.getBottom() + this.f146039b, this.f146038a);
            } else {
                canvas2 = canvas;
            }
            i14++;
            canvas = canvas2;
        }
    }
}
