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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqq/b;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "borderColor", "borderThickness", "padding", "<init>", "(Landroid/content/Context;III)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f146041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146043c;

    public b(Context context, int i14, int i15, int i16) {
        context.getClass();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a7.b.getColor(context, i14));
        this.f146041a = paint;
        this.f146042b = (int) context.getResources().getDimension(i15);
        this.f146043c = (int) context.getResources().getDimension(i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        rect.set(this.f146043c, 0, 0, 0);
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
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int viewAdapterPosition = ((RecyclerView.q) layoutParams).getViewAdapterPosition();
            if (viewAdapterPosition < 0 || viewAdapterPosition >= b0Var.b()) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(childAt.getLeft(), childAt.getTop(), childAt.getLeft() + this.f146042b, childAt.getBottom(), this.f146041a);
            }
            i14++;
            canvas = canvas2;
        }
    }
}
