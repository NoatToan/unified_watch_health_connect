package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pmz;
import defpackage.pna;
import defpackage.pns;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ShareBottomDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22484a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<pmz> f22485c;
    private Context d;
    private OnItemClickListener e;

    public interface OnItemClickListener {
        void onItemClick(int i, List<pna> list, pna pnaVar);
    }

    public ShareBottomDataAdapter(Context context, List<pmz> list, OnItemClickListener onItemClickListener) {
        this.d = context;
        this.f22485c = list;
        this.e = onItemClickListener;
    }

    public void e(List<pmz> list) {
        if (njy.e(list)) {
            return;
        }
        this.f22485c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f22485c)) {
            return 0;
        }
        return this.f22485c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f22485c)) {
            return 0;
        }
        return this.f22485c.get(i).d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new DataContentViewHolder(LayoutInflater.from(this.d).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
        }
        if (i == 2) {
            return new WaterContentViewHolder(LayoutInflater.from(this.d).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
        }
        return new TitleViewHolder(LayoutInflater.from(this.d).inflate(R.layout.title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        pmz pmzVar;
        if (njy.e(this.f22485c) || (pmzVar = this.f22485c.get(i)) == null) {
            return;
        }
        if (viewHolder instanceof TitleViewHolder) {
            ((TitleViewHolder) viewHolder).d(pmzVar);
            return;
        }
        if (viewHolder instanceof DataContentViewHolder) {
            ((DataContentViewHolder) viewHolder).c(this.d, this.f22485c, i, this.e);
        } else if (viewHolder instanceof WaterContentViewHolder) {
            ((WaterContentViewHolder) viewHolder).c(this.d, this.f22485c, i, this.e);
        } else {
            LogUtil.a("Share_ShareBottomDataAdapter", "onBindViewHolder no branch.");
        }
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TextView f22489a;

        public TitleViewHolder(View view) {
            super(view);
            this.f22489a = (TextView) view.findViewById(R.id.head_text);
        }

        public void d(pmz pmzVar) {
            this.f22489a.setText(pmzVar.c());
        }
    }

    public static class DataContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DataItemAdapter f22486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthRecycleView f22487b;

        public DataContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.f22487b = healthRecycleView;
            healthRecycleView.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), pns.e(), 1, false));
        }

        public void c(Context context, List<pmz> list, int i, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            List<pna> listB = list.get(i).b();
            if (njy.e(listB)) {
                return;
            }
            DataItemAdapter dataItemAdapter = this.f22486a;
            if (dataItemAdapter != null) {
                dataItemAdapter.c(listB);
                return;
            }
            this.f22486a = new DataItemAdapter(context, listB, new DataItemAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ShareBottomDataAdapter.DataContentViewHolder.1
                @Override // com.huawei.pluginsocialshare.adapter.DataItemAdapter.OnItemClickListener
                public void onItemClick(int i2, List<pna> list2, pna pnaVar) {
                    int unused = ShareBottomDataAdapter.f22484a = 5;
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i2, list2, pnaVar);
                    }
                }
            });
            this.f22487b.setNestedScrollingEnabled(false);
            this.f22487b.setAdapter(this.f22486a);
        }
    }

    public static class WaterContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f22490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthRecycleView f22491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WaterItemAdapter f22492c;

        public WaterContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.f22491b = healthRecycleView;
            healthRecycleView.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), pns.e(), 1, false));
            this.f22490a = new a();
        }

        public void c(Context context, List<pmz> list, int i, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            List<pna> listE = list.get(i).e();
            if (njy.e(listE)) {
                return;
            }
            WaterItemAdapter waterItemAdapter = this.f22492c;
            if (waterItemAdapter != null) {
                waterItemAdapter.a(listE);
                return;
            }
            this.f22492c = new WaterItemAdapter(context, listE, new WaterItemAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ShareBottomDataAdapter.WaterContentViewHolder.4
                @Override // com.huawei.pluginsocialshare.adapter.WaterItemAdapter.OnItemClickListener
                public void onItemClick(int i2, List<pna> list2, pna pnaVar) {
                    int unused = ShareBottomDataAdapter.f22484a = 6;
                    if (lrd.d()) {
                        WaterContentViewHolder.this.f22490a.e(WaterContentViewHolder.this.f22492c.e());
                    }
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i2, list2, pnaVar);
                    }
                }
            });
            this.f22491b.setNestedScrollingEnabled(false);
            this.f22491b.setAdapter(this.f22492c);
            qsp.a(this.f22491b, this.f22490a);
        }
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.ViewHolder f22494b;

        private a() {
        }

        public void e(RecyclerView.ViewHolder viewHolder) {
            this.f22494b = viewHolder;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView.ViewHolder viewHolder = this.f22494b;
            if (viewHolder == null) {
                LogUtil.j("Share_ShareBottomDataAdapter", "InnerOnGlobalLayoutListener onGlobalLayout holder is null");
            } else if ((viewHolder instanceof WaterItemAdapter.WaterContentViewHolder) && ShareBottomDataAdapter.f22484a == 6) {
                lrd.b(this.f22494b.itemView, 8);
                int unused = ShareBottomDataAdapter.f22484a = -1;
                this.f22494b = null;
            }
        }
    }
}
