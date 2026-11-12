package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public class FullyLinearLayoutManager extends LinearLayoutManager {
    public static boolean g = true;
    public static Field h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f12636b;
    public int c;
    public boolean d;
    public int e;
    public final Rect f;

    public FullyLinearLayoutManager(Context context) {
        super(context);
        this.f12635a = new int[2];
        this.c = 100;
        this.e = 0;
        this.f = new Rect();
        this.f12636b = null;
    }

    private void k(int i, int i2, boolean z) {
        int[] iArr = this.f12635a;
        if (iArr[0] == 0 && iArr[1] == 0) {
            if (z) {
                iArr[0] = i;
                iArr[1] = this.c;
            } else {
                iArr[0] = this.c;
                iArr[1] = i2;
            }
        }
    }

    private void l(int i) {
    }

    private static void m(RecyclerView.LayoutParams layoutParams) {
        if (g) {
            try {
                if (h == null) {
                    Field declaredField = RecyclerView.LayoutParams.class.getDeclaredField(PluginDeviceInfo.FICONON);
                    h = declaredField;
                    declaredField.setAccessible(true);
                }
                h.set(layoutParams, Boolean.TRUE);
            } catch (IllegalAccessException unused) {
                p();
            } catch (NoSuchFieldException unused2) {
                p();
            }
        }
    }

    public static int n() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    private void o(RecyclerView.u uVar, int i, int i2, int i3, int[] iArr) {
        try {
            View viewO = uVar.o(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewO.getLayoutParams();
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            m(layoutParams);
            calculateItemDecorationsForChild(viewO, this.f);
            viewO.measure(RecyclerView.o.getChildMeasureSpec(i2, paddingLeft + i4 + getRightDecorationWidth(viewO) + getLeftDecorationWidth(viewO), ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally()), RecyclerView.o.getChildMeasureSpec(i3, paddingTop + i5 + getTopDecorationHeight(viewO) + getBottomDecorationHeight(viewO), ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
            iArr[0] = getDecoratedMeasuredWidth(viewO) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            iArr[1] = getDecoratedMeasuredHeight(viewO) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            m(layoutParams);
            uVar.G(viewO);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static void p() {
        g = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onMeasure(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2) {
        int paddingLeft;
        int paddingTop;
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        char c = 1;
        boolean z = mode != 0;
        boolean z2 = mode2 != 0;
        boolean z3 = mode == 1073741824;
        boolean z4 = mode2 == 1073741824;
        int iN = n();
        if (z3 && z4) {
            super.onMeasure(uVar, zVar, i, i2);
            return;
        }
        boolean z5 = getOrientation() == 1;
        k(size, size2, z5);
        uVar.c();
        int iC = zVar.c();
        int itemCount = getItemCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= itemCount) {
                z5 = z5;
                break;
            }
            if (!z5) {
                itemCount = itemCount;
                iC = iC;
                z5 = z5;
                int i8 = i5;
                if (this.d) {
                    i3 = i8;
                } else if (i8 < iC) {
                    iC = iC;
                    i3 = i8;
                    o(uVar, i8, iN, size2, this.f12635a);
                } else {
                    iC = iC;
                    i3 = i8;
                    l(i3);
                }
                int[] iArr = this.f12635a;
                int i9 = i6 + iArr[0];
                if (i3 == 0) {
                    i7 = iArr[1];
                }
                if (z && i9 >= size) {
                    i6 = i9;
                    break;
                }
                i6 = i9;
                i5 = i3 + 1;
                itemCount = itemCount;
                iC = iC;
                z5 = z5;
                c = 1;
            } else {
                if (this.d) {
                    i4 = i5;
                } else if (i5 < iC) {
                    o(uVar, i5, size, iN, this.f12635a);
                    i4 = i5;
                } else {
                    i4 = i5;
                    l(i4);
                }
                int[] iArr2 = this.f12635a;
                int i10 = i7 + iArr2[c];
                if (i4 == 0) {
                    i6 = iArr2[0];
                }
                if (z2 && i10 >= size2) {
                    i7 = i10;
                    break;
                }
                i7 = i10;
                i3 = i4;
                i5 = i3 + 1;
                itemCount = itemCount;
                iC = iC;
                z5 = z5;
                c = 1;
            }
        }
        if (z3) {
            paddingLeft = size;
        } else {
            paddingLeft = i6 + getPaddingLeft() + getPaddingRight();
            if (z) {
                paddingLeft = Math.min(paddingLeft, size);
            }
        }
        if (z4) {
            paddingTop = size2;
        } else {
            paddingTop = i7 + getPaddingTop() + getPaddingBottom();
            if (z2) {
                paddingTop = Math.min(paddingTop, size2);
            }
        }
        setMeasuredDimension(paddingLeft, paddingTop);
        RecyclerView recyclerView = this.f12636b;
        if (recyclerView == null || this.e != 1) {
            return;
        }
        androidx.core.view.c.I0(recyclerView, (z5 && (!z2 || paddingTop < size2)) || (!z5 && (!z || paddingLeft < size)) ? 2 : 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        if (this.f12635a != null && getOrientation() != i) {
            int[] iArr = this.f12635a;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        super.setOrientation(i);
    }
}
