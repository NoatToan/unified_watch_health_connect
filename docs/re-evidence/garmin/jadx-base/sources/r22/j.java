package r22;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class j extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f149695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149696b;

    public j(Context context, int i14) {
        this.f149695a = a7.b.getDrawable(context, R.drawable.gcm3_default_list_item_divider);
        this.f149696b = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            int bottom = recyclerView.getChildAt(i14).getBottom();
            Drawable drawable = this.f149695a;
            int intrinsicHeight = drawable.getIntrinsicHeight() + bottom;
            if (i14 == childCount - 1) {
                drawable.setBounds(paddingLeft, bottom, width, intrinsicHeight);
            } else {
                drawable.setBounds(this.f149696b, bottom, width, intrinsicHeight);
            }
            drawable.draw(canvas);
        }
    }
}
