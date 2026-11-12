package com.huawei.uikit.hwrecyclerview.layoutmanager;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationHelper;
import com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView;

/* JADX INFO: loaded from: classes44.dex */
public class HwFloatingBubbleChainAnimationHelper extends HwChainAnimationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwRecyclerView f29548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwFloatingBubblesLayoutManager f29549c;
    private int d;
    private boolean e;
    private boolean i;

    private void c(int i) {
        HwFloatingBubblesLayoutManager hwFloatingBubblesLayoutManager = this.f29549c;
        if (hwFloatingBubblesLayoutManager != null) {
            boolean zB = b();
            if (b()) {
                i = 0;
            }
            hwFloatingBubblesLayoutManager.d(zB, i);
            this.f29549c.e(false);
            this.f29549c.e();
        }
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationHelper
    public void c() {
        super.c();
        this.e = true;
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationHelper
    public boolean d() {
        return !b();
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationHelper
    public View e(float f, float f2) {
        HwFloatingBubblesLayoutManager hwFloatingBubblesLayoutManager = this.f29549c;
        if (hwFloatingBubblesLayoutManager == null || hwFloatingBubblesLayoutManager.getChildCount() <= 0) {
            return null;
        }
        int childCount = this.f29549c.getChildCount() - 1;
        int i = 0;
        double d = 0.0d;
        for (int i2 = childCount; i2 >= 0; i2--) {
            View childAt = this.f29549c.getChildAt(i2);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.LayoutParams) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    float translationX = childAt.getTranslationX();
                    float translationY = childAt.getTranslationY();
                    float scaleX = childAt.getScaleX();
                    float decoratedLeft = (this.f29549c.getDecoratedLeft(childAt) + translationX) - layoutParams2.leftMargin;
                    float decoratedRight = this.f29549c.getDecoratedRight(childAt);
                    float f3 = layoutParams2.rightMargin;
                    float decoratedTop = (this.f29549c.getDecoratedTop(childAt) + translationY) - layoutParams2.topMargin;
                    double dSqrt = Math.sqrt(Math.pow(f - (decoratedLeft + ((((decoratedRight + translationX) + f3) - decoratedLeft) / 2.0f)), 2.0d) + Math.pow(f2 - (decoratedTop + ((((this.f29549c.getDecoratedBottom(childAt) + translationY) + layoutParams2.bottomMargin) - decoratedTop) / 2.0f)), 2.0d)) / ((double) scaleX);
                    if (i2 == childCount) {
                        d = dSqrt;
                    } else if (dSqrt < d) {
                        i = i2;
                        d = dSqrt;
                    }
                }
            }
        }
        return this.f29549c.getChildAt(i);
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationHelper, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        e();
        if (this.f29549c == null) {
            return false;
        }
        if ((!b() || !a()) && this.f29548b.g()) {
            h();
        }
        if (this.e && !this.f29547a) {
            c(0);
            return true;
        }
        if (!this.i) {
            c(0);
            this.i = false;
            return true;
        }
        c(this.f29548b.getScrollState() == 0 ? 0 : -this.d);
        this.f29547a = !this.e;
        this.i = false;
        return true;
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationHelper, androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        this.e = false;
        this.d = i2;
        this.i = true;
    }
}
