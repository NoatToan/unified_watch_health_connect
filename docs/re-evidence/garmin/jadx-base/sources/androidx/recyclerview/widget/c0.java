package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends d0 {
    public c0(RecyclerView.p pVar) {
        super(pVar, null);
    }

    @Override // androidx.recyclerview.widget.d0
    public final int b(View view2) {
        return this.f10437a.getDecoratedBottom(view2) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int c(View view2) {
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        return this.f10437a.getDecoratedMeasuredHeight(view2) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int d(View view2) {
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        return this.f10437a.getDecoratedMeasuredWidth(view2) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int e(View view2) {
        return this.f10437a.getDecoratedTop(view2) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int f() {
        return this.f10437a.getHeight();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int g() {
        RecyclerView.p pVar = this.f10437a;
        return pVar.getHeight() - pVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int h() {
        return this.f10437a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int i() {
        return this.f10437a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int j() {
        return this.f10437a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int k() {
        return this.f10437a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int l() {
        RecyclerView.p pVar = this.f10437a;
        return (pVar.getHeight() - pVar.getPaddingTop()) - pVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(View view2) {
        RecyclerView.p pVar = this.f10437a;
        Rect rect = this.f10439c;
        pVar.getTransformedBoundingBox(view2, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int o(View view2) {
        RecyclerView.p pVar = this.f10437a;
        Rect rect = this.f10439c;
        pVar.getTransformedBoundingBox(view2, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.d0
    public final void p(int i14) {
        this.f10437a.offsetChildrenVertical(i14);
    }
}
