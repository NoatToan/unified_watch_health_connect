package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class p extends RecyclerView.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10583d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f10586c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public p(Context context, int i14) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f10583d);
        this.f10584a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (i14 == 0 || i14 == 1) {
            this.f10585b = i14;
        } else {
            vb.h.s("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Drawable drawable = this.f10584a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f10585b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f10584a == null) {
            return;
        }
        int i14 = 0;
        int i15 = this.f10585b;
        Rect rect = this.f10586c;
        if (i15 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i14 < childCount) {
                View childAt = recyclerView.getChildAt(i14);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f10584a.setBounds(paddingLeft, iRound - this.f10584a.getIntrinsicHeight(), width, iRound);
                this.f10584a.draw(canvas);
                i14++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i14 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i14);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f10584a.setBounds(iRound2 - this.f10584a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f10584a.draw(canvas);
            i14++;
        }
        canvas.restore();
    }
}
