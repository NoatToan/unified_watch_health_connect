package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.pluginsocialshare.R;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ColorListAdapter extends RecyclerView.Adapter<HorizontalListItemViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HorizontalListItemViewHolder f22448c;
    private List<Integer> d;
    private ViewTreeObserver.OnGlobalLayoutListener e;
    private OnItemClickListener f;
    private int j;

    public interface OnItemClickListener {
        void onItemClick(int i, int i2);
    }

    public void d(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.e = onGlobalLayoutListener;
    }

    public HorizontalListItemViewHolder a() {
        return this.f22448c;
    }

    public void c(HorizontalListItemViewHolder horizontalListItemViewHolder) {
        this.f22448c = horizontalListItemViewHolder;
    }

    public ColorListAdapter(Context context, int i, List<Integer> list, OnItemClickListener onItemClickListener) {
        this.f22447b = context;
        this.d = list;
        this.f22446a = i;
        this.f = onItemClickListener;
    }

    public void a(List<Integer> list) {
        this.d = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.d)) {
            return 0;
        }
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HorizontalListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new HorizontalListItemViewHolder(LayoutInflater.from(this.f22447b).inflate(R.layout.color_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(HorizontalListItemViewHolder horizontalListItemViewHolder, final int i) {
        String strF;
        if (njy.e(this.d, i)) {
            return;
        }
        if (i == 0) {
            horizontalListItemViewHolder.f22451b.setBackground(qre.c(this.f22446a == 0 ? R.mipmap.share_ai_color : R.mipmap.mark_ai));
            horizontalListItemViewHolder.e.setVisibility(0);
        } else {
            horizontalListItemViewHolder.e.setVisibility(8);
            Drawable drawableC = qre.c(R.drawable.sticker_icon_bg);
            if (drawableC != null) {
                horizontalListItemViewHolder.f22451b.setBackground(qqf.c(drawableC, qre.e(this.d.get(i).intValue())));
            }
        }
        if (i == 0) {
            strF = qre.f(R.string.IDS_share_accessibility_ai_color);
        } else {
            strF = qre.f(R.string.IDS_hwh_edit_share_text_color) + i;
        }
        if (i == this.j) {
            horizontalListItemViewHolder.f22452c.setVisibility(0);
            horizontalListItemViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_selected, strF));
        } else {
            horizontalListItemViewHolder.f22452c.setVisibility(4);
            horizontalListItemViewHolder.itemView.setContentDescription(strF);
        }
        horizontalListItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ColorListAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ColorListAdapter.this.j = i;
                if (lrd.d()) {
                    HorizontalListItemViewHolder horizontalListItemViewHolder2 = (HorizontalListItemViewHolder) view.getTag();
                    ColorListAdapter.this.c(horizontalListItemViewHolder2);
                    lrd.c(horizontalListItemViewHolder2.itemView, qre.f(R.string.accessibility_checked));
                }
                if (ColorListAdapter.this.f != null) {
                    ColorListAdapter.this.f.onItemClick(i, ((Integer) ColorListAdapter.this.d.get(i)).intValue());
                }
                ColorListAdapter.this.notifyDataSetChanged();
            }
        });
    }

    public static class HorizontalListItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RelativeLayout f22451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RelativeLayout f22452c;
        View e;

        public HorizontalListItemViewHolder(View view) {
            super(view);
            this.f22451b = (RelativeLayout) view.findViewById(R.id.color_bg_layout);
            this.f22452c = (RelativeLayout) view.findViewById(R.id.color_bg_layout_outer);
            this.e = view.findViewById(R.id.line);
            view.setTag(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.e;
        if (onGlobalLayoutListener != null) {
            qsp.b(recyclerView, onGlobalLayoutListener);
        }
    }
}
