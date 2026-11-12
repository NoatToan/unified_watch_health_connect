package com.huami.wallet.ui.decoration;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.function.Consumer;
import com.huami.wallet.ui.function.Function;
import com.huami.wallet.ui.function.ToIntFunction;

/* JADX INFO: loaded from: classes16.dex */
public class DividerDecoration extends RecyclerView.ItemDecoration {
    private final Paint a;
    private final Style b;

    public static class Style {

        @ColorInt
        public int a;

        @Px
        public int b;

        @Px
        public int c;
        public boolean d = false;
        public boolean e = false;
        public boolean f = true;
        public SparseBooleanArray g;

        public Style setDividerColor(int i) {
            this.a = i;
            return this;
        }

        public Style setDividerHeight(int i) {
            this.b = i;
            return this;
        }

        public Style setDividerPadding(int i) {
            this.c = i;
            return this;
        }

        public Style setIgnorePosition(int... iArr) {
            if (iArr != null) {
                this.g = new SparseBooleanArray();
                for (int i : iArr) {
                    this.g.put(i, true);
                }
            }
            return this;
        }

        public Style setShowBottomDivider(boolean z) {
            this.e = z;
            return this;
        }

        public Style setShowMiddleDivider(boolean z) {
            this.f = z;
            return this;
        }

        public Style setShowTopDivider(boolean z) {
            this.d = z;
            return this;
        }
    }

    public DividerDecoration(Style style) {
        this.b = style;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(style.a);
        paint.setStyle(Paint.Style.FILL);
    }

    private void g(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int itemCount = recyclerView.getAdapter().getItemCount();
        Function<ToIntFunction<View>, Consumer<View>> functionApply = h(this.b).apply(canvas).apply(recyclerView);
        Consumer<View> consumerApply = functionApply.apply(p());
        Consumer<View> consumerApply2 = functionApply.apply(o());
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int viewAdapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition();
            SparseBooleanArray sparseBooleanArray = this.b.g;
            if (sparseBooleanArray == null || !sparseBooleanArray.get(viewAdapterPosition, false)) {
                boolean z = true;
                boolean z2 = viewAdapterPosition == 0;
                boolean z3 = viewAdapterPosition == itemCount + (-1);
                boolean z4 = z2 && this.b.d;
                if ((z3 || !this.b.f) && (!z3 || !this.b.e)) {
                    z = false;
                }
                if (z4) {
                    consumerApply.accept(childAt);
                }
                if (z) {
                    consumerApply2.accept(childAt);
                }
            }
        }
    }

    private Function<Canvas, Function<RecyclerView, Function<ToIntFunction<View>, Consumer<View>>>> h(final Style style) {
        return new Function() { // from class: ab1
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return this.a.l(style, (Canvas) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ToIntFunction toIntFunction, Style style, Canvas canvas, int i, int i2, View view) {
        int iApplyAsInt = toIntFunction.applyAsInt(view);
        canvas.drawRect(i, iApplyAsInt, i2, style.b + iApplyAsInt, this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Consumer j(final Style style, final Canvas canvas, final int i, final int i2, final ToIntFunction toIntFunction) {
        return new Consumer() { // from class: za1
            @Override // com.huami.wallet.ui.function.Consumer
            public final void accept(Object obj) {
                this.a.i(toIntFunction, style, canvas, i, i2, (View) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Function k(final Style style, final Canvas canvas, RecyclerView recyclerView) {
        final int paddingLeft = recyclerView.getPaddingLeft() + style.c;
        final int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - style.c;
        return new Function() { // from class: cb1
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return this.a.j(style, canvas, paddingLeft, measuredWidth, (ToIntFunction) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Function l(final Style style, final Canvas canvas) {
        return new Function() { // from class: bb1
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return this.a.k(style, canvas, (RecyclerView) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int m(View view) {
        return view.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int n(View view) {
        return view.getTop() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private ToIntFunction<View> o() {
        return new ToIntFunction() { // from class: eb1
            @Override // com.huami.wallet.ui.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return DividerDecoration.m((View) obj);
            }
        };
    }

    private ToIntFunction<View> p() {
        return new ToIntFunction() { // from class: db1
            @Override // com.huami.wallet.ui.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return DividerDecoration.n((View) obj);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        g(canvas, recyclerView);
    }
}
