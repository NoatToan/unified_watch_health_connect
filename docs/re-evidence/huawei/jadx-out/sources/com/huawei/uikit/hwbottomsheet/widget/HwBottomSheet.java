package com.huawei.uikit.hwbottomsheet.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.huawei.hms.hwid.f$$ExternalSyntheticApiModelOutline0;
import com.huawei.uikit.hwbottomsheet.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import defpackage.xdu;
import defpackage.xgo;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public class HwBottomSheet extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29274a;
    private int aa;
    private boolean ab;
    private View ac;
    private boolean ad;
    private View ae;
    private int af;
    private int ag;
    private View ah;
    private boolean ai;
    private HwDragImageView aj;
    private View ak;
    private int al;
    private float am;
    private boolean an;
    private a ao;
    private boolean ap;
    private float aq;
    private int ar;
    private float as;
    private int at;
    private final List<SheetSlideListener> au;
    private int av;
    private int aw;
    private float ax;
    private float ay;
    private SheetState az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xgo f29275b;
    private int ba;
    private int bb;
    private float bc;
    private boolean bd;
    private int be;
    private int bf;
    private SheetState bg;
    private int bh;
    private Drawable bi;
    private Drawable bj;
    private Drawable bk;
    private int bl;
    private Drawable bm;
    private Drawable bq;
    private Drawable br;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SheetState f29276c;
    private HwViewDragHelper d;
    private int e;
    private int f;
    private int g;
    private String h;
    private String i;
    private int j;
    private boolean k;
    private int l;
    private String m;
    private boolean n;
    private HwColumnSystem o;
    private boolean p;
    private float q;
    private boolean r;
    private int s;
    private int t;
    private View u;
    private boolean v;
    private boolean w;
    private MotionEvent x;
    private boolean y;
    private boolean z;

    public interface SheetSlideListener {
        void onSheetSlide(View view, float f);

        void onSheetStateChanged(View view, SheetState sheetState, SheetState sheetState2);
    }

    public enum SheetState {
        EXPANDED(0),
        COLLAPSED(1),
        ANCHORED(2),
        HIDDEN(3),
        DRAGGING(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29280a;

        SheetState(int i) {
            this.f29280a = i;
        }

        public int getStateValue() {
            return this.f29280a;
        }
    }

    class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwBottomSheet.this.isEnabled() && HwBottomSheet.this.c()) {
                SheetState sheetState = HwBottomSheet.this.f29276c;
                SheetState sheetState2 = SheetState.COLLAPSED;
                if (sheetState == sheetState2) {
                    HwBottomSheet.this.e(SheetState.EXPANDED, true);
                } else if (HwBottomSheet.this.f29276c == SheetState.ANCHORED) {
                    HwBottomSheet.this.e(SheetState.EXPANDED, true);
                } else {
                    HwBottomSheet.this.e(sheetState2, true);
                }
            }
        }

        /* synthetic */ a(HwBottomSheet hwBottomSheet, d dVar) {
            this();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[SheetState.values().length];
            e = iArr;
            try {
                iArr[SheetState.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[SheetState.ANCHORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[SheetState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[SheetState.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class d implements HwViewDragHelper.bqmxo {
        d() {
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.bqmxo
        public void a(int i, int i2) {
            HwBottomSheet.this.aj.d(i, i2);
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    class e extends HwViewDragHelper.Callback {
        private e() {
        }

        private void e() {
            HwBottomSheet hwBottomSheet = HwBottomSheet.this;
            hwBottomSheet.ay = hwBottomSheet.b(hwBottomSheet.u.getTop());
            if (Float.compare(HwBottomSheet.this.ay, 1.0f) == 0) {
                if (HwBottomSheet.this.bq != null && (HwBottomSheet.this.az == SheetState.HIDDEN || HwBottomSheet.this.az == SheetState.COLLAPSED)) {
                    HwBottomSheet hwBottomSheet2 = HwBottomSheet.this;
                    hwBottomSheet2.b(hwBottomSheet2.bq);
                } else if (HwBottomSheet.this.az != SheetState.EXPANDED) {
                    HwBottomSheet hwBottomSheet3 = HwBottomSheet.this;
                    hwBottomSheet3.b(hwBottomSheet3.bk);
                }
                HwBottomSheet.this.d(SheetState.EXPANDED);
                return;
            }
            if (Float.compare(HwBottomSheet.this.ay, 0.0f) == 0) {
                if (HwBottomSheet.this.br != null && HwBottomSheet.this.az == SheetState.EXPANDED) {
                    HwBottomSheet hwBottomSheet4 = HwBottomSheet.this;
                    hwBottomSheet4.b(hwBottomSheet4.br);
                } else if (HwBottomSheet.this.az != SheetState.COLLAPSED) {
                    HwBottomSheet hwBottomSheet5 = HwBottomSheet.this;
                    hwBottomSheet5.b(hwBottomSheet5.bj);
                }
                HwBottomSheet.this.d(SheetState.COLLAPSED);
                return;
            }
            if (Float.compare(HwBottomSheet.this.ay, 0.0f) < 0) {
                HwBottomSheet.this.d(SheetState.HIDDEN);
                HwBottomSheet.this.u.setVisibility(4);
                return;
            }
            if (HwBottomSheet.this.az == SheetState.EXPANDED) {
                HwBottomSheet hwBottomSheet6 = HwBottomSheet.this;
                hwBottomSheet6.b(hwBottomSheet6.bm);
            } else if (HwBottomSheet.this.az == SheetState.COLLAPSED) {
                HwBottomSheet hwBottomSheet7 = HwBottomSheet.this;
                hwBottomSheet7.b(hwBottomSheet7.bi);
            }
            HwBottomSheet.this.d(SheetState.ANCHORED);
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (view == null) {
                Log.w("HwBottomSheet", "clampViewPositionHorizontal: Parameter child is null!");
                return i;
            }
            int paddingLeft = HwBottomSheet.this.getPaddingLeft();
            int width = (HwBottomSheet.this.getWidth() - view.getWidth()) - HwBottomSheet.this.getPaddingRight();
            if (i < paddingLeft) {
                return paddingLeft;
            }
            return i < width ? i : width;
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            int iD = HwBottomSheet.this.d(0.0f);
            int iD2 = HwBottomSheet.this.d(1.0f);
            if (i < iD2) {
                i = iD2;
            }
            return i <= iD ? i : iD;
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            return HwBottomSheet.this.ar;
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            HwBottomSheet.this.t();
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (HwBottomSheet.this.d == null || HwBottomSheet.this.d.g() != 0) {
                return;
            }
            e();
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            HwBottomSheet.this.e(i2);
            HwBottomSheet.this.invalidate();
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            if (view == null) {
                Log.w("HwBottomSheet", "onViewReleased: Parameter releasedChild is null!");
                return;
            }
            int iE = HwBottomSheet.this.e(-f2);
            if (HwBottomSheet.this.d != null) {
                HwBottomSheet.this.settleCapturedViewAt(view.getLeft(), iE);
            }
            HwBottomSheet.this.invalidate();
        }

        @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (view != HwBottomSheet.this.u) {
                HwBottomSheet.this.n();
            }
            return !HwBottomSheet.this.ab && view == HwBottomSheet.this.u;
        }

        /* synthetic */ e(HwBottomSheet hwBottomSheet, d dVar) {
            this();
        }
    }

    public HwBottomSheet(Context context) {
        this(context, null);
    }

    private int b(int i, int i2) {
        return i > i2 ? i : i2;
    }

    private int getMaxIndicatorHeight() {
        int iB = b(b(b(this.bi.getIntrinsicHeight(), this.bk.getIntrinsicHeight()), this.bm.getIntrinsicHeight()), this.bj.getIntrinsicHeight());
        int intrinsicHeight = getResources().getDrawable(this.be).getIntrinsicHeight();
        int intrinsicHeight2 = getResources().getDrawable(this.bh).getIntrinsicHeight();
        return b(b(b(iB, intrinsicHeight), intrinsicHeight2), getResources().getDrawable(this.bl).getIntrinsicHeight());
    }

    private void p() {
        xgo xgoVar = this.f29275b;
        if (xgoVar == null) {
            return;
        }
        Rect rectE = xgoVar.e(this.ah);
        View view = this.ah;
        if (view != null) {
            view.setPadding(rectE.left, view.getPaddingTop(), rectE.right, this.ah.getPaddingBottom());
        }
        HwDragImageView hwDragImageView = this.aj;
        if (hwDragImageView != null && (hwDragImageView.getParent() instanceof ViewGroup) && this.n) {
            ((ViewGroup) this.aj.getParent()).setPadding(rectE.left, this.aj.getPaddingTop(), rectE.right, this.aj.getPaddingBottom());
        }
    }

    private void r() {
        View view = this.ah;
        if (view == null) {
            return;
        }
        this.f29275b.c(view.getPaddingLeft(), this.ah.getPaddingTop(), this.ah.getPaddingRight(), this.ah.getPaddingBottom());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    private void s() {
        int i = b.e[this.f29276c.ordinal()];
        float f = 1.0f;
        float f2 = 0.0f;
        if (i == 2) {
            f2 = 1.0f;
            f = 0.0f;
        } else if (i == 3) {
            f = 0.0f;
        } else if (i == 4) {
            f2 = 1.0f;
            f = 0.0f;
        }
        c(f, f2);
    }

    private void setDragContentExtraTopPadding(int i) {
        View view = this.ac;
        if (view == null) {
            return;
        }
        if (this.f != 1) {
            i = 0;
        }
        view.setPadding(view.getPaddingLeft(), this.f29274a + i, this.ac.getPaddingRight(), this.ac.getPaddingBottom());
    }

    private void setDragContentPadding(View view) {
        int i;
        if (this.ac != null || (i = this.al) == -1) {
            return;
        }
        View viewFindViewById = view.findViewById(i);
        this.ac = viewFindViewById;
        if (viewFindViewById == null) {
            Log.w("HwBottomSheet", "setDragContentPadding: Find a null mDragContentView!");
            return;
        }
        this.f29274a = viewFindViewById.getPaddingTop();
        if (this.f == 0) {
            return;
        }
        View view2 = this.ac;
        view2.setPadding(view2.getPaddingLeft(), this.ac.getPaddingTop() + this.aw, this.ac.getPaddingRight(), this.ac.getPaddingBottom());
    }

    private void setDragContentView(View view) {
        this.ac = view;
    }

    private void setDragView(int i) {
        this.aa = i;
        setDragView(findViewById(i));
    }

    private void setMiniBarView(View view) {
        if (view == null) {
            return;
        }
        this.ae = view;
        view.setOnClickListener(this.ao);
    }

    private void setMinibarLayoutParams(View view) {
        int i;
        if (this.ae != null || (i = this.af) == -1) {
            return;
        }
        View viewFindViewById = view.findViewById(i);
        this.ae = viewFindViewById;
        if (viewFindViewById == null) {
            Log.w("HwBottomSheet", "setMinibarLayoutParams: Find a null mMiniBarView!");
            return;
        }
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), this.ae.getPaddingTop(), this.ae.getPaddingRight(), this.ae.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = this.ae.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = marginLayoutParams.topMargin;
            int i3 = this.e;
            if (i2 != i3) {
                marginLayoutParams.topMargin = i3;
                this.ae.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private void setSheetHeightInternal(int i) {
        if (!this.an) {
            this.aw = i;
            return;
        }
        if (this.v) {
            i = b(this.e, i);
        }
        this.aw = i;
        setDragContentExtraTopPadding(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null || layoutParams == null) {
            Log.w("HwBottomSheet", "addView: Parameters are null!");
            return;
        }
        if (view.getId() != this.aa) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + this.aw);
            super.addView(view, layoutParams);
        } else {
            if (!this.an) {
                super.addView(view, layoutParams);
                return;
            }
            ViewGroup viewGroupE = e(view);
            if (viewGroupE == null) {
                Log.w("HwBottomSheet", "addView: indicator's layout might be null!");
            } else {
                super.addView(viewGroupE, layoutParams);
            }
        }
    }

    public void b(SheetSlideListener sheetSlideListener) {
        synchronized (this.au) {
            if (sheetSlideListener != null) {
                this.au.add(sheetSlideListener);
            }
        }
    }

    public boolean c() {
        return isEnabled() && this.ap && this.u != null && this.f29276c != SheetState.HIDDEN;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        HwViewDragHelper hwViewDragHelper = this.d;
        if (hwViewDragHelper == null || !hwViewDragHelper.c(true)) {
            b(0, getSheetState());
            c(0);
        } else if (isEnabled()) {
            postInvalidateOnAnimation();
        } else {
            this.d.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwBottomSheet", "dispatchTouchEvent:Parameter motionEvent is null!");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((this.ab && actionMasked != 0) || !c()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.am = x;
            this.aq = y;
            this.ai = false;
            this.w = false;
        } else if (actionMasked == 1) {
            if (this.ai) {
                this.d.d(0);
            }
            if (!o() && this.d.g() == 1) {
                boolean zOnTouchEvent = onTouchEvent(motionEvent);
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(3);
                super.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return zOnTouchEvent;
            }
        } else if (actionMasked == 2) {
            return a(x, y, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getAnchorPoint() {
        return this.bc;
    }

    public int getHeightGap() {
        return this.at;
    }

    public View getIndicateView() {
        return this.aj;
    }

    public int getLayoutType() {
        return this.f;
    }

    float getNormalSensitivity() {
        return 1.0f;
    }

    public int getSheetHeight() {
        return this.aw;
    }

    public SheetState getSheetState() {
        return this.f29276c;
    }

    View getSlidableView() {
        return this.u;
    }

    float getSlideOffset() {
        return this.ay;
    }

    public HwViewDragHelper getViewDragHelper() {
        return this.d;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f29275b.c(windowInsets);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
        this.bd = true;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getResources().getConfiguration().orientation == 2 && this.bc < 1.0f && this.f29276c == SheetState.ANCHORED) {
            this.f29276c = SheetState.EXPANDED;
        }
        if (this.r) {
            e(getContext());
        } else {
            c(getContext());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bd = true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        e(accessibilityEvent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwBottomSheet", "onInterceptTouchEvent:Parameter motionEvent is null!");
            return false;
        }
        if (!c() || this.ai || this.p) {
            c(motionEvent);
            this.d.c();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.d.g() == 1) {
                    this.d.e(motionEvent);
                    return true;
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.d.g() == 1) {
                        this.d.e(motionEvent);
                        return true;
                    }
                }
            } else if (!e(motionEvent)) {
                this.d.a();
                this.ab = true;
                n();
                return false;
            }
        } else if (!b(motionEvent)) {
            this.d.a();
            this.ab = true;
            return false;
        }
        return this.d.b(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.bd) {
            j();
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            a(i5, paddingLeft, paddingTop);
        }
        p();
        this.bd = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (!a(i, i2)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!this.k || (i3 = this.l) <= 0 || i3 >= size) {
            i3 = size;
        }
        int paddingLeft = (i3 - getPaddingLeft()) - getPaddingRight();
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = (paddingLeft2 - paddingLeft) / 2;
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            View view = this.u;
            if (childAt == view) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
                marginLayoutParams.setMarginStart(i4);
                marginLayoutParams.setMarginEnd(i4);
                this.u.setLayoutParams(marginLayoutParams);
                c(i5, paddingLeft, paddingTop);
            } else {
                c(i5, paddingLeft2, paddingTop);
            }
            View view2 = this.ae;
            if (view2 != null) {
                this.aw = view2.getMeasuredHeight() + this.e;
            }
            if (getChildAt(i5) == this.u) {
                q();
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            try {
                d(bundle);
                parcelable2 = bundle.getParcelable("superState");
                if (parcelable2 == null) {
                    Log.w("HwBottomSheet", "Superstate is null!");
                    return;
                }
            } catch (BadParcelableException unused) {
                Log.e("HwBottomSheet", "onRestoreInstanceState: Bad parcel target.");
                parcelable2 = null;
            }
        } else {
            parcelable2 = null;
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        try {
            bundle.putParcelable("superState", super.onSaveInstanceState());
            SheetState sheetState = this.az;
            SheetState sheetState2 = this.bg;
            if (sheetState != sheetState2) {
                sheetState2 = this.f29276c;
            }
            SheetState sheetState3 = this.d.d() ? this.az : this.bg;
            if (this.f29276c == SheetState.DRAGGING) {
                sheetState2 = sheetState3;
            }
            bundle.putSerializable("sliding_state", sheetState2);
            bundle.putSerializable("pre_idle_state", this.az);
            bundle.putSerializable("sheet_anchor_point", Float.valueOf(this.bc));
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("HwBottomSheet", "onSaveInstanceState: Bad parcel target.");
            return bundle;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 == i4 && i == i3) {
            return;
        }
        this.bd = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !c() || this.p) {
            return super.onTouchEvent(motionEvent);
        }
        a(motionEvent);
        this.d.e(motionEvent);
        return true;
    }

    public void setAnchorPoint(float f) {
        if (f <= 0.0f || Float.compare(f, 1.0f) > 0) {
            return;
        }
        if (Float.compare(f, 1.0f) == 0 && Float.compare(this.bc, 1.0f) < 0 && this.f29276c == SheetState.ANCHORED) {
            d(SheetState.EXPANDED);
        }
        this.bc = f;
        this.bd = true;
        requestLayout();
    }

    public void setColumnEnabled(boolean z) {
        this.k = z;
        requestLayout();
    }

    public void setDisallowInterceptTouchEvent(boolean z) {
        this.p = z;
    }

    public void setDragViewBackgroundColor(int i) {
        View view = this.ah;
        if (view == null) {
            return;
        }
        if (view.getBackground() instanceof ColorDrawable) {
            this.ah.setBackgroundColor(i);
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                this.ah.getBackground().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
                return;
            }
            Drawable background = this.ah.getBackground();
            f$$ExternalSyntheticApiModelOutline0.m$2();
            background.setColorFilter(f$$ExternalSyntheticApiModelOutline0.m(i, BlendMode.SRC_ATOP));
        }
    }

    public void setForceShowIndicateEnabled(boolean z) {
        if (this.ae != null) {
            Log.w("HwBottomSheet", "setFocusShowIndicate: we have mini bar, must show indicate view focused!");
        } else {
            this.v = z;
            setSheetHeight(this.aw);
        }
    }

    public void setHeightGap(int i) {
        this.at = i;
        q();
        requestLayout();
    }

    public void setIndicateEnable(boolean z) {
        if (this.an != z) {
            this.an = z;
            requestLayout();
        }
    }

    public void setIndicateSafeInsetsEnabled(boolean z) {
        if (this.n != z) {
            this.n = z;
            requestLayout();
        }
    }

    public void setLayoutType(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        View view = this.ac;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), this.f29274a + (i == 1 ? this.aw : 0), this.ac.getPaddingRight(), this.ac.getPaddingBottom());
        }
        requestLayout();
    }

    public void setObtainTouchEvent(boolean z) {
        this.w = z;
    }

    public void setScrollableView(View view) {
        if (view == null) {
            Log.w("HwBottomSheet", "setScrollableView: scrollable view in bottom sheet is null!");
        }
        this.ak = view;
    }

    public void setSheetHeight(int i) {
        if (i < 0) {
            return;
        }
        q();
        setSheetHeightInternal(i);
        requestLayout();
    }

    public void setSheetState(SheetState sheetState) {
        this.bg = sheetState;
        e(sheetState, false);
    }

    public void setTouchEnabled(boolean z) {
        this.ap = z;
    }

    void settleCapturedViewAt(int i, int i2) {
        this.d.e(i, i2);
    }

    public HwBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(Context context) {
        this.o = new HwColumnSystem(context);
        this.r = false;
        c(context);
    }

    private void i() {
        SheetState sheetState = this.f29276c;
        if (sheetState == SheetState.EXPANDED) {
            this.ay = 1.0f;
            return;
        }
        if (sheetState == SheetState.ANCHORED) {
            this.ay = this.bc;
        } else if (sheetState == SheetState.HIDDEN) {
            this.ay = b(d(0.0f) + this.aw);
        } else {
            this.ay = 0.0f;
        }
    }

    private void j() {
        s();
        i();
        h();
    }

    private ViewGroup k() {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hwbottomsheet_indicate_layout, (ViewGroup) null);
        if (viewInflate instanceof ViewGroup) {
            return (ViewGroup) viewInflate;
        }
        Log.w("HwBottomSheet", "inflateIndicateLayout: Inflater might be null!");
        return null;
    }

    private void l() {
        int i = this.aa;
        if (i != -1) {
            setDragView(findViewById(i));
        } else {
            Log.e("HwBottomSheet", "mDragViewResId is null!");
        }
        int i2 = this.al;
        if (i2 != -1) {
            setDragContentView(findViewById(i2));
        }
        int i3 = this.ag;
        if (i3 != -1) {
            setScrollableView(findViewById(i3));
        }
        int i4 = this.af;
        if (i4 != -1) {
            setMiniBarView(findViewById(i4));
        }
    }

    private boolean m() {
        return (this.av != -1 && this.ba != -1) && (this.bb != -1 && this.bf != -1) && (this.bl != -1 && this.bh != -1 && this.be != -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        HwDragImageView hwDragImageView = this.aj;
        if (hwDragImageView == null || !hwDragImageView.a() || this.w) {
            return;
        }
        e(this.f29276c);
    }

    private boolean o() {
        int top = this.ah.getTop();
        return top == d(1.0f) || top == d(this.bc) || top == d(0.0f);
    }

    private void q() {
        View view = this.u;
        if (view != null) {
            this.ar = (view.getMeasuredHeight() - this.aw) - this.at;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                return;
            }
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    boolean e() {
        return this.d.g() == 1;
    }

    boolean f() {
        return this.w;
    }

    boolean g() {
        return this.ad;
    }

    public HwBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = false;
        this.z = false;
        this.aa = -1;
        this.an = true;
        this.av = -1;
        this.ba = -1;
        this.bb = -1;
        this.bf = -1;
        this.be = -1;
        this.bh = -1;
        this.bl = -1;
        this.f29275b = new xgo(this);
        SheetState sheetState = SheetState.COLLAPSED;
        this.f29276c = sheetState;
        this.f29274a = 0;
        this.g = -1;
        this.f = 1;
        this.h = "";
        this.i = "";
        this.m = "";
        this.n = false;
        this.p = false;
        this.v = true;
        this.w = false;
        this.x = null;
        this.ai = false;
        this.au = new ArrayList(5);
        this.aw = -1;
        this.bc = 1.0f;
        this.az = sheetState;
        this.bg = sheetState;
        this.bd = true;
        c(context, attributeSet);
    }

    private void d(Context context) {
        this.i = context.getString(R.string.indicate_anchored);
        this.h = context.getString(R.string.indicate_collapsed);
        this.m = context.getString(R.string.indicate_expanded);
    }

    private void setDragView(View view) {
        View view2 = this.ah;
        if (view2 != null) {
            view2.setOnClickListener(null);
            this.f29275b.c(this.ah.getPaddingLeft(), this.ah.getPaddingTop(), this.ah.getPaddingRight(), this.ah.getPaddingBottom());
        } else {
            Log.e("HwBottomSheet", "mDragView is null!");
        }
        this.ah = view;
        if (view != null) {
            view.setClickable(true);
            this.ah.setOnClickListener(this.ao);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    HwViewDragHelper a() {
        return HwViewDragHelper.d(this, 1.0f, new e(this, null));
    }

    private void a(MotionEvent motionEvent) {
        if (d(motionEvent)) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            e(this.az);
        }
    }

    private void e(Context context) {
        this.o.d(19);
        this.o.d(context, this.t, this.s, this.q);
        this.l = this.o.g();
    }

    private void h() {
        if (!this.an || this.aj == null) {
            return;
        }
        int i = b.e[this.f29276c.ordinal()];
        if (i == 1) {
            this.aj.setImageResource(this.bl);
        } else if (i == 2) {
            this.aj.setImageResource(this.bh);
        } else {
            if (i != 4) {
                return;
            }
            this.aj.setImageResource(this.be);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f29277a = {android.R.attr.layout_weight};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f29278c;

        public LayoutParams() {
            super(-1, -1);
            this.f29278c = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f29278c = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29278c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29278c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29277a);
            if (typedArrayObtainStyledAttributes != null) {
                this.f29278c = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private boolean e(MotionEvent motionEvent) {
        float fAbs = Math.abs(motionEvent.getX() - this.as);
        return fAbs <= ((float) this.d.h()) || fAbs <= Math.abs(motionEvent.getY() - this.ax);
    }

    private void c(Context context, AttributeSet attributeSet) {
        d(context, attributeSet);
        this.f29275b.d(context, attributeSet);
        int dimension = (int) getResources().getDimension(R.dimen.hwbottomsheet_indicate_height);
        this.e = dimension;
        this.aw = this.v ? b(this.aw, dimension) : this.aw;
        this.ap = true;
        this.ao = new a(this, null);
        this.d = a();
        d(context, context.getResources());
        d(context);
        b(context);
    }

    private void d(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwBottomSheet);
        this.aa = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwDragView, -1);
        this.ag = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwScrollableView, -1);
        this.af = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwMinbarView, -1);
        this.al = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwDragContentView, -1);
        this.bc = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwBottomSheet_hwAnchorPoint, 1.0f);
        this.an = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomSheet_hwIndicateEnable, true);
        this.at = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomSheet_hwHeightGap, d(8));
        this.v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomSheet_hwForceShowIndicateEnable, true);
        this.n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomSheet_hwIndicateSafeInsetsEnabled, false);
        this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.HwBottomSheet_hwLayoutType, 1);
        this.aw = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwBottomSheet_hwSheetHeight, d(48));
        this.f29276c = SheetState.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.HwBottomSheet_hwInitialState, SheetState.COLLAPSED.getStateValue())];
        if (getResources().getConfiguration().orientation == 2 && this.bc < 1.0f && this.f29276c == SheetState.ANCHORED) {
            this.f29276c = SheetState.EXPANDED;
        }
        this.av = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateUpToMiddleDrawable, -1);
        this.ba = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateMiddleToDownDrawable, -1);
        this.bb = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateDownToMiddleDrawable, -1);
        this.bf = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateMiddleToUpDrawable, -1);
        this.bl = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateUpDrawable, -1);
        this.bh = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateMiddleDrawable, -1);
        this.be = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwBottomSheet_hwIndicateDownDrawable, -1);
        this.k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwBottomSheet_hwColumnEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean c(SheetState sheetState) {
        return !this.y && this.z && SheetState.DRAGGING.equals(sheetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        SheetState sheetState = this.f29276c;
        SheetState sheetState2 = SheetState.DRAGGING;
        if (sheetState != sheetState2) {
            this.az = sheetState;
        }
        d(sheetState2);
        this.ay = b(i);
        a(i);
        float fB = b();
        float f = this.ay * 7.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        c(1.0f - f, fB);
        a(this.u);
    }

    private void a(int i) {
        float fB = b(this.j);
        float fB2 = b(i);
        float f = getResources().getConfiguration().orientation == 2 ? 1.0f : this.bc;
        if (Float.compare(f, 1.0f) < 0) {
            b(fB, fB2, f);
        } else if (Float.compare(f, 1.0f) == 0) {
            e(fB, fB2, f);
        }
        this.j = i;
    }

    private void j(int i) {
        this.g = i;
        if (this.d.d()) {
            sendAccessibilityEvent(16384);
        }
    }

    private void c(Context context) {
        this.o.d(19);
        this.o.b(context);
        this.l = this.o.g();
    }

    private void c(MotionEvent motionEvent) {
        if (d(motionEvent)) {
            return;
        }
        e(this.az);
    }

    private void d(Context context, Resources resources) {
        boolean zM = m();
        this.ad = zM;
        if (!zM) {
            this.be = R.drawable.hwbottomsheet_indicate_down_with_anim;
            this.bl = R.drawable.hwbottomsheet_indicate_up_with_anim;
            this.bh = R.drawable.hwbottomsheet_indicate_middle_with_anim;
            this.bi = context.getDrawable(R.drawable.hwbottomsheet_up_middle_anim);
            this.bk = context.getDrawable(R.drawable.hwbottomsheet_middle_down_anim);
            this.bm = context.getDrawable(R.drawable.hwbottomsheet_dowm_middle_anim);
            this.bj = context.getDrawable(R.drawable.hwbottomsheet_middle_up_anim);
            this.bq = context.getDrawable(R.drawable.hwbottomsheet_up_down_anim);
            this.br = context.getDrawable(R.drawable.hwbottomsheet_down_up_anim);
            return;
        }
        this.bi = getResources().getDrawable(this.av);
        this.bk = getResources().getDrawable(this.ba);
        this.bm = getResources().getDrawable(this.bb);
        this.bj = getResources().getDrawable(this.bf);
        this.e = getMaxIndicatorHeight();
    }

    private void e(SheetState sheetState) {
        this.aj.a(this.aj.d(sheetState), false);
        this.aj.e();
        this.aj.b();
    }

    float b() {
        if (Float.compare(this.bc, 0.0f) == 0) {
            return 0.0f;
        }
        return this.ay / this.bc;
    }

    private void c(int i) {
        try {
            Class<?> cls = Class.forName("android.view.SceneUtil");
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("notifyAnimationState", String.class, cls2, cls2, cls2).invoke(null, "HWBOTTOMSHEET_SCROLL", Integer.valueOf(i), -1, Integer.valueOf(hashCode()));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            Log.w("HwBottomSheet", "notifyPageScrollToUifwk class or method not found");
        } catch (IllegalAccessException unused2) {
            Log.w("HwBottomSheet", "notifyPageScrollToUifwk illegal access");
        } catch (IllegalArgumentException unused3) {
            Log.w("HwBottomSheet", "notifyPageScrollToUifwk illegal argument");
        } catch (SecurityException unused4) {
            Log.w("HwBottomSheet", "notifyPageScrollToUifwk not secure");
        } catch (InvocationTargetException unused5) {
            Log.w("HwBottomSheet", "notifyPageScrollToUifwk target error");
        }
        Log.d("HwBottomSheet", "notifyPageScrollToIaware " + i + " done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SheetState sheetState, boolean z) {
        if (a(sheetState)) {
            this.d.a(z);
            if (this.d.g() == 2) {
                this.d.c();
            }
            if (this.bd) {
                d(sheetState);
                return;
            }
            if (this.f29276c == SheetState.HIDDEN) {
                this.u.setVisibility(0);
                requestLayout();
            }
            int i = b.e[sheetState.ordinal()];
            if (i == 1) {
                e(0.0f, 0);
                return;
            }
            if (i == 2) {
                e(this.bc, 0);
            } else if (i == 3) {
                e(b(d(0.0f) + this.aw), 0);
            } else {
                if (i != 4) {
                    return;
                }
                e(1.0f, 0);
            }
        }
    }

    private int d(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    private boolean a(SheetState sheetState) {
        SheetState sheetState2;
        return (isEnabled() || this.f29276c != sheetState) && sheetState != null && sheetState != (sheetState2 = SheetState.DRAGGING) && (this.bd || this.u != null) && this.f29276c != sheetState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(float f) {
        return ((getMeasuredHeight() - getPaddingBottom()) - this.aw) - ((int) (f * this.ar));
    }

    private void c(int i, int i2, int i3) {
        View childAt = getChildAt(i);
        if (childAt == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (!(childAt.getVisibility() == 8 && i == 0) && (layoutParams instanceof LayoutParams)) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (childAt == this.u) {
                i3 -= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            }
            childAt.measure(a(layoutParams2, i2), e(layoutParams2, i3));
        }
    }

    private int a(LayoutParams layoutParams, int i) {
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
        if (i2 == -2) {
            return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        if (i2 == -1) {
            return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        }
        Log.i("HwBottomSheet", "layoutParams width is others");
        return View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).width, 1073741824);
    }

    boolean e(float f, int i) {
        View view;
        if (!isEnabled() || (view = this.u) == null || !this.d.e(view, view.getLeft(), d(f))) {
            return false;
        }
        b(1, getSheetState());
        t();
        postInvalidateOnAnimation();
        c(1);
        return true;
    }

    private boolean a(int i, int i2) {
        if (getChildCount() != 2) {
            Log.e("HwBottomSheet", "checkMeasureSpec:Child count must be 2");
            return false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            Log.e("HwBottomSheet", "checkMeasureSpec: Width must have an exact value or match parent.");
            return false;
        }
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            Log.e("HwBottomSheet", "checkMeasureSpec: Height must have an exact value or match parent");
            return false;
        }
        View childAt = getChildAt(1);
        this.u = childAt;
        if (childAt == null) {
            Log.e("HwBottomSheet", "the second view cannot be null.");
            return false;
        }
        if (this.ah == null) {
            setDragView(childAt);
        }
        if (this.u.getVisibility() != 0) {
            this.f29276c = SheetState.HIDDEN;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(int i) {
        int iD = d(0.0f);
        int i2 = this.ar;
        if (i2 == 0) {
            return 0.0f;
        }
        return (iD - i) / i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SheetState sheetState) {
        SheetState sheetState2 = this.f29276c;
        if (sheetState2 == sheetState) {
            return;
        }
        b(this, sheetState2, sheetState);
        this.f29276c = sheetState;
        View view = this.ac;
        if (view == null) {
            return;
        }
        if (sheetState == SheetState.COLLAPSED) {
            view.setOnClickListener(this.ao);
        } else {
            view.setOnClickListener(null);
        }
    }

    private void b(View view, SheetState sheetState, SheetState sheetState2) {
        synchronized (this.au) {
            Iterator<SheetSlideListener> it = this.au.iterator();
            while (it.hasNext()) {
                it.next().onSheetStateChanged(view, sheetState, sheetState2);
            }
            HwDragImageView hwDragImageView = this.aj;
            if (hwDragImageView != null) {
                hwDragImageView.d();
            }
        }
    }

    private boolean b(MotionEvent motionEvent) {
        this.ab = false;
        this.as = motionEvent.getX();
        float y = motionEvent.getY();
        this.ax = y;
        return c(this.ah, (int) this.as, (int) y);
    }

    private boolean b(float f, float f2) {
        return Math.abs(f) > Math.abs(f2);
    }

    private void b(float f, float f2, float f3) {
        float f4 = (1.0f + f3) / 2.0f;
        float f5 = f3 / 2.0f;
        if (Float.compare(f2, f4) > 0 && Float.compare(f, f4) <= 0) {
            j(0);
            return;
        }
        if (Float.compare(f2, f4) <= 0 && Float.compare(f, f4) > 0) {
            j(1);
            return;
        }
        if (Float.compare(f2, f5) > 0 && Float.compare(f, f5) <= 0) {
            j(1);
        } else {
            if (Float.compare(f2, f5) > 0 || Float.compare(f, f5) <= 0) {
                return;
            }
            j(2);
        }
    }

    private int e(LayoutParams layoutParams, int i) {
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
        if (i2 == -2) {
            return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        float f = layoutParams.f29278c;
        if (f > 0.0f && f < 1.0f) {
            i = (int) (i * f);
        } else if (i2 != -1) {
            i = i2;
        } else {
            Log.i("HwBottomSheet", "Do Nothing default height = height!");
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    private void a(View view) {
        synchronized (this.au) {
            Iterator<SheetSlideListener> it = this.au.iterator();
            while (it.hasNext()) {
                it.next().onSheetSlide(view, this.ay);
            }
        }
    }

    private void a(int i, int i2, int i3) {
        View childAt = getChildAt(i);
        if (childAt == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (childAt == this.u) {
                i3 = d(this.ay);
            }
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = i2 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            childAt.layout(i4, i3, childAt.getMeasuredWidth() + i4, measuredHeight + i3);
        }
    }

    private void c(float f, float f2) {
        HwDragImageView hwDragImageView;
        HwDragImageView hwDragImageView2;
        HwDragImageView hwDragImageView3;
        View view = this.ae;
        if (view == null || this.ac == null) {
            return;
        }
        view.setAlpha(f);
        this.ac.setAlpha(f2);
        if (this.an && (hwDragImageView3 = this.aj) != null) {
            hwDragImageView3.setAlpha(f2);
        }
        if (Float.compare(f, 0.0f) == 0) {
            this.ae.setVisibility(8);
            if (this.an && (hwDragImageView2 = this.aj) != null) {
                hwDragImageView2.setVisibility(0);
            }
        } else {
            this.ae.setVisibility(0);
            if (this.an && (hwDragImageView = this.aj) != null) {
                hwDragImageView.setVisibility(8);
            }
        }
        if (Float.compare(f2, 0.0f) == 0) {
            this.ac.setVisibility(8);
        } else {
            this.ac.setVisibility(0);
        }
    }

    private boolean d(MotionEvent motionEvent) {
        HwDragImageView hwDragImageView;
        return motionEvent == null || (hwDragImageView = this.aj) == null || !hwDragImageView.a();
    }

    private boolean a(float f, float f2, MotionEvent motionEvent) {
        float f3 = this.am;
        float f4 = f2 - this.aq;
        this.am = f;
        this.aq = f2;
        if (b(f - f3, f4) || !c(this.ak, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (f4 > 0.0f) {
            if (xdu.c(this.ak, true) > 0 && this.d.g() != 1) {
                this.ai = true;
                this.x = motionEvent;
                return super.dispatchTouchEvent(motionEvent);
            }
            if (this.ai) {
                this.w = true;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(3);
                super.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                motionEvent.setAction(0);
            }
            this.ai = false;
            return onTouchEvent(motionEvent);
        }
        if (f4 >= 0.0f) {
            Log.i("HwBottomSheet", "dispatchActionMove will not respond");
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.ay < 1.0f) {
            MotionEvent motionEvent2 = this.x;
            if (motionEvent2 != null) {
                this.d.c(motionEvent2);
                this.x = null;
            }
            this.ai = false;
            return onTouchEvent(motionEvent);
        }
        if (!this.ai && this.d.g() == 1) {
            this.d.a();
            this.w = true;
            motionEvent.setAction(0);
        }
        this.ai = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean c(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = iArr[0] + i;
        int i4 = iArr2[0];
        boolean z = i3 >= i4 && i3 < i4 + view.getWidth();
        int i5 = iArr[1] + i2;
        int i6 = iArr2[1];
        return z && (i5 >= i6 && i5 < i6 + view.getHeight());
    }

    private ViewGroup e(View view) {
        ViewGroup viewGroupK = k();
        if (viewGroupK == null) {
            Log.w("HwBottomSheet", "inflateDragView: indicator's layout might be null!");
            return null;
        }
        d(viewGroupK);
        setMinibarLayoutParams(view);
        setDragContentPadding(view);
        viewGroupK.addView(view, 0);
        return viewGroupK;
    }

    private void d(ViewGroup viewGroup) {
        HwDragImageView hwDragImageView = (HwDragImageView) viewGroup.findViewById(R.id.sheet_indicate);
        this.aj = hwDragImageView;
        if (hwDragImageView == null) {
            return;
        }
        hwDragImageView.setOnClickListener(this.ao);
        this.aj.b(this);
        HwViewDragHelper hwViewDragHelper = this.d;
        if (hwViewDragHelper != null) {
            hwViewDragHelper.e(new d());
        }
        if (this.ad) {
            this.aj.getLayoutParams().height = this.e;
        }
    }

    private void b(int i, SheetState sheetState) {
        if (sheetState == null) {
            return;
        }
        String str = "setJankSceneStart";
        int i2 = 86;
        if (i == 1 && SheetState.COLLAPSED.equals(sheetState)) {
            this.y = true;
            this.z = false;
        } else {
            if (this.y && i == 0 && (SheetState.EXPANDED.equals(sheetState) || SheetState.ANCHORED.equals(sheetState))) {
                this.y = false;
                this.z = true;
            } else {
                i2 = 87;
                if ((i == 1 && SheetState.EXPANDED.equals(sheetState)) || c(sheetState)) {
                    this.y = true;
                    this.z = true;
                } else {
                    if (!this.y || i != 0 || !SheetState.COLLAPSED.equals(sheetState)) {
                        return;
                    }
                    this.y = false;
                    this.z = false;
                }
            }
            str = "setJankSceneEnd";
        }
        d(i, i2, str);
    }

    private void d(int i, int i2, String str) {
        try {
            Object objInvoke = Class.forName("android.common.HwFrameworkFactory").getMethod("getHwViewRootImpl", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return;
            }
            if (Objects.equals(str, "setJankSceneStart")) {
                Class<?> cls = objInvoke.getClass();
                Class cls2 = Integer.TYPE;
                cls.getMethod(str, cls2, cls2).invoke(objInvoke, Integer.valueOf(i2), 2);
            }
            if (Objects.equals(str, "setJankSceneEnd")) {
                objInvoke.getClass().getMethod(str, Integer.TYPE).invoke(objInvoke, Integer.valueOf(i2));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            Log.e("HwBottomSheet", "HwFrameworkFactory class or getHwViewRootImpl method not found");
        } catch (IllegalAccessException unused2) {
            Log.e("HwBottomSheet", "no access getHwViewRootImpl or setJankSceneEnd or setJankSceneStart rights");
        } catch (InvocationTargetException unused3) {
            Log.e("HwBottomSheet", "invoke method getHwViewRootImpl or setJankSceneEnd or setJankSceneStart exception");
        }
        Log.d("HwBottomSheet", "executeAnimationDotting " + i + " done");
    }

    private void d(Bundle bundle) {
        Serializable serializable = bundle.getSerializable("sliding_state");
        if (serializable instanceof SheetState) {
            this.f29276c = (SheetState) serializable;
        } else {
            this.f29276c = SheetState.COLLAPSED;
        }
        Serializable serializable2 = bundle.getSerializable("pre_idle_state");
        if (serializable2 instanceof SheetState) {
            this.az = (SheetState) serializable2;
        } else {
            this.az = SheetState.COLLAPSED;
        }
        Serializable serializable3 = bundle.getSerializable("sheet_anchor_point");
        if (serializable3 instanceof Float) {
            this.bc = ((Float) serializable3).floatValue();
        } else {
            this.bc = 1.0f;
        }
    }

    private void e(float f, float f2, float f3) {
        float f4 = f3 / 2.0f;
        if (Float.compare(f2, f4) > 0 && Float.compare(f, f4) <= 0) {
            j(0);
        } else {
            if (Float.compare(f2, f4) > 0 || Float.compare(f, f4) <= 0) {
                return;
            }
            j(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Drawable drawable) {
        HwDragImageView hwDragImageView = this.aj;
        if (hwDragImageView != null && drawable != null) {
            hwDragImageView.setImageDrawable(drawable);
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
                return;
            }
            return;
        }
        Log.w("HwBottomSheet", "startIndicatorAnimation: Indicate View or Indicator Drawable is null!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(float f) {
        float f2 = getResources().getConfiguration().orientation == 2 ? 1.0f : this.bc;
        if (f > 0.0f && Float.compare(this.ay, f2) <= 0) {
            return d(f2);
        }
        if (f > 0.0f && Float.compare(this.ay, f2) > 0) {
            return d(1.0f);
        }
        if (f < 0.0f && Float.compare(this.ay, f2) >= 0) {
            return d(f2);
        }
        if (f < 0.0f && Float.compare(this.ay, f2) < 0) {
            return d(0.0f);
        }
        if (Float.compare(this.ay, (f2 + 1.0f) / 2.0f) >= 0) {
            return d(1.0f);
        }
        if (Float.compare(this.ay, f2 / 2.0f) >= 0) {
            return d(f2);
        }
        return d(0.0f);
    }

    private void e(AccessibilityEvent accessibilityEvent) {
        String str;
        HwViewDragHelper hwViewDragHelper = this.d;
        boolean z = (hwViewDragHelper == null || hwViewDragHelper.g() == 0) ? false : true;
        if (accessibilityEvent.getEventType() == 16384 && z) {
            int i = this.g;
            if (i == 0) {
                str = this.m;
            } else if (i != 1) {
                str = i != 2 ? "" : this.h;
            } else {
                str = this.i;
            }
            accessibilityEvent.setClassName("HwBottomSheet");
            accessibilityEvent.getText().clear();
            accessibilityEvent.setContentDescription(str);
        }
    }

    e d() {
        return new e(this, null);
    }
}
