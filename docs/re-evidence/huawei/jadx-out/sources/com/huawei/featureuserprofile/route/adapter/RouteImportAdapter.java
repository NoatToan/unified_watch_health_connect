package com.huawei.featureuserprofile.route.adapter;

import android.content.Context;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.route.bean.KomootRouteBean;
import com.huawei.featureuserprofile.route.bean.KomootRouteData;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.cxu;
import defpackage.njy;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class RouteImportAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f5636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CallBack f5637c;
    private RecyclerView h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<KomootRouteData> f5635a = new ArrayList();
    private int j = 5;
    private final Map<Long, KomootRouteBean.Tour> g = new ArrayMap();
    private final Map<Long, KomootRouteBean.Tour> i = new ArrayMap();
    private final Map<Long, KomootRouteBean.Tour> f = new ArrayMap();
    private String e = "All";
    private boolean d = false;

    public interface CallBack {
        void onItemCheckedChanged();

        void onLoadingMore();
    }

    public RouteImportAdapter(Context context, RecyclerView recyclerView, CallBack callBack) {
        this.f5636b = context;
        this.f5637c = callBack;
        this.h = recyclerView;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.featureuserprofile.route.adapter.RouteImportAdapter.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                super.onScrollStateChanged(recyclerView2, i);
                if (i == 0 && RouteImportAdapter.this.j()) {
                    RouteImportAdapter.this.f5637c.onLoadingMore();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                super.onScrolled(recyclerView2, i, i2);
                if (RouteImportAdapter.this.j()) {
                    RouteImportAdapter.this.b();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new b(LayoutInflater.from(this.f5636b).inflate(R.layout.hw_load_more, viewGroup, false), 1);
        }
        return new b(LayoutInflater.from(this.f5636b).inflate(R.layout.item_import_route, viewGroup, false), 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        if (njy.e(this.f5635a) || i >= this.f5635a.size()) {
            return;
        }
        KomootRouteData komootRouteData = this.f5635a.get(i);
        if (komootRouteData.getType() == 1) {
            bVar.f5641c.setVisibility(this.d ? 8 : 0);
            bVar.f5639a.setText(this.d ? this.f5636b.getString(R.string.IDS_my_route_loading_no_more) : this.f5636b.getString(R.string.IDS_my_route_loading_more));
            return;
        }
        final KomootRouteBean.Tour data = komootRouteData.getData();
        bVar.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.featureuserprofile.route.adapter.RouteImportAdapter$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.d(data, compoundButton, z);
            }
        });
        if (!this.f.isEmpty() && this.f.containsKey(Long.valueOf(data.getId()))) {
            this.g.put(Long.valueOf(data.getId()), data);
            this.f.remove(Long.valueOf(data.getId()));
            LogUtil.e("RouteImportAdapter", "ToRestoredTours remove -->" + data.toString());
        }
        if (!this.i.isEmpty() && this.i.size() >= this.j) {
            boolean zContainsKey = this.g.containsKey(Long.valueOf(data.getId()));
            bVar.d.setVisibility(zContainsKey ? 0 : 8);
            bVar.e.setVisibility(zContainsKey ? 8 : 0);
        } else {
            bVar.d.setVisibility(0);
            bVar.e.setVisibility(8);
        }
        if (!this.g.isEmpty()) {
            bVar.d.setChecked(this.g.containsKey(Long.valueOf(data.getId())));
        } else {
            bVar.d.setChecked(false);
        }
        Glide.with(this.f5636b).load(cxu.c(data.getPreviewSrc(), bVar.f5640b)).placeholder(R.drawable.ic_line).error(R.drawable.ic_line).into(bVar.f5640b);
        bVar.i.setText(data.getName());
        bVar.h.setText(cxu.e(this.f5636b, data.getDistance().doubleValue()));
        bVar.f.setText(cxu.e(this.f5636b, data.getDuration()));
        bVar.j.setText(cxu.a(data.getDate()));
    }

    /* synthetic */ void d(KomootRouteBean.Tour tour, CompoundButton compoundButton, boolean z) {
        d(tour, z);
    }

    private void d(KomootRouteBean.Tour tour, boolean z) {
        if (z) {
            if (!this.g.containsKey(Long.valueOf(tour.getId()))) {
                this.g.put(Long.valueOf(tour.getId()), tour);
                c(tour, true);
            }
        } else {
            this.g.remove(Long.valueOf(tour.getId()));
            c(tour, false);
        }
        h();
        this.f5637c.onItemCheckedChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f5635a)) {
            return 0;
        }
        return this.f5635a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f5635a) || i >= this.f5635a.size()) {
            return 1;
        }
        return this.f5635a.get(i).getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        if (!(this.h.getLayoutManager() instanceof LinearLayoutManager)) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.h.getLayoutManager();
        return !this.d && linearLayoutManager.findLastVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }

    private void h() {
        if ((this.i.size() == this.j || this.i.size() == this.j - 1) && this.h.getScrollState() == 0 && !this.h.isComputingLayout()) {
            notifyItemRangeChanged(0, this.f5635a.size() - 1);
        }
    }

    public void a(List<KomootRouteData> list, boolean z) {
        if (z) {
            i();
            this.f5635a.clear();
            this.g.clear();
            this.d = false;
        }
        LogUtil.e("RouteImportAdapter", "cache size = " + this.i.size() + ", select type = " + this.e);
        g();
        this.f5635a.addAll(list);
        o();
        notifyDataSetChanged();
    }

    public void c(String str) {
        this.e = str;
    }

    public void b(List<KomootRouteBean.Tour> list) {
        if (njy.e(list)) {
            return;
        }
        for (KomootRouteBean.Tour tour : list) {
            this.f.put(Long.valueOf(tour.getId()), tour);
            LogUtil.e("RouteImportAdapter", "ToRestoredTours put -->" + tour.toString());
        }
        this.i.putAll(this.f);
    }

    private void i() {
        for (Map.Entry<Long, KomootRouteBean.Tour> entry : this.g.entrySet()) {
            LogUtil.e("RouteImportAdapter", "cache selected:" + entry.toString());
            this.i.put(entry.getKey(), entry.getValue());
        }
    }

    private void c(KomootRouteBean.Tour tour, boolean z) {
        if (z) {
            if (this.i.containsKey(Long.valueOf(tour.getId()))) {
                LogUtil.e("RouteImportAdapter", "already cached:" + tour.toString());
                return;
            } else {
                this.i.put(Long.valueOf(tour.getId()), tour);
                LogUtil.e("RouteImportAdapter", "add new cache --> " + tour.toString() + ", current is = " + this.i.size());
                return;
            }
        }
        if (this.i.containsKey(Long.valueOf(tour.getId()))) {
            this.i.remove(Long.valueOf(tour.getId()));
            LogUtil.e("RouteImportAdapter", "remove cache --> " + tour.toString() + ", remain is = " + this.i.size());
        }
    }

    private void o() {
        if (this.i.isEmpty()) {
            return;
        }
        if (this.e.equalsIgnoreCase("All")) {
            LogUtil.e("RouteImportAdapter", "restore all cache selected size:" + this.i.size());
            this.g.putAll(this.i);
            return;
        }
        f();
    }

    private void f() {
        for (Map.Entry<Long, KomootRouteBean.Tour> entry : this.i.entrySet()) {
            if (this.e.equalsIgnoreCase(entry.getValue().getSport())) {
                LogUtil.e("RouteImportAdapter", "restore cache selected:" + entry.toString());
                this.g.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void c(int i) {
        this.j = Math.min(i, 5);
    }

    public void e() {
        this.d = true;
        notifyItemChanged(this.f5635a.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f5635a.size() > 0) {
            List<KomootRouteData> list = this.f5635a;
            if (list.get(list.size() - 1).getType() == 1) {
                return;
            }
        }
        new Handler().post(new Runnable() { // from class: cxm
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.f5635a.add(new KomootRouteData(1));
        notifyItemChanged(this.f5635a.size() - 1);
    }

    private void g() {
        if (this.f5635a.size() != 0) {
            List<KomootRouteData> list = this.f5635a;
            if (list.get(list.size() - 1).getType() != 1) {
                return;
            }
            List<KomootRouteData> list2 = this.f5635a;
            list2.remove(list2.size() - 1);
        }
    }

    public Map<Long, KomootRouteBean.Tour> a() {
        return this.g;
    }

    public Map<Long, KomootRouteBean.Tour> d() {
        return this.i;
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f5639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f5640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthProgressBar f5641c;
        HealthCheckBox d;
        View e;
        HealthTextView f;
        HealthTextView h;
        HealthTextView i;
        HealthTextView j;

        b(View view, int i) {
            super(view);
            if (i == 1) {
                this.f5641c = (HealthProgressBar) view.findViewById(R.id.progress_bar_loading);
                this.f5639a = (HealthTextView) view.findViewById(R.id.tv_loading_text);
                return;
            }
            this.f5640b = (ImageView) view.findViewById(R.id.img_thumb);
            this.i = (HealthTextView) view.findViewById(R.id.tv_route_name);
            this.f = (HealthTextView) view.findViewById(R.id.tv_route_duration);
            this.h = (HealthTextView) view.findViewById(R.id.tv_route_distance);
            this.j = (HealthTextView) view.findViewById(R.id.tv_route_date);
            this.d = (HealthCheckBox) view.findViewById(R.id.ck_select);
            this.e = view.findViewById(R.id.view_gray_mask);
        }
    }
}
