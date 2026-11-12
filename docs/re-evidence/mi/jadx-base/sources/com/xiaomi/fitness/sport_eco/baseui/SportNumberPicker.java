package com.xiaomi.fitness.sport_eco.baseui;

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
import defpackage.cki;
import defpackage.fvi;
import defpackage.whi;
import defpackage.zri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class SportNumberPicker extends LinearLayout {
    public static final f w0 = new a();
    public static final int[] x0 = {R.attr.state_pressed};
    public static final int[] y0 = {R.attr.textSize, R.attr.text, R.attr.color};
    public static final char[] z0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public final Scroller A;
    public int B;
    public k C;
    public e D;
    public d E;
    public float F;
    public long G;
    public float H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final boolean N;
    public final int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f13048a;
    public c a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13049b;
    public final j b0;
    public final int c;
    public int c0;
    public final int d;
    public Paint d0;
    public final int e;
    public int e0;
    public int f;
    public int f0;
    public final boolean g;
    public int g0;
    public int h;
    public float h0;
    public int i;
    public float i0;
    public String[] j;
    public float j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13050k;
    public int k0;
    public int l;
    public int l0;
    public int m;
    public CharSequence m0;
    public int n;
    public boolean n0;
    public i o;
    public boolean o0;
    public f p;
    public boolean p0;
    public long q;
    public RectF q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseArray<String> f13051r;
    public RectF r0;
    public final int[] s;
    public RectF s0;
    public final Paint t;
    public float t0;
    public final Paint u;
    public String u0;
    public Drawable v;
    public float v0;
    public int w;
    public int x;
    public int y;
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
        public final StringBuilder f13052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f13053b;
        public final Object[] c;

        public a() {
            StringBuilder sb = new StringBuilder();
            this.f13052a = sb;
            this.f13053b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker.f
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f13052a;
            sb.delete(0, sb.length());
            this.f13053b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f13053b.toString();
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                SportNumberPicker.this.f13048a.selectAll();
            } else {
                SportNumberPicker.this.f13048a.setSelection(0, 0);
                SportNumberPicker.this.c0(view);
            }
        }
    }

    public class c extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f13055a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f13056b = new int[2];
        public int c = Integer.MIN_VALUE;

        public c() {
        }

        public final AccessibilityNodeInfo a(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(SportNumberPicker.class.getName());
            accessibilityNodeInfoObtain.setPackageName(SportNumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(SportNumberPicker.this);
            if (g()) {
                accessibilityNodeInfoObtain.addChild(SportNumberPicker.this, 3);
            }
            accessibilityNodeInfoObtain.addChild(SportNumberPicker.this, 2);
            if (h()) {
                accessibilityNodeInfoObtain.addChild(SportNumberPicker.this, 1);
            }
            accessibilityNodeInfoObtain.setParent((View) SportNumberPicker.this.getParentForAccessibility());
            accessibilityNodeInfoObtain.setEnabled(SportNumberPicker.this.isEnabled());
            accessibilityNodeInfoObtain.setScrollable(true);
            Rect rect = this.f13055a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            accessibilityNodeInfoObtain.setVisibleToUser(SportNumberPicker.this.getVisibility() == 0);
            int[] iArr = this.f13056b;
            SportNumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.c != -1) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.c == -1) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (SportNumberPicker.this.isEnabled()) {
                if (SportNumberPicker.this.getWrapSelectorWheel() || SportNumberPicker.this.getValue() < SportNumberPicker.this.getMaxValue()) {
                    accessibilityNodeInfoObtain.addAction(4096);
                }
                if (SportNumberPicker.this.getWrapSelectorWheel() || SportNumberPicker.this.getValue() > SportNumberPicker.this.getMinValue()) {
                    accessibilityNodeInfoObtain.addAction(8192);
                }
            }
            return accessibilityNodeInfoObtain;
        }

        public final AccessibilityNodeInfo b(int i, String str, int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(Button.class.getName());
            accessibilityNodeInfoObtain.setPackageName(SportNumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(SportNumberPicker.this, i);
            accessibilityNodeInfoObtain.setParent(SportNumberPicker.this);
            accessibilityNodeInfoObtain.setText(str);
            accessibilityNodeInfoObtain.setClickable(true);
            accessibilityNodeInfoObtain.setLongClickable(true);
            accessibilityNodeInfoObtain.setEnabled(SportNumberPicker.this.isEnabled());
            Rect rect = this.f13055a;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfoObtain.setVisibleToUser(SportNumberPicker.this.getVisibility() == 0);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            int[] iArr = this.f13056b;
            SportNumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.c != i) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.c == i) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (SportNumberPicker.this.isEnabled()) {
                accessibilityNodeInfoObtain.addAction(16);
            }
            return accessibilityNodeInfoObtain;
        }

        public final AccessibilityNodeInfo c(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = SportNumberPicker.this.f13048a.createAccessibilityNodeInfo();
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setSource(SportNumberPicker.this, 2);
            if (this.c != 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(64);
            }
            if (this.c == 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(128);
            }
            Rect rect = this.f13055a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setVisibleToUser(SportNumberPicker.this.getVisibility() == 0);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.f13056b;
            SportNumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInScreen(rect);
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                return a(SportNumberPicker.this.getScrollX(), SportNumberPicker.this.getScrollY(), SportNumberPicker.this.getScrollX() + (SportNumberPicker.this.getRight() - SportNumberPicker.this.getLeft()), SportNumberPicker.this.getScrollY() + (SportNumberPicker.this.getBottom() - SportNumberPicker.this.getTop()));
            }
            if (i == 1) {
                return b(1, f(), SportNumberPicker.this.getScrollX(), SportNumberPicker.this.T - SportNumberPicker.this.O, SportNumberPicker.this.getScrollX() + (SportNumberPicker.this.getRight() - SportNumberPicker.this.getLeft()), SportNumberPicker.this.getScrollY() + (SportNumberPicker.this.getBottom() - SportNumberPicker.this.getTop()));
            }
            if (i != 2) {
                return i != 3 ? super.createAccessibilityNodeInfo(i) : b(3, e(), SportNumberPicker.this.getScrollX(), SportNumberPicker.this.getScrollY(), SportNumberPicker.this.getScrollX() + (SportNumberPicker.this.getRight() - SportNumberPicker.this.getLeft()), SportNumberPicker.this.S + SportNumberPicker.this.O);
            }
            return c(SportNumberPicker.this.getScrollX(), SportNumberPicker.this.S + SportNumberPicker.this.O, SportNumberPicker.this.getScrollX() + (SportNumberPicker.this.getRight() - SportNumberPicker.this.getLeft()), SportNumberPicker.this.T - SportNumberPicker.this.O);
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
            Editable text = SportNumberPicker.this.f13048a.getText();
            if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            Editable text2 = SportNumberPicker.this.f13048a.getText();
            if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(2));
        }

        public final String e() {
            int iG = SportNumberPicker.this.m - 1;
            if (SportNumberPicker.this.M) {
                iG = SportNumberPicker.this.G(iG);
            }
            if (iG >= SportNumberPicker.this.f13050k) {
                return SportNumberPicker.this.j == null ? SportNumberPicker.this.C(iG) : SportNumberPicker.this.j[iG - SportNumberPicker.this.f13050k];
            }
            return null;
        }

        public final String f() {
            int iG = SportNumberPicker.this.m + 1;
            if (SportNumberPicker.this.M) {
                iG = SportNumberPicker.this.G(iG);
            }
            if (iG <= SportNumberPicker.this.l) {
                return SportNumberPicker.this.j == null ? SportNumberPicker.this.C(iG) : SportNumberPicker.this.j[iG - SportNumberPicker.this.f13050k];
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
            return SportNumberPicker.this.getWrapSelectorWheel() || SportNumberPicker.this.getValue() > SportNumberPicker.this.getMinValue();
        }

        public final boolean h() {
            return SportNumberPicker.this.getWrapSelectorWheel() || SportNumberPicker.this.getValue() < SportNumberPicker.this.getMaxValue();
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
            if (((AccessibilityManager) SportNumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                accessibilityEventObtain.setClassName(Button.class.getName());
                accessibilityEventObtain.setPackageName(SportNumberPicker.this.getContext().getPackageName());
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setEnabled(SportNumberPicker.this.isEnabled());
                accessibilityEventObtain.setSource(SportNumberPicker.this, i);
                SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                sportNumberPicker.requestSendAccessibilityEvent(sportNumberPicker, accessibilityEventObtain);
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
            if (((AccessibilityManager) SportNumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
                SportNumberPicker.this.f13048a.onInitializeAccessibilityEvent(accessibilityEventObtain);
                SportNumberPicker.this.f13048a.onPopulateAccessibilityEvent(accessibilityEventObtain);
                accessibilityEventObtain.setSource(SportNumberPicker.this, 2);
                SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                sportNumberPicker.requestSendAccessibilityEvent(sportNumberPicker, accessibilityEventObtain);
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
                        if (!SportNumberPicker.this.isEnabled()) {
                            return false;
                        }
                        SportNumberPicker.this.w(true);
                        k(i, 1);
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.c == i) {
                            return false;
                        }
                        this.c = i;
                        k(i, 32768);
                        SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                        sportNumberPicker.invalidate(0, sportNumberPicker.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
                        return true;
                    }
                    if (i2 != 128 || this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    k(i, 65536);
                    SportNumberPicker sportNumberPicker2 = SportNumberPicker.this;
                    sportNumberPicker2.invalidate(0, sportNumberPicker2.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
                    return true;
                }
                if (i == 2) {
                    if (i2 == 1) {
                        if (!SportNumberPicker.this.isEnabled() || SportNumberPicker.this.f13048a.isFocused()) {
                            return false;
                        }
                        return SportNumberPicker.this.f13048a.requestFocus();
                    }
                    if (i2 == 2) {
                        if (!SportNumberPicker.this.isEnabled() || !SportNumberPicker.this.f13048a.isFocused()) {
                            return false;
                        }
                        SportNumberPicker.this.f13048a.clearFocus();
                        return true;
                    }
                    if (i2 == 16) {
                        return SportNumberPicker.this.isEnabled();
                    }
                    if (i2 == 64) {
                        if (this.c == i) {
                            return false;
                        }
                        this.c = i;
                        k(i, 32768);
                        SportNumberPicker.this.f13048a.invalidate();
                        return true;
                    }
                    if (i2 != 128) {
                        return SportNumberPicker.this.f13048a.performAccessibilityAction(i2, bundle);
                    }
                    if (this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    k(i, 65536);
                    SportNumberPicker.this.f13048a.invalidate();
                    return true;
                }
                if (i == 3) {
                    if (i2 == 16) {
                        if (!SportNumberPicker.this.isEnabled()) {
                            return false;
                        }
                        SportNumberPicker.this.w(i == 1);
                        k(i, 1);
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.c == i) {
                            return false;
                        }
                        this.c = i;
                        k(i, 32768);
                        SportNumberPicker sportNumberPicker3 = SportNumberPicker.this;
                        sportNumberPicker3.invalidate(0, 0, sportNumberPicker3.getRight(), SportNumberPicker.this.S);
                        return true;
                    }
                    if (i2 != 128 || this.c != i) {
                        return false;
                    }
                    this.c = Integer.MIN_VALUE;
                    k(i, 65536);
                    SportNumberPicker sportNumberPicker4 = SportNumberPicker.this;
                    sportNumberPicker4.invalidate(0, 0, sportNumberPicker4.getRight(), SportNumberPicker.this.S);
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
                    if (!SportNumberPicker.this.isEnabled() || (!SportNumberPicker.this.getWrapSelectorWheel() && SportNumberPicker.this.getValue() >= SportNumberPicker.this.getMaxValue())) {
                        return false;
                    }
                    SportNumberPicker.this.w(true);
                    return true;
                }
                if (i2 == 8192) {
                    if (!SportNumberPicker.this.isEnabled() || (!SportNumberPicker.this.getWrapSelectorWheel() && SportNumberPicker.this.getValue() <= SportNumberPicker.this.getMinValue())) {
                        return false;
                    }
                    SportNumberPicker.this.w(false);
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
            SportNumberPicker.this.Q = true;
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13058a;

        public e() {
        }

        public final void b(boolean z) {
            this.f13058a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SportNumberPicker.this.w(this.f13058a);
            SportNumberPicker sportNumberPicker = SportNumberPicker.this;
            sportNumberPicker.postDelayed(this, sportNumberPicker.q);
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
            if (SportNumberPicker.this.j == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i4, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                return (SportNumberPicker.this.E(str) > SportNumberPicker.this.l || str.length() > String.valueOf(SportNumberPicker.this.l).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : SportNumberPicker.this.j) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    SportNumberPicker.this.T(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return SportNumberPicker.z0;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface h {
    }

    public interface i {
        void a(SportNumberPicker sportNumberPicker, int i, int i2);
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13061a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13062b = 2;
        public int c;
        public int d;

        public j() {
        }

        public void a(int i) {
            c();
            this.d = 1;
            this.c = i;
            SportNumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void b(int i) {
            c();
            this.d = 2;
            this.c = i;
            SportNumberPicker.this.post(this);
        }

        public void c() {
            this.d = 0;
            this.c = 0;
            SportNumberPicker.this.removeCallbacks(this);
            if (SportNumberPicker.this.V) {
                SportNumberPicker.this.V = false;
                SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                sportNumberPicker.invalidate(0, sportNumberPicker.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
            }
            if (SportNumberPicker.this.W) {
                SportNumberPicker.this.W = false;
                SportNumberPicker sportNumberPicker2 = SportNumberPicker.this;
                sportNumberPicker2.invalidate(0, 0, sportNumberPicker2.getRight(), SportNumberPicker.this.S);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.d;
            if (i == 1) {
                int i2 = this.c;
                if (i2 == 1) {
                    SportNumberPicker.this.V = true;
                    SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                    sportNumberPicker.invalidate(0, sportNumberPicker.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    SportNumberPicker.this.W = true;
                    SportNumberPicker sportNumberPicker2 = SportNumberPicker.this;
                    sportNumberPicker2.invalidate(0, 0, sportNumberPicker2.getRight(), SportNumberPicker.this.S);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            int i3 = this.c;
            if (i3 == 1) {
                if (!SportNumberPicker.this.V) {
                    SportNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                SportNumberPicker sportNumberPicker3 = SportNumberPicker.this;
                sportNumberPicker3.V = !sportNumberPicker3.V;
                SportNumberPicker sportNumberPicker4 = SportNumberPicker.this;
                sportNumberPicker4.invalidate(0, sportNumberPicker4.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!SportNumberPicker.this.W) {
                SportNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            SportNumberPicker sportNumberPicker5 = SportNumberPicker.this;
            sportNumberPicker5.W = !sportNumberPicker5.W;
            SportNumberPicker sportNumberPicker6 = SportNumberPicker.this;
            sportNumberPicker6.invalidate(0, 0, sportNumberPicker6.getRight(), SportNumberPicker.this.S);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13064b;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SportNumberPicker.this.f13048a.setSelection(this.f13063a, this.f13064b);
        }
    }

    public SportNumberPicker(Context context) {
        this(context, null);
    }

    public final boolean A() {
        int i2 = this.x - this.y;
        if (i2 == 0) {
            return false;
        }
        this.B = 0;
        int iAbs = Math.abs(i2);
        int i3 = this.w;
        if (iAbs > i3 / 2) {
            if (i2 > 0) {
                i3 = -i3;
            }
            i2 += i3;
        }
        this.A.startScroll(0, 0, 0, i2, 800);
        invalidate();
        return true;
    }

    public final void B(int i2) {
        this.B = 0;
        if (i2 > 0) {
            this.z.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.z.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    public final String C(int i2) {
        f fVar = this.p;
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
                    return this.f13050k + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f13050k;
        }
    }

    public final float F(float f2, int i2, int i3) {
        return f2 >= 1.0f ? i3 : (f2 * (i3 - i2)) + i2;
    }

    public final int G(int i2) {
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = this.f13050k;
            return (i4 + ((i2 - i3) % (i3 - i4))) - this.n;
        }
        int i5 = this.f13050k;
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
        if (this.M && i4 > this.l) {
            i4 = this.f13050k;
        }
        iArr[iArr.length - 1] = i4;
        z(i4);
    }

    public void I(int i2, int i3, int i4) {
        this.p0 = false;
        this.e0 = i2;
        this.f0 = i3;
        this.t.setTextSize(i2);
        this.h0 = this.t.ascent();
        if (i4 > 0) {
            this.g0 = i4;
            this.d0.setTextSize(i4);
        }
        this.t0 = this.d0.ascent() + this.d0.descent();
    }

    public final void J() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.h) / 2);
    }

    public final void K() {
        L();
        int[] iArr = this.s;
        int bottom = (int) ((((getBottom() - getTop()) - (iArr.length * this.h)) / iArr.length) + 1.0f);
        this.i = bottom;
        this.w = this.h + bottom;
        int baseline = (this.f13048a.getBaseline() + this.f13048a.getTop()) - (this.w * 2);
        this.x = baseline;
        this.y = baseline;
        b0();
    }

    public final void L() {
        this.f13051r.clear();
        int[] iArr = this.s;
        int value = getValue();
        for (int i2 = 0; i2 < this.s.length; i2++) {
            int iG = ((i2 - 2) * this.n) + value;
            if (this.M) {
                iG = G(iG);
            }
            iArr[i2] = iG;
            z(iG);
        }
    }

    public final int M(int i2, int i3) {
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

    public final boolean N(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = this.x - ((this.y + finalY) % this.w);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.w;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, finalY + i2);
        return true;
    }

    public final void O(int i2, int i3) {
        i iVar = this.o;
        if (iVar != null) {
            iVar.a(this, i2, this.m);
        }
    }

    public final void P(int i2) {
        if (this.P == i2) {
            return;
        }
        this.P = i2;
    }

    public final void Q(Scroller scroller) {
        if (scroller == this.z) {
            if (!A()) {
                b0();
            }
            P(0);
        } else if (this.P != 1) {
            b0();
        }
    }

    public final void R() {
        d dVar = this.E;
        if (dVar == null) {
            this.E = new d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
    }

    public final void S(boolean z, long j2) {
        e eVar = this.D;
        if (eVar == null) {
            this.D = new e();
        } else {
            removeCallbacks(eVar);
        }
        this.D.b(z);
        postDelayed(this.D, j2);
    }

    public final void T(int i2, int i3) {
        k kVar = this.C;
        if (kVar == null) {
            this.C = new k();
        } else {
            removeCallbacks(kVar);
        }
        this.C.f13063a = i2;
        this.C.f13064b = i3;
        post(this.C);
    }

    public final void U() {
        L();
        invalidate();
    }

    public final void V() {
        e eVar = this.D;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        k kVar = this.C;
        if (kVar != null) {
            removeCallbacks(kVar);
        }
        d dVar = this.E;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.b0.c();
    }

    public final void W() {
        d dVar = this.E;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    public final void X() {
        e eVar = this.D;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    public final int Y(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    public final void Z(int i2, boolean z) {
        if (this.m == i2) {
            return;
        }
        this.o0 = true;
        int iG = this.M ? G(i2) : Math.min(Math.max(i2, this.f13050k), this.l);
        int i3 = this.m;
        this.m = iG;
        b0();
        if (z) {
            O(i3, iG);
        }
        L();
        invalidate();
    }

    public final boolean a0() {
        return this.n0 && !this.o0;
    }

    public final boolean b0() {
        String[] strArr = this.j;
        String strC = strArr == null ? C(this.m) : strArr[this.m - this.f13050k];
        if (TextUtils.isEmpty(strC) || strC.equals(this.f13048a.getText().toString())) {
            return false;
        }
        this.f13048a.setText(strC);
        return true;
    }

    public final void c0(View view) {
        String strValueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(strValueOf)) {
            b0();
        } else {
            Z(E(strValueOf), true);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.z;
        if (scroller.isFinished()) {
            scroller = this.A;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.B == 0) {
            this.B = scroller.getStartY();
        }
        scrollBy(0, currY - this.B);
        this.B = currY;
        if (scroller.isFinished()) {
            Q(scroller);
        } else {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        if (!this.N) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return false;
        }
        int y = (int) motionEvent.getY();
        if (y < this.S) {
            i2 = 3;
        } else {
            i2 = y > this.T ? 1 : 2;
        }
        int actionMasked = motionEvent.getActionMasked();
        c cVar = (c) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i3 = this.U;
            if (i3 == i2 || i3 == -1) {
                return false;
            }
            cVar.k(i3, 256);
            cVar.k(i2, 128);
            this.U = i2;
            cVar.performAction(i2, 64, null);
            return false;
        }
        if (actionMasked == 9) {
            cVar.k(i2, 128);
            this.U = i2;
            cVar.performAction(i2, 64, null);
            return false;
        }
        if (actionMasked != 10) {
            return false;
        }
        cVar.k(i2, 256);
        this.U = -1;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        requestFocus();
        r5.c0 = r0;
        V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.z.isFinished() == false) goto L37;
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
            r5.V()
            goto L65
        L19:
            boolean r1 = r5.N
            if (r1 != 0) goto L1e
            goto L65
        L1e:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L28
            goto L65
        L28:
            int r1 = r5.c0
            if (r1 != r0) goto L65
            r6 = -1
            r5.c0 = r6
            return r3
        L30:
            boolean r1 = r5.M
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
            r5.c0 = r0
            r5.V()
            android.widget.Scroller r6 = r5.z
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            V();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            V();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (!this.N) {
            return super.getAccessibilityNodeProvider();
        }
        if (this.a0 == null) {
            this.a0 = new c();
        }
        return this.a0;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.j;
    }

    public int getDistanceOffset() {
        return this.l0;
    }

    public int getIncreaseValue() {
        return this.n;
    }

    public int getMaxValue() {
        return this.l;
    }

    public int getMinValue() {
        return this.f13050k;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.m;
    }

    public boolean getWrapSelectorWheel() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.N) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f2 = width / 2;
        float f3 = this.y;
        Drawable drawable = this.v;
        if (drawable != null && this.P == 0) {
            if (this.W) {
                drawable.setState(x0);
                this.v.setBounds(paddingLeft, 0, width - paddingRight, this.S);
                this.v.draw(canvas);
            }
            if (this.V) {
                this.v.setState(x0);
                this.v.setBounds(paddingLeft, this.T, width - paddingRight, getBottom());
                this.v.draw(canvas);
            }
        }
        float f4 = this.x + (this.w * 2);
        SparseArray<String> sparseArray = this.f13051r;
        int[] iArr = this.s;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            String str = sparseArray.get(iArr[i2]);
            float fAbs = a0() ? 2.0f : Math.abs(f4 - f3) / this.w;
            float F = F(fAbs, this.e0, this.f0);
            this.t.setTextSize(F);
            this.t.setColor(D(fAbs, getResources().getColor(cki.o), false));
            float f5 = ((F - this.f0) / 2.0f) + f3;
            if (i2 == iArr.length / 2) {
                this.t.setColor(getResources().getColor(cki.e));
                canvas.drawText(str, f2, f5, this.t);
                this.u0 = str;
            } else {
                canvas.drawText(str, f2, f5, this.t);
                if (fAbs < 1.0f) {
                    this.t.setColor(D(fAbs, this.k0, true));
                    canvas.drawText(str, f2, f5, this.t);
                }
            }
            f3 += this.w;
        }
        if (TextUtils.isEmpty(this.m0)) {
            return;
        }
        float f6 = f4 + ((this.e0 - this.f0) / 2) + this.h0 + this.g0;
        String strTrim = this.m0.toString().trim();
        canvas.drawText(strTrim, AppUtil.isRTLDirection() ? f2 - (((x(this.u0) / 2.0f) + this.d0.measureText(strTrim)) + this.v0) : f2 + (x(this.u0) / 2.0f) + this.v0, (f6 - this.t0) + 12.0f, this.d0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SportNumberPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((this.f13050k + this.m) * this.w);
        accessibilityEvent.setMaxScrollY((this.l - this.f13050k) * this.w);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.N || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        V();
        this.f13048a.setVisibility(4);
        float y = motionEvent.getY();
        this.F = y;
        this.H = y;
        this.G = motionEvent.getEventTime();
        this.Q = false;
        this.R = false;
        float f2 = this.F;
        if (f2 < this.S) {
            if (this.P == 0) {
                this.b0.a(2);
            }
        } else if (f2 > this.T && this.P == 0) {
            this.b0.a(1);
        }
        if (!this.z.isFinished()) {
            this.z.forceFinished(true);
            this.A.forceFinished(true);
            P(0);
        } else if (this.A.isFinished()) {
            float f3 = this.F;
            if (f3 < this.S) {
                S(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.T) {
                S(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.R = true;
                R();
            }
        } else {
            this.z.forceFinished(true);
            this.A.forceFinished(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!this.N) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f13048a.getMeasuredWidth();
        int measuredHeight2 = this.f13048a.getMeasuredHeight();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int i7 = (measuredHeight - measuredHeight2) / 2;
        this.f13048a.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
        if (z) {
            K();
            J();
            int height = getHeight();
            int i8 = this.f13049b;
            int i9 = this.O;
            int i10 = ((height - i8) / 2) - i9;
            this.S = i10;
            this.T = i10 + (i9 * 2) + i8;
            float fDip2px = DisplayUtil.dip2px(0.5f);
            float f2 = this.w * 2;
            float right = getRight() - DisplayUtil.dip2px(0.5f);
            int i11 = this.w;
            this.s0 = new RectF(fDip2px, f2, right, (i11 * 2) + i11);
            this.q0 = new RectF(DisplayUtil.dip2px(0.5f), (this.w * 2) + DisplayUtil.dip2px(0.8f), getRight() - DisplayUtil.dip2px(0.5f), this.w * 2);
            float fDip2px2 = DisplayUtil.dip2px(0.5f);
            int i12 = this.w;
            float right2 = getRight() - DisplayUtil.dip2px(0.5f);
            int i13 = this.w;
            this.r0 = new RectF(fDip2px2, (i12 * 2) + i12, right2, (i13 * 2) + i13 + DisplayUtil.dip2px(0.8f));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.N) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(M(i2, this.f), M(i3, this.d));
            setMeasuredDimension(Y(this.e, getMeasuredWidth(), i2), Y(this.c, getMeasuredHeight(), i3));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.N) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            W();
            X();
            this.b0.c();
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.K) {
                B(yVelocity);
                P(2);
            } else {
                int y = (int) motionEvent.getY();
                int iAbs = (int) Math.abs(y - this.F);
                long eventTime = motionEvent.getEventTime() - this.G;
                if (iAbs > this.J || eventTime >= ViewConfiguration.getTapTimeout()) {
                    A();
                } else if (this.R) {
                    this.R = false;
                } else {
                    int i2 = (y / this.w) - 2;
                    if (i2 > 0) {
                        w(true);
                        this.b0.b(1);
                    } else if (i2 < 0) {
                        w(false);
                        this.b0.b(2);
                    }
                }
                P(0);
            }
            this.I.recycle();
            this.I = null;
        } else if (actionMasked == 2 && !this.Q) {
            float y2 = motionEvent.getY();
            if (this.P == 1) {
                scrollBy(0, (int) (y2 - this.H));
                invalidate();
            } else if (((int) Math.abs(y2 - this.F)) > this.J) {
                V();
                P(1);
            }
            this.H = y2;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int[] iArr = this.s;
        boolean z = this.M;
        if (!z && i3 > 0 && iArr[2] <= this.f13050k) {
            this.y = this.x;
            return;
        }
        if (!z && i3 < 0 && iArr[2] >= this.l) {
            this.y = this.x;
            return;
        }
        this.y += i3;
        while (true) {
            int i4 = this.y;
            if (i4 - this.x <= this.i) {
                break;
            }
            this.y = i4 - this.w;
            y(iArr);
            Z(iArr[2], true);
            if (!this.M && iArr[2] <= this.f13050k) {
                this.y = this.x;
            }
        }
        while (true) {
            int i5 = this.y;
            if (i5 - this.x >= (-this.i)) {
                return;
            }
            this.y = i5 + this.w;
            H(iArr);
            Z(iArr[2], true);
            if (!this.M && iArr[2] >= this.l) {
                this.y = this.x;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.j == strArr) {
            return;
        }
        this.j = strArr;
        if (strArr != null) {
            this.f13048a.setRawInputType(524289);
        } else {
            this.f13048a.setRawInputType(2);
        }
        b0();
        L();
    }

    public void setDistanceOffset(int i2) {
        this.l0 = i2;
    }

    public void setFormatter(f fVar) {
        if (fVar == this.p) {
            return;
        }
        this.p = fVar;
        L();
        b0();
    }

    public void setIncreaseValue(int i2) {
        this.n = i2;
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.m0;
        if ((charSequence != null || str == null) && (charSequence == null || charSequence.equals(str))) {
            return;
        }
        this.m0 = str;
        invalidate();
    }

    public void setLabelTextSize(int i2) {
        this.g0 = i2;
        Paint paint = this.d0;
        if (paint != null) {
            paint.setTextSize(i2);
            this.h0 = this.d0.ascent() - 6.0f;
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
        setWrapSelectorWheel(i2 - this.f13050k > this.s.length);
        L();
        b0();
        invalidate();
    }

    public void setMinValue(int i2) {
        if (this.f13050k == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f13050k = i2;
        if (i2 > this.m) {
            this.m = i2;
        }
        setWrapSelectorWheel(this.l - i2 > this.s.length);
        L();
        b0();
        invalidate();
    }

    public void setNoHighlightBeforeChange(boolean z) {
        this.n0 = z;
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.q = j2;
    }

    public void setOnScrollListener(h hVar) {
    }

    public void setOnValueChangedListener(i iVar) {
        this.o = iVar;
    }

    public void setTextStyle(Typeface typeface) {
        this.t.setTypeface(typeface);
    }

    public void setValue(int i2) {
        Z(i2, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.l - this.f13050k >= this.s.length;
        if ((!z || z2) && z != this.M) {
            this.M = z;
        }
        U();
    }

    public final void w(boolean z) {
        if (!this.N) {
            if (z) {
                Z(this.m + this.n, true);
                return;
            } else {
                Z(this.m - this.n, true);
                return;
            }
        }
        this.f13048a.setVisibility(4);
        if (!N(this.z)) {
            N(this.A);
        }
        this.B = 0;
        if (z) {
            this.z.startScroll(0, 0, 0, -this.w, 300);
        } else {
            this.z.startScroll(0, 0, 0, this.w, 300);
        }
        invalidate();
    }

    public final float x(String str) {
        this.t.setTextSize(this.e0);
        return this.t.measureText(str);
    }

    public final void y(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i2 = iArr[1] - this.n;
        if (this.M && i2 < this.f13050k) {
            i2 = this.l;
        }
        iArr[0] = i2;
        z(i2);
    }

    public final void z(int i2) {
        String strC;
        SparseArray<String> sparseArray = this.f13051r;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.f13050k;
        if (i2 < i3 || i2 > this.l) {
            strC = "";
        } else {
            String[] strArr = this.j;
            strC = strArr != null ? strArr[i2 - i3] : C(i2);
        }
        sparseArray.put(i2, strC);
    }

    public SportNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, whi.f37982a);
    }

    public SportNumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.n = 1;
        this.q = 300L;
        this.f13051r = new SparseArray<>();
        this.s = new int[5];
        this.x = Integer.MIN_VALUE;
        this.P = 0;
        this.c0 = -1;
        this.e0 = 20;
        this.f0 = 16;
        this.g0 = 10;
        this.j0 = 56.0f;
        this.k0 = getContext().getResources().getColor(cki.e);
        this.l0 = 320;
        this.n0 = false;
        this.p0 = true;
        this.v0 = DisplayUtil.dip2px(2.0f);
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 != 1.0f) {
            this.f0 = (int) (this.f0 * f2);
            this.e0 = (int) (this.e0 * f2);
            this.g0 = (int) (this.g0 * f2);
            this.j0 *= f2;
            this.l0 = (int) (this.l0 * f2);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, y0, 0, 0);
        this.m0 = typedArrayObtainStyledAttributes.getText(1);
        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.e0);
        this.k0 = typedArrayObtainStyledAttributes.getColor(2, this.k0);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = fvi.P;
        this.N = true;
        this.O = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f13049b = (int) this.j0;
        this.c = -1;
        this.d = this.l0;
        this.e = -1;
        this.f = -1;
        this.g = true;
        this.b0 = new j();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i3, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(zri.number_picker_input);
        this.f13048a = editText;
        editText.setOnFocusChangeListener(new b());
        this.f13048a.setFilters(new InputFilter[]{new g()});
        this.f13048a.setRawInputType(2);
        this.f13048a.setImeOptions(6);
        this.f13048a.setVisibility(4);
        this.f13048a.setGravity(8388611);
        this.f13048a.setScaleX(0.0f);
        this.f13048a.setSaveEnabled(false);
        EditText editText2 = this.f13048a;
        editText2.setPadding(30, editText2.getPaddingTop(), 30, this.f13048a.getPaddingRight());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.J = viewConfiguration.getScaledTouchSlop();
        this.K = viewConfiguration.getScaledMinimumFlingVelocity();
        this.L = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.h = (int) this.f13048a.getTextSize();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.e0);
        paint.setTypeface(this.f13048a.getTypeface());
        paint.setColor(this.f13048a.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.t = paint;
        this.h0 = paint.ascent();
        Paint paint2 = new Paint();
        this.u = paint2;
        paint2.setColor(getResources().getColor(cki.d));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.d0 = paint3;
        paint3.setAntiAlias(true);
        this.d0.setFakeBoldText(false);
        this.d0.setColor(this.k0);
        this.d0.setTypeface(this.f13048a.getTypeface());
        this.d0.setTextSize(this.g0);
        this.i0 = this.d0.ascent();
        this.z = new Scroller(getContext(), null, true);
        this.A = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        b0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
