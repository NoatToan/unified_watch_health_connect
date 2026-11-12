package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public class xdu {
    public static int c(View view, boolean z) {
        if (view instanceof ScrollView) {
            return e((ScrollView) view, z);
        }
        if (view instanceof ListView) {
            ListView listView = (ListView) view;
            if (listView.getChildCount() > 0) {
                return c(listView, z);
            }
        }
        if (!(view instanceof RecyclerView)) {
            return 0;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getChildCount() > 0) {
            return b(recyclerView, z);
        }
        return 0;
    }

    private static int e(ScrollView scrollView, boolean z) {
        if (z) {
            return scrollView.getScrollY();
        }
        View childAt = scrollView.getChildAt(0);
        if (childAt != null) {
            return childAt.getBottom() - (scrollView.getHeight() + scrollView.getScrollY());
        }
        Log.w("HwScrollableUtil", "scrollViewScrollPosition: Child view at index 0 is null!");
        return 0;
    }

    private static int c(ListView listView, boolean z) {
        if (listView.getAdapter() == null) {
            return 0;
        }
        if (z) {
            View childAt = listView.getChildAt(0);
            if (childAt == null) {
                Log.w("HwScrollableUtil", "scrollViewScrollPosition: Child view at index 0 is null!");
                return 0;
            }
            return (listView.getFirstVisiblePosition() * childAt.getHeight()) - childAt.getTop();
        }
        View childAt2 = listView.getChildAt(listView.getChildCount() - 1);
        if (childAt2 == null) {
            Log.w("HwScrollableUtil", "scrollViewScrollPosition: Child view at final index is null!");
            return 0;
        }
        return ((((listView.getAdapter().getCount() - listView.getLastVisiblePosition()) - 1) * childAt2.getHeight()) + childAt2.getBottom()) - listView.getBottom();
    }

    private static int b(RecyclerView recyclerView, boolean z) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (recyclerView.getAdapter() == null || layoutManager == null || layoutManager.getChildCount() == 0) {
            return 0;
        }
        if (recyclerView.getTranslationY() < 0.0f) {
            return 1;
        }
        View childAt = layoutManager.getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        int position = layoutManager.getPosition(childAt);
        if (z) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int decoratedTop = layoutManager.getDecoratedTop(childAt);
            if (position == 0 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin - decoratedTop;
            }
            if (position == 0) {
                return -decoratedTop;
            }
            if (position > 0) {
                return 1;
            }
            Log.w("HwScrollableUtil", "recyclerViewScrollPosition: childPosition is: " + position);
            return 0;
        }
        View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        if (childAt2 == null) {
            Log.w("HwScrollableUtil", "recyclerViewScrollPosition: Child view at final index is null!");
            return 0;
        }
        return (((recyclerView.getAdapter().getItemCount() - 1) * layoutManager.getDecoratedMeasuredHeight(childAt2)) + layoutManager.getDecoratedBottom(childAt2)) - recyclerView.getBottom();
    }
}
