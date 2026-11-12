package miuix.pickerwidget.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.collection.ArraySet;
import defpackage.abk;
import defpackage.alb;
import defpackage.ati;
import defpackage.b2j;
import defpackage.b3j;
import defpackage.bdm;
import defpackage.bii;
import defpackage.ewi;
import defpackage.eyq;
import defpackage.gmi;
import defpackage.l5j;
import defpackage.tnr;
import defpackage.uki;
import defpackage.wyi;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class NumberPicker extends LinearLayout {
    public final Scroller A;
    public final Scroller B;
    public int C;
    public j D;
    public c E;
    public b F;
    public float G;
    public long H;
    public float I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final boolean O;
    public final int P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26720a;
    public final i a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26721b;
    public int b0;
    public int c;
    public Paint c0;
    public k d;
    public int d0;
    public final EditText e;
    public String e0;
    public final int f;
    public float f0;
    public final int g;
    public int g0;
    public final int h;
    public int h0;
    public final int i;
    public float i0;
    public int j;
    public float j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f26722k;
    public int k0;
    public final int l;
    public int l0;
    public int m;
    public float m0;
    public String[] n;
    public float n0;
    public int o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f26723r;
    public int r0;
    public d s;
    public int s0;
    public long t;
    public CharSequence t0;
    public final SparseArray<String> u;
    public float u0;
    public final int[] v;
    public String v0;
    public final Paint w;
    public String w0;
    public int x;
    public boolean x0;
    public int y;
    public int z;
    public static final int y0 = ewi.c;
    public static final AtomicInteger z0 = new AtomicInteger(0);
    public static final d A0 = new f(2);
    public static final int[] B0 = {R.attr.state_pressed};
    public static final char[] C0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

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

    public class a implements View.OnFocusChangeListener {
        public a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                NumberPicker.this.e.selectAll();
            } else {
                NumberPicker.this.e.setSelection(0, 0);
                NumberPicker.this.j0(view);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.R = true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26726a;

        public c() {
        }

        public final void b(boolean z) {
            this.f26726a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.s(this.f26726a);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.t);
        }
    }

    public interface d {
        String format(int i);
    }

    public class e extends NumberKeyListener {
        public e() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (NumberPicker.this.n == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i4, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                return (NumberPicker.this.B(str) > NumberPicker.this.p || str.length() > String.valueOf(NumberPicker.this.p).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.n) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.X(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return NumberPicker.C0;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface g {
    }

    public interface h {
        void a(NumberPicker numberPicker, int i, int i2);
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26730a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26731b = 2;
        public int c;
        public int d;

        public i() {
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
            if (NumberPicker.this.V) {
                NumberPicker.this.V = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.U, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            if (NumberPicker.this.W) {
                NumberPicker.this.W = false;
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.T);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.d;
            if (i == 1) {
                int i2 = this.c;
                if (i2 == 1) {
                    NumberPicker.this.V = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.U, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    NumberPicker.this.W = true;
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.T);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            int i3 = this.c;
            if (i3 == 1) {
                if (!NumberPicker.this.V) {
                    NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                NumberPicker.e(NumberPicker.this, 1);
                NumberPicker numberPicker3 = NumberPicker.this;
                numberPicker3.invalidate(0, numberPicker3.U, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!NumberPicker.this.W) {
                NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            NumberPicker.i(NumberPicker.this, 1);
            NumberPicker numberPicker4 = NumberPicker.this;
            numberPicker4.invalidate(0, 0, numberPicker4.getRight(), NumberPicker.this.T);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26733b;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26733b < NumberPicker.this.e.length()) {
                NumberPicker.this.e.setSelection(this.f26732a, this.f26733b);
            }
        }
    }

    public static class k extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26734a = new a(null);

        public k(Looper looper) {
            super(looper);
        }

        public void a(Context context, int i) {
            Message messageObtainMessage = obtainMessage(0, i, 0);
            messageObtainMessage.obj = context;
            sendMessage(messageObtainMessage);
        }

        public void b() {
            sendMessage(obtainMessage(1));
        }

        public void c(int i) {
            sendMessage(obtainMessage(2, i, 0));
        }

        public void d() {
            removeMessages(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                f26734a.a((Context) message.obj, message.arg1);
            } else if (i == 1) {
                f26734a.b();
            } else {
                if (i != 2) {
                    return;
                }
                f26734a.c(message.arg1);
            }
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Set<Integer> f26735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public SoundPool f26736b;
            public int c;
            public long d;

            public a() {
                this.f26735a = new ArraySet();
            }

            public void a(Context context, int i) {
                if (this.f26736b == null) {
                    SoundPool soundPool = new SoundPool(1, 1, 0);
                    this.f26736b = soundPool;
                    this.c = soundPool.load(context, wyi.number_picker_value_change, 1);
                }
                this.f26735a.add(Integer.valueOf(i));
            }

            public void b() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SoundPool soundPool = this.f26736b;
                if (soundPool == null || jCurrentTimeMillis - this.d <= 50) {
                    return;
                }
                soundPool.play(this.c, 1.0f, 1.0f, 0, 0, 1.0f);
                this.d = jCurrentTimeMillis;
            }

            public void c(int i) {
                SoundPool soundPool;
                if (this.f26735a.remove(Integer.valueOf(i)) && this.f26735a.isEmpty() && (soundPool = this.f26736b) != null) {
                    soundPool.release();
                    this.f26736b = null;
                }
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    public static /* synthetic */ boolean e(NumberPicker numberPicker, int i2) {
        ?? r2 = (i2 ^ (numberPicker.V ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
        numberPicker.V = r2;
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    public static /* synthetic */ boolean i(NumberPicker numberPicker, int i2) {
        ?? r2 = (i2 ^ (numberPicker.W ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
        numberPicker.W = r2;
        return r2;
    }

    public final int A(float f2, int i2, boolean z) {
        if (f2 >= 1.0f) {
            return i2;
        }
        return (((int) (z ? ((-f2) * Color.alpha(i2)) + Color.alpha(i2) : f2 * Color.alpha(i2))) << 24) | (i2 & 16777215);
    }

    public final int B(String str) {
        try {
            if (this.n == null) {
                return Integer.parseInt(str);
            }
            for (int i2 = 0; i2 < this.n.length; i2++) {
                str = str.toLowerCase();
                if (this.n[i2].toLowerCase().startsWith(str)) {
                    return this.o + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.o;
        }
    }

    public final float C(float f2, int i2, int i3) {
        return f2 >= 1.0f ? i3 : (f2 * (i3 - i2)) + i2;
    }

    public final int D(int i2) {
        int i3 = this.p;
        if (i2 > i3) {
            int i4 = this.o;
            return (i4 + ((i2 - i3) % (i3 - i4))) - 1;
        }
        int i5 = this.o;
        return i2 < i5 ? (i3 - ((i5 - i2) % (i3 - i5))) + 1 : i2;
    }

    public final void E(int[] iArr) {
        if (iArr.length - 1 >= 0) {
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        }
        int i2 = iArr[iArr.length - 2] + 1;
        if (this.N && i2 > this.p) {
            i2 = this.o;
        }
        iArr[iArr.length - 1] = i2;
        w(i2);
    }

    public final void F() {
        this.e.setOnFocusChangeListener(new a());
        this.e.setFilters(new InputFilter[]{new e()});
        this.e.setRawInputType(2);
        this.e.setImeOptions(6);
        this.e.setVisibility(4);
        this.e.setGravity(8388611);
        this.e.setScaleX(0.0f);
        this.e.setSaveEnabled(false);
        EditText editText = this.e;
        editText.setPadding(this.d0, editText.getPaddingTop(), this.d0, this.e.getPaddingRight());
    }

    public final void G() {
        Paint paint = new Paint();
        this.c0 = paint;
        paint.setAntiAlias(true);
        this.c0.setFakeBoldText(true);
        this.c0.setColor(this.s0);
        this.c0.setTextSize(this.k0);
    }

    public final Paint H() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.g0);
        paint.setTypeface(this.e.getTypeface());
        paint.setColor(this.e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        return paint;
    }

    public final void I() {
        if (this.d == null) {
            k kVar = new k(tnr.a("NumberPicker_sound_play"));
            this.d = kVar;
            kVar.a(getContext().getApplicationContext(), this.f26720a);
        }
    }

    public final void J() {
        this.m0 = getContext().getResources().getDimensionPixelSize(gmi.g);
        this.i0 = getContext().getResources().getDimensionPixelSize(gmi.h);
    }

    public final void K() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.l) / 2);
    }

    public final void L() {
        M();
        int[] iArr = this.v;
        float bottom = (getBottom() - getTop()) - (iArr.length * this.l);
        if (bottom < 0.0f) {
            bottom = 0.0f;
        }
        int length = (int) ((bottom / iArr.length) + 0.5f);
        this.m = length;
        this.x = this.l + length;
        int baseline = (this.e.getBaseline() + this.e.getTop()) - this.x;
        this.y = baseline;
        this.z = baseline;
        i0();
    }

    public final void M() {
        this.u.clear();
        int[] iArr = this.v;
        int value = getValue();
        for (int i2 = 0; i2 < this.v.length; i2++) {
            int iD = (i2 - 1) + value;
            if (this.N) {
                iD = D(iD);
            }
            iArr[i2] = iD;
            w(iD);
        }
    }

    public final boolean N() {
        if (this.w0 == null) {
            this.w0 = (String) abk.b(abk.c("android.os.SystemProperties"), String.class, "get", new Class[]{String.class, String.class}, "ro.product.mod_device", "");
        }
        return this.w0.endsWith("_global");
    }

    public final int O(int i2, int i3) {
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

    public final boolean P(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = this.y - ((this.z + finalY) % this.x);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.x;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, finalY + i2);
        return true;
    }

    public final void Q(int i2) {
        sendAccessibilityEvent(4);
        U();
        HapticCompat.e(this, alb.C, alb.f1169k);
        h hVar = this.f26723r;
        if (hVar != null) {
            hVar.a(this, i2, this.q);
        }
    }

    public final void R(int i2) {
        if (this.Q == i2) {
            return;
        }
        if (i2 == 0) {
            String str = this.v0;
            if (str != null && !str.equals(this.e.getText().toString())) {
                this.e.setText(this.v0);
            }
            this.v0 = null;
            f0();
        }
        this.Q = i2;
    }

    public final void S(Scroller scroller) {
        if (scroller == this.A) {
            if (!x()) {
                i0();
            }
            R(0);
        } else if (this.Q != 1) {
            i0();
        }
    }

    public final void T(AttributeSet attributeSet, int i2) {
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l5j.Y, i2, b3j.f3749b);
        this.t0 = typedArrayObtainStyledAttributes.getText(l5j.b0);
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.f0, resources.getDimensionPixelOffset(gmi.e));
        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.g0, resources.getDimensionPixelOffset(gmi.f));
        this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.c0, resources.getDimensionPixelOffset(gmi.d));
        this.q0 = typedArrayObtainStyledAttributes.getColor(l5j.Z, resources.getColor(uki.f35885a));
        this.r0 = typedArrayObtainStyledAttributes.getColor(l5j.a0, resources.getColor(uki.f35886b));
        this.s0 = typedArrayObtainStyledAttributes.getColor(l5j.e0, resources.getColor(uki.c));
        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.d0, resources.getDimensionPixelOffset(gmi.c));
        typedArrayObtainStyledAttributes.recycle();
        this.l0 = this.k0;
        this.o0 = this.g0;
        this.p0 = this.h0;
    }

    public final void U() {
        k kVar = this.d;
        if (kVar != null) {
            kVar.b();
        }
    }

    public final void V() {
        b bVar = this.F;
        if (bVar == null) {
            this.F = new b();
        } else {
            removeCallbacks(bVar);
        }
        postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
    }

    public final void W(boolean z, long j2) {
        c cVar = this.E;
        if (cVar == null) {
            this.E = new c();
        } else {
            removeCallbacks(cVar);
        }
        this.E.b(z);
        postDelayed(this.E, j2);
    }

    public final void X(int i2, int i3) {
        j jVar = this.D;
        if (jVar == null) {
            this.D = new j();
        } else {
            removeCallbacks(jVar);
        }
        this.D.f26732a = i2;
        this.D.f26733b = i3;
        post(this.D);
    }

    public final void Y() {
        M();
        invalidate();
    }

    public final void Z() {
        k kVar = this.d;
        if (kVar != null) {
            kVar.c(this.f26720a);
            this.d = null;
        }
    }

    public final void a0() {
        c cVar = this.E;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
        j jVar = this.D;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        b bVar = this.F;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.a0.c();
    }

    public final void b0() {
        b bVar = this.F;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public final void c0() {
        c cVar = this.E;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.A;
        if (scroller.isFinished()) {
            scroller = this.B;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.C == 0) {
            this.C = scroller.getStartY();
        }
        scrollBy(0, currY - this.C);
        this.C = currY;
        if (scroller.isFinished()) {
            S(scroller);
        } else {
            invalidate();
        }
    }

    public final int d0(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        requestFocus();
        r5.b0 = r0;
        a0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.A.isFinished() == false) goto L37;
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
    
        s(r6);
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
            r5.a0()
            goto L65
        L19:
            boolean r1 = r5.O
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
            boolean r1 = r5.N
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
            r5.a0()
            android.widget.Scroller r6 = r5.A
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L64
            if (r0 != r2) goto L60
            r6 = r3
            goto L61
        L60:
            r6 = 0
        L61:
            r5.s(r6)
        L64:
            return r3
        L65:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            a0();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            a0();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        h0();
    }

    public final void e0(int i2, boolean z) {
        int iD = this.N ? D(i2) : Math.min(Math.max(i2, this.o), this.p);
        int i3 = this.q;
        if (i3 == iD) {
            return;
        }
        this.q = iD;
        i0();
        if (z) {
            Q(i3);
        }
        M();
        invalidate();
    }

    public final void f0() {
        k kVar = this.d;
        if (kVar != null) {
            kVar.d();
        }
    }

    public final void g0(float f2) {
        if (getLabelWidth() > 0.0f) {
            int i2 = this.l0;
            this.k0 = i2;
            this.c0.setTextSize(i2);
            while ((this.f0 / 2.0f) + f2 + this.f26721b + getLabelWidth() > getWidth()) {
                int i3 = this.k0;
                if (i3 <= this.m0) {
                    return;
                }
                int i4 = (int) (i3 * this.n0);
                this.k0 = i4;
                this.c0.setTextSize(i4);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return NumberPicker.class.getName();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String getDisplayedMaxText() {
        String str = this.e0;
        return str == null ? "" : str;
    }

    public float getDisplayedMaxTextWidth() {
        float textSize = this.w.getTextSize();
        this.w.setTextSize(this.o0);
        float fMeasureText = this.w.measureText(getDisplayedMaxText());
        this.w.setTextSize(textSize);
        return fMeasureText;
    }

    public String[] getDisplayedValues() {
        return this.n;
    }

    public float getLabelWidth() {
        if (TextUtils.isEmpty(this.t0) || N()) {
            return 0.0f;
        }
        return this.c0.measureText(this.t0.toString());
    }

    public int getMarginLabelLeft() {
        return this.f26721b;
    }

    public int getMaxValue() {
        return this.p;
    }

    public int getMinValue() {
        return this.o;
    }

    public int getOriginTextSizeHighlight() {
        return this.o0;
    }

    public int getOriginTextSizeHint() {
        return this.p0;
    }

    public float getOriginalLabelWidth() {
        if (TextUtils.isEmpty(this.t0) || N()) {
            return 0.0f;
        }
        float textSize = this.c0.getTextSize();
        this.c0.setTextSize(this.l0);
        float fMeasureText = this.c0.measureText(this.t0.toString());
        this.c0.setTextSize(textSize);
        return fMeasureText;
    }

    public int getTextSizeHighlight() {
        return this.g0;
    }

    public int getTextSizeHint() {
        return this.h0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.q;
    }

    public boolean getWrapSelectorWheel() {
        return this.N;
    }

    public final void h0() {
        String str;
        float f2;
        if (this.f26722k) {
            this.w.setTextSize(this.g0);
            String[] strArr = this.n;
            int i2 = 0;
            if (strArr == null) {
                float f3 = 0.0f;
                int i3 = 0;
                while (i2 < 9) {
                    float fMeasureText = this.w.measureText(String.valueOf(i2));
                    if (fMeasureText > f3) {
                        i3 = i2;
                        f3 = fMeasureText;
                    }
                    i2++;
                }
                int length = z(this.p).length();
                f2 = (int) (length * f3);
                char[] cArr = new char[length];
                Arrays.fill(cArr, (char) (i3 + 48));
                str = new String(cArr);
            } else {
                int length2 = strArr.length;
                str = null;
                float f4 = -1.0f;
                while (i2 < length2) {
                    String str2 = this.n[i2];
                    float fMeasureText2 = this.w.measureText(str2);
                    if (fMeasureText2 > f4) {
                        str = str2;
                        f4 = fMeasureText2;
                    }
                    i2++;
                }
                f2 = f4;
            }
            this.f0 = f2;
            this.e0 = str;
            float paddingLeft = f2 + this.e.getPaddingLeft() + this.e.getPaddingRight() + getPaddingLeft() + getPaddingRight();
            if (this.j != paddingLeft) {
                int i4 = this.i;
                if (paddingLeft > i4) {
                    this.j = (int) paddingLeft;
                } else {
                    this.j = i4;
                }
            }
        }
    }

    public final boolean i0() {
        String displayedMaxText = getDisplayedMaxText();
        if (TextUtils.isEmpty(displayedMaxText)) {
            return false;
        }
        if (this.Q != 0) {
            this.v0 = displayedMaxText;
            return true;
        }
        if (displayedMaxText.equals(this.e.getText().toString())) {
            return true;
        }
        this.e.setText(displayedMaxText);
        return true;
    }

    public final void j0(View view) {
        String strValueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(strValueOf)) {
            i0();
        } else {
            e0(B(strValueOf), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        I();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Z();
        a0();
        tnr.b("NumberPicker_sound_play");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.O) {
            super.onDraw(canvas);
            return;
        }
        float right = (((getRight() - getLeft()) + getPaddingLeft()) - getPaddingRight()) / 2;
        float f2 = this.y + this.x;
        u(canvas, right, f2, v(canvas, right, f2));
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.setScrollable(true);
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.addAction(4096);
            int i2 = Build.VERSION.SDK_INT;
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, this.o - 1, this.p + 1, this.q));
            StringBuilder sb = new StringBuilder();
            String[] strArr = this.n;
            sb.append(strArr == null ? z(this.q) : strArr[this.q - this.o]);
            sb.append(TextUtils.isEmpty(this.t0) ? "" : this.t0);
            accessibilityNodeInfo.setContentDescription(sb.toString());
            if (i2 >= 30) {
                accessibilityNodeInfo.setStateDescription(getContext().getString(b2j.f0));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.O || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        a0();
        this.e.setVisibility(4);
        float y = motionEvent.getY();
        this.G = y;
        this.I = y;
        this.H = motionEvent.getEventTime();
        this.R = false;
        this.S = false;
        float f2 = this.G;
        if (f2 < this.T) {
            if (this.Q == 0) {
                this.a0.a(2);
            }
        } else if (f2 > this.U && this.Q == 0) {
            this.a0.a(1);
        }
        if (!this.A.isFinished()) {
            this.A.forceFinished(true);
            this.B.forceFinished(true);
            R(0);
        } else if (this.B.isFinished()) {
            float f3 = this.G;
            if (f3 < this.T) {
                W(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.U) {
                W(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.S = true;
                V();
            }
        } else {
            this.A.forceFinished(true);
            this.B.forceFinished(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!this.O) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.e.getMeasuredWidth();
        int measuredHeight2 = this.e.getMeasuredHeight();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int i7 = (measuredHeight - measuredHeight2) / 2;
        this.e.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
        if (z) {
            L();
            K();
            int height = getHeight();
            int i8 = this.f;
            int i9 = this.P;
            int i10 = ((height - i8) / 2) - i9;
            this.T = i10;
            this.U = i10 + (i9 * 2) + i8;
        }
        g0((((getRight() - getLeft()) + getPaddingLeft()) - getPaddingRight()) / 2.0f);
        Drawable background = getBackground();
        int i11 = this.j + 20;
        if (this.x0 && (background instanceof StateListDrawable)) {
            StateListDrawable stateListDrawable = (StateListDrawable) background;
            if (Build.VERSION.SDK_INT >= 29) {
                int stateCount = stateListDrawable.getStateCount();
                for (int i12 = 0; i12 < stateCount; i12++) {
                    Drawable stateDrawable = stateListDrawable.getStateDrawable(i12);
                    if (stateDrawable instanceof LayerDrawable) {
                        LayerDrawable layerDrawable = (LayerDrawable) stateDrawable;
                        int numberOfLayers = layerDrawable.getNumberOfLayers();
                        for (int i13 = 0; i13 < numberOfLayers; i13++) {
                            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(layerDrawable.getId(i13));
                            if (drawableFindDrawableByLayerId instanceof GradientDrawable) {
                                ((GradientDrawable) drawableFindDrawableByLayerId).setSize(getWidth() > i11 ? i11 : getWidth(), getHeight());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.O) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(O(i2, this.j), O(i3, this.h));
            setMeasuredDimension(d0(this.i, getMeasuredWidth(), i2), d0(this.g, getMeasuredHeight(), i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int yVelocity;
        int iAbs;
        if (!isEnabled() || !this.O) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            b0();
            c0();
            this.a0.c();
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.M);
            yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) >= Math.abs(this.M)) {
                yVelocity = (int) (yVelocity * this.u0);
            }
            if (Math.abs(yVelocity) > this.L) {
                y(yVelocity);
                R(2);
            } else {
                int y = (int) motionEvent.getY();
                iAbs = (int) Math.abs(y - this.G);
                long eventTime = motionEvent.getEventTime() - this.H;
                if (iAbs <= this.K || eventTime >= ViewConfiguration.getLongPressTimeout()) {
                    x();
                } else if (this.S) {
                    this.S = false;
                } else {
                    int i2 = (y / this.x) - 1;
                    if (i2 > 0) {
                        s(true);
                        this.a0.b(1);
                    } else if (i2 < 0) {
                        s(false);
                        this.a0.b(2);
                    } else {
                        x();
                    }
                }
                R(0);
            }
            this.J.recycle();
            this.J = null;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b0();
                c0();
                this.a0.c();
                VelocityTracker velocityTracker2 = this.J;
                velocityTracker2.computeCurrentVelocity(1000, this.M);
                yVelocity = (int) velocityTracker2.getYVelocity();
                if (Math.abs(yVelocity) >= Math.abs(this.M)) {
                    yVelocity = (int) (yVelocity * this.u0);
                }
                if (Math.abs(yVelocity) > this.L) {
                    y(yVelocity);
                    R(2);
                } else {
                    int y2 = (int) motionEvent.getY();
                    iAbs = (int) Math.abs(y2 - this.G);
                    long eventTime2 = motionEvent.getEventTime() - this.H;
                    if (iAbs <= this.K) {
                        x();
                    } else {
                        x();
                    }
                    R(0);
                }
                this.J.recycle();
                this.J = null;
            }
        } else if (!this.R) {
            float y3 = motionEvent.getY();
            if (this.Q == 1) {
                scrollBy(0, (int) (y3 - this.I));
                invalidate();
            } else if (((int) Math.abs(y3 - this.G)) > this.K) {
                a0();
                R(1);
            }
            this.I = y3;
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
        if (i2 != 4096 && i2 != 8192) {
            return false;
        }
        s(i2 == 4096);
        return true;
    }

    public final void s(boolean z) {
        if (!this.O) {
            if (z) {
                e0(this.q + 1, true);
                return;
            } else {
                e0(this.q - 1, true);
                return;
            }
        }
        this.e.setVisibility(4);
        if (!P(this.A)) {
            P(this.B);
        }
        this.C = 0;
        if (z) {
            this.A.startScroll(0, 0, 0, -this.x, 300);
        } else {
            this.A.startScroll(0, 0, 0, this.x, 300);
        }
        invalidate();
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int[] iArr = this.v;
        boolean z = this.N;
        if (!z && i3 > 0 && iArr[1] <= this.o) {
            this.z = this.y;
            return;
        }
        if (!z && i3 < 0 && iArr[1] >= this.p) {
            this.z = this.y;
            return;
        }
        this.z += i3;
        while (true) {
            int i4 = this.z;
            if (i4 - this.y <= this.m) {
                break;
            }
            this.z = i4 - this.x;
            t(iArr);
            e0(iArr[1], true);
            if (!this.N && iArr[1] <= this.o) {
                this.z = this.y;
            }
        }
        while (true) {
            int i5 = this.z;
            if (i5 - this.y >= (-this.m)) {
                return;
            }
            this.z = i5 + this.x;
            E(iArr);
            e0(iArr[1], true);
            if (!this.N && iArr[1] >= this.p) {
                this.z = this.y;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.n == strArr) {
            return;
        }
        this.n = strArr;
        if (strArr != null) {
            this.e.setRawInputType(524289);
        } else {
            this.e.setRawInputType(2);
        }
        i0();
        M();
        h0();
    }

    public void setFormatter(d dVar) {
        if (dVar == this.s) {
            return;
        }
        this.s = dVar;
        M();
        i0();
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.t0;
        if ((charSequence != null || str == null) && (charSequence == null || charSequence.equals(str))) {
            return;
        }
        this.t0 = str;
        invalidate();
    }

    public void setLabelTextSizeThreshold(float f2) {
        this.m0 = Math.max(f2, 0.0f);
    }

    public void setLabelTextSizeTrimFactor(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        this.n0 = f2;
    }

    public void setMaxFlingSpeedFactor(float f2) {
        if (f2 >= 0.0f) {
            this.u0 = f2;
        }
    }

    public void setMaxValue(int i2) {
        if (this.p == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.p = i2;
        if (i2 < this.q) {
            this.q = i2;
        }
        setWrapSelectorWheel(i2 - this.o > this.v.length);
        M();
        i0();
        h0();
        invalidate();
    }

    public void setMeasureBackgroundEnabled(boolean z) {
        this.x0 = z;
    }

    public void setMinValue(int i2) {
        if (this.o == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.o = i2;
        if (i2 > this.q) {
            this.q = i2;
        }
        setWrapSelectorWheel(this.p - i2 > this.v.length);
        M();
        i0();
        h0();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.t = j2;
    }

    public void setOnScrollListener(g gVar) {
    }

    public void setOnValueChangedListener(h hVar) {
        this.f26723r = hVar;
    }

    public void setTextSizeHighlight(int i2) {
        this.g0 = i2;
        this.w.setTextSize(i2);
        this.f0 = this.w.measureText(this.e0);
        L();
        invalidate();
    }

    public void setTextSizeHint(int i2) {
        this.h0 = i2;
        invalidate();
    }

    public void setTextSizeTrimFactor(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        this.j0 = f2;
    }

    public void setValue(int i2) {
        e0(i2, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.p - this.o >= this.v.length;
        if ((!z || z2) && z != this.N) {
            this.N = z;
        }
        Y();
    }

    public final void t(int[] iArr) {
        if (iArr.length - 1 >= 0) {
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        }
        int i2 = iArr[1] - 1;
        if (this.N && i2 < this.o) {
            i2 = this.p;
        }
        iArr[0] = i2;
        w(i2);
    }

    public final void u(Canvas canvas, float f2, float f3, float f4) {
        if (TextUtils.isEmpty(this.t0) || N()) {
            return;
        }
        float fMeasureText = this.c0.measureText(this.t0.toString());
        canvas.drawText(this.t0.toString(), eyq.b(this) ? Math.max(((f2 - (this.f0 / 2.0f)) - this.f26721b) - fMeasureText, 0.0f) : Math.min(f2 + (this.f0 / 2.0f) + this.f26721b, getWidth() - fMeasureText), (f3 - (this.g0 / 2.0f)) + (this.k0 / 2.0f) + this.c, this.c0);
    }

    public final float v(Canvas canvas, float f2, float f3) {
        float f4 = this.z;
        SparseArray<String> sparseArray = this.u;
        for (int i2 : this.v) {
            String str = sparseArray.get(i2);
            float fAbs = Math.abs(f3 - f4) / this.x;
            int i3 = this.g0;
            float f5 = i3;
            float f6 = this.i0;
            if (f5 > f6) {
                i3 = (int) f6;
            } else {
                float width = getWidth() / this.w.measureText(str);
                if (width < 1.0f) {
                    i3 = (int) (this.g0 * width);
                }
            }
            int i4 = this.h0;
            int i5 = (int) (i3 * 0.85f);
            if (i4 > i5) {
                i4 = i5;
            }
            float fC = C(fAbs, i3, i4);
            this.w.setTextSize(fC);
            this.w.setColor(A(fAbs, this.r0, false));
            float f7 = ((fC - i4) / 2.0f) + f4;
            canvas.drawText(str, f2, f7, this.w);
            if (fAbs < 1.0f) {
                this.w.setColor(A(fAbs, this.q0, true));
                canvas.drawText(str, f2, f7, this.w);
            }
            f4 += this.x;
        }
        return f4;
    }

    public final void w(int i2) {
        String strZ;
        SparseArray<String> sparseArray = this.u;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.o;
        if (i2 < i3 || i2 > this.p) {
            strZ = "";
        } else {
            String[] strArr = this.n;
            strZ = strArr != null ? strArr[i2 - i3] : z(i2);
        }
        sparseArray.put(i2, strZ);
    }

    public final boolean x() {
        int i2 = this.y - this.z;
        if (i2 == 0) {
            return false;
        }
        this.C = 0;
        int iAbs = Math.abs(i2);
        int i3 = this.x;
        if (iAbs > i3 / 2) {
            if (i2 > 0) {
                i3 = -i3;
            }
            i2 += i3;
        }
        this.B.startScroll(0, 0, 0, i2, 800);
        invalidate();
        return true;
    }

    public final void y(int i2) {
        this.C = 0;
        if (i2 > 0) {
            this.A.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.A.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    public final String z(int i2) {
        d dVar = this.s;
        return dVar != null ? dVar.format(i2) : bdm.b(i2);
    }

    public static class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26729a;

        public f() {
            this.f26729a = -1;
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int i) {
            return bdm.c(this.f26729a, i);
        }

        public f(int i) {
            this.f26729a = i;
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bii.c);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f26720a = z0.incrementAndGet();
        this.f26721b = 1;
        this.c = 2;
        this.j = 400;
        this.t = 300L;
        this.u = new SparseArray<>();
        this.v = new int[3];
        this.y = Integer.MIN_VALUE;
        this.Q = 0;
        this.b0 = -1;
        this.j0 = 0.95f;
        this.n0 = 0.8f;
        this.u0 = 1.0f;
        this.x0 = true;
        float f2 = getResources().getDisplayMetrics().density;
        this.f26721b = getResources().getDimensionPixelOffset(gmi.f19137a);
        this.c = getResources().getDimensionPixelOffset(gmi.f19138b);
        T(attributeSet, i2);
        I();
        this.O = true;
        this.P = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f = (int) (45.0f * f2);
        this.g = -1;
        this.h = (int) (f2 * 202.0f);
        this.i = -1;
        this.j = -1;
        this.f26722k = true;
        this.a0 = new i();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(ewi.c, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(ati.number_picker_input);
        this.e = editText;
        F();
        J();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.K = viewConfiguration.getScaledTouchSlop();
        this.L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.M = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.l = (int) editText.getTextSize();
        this.w = H();
        G();
        this.A = new Scroller(getContext(), null, true);
        this.B = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        i0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
