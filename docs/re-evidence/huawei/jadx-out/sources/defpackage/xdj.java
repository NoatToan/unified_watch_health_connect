package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwadvancednumberpicker.R;
import com.huawei.uikit.hwadvancednumberpicker.utils.HwFormatter;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xdj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HwFormatter f52732b = new c();
    public static final LruCache<String, Bitmap> e = new LruCache<>(62);
    public static final LruCache<String, Bitmap> d = new LruCache<>(62);

    class b implements Runnable {
        final /* synthetic */ View d;

        b(View view) {
            this.d = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.isAccessibilityFocused()) {
                return;
            }
            this.d.sendAccessibilityEvent(8);
        }
    }

    class c implements HwFormatter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f52733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Formatter f52734c;
        final StringBuffer e;

        c() {
            StringBuffer stringBuffer = new StringBuffer(10);
            this.e = stringBuffer;
            this.f52734c = new Formatter(stringBuffer, Locale.ENGLISH);
            this.f52733b = new Object[1];
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.utils.HwFormatter
        public String format(int i) {
            this.f52733b[0] = Integer.valueOf(i);
            if (this.e.length() > 0) {
                StringBuffer stringBuffer = this.e;
                stringBuffer.delete(0, stringBuffer.length());
            }
            this.f52734c.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.f52733b);
            return this.f52734c.toString();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f52735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52736c;
        public int d;
        public String e;
    }

    class e extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f52738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f52739c;
        final /* synthetic */ HwAdvancedNumberPicker d;
        final /* synthetic */ Context e;

        e(View view, Context context, HwAdvancedNumberPicker hwAdvancedNumberPicker, HashMap map, int i) {
            this.f52739c = view;
            this.e = context;
            this.d = hwAdvancedNumberPicker;
            this.f52738b = map;
            this.f52737a = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (accessibilityNodeInfo == null || this.f52739c == null || view == null || view.getId() != this.f52739c.getId()) {
                return;
            }
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            HashMap map;
            if (view == null || accessibilityEvent == null || this.e == null || this.d == null || this.f52739c == null || (map = this.f52738b) == null || map.size() == 0) {
                return;
            }
            if (accessibilityEvent.getEventType() == 65536) {
                xdj.c(view, this.f52737a, (HashMap<Integer, String>) this.f52738b, this.f52739c);
            } else if (accessibilityEvent.getEventType() == 32768) {
                xdj.e(this.e, this.d);
            } else {
                Log.i("HwAdvancedNumberPicker", "nothing to do");
            }
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public static float a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float a(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i) {
        if (i == 3) {
            return 0.0f;
        }
        return i == 5 ? hwAdvancedNumberPicker.getWidth() : hwAdvancedNumberPicker.getWidth() / 2.0f;
    }

    public static int a(int i, int i2) {
        return i2 == -1 ? i : e(i, i2);
    }

    public static int a(Context context, int i) {
        return (int) context.getResources().getDimension(i);
    }

    public static Bitmap a(LruCache<String, Bitmap> lruCache, String str, Paint paint) {
        String str2 = str + SampleEvent.SEPARATOR + paint.getColor() + SampleEvent.SEPARATOR + paint.getTextSize();
        Bitmap bitmap = lruCache.get(str2);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapE = e(str, paint);
        lruCache.put(str2, bitmapE);
        return bitmapE;
    }

    public static Paint a(Context context, int i, float f) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        xde.b(xde.a(context), paint);
        paint.setColor(i);
        paint.setTextSize(f);
        return paint;
    }

    public static void a(Context context, HwAdvancedNumberPicker hwAdvancedNumberPicker, MotionEvent motionEvent) {
        if (motionEvent == null || c(context, hwAdvancedNumberPicker, motionEvent) || !hwAdvancedNumberPicker.n()) {
            hwAdvancedNumberPicker.d(0);
        } else {
            hwAdvancedNumberPicker.d(xcz.f52722a);
        }
    }

    public static void a(MotionEvent motionEvent, HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            hwAdvancedNumberPicker.a();
        }
    }

    public static void a(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    public static void a(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        hwAdvancedNumberPicker.requestLayout();
        hwAdvancedNumberPicker.invalidate();
    }

    public static void a(HwAdvancedNumberPicker hwAdvancedNumberPicker, View view, int i) {
        if (hwAdvancedNumberPicker.isHapticFeedbackEnabled()) {
            xei.c(view, i, 0);
        }
    }

    public static void a(HashMap<Integer, String> map, View view, View view2) {
        if (map == null || view == null || view2 == null || map.size() <= 6) {
            return;
        }
        if (TextUtils.isEmpty(map.get(0)) && TextUtils.isEmpty(map.get(1)) && TextUtils.isEmpty(map.get(2))) {
            view.setImportantForAccessibility(2);
        } else {
            view.setImportantForAccessibility(1);
        }
        if (TextUtils.isEmpty(map.get(4)) && TextUtils.isEmpty(map.get(5)) && TextUtils.isEmpty(map.get(6))) {
            view2.setImportantForAccessibility(2);
        } else {
            view2.setImportantForAccessibility(1);
        }
    }

    public static boolean a(HwAdvancedNumberPicker hwAdvancedNumberPicker, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return true;
        }
        hwAdvancedNumberPicker.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public static boolean a(xea xeaVar, float f) {
        if (xeaVar != null) {
            boolean zI = xeaVar.i();
            float fD = xeaVar.d();
            boolean z = Float.compare(fD * f, 0.0f) >= 0;
            if (!zI && z && Math.abs(f) <= Math.abs(fD)) {
                return false;
            }
        }
        return true;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f + (f2 * f4 * f5) + (f3 * 0.75f);
    }

    public static String b(HwAdvancedNumberPicker hwAdvancedNumberPicker, String str, Paint paint, boolean z) {
        return z ? TextUtils.ellipsize(str, new TextPaint(paint), (hwAdvancedNumberPicker.getWidth() - hwAdvancedNumberPicker.getPaddingLeft()) - hwAdvancedNumberPicker.getPaddingRight(), TextUtils.TruncateAt.END).toString() : str;
    }

    public static void b(int i, String str, View view, View view2, int i2) {
        if (str == null || view == null || view2 == null) {
            return;
        }
        if (i == i2 + 1) {
            view.setContentDescription(str);
        }
        if (i == i2 - 1) {
            view2.setContentDescription(str);
        }
    }

    public static void b(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        hwAdvancedNumberPicker.o();
        hwAdvancedNumberPicker.b();
        hwAdvancedNumberPicker.f();
    }

    public static void b(HwAdvancedNumberPicker hwAdvancedNumberPicker, AccessibilityManager accessibilityManager, boolean z) {
        if (!z || hwAdvancedNumberPicker == null || accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        hwAdvancedNumberPicker.sendAccessibilityEvent(16384);
    }

    public static void b(HwAdvancedNumberPicker hwAdvancedNumberPicker, String str, long j) {
        if (hwAdvancedNumberPicker == null || hwAdvancedNumberPicker.getContext() == null || !hwAdvancedNumberPicker.isHapticFeedbackEnabled() || TextUtils.isEmpty(str)) {
            return;
        }
        xei.c(str, j);
    }

    public static void b(xea xeaVar, int i) {
        if (Math.abs(i) >= 1) {
            if (i < 0) {
                xeaVar.b(0, 0, i);
            } else {
                xeaVar.b(0, i, 0);
            }
        }
    }

    public static double c(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = i * 2;
        int i10 = i + i2;
        int i11 = i10 - i9;
        if (i4 >= 0) {
            i8 = i10 - i3;
            int i12 = i5 - i8;
            i6 = i12 >= 0 ? i12 : 0;
            i7 = i2 - i11;
        } else {
            i5 = -i5;
            int i13 = i3 - i11;
            int i14 = i5 - i13;
            i6 = i14 >= 0 ? i14 : 0;
            i7 = i10 - i2;
            i8 = i13;
        }
        if (i9 == 0 || i5 == 0) {
            return 0.0d;
        }
        return ((double) ((((i6 / i9) * i9) + i8) + i7)) / ((double) i5);
    }

    public static float c(Bitmap bitmap, int i, float f, int i2) {
        if (i == 3) {
            return f + i2;
        }
        return i == 5 ? (f - bitmap.getWidth()) - i2 : f - (bitmap.getWidth() / 2.0f);
    }

    public static int c(int i, int i2, int i3, HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        if (i == -1) {
            return i2;
        }
        if (i <= i2) {
            i = i2;
        }
        return FrameLayout.resolveSizeAndState(i, i3, 0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[Catch: IOException -> 0x0069, TRY_LEAVE, TryCatch #0 {IOException -> 0x0069, blocks: (B:34:0x0060, B:36:0x0065), top: B:41:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String c(Context context) throws Throwable {
        Throwable th;
        InputStream inputStreamOpenRawResource;
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.hwadvancednumberpickerrichtap);
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, StandardCharsets.UTF_8));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException unused) {
                            bufferedReader2 = bufferedReader;
                            Log.e("HwAdvancedNumberPicker", "loadAllMonth has an Exception.");
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                    Log.w("HwAdvancedNumberPicker", "File read fail.");
                                    return "";
                                }
                            }
                            if (inputStreamOpenRawResource == null) {
                                return "";
                            }
                            inputStreamOpenRawResource.close();
                            return "";
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (inputStreamOpenRawResource != null) {
                                        inputStreamOpenRawResource.close();
                                    }
                                } catch (IOException unused3) {
                                    Log.w("HwAdvancedNumberPicker", "File read fail.");
                                    throw th;
                                }
                            } else if (inputStreamOpenRawResource != null) {
                                inputStreamOpenRawResource.close();
                            }
                            throw th;
                        }
                    }
                    String string = sb.toString();
                    try {
                        bufferedReader.close();
                        if (inputStreamOpenRawResource != null) {
                            inputStreamOpenRawResource.close();
                            return string;
                        }
                    } catch (IOException unused4) {
                        Log.w("HwAdvancedNumberPicker", "File read fail.");
                    }
                    return string;
                } catch (IOException unused5) {
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                    if (inputStreamOpenRawResource != null) {
                        inputStreamOpenRawResource.close();
                    }
                } else if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                throw th;
            }
        } catch (IOException unused6) {
            inputStreamOpenRawResource = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenRawResource = null;
            bufferedReader = bufferedReader2;
            if (bufferedReader != null) {
                bufferedReader.close();
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
            } else if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
            throw th;
        }
    }

    public static void c(Context context, HwAdvancedNumberPicker hwAdvancedNumberPicker, boolean z) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            hwAdvancedNumberPicker.setExtendScrollEnabled(z);
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, hwAdvancedNumberPicker, "pickerScrollEnabled", Boolean.valueOf(z)});
        if (objC instanceof Boolean) {
            hwAdvancedNumberPicker.setExtendScrollEnabled(((Boolean) objC).booleanValue());
        } else {
            hwAdvancedNumberPicker.setExtendScrollEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(View view, int i, HashMap<Integer, String> map, View view2) {
        int i2;
        if (view.getId() == R.id.hwadvancednumberpicker_decrement) {
            i2 = i + 1;
        } else if (view.getId() == R.id.hwadvancednumberpicker_increment) {
            i2 = i - 1;
        } else {
            Log.i("HwAdvancedNumberPicker", "nothing to do");
            i2 = -1;
        }
        if (i2 < 0 || i2 >= map.size() || !TextUtils.isEmpty(map.get(Integer.valueOf(i2)))) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(8);
        view2.onInitializeAccessibilityEvent(accessibilityEventObtain);
        ViewParent parent = view2.getParent();
        if (parent != null) {
            parent.requestSendAccessibilityEvent(view2, accessibilityEventObtain);
        }
        view2.postDelayed(new b(view2), 500L);
    }

    public static void c(AccessibilityEvent accessibilityEvent, Scroller scroller, String str) {
        accessibilityEvent.setClassName("HwAdvancedNumberPicker");
        accessibilityEvent.getText().clear();
        if (scroller.isFinished()) {
            accessibilityEvent.setContentDescription(str);
        } else {
            accessibilityEvent.setContentDescription(null);
        }
    }

    public static void c(TextView textView, HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        int measuredWidth = (hwAdvancedNumberPicker.getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
        int measuredHeight = (hwAdvancedNumberPicker.getMeasuredHeight() - textView.getMeasuredHeight()) / 2;
        textView.layout(measuredWidth, measuredHeight, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight);
    }

    public static void c(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        hwAdvancedNumberPicker.e();
        hwAdvancedNumberPicker.i();
    }

    protected static boolean c(Context context, HwAdvancedNumberPicker hwAdvancedNumberPicker, MotionEvent motionEvent) {
        float dimension = context.getResources().getDimension(R.dimen.hwadvancednumberpicker_min_height_half);
        int[] iArr = new int[2];
        hwAdvancedNumberPicker.getLocationOnScreen(iArr);
        float rawY = motionEvent.getRawY();
        int i = iArr[1];
        return rawY > ((float) ((hwAdvancedNumberPicker.getHeight() / 2) + i)) - dimension && rawY < ((float) (i + (hwAdvancedNumberPicker.getHeight() / 2))) + dimension;
    }

    public static boolean c(HwAdvancedNumberPicker hwAdvancedNumberPicker, View view, HashMap<Integer, String> map, int i) {
        if (hwAdvancedNumberPicker == null || view == null || map == null) {
            return false;
        }
        if (view.getId() == R.id.hwadvancednumberpicker_decrement) {
            int i2 = i + 1;
            if (i2 < 0 || i2 >= map.size() || TextUtils.isEmpty(map.get(Integer.valueOf(i2)))) {
                return false;
            }
            hwAdvancedNumberPicker.l();
            return true;
        }
        if (view.getId() != R.id.hwadvancednumberpicker_increment) {
            Log.w("HwAdvancedNumberPicker", "nothing to do.");
            return false;
        }
        int i3 = i - 1;
        if (i3 < 0 || i3 >= map.size() || TextUtils.isEmpty(map.get(Integer.valueOf(i3)))) {
            return false;
        }
        hwAdvancedNumberPicker.r();
        return true;
    }

    public static boolean c(xea xeaVar, xea xeaVar2) {
        return xeaVar.i() && xeaVar2.i();
    }

    public static int d(int i, int i2, int i3) {
        if (i2 == i3) {
            return i3;
        }
        if (i > i2) {
            return (i3 + ((i - i2) % (i2 - i3))) - 1;
        }
        return i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    public static int d(Context context) {
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        return i > i2 ? i : i2;
    }

    public static int d(View view, Paint paint, d dVar, int i) {
        int i2 = dVar.f52736c;
        paint.setTextSize(i2);
        int iMeasureText = (int) paint.measureText(dVar.e);
        int width = view.getWidth();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        while (i2 > dVar.d && iMeasureText > ((width - paddingLeft) - paddingRight) - i) {
            i2 -= dVar.f52735b;
            paint.setTextSize(i2);
            iMeasureText = (int) paint.measureText(dVar.e);
        }
        return i2;
    }

    public static Paint d(Context context, int i, float f) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        xde.b(xde.b(context), paint);
        paint.setColor(i);
        paint.setTextSize(f);
        return paint;
    }

    public static String d(int i, HwFormatter hwFormatter) {
        return hwFormatter != null ? hwFormatter.format(i) : String.valueOf(i);
    }

    public static String d(HwFormatter hwFormatter, String str, boolean z, boolean z2, String str2) {
        String strB;
        int i;
        if (hwFormatter == null) {
            try {
                int i2 = Integer.parseInt(str);
                strB = i2 != 0 ? xde.b(i2) : str;
            } catch (NumberFormatException unused) {
                Log.w("HwAdvancedNumberPicker", "number format exception");
            }
            if (!z2 || TextUtils.isEmpty(str) || str.endsWith(str2) || "-- --".equals(str)) {
                return strB;
            }
            return str + str2;
        }
        try {
            i = Integer.parseInt(str);
            try {
                str = xde.b(i);
                if (z2 && str != null && !str.endsWith(str2)) {
                    str = str + str2;
                }
            } catch (NumberFormatException unused2) {
                Log.w("HwAdvancedNumberPicker", "number format Exception");
            }
        } catch (NumberFormatException unused3) {
            i = 0;
        }
        String strD = d(hwFormatter, i, str);
        if (!z) {
            return strD;
        }
        try {
            return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(Integer.parseInt(strD)));
        } catch (NumberFormatException unused4) {
            Log.w("HwAdvancedNumberPicker", "flag branch -> number format Exception");
            return strD;
        }
    }

    public static void d(Context context, View view) {
        int measuredHeight = view.getMeasuredHeight();
        float dimension = context.getResources().getDimension(R.dimen.hwadvancednumberpicker_max_height);
        float dimension2 = context.getResources().getDimension(R.dimen.hwadvancednumberpicker_min_height);
        float dimension3 = context.getResources().getDimension(R.dimen.hwadvancednumberpicker_middle_height);
        float dimension4 = context.getResources().getDimension(R.dimen.hwadvancednumberpicker_fading_edge_length);
        float f = measuredHeight;
        if (f > dimension2) {
            view.setVerticalFadingEdgeEnabled(true);
            if (f < dimension3) {
                view.setFadingEdgeLength((int) (dimension4 - ((dimension3 - f) / 2.0f)));
            } else if (f > dimension) {
                view.setFadingEdgeLength((int) (((f - dimension) / 2.0f) + dimension4));
            } else {
                view.setFadingEdgeLength((int) dimension4);
            }
        }
    }

    public static void d(MotionEvent motionEvent, HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        if (motionEvent == null || motionEvent.getAction() == 10) {
            return;
        }
        hwAdvancedNumberPicker.sendAccessibilityEvent(32768);
    }

    public static void d(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        if (hwAdvancedNumberPicker == null) {
            return;
        }
        e.evictAll();
        d.evictAll();
        hwAdvancedNumberPicker.invalidate();
    }

    public static void d(HwAdvancedNumberPicker hwAdvancedNumberPicker, HwAdvancedNumberPicker.d dVar) {
        if (hwAdvancedNumberPicker == null || dVar == null) {
            return;
        }
        hwAdvancedNumberPicker.removeCallbacks(dVar);
    }

    public static void d(HwAdvancedNumberPicker hwAdvancedNumberPicker, boolean z) {
        if (!z || hwAdvancedNumberPicker == null || hwAdvancedNumberPicker.isFocused()) {
            return;
        }
        hwAdvancedNumberPicker.requestFocus();
    }

    public static void d(HwAdvancedNumberPicker hwAdvancedNumberPicker, boolean z, float f) {
        if (z) {
            hwAdvancedNumberPicker.setAlpha(1.0f);
        } else if (Float.compare(f, 0.0f) != 0) {
            hwAdvancedNumberPicker.setAlpha(f);
        }
    }

    public static void d(xea xeaVar, xea xeaVar2) {
        xeaVar.c();
        xeaVar2.c();
    }

    public static float e(int i) {
        return i == 0 ? 1.0f : 0.6f;
    }

    public static float e(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static int e(Paint paint, String[] strArr, int i) {
        if (strArr == null) {
            float f = 0.0f;
            for (int i2 = 0; i2 <= 9; i2++) {
                float fMeasureText = paint.measureText(String.valueOf(i2));
                f = fMeasureText > f ? fMeasureText : 0;
            }
            return (int) (String.valueOf(Math.abs(i)).length() * f);
        }
        int i3 = 0;
        for (String str : strArr) {
            int iMeasureText = (int) paint.measureText(str);
            if (iMeasureText > i3) {
                i3 = iMeasureText;
            }
        }
        return i3;
    }

    public static Bitmap e(String str, Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float fCeil = (float) Math.ceil(paint.measureText(str));
        float fCeil2 = (float) Math.ceil(fontMetrics.bottom - fontMetrics.top);
        if (Float.compare(fCeil, 1.0f) < 0) {
            fCeil = 1.0f;
        }
        if (Float.compare(fCeil2, 1.0f) < 0) {
            fCeil2 = 1.0f;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) fCeil, (int) fCeil2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawText(str, fCeil / 2.0f, -fontMetrics.top, paint);
        return bitmapCreateBitmap;
    }

    public static View.AccessibilityDelegate e(Context context, HwAdvancedNumberPicker hwAdvancedNumberPicker, View view, HashMap<Integer, String> map, int i) {
        return new e(view, context, hwAdvancedNumberPicker, map, i);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.setSelected(true);
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
        }
        return false;
    }

    public static boolean e(KeyEvent keyEvent, HwAdvancedNumberPicker hwAdvancedNumberPicker, HwAdvancedNumberPicker.d dVar) {
        if (keyEvent == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 23 || keyCode == 66) {
            d(hwAdvancedNumberPicker, dVar);
        } else if (keyCode == 19 && keyEvent.getAction() == 0) {
            if (hwAdvancedNumberPicker != null) {
                hwAdvancedNumberPicker.r();
                return true;
            }
        } else if (keyCode != 20 || keyEvent.getAction() != 0) {
            Log.i("HwAdvancedNumberPicker", "No keycode match.");
        } else if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.l();
            return true;
        }
        return false;
    }

    public static String[] e(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        int minValue = hwAdvancedNumberPicker.getMinValue();
        int maxValue = hwAdvancedNumberPicker.getMaxValue();
        if (maxValue < minValue) {
            Log.e("HwAdvancedNumberPicker", "error get displayed values");
            return new String[0];
        }
        int i = (maxValue - minValue) + 1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = Integer.toString(i2 + minValue);
        }
        return (String[]) strArr.clone();
    }

    public static boolean c(xea xeaVar, xea xeaVar2, Scroller scroller) {
        return xeaVar.i() && xeaVar2.i() && scroller.isFinished();
    }

    private static String d(HwFormatter hwFormatter, int i, String str) {
        return (hwFormatter == null || hwFormatter != f52732b || str.length() >= 3 || str.length() <= 0) ? str : String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
    }

    public static SoundPool d() {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(13);
        AudioAttributes audioAttributesBuild = builder.build();
        SoundPool.Builder builder2 = new SoundPool.Builder();
        builder2.setAudioAttributes(audioAttributesBuild);
        builder2.setMaxStreams(7);
        return builder2.build();
    }

    private static int e(int i, int i2) throws IllegalArgumentException {
        int mode = View.MeasureSpec.getMode(i);
        int iMin = Math.min(View.MeasureSpec.getSize(i), i2);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (mode == 1073741824) {
            return i;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    public static String a(String[] strArr, Paint paint) {
        String str = null;
        if (strArr != null && strArr.length != 0 && paint != null) {
            float f = 0.0f;
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    float fMeasureText = paint.measureText(strArr[i]);
                    if (Float.compare(fMeasureText, f) > 0) {
                        str = strArr[i];
                        f = fMeasureText;
                    }
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        Resources resources = context.getResources();
        if (resources == null || resources.getInteger(R.integer.emui_device_type) != 8) {
            return;
        }
        hwAdvancedNumberPicker.setFocusableInTouchMode(true);
        hwAdvancedNumberPicker.requestFocus();
    }
}
