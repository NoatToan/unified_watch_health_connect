package com.huawei.ui.commonui.barlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BarViewAdapter extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23287c;
    private Context d;
    private List<qix> e = new ArrayList();

    public BarViewAdapter(Context context, int i, int i2) {
        this.d = context;
        this.f23286b = i;
        a(i2);
    }

    void a(int i) {
        this.f23287c = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.health_bar_item_layout, viewGroup, false);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewInflate.getLayoutParams();
        if (layoutParams == null) {
            viewInflate.setLayoutParams(new RecyclerView.LayoutParams(this.f23286b, -2));
        } else {
            layoutParams.width = this.f23286b;
        }
        return new d(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, int i) {
        qix qixVar;
        List<qix> list = this.e;
        if (list == null || i >= list.size() || (qixVar = this.e.get(i)) == null) {
            return;
        }
        dVar.f23289b.setData(qixVar.e(), qixVar.d(), this.f23287c);
        dVar.f23288a.setText(qixVar.c());
        dVar.d.setText(qixVar.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public void e(List<qix> list) {
        this.e = list;
        notifyDataSetChanged();
    }

    public void b(List<qix> list) {
        int size = this.e.size();
        this.e.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f23288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        BarView f23289b;
        HealthTextView d;

        public d(View view) {
            super(view);
            this.f23288a = (HealthTextView) view.findViewById(R.id.header_text);
            this.f23289b = (BarView) view.findViewById(R.id.bar_view);
            this.d = (HealthTextView) view.findViewById(R.id.bottom_text);
        }
    }
}
