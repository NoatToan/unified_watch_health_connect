package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.ayq;
import defpackage.ca3;
import defpackage.iqi;
import defpackage.m80;
import defpackage.mlq;
import defpackage.njh;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f8660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8661b;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.k0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    public final void a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().i());
        } else if (i == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b getAdapter() {
        return (b) super.getAdapter();
    }

    public final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int iD;
        int iA2;
        int iD2;
        int width;
        int i;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        b adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f8687b;
        ca3 ca3Var = adapter.d;
        int iMax = Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.i(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<njh<Long, Long>> it = dateSelector.i0().iterator();
        while (it.hasNext()) {
            njh<Long, Long> next = it.next();
            Long l = next.f27979a;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.f27980b != null) {
                Long l2 = l;
                long jLongValue = l2.longValue();
                Long l3 = next.f27980b;
                long jLongValue2 = l3.longValue();
                if (!e(item, item2, l2, l3)) {
                    boolean zJ = ayq.j(this);
                    if (jLongValue < item.longValue()) {
                        if (adapter.f(iMax)) {
                            right2 = 0;
                        } else {
                            right2 = !zJ ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                        }
                        iD = right2;
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f8660a.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f8660a.get(5));
                        iD = d(materialCalendarGridView.c(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if (adapter.g(iMin)) {
                            right = getWidth();
                        } else {
                            right = !zJ ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        }
                        iD2 = right;
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f8660a.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f8660a.get(5));
                        iD2 = d(materialCalendarGridView.c(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewC = materialCalendarGridView.c(numColumns);
                        int top = viewC.getTop() + ca3Var.f5102a.c();
                        b bVar = adapter;
                        int bottom = viewC.getBottom() - ca3Var.f5102a.b();
                        if (zJ) {
                            int i4 = iA2 > numColumns2 ? 0 : iD2;
                            width = numColumns > iA ? getWidth() : iD;
                            i = i4;
                        } else {
                            i = numColumns > iA ? 0 : iD;
                            width = iA2 > numColumns2 ? getWidth() : iD2;
                        }
                        canvas.drawRect(i, top, width, bottom, ca3Var.h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = bVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i2;
                    iMin = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f8661b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8660a = mlq.l();
        if (MaterialDatePicker.I(getContext())) {
            setNextFocusLeftId(iqi.f21994a);
            setNextFocusRightId(iqi.c);
        }
        this.f8661b = MaterialDatePicker.J(getContext());
        androidx.core.view.c.r0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof b)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), b.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
