package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class mfq {
    public static c e(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c cVar = new c();
        cVar.f41627c = str;
        if (z) {
            cVar.e = 452984831;
        } else {
            cVar.e = 251658240;
        }
        cVar.d = 12.0f;
        cVar.f41625a = -25.0f;
        return cVar;
    }

    public static void a(c cVar, Activity activity, int i) {
        if (activity == null || cVar == null) {
            LogUtil.j("HwSecureWaterMark", "activity or watermarkDrawable is null");
            return;
        }
        if (i == -1) {
            View viewFindViewById = activity.findViewById(1000);
            View decorView = activity.getWindow().getDecorView();
            if (viewFindViewById != null && (viewFindViewById instanceof FrameLayout) && (decorView instanceof FrameLayout)) {
                ((FrameLayout) decorView).removeView((FrameLayout) viewFindViewById);
            }
        } else {
            View viewFindViewById2 = activity.findViewById(1000);
            if (viewFindViewById2 != null && (viewFindViewById2 instanceof FrameLayout)) {
                FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(i);
                if (viewGroup != null) {
                    viewGroup.removeView(frameLayout);
                }
            }
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        if (b(activity)) {
            frameLayout2.setAlpha(0.1f);
        }
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setBackground(cVar);
        frameLayout2.setId(1000);
        if (i == -1) {
            View decorView2 = activity.getWindow().getDecorView();
            if (decorView2 instanceof FrameLayout) {
                ((FrameLayout) decorView2).addView(frameLayout2);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(i);
        if (viewGroup2 != null) {
            viewGroup2.addView(frameLayout2);
        }
    }

    public static void a(c cVar, Activity activity, ViewGroup viewGroup) {
        if (activity == null || cVar == null || viewGroup == null) {
            LogUtil.j("HwSecureWaterMark", "activity or watermarkDrawable is null");
            return;
        }
        View viewFindViewById = viewGroup.findViewById(1000);
        if (viewFindViewById != null && (viewFindViewById instanceof FrameLayout)) {
            viewGroup.removeView((FrameLayout) viewFindViewById);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        if (b(activity)) {
            frameLayout.setAlpha(0.1f);
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(cVar);
        frameLayout.setId(1000);
        viewGroup.addView(frameLayout);
    }

    private static boolean b(Activity activity) {
        AccessibilityManager accessibilityManager;
        if (activity == null || !(activity.getSystemService("accessibility") instanceof AccessibilityManager) || (accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility")) == null) {
            return false;
        }
        try {
            Method method = accessibilityManager.getClass().getMethod("isHighTextContrastEnabled", null);
            if (method == null) {
                return false;
            }
            Object objInvoke = method.invoke(accessibilityManager, null);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (NoSuchMethodException unused) {
            LogUtil.e("HwSecureWaterMark", "NoSuchMethodException");
            return false;
        } catch (Exception unused2) {
            LogUtil.e("HwSecureWaterMark", "Exception");
            return false;
        }
    }

    public static class c extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f41625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Paint f41626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f41627c;
        private float d;
        private int e;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        private c() {
            this.f41626b = new Paint();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (canvas == null) {
                return;
            }
            this.f41626b.reset();
            this.f41626b.setTextSize(BaseApplication.getContext().getResources().getDisplayMetrics().density * this.d);
            this.f41626b.setAntiAlias(true);
            int i = 0;
            this.f41626b.setTypeface(Typeface.create(Constants.FONT, 0));
            this.f41626b.setColor(this.e);
            canvas.drawColor(0);
            canvas.rotate(this.f41625a);
            int i2 = getBounds().right;
            int i3 = getBounds().bottom;
            int iSqrt = (int) Math.sqrt((i2 * i2) + (i3 * i3));
            if (iSqrt == 0) {
                return;
            }
            float fMeasureText = this.f41626b.measureText(this.f41627c);
            LogUtil.a("HwSecureWaterMark", " drawText with:", this.f41627c);
            if (TextUtils.isEmpty(this.f41627c)) {
                return;
            }
            LogUtil.a("HwSecureWaterMark", "start drawText");
            int i4 = iSqrt / 10;
            int i5 = i4;
            while (i5 <= iSqrt) {
                float f = -i2;
                float f2 = i % 2;
                while (true) {
                    int i6 = (int) (f + (f2 * fMeasureText));
                    if (i6 < i2) {
                        f = i6;
                        canvas.drawText(this.f41627c, f, i5, this.f41626b);
                        f2 = 2.0f;
                    }
                }
                i5 += i4;
                i++;
            }
            LogUtil.a("HwSecureWaterMark", "end drawText");
            canvas.save();
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            LogUtil.d("HwSecureWaterMark", "setAlpha");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            LogUtil.d("HwSecureWaterMark", "setColorFilter");
        }
    }
}
