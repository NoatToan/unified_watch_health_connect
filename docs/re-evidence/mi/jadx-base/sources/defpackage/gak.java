package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class gak extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18785b;
    public boolean c;
    public ColorDrawable d;

    public gak(int i) {
        this(i, false, 0);
    }

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            this.d.setBounds(right, paddingTop, this.f18785b + right, height);
            this.d.draw(canvas);
        }
    }

    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            this.d.setBounds(paddingLeft, bottom, width, this.f18784a + bottom);
            this.d.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (!(layoutManager instanceof GridLayoutManager)) {
            if (layoutManager instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager).getOrientation() == 1) {
                    if (childAdapterPosition > 0) {
                        rect.top = this.f18784a;
                        return;
                    }
                    return;
                }
                if (!this.c) {
                    if (childAdapterPosition > 0) {
                        if (AppUtil.isRTLDirection()) {
                            rect.right = this.f18784a;
                            return;
                        } else {
                            rect.left = this.f18784a;
                            return;
                        }
                    }
                    return;
                }
                if (AppUtil.isRTLDirection()) {
                    rect.right = this.f18784a;
                } else {
                    rect.left = this.f18784a;
                }
                if (childAdapterPosition == layoutManager.getItemCount() - 1) {
                    if (AppUtil.isRTLDirection()) {
                        rect.left = this.f18784a;
                        return;
                    } else {
                        rect.right = this.f18784a;
                        return;
                    }
                }
                return;
            }
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int orientation = gridLayoutManager.getOrientation();
        int iU = gridLayoutManager.u();
        int i = childAdapterPosition % iU;
        if (orientation == 1) {
            if (!this.c) {
                float f = i;
                float f2 = iU;
                rect.left = Math.round(((f * 1.0f) * this.f18785b) / f2);
                int i2 = this.f18785b;
                rect.right = Math.round(i2 - (((f + 1.0f) * i2) / f2));
                if (childAdapterPosition >= iU) {
                    rect.top = this.f18784a;
                    return;
                }
                return;
            }
            int i3 = this.f18785b;
            float f3 = i3;
            float f4 = i;
            float f5 = f4 * 1.0f * i3;
            float f6 = iU;
            rect.left = Math.round(f3 - (f5 / f6));
            rect.right = Math.round(((f4 + 1.0f) * this.f18785b) / f6);
            if (childAdapterPosition < iU) {
                rect.top = this.f18784a;
            }
            rect.bottom = this.f18784a;
            return;
        }
        if (!this.c) {
            float f7 = i;
            float f8 = iU;
            rect.top = Math.round(((f7 * 1.0f) * this.f18784a) / f8);
            int i4 = this.f18784a;
            rect.bottom = Math.round(i4 - (((f7 + 1.0f) * i4) / f8));
            if (childAdapterPosition >= iU) {
                rect.left = this.f18785b;
                return;
            }
            return;
        }
        int i5 = this.f18784a;
        float f9 = i5;
        float f10 = i;
        float f11 = f10 * 1.0f * i5;
        float f12 = iU;
        rect.top = Math.round(f9 - (f11 / f12));
        rect.bottom = Math.round(((f10 + 1.0f) * this.f18784a) / f12);
        if (childAdapterPosition < iU) {
            rect.left = this.f18785b;
        }
        rect.right = this.f18785b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.z zVar) {
        if (this.d == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).getOrientation() == 1) {
                d(canvas, recyclerView);
            } else {
                c(canvas, recyclerView);
            }
        }
    }

    public gak(int i, int i2) {
        this(i, i2, false);
    }

    public gak(int i, boolean z) {
        this(i, z, 0);
    }

    @SuppressLint({"ResourceType"})
    public gak(int i, boolean z, int i2) {
        this.f18784a = i;
        this.c = z;
        if (i2 > 0) {
            this.d = new ColorDrawable(i2);
        }
    }

    public gak(int i, int i2, boolean z) {
        this.f18784a = i;
        this.f18785b = i2;
        this.c = z;
    }
}
