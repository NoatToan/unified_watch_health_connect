package com.zhouyou.recyclerview.divider;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DimenRes;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class VerticalDividerItemDecoration extends FlexibleDividerDecoration {
    private MarginProvider f;

    public static class Builder extends FlexibleDividerDecoration.Builder<Builder> {
        private MarginProvider k;

        public class a implements MarginProvider {
            public a() {
            }

            @Override // com.zhouyou.recyclerview.divider.VerticalDividerItemDecoration.MarginProvider
            public int dividerBottomMargin(int i, RecyclerView recyclerView) {
                return 0;
            }

            @Override // com.zhouyou.recyclerview.divider.VerticalDividerItemDecoration.MarginProvider
            public int dividerTopMargin(int i, RecyclerView recyclerView) {
                return 0;
            }
        }

        public class b implements MarginProvider {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            public b(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // com.zhouyou.recyclerview.divider.VerticalDividerItemDecoration.MarginProvider
            public int dividerBottomMargin(int i, RecyclerView recyclerView) {
                return this.b;
            }

            @Override // com.zhouyou.recyclerview.divider.VerticalDividerItemDecoration.MarginProvider
            public int dividerTopMargin(int i, RecyclerView recyclerView) {
                return this.a;
            }
        }

        public Builder(Context context) {
            super(context);
            this.k = new a();
        }

        public VerticalDividerItemDecoration build() {
            checkBuilderParams();
            return new VerticalDividerItemDecoration(this);
        }

        public Builder margin(int i, int i2) {
            return marginProvider(new b(i, i2));
        }

        public Builder marginProvider(MarginProvider marginProvider) {
            this.k = marginProvider;
            return this;
        }

        public Builder marginResId(@DimenRes int i, @DimenRes int i2) {
            return margin(this.mResources.getDimensionPixelSize(i), this.mResources.getDimensionPixelSize(i2));
        }

        public Builder margin(int i) {
            return margin(i, i);
        }

        public Builder marginResId(@DimenRes int i) {
            return marginResId(i, i);
        }
    }

    public interface MarginProvider {
        int dividerBottomMargin(int i, RecyclerView recyclerView);

        int dividerTopMargin(int i, RecyclerView recyclerView);
    }

    public VerticalDividerItemDecoration(Builder builder) {
        super(builder);
        this.f = builder.k;
    }

    private int f(int i, RecyclerView recyclerView) {
        FlexibleDividerDecoration.PaintProvider paintProvider = this.mPaintProvider;
        if (paintProvider != null) {
            return (int) paintProvider.dividerPaint(i, recyclerView).getStrokeWidth();
        }
        FlexibleDividerDecoration.SizeProvider sizeProvider = this.mSizeProvider;
        if (sizeProvider != null) {
            return sizeProvider.dividerSize(i, recyclerView);
        }
        FlexibleDividerDecoration.DrawableProvider drawableProvider = this.mDrawableProvider;
        if (drawableProvider != null) {
            return drawableProvider.drawableProvider(i, recyclerView).getIntrinsicWidth();
        }
        throw new RuntimeException("failed to get size");
    }

    @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration
    public Rect getDividerBound(int i, RecyclerView recyclerView, View view) {
        Rect rect = new Rect(0, 0, 0, 0);
        int translationX = (int) ViewCompat.getTranslationX(view);
        int translationY = (int) ViewCompat.getTranslationY(view);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        rect.top = recyclerView.getPaddingTop() + this.f.dividerTopMargin(i, recyclerView) + translationY;
        rect.bottom = ((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - this.f.dividerBottomMargin(i, recyclerView)) + translationY;
        int iF = f(i, recyclerView);
        boolean zIsReverseLayout = isReverseLayout(recyclerView);
        if (this.mDividerType != FlexibleDividerDecoration.DividerType.DRAWABLE) {
            int i2 = iF / 2;
            if (zIsReverseLayout) {
                rect.left = ((view.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - i2) + translationX;
            } else {
                rect.left = view.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i2 + translationX;
            }
            rect.right = rect.left;
        } else if (zIsReverseLayout) {
            int left = (view.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + translationX;
            rect.right = left;
            rect.left = left - iF;
        } else {
            int right = view.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + translationX;
            rect.left = right;
            rect.right = right + iF;
        }
        if (this.mPositionInsideItem) {
            if (zIsReverseLayout) {
                rect.left += iF;
                rect.right += iF;
            } else {
                rect.left -= iF;
                rect.right -= iF;
            }
        }
        return rect;
    }

    @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration
    public void setItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        if (this.mPositionInsideItem) {
            rect.set(0, 0, 0, 0);
        } else if (isReverseLayout(recyclerView)) {
            rect.set(f(i, recyclerView), 0, 0, 0);
        } else {
            rect.set(0, 0, f(i, recyclerView), 0);
        }
    }
}
