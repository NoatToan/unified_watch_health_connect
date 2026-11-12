package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.pluginsocialshare.R;
import defpackage.lrd;
import defpackage.qre;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class LayoutListAdapter extends RecyclerView.Adapter<HorizontalListItemViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f22468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnItemClickListener f22469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HorizontalListItemViewHolder f22470c;
    private Context d;
    private int[] e;
    private int g;
    private List<Integer> i;
    private List<Integer> j;

    public interface OnItemClickListener {
        void onItemClick(int i, int i2);
    }

    public HorizontalListItemViewHolder a() {
        return this.f22470c;
    }

    public void b(HorizontalListItemViewHolder horizontalListItemViewHolder) {
        this.f22470c = horizontalListItemViewHolder;
    }

    public void d(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f22468a = onGlobalLayoutListener;
    }

    public LayoutListAdapter(Context context, int[] iArr, List<Integer> list, List<Integer> list2, int i, OnItemClickListener onItemClickListener) {
        this.d = context;
        this.e = iArr;
        this.i = list;
        this.j = list2;
        this.g = i == -1 ? 0 : i;
        this.f22469b = onItemClickListener;
    }

    public void c(int[] iArr, List<Integer> list, List<Integer> list2) {
        this.e = iArr;
        this.i = list;
        this.j = list2;
        notifyDataSetChanged();
    }

    public void e(int i) {
        this.g = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int[] iArr = this.e;
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return iArr.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public HorizontalListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new HorizontalListItemViewHolder(LayoutInflater.from(this.d).inflate(R.layout.layup_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(HorizontalListItemViewHolder horizontalListItemViewHolder, final int i) {
        int[] iArr = this.e;
        if (iArr == null || iArr.length <= i || CollectionUtils.a(this.i) || CollectionUtils.a(this.j) || this.e.length != this.i.size() || this.e.length != this.j.size()) {
            return;
        }
        String str = qre.f(R.string.IDS_hwh_edit_share_layout) + (i + 1);
        if (i == this.g) {
            horizontalListItemViewHolder.f22473c.setImageResource(this.i.get(i).intValue());
            horizontalListItemViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_selected, str));
        } else {
            horizontalListItemViewHolder.f22473c.setImageResource(this.j.get(i).intValue());
            horizontalListItemViewHolder.itemView.setContentDescription(str);
        }
        horizontalListItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.LayoutListAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LayoutListAdapter.this.g = i;
                if (lrd.d()) {
                    HorizontalListItemViewHolder horizontalListItemViewHolder2 = (HorizontalListItemViewHolder) view.getTag();
                    LayoutListAdapter.this.b(horizontalListItemViewHolder2);
                    lrd.c(horizontalListItemViewHolder2.itemView, qre.f(R.string.accessibility_checked));
                }
                if (LayoutListAdapter.this.f22469b != null) {
                    LayoutListAdapter.this.f22469b.onItemClick(i, LayoutListAdapter.this.e[i]);
                }
                LayoutListAdapter.this.notifyDataSetChanged();
            }
        });
    }

    public static class HorizontalListItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f22472a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f22473c;

        public HorizontalListItemViewHolder(View view) {
            super(view);
            this.f22472a = (RelativeLayout) view.findViewById(R.id.data_bg_layout);
            this.f22473c = (ImageView) view.findViewById(R.id.data_img);
            view.setTag(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f22468a;
        if (onGlobalLayoutListener != null) {
            qsp.b(recyclerView, onGlobalLayoutListener);
        }
    }
}
