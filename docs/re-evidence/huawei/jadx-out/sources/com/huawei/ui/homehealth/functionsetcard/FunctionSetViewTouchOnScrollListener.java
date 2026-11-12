package com.huawei.ui.homehealth.functionsetcard;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.functionsetcard.FunctionSetPagerSnapHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;

/* JADX INFO: loaded from: classes43.dex */
public class FunctionSetViewTouchOnScrollListener extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f25447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FunctionSetPagerSnapHelper f25448c;
    private boolean d;
    private Context e;
    private int f;
    private ImageView h;
    private ImageView i;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (recyclerView == null) {
            LogUtil.j("FunctionSetViewTouchOnScrollListener", "recyclerView is null");
            return;
        }
        if (i == 0) {
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            LogUtil.a("FunctionSetViewTouchOnScrollListener", "FirstVisibleItemPosition: ", Integer.valueOf(iFindFirstVisibleItemPosition), ", findLastVisibleItemPosition", Integer.valueOf(iFindLastVisibleItemPosition));
            e(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
            return;
        }
        if (i != 1) {
            LogUtil.a("FunctionSetViewTouchOnScrollListener", "newState : ", Integer.valueOf(i));
            return;
        }
        int iFindFirstVisibleItemPosition2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
        LogUtil.a("FunctionSetViewTouchOnScrollListener", "FirstVisibleItemPosition: ", Integer.valueOf(iFindFirstVisibleItemPosition2), ", findLastVisibleItemPosition", Integer.valueOf(iFindLastVisibleItemPosition2));
        this.f25448c.b(iFindFirstVisibleItemPosition2);
        this.f25448c.e(iFindLastVisibleItemPosition2);
    }

    private void e(int i, int i2) {
        float f = this.e.getResources().getDisplayMetrics().density;
        LogUtil.a("FunctionSetViewTouchOnScrollListener", "start: ", Integer.valueOf(i), ", end:", Integer.valueOf(i2), ", istSize:", Integer.valueOf(this.f), ", mIsNavigationGone", Boolean.valueOf(this.f25446a));
        if (this.f25446a) {
            return;
        }
        if (this.d) {
            if (i == 0 && i2 <= i + 3) {
                d(f);
                return;
            } else if (this.f - 1 == i2 && i >= i2 - 3) {
                c(f);
                return;
            } else {
                b(f);
                return;
            }
        }
        if (i == 0 && i2 <= i + 3) {
            int i3 = (int) (((double) (6.0f * f)) + 0.5d);
            this.f25447b.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
            this.f25447b.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_selecet));
            int i4 = (int) (((double) (4.0f * f)) + 0.5d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            layoutParams.setMarginStart((int) (((double) (f * 8.0f)) + 0.5d));
            this.h.setLayoutParams(layoutParams);
            this.h.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
            return;
        }
        if (this.f - 1 != i2 || i < i2 - 3) {
            LogUtil.a("FunctionSetViewTouchOnScrollListener", "wrong red dot");
            return;
        }
        int i5 = (int) (((double) (4.0f * f)) + 0.5d);
        this.f25447b.setLayoutParams(new LinearLayout.LayoutParams(i5, i5));
        this.f25447b.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
        int i6 = (int) (((double) (6.0f * f)) + 0.5d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
        layoutParams2.setMarginStart((int) (((double) (f * 8.0f)) + 0.5d));
        this.h.setLayoutParams(layoutParams2);
        this.h.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_selecet));
    }

    private void d(float f) {
        int i = (int) (((double) (6.0f * f)) + 0.5d);
        this.f25447b.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        this.f25447b.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_selecet));
        int i2 = (int) (((double) (4.0f * f)) + 0.5d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        int i3 = (int) (((double) (f * 8.0f)) + 0.5d);
        layoutParams.setMarginStart(i3);
        this.i.setLayoutParams(layoutParams);
        this.i.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams2.setMarginStart(i3);
        this.h.setLayoutParams(layoutParams2);
        this.h.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
    }

    private void c(float f) {
        int i = (int) (((double) (4.0f * f)) + 0.5d);
        this.f25447b.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        this.f25447b.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        int i2 = (int) (((double) (8.0f * f)) + 0.5d);
        layoutParams.setMarginStart(i2);
        this.i.setLayoutParams(layoutParams);
        this.i.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
        int i3 = (int) (((double) (f * 6.0f)) + 0.5d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
        layoutParams2.setMarginStart(i2);
        this.h.setLayoutParams(layoutParams2);
        this.h.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_selecet));
    }

    private void b(float f) {
        int i = (int) (((double) (4.0f * f)) + 0.5d);
        this.f25447b.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        this.f25447b.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
        int i2 = (int) (((double) (6.0f * f)) + 0.5d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        int i3 = (int) (((double) (f * 8.0f)) + 0.5d);
        layoutParams.setMarginStart(i3);
        this.i.setLayoutParams(layoutParams);
        this.i.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_selecet));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.setMarginStart(i3);
        this.h.setLayoutParams(layoutParams2);
        this.h.setBackground(this.e.getResources().getDrawable(R.drawable.ic_page_unselecet));
    }
}
