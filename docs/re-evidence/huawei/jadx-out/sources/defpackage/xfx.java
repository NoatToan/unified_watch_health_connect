package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwscrollbarview.widget.HwScrollbarView;

/* JADX INFO: loaded from: classes20.dex */
public class xfx extends xfy {

    class a implements View.OnScrollChangeListener {
        final /* synthetic */ HwScrollbarView e;

        a(HwScrollbarView hwScrollbarView) {
            this.e = hwScrollbarView;
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            this.e.onScrollChanged();
        }
    }

    private void e(View view, HwScrollbarView hwScrollbarView, boolean z) {
        if (view == null || hwScrollbarView == null) {
            return;
        }
        hwScrollbarView.setScrollableView(view, z);
        view.setOnScrollChangeListener(new a(hwScrollbarView));
    }

    @Override // defpackage.xfy, com.huawei.uikit.hwscrollbarview.widget.HwScrollBind
    public void bindListView(AbsListView absListView, HwScrollbarView hwScrollbarView, boolean z) {
        e(absListView, hwScrollbarView, z);
    }

    @Override // defpackage.xfy, com.huawei.uikit.hwscrollbarview.widget.HwScrollBind
    public void bindRecyclerView(RecyclerView recyclerView, HwScrollbarView hwScrollbarView, boolean z) {
        e(recyclerView, hwScrollbarView, z);
    }

    @Override // defpackage.xfy, com.huawei.uikit.hwscrollbarview.widget.HwScrollBind
    public void bindScrollView(ScrollView scrollView, HwScrollbarView hwScrollbarView, boolean z) {
        e(scrollView, hwScrollbarView, z);
    }
}
