package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fot;
import defpackage.fts;
import defpackage.qrs;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ObserverRecycleViewAdapter extends RecyclerView.Adapter<ObserverRecycleViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7222a = 120;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f7223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7224c;
    private OnClickSectionListener d;
    private List<String> e;
    private int f;
    private int g;
    private int h;
    private int i = -1;
    private Typeface j;
    private List<String> k;
    private int l;
    private int m;
    private Typeface n;
    private List<String> o;

    public ObserverRecycleViewAdapter(Context context, fot fotVar) {
        this.f7224c = context;
        a(fotVar);
    }

    public void a(fot fotVar) {
        LogUtil.a("ObserverRecycleViewAdapter", "setDataInternal");
        this.k = fotVar.h();
        this.e = fotVar.e();
        this.o = fotVar.k();
        this.f7223b = fotVar.c();
        this.g = fotVar.a();
        this.l = fotVar.f();
        this.h = fotVar.j();
        this.m = fotVar.i();
        this.j = fotVar.g();
        this.n = fotVar.n();
        this.d = fotVar.d();
        this.i = fotVar.b();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ObserverRecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("ObserverRecycleViewAdapter", "onCreateViewHolder");
        return new ObserverRecycleViewHolder(LayoutInflater.from(this.f7224c).inflate(R.layout.observer_recycleview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ObserverRecycleViewHolder observerRecycleViewHolder, final int i) {
        LogUtil.a("ObserverRecycleViewAdapter", "onBindViewHolder: " + i);
        if (fts.d(this.k, i)) {
            qsp.b(observerRecycleViewHolder.f, this.k.get(i));
            observerRecycleViewHolder.f.setAutoTextInfo(10, 1, 1);
        }
        if (fts.d(this.e, i)) {
            qsp.b(observerRecycleViewHolder.f7226b, this.e.get(i));
        }
        if (fts.d(this.o, i)) {
            qsp.b(observerRecycleViewHolder.f7227c, this.o.get(i));
        }
        if (fts.d(this.f7223b, i)) {
            qsp.b(observerRecycleViewHolder.d, this.f7223b.get(i));
        }
        observerRecycleViewHolder.f7225a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.ObserverRecycleViewAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ObserverRecycleViewAdapter.this.d != null) {
                    ObserverRecycleViewAdapter.this.d.onClick(i);
                }
                ObserverRecycleViewAdapter.this.d(i);
                ObserverRecycleViewAdapter.this.notifyDataSetChanged();
            }
        });
        e(observerRecycleViewHolder, i);
        if (this.i == 1) {
            observerRecycleViewHolder.f7225a.setMinimumHeight(qrs.e(this.f7224c, f7222a));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        LogUtil.a("ObserverRecycleViewAdapter", "getMaxValue: " + fts.e(this.o, this.e, this.k));
        return fts.e(this.o, this.e, this.k, this.f7223b);
    }

    private int c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.f = i;
    }

    public class ObserverRecycleViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthCardView f7225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7227c;
        private HealthTextView d;
        private HealthTextView f;

        public ObserverRecycleViewHolder(View view) {
            super(view);
            this.f7225a = (HealthCardView) view.findViewById(R.id.observer_recyclerview_root_view);
            this.f = (HealthTextView) view.findViewById(R.id.observer_item_top_text);
            this.f7226b = (HealthTextView) view.findViewById(R.id.observer_item_bottom_value);
            this.f7227c = (HealthTextView) view.findViewById(R.id.observer_item_bottom_unit);
            this.d = (HealthTextView) view.findViewById(R.id.observer_left_middle_text);
        }
    }

    public void e(ObserverRecycleViewHolder observerRecycleViewHolder, int i) {
        if (i == c()) {
            qsp.e(observerRecycleViewHolder.f7225a, this.g);
            qsp.c((TextView) observerRecycleViewHolder.f, this.h);
            qsp.b(observerRecycleViewHolder.f, this.j);
            qsp.c((TextView) observerRecycleViewHolder.f7226b, this.h);
            qsp.b(observerRecycleViewHolder.f7226b, this.j);
            qsp.c((TextView) observerRecycleViewHolder.f7227c, this.h);
            qsp.b(observerRecycleViewHolder.f7227c, this.j);
            qsp.c((TextView) observerRecycleViewHolder.d, this.h);
            qsp.b(observerRecycleViewHolder.d, this.j);
            return;
        }
        qsp.e(observerRecycleViewHolder.f7225a, this.l);
        qsp.c((TextView) observerRecycleViewHolder.f, this.m);
        qsp.b(observerRecycleViewHolder.f, this.n);
        qsp.c((TextView) observerRecycleViewHolder.f7226b, this.m);
        qsp.b(observerRecycleViewHolder.f7226b, this.n);
        qsp.c((TextView) observerRecycleViewHolder.f7227c, this.m);
        qsp.b(observerRecycleViewHolder.f7227c, this.n);
        qsp.c((TextView) observerRecycleViewHolder.d, this.m);
        qsp.b(observerRecycleViewHolder.d, this.n);
    }
}
