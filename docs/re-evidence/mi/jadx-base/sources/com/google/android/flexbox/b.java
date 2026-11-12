package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.VisibleForTesting;
import defpackage.c5f;
import defpackage.kx9;
import defpackage.ua4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx9 f8492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f8493b;
    public int[] c;
    public long[] d;
    public long[] e;

    /* JADX INFO: renamed from: com.google.android.flexbox.b$b, reason: collision with other inner class name */
    public static class C0209b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<com.google.android.flexbox.a> f8494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8495b;

        public void a() {
            this.f8494a = null;
            this.f8495b = 0;
        }
    }

    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8497b;

        public c() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i = this.f8497b;
            int i2 = cVar.f8497b;
            return i != i2 ? i - i2 : this.f8496a - cVar.f8496a;
        }

        public String toString() {
            return "Order{order=" + this.f8497b + ", index=" + this.f8496a + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public b(kx9 kx9Var) {
        this.f8492a = kx9Var;
    }

    public final int A(int i, FlexItem flexItem, int i2) {
        kx9 kx9Var = this.f8492a;
        int iG = kx9Var.g(i, kx9Var.getPaddingLeft() + this.f8492a.getPaddingRight() + flexItem.n0() + flexItem.r0() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iG);
        if (size > flexItem.f0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.f0(), View.MeasureSpec.getMode(iG));
        }
        return size < flexItem.p() ? View.MeasureSpec.makeMeasureSpec(flexItem.p(), View.MeasureSpec.getMode(iG)) : iG;
    }

    public final int B(FlexItem flexItem, boolean z) {
        return z ? flexItem.D() : flexItem.r0();
    }

    public final int C(FlexItem flexItem, boolean z) {
        return z ? flexItem.r0() : flexItem.D();
    }

    public final int D(FlexItem flexItem, boolean z) {
        return z ? flexItem.s() : flexItem.n0();
    }

    public final int E(FlexItem flexItem, boolean z) {
        return z ? flexItem.n0() : flexItem.s();
    }

    public final int F(FlexItem flexItem, boolean z) {
        return z ? flexItem.getHeight() : flexItem.getWidth();
    }

    public final int G(FlexItem flexItem, boolean z) {
        return z ? flexItem.getWidth() : flexItem.getHeight();
    }

    public final int H(boolean z) {
        return z ? this.f8492a.getPaddingBottom() : this.f8492a.getPaddingEnd();
    }

    public final int I(boolean z) {
        return z ? this.f8492a.getPaddingEnd() : this.f8492a.getPaddingBottom();
    }

    public final int J(boolean z) {
        return z ? this.f8492a.getPaddingTop() : this.f8492a.getPaddingStart();
    }

    public final int K(boolean z) {
        return z ? this.f8492a.getPaddingStart() : this.f8492a.getPaddingTop();
    }

    public final int L(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    public final int M(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    public final boolean N(int i, int i2, com.google.android.flexbox.a aVar) {
        return i == i2 - 1 && aVar.c() != 0;
    }

    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f8492a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewB = this.f8492a.b(i);
            if (viewB != null && ((FlexItem) viewB.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f8492a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.d0()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f8492a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iF = this.f8492a.f(view, i5, i6);
        if (iF > 0) {
            i4 += iF;
        }
        return i2 < i3 + i4;
    }

    public void Q(View view, com.google.android.flexbox.a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f8492a.getAlignItems();
        if (flexItem.S() != -1) {
            alignItems = flexItem.S();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f8492a.getFlexWrap() == 2) {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.s(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.s());
                    return;
                } else {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.D(), i3, i6 - flexItem.D());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.s()) - flexItem.D()) / 2;
                if (this.f8492a.getFlexWrap() != 2) {
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
                if (this.f8492a.getFlexWrap() != 2) {
                    int iMax = Math.max(aVar.l - view.getBaseline(), flexItem.s());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((aVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.D());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f8492a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.s(), i3, i4 + flexItem.s());
        } else {
            view.layout(i, i2 - flexItem.D(), i3, i4 - flexItem.D());
        }
    }

    public void R(View view, com.google.android.flexbox.a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f8492a.getAlignItems();
        if (flexItem.S() != -1) {
            alignItems = flexItem.S();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.n0(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.n0(), i4);
                    return;
                } else {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.r0(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.r0(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + c5f.b(marginLayoutParams)) - c5f.a(marginLayoutParams)) / 2;
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
            view.layout(i - flexItem.r0(), i2, i3 - flexItem.r0(), i4);
        } else {
            view.layout(i + flexItem.n0(), i2, i3 + flexItem.n0(), i4);
        }
    }

    @VisibleForTesting
    public long S(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    public final void T(int i, int i2, com.google.android.flexbox.a aVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        int i7 = aVar.e;
        float f = aVar.f8490k;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i7) {
            return;
        }
        float f3 = (i7 - i3) / f;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < aVar.h) {
            int i10 = aVar.o + i8;
            View viewE = this.f8492a.e(i10);
            if (viewE == null || viewE.getVisibility() == 8) {
                i5 = i7;
                i6 = i8;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = this.f8492a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i7;
                    int i11 = i8;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i10]);
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i10]);
                    }
                    if (this.f8493b[i10] || flexItem.T() <= 0.0f) {
                        i6 = i11;
                    } else {
                        float fT = measuredWidth - (flexItem.T() * f3);
                        if (i6 == aVar.h - 1) {
                            i6 = i11;
                            fT += f4;
                            f4 = 0.0f;
                        }
                        i6 = i11;
                        int iRound = Math.round(fT);
                        if (iRound < flexItem.p()) {
                            iRound = flexItem.p();
                            this.f8493b[i10] = true;
                            aVar.f8490k -= flexItem.T();
                            z2 = true;
                        } else {
                            f4 += fT - iRound;
                            double d = f4;
                            if (d > 1.0d) {
                                iRound++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f4 += 1.0f;
                            }
                        }
                        int iZ = z(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        Z(i10, iMakeMeasureSpec, iZ, viewE);
                        this.f8492a.i(i10, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.s() + flexItem.D() + this.f8492a.d(viewE));
                    aVar.e += measuredWidth + flexItem.n0() + flexItem.r0();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i10]);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i10]);
                    }
                    if (this.f8493b[i10] || flexItem.T() <= f2) {
                        i5 = i7;
                        i6 = i8;
                    } else {
                        float fT2 = measuredHeight3 - (flexItem.T() * f3);
                        if (i8 == aVar.h - 1) {
                            fT2 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(fT2);
                        if (iRound2 < flexItem.s0()) {
                            iRound2 = flexItem.s0();
                            this.f8493b[i10] = true;
                            aVar.f8490k -= flexItem.T();
                            i5 = i7;
                            i6 = i8;
                            z2 = true;
                        } else {
                            f4 += fT2 - iRound2;
                            i5 = i7;
                            i6 = i8;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f4 += 1.0f;
                            }
                        }
                        int iA = A(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewE.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        Z(i10, iA, iMakeMeasureSpec2, viewE);
                        this.f8492a.i(i10, viewE);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + flexItem.n0() + flexItem.r0() + this.f8492a.d(viewE));
                    aVar.e += measuredHeight3 + flexItem.s() + flexItem.D();
                }
                aVar.g = Math.max(aVar.g, iMax);
                i9 = iMax;
            }
            i8 = i6 + 1;
            i7 = i5;
            f2 = 0.0f;
        }
        int i12 = i7;
        if (!z2 || i12 == aVar.e) {
            return;
        }
        T(i, i2, aVar, i3, i4, true);
    }

    public final int[] U(int i, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (c cVar : list) {
            int i3 = cVar.f8496a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.f8497b);
            i2++;
        }
        return iArr;
    }

    public final void V(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.n0()) - flexItem.r0()) - this.f8492a.d(view), flexItem.p()), flexItem.f0());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Z(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f8492a.i(i2, view);
    }

    public final void W(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.s()) - flexItem.D()) - this.f8492a.d(view), flexItem.s0()), flexItem.t0());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Z(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f8492a.i(i2, view);
    }

    public void X() {
        Y(0);
    }

    public void Y(int i) {
        View viewE;
        if (i >= this.f8492a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f8492a.getFlexDirection();
        if (this.f8492a.getAlignItems() != 4) {
            for (com.google.android.flexbox.a aVar : this.f8492a.getFlexLinesInternal()) {
                for (Integer num : aVar.n) {
                    View viewE2 = this.f8492a.e(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        W(viewE2, aVar.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        V(viewE2, aVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List<com.google.android.flexbox.a> flexLinesInternal = this.f8492a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            com.google.android.flexbox.a aVar2 = flexLinesInternal.get(i2);
            int i3 = aVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = aVar2.o + i4;
                if (i4 < this.f8492a.getFlexItemCount() && (viewE = this.f8492a.e(i5)) != null && viewE.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                    if (flexItem.S() == -1 || flexItem.S() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(viewE, aVar2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            V(viewE, aVar2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public final void Z(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = S(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void a(List<com.google.android.flexbox.a> list, com.google.android.flexbox.a aVar, int i, int i2) {
        aVar.m = i2;
        this.f8492a.h(aVar);
        aVar.p = i;
        list.add(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(C0209b c0209b, int i, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.a> list) {
        int i6;
        int i7;
        List<com.google.android.flexbox.a> list2;
        int i8;
        View view;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i2;
        int i17 = i5;
        boolean zJ = this.f8492a.j();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<com.google.android.flexbox.a> arrayList = list == null ? new ArrayList() : list;
        c0209b.f8494a = arrayList;
        int i18 = i17 == -1 ? 1 : 0;
        int iK = K(zJ);
        int I = I(zJ);
        int iJ = J(zJ);
        int iH = H(zJ);
        com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
        int i19 = i4;
        aVar.o = i19;
        int i20 = I + iK;
        aVar.e = i20;
        int flexItemCount = this.f8492a.getFlexItemCount();
        int i21 = i18;
        int i22 = Integer.MIN_VALUE;
        int i23 = 0;
        int iCombineMeasuredStates = 0;
        int i24 = 0;
        while (i19 < flexItemCount) {
            View viewE = this.f8492a.e(i19);
            if (viewE != null) {
                if (viewE.getVisibility() == 8) {
                    aVar.i++;
                    aVar.h++;
                    if (N(i19, flexItemCount, aVar)) {
                        a(arrayList, aVar, i19, i23);
                    }
                } else {
                    if (viewE instanceof CompoundButton) {
                        v((CompoundButton) viewE);
                    }
                    FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                    int i25 = flexItemCount;
                    if (flexItem.S() == 4) {
                        aVar.n.add(Integer.valueOf(i19));
                    }
                    int iG = G(flexItem, zJ);
                    if (flexItem.c0() != -1.0f && mode == 1073741824) {
                        iG = Math.round(size * flexItem.c0());
                    }
                    if (zJ) {
                        int iG2 = this.f8492a.g(i, i20 + E(flexItem, true) + C(flexItem, true), iG);
                        int iC = this.f8492a.c(i16, iJ + iH + D(flexItem, true) + B(flexItem, true) + i23, F(flexItem, true));
                        viewE.measure(iG2, iC);
                        Z(i19, iG2, iC, viewE);
                        i7 = iG2;
                    } else {
                        int iG3 = this.f8492a.g(i16, iJ + iH + D(flexItem, false) + B(flexItem, false) + i23, F(flexItem, false));
                        int iC2 = this.f8492a.c(i, E(flexItem, false) + i20 + C(flexItem, false), iG);
                        viewE.measure(iG3, iC2);
                        Z(i19, iG3, iC2, viewE);
                        i7 = iC2;
                    }
                    this.f8492a.i(i19, viewE);
                    i(viewE, i19);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewE.getMeasuredState());
                    int i26 = i23;
                    int i27 = i20;
                    com.google.android.flexbox.a aVar2 = aVar;
                    int i28 = i19;
                    list2 = arrayList;
                    int i29 = i7;
                    if (P(viewE, mode, size, aVar.e, C(flexItem, zJ) + M(viewE, zJ) + E(flexItem, zJ), flexItem, i28, i24, arrayList.size())) {
                        i19 = i28;
                        if (aVar2.c() > 0) {
                            a(list2, aVar2, i19 > 0 ? i19 - 1 : 0, i26);
                            i23 = aVar2.g + i26;
                        } else {
                            i23 = i26;
                        }
                        if (!zJ) {
                            i8 = i2;
                            view = viewE;
                            i9 = -1;
                            if (flexItem.getWidth() == -1) {
                                kx9 kx9Var = this.f8492a;
                                view.measure(kx9Var.g(i8, kx9Var.getPaddingLeft() + this.f8492a.getPaddingRight() + flexItem.n0() + flexItem.r0() + i23, flexItem.getWidth()), i29);
                                i(view, i19);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            kx9 kx9Var2 = this.f8492a;
                            i8 = i2;
                            i9 = -1;
                            view = viewE;
                            view.measure(i29, kx9Var2.c(i8, kx9Var2.getPaddingTop() + this.f8492a.getPaddingBottom() + flexItem.s() + flexItem.D() + i23, flexItem.getHeight()));
                            i(view, i19);
                        } else {
                            i8 = i2;
                            view = viewE;
                            i9 = -1;
                        }
                        aVar = new com.google.android.flexbox.a();
                        i11 = 1;
                        aVar.h = 1;
                        i10 = i27;
                        aVar.e = i10;
                        aVar.o = i19;
                        i13 = Integer.MIN_VALUE;
                        i12 = 0;
                    } else {
                        i8 = i2;
                        i19 = i28;
                        view = viewE;
                        i9 = -1;
                        aVar = aVar2;
                        i10 = i27;
                        i11 = 1;
                        aVar.h++;
                        i12 = i24 + 1;
                        i23 = i26;
                        i13 = i22;
                    }
                    aVar.q = (aVar.q ? 1 : 0) | (flexItem.b0() != 0.0f ? i11 : 0);
                    aVar.f8491r = (aVar.f8491r ? 1 : 0) | (flexItem.T() != 0.0f ? i11 : 0);
                    int[] iArr = this.c;
                    if (iArr != null) {
                        iArr[i19] = list2.size();
                    }
                    aVar.e += M(view, zJ) + E(flexItem, zJ) + C(flexItem, zJ);
                    aVar.j += flexItem.b0();
                    aVar.f8490k += flexItem.T();
                    this.f8492a.a(view, i19, i12, aVar);
                    int iMax = Math.max(i13, L(view, zJ) + D(flexItem, zJ) + B(flexItem, zJ) + this.f8492a.d(view));
                    aVar.g = Math.max(aVar.g, iMax);
                    if (zJ) {
                        if (this.f8492a.getFlexWrap() != 2) {
                            aVar.l = Math.max(aVar.l, view.getBaseline() + flexItem.s());
                        } else {
                            aVar.l = Math.max(aVar.l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.D());
                        }
                    }
                    i14 = i25;
                    if (N(i19, i14, aVar)) {
                        a(list2, aVar, i19, i23);
                        i23 += aVar.g;
                    }
                    i15 = i5;
                    if (i15 != i9 && list2.size() > 0 && list2.get(list2.size() - i11).p >= i15 && i19 >= i15 && i21 == 0) {
                        i23 = -aVar.a();
                        i21 = i11;
                    }
                    if (i23 > i3 && i21 != 0) {
                        i6 = iCombineMeasuredStates;
                        c0209b.f8495b = i6;
                    } else {
                        i24 = i12;
                        i22 = iMax;
                    }
                }
                i19++;
                flexItemCount = i14;
                i16 = i8;
                i20 = i10;
                arrayList = list2;
                size = size;
                mode = mode;
                i17 = i15;
            } else if (N(i19, flexItemCount, aVar)) {
                a(arrayList, aVar, i19, i23);
            }
            size = size;
            mode = mode;
            i8 = i16;
            i15 = i17;
            i10 = i20;
            list2 = arrayList;
            i14 = flexItemCount;
            i19++;
            flexItemCount = i14;
            i16 = i8;
            i20 = i10;
            arrayList = list2;
            size = size;
            mode = mode;
            i17 = i15;
        }
        i6 = iCombineMeasuredStates;
        c0209b.f8495b = i6;
    }

    public void c(C0209b c0209b, int i, int i2) {
        b(c0209b, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    public void d(C0209b c0209b, int i, int i2, int i3, int i4, List<com.google.android.flexbox.a> list) {
        b(c0209b, i, i2, i3, i4, -1, list);
    }

    public void e(C0209b c0209b, int i, int i2, int i3, int i4, List<com.google.android.flexbox.a> list) {
        b(c0209b, i, i2, i3, 0, i4, list);
    }

    public void f(C0209b c0209b, int i, int i2) {
        b(c0209b, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public void g(C0209b c0209b, int i, int i2, int i3, int i4, List<com.google.android.flexbox.a> list) {
        b(c0209b, i2, i, i3, i4, -1, list);
    }

    public void h(C0209b c0209b, int i, int i2, int i3, int i4, List<com.google.android.flexbox.a> list) {
        b(c0209b, i2, i, i3, 0, i4, list);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void i(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.p()) {
            if (measuredWidth > flexItem.f0()) {
                measuredWidth = flexItem.f0();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.s0()) {
                measuredHeight = flexItem.s0();
            } else if (measuredHeight > flexItem.t0()) {
                measuredHeight = flexItem.t0();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                Z(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f8492a.i(i, view);
            }
        }
        measuredWidth = flexItem.p();
        z = true;
        if (measuredHeight < flexItem.s0()) {
            measuredHeight = flexItem.s0();
        } else if (measuredHeight > flexItem.t0()) {
            measuredHeight = flexItem.t0();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            Z(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f8492a.i(i, view);
        }
    }

    public void j(List<com.google.android.flexbox.a> list, int i) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
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

    public final List<com.google.android.flexbox.a> k(List<com.google.android.flexbox.a> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
        aVar.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final List<c> l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f8492a.b(i2).getLayoutParams();
            c cVar = new c();
            cVar.f8497b = flexItem.getOrder();
            cVar.f8496a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f8492a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f8492a.getFlexItemCount();
        List<c> listL = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f8497b = 1;
        } else {
            cVar.f8497b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.f8492a.getFlexItemCount()) {
            cVar.f8496a = flexItemCount;
        } else {
            cVar.f8496a = i;
            while (i < flexItemCount) {
                listL.get(i).f8496a++;
                i++;
            }
        }
        listL.add(cVar);
        return U(flexItemCount + 1, listL, sparseIntArray);
    }

    public void o(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.f8492a.getFlexDirection();
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
        List<com.google.android.flexbox.a> flexLinesInternal = this.f8492a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f8492a.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f8492a.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
                    aVar.g = i5;
                    flexLinesInternal.add(0, aVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f8492a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.a aVar2 = new com.google.android.flexbox.a();
                            if (i4 == flexLinesInternal.size() - 2) {
                                aVar2.g = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                aVar2.g = Math.round(size3);
                            }
                            int i6 = aVar2.g;
                            f += size3 - i6;
                            if (f > 1.0f) {
                                aVar2.g = i6 + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                aVar2.g = i6 - 1;
                                f += 1.0f;
                            }
                            arrayList.add(aVar2);
                        }
                        i4++;
                    }
                    this.f8492a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f8492a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.a aVar3 = new com.google.android.flexbox.a();
                    aVar3.g = size5;
                    for (com.google.android.flexbox.a aVar4 : flexLinesInternal) {
                        arrayList2.add(aVar3);
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar3);
                    }
                    this.f8492a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        com.google.android.flexbox.a aVar5 = flexLinesInternal.get(i4);
                        float f3 = aVar5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        aVar5.g = iRound;
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
        r(this.f8492a.getFlexItemCount());
        if (i3 >= this.f8492a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f8492a.getFlexDirection();
        int flexDirection2 = this.f8492a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.f8492a.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f8492a.getPaddingLeft();
            paddingRight = this.f8492a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.f8492a.getLargestMainSize();
            }
            paddingLeft = this.f8492a.getPaddingTop();
            paddingRight = this.f8492a.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.c;
        List<com.google.android.flexbox.a> flexLinesInternal = this.f8492a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            com.google.android.flexbox.a aVar = flexLinesInternal.get(i5);
            int i6 = aVar.e;
            if (i6 < size && aVar.q) {
                w(i, i2, aVar, size, i4, false);
            } else if (i6 > size && aVar.f8491r) {
                T(i, i2, aVar, size, i4, false);
            }
        }
    }

    public final void r(int i) {
        boolean[] zArr = this.f8493b;
        if (zArr == null) {
            this.f8493b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f8493b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public void s(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    public void t(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public void u(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int iP = flexItem.p();
        int iS0 = flexItem.s0();
        Drawable drawableA = ua4.a(compoundButton);
        int minimumWidth = drawableA == null ? 0 : drawableA.getMinimumWidth();
        int minimumHeight = drawableA != null ? drawableA.getMinimumHeight() : 0;
        if (iP == -1) {
            iP = minimumWidth;
        }
        flexItem.m0(iP);
        if (iS0 == -1) {
            iS0 = minimumHeight;
        }
        flexItem.Z(iS0);
    }

    public final void w(int i, int i2, com.google.android.flexbox.a aVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        double d;
        int i7;
        double d2;
        float f = aVar.j;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = aVar.e)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < aVar.h) {
            int i10 = aVar.o + i8;
            View viewE = this.f8492a.e(i10);
            if (viewE == null || viewE.getVisibility() == 8) {
                i6 = i5;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = this.f8492a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i11 = i5;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i10]);
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    i6 = i11;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i10]);
                    }
                    if (!this.f8493b[i10] && flexItem.b0() > 0.0f) {
                        float fB0 = measuredWidth + (flexItem.b0() * f3);
                        if (i8 == aVar.h - 1) {
                            fB0 += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fB0);
                        if (iRound > flexItem.f0()) {
                            iRound = flexItem.f0();
                            this.f8493b[i10] = true;
                            aVar.j -= flexItem.b0();
                            z2 = true;
                        } else {
                            f4 += fB0 - iRound;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int iZ = z(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        Z(i10, iMakeMeasureSpec, iZ, viewE);
                        this.f8492a.i(i10, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.s() + flexItem.D() + this.f8492a.d(viewE));
                    aVar.e += measuredWidth + flexItem.n0() + flexItem.r0();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i10]);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i10]);
                    }
                    if (this.f8493b[i10] || flexItem.b0() <= f2) {
                        i7 = i5;
                    } else {
                        float fB1 = measuredHeight3 + (flexItem.b0() * f3);
                        if (i8 == aVar.h - 1) {
                            fB1 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(fB1);
                        if (iRound2 > flexItem.t0()) {
                            iRound2 = flexItem.t0();
                            this.f8493b[i10] = true;
                            aVar.j -= flexItem.b0();
                            i7 = i5;
                            z2 = true;
                        } else {
                            f4 += fB1 - iRound2;
                            i7 = i5;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int iA = A(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewE.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        Z(i10, iA, iMakeMeasureSpec2, viewE);
                        this.f8492a.i(i10, viewE);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + flexItem.n0() + flexItem.r0() + this.f8492a.d(viewE));
                    aVar.e += measuredHeight3 + flexItem.s() + flexItem.D();
                    i6 = i7;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i9 = iMax;
            }
            i8++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i12 = i5;
        if (!z2 || i12 == aVar.e) {
            return;
        }
        w(i, i2, aVar, i3, i4, true);
    }

    public int x(long j) {
        return (int) (j >> 32);
    }

    public int y(long j) {
        return (int) j;
    }

    public final int z(int i, FlexItem flexItem, int i2) {
        kx9 kx9Var = this.f8492a;
        int iC = kx9Var.c(i, kx9Var.getPaddingTop() + this.f8492a.getPaddingBottom() + flexItem.s() + flexItem.D() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iC);
        if (size > flexItem.t0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.t0(), View.MeasureSpec.getMode(iC));
        }
        return size < flexItem.s0() ? View.MeasureSpec.makeMeasureSpec(flexItem.s0(), View.MeasureSpec.getMode(iC)) : iC;
    }
}
