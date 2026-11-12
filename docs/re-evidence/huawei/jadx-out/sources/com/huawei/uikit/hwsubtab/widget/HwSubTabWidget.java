package com.huawei.uikit.hwsubtab.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.uikit.hweffect.engine.HwBlurable;
import com.huawei.uikit.hwsubtab.R;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;
import com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector;
import defpackage.xeh;
import defpackage.xen;
import defpackage.xeq;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xfu;
import defpackage.xfz;
import defpackage.xgo;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class HwSubTabWidget extends LinearLayout implements HwBlurable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29747a;
    private boolean aa;
    private int ab;
    private int ac;
    private Context ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private ColorStateList ao;
    private boolean ap;
    private xeq ar;
    private boolean as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ImageView f29748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HwSubTabViewContainer f29749c;
    protected Typeface d;
    protected Typeface e;
    private int f;
    private xgo g;
    private int h;
    private int i;
    private int j;
    private HwKeyEventDetector.OnGlobalNextTabEventListener k;
    private HwKeyEventDetector l;
    private ArgbEvaluator m;
    private HwKeyEventDetector.OnNextTabEventListener n;
    private ValueAnimator o;
    private int p;
    private boolean q;
    private String r;
    private int s;
    private boolean t;
    private xfz u;
    private HwSubTabViewContainer.SlidingTabStrip v;
    private float w;
    private xfz x;
    private b y;
    private OnSubTabChangeListener z;

    public interface OnSubTabChangeListener {
        void onSubTabReselected(xfz xfzVar);

        void onSubTabSelected(xfz xfzVar);

        void onSubTabUnselected(xfz xfzVar);
    }

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            HwSubTabWidget.this.f29749c.fullScroll(66);
            HwSubTabWidget.this.v.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static class avpbg extends View.BaseSavedState {
        public static final Parcelable.Creator<avpbg> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29753a;

        class c implements Parcelable.Creator<avpbg> {
            c() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public avpbg createFromParcel(Parcel parcel) {
                return new avpbg(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public avpbg[] newArray(int i) {
                return new avpbg[i];
            }
        }

        avpbg(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel == null) {
                Log.w("HwSubTabWidget", "Parameter dest of writeToParcel should not be null.");
            } else {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f29753a);
            }
        }

        avpbg(Parcel parcel) {
            super(parcel);
            this.f29753a = parcel.readInt();
        }

        public void a(int i) {
            this.f29753a = i;
        }

        public int a() {
            return this.f29753a;
        }
    }

    class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == null) {
                Log.w("HwSubTabWidget", "Parameter view of onClick should not be null.");
                return;
            }
            if (HwSubTabWidget.this.aa) {
                HwSubTabWidget.this.t = true;
                int childCount = HwSubTabWidget.this.v.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = HwSubTabWidget.this.v.getChildAt(i);
                    childAt.setSelected(childAt == view);
                    if (childAt == view && HwSubTabWidget.this.f == 0) {
                        HwSubTabWidget.this.f29749c.e(i);
                    }
                }
                if (view instanceof SubTabView) {
                    ((SubTabView) view).getSubTab().h();
                }
            }
        }

        /* synthetic */ b(HwSubTabWidget hwSubTabWidget, a aVar) {
            this();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubTabView f29754a;
        final /* synthetic */ SubTabView d;

        c(SubTabView subTabView, SubTabView subTabView2) {
            this.f29754a = subTabView;
            this.d = subTabView2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HwSubTabWidget.this.f29749c.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            if (HwSubTabWidget.this.q) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            HwSubTabWidget.this.e(animatedFraction, this.f29754a, this.d);
            HwSubTabWidget.this.d(animatedFraction, this.f29754a, this.d);
        }
    }

    class d implements HwKeyEventDetector.OnNextTabEventListener {
        d() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector.OnNextTabEventListener
        public boolean onNextTab(int i, KeyEvent keyEvent) {
            if (i == 1) {
                HwSubTabWidget.this.j();
            }
            return true;
        }
    }

    class e implements HwKeyEventDetector.OnGlobalNextTabEventListener {
        e() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector.OnGlobalNextTabEventListener
        public boolean onGlobalNextTab(int i, KeyEvent keyEvent) {
            if (i == 1) {
                HwSubTabWidget.this.j();
            }
            return true;
        }
    }

    public HwSubTabWidget(Context context) {
        this(context, null);
    }

    private void setSubTitleTextSize(int i) {
        this.al = i;
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            setExtendedNextTabEnabled(true, true);
            setExtendedNextTabEnabled(false, true);
            return;
        }
        Boolean bool = Boolean.TRUE;
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "switchTabEnabled", bool});
        if (objC instanceof Boolean) {
            setExtendedNextTabEnabled(true, ((Boolean) objC).booleanValue());
        } else {
            setExtendedNextTabEnabled(true, true);
        }
        Object objC2 = xeh.c((Object) null, methodC, new Object[]{context, this, "switchTabWhenFocusedEnabled", bool});
        if (objC2 instanceof Boolean) {
            setExtendedNextTabEnabled(false, ((Boolean) objC2).booleanValue());
        } else {
            setExtendedNextTabEnabled(false, true);
        }
    }

    public xfz a(int i) {
        View childAt = this.v.getChildAt(i);
        if (childAt instanceof SubTabView) {
            return ((SubTabView) childAt).getSubTab();
        }
        return null;
    }

    public void a(xfz xfzVar) {
        if (this.q) {
            return;
        }
        Context context = this.ad;
        FragmentTransaction fragmentTransactionDisallowAddToBackStack = context instanceof FragmentActivity ? ((FragmentActivity) context).getSupportFragmentManager().beginTransaction().disallowAddToBackStack() : null;
        xfz xfzVar2 = this.x;
        if ((xfzVar2 == null || xfzVar2.c() == -1) && xfzVar != null && xfzVar.c() != -1) {
            this.f29749c.setScrollPosition(xfzVar.c(), 0.0f);
        }
        if (this.x == xfzVar) {
            e(fragmentTransactionDisallowAddToBackStack);
        } else {
            d(xfzVar, fragmentTransactionDisallowAddToBackStack);
        }
        if (fragmentTransactionDisallowAddToBackStack == null || fragmentTransactionDisallowAddToBackStack.isEmpty()) {
            return;
        }
        fragmentTransactionDisallowAddToBackStack.commit();
    }

    public boolean a() {
        return this.t;
    }

    protected SubTabView b(xfz xfzVar) {
        return new SubTabView(getContext(), xfzVar);
    }

    protected HwKeyEventDetector.OnGlobalNextTabEventListener b() {
        return new e();
    }

    public void b(int i) {
        if (this.v == null) {
            return;
        }
        xfz xfzVarA = a(i);
        if (xfzVarA != null) {
            xfzVarA.b(-1);
        }
        this.v.removeViewAt(i);
        if (getSubTabCount() == 0) {
            this.u = null;
            this.x = null;
        }
        e(i, getSubTabCount(), false);
        if (xfzVarA == this.x) {
            int i2 = i - 1;
            xfz xfzVarA2 = a(i2 > 0 ? i2 : 0);
            if (xfzVarA2 != null) {
                a(xfzVarA2);
                c(xfzVarA2);
            }
        }
    }

    public SubTabView c(int i) {
        View childAt = this.v.getChildAt(i);
        if (childAt instanceof SubTabView) {
            return (SubTabView) childAt;
        }
        return null;
    }

    protected HwKeyEventDetector.OnNextTabEventListener c() {
        return new d();
    }

    public void c(xfz xfzVar) {
        xfz xfzVar2;
        if (this.q) {
            return;
        }
        xfz xfzVar3 = this.x;
        if ((xfzVar3 == null || xfzVar3.c() == -1) && xfzVar.c() != -1) {
            this.f29749c.setScrollPosition(xfzVar.c(), 0.0f);
        }
        xfz xfzVar4 = this.x;
        if (xfzVar4 == xfzVar) {
            OnSubTabChangeListener onSubTabChangeListener = this.z;
            if (onSubTabChangeListener == null || xfzVar4 == null) {
                return;
            }
            onSubTabChangeListener.onSubTabReselected(xfzVar4);
            return;
        }
        if (xfzVar4 != null && this.f == 1) {
            j(xfzVar);
        }
        setSubTabSelectedInner(xfzVar.c());
        OnSubTabChangeListener onSubTabChangeListener2 = this.z;
        if (onSubTabChangeListener2 != null && (xfzVar2 = this.x) != null) {
            onSubTabChangeListener2.onSubTabUnselected(xfzVar2);
        }
        this.u = this.x;
        this.x = xfzVar;
        OnSubTabChangeListener onSubTabChangeListener3 = this.z;
        if (onSubTabChangeListener3 != null) {
            onSubTabChangeListener3.onSubTabSelected(xfzVar);
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
    public void c(xfz xfzVar, int i, boolean z) {
        if (xfzVar == null) {
            Log.w("HwSubTabWidget", "Parameter subTab of addSubTab should not be null.");
            return;
        }
        SubTabView subTabViewE = e(xfzVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMarginStart(this.af);
        layoutParams.setMarginEnd(this.af);
        subTabViewE.setLayoutParams(layoutParams);
        this.v.addView(subTabViewE, i, layoutParams);
        xfzVar.b(i);
        e(i, getSubTabCount(), true);
        if (z) {
            xfzVar.h();
            subTabViewE.setSelected(true);
            subTabViewE.setTextSize(0, this.p);
        } else {
            subTabViewE.setTextSize(0, this.ae);
        }
        setTabHorizontalPadding(subTabViewE);
    }

    public void d(int i, int i2) {
        if (this.f == 1) {
            this.ae = i;
            this.p = i2;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.ar.c((View) this)) {
            super.draw(canvas);
        } else {
            this.ar.c(canvas, this);
            super.dispatchDraw(canvas);
        }
    }

    protected HwKeyEventDetector e() {
        return new HwKeyEventDetector(this.ad);
    }

    public void e(int i) {
        SubTabView subTabViewC = c(i);
        if (subTabViewC != null) {
            subTabViewC.b();
            setTabHorizontalPadding(subTabViewC);
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0005  */
    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x000e -> B:4:0x0003). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:7:0x000b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void e(int r1, int r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L3
            goto Le
        L3:
            if (r1 >= r2) goto L11
            xfz r3 = r0.a(r1)
            if (r3 == 0) goto Le
            r3.b(r1)
        Le:
            int r1 = r1 + 1
            goto L3
        L11:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.e(int, int, boolean):void");
    }

    public xfz f() {
        return new xfz(this);
    }

    protected int g() {
        return this.h;
    }

    protected int getAdjustTriggerWidth() {
        return getMeasuredWidth() / 2;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public int getBlurColor() {
        return this.j;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public int getBlurType() {
        return this.i;
    }

    public int getFadingMargin() {
        return this.f29749c.getFadingMargin();
    }

    public int getFocusPathColor() {
        return this.s;
    }

    public int getIndicatorHeight() {
        return this.v.getSelectedIndicatorHeight();
    }

    public OnSubTabChangeListener getOnSubTabChangeListener() {
        return this.z;
    }

    public xfz getSelectedSubTab() {
        return this.x;
    }

    public int getSelectedSubTabPostion() {
        int subTabCount = getSubTabCount();
        for (int i = 0; i < subTabCount; i++) {
            if (this.x == a(i)) {
                return i;
            }
        }
        return -1;
    }

    public int getSubTabAppearance() {
        return this.f;
    }

    public HwSubTabViewContainer.SlidingTabStrip getSubTabContentView() {
        return this.v;
    }

    public int getSubTabCount() {
        return this.v.getChildCount();
    }

    public int getSubTabItemActivatedTextSize() {
        return this.p;
    }

    public int getSubTabItemMargin() {
        return this.af;
    }

    public int getSubTabItemPadding() {
        return this.ac;
    }

    public int getSubTabItemPaddingSecondary() {
        return this.ab;
    }

    public int getSubTabItemTextSize() {
        return this.ae;
    }

    public int getSubTabLeftScrollPadding() {
        return this.am;
    }

    public HwSubTabViewContainer getSubTabViewContainer() {
        return this.f29749c;
    }

    public int getSubTitleTextSize() {
        return this.al;
    }

    public void h() {
        HwSubTabViewContainer.SlidingTabStrip slidingTabStrip = this.v;
        if (slidingTabStrip == null) {
            return;
        }
        slidingTabStrip.removeAllViews();
        this.u = null;
        this.x = null;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public boolean isBlurEnable() {
        return this.ap;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.g.c(windowInsets);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        HwKeyEventDetector hwKeyEventDetector = this.l;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.c(this.n);
            this.l.c(this, this.k);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.as = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        HwKeyEventDetector hwKeyEventDetector = this.l;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        HwKeyEventDetector hwKeyEventDetector = this.l;
        if (hwKeyEventDetector == null || !hwKeyEventDetector.e(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        HwKeyEventDetector hwKeyEventDetector = this.l;
        if (hwKeyEventDetector == null || !hwKeyEventDetector.e(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.as) {
            xfz xfzVar = this.x;
            if (xfzVar != null && xfzVar.c() != -1) {
                setSubTabScrollingOffsets(this.x.c(), 0.0f);
                l();
            }
            this.as = false;
        }
        this.g.e(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.an, 1073741824);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), Integer.MIN_VALUE);
        this.v.measure(childMeasureSpec, iMakeMeasureSpec);
        this.f29749c.measure(childMeasureSpec, iMakeMeasureSpec);
        super.onMeasure(i, iMakeMeasureSpec);
        if (this.f == 0) {
            d();
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (this.ad.getApplicationInfo().targetSdkVersion <= 18) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        if (!(parcelable instanceof avpbg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        avpbg avpbgVar = (avpbg) parcelable;
        super.onRestoreInstanceState(avpbgVar.getSuperState());
        int i = avpbgVar.f29753a;
        if (i < 0 || i >= getSubTabCount()) {
            return;
        }
        xfz xfzVarA = a(i);
        if (xfzVarA != null) {
            xfzVarA.h();
        }
        SubTabView subTabViewC = c(i);
        if (subTabViewC != null) {
            subTabViewC.setSelected(true);
        }
        HwSubTabViewContainer hwSubTabViewContainer = this.f29749c;
        if (hwSubTabViewContainer != null) {
            hwSubTabViewContainer.e(i);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (this.ad.getApplicationInfo().targetSdkVersion <= 18) {
            return super.onSaveInstanceState();
        }
        int selectedSubTabPostion = getSelectedSubTabPostion();
        avpbg avpbgVar = new avpbg(super.onSaveInstanceState());
        avpbgVar.f29753a = selectedSubTabPostion;
        return avpbgVar;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            this.ar.b(this);
            return;
        }
        this.ar.c(this, this.i);
        this.ar.d(this, isBlurEnable());
        int i2 = this.j;
        if (i2 != -16777216) {
            this.ar.e(this, i2);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f29747a = z;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public void setBlurColor(int i) {
        this.j = i;
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public void setBlurEnable(boolean z) {
        this.ap = z;
        this.ar.d(this, isBlurEnable());
    }

    @Override // com.huawei.uikit.hweffect.engine.HwBlurable
    public void setBlurType(int i) {
        this.i = i;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.aa = z;
    }

    public void setConfigChange(boolean z) {
        this.as = z;
    }

    public void setExtendedNextTabEnabled(boolean z, boolean z2) {
        HwKeyEventDetector hwKeyEventDetector = this.l;
        if (hwKeyEventDetector == null) {
            return;
        }
        if (z) {
            if (!z2) {
                this.k = null;
                hwKeyEventDetector.c(this, null);
                return;
            } else {
                HwKeyEventDetector.OnGlobalNextTabEventListener onGlobalNextTabEventListenerB = b();
                this.k = onGlobalNextTabEventListenerB;
                this.l.c(this, onGlobalNextTabEventListenerB);
                return;
            }
        }
        if (!z2) {
            this.n = null;
            hwKeyEventDetector.c(null);
        } else {
            HwKeyEventDetector.OnNextTabEventListener onNextTabEventListenerC = c();
            this.n = onNextTabEventListenerC;
            this.l.c(onNextTabEventListenerC);
        }
    }

    public void setFocusPathColor(int i) {
        this.s = i;
    }

    public void setFunctionMenuContent(String str) {
        this.r = str;
    }

    public void setIndicatorColor(int i) {
        this.h = i;
        this.v.setSelectedIndicatorColor(i);
    }

    public void setIsNeedSafeInsets(boolean z) {
        this.g.c(z);
    }

    public void setIsViewPagerScroll(boolean z) {
        if (this.f == 0) {
            return;
        }
        this.q = z;
    }

    public void setOnSubTabChangeListener(OnSubTabChangeListener onSubTabChangeListener) {
        this.z = onSubTabChangeListener;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.g.c(i, i2, i3, i4);
    }

    public void setSubTabClicked(boolean z) {
        this.t = z;
    }

    public void setSubTabItemPadding(int i) {
        this.ac = i;
    }

    public void setSubTabItemPaddingSecondary(int i) {
        this.ab = i;
    }

    public void setSubTabItemTextColors(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        this.ao = colorStateList;
    }

    public void setSubTabLeftScrollPadding(int i) {
        this.am = i;
    }

    public void setSubTabScrollingOffsets(int i, float f) {
        this.f29749c.setScrollPosition(i, f);
        if (this.f != 1 || Float.compare(f, 0.0f) == 0) {
            return;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.o.cancel();
            m();
        }
        SubTabView subTabViewC = c(this.v.e);
        if (i >= this.v.e) {
            i++;
        }
        SubTabView subTabViewC2 = c(i);
        if (subTabViewC == null || subTabViewC2 == null) {
            return;
        }
        e(f, subTabViewC, subTabViewC2);
        d(f, subTabViewC, subTabViewC2);
    }

    public void setSubTabSelected(int i) {
        xfz xfzVarA = a(i);
        if (xfzVarA == null) {
            return;
        }
        xfz xfzVar = this.x;
        if (xfzVar == null || xfzVar.c() == -1) {
            this.f29749c.setScrollPosition(i, 0.0f);
        }
        if (this.f == 1 && this.x != xfzVarA) {
            a(xfzVarA);
        }
        this.x = xfzVarA;
        setSubTabSelectedInner(i);
    }

    protected void setSubTabSelectedInner(int i) {
        int childCount = this.v.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            SubTabView subTabViewC = c(i2);
            boolean z = i2 == i;
            if (subTabViewC != null) {
                subTabViewC.setTypeface(z ? this.e : this.d);
                subTabViewC.setSelected(z);
            }
            i2++;
        }
    }

    protected void setTabHorizontalPadding(SubTabView subTabView) {
        if (this.f == 0) {
            l();
        } else {
            subTabView.c();
        }
    }

    public HwSubTabWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSubTabBarStyle);
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        int dimensionPixelSize;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSubTabWidget, i, R.style.Widget_Emui_HwSubTabBar);
        if (k()) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwsubtab_height_larger);
            if (this.w == 3.2f && this.f == 0) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwsubtab_height_max);
            }
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwsubtab_height);
        }
        try {
            this.f29747a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwSubTabWidget_hwSubTabAnimationEnabled, true);
        } catch (UnsupportedOperationException unused) {
            this.f29747a = true;
        }
        try {
            try {
                this.an = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabHeight, dimensionPixelSize);
            } catch (UnsupportedOperationException unused2) {
                this.an = dimensionPixelSize;
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return Float.compare(this.w, 1.75f) >= 0 && xfu.c(this.ad);
    }

    private void l() {
        int childCount = this.v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.v.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).width = -2;
                if (childAt instanceof SubTabView) {
                    ((SubTabView) childAt).c();
                }
            }
        }
    }

    private void m() {
        SubTabView subTabViewC;
        xfz xfzVar = this.u;
        if (xfzVar == null || (subTabViewC = c(xfzVar.c())) == null) {
            return;
        }
        ColorStateList subTabColor = subTabViewC.getSubTabColor();
        if (subTabColor != null) {
            subTabViewC.setTextColor(subTabColor.getDefaultColor());
        }
        subTabViewC.setTextSize(0, this.ae);
    }

    public xfz b(CharSequence charSequence) {
        return new xfz(this, charSequence);
    }

    public HwSubTabWidget(Context context, AttributeSet attributeSet, int i) {
        super(c(context, i), attributeSet, i);
        this.s = 0;
        this.aa = true;
        this.am = 20;
        this.ar = xeq.c();
        this.ap = false;
        this.as = false;
        this.f29747a = true;
        this.j = -16777216;
        this.i = 4;
        this.f = 0;
        this.l = null;
        this.q = false;
        this.t = false;
        e(getContext(), attributeSet, i);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        View viewInflate;
        int dimensionPixelSize;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSubTabWidget, i, R.style.Widget_Emui_HwSubTabBar);
        this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.HwSubTabWidget_hwSubTabAppearance, 0);
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (layoutInflater == null) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (this.f == 1) {
            viewInflate = layoutInflater.inflate(R.layout.hwsubtab_content_headline, (ViewGroup) this, true);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline7);
        } else {
            viewInflate = layoutInflater.inflate(R.layout.hwsubtab_content, (ViewGroup) this, true);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwsubtab_text_size);
        }
        this.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabItemTextSize, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabItemActivedTextSize, getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline6));
        this.al = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTitleTextSize, getResources().getDimensionPixelSize(R.dimen.hwsubtab_text_sub_size));
        this.s = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSubTabWidget_hwFocusedPathColor, 0);
        this.f29749c = (HwSubTabViewContainer) viewInflate.findViewById(R.id.hwsubtab_view_container);
        this.f29748b = (ImageView) viewInflate.findViewById(R.id.hwsubtab_function_icon);
        this.v = this.f29749c.getTabStrip();
        e(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void e(Context context, TypedArray typedArray) {
        this.w = this.ad.getResources().getConfiguration().fontScale;
        if (k()) {
            this.v.setSelectedIndicatorMargin(getResources().getDimensionPixelSize(R.dimen.hwsubtab_item_line_padding_top));
        } else {
            this.v.setSelectedIndicatorMargin(getResources().getDimensionPixelSize(R.dimen.hwsubtab_margin));
        }
        this.v.setSelectedIndicatorHeight(typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabIndicatorHeight, getResources().getDimensionPixelSize(R.dimen.hwsubtab_indicator_height)));
        this.h = typedArray.getColor(R.styleable.HwSubTabWidget_hwSubTabIndicatorColor, ContextCompat.getColor(context, R.color.hwsubtab_accent));
        this.af = typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabItemMargin, getResources().getDimensionPixelSize(R.dimen.hwsubtab_item_margin));
        this.ac = typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabItemPadding, getResources().getDimensionPixelSize(R.dimen.hwsubtab_item_padding));
        this.ab = typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabItemPaddingSecondary, getResources().getDimensionPixelSize(R.dimen.hwsubtab_function_view_padding));
        this.ah = typedArray.getResourceId(R.styleable.HwSubTabWidget_hwSubTabItemBg, R.drawable.hwsubtab_selector_item_bg);
        this.ai = typedArray.getResourceId(R.styleable.HwSubTabWidget_hwSubTabFunctionViewBg, R.drawable.hwsubtab_selector_item_bg);
        this.ag = typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabItemMinWidth, 0);
        this.ao = typedArray.getColorStateList(R.styleable.HwSubTabWidget_hwSubTabItemTextColor);
        this.i = typedArray.getInteger(R.styleable.HwSubTabWidget_hwSubTabBlurType, 4);
        this.j = typedArray.getColor(R.styleable.HwSubTabWidget_hwSubTabBlurColor, -16777216);
        this.ak = typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabTextPaddingBottom, getResources().getDimensionPixelSize(R.dimen.hwsubtab_text_padding_bottom));
        this.aj = typedArray.getDimensionPixelSize(R.styleable.HwSubTabWidget_hwSubTabIconMarginBottom, getResources().getDimensionPixelSize(R.dimen.hwsubtab_icon_margin_bottom));
        this.f29749c.setSubTabFaddingEdgeColor(typedArray.getColor(R.styleable.HwSubTabWidget_hwSubTabFadingEdgeColor, 0));
    }

    public xfz a(CharSequence charSequence, HwSubTabListener hwSubTabListener, Object obj) {
        return new xfz(this, charSequence, null, hwSubTabListener, obj);
    }

    public class SubTabView extends TextView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f29752c;
        private xfz e;
        private ColorStateList f;
        private xen h;
        private int i;
        private Context j;

        public SubTabView(Context context, xfz xfzVar) {
            super(context, null, 0);
            this.f29750a = 6;
            this.f29751b = 2;
            this.i = 0;
            this.e = xfzVar;
            this.j = context;
            b(context);
        }

        private void b(Context context) {
            if (HwSubTabWidget.this.f == 0) {
                setGravity(17);
                c();
            }
            a(context, getResources().getConfiguration());
            setTextSize(0, HwSubTabWidget.this.ae);
            if (HwSubTabWidget.this.ao != null) {
                setTextColor(HwSubTabWidget.this.ao);
                this.f = HwSubTabWidget.this.ao;
            }
            setBackgroundResource(HwSubTabWidget.this.ah);
            setMinWidth(HwSubTabWidget.this.ag);
            setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            a();
            this.f29752c = getContext().getResources().getDisplayMetrics().density;
            xen xenVar = new xen();
            this.h = xenVar;
            xenVar.c(context, null, 0);
            this.h.c(1);
            this.h.setCallback(this);
        }

        private void h() {
            int i = getPaint().getFontMetricsInt().top;
            setPadding(getPaddingLeft(), ((HwSubTabWidget.this.an - HwSubTabWidget.this.ak) - (-i)) - (HwSubTabWidget.this.k() ? this.j.getResources().getDimensionPixelSize(R.dimen.hwsubtab_item_padding) : 0), getPaddingRight(), getPaddingBottom());
        }

        public void b() {
            a();
        }

        protected void c() {
            setPadding(HwSubTabWidget.this.ac, 0, HwSubTabWidget.this.ac, 0);
        }

        protected void d() {
            performClick();
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            super.draw(canvas);
            b(canvas);
        }

        protected void e() {
            if (!hasFocus()) {
                HwSubTabWidget.this.v.setSelectedIndicatorColor(HwSubTabWidget.this.h);
                return;
            }
            HwSubTabWidget.this.v.setSelectedIndicatorColor(HwSubTabWidget.this.g());
            xen eventBadgeDrawable = getEventBadgeDrawable();
            if (eventBadgeDrawable != null) {
                eventBadgeDrawable.a(0);
            }
            d();
        }

        public xen getEventBadgeDrawable() {
            return this.h;
        }

        public xfz getSubTab() {
            return this.e;
        }

        public ColorStateList getSubTabColor() {
            return this.f;
        }

        public int getTextPaddingLeft() {
            return this.i + getPaddingLeft();
        }

        public int getTextPaddingRight() {
            return this.i + getPaddingRight();
        }

        @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            super.invalidateDrawable(drawable);
            invalidate();
        }

        @Override // android.widget.TextView, android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            a(this.j, configuration);
        }

        @Override // android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            e();
            super.onFocusChanged(z, i, rect);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (accessibilityNodeInfo == null) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (HwSubTabWidget.this.onKeyDown(i, keyEvent)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            if (HwSubTabWidget.this.onKeyUp(i, keyEvent)) {
                return true;
            }
            return super.onKeyUp(i, keyEvent);
        }

        @Override // android.widget.TextView, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            if (HwSubTabWidget.this.f == 1) {
                h();
            }
            super.onLayout(z, i, i2, i3, i4);
            this.i = ((int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getPaint().measureText(this.e.f().toString()))) / 2;
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent == null) {
                Log.w("HwSubTabWidget", "onTouchEvent: event is null!");
                return false;
            }
            if (motionEvent.getAction() == 1) {
                xen eventBadgeDrawable = getEventBadgeDrawable();
                if (eventBadgeDrawable != null) {
                    eventBadgeDrawable.a(0);
                }
                if (!isInTouchMode() && HwSubTabWidget.this.v.hasFocus()) {
                    requestFocus();
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setSubTabColor(ColorStateList colorStateList) {
            this.f = colorStateList;
            setTextColor(colorStateList);
        }

        private void a(Context context, Configuration configuration) {
            if (configuration.orientation == 1) {
                setMaxLines(1);
            }
            if (configuration.orientation == 2) {
                if (xft.d(context, 7, 1) == 4) {
                    setSingleLine(true);
                } else {
                    setMaxLines(1);
                }
            }
        }

        private void b(Canvas canvas) {
            Paint.FontMetrics fontMetrics;
            int i;
            float f;
            if (this.h == null || Float.compare(this.f29752c, 0.0f) <= 0) {
                return;
            }
            int paddingEnd = HwSubTabWidget.this.i() ? getPaddingEnd() - ((int) (this.f29752c * 8.0f)) : (getWidth() - getPaddingEnd()) + ((int) (this.f29752c * 2.0f));
            int i2 = (int) (this.f29752c * 6.0f);
            if (HwSubTabWidget.this.f == 0) {
                float height = getHeight() / 2.0f;
                f = this.f29752c;
                i = (int) (height - (3.0f * f));
            } else {
                TextPaint paint = getPaint();
                if (paint == null || (fontMetrics = paint.getFontMetrics()) == null) {
                    return;
                }
                int baseline = getBaseline();
                int i3 = (int) ((fontMetrics.top + fontMetrics.bottom) / 2.0f);
                float f2 = this.f29752c;
                i = (baseline + i3) - ((int) (3.0f * f2));
                f = f2;
            }
            this.h.setBounds(paddingEnd, i, i2 + paddingEnd, ((int) (f * 6.0f)) + i);
            this.h.draw(canvas);
        }

        private void a() {
            CharSequence charSequenceF = this.e.f();
            if (!TextUtils.isEmpty(charSequenceF)) {
                setText(charSequenceF);
                setVisibility(0);
            } else {
                setVisibility(8);
                setText((CharSequence) null);
            }
            if (this.e.i() != -1) {
                setId(this.e.i());
            }
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
    public void b(xfz xfzVar, boolean z) {
        if (xfzVar == null) {
            Log.w("HwSubTabWidget", "Parameter subTab of addSubTab should not be null.");
            return;
        }
        SubTabView subTabViewE = e(xfzVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        subTabViewE.setLayoutParams(layoutParams);
        layoutParams.setMarginStart(this.af);
        layoutParams.setMarginEnd(this.af);
        this.v.addView(subTabViewE, layoutParams);
        if (i()) {
            this.v.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        }
        xfzVar.b(getSubTabCount() - 1);
        if (z) {
            xfzVar.h();
            subTabViewE.setSelected(true);
            subTabViewE.setTextSize(0, this.f == 1 ? this.p : this.ae);
        } else {
            subTabViewE.setTextSize(0, this.ae);
        }
        setTabHorizontalPadding(subTabViewE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return getLayoutDirection() == 1;
    }

    private void j(xfz xfzVar) {
        int iC = this.x.c();
        int iC2 = xfzVar.c();
        SubTabView subTabViewC = c(iC);
        SubTabView subTabViewC2 = c(iC2);
        if (subTabViewC == null || subTabViewC2 == null) {
            return;
        }
        m();
        int scrollX = this.f29749c.getScrollX();
        int iD = d(xfzVar);
        if (!this.f29747a) {
            this.f29749c.scrollTo(iD, 0);
            e(1.0f, subTabViewC, subTabViewC2);
            d(1.0f, subTabViewC, subTabViewC2);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollX, iD);
        this.o = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(300L);
        this.o.setInterpolator(AnimationUtils.loadInterpolator(this.ad, R.interpolator.cubic_bezier_interpolator_type_20_80));
        this.o.addUpdateListener(new c(subTabViewC, subTabViewC2));
        this.o.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f, final SubTabView subTabView, final SubTabView subTabView2) {
        final float f2 = (this.p - this.ae) * f;
        post(new Runnable() { // from class: xgf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(subTabView, f2, subTabView2);
            }
        });
    }

    private SubTabView e(xfz xfzVar) {
        SubTabView subTabViewB = b(xfzVar);
        subTabViewB.setFocusable(true);
        if (this.y == null) {
            this.y = new b(this, null);
        }
        subTabViewB.setOnClickListener(this.y);
        return subTabViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        int i;
        xfz xfzVarA;
        if (this.v == null) {
            return false;
        }
        int selectedSubTabPostion = getSelectedSubTabPostion();
        int subTabCount = getSubTabCount();
        if (subTabCount <= 0 || (xfzVarA = a((i = (selectedSubTabPostion + 1) % subTabCount))) == null) {
            return false;
        }
        this.v.setSelectedIndicatorColor(this.h);
        a(xfzVarA);
        c(xfzVarA);
        this.v.setSelectedIndicatorColor(g());
        View childAt = this.v.getChildAt(i);
        if (childAt != null) {
            childAt.requestFocus();
        }
        return true;
    }

    private static Context c(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwSubTabWidget);
    }

    private void e(Context context, AttributeSet attributeSet, int i) {
        this.ad = context;
        this.g = new xgo(this);
        setOrientation(0);
        b(this.ad, attributeSet, i);
        d(context, attributeSet, i);
        this.f29749c.setAnimationEnabled(this.f29747a);
        this.e = Typeface.create(getResources().getString(R.string.emui_text_font_family_medium), 0);
        this.d = Typeface.create(getResources().getString(R.string.emui_text_font_family_regular), 0);
        this.v.setSelectedIndicatorColor(this.h);
        this.f29749c.setAppearance(this.f);
        this.f29749c.setSubTabItemMargin(this.af);
        this.l = e();
        this.m = new ArgbEvaluator();
        setValueFromPlume(context);
    }

    private void d(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        if (this.x != null && this.f == 1) {
            j(xfzVar);
        }
        setSubTabSelectedInner(xfzVar != null ? xfzVar.c() : -1);
        xfz xfzVar2 = this.x;
        if (xfzVar2 != null) {
            if (xfzVar2.d() != null) {
                this.x.d().onSubTabUnselected(this.x, fragmentTransaction);
            }
            OnSubTabChangeListener onSubTabChangeListener = this.z;
            if (onSubTabChangeListener != null) {
                onSubTabChangeListener.onSubTabUnselected(this.x);
            }
        }
        this.u = this.x;
        this.x = xfzVar;
        if (xfzVar != null) {
            if (xfzVar.d() != null) {
                this.x.d().onSubTabSelected(this.x, fragmentTransaction);
            }
            OnSubTabChangeListener onSubTabChangeListener2 = this.z;
            if (onSubTabChangeListener2 != null) {
                onSubTabChangeListener2.onSubTabSelected(this.x);
            }
        }
    }

    private void e(FragmentTransaction fragmentTransaction) {
        xfz xfzVar = this.x;
        if (xfzVar != null) {
            if (xfzVar.d() != null) {
                this.x.d().onSubTabReselected(this.x, fragmentTransaction);
            }
            OnSubTabChangeListener onSubTabChangeListener = this.z;
            if (onSubTabChangeListener != null) {
                onSubTabChangeListener.onSubTabReselected(this.x);
            }
        }
    }

    private int d(xfz xfzVar) {
        int iC = this.x.c();
        int iC2 = xfzVar.c();
        SubTabView subTabViewC = c(iC);
        SubTabView subTabViewC2 = c(iC2);
        if (subTabViewC != null && subTabViewC2 != null) {
            TextPaint textPaint = new TextPaint(1);
            TextPaint textPaint2 = new TextPaint(1);
            textPaint.setTextSize(this.ae);
            textPaint2.setTextSize(this.p);
            String string = subTabViewC.getText().toString();
            String string2 = subTabViewC2.getText().toString();
            int iMeasureText = (int) (textPaint2.measureText(string) - textPaint.measureText(string));
            int iMeasureText2 = (int) (textPaint2.measureText(string2) - textPaint.measureText(string2));
            int i = this.af;
            int iB = i + i + this.f29749c.b(this.am);
            if (!i()) {
                return iC < iC2 ? (subTabViewC2.getLeft() - iMeasureText) - iB : subTabViewC2.getLeft() - iB;
            }
            if (iC < iC2) {
                return ((subTabViewC2.getRight() + iMeasureText2) + iB) - this.f29749c.getWidth();
            }
            return ((subTabViewC2.getRight() + iMeasureText2) + iB) - (this.f29749c.getWidth() + iMeasureText);
        }
        return this.f29749c.getScrollX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f, final SubTabView subTabView, final SubTabView subTabView2) {
        if (f < 0.0f) {
            return;
        }
        ColorStateList subTabColor = subTabView.getSubTabColor();
        ColorStateList subTabColor2 = subTabView2.getSubTabColor();
        if (subTabColor == null || subTabColor2 == null || this.m == null) {
            return;
        }
        int[] iArr = {android.R.attr.state_selected};
        int defaultColor = subTabColor.getDefaultColor();
        int colorForState = subTabColor.getColorForState(iArr, defaultColor);
        int defaultColor2 = subTabColor2.getDefaultColor();
        int colorForState2 = subTabColor2.getColorForState(iArr, defaultColor2);
        final int iIntValue = ((Integer) this.m.evaluate(f, Integer.valueOf(colorForState), Integer.valueOf(defaultColor))).intValue();
        final int iIntValue2 = ((Integer) this.m.evaluate(f, Integer.valueOf(defaultColor2), Integer.valueOf(colorForState2))).intValue();
        post(new Runnable() { // from class: xgc
            @Override // java.lang.Runnable
            public final void run() {
                HwSubTabWidget.d(subTabView, iIntValue, subTabView2, iIntValue2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(SubTabView subTabView, int i, SubTabView subTabView2, int i2) {
        subTabView.setTextColor(i);
        subTabView2.setTextColor(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(SubTabView subTabView, float f, SubTabView subTabView2) {
        subTabView.setTextSize(0, this.p - f);
        subTabView2.setTextSize(0, this.ae + f);
    }

    private void d() {
        int adjustTriggerWidth = getAdjustTriggerWidth();
        int measuredWidth = this.v.getMeasuredWidth();
        int childCount = this.v.getChildCount();
        if (measuredWidth >= adjustTriggerWidth || childCount <= 0) {
            return;
        }
        int i = childCount - 1;
        int i2 = this.af;
        int i3 = (adjustTriggerWidth - ((i2 + i2) * i)) / childCount;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.v.getChildAt(i4);
            if (childAt == null || childAt.getMeasuredWidth() > i3) {
                return;
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = this.v.getChildAt(i5);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int paddingLeft = childAt2.getPaddingLeft();
            if (measuredWidth2 < i3) {
                int i6 = ((i3 - measuredWidth2) / 2) + paddingLeft;
                childAt2.setPadding(i6, 0, i6, 0);
            }
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (i5 == i) {
                    int i7 = this.af;
                    layoutParams2.width = adjustTriggerWidth - (((i7 + i7) + i3) * i);
                } else {
                    layoutParams2.width = i3;
                }
            }
        }
    }
}
