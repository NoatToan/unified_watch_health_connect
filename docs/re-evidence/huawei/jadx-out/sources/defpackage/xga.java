package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener;
import com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView;
import com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy;
import com.huawei.uikit.hwscrollbarview.widget.HwScrollbarView;
import huawei.android.widget.HwSafeInsetsShareable;

/* JADX INFO: loaded from: classes20.dex */
public class xga {

    class a implements HwScrollbarView.OnFastScrollListener {
        final /* synthetic */ ScrollView e;

        a(ScrollView scrollView) {
            this.e = scrollView;
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwScrollbarView.OnFastScrollListener
        public void onFastScrollChanged(int i, int i2, float f) {
            this.e.smoothScrollBy(i, i2);
        }
    }

    class b implements HwOverScrollProxy {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsListView f52862b;

        b(AbsListView absListView) {
            this.f52862b = absListView;
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy
        public int getOverScrollOffset() {
            return this.f52862b.getScrollY();
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy
        public boolean isOverScroll() {
            return this.f52862b.getScrollY() != 0;
        }
    }

    class c implements HwOverScrollProxy {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScrollView f52863b;

        c(ScrollView scrollView) {
            this.f52863b = scrollView;
        }

        private int b() {
            View childAt = this.f52863b.getChildAt(0);
            if (childAt == null) {
                return 0;
            }
            int height = childAt.getHeight();
            int height2 = this.f52863b.getHeight();
            return (height - height2) + this.f52863b.getPaddingTop() + this.f52863b.getPaddingBottom();
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy
        public int getOverScrollOffset() {
            int scrollY = this.f52863b.getScrollY();
            if (scrollY <= 0) {
                return scrollY;
            }
            int iB = b();
            if (scrollY > iB) {
                return scrollY - iB;
            }
            return 0;
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy
        public boolean isOverScroll() {
            int iB = b();
            int scrollY = this.f52863b.getScrollY();
            return scrollY > iB || scrollY < 0;
        }
    }

    class d implements HwOverScrollProxy {
        final /* synthetic */ RecyclerView d;

        d(RecyclerView recyclerView) {
            this.d = recyclerView;
        }

        private int b() {
            return (int) this.d.getTranslationY();
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy
        public int getOverScrollOffset() {
            return -b();
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwOverScrollProxy
        public boolean isOverScroll() {
            return b() != 0;
        }
    }

    class e implements HwScrollbarView.OnFastScrollListener {
        final /* synthetic */ RecyclerView d;

        e(RecyclerView recyclerView) {
            this.d = recyclerView;
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwScrollbarView.OnFastScrollListener
        public void onFastScrollChanged(int i, int i2, float f) {
            if (Math.abs(i2) < xga.a(this.d)) {
                this.d.scrollBy(i, i2);
            } else {
                xga.b(this.d, i, i2, f);
            }
        }
    }

    class h implements HwOnOverScrollListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HwScrollbarView f52864b;

        h(HwScrollbarView hwScrollbarView) {
            this.f52864b = hwScrollbarView;
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener
        public void onOverScrollEnd() {
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener
        public void onOverScrollStart() {
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener
        public void onOverScrolled(float f) {
            this.f52864b.onScrollChanged();
        }
    }

    class i implements HwScrollbarView.OnFastScrollListener {
        final /* synthetic */ AbsListView d;

        i(AbsListView absListView) {
            this.d = absListView;
        }

        @Override // com.huawei.uikit.hwscrollbarview.widget.HwScrollbarView.OnFastScrollListener
        public void onFastScrollChanged(int i, int i2, float f) {
            xga.a(this.d, i, i2, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AbsListView absListView, int i2, int i3, float f) {
        Adapter adapter;
        if (Float.compare(f, 0.0f) == 0) {
            absListView.setSelection(0);
            return;
        }
        if (Float.compare(f, 1.0f) != 0 || (adapter = absListView.getAdapter()) == null || adapter.getCount() <= 0) {
            if (Math.abs(i3) < a(absListView)) {
                absListView.scrollListBy(i3);
                return;
            } else {
                e(absListView, i2, i3, f);
                return;
            }
        }
        View childAt = absListView.getChildAt(absListView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int height = ((absListView.getHeight() - absListView.getPaddingTop()) - absListView.getPaddingBottom()) - childAt.getHeight();
        int count = adapter.getCount() - 1;
        if (height >= 0) {
            absListView.setSelection(count);
        } else {
            d(absListView, count, height);
        }
    }

    public static boolean b(AbsListView absListView, HwScrollbarView hwScrollbarView) {
        return d(absListView, hwScrollbarView, true);
    }

    public static boolean d(RecyclerView recyclerView, HwScrollbarView hwScrollbarView) {
        return a(recyclerView, hwScrollbarView, true);
    }

    private static void e(AbsListView absListView, int i2, int i3, float f) {
        int i4;
        int count;
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        int lastVisiblePosition = absListView.getLastVisiblePosition();
        int height = absListView.getHeight();
        int paddingTop = absListView.getPaddingTop();
        int paddingBottom = absListView.getPaddingBottom();
        if (lastVisiblePosition > firstVisiblePosition && (i4 = ((height - paddingTop) - paddingBottom) / (lastVisiblePosition - firstVisiblePosition)) > 0) {
            int i5 = firstVisiblePosition + (i3 / i4);
            int i6 = i3 % i4;
            if (i5 <= 0) {
                i5 = 0;
                i6 = 0;
            } else {
                ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
                if (listAdapter != null && i5 > (count = listAdapter.getCount() - 1)) {
                    i5 = count;
                }
            }
            d(absListView, i5, i6);
        }
    }

    public static boolean e(ScrollView scrollView, HwScrollbarView hwScrollbarView) {
        return d(scrollView, hwScrollbarView, true);
    }

    public static boolean a(RecyclerView recyclerView, HwScrollbarView hwScrollbarView, boolean z) {
        if (!a(recyclerView, hwScrollbarView)) {
            return false;
        }
        HwScrollbarView.getHwScrollBindImpl().bindRecyclerView(recyclerView, hwScrollbarView, z);
        hwScrollbarView.setOnFastScrollListener(new e(recyclerView));
        hwScrollbarView.setHwOverScrollProxy(new d(recyclerView));
        if (recyclerView instanceof HwRecyclerView) {
            ((HwRecyclerView) recyclerView).e(new h(hwScrollbarView));
        }
        d((View) recyclerView, hwScrollbarView);
        return true;
    }

    public static boolean d(AbsListView absListView, HwScrollbarView hwScrollbarView, boolean z) {
        if (!a(absListView, hwScrollbarView)) {
            return false;
        }
        HwScrollbarView.getHwScrollBindImpl().bindListView(absListView, hwScrollbarView, z);
        hwScrollbarView.setOnFastScrollListener(new i(absListView));
        hwScrollbarView.setHwOverScrollProxy(new b(absListView));
        d(absListView, hwScrollbarView);
        return true;
    }

    public static boolean d(ScrollView scrollView, HwScrollbarView hwScrollbarView, boolean z) {
        if (!a(scrollView, hwScrollbarView)) {
            return false;
        }
        HwScrollbarView.getHwScrollBindImpl().bindScrollView(scrollView, hwScrollbarView, z);
        hwScrollbarView.setOnFastScrollListener(new a(scrollView));
        hwScrollbarView.setHwOverScrollProxy(new c(scrollView));
        d(scrollView, hwScrollbarView);
        return true;
    }

    private static void d(AbsListView absListView, int i2, int i3) {
        absListView.setSelectionFromTop(i2, i3);
    }

    private static boolean a(View view, HwScrollbarView hwScrollbarView) {
        return (view == null || hwScrollbarView == null || hwScrollbarView.getScrollableView() != null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        View rootView = view.getRootView();
        return rootView != null ? rootView.getMeasuredHeight() : measuredHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(RecyclerView recyclerView, int i2, int i3, float f) {
        int itemCount;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || layoutManager.getItemCount() <= 0 || (itemCount = layoutManager.getItemCount() - layoutManager.getChildCount()) < 0) {
            return;
        }
        int itemCount2 = (int) (f * itemCount);
        if (i3 > 0 && (itemCount2 = itemCount2 + (layoutManager.getItemCount() - itemCount)) >= layoutManager.getItemCount()) {
            itemCount2 = layoutManager.getItemCount() - 1;
        }
        recyclerView.scrollToPosition(itemCount2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void d(View view, HwScrollbarView hwScrollbarView) {
        if (Build.VERSION.SDK_INT < 28 || !(view instanceof HwSafeInsetsShareable)) {
            return;
        }
        ((HwSafeInsetsShareable) view).addSharedView(hwScrollbarView, 1);
    }
}
