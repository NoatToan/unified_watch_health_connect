package com.haibin.calendarview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
final class e extends com.haibin.calendarview.a<d> {
    private c f;
    private int g;
    private int h;

    public static class a extends RecyclerView.ViewHolder {
        public YearView a;

        public a(View view, c cVar) {
            super(view);
            YearView yearView = (YearView) view;
            this.a = yearView;
            yearView.setup(cVar);
        }
    }

    public e(Context context) {
        super(context);
    }

    @Override // com.haibin.calendarview.a
    public RecyclerView.ViewHolder d(ViewGroup viewGroup, int i) {
        View defaultYearView;
        if (TextUtils.isEmpty(this.f.Y())) {
            defaultYearView = new DefaultYearView(this.e);
        } else {
            try {
                defaultYearView = (YearView) this.f.X().getConstructor(Context.class).newInstance(this.e);
            } catch (Exception e) {
                e.printStackTrace();
                defaultYearView = new DefaultYearView(this.e);
            }
        }
        defaultYearView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new a(defaultYearView, this.f);
    }

    @Override // com.haibin.calendarview.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(RecyclerView.ViewHolder viewHolder, d dVar, int i) {
        YearView yearView = ((a) viewHolder).a;
        yearView.c(dVar.e(), dVar.c());
        yearView.e(this.g, this.h);
    }

    public final void g(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    public final void h(c cVar) {
        this.f = cVar;
    }
}
