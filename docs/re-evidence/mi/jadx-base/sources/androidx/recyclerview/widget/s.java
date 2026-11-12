package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.o f2958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2959b;
    public final Rect c;

    public class a extends s {
        public a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.s
        public int d(View view) {
            return this.f2958a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f2958a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f2958a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int g(View view) {
            return this.f2958a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int h() {
            return this.f2958a.getWidth();
        }

        @Override // androidx.recyclerview.widget.s
        public int i() {
            return this.f2958a.getWidth() - this.f2958a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int j() {
            return this.f2958a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int k() {
            return this.f2958a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int l() {
            return this.f2958a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int m() {
            return this.f2958a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.s
        public int n() {
            return (this.f2958a.getWidth() - this.f2958a.getPaddingLeft()) - this.f2958a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int p(View view) {
            this.f2958a.getTransformedBoundingBox(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.s
        public int q(View view) {
            this.f2958a.getTransformedBoundingBox(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.s
        public void r(int i) {
            this.f2958a.offsetChildrenHorizontal(i);
        }
    }

    public class b extends s {
        public b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.s
        public int d(View view) {
            return this.f2958a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f2958a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f2958a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int g(View view) {
            return this.f2958a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int h() {
            return this.f2958a.getHeight();
        }

        @Override // androidx.recyclerview.widget.s
        public int i() {
            return this.f2958a.getHeight() - this.f2958a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int j() {
            return this.f2958a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int k() {
            return this.f2958a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int l() {
            return this.f2958a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int m() {
            return this.f2958a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.s
        public int n() {
            return (this.f2958a.getHeight() - this.f2958a.getPaddingTop()) - this.f2958a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int p(View view) {
            this.f2958a.getTransformedBoundingBox(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.s
        public int q(View view) {
            this.f2958a.getTransformedBoundingBox(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.s
        public void r(int i) {
            this.f2958a.offsetChildrenVertical(i);
        }
    }

    public /* synthetic */ s(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static s a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static s b(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return a(oVar);
        }
        if (i == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static s c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f2959b) {
            return 0;
        }
        return n() - this.f2959b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.f2959b = n();
    }

    public s(RecyclerView.o oVar) {
        this.f2959b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.f2958a = oVar;
    }
}
