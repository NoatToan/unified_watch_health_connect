package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.widget.CompoundButtonCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class b {
    private static final int f = 10;
    private static final long g = 4294967295L;
    public static final /* synthetic */ boolean h = false;
    private final com.google.android.flexbox.a a;
    private boolean[] b;

    @Nullable
    public int[] c;

    @Nullable
    public long[] d;

    @Nullable
    private long[] e;

    /* JADX INFO: renamed from: com.google.android.flexbox.b$b, reason: collision with other inner class name */
    public static class C0157b {
        public List<FlexLine> a;
        public int b;

        public void a() {
            this.a = null;
            this.b = 0;
        }
    }

    public static class c implements Comparable<c> {
        public int a;
        public int b;

        private c() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull c cVar) {
            int i = this.b;
            int i2 = cVar.b;
            return i != i2 ? i - i2 : this.a - cVar.a;
        }

        @NonNull
        public String toString() {
            return "Order{order=" + this.b + ", index=" + this.a + '}';
        }
    }

    public b(com.google.android.flexbox.a aVar) {
        this.a = aVar;
    }

    private int A(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.a aVar = this.a;
        int childWidthMeasureSpec = aVar.getChildWidthMeasureSpec(i, aVar.getPaddingLeft() + this.a.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private int B(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginBottom() : flexItem.getMarginRight();
    }

    private int C(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginRight() : flexItem.getMarginBottom();
    }

    private int D(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginTop() : flexItem.getMarginLeft();
    }

    private int E(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginLeft() : flexItem.getMarginTop();
    }

    private int F(FlexItem flexItem, boolean z) {
        return z ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int G(FlexItem flexItem, boolean z) {
        return z ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int H(boolean z) {
        return z ? this.a.getPaddingBottom() : this.a.getPaddingEnd();
    }

    private int I(boolean z) {
        return z ? this.a.getPaddingEnd() : this.a.getPaddingBottom();
    }

    private int J(boolean z) {
        return z ? this.a.getPaddingTop() : this.a.getPaddingStart();
    }

    private int K(boolean z) {
        return z ? this.a.getPaddingStart() : this.a.getPaddingTop();
    }

    private int L(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int M(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean N(int i, int i2, FlexLine flexLine) {
        return i == i2 - 1 && flexLine.getItemCountNotGone() != 0;
    }

    private boolean P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.isWrapBefore()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.a.getDecorationLengthMainAxis(view, i5, i6);
        if (decorationLengthMainAxis > 0) {
            i4 += decorationLengthMainAxis;
        }
        return i2 < i3 + i4;
    }

    private void T(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        int i7 = flexLine.e;
        float f2 = flexLine.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i7) {
            return;
        }
        float f4 = (i7 - i3) / f2;
        flexLine.e = i4 + flexLine.f;
        if (!z) {
            flexLine.g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f5 = 0.0f;
        while (i8 < flexLine.h) {
            int i10 = flexLine.o + i8;
            View reorderedFlexItemAt = this.a.getReorderedFlexItemAt(i10);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                i5 = i7;
                i6 = i8;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i7;
                    int i11 = i8;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i10]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i10]);
                    }
                    if (this.b[i10] || flexItem.getFlexShrink() <= 0.0f) {
                        i6 = i11;
                    } else {
                        float flexShrink = measuredWidth - (flexItem.getFlexShrink() * f4);
                        if (i6 == flexLine.h - 1) {
                            i6 = i11;
                            flexShrink += f5;
                            f5 = 0.0f;
                        }
                        i6 = i11;
                        int iRound = Math.round(flexShrink);
                        if (iRound < flexItem.getMinWidth()) {
                            iRound = flexItem.getMinWidth();
                            this.b[i10] = true;
                            flexLine.k -= flexItem.getFlexShrink();
                            z2 = true;
                        } else {
                            f5 += flexShrink - iRound;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iZ = z(i2, flexItem, flexLine.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        Z(i10, iMakeMeasureSpec, iZ, reorderedFlexItemAt);
                        this.a.updateViewCache(i10, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.e += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i10]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i10]);
                    }
                    if (this.b[i10] || flexItem.getFlexShrink() <= f3) {
                        i5 = i7;
                        i6 = i8;
                    } else {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f4);
                        if (i8 == flexLine.h - 1) {
                            flexShrink2 += f5;
                            f5 = 0.0f;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            iRound2 = flexItem.getMinHeight();
                            this.b[i10] = true;
                            flexLine.k -= flexItem.getFlexShrink();
                            i5 = i7;
                            i6 = i8;
                            z2 = true;
                        } else {
                            f5 += flexShrink2 - iRound2;
                            i5 = i7;
                            i6 = i8;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iA = A(i, flexItem, flexLine.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        Z(i10, iA, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.a.updateViewCache(i10, reorderedFlexItemAt);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.e += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                }
                flexLine.g = Math.max(flexLine.g, iMax);
                i9 = iMax;
            }
            i8 = i6 + 1;
            i7 = i5;
            f3 = 0.0f;
        }
        int i12 = i7;
        if (!z2 || i12 == flexLine.e) {
            return;
        }
        T(i, i2, flexLine, i3, i4, true);
    }

    private int[] U(int i, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (c cVar : list) {
            int i3 = cVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.b);
            i2++;
        }
        return iArr;
    }

    private void V(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.a.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Z(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.a.updateViewCache(i2, view);
    }

    private void W(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.a.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Z(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.a.updateViewCache(i2, view);
    }

    private void Z(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = S(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<FlexLine> list, FlexLine flexLine, int i, int i2) {
        flexLine.m = i2;
        this.a.onNewFlexLineAdded(flexLine);
        flexLine.p = i;
        list.add(flexLine);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void i(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.getMinWidth()) {
            if (measuredWidth > flexItem.getMaxWidth()) {
                measuredWidth = flexItem.getMaxWidth();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.getMinHeight()) {
                measuredHeight = flexItem.getMinHeight();
            } else if (measuredHeight > flexItem.getMaxHeight()) {
                measuredHeight = flexItem.getMaxHeight();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                Z(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.a.updateViewCache(i, view);
            }
        }
        measuredWidth = flexItem.getMinWidth();
        z = true;
        if (measuredHeight < flexItem.getMinHeight()) {
            measuredHeight = flexItem.getMinHeight();
        } else if (measuredHeight > flexItem.getMaxHeight()) {
            measuredHeight = flexItem.getMaxHeight();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            Z(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.a.updateViewCache(i, view);
        }
    }

    private List<FlexLine> k(List<FlexLine> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @NonNull
    private List<c> l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.getFlexItemAt(i2).getLayoutParams();
            c cVar = new c();
            cVar.b = flexItem.getOrder();
            cVar.a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void r(int i) {
        boolean[] zArr = this.b;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.b = new boolean[i];
        } else {
            if (zArr.length >= i) {
                Arrays.fill(zArr, false);
                return;
            }
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.b = new boolean[i];
        }
    }

    private void v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int minWidth = flexItem.getMinWidth();
        int minHeight = flexItem.getMinHeight();
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
        int minimumHeight = buttonDrawable != null ? buttonDrawable.getMinimumHeight() : 0;
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        flexItem.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = minimumHeight;
        }
        flexItem.setMinHeight(minHeight);
    }

    private void w(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        double d;
        int i7;
        double d2;
        float f2 = flexLine.j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = flexLine.e)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        flexLine.e = i4 + flexLine.f;
        if (!z) {
            flexLine.g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f5 = 0.0f;
        while (i8 < flexLine.h) {
            int i10 = flexLine.o + i8;
            View reorderedFlexItemAt = this.a.getReorderedFlexItemAt(i10);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                i6 = i5;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i11 = i5;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i10]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    i6 = i11;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i10]);
                    }
                    if (!this.b[i10] && flexItem.getFlexGrow() > 0.0f) {
                        float flexGrow = measuredWidth + (flexItem.getFlexGrow() * f4);
                        if (i8 == flexLine.h - 1) {
                            flexGrow += f5;
                            f5 = 0.0f;
                        }
                        int iRound = Math.round(flexGrow);
                        if (iRound > flexItem.getMaxWidth()) {
                            iRound = flexItem.getMaxWidth();
                            this.b[i10] = true;
                            flexLine.j -= flexItem.getFlexGrow();
                            z2 = true;
                        } else {
                            f5 += flexGrow - iRound;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f5 = (float) d;
                        }
                        int iZ = z(i2, flexItem, flexLine.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        Z(i10, iMakeMeasureSpec, iZ, reorderedFlexItemAt);
                        this.a.updateViewCache(i10, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.e += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i10]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i10]);
                    }
                    if (this.b[i10] || flexItem.getFlexGrow() <= f3) {
                        i7 = i5;
                    } else {
                        float flexGrow2 = measuredHeight3 + (flexItem.getFlexGrow() * f4);
                        if (i8 == flexLine.h - 1) {
                            flexGrow2 += f5;
                            f5 = 0.0f;
                        }
                        int iRound2 = Math.round(flexGrow2);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            iRound2 = flexItem.getMaxHeight();
                            this.b[i10] = true;
                            flexLine.j -= flexItem.getFlexGrow();
                            i7 = i5;
                            z2 = true;
                        } else {
                            f5 += flexGrow2 - iRound2;
                            i7 = i5;
                            double d4 = f5;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f5 = (float) d2;
                        }
                        int iA = A(i, flexItem, flexLine.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        Z(i10, iA, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.a.updateViewCache(i10, reorderedFlexItemAt);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.e += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                    i6 = i7;
                }
                flexLine.g = Math.max(flexLine.g, iMax);
                i9 = iMax;
            }
            i8++;
            i5 = i6;
            f3 = 0.0f;
        }
        int i12 = i5;
        if (!z2 || i12 == flexLine.e) {
            return;
        }
        w(i, i2, flexLine, i3, i4, true);
    }

    private int z(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.a aVar = this.a;
        int childHeightMeasureSpec = aVar.getChildHeightMeasureSpec(i, aVar.getPaddingTop() + this.a.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View flexItemAt = this.a.getFlexItemAt(i);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void Q(View view, FlexLine flexLine, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = flexLine.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.a.getFlexWrap() == 2) {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop());
                    return;
                } else {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i6 - flexItem.getMarginBottom());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (this.a.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.a.getFlexWrap() != 2) {
                    int iMax = Math.max(flexLine.l - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((flexLine.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.getMarginBottom());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    public void R(View view, FlexLine flexLine, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = flexLine.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i4);
                    return;
                } else {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams)) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                } else {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        } else {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        }
    }

    @VisibleForTesting
    public long S(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    public void X() {
        Y(0);
    }

    public void Y(int i) {
        View reorderedFlexItemAt;
        if (i >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        if (this.a.getAlignItems() != 4) {
            for (FlexLine flexLine : this.a.getFlexLinesInternal()) {
                for (Integer num : flexLine.n) {
                    View reorderedFlexItemAt2 = this.a.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        W(reorderedFlexItemAt2, flexLine.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        V(reorderedFlexItemAt2, flexLine.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List<FlexLine> flexLinesInternal = this.a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            FlexLine flexLine2 = flexLinesInternal.get(i2);
            int i3 = flexLine2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = flexLine2.o + i4;
                if (i4 < this.a.getFlexItemCount() && (reorderedFlexItemAt = this.a.getReorderedFlexItemAt(i5)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(reorderedFlexItemAt, flexLine2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            V(reorderedFlexItemAt, flexLine2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public void b(C0157b c0157b, int i, int i2, int i3, int i4, int i5, @Nullable List<FlexLine> list) {
        int i6;
        int i7;
        List<FlexLine> list2;
        int i8;
        View view;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i2;
        int i15 = i5;
        boolean zIsMainAxisDirectionHorizontal = this.a.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<FlexLine> arrayList = list == null ? new ArrayList() : list;
        c0157b.a = arrayList;
        boolean z = i15 == -1;
        int iK = K(zIsMainAxisDirectionHorizontal);
        int I = I(zIsMainAxisDirectionHorizontal);
        int iJ = J(zIsMainAxisDirectionHorizontal);
        int iH = H(zIsMainAxisDirectionHorizontal);
        FlexLine flexLine = new FlexLine();
        int i16 = i4;
        flexLine.o = i16;
        int i17 = I + iK;
        flexLine.e = i17;
        int flexItemCount = this.a.getFlexItemCount();
        boolean z2 = z;
        int i18 = 0;
        int iCombineMeasuredStates = 0;
        int i19 = 0;
        int i20 = Integer.MIN_VALUE;
        while (i16 < flexItemCount) {
            View reorderedFlexItemAt = this.a.getReorderedFlexItemAt(i16);
            if (reorderedFlexItemAt != null) {
                if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine.i++;
                    flexLine.h++;
                    if (N(i16, flexItemCount, flexLine)) {
                        a(arrayList, flexLine, i16, i18);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        v((CompoundButton) reorderedFlexItemAt);
                    }
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    int i21 = flexItemCount;
                    if (flexItem.getAlignSelf() == 4) {
                        flexLine.n.add(Integer.valueOf(i16));
                    }
                    int iG = G(flexItem, zIsMainAxisDirectionHorizontal);
                    if (flexItem.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        iG = Math.round(size * flexItem.getFlexBasisPercent());
                    }
                    if (zIsMainAxisDirectionHorizontal) {
                        int childWidthMeasureSpec = this.a.getChildWidthMeasureSpec(i, i17 + E(flexItem, true) + C(flexItem, true), iG);
                        int childHeightMeasureSpec = this.a.getChildHeightMeasureSpec(i14, iJ + iH + D(flexItem, true) + B(flexItem, true) + i18, F(flexItem, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        Z(i16, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i7 = childWidthMeasureSpec;
                    } else {
                        int childWidthMeasureSpec2 = this.a.getChildWidthMeasureSpec(i14, iJ + iH + D(flexItem, false) + B(flexItem, false) + i18, F(flexItem, false));
                        int childHeightMeasureSpec2 = this.a.getChildHeightMeasureSpec(i, E(flexItem, false) + i17 + C(flexItem, false), iG);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        Z(i16, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        i7 = childHeightMeasureSpec2;
                    }
                    this.a.updateViewCache(i16, reorderedFlexItemAt);
                    i(reorderedFlexItemAt, i16);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i22 = flexLine.e;
                    int i23 = i18;
                    int i24 = i17;
                    FlexLine flexLine2 = flexLine;
                    int i25 = size;
                    int i26 = i16;
                    list2 = arrayList;
                    int i27 = i7;
                    if (P(reorderedFlexItemAt, mode, i25, i22, C(flexItem, zIsMainAxisDirectionHorizontal) + M(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + E(flexItem, zIsMainAxisDirectionHorizontal), flexItem, i26, i19, arrayList.size())) {
                        if (flexLine2.getItemCountNotGone() > 0) {
                            a(list2, flexLine2, i26 > 0 ? i26 - 1 : 0, i23);
                            i18 = flexLine2.g + i23;
                        } else {
                            i18 = i23;
                        }
                        if (!zIsMainAxisDirectionHorizontal) {
                            i8 = i2;
                            view = reorderedFlexItemAt;
                            i16 = i26;
                            if (flexItem.getWidth() == -1) {
                                com.google.android.flexbox.a aVar = this.a;
                                view.measure(aVar.getChildWidthMeasureSpec(i8, aVar.getPaddingLeft() + this.a.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i18, flexItem.getWidth()), i27);
                                i(view, i16);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            com.google.android.flexbox.a aVar2 = this.a;
                            i8 = i2;
                            i16 = i26;
                            view = reorderedFlexItemAt;
                            view.measure(i27, aVar2.getChildHeightMeasureSpec(i8, aVar2.getPaddingTop() + this.a.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i18, flexItem.getHeight()));
                            i(view, i16);
                        } else {
                            i8 = i2;
                            view = reorderedFlexItemAt;
                            i16 = i26;
                        }
                        flexLine = new FlexLine();
                        flexLine.h = 1;
                        i9 = i24;
                        flexLine.e = i9;
                        flexLine.o = i16;
                        i10 = 0;
                        i11 = Integer.MIN_VALUE;
                    } else {
                        i8 = i2;
                        view = reorderedFlexItemAt;
                        i16 = i26;
                        flexLine = flexLine2;
                        i9 = i24;
                        flexLine.h++;
                        i10 = i19 + 1;
                        i18 = i23;
                        i11 = i20;
                    }
                    flexLine.q |= flexItem.getFlexGrow() != 0.0f;
                    flexLine.r |= flexItem.getFlexShrink() != 0.0f;
                    int[] iArr = this.c;
                    if (iArr != null) {
                        iArr[i16] = list2.size();
                    }
                    flexLine.e += M(view, zIsMainAxisDirectionHorizontal) + E(flexItem, zIsMainAxisDirectionHorizontal) + C(flexItem, zIsMainAxisDirectionHorizontal);
                    flexLine.j += flexItem.getFlexGrow();
                    flexLine.k += flexItem.getFlexShrink();
                    this.a.onNewFlexItemAdded(view, i16, i10, flexLine);
                    int iMax = Math.max(i11, L(view, zIsMainAxisDirectionHorizontal) + D(flexItem, zIsMainAxisDirectionHorizontal) + B(flexItem, zIsMainAxisDirectionHorizontal) + this.a.getDecorationLengthCrossAxis(view));
                    flexLine.g = Math.max(flexLine.g, iMax);
                    if (zIsMainAxisDirectionHorizontal) {
                        if (this.a.getFlexWrap() != 2) {
                            flexLine.l = Math.max(flexLine.l, view.getBaseline() + flexItem.getMarginTop());
                        } else {
                            flexLine.l = Math.max(flexLine.l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.getMarginBottom());
                        }
                    }
                    i12 = i21;
                    if (N(i16, i12, flexLine)) {
                        a(list2, flexLine, i16, i18);
                        i18 += flexLine.g;
                    }
                    i13 = i5;
                    if (i13 != -1 && list2.size() > 0) {
                        if (list2.get(list2.size() - 1).p >= i13 && i16 >= i13 && !z2) {
                            i18 = -flexLine.getCrossSize();
                            z2 = true;
                        }
                        if (i18 <= i3 && z2) {
                            i6 = iCombineMeasuredStates;
                            c0157b.b = i6;
                        } else {
                            i19 = i10;
                            i20 = iMax;
                        }
                    }
                    if (i18 <= i3) {
                    }
                    i19 = i10;
                    i20 = iMax;
                }
                i16++;
                flexItemCount = i12;
                i14 = i8;
                i17 = i9;
                arrayList = list2;
                mode = mode;
                i15 = i13;
                size = size;
            } else if (N(i16, flexItemCount, flexLine)) {
                a(arrayList, flexLine, i16, i18);
            }
            size = size;
            mode = mode;
            i8 = i14;
            i13 = i15;
            list2 = arrayList;
            i9 = i17;
            i12 = flexItemCount;
            i16++;
            flexItemCount = i12;
            i14 = i8;
            i17 = i9;
            arrayList = list2;
            mode = mode;
            i15 = i13;
            size = size;
        }
        i6 = iCombineMeasuredStates;
        c0157b.b = i6;
    }

    public void c(C0157b c0157b, int i, int i2) {
        b(c0157b, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    public void d(C0157b c0157b, int i, int i2, int i3, int i4, @Nullable List<FlexLine> list) {
        b(c0157b, i, i2, i3, i4, -1, list);
    }

    public void e(C0157b c0157b, int i, int i2, int i3, int i4, List<FlexLine> list) {
        b(c0157b, i, i2, i3, 0, i4, list);
    }

    public void f(C0157b c0157b, int i, int i2) {
        b(c0157b, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public void g(C0157b c0157b, int i, int i2, int i3, int i4, @Nullable List<FlexLine> list) {
        b(c0157b, i2, i, i3, i4, -1, list);
    }

    public void h(C0157b c0157b, int i, int i2, int i3, int i4, List<FlexLine> list) {
        b(c0157b, i2, i, i3, 0, i4, list);
    }

    public void j(List<FlexLine> list, int i) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        List<c> listL = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.b = 1;
        } else {
            cVar.b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.a.getFlexItemCount()) {
            cVar.a = flexItemCount;
        } else {
            cVar.a = i;
            while (i < flexItemCount) {
                listL.get(i).a++;
                i++;
            }
        }
        listL.add(cVar);
        return U(flexItemCount + 1, listL, sparseIntArray);
    }

    public void o(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<FlexLine> flexLinesInternal = this.a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.a.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.a.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    FlexLine flexLine = new FlexLine();
                    flexLine.g = i5;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    this.a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size4) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i4 == flexLinesInternal.size() - 2) {
                                flexLine2.g = Math.round(f2 + size3);
                                f2 = 0.0f;
                            } else {
                                flexLine2.g = Math.round(size3);
                            }
                            int i6 = flexLine2.g;
                            f2 += size3 - i6;
                            if (f2 > 1.0f) {
                                flexLine2.g = i6 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                flexLine2.g = i6 - 1;
                                f2 += 1.0f;
                            }
                            arrayList.add(flexLine2);
                        }
                        i4++;
                    }
                    this.a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.g = size5;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    this.a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        FlexLine flexLine5 = flexLinesInternal.get(i4);
                        float f4 = flexLine5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        f3 += f4 - iRound;
                        if (f3 > 1.0f) {
                            iRound++;
                            f3 -= 1.0f;
                        } else if (f3 < -1.0f) {
                            iRound--;
                            f3 += 1.0f;
                        }
                        flexLine5.g = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    public void p(int i, int i2) {
        q(i, i2, 0);
    }

    public void q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        r(this.a.getFlexItemCount());
        if (i3 >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        int flexDirection2 = this.a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.a.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.a.getLargestMainSize();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.c;
        int i5 = iArr != null ? iArr[i3] : 0;
        List<FlexLine> flexLinesInternal = this.a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i6 = i5; i6 < size2; i6++) {
            FlexLine flexLine = flexLinesInternal.get(i6);
            int i7 = flexLine.e;
            if (i7 < size && flexLine.q) {
                w(i, i2, flexLine, size, i4, false);
            } else if (i7 > size && flexLine.r) {
                T(i, i2, flexLine, size, i4, false);
            }
        }
    }

    public void s(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.c = Arrays.copyOf(iArr, i);
        }
    }

    public void t(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.d = Arrays.copyOf(jArr, i);
        }
    }

    public void u(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.e = Arrays.copyOf(jArr, i);
        }
    }

    public int x(long j) {
        return (int) (j >> 32);
    }

    public int y(long j) {
        return (int) j;
    }
}
