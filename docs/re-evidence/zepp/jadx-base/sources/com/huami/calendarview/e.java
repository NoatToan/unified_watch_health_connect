package com.huami.calendarview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
final class e extends com.huami.calendarview.a<d> {
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

    @Override // com.huami.calendarview.a
    public RecyclerView.ViewHolder d(ViewGroup viewGroup, int i) {
        View defaultYearView;
        if (TextUtils.isEmpty(this.f.a0())) {
            defaultYearView = new DefaultYearView(this.e);
        } else {
            try {
                defaultYearView = (YearView) this.f.Z().getConstructor(Context.class).newInstance(this.e);
            } catch (Exception e) {
                e.printStackTrace();
                defaultYearView = new DefaultYearView(this.e);
            }
        }
        defaultYearView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new a(defaultYearView, this.f);
    }

    @Override // com.huami.calendarview.a
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
