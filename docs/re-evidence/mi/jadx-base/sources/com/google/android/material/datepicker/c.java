package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.iqi;
import defpackage.kwi;

/* JADX INFO: loaded from: classes5.dex */
public class c extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarConstraints f8688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateSelector<?> f8689b;
    public final MaterialCalendar.l c;
    public final int d;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f8690a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f8690a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f8690a.getAdapter().n(i)) {
                c.this.c.a(this.f8690a.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f8692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MaterialCalendarGridView f8693b;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(iqi.E);
            this.f8692a = textView;
            androidx.core.view.c.s0(textView, true);
            this.f8693b = (MaterialCalendarGridView) linearLayout.findViewById(iqi.A);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public c(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.l lVar) {
        Month monthK = calendarConstraints.k();
        Month monthH = calendarConstraints.h();
        Month monthJ = calendarConstraints.j();
        if (monthK.compareTo(monthJ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthJ.compareTo(monthH) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.d = (com.google.android.material.datepicker.b.f * MaterialCalendar.H(context)) + (MaterialDatePicker.I(context) ? MaterialCalendar.H(context) : 0);
        this.f8688a = calendarConstraints;
        this.f8689b = dateSelector;
        this.c = lVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.f8688a.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f8688a.k().o(i).m();
    }

    public Month j(int i) {
        return this.f8688a.k().o(i);
    }

    public CharSequence k(int i) {
        return j(i).l();
    }

    public int l(Month month) {
        return this.f8688a.k().r(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        Month monthO = this.f8688a.k().o(i);
        bVar.f8692a.setText(monthO.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f8693b.findViewById(iqi.A);
        if (materialCalendarGridView.getAdapter() == null || !monthO.equals(materialCalendarGridView.getAdapter().f8686a)) {
            com.google.android.material.datepicker.b bVar2 = new com.google.android.material.datepicker.b(monthO, this.f8689b, this.f8688a);
            materialCalendarGridView.setNumColumns(monthO.d);
            materialCalendarGridView.setAdapter((ListAdapter) bVar2);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(kwi.z, viewGroup, false);
        if (!MaterialDatePicker.I(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.d));
        return new b(linearLayout, true);
    }
}
