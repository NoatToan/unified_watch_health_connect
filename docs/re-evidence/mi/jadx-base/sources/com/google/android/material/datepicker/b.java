package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import defpackage.ca3;
import defpackage.cq5;
import defpackage.kwi;
import defpackage.mlq;
import defpackage.w93;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class b extends BaseAdapter {
    public static final int f = mlq.l().getMaximum(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f8686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateSelector<?> f8687b;
    public Collection<Long> c;
    public ca3 d;
    public final CalendarConstraints e;

    public b(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f8686a = month;
        this.f8687b = dateSelector;
        this.e = calendarConstraints;
        this.c = dateSelector.K();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.f8686a.h();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f8686a.h() || i > i()) {
            return null;
        }
        return Long.valueOf(this.f8686a.i(j(i)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(kwi.w, viewGroup, false);
        }
        int iB = i - b();
        if (iB >= 0) {
            Month month = this.f8686a;
            if (iB >= month.e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i2 = iB + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i2)));
                long jI = this.f8686a.i(i2);
                if (this.f8686a.c == Month.e().c) {
                    textView.setContentDescription(cq5.g(jI));
                } else {
                    textView.setContentDescription(cq5.l(jI));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        k(textView, item.longValue());
        return textView;
    }

    public final void e(Context context) {
        if (this.d == null) {
            this.d = new ca3(context);
        }
    }

    public boolean f(int i) {
        return i % this.f8686a.d == 0;
    }

    public boolean g(int i) {
        return (i + 1) % this.f8686a.d == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8686a.e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f8686a.d;
    }

    public final boolean h(long j) {
        Iterator<Long> it = this.f8687b.K().iterator();
        while (it.hasNext()) {
            if (mlq.a(j) == mlq.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.f8686a.h() + this.f8686a.e) - 1;
    }

    public int j(int i) {
        return (i - this.f8686a.h()) + 1;
    }

    public final void k(TextView textView, long j) {
        w93 w93Var;
        if (textView == null) {
            return;
        }
        if (this.e.g().n(j)) {
            textView.setEnabled(true);
            if (h(j)) {
                w93Var = this.d.f5103b;
            } else {
                w93Var = mlq.j().getTimeInMillis() == j ? this.d.c : this.d.f5102a;
            }
        } else {
            textView.setEnabled(false);
            w93Var = this.d.g;
        }
        w93Var.d(textView);
    }

    public final void l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.d(j).equals(this.f8686a)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f8686a.k(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.c.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f8687b;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.K().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.c = this.f8687b.K();
        }
    }

    public boolean n(int i) {
        return i >= b() && i <= i();
    }
}
