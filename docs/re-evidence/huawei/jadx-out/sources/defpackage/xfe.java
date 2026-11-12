package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Ascii;
import com.huawei.uikit.hwrecyclerview.layoutmanager.HwFloatingBubbleLayout;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xfe {
    public static List<xff> b(int i, int i2, int i3, int i4, int i5) {
        if (i5 + i4 >= i2) {
            if (i4 > i2) {
                Log.w("HwFloatingBubblesCalculationUtils", "calculateViewLocations: the diameter is invalid");
                i4 = i2;
                i5 = 0;
            } else {
                i5 = i2 - i4;
                Log.w("HwFloatingBubblesCalculationUtils", "calculateViewLocations: the margin is invalid");
            }
        }
        List<xff> listA = a(i, i2, i4, i5);
        int iE = listA.size() > 0 ? listA.get(0).e() - listA.get(0).a() : 0;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < listA.size(); i7++) {
            xff xffVar = listA.get(i7);
            int iE2 = xffVar.e() - iE;
            i6 = (i6 == Integer.MIN_VALUE || iE2 - i6 >= 50) ? iE2 : i6 + 50;
            xffVar.a(i6);
        }
        return listA;
    }

    private static List<xff> a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        int i5 = i3 / 2;
        arrayList.add(new xff((int) ((Math.random() * ((double) (i2 - (i5 * 2)))) + ((double) i5)), i5, i5));
        int i6 = (int) ((i3 + i4) * 0.8f);
        ArrayList arrayList2 = new ArrayList();
        int i7 = 1;
        while (true) {
            int i8 = 0;
            while (i7 <= i) {
                int i9 = i7 - 1;
                int iE = ((xff) arrayList.get(i9)).e();
                int iRandom = ((int) (Math.random() * ((double) (i5 + i4)))) + iE + i8;
                arrayList2.clear();
                arrayList2.add(new int[]{i5, i2 - i5});
                int iE2 = iRandom - iE;
                while (i9 >= 0 && iE2 < i6) {
                    xff xffVar = (xff) arrayList.get(i9);
                    int i10 = i5;
                    int i11 = i6;
                    int iSqrt = (int) Math.sqrt(Math.pow(i6, 2.0d) - Math.pow(iE2, 2.0d));
                    d(arrayList2, xffVar.b() + iSqrt, xffVar.b() - iSqrt);
                    i9--;
                    if (i9 >= 0) {
                        iE2 = iRandom - ((xff) arrayList.get(i9)).e();
                    }
                    i6 = i11;
                    i5 = i10;
                }
                int i12 = i5;
                int i13 = i6;
                if (arrayList2.size() == 0) {
                    i8 += i4;
                    i6 = i13;
                    i5 = i12;
                } else {
                    arrayList.add(i7, new xff(d(arrayList2), iRandom, i12));
                    i7++;
                    i6 = i13;
                    i5 = i12;
                }
            }
            return arrayList;
        }
    }

    private static int d(List<int[]> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int[] iArr = list.get(i2);
            i += iArr[1] - iArr[0];
        }
        int iNextInt = new SecureRandom().nextInt(1) * i;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int[] iArr2 = list.get(i3);
            int i4 = iArr2[1];
            int i5 = iArr2[0];
            int i6 = i4 - i5;
            if (iNextInt <= i6) {
                return i5 + iNextInt;
            }
            iNextInt -= i6;
        }
        return iNextInt;
    }

    private static void d(List<int[]> list, int i, int i2) {
        int i3;
        int i4 = 0;
        boolean z = true;
        while (i4 < list.size()) {
            int[] iArr = list.get(i4);
            if (z) {
                int i5 = iArr[0];
                if (i2 >= i5) {
                    if (i2 <= i5 || i2 >= iArr[1]) {
                        i4++;
                    } else {
                        list.set(i4, new int[]{i5, i2});
                        i4++;
                        list.add(i4, new int[]{i2, iArr[1]});
                    }
                }
                z = false;
            } else {
                int i6 = iArr[0];
                if (i < i6) {
                    i4++;
                } else {
                    if (i > i6 && i < (i3 = iArr[1])) {
                        list.set(i4, new int[]{i, i3});
                        return;
                    }
                    list.remove(i4);
                }
            }
        }
    }

    public static void e(RecyclerView.LayoutManager layoutManager, View view, float f, xfg xfgVar) {
        float translationY = view.getTranslationY() + (view.getHeight() * 0.5f) + view.getTop();
        if (Float.compare(translationY, layoutManager.getHeight()) < 0 && Float.compare(translationY, 0.0f) > 0) {
            float fB = b(xfgVar, view, Math.abs(translationY - f) / f);
            view.setScaleY(fB);
            view.setScaleX(fB);
        } else {
            view.setScaleY(0.0f);
            view.setScaleX(0.0f);
        }
        b(view, layoutManager.getWidth());
    }

    public static void b(View view, int i) {
        float fA;
        Drawable background = view.getBackground();
        if (background instanceof xcu) {
            xcu xcuVar = (xcu) background;
            fA = xcuVar.a();
            xcuVar.b(i, view.getLeft(), view.getTop(), view.getScaleX());
        } else {
            fA = 1.0f;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    float f = (1.286f * fA) - 0.286f;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    childAt.setAlpha(f);
                }
            }
        }
    }

    private static float b(float f, float f2, float f3) {
        if (Float.compare(f2, 0.0f) == 0 || Float.compare(f3, 0.0f) == 0) {
            return f;
        }
        if (Float.compare(f2, 1.0f) == 1) {
            return 0.3f;
        }
        return ((0.3f - f) * f2) + f;
    }

    public static int[][] b(boolean z, int i, RecyclerView.LayoutManager layoutManager, xfg xfgVar) {
        int childCount = layoutManager.getChildCount();
        double[] dArr = new double[childCount];
        double[] dArr2 = new double[childCount];
        for (int i2 = 0; i2 < childCount; i2++) {
            dArr[i2] = 0.0d;
            dArr2[i2] = i;
        }
        c(z, layoutManager, xfgVar, dArr, dArr2);
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, childCount);
        for (int i3 = 0; i3 < childCount; i3++) {
            iArr[0][i3] = (int) dArr[i3];
            iArr[1][i3] = (int) dArr2[i3];
        }
        return iArr;
    }

    private static void c(boolean z, RecyclerView.LayoutManager layoutManager, xfg xfgVar, double[] dArr, double[] dArr2) {
        int childCount = layoutManager.getChildCount();
        int height = layoutManager.getHeight();
        if (height == 0) {
            return;
        }
        float f = height / 2.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                double d = f;
                a(i, childAt, b(xfgVar, childAt, (float) (Math.abs((((double) ((childAt.getTop() + (childAt.getHeight() / 2.0f)) + (z ? 0.0f : childAt.getTranslationY()))) + dArr2[i]) - d) / d)), layoutManager, dArr);
                b(layoutManager, xfgVar, dArr, dArr2, i);
            }
        }
    }

    private static void b(RecyclerView.LayoutManager layoutManager, xfg xfgVar, double[] dArr, double[] dArr2, int i) {
        float f;
        float f2;
        char c2;
        View view;
        int i2;
        float f3;
        float f4;
        int i3;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        int i4 = i;
        int childCount = layoutManager.getChildCount();
        View childAt = layoutManager2.getChildAt(i4);
        float height = childAt.getHeight();
        char c3 = Ascii.MIN;
        float f5 = height / 2.0f;
        float height2 = layoutManager.getHeight() / 2.0f;
        float left = childAt.getLeft();
        float translationX = childAt.getTranslationX();
        float translationY = childAt.getTranslationY();
        float top = childAt.getTop();
        int i5 = i4 + 1;
        while (i5 < childCount) {
            View childAt2 = layoutManager2.getChildAt(i5);
            if (childAt2 == null) {
                f2 = top;
                i3 = i5;
                i2 = childCount;
                view = childAt;
                c2 = c3;
                f = f5;
                f3 = height2;
                f4 = left;
            } else {
                double d = ((double) (translationY + top + f5)) + dArr2[i4];
                f = f5;
                double d2 = height2;
                f2 = top;
                float fB = b(xfgVar, childAt, (float) (Math.abs(d - d2) / d2));
                float height3 = childAt2.getHeight();
                c2 = Ascii.MIN;
                float f6 = height3 / 2.0f;
                int i6 = childCount;
                view = childAt;
                double translationY2 = ((double) (childAt2.getTranslationY() + childAt2.getTop() + f6)) + dArr2[i5];
                i2 = i6;
                double translationX2 = ((double) (childAt2.getTranslationX() + childAt2.getLeft() + f6)) + dArr[i5];
                float fB2 = b(xfgVar, childAt2, (float) (Math.abs(translationY2 - d2) / d2));
                double d3 = ((double) (left + f + translationX)) + dArr[i4];
                f3 = height2;
                f4 = left;
                double d4 = d3 - translationX2;
                i3 = i5;
                double d5 = d - translationY2;
                double dPow = Math.pow(d4, 2.0d) + Math.pow(d5, 2.0d);
                double d6 = fB * f;
                double d7 = fB2 * f6;
                double d8 = d6 + d7;
                float fB3 = b(xfgVar, view, childAt2);
                if (Double.compare(dPow, Math.pow(((double) (1.0f - fB3)) * d8, 2.0d)) == -1) {
                    double dSqrt = Math.sqrt(dPow);
                    if (Double.compare(dSqrt, 0.0d) == 0 || Double.compare(d8, 0.0d) == 0) {
                        return;
                    }
                    double d9 = d8 - dSqrt;
                    double d10 = fB3;
                    double d11 = ((d9 * d7) - ((d7 * d10) * d8)) / d8;
                    double d12 = (d11 * d4) / dSqrt;
                    double d13 = (d11 * d5) / dSqrt;
                    double dE = e(layoutManager, d3, d6, d12);
                    int iCompare = Double.compare(d13, 0.0d);
                    double dAbs = Math.abs(dE);
                    double d14 = iCompare == 1 ? d13 + dAbs : d13 - dAbs;
                    double d15 = -(((d9 * d6) - ((d6 * d10) * d8)) / d8);
                    double d16 = (d4 * d15) / dSqrt;
                    double d17 = (d15 * d5) / dSqrt;
                    double dE2 = e(layoutManager, translationX2, d7, d16);
                    double dAbs2 = Double.compare(d17, 0.0d) == 1 ? d17 + Math.abs(dE2) : d17 - Math.abs(dE2);
                    double dC = c(view, childAt2, d14, dAbs2);
                    dArr[i] = dArr[i] + d12 + dE;
                    dArr2[i] = dArr2[i] + d14 + dC;
                    dArr[i3] = dArr[i3] + d16 + dE2;
                    dArr2[i3] = dArr2[i3] + dAbs2 + dC;
                } else {
                    continue;
                }
            }
            i5 = i3 + 1;
            layoutManager2 = layoutManager;
            i4 = i;
            c3 = c2;
            f5 = f;
            childAt = view;
            childCount = i2;
            top = f2;
            height2 = f3;
            left = f4;
        }
    }

    private static double c(View view, View view2, double d, double d2) {
        double d3 = view.isSelected() ? 0.0d + (-d) : 0.0d;
        return view2.isSelected() ? d3 + (-d2) : d3;
    }

    private static float b(xfg xfgVar, View view, View view2) {
        float fA = xfgVar.a();
        if (view.isSelected() || view2.isSelected()) {
            return 0.0f;
        }
        return fA;
    }

    private static double e(RecyclerView.LayoutManager layoutManager, double d, double d2, double d3) {
        double d4 = d - d2;
        if (e(layoutManager.getPaddingLeft(), d4 + d3)) {
            return (((double) layoutManager.getPaddingLeft()) - d4) - d3;
        }
        double d5 = d + d2;
        if (e(d5 + d3, layoutManager.getWidth() - layoutManager.getPaddingRight())) {
            return (((double) (layoutManager.getWidth() - layoutManager.getPaddingRight())) - d5) - d3;
        }
        return 0.0d;
    }

    private static void a(int i, View view, float f, RecyclerView.LayoutManager layoutManager, double[] dArr) {
        int width = view.getWidth() >> 1;
        int left = view.getLeft() + width;
        int i2 = (int) (width * f);
        double d = left - i2;
        if (e(layoutManager.getPaddingLeft(), d)) {
            dArr[i] = (dArr[i] + ((double) layoutManager.getPaddingLeft())) - d;
            return;
        }
        double d2 = left + i2;
        if (e(d2, layoutManager.getWidth() - layoutManager.getPaddingRight())) {
            dArr[i] = ((dArr[i] + ((double) layoutManager.getWidth())) - ((double) layoutManager.getPaddingRight())) - d2;
        }
    }

    private static boolean e(double d, double d2) {
        return Double.compare(d, d2) == 1;
    }

    public static float b(xfg xfgVar, View view, float f) {
        float fB = b(xfgVar.e(), f, xfgVar.h() * (view instanceof HwFloatingBubbleLayout ? ((HwFloatingBubbleLayout) view).getRandomFactor() : 1.0f));
        return view.isSelected() ? fB * xfgVar.b() : fB;
    }
}
