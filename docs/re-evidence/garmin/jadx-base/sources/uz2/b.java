package uz2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes3.dex */
public class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173625a;

    public b(Context context) {
        super(context);
        this.f173625a = 48;
        setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    public int getGravity() {
        return this.f173625a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (this.f173625a == 48) {
            childAt.layout(0, 0, getMeasuredWidth(), childAt.getMeasuredHeight());
        } else {
            childAt.layout(0, getMeasuredHeight() - childAt.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int size = View.MeasureSpec.getSize(i15);
        int size2 = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i15);
        View childAt = getChildAt(0);
        if (childAt == null) {
            setMeasuredDimension(0, size2);
            return;
        }
        if (childAt.isLayoutRequested()) {
            measureChild(childAt, i14, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (mode == 0 && (size = getLayoutParams().height) <= 0) {
            size = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(size2, size);
    }

    public void setGravity(int i14) {
        this.f173625a = i14;
    }
}
