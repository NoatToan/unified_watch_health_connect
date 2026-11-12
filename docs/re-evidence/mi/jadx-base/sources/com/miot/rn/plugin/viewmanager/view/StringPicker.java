package com.miot.rn.plugin.viewmanager.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.timepicker.TimeModel;
import defpackage.lsi;
import defpackage.nki;
import defpackage.roi;
import defpackage.svi;
import defpackage.vyi;
import defpackage.xhi;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class StringPicker extends LinearLayout {
    public static final f A0 = new a();
    public static final int[] B0 = {R.attr.state_pressed};
    public static final char[] C0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public int A;
    public final Scroller B;
    public final Scroller C;
    public int D;
    public k E;
    public e F;
    public d G;
    public float H;
    public long I;
    public float J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public final boolean P;
    public final int Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f10262a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10263b;
    public final j b0;
    public final int c;
    public int c0;
    public final int d;
    public Paint d0;
    public final int e;
    public Paint e0;
    public int f;
    public float f0;
    public final boolean g;
    public int g0;
    public final int h;
    public int h0;
    public int i;
    public int i0;
    public String[] j;
    public float j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10264k;
    public float k0;
    public int l;
    public int l0;
    public int m;
    public CharSequence m0;
    public int n;
    public String n0;
    public i o;
    public float o0;
    public f p;
    public int p0;
    public long q;
    public int q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseArray<String> f10265r;
    public short r0;
    public final int[] s;
    public final int[] s0;
    public final Paint t;
    public final int t0;
    public int u;
    public final int u0;
    public int v;
    public SoundPool v0;
    public int w;
    public int w0;
    public final Drawable x;
    public int x0;
    public int y;
    public Handler y0;
    public int z;
    public long z0;

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
        public final StringBuilder f10266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f10267b;
        public final Object[] c;

        public a() {
            StringBuilder sb = new StringBuilder();
            this.f10266a = sb;
            this.f10267b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // com.miot.rn.plugin.viewmanager.view.StringPicker.f
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f10266a;
            sb.delete(0, sb.length());
            this.f10267b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f10267b.toString();
        }
    }

    public class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10268a;

        public b() {
            this.f10268a = StringPicker.this.x0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100001) {
                if (this.f10268a == StringPicker.this.x0) {
                    StringPicker.this.x0 = 0;
                    this.f10268a = -1;
                    if (StringPicker.this.o != null) {
                        i iVar = StringPicker.this.o;
                        StringPicker stringPicker = StringPicker.this;
                        iVar.b(stringPicker, stringPicker.n, StringPicker.this.m);
                    }
                } else {
                    StringPicker.this.y0.sendMessageDelayed(StringPicker.this.y0.obtainMessage(100001), 300L);
                    this.f10268a = StringPicker.this.x0;
                }
                if (StringPicker.this.x0 >= 100001) {
                    StringPicker.this.x0 = 0;
                }
            }
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                StringPicker.this.f10262a.selectAll();
            } else {
                StringPicker.this.f10262a.setSelection(0, 0);
                StringPicker.this.e0(view);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StringPicker.this.S = true;
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10272a;

        public e() {
        }

        public final void b(boolean z) {
            this.f10272a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringPicker.this.w(this.f10272a);
            StringPicker stringPicker = StringPicker.this;
            stringPicker.postDelayed(this, stringPicker.q);
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
            if (StringPicker.this.j == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i4, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                return (StringPicker.this.F(str) > StringPicker.this.l || str.length() > String.valueOf(StringPicker.this.l).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : StringPicker.this.j) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    StringPicker.this.U(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return StringPicker.C0;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface h {
    }

    public interface i {
        void a(StringPicker stringPicker, int i, int i2);

        void b(StringPicker stringPicker, int i, int i2);

        void c(StringPicker stringPicker, int i, int i2);
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10275a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10276b = 2;
        public int c;
        public int d;

        public j() {
        }

        public void a(int i) {
            c();
            this.d = 1;
            this.c = i;
            StringPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void b(int i) {
            c();
            this.d = 2;
            this.c = i;
            StringPicker.this.post(this);
        }

        public void c() {
            this.d = 0;
            this.c = 0;
            StringPicker.this.removeCallbacks(this);
            if (StringPicker.this.W) {
                StringPicker.this.W = false;
                StringPicker stringPicker = StringPicker.this;
                stringPicker.invalidate(0, stringPicker.V, StringPicker.this.getRight(), StringPicker.this.getBottom());
            }
            if (StringPicker.this.a0) {
                StringPicker.this.a0 = false;
                StringPicker stringPicker2 = StringPicker.this;
                stringPicker2.invalidate(0, 0, stringPicker2.getRight(), StringPicker.this.U);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.d;
            if (i == 1) {
                int i2 = this.c;
                if (i2 == 1) {
                    StringPicker.this.W = true;
                    StringPicker stringPicker = StringPicker.this;
                    stringPicker.invalidate(0, stringPicker.V, StringPicker.this.getRight(), StringPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    StringPicker.this.a0 = true;
                    StringPicker stringPicker2 = StringPicker.this;
                    stringPicker2.invalidate(0, 0, stringPicker2.getRight(), StringPicker.this.U);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            int i3 = this.c;
            if (i3 == 1) {
                if (!StringPicker.this.W) {
                    StringPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                StringPicker stringPicker3 = StringPicker.this;
                stringPicker3.W = !stringPicker3.W;
                StringPicker stringPicker4 = StringPicker.this;
                stringPicker4.invalidate(0, stringPicker4.V, StringPicker.this.getRight(), StringPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!StringPicker.this.a0) {
                StringPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            StringPicker stringPicker5 = StringPicker.this;
            stringPicker5.a0 = !stringPicker5.a0;
            StringPicker stringPicker6 = StringPicker.this;
            stringPicker6.invalidate(0, 0, stringPicker6.getRight(), StringPicker.this.U);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10278b;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StringPicker.this.f10262a.setSelection(this.f10277a, this.f10278b);
        }
    }

    public StringPicker(Context context) {
        this(context, null);
    }

    public final void A(int i2) {
        String strD;
        SparseArray<String> sparseArray = this.f10265r;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.f10264k;
        if (i2 < i3 || i2 > this.l) {
            strD = "";
        } else {
            String[] strArr = this.j;
            strD = strArr != null ? strArr[i2 - i3] : D(i2);
        }
        sparseArray.put(i2, strD);
    }

    public final boolean B() {
        int i2 = this.z - this.A;
        if (i2 == 0) {
            return false;
        }
        this.D = 0;
        int iAbs = Math.abs(i2);
        int i3 = this.y;
        if (iAbs > i3 / 2) {
            if (i2 > 0) {
                i3 = -i3;
            }
            i2 += i3;
        }
        this.C.startScroll(0, 0, 0, i2, 800);
        invalidate();
        return true;
    }

    public final void C(int i2) {
        this.D = 0;
        if (i2 > 0) {
            this.B.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.B.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    public final String D(int i2) {
        f fVar = this.p;
        return fVar != null ? fVar.format(i2) : String.valueOf(i2);
    }

    public final int E(float f2, int i2, boolean z) {
        if (f2 >= 1.0f) {
            return i2;
        }
        return (((int) (z ? ((-f2) * Color.alpha(i2)) + Color.alpha(i2) : f2 * Color.alpha(i2))) << 24) | (i2 & 16777215);
    }

    public final int F(String str) {
        try {
            if (this.j == null) {
                return Integer.parseInt(str);
            }
            for (int i2 = 0; i2 < this.j.length; i2++) {
                str = str.toLowerCase();
                if (this.j[i2].toLowerCase().startsWith(str)) {
                    return this.f10264k + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f10264k;
        }
    }

    public final float G(float f2, int i2, int i3) {
        return f2 >= 1.0f ? i3 : (f2 * (i3 - i2)) + i2;
    }

    public final int H(int i2) {
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = this.f10264k;
            return (i4 + ((i2 - i3) % (i3 - i4))) - 1;
        }
        int i5 = this.f10264k;
        return i2 < i5 ? (i3 - ((i5 - i2) % (i3 - i5))) + 1 : i2;
    }

    public final void I(int[] iArr) {
        System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        int i2 = iArr[iArr.length - 2] + 1;
        if (this.O && i2 > this.l) {
            i2 = this.f10264k;
        }
        iArr[iArr.length - 1] = i2;
        A(i2);
    }

    public final void J() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.h) / 2);
    }

    public final void K() {
        L();
        int[] iArr = this.s;
        int bottom = (int) ((((getBottom() - getTop()) - (iArr.length * this.h)) / iArr.length) + 0.5f);
        this.i = bottom;
        this.y = this.h + bottom;
        int baseline = (this.f10262a.getBaseline() + this.f10262a.getTop()) - (this.y * 2);
        this.z = baseline;
        this.A = baseline;
        c0();
    }

    public final void L() {
        this.f10265r.clear();
        int[] iArr = this.s;
        int value = getValue();
        for (int i2 = 0; i2 < this.s.length; i2++) {
            int iH = (i2 - 2) + value;
            if (this.O) {
                iH = H(iH);
            }
            iArr[i2] = iH;
            A(iH);
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

    public float N(String str) {
        return this.t.measureText(str);
    }

    public final boolean O(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = this.z - ((this.A + finalY) % this.y);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.y;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, finalY + i2);
        return true;
    }

    public final void P(int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.x0++;
        this.n = i2;
        int i4 = this.w0;
        if (i4 != -1 && jCurrentTimeMillis - this.z0 >= 100) {
            this.v0.play(i4, 1.0f, 1.0f, 0, 0, 1.0f);
            this.z0 = jCurrentTimeMillis;
        }
        i iVar = this.o;
        if (iVar != null) {
            iVar.c(this, i2, this.m);
        }
    }

    public final void Q(int i2) {
        if (this.R == i2) {
            return;
        }
        this.R = i2;
    }

    public final void R(Scroller scroller) {
        if (scroller == this.B) {
            if (!B()) {
                c0();
            }
            Q(0);
        } else if (this.R != 1) {
            c0();
        }
    }

    public final void S() {
        d dVar = this.G;
        if (dVar == null) {
            this.G = new d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.G, ViewConfiguration.getLongPressTimeout());
    }

    public final void T(boolean z, long j2) {
        e eVar = this.F;
        if (eVar == null) {
            this.F = new e();
        } else {
            removeCallbacks(eVar);
        }
        this.F.b(z);
        postDelayed(this.F, j2);
    }

    public final void U(int i2, int i3) {
        k kVar = this.E;
        if (kVar == null) {
            this.E = new k();
        } else {
            removeCallbacks(kVar);
        }
        this.E.f10277a = i2;
        this.E.f10278b = i3;
        post(this.E);
    }

    public final void V() {
        L();
        invalidate();
    }

    public final void W() {
        e eVar = this.F;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        k kVar = this.E;
        if (kVar != null) {
            removeCallbacks(kVar);
        }
        d dVar = this.G;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.b0.c();
    }

    public final void X() {
        d dVar = this.G;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    public final void Y() {
        e eVar = this.F;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    public final int Z(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    public final void a0(int i2, boolean z) {
        if (this.m == i2) {
            return;
        }
        int iH = this.O ? H(i2) : Math.min(Math.max(i2, this.f10264k), this.l);
        int i3 = this.m;
        this.m = iH;
        c0();
        if (z) {
            P(i3, iH);
        }
        L();
        invalidate();
    }

    public final void b0() {
        float length;
        if (this.g) {
            this.t.setTextSize(this.g0);
            String[] strArr = this.j;
            int i2 = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                while (i2 < 9) {
                    float fMeasureText = this.t.measureText(String.valueOf(i2));
                    if (fMeasureText > f2) {
                        f2 = fMeasureText;
                    }
                    i2++;
                }
                length = (int) (D(this.l).length() * f2);
            } else {
                int length2 = strArr.length;
                int length3 = strArr.length;
                float f3 = -1.0f;
                while (i2 < length3) {
                    float fMeasureText2 = this.t.measureText(strArr[i2]);
                    if (fMeasureText2 > f3) {
                        f3 = fMeasureText2;
                    }
                    i2++;
                }
                length = f3;
            }
            this.f0 = length;
            float paddingLeft = length + this.f10262a.getPaddingLeft() + this.f10262a.getPaddingRight() + getPaddingLeft() + getPaddingRight();
            if (this.f != paddingLeft) {
                int i3 = this.e;
                if (paddingLeft > i3) {
                    this.f = (int) paddingLeft;
                } else {
                    this.f = i3;
                }
            }
        }
    }

    public final boolean c0() {
        String[] strArr = this.j;
        String strD = strArr == null ? D(this.m) : strArr[this.m - this.f10264k];
        if (TextUtils.isEmpty(strD) || strD.equals(this.f10262a.getText().toString())) {
            return false;
        }
        this.f10262a.setText(strD);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.B;
        if (scroller.isFinished()) {
            scroller = this.C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.D == 0) {
            this.D = scroller.getStartY();
        }
        scrollBy(0, currY - this.D);
        this.D = currY;
        if (scroller.isFinished()) {
            R(scroller);
        } else {
            invalidate();
        }
    }

    public void d0(int i2, int i3, int i4) {
        this.f10264k = i2;
        this.l = i3;
        this.m = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        requestFocus();
        r5.c0 = r0;
        W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.B.isFinished() == false) goto L37;
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
            r5.W()
            goto L65
        L19:
            boolean r1 = r5.P
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
            boolean r1 = r5.O
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
            r5.W()
            android.widget.Scroller r6 = r5.B
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
        throw new UnsupportedOperationException("Method not decompiled: com.miot.rn.plugin.viewmanager.view.StringPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            W();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            W();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final void e0(View view) {
        String strValueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(strValueOf)) {
            c0();
        } else {
            a0(F(strValueOf), true);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.j;
    }

    public int getMaxValue() {
        return this.l;
    }

    public int getMinValue() {
        return this.f10264k;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public String getUnit() {
        return TextUtils.isEmpty(this.n0) ? "" : this.n0;
    }

    public int getValue() {
        return this.m;
    }

    public boolean getWrapSelectorWheel() {
        return this.O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        W();
        this.v0.release();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.P) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float right = (((getRight() - getLeft()) + paddingLeft) - paddingRight) / 2;
        float f2 = this.A;
        Drawable drawable = this.x;
        boolean z = false;
        if (drawable != null && this.R == 0) {
            if (this.a0) {
                drawable.setState(B0);
                this.x.setBounds(paddingLeft, 0, width - paddingRight, this.U);
                this.x.draw(canvas);
            }
            if (this.W) {
                this.x.setState(B0);
                this.x.setBounds(paddingLeft, this.V, width - paddingRight, getBottom());
                this.x.draw(canvas);
            }
        }
        float f3 = this.z + (this.y * 2);
        SparseArray<String> sparseArray = this.f10265r;
        int[] iArr = this.s;
        float height = getHeight() / 2;
        int i2 = this.y;
        float f4 = height - (i2 * 0.44f);
        float f5 = f4 + i2;
        this.t.setColor(this.w);
        canvas.drawRect(0.0f, f4, getWidth(), f5, this.t);
        Paint paint = this.d0;
        if (paint != null) {
            float f6 = width;
            canvas.drawLine(0.0f, f4, f6, f4, paint);
            canvas.drawLine(0.0f, f5, f6, f5, paint);
        }
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            String str = sparseArray.get(iArr[i3]);
            float fAbs = Math.abs(f3 - f2) / this.y;
            float fG = G(fAbs, this.g0, this.h0);
            this.t.setTextSize(fG);
            this.t.setColor(E(fAbs, this.v, z));
            canvas.drawText(str, right, ((fG - this.h0) / 2.0f) + f2, this.t);
            if (fAbs < 1.0f) {
                float fG2 = G(fAbs, this.g0, this.h0);
                this.t.setTextSize(fG2);
                this.t.setColor(E(fAbs, this.u, true));
                canvas.drawText(str, right, ((fG2 - this.h0) / 2.0f) + f2, this.t);
                if (this.o0 < fG2) {
                    this.o0 = fG2;
                }
            }
            f2 += this.y;
            i3++;
            z = false;
        }
        if (!TextUtils.isEmpty(this.m0)) {
            canvas.drawText(this.m0.toString(), (this.f0 / 2.0f) + right, ((this.g0 - this.h0) / 2) + f3 + this.j0 + this.i0, this.e0);
        }
        if (TextUtils.isEmpty(this.n0)) {
            return;
        }
        float f7 = (f3 - (this.r0 == 1 ? this.y / 4 : this.y / 4)) + 2.0f;
        float f8 = this.o0;
        float f9 = this.f0;
        if (f8 < f9) {
            this.o0 = f9;
        }
        int i4 = this.p0;
        if (i4 > 0) {
            this.e0.setTextSize(i4);
        }
        this.e0.setColor(this.q0);
        canvas.drawText(this.n0, right + (this.o0 / 2.0f), f7, this.e0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(StringPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((this.f10264k + this.m) * this.y);
        accessibilityEvent.setMaxScrollY((this.l - this.f10264k) * this.y);
    }

    @Override // android.view.View
    @RequiresApi(api = 24)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(8192);
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, this.f10264k, this.l, this.m));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.P || !isEnabled()) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(motionEvent);
        }
        W();
        this.f10262a.setVisibility(4);
        float y = motionEvent.getY();
        this.H = y;
        this.J = y;
        this.I = motionEvent.getEventTime();
        this.S = false;
        this.T = false;
        float f2 = this.H;
        if (f2 < this.U) {
            if (this.R == 0) {
                this.b0.a(2);
            }
        } else if (f2 > this.V && this.R == 0) {
            this.b0.a(1);
        }
        if (!this.B.isFinished()) {
            this.B.forceFinished(true);
            this.C.forceFinished(true);
            Q(0);
        } else if (this.C.isFinished()) {
            float f3 = this.H;
            if (f3 < this.U) {
                T(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.V) {
                T(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.T = true;
                S();
            }
        } else {
            this.B.forceFinished(true);
            this.C.forceFinished(true);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!this.P) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f10262a.getMeasuredWidth();
        int measuredHeight2 = this.f10262a.getMeasuredHeight();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int i7 = (measuredHeight - measuredHeight2) / 2;
        this.f10262a.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
        if (z) {
            K();
            J();
            int height = getHeight();
            int i8 = this.f10263b;
            int i9 = this.Q;
            int i10 = ((height - i8) / 2) - i9;
            this.U = i10;
            this.V = i10 + (i9 * 2) + i8;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(true);
        }
        if (!this.P) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(M(i2, this.f), M(i3, this.d));
            setMeasuredDimension(Z(this.e, getMeasuredWidth(), i2), Z(this.c, getMeasuredHeight(), i3));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.P) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z();
        } else if (actionMasked == 1) {
            X();
            Y();
            this.b0.c();
            VelocityTracker velocityTracker = this.K;
            velocityTracker.computeCurrentVelocity(1000, this.N);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.M) {
                C(yVelocity);
                Q(2);
                Handler handler = this.y0;
                handler.sendMessageDelayed(handler.obtainMessage(100001), 400L);
            } else {
                Handler handler2 = this.y0;
                handler2.sendMessageDelayed(handler2.obtainMessage(100001), 100L);
                int y = (int) motionEvent.getY();
                int iAbs = (int) Math.abs(y - this.H);
                long eventTime = motionEvent.getEventTime() - this.I;
                if (iAbs > this.L || eventTime >= ViewConfiguration.getTapTimeout()) {
                    B();
                } else if (this.T) {
                    this.T = false;
                } else {
                    int i2 = (y / this.y) - 2;
                    if (i2 > 0) {
                        w(true);
                        this.b0.b(1);
                    } else if (i2 < 0) {
                        w(false);
                        this.b0.b(2);
                    }
                }
                Q(0);
            }
            this.K.recycle();
            this.K = null;
        } else if (actionMasked == 2 && !this.S) {
            float y2 = motionEvent.getY();
            if (this.R == 1) {
                scrollBy(0, (int) (y2 - this.J));
                invalidate();
            } else if (((int) Math.abs(y2 - this.H)) > this.L) {
                W();
                Q(1);
            }
            this.J = y2;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        if (i2 == 4096) {
            w(true);
            Handler handler = this.y0;
            handler.sendMessageDelayed(handler.obtainMessage(100001), 100L);
            return true;
        }
        if (i2 != 8192) {
            return false;
        }
        w(false);
        Handler handler2 = this.y0;
        handler2.sendMessageDelayed(handler2.obtainMessage(100001), 100L);
        return true;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int[] iArr = this.s;
        boolean z = this.O;
        if (!z && i3 > 0 && iArr[2] <= this.f10264k) {
            this.A = this.z;
            return;
        }
        if (!z && i3 < 0 && iArr[2] >= this.l) {
            this.A = this.z;
            return;
        }
        this.A += i3;
        while (true) {
            int i4 = this.A;
            if (i4 - this.z <= this.i) {
                break;
            }
            this.A = i4 - this.y;
            y(iArr);
            a0(iArr[2], true);
            if (!this.O && iArr[2] <= this.f10264k) {
                this.A = this.z;
            }
        }
        while (true) {
            int i5 = this.A;
            if (i5 - this.z >= (-this.i)) {
                return;
            }
            this.A = i5 + this.y;
            I(iArr);
            a0(iArr[2], true);
            if (!this.O && iArr[2] >= this.l) {
                this.A = this.z;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.j == strArr) {
            return;
        }
        this.j = strArr;
        if (strArr != null) {
            this.f10262a.setRawInputType(524289);
        } else {
            this.f10262a.setRawInputType(2);
        }
        x();
        c0();
        L();
        b0();
    }

    public void setFormatter(f fVar) {
        if (fVar == this.p) {
            return;
        }
        this.p = fVar;
        L();
        c0();
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.m0;
        if ((charSequence != null || str == null) && (charSequence == null || charSequence.equals(str))) {
            return;
        }
        this.m0 = str;
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
        setWrapSelectorWheel(i2 - this.f10264k > this.s.length);
        L();
        c0();
        b0();
        invalidate();
    }

    public void setMinValue(int i2) {
        if (this.f10264k == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f10264k = i2;
        if (i2 > this.m) {
            this.m = i2;
        }
        setWrapSelectorWheel(this.l - i2 > this.s.length);
        L();
        c0();
        b0();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.q = j2;
    }

    public void setOnScrollListener(h hVar) {
    }

    public void setOnValueChangedListener(i iVar) {
        this.o = iVar;
    }

    public void setPickerType(short s) {
        this.r0 = s;
    }

    public void setSelectItemBgColor(int i2) {
        this.w = i2;
    }

    public void setSelectTextColor(int i2) {
        this.u = i2;
    }

    public void setSelectTextSize(int i2) {
        if (i2 <= 0) {
            return;
        }
        this.g0 = i2;
    }

    public void setUnSelectTextColor(int i2) {
        this.v = i2;
    }

    public void setUnSelectTextSize(int i2) {
        if (i2 <= 0) {
            return;
        }
        this.h0 = i2;
    }

    public void setUnit(String str) {
        if (TextUtils.isEmpty(str)) {
            this.n0 = null;
        } else {
            this.n0 = str;
        }
    }

    public void setUnitFontSize(int i2) {
        if (i2 < 1) {
            this.p0 = this.i0;
        } else {
            this.p0 = i2;
        }
    }

    public void setUnitTextColor(int i2) {
        this.q0 = i2;
    }

    public void setValue(int i2) {
        a0(i2, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.l - this.f10264k >= this.s.length;
        if ((!z || z2) && z != this.O) {
            this.O = z;
        }
        V();
    }

    public final void w(boolean z) {
        if (!this.P) {
            if (z) {
                a0(this.m + 1, true);
                return;
            } else {
                a0(this.m - 1, true);
                return;
            }
        }
        this.f10262a.setVisibility(4);
        if (!O(this.B)) {
            O(this.C);
        }
        this.D = 0;
        if (z) {
            this.B.startScroll(0, 0, 0, -this.y, 300);
        } else {
            this.B.startScroll(0, 0, 0, this.y, 300);
        }
        invalidate();
    }

    public void x() {
        int i2 = 0;
        while (true) {
            int[] iArr = this.s;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    public final void y(int[] iArr) {
        System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        int i2 = iArr[1] - 1;
        if (this.O && i2 < this.f10264k) {
            i2 = this.l;
        }
        iArr[0] = i2;
        A(i2);
    }

    public final void z() {
        i iVar = this.o;
        if (iVar != null) {
            iVar.a(this, this.n, this.m);
        }
    }

    public StringPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xhi.f39135a);
    }

    public StringPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.q = 300L;
        this.f10265r = new SparseArray<>();
        this.s = new int[5];
        this.u = getResources().getColor(nki.c);
        this.v = getResources().getColor(nki.f28017b) & Integer.MAX_VALUE;
        this.w = 0;
        this.z = Integer.MIN_VALUE;
        this.R = 0;
        this.c0 = -1;
        this.d0 = null;
        this.g0 = 25;
        this.h0 = 14;
        this.i0 = 10;
        this.k0 = 56.0f;
        this.l0 = 260;
        this.n0 = null;
        this.o0 = 0.0f;
        this.p0 = 0;
        this.q0 = Color.parseColor("#1dc58a");
        this.r0 = (short) 1;
        int[] iArr = {R.attr.textSize, R.attr.text};
        this.s0 = iArr;
        this.t0 = 0;
        this.u0 = 1;
        this.x0 = 0;
        this.y0 = new b();
        this.z0 = 0L;
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 != 1.0f) {
            this.h0 = (int) (this.h0 * f2);
            this.g0 = (int) (this.g0 * f2);
            this.i0 = (int) (this.i0 * f2);
            this.k0 *= f2;
            this.l0 = (int) (this.l0 * f2);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.m0 = typedArrayObtainStyledAttributes.getText(1);
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.g0);
        typedArrayObtainStyledAttributes.recycle();
        SoundPool soundPool = new SoundPool(1, 1, 0);
        this.v0 = soundPool;
        try {
            this.w0 = soundPool.load(getContext(), vyi.f37366a, 1);
        } catch (Exception unused) {
            this.w0 = -1;
        }
        int i3 = svi.f34036b;
        this.P = true;
        this.Q = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f10263b = (int) this.k0;
        this.c = -1;
        this.d = this.l0;
        this.e = -1;
        this.f = -1;
        this.g = true;
        this.x = getResources().getDrawable(roi.f32749a);
        this.b0 = new j();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i3, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(lsi.d);
        this.f10262a = editText;
        editText.setOnFocusChangeListener(new c());
        editText.setFilters(new InputFilter[]{new g()});
        editText.setRawInputType(2);
        editText.setImeOptions(6);
        editText.setVisibility(4);
        editText.setGravity(3);
        editText.setScaleX(0.0f);
        editText.setSaveEnabled(false);
        editText.setPadding(30, editText.getPaddingTop(), 30, editText.getPaddingRight());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.L = viewConfiguration.getScaledTouchSlop();
        this.M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.N = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        double d2 = getContext().getResources().getConfiguration().fontScale;
        this.h = (int) (((double) editText.getTextSize()) * (d2 > 1.0d ? d2 - 1.0d : 1.0d));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.g0);
        paint.setTypeface(editText.getTypeface());
        paint.setColor(editText.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.t = paint;
        this.j0 = paint.ascent();
        Paint paint2 = new Paint();
        this.e0 = paint2;
        paint2.setAntiAlias(true);
        this.e0.setFakeBoldText(true);
        this.e0.setColor(getResources().getColor(nki.f28016a));
        this.e0.setTextSize(this.i0);
        this.B = new Scroller(getContext(), null, true);
        this.C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        c0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
