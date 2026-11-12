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
public class i extends RecyclerView.n {
    public static final int[] d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f2920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2921b;
    public final Rect c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d);
        this.f2920a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        e(i);
    }

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.c);
            int iRound = this.c.right + Math.round(childAt.getTranslationX());
            this.f2920a.setBounds(iRound - this.f2920a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f2920a.draw(canvas);
        }
        canvas.restore();
    }

    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
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
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.c);
            int iRound = this.c.bottom + Math.round(childAt.getTranslationY());
            this.f2920a.setBounds(paddingLeft, iRound - this.f2920a.getIntrinsicHeight(), width, iRound);
            this.f2920a.draw(canvas);
        }
        canvas.restore();
    }

    public void e(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f2921b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        Drawable drawable = this.f2920a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f2921b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (recyclerView.getLayoutManager() == null || this.f2920a == null) {
            return;
        }
        if (this.f2921b == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }
}
