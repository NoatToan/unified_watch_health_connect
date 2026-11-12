package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.functionsetcard.view.RatioRelativeLayout;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Float[], Integer[]> f33759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Float[], Integer[]> f33760c;
    private static final int[] e = {81, 98};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f33758a = {81, 46};
    private static Map<Float[], Integer[]> d = new HashMap();
    private static Map<Float[], Integer[]> i = new HashMap();

    static {
        Map<Float[], Integer[]> map = d;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        map.put(new Float[]{fValueOf, fValueOf2}, new Integer[]{1, 1});
        Map<Float[], Integer[]> map2 = d;
        Float fValueOf3 = Float.valueOf(1.3f);
        map2.put(new Float[]{fValueOf2, fValueOf3}, new Integer[]{81, 98});
        Map<Float[], Integer[]> map3 = d;
        Float fValueOf4 = Float.valueOf(1.45f);
        map3.put(new Float[]{fValueOf3, fValueOf4}, new Integer[]{81, 104});
        Map<Float[], Integer[]> map4 = d;
        Float fValueOf5 = Float.valueOf(1.75f);
        map4.put(new Float[]{fValueOf4, fValueOf5}, new Integer[]{81, 127});
        Map<Float[], Integer[]> map5 = d;
        Float fValueOf6 = Float.valueOf(2.0f);
        map5.put(new Float[]{fValueOf5, fValueOf6}, new Integer[]{81, 131});
        Map<Float[], Integer[]> map6 = d;
        Float fValueOf7 = Float.valueOf(3.2f);
        map6.put(new Float[]{fValueOf6, fValueOf7}, new Integer[]{81, 131});
        i.put(new Float[]{fValueOf, fValueOf2}, new Integer[]{Integer.valueOf(MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY), 75});
        i.put(new Float[]{fValueOf2, fValueOf3}, new Integer[]{81, 46});
        i.put(new Float[]{fValueOf3, fValueOf4}, new Integer[]{81, 49});
        i.put(new Float[]{fValueOf4, fValueOf5}, new Integer[]{81, 88});
        i.put(new Float[]{fValueOf5, fValueOf6}, new Integer[]{81, 92});
        i.put(new Float[]{fValueOf6, fValueOf7}, new Integer[]{81, 92});
        f33759b = new HashMap();
        f33760c = new HashMap();
        f33759b.put(new Float[]{fValueOf, fValueOf2}, new Integer[]{1, 1});
        Map<Float[], Integer[]> map7 = f33759b;
        Float fValueOf8 = Float.valueOf(1.15f);
        map7.put(new Float[]{fValueOf2, fValueOf8}, new Integer[]{158, Integer.valueOf(PsExtractor.PRIVATE_STREAM_1)});
        f33759b.put(new Float[]{fValueOf8, fValueOf3}, new Integer[]{158, 201});
        Map<Float[], Integer[]> map8 = f33759b;
        Float fValueOf9 = Float.valueOf(5.0f);
        map8.put(new Float[]{fValueOf3, fValueOf9}, new Integer[]{158, Integer.valueOf(com.huawei.hms.kit.awareness.barrier.internal.e.a.D)});
        f33760c.put(new Float[]{fValueOf, fValueOf2}, new Integer[]{4, 5});
        f33760c.put(new Float[]{fValueOf2, fValueOf8}, new Integer[]{158, Integer.valueOf(com.huawei.hms.kit.awareness.barrier.internal.e.a.w)});
        f33760c.put(new Float[]{fValueOf8, fValueOf3}, new Integer[]{158, 222});
        f33760c.put(new Float[]{fValueOf3, fValueOf9}, new Integer[]{158, 231});
    }

    public static void b(Context context, RatioRelativeLayout ratioRelativeLayout, ImageView imageView, boolean z, boolean z2) {
        int i2;
        int[] iArrE = e(context);
        if (iArrE.length == 2 && (i2 = iArrE[0]) != 0) {
            ratioRelativeLayout.setWeight(i2, iArrE[1]);
        } else {
            ratioRelativeLayout.setWeight(1, 1);
        }
        if (z2) {
            return;
        }
        ratioRelativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new a(ratioRelativeLayout, imageView));
    }

    public static int[] e(Context context) {
        int[] iArr = new int[2];
        if (context != null) {
            int[] iArr2 = new int[2];
            float fI = qrs.i();
            if ((LanguageUtil.f(context) || LanguageUtil.q(context)) && !fua.b(context)) {
                b(f33759b, iArr2, fI);
            } else {
                b(f33760c, iArr2, fI);
            }
            if (qrs.x() && fI <= 1.0d) {
                iArr2 = e;
            }
            if (iArr2[0] != 0 && iArr2[1] != 0) {
                return iArr2;
            }
        }
        return iArr;
    }

    private static void b(Map<Float[], Integer[]> map, int[] iArr, float f) {
        for (Map.Entry<Float[], Integer[]> entry : map.entrySet()) {
            Float[] key = entry.getKey();
            if (f - key[0].floatValue() > Math.pow(10.0d, -6.0d) && f - key[1].floatValue() < Math.pow(10.0d, -6.0d)) {
                Integer[] value = entry.getValue();
                iArr[0] = value[0].intValue();
                iArr[1] = value[1].intValue();
                return;
            }
        }
    }

    public static int b(Context context) {
        int i2 = i(context);
        return (i2 - c(context, i2)) / 2;
    }

    public static int c(Context context) {
        return qqp.b(context);
    }

    public static int c(Context context, int i2) {
        int iB = qqp.b(context);
        LogUtil.a("FunctionSetCardSizeUtil", "getFunctionSetCardBottom: ", Integer.valueOf(iB));
        return (i2 - iB) % 2 == 0 ? iB : iB + 1;
    }

    public static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
    }

    public static int d(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
    }

    public static int i(Context context) {
        int iIntValue;
        int i2;
        int i3;
        int iA = a(context);
        int iD = d(context);
        int iC = c(context);
        if (qrs.af(BaseApplication.j())) {
            iIntValue = iA + iD + (iC * 3);
            i2 = 4;
        } else {
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            iIntValue = iA + iD + ((Integer) safeRegionWidth.first).intValue() + ((Integer) safeRegionWidth.second).intValue() + iC;
            i2 = 2;
        }
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        int i5 = i4 - iIntValue;
        if (i5 % 2 == 0) {
            i3 = i5 / i2;
        } else {
            i3 = (i5 + 1) / i2;
        }
        LogUtil.a("FunctionSetCardSizeUtil", "screenWidth: ", Integer.valueOf(i4), " margin:", Integer.valueOf(iIntValue), " width: ", Integer.valueOf(i3));
        return i3;
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f33761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RatioRelativeLayout f33762c;

        public a(RatioRelativeLayout ratioRelativeLayout, ImageView imageView) {
            this.f33762c = ratioRelativeLayout;
            this.f33761b = imageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LogUtil.a("FunctionSetCardSizeUtil", "onGlobalLayout");
            this.f33762c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ImageView imageView = this.f33761b;
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    int width = this.f33762c.getWidth();
                    LogUtil.a("FunctionSetCardSizeUtil", "getWidth: ", Integer.valueOf(width));
                    layoutParams2.height = width;
                    this.f33761b.setLayoutParams(layoutParams2);
                }
            }
        }
    }
}
