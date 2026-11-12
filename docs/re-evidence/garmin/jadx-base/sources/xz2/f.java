package xz2;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends ViewGroup implements View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Calendar f192888j = g.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<u> f192889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<l> f192890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCalendarView f192892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f192893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f192894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f192895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f192896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f192897i;

    public static class a extends ViewGroup.MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public f(MaterialCalendarView materialCalendarView, b bVar, int i14) {
        super(materialCalendarView.getContext());
        this.f192889a = new ArrayList<>();
        this.f192890b = new ArrayList<>();
        this.f192891c = 4;
        this.f192894f = null;
        this.f192895g = null;
        this.f192897i = new ArrayList();
        this.f192892d = materialCalendarView;
        this.f192893e = bVar;
        this.f192896h = i14;
        setClipChildren(false);
        setClipToPadding(false);
        Calendar calendarD = d();
        for (int i15 = 0; i15 < 7; i15++) {
            u uVar = new u(getContext(), calendarD.get(7));
            this.f192889a.add(uVar);
            addView(uVar);
            calendarD.add(5, 1);
        }
        b(this.f192897i, d());
    }

    public final void a(Collection<i> collection, Calendar calendar) {
        i iVar = new i(getContext(), b.b(calendar));
        iVar.setOnClickListener(this);
        collection.add(iVar);
        addView(iVar, new a());
        calendar.add(5, 1);
    }

    public abstract void b(ArrayList arrayList, Calendar calendar);

    public abstract boolean c(b bVar);

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final Calendar d() {
        b firstViewDay = getFirstViewDay();
        firstViewDay.getClass();
        Calendar calendar = f192888j;
        calendar.clear();
        calendar.set(firstViewDay.f192861a, firstViewDay.f192862b, firstViewDay.f192863c);
        calendar.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek = getFirstDayOfWeek() - calendar.get(7);
        int i14 = this.f192891c;
        yz2.d dVar = MaterialCalendarView.B;
        if ((i14 & 1) == 0 ? firstDayOfWeek > 0 : firstDayOfWeek >= 0) {
            firstDayOfWeek -= 7;
        }
        calendar.add(5, firstDayOfWeek);
        return calendar;
    }

    public final void e() {
        for (i iVar : this.f192897i) {
            b bVar = iVar.f192898a;
            int i14 = this.f192891c;
            b bVar2 = this.f192894f;
            b bVar3 = this.f192895g;
            bVar.getClass();
            boolean z14 = (bVar2 == null || !bVar2.h(bVar)) && (bVar3 == null || !bVar3.i(bVar));
            boolean zC = c(bVar);
            iVar.f192908k = i14;
            iVar.f192906i = zC;
            iVar.f192905h = z14;
            iVar.d();
        }
        postInvalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    public int getFirstDayOfWeek() {
        return this.f192896h;
    }

    public b getFirstViewDay() {
        return this.f192893e;
    }

    public abstract int getRows();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        if (view2 instanceof i) {
            i iVar = (i) view2;
            MaterialCalendarView materialCalendarView = this.f192892d;
            d dVar = materialCalendarView.f54750e;
            d dVar2 = materialCalendarView.f54750e;
            b currentDate = materialCalendarView.getCurrentDate();
            b bVar = iVar.f192898a;
            int i14 = currentDate.f192862b;
            int i15 = bVar.f192862b;
            if (materialCalendarView.f54754i == c.MONTHS && materialCalendarView.f54768y && i14 != i15) {
                if (currentDate.h(bVar)) {
                    if (dVar2.getCurrentItem() > 0) {
                        dVar.C(dVar.getCurrentItem() - 1, true);
                    }
                } else if (currentDate.i(bVar) && dVar2.getCurrentItem() < materialCalendarView.f54751f.f192881k.getCount() - 1) {
                    dVar.C(dVar.getCurrentItem() + 1, true);
                }
            }
            b bVar2 = iVar.f192898a;
            boolean z14 = !iVar.isChecked();
            int i16 = materialCalendarView.f54767x;
            e<?> eVar = materialCalendarView.f54751f;
            if (i16 == 2) {
                eVar.h(bVar2, z14);
                materialCalendarView.c(bVar2, z14);
                return;
            }
            if (i16 != 3) {
                eVar.f192882l.clear();
                eVar.f();
                materialCalendarView.f54751f.h(bVar2, true);
                materialCalendarView.c(bVar2, true);
                return;
            }
            eVar.h(bVar2, z14);
            int size = Collections.unmodifiableList(materialCalendarView.f54751f.f192882l).size();
            e<?> eVar2 = materialCalendarView.f54751f;
            if (size > 2) {
                eVar2.f192882l.clear();
                eVar2.f();
                materialCalendarView.f54751f.h(bVar2, z14);
                materialCalendarView.c(bVar2, z14);
                return;
            }
            int size2 = Collections.unmodifiableList(eVar2.f192882l).size();
            e<?> eVar3 = materialCalendarView.f54751f;
            if (size2 != 2) {
                eVar3.h(bVar2, z14);
                materialCalendarView.c(bVar2, z14);
                return;
            }
            List listUnmodifiableList = Collections.unmodifiableList(eVar3.f192882l);
            if (((b) listUnmodifiableList.get(0)).h((b) listUnmodifiableList.get(1))) {
                materialCalendarView.d((b) listUnmodifiableList.get(1), (b) listUnmodifiableList.get(0));
            } else {
                materialCalendarView.d((b) listUnmodifiableList.get(0), (b) listUnmodifiableList.get(1));
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int childCount = getChildCount();
        int i18 = 0;
        int i19 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            int measuredWidth = childAt.getMeasuredWidth() + i18;
            int measuredHeight = childAt.getMeasuredHeight() + i19;
            childAt.layout(i18, i19, measuredWidth, measuredHeight);
            if (i24 % 7 == 6) {
                i18 = 0;
                i19 = measuredHeight;
            } else {
                i18 = measuredWidth;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int size = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        if (View.MeasureSpec.getMode(i15) == 0 || mode == 0) {
            vb.h.z("CalendarPagerView should never be left to decide it's size");
            return;
        }
        int i16 = size / 7;
        int rows = size2 / getRows();
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            getChildAt(i17).measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(rows, 1073741824));
        }
    }

    public void setDateTextAppearance(int i14) {
        Iterator it = this.f192897i.iterator();
        while (it.hasNext()) {
            ((i) it.next()).setTextAppearance(getContext(), i14);
        }
    }

    public void setDayFormatter(yz2.e eVar) {
        yz2.e eVar2;
        for (i iVar : this.f192897i) {
            if (eVar == null) {
                iVar.getClass();
                eVar2 = yz2.e.f200490a;
            } else {
                eVar2 = eVar;
            }
            iVar.f192904g = eVar2;
            CharSequence text = iVar.getText();
            Object[] spans = text instanceof Spanned ? ((Spanned) text).getSpans(0, text.length(), Object.class) : null;
            SpannableString spannableString = new SpannableString(iVar.b());
            if (spans != null) {
                for (Object obj : spans) {
                    spannableString.setSpan(obj, 0, spannableString.length(), 33);
                }
            }
            iVar.setText(spannableString);
        }
    }

    public void setDayViewDecorators(List<l> list) {
        ArrayList<l> arrayList = this.f192890b;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        k kVar = new k();
        for (i iVar : this.f192897i) {
            kVar.f192912b = null;
            LinkedList<k.a> linkedList = kVar.f192913c;
            linkedList.clear();
            kVar.f192911a = false;
            kVar.f192914d = false;
            for (l lVar : arrayList) {
                if (lVar.f192916a.a(iVar.f192898a)) {
                    k kVar2 = lVar.f192917b;
                    Drawable drawable = kVar2.f192912b;
                    if (drawable != null) {
                        kVar.b(drawable);
                    }
                    linkedList.addAll(kVar2.f192913c);
                    kVar.f192911a |= kVar2.f192911a;
                    kVar.f192914d = kVar2.f192914d;
                }
            }
            iVar.getClass();
            iVar.f192907j = kVar.f192914d;
            iVar.d();
            iVar.f192901d = null;
            iVar.invalidate();
            Drawable drawable2 = kVar.f192912b;
            if (drawable2 == null) {
                iVar.f192902e = null;
            } else {
                iVar.f192902e = drawable2.getConstantState().newDrawable(iVar.getResources());
            }
            iVar.c();
            List listUnmodifiableList = Collections.unmodifiableList(linkedList);
            if (listUnmodifiableList.isEmpty()) {
                iVar.setText(iVar.b());
            } else {
                String strB = iVar.b();
                SpannableString spannableString = new SpannableString(iVar.b());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    spannableString.setSpan(((k.a) it.next()).f192915a, 0, strB.length(), 33);
                }
                iVar.setText(spannableString);
            }
        }
    }

    public void setMaximumDate(b bVar) {
        this.f192895g = bVar;
        e();
    }

    public void setMinimumDate(b bVar) {
        this.f192894f = bVar;
        e();
    }

    public void setSelectedDates(Collection<b> collection) {
        for (i iVar : this.f192897i) {
            iVar.setChecked(collection != null && collection.contains(iVar.f192898a));
        }
        postInvalidate();
    }

    public void setSelectionColor(int i14) {
        for (i iVar : this.f192897i) {
            iVar.f192899b = i14;
            iVar.c();
        }
    }

    public void setSelectionEnabled(boolean z14) {
        for (i iVar : this.f192897i) {
            iVar.setOnClickListener(z14 ? this : null);
            iVar.setClickable(z14);
        }
    }

    public void setShowOtherDates(int i14) {
        this.f192891c = i14;
        e();
    }

    public void setWeekDayFormatter(yz2.h hVar) {
        yz2.h hVar2;
        for (u uVar : this.f192889a) {
            if (hVar == null) {
                uVar.getClass();
                hVar2 = yz2.h.f200492a;
            } else {
                hVar2 = hVar;
            }
            uVar.f192934a = hVar2;
            int i14 = uVar.f192935b;
            uVar.f192935b = i14;
            uVar.setText(hVar2.format(i14));
        }
    }

    public void setWeekDayTextAppearance(int i14) {
        Iterator<u> it = this.f192889a.iterator();
        while (it.hasNext()) {
            it.next().setTextAppearance(getContext(), i14);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }
}
