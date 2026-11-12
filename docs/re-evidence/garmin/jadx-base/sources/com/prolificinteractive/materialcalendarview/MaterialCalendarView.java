package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import xz2.j;
import xz2.m;
import xz2.n;
import xz2.o;
import xz2.p;
import xz2.q;
import xz2.r;
import xz2.s;
import xz2.t;
import xz2.v;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialCalendarView extends ViewGroup {
    public static final yz2.d B = new yz2.d();
    public g A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f54746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f54747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f54748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f54749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xz2.d f54750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public xz2.e<?> f54751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xz2.b f54752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f54753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xz2.c f54754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<j> f54756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xz2.b f54757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xz2.b f54758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f54759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f54760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f54763r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f54764t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f54765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f54766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f54767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f54768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f54769z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            if (view2 == materialCalendarView.f54749d) {
                xz2.d dVar = materialCalendarView.f54750e;
                dVar.C(dVar.getCurrentItem() + 1, true);
            } else if (view2 == materialCalendarView.f54748c) {
                xz2.d dVar2 = materialCalendarView.f54750e;
                dVar2.C(dVar2.getCurrentItem() - 1, true);
            }
        }
    }

    public class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f54746a.f192930i = materialCalendarView.f54752g;
            materialCalendarView.f54752g = materialCalendarView.f54751f.f192881k.getItem(i14);
            materialCalendarView.g();
            xz2.b bVar = materialCalendarView.f54752g;
            materialCalendarView.getClass();
        }
    }

    public class c {
        public c(MaterialCalendarView materialCalendarView) {
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54772a;

        static {
            int[] iArr = new int[xz2.c.values().length];
            f54772a = iArr;
            try {
                iArr[xz2.c.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54772a[xz2.c.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i14) {
            super(-1, i14);
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54756k = new ArrayList<>();
        a aVar = new a();
        b bVar = new b();
        this.f54757l = null;
        this.f54758m = null;
        this.f54761p = 0;
        this.f54762q = -16777216;
        this.f54765v = -10;
        this.f54766w = -10;
        this.f54767x = 1;
        this.f54768y = true;
        setClipToPadding(false);
        setClipChildren(false);
        m mVar = new m(getContext());
        this.f54748c = mVar;
        mVar.setContentDescription(getContext().getString(R.string.previous));
        TextView textView = new TextView(getContext());
        this.f54747b = textView;
        m mVar2 = new m(getContext());
        this.f54749d = mVar2;
        mVar2.setContentDescription(getContext().getString(R.string.next));
        xz2.d dVar = new xz2.d(getContext());
        this.f54750e = dVar;
        mVar.setOnClickListener(aVar);
        mVar2.setOnClickListener(aVar);
        t tVar = new t(textView);
        this.f54746a = tVar;
        yz2.d dVar2 = B;
        tVar.f192923b = dVar2;
        dVar.setOnPageChangeListener(bVar);
        dVar.E(new c(this));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s.f192921a, 0, 0);
        try {
            try {
                int integer = typedArrayObtainStyledAttributes.getInteger(2, 0);
                this.f54769z = typedArrayObtainStyledAttributes.getInteger(4, -1);
                tVar.f192928g = typedArrayObtainStyledAttributes.getInteger(14, 0);
                if (this.f54769z < 0) {
                    this.f54769z = Calendar.getInstance().getFirstDayOfWeek();
                }
                h hVar = new h();
                hVar.f54798b = this.f54769z;
                hVar.f54797a = xz2.c.values()[integer];
                hVar.a();
                int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(12, -10);
                if (layoutDimension > -10) {
                    setTileSize(layoutDimension);
                }
                int layoutDimension2 = typedArrayObtainStyledAttributes.getLayoutDimension(13, -10);
                if (layoutDimension2 > -10) {
                    setTileWidth(layoutDimension2);
                }
                int layoutDimension3 = typedArrayObtainStyledAttributes.getLayoutDimension(11, -10);
                if (layoutDimension3 > -10) {
                    setTileHeight(layoutDimension3);
                }
                setArrowColor(typedArrayObtainStyledAttributes.getColor(1, -16777216));
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
                setLeftArrowMask(drawable == null ? getResources().getDrawable(R.drawable.mcv_action_previous) : drawable);
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(8);
                setRightArrowMask(drawable2 == null ? getResources().getDrawable(R.drawable.mcv_action_next) : drawable2);
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorAccent, typedValue, true);
                setSelectionColor(typedArrayObtainStyledAttributes.getColor(9, typedValue.data));
                CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(15);
                if (textArray != null) {
                    setWeekDayFormatter(new yz2.a(textArray));
                }
                CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(7);
                if (textArray2 != null) {
                    setTitleFormatter(new yz2.f(textArray2));
                }
                setHeaderTextAppearance(typedArrayObtainStyledAttributes.getResourceId(5, R.style.TextAppearance_MaterialCalendarWidget_Header));
                setWeekDayTextAppearance(typedArrayObtainStyledAttributes.getResourceId(16, R.style.TextAppearance_MaterialCalendarWidget_WeekDay));
                setDateTextAppearance(typedArrayObtainStyledAttributes.getResourceId(3, R.style.TextAppearance_MaterialCalendarWidget_Date));
                setShowOtherDates(typedArrayObtainStyledAttributes.getInteger(10, 4));
                setAllowClickDaysOutsideCurrentMonth(typedArrayObtainStyledAttributes.getBoolean(0, true));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f54751f.f192874d = dVar2;
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f54753h = linearLayout;
            linearLayout.setOrientation(0);
            this.f54753h.setClipChildren(false);
            this.f54753h.setClipToPadding(false);
            addView(this.f54753h, new e(1));
            m mVar3 = this.f54748c;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            mVar3.setScaleType(scaleType);
            this.f54753h.addView(mVar3, new LinearLayout.LayoutParams(0, -1, 1.0f));
            TextView textView2 = this.f54747b;
            textView2.setGravity(17);
            this.f54753h.addView(textView2, new LinearLayout.LayoutParams(0, -1, 5.0f));
            m mVar4 = this.f54749d;
            mVar4.setScaleType(scaleType);
            this.f54753h.addView(mVar4, new LinearLayout.LayoutParams(0, -1, 1.0f));
            xz2.d dVar3 = this.f54750e;
            dVar3.setId(R.id.mcv_pager);
            dVar3.setOffscreenPageLimit(1);
            addView(dVar3, new e(this.f54754i.f192869a + 1));
            Parcelable.Creator<xz2.b> creator = xz2.b.CREATOR;
            xz2.b bVarB = xz2.b.b(xz2.g.a());
            this.f54752g = bVarB;
            setCurrentDate(bVarB);
            if (isInEditMode()) {
                removeView(this.f54750e);
                o oVar = new o(this, this.f54752g, getFirstDayOfWeek());
                oVar.setSelectionColor(getSelectionColor());
                Integer num = this.f54751f.f192876f;
                oVar.setDateTextAppearance(num == null ? 0 : num.intValue());
                Integer num2 = this.f54751f.f192877g;
                oVar.setWeekDayTextAppearance(num2 != null ? num2.intValue() : 0);
                oVar.setShowOtherDates(getShowOtherDates());
                addView(oVar, new e(this.f54754i.f192869a + 1));
            }
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    private int getWeekCountBasedOnMode() {
        xz2.e<?> eVar;
        xz2.d dVar;
        xz2.c cVar = this.f54754i;
        int i14 = cVar.f192869a;
        if (cVar.equals(xz2.c.MONTHS) && this.f54755j && (eVar = this.f54751f) != null && (dVar = this.f54750e) != null) {
            Calendar calendar = (Calendar) eVar.f192881k.getItem(dVar.getCurrentItem()).f().clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.setFirstDayOfWeek(getFirstDayOfWeek());
            i14 = calendar.get(4);
        }
        return i14 + 1;
    }

    public final void a(j... jVarArr) {
        List listAsList = Arrays.asList(jVarArr);
        if (listAsList == null) {
            return;
        }
        ArrayList<j> arrayList = this.f54756k;
        arrayList.addAll(listAsList);
        xz2.e<?> eVar = this.f54751f;
        eVar.f192885o = arrayList;
        eVar.e();
    }

    public final void b() {
        List<xz2.b> selectedDates = getSelectedDates();
        xz2.e<?> eVar = this.f54751f;
        eVar.f192882l.clear();
        eVar.f();
        Iterator<xz2.b> it = selectedDates.iterator();
        while (it.hasNext()) {
            c(it.next(), false);
        }
    }

    public final void c(xz2.b bVar, boolean z14) {
        p pVar = this.f54759n;
        if (pVar != null) {
            pVar.b(this, bVar);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void d(xz2.b bVar, xz2.b bVar2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(bVar.g());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(bVar2.g());
        while (true) {
            if (!calendar.before(calendar2) && !calendar.equals(calendar2)) {
                return;
            }
            xz2.b bVarB = xz2.b.b(calendar);
            this.f54751f.h(bVarB, true);
            arrayList.add(bVarB);
            calendar.add(5, 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final int e(int i14) {
        return (int) TypedValue.applyDimension(1, i14, getResources().getDisplayMetrics());
    }

    public final void f() {
        this.f54751f.e();
    }

    public final void g() {
        xz2.b bVar = this.f54752g;
        t tVar = this.f54746a;
        tVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            if (TextUtils.isEmpty(tVar.f192922a.getText()) || jCurrentTimeMillis - tVar.f192929h < tVar.f192924c) {
                tVar.a(jCurrentTimeMillis, bVar, false);
            }
            if (!bVar.equals(tVar.f192930i)) {
                int i14 = bVar.f192862b;
                xz2.b bVar2 = tVar.f192930i;
                if (i14 != bVar2.f192862b || bVar.f192861a != bVar2.f192861a) {
                    tVar.a(jCurrentTimeMillis, bVar, true);
                }
            }
        }
        xz2.d dVar = this.f54750e;
        this.f54748c.setEnabled(dVar.getCurrentItem() > 0);
        this.f54749d.setEnabled(dVar.getCurrentItem() < this.f54751f.f192881k.getCount() - 1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(1);
    }

    public int getArrowColor() {
        return this.f54762q;
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.f54760o;
        return charSequence != null ? charSequence : getContext().getString(R.string.calendar);
    }

    public xz2.b getCurrentDate() {
        xz2.e<?> eVar = this.f54751f;
        return eVar.f192881k.getItem(this.f54750e.getCurrentItem());
    }

    public int getFirstDayOfWeek() {
        return this.f54769z;
    }

    public Drawable getLeftArrowMask() {
        return this.f54763r;
    }

    public xz2.b getMaximumDate() {
        return this.f54758m;
    }

    public xz2.b getMinimumDate() {
        return this.f54757l;
    }

    public Drawable getRightArrowMask() {
        return this.f54764t;
    }

    public xz2.b getSelectedDate() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f54751f.f192882l);
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (xz2.b) com.airbnb.lottie.animation.keyframe.a.c(1, listUnmodifiableList);
    }

    public List<xz2.b> getSelectedDates() {
        return Collections.unmodifiableList(this.f54751f.f192882l);
    }

    public int getSelectionColor() {
        return this.f54761p;
    }

    public int getSelectionMode() {
        return this.f54767x;
    }

    public int getShowOtherDates() {
        return this.f54751f.f192878h;
    }

    public int getTileHeight() {
        return this.f54765v;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.f54765v, this.f54766w);
    }

    public int getTileWidth() {
        return this.f54766w;
    }

    public int getTitleAnimationOrientation() {
        return this.f54746a.f192928g;
    }

    public boolean getTopbarVisible() {
        return this.f54753h.getVisibility() == 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i16 - i14) - paddingLeft) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int iA = am.j.a(paddingRight, measuredWidth, 2, paddingLeft);
                int i19 = measuredHeight + paddingTop;
                childAt.layout(iA, paddingTop, measuredWidth + iA, i19);
                paddingTop = i19;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int size = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i15);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        int iMin = paddingLeft / 7;
        int iE = paddingTop / weekCountBasedOnMode;
        int i16 = this.f54766w;
        int i17 = -1;
        if (i16 == -10 && this.f54765v == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    iMin = Math.min(iMin, iE);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                iMin = iE;
            } else {
                iMin = -1;
                iE = -1;
            }
            iE = -1;
        } else {
            if (i16 > 0) {
                iMin = i16;
            }
            int i18 = this.f54765v;
            if (i18 > 0) {
                i17 = iMin;
                iMin = -1;
                iE = i18;
            } else {
                i17 = iMin;
                iMin = -1;
            }
        }
        if (iMin > 0) {
            iE = iMin;
        } else if (iMin <= 0) {
            int iE2 = i17 <= 0 ? e(44) : i17;
            if (iE <= 0) {
                iE = e(44);
            }
            iMin = iE2;
        } else {
            iMin = i17;
        }
        int i19 = iMin * 7;
        int paddingRight = getPaddingRight() + getPaddingLeft() + i19;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + (weekCountBasedOnMode * iE);
        int mode3 = View.MeasureSpec.getMode(i14);
        int size3 = View.MeasureSpec.getSize(i14);
        if (mode3 == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size3);
        } else if (mode3 == 1073741824) {
            paddingRight = size3;
        }
        int mode4 = View.MeasureSpec.getMode(i15);
        int size4 = View.MeasureSpec.getSize(i15);
        if (mode4 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size4);
        } else if (mode4 == 1073741824) {
            paddingBottom = size4;
        }
        setMeasuredDimension(paddingRight, paddingBottom);
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((e) childAt.getLayoutParams())).height * iE, 1073741824));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        h hVar = new h();
        hVar.f54798b = fVar.f54781i;
        hVar.f54797a = fVar.f54788p;
        hVar.f54800d = fVar.f54778f;
        hVar.f54801e = fVar.f54779g;
        hVar.f54799c = fVar.f54790r;
        hVar.a();
        setSelectionColor(fVar.f54773a);
        setDateTextAppearance(fVar.f54774b);
        setWeekDayTextAppearance(fVar.f54775c);
        setShowOtherDates(fVar.f54776d);
        setAllowClickDaysOutsideCurrentMonth(fVar.f54777e);
        b();
        for (xz2.b bVar : fVar.f54780h) {
            if (bVar != null) {
                this.f54751f.h(bVar, true);
            }
        }
        setTitleAnimationOrientation(fVar.f54782j);
        setTileWidth(fVar.f54783k);
        setTileHeight(fVar.f54784l);
        setTopbarVisible(fVar.f54785m);
        setSelectionMode(fVar.f54786n);
        setDynamicHeightEnabled(fVar.f54787o);
        setCurrentDate(fVar.f54789q);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f54773a = getSelectionColor();
        Integer num = this.f54751f.f192876f;
        fVar.f54774b = num == null ? 0 : num.intValue();
        Integer num2 = this.f54751f.f192877g;
        fVar.f54775c = num2 != null ? num2.intValue() : 0;
        fVar.f54776d = getShowOtherDates();
        fVar.f54777e = this.f54768y;
        fVar.f54778f = getMinimumDate();
        fVar.f54779g = getMaximumDate();
        fVar.f54780h = getSelectedDates();
        fVar.f54781i = getFirstDayOfWeek();
        fVar.f54782j = getTitleAnimationOrientation();
        fVar.f54786n = getSelectionMode();
        fVar.f54783k = getTileWidth();
        fVar.f54784l = getTileHeight();
        fVar.f54785m = getTopbarVisible();
        fVar.f54788p = this.f54754i;
        fVar.f54787o = this.f54755j;
        fVar.f54789q = this.f54752g;
        fVar.f54790r = this.A.f54795e;
        return fVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f54750e.dispatchTouchEvent(motionEvent);
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z14) {
        this.f54768y = z14;
    }

    public void setArrowColor(int i14) {
        if (i14 == 0) {
            return;
        }
        this.f54762q = i14;
        m mVar = this.f54748c;
        mVar.getClass();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        mVar.setColorFilter(i14, mode);
        m mVar2 = this.f54749d;
        mVar2.getClass();
        mVar2.setColorFilter(i14, mode);
        invalidate();
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f54749d.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f54748c.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.f54760o = charSequence;
    }

    public void setCurrentDate(xz2.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f54750e.C(this.f54751f.c(bVar), true);
        g();
    }

    public void setDateTextAppearance(int i14) {
        xz2.e<?> eVar = this.f54751f;
        if (i14 == 0) {
            eVar.getClass();
            return;
        }
        eVar.f192876f = Integer.valueOf(i14);
        Iterator it = eVar.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setDateTextAppearance(i14);
        }
    }

    public void setDayFormatter(yz2.e eVar) {
        xz2.e<?> eVar2 = this.f54751f;
        if (eVar == null) {
            eVar = yz2.e.f200490a;
        }
        eVar2.f192884n = eVar;
        Iterator it = eVar2.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setDayFormatter(eVar);
        }
    }

    public void setDynamicHeightEnabled(boolean z14) {
        this.f54755j = z14;
    }

    public void setHeaderTextAppearance(int i14) {
        this.f54747b.setTextAppearance(getContext(), i14);
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.f54763r = drawable;
        this.f54748c.setImageDrawable(drawable);
    }

    public void setOnDateChangedListener(p pVar) {
        this.f54759n = pVar;
    }

    public void setOnMonthChangedListener(q qVar) {
    }

    public void setOnRangeSelectedListener(r rVar) {
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.f54747b.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z14) {
        this.f54750e.f192870g1 = z14;
        g();
    }

    public void setRightArrowMask(Drawable drawable) {
        this.f54764t = drawable;
        this.f54749d.setImageDrawable(drawable);
    }

    public void setSelectedDate(xz2.b bVar) {
        b();
        if (bVar != null) {
            this.f54751f.h(bVar, true);
        }
    }

    public void setSelectionColor(int i14) {
        if (i14 == 0) {
            if (!isInEditMode()) {
                return;
            } else {
                i14 = -7829368;
            }
        }
        this.f54761p = i14;
        xz2.e<?> eVar = this.f54751f;
        eVar.f192875e = Integer.valueOf(i14);
        Iterator it = eVar.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setSelectionColor(i14);
        }
        invalidate();
    }

    public void setSelectionMode(int i14) {
        int i15 = this.f54767x;
        this.f54767x = i14;
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    this.f54767x = 0;
                    if (i15 != 0) {
                        b();
                    }
                } else {
                    b();
                }
            }
        } else if ((i15 == 2 || i15 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        xz2.e<?> eVar = this.f54751f;
        eVar.f192887q = this.f54767x != 0;
        Iterator it = eVar.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setSelectionEnabled(eVar.f192887q);
        }
    }

    public void setShowOtherDates(int i14) {
        xz2.e<?> eVar = this.f54751f;
        eVar.f192878h = i14;
        Iterator it = eVar.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setShowOtherDates(i14);
        }
    }

    public void setTileHeight(int i14) {
        this.f54765v = i14;
        requestLayout();
    }

    public void setTileHeightDp(int i14) {
        setTileHeight(e(i14));
    }

    public void setTileSize(int i14) {
        this.f54766w = i14;
        this.f54765v = i14;
        requestLayout();
    }

    public void setTileSizeDp(int i14) {
        setTileSize(e(i14));
    }

    public void setTileWidth(int i14) {
        this.f54766w = i14;
        requestLayout();
    }

    public void setTileWidthDp(int i14) {
        setTileWidth(e(i14));
    }

    public void setTitleAnimationOrientation(int i14) {
        this.f54746a.f192928g = i14;
    }

    public void setTitleFormatter(yz2.g gVar) {
        if (gVar == null) {
            gVar = B;
        }
        this.f54746a.f192923b = gVar;
        this.f54751f.f192874d = gVar;
        g();
    }

    public void setTitleMonths(int i14) {
        setTitleMonths(getResources().getTextArray(i14));
    }

    public void setTopbarVisible(boolean z14) {
        this.f54753h.setVisibility(z14 ? 0 : 8);
        requestLayout();
    }

    public void setWeekDayFormatter(yz2.h hVar) {
        xz2.e<?> eVar = this.f54751f;
        if (hVar == null) {
            hVar = yz2.h.f200492a;
        }
        eVar.f192883m = hVar;
        Iterator it = eVar.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setWeekDayFormatter(hVar);
        }
    }

    public void setWeekDayLabels(int i14) {
        setWeekDayLabels(getResources().getTextArray(i14));
    }

    public void setWeekDayTextAppearance(int i14) {
        xz2.e<?> eVar = this.f54751f;
        if (i14 == 0) {
            eVar.getClass();
            return;
        }
        eVar.f192877g = Integer.valueOf(i14);
        Iterator it = eVar.f192871a.iterator();
        while (it.hasNext()) {
            ((xz2.f) it.next()).setWeekDayTextAppearance(i14);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(1);
    }

    public void setSelectedDate(Date date) {
        setSelectedDate(xz2.b.d(date));
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new yz2.f(charSequenceArr));
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new yz2.a(charSequenceArr));
    }

    public void setSelectedDate(Calendar calendar) {
        setSelectedDate(xz2.b.b(calendar));
    }

    public void setCurrentDate(Date date) {
        setCurrentDate(xz2.b.d(date));
    }

    public void setCurrentDate(Calendar calendar) {
        setCurrentDate(xz2.b.b(calendar));
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xz2.c f54791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xz2.b f54793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final xz2.b f54794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f54795e;

        private g(h hVar) {
            this.f54791a = hVar.f54797a;
            this.f54792b = hVar.f54798b;
            this.f54793c = hVar.f54800d;
            this.f54794d = hVar.f54801e;
            this.f54795e = hVar.f54799c;
        }

        public final h a() {
            return new h(MaterialCalendarView.this, this, null);
        }

        public /* synthetic */ g(MaterialCalendarView materialCalendarView, h hVar, a aVar) {
            this(hVar);
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public xz2.c f54797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f54799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public xz2.b f54800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public xz2.b f54801e;

        private h(g gVar) {
            this.f54797a = xz2.c.MONTHS;
            this.f54798b = Calendar.getInstance().getFirstDayOfWeek();
            this.f54799c = false;
            this.f54800d = null;
            this.f54801e = null;
            this.f54797a = gVar.f54791a;
            this.f54798b = gVar.f54792b;
            this.f54800d = gVar.f54793c;
            this.f54801e = gVar.f54794d;
            this.f54799c = gVar.f54795e;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0079  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.prolificinteractive.materialcalendarview.MaterialCalendarView$a] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        public final void a() {
            xz2.e<?> nVar;
            xz2.b bVarB;
            xz2.b item;
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            xz2.b bVar = 0;
            bVar = 0;
            g gVar = new g(materialCalendarView, this, bVar);
            xz2.d dVar = materialCalendarView.f54750e;
            xz2.e<?> eVar = materialCalendarView.f54751f;
            xz2.c cVar = gVar.f54791a;
            if (eVar != null && gVar.f54795e) {
                item = eVar.f192881k.getItem(dVar.getCurrentItem());
                if (materialCalendarView.f54754i != cVar) {
                    xz2.b selectedDate = materialCalendarView.getSelectedDate();
                    xz2.c cVar2 = materialCalendarView.f54754i;
                    if (cVar2 != xz2.c.MONTHS || selectedDate == null) {
                        bVar = item;
                        bVar = item;
                        if (cVar2 == xz2.c.WEEKS) {
                            Calendar calendarF = item.f();
                            calendarF.add(7, 6);
                            xz2.b bVarB2 = xz2.b.b(calendarF);
                            if (selectedDate == null || !(selectedDate.equals(item) || selectedDate.equals(bVarB2) || (selectedDate.h(item) && selectedDate.i(bVarB2)))) {
                                bVar = bVarB2;
                            } else {
                                bVar = item;
                                bVar = item;
                                bVar = selectedDate;
                            }
                        }
                    } else {
                        Calendar calendarF2 = item.f();
                        calendarF2.add(2, 1);
                        xz2.b bVarB3 = xz2.b.b(calendarF2);
                        if (selectedDate.equals(item) || (selectedDate.h(item) && selectedDate.i(bVarB3))) {
                            bVar = item;
                            bVar = item;
                            bVar = selectedDate;
                        }
                    }
                }
            }
            bVar = item;
            bVar = item;
            bVar = item;
            bVar = item;
            materialCalendarView.A = gVar;
            materialCalendarView.f54754i = cVar;
            materialCalendarView.f54769z = gVar.f54792b;
            materialCalendarView.f54757l = gVar.f54793c;
            materialCalendarView.f54758m = gVar.f54794d;
            int i14 = d.f54772a[cVar.ordinal()];
            if (i14 == 1) {
                nVar = new n(materialCalendarView);
            } else {
                if (i14 != 2) {
                    vb.h.s("Provided display mode which is not yet implemented");
                    return;
                }
                nVar = new v(materialCalendarView);
            }
            xz2.e<?> eVar2 = materialCalendarView.f54751f;
            if (eVar2 == null) {
                materialCalendarView.f54751f = nVar;
            } else {
                nVar.f192874d = eVar2.f192874d;
                nVar.f192875e = eVar2.f192875e;
                nVar.f192876f = eVar2.f192876f;
                nVar.f192877g = eVar2.f192877g;
                nVar.f192878h = eVar2.f192878h;
                nVar.f192879i = eVar2.f192879i;
                nVar.f192880j = eVar2.f192880j;
                nVar.f192882l = eVar2.f192882l;
                nVar.f192883m = eVar2.f192883m;
                nVar.f192884n = eVar2.f192884n;
                nVar.f192885o = eVar2.f192885o;
                nVar.f192886p = eVar2.f192886p;
                nVar.f192887q = eVar2.f192887q;
                materialCalendarView.f54751f = nVar;
            }
            dVar.setAdapter(materialCalendarView.f54751f);
            xz2.b bVar2 = materialCalendarView.f54757l;
            xz2.b bVar3 = materialCalendarView.f54758m;
            xz2.b bVar4 = materialCalendarView.f54752g;
            materialCalendarView.f54751f.i(bVar2, bVar3);
            materialCalendarView.f54752g = bVar4;
            if (bVar2 != null) {
                if (!bVar2.h(bVar4)) {
                    bVar2 = materialCalendarView.f54752g;
                }
                materialCalendarView.f54752g = bVar2;
            }
            dVar.C(materialCalendarView.f54751f.c(bVar4), false);
            materialCalendarView.g();
            dVar.setLayoutParams(new e(materialCalendarView.f54754i.f192869a + 1));
            if (materialCalendarView.f54767x != 1 || Collections.unmodifiableList(materialCalendarView.f54751f.f192882l).isEmpty()) {
                Parcelable.Creator<xz2.b> creator = xz2.b.CREATOR;
                bVarB = xz2.b.b(xz2.g.a());
            } else {
                bVarB = (xz2.b) Collections.unmodifiableList(materialCalendarView.f54751f.f192882l).get(0);
            }
            materialCalendarView.setCurrentDate(bVarB);
            if (bVar != 0) {
                dVar.setCurrentItem(materialCalendarView.f54751f.c(bVar));
            }
            materialCalendarView.f();
            materialCalendarView.g();
        }

        public h() {
            this.f54797a = xz2.c.MONTHS;
            this.f54798b = Calendar.getInstance().getFirstDayOfWeek();
            this.f54799c = false;
            this.f54800d = null;
            this.f54801e = null;
        }

        public /* synthetic */ h(MaterialCalendarView materialCalendarView, g gVar, a aVar) {
            this(gVar);
        }
    }

    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f54773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f54777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public xz2.b f54778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public xz2.b f54779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<xz2.b> f54780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f54781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f54782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f54783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f54784l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f54785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f54786n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f54787o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public xz2.c f54788p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public xz2.b f54789q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f54790r;

        public static class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        private f(Parcel parcel) {
            super(parcel);
            this.f54773a = 0;
            this.f54774b = 0;
            this.f54775c = 0;
            this.f54776d = 4;
            this.f54777e = true;
            this.f54778f = null;
            this.f54779g = null;
            this.f54780h = new ArrayList();
            this.f54781i = 1;
            this.f54782j = 0;
            this.f54783k = -1;
            this.f54784l = -1;
            this.f54785m = true;
            this.f54786n = 1;
            this.f54787o = false;
            xz2.c cVar = xz2.c.MONTHS;
            this.f54788p = cVar;
            this.f54789q = null;
            this.f54773a = parcel.readInt();
            this.f54774b = parcel.readInt();
            this.f54775c = parcel.readInt();
            this.f54776d = parcel.readInt();
            this.f54777e = parcel.readByte() != 0;
            ClassLoader classLoader = xz2.b.class.getClassLoader();
            this.f54778f = (xz2.b) parcel.readParcelable(classLoader);
            this.f54779g = (xz2.b) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f54780h, xz2.b.CREATOR);
            this.f54781i = parcel.readInt();
            this.f54782j = parcel.readInt();
            this.f54783k = parcel.readInt();
            this.f54784l = parcel.readInt();
            this.f54785m = parcel.readInt() == 1;
            this.f54786n = parcel.readInt();
            this.f54787o = parcel.readInt() == 1;
            this.f54788p = parcel.readInt() == 1 ? xz2.c.WEEKS : cVar;
            this.f54789q = (xz2.b) parcel.readParcelable(classLoader);
            this.f54790r = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f54773a);
            parcel.writeInt(this.f54774b);
            parcel.writeInt(this.f54775c);
            parcel.writeInt(this.f54776d);
            parcel.writeByte(this.f54777e ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f54778f, 0);
            parcel.writeParcelable(this.f54779g, 0);
            parcel.writeTypedList(this.f54780h);
            parcel.writeInt(this.f54781i);
            parcel.writeInt(this.f54782j);
            parcel.writeInt(this.f54783k);
            parcel.writeInt(this.f54784l);
            parcel.writeInt(this.f54785m ? 1 : 0);
            parcel.writeInt(this.f54786n);
            parcel.writeInt(this.f54787o ? 1 : 0);
            parcel.writeInt(this.f54788p == xz2.c.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.f54789q, 0);
            parcel.writeByte(this.f54790r ? (byte) 1 : (byte) 0);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f54773a = 0;
            this.f54774b = 0;
            this.f54775c = 0;
            this.f54776d = 4;
            this.f54777e = true;
            this.f54778f = null;
            this.f54779g = null;
            this.f54780h = new ArrayList();
            this.f54781i = 1;
            this.f54782j = 0;
            this.f54783k = -1;
            this.f54784l = -1;
            this.f54785m = true;
            this.f54786n = 1;
            this.f54787o = false;
            this.f54788p = xz2.c.MONTHS;
            this.f54789q = null;
        }

        public /* synthetic */ f(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public MaterialCalendarView(Context context) {
        this(context, null);
    }
}
