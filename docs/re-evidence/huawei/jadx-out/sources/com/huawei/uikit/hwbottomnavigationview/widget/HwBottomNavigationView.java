package com.huawei.uikit.hwbottomnavigationview.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.huawei.uikit.hwbottomnavigationview.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import com.huawei.uikit.hweffect.engine.HwBlurable;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector;
import defpackage.xdt;
import defpackage.xdv;
import defpackage.xdx;
import defpackage.xeq;
import defpackage.xfs;
import defpackage.xfu;
import defpackage.xgo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HwBottomNavigationView extends LinearLayout implements HwBlurable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f29261a;
    private int aa;
    private boolean ab;
    private final Rect ac;
    private boolean ad;
    private b ae;
    private MenuInflater af;
    private int ag;
    private int ah;
    private c ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private boolean as;
    private xeq at;
    private boolean au;
    private int av;
    private boolean aw;
    private float ax;
    private Drawable ay;
    private xgo az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected OnItemDoubleTapListener f29262b;
    private HwColumnSystem ba;
    private boolean bb;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f29263c;
    protected int d;
    protected int e;
    protected int f;
    protected e g;
    protected BottomNavListener h;
    protected Menu i;
    protected int j;
    protected int k;
    protected int l;
    protected Resources m;
    protected int n;
    private int o;
    private int p;
    private String q;
    private int r;
    private HwKeyEventDetector s;
    private int t;
    private GestureDetector u;
    private HwKeyEventDetector.OnGlobalNextTabEventListener v;
    private int w;
    private HwKeyEventDetector.OnNextTabEventListener x;
    private BottomNavigationItemView y;
    private boolean z;

    public interface BottomNavListener {
        void onBottomNavItemReselected(MenuItem menuItem, int i);

        void onBottomNavItemSelected(MenuItem menuItem, int i);

        void onBottomNavItemUnselected(MenuItem menuItem, int i);
    }

    /* JADX INFO: loaded from: classes43.dex */
    public interface OnItemDoubleTapListener {
        void onDoubleTaped(MenuItem menuItem, int i);
    }

    class a implements HwKeyEventDetector.OnNextTabEventListener {
        a() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector.OnNextTabEventListener
        public boolean onNextTab(int i, KeyEvent keyEvent) {
            if (i == 1) {
                HwBottomNavigationView.this.b();
            }
            return true;
        }
    }

    class b implements View.OnTouchListener {
        private b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(view instanceof BottomNavigationItemView)) {
                return false;
            }
            HwBottomNavigationView.this.y = (BottomNavigationItemView) view;
            return HwBottomNavigationView.this.u.onTouchEvent(motionEvent);
        }

        /* synthetic */ b(HwBottomNavigationView hwBottomNavigationView, f fVar) {
            this();
        }
    }

    class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) view;
                if (!HwBottomNavigationView.this.ab) {
                    HwBottomNavigationView.this.a(bottomNavigationItemView, true);
                    return;
                }
                boolean isChecked = bottomNavigationItemView.getIsChecked();
                HwBottomNavigationView hwBottomNavigationView = HwBottomNavigationView.this;
                xdx.c(bottomNavigationItemView, true, !isChecked, hwBottomNavigationView.h, hwBottomNavigationView.i);
            }
        }

        /* synthetic */ c(HwBottomNavigationView hwBottomNavigationView, f fVar) {
            this();
        }
    }

    class d implements HwKeyEventDetector.OnGlobalNextTabEventListener {
        d() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector.OnGlobalNextTabEventListener
        public boolean onGlobalNextTab(int i, KeyEvent keyEvent) {
            if (i == 1) {
                HwBottomNavigationView.this.b();
            }
            return true;
        }
    }

    protected class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29271a;
        private int d;

        e() {
        }

        public void b() {
            this.d = 0;
            this.f29271a = 0;
        }

        public void b(int i) {
            this.d = i;
        }

        public int c() {
            return this.f29271a;
        }

        public void c(int i) {
            this.f29271a = i;
        }

        public int d() {
            return this.d;
        }
    }

    class f extends GestureDetector.SimpleOnGestureListener {
        f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            HwBottomNavigationView hwBottomNavigationView = HwBottomNavigationView.this;
            if (hwBottomNavigationView.f29262b != null && hwBottomNavigationView.y != null) {
                int itemIndex = HwBottomNavigationView.this.y.getItemIndex();
                HwBottomNavigationView hwBottomNavigationView2 = HwBottomNavigationView.this;
                hwBottomNavigationView2.f29262b.onDoubleTaped(hwBottomNavigationView2.i.getItem(itemIndex), itemIndex);
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return super.onDoubleTapEvent(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public HwBottomNavigationView(Context context) {
        this(context, null);
    }

    private void setNavigationViewClipOnLand(BottomNavigationItemView bottomNavigationItemView) {
        if (!bottomNavigationItemView.e() && !bottomNavigationItemView.d()) {
            bottomNavigationItemView.setClipChildren(true);
            bottomNavigationItemView.setClipToPadding(true);
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            bottomNavigationItemView.setClipChildren(false);
            bottomNavigationItemView.setClipToPadding(false);
        }
    }

    public void a() {
        this.ah = -1;
        this.i.clear();
        this.f = 0;
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        View childAt = getChildAt(this.r);
        if (hasFocus() || this.r < 0 || childAt == null) {
            super.addFocusables(arrayList, i, i2);
        } else if (childAt.isFocusable()) {
            arrayList.add(childAt);
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    protected HwKeyEventDetector c() {
        return new HwKeyEventDetector(this.f29263c);
    }

    protected void c(int i, int i2, e eVar) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (eVar == null) {
            Log.w("HwBottomNavigationView", "measureOnPortraitByAverageWidth: Param measureSize is null");
            return;
        }
        if (childCount <= 0) {
            eVar.b(size);
            eVar.c(0);
            return;
        }
        if (this.am && (i3 = this.ao) > 0 && i3 < paddingLeft) {
            paddingLeft = i3;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(childCount, paddingLeft / childCount, ViewGroup.getChildMeasureSpec(i2, paddingTop, -2));
        d(childCount, iB);
        eVar.b(size);
        eVar.c(iB + paddingTop);
    }

    protected HwKeyEventDetector.OnNextTabEventListener d() {
        return new a();
    }

    public void d(int i, Drawable drawable, int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f) {
            return;
        }
        MenuItem item = this.i.getItem(i2);
        View childAt = getChildAt(i2);
        if (childAt instanceof BottomNavigationItemView) {
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
            if (i != 0) {
                item.setTitle(i);
            }
            if (drawable != null) {
                item.setIcon(drawable);
            }
            bottomNavigationItemView.b(item, z);
        }
    }

    public void d(Drawable drawable, int i, boolean z) {
        if (i < 0 || i >= this.f || drawable == null) {
            return;
        }
        MenuItem item = this.i.getItem(i);
        item.setIcon(drawable);
        if (getChildAt(i) instanceof BottomNavigationItemView) {
            ((BottomNavigationItemView) getChildAt(i)).d(item, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.at.c((View) this) || this.bb) {
            super.draw(canvas);
            return;
        }
        this.at.c(canvas, this);
        super.dispatchDraw(canvas);
        a(canvas);
    }

    protected HwKeyEventDetector.OnGlobalNextTabEventListener e() {
        return new d();
    }

    public void e(int i, boolean z) {
        if (i >= this.f || !(getChildAt(i) instanceof BottomNavigationItemView)) {
            return;
        }
        ((BottomNavigationItemView) getChildAt(i)).setHasMessage(z);
    }

    protected void e(MenuItem menuItem, int i, boolean z, AttributeSet attributeSet, int i2) {
        if (menuItem == null) {
            Log.w("HwBottomNavigationView", "createNewItem: Param menuItem is null");
            return;
        }
        BottomNavigationItemView bottomNavigationItemView = new BottomNavigationItemView(this.f29263c, menuItem, this.al, i, z, attributeSet, i2);
        bottomNavigationItemView.setClickable(true);
        bottomNavigationItemView.setFocusable(true);
        bottomNavigationItemView.setBackgroundResource(this.w);
        bottomNavigationItemView.c(this.e);
        bottomNavigationItemView.d(this.d);
        bottomNavigationItemView.e(this.k);
        bottomNavigationItemView.a(this.l);
        bottomNavigationItemView.setMsgBgColor(this.n);
        bottomNavigationItemView.setOnClickListener(this.ai);
        bottomNavigationItemView.setOnTouchListener(this.ae);
        addView(bottomNavigationItemView);
    }

    public boolean e(CharSequence charSequence, Drawable drawable) {
        return e(0, 0, charSequence, drawable, true);
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public int getBlurColor() {
        return this.aa;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public int getBlurType() {
        return this.ag;
    }

    public int getFocusPathColor() {
        return this.p;
    }

    public boolean getLongClickEnable() {
        return this.ad;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public boolean isBlurEnable() {
        return this.aw;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.az.c(windowInsets);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.az.c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        HwKeyEventDetector hwKeyEventDetector = this.s;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.c(this.x);
            this.s.c(this, this.v);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.as) {
            this.ao = e(this.ba, this.i.size());
        } else {
            this.ao = c(this.ba, this.i.size());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        HwKeyEventDetector hwKeyEventDetector = this.s;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        HwKeyEventDetector hwKeyEventDetector = this.s;
        if (hwKeyEventDetector == null || !hwKeyEventDetector.e(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        HwKeyEventDetector hwKeyEventDetector = this.s;
        if (hwKeyEventDetector == null || !hwKeyEventDetector.e(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.az.e(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        this.g.b();
        if (getOrientation() == 1) {
            b(i2, this.g);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.g.d(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.g.c(), 1073741824));
            return;
        }
        boolean z = this.am;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (this.bb) {
            super.onMeasure(i, i2);
            return;
        }
        if ((childCount > 3 || this.ap > 0) && z && (i3 = this.aq) > 0 && i3 < paddingLeft) {
            paddingLeft = i3;
        }
        boolean zD = d(paddingLeft);
        if (childCount == 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        this.al = zD;
        b(childCount);
        if (this.al) {
            a(i, i2, this.g);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.g.d(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.g.c(), 1073741824));
        } else {
            b(i, i2, this.g);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.g.d(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.g.c(), 1073741824));
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.bb) {
            return;
        }
        if (i != 0) {
            this.at.b(this);
            return;
        }
        this.at.c(this, this.ag);
        this.at.d(this, isBlurEnable());
        int i2 = this.aa;
        if (i2 != -16777216) {
            this.at.e(this, i2);
        }
    }

    public void setActiveColor(int i) {
        for (int i2 = 0; i2 < this.f; i2++) {
            setItemActiveColor(i, i2);
        }
    }

    public void setBackgroundResourceId(int i) {
        this.w = i;
        for (int i2 = 0; i2 < this.f; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof BottomNavigationItemView) {
                ((BottomNavigationItemView) childAt).setBackgroundResource(i);
            }
        }
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public void setBlurColor(int i) {
        this.aa = i;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public void setBlurEnable(boolean z) {
        this.aw = z;
        this.at.d(this, isBlurEnable());
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public void setBlurType(int i) {
        this.ag = i;
    }

    public void setBottomNavListener(BottomNavListener bottomNavListener) {
        this.h = bottomNavListener;
    }

    public void setColumnEnabled(boolean z) {
        this.am = z;
        requestLayout();
    }

    public void setDefaultColor(int i) {
        for (int i2 = 0; i2 < this.f; i2++) {
            setItemDefaultColor(i, i2);
        }
    }

    public void setDividerEnabled(boolean z) {
        if (this.au == z) {
            return;
        }
        this.au = z;
        requestLayout();
    }

    public void setDoubleTapListener(OnItemDoubleTapListener onItemDoubleTapListener) {
        this.f29262b = onItemDoubleTapListener;
    }

    public void setExtendedNextTabEnabled(boolean z, boolean z2) {
        HwKeyEventDetector hwKeyEventDetector = this.s;
        if (hwKeyEventDetector == null) {
            return;
        }
        if (z) {
            if (!z2) {
                this.v = null;
                hwKeyEventDetector.c(this, null);
                return;
            } else {
                HwKeyEventDetector.OnGlobalNextTabEventListener onGlobalNextTabEventListenerE = e();
                this.v = onGlobalNextTabEventListenerE;
                this.s.c(this, onGlobalNextTabEventListenerE);
                return;
            }
        }
        if (!z2) {
            this.x = null;
            hwKeyEventDetector.c(null);
        } else {
            HwKeyEventDetector.OnNextTabEventListener onNextTabEventListenerD = d();
            this.x = onNextTabEventListenerD;
            this.s.c(onNextTabEventListenerD);
        }
    }

    public void setFocusPathColor(int i) {
        this.p = i;
    }

    public void setIconFocusActiveColor(int i) {
    }

    public void setIconFocusDefaultColor(int i) {
    }

    public void setItemActiveColor(int i, int i2) {
        if (i2 < 0 || i2 >= this.f) {
            return;
        }
        View childAt = getChildAt(i2);
        if (childAt instanceof BottomNavigationItemView) {
            ((BottomNavigationItemView) childAt).c(i);
        }
    }

    public void setItemChecked(int i) {
        int childCount = getChildCount();
        if (i < 0 || i >= childCount) {
            return;
        }
        View childAt = getChildAt(i);
        if (childAt instanceof BottomNavigationItemView) {
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
            bottomNavigationItemView.setChecked(true, this.ah != -1);
            a(bottomNavigationItemView, false);
        }
    }

    public void setItemDefaultColor(int i, int i2) {
        if (i2 < 0 || i2 >= this.f) {
            return;
        }
        View childAt = getChildAt(i2);
        if (childAt instanceof BottomNavigationItemView) {
            ((BottomNavigationItemView) childAt).d(i);
        }
    }

    public void setItemIconFocusActiveColor(int i, int i2) {
    }

    public void setItemIconFocusDefaultColor(int i, int i2) {
    }

    public void setItemTitleActiveColor(int i, int i2) {
        if (i2 < 0 || i2 >= this.f) {
            return;
        }
        View childAt = getChildAt(i2);
        if (childAt instanceof BottomNavigationItemView) {
            ((BottomNavigationItemView) childAt).e(i);
        }
    }

    public void setItemTitleDefaultColor(int i, int i2) {
        if (i2 < 0 || i2 >= this.f) {
            return;
        }
        View childAt = getChildAt(i2);
        if (childAt instanceof BottomNavigationItemView) {
            ((BottomNavigationItemView) childAt).a(i);
        }
    }

    public void setItemUnchecked(int i) {
        int childCount = getChildCount();
        if (i < 0 || i >= childCount) {
            return;
        }
        View childAt = getChildAt(i);
        if (childAt instanceof BottomNavigationItemView) {
            xdx.c((BottomNavigationItemView) childAt, false, false, this.h, this.i);
        }
    }

    public void setLongClickEnable(boolean z) {
        this.ad = z;
    }

    public void setMessageBgColor(int i) {
        this.n = i;
        for (int i2 = 0; i2 < this.f; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof BottomNavigationItemView) {
                ((BottomNavigationItemView) childAt).setMsgBgColor(i);
            }
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.az.c(i, i2, i3, i4);
    }

    public void setPortLayout(boolean z) {
        if (this.ak != z) {
            this.ak = z;
            requestLayout();
        }
    }

    public void setSelectItemEnabled(int i, boolean z) {
        if (i < 0 || i >= this.f) {
            return;
        }
        View childAt = getChildAt(i);
        if (childAt instanceof BottomNavigationItemView) {
            ((BottomNavigationItemView) childAt).setEnabled(z);
        }
    }

    public void setSpaciousStyle(boolean z) {
        this.ab = z;
    }

    public void setTitle(int i, int i2, boolean z) {
    }

    public void setTitle(int i, CharSequence charSequence, boolean z) {
    }

    public void setTitleActiveColor(int i) {
        for (int i2 = 0; i2 < this.f; i2++) {
            setItemTitleActiveColor(i, i2);
        }
    }

    public void setTitleDefaultColor(int i) {
        for (int i2 = 0; i2 < this.f; i2++) {
            setItemTitleDefaultColor(i, i2);
        }
    }

    public HwBottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwBottomNavigationViewStyle);
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        this.f29263c = context;
        this.m = context.getResources();
        d(context, attributeSet);
        if (this.m.getInteger(R.integer.emui_device_type) == 2) {
            this.bb = true;
        }
        try {
            this.i = (Menu) Class.forName("com.android.internal.view.menu.MenuBuilder").getConstructor(Context.class).newInstance(context);
        } catch (ClassNotFoundException unused) {
            Log.e("HwBottomNavigationView", "HwBottomNavigationView: MenuBuilder ClassNotFoundException failed");
        } catch (IllegalAccessException unused2) {
            Log.e("HwBottomNavigationView", "HwBottomNavigationView: MenuBuilder IllegalAccessException failed");
        } catch (InstantiationException unused3) {
            Log.e("HwBottomNavigationView", "HwBottomNavigationView: MenuBuilder InstantiationException failed");
        } catch (NoSuchMethodException unused4) {
            Log.e("HwBottomNavigationView", "HwBottomNavigationView: MenuBuilder NoSuchMethodException failed");
        } catch (InvocationTargetException unused5) {
            Log.e("HwBottomNavigationView", "HwBottomNavigationView: MenuBuilder InvocationTargetException failed");
        }
        this.af = new MenuInflater(this.f29263c);
        c(context, attributeSet, i);
        this.o = this.m.getInteger(R.integer.hwbottomnavigationview_space_thread);
        this.t = this.m.getDimensionPixelOffset(R.dimen.hwbottomnavigationview_item_port_width_in_vertical);
        f fVar = null;
        this.ai = new c(this, fVar);
        this.ae = new b(this, fVar);
        h();
        b(attributeSet, i);
        this.s = c();
        xdx.c(context, this);
        g();
    }

    private void g() {
        this.u = new GestureDetector(this.f29263c, new f());
    }

    public HwBottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
        this.g = new e();
        this.e = 678391;
        this.d = 855638016;
        this.k = 678391;
        this.l = -1728053248;
        this.j = -452984832;
        this.f29261a = -452984832;
        this.n = 16394797;
        this.ac = new Rect();
        this.ah = -1;
        this.ak = false;
        this.at = xeq.c();
        this.aw = false;
        this.au = false;
        this.bb = false;
        this.o = 0;
        this.r = 0;
        this.s = null;
        this.ad = false;
        d(super.getContext(), attributeSet, i);
    }

    private void d(int i, int i2, e eVar) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        float paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        eVar.b(size);
        int childCount = getChildCount();
        if (childCount <= 0) {
            eVar.b(size);
            eVar.c(0);
            return;
        }
        if (this.am && (i3 = this.ao) > 0) {
            float f2 = i3;
            if (f2 < paddingLeft) {
                paddingLeft = f2;
            }
        }
        float f3 = paddingLeft / childCount;
        ArrayList arrayList = new ArrayList(childCount);
        for (int i4 = 0; i4 < childCount; i4++) {
            a(arrayList, i4, f3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        c(f3, childMeasureSpec, arrayList, eVar);
        e(f3, childMeasureSpec, arrayList, eVar);
        d(childCount, eVar.c());
        eVar.c(eVar.c() + paddingTop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return getLayoutDirection() == 1;
    }

    private void a(int i) {
        int i2;
        if (i == 21 || i == 22) {
            return;
        }
        if (i == 19 && (i2 = this.r) > 0) {
            this.r = i2 - 1;
        } else {
            if (i != 20 || this.r >= getChildCount()) {
                return;
            }
            this.r++;
        }
    }

    public boolean a(int i, Drawable drawable, boolean z) {
        return a(0, 0, i, drawable, z);
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwBottomNavigationView);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwBottomNavigationView, i, R.style.Widget_Emui_HwBottomNavigationView);
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwIconDefaultColor, 855638016);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwIconActiveColor, 678391);
        this.l = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwTitleDefaultColor, -1728053248);
        this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwTitleActiveColor, 678391);
        this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwIconFocusColor, -452984832);
        this.f29261a = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwIconFocusActiveColor, -452984832);
        this.n = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwMessageBgColor, 16394797);
        this.ay = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwBottomNavigationView_hwBottomNavDivider);
        this.ag = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwBottomNavigationView_hwBottomNavBlurType, 4);
        this.aa = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwBottomNavBlurOverlayColor, -16777216);
        this.am = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomNavigationView_hwColumnEnabled, false);
        this.p = typedArrayObtainStyledAttributes.getColor(R.styleable.HwBottomNavigationView_hwFocusedPathColor, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomNavigationView_hwInteractSelector, R.drawable.hwbottomnavigationview_item_background_selector);
        this.z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomNavigationView_hwTintEnable, true);
        this.ab = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomNavigationView_hwIsBottomNavSpaciousStyle, false);
        this.aj = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwTextPadding, this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_text_margin));
        this.an = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwIconBounds, this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_icon_size));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomNavigationView_hwBottomNavMenu, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId > 0) {
            this.af.inflate(resourceId, this.i);
        }
        this.q = this.m.getString(R.string.hwbottomnavigationview_access_ability_message_text);
    }

    public void b(CharSequence charSequence, Drawable drawable, int i, boolean z) {
        if (i < 0 || i >= this.f) {
            return;
        }
        MenuItem item = this.i.getItem(i);
        View childAt = getChildAt(i);
        if (childAt instanceof BottomNavigationItemView) {
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
            if (charSequence != null) {
                item.setTitle(charSequence);
            }
            if (drawable != null) {
                item.setIcon(drawable);
            }
            bottomNavigationItemView.b(item, z);
        }
    }

    public class BottomNavigationItemView extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f29264a;
        private int aa;
        private int ab;
        private xdt ac;
        private int ad;
        private int ae;
        private int af;
        private int ag;
        private int ah;
        private int ai;
        private boolean aj;
        private int ak;
        private int al;
        private boolean am;
        private int an;
        private float ao;
        private int ap;
        private Drawable aq;
        private int as;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected LinearLayout f29265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f29266c;
        protected int d;
        boolean e;
        protected int f;
        protected boolean g;
        protected Context h;
        protected boolean i;
        protected HwTextView j;
        protected MenuItem k;
        protected boolean l;
        protected int m;
        protected Paint n;
        protected boolean o;
        protected int p;
        protected ImageView q;
        protected ImageView r;
        protected int s;
        protected int t;
        protected ImageView u;
        private xdt v;
        private xdt w;
        private xdt y;
        private int z;

        class d implements View.OnLongClickListener {
            d() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                HwBottomNavigationView.this.ad = true;
                return true;
            }
        }

        private void b(Context context, AttributeSet attributeSet, int i) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwBottomNavigationView, i, R.style.Widget_Emui_HwBottomNavigationView);
            View.inflate(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomNavigationView_hwBottomNavItemLayout, R.layout.hwbottomnavigationview_item_layout), this);
            this.ap = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwItemIconBounds, 0);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwPortMinHeight, HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_port_minheight));
            this.m = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwBottomNavigationView_hwMinTextSize, HwBottomNavigationView.this.m.getInteger(R.integer.hwbottomnavigationview_item_min_textsize));
            this.ag = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwVerticalPadding, HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_vertical_padding));
            this.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwHorizontalPadding, HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_horizontal_padding));
            this.af = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomNavigationView_hwVerticalAddedPadding, HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_vertical_add_padding));
            typedArrayObtainStyledAttributes.recycle();
        }

        private int getExtendImageSize() {
            return HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_start_icon_extend_size_port);
        }

        private int getSingleImageSize() {
            int i = this.ad;
            if (i != 1 && !this.aj) {
                return this.ak;
            }
            if (i == 1 || !this.aj) {
                return (i != 1 || this.aj) ? this.as : this.an;
            }
            return this.al;
        }

        private void i() {
            if (this.ad == 1) {
                j();
                if (this.aj) {
                    int i = this.ai;
                    setPadding(i, 0, i, 0);
                } else {
                    int i2 = this.ai;
                    int i3 = this.ag;
                    setPadding(i2, i3, i2, i3);
                }
            } else {
                setMinimumHeight(this.s);
                if (this.aj) {
                    setPadding(HwBottomNavigationView.this.aj, 0, HwBottomNavigationView.this.aj, 0);
                } else {
                    setPadding(HwBottomNavigationView.this.aj, this.ag, HwBottomNavigationView.this.aj, this.ag);
                }
            }
            int singleImageSize = getSingleImageSize();
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = singleImageSize;
                layoutParams2.height = singleImageSize;
                if (this.aj) {
                    layoutParams2.setMargins(0, HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_single_icon_extend_top_margin), 0, 0);
                }
                this.r.setLayoutParams(layoutParams2);
                this.y.b(singleImageSize);
                this.y.c(this.i, false);
            }
        }

        private void j() {
            if ((xdv.b() && !xdv.d() && xdv.e(getContext())) || xdv.a() || xdv.c()) {
                setMinimumHeight(this.s);
                HwBottomNavigationView.this.setPortLayout(true);
            } else {
                setMinimumHeight(this.ab);
                HwBottomNavigationView.this.setPortLayout(false);
            }
        }

        protected BottomNavigationItemView a(int i) {
            HwBottomNavigationView.this.l = i;
            b(false, true);
            return this;
        }

        void b(MenuItem menuItem, boolean z) {
            this.o = false;
            this.l = z;
            this.r.setVisibility(8);
            this.f29265b.setVisibility(0);
            if (this.ad == 0) {
                this.u.setVisibility(0);
            }
            this.k = menuItem;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 48;
                setLayoutParams(layoutParams2);
            }
            this.w.c(this.k.getIcon());
            this.ac.c(this.k.getIcon());
            b(true, true);
        }

        protected BottomNavigationItemView c(int i) {
            this.d = i;
            b(false, true);
            return this;
        }

        protected BottomNavigationItemView d(int i) {
            this.f = i;
            b(false, true);
            return this;
        }

        void d(MenuItem menuItem, boolean z) {
            this.o = true;
            this.aj = z;
            this.f29265b.setVisibility(8);
            this.u.setVisibility(8);
            this.r.setVisibility(0);
            setGravity(1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.gravity = 48;
                } else {
                    layoutParams2.gravity = 16;
                }
                setLayoutParams(layoutParams2);
            }
            this.k = menuItem;
            xdt xdtVar = new xdt(this.h, menuItem.getIcon(), getSingleImageSize());
            this.y = xdtVar;
            this.r.setImageDrawable(xdtVar);
            this.aq = menuItem.getIcon();
            i();
        }

        public boolean d() {
            return this.g;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            if (canvas == null) {
                Log.w("HwBottomNavigationView", "dispatchDraw: Param canvas is null");
                return;
            }
            super.dispatchDraw(canvas);
            if (!this.am || this.o) {
                return;
            }
            ImageView icon = getIcon();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            getGlobalVisibleRect(rect);
            icon.getGlobalVisibleRect(rect2);
            int i = HwBottomNavigationView.this.i() ? (rect2.left - rect.left) + this.ah : (rect2.right - rect.left) - this.ah;
            int i2 = rect2.top;
            int i3 = rect.top;
            int i4 = this.ah;
            canvas.drawCircle(i, (i2 - i3) + i4, i4, this.n);
        }

        protected BottomNavigationItemView e(int i) {
            HwBottomNavigationView.this.k = i;
            b(false, true);
            return this;
        }

        public boolean e() {
            return this.o;
        }

        LinearLayout getContainer() {
            return this.f29265b;
        }

        public TextView getContent() {
            return this.j;
        }

        ImageView getIcon() {
            return this.ad == 1 ? this.q : this.u;
        }

        public boolean getIsChecked() {
            return this.i;
        }

        public int getItemIndex() {
            return this.z;
        }

        public Drawable getOriginalDrawable() {
            return this.aq;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent == null) {
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (accessibilityNodeInfo == null) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setSelected(this.i);
            TextUtils.isEmpty(this.k.getTitle());
            if (a()) {
                accessibilityNodeInfo.setHintText(HwBottomNavigationView.this.q);
            }
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            HwBottomNavigationView.this.c(keyEvent, i);
            if (HwBottomNavigationView.this.onKeyDown(i, keyEvent)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            if (HwBottomNavigationView.this.onKeyUp(i, keyEvent)) {
                return true;
            }
            return super.onKeyUp(i, keyEvent);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            sendAccessibilityEvent(32768);
            return zPerformClick;
        }

        public void setChecked(boolean z, boolean z2) {
            if (this.o) {
                this.i = z;
                this.y.c(z, false);
            } else if (z != this.i) {
                this.i = z;
                xdt xdtVar = this.ad == 1 ? this.w : this.ac;
                this.v = xdtVar;
                xdtVar.c(z, z2);
                this.j.setTextColor(this.i ? HwBottomNavigationView.this.k : HwBottomNavigationView.this.l);
            }
        }

        void setDirection(int i) {
            if (i == this.ad) {
                return;
            }
            this.ad = i;
            if (this.o) {
                i();
            } else {
                b(true, false);
            }
        }

        @Override // android.view.View
        public void setEnabled(boolean z) {
            xdt xdtVar = this.v;
            if (xdtVar != null && this.j != null) {
                if (z) {
                    xdtVar.setAlpha(255);
                    this.j.setAlpha(1.0f);
                } else {
                    xdtVar.setAlpha((int) ((this.ao * 255.0f) + 0.5f));
                    this.j.setAlpha(this.ao);
                }
            }
            super.setFocusable(z);
            super.setClickable(z);
        }

        void setHasMessage(boolean z) {
            this.am = z;
            invalidate();
        }

        public void setMsgBgColor(int i) {
            this.aa = i;
            this.n.setColor(i);
            invalidate();
        }

        public void setOriginalDrawable(Drawable drawable) {
            this.aq = drawable;
        }

        boolean b() {
            return this.aj;
        }

        boolean a() {
            return this.am;
        }

        private void c() {
            if (Float.compare(xfu.d(this.h), 1.75f) >= 0) {
                setOnLongClickListener(new d());
            }
        }

        private void b(boolean z, boolean z2) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            if (z && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                if (this.ad == 1) {
                    setGravity(17);
                    j();
                    int i = this.ai;
                    setPadding(i, 0, i, 0);
                    this.u.setVisibility(8);
                    this.q.setVisibility(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    this.j.setLayoutParams(marginLayoutParams);
                    this.j.setAutoTextSize(1, this.ae);
                    this.j.setGravity(GravityCompat.START);
                    this.v = this.w;
                } else {
                    setGravity(0);
                    setMinimumHeight(this.s);
                    int i2 = this.ag;
                    setPadding(0, this.af + i2, 0, i2);
                    this.u.setVisibility(0);
                    this.q.setVisibility(8);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.setMargins(HwBottomNavigationView.this.aj, 0, HwBottomNavigationView.this.aj, 0);
                    this.j.setLayoutParams(marginLayoutParams2);
                    this.j.setAutoTextSize(0, this.t);
                    this.j.setGravity(1);
                    this.v = this.ac;
                }
                this.j.setText(this.k.getTitle());
                this.v.c(this.i, false);
            }
            if (z2) {
                if (this.l) {
                    this.w.c(this.d);
                    this.w.a(this.f);
                    this.ac.c(this.d);
                    this.ac.a(this.f);
                }
                this.j.setTextColor(this.i ? HwBottomNavigationView.this.k : HwBottomNavigationView.this.l);
            }
        }

        public BottomNavigationItemView(Context context, MenuItem menuItem, boolean z, int i, boolean z2, AttributeSet attributeSet, int i2) {
            super(context);
            this.i = false;
            this.l = true;
            this.ad = -1;
            this.h = context;
            this.k = menuItem;
            b(context, attributeSet, i2);
            this.j = (HwTextView) findViewById(R.id.content);
            this.u = (ImageView) findViewById(R.id.top_icon);
            this.q = (ImageView) findViewById(R.id.start_icon);
            this.r = (ImageView) findViewById(R.id.single_icon);
            this.f29265b = (LinearLayout) findViewById(R.id.container);
            this.ao = HwBottomNavigationView.this.m.getFloat(R.dimen.emui_disabled_alpha);
            this.w = new xdt(this.h, this.k.getIcon());
            this.ac = new xdt(this.h, this.k.getIcon(), this.ap);
            this.aq = this.w.b();
            this.ab = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_land_minheight);
            this.ae = HwBottomNavigationView.this.m.getInteger(R.integer.hwbottomnavigationview_item_land_textsize);
            this.t = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.emui_text_size_caption);
            this.p = HwBottomNavigationView.this.m.getInteger(R.integer.hwbottomnavigationview_text_stepgranularity);
            this.ak = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_single_icon_normal_size_port);
            this.al = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_single_icon_extend_size_port);
            this.an = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_single_icon_normal_size_land);
            this.as = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_single_icon_extend_size_land);
            this.ah = HwBottomNavigationView.this.m.getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_red_dot_radius);
            this.j.setAutoTextInfo(this.m, this.p, 1);
            if (z) {
                this.ad = 1;
            } else {
                this.ad = 0;
            }
            this.z = i;
            this.l = z2;
            this.q.setImageDrawable(this.w);
            this.u.setImageDrawable(this.ac);
            Paint paint = new Paint();
            this.n = paint;
            paint.setAntiAlias(true);
            setOrientation(1);
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            b(true, true);
            c();
        }
    }

    private void c(int i) {
        boolean zI = i();
        if (i == 21) {
            if (zI) {
                if (this.r < getChildCount()) {
                    this.r++;
                    return;
                }
                return;
            } else {
                int i2 = this.r;
                if (i2 > 0) {
                    this.r = i2 - 1;
                    return;
                }
                return;
            }
        }
        if (i == 22) {
            if (zI) {
                int i3 = this.r;
                if (i3 > 0) {
                    this.r = i3 - 1;
                    return;
                }
                return;
            }
            if (this.r < getChildCount()) {
                this.r++;
            }
        }
    }

    private void d(Context context, AttributeSet attributeSet) {
        xgo xgoVar = new xgo(this);
        this.az = xgoVar;
        xgoVar.d(context, attributeSet);
        this.az.a(false);
        this.az.b(true);
    }

    private boolean e(Menu menu) {
        return menu.size() <= 5;
    }

    private boolean e(int i, int i2, CharSequence charSequence, Drawable drawable, boolean z) {
        MenuItem icon = this.i.add(0, i, i2, charSequence).setIcon(drawable);
        int size = this.i.size();
        this.f = size;
        if (this.as) {
            this.ao = e(this.ba, size);
        } else {
            this.ao = c(this.ba, size);
        }
        e(icon, this.f - 1, z, (AttributeSet) null, 0);
        return e(this.i);
    }

    private void h() {
        int i;
        HwColumnSystem hwColumnSystem = new HwColumnSystem(this.f29263c);
        this.ba = hwColumnSystem;
        this.as = false;
        this.ao = c(hwColumnSystem, this.i.size());
        if (this.bb) {
            this.al = false;
            this.am = false;
        } else if (this.am && (i = this.aq) > 0) {
            this.al = d(i);
        } else {
            this.al = d((this.f29263c.getResources().getDisplayMetrics().widthPixels - getPaddingLeft()) - getPaddingRight());
        }
    }

    private boolean a(int i, int i2, int i3, Drawable drawable, boolean z) {
        MenuItem icon = this.i.add(0, 0, 0, i3).setIcon(drawable);
        int size = this.i.size();
        this.f = size;
        if (this.as) {
            this.ao = e(this.ba, size);
        } else {
            this.ao = c(this.ba, size);
        }
        e(icon, this.f - 1, z, (AttributeSet) null, 0);
        return e(this.i);
    }

    private boolean d(int i) {
        return !this.ak && ((float) i) / 5.0f > getResources().getDisplayMetrics().density * ((float) this.o);
    }

    private void b(AttributeSet attributeSet, int i) {
        this.f = this.i.size();
        for (int i2 = 0; i2 < this.f; i2++) {
            e(this.i.getItem(i2), i2, this.z, attributeSet, i);
        }
    }

    private int c(HwColumnSystem hwColumnSystem, int i) {
        hwColumnSystem.d(8);
        hwColumnSystem.b(this.f29263c);
        this.ap = hwColumnSystem.g();
        hwColumnSystem.d(9);
        hwColumnSystem.b(this.f29263c);
        int iG = hwColumnSystem.g();
        this.aq = iG;
        return i > 3 ? iG : this.ap;
    }

    private int e(HwColumnSystem hwColumnSystem, int i) {
        hwColumnSystem.d(8);
        hwColumnSystem.d(this.f29263c, this.ar, this.av, this.ax);
        this.ap = hwColumnSystem.g();
        hwColumnSystem.d(9);
        hwColumnSystem.d(this.f29263c, this.ar, this.av, this.ax);
        int iG = hwColumnSystem.g();
        this.aq = iG;
        return i > 3 ? iG : this.ap;
    }

    private void a(int i, int i2, e eVar) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        if (childCount <= 0) {
            eVar.b(size);
            eVar.c(0);
            return;
        }
        if (this.am && (i3 = this.ao) > 0 && i3 < paddingLeft) {
            paddingLeft = i3;
        }
        int i4 = paddingLeft / childCount;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                setNavigationViewClipOnLand(bottomNavigationItemView);
                bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), childMeasureSpec);
                LinearLayout container = bottomNavigationItemView.getContainer();
                ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (bottomNavigationItemView.d()) {
                        layoutParams2.height = -1;
                    }
                    layoutParams2.gravity = 17;
                    c(container, 0, 0, layoutParams2);
                }
                int measuredHeight = bottomNavigationItemView.getMeasuredHeight();
                if (measuredHeight > i5) {
                    i5 = measuredHeight;
                }
                c(bottomNavigationItemView, i4);
            }
        }
        d(childCount, i5);
        eVar.b(size);
        eVar.c(i5 + paddingTop);
    }

    private void d(int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                ViewGroup.LayoutParams layoutParams = bottomNavigationItemView.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = i2;
                    bottomNavigationItemView.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    private void e(float f2, int i, List<Float> list, e eVar) {
        int iC = eVar.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                if (!bottomNavigationItemView.e() && !bottomNavigationItemView.d()) {
                    bottomNavigationItemView.setClipChildren(true);
                    bottomNavigationItemView.setClipToPadding(true);
                } else {
                    bottomNavigationItemView.setClipChildren(false);
                    bottomNavigationItemView.setClipToPadding(false);
                }
                if (bottomNavigationItemView.e) {
                    bottomNavigationItemView.e = false;
                } else {
                    a(f2, i, bottomNavigationItemView);
                    int measuredHeight = bottomNavigationItemView.getMeasuredHeight();
                    if (measuredHeight > iC) {
                        iC = measuredHeight;
                    }
                }
            }
        }
        eVar.c(iC);
    }

    private void b(int i, int i2, e eVar) {
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        boolean zE = false;
        while (true) {
            boolean z2 = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                zE |= bottomNavigationItemView.e();
                if (!bottomNavigationItemView.b() && !bottomNavigationItemView.d()) {
                    z2 = false;
                }
                z |= z2;
            }
            i3++;
        }
        if (z) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        if (childCount != 2 && childCount != 1 && !zE) {
            d(i, i2, eVar);
        } else {
            c(i, i2, eVar);
        }
    }

    private int b(int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                if (!bottomNavigationItemView.e() && !bottomNavigationItemView.d()) {
                    bottomNavigationItemView.setClipChildren(true);
                    bottomNavigationItemView.setClipToPadding(true);
                } else {
                    bottomNavigationItemView.setClipChildren(false);
                    bottomNavigationItemView.setClipToPadding(false);
                }
                bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), i3);
                c(bottomNavigationItemView, i2);
                View container = bottomNavigationItemView.getContainer();
                ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 1;
                    container.setLayoutParams(layoutParams2);
                    c(container, 0, 0, layoutParams2);
                }
                View icon = bottomNavigationItemView.getIcon();
                ViewGroup.LayoutParams layoutParams3 = icon.getLayoutParams();
                if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.gravity = 1;
                    c(icon, 0, 0, layoutParams4);
                }
                int measuredHeight = bottomNavigationItemView.getMeasuredHeight();
                if (measuredHeight > i4) {
                    i4 = measuredHeight;
                }
            }
        }
        return i4;
    }

    private void c(List<Float> list, int i, float f2, int i2, BottomNavigationItemView bottomNavigationItemView) {
        int i3;
        int childCount = getChildCount();
        if (i != 0 && i != childCount - 1) {
            int i4 = i - 1;
            float fFloatValue = list.get(i4).floatValue();
            int i5 = i + 1;
            float fFloatValue2 = list.get(i5).floatValue();
            if (fFloatValue >= 0.0f && fFloatValue2 >= 0.0f) {
                float fFloatValue3 = list.get(i).floatValue();
                if (fFloatValue > fFloatValue2) {
                    fFloatValue = fFloatValue2;
                }
                float f3 = fFloatValue3 / 2.0f;
                if (!(getChildAt(i4) instanceof BottomNavigationItemView) || !(getChildAt(i5) instanceof BottomNavigationItemView)) {
                    return;
                }
                BottomNavigationItemView bottomNavigationItemView2 = (BottomNavigationItemView) getChildAt(i4);
                BottomNavigationItemView bottomNavigationItemView3 = (BottomNavigationItemView) getChildAt(i5);
                if (f3 + fFloatValue > 0.0f) {
                    i3 = (int) (f2 - fFloatValue3);
                    bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                    float f4 = (-fFloatValue3) / 2.0f;
                    bottomNavigationItemView2.f29266c = f4;
                    bottomNavigationItemView3.f29264a = f4;
                } else {
                    i3 = (int) (f2 + (2.0f * fFloatValue));
                    bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                    bottomNavigationItemView2.f29266c = fFloatValue;
                    bottomNavigationItemView3.f29264a = fFloatValue;
                }
            } else {
                i3 = (int) f2;
                bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        } else {
            i3 = (int) f2;
            bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        bottomNavigationItemView.e = true;
        c(bottomNavigationItemView, i3);
    }

    private void c(float f2, int i, List<Float> list, e eVar) {
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (list.get(i3).floatValue() < 0.0f) {
                View childAt = getChildAt(i3);
                if (childAt instanceof BottomNavigationItemView) {
                    BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                    View icon = bottomNavigationItemView.getIcon();
                    ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.gravity = 1;
                        c(icon, 0, 0, layoutParams2);
                    }
                    c(bottomNavigationItemView.getContainer(), 0, 0);
                    c(list, i3, f2, i, bottomNavigationItemView);
                    int measuredHeight = bottomNavigationItemView.getMeasuredHeight();
                    if (measuredHeight > i2) {
                        i2 = measuredHeight;
                    }
                }
            }
        }
        eVar.c(i2);
    }

    private void a(float f2, int i, BottomNavigationItemView bottomNavigationItemView) {
        ViewGroup.LayoutParams layoutParams = bottomNavigationItemView.getContainer().getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
        }
        ViewGroup.LayoutParams layoutParams2 = bottomNavigationItemView.getIcon().getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 1;
        }
        bottomNavigationItemView.measure(View.MeasureSpec.makeMeasureSpec((int) ((f2 - bottomNavigationItemView.f29264a) - bottomNavigationItemView.f29266c), 1073741824), i);
        c(bottomNavigationItemView, (int) ((f2 - bottomNavigationItemView.f29264a) - bottomNavigationItemView.f29266c));
        bottomNavigationItemView.f29264a = 0.0f;
        bottomNavigationItemView.f29266c = 0.0f;
    }

    private void b(int i, e eVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int childCount = getChildCount();
        if (childCount <= 0) {
            eVar.c(0);
            eVar.b(0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i2 = (size - paddingTop) / (childCount * 2);
        eVar.c(size);
        eVar.b(this.t);
        boolean z = layoutParams.height == -2;
        int i3 = z ? 0 : i2;
        int iE = e(eVar.d(), i3);
        if (z) {
            eVar.c(iE * childCount * 2);
        } else {
            eVar.c(i3 * childCount * 2);
        }
        eVar.c(eVar.c() + paddingTop);
    }

    private int e(int i, int i2) {
        int childCount = getChildCount();
        int iMax = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
        }
        int iMax2 = Math.max(iMax, i2);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2 instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt2;
                bottomNavigationItemView.setDirection(0);
                bottomNavigationItemView.setGravity(17);
                ViewGroup.LayoutParams layoutParams = bottomNavigationItemView.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = iMax2;
                    layoutParams2.width = i;
                    childAt2.setLayoutParams(layoutParams);
                }
            }
        }
        return iMax2;
    }

    private void b(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof BottomNavigationItemView) {
                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) childAt;
                if (this.al) {
                    bottomNavigationItemView.setDirection(1);
                } else {
                    bottomNavigationItemView.setDirection(0);
                }
            }
        }
    }

    private void a(List<Float> list, int i, float f2) {
        View childAt = getChildAt(i);
        if (childAt instanceof BottomNavigationItemView) {
            float desiredWidth = f2 - (Layout.getDesiredWidth(this.i.getItem(i).getTitle(), ((BottomNavigationItemView) childAt).getContent().getPaint()) + (this.aj * 2));
            if (desiredWidth > 0.0f) {
                list.add(Float.valueOf(desiredWidth / 2.0f));
            } else {
                list.add(Float.valueOf(desiredWidth));
            }
        }
    }

    private void c(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c(view, i, i2, (ViewGroup.MarginLayoutParams) layoutParams);
        }
    }

    private void c(View view, int i, int i2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (i()) {
            marginLayoutParams.setMargins(i2, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
        } else {
            marginLayoutParams.setMargins(i, marginLayoutParams.topMargin, i2, marginLayoutParams.bottomMargin);
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private void c(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BottomNavigationItemView bottomNavigationItemView, boolean z) {
        BottomNavListener bottomNavListener;
        int itemIndex = bottomNavigationItemView.getItemIndex();
        int i = this.ah;
        if (itemIndex == i && (bottomNavListener = this.h) != null) {
            bottomNavListener.onBottomNavItemReselected(this.i.getItem(itemIndex), itemIndex);
        } else if (itemIndex != i) {
            if (i < this.f && i >= 0) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof BottomNavigationItemView)) {
                    return;
                }
                ((BottomNavigationItemView) childAt).setChecked(false, true);
                BottomNavListener bottomNavListener2 = this.h;
                if (bottomNavListener2 != null) {
                    bottomNavListener2.onBottomNavItemUnselected(this.i.getItem(this.ah), this.ah);
                }
            }
            this.ah = itemIndex;
            if (z) {
                bottomNavigationItemView.setChecked(true, true);
            }
            BottomNavListener bottomNavListener3 = this.h;
            if (bottomNavListener3 != null) {
                bottomNavListener3.onBottomNavItemSelected(this.i.getItem(this.ah), this.ah);
            }
        } else {
            Log.e("HwBottomNavigationView", "invalid index");
        }
        this.r = this.ah;
    }

    private void a(Canvas canvas) {
        if (!this.au || this.ay == null) {
            return;
        }
        Rect rect = this.ac;
        if (getOrientation() == 1) {
            if (i()) {
                rect.left = 0;
                rect.right = this.ay.getIntrinsicWidth();
                rect.top = getPaddingTop();
                rect.bottom = (getBottom() - getTop()) - getPaddingBottom();
            } else {
                rect.left = ((getRight() - getLeft()) - getPaddingRight()) - 1;
                rect.right = this.ay.getIntrinsicWidth();
                rect.top = getPaddingTop();
                rect.bottom = (getBottom() - getTop()) - getPaddingBottom();
            }
        } else {
            rect.left = getPaddingLeft();
            rect.right = (getRight() - getLeft()) - getPaddingRight();
            rect.top = 0;
            rect.bottom = this.ay.getIntrinsicHeight();
        }
        this.ay.setBounds(rect);
        this.ay.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(KeyEvent keyEvent, int i) {
        View childAt = getChildAt(this.r);
        if (childAt != null && childAt.isFocused()) {
            if (getOrientation() == 1) {
                a(i);
            } else {
                c(i);
            }
            if (i == 61) {
                e(keyEvent);
                return;
            }
            return;
        }
        if (this.r == getChildCount()) {
            this.r--;
        }
    }

    private void e(KeyEvent keyEvent) {
        int i;
        if (keyEvent != null) {
            if (keyEvent.isShiftPressed() && (i = this.r) > 0) {
                this.r = i - 1;
            } else {
                if (keyEvent.isShiftPressed() || this.r >= getChildCount() - 1) {
                    return;
                }
                this.r++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i = (this.ah + 1) % childCount;
        setItemChecked(i);
        if (i == this.ah) {
            int childCount2 = getChildCount();
            if (i < 0 || i >= childCount2) {
                return;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof BottomNavigationItemView) {
                childAt.requestFocus();
            }
        }
    }
}
