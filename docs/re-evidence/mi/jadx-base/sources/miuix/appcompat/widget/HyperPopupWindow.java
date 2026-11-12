package miuix.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.alb;
import defpackage.awi;
import defpackage.coc;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.eoc;
import defpackage.foc;
import defpackage.hm1;
import defpackage.hwc;
import defpackage.k4i;
import defpackage.n4i;
import defpackage.nem;
import defpackage.o4i;
import defpackage.ooc;
import defpackage.vsi;
import defpackage.z1j;
import defpackage.zhi;
import defpackage.znc;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.widget.HyperPopupWindow;
import miuix.smooth.SmoothContainerDrawable2;
import miuix.smooth.SmoothFrameLayout2;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class HyperPopupWindow extends k4i {
    public hwc H;
    public hwc I;
    public d J;
    public d K;
    public Rect L;
    public ViewGroup M;
    public ClipLayout N;
    public final float O;
    public c P;
    public View Q;

    public class ClipLayout extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RectF f26570b;
        public Path c;
        public float d;
        public OnBackInvokedDispatcher e;
        public OnBackInvokedCallback f;
        public boolean g;

        public ClipLayout(Context context) {
            super(context);
            this.f26569a = false;
            this.f26570b = new RectF();
            this.c = new Path();
            this.g = false;
        }

        public void c() {
            this.c.reset();
            Path path = this.c;
            RectF rectF = this.f26570b;
            float f = this.d;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.f26569a = true;
        }

        public void d(int i, int i2, int i3, int i4) {
            this.f26570b.set(i, i2, i3, i4);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            if (this.f26569a) {
                canvas.clipPath(this.c);
            }
            super.draw(canvas);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (Build.VERSION.SDK_INT >= 33) {
                this.e = findOnBackInvokedDispatcher();
                final HyperPopupWindow hyperPopupWindow = HyperPopupWindow.this;
                OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: loc
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        HyperPopupWindow.z0(hyperPopupWindow);
                    }
                };
                this.f = onBackInvokedCallback;
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            super.onDetachedFromWindow();
            if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.e) == null) {
                return;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            return this.g;
        }

        public void setRadius(float f) {
            this.d = f;
        }
    }

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        public final /* synthetic */ void c(ListAdapter listAdapter, AdapterView adapterView, View view, int i, long j) {
            foc focVarJ0;
            if (view.getId() == vsi.k0) {
                HyperPopupWindow.this.B0();
                return;
            }
            if ((listAdapter instanceof ooc) && (focVarJ0 = HyperPopupWindow.this.J0(listAdapter, i)) != null && !focVarJ0.f) {
                ((ooc) listAdapter).i((int) j);
            }
            if (HyperPopupWindow.this.P != null) {
                HyperPopupWindow.this.P.onMenuItemClick((MenuItem) listAdapter.getItem(i));
            }
            HyperPopupWindow.this.dismiss();
        }

        public final /* synthetic */ void d(View view) {
            HyperPopupWindow.this.B0();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final BaseAdapter baseAdapterR;
            if (HyperPopupWindow.this.J.f26577b instanceof coc) {
                baseAdapterR = ((coc) HyperPopupWindow.this.J.f26577b).r(j);
                HyperPopupWindow hyperPopupWindow = HyperPopupWindow.this;
                foc focVarJ0 = hyperPopupWindow.J0((coc) hyperPopupWindow.J.f26577b, i);
                if (focVarJ0 != null && !focVarJ0.c) {
                    ((coc) HyperPopupWindow.this.J.f26577b).v((int) j, i);
                }
                if (focVarJ0 != null && focVarJ0.b() != null && (!focVarJ0.c)) {
                    HyperPopupWindow.this.dismiss();
                }
            } else {
                baseAdapterR = null;
            }
            if (HyperPopupWindow.this.K == null) {
                if (baseAdapterR != null) {
                    HyperPopupWindow.this.I = new e();
                    HyperPopupWindow.this.G0(view, baseAdapterR);
                    HyperPopupWindow.this.K.setItemClickListener(new AdapterView.OnItemClickListener() { // from class: ioc
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView2, View view2, int i2, long j2) {
                            this.f21943a.c(baseAdapterR, adapterView2, view2, i2, j2);
                        }
                    });
                } else if (HyperPopupWindow.this.P != null) {
                    HyperPopupWindow.this.P.onMenuItemClick((MenuItem) HyperPopupWindow.this.J.f26577b.getItem(i));
                }
                HyperPopupWindow.this.M.findViewById(vsi.L).setOnClickListener(new View.OnClickListener() { // from class: joc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f22975a.d(view2);
                    }
                });
            }
        }
    }

    public class b extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f26572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f26573b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f26574k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f26575r;
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;
        public final /* synthetic */ int v;
        public final /* synthetic */ ViewGroup w;
        public final /* synthetic */ f x;
        public final /* synthetic */ SmoothFrameLayout2 y;

        public b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, ViewGroup viewGroup, f fVar, SmoothFrameLayout2 smoothFrameLayout2) {
            this.f26572a = i;
            this.f26573b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.f26574k = i11;
            this.l = i12;
            this.m = i13;
            this.n = i14;
            this.o = i15;
            this.p = i16;
            this.q = i17;
            this.f26575r = i18;
            this.s = i19;
            this.t = i20;
            this.u = i21;
            this.v = i22;
            this.w = viewGroup;
            this.x = fVar;
            this.y = smoothFrameLayout2;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            HyperPopupWindow.this.M.removeView(this.y);
            HyperPopupWindow.this.M.removeView(HyperPopupWindow.this.N);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            HyperPopupWindow.this.M.removeView(this.y);
            HyperPopupWindow.this.M.removeView(HyperPopupWindow.this.N);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, "fraction");
            if (updateInfoFindByName == null) {
                return;
            }
            float floatValue = updateInfoFindByName.getFloatValue();
            int i = this.f26572a;
            int i2 = (int) (i + ((this.f26573b - i) * floatValue));
            int i3 = this.c;
            int i4 = (int) (i3 + ((this.d - i3) * floatValue));
            int i5 = this.e;
            int i6 = (int) (i5 + ((this.f - i5) * floatValue));
            int i7 = this.g;
            HyperPopupWindow.this.N.d(i2, i4, i6, (int) (i7 + ((this.h - i7) * floatValue)));
            HyperPopupWindow.this.N.c();
            int i8 = this.i;
            int i9 = (int) (i8 + ((this.j - i8) * floatValue));
            int i10 = this.f26574k;
            int i11 = (int) (i10 + ((this.l - i10) * floatValue));
            int i12 = this.m;
            int i13 = (int) (i12 + ((this.n - i12) * floatValue));
            int i14 = this.o;
            int i15 = (int) (i14 + ((this.p - i14) * floatValue));
            int i16 = this.u;
            int i17 = (int) (i16 + ((this.v - i16) * floatValue));
            this.w.getLayoutParams().height = i17;
            this.x.l(i9, i11, i13, i15, i17);
        }
    }

    public interface c {
        void onMenuItemClick(MenuItem menuItem);
    }

    public static class e extends o4i {
        @Override // defpackage.o4i, defpackage.hwc
        public int a(n4i n4iVar) {
            Rect rect = n4iVar.q;
            Rect rect2 = n4iVar.p;
            int i = n4iVar.g;
            int i2 = rect.left;
            int i3 = i2 + i;
            int i4 = rect2.right;
            if (i3 > i4) {
                i2 = i4 - i;
                i3 = i4;
            }
            int i5 = rect2.left;
            if (i2 < i5) {
                i2 = i5;
            }
            n4iVar.g = i3 - i2;
            return i2;
        }

        @Override // defpackage.o4i, defpackage.hwc
        public int d(n4i n4iVar) {
            Rect rect = n4iVar.q;
            Rect rect2 = n4iVar.p;
            int i = n4iVar.h;
            int i2 = rect.top;
            int i3 = i2 + i;
            int i4 = rect2.bottom;
            if (i3 < i4) {
                return i2;
            }
            int i5 = i4 - i;
            int i6 = rect2.top;
            if (i5 >= i6) {
                return i5;
            }
            n4iVar.h = i4 - i6;
            return i6;
        }
    }

    public static class f {
        public static final AnimConfig j = new AnimConfig();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final AnimConfig f26591k = new AnimConfig().setEase(-2, 0.95f, 0.2f);
        public WeakReference<View> c;
        public WeakReference<View> d;
        public int e = -1;
        public float f = 0.0f;
        public float g = 0.0f;
        public AnimConfig h = new AnimConfig().setEase(-2, 0.95f, 0.2f);
        public AnimConfig i = new AnimConfig().setEase(-2, 0.95f, 0.3f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FloatProperty<f> f26592a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatProperty<f> f26593b = new b();

        public static class a extends FloatProperty<f> {
            public a() {
                super("arrowRotation");
            }

            @Override // miuix.animation.property.FloatProperty
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(f fVar) {
                return fVar.g();
            }

            @Override // miuix.animation.property.FloatProperty
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(f fVar, float f) {
                fVar.i(f);
            }
        }

        public static class b extends FloatProperty<f> {
            public b() {
                super("corner");
            }

            @Override // miuix.animation.property.FloatProperty
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(f fVar) {
                return fVar.h();
            }

            @Override // miuix.animation.property.FloatProperty
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(f fVar, float f) {
                fVar.j(f);
            }
        }

        public f(View view) {
            this.c = new WeakReference<>(view);
        }

        public float g() {
            return this.g;
        }

        public float h() {
            return this.f;
        }

        public void i(float f) {
            this.g = f;
            WeakReference<View> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                if (this.c.get() == null) {
                    return;
                }
                View viewFindViewById = this.c.get().findViewById(vsi.k0).findViewById(vsi.u);
                this.d = new WeakReference<>(viewFindViewById);
                viewFindViewById.setPivotX(viewFindViewById.getWidth() / 2.0f);
                viewFindViewById.setPivotY(viewFindViewById.getHeight() / 2.0f);
            }
            this.d.get().setRotation(f);
        }

        public void j(float f) {
            this.f = f;
            View view = this.c.get();
            Drawable background = view.getBackground();
            if (view instanceof SmoothFrameLayout2) {
                ((SmoothFrameLayout2) view).setCornerRadius(this.f);
            }
            if (background instanceof SmoothContainerDrawable2) {
                ((SmoothContainerDrawable2) background).j(this.f);
            }
        }

        public void k(int i) {
            this.e = i;
        }

        public void l(int i, int i2, int i3, int i4, int i5) {
            View view = this.c.get();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            int i6 = i3 - i;
            layoutParams.width = i6;
            layoutParams.height = i4 - i2;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.list);
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                AbsListView.LayoutParams layoutParams2 = (AbsListView.LayoutParams) viewGroup.getChildAt(i7).getLayoutParams();
                if (childAt.getId() != vsi.k0) {
                    layoutParams2.width = this.e;
                } else {
                    layoutParams2.width = i6;
                    layoutParams2.height = i5;
                }
            }
            view.requestLayout();
        }
    }

    public HyperPopupWindow(Context context, View view) {
        super(context, view);
        V(true);
        Y(false);
        o4i o4iVar = new o4i();
        this.H = o4iVar;
        this.J = new d(this.o, o4iVar);
        this.O = this.o.getResources().getDimension(dmi.b0);
    }

    public static int[][] H0(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, count, 2);
        View view = null;
        for (int i3 = 0; i3 < count; i3++) {
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (i2 != -1) {
                measuredWidth = Math.max(measuredWidth, i2);
            }
            int[] iArr2 = iArr[i3];
            iArr2[0] = measuredWidth;
            iArr2[1] = view.getMeasuredHeight();
        }
        return iArr;
    }

    public static Rect K0(Rect rect, Rect rect2) {
        Rect rect3 = new Rect();
        rect3.left = Math.min(rect.left, rect2.left);
        rect3.top = Math.min(rect.top, rect2.top);
        rect3.right = Math.max(rect.right, rect2.right);
        rect3.bottom = Math.max(rect.bottom, rect2.bottom);
        return rect3;
    }

    public static /* synthetic */ void z0(HyperPopupWindow hyperPopupWindow) {
        hyperPopupWindow.B0();
    }

    public final void A0(String str) {
        if (this.J.f26576a != null) {
            this.J.f26576a.announceForAccessibility(str);
        }
    }

    public final void B0() {
        d dVar = this.K;
        if (dVar == null) {
            return;
        }
        dVar.f26576a.findViewById(vsi.L).setVisibility(0);
        P0();
        D0();
        this.K = null;
        F0(this.J.f26576a);
        A0(this.o.getResources().getString(z1j.d));
    }

    public final void C0(View view) {
        if (view != null) {
            view.setImportantForAccessibility(4);
        }
    }

    public void D0() {
        n4i n4iVar = this.K.e;
        SmoothFrameLayout2 smoothFrameLayout2 = this.K.f26576a;
        f fVar = this.K.i;
        fVar.k(smoothFrameLayout2.getWidth());
        Rect rect = n4iVar.q;
        Rect rect2 = this.J.j;
        Rect rectK0 = K0(rect2, this.K.j);
        int iWidth = rectK0.width();
        int iHeight = rectK0.height();
        int i = rect2.left - rectK0.left;
        int i2 = rect2.top - rectK0.top;
        int iWidth2 = i + rect2.width();
        int iHeight2 = rect2.height() + i2;
        int left = smoothFrameLayout2.getLeft();
        int top = smoothFrameLayout2.getTop();
        int right = smoothFrameLayout2.getRight();
        int bottom = smoothFrameLayout2.getBottom();
        int i3 = rect.left;
        int i4 = rectK0.left;
        int i5 = rect.top;
        int i6 = rectK0.top;
        int i7 = i5 - i6;
        int i8 = rect.right - i4;
        int i9 = rect.bottom - i6;
        ViewGroup viewGroup = (ViewGroup) this.K.f26578k;
        int i10 = this.K.o;
        int i11 = this.K.l;
        int i12 = this.K.p;
        int i13 = this.K.m;
        int i14 = this.K.q;
        int i15 = this.K.n;
        this.K.c.setScrollBarStyle(0);
        this.K.f26579r = true;
        AnimConfig animConfigAddListeners = new AnimConfig().addListeners(new b(0, i, 0, i2, iWidth, iWidth2, iHeight, iHeight2, left, i3 - i4, top, i7, right, i8, bottom, i9, i12, i13, i14, i15, i10, i11, viewGroup, fVar, smoothFrameLayout2));
        animConfigAddListeners.setEase(-2, 0.95f, 0.2f);
        IStateStyle iStateStyleUseValue = Folme.useValue(fVar);
        Float fValueOf = Float.valueOf(0.0f);
        iStateStyleUseValue.setTo("fraction", fValueOf).to("fraction", Float.valueOf(1.0f), animConfigAddListeners);
        smoothFrameLayout2.setCornerRadius(fVar.h());
        Folme.useValue(fVar).to(fVar.f26593b, fValueOf, f.f26591k);
        Folme.useValue(fVar).to(fVar.f26592a, fValueOf, fVar.i);
    }

    public void E0(View view, ListAdapter listAdapter) {
        n4i n4iVarClone = this.d.clone();
        dyq.b(view, n4iVarClone.q);
        Rect rect = n4iVarClone.q;
        int i = rect.left;
        Rect rect2 = this.L;
        rect.left = i + rect2.left;
        int i2 = rect.right;
        int i3 = rect2.left;
        rect.right = i2 + i3;
        rect.top += rect2.top;
        int i4 = rect.bottom;
        int i5 = rect2.top;
        rect.bottom = i4 + i5;
        n4iVarClone.p.set(i3, i5, rect2.right, rect2.bottom);
        d dVar = new d(this.o, listAdapter, this.I, n4iVarClone);
        this.K = dVar;
        dVar.z();
        this.K.D(this.J.f26576a.getWidth());
        this.K.E(view, this.M, this.L, true);
    }

    public final void F0(View view) {
        if (view != null) {
            view.setImportantForAccessibility(1);
        }
        View view2 = this.Q;
        if (view2 != null) {
            view2.post(new Runnable() { // from class: hoc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20290a.L0();
                }
            });
        }
    }

    public final void G0(View view, ListAdapter listAdapter) {
        O0();
        E0(view, listAdapter);
        C0(this.J.f26576a);
        A0(this.o.getResources().getString(z1j.e));
    }

    public final Rect I0() {
        Rect rect = new Rect();
        n4i n4iVarClone = this.d.clone();
        Rect rect2 = n4iVarClone.p;
        int i = rect2.left;
        Rect rect3 = n4iVarClone.f27540r;
        rect.set(i + rect3.left, rect2.top + rect3.top, rect2.right - rect3.right, rect2.bottom - rect3.bottom);
        return rect;
    }

    public final foc J0(Object obj, int i) {
        eoc eocVarA = obj instanceof znc ? ((znc) obj).a(i) : null;
        if (eocVarA instanceof foc) {
            return (foc) eocVarA;
        }
        return null;
    }

    public final /* synthetic */ void L0() {
        this.Q.sendAccessibilityEvent(8);
    }

    public final void M0(n4i n4iVar, int i, int i2, int i3, int i4) {
        Rect rect = this.L;
        int i5 = n4iVar.f27537a;
        int i6 = n4iVar.c + i2;
        int i7 = rect.bottom;
        if (i6 > i7) {
            rect.top = i2 + (i7 - i6);
        } else {
            rect.top = i2;
            rect.bottom = i6;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(n4iVar.i, n4iVar.s) & 7;
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                rect.left = i;
                rect.right = Math.min(i + i5, rect.right);
            } else {
                rect.right = i3 + i;
                rect.left = Math.max(i - i5, rect.left);
            }
        }
    }

    public final void N0(View view, int i, int i2, int i3, Rect rect) {
        int i4;
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        int width = getWidth();
        int height = getHeight();
        if (rect == null) {
            rect = new Rect();
            rect.set(i2, i3, width + i2, height + i3);
        }
        if (rect.top > rect2.centerY()) {
            i4 = 48;
        } else {
            i4 = rect.bottom <= rect2.centerY() ? 80 : 0;
        }
        int i5 = rect.left;
        int i6 = rect2.left;
        if (i5 >= i6 && rect.right > rect2.right) {
            i4 |= 3;
        } else if (rect.right <= rect2.right && i5 < i6) {
            i4 |= 5;
        }
        if (i4 == 0 && rect2.contains(rect)) {
            i4 = 17;
        }
        U(i4);
        if (!isShowing()) {
            HapticCompat.e(this.f23423a, alb.A, alb.n);
        }
        super.showAtLocation(view, i, i2, i3);
        S(this.f23424b, this.p + this.q);
        this.f23423a.setElevation(0.0f);
        x(this.f23423a.getRootView());
        nem.e(this.o, this);
    }

    public final void O0() {
        SmoothFrameLayout2 smoothFrameLayout2 = this.J.f26576a;
        View viewFindViewById = smoothFrameLayout2.findViewById(vsi.L);
        IStateStyle iStateStyleState = Folme.useAt(smoothFrameLayout2).state();
        ViewProperty viewProperty = ViewProperty.SCALE_X;
        Float fValueOf = Float.valueOf(0.95f);
        iStateStyleState.to(viewProperty, fValueOf, ViewProperty.SCALE_Y, fValueOf, f.j);
        Folme.useAt(viewFindViewById).state().to(ViewProperty.AUTO_ALPHA, Float.valueOf(1.0f), f.j);
    }

    public final void P0() {
        SmoothFrameLayout2 smoothFrameLayout2 = this.J.f26576a;
        View viewFindViewById = smoothFrameLayout2.findViewById(vsi.L);
        IStateStyle iStateStyleState = Folme.useAt(smoothFrameLayout2).state();
        ViewProperty viewProperty = ViewProperty.SCALE_X;
        Float fValueOf = Float.valueOf(1.0f);
        iStateStyleState.to(viewProperty, fValueOf, ViewProperty.SCALE_Y, fValueOf, f.f26591k);
        Folme.useAt(viewFindViewById).state().to(ViewProperty.AUTO_ALPHA, Float.valueOf(0.0f), f.f26591k);
    }

    @Override // defpackage.k4i
    public void d0(View view) {
        T(view);
        h0(this.d);
        this.L = I0();
        if (this.M == null) {
            SmoothFrameLayout2 smoothFrameLayout2 = new SmoothFrameLayout2(this.o);
            this.M = smoothFrameLayout2;
            smoothFrameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setContentView(this.M);
            this.M.setLayoutDirection(0);
            this.M.setClipChildren(false);
            this.M.setClipToPadding(false);
            ((ViewGroup) this.M.getParent()).setClipChildren(false);
            ((ViewGroup) this.M.getParent()).setClipToPadding(false);
        }
        this.J.e = this.d;
        this.J.z();
        this.J.C();
        this.J.E(view, this.M, this.L, false);
        this.J.setItemClickListener(new a());
        int iWidth = this.L.width();
        int iHeight = this.L.height();
        setWidth(iWidth);
        setHeight(iHeight);
        Rect rect = this.L;
        N0(view, 0, rect.left, rect.top, this.J.j);
    }

    @Override // defpackage.k4i
    public void j(ListAdapter listAdapter) {
        this.J.B(listAdapter);
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.P = cVar;
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SmoothFrameLayout2 f26576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f26577b;
        public ListView c;
        public hwc d;
        public n4i e;
        public AdapterView.OnItemClickListener f;
        public Context g;
        public f i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f26578k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int h = -1;
        public final Rect j = new Rect();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f26579r = false;

        public class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f26580a;

            public a(View view) {
                this.f26580a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                boolean z = !d.this.f26579r && (d.this.f26577b != null ? d.this.d.b(i4 - i2, d.this.e) : true);
                this.f26580a.setEnabled(z);
                d.this.c.setVerticalScrollBarEnabled(z);
            }
        }

        public class b implements View.OnTouchListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f26582a = -1;

            public b() {
            }

            public static /* synthetic */ void b(View view) {
                if (view instanceof ViewGroup) {
                    try {
                        int childCount = ((ViewGroup) view).getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            ((ViewGroup) view).getChildAt(i).setPressed(false);
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("list onTouch error ");
                        sb.append(e);
                    }
                }
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(final View view, MotionEvent motionEvent) {
                int firstVisiblePosition;
                int i;
                View childAt;
                int iPointToPosition = d.this.c.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3 || action == 6) {
                        this.f26582a = -1;
                        d.this.c.postDelayed(new Runnable() { // from class: noc
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyperPopupWindow.d.b.b(view);
                            }
                        }, ViewConfiguration.getPressedStateDuration());
                    }
                } else if (iPointToPosition != -1 && (firstVisiblePosition = iPointToPosition - d.this.c.getFirstVisiblePosition()) != (i = this.f26582a)) {
                    if (i != -1 && (childAt = d.this.c.getChildAt(this.f26582a)) != null) {
                        childAt.setPressed(false);
                    }
                    d.this.c.getChildAt(firstVisiblePosition).setPressed(true);
                    this.f26582a = firstVisiblePosition;
                }
                return false;
            }
        }

        public class c implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Rect f26584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f26585b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;
            public final /* synthetic */ int h;
            public final /* synthetic */ int i;
            public final /* synthetic */ int j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ int f26586k;
            public final /* synthetic */ int l;
            public final /* synthetic */ int m;
            public final /* synthetic */ int n;
            public final /* synthetic */ int o;
            public final /* synthetic */ int p;
            public final /* synthetic */ int q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ int f26587r;

            public class a extends TransitionListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f26588a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f26589b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;

                public a(int i, int i2, int i3, int i4, int i5, int i6) {
                    this.f26588a = i;
                    this.f26589b = i2;
                    this.c = i3;
                    this.d = i4;
                    this.e = i5;
                    this.f = i6;
                }

                @Override // miuix.animation.listener.TransitionListener
                public void onCancel(Object obj) {
                    super.onCancel(obj);
                    HyperPopupWindow.this.J.f26579r = false;
                    if (HyperPopupWindow.this.K != null) {
                        HyperPopupWindow.this.K.f26579r = false;
                    }
                }

                @Override // miuix.animation.listener.TransitionListener
                public void onComplete(Object obj) {
                    super.onComplete(obj);
                    HyperPopupWindow.this.J.f26579r = false;
                    if (HyperPopupWindow.this.K != null) {
                        HyperPopupWindow.this.K.f26579r = false;
                    }
                }

                @Override // miuix.animation.listener.TransitionListener
                public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
                    super.onUpdate(obj, collection);
                    UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, "fraction");
                    if (updateInfoFindByName == null) {
                        return;
                    }
                    float floatValue = updateInfoFindByName.getFloatValue();
                    c cVar = c.this;
                    int i = cVar.c;
                    int i2 = (int) (i + ((cVar.d - i) * floatValue));
                    int i3 = cVar.e;
                    int i4 = (int) (i3 + ((cVar.f - i3) * floatValue));
                    int i5 = cVar.g;
                    int i6 = (int) (i5 + ((cVar.h - i5) * floatValue));
                    int i7 = cVar.i;
                    HyperPopupWindow.this.N.d(i2, i4, i6, (int) (i7 + ((cVar.j - i7) * floatValue)));
                    HyperPopupWindow.this.N.c();
                    c cVar2 = c.this;
                    int i8 = cVar2.f26586k;
                    int i9 = (int) (i8 + ((cVar2.l - i8) * floatValue));
                    int i10 = cVar2.m;
                    int i11 = (int) (i10 + ((cVar2.n - i10) * floatValue));
                    int i12 = cVar2.o;
                    int i13 = (int) (i12 + ((cVar2.p - i12) * floatValue));
                    int i14 = cVar2.q;
                    int i15 = (int) (i14 + ((cVar2.f26587r - i14) * floatValue));
                    int i16 = this.e;
                    d.this.i.l(i9, i11, i13, i15, (int) (i16 + ((this.f - i16) * floatValue)));
                }
            }

            public c(Rect rect, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                this.f26584a = rect;
                this.f26585b = view;
                this.c = i;
                this.d = i2;
                this.e = i3;
                this.f = i4;
                this.g = i5;
                this.h = i6;
                this.i = i7;
                this.j = i8;
                this.f26586k = i9;
                this.l = i10;
                this.m = i11;
                this.n = i12;
                this.o = i13;
                this.p = i14;
                this.q = i15;
                this.f26587r = i16;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View viewFindViewById = d.this.f26576a.findViewById(vsi.k0);
                if (viewFindViewById == null) {
                    return false;
                }
                d.this.f26576a.getViewTreeObserver().removeOnPreDrawListener(this);
                viewFindViewById.sendAccessibilityEvent(8);
                d.this.l = this.f26584a.height();
                d.this.m = this.f26585b.getPaddingTop();
                d.this.n = this.f26585b.getPaddingBottom();
                d.this.o = viewFindViewById.getHeight();
                d.this.p = viewFindViewById.getPaddingTop();
                d.this.q = viewFindViewById.getPaddingBottom();
                int i = d.this.l;
                int i2 = d.this.o;
                int i3 = d.this.m;
                int i4 = d.this.p;
                int i5 = d.this.n;
                int i6 = d.this.q;
                d.this.f26578k = viewFindViewById;
                Folme.useValue(d.this.i).setTo("fraction", Float.valueOf(0.0f)).to("fraction", Float.valueOf(1.0f), new AnimConfig().addListeners(new a(i3, i4, i5, i6, i, i2)));
                float fH = d.this.i.h();
                float f = HyperPopupWindow.this.O;
                d.this.f26576a.setCornerRadius(fH);
                Folme.useValue(d.this.i).to(d.this.i.f26593b, Float.valueOf(f), f.j);
                Folme.useValue(d.this.i).to(d.this.i.f26592a, Float.valueOf(-90.0f), d.this.i.h);
                return false;
            }
        }

        /* JADX INFO: renamed from: miuix.appcompat.widget.HyperPopupWindow$d$d, reason: collision with other inner class name */
        public class C1031d extends androidx.core.view.a {
            public C1031d() {
            }

            @Override // androidx.core.view.a
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                if (accessibilityEvent.getEventType() == 32768) {
                    HyperPopupWindow.this.Q = view;
                }
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
        }

        public d(Context context, hwc hwcVar) {
            this.g = context;
            this.d = hwcVar;
        }

        public final /* synthetic */ void A(AdapterView adapterView, View view, int i, long j) {
            int headerViewsCount = i - this.c.getHeaderViewsCount();
            if (this.f == null || headerViewsCount < 0 || headerViewsCount >= this.f26577b.getCount()) {
                return;
            }
            this.f.onItemClick(adapterView, view, headerViewsCount, j);
        }

        public void B(ListAdapter listAdapter) {
            this.f26577b = listAdapter;
        }

        public void C() {
            ListView listView;
            if (HyperPopupWindow.this.J == null || (listView = this.c) == null) {
                return;
            }
            androidx.core.view.c.r0(listView, new C1031d());
        }

        public void D(int i) {
            this.h = i;
        }

        public boolean E(View view, ViewGroup viewGroup, Rect rect, boolean z) {
            n4i n4iVar = this.e;
            Rect rect2 = n4iVar.q;
            n4iVar.n = HyperPopupWindow.H0(this.f26577b, this.c, this.g, n4iVar.f27537a, this.h);
            this.d.c(n4iVar);
            int iA = this.d.a(n4iVar);
            int iD = this.d.d(n4iVar);
            int i = n4iVar.g;
            int i2 = n4iVar.h;
            int i3 = iA + i;
            int i4 = iD + i2;
            this.j.set(iA, iD, i3, i4);
            HyperPopupWindow.this.M0(n4iVar, iA, iD, i, i2);
            if (!z) {
                this.f26576a.setPivotX(i3 / 2 > rect2.centerX() ? 0.0f : i);
                this.f26576a.setPivotY(iD <= rect2.top ? i2 : 0.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
                layoutParams.leftMargin = iA - rect.left;
                layoutParams.topMargin = iD - rect.top;
                this.f26576a.setLayoutParams(layoutParams);
                viewGroup.addView(this.f26576a);
                return true;
            }
            Rect rect3 = HyperPopupWindow.this.J.j;
            Rect rectK0 = HyperPopupWindow.K0(rect3, this.j);
            HyperPopupWindow.this.N = HyperPopupWindow.this.new ClipLayout(this.g);
            HyperPopupWindow.this.N.setBackgroundColor(0);
            HyperPopupWindow.this.N.setRadius(HyperPopupWindow.this.O);
            int i5 = rect3.left - rectK0.left;
            int i6 = rect3.top - rectK0.top;
            int iWidth = i5 + rect3.width();
            int iHeight = rect3.height() + i6;
            int iWidth2 = rectK0.width();
            int iHeight2 = rectK0.height();
            HyperPopupWindow.this.N.d(i5, i6, iWidth, iHeight);
            HyperPopupWindow.this.N.c();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(rectK0.width(), rectK0.height());
            layoutParams2.leftMargin = rectK0.left - rect.left;
            layoutParams2.topMargin = rectK0.top - rect.top;
            HyperPopupWindow.this.N.setLayoutParams(layoutParams2);
            viewGroup.addView(HyperPopupWindow.this.N);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
            layoutParams3.leftMargin = rect2.left - rectK0.left;
            layoutParams3.topMargin = rect2.top - rectK0.top;
            this.f26576a.setLayoutParams(layoutParams3);
            HyperPopupWindow.this.N.addView(this.f26576a);
            int i7 = rect2.left;
            int i8 = rectK0.left;
            int i9 = rect2.top;
            int i10 = rectK0.top;
            f fVar = new f(this.f26576a);
            this.i = fVar;
            fVar.k(i);
            HyperPopupWindow.this.J.f26579r = true;
            HyperPopupWindow.this.K.f26579r = true;
            this.f26576a.getViewTreeObserver().addOnPreDrawListener(new c(rect2, view, i5, 0, i6, 0, iWidth, iWidth2, iHeight, iHeight2, i7 - i8, iA - i8, i9 - i10, iD - i10, rect2.right - i8, i3 - i8, rect2.bottom - i10, i4 - i10));
            return true;
        }

        public void setItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
            this.f = onItemClickListener;
        }

        public void z() {
            if (this.f26576a == null) {
                this.f26576a = (SmoothFrameLayout2) LayoutInflater.from(this.g).inflate(awi.x, (ViewGroup) null);
                Drawable drawableH = hm1.h(this.g, zhi.E);
                if (drawableH != null) {
                    this.f26576a.setBackground(drawableH);
                }
                this.f26576a.addOnLayoutChangeListener(new a(this.f26576a.findViewById(vsi.i0)));
            }
            ListView listView = (ListView) this.f26576a.findViewById(R.id.list);
            this.c = listView;
            if (listView != null) {
                listView.setOnTouchListener(new b());
                this.c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: moc
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                        this.f27048a.A(adapterView, view, i, j);
                    }
                });
                this.c.setAdapter(this.f26577b);
            }
        }

        public d(Context context, ListAdapter listAdapter, hwc hwcVar, n4i n4iVar) {
            this.g = context;
            this.f26577b = listAdapter;
            this.d = hwcVar;
            this.e = n4iVar;
        }
    }
}
