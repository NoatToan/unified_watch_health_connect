package com.huawei.uikit.hwadvancednumberpicker.widget;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.uikit.hwadvancednumberpicker.R;
import com.huawei.uikit.hwadvancednumberpicker.utils.HwCommonHandler;
import com.huawei.uikit.hwadvancednumberpicker.utils.HwFormatter;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import defpackage.pa;
import defpackage.xcz;
import defpackage.xde;
import defpackage.xdj;
import defpackage.xdp;
import defpackage.xea;
import defpackage.xfs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class HwAdvancedNumberPicker extends FrameLayout implements HwCommonHandler.MessageHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f29232a;
    private HwFormatter aa;
    private long ab;
    private OnScrollListener ac;
    private boolean ad;
    private boolean ae;
    private int af;
    private long ag;
    private long ah;
    private boolean ai;
    private Paint aj;
    private String ak;
    private boolean al;
    private final SparseArray<String> am;
    private long an;
    private final xea ao;
    private String ap;
    private boolean aq;
    private Paint ar;
    private boolean as;
    private String at;
    private String au;
    private boolean av;
    private boolean aw;
    private final xea ax;
    private int ay;
    private boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f29233b;
    private d ba;
    private int bb;
    private int bc;
    private final AnimatorSet bd;
    private boolean be;
    private int bf;
    private float bg;
    private boolean bh;
    private double bi;
    private HwGenericEventDetector bj;
    private boolean bk;
    private boolean bl;
    private float bm;
    private ThreadPoolExecutor bn;
    private boolean bo;
    private VelocityTracker bp;
    private ThreadPoolExecutor bq;
    private boolean br;
    private boolean bs;
    private boolean bt;
    private e bu;
    private int bv;
    private boolean bw;
    private View bx;
    private View by;
    private int bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f29234c;
    private View ca;
    private String cb;
    private boolean cc;
    private int cd;
    private int ce;
    private float cf;
    private final Object cg;
    private int ch;
    private boolean ci;
    private long cj;
    private int ck;
    private long cl;
    private float cm;
    private boolean cn;
    private j co;
    private float cp;
    private i cq;
    private boolean cr;
    private float cs;
    private int ct;
    private int cu;
    private float cv;
    private int cw;
    private AccessibilityManager cx;
    private float cy;
    private boolean cz;
    protected boolean d;
    private int da;
    private float db;
    private boolean dc;
    private boolean dd;
    private TextView de;
    private boolean df;
    private int dg;
    private boolean dh;
    private boolean di;
    private boolean dj;
    private final int dk;
    private int dl;
    private final int dm;
    private int dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private float f4do;
    private HashMap<Integer, String> dp;
    private a dq;
    private int dr;
    private Drawable ds;
    private HwPickerScrollListener dt;
    private int du;
    private int dv;
    private int dw;
    private int dx;
    private int dy;
    private int dz;
    protected int e;
    private int ea;
    private boolean eb;
    private int ec;
    private boolean ed;
    private int ee;
    private float ef;
    private int eg;
    private boolean eh;
    private int ei;
    private int ej;
    private int ek;
    private int el;
    private int em;
    private int en;
    private double eo;
    private final String ep;
    private SoundPool eq;
    private float er;
    private ScheduledThreadPoolExecutor es;
    private int[] et;
    private ScheduledFuture<?> eu;
    private boolean ev;
    private OnColorChangeListener ew;
    private boolean ex;
    private boolean ey;
    private final Handler ez;
    protected int f;
    private String fa;
    private String fc;
    protected int g;
    protected int h;
    protected float i;
    protected int j;
    protected int k;
    protected int l;
    protected float m;
    protected int n;
    protected int o;
    private boolean p;
    protected float q;
    protected float r;
    private final boolean s;
    private AccessibilityManager.AccessibilityStateChangeListener t;
    private String[] u;
    private Scroller v;
    private boolean w;
    private OnValueChangeListener x;
    private int y;
    private long z;

    public interface OnColorChangeListener {
        void onColorChange(HwAdvancedNumberPicker hwAdvancedNumberPicker);
    }

    public interface OnScrollListener {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

        void onScrollStateChange(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i);
    }

    public interface OnValueChangeListener {
        void onValueChange(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2);
    }

    class a implements Runnable {
        private int e;

        public a(int i) {
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!xdj.c(HwAdvancedNumberPicker.this.ao, HwAdvancedNumberPicker.this.ax, HwAdvancedNumberPicker.this.v)) {
                HwAdvancedNumberPicker.this.e(100, this.e);
            } else {
                if (this.e == 1) {
                    HwAdvancedNumberPicker.this.w();
                    return;
                }
                HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
                hwAdvancedNumberPicker.f29233b = hwAdvancedNumberPicker.e;
                hwAdvancedNumberPicker.invalidate();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
            hwAdvancedNumberPicker.a(hwAdvancedNumberPicker.et);
            HwAdvancedNumberPicker hwAdvancedNumberPicker2 = HwAdvancedNumberPicker.this;
            hwAdvancedNumberPicker2.e(hwAdvancedNumberPicker2.et);
            HwAdvancedNumberPicker.this.az = false;
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwAdvancedNumberPicker.this.bb = 0;
            HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
            int i = hwAdvancedNumberPicker.e;
            int i2 = hwAdvancedNumberPicker.f29233b;
            if (i == i2) {
                hwAdvancedNumberPicker.b();
                HwAdvancedNumberPicker.this.invalidate();
                return;
            }
            int i3 = i - i2;
            if (Math.abs(i3) > HwAdvancedNumberPicker.this.ce) {
                i3 += i3 > 0 ? -HwAdvancedNumberPicker.this.o : HwAdvancedNumberPicker.this.o;
            }
            HwAdvancedNumberPicker.this.bi = 1.0d;
            xdj.b(HwAdvancedNumberPicker.this.ax, i3);
            HwAdvancedNumberPicker.this.invalidate();
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29240c;

        /* synthetic */ e(HwAdvancedNumberPicker hwAdvancedNumberPicker, boolean z, f fVar) {
            this(z);
        }

        @Override // java.lang.Runnable
        public void run() {
            HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
            xdj.b(hwAdvancedNumberPicker, hwAdvancedNumberPicker.cx, HwAdvancedNumberPicker.this.cn);
            if (this.f29240c) {
                HwAdvancedNumberPicker.this.postDelayed(this, 100L);
            } else {
                HwAdvancedNumberPicker.this.removeCallbacks(this);
            }
        }

        private e(boolean z) {
            this.f29240c = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(boolean z) {
            this.f29240c = z;
        }
    }

    class f extends View.AccessibilityDelegate {
        f() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            if (accessibilityNodeInfo == null) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            xdj.e(accessibilityNodeInfo);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HwAdvancedNumberPicker.this.bq != null) {
                HwAdvancedNumberPicker.this.bq.execute(HwAdvancedNumberPicker.this.cq);
            }
        }
    }

    class i implements Runnable {
        private i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jRound = Math.round((HwAdvancedNumberPicker.this.eo * 0.073892d) + 77.982184d);
            if (jRound > 100 && jRound < 2147483647L) {
                jRound = 100;
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
            hwAdvancedNumberPicker.b(hwAdvancedNumberPicker, jRound);
            synchronized (HwAdvancedNumberPicker.this.cg) {
                HwAdvancedNumberPicker.this.ak();
            }
        }

        /* synthetic */ i(HwAdvancedNumberPicker hwAdvancedNumberPicker, f fVar) {
            this();
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29244b;
        private View d;

        /* synthetic */ j(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, View view, f fVar) {
            this(i, view);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (HwAdvancedNumberPicker.this.cg) {
                HwAdvancedNumberPicker.this.ak();
            }
            HwAdvancedNumberPicker.this.d(this.d, this.f29244b);
        }

        private j(int i, View view) {
            this.f29244b = i;
            this.d = view;
        }
    }

    public HwAdvancedNumberPicker(Context context) {
        this(context, null);
    }

    private void aj() {
        if (this.bp == null) {
            this.bp = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        if (this.eq == null || this.l == 0 || !this.d) {
            Log.w("HwAdvancedNumberPicker", "SoundPool is not initialized properly!");
            return;
        }
        float f2 = (float) ((this.eo * 6.0E-4d) + 0.6d);
        Log.w("HwAdvancedNumberPicker", "TimePicker volume level is: " + f2);
        this.eq.play(this.l, f2, f2, 0, 0, 1.0f);
    }

    private void am() {
        VelocityTracker velocityTracker = this.bp;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.bp = null;
        }
    }

    private void an() {
        try {
            this.dg = ((int) getResources().getDimension(R.dimen.hwadvancednumberpicker_input_high)) * (this.et.length - 1);
        } catch (Resources.NotFoundException unused) {
            Log.w("HwAdvancedNumberPicker", "resources not found");
        }
        if (this.cn) {
            if (isInEditMode()) {
                setSelectorWheelState(1);
            } else {
                setSelectorWheelState(2);
                z();
            }
        }
        b();
        this.cr = false;
    }

    private void ao() {
        ThreadPoolExecutor threadPoolExecutor = this.bn;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
        }
        this.bn = null;
        ThreadPoolExecutor threadPoolExecutor2 = this.bq;
        if (threadPoolExecutor2 != null) {
            threadPoolExecutor2.shutdownNow();
        }
        this.bq = null;
    }

    private void ap() {
        synchronized (this.cg) {
            SoundPool soundPool = this.eq;
            if (soundPool != null) {
                soundPool.release();
                this.eq = null;
                this.l = 0;
                this.d = false;
            }
        }
    }

    private void aq() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.t;
        if (accessibilityStateChangeListener != null && (accessibilityManager = this.cx) != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        this.t = null;
    }

    private void as() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.es;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.shutdownNow();
        }
        this.es = null;
    }

    private void p() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.es;
        if (scheduledThreadPoolExecutor == null || scheduledThreadPoolExecutor.isShutdown()) {
            return;
        }
        this.eu = this.es.scheduleAtFixedRate(new Runnable() { // from class: xdk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.ai();
            }
        }, 0L, 2L, TimeUnit.MILLISECONDS);
    }

    private void q() {
        e eVar = this.bu;
        if (eVar == null || this.cu == 1) {
            return;
        }
        eVar.e(false);
    }

    private boolean s() {
        return d((MotionEvent) null);
    }

    private void setSelectorWheelState(int i2) {
        this.ea = i2;
        AccessibilityManager accessibilityManager = this.cx;
        if (accessibilityManager != null && this.cn && i2 == 2 && accessibilityManager.isEnabled()) {
            this.cx.interrupt();
            this.de.setContentDescription(this.cb);
            this.de.sendAccessibilityEvent(16384);
            this.de.setContentDescription(null);
        }
    }

    private void t() {
        boolean z = true;
        this.bt = true;
        e eVar = this.bu;
        if (eVar == null) {
            this.bu = new e(this, z, null);
        } else {
            eVar.e(false);
        }
    }

    private void y() {
        this.q = getResources().getDimension(R.dimen.hwadvancednumberpicker_textSizeSubTitle2);
        this.r = getResources().getDimension(R.dimen.hwadvancednumberpicker_textSizeSubTitle3);
        this.m = getResources().getDimension(R.dimen.hwadvancednumberpicker_textSizeSubTitle4);
        this.i = getResources().getDimension(R.dimen.hwadvancednumberpicker_textSizeHeadline8);
        int i2 = (int) (getResources().getConfiguration().fontScale * 100.0f);
        float dimension = getResources().getDimension(R.dimen.hwadvancednumberpicker_padding_3dp);
        float dimension2 = getResources().getDimension(R.dimen.hwadvancednumberpicker_padding_xs);
        if (i2 == 115) {
            d(dimension2);
        }
        if (i2 == 130) {
            d(dimension);
        }
        if (xde.c(this.f29232a)) {
            d(dimension);
            if (!DateFormat.is24HourFormat(this.f29232a)) {
                d(dimension2);
            }
        }
        this.cf = this.i;
    }

    public void a() {
        d dVar = this.ba;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    protected void a(int i2) {
        e(i2);
        if (!this.av && !this.w) {
            this.af++;
        }
        if (this.w) {
            x();
        }
    }

    public void a(String str, boolean z) {
        this.fa = str;
        this.ex = z;
    }

    public void b() {
        int i2;
        String[] strArr = this.u;
        if (strArr == null || strArr.length == 0 || ((i2 = this.dy) >= 0 && i2 < this.dr)) {
            this.de.setText(xdj.d(this.dy, this.aa));
        } else {
            this.de.setText(strArr[(i2 - this.dr) % strArr.length]);
        }
    }

    protected HwGenericEventDetector.OnScrollListener c() {
        return new HwGenericEventDetector.OnScrollListener() { // from class: xdm
            @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnScrollListener
            public final boolean onScrollBy(float f2, float f3, MotionEvent motionEvent) {
                return this.f52740b.e(f2, f3, motionEvent);
            }
        };
    }

    protected void c(int i2) {
        int i3;
        this.dv = i2;
        this.bw = true;
        this.bb = 0;
        int i4 = this.f29234c;
        if (i2 > i4 || i2 < (i4 = -i4)) {
            i3 = i4;
        } else {
            if (Math.abs(i2) < this.j) {
                d(0);
                return;
            }
            i3 = i2;
        }
        if (i2 > 0) {
            this.ao.d(this, 0, i3, 0, Integer.MAX_VALUE);
        } else {
            this.ao.d(this, 0, i3, Integer.MIN_VALUE, 0);
        }
        int iH = this.ao.h();
        if (iH == 0 || this.o == 0) {
            this.bi = 1.0d;
            return;
        }
        this.bi = xdj.c(this.ce, this.e, this.f29233b, i2, iH);
        invalidate();
        n(100);
    }

    protected void c(ViewConfiguration viewConfiguration) {
        this.j = 400;
        this.f29234c = viewConfiguration.getScaledMaximumFlingVelocity() / 2;
    }

    protected float d(int i2, float f2, float f3) {
        int i3 = this.e;
        float f4 = f3 - i3;
        float f5 = i3 + (this.o * i2);
        int i4 = this.cw;
        float f6 = 1.0f;
        float f7 = i2 < i4 ? -1.0f : 1.0f;
        if (this.ej == 5) {
            if (i2 != i4) {
                return xdj.b(f5, f7, f4, (i2 == 1 || i2 == 3) ? 10.0f : 5.0f, this.er);
            }
        } else if (i2 != i4) {
            if (i2 == 2 || i2 == 4) {
                f6 = 6.0f;
            } else if (i2 != 1 && i2 != 5) {
                f6 = -4.0f;
            }
            return xdj.b(f5, f7, f4, f6, this.er);
        }
        return f2;
    }

    protected HwGenericEventDetector d() {
        return new HwGenericEventDetector(getContext());
    }

    public void d(int i2) {
        d dVar = this.ba;
        if (dVar == null) {
            this.ba = new d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.ba, i2);
    }

    protected void d(View view, int i2) {
        xdj.a(this, view, i2);
    }

    public void d(boolean z) {
        int i2 = this.ai ? 5 : 7;
        this.ej = i2;
        this.cw = i2 / 2;
        this.et = new int[i2];
        an();
        j();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            Log.w("HwAdvancedNumberPicker", "dispatchKeyEvent : event is null");
            return false;
        }
        if (!m() && this.ao.i() && this.ax.i()) {
            w();
        }
        if (!xdj.e(keyEvent, this, this.ba)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(100);
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return xdj.a(this, accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwAdvancedNumberPicker", "dispatchTouchEvent : event is null");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            xdj.d(this, this.ba);
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                xdj.d(this, this.ba);
                k();
            } else if (actionMasked == 5) {
                requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 6) {
                requestDisallowInterceptTouchEvent(false);
            }
        } else if (this.ea == 2) {
            xdj.d(this, this.ba);
            h();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwAdvancedNumberPicker", "dispatchTrackballEvent : event is null");
            return false;
        }
        xdj.a(motionEvent, this);
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        xdj.c(this);
        if (this.bd.isRunning() || this.ea != 2) {
            long drawingTime = getDrawingTime();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).isShown()) {
                    drawChild(canvas, getChildAt(i2), drawingTime);
                }
            }
        }
    }

    protected void e(int i2) {
        if (this.dy == i2) {
            return;
        }
        int iH = h(i2);
        int i3 = this.dy;
        setValue(iH);
        c(i3, iH);
    }

    protected void e(AccessibilityManager accessibilityManager) {
        this.dd = isFocusable();
        this.df = isFocusableInTouchMode();
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            setFocusableInTouchMode(false);
            setFocusable(false);
        }
    }

    protected void g() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: xdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52731b.d(view);
            }
        };
        View viewFindViewById = findViewById(R.id.hwadvancednumberpicker_increment);
        this.by = viewFindViewById;
        viewFindViewById.setOnClickListener(onClickListener);
        View viewFindViewById2 = findViewById(R.id.hwadvancednumberpicker_decrement);
        this.ca = viewFindViewById2;
        viewFindViewById2.setOnClickListener(onClickListener);
        View viewFindViewById3 = findViewById(R.id.hwadvancednumberpicker_textview);
        this.bx = viewFindViewById3;
        viewFindViewById3.setFocusable(true);
        setEnabled(this.cc);
        setMiddleStateDrawable(this.ch);
        this.bx.setAccessibilityDelegate(new f());
        View.AccessibilityDelegate accessibilityDelegateE = xdj.e(this.f29232a, this, this.bx, this.dp, this.cw);
        this.by.setAccessibilityDelegate(accessibilityDelegateE);
        this.ca.setAccessibilityDelegate(accessibilityDelegateE);
        this.bx.setAccessibilityDelegate(accessibilityDelegateE);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        String[] strArr = this.u;
        return strArr != null ? (String[]) strArr.clone() : xdj.e(this);
    }

    protected int getGravity() {
        return this.ct;
    }

    public int getMaxValue() {
        return this.dw;
    }

    public Drawable getMiddleStateDrawable() {
        View view = this.bx;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public int getMinValue() {
        return this.dr;
    }

    public OnColorChangeListener getOnColorChangeListener() {
        return this.ew;
    }

    protected float getScrollFriction() {
        return this.f4do;
    }

    public int getSecondaryPaintColor() {
        return this.cd;
    }

    protected float getSelectedTextSize() {
        return this.i;
    }

    public Drawable getSelectionDivider() {
        return this.ds;
    }

    public int getSelectionDividerHeight() {
        return this.du;
    }

    public int getSelectorPaintColor() {
        return this.bz;
    }

    public float getSensitivity() {
        HwGenericEventDetector hwGenericEventDetector = this.bj;
        if (hwGenericEventDetector != null) {
            return hwGenericEventDetector.e();
        }
        return 0.6f;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.bv;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    protected float getUnselectedTextSize() {
        return this.q;
    }

    public int getValue() {
        return this.dy;
    }

    public boolean getWrapSelectorWheel() {
        return this.bo;
    }

    public void h() {
        if (this.ao.i()) {
            return;
        }
        this.ao.c();
    }

    @Override // com.huawei.uikit.hwadvancednumberpicker.utils.HwCommonHandler.MessageHandler
    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 103) {
            v(this);
        } else {
            if (i2 != 104) {
                return;
            }
            p();
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.cc;
    }

    protected void j() {
        o();
        if (Float.compare(this.et.length - 1, 0.0f) == 0) {
            return;
        }
        int top = ((this.de.getTop() + this.de.getBottom()) / 2) - (this.o * this.cw);
        this.e = top;
        this.f29233b = top;
        b();
    }

    protected void k() {
        this.dj = false;
        if (this.v.isFinished()) {
            xdj.d(this.ao, this.ax);
            c(0);
        }
    }

    public void l() {
        if (!this.dj && this.v.isFinished() && this.ao.i() && this.ax.i()) {
            this.bb = 0;
            this.v.startScroll(0, 0, 0, this.ce * (-2), 150);
        }
        invalidate();
    }

    public boolean m() {
        return Math.abs(this.e - this.f29233b) == 0;
    }

    public boolean n() {
        return Math.abs(this.e - this.f29233b) <= 1;
    }

    public void o() {
        this.am.clear();
        g(getValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        af();
        ah();
        ae();
        ac();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d(!this.ad && configuration.orientation == 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xdj.d(this, this.ba);
        ap();
        ao();
        as();
        aq();
        ScheduledFuture<?> scheduledFuture = this.eu;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.eu = null;
        }
        pa.e().b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        if (this.ea == 0) {
            return;
        }
        int iSave = canvas.save();
        if (this.ea == 1) {
            Rect clipBounds = canvas.getClipBounds();
            clipBounds.inset(0, this.o);
            canvas.clipRect(clipBounds);
        }
        if (this.da == 1) {
            d(canvas);
        } else {
            a(canvas);
        }
        c(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return false;
        }
        this.ci = true;
        HwGenericEventDetector hwGenericEventDetector = this.bj;
        if (hwGenericEventDetector != null && this.bl && hwGenericEventDetector.c(motionEvent)) {
            return true;
        }
        aj();
        this.bp.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 8) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            this.cl = timeInMillis;
            if (timeInMillis - this.cj > 5) {
                float axisValue = motionEvent.getAxisValue(9) * 960.0f;
                if (Math.abs(axisValue) > 4800.0f) {
                    axisValue = axisValue > 0.0f ? 4800.0f : -4800.0f;
                }
                if (!this.dj && this.v.isFinished() && xdj.a(this.ao, axisValue)) {
                    xdj.d(this, this.ae);
                    d(motionEvent, (int) axisValue);
                } else {
                    Log.w("HwAdvancedNumberPicker", "action conflict, no need to scroll");
                }
                this.cj = this.cl;
            }
        }
        am();
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!this.cz) {
            return super.onHoverEvent(motionEvent);
        }
        xdj.d(motionEvent, this);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.cn || motionEvent == null) {
            return false;
        }
        aj();
        this.bp.addMovement(motionEvent);
        this.bp.computeCurrentVelocity(1000, this.f29234c);
        this.bc = (int) this.bp.getYVelocity();
        this.bw = false;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.as = false;
            this.aw = false;
            t();
            a aVar = this.dq;
            if (aVar != null) {
                removeCallbacks(aVar);
            }
            return c(motionEvent);
        }
        if (actionMasked == 1) {
            this.as = true;
            this.aw = true;
            d(motionEvent);
            return false;
        }
        if (actionMasked == 2 && ((int) Math.abs(motionEvent.getY() - this.bg)) > this.ee) {
            this.bk = false;
            o(1);
            setSelectorWheelState(2);
            z();
            if (motionEvent.getPointerCount() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        xdj.c(this.de, this);
        if (!this.cr) {
            this.cr = true;
            j();
            int height = getHeight();
            int i6 = this.dl;
            int i7 = this.du;
            int i8 = ((height - i6) / 2) - i7;
            this.em = i8;
            this.ec = i8 + (i7 * 2) + i6;
            this.el = (getHeight() - this.dx) / 2;
        }
        u();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(xdj.a(i2, this.dn), xdj.a(i3, this.dg));
        setMeasuredDimension(xdj.c(this.dm, getMeasuredWidth(), i2, this), xdj.c(this.dk, getMeasuredHeight(), i3, this));
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setContentDescription(null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return false;
        }
        aj();
        this.bp.addMovement(motionEvent);
        this.bp.computeCurrentVelocity(1000, this.f29234c);
        this.bc = (int) this.bp.getYVelocity();
        this.bw = false;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            xdj.d(this, this.ae);
            this.dj = true;
            this.ez.sendEmptyMessage(103);
            t();
        } else if (actionMasked == 1) {
            this.av = true;
            this.as = true;
            this.bh = true;
            this.az = false;
            this.af = 0;
            if (s()) {
                return false;
            }
        } else {
            if (actionMasked == 2) {
                return a(motionEvent);
            }
            if (actionMasked == 3) {
                this.av = true;
                this.af = 0;
                k();
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            xdj.d(this);
            if (this.ck != 0) {
                w();
            }
        }
        this.ck = i2;
    }

    public void r() {
        if (!this.dj && this.v.isFinished() && this.ao.i() && this.ax.i()) {
            this.bb = 0;
            this.v.startScroll(0, 0, 0, this.ce * 2, 150);
        }
        invalidate();
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        this.ab = SystemClock.uptimeMillis();
        if (this.ea == 0 || !this.cn) {
            return;
        }
        int[] iArr = this.et;
        int i4 = this.cw;
        if (i4 >= 0 && i4 < iArr.length) {
            boolean z = this.bo;
            if ((!z || this.ey) && i3 > 0 && iArr[i4] <= this.dr) {
                this.f29233b = this.e;
                this.ao.c();
                return;
            } else if (!z && i3 < 0 && iArr[i4] >= this.dw) {
                this.f29233b = this.e;
                this.ao.c();
                return;
            }
        }
        this.f29233b += i3;
        int iAbs = Math.abs(this.bw ? this.bf : this.bc);
        this.eg = iAbs;
        double d2 = ((double) xde.d(this.f29232a, iAbs)) * 0.15875d;
        this.eo = d2;
        this.ev = BigDecimal.valueOf(d2).compareTo(BigDecimal.valueOf(156.0d)) < 0;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (this.ev && this.eb && this.af < 4 && this.eo > 50.0d) {
            Log.i("HwAdvancedNumberPicker", "Made up for the " + this.af + " vibration, velocity is " + this.eo);
            this.ev = false;
            this.av = false;
        }
        if (!this.ev && timeInMillis - this.ah < 40) {
            this.ev = true;
        }
        g(iArr);
        this.ci = false;
    }

    public void setAccessibilityOptimizationEnabled(boolean z) {
        this.bs = z;
    }

    public void setAnnouncedSuffix(String str) {
        this.au = str;
    }

    public void setDisplayedValues(String[] strArr) {
        if (Arrays.equals(this.u, strArr)) {
            return;
        }
        if (strArr != null) {
            this.u = (String[]) strArr.clone();
        } else {
            this.u = null;
        }
        if (this.u != null) {
            this.de.setRawInputType(ARImageMetadata.LENS_FILTER_DENSITY);
        } else {
            this.de.setRawInputType(2);
        }
        xdj.b(this);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.cc = z;
        xdj.a(this.bx, z);
        xdj.a(this.by, z);
        xdj.a(this.ca, z);
        xdj.d(this, z, this.cm);
    }

    public void setExtendScrollEnabled(boolean z) {
        this.bl = z;
    }

    public void setFlingAble(boolean z) {
        this.cn = z;
    }

    public void setFlingAnnounceType(int i2) {
        this.ay = i2;
    }

    public void setFormatter(HwFormatter hwFormatter) {
        if (hwFormatter == this.aa) {
            return;
        }
        this.aa = hwFormatter;
        o();
        b();
    }

    protected void setGravity(int i2) {
        this.ct = i2;
    }

    public void setIsNeedStopDownScroll(boolean z) {
        this.ey = z;
    }

    public void setIsSupportRichTap(boolean z) {
        this.ed = z;
    }

    public void setMaxValue(int i2) {
        if (this.dw == i2) {
            return;
        }
        if (i2 < 0) {
            Log.e("HwAdvancedNumberPicker", "maxValue must be >= 0");
            return;
        }
        this.dw = i2;
        if (i2 < this.dy) {
            this.dy = i2;
        }
        setWrapSelectorWheel(i2 - this.dr > this.et.length);
        xdj.b(this);
    }

    public void setMiddleStateDrawable(int i2) {
        if (i2 != 0) {
            this.bx.setBackgroundResource(i2);
        }
    }

    public void setMinValue(int i2) {
        if (this.dr == i2) {
            return;
        }
        if (i2 < 0) {
            Log.e("HwAdvancedNumberPicker", "minValue must be >= 0");
            return;
        }
        this.dr = i2;
        int i3 = this.dy;
        int i4 = this.dm;
        if (i3 <= i4) {
            i3 = i4;
        }
        this.dy = i3;
        setWrapSelectorWheel(this.dw - i2 > this.et.length);
        xdj.b(this);
    }

    public void setOnColorChangeListener(OnColorChangeListener onColorChangeListener) {
        this.ew = onColorChangeListener;
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.ag = j2;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.ac = onScrollListener;
    }

    public void setOnValueChangedListener(OnValueChangeListener onValueChangeListener) {
        this.x = onValueChangeListener;
    }

    protected void setScrollFriction(float f2) {
        this.f4do = f2;
        this.ao.c(f2);
    }

    @Deprecated
    public void setSecondPaintColor(int i2) {
        setSecondaryPaintColor(i2);
    }

    public void setSecondaryPaintColor(int i2) {
        this.cd = i2;
        this.ar.setColor(i2);
        invalidate();
    }

    public void setSelectedFocusedTextColor(int i2) {
        this.h = i2;
    }

    public void setSelectedItemHeight(float f2) {
        ViewGroup.LayoutParams layoutParams = this.bx.getLayoutParams();
        layoutParams.height = (int) TypedValue.applyDimension(1, f2, this.f29232a.getResources().getDisplayMetrics());
        this.bx.setLayoutParams(layoutParams);
        invalidate();
    }

    public void setSelectedItemTextSize(float f2) {
        float fA = xdj.a(this.f29232a, f2);
        this.aj.setTextSize(fA);
        this.i = fA;
        this.cf = fA;
        this.de.setTextSize(1, f2 + 2.0f);
        ViewGroup.LayoutParams layoutParams = this.de.getLayoutParams();
        layoutParams.height = -2;
        this.de.setLayoutParams(layoutParams);
        invalidate();
    }

    public void setSelectedTextMinSize(float f2) {
        this.g = (int) xdj.e(this.f29232a, f2);
    }

    protected void setSelectedTextSize(float f2) {
        c(xdj.e(this.f29232a, f2));
    }

    protected void setSelectedTextSizeByDp(float f2) {
        c(xdj.a(this.f29232a, f2));
    }

    public void setSelectedUnfocusedTextColor(int i2) {
        this.n = i2;
    }

    public void setSelectionDivider(Drawable drawable) {
        this.ds = drawable;
        this.da = 0;
    }

    public void setSelectionDividerHeight(int i2) {
        this.du = i2;
    }

    public void setSelectionRectDivider(Drawable drawable) {
        this.ds = drawable;
        this.da = 1;
    }

    public void setSelectorPaintColor(int i2) {
        this.bz = i2;
        this.aj.setColor(i2);
        invalidate();
    }

    public void setSelectorPaintColorInSingleMode(int i2) {
    }

    public void setSensitivity(float f2) {
        HwGenericEventDetector hwGenericEventDetector = this.bj;
        if (hwGenericEventDetector != null) {
            hwGenericEventDetector.d(f2);
        }
    }

    @Deprecated
    public void setSlaverPaintColor(int i2) {
        setSecondaryPaintColor(i2);
    }

    public void setStringUnit(String str) {
        if (this.u != null) {
            Log.w("HwAdvancedNumberPicker", "mDisplayedValues is not null, unit can not be set.");
        } else {
            if (str.isEmpty()) {
                return;
            }
            this.al = true;
            this.ak = str;
        }
    }

    public void setTextColorGradientEnabled(boolean z) {
        this.di = z;
    }

    public void setUnselectedItemTextSize(float f2) {
        float fA = xdj.a(this.f29232a, f2);
        this.ar.setTextSize(fA);
        this.q = fA;
        invalidate();
    }

    public void setUnselectedItemsHeight(float f2) {
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(this.by);
        arrayList.add(this.ca);
        for (View view : arrayList) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) TypedValue.applyDimension(1, f2, this.f29232a.getResources().getDisplayMetrics());
            view.setLayoutParams(layoutParams);
        }
        invalidate();
    }

    protected void setUnselectedTextSize(float f2) {
        e(xdj.e(this.f29232a, f2));
    }

    protected void setUnselectedTextSizeByDp(float f2) {
        e(xdj.a(this.f29232a, f2));
    }

    public void setValue(int i2) {
        if (this.dy == i2) {
            return;
        }
        int i3 = this.dr;
        if (i2 < i3) {
            i2 = this.bo ? this.dw : i3;
        }
        int i4 = this.dw;
        if (i2 <= i4) {
            i3 = i2;
        } else if (!this.bo) {
            i3 = i4;
        }
        this.dy = i3;
        o();
        b();
        invalidate();
    }

    public void setWrapSelectorWheel(boolean z) {
        if (z && this.dw - this.dr < this.et.length) {
            Log.e("HwAdvancedNumberPicker", "Range less than selector items count.");
        } else if (z != this.bo) {
            this.bo = z;
        }
    }

    public HwAdvancedNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwAdvancedNumberPickerStyle);
    }

    private void a(float f2) {
        int iD = xdj.d(getContext());
        if (f2 > iD || f2 < (-iD)) {
            Log.e("HwAdvancedNumberPicker", "Illegal event locationY.");
            return;
        }
        if ((this.bk || this.cu != 1) && ((int) Math.abs(f2 - this.bg)) > this.ee) {
            this.bk = false;
            o(1);
        }
        scrollBy(0, (int) (f2 - this.bm));
        invalidate();
        this.bm = f2;
    }

    private void aa() {
        AccessibilityManager accessibilityManager = this.cx;
        this.cz = accessibilityManager != null && accessibilityManager.isEnabled() && this.cx.isTouchExplorationEnabled();
        e(this.cx);
    }

    private void ab() {
        this.aj = xdj.a(this.f29232a, this.bz, this.i);
        this.ar = xdj.d(this.f29232a, this.cd, this.i);
    }

    private void ad() {
        View.inflate(getContext(), R.layout.hwadvancednumberpicker, this);
        d(getContext());
        ab();
        an();
    }

    private void ae() {
        if (this.bn == null) {
            this.bn = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new xdp());
        }
        if (this.bq == null) {
            this.bq = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new xdp());
        }
    }

    private void af() {
        if (isInEditMode()) {
            return;
        }
        SoundPool soundPoolD = xdj.d();
        this.eq = soundPoolD;
        if (soundPoolD == null) {
            return;
        }
        soundPoolD.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: xdh
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i2, int i3) {
                this.f52730c.d(soundPool, i2, i3);
            }
        });
        this.l = this.eq.load(getContext(), R.raw.hwadvancednumberpicker, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ag() {
        xdj.d(this.f29232a, this);
        invalidate();
    }

    private void ah() {
        if (this.es == null) {
            this.es = new ScheduledThreadPoolExecutor(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ai() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.z;
        boolean z = false;
        boolean z2 = BigDecimal.valueOf(this.eo).compareTo(BigDecimal.ZERO) == 0;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        long j2 = this.ab;
        boolean z3 = this.z == -1 || jUptimeMillis > 38;
        long j3 = jUptimeMillis2 - j2;
        if (j3 > 20 && this.bh) {
            this.az = true;
            this.bh = false;
        }
        boolean z4 = this.az;
        if (z4) {
            z = z4;
        } else if (j3 < 20) {
            z = true;
        }
        if (this.et.length <= 0 || z2 || !z || !z3) {
            return;
        }
        this.eh = true;
        Log.i("HwAdvancedNumberPicker", "This time it's a 40 ms vibration, The time interval is : " + jUptimeMillis);
        this.z = SystemClock.uptimeMillis();
        long jRound = Math.round((this.eo * 0.073892d) + 77.982184d);
        if (jRound > 100 && jRound < 2147483647L) {
            jRound = 100;
        }
        try {
            b(this, jRound);
            synchronized (this.cg) {
                try {
                    ak();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Resources.NotFoundException unused) {
            Log.e("HwAdvancedNumberPicker", "vibrate or playSound not found.");
        } catch (Exception unused2) {
            Log.e("HwAdvancedNumberPicker", "vibrate or playSound error.");
        }
        post(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void al() {
        xdj.b(this, this.cx, this.cn);
    }

    private boolean d(MotionEvent motionEvent) {
        aj();
        if (motionEvent != null) {
            this.bp.addMovement(motionEvent);
        }
        this.bp.computeCurrentVelocity(1000, this.f29234c);
        int yVelocity = (int) this.bp.getYVelocity();
        this.dj = false;
        am();
        if (this.v.isFinished() && this.ey && yVelocity > 0) {
            d(0);
            o(0);
            return true;
        }
        if (this.v.isFinished()) {
            d(motionEvent, yVelocity);
        }
        n(100);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int[] iArr) {
        int i2 = this.f29233b - this.e;
        boolean z = this.az;
        boolean z2 = z && !this.be;
        if (((i2 <= (-this.ce) || i2 == 0) && !z2) || !this.ed) {
            while (this.f29233b - this.e < (-this.ce)) {
                b(m(iArr));
                this.be = false;
            }
        } else {
            if (!z) {
                iArr = m(iArr);
            }
            d(iArr);
        }
    }

    private void f(int[] iArr) {
        while (this.f29233b - this.e < (-this.ce)) {
            int[] iArrM = m(iArr);
            int i2 = this.cw;
            if (i2 >= 0 && i2 < iArrM.length) {
                if (!this.ed) {
                    k(iArrM[i2]);
                    i(iArrM[this.cw]);
                }
                if (!this.bo && iArrM[this.cw] >= this.dw) {
                    this.f29233b = this.e;
                }
            }
        }
    }

    private void g(int[] iArr) {
        if (this.ev) {
            ScheduledFuture<?> scheduledFuture = this.eu;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            j(iArr);
            f(iArr);
            this.eb = false;
            return;
        }
        if (!this.ed) {
            j(iArr);
            f(iArr);
            return;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.es;
        if (scheduledThreadPoolExecutor != null && scheduledThreadPoolExecutor.isShutdown()) {
            ah();
        }
        if (this.eb) {
            return;
        }
        this.eb = true;
        this.ez.sendEmptyMessage(104);
    }

    private int[] i(int[] iArr) {
        int i2 = this.f29233b;
        this.f29233b = i2 - ((i2 - this.e >= this.o && xdj.c(this.ao, this.ax) && this.ci) ? this.o : this.ce * 2);
        System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        int i3 = iArr[1] - 1;
        if (this.bo && i3 < this.dr) {
            i3 = this.dw;
        }
        iArr[0] = i3;
        b(i3);
        return iArr;
    }

    private void j(int[] iArr) {
        while (this.f29233b - this.e > this.ce) {
            int[] iArrI = i(iArr);
            int i2 = this.cw;
            if (i2 >= 0 && i2 < iArrI.length) {
                if (!this.ed) {
                    k(iArrI[i2]);
                    i(iArrI[this.cw]);
                }
                if (!this.bo && iArrI[this.cw] <= this.dr) {
                    this.f29233b = this.e;
                }
            }
        }
    }

    protected void b(HwAdvancedNumberPicker hwAdvancedNumberPicker, long j2) {
        Log.i("HwAdvancedNumberPicker", "Vibration interval time is : " + (Calendar.getInstance().getTimeInMillis() - this.an));
        this.an = Calendar.getInstance().getTimeInMillis();
        xdj.b(hwAdvancedNumberPicker, this.ep, j2);
    }

    public void setOnScrollListener(HwPickerScrollListener hwPickerScrollListener) {
        this.dt = hwPickerScrollListener;
    }

    public HwAdvancedNumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(a(context, i2), attributeSet, i2);
        this.e = Integer.MIN_VALUE;
        this.cg = new Object();
        this.cj = 0L;
        this.cl = 0L;
        this.ej = 0;
        this.en = 15;
        this.ek = 11;
        this.ag = 300L;
        this.am = new SparseArray<>();
        this.bw = false;
        this.cu = 0;
        this.cz = false;
        this.dd = false;
        this.df = false;
        this.dj = false;
        this.dh = false;
        this.ef = 0.6f;
        this.ey = false;
        this.ez = new HwCommonHandler(this);
        this.al = false;
        this.ak = "";
        this.ap = "";
        this.at = "";
        this.au = "";
        this.ay = 3;
        this.bi = 1.0d;
        this.bl = false;
        this.bt = false;
        this.bu = new e(this, true, null);
        this.bs = false;
        this.ci = false;
        this.ck = 0;
        this.dc = true;
        this.dp = new HashMap<>();
        this.z = -1L;
        this.as = false;
        this.aw = false;
        this.av = true;
        this.az = false;
        this.bh = true;
        this.be = false;
        this.f29232a = getContext();
        pa.e().a(context);
        this.ed = pa.e().a() && Settings.Secure.getInt(this.f29232a.getContentResolver(), "accessibility_screenreader_enabled", 0) == 0;
        this.ep = xdj.c(context);
        this.dk = -1;
        this.dm = 96;
        this.dn = -1;
        this.s = false;
        this.bd = new AnimatorSet();
        this.ao = new xea();
        this.ax = new xea();
        b(this.f29232a, attributeSet, i2);
        post(new Runnable() { // from class: xdn
            @Override // java.lang.Runnable
            public final void run() {
                this.d.ag();
            }
        });
    }

    private void e(Context context, AttributeSet attributeSet, int i2) {
        this.cx = (AccessibilityManager) this.f29232a.getSystemService("accessibility");
        aa();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        int dimension = (int) this.f29232a.getResources().getDimension(R.dimen.hwadvancednumberpicker_select_divider);
        int dimension2 = (int) getResources().getDimension(R.dimen.hwadvancednumberpicker_selection_divider_distance);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwAdvancedNumberPicker, i2, 0);
        try {
            try {
                this.bv = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAdvancedNumberPicker_hwSolidColor, 0);
                this.ds = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwAdvancedNumberPicker_hwNumberPickerSelectionDivider);
                this.du = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwAdvancedNumberPicker_hwNumberPickerSelectionDividerHeight, (iApplyDimension - dimension) - 1);
                this.dl = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwAdvancedNumberPicker_hwNumberPickerSelectionDividerDistance, dimension2);
                this.bz = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAdvancedNumberPicker_hwMasterTextColor, -16744961);
                this.cd = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAdvancedNumberPicker_hwSlaverTextColor, -452984832);
                this.ei = typedArrayObtainStyledAttributes.getInt(R.styleable.HwAdvancedNumberPicker_hwSensitivityMode, 1);
                this.cc = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwAdvancedNumberPicker_android_enabled, true);
                this.ch = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwAdvancedNumberPicker_hwStateDrawable, 0);
                this.cm = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwAdvancedNumberPicker_hwDisabledAlpha, 0.0f);
            } catch (Resources.NotFoundException unused) {
                Log.w("HwAdvancedNumberPicker", "TypedArray get resource error");
            }
            typedArrayObtainStyledAttributes.recycle();
            HwGenericEventDetector hwGenericEventDetectorD = d();
            this.bj = hwGenericEventDetectorD;
            if (hwGenericEventDetectorD != null) {
                hwGenericEventDetectorD.c(this, c());
                float fE = xdj.e(this.ei);
                this.ef = fE;
                this.bj.d(fE);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void v(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        OnColorChangeListener onColorChangeListener = this.ew;
        if (onColorChangeListener != null) {
            onColorChangeListener.onColorChange(hwAdvancedNumberPicker);
        }
    }

    class c extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29237a;
        private String e;

        private c() {
            this.f29237a = "";
            this.e = "";
        }

        private void b() {
            String str = this.e;
            if (str == null || str.equals(HwAdvancedNumberPicker.this.ap)) {
                HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
                hwAdvancedNumberPicker.at = hwAdvancedNumberPicker.au;
                return;
            }
            HwAdvancedNumberPicker.this.at = HwAdvancedNumberPicker.this.ap + HwAdvancedNumberPicker.this.au;
        }

        private void c() {
            if (!HwAdvancedNumberPicker.this.bs) {
                HwAdvancedNumberPicker.this.at = HwAdvancedNumberPicker.this.ap + HwAdvancedNumberPicker.this.au;
                this.e = HwAdvancedNumberPicker.this.ap + "";
                return;
            }
            if (HwAdvancedNumberPicker.this.cu == 0) {
                HwAdvancedNumberPicker.this.at = HwAdvancedNumberPicker.this.ap + HwAdvancedNumberPicker.this.au;
            } else if (HwAdvancedNumberPicker.this.cu == 1) {
                HwAdvancedNumberPicker hwAdvancedNumberPicker = HwAdvancedNumberPicker.this;
                hwAdvancedNumberPicker.at = hwAdvancedNumberPicker.ap;
            } else if (HwAdvancedNumberPicker.this.cu == 2) {
                d();
            }
            this.e = HwAdvancedNumberPicker.this.ap + "";
        }

        private void d() {
            if (!HwAdvancedNumberPicker.this.ao.i()) {
                HwAdvancedNumberPicker.this.at = HwAdvancedNumberPicker.this.ap + "";
                return;
            }
            if (HwAdvancedNumberPicker.this.ax.i()) {
                b();
                return;
            }
            HwAdvancedNumberPicker.this.at = HwAdvancedNumberPicker.this.ap + HwAdvancedNumberPicker.this.au;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (view == null || accessibilityEvent == null) {
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            xdj.c(accessibilityEvent, HwAdvancedNumberPicker.this.v, HwAdvancedNumberPicker.this.at);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (view == null || accessibilityEvent == null) {
                return;
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setContentDescription(null);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            c();
            if (HwAdvancedNumberPicker.this.at == null || HwAdvancedNumberPicker.this.at.equals(this.f29237a)) {
                return;
            }
            this.f29237a = HwAdvancedNumberPicker.this.at;
            super.sendAccessibilityEvent(view, i);
        }

        /* synthetic */ c(HwAdvancedNumberPicker hwAdvancedNumberPicker, f fVar) {
            this();
        }
    }

    private void h(int[] iArr) {
        if (this.eh) {
            if (this.ed) {
                Log.i("HwAdvancedNumberPicker", "The timeSpan when scroll : " + SystemClock.uptimeMillis());
                j(iArr[this.cw]);
                return;
            }
            d(iArr[this.cw], Math.abs(this.bw ? this.bf : this.bc));
        }
    }

    private int[] m(int[] iArr) {
        int i2 = this.f29233b;
        this.f29233b = i2 + ((i2 - this.e <= (-this.o) && xdj.c(this.ao, this.ax) && this.ci) ? this.o : this.ce * 2);
        System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        int i3 = iArr[iArr.length - 2] + 1;
        if (this.bo && i3 > this.dw) {
            i3 = this.dr;
        }
        iArr[iArr.length - 1] = i3;
        b(i3);
        return iArr;
    }

    private void b(Context context, AttributeSet attributeSet, int i2) {
        this.cb = this.f29232a.getString(R.string.hwadvancednumberpicker_increment_scroll_action);
        this.k = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_selector_text_gap_height);
        this.o = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_selector_element_height);
        this.ce = (int) (((double) this.k) * 1.44d);
        this.dx = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_divider_rect_height);
        this.dz = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_selected_view_align_horizontal);
        this.ad = getResources().getInteger(R.integer.emui_device_type) == 2;
        this.ae = getResources().getInteger(R.integer.emui_device_type) == 8;
        boolean z = getResources().getInteger(R.integer.emui_device_type) == 4;
        this.ai = z;
        int i3 = z ? 5 : 7;
        this.ej = i3;
        this.cw = i3 / 2;
        this.et = new int[i3];
        e(super.getContext(), attributeSet, i2);
        y();
        this.cn = true;
        setWillNotDraw(false);
        setSelectorWheelState(0);
        this.er = getResources().getDimension(R.dimen.hwadvancednumberpicker_adjust_height);
        this.g = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_emui_primary_title_1_min);
        this.f = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_emui_primary_subtitle_min);
        this.y = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_text_step);
        ad();
        this.v = new Scroller(this.f29232a, new HwCubicBezierInterpolator(0.2f, 0.0f, 0.2f, 1.0f));
        ah();
        ae();
        f fVar = null;
        this.cq = new i(this, fVar);
        setAccessibilityDelegate(new c(this, fVar));
        xdj.c(context, this, this.dh);
    }

    private void l(int i2) {
        if (this.ed && this.w) {
            m(i2);
            f(i2);
        }
    }

    public void i() {
        if (this.v.isFinished()) {
            return;
        }
        this.v.computeScrollOffset();
        a(this.v.getCurrY(), this.v);
    }

    private void m(int i2) {
        if (this.bw) {
            return;
        }
        j(i2);
    }

    private void ac() {
        if (this.t == null && this.cx != null) {
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: xdg
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z) {
                    this.f52729b.a(z);
                }
            };
            this.t = accessibilityStateChangeListener;
            this.cx.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
    }

    protected void e(int i2, int i3, boolean z) {
        ThreadPoolExecutor threadPoolExecutor;
        e(i2);
        if (!z || (threadPoolExecutor = this.bn) == null) {
            return;
        }
        j jVar = this.co;
        if (jVar != null) {
            threadPoolExecutor.remove(jVar);
        }
        j jVar2 = new j(this, i3, this, null);
        this.co = jVar2;
        this.bn.execute(jVar2);
    }

    public void f() {
        int iE;
        if (this.s && this.dn != (iE = xdj.e(this.aj, this.u, this.dw) + this.de.getPaddingLeft() + this.de.getPaddingRight())) {
            int i2 = this.dm;
            if (iE <= i2) {
                iE = i2;
            }
            this.dn = iE;
            invalidate();
        }
    }

    private void z() {
        this.bd.cancel();
        this.de.setVisibility(4);
    }

    private void g(int i2) {
        for (int i3 = 0; i3 < this.et.length; i3++) {
            int iH = h((i2 + i3) - this.cw);
            this.et[i3] = iH;
            b(iH);
        }
    }

    private void b(int[] iArr) {
        int i2 = this.cw;
        if (i2 >= 0 && i2 < iArr.length) {
            h(iArr);
            if (!this.bo && iArr[this.cw] >= this.dw) {
                this.f29233b = this.e;
            }
        }
        this.eh = false;
    }

    private void n(int i2) {
        e(i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int[] iArr) {
        int i2 = this.f29233b - this.e;
        boolean z = this.az;
        boolean z2 = z && this.be;
        if (((i2 < this.ce && i2 != 0) || z2) && this.ed) {
            if (!z) {
                iArr = i(iArr);
            }
            d(iArr);
        } else {
            while (this.f29233b - this.e > this.ce) {
                c(i(iArr));
                this.be = true;
            }
        }
    }

    private void k(int i2) {
        if (this.bw) {
            return;
        }
        d(i2, Math.abs(this.bc));
    }

    private int h(int i2) {
        return this.bo ? xdj.d(i2, this.dw, this.dr) : i2;
    }

    private void u() {
        String strA;
        String[] strArr = this.u;
        if (strArr == null) {
            String strD = xdj.d(this.dy, this.aa);
            if (!this.ex || TextUtils.isEmpty(strD) || strD.endsWith(this.fa) || "-- --".equals(strD)) {
                strA = null;
            } else {
                strA = strD + this.fa;
            }
        } else {
            strA = xdj.a(strArr, this.aj);
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        xdj.d dVar = new xdj.d();
        dVar.e = strA;
        dVar.f52736c = (int) this.cf;
        dVar.d = this.g;
        dVar.f52735b = this.y;
        this.i = xdj.d(this, this.aj, dVar, this.dz) - this.y;
        ab();
    }

    private void x() {
        ThreadPoolExecutor threadPoolExecutor = this.bq;
        if (threadPoolExecutor != null) {
            i iVar = this.cq;
            if (iVar != null) {
                threadPoolExecutor.remove(iVar);
            }
            long timeInMillis = Calendar.getInstance().getTimeInMillis() - this.an;
            if (timeInMillis < 40) {
                long j2 = 40 - timeInMillis;
                this.ah = Calendar.getInstance().getTimeInMillis() + j2;
                b(j2);
            } else {
                this.ah = Calendar.getInstance().getTimeInMillis();
                this.bq.execute(this.cq);
            }
        }
    }

    public void e() {
        xea xeaVar = this.ao;
        if (xeaVar.i()) {
            this.bi = 1.0d;
            xeaVar = this.ax;
            if (xeaVar.i()) {
                return;
            }
        }
        xeaVar.b();
        this.bf = (int) xeaVar.d();
        int iA = xeaVar.a();
        if (this.bb == 0) {
            this.bb = xeaVar.g();
        }
        c((int) (((double) iA) * this.bi), xeaVar);
    }

    private void o(int i2) {
        if (this.cu == i2) {
            return;
        }
        this.cu = i2;
        OnScrollListener onScrollListener = this.ac;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChange(this, i2);
        }
    }

    private void c(Canvas canvas) {
        float fA = xdj.a(this, this.ct);
        float f2 = this.f29233b;
        this.dp.clear();
        float f3 = f2;
        int i2 = 0;
        while (true) {
            int[] iArr = this.et;
            if (i2 < iArr.length) {
                String str = this.am.get(iArr[i2]);
                if (str != null) {
                    String strD = xdj.d(this.aa, str, str.startsWith("0"), this.ex, this.fa);
                    float fD = d(i2, f3, this.f29233b);
                    a(i2, fD);
                    String strB = xdj.b(this, strD, this.ar, this.ad || this.ae);
                    if (i2 == this.cw) {
                        strB = d(canvas, fA, i2, strB, fD);
                        if (strB.equals("")) {
                            return;
                        }
                    } else {
                        float fE = e(i2, fD);
                        if (Float.compare(fE, 0.0f) == 0) {
                            return;
                        }
                        canvas.save();
                        Bitmap bitmapA = xdj.a(xdj.d, strB, this.ar);
                        canvas.scale(fE, fE, fA, fD);
                        canvas.drawBitmap(bitmapA, xdj.c(bitmapA, this.ct, fA, this.dz), fD - (bitmapA.getHeight() / 2.0f), this.ar);
                        canvas.restore();
                        xdj.b(i2, strB, this.ca, this.by, this.cw);
                    }
                    f3 += this.o;
                    this.dp.put(Integer.valueOf(i2), strB);
                }
                i2++;
            } else {
                xdj.a(this.dp, this.by, this.ca);
                return;
            }
        }
    }

    private boolean a(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        if (this.ey && y - this.bg > 0.0f) {
            return false;
        }
        if (!this.v.isFinished()) {
            return true;
        }
        v();
        a(y);
        return true;
    }

    private void i(int i2) {
        if (this.bw) {
            d(i2, Math.abs(this.bf));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(float f2, float f3, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int axisValue = (int) motionEvent.getAxisValue(9);
        if (!xdj.c(this.ao, this.ax)) {
            scrollBy(0, this.ce * 2 * axisValue);
        } else {
            scrollBy(0, this.o * axisValue);
        }
        invalidate();
        return true;
    }

    private void c(int[] iArr) {
        int i2 = this.cw;
        if (i2 >= 0 && i2 < iArr.length) {
            h(iArr);
            if (!this.bo && iArr[this.cw] <= this.dr) {
                this.f29233b = this.e;
            }
        }
        this.eh = false;
    }

    private static Context a(Context context, int i2) {
        return xfs.c(context, i2, R.style.Theme_Emui_HwAdvancedNumberPicker);
    }

    private void a(boolean z, AccessibilityManager accessibilityManager) {
        if (accessibilityManager == null) {
            return;
        }
        this.cz = accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        if (z) {
            this.dd = isFocusable();
            this.df = isFocusableInTouchMode();
            setFocusableInTouchMode(false);
            setFocusable(false);
            return;
        }
        setFocusableInTouchMode(this.df);
        setFocusable(this.dd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        aj();
        this.bp.computeCurrentVelocity(1000, this.f29234c);
        this.bc = (int) this.bp.getYVelocity();
        this.bw = false;
        s();
    }

    private float c(int i2, float f2) {
        if (Float.compare(this.i, this.m) <= 0) {
            return 1.0f;
        }
        float fAbs = Math.abs(f2 - ((this.cw * this.o) + this.e));
        if (fAbs >= 10.0f && fAbs <= 20.0f && !this.aq) {
            this.aq = true;
            fAbs = 0.0f;
        } else if (fAbs <= 20.0f && this.aq) {
            this.aq = false;
            fAbs = 20.0f;
        } else {
            this.aq = false;
        }
        if (fAbs < 10.0f) {
            boolean z = this.as;
            if (z && this.eg == 0 && this.aw) {
                this.aw = false;
                this.p = false;
            }
            if (z && this.eg == 0) {
                this.eg = 400;
                this.eo = ((double) xde.d(this.f29232a, 400)) * 0.15875d;
            }
            if (this.ev && this.eg != 0 && this.p) {
                this.as = false;
                this.w = true;
                l(this.et[this.cw]);
                this.p = false;
            }
            HwPickerScrollListener hwPickerScrollListener = this.dt;
            if (hwPickerScrollListener != null) {
                hwPickerScrollListener.onItemScrollCenter(this.dv > 0 ? 2 : 1);
            }
        }
        this.w = false;
        float f3 = this.i;
        float f4 = this.m;
        float f5 = this.cw * this.o * f3;
        if (Float.compare(f5, 0.0f) == 0) {
            return 0.0f;
        }
        return 1.0f - (((f3 - f4) * fAbs) / f5);
    }

    private void d(float f2) {
        this.i -= f2;
        this.q -= f2;
        this.r -= f2;
        this.m -= f2;
    }

    private void d(Context context) {
        this.de = (TextView) findViewById(R.id.hwadvancednumberpicker_input);
        this.ee = ViewConfiguration.getTapTimeout();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ee = viewConfiguration.getScaledTouchSlop();
        c(viewConfiguration);
        float f2 = this.f29234c;
        this.cp = 0.1f * f2;
        this.cv = 0.25f * f2;
        this.cs = 0.55f * f2;
        this.cy = f2 * 0.8f;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        if (view != null && isEnabled()) {
            if (xdj.c(this, view, this.dp, this.cw)) {
                if (xdj.e(this.f29232a)) {
                    n(100);
                    return;
                } else {
                    e(100, 1);
                    return;
                }
            }
            return;
        }
        Log.w("HwAdvancedNumberPicker", "null view.");
    }

    private void a(int i2, float f2) {
        if (this.di) {
            float fAbs = Math.abs(f2 - ((this.cw * this.o) + this.e));
            if (this.dc && i2 == 1) {
                this.db = fAbs;
                this.dc = false;
            }
            float f3 = this.db;
            if (f3 == 0.0f) {
                return;
            }
            int iIntValue = ((Integer) new ArgbEvaluator().evaluate(Math.min(fAbs / f3, 1.0f), Integer.valueOf(this.bz), Integer.valueOf(this.cd))).intValue();
            if (i2 == this.cw) {
                this.aj.setColor(iIntValue);
            } else {
                this.ar.setColor(iIntValue);
            }
        }
    }

    private boolean c(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        this.bg = y;
        this.bm = y;
        xdj.d(this, this.ba);
        this.bd.cancel();
        this.bk = false;
        this.br = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (this.ea == 2) {
            this.bk = xdj.c(this.ao, this.ax);
            this.br = true;
            z();
            return this.ae;
        }
        this.br = false;
        setSelectorWheelState(2);
        z();
        return this.ae;
    }

    private void d(Canvas canvas) {
        Drawable drawable = this.ds;
        if (drawable == null) {
            return;
        }
        int i2 = this.el;
        drawable.setBounds(0, i2, getWidth(), this.dx + i2);
        this.ds.draw(canvas);
    }

    private void f(int i2) {
        if (this.bw) {
            j(i2);
        }
    }

    private void e(float f2) {
        this.q = f2;
        float f3 = (f2 * 2.0f) - this.i;
        this.r = f3;
        this.m = f3;
        xdj.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, int i3) {
        a aVar = this.dq;
        if (aVar == null) {
            this.dq = new a(i3);
        } else {
            removeCallbacks(aVar);
        }
        postDelayed(this.dq, i2);
    }

    private void j(int i2) {
        a(i2);
    }

    private void c(float f2) {
        this.i = f2;
        this.cf = f2;
        this.aj.setTextSize(f2);
        this.ar.setTextSize(f2);
        float f3 = (this.q * 2.0f) - this.i;
        this.r = f3;
        this.m = f3;
        xdj.a(this);
    }

    private void c(int i2, int i3) {
        OnValueChangeListener onValueChangeListener = this.x;
        if (onValueChangeListener != null) {
            onValueChangeListener.onValueChange(this, i2, this.dy);
        }
    }

    private void v() {
        if (this.bt) {
            e eVar = this.bu;
            if (eVar != null) {
                removeCallbacks(eVar);
                this.bu.e(true);
                postDelayed(this.bu, 100L);
            }
            this.bt = false;
        }
    }

    private void d(MotionEvent motionEvent, int i2) {
        xdj.d(this.ao, this.ax);
        if (Math.abs(i2) > this.j) {
            c(i2);
            o(2);
        } else if (this.br && xdj.c(this.ao, this.ax)) {
            xdj.a(this.f29232a, this, motionEvent);
            o(0);
        } else {
            d(xcz.f52722a);
        }
    }

    private void d(int[] iArr) {
        int i2 = this.cw;
        if (i2 >= 0 && i2 < iArr.length) {
            h(iArr);
        }
        this.eh = false;
    }

    private void a(int i2, Scroller scroller) {
        scrollBy(0, i2 - this.bb);
        this.bb = i2;
        if (scroller.isFinished()) {
            postDelayed(new Runnable() { // from class: xdl
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.al();
                }
            }, 100L);
        } else {
            invalidate();
        }
    }

    private void c(int i2, xea xeaVar) {
        scrollBy(0, i2 - this.bb);
        this.bb = i2;
        if (xeaVar.i()) {
            q();
        } else {
            invalidate();
        }
    }

    private String d(Canvas canvas, float f2, int i2, String str, float f3) {
        if (canvas == null || TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.al) {
            str = str + this.ak;
        }
        if (!Objects.equals(this.fc, str)) {
            this.fc = str;
            this.p = true;
        }
        float fC = c(i2, f3);
        if (Float.compare(fC, 0.0f) == 0) {
            return "";
        }
        canvas.save();
        Bitmap bitmapA = xdj.a(xdj.e, str, this.aj);
        canvas.scale(fC, fC, f2, f3);
        canvas.drawBitmap(bitmapA, xdj.c(bitmapA, this.ct, f2, this.dz), f3 - (bitmapA.getHeight() / 2.0f), this.aj);
        canvas.restore();
        if (!this.ad) {
            this.bx.setContentDescription(str);
        }
        this.ap = str;
        return str;
    }

    private float e(int i2, float f2) {
        if (Float.compare(this.i, this.m) <= 0) {
            return 1.0f;
        }
        float f3 = this.i;
        float f4 = this.m;
        float fAbs = Math.abs(f2 - ((this.cw * this.o) + this.e));
        HwPickerScrollListener hwPickerScrollListener = this.dt;
        if (hwPickerScrollListener != null && fAbs < 10.0f) {
            hwPickerScrollListener.onItemScrollCenter(this.dv > 0 ? 2 : 1);
        }
        float f5 = this.cw * this.o * this.i;
        if (Float.compare(f5, 0.0f) == 0) {
            return 0.0f;
        }
        return 1.0f - (((f3 - f4) * fAbs) / f5);
    }

    private void a(Canvas canvas) {
        if (this.ds == null) {
            return;
        }
        this.en = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_select_top_offset);
        int iA = xdj.a(this.f29232a, R.dimen.hwadvancednumberpicker_select_bottom_offset);
        this.ek = iA;
        int i2 = this.em;
        int i3 = this.en;
        int i4 = ((i2 - i3) - iA) + (i3 - iA);
        this.ds.setBounds(0, i4, getRight() + 50, this.du + i4);
        this.ds.draw(canvas);
        int i5 = this.ec;
        int i6 = this.ek;
        int i7 = (i5 + (i6 * 2)) - (this.en - i6);
        this.ds.setBounds(0, i7 - this.du, getRight() + 50, i7);
        this.ds.draw(canvas);
    }

    private void b(long j2) {
        this.ez.postDelayed(new g(), j2);
    }

    private void d(int i2, int i3) {
        float f2 = i3;
        float f3 = this.cp;
        if (f2 < f3) {
            e(i2, 2, true);
            return;
        }
        if (f2 >= f3 && f2 < this.cv) {
            e(i2, 3, true);
            return;
        }
        if (f2 >= this.cv && f2 < this.cs) {
            e(i2, 4, true);
            return;
        }
        if (f2 >= this.cs && f2 < this.cy) {
            e(i2, 5, true);
        } else if (f2 >= this.cy) {
            e(i2, 6, true);
        }
    }

    private void b(int i2) {
        String strD;
        int i3 = i2 - this.dr;
        if (this.am.get(i2) != null) {
            return;
        }
        if (i2 >= this.dr && i2 <= this.dw) {
            String[] strArr = this.u;
            if (strArr == null) {
                strD = xdj.d(i2, this.aa);
            } else if (i3 >= 0 && i3 < strArr.length) {
                strD = strArr[i3];
            } else {
                strD = this.am.get(i2);
            }
        } else {
            strD = "";
        }
        this.am.put(i2, strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        a(z, this.cx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(SoundPool soundPool, int i2, int i3) {
        if (i3 == 0) {
            this.d = true;
        }
    }
}
