package com.huami.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class YearRecyclerView extends RecyclerView {
    private c a;
    private e b;
    private b c;

    public class a implements com.huami.calendarview.a.c {
        public a() {
        }

        @Override // com.huami.calendarview.a.c
        public void a(int i, long j) {
            d item;
            if (YearRecyclerView.this.c == null || YearRecyclerView.this.a == null || (item = YearRecyclerView.this.b.getItem(i)) == null || !com.huami.calendarview.b.F(item.e(), item.c(), YearRecyclerView.this.a.z(), YearRecyclerView.this.a.B(), YearRecyclerView.this.a.u(), YearRecyclerView.this.a.w())) {
                return;
            }
            YearRecyclerView.this.c.a(item.e(), item.c());
            if (YearRecyclerView.this.a.A0 != null) {
                YearRecyclerView.this.a.A0.onYearViewChange(true);
            }
        }
    }

    public interface b {
        void a(int i, int i2);
    }

    public YearRecyclerView(Context context) {
        this(context, null);
    }

    public final void d(int i) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        for (int i2 = 1; i2 <= 12; i2++) {
            calendar.set(i, i2 - 1, 1);
            int iG = com.huami.calendarview.b.g(i, i2);
            d dVar = new d();
            dVar.g(com.huami.calendarview.b.m(i, i2, this.a.U()));
            dVar.f(iG);
            dVar.h(i2);
            dVar.i(i);
            this.b.b(dVar);
        }
    }

    public void e() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    public final void f() {
        for (int i = 0; i < getChildCount(); i++) {
            YearView yearView = (YearView) getChildAt(i);
            yearView.i();
            yearView.invalidate();
        }
    }

    public final void g() {
        for (d dVar : this.b.getItems()) {
            dVar.g(com.huami.calendarview.b.m(dVar.e(), dVar.c(), this.a.U()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        this.b.g(View.MeasureSpec.getSize(i) / 3, size / 4);
    }

    public final void setOnMonthSelectedListener(b bVar) {
        this.c = bVar;
    }

    public final void setup(c cVar) {
        this.a = cVar;
        this.b.h(cVar);
    }

    public YearRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new e(context);
        setLayoutManager(new GridLayoutManager(context, 3));
        setAdapter(this.b);
        this.b.e(new a());
    }
}
