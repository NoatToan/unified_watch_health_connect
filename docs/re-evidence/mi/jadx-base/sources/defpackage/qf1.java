package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatEditText;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class qf1 {
    public static final RectF l = new RectF();

    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();

    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31469a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31470b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f31471k;

    @RequiresApi(16)
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    @RequiresApi(18)
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    @RequiresApi(23)
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    @RequiresApi(23)
    public static class d extends f {
        @Override // qf1.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) qf1.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi(29)
    public static class e extends d {
        @Override // qf1.d, qf1.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // qf1.f
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) qf1.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public qf1(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f31471k = new e();
        } else {
            this.f31471k = new d();
        }
    }

    public static Method k(String str) {
        try {
            Method declaredMethod = m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    public static <T> T m(Object obj, String str, T t) {
        try {
            return (T) k(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            return t;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void a() {
        if (n()) {
            if (this.f31470b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f31471k.b(this.i) ? EventRecurrence.TH : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f31470b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final void c() {
        this.f31469a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.f31470b = false;
    }

    @VisibleForTesting
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return c.a(charSequence, alignment, i, i2, this.i, this.h, this.f31471k);
    }

    public final int e(RectF rectF) {
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (x(this.f[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f[i3];
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f() {
        return Math.round(this.e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int g() {
        return Math.round(this.d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int h() {
        return Math.round(this.c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] i() {
        return this.f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int j() {
        return this.f31469a;
    }

    @VisibleForTesting
    public void l(int i) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean n() {
        return y() && this.f31469a != 0;
    }

    public void o(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, z5j.i0, i, 0);
        TextView textView = this.i;
        androidx.core.view.c.p0(textView, textView.getContext(), z5j.i0, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(z5j.n0)) {
            this.f31469a = typedArrayObtainStyledAttributes.getInt(z5j.n0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(z5j.m0) ? typedArrayObtainStyledAttributes.getDimension(z5j.m0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(z5j.k0) ? typedArrayObtainStyledAttributes.getDimension(z5j.k0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(z5j.j0) ? typedArrayObtainStyledAttributes.getDimension(z5j.j0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(z5j.l0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(z5j.l0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f31469a = 0;
            return;
        }
        if (this.f31469a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void q(int[] iArr, int i) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r(int i) {
        if (y()) {
            if (i == 0) {
                c();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean zA = b.a(this.i);
            if (this.i.getLayout() != null) {
                this.f31470b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zA) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void t(int i, float f2) {
        Context context = this.j;
        s(TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f31469a == 1) {
            if (!this.g || this.f.length == 0) {
                int iFloor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.d + (i * this.c));
                }
                this.f = b(iArr);
            }
            this.f31470b = true;
        } else {
            this.f31470b = false;
        }
        return this.f31470b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f31469a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.i);
        l(i);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.i instanceof AppCompatEditText);
    }

    public final void z(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f31469a = 1;
        this.d = f2;
        this.e = f3;
        this.c = f4;
        this.g = false;
    }
}
