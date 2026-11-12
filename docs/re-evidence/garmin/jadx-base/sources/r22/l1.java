package r22;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr22/l1;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l1 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f149749a;

    public l1(Context context) {
        context.getClass();
        this.f149749a = a7.b.getDrawable(context, R.drawable.gcm3_default_list_item_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        canvas.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = recyclerView.getChildAt(i14);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int top = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) layoutParams)).topMargin) + ((int) (childAt.getTranslationY() + 0.5f));
            Drawable drawable = this.f149749a;
            drawable.getClass();
            drawable.setBounds(paddingLeft, top, width, drawable.getIntrinsicHeight() + top);
            drawable.draw(canvas);
        }
    }
}
