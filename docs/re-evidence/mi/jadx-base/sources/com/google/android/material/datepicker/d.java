package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import defpackage.ca3;
import defpackage.h2j;
import defpackage.kwi;
import defpackage.mlq;
import defpackage.w93;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class d extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCalendar<?> f8694a;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8695a;

        public a(int i) {
            this.f8695a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f8694a.L(d.this.f8694a.D().f(Month.c(this.f8695a, d.this.f8694a.F().f8676b)));
            d.this.f8694a.M(MaterialCalendar.k.DAY);
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f8697a;

        public b(TextView textView) {
            super(textView);
            this.f8697a = textView;
        }
    }

    public d(MaterialCalendar<?> materialCalendar) {
        this.f8694a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8694a.D().l();
    }

    public final View.OnClickListener j(int i) {
        return new a(i);
    }

    public int k(int i) {
        return i - this.f8694a.D().k().c;
    }

    public int l(int i) {
        return this.f8694a.D().k().c + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        int iL = l(i);
        String string = bVar.f8697a.getContext().getString(h2j.E);
        bVar.f8697a.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(iL)));
        bVar.f8697a.setContentDescription(String.format(string, Integer.valueOf(iL)));
        ca3 ca3VarE = this.f8694a.E();
        Calendar calendarJ = mlq.j();
        w93 w93Var = calendarJ.get(1) == iL ? ca3VarE.f : ca3VarE.d;
        Iterator<Long> it = this.f8694a.G().K().iterator();
        while (it.hasNext()) {
            calendarJ.setTimeInMillis(it.next().longValue());
            if (calendarJ.get(1) == iL) {
                w93Var = ca3VarE.e;
            }
        }
        w93Var.d(bVar.f8697a);
        bVar.f8697a.setOnClickListener(j(iL));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(kwi.B, viewGroup, false));
    }
}
