package com.zhouyou.recyclerview.divider;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.XRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public abstract class FlexibleDividerDecoration extends RecyclerView.ItemDecoration {
    private static final int d = 2;
    private static final int[] e = {R.attr.listDivider};
    private Paint a;
    private int b;
    private int c;
    public ColorProvider mColorProvider;
    public DividerType mDividerType;
    public DrawableProvider mDrawableProvider;
    public PaintProvider mPaintProvider;
    public boolean mPositionInsideItem;
    public boolean mShowLastDivider;
    public SizeProvider mSizeProvider;
    public VisibilityProvider mVisibilityProvider;

    public static class Builder<T extends Builder> {
        private Context a;
        private PaintProvider b;
        private ColorProvider c;
        private DrawableProvider d;
        private SizeProvider e;
        private VisibilityProvider f = new a();
        private boolean g = false;
        private boolean h = false;
        private int i = -1;
        private int j = -1;
        public Resources mResources;

        public class a implements VisibilityProvider {
            public a() {
            }

            @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.VisibilityProvider
            public boolean shouldHideDivider(int i, RecyclerView recyclerView) {
                return false;
            }
        }

        public class b implements PaintProvider {
            public final /* synthetic */ Paint a;

            public b(Paint paint) {
                this.a = paint;
            }

            @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.PaintProvider
            public Paint dividerPaint(int i, RecyclerView recyclerView) {
                return this.a;
            }
        }

        public class c implements ColorProvider {
            public final /* synthetic */ int a;

            public c(int i) {
                this.a = i;
            }

            @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.ColorProvider
            public int dividerColor(int i, RecyclerView recyclerView) {
                return this.a;
            }
        }

        public class d implements DrawableProvider {
            public final /* synthetic */ Drawable a;

            public d(Drawable drawable) {
                this.a = drawable;
            }

            @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.DrawableProvider
            public Drawable drawableProvider(int i, RecyclerView recyclerView) {
                return this.a;
            }
        }

        public class e implements SizeProvider {
            public final /* synthetic */ int a;

            public e(int i) {
                this.a = i;
            }

            @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.SizeProvider
            public int dividerSize(int i, RecyclerView recyclerView) {
                return this.a;
            }
        }

        public Builder(Context context) {
            this.a = context;
            this.mResources = context.getResources();
        }

        public void checkBuilderParams() {
            if (this.b != null) {
                if (this.c != null) {
                    throw new IllegalArgumentException("Use setColor method of Paint class to specify line color. Do not provider ColorProvider if you set PaintProvider.");
                }
                if (this.e != null) {
                    throw new IllegalArgumentException("Use setStrokeWidth method of Paint class to specify line size. Do not provider SizeProvider if you set PaintProvider.");
                }
            }
        }

        public T color(int i) {
            return (T) colorProvider(new c(i));
        }

        public T colorProvider(ColorProvider colorProvider) {
            this.c = colorProvider;
            return this;
        }

        public T colorResId(@ColorRes int i) {
            return (T) color(ContextCompat.getColor(this.a, i));
        }

        public T drawable(@DrawableRes int i) {
            return (T) drawable(ContextCompat.getDrawable(this.a, i));
        }

        public T drawableProvider(DrawableProvider drawableProvider) {
            this.d = drawableProvider;
            return this;
        }

        public T endSkipCount(int i) {
            if (i < 0) {
                i = 0;
            }
            this.j = i;
            return this;
        }

        public T paint(Paint paint) {
            return (T) paintProvider(new b(paint));
        }

        public T paintProvider(PaintProvider paintProvider) {
            this.b = paintProvider;
            return this;
        }

        public T positionInsideItem(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setContext(Context context) {
            this.a = context;
            return this;
        }

        public T showLastDivider() {
            this.g = true;
            return this;
        }

        public T size(int i) {
            return (T) sizeProvider(new e(i));
        }

        public T sizeProvider(SizeProvider sizeProvider) {
            this.e = sizeProvider;
            return this;
        }

        public T sizeResId(@DimenRes int i) {
            return (T) size(this.mResources.getDimensionPixelSize(i));
        }

        public T startSkipCount(int i) {
            if (i < 0) {
                i = 0;
            }
            this.i = i;
            return this;
        }

        public T visibilityProvider(VisibilityProvider visibilityProvider) {
            this.f = visibilityProvider;
            return this;
        }

        public T drawable(Drawable drawable) {
            return (T) drawableProvider(new d(drawable));
        }
    }

    public interface ColorProvider {
        int dividerColor(int i, RecyclerView recyclerView);
    }

    public enum DividerType {
        DRAWABLE,
        PAINT,
        COLOR
    }

    public interface DrawableProvider {
        Drawable drawableProvider(int i, RecyclerView recyclerView);
    }

    public interface PaintProvider {
        Paint dividerPaint(int i, RecyclerView recyclerView);
    }

    public interface SizeProvider {
        int dividerSize(int i, RecyclerView recyclerView);
    }

    public interface VisibilityProvider {
        boolean shouldHideDivider(int i, RecyclerView recyclerView);
    }

    public class a implements DrawableProvider {
        public final /* synthetic */ Drawable a;

        public a(Drawable drawable) {
            this.a = drawable;
        }

        @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.DrawableProvider
        public Drawable drawableProvider(int i, RecyclerView recyclerView) {
            return this.a;
        }
    }

    public class b implements SizeProvider {
        public b() {
        }

        @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.SizeProvider
        public int dividerSize(int i, RecyclerView recyclerView) {
            return 2;
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DividerType.values().length];
            a = iArr;
            try {
                iArr[DividerType.DRAWABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DividerType.PAINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DividerType.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public FlexibleDividerDecoration(Builder builder) {
        DividerType dividerType = DividerType.DRAWABLE;
        this.mDividerType = dividerType;
        this.b = -1;
        this.c = -1;
        if (builder.b != null) {
            this.mDividerType = DividerType.PAINT;
            this.mPaintProvider = builder.b;
        } else if (builder.c != null) {
            this.mDividerType = DividerType.COLOR;
            this.mColorProvider = builder.c;
            this.a = new Paint();
            d(builder);
        } else {
            this.mDividerType = dividerType;
            if (builder.d == null) {
                TypedArray typedArrayObtainStyledAttributes = builder.a.obtainStyledAttributes(e);
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
                this.mDrawableProvider = new a(drawable);
            } else {
                this.mDrawableProvider = builder.d;
            }
            this.mSizeProvider = builder.e;
        }
        this.mVisibilityProvider = builder.f;
        this.mShowLastDivider = builder.g;
        this.mPositionInsideItem = builder.h;
        this.b = builder.i;
        this.c = builder.j;
    }

    private int a(int i, RecyclerView recyclerView) {
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return i;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        return gridLayoutManager.getSpanSizeLookup().getSpanGroupIndex(i, gridLayoutManager.getSpanCount());
    }

    private int b(RecyclerView recyclerView) {
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return 1;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
        int spanCount = gridLayoutManager.getSpanCount();
        int a2 = recyclerView.getAdapter().getA();
        for (int i = a2 - 1; i >= 0; i--) {
            if (spanSizeLookup.getSpanIndex(i, spanCount) == 0) {
                return a2 - i;
            }
        }
        return 1;
    }

    private boolean c(int i, int i2) {
        int i3 = this.b;
        if (i3 != -1 && i < i3) {
            return true;
        }
        int i4 = this.c;
        return i4 != -1 && i2 - i <= i4;
    }

    private void d(Builder builder) {
        SizeProvider sizeProvider = builder.e;
        this.mSizeProvider = sizeProvider;
        if (sizeProvider == null) {
            this.mSizeProvider = new b();
        }
    }

    private boolean e(int i, RecyclerView recyclerView) {
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return false;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        return gridLayoutManager.getSpanSizeLookup().getSpanIndex(i, gridLayoutManager.getSpanCount()) > 0;
    }

    public abstract Rect getDividerBound(int i, RecyclerView recyclerView, View view);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int a2 = recyclerView.getAdapter().getA();
        if (recyclerView instanceof XRecyclerView) {
            XRecyclerView xRecyclerView = (XRecyclerView) recyclerView;
            a2 = xRecyclerView.getItemCount() + (xRecyclerView.isLoadingMoreEnabled() ? -1 : 0);
        }
        int iA = a(childAdapterPosition, recyclerView);
        if (c(iA, a2) || this.mVisibilityProvider.shouldHideDivider(iA, recyclerView)) {
            return;
        }
        int iB = b(recyclerView);
        if (this.mShowLastDivider || childAdapterPosition < a2 - iB) {
            setItemOffsets(rect, iA, recyclerView);
        }
    }

    public boolean isReverseLayout(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getReverseLayout();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int a2 = adapter.getA();
        int i = -1;
        if (recyclerView instanceof XRecyclerView) {
            XRecyclerView xRecyclerView = (XRecyclerView) recyclerView;
            a2 = xRecyclerView.getItemCount() + (xRecyclerView.isLoadingMoreEnabled() ? -1 : 0);
        }
        int iB = b(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= i) {
                if (!e(childAdapterPosition, recyclerView)) {
                    int iA = a(childAdapterPosition, recyclerView);
                    if (!c(iA, a2) && !this.mVisibilityProvider.shouldHideDivider(iA, recyclerView) && (this.mShowLastDivider || childAdapterPosition < a2 - iB)) {
                        Rect dividerBound = getDividerBound(iA, recyclerView, childAt);
                        int i3 = c.a[this.mDividerType.ordinal()];
                        if (i3 == 1) {
                            Drawable drawableDrawableProvider = this.mDrawableProvider.drawableProvider(iA, recyclerView);
                            drawableDrawableProvider.setBounds(dividerBound);
                            drawableDrawableProvider.draw(canvas);
                        } else if (i3 == 2) {
                            Paint paintDividerPaint = this.mPaintProvider.dividerPaint(iA, recyclerView);
                            this.a = paintDividerPaint;
                            canvas.drawLine(dividerBound.left, dividerBound.top, dividerBound.right, dividerBound.bottom, paintDividerPaint);
                        } else if (i3 == 3) {
                            this.a.setColor(this.mColorProvider.dividerColor(iA, recyclerView));
                            this.a.setStrokeWidth(this.mSizeProvider.dividerSize(iA, recyclerView));
                            canvas.drawLine(dividerBound.left, dividerBound.top, dividerBound.right, dividerBound.bottom, this.a);
                        }
                    }
                }
                i = childAdapterPosition;
            }
        }
    }

    public abstract void setItemOffsets(Rect rect, int i, RecyclerView recyclerView);
}
