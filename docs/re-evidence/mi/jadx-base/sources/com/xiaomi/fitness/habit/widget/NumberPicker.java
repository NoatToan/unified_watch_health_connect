package com.xiaomi.fitness.habit.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.dri;
import defpackage.hji;
import defpackage.iui;
import defpackage.uhi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class NumberPicker extends LinearLayout {
    public static final f v0 = new a();
    public static final int[] w0 = {R.attr.state_pressed};
    public static final int[] x0 = {R.attr.textSize, R.attr.text, R.attr.color};
    public static final char[] y0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public int A;
    public k B;
    public e C;
    public d D;
    public float E;
    public long F;
    public float G;
    public VelocityTracker H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final boolean M;
    public final int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f12194a;
    public final j a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12195b;
    public int b0;
    public final int c;
    public Paint c0;
    public final int d;
    public int d0;
    public final int e;
    public int e0;
    public int f;
    public int f0;
    public final boolean g;
    public float g0;
    public int h;
    public float h0;
    public int i;
    public float i0;
    public String[] j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12196k;
    public int k0;
    public int l;
    public CharSequence l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public f o;
    public boolean o0;
    public long p;
    public RectF p0;
    public final SparseArray<String> q;
    public RectF q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f12197r;
    public RectF r0;
    public final Paint s;
    public float s0;
    public final Paint t;
    public String t0;
    public Drawable u;
    public float u0;
    public int v;
    public int w;
    public int x;
    public final Scroller y;
    public final Scroller z;

    public static class CustomEditText extends AppCompatEditText {
        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView
        public void onEditorAction(int i) {
            super.onEditorAction(i);
            if (i == 6) {
                clearFocus();
            }
        }
    }

    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f12198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f12199b;
        public final Object[] c;

        public a() {
            StringBuilder sb = new StringBuilder();
            this.f12198a = sb;
            this.f12199b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // com.xiaomi.fitness.habit.widget.NumberPicker.f
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f12198a;
            sb.delete(0, sb.length());
            this.f12199b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f12199b.toString();
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                NumberPicker.this.f12194a.selectAll();
            } else {
                NumberPicker.this.f12194a.setSelection(0, 0);
                NumberPicker.this.b0(view);
            }
        }
    }

    public class c extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f12201a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f12202b = new int[2];
        public int c = Integer.MIN_VALUE;

        public c() {
        }

        public final AccessibilityNodeInfo a(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(NumberPicker.class.getName());
            accessibilityNodeInfoObtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(NumberPicker.this);
            if (g()) {
                accessibilityNodeInfoObtain.addChild(NumberPicker.this, 3);
            }
            accessibilityNodeInfoObtain.addChild(NumberPicker.this, 2);
            if (h()) {
                accessibilityNodeInfoObtain.addChild(NumberPicker.this, 1);
            }
            accessibilityNodeInfoObtain.setParent((View) NumberPicker.this.getParentForAccessibility());
            accessibilityNodeInfoObtain.setEnabled(NumberPicker.this.isEnabled());
            accessibilityNodeInfoObtain.setScrollable(true);
            Rect rect = this.f12201a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            accessibilityNodeInfoObtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            int[] iArr = this.f12202b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.c != -1) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.c == -1) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                if (NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue()) {
                    accessibilityNodeInfoObtain.addAction(4096);
                }
                if (NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue()) {
                    accessibilityNodeInfoObtain.addAction(8192);
                }
            }
            return accessibilityNodeInfoObtain;
        }

        public final AccessibilityNodeInfo b(int i, String str, int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(Button.class.getName());
            accessibilityNodeInfoObtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(NumberPicker.this, i);
            accessibilityNodeInfoObtain.setParent(NumberPicker.this);
            accessibilityNodeInfoObtain.setText(str);
            accessibilityNodeInfoObtain.setClickable(true);
            accessibilityNodeInfoObtain.setLongClickable(true);
            accessibilityNodeInfoObtain.setEnabled(NumberPicker.this.isEnabled());
            Rect rect = this.f12201a;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfoObtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            int[] iArr = this.f12202b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.c != i) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.c == i) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                accessibilityNodeInfoObtain.addAction(16);
            }
            return accessibilityNodeInfoObtain;
        }

        public final AccessibilityNodeInfo c(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = NumberPicker.this.f12194a.createAccessibilityNodeInfo();
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setSource(NumberPicker.this, 2);
            if (this.c != 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(64);
            }
            if (this.c == 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(128);
            }
            Rect rect = this.f12201a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.f12202b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInScreen(rect);
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                return a(NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
            }
            if (i == 1) {
                return b(1, f(), NumberPicker.this.getScrollX(), NumberPicker.this.S - NumberPicker.this.N, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
            }
            if (i != 2) {
                return i != 3 ? super.createAccessibilityNodeInfo(i) : b(3, e(), NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.R + NumberPicker.this.N);
            }
            return c(NumberPicker.this.getScrollX(), NumberPicker.this.R + NumberPicker.this.N, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.S - NumberPicker.this.N);
        }

        public final void d(String str, int i, List<AccessibilityNodeInfo> list) {
            if (i == 1) {
                String strF = f();
                if (TextUtils.isEmpty(strF) || !strF.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                String strE = e();
                if (TextUtils.isEmpty(strE) || !strE.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(3));
                return;
            }
            Editable text = NumberPicker.this.f12194a.getText();
            if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            Editable text2 = NumberPicker.this.f12194a.getText();
            if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(2));
        }

        public final String e() {
            int iG = NumberPicker.this.m - 1;
            if (NumberPicker.this.L) {
                iG = NumberPicker.this.G(iG);
            }
            if (iG >= NumberPicker.this.f12196k) {
                return NumberPicker.this.j == null ? NumberPicker.this.C(iG) : NumberPicker.this.j[iG - NumberPicker.this.f12196k];
            }
            return null;
        }

        public final String f() {
            int iG = NumberPicker.this.m + 1;
            if (NumberPicker.this.L) {
                iG = NumberPicker.this.G(iG);
            }
            if (iG <= NumberPicker.this.l) {
                return NumberPicker.this.j == null ? NumberPicker.this.C(iG) : NumberPicker.this.j[iG - NumberPicker.this.f12196k];
            }
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                d(lowerCase, 3, arrayList);
                d(lowerCase, 2, arrayList);
                d(lowerCase, 1, arrayList);
                return arrayList;
            }
            if (i != 1 && i != 2 && i != 3) {
                return super.findAccessibilityNodeInfosByText(str, i);
            }
            d(lowerCase, i, arrayList);
            return arrayList;
        }

        public final boolean g() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue();
        }

        public final boolean h() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void i(int i, int i2, String str) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                accessibilityEventObtain.setClassName(Button.class.getName());
                accessibilityEventObtain.setPackageName(NumberPicker.this.getContext().getPackageName());
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setEnabled(NumberPicker.this.isEnabled());
                accessibilityEventObtain.setSource(NumberPicker.this, i);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, accessibilityEventObtain);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void j(int i) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
                NumberPicker.this.f12194a.onInitializeAccessibilityEvent(accessibilityEventObtain);
                NumberPicker.this.f12194a.onPopulateAccessibilityEvent(accessibilityEventObtain);
                accessibilityEventObtain.setSource(NumberPicker.this, 2);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, accessibilityEventObtain);
            }
        }

        public void k(int i, int i2) {
            if (i == 1) {
                if (h()) {
                    i(i, i2, f());
                }
            } else if (i == 2) {
                j(i2);
            } else if (i == 3 && g()) {
                i(i, i2, e());
            }
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i != -1) {
                if (i == 1) {
                    if (i2 == 16) {
                        if (!NumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NumberPicker.this.w(true);
                        k(i, 1);
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.c == i) {
                            return false;
                        }
                        this.c = i;
                        k(i, 32768);
                        NumberPicker numberPicker = NumberPicker.this;
                        numberPicker.invalidate(0, numberPicker.S, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                        return true;
                    }
                    if (i2 != 128 || this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    k(i, 65536);
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, numberPicker2.S, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return true;
                }
                if (i == 2) {
                    if (i2 == 1) {
                        if (!NumberPicker.this.isEnabled() || NumberPicker.this.f12194a.isFocused()) {
                            return false;
                        }
                        return NumberPicker.this.f12194a.requestFocus();
                    }
                    if (i2 == 2) {
                        if (!NumberPicker.this.isEnabled() || !NumberPicker.this.f12194a.isFocused()) {
                            return false;
                        }
                        NumberPicker.this.f12194a.clearFocus();
                        return true;
                    }
                    if (i2 == 16) {
                        return NumberPicker.this.isEnabled();
                    }
                    if (i2 == 64) {
                        if (this.c == i) {
                            return false;
                        }
                        this.c = i;
                        k(i, 32768);
                        NumberPicker.this.f12194a.invalidate();
                        return true;
                    }
                    if (i2 != 128) {
                        return NumberPicker.this.f12194a.performAccessibilityAction(i2, bundle);
                    }
                    if (this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    k(i, 65536);
                    NumberPicker.this.f12194a.invalidate();
                    return true;
                }
                if (i == 3) {
                    if (i2 == 16) {
                        if (!NumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NumberPicker.this.w(i == 1);
                        k(i, 1);
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.c == i) {
                            return false;
                        }
                        this.c = i;
                        k(i, 32768);
                        NumberPicker numberPicker3 = NumberPicker.this;
                        numberPicker3.invalidate(0, 0, numberPicker3.getRight(), NumberPicker.this.R);
                        return true;
                    }
                    if (i2 != 128 || this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    k(i, 65536);
                    NumberPicker numberPicker4 = NumberPicker.this;
                    numberPicker4.invalidate(0, 0, numberPicker4.getRight(), NumberPicker.this.R);
                    return true;
                }
            } else {
                if (i2 == 64) {
                    if (this.c == i) {
                        return false;
                    }
                    this.c = i;
                    return true;
                }
                if (i2 == 128) {
                    if (this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    return true;
                }
                if (i2 == 4096) {
                    if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() >= NumberPicker.this.getMaxValue())) {
                        return false;
                    }
                    NumberPicker.this.w(true);
                    return true;
                }
                if (i2 == 8192) {
                    if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() <= NumberPicker.this.getMinValue())) {
                        return false;
                    }
                    NumberPicker.this.w(false);
                    return true;
                }
            }
            return super.performAction(i, i2, bundle);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.P = true;
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12204a;

        public e() {
        }

        public final void b(boolean z) {
            this.f12204a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.w(this.f12204a);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.p);
        }
    }

    public interface f {
        String format(int i);
    }

    public class g extends NumberKeyListener {
        public g() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (NumberPicker.this.j == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i4, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                return (NumberPicker.this.E(str) > NumberPicker.this.l || str.length() > String.valueOf(NumberPicker.this.l).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.j) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.S(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return NumberPicker.y0;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface h {
    }

    public interface i {
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12207a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12208b = 2;
        public int c;
        public int d;

        public j() {
        }

        public void a(int i) {
            c();
            this.d = 1;
            this.c = i;
            NumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void b(int i) {
            c();
            this.d = 2;
            this.c = i;
            NumberPicker.this.post(this);
        }

        public void c() {
            this.d = 0;
            this.c = 0;
            NumberPicker.this.removeCallbacks(this);
            if (NumberPicker.this.U) {
                NumberPicker.this.U = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.S, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            if (NumberPicker.this.V) {
                NumberPicker.this.V = false;
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.R);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.d;
            if (i == 1) {
                int i2 = this.c;
                if (i2 == 1) {
                    NumberPicker.this.U = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.S, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    NumberPicker.this.V = true;
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.R);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            int i3 = this.c;
            if (i3 == 1) {
                if (!NumberPicker.this.U) {
                    NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                NumberPicker numberPicker3 = NumberPicker.this;
                numberPicker3.U = !numberPicker3.U;
                NumberPicker numberPicker4 = NumberPicker.this;
                numberPicker4.invalidate(0, numberPicker4.S, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!NumberPicker.this.V) {
                NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            NumberPicker numberPicker5 = NumberPicker.this;
            numberPicker5.V = !numberPicker5.V;
            NumberPicker numberPicker6 = NumberPicker.this;
            numberPicker6.invalidate(0, 0, numberPicker6.getRight(), NumberPicker.this.R);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12210b;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.f12194a.setSelection(this.f12209a, this.f12210b);
        }
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    public final boolean A() {
        int i2 = this.w - this.x;
        if (i2 == 0) {
            return false;
        }
        this.A = 0;
        int iAbs = Math.abs(i2);
        int i3 = this.v;
        if (iAbs > i3 / 2) {
            if (i2 > 0) {
                i3 = -i3;
            }
            i2 += i3;
        }
        this.z.startScroll(0, 0, 0, i2, 800);
        invalidate();
        return true;
    }

    public final void B(int i2) {
        this.A = 0;
        if (i2 > 0) {
            this.y.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.y.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    public final String C(int i2) {
        f fVar = this.o;
        return fVar != null ? fVar.format(i2) : String.valueOf(i2);
    }

    public final int D(float f2, int i2, boolean z) {
        if (f2 >= 1.0f) {
            return i2;
        }
        return (((int) (z ? ((-f2) * Color.alpha(i2)) + Color.alpha(i2) : f2 * Color.alpha(i2))) << 24) | (i2 & 16777215);
    }

    public final int E(String str) {
        try {
            if (this.j == null) {
                return Integer.parseInt(str);
            }
            for (int i2 = 0; i2 < this.j.length; i2++) {
                str = str.toLowerCase();
                if (this.j[i2].toLowerCase().startsWith(str)) {
                    return this.f12196k + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f12196k;
        }
    }

    public final float F(float f2, int i2, int i3) {
        return f2 >= 1.0f ? i3 : (f2 * (i3 - i2)) + i2;
    }

    public final int G(int i2) {
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = this.f12196k;
            return (i4 + ((i2 - i3) % (i3 - i4))) - this.n;
        }
        int i5 = this.f12196k;
        return i2 < i5 ? (i3 - ((i5 - i2) % (i3 - i5))) + this.n : i2;
    }

    public final void H(int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length - 1) {
            int i3 = i2 + 1;
            iArr[i2] = iArr[i3];
            i2 = i3;
        }
        int i4 = iArr[iArr.length - 2] + this.n;
        if (this.L && i4 > this.l) {
            i4 = this.f12196k;
        }
        iArr[iArr.length - 1] = i4;
        z(i4);
    }

    public final void I() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.h) / 2);
    }

    public final void J() {
        K();
        int[] iArr = this.f12197r;
        int bottom = (int) ((((getBottom() - getTop()) - (iArr.length * this.h)) / iArr.length) + 0.5f);
        this.i = bottom;
        this.v = this.h + bottom;
        int baseline = (this.f12194a.getBaseline() + this.f12194a.getTop()) - (this.v * 2);
        this.w = baseline;
        this.x = baseline;
        a0();
    }

    public final void K() {
        this.q.clear();
        int[] iArr = this.f12197r;
        int value = getValue();
        for (int i2 = 0; i2 < this.f12197r.length; i2++) {
            int iG = ((i2 - 2) * this.n) + value;
            if (this.L) {
                iG = G(iG);
            }
            iArr[i2] = iG;
            z(iG);
        }
    }

    public final int L(int i2, int i3) {
        if (i3 == -1) {
            return i2;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (mode == 1073741824) {
            return i2;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    public final boolean M(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = this.w - ((this.x + finalY) % this.v);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.v;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, finalY + i2);
        return true;
    }

    public final void N(int i2, int i3) {
    }

    public final void O(int i2) {
        if (this.O == i2) {
            return;
        }
        this.O = i2;
    }

    public final void P(Scroller scroller) {
        if (scroller == this.y) {
            if (!A()) {
                a0();
            }
            O(0);
        } else if (this.O != 1) {
            a0();
        }
    }

    public final void Q() {
        d dVar = this.D;
        if (dVar == null) {
            this.D = new d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.D, ViewConfiguration.getLongPressTimeout());
    }

    public final void R(boolean z, long j2) {
        e eVar = this.C;
        if (eVar == null) {
            this.C = new e();
        } else {
            removeCallbacks(eVar);
        }
        this.C.b(z);
        postDelayed(this.C, j2);
    }

    public final void S(int i2, int i3) {
        k kVar = this.B;
        if (kVar == null) {
            this.B = new k();
        } else {
            removeCallbacks(kVar);
        }
        this.B.f12209a = i2;
        this.B.f12210b = i3;
        post(this.B);
    }

    public final void T() {
        K();
        invalidate();
    }

    public final void U() {
        e eVar = this.C;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        k kVar = this.B;
        if (kVar != null) {
            removeCallbacks(kVar);
        }
        d dVar = this.D;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.a0.c();
    }

    public final void V() {
        d dVar = this.D;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    public final void W() {
        e eVar = this.C;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    public final int X(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    public final void Y(int i2, boolean z) {
        if (this.m == i2) {
            return;
        }
        this.n0 = true;
        int iG = this.L ? G(i2) : Math.min(Math.max(i2, this.f12196k), this.l);
        int i3 = this.m;
        this.m = iG;
        a0();
        if (z) {
            N(i3, iG);
        }
        K();
        invalidate();
    }

    public final boolean Z() {
        return this.m0 && !this.n0;
    }

    public final boolean a0() {
        String strC;
        int i2 = this.m;
        int i3 = i2 - this.f12196k;
        String[] strArr = this.j;
        if (strArr == null) {
            strC = C(i2);
        } else {
            strC = (i3 < 0 || i3 >= strArr.length) ? "" : strArr[i3];
        }
        if (TextUtils.isEmpty(strC) || strC.equals(this.f12194a.getText().toString())) {
            return false;
        }
        this.f12194a.setText(strC);
        return true;
    }

    public final void b0(View view) {
        String strValueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(strValueOf)) {
            a0();
        } else {
            Y(E(strValueOf), true);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.y;
        if (scroller.isFinished()) {
            scroller = this.z;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.A == 0) {
            this.A = scroller.getStartY();
        }
        scrollBy(0, currY - this.A);
        this.A = currY;
        if (scroller.isFinished()) {
            P(scroller);
        } else {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        if (!this.M) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return false;
        }
        int y = (int) motionEvent.getY();
        if (y < this.R) {
            i2 = 3;
        } else {
            i2 = y > this.S ? 1 : 2;
        }
        int actionMasked = motionEvent.getActionMasked();
        c cVar = (c) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i3 = this.T;
            if (i3 == i2 || i3 == -1) {
                return false;
            }
            cVar.k(i3, 256);
            cVar.k(i2, 128);
            this.T = i2;
            cVar.performAction(i2, 64, null);
            return false;
        }
        if (actionMasked == 9) {
            cVar.k(i2, 128);
            this.T = i2;
            cVar.performAction(i2, 64, null);
            return false;
        }
        if (actionMasked != 10) {
            return false;
        }
        cVar.k(i2, 256);
        this.T = -1;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        requestFocus();
        r5.b0 = r0;
        U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.y.isFinished() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r0 != 20) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        w(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getKeyCode()
            r1 = 19
            r2 = 20
            if (r0 == r1) goto L19
            if (r0 == r2) goto L19
            r1 = 23
            if (r0 == r1) goto L15
            r1 = 66
            if (r0 == r1) goto L15
            goto L65
        L15:
            r5.U()
            goto L65
        L19:
            boolean r1 = r5.M
            if (r1 != 0) goto L1e
            goto L65
        L1e:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L28
            goto L65
        L28:
            int r1 = r5.b0
            if (r1 != r0) goto L65
            r6 = -1
            r5.b0 = r6
            return r3
        L30:
            boolean r1 = r5.L
            if (r1 != 0) goto L42
            if (r0 != r2) goto L37
            goto L42
        L37:
            int r1 = r5.getValue()
            int r4 = r5.getMinValue()
            if (r1 <= r4) goto L65
            goto L4c
        L42:
            int r1 = r5.getValue()
            int r4 = r5.getMaxValue()
            if (r1 >= r4) goto L65
        L4c:
            r5.requestFocus()
            r5.b0 = r0
            r5.U()
            android.widget.Scroller r6 = r5.y
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L64
            if (r0 != r2) goto L60
            r6 = r3
            goto L61
        L60:
            r6 = 0
        L61:
            r5.w(r6)
        L64:
            return r3
        L65:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.habit.widget.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            U();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            U();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (!this.M) {
            return super.getAccessibilityNodeProvider();
        }
        if (this.W == null) {
            this.W = new c();
        }
        return this.W;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.j;
    }

    public int getIncreaseValue() {
        return this.n;
    }

    public int getMaxValue() {
        return this.l;
    }

    public int getMinValue() {
        return this.f12196k;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.m;
    }

    public boolean getWrapSelectorWheel() {
        return this.L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        U();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.M) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f2 = width / 2;
        float f3 = this.x;
        Drawable drawable = this.u;
        if (drawable != null && this.O == 0) {
            if (this.V) {
                drawable.setState(w0);
                this.u.setBounds(paddingLeft, 0, width - paddingRight, this.R);
                this.u.draw(canvas);
            }
            if (this.U) {
                this.u.setState(w0);
                this.u.setBounds(paddingLeft, this.S, width - paddingRight, getBottom());
                this.u.draw(canvas);
            }
        }
        float f4 = this.w + (this.v * 2);
        SparseArray<String> sparseArray = this.q;
        int[] iArr = this.f12197r;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            String str = sparseArray.get(iArr[i2]);
            float fAbs = Z() ? 2.0f : Math.abs(f4 - f3) / this.v;
            float F = F(fAbs, this.d0, this.e0);
            this.s.setTextSize(F);
            this.s.setColor(D(fAbs, 2130706432, false));
            float f5 = ((F - this.e0) / 2.0f) + f3;
            if (i2 == iArr.length / 2) {
                this.s.setColor(getResources().getColor(hji.f20132a));
                canvas.drawText(str, f2, f5, this.s);
                this.t0 = str;
            } else {
                canvas.drawText(str, f2, f5, this.s);
                if (fAbs < 1.0f) {
                    this.s.setColor(D(fAbs, this.j0, true));
                    canvas.drawText(str, f2, f5, this.s);
                }
            }
            f3 += this.v;
        }
        if (TextUtils.isEmpty(this.l0)) {
            return;
        }
        float f6 = f4 + ((this.d0 - this.e0) / 2) + this.g0 + this.f0;
        String strTrim = this.l0.toString().trim();
        canvas.drawText(strTrim, AppUtil.isRTLDirection() ? f2 - (((x(this.t0) / 2.0f) + this.c0.measureText(strTrim)) + this.u0) : f2 + (x(this.t0) / 2.0f) + this.u0, (f6 - this.s0) + 12.0f, this.c0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((this.f12196k + this.m) * this.v);
        accessibilityEvent.setMaxScrollY((this.l - this.f12196k) * this.v);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.M || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        U();
        this.f12194a.setVisibility(4);
        float y = motionEvent.getY();
        this.E = y;
        this.G = y;
        this.F = motionEvent.getEventTime();
        this.P = false;
        this.Q = false;
        float f2 = this.E;
        if (f2 < this.R) {
            if (this.O == 0) {
                this.a0.a(2);
            }
        } else if (f2 > this.S && this.O == 0) {
            this.a0.a(1);
        }
        if (!this.y.isFinished()) {
            this.y.forceFinished(true);
            this.z.forceFinished(true);
            O(0);
        } else if (this.z.isFinished()) {
            float f3 = this.E;
            if (f3 < this.R) {
                R(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.S) {
                R(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.Q = true;
                Q();
            }
        } else {
            this.y.forceFinished(true);
            this.z.forceFinished(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!this.M) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f12194a.getMeasuredWidth();
        int measuredHeight2 = this.f12194a.getMeasuredHeight();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int i7 = (measuredHeight - measuredHeight2) / 2;
        this.f12194a.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
        if (z) {
            J();
            I();
            int height = getHeight();
            int i8 = this.f12195b;
            int i9 = this.N;
            int i10 = ((height - i8) / 2) - i9;
            this.R = i10;
            this.S = i10 + (i9 * 2) + i8;
            float fDip2px = DisplayUtil.dip2px(0.5f);
            float f2 = this.v * 2;
            float right = getRight() - DisplayUtil.dip2px(0.5f);
            int i11 = this.v;
            this.r0 = new RectF(fDip2px, f2, right, (i11 * 2) + i11);
            this.p0 = new RectF(DisplayUtil.dip2px(0.5f), (this.v * 2) + DisplayUtil.dip2px(0.8f), getRight() - DisplayUtil.dip2px(0.5f), this.v * 2);
            float fDip2px2 = DisplayUtil.dip2px(0.5f);
            int i12 = this.v;
            float right2 = getRight() - DisplayUtil.dip2px(0.5f);
            int i13 = this.v;
            this.q0 = new RectF(fDip2px2, (i12 * 2) + i12, right2, (i13 * 2) + i13 + DisplayUtil.dip2px(0.8f));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.M) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(L(i2, this.f), L(i3, this.d));
            setMeasuredDimension(X(this.e, getMeasuredWidth(), i2), X(this.c, getMeasuredHeight(), i3));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.M) {
            return false;
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            V();
            W();
            this.a0.c();
            VelocityTracker velocityTracker = this.H;
            velocityTracker.computeCurrentVelocity(1000, this.K);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.J) {
                B(yVelocity);
                O(2);
            } else {
                int y = (int) motionEvent.getY();
                int iAbs = (int) Math.abs(y - this.E);
                long eventTime = motionEvent.getEventTime() - this.F;
                if (iAbs > this.I || eventTime >= ViewConfiguration.getTapTimeout()) {
                    A();
                } else if (this.Q) {
                    this.Q = false;
                } else {
                    int i2 = (y / this.v) - 2;
                    if (i2 > 0) {
                        w(true);
                        this.a0.b(1);
                    } else if (i2 < 0) {
                        w(false);
                        this.a0.b(2);
                    }
                }
                O(0);
            }
            this.H.recycle();
            this.H = null;
        } else if (actionMasked == 2 && !this.P) {
            float y2 = motionEvent.getY();
            if (this.O == 1) {
                scrollBy(0, (int) (y2 - this.G));
                invalidate();
            } else if (((int) Math.abs(y2 - this.E)) > this.I) {
                U();
                O(1);
            }
            this.G = y2;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int[] iArr = this.f12197r;
        boolean z = this.L;
        if (!z && i3 > 0 && iArr[2] <= this.f12196k) {
            this.x = this.w;
            return;
        }
        if (!z && i3 < 0 && iArr[2] >= this.l) {
            this.x = this.w;
            return;
        }
        this.x += i3;
        while (true) {
            int i4 = this.x;
            if (i4 - this.w <= this.i) {
                break;
            }
            this.x = i4 - this.v;
            y(iArr);
            Y(iArr[2], true);
            if (!this.L && iArr[2] <= this.f12196k) {
                this.x = this.w;
            }
        }
        while (true) {
            int i5 = this.x;
            if (i5 - this.w >= (-this.i)) {
                return;
            }
            this.x = i5 + this.v;
            H(iArr);
            Y(iArr[2], true);
            if (!this.L && iArr[2] >= this.l) {
                this.x = this.w;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.j == strArr) {
            return;
        }
        this.j = strArr;
        if (strArr != null) {
            this.f12194a.setRawInputType(524289);
        } else {
            this.f12194a.setRawInputType(2);
        }
        a0();
        K();
    }

    public void setFormatter(f fVar) {
        if (fVar == this.o) {
            return;
        }
        this.o = fVar;
        K();
        a0();
    }

    public void setIncreaseValue(int i2) {
        this.n = i2;
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.l0;
        if ((charSequence != null || str == null) && (charSequence == null || charSequence.equals(str))) {
            return;
        }
        this.l0 = str;
        invalidate();
    }

    public void setLabelTextSize(int i2) {
        this.f0 = i2;
        Paint paint = this.c0;
        if (paint != null) {
            paint.setTextSize(i2);
            this.g0 = this.c0.ascent() - 6.0f;
        }
        invalidate();
    }

    public void setMaxValue(int i2) {
        if (this.l == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.l = i2;
        if (i2 < this.m) {
            this.m = i2;
        }
        setWrapSelectorWheel(i2 - this.f12196k > this.f12197r.length);
        K();
        a0();
        invalidate();
    }

    public void setMinValue(int i2) {
        if (this.f12196k == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f12196k = i2;
        if (i2 > this.m) {
            this.m = i2;
        }
        setWrapSelectorWheel(this.l - i2 > this.f12197r.length);
        K();
        a0();
        invalidate();
    }

    public void setNoHighlightBeforeChange(boolean z) {
        this.m0 = z;
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.p = j2;
    }

    public void setOnScrollListener(h hVar) {
    }

    public void setOnValueChangedListener(i iVar) {
    }

    public void setTextStyle(Typeface typeface) {
        this.s.setTypeface(typeface);
    }

    public void setValue(int i2) {
        Y(i2, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.l - this.f12196k >= this.f12197r.length;
        if ((!z || z2) && z != this.L) {
            this.L = z;
        }
        T();
    }

    public final void w(boolean z) {
        if (!this.M) {
            if (z) {
                Y(this.m + this.n, true);
                return;
            } else {
                Y(this.m - this.n, true);
                return;
            }
        }
        this.f12194a.setVisibility(4);
        if (!M(this.y)) {
            M(this.z);
        }
        this.A = 0;
        if (z) {
            this.y.startScroll(0, 0, 0, -this.v, 300);
        } else {
            this.y.startScroll(0, 0, 0, this.v, 300);
        }
        invalidate();
    }

    public final float x(String str) {
        this.s.setTextSize(this.d0);
        return this.s.measureText(str);
    }

    public final void y(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i2 = iArr[1] - this.n;
        if (this.L && i2 < this.f12196k) {
            i2 = this.l;
        }
        iArr[0] = i2;
        z(i2);
    }

    public final void z(int i2) {
        String strC;
        SparseArray<String> sparseArray = this.q;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.f12196k;
        if (i2 < i3 || i2 > this.l) {
            strC = "";
        } else {
            String[] strArr = this.j;
            strC = strArr != null ? strArr[i2 - i3] : C(i2);
        }
        sparseArray.put(i2, strC);
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, uhi.f35762a);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.n = 1;
        this.p = 300L;
        this.q = new SparseArray<>();
        this.f12197r = new int[5];
        this.w = Integer.MIN_VALUE;
        this.O = 0;
        this.b0 = -1;
        this.d0 = 20;
        this.e0 = 16;
        this.f0 = 10;
        this.i0 = 56.0f;
        this.j0 = getContext().getResources().getColor(hji.common_btn_normal_red_bg_color);
        this.k0 = 260;
        this.m0 = false;
        this.o0 = true;
        this.u0 = DisplayUtil.dip2px(2.0f);
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 != 1.0f) {
            this.e0 = (int) (this.e0 * f2);
            this.d0 = (int) (this.d0 * f2);
            this.f0 = (int) (this.f0 * f2);
            this.i0 *= f2;
            this.k0 = (int) (this.k0 * f2);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x0, 0, 0);
        this.l0 = typedArrayObtainStyledAttributes.getText(1);
        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.d0);
        this.j0 = typedArrayObtainStyledAttributes.getColor(2, this.j0);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = iui.u;
        this.M = true;
        this.N = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f12195b = (int) this.i0;
        this.c = -1;
        this.d = this.k0;
        this.e = -1;
        this.f = -1;
        this.g = true;
        this.a0 = new j();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i3, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(dri.number_picker_input);
        this.f12194a = editText;
        editText.setOnFocusChangeListener(new b());
        this.f12194a.setFilters(new InputFilter[]{new g()});
        this.f12194a.setRawInputType(2);
        this.f12194a.setImeOptions(6);
        this.f12194a.setVisibility(4);
        this.f12194a.setGravity(8388611);
        this.f12194a.setScaleX(0.0f);
        this.f12194a.setSaveEnabled(false);
        EditText editText2 = this.f12194a;
        editText2.setPadding(30, editText2.getPaddingTop(), 30, this.f12194a.getPaddingRight());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.I = viewConfiguration.getScaledTouchSlop();
        this.J = viewConfiguration.getScaledMinimumFlingVelocity();
        this.K = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.h = (int) this.f12194a.getTextSize();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.d0);
        paint.setTypeface(this.f12194a.getTypeface());
        paint.setColor(this.f12194a.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.s = paint;
        this.g0 = paint.ascent();
        Paint paint2 = new Paint();
        this.t = paint2;
        paint2.setColor(getResources().getColor(hji.d));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.c0 = paint3;
        paint3.setAntiAlias(true);
        this.c0.setFakeBoldText(false);
        this.c0.setColor(this.j0);
        this.c0.setTypeface(this.f12194a.getTypeface());
        this.c0.setTextSize(this.f0);
        this.h0 = this.c0.ascent();
        this.y = new Scroller(getContext(), null, true);
        this.z = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        a0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
