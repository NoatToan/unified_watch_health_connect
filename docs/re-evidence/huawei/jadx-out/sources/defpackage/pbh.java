package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.ui.views.CardLinearSnapHelper;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class pbh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MedalInfoDesc> f45122c;
    private float d = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CardLinearSnapHelper f45121a = new CardLinearSnapHelper();

    public void a(RecyclerView recyclerView, final ImageView imageView, final HealthTextView healthTextView, final HealthTextView healthTextView2, List<MedalInfoDesc> list) {
        this.f45122c = list;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: pbh.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                View viewFindSnapView;
                super.onScrollStateChanged(recyclerView2, i);
                pbh.this.f45121a.c(true);
                if (i != 0 || njy.e(pbh.this.f45122c) || recyclerView2.getChildCount() <= 0 || (viewFindSnapView = pbh.this.f45121a.findSnapView(recyclerView2.getLayoutManager())) == null) {
                    return;
                }
                int viewAdapterPosition = ((RecyclerView.LayoutParams) viewFindSnapView.getLayoutParams()).getViewAdapterPosition() % pbh.this.f45122c.size();
                if (njy.c(pbh.this.f45122c, viewAdapterPosition)) {
                    healthTextView.setText(((MedalInfoDesc) pbh.this.f45122c.get(viewAdapterPosition)).acquireText());
                    healthTextView2.setText(pax.r(((MedalInfoDesc) pbh.this.f45122c.get(viewAdapterPosition)).acquireGainTime()));
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                super.onScrolled(recyclerView2, i, i2);
                pbh.this.b(recyclerView2, i, imageView);
            }
        });
        this.f45121a.attachToRecyclerView(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    public void b(RecyclerView recyclerView, int i, ImageView imageView) {
        View view;
        View childAt;
        int childCount = recyclerView.getChildCount();
        View childAt2 = recyclerView.getChildAt(0);
        if (childAt2 == null) {
            LogUtil.j("CardScaleHelper", "onScrollChangeCompute: childView is null");
            return;
        }
        int width = (recyclerView.getWidth() - childAt2.getWidth()) / 2;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt3 = recyclerView.getChildAt(i2);
            if (childAt3 instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt3;
                View childAt4 = linearLayout.getChildAt(0);
                View childAt5 = linearLayout.getChildAt(1);
                if (childAt4 instanceof LinearLayout) {
                    childAt = ((LinearLayout) childAt4).getChildAt(0);
                    if (!(childAt instanceof ImageView)) {
                        childAt = childAt3;
                    }
                } else {
                    childAt = childAt3;
                }
                view = childAt5 instanceof ImageView ? childAt5 : null;
            } else {
                view = null;
                childAt = childAt3;
            }
            if (view != null) {
                d(recyclerView, childAt3, childAt, view, width);
            }
        }
        if (i > 0) {
            this.d += 0.5f;
        } else {
            this.d -= 0.5f;
        }
        imageView.setRotation(this.d);
    }

    private void d(RecyclerView recyclerView, View view, View view2, View view3, int i) {
        if (recyclerView == null || view == null || view2 == null || view3 == null) {
            return;
        }
        if (view.getLeft() <= i) {
            float left = view.getLeft() >= i - view.getWidth() ? ((i - view.getLeft()) * 1.0f) / view.getWidth() : 1.0f;
            float f = 1.0f - (0.4f * left);
            view2.setScaleY(f);
            view2.setScaleX(f);
            view2.setAlpha(f);
            float f2 = 1.0f - left;
            view3.setScaleX(f2);
            view3.setScaleY(f2);
            view3.setAlpha(f2);
            return;
        }
        float width = view.getLeft() <= recyclerView.getWidth() - i ? (((recyclerView.getWidth() - i) - view.getLeft()) * 1.0f) / view.getWidth() : 0.0f;
        float f3 = (0.4f * width) + 0.6f;
        view2.setScaleY(f3);
        view2.setScaleX(f3);
        view2.setAlpha(f3);
        view3.setAlpha(width);
        view3.setScaleX(width);
        view3.setScaleY(width);
    }

    public void c(List<MedalInfoDesc> list, HealthTextView healthTextView, HealthTextView healthTextView2) {
        this.f45122c = list;
        if (njy.e(list)) {
            return;
        }
        healthTextView.setText(this.f45122c.get(0).acquireText());
        healthTextView2.setText(pax.r(this.f45122c.get(0).acquireGainTime()));
    }
}
