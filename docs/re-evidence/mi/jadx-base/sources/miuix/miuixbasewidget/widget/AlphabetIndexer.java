package miuix.miuixbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.VibrationAttributes;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.a2j;
import defpackage.a3j;
import defpackage.aii;
import defpackage.c6q;
import defpackage.emi;
import defpackage.eyq;
import defpackage.hhi;
import defpackage.j5j;
import defpackage.of1;
import defpackage.tki;
import defpackage.v61;
import defpackage.zkb;
import defpackage.zoi;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import miuix.animation.Folme;
import miuix.animation.IVisibleStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class AlphabetIndexer extends LinearLayout {
    public ImageView A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public SectionIndexer G;
    public View H;
    public float I;
    public int J;
    public AccessibilityManager K;
    public View.OnLayoutChangeListener L;
    public zkb M;
    public VibrationAttributes N;
    public boolean O;
    public int P;
    public Handler Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26643b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26644k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public Drawable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26645r;
    public int s;
    public HashMap<Object, Integer> t;
    public AnimConfig u;
    public AnimConfig v;
    public f w;
    public int x;
    public TextView y;
    public View z;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4 - i2;
            if (i8 - i6 != i9 || AlphabetIndexer.this.D) {
                AlphabetIndexer.this.D = false;
                AlphabetIndexer.this.C(i9);
            }
        }
    }

    public class b extends TransitionListener {
        public b() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (AlphabetIndexer.this.isPressed() || !AlphabetIndexer.this.O) {
                return;
            }
            AlphabetIndexer.this.z(0);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            for (UpdateInfo updateInfo : collection) {
                if (updateInfo.property == ViewProperty.SCALE_X) {
                    AlphabetIndexer.this.F(updateInfo.getFloatValue());
                    return;
                }
            }
        }
    }

    public class c extends TransitionListener {
        public c() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
            Iterator<UpdateInfo> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next().property == ViewProperty.AUTO_ALPHA) {
                    AlphabetIndexer.this.B = false;
                    return;
                }
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            for (UpdateInfo updateInfo : collection) {
                FloatProperty floatProperty = updateInfo.property;
                if (floatProperty == ViewProperty.SCALE_X) {
                    AlphabetIndexer.this.F(updateInfo.getFloatValue());
                } else if (floatProperty == ViewProperty.AUTO_ALPHA && !AlphabetIndexer.this.B) {
                    AlphabetIndexer.this.E(updateInfo.getFloatValue());
                }
            }
        }
    }

    public class d extends Handler {
        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            AlphabetIndexer.this.s();
        }
    }

    public class e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String[] f26650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f26651b;
        public String[] c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h = false;

        public f(Context context, TypedArray typedArray) {
            Resources resources = context.getResources();
            CharSequence[] textArray = typedArray.getTextArray(j5j.M0);
            if (textArray != null) {
                this.f26651b = new String[textArray.length];
                int length = textArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    this.f26651b[i2] = textArray[i].toString();
                    i++;
                    i2++;
                }
            } else {
                this.f26651b = resources.getStringArray(hhi.f20072a);
            }
            this.c = new String[]{"!", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX};
            ColorStateList colorStateListA = of1.a(context, typedArray.getResourceId(j5j.N0, tki.e));
            this.f = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, resources.getColor(tki.f34794b));
            this.e = colorStateListA.getColorForState(new int[]{R.attr.state_activated}, resources.getColor(tki.f34793a));
            this.d = colorStateListA.getColorForState(new int[0], resources.getColor(tki.d));
            this.g = typedArray.getDimensionPixelSize(j5j.O0, resources.getDimensionPixelSize(emi.h));
        }

        public String[] a(SectionIndexer sectionIndexer, boolean z) {
            String[] strArr;
            if (sectionIndexer == null || !this.h) {
                return this.f26651b;
            }
            Object[] sections = sectionIndexer.getSections();
            if (sections != null && sections.length == 0 && (strArr = this.c) != null && strArr.length > 0) {
                String[] strArr2 = new String[strArr.length];
                this.f26650a = strArr2;
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                return this.f26650a;
            }
            if (sections == null || sections.length == 0) {
                return this.f26651b;
            }
            if (this.f26650a == null || z) {
                this.f26650a = new String[sections.length];
                for (int i = 0; i < sections.length; i++) {
                    this.f26650a[i] = (String) sections[i];
                }
            }
            return this.f26650a;
        }
    }

    public AlphabetIndexer(Context context) {
        this(context, null);
    }

    private zkb getHapticFeedbackCompat() {
        if (this.M == null) {
            this.M = new zkb(getContext());
        }
        return this.M;
    }

    private int getListOffset() {
        return 0;
    }

    private int getMarginBottom() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin;
    }

    private int getMarginTop() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
    }

    private int getMarinEnd() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).getMarginEnd();
    }

    private SectionIndexer getSectionIndexer() {
        return this.G;
    }

    @RequiresApi(api = 30)
    private VibrationAttributes getUsageAlarmVibrationAttributes() {
        if (this.N == null) {
            this.N = v61.a().setUsage(17).build();
        }
        return this.N;
    }

    private void setChecked(int i) {
        this.j = i;
        View view = this.z;
        if (view != null) {
            A(view, false);
        }
        View childAt = getChildAt(q(i));
        this.z = childAt;
        A(childAt, true);
        if (this.z != null) {
            invalidate();
        }
    }

    public final void A(View view, boolean z) {
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(z ? this.w.f : this.w.d);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(z ? zoi.f : zoi.e);
        }
    }

    public final void B(int i) {
        View childAt = getChildAt(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
        layoutParams.bottomMargin = i;
        layoutParams.topMargin = i;
        childAt.setLayoutParams(layoutParams);
        this.d = i;
    }

    public final void C(int i) {
        View childAt = getChildAt(0);
        int height = childAt.getHeight();
        String[] strArrA = this.w.a(getSectionIndexer(), false);
        int length = (strArrA.length * (this.f26643b + (this.f * 2))) + getPaddingTop() + getPaddingBottom();
        int marginTop = getMarginTop() <= 0 ? getMarginTop() + (this.f26645r / 2) + 1 : getMarginTop();
        int marginBottom = getMarginBottom() <= 0 ? getMarginBottom() + (this.f26645r / 2) + 1 : getMarginBottom();
        if (length + marginTop + marginBottom > i) {
            if (getChildCount() > 0) {
                x();
            }
            p(i);
            m();
            return;
        }
        int paddingTop = strArrA.length > 0 ? ((((((i - getPaddingTop()) - getPaddingBottom()) - marginTop) - marginBottom) / strArrA.length) - this.f26643b) / 2 : this.e;
        if (getChildCount() != strArrA.length || this.C || this.E) {
            this.E = false;
            x();
            o(Math.min(this.e, paddingTop));
            m();
            return;
        }
        if (Math.min(this.e, paddingTop) != this.d) {
            B(Math.min(this.e, paddingTop));
        } else if (height == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.height = this.f26643b;
            int i2 = this.d;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
            childAt.setLayoutParams(layoutParams);
        } else if (height != this.f26643b) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams2.height = this.f26643b;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            childAt.setLayoutParams(layoutParams2);
        }
        m();
    }

    public final void D() {
        TextView textView = this.y;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginEnd(this.F + getMarinEnd());
            this.y.setLayoutParams(layoutParams);
        }
    }

    public final void E(float f2) {
        TextView textView = this.y;
        textView.setTextColor(textView.getTextColors().withAlpha((int) (f2 * 255.0f)));
    }

    public final void F(float f2) {
        float width = (this.y.getWidth() / 2) * (1.0f - f2);
        if (eyq.b(this)) {
            width *= -1.0f;
        }
        this.y.setTranslationX(width);
    }

    public final void G() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(emi.g);
        setPadding(getPaddingStart(), dimensionPixelOffset, getPaddingEnd(), dimensionPixelOffset);
    }

    public int getIndexerIntrinsicWidth() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicWidth();
        }
        return 0;
    }

    public final void k(String str) {
        if (TextUtils.equals(str, "!")) {
            str = getContext().getString(a2j.d);
        }
        announceForAccessibility(str);
    }

    public final void l() {
        SectionIndexer sectionIndexer = getSectionIndexer();
        if (sectionIndexer == null) {
            return;
        }
        String[] strArrA = this.w.a(sectionIndexer, false);
        int i = this.j;
        if (i < 0 || i >= strArrA.length) {
            return;
        }
        k(strArrA[i]);
    }

    public final void m() {
        getSectionIndexer();
    }

    public final void n(int i) {
        if (i < 0) {
            return;
        }
        View childAt = getChildAt(q(i));
        if (childAt instanceof TextView) {
            ((TextView) childAt).setTextColor(this.w.d);
        } else if (childAt instanceof ImageView) {
            ((ImageView) childAt).setImageResource(zoi.e);
        }
    }

    public final void o(int i) {
        this.d = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = i;
        layoutParams.topMargin = i;
        layoutParams.weight = 1.0f;
        for (String str : this.w.a(getSectionIndexer(), false)) {
            TextView textView = new TextView(getContext());
            c6q.b(textView);
            textView.setGravity(17);
            textView.setHeight(this.f26643b);
            textView.setIncludeFontPadding(false);
            textView.setTextColor(this.w.d);
            textView.setTextSize(0, this.w.g);
            if (TextUtils.equals(str, "!")) {
                str = "♥";
            }
            textView.setText(str);
            textView.setImportantForAccessibility(2);
            attachViewToParent(textView, -1, layoutParams);
        }
        this.C = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = (View) getParent();
        this.H = view;
        if (view != null) {
            view.addOnLayoutChangeListener(this.L);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.screenHeightDp;
        if (i != this.P) {
            this.P = i;
            this.e = getResources().getDimensionPixelOffset(emi.f16813b);
            G();
            D();
            this.D = true;
            View view = this.H;
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.H;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.L);
            this.H = null;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String[] strArrA = this.w.a(getSectionIndexer(), false);
        if (!isEnabled() || (i = this.j) <= -1 || i >= strArrA.length) {
            return;
        }
        accessibilityNodeInfo.addAction(8192);
        if (i < strArrA.length) {
            accessibilityNodeInfo.addAction(4096);
        }
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, -1.0f, strArrA.length, i));
        String string = strArrA[i];
        if (string != null) {
            if (TextUtils.equals(string, "!")) {
                string = getContext().getString(a2j.d);
            }
            accessibilityNodeInfo.setContentDescription(string);
        }
        if (i2 >= 30) {
            accessibilityNodeInfo.setStateDescription(getContext().getString(a2j.c));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        z(0);
        return false;
    }

    public final void p(int i) {
        int i2;
        int i3;
        int marginTop = getMarginTop() <= 0 ? getMarginTop() + (this.f26645r / 2) + 1 : getMarginTop();
        int marginBottom = getMarginBottom() <= 0 ? getMarginBottom() + (this.f26645r / 2) + 1 : getMarginBottom();
        int paddingTop = (i - getPaddingTop()) - getPaddingBottom();
        if (paddingTop + marginTop + marginBottom >= i) {
            paddingTop -= marginTop + marginBottom;
        }
        String[] strArrA = this.w.a(getSectionIndexer(), false);
        int length = strArrA.length;
        int i4 = this.f26643b;
        int i5 = this.f;
        int i6 = i4 + (i5 * 2);
        int i7 = this.c + i6 + (i5 * 2);
        int i8 = paddingTop - (i6 * 3);
        int i9 = i8 / i7;
        this.i = i9;
        if (i9 < 1) {
            this.i = 1;
        }
        int i10 = i8 % i7;
        int i11 = length - 3;
        int i12 = this.i;
        int i13 = i11 / i12;
        this.g = i13;
        if (i13 < 2) {
            this.g = 2;
            int i14 = i11 / 2;
            i10 += i7 * (i12 - i14);
            this.i = i14;
        }
        int i15 = this.g;
        int i16 = this.i;
        this.h = i11 - (i15 * i16);
        this.d = i5;
        if (i10 > 0) {
            this.d = i5 + ((i10 / 2) / ((i16 * 2) + 3));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        int i17 = this.d;
        layoutParams.bottomMargin = i17;
        layoutParams.topMargin = i17;
        layoutParams.weight = 1.0f;
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = this.g;
            int i20 = this.h;
            if (i18 < (i19 + 1) * i20) {
                i19++;
                i2 = i18;
            } else {
                i2 = i18 - ((i19 + 1) * i20);
            }
            if (i18 <= 1 || i18 >= length - 2 || (i3 = (i2 - 1) % i19) == 0) {
                String str = strArrA[i18];
                TextView textView = new TextView(getContext());
                c6q.b(textView);
                textView.setGravity(17);
                textView.setHeight(this.f26643b);
                textView.setIncludeFontPadding(false);
                textView.setTextColor(this.w.d);
                textView.setTextSize(0, this.w.g);
                if (TextUtils.equals(str, "!")) {
                    str = "♥";
                }
                textView.setText(str);
                textView.setImportantForAccessibility(2);
                attachViewToParent(textView, -1, layoutParams);
            } else if (i3 == 1) {
                ImageView imageView = new ImageView(getContext());
                if (this.A == null) {
                    this.A = imageView;
                }
                imageView.setMaxHeight(this.c);
                imageView.setMaxWidth(this.c);
                imageView.setImageResource(zoi.e);
                imageView.setImportantForAccessibility(2);
                attachViewToParent(imageView, -1, layoutParams);
            }
        }
        this.C = true;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        SectionIndexer sectionIndexer = getSectionIndexer();
        if (!isEnabled() || sectionIndexer == null) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            return false;
        }
        r(this.j, i, sectionIndexer);
        l();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[PHI: r0
      0x0043: PHI (r0v9 int) = (r0v7 int), (r0v12 int) binds: [B:32:0x005f, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    public final int q(int i) {
        int i2;
        int i3;
        int i4 = 0;
        int length = this.w.a(getSectionIndexer(), false).length;
        int i5 = length - 1;
        int i6 = i > i5 ? i5 : i;
        if (getChildCount() != length && (i2 = this.g) > 1 && i > 1) {
            if (i >= length - 2) {
                i6 = (this.i * 2) + 1 + (i6 == i5 ? 1 : 0);
            } else {
                int i7 = this.h;
                if (i7 <= 0) {
                    int i8 = i - 1;
                    i3 = ((i8 / i2) * 2) + 1;
                    if (i8 % i2 != 0) {
                        i4 = 1;
                    }
                    i6 = i3 + i4;
                } else if (i < (i2 + 1) * i7) {
                    int i9 = i2 + 1;
                    int i10 = i - 1;
                    i3 = ((i10 / i9) * 2) + 1;
                    if (i10 % i9 != 0) {
                        i4 = 1;
                    }
                    i6 = i3 + i4;
                } else {
                    i6 = ((((i - i7) - 1) / i2) * 2) + 1 + (((i - i7) - 1) % i2 != 0 ? 1 : 0);
                }
            }
        }
        return v(i6);
    }

    public final void r(int i, int i2, SectionIndexer sectionIndexer) {
        int i3;
        if (sectionIndexer == null) {
            return;
        }
        String[] strArrA = this.w.a(sectionIndexer, false);
        if (i2 == 4096) {
            i3 = i - 1;
            while (i3 >= 0) {
                Object[] sections = sectionIndexer.getSections();
                if (sections == null || sections.length <= 0) {
                    if (sections != null) {
                        i = i3;
                        break;
                    }
                    i3--;
                } else {
                    if (Arrays.asList(sections).contains(strArrA[i3])) {
                        i = i3;
                        break;
                    }
                    i3--;
                }
            }
        } else if (i2 == 8192) {
            i3 = i + 1;
            while (i3 <= strArrA.length - 1) {
                Object[] sections2 = sectionIndexer.getSections();
                if (sections2 == null || sections2.length <= 0) {
                    if (sections2 != null) {
                        i = i3;
                        break;
                    }
                    i3++;
                } else {
                    if (Arrays.asList(sections2).contains(strArrA[i3])) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        y(i, sectionIndexer);
        setChecked(i);
    }

    public final void s() {
        TextView textView = this.y;
        if (textView != null) {
            Folme.useAt(textView).visible().setFlags(1L).setScale(1.0f, IVisibleStyle.VisibleType.SHOW).setScale(0.0f, IVisibleStyle.VisibleType.HIDE).hide(this.v);
        }
    }

    public void setMinVisibleIndexes(String[] strArr) {
        this.w.c = strArr;
    }

    public void setSectionIndexer(SectionIndexer sectionIndexer) {
        this.G = sectionIndexer;
    }

    public void setSectionsAsIndexesEnabled(boolean z) {
        this.w.h = z;
    }

    public void setVerticalPosition(boolean z) {
        this.l = z ? 8388613 : 8388611;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            z(0);
            n(this.f26644k);
        }
    }

    public final void t() {
        this.l = 8388613;
        setGravity(1);
        setOrientation(1);
        u();
        o(this.e);
        setClickable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.P = getResources().getConfiguration().screenHeightDp;
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final void u() {
        AnimConfig animConfig = new AnimConfig();
        this.u = animConfig;
        animConfig.addListeners(new b());
        AnimConfig animConfig2 = new AnimConfig();
        this.v = animConfig2;
        animConfig2.addListeners(new c());
    }

    public final int v(int i) {
        if (i < 0) {
            return 0;
        }
        return i >= getChildCount() ? getChildCount() - 1 : i;
    }

    public final void w(AttributeSet attributeSet, int i) {
        Resources resources = getContext().getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j5j.J0, i, a3j.f577a);
        this.w = new f(getContext(), typedArrayObtainStyledAttributes);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(j5j.L0, true);
        this.m = z;
        if (z) {
            this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(j5j.R0, resources.getDimensionPixelSize(emi.f));
            this.o = typedArrayObtainStyledAttributes.getColor(j5j.Q0, resources.getColor(tki.c));
            this.p = typedArrayObtainStyledAttributes.getResourceId(j5j.K0, a3j.h);
            this.q = typedArrayObtainStyledAttributes.getDrawable(j5j.P0);
            this.f26643b = resources.getDimensionPixelOffset(emi.f16812a);
            this.c = resources.getDimensionPixelOffset(emi.e);
            this.d = resources.getDimensionPixelOffset(emi.f16813b);
            this.e = resources.getDimensionPixelOffset(emi.f16813b);
            this.f = resources.getDimensionPixelOffset(emi.c);
            this.s = resources.getDimensionPixelOffset(emi.j);
            this.f26645r = resources.getDimensionPixelOffset(emi.i);
            this.F = resources.getDimensionPixelOffset(emi.d);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void x() {
        this.i = 0;
        this.g = 0;
        this.j = -1;
        this.z = null;
        this.A = null;
        removeAllViews();
    }

    public final e y(int i, SectionIndexer sectionIndexer) {
        return null;
    }

    public final void z(int i) {
        this.Q.removeMessages(1);
        this.Q.sendMessageDelayed(this.Q.obtainMessage(1), i <= 0 ? 0L : i);
    }

    public AlphabetIndexer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aii.d);
    }

    public AlphabetIndexer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26642a = -1;
        this.g = 1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.t = new HashMap<>();
        this.x = 0;
        this.C = false;
        this.D = false;
        this.E = false;
        this.H = null;
        this.I = -1.0f;
        this.J = 0;
        this.L = new a();
        this.O = true;
        this.P = -1;
        this.Q = new d();
        w(attributeSet, i);
        t();
    }
}
