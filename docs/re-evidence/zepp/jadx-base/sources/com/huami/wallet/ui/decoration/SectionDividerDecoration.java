package com.huami.wallet.ui.decoration;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.ViewUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class SectionDividerDecoration extends RecyclerView.ItemDecoration {
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private final float e;
    private final float f;
    private final float g;
    private final ArrayList<Integer> a = new ArrayList<>();
    private boolean h = false;

    public SectionDividerDecoration(Context context) {
        int color = ContextCompat.getColor(context, R.color.s4);
        int color2 = ContextCompat.getColor(context, R.color.s36);
        int color3 = ContextCompat.getColor(context, R.color.s3);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.d = paint3;
        paint3.setColor(color3);
        paint3.setStyle(Paint.Style.FILL);
        this.e = context.getResources().getDimension(R.dimen.wl_border_margin);
        this.f = ViewUtils.dpToPx(context, 1.0f);
        this.g = ViewUtils.dpToPx(context, 8.0f);
    }

    private boolean a(int i) {
        ArrayList<Integer> arrayList = this.a;
        return arrayList != null && arrayList.contains(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition == -1) {
            return;
        }
        if (a(childLayoutPosition)) {
            rect.set(0, 0, 0, (int) this.g);
        } else {
            rect.set(0, 0, 0, (int) this.f);
        }
    }

    public ArrayList<Integer> getSectionPosList() {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            if (viewLayoutPosition > -1) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i2 = ((int) this.f) + bottom;
                if (viewLayoutPosition == state.getItemCount() - 1) {
                    float f = paddingLeft;
                    float f2 = bottom;
                    float f3 = width;
                    float f4 = i2;
                    canvas.drawRect(f, f2, f3, f4, this.c);
                    canvas.drawRect(f, f2, f3, f4, this.b);
                } else if (a(viewLayoutPosition)) {
                    float f5 = paddingLeft;
                    float f6 = width;
                    canvas.drawRect(f5, bottom, f6, i2, this.b);
                    float f7 = this.f;
                    canvas.drawRect(f5, ((int) f7) + bottom, f6, (((int) this.g) + bottom) - ((int) f7), this.d);
                    float f8 = this.g;
                    canvas.drawRect(f5, (((int) f8) + bottom) - ((int) this.f), f6, bottom + ((int) f8), this.b);
                } else if (viewLayoutPosition != 0 || !this.h) {
                    float f9 = paddingLeft;
                    float f10 = bottom;
                    float f11 = width;
                    float f12 = i2;
                    canvas.drawRect(f9, f10, f11, f12, this.c);
                    canvas.drawRect(f9 + this.e, f10, f11, f12, this.b);
                }
            }
        }
    }

    public void setNotShowHeaderLine(boolean z) {
        this.h = z;
    }
}
