package com.xiaomi.fitness.sport.baseui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.aki;
import defpackage.dvi;
import defpackage.vhi;
import defpackage.xri;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class SportNumberPicker extends LinearLayout {
    public static final e v0 = new a();
    public static final int[] w0 = {R.attr.state_pressed};
    public static final int[] x0 = {R.attr.textSize, R.attr.text, R.attr.color};
    public static final char[] y0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public final Scroller A;
    public int B;
    public j C;
    public d D;
    public c E;
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
    public boolean U;
    public boolean V;
    public final i W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f12919a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12920b;
    public Paint b0;
    public final int c;
    public int c0;
    public final int d;
    public int d0;
    public final int e;
    public int e0;
    public int f;
    public float f0;
    public final boolean g;
    public float g0;
    public int h;
    public float h0;
    public int i;
    public int i0;
    public String[] j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12921k;
    public CharSequence k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public h o;
    public RectF o0;
    public e p;
    public RectF p0;
    public long q;
    public RectF q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseArray<String> f12922r;
    public float r0;
    public final int[] s;
    public String s0;
    public final Paint t;
    public float t0;
    public final Paint u;
    public String u0;
    public Drawable v;
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

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f12923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f12924b;
        public final Object[] c;

        public a() {
            StringBuilder sb = new StringBuilder();
            this.f12923a = sb;
            this.f12924b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // com.xiaomi.fitness.sport.baseui.SportNumberPicker.e
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f12923a;
            sb.delete(0, sb.length());
            this.f12924b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f12924b.toString();
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                SportNumberPicker.this.f12919a.selectAll();
            } else {
                SportNumberPicker.this.f12919a.setSelection(0, 0);
                SportNumberPicker.this.Z(view);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SportNumberPicker.this.Q = true;
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12927a;

        public d() {
        }

        public final void b(boolean z) {
            this.f12927a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SportNumberPicker.this.r(this.f12927a);
            SportNumberPicker sportNumberPicker = SportNumberPicker.this;
            sportNumberPicker.postDelayed(this, sportNumberPicker.q);
        }
    }

    public interface e {
        String format(int i);
    }

    public class f extends NumberKeyListener {
        public f() {
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
                return (SportNumberPicker.this.z(str) > SportNumberPicker.this.l || str.length() > String.valueOf(SportNumberPicker.this.l).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : SportNumberPicker.this.j) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    SportNumberPicker.this.P(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return SportNumberPicker.y0;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface g {
    }

    public interface h {
        void a(SportNumberPicker sportNumberPicker, int i, int i2);
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12930a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12931b = 2;
        public int c;
        public int d;

        public i() {
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
            if (SportNumberPicker.this.U) {
                SportNumberPicker.this.U = false;
                SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                sportNumberPicker.invalidate(0, sportNumberPicker.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
            }
            if (SportNumberPicker.this.V) {
                SportNumberPicker.this.V = false;
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
                    SportNumberPicker.this.U = true;
                    SportNumberPicker sportNumberPicker = SportNumberPicker.this;
                    sportNumberPicker.invalidate(0, sportNumberPicker.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    SportNumberPicker.this.V = true;
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
                if (!SportNumberPicker.this.U) {
                    SportNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                SportNumberPicker sportNumberPicker3 = SportNumberPicker.this;
                sportNumberPicker3.U = !sportNumberPicker3.U;
                SportNumberPicker sportNumberPicker4 = SportNumberPicker.this;
                sportNumberPicker4.invalidate(0, sportNumberPicker4.T, SportNumberPicker.this.getRight(), SportNumberPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!SportNumberPicker.this.V) {
                SportNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            SportNumberPicker sportNumberPicker5 = SportNumberPicker.this;
            sportNumberPicker5.V = !sportNumberPicker5.V;
            SportNumberPicker sportNumberPicker6 = SportNumberPicker.this;
            sportNumberPicker6.invalidate(0, 0, sportNumberPicker6.getRight(), SportNumberPicker.this.S);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12933b;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SportNumberPicker.this.f12919a.setSelection(this.f12932a, this.f12933b);
        }
    }

    public SportNumberPicker(Context context) {
        this(context, null);
    }

    public final float A(float f2, int i2, int i3) {
        return f2 >= 1.0f ? i3 : (f2 * (i3 - i2)) + i2;
    }

    public final int B(int i2) {
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = this.f12921k;
            return (i4 + ((i2 - i3) % (i3 - i4))) - this.n;
        }
        int i5 = this.f12921k;
        return i2 < i5 ? (i3 - ((i5 - i2) % (i3 - i5))) + this.n : i2;
    }

    public final void C(int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length - 1) {
            int i3 = i2 + 1;
            iArr[i2] = iArr[i3];
            i2 = i3;
        }
        int i4 = iArr[iArr.length - 2] + this.n;
        if (this.M && i4 > this.l) {
            i4 = this.f12921k;
        }
        iArr[iArr.length - 1] = i4;
        u(i4);
    }

    public void D(int i2, int i3, int i4) {
        this.n0 = false;
        this.c0 = i2;
        this.d0 = i3;
        this.t.setTextSize(i2);
        this.f0 = this.t.ascent();
        if (i4 > 0) {
            this.e0 = i4;
            this.b0.setTextSize(i4);
        }
        this.r0 = this.b0.ascent() + this.b0.descent();
    }

    public final void E() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.h) / 2);
    }

    public final void F() {
        G();
        int[] iArr = this.s;
        int bottom = (int) ((((getBottom() - getTop()) - (iArr.length * this.h)) / iArr.length) + 1.0f);
        this.i = bottom;
        this.w = this.h + bottom;
        int baseline = (this.f12919a.getBaseline() + this.f12919a.getTop()) - (this.w * 2);
        this.x = baseline;
        this.y = baseline;
        Y();
    }

    public final void G() {
        this.f12922r.clear();
        int[] iArr = this.s;
        int value = getValue();
        for (int i2 = 0; i2 < this.s.length; i2++) {
            int iB = ((i2 - 2) * this.n) + value;
            if (this.M) {
                iB = B(iB);
            }
            iArr[i2] = iB;
            u(iB);
        }
    }

    public final int I(int i2, int i3) {
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

    public final boolean J(Scroller scroller) {
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

    public final void K(int i2, int i3) {
        h hVar = this.o;
        if (hVar != null) {
            hVar.a(this, i2, this.m);
        }
    }

    public final void L(int i2) {
        if (this.P == i2) {
            return;
        }
        this.P = i2;
    }

    public final void M(Scroller scroller) {
        if (scroller == this.z) {
            if (!v()) {
                Y();
            }
            L(0);
        } else if (this.P != 1) {
            Y();
        }
    }

    public final void N() {
        c cVar = this.E;
        if (cVar == null) {
            this.E = new c();
        } else {
            removeCallbacks(cVar);
        }
        postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
    }

    public final void O(boolean z, long j2) {
        d dVar = this.D;
        if (dVar == null) {
            this.D = new d();
        } else {
            removeCallbacks(dVar);
        }
        this.D.b(z);
        postDelayed(this.D, j2);
    }

    public final void P(int i2, int i3) {
        j jVar = this.C;
        if (jVar == null) {
            this.C = new j();
        } else {
            removeCallbacks(jVar);
        }
        this.C.f12932a = i2;
        this.C.f12933b = i3;
        post(this.C);
    }

    public final void Q() {
        G();
        invalidate();
    }

    public final void R() {
        d dVar = this.D;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        j jVar = this.C;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        c cVar = this.E;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
        this.W.c();
    }

    public final void S() {
        c cVar = this.E;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
    }

    public final void T() {
        d dVar = this.D;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    public final int U(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void H() {
        setContentDescription(this.u0);
    }

    public final void W(int i2, boolean z) {
        if (this.m == i2) {
            return;
        }
        this.m0 = true;
        int iB = this.M ? B(i2) : Math.min(Math.max(i2, this.f12921k), this.l);
        int i3 = this.m;
        this.m = iB;
        Y();
        if (z) {
            K(i3, iB);
        }
        G();
        invalidate();
    }

    public final boolean X() {
        return this.l0 && !this.m0;
    }

    public final boolean Y() {
        String[] strArr = this.j;
        String strX = strArr == null ? x(this.m) : strArr[this.m - this.f12921k];
        this.u0 = strX;
        postDelayed(new Runnable() { // from class: mrn
            @Override // java.lang.Runnable
            public final void run() {
                this.f27138a.H();
            }
        }, 1000L);
        if (TextUtils.isEmpty(strX) || strX.equals(this.f12919a.getText().toString())) {
            return false;
        }
        this.f12919a.setText(strX);
        return true;
    }

    public final void Z(View view) {
        String strValueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(strValueOf)) {
            Y();
        } else {
            W(z(strValueOf), true);
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
            M(scroller);
        } else {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        requestFocus();
        r5.a0 = r0;
        R();
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
    
        r(r6);
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
            r5.R()
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
            int r1 = r5.a0
            if (r1 != r0) goto L65
            r6 = -1
            r5.a0 = r6
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
            r5.a0 = r0
            r5.R()
            android.widget.Scroller r6 = r5.z
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L64
            if (r0 != r2) goto L60
            r6 = r3
            goto L61
        L60:
            r6 = 0
        L61:
            r5.r(r6)
        L64:
            return r3
        L65:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport.baseui.SportNumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            R();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            R();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.j;
    }

    public int getDistanceOffset() {
        return this.j0;
    }

    public e getFormatter() {
        return this.p;
    }

    public int getIncreaseValue() {
        return this.n;
    }

    public int getMaxValue() {
        return this.l;
    }

    public int getMinValue() {
        return this.f12921k;
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
        R();
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
            if (this.V) {
                drawable.setState(w0);
                this.v.setBounds(paddingLeft, 0, width - paddingRight, this.S);
                this.v.draw(canvas);
            }
            if (this.U) {
                this.v.setState(w0);
                this.v.setBounds(paddingLeft, this.T, width - paddingRight, getBottom());
                this.v.draw(canvas);
            }
        }
        float f4 = this.x + (this.w * 2);
        SparseArray<String> sparseArray = this.f12922r;
        int[] iArr = this.s;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            String str = sparseArray.get(iArr[i2]);
            float fAbs = X() ? 2.0f : Math.abs(f4 - f3) / this.w;
            float fA = A(fAbs, this.c0, this.d0);
            this.t.setTextSize(fA);
            this.t.setColor(y(fAbs, getResources().getColor(aki.z), false));
            float f5 = ((fA - this.d0) / 2.0f) + f3;
            if (i2 == iArr.length / 2) {
                this.t.setColor(getResources().getColor(aki.f));
                canvas.drawText(str, f2, f5, this.t);
                this.s0 = str;
            } else {
                canvas.drawText(str, f2, f5, this.t);
                if (fAbs < 1.0f) {
                    this.t.setColor(y(fAbs, this.i0, true));
                    canvas.drawText(str, f2, f5, this.t);
                }
            }
            f3 += this.w;
        }
        if (TextUtils.isEmpty(this.k0)) {
            return;
        }
        float f6 = f4 + ((this.c0 - this.d0) / 2) + this.f0 + this.e0;
        String strTrim = this.k0.toString().trim();
        canvas.drawText(strTrim, AppUtil.isRTLDirection() ? f2 - (((s(this.s0) / 2.0f) + this.b0.measureText(strTrim)) + this.t0) : f2 + (s(this.s0) / 2.0f) + this.t0, (f6 - this.r0) + 12.0f, this.b0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.N || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        R();
        this.f12919a.setVisibility(4);
        float y = motionEvent.getY();
        this.F = y;
        this.H = y;
        this.G = motionEvent.getEventTime();
        this.Q = false;
        this.R = false;
        float f2 = this.F;
        if (f2 < this.S) {
            if (this.P == 0) {
                this.W.a(2);
            }
        } else if (f2 > this.T && this.P == 0) {
            this.W.a(1);
        }
        if (!this.z.isFinished()) {
            this.z.forceFinished(true);
            this.A.forceFinished(true);
            L(0);
        } else if (this.A.isFinished()) {
            float f3 = this.F;
            if (f3 < this.S) {
                O(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.T) {
                O(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.R = true;
                N();
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
        int measuredWidth2 = this.f12919a.getMeasuredWidth();
        int measuredHeight2 = this.f12919a.getMeasuredHeight();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int i7 = (measuredHeight - measuredHeight2) / 2;
        this.f12919a.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
        if (z) {
            F();
            E();
            int height = getHeight();
            int i8 = this.f12920b;
            int i9 = this.O;
            int i10 = ((height - i8) / 2) - i9;
            this.S = i10;
            this.T = i10 + (i9 * 2) + i8;
            float fDip2px = DisplayUtil.dip2px(0.5f);
            float f2 = this.w * 2;
            float right = getRight() - DisplayUtil.dip2px(0.5f);
            int i11 = this.w;
            this.q0 = new RectF(fDip2px, f2, right, (i11 * 2) + i11);
            this.o0 = new RectF(DisplayUtil.dip2px(0.5f), (this.w * 2) + DisplayUtil.dip2px(0.8f), getRight() - DisplayUtil.dip2px(0.5f), this.w * 2);
            float fDip2px2 = DisplayUtil.dip2px(0.5f);
            int i12 = this.w;
            float right2 = getRight() - DisplayUtil.dip2px(0.5f);
            int i13 = this.w;
            this.p0 = new RectF(fDip2px2, (i12 * 2) + i12, right2, (i13 * 2) + i13 + DisplayUtil.dip2px(0.8f));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.N) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(I(i2, this.f), I(i3, this.d));
            setMeasuredDimension(U(this.e, getMeasuredWidth(), i2), U(this.c, getMeasuredHeight(), i3));
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
            S();
            T();
            this.W.c();
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.K) {
                w(yVelocity);
                L(2);
            } else {
                int y = (int) motionEvent.getY();
                int iAbs = (int) Math.abs(y - this.F);
                long eventTime = motionEvent.getEventTime() - this.G;
                if (iAbs > this.J || eventTime >= ViewConfiguration.getTapTimeout()) {
                    v();
                } else if (this.R) {
                    this.R = false;
                } else {
                    int i2 = (y / this.w) - 2;
                    if (i2 > 0) {
                        r(true);
                        this.W.b(1);
                    } else if (i2 < 0) {
                        r(false);
                        this.W.b(2);
                    }
                }
                L(0);
            }
            this.I.recycle();
            this.I = null;
        } else if (actionMasked == 2 && !this.Q) {
            float y2 = motionEvent.getY();
            if (this.P == 1) {
                scrollBy(0, (int) (y2 - this.H));
                invalidate();
            } else if (((int) Math.abs(y2 - this.F)) > this.J) {
                R();
                L(1);
            }
            this.H = y2;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void r(boolean z) {
        if (!this.N) {
            if (z) {
                W(this.m + this.n, true);
                return;
            } else {
                W(this.m - this.n, true);
                return;
            }
        }
        this.f12919a.setVisibility(4);
        if (!J(this.z)) {
            J(this.A);
        }
        this.B = 0;
        if (z) {
            this.z.startScroll(0, 0, 0, -this.w, 300);
        } else {
            this.z.startScroll(0, 0, 0, this.w, 300);
        }
        invalidate();
    }

    public final float s(String str) {
        this.t.setTextSize(this.c0);
        return this.t.measureText(str);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int[] iArr = this.s;
        boolean z = this.M;
        if (!z && i3 > 0 && iArr[2] <= this.f12921k) {
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
            t(iArr);
            W(iArr[2], true);
            if (!this.M && iArr[2] <= this.f12921k) {
                this.y = this.x;
            }
        }
        while (true) {
            int i5 = this.y;
            if (i5 - this.x >= (-this.i)) {
                return;
            }
            this.y = i5 + this.w;
            C(iArr);
            W(iArr[2], true);
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
            this.f12919a.setRawInputType(524289);
        } else {
            this.f12919a.setRawInputType(2);
        }
        Y();
        G();
    }

    public void setDistanceOffset(int i2) {
        this.j0 = i2;
    }

    public void setFormatter(e eVar) {
        if (eVar == this.p) {
            return;
        }
        this.p = eVar;
        G();
        Y();
    }

    public void setIncreaseValue(int i2) {
        this.n = i2;
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.k0;
        if ((charSequence != null || str == null) && (charSequence == null || charSequence.equals(str))) {
            return;
        }
        this.k0 = str;
        invalidate();
    }

    public void setLabelTextSize(int i2) {
        this.e0 = i2;
        Paint paint = this.b0;
        if (paint != null) {
            paint.setTextSize(i2);
            this.f0 = this.b0.ascent() - 6.0f;
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
        setWrapSelectorWheel(i2 - this.f12921k > this.s.length);
        G();
        Y();
        invalidate();
    }

    public void setMinValue(int i2) {
        if (this.f12921k == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f12921k = i2;
        if (i2 > this.m) {
            this.m = i2;
        }
        setWrapSelectorWheel(this.l - i2 > this.s.length);
        G();
        Y();
        invalidate();
    }

    public void setNoHighlightBeforeChange(boolean z) {
        this.l0 = z;
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.q = j2;
    }

    public void setOnScrollListener(g gVar) {
    }

    public void setOnValueChangedListener(h hVar) {
        this.o = hVar;
    }

    public void setTextStyle(Typeface typeface) {
        this.t.setTypeface(typeface);
    }

    public void setValue(int i2) {
        W(i2, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.l - this.f12921k >= this.s.length;
        if ((!z || z2) && z != this.M) {
            this.M = z;
        }
        Q();
    }

    public final void t(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i2 = iArr[1] - this.n;
        if (this.M && i2 < this.f12921k) {
            i2 = this.l;
        }
        iArr[0] = i2;
        u(i2);
    }

    public final void u(int i2) {
        String strX;
        SparseArray<String> sparseArray = this.f12922r;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.f12921k;
        if (i2 < i3 || i2 > this.l) {
            strX = "";
        } else {
            String[] strArr = this.j;
            strX = strArr != null ? strArr[i2 - i3] : x(i2);
        }
        sparseArray.put(i2, strX);
    }

    public final boolean v() {
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

    public final void w(int i2) {
        this.B = 0;
        if (i2 > 0) {
            this.z.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.z.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    public final String x(int i2) {
        e eVar = this.p;
        return eVar != null ? eVar.format(i2) : String.valueOf(i2);
    }

    public final int y(float f2, int i2, boolean z) {
        if (f2 >= 1.0f) {
            return i2;
        }
        return (((int) (z ? ((-f2) * Color.alpha(i2)) + Color.alpha(i2) : f2 * Color.alpha(i2))) << 24) | (i2 & 16777215);
    }

    public final int z(String str) {
        try {
            if (this.j == null) {
                return Integer.parseInt(str);
            }
            for (int i2 = 0; i2 < this.j.length; i2++) {
                str = str.toLowerCase();
                if (this.j[i2].toLowerCase().startsWith(str)) {
                    return this.f12921k + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f12921k;
        }
    }

    public SportNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vhi.f36902a);
    }

    public SportNumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.n = 1;
        this.q = 300L;
        this.f12922r = new SparseArray<>();
        this.s = new int[5];
        this.x = Integer.MIN_VALUE;
        this.P = 0;
        this.a0 = -1;
        this.c0 = 20;
        this.d0 = 16;
        this.e0 = 10;
        this.h0 = 56.0f;
        this.i0 = getContext().getResources().getColor(aki.f);
        this.j0 = 320;
        this.l0 = false;
        this.n0 = true;
        this.t0 = DisplayUtil.dip2px(2.0f);
        this.u0 = "";
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 != 1.0f) {
            this.d0 = (int) (this.d0 * f2);
            this.c0 = (int) (this.c0 * f2);
            this.e0 = (int) (this.e0 * f2);
            this.h0 *= f2;
            this.j0 = (int) (this.j0 * f2);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x0, 0, 0);
        this.k0 = typedArrayObtainStyledAttributes.getText(1);
        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.c0);
        this.i0 = typedArrayObtainStyledAttributes.getColor(2, this.i0);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = dvi.R1;
        this.N = true;
        this.O = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f12920b = (int) this.h0;
        this.c = -1;
        this.d = this.j0;
        this.e = -1;
        this.f = -1;
        this.g = true;
        this.W = new i();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i3, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(xri.number_picker_input);
        this.f12919a = editText;
        editText.setOnFocusChangeListener(new b());
        this.f12919a.setFilters(new InputFilter[]{new f()});
        this.f12919a.setRawInputType(2);
        this.f12919a.setImeOptions(6);
        this.f12919a.setVisibility(4);
        this.f12919a.setGravity(8388611);
        this.f12919a.setScaleX(0.0f);
        this.f12919a.setSaveEnabled(false);
        EditText editText2 = this.f12919a;
        editText2.setPadding(30, editText2.getPaddingTop(), 30, this.f12919a.getPaddingRight());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.J = viewConfiguration.getScaledTouchSlop();
        this.K = viewConfiguration.getScaledMinimumFlingVelocity();
        this.L = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.h = (int) this.f12919a.getTextSize();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.c0);
        paint.setTypeface(this.f12919a.getTypeface());
        paint.setColor(this.f12919a.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.t = paint;
        this.f0 = paint.ascent();
        Paint paint2 = new Paint();
        this.u = paint2;
        paint2.setColor(getResources().getColor(aki.e));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.b0 = paint3;
        paint3.setAntiAlias(true);
        this.b0.setFakeBoldText(false);
        this.b0.setColor(this.i0);
        this.b0.setTypeface(this.f12919a.getTypeface());
        this.b0.setTextSize(this.e0);
        this.g0 = this.b0.ascent();
        this.z = new Scroller(getContext(), null, true);
        this.A = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        Y();
        setFocusable(true);
        setClickable(true);
        this.f12919a.setFocusable(false);
        this.f12919a.setClickable(false);
        this.f12919a.setDuplicateParentStateEnabled(true);
    }
}
