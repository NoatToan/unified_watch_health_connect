package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends d0 {
    public b0(RecyclerView.p pVar) {
        super(pVar, null);
    }

    @Override // androidx.recyclerview.widget.d0
    public final int b(View view2) {
        return this.f10437a.getDecoratedRight(view2) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int c(View view2) {
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        return this.f10437a.getDecoratedMeasuredWidth(view2) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int d(View view2) {
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        return this.f10437a.getDecoratedMeasuredHeight(view2) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int e(View view2) {
        return this.f10437a.getDecoratedLeft(view2) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int f() {
        return this.f10437a.getWidth();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int g() {
        RecyclerView.p pVar = this.f10437a;
        return pVar.getWidth() - pVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int h() {
        return this.f10437a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int i() {
        return this.f10437a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int j() {
        return this.f10437a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int k() {
        return this.f10437a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int l() {
        RecyclerView.p pVar = this.f10437a;
        return (pVar.getWidth() - pVar.getPaddingLeft()) - pVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(View view2) {
        RecyclerView.p pVar = this.f10437a;
        Rect rect = this.f10439c;
        pVar.getTransformedBoundingBox(view2, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int o(View view2) {
        RecyclerView.p pVar = this.f10437a;
        Rect rect = this.f10439c;
        pVar.getTransformedBoundingBox(view2, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.d0
    public final void p(int i14) {
        this.f10437a.offsetChildrenHorizontal(i14);
    }
}
