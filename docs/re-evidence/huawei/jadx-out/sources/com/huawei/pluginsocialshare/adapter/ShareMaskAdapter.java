package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.pluginsocialshare.R;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pmx;
import defpackage.qre;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ShareMaskAdapter extends RecyclerView.Adapter<MaskContentViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f22496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<pmx> f22497c;
    private int d = 0;
    private OnItemClickListener e;

    public interface OnItemClickListener {
        void onItemClick(int i, pmx pmxVar);
    }

    public void e(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f22496b = onGlobalLayoutListener;
    }

    public ShareMaskAdapter(Context context, List<pmx> list, OnItemClickListener onItemClickListener) {
        this.f22495a = context;
        this.f22497c = list;
        this.e = onItemClickListener;
    }

    public void b(List<pmx> list) {
        this.f22497c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f22497c)) {
            return 0;
        }
        return this.f22497c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaskContentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MaskContentViewHolder(LayoutInflater.from(this.f22495a).inflate(R.layout.mask_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MaskContentViewHolder maskContentViewHolder, final int i) {
        final pmx pmxVar;
        if (njy.e(this.f22497c, i) || (pmxVar = this.f22497c.get(i)) == null) {
            return;
        }
        maskContentViewHolder.f22501a.setImageResource(pmxVar.e());
        final String str = qre.f(R.string.IDS_custom_share_mask) + (i + 1);
        if (i == this.d) {
            maskContentViewHolder.f22502b.setVisibility(0);
            maskContentViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_selected, str));
        } else {
            maskContentViewHolder.f22502b.setVisibility(8);
            maskContentViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_unselected, str));
        }
        maskContentViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ShareMaskAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaskContentViewHolder maskContentViewHolder2 = (MaskContentViewHolder) view.getTag();
                int i2 = ShareMaskAdapter.this.d;
                int i3 = i;
                if (i2 != i3) {
                    ShareMaskAdapter.this.d = i3;
                    lrd.c(maskContentViewHolder2.itemView, qre.a(R.string.accessibility_selected, str));
                    pmxVar.a(true);
                }
                if (ShareMaskAdapter.this.e != null) {
                    ShareMaskAdapter.this.e.onItemClick(ShareMaskAdapter.this.d, pmxVar);
                }
                ShareMaskAdapter.this.notifyDataSetChanged();
            }
        });
    }

    public static class MaskContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f22501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f22502b;

        public MaskContentViewHolder(View view) {
            super(view);
            this.f22501a = (ImageView) view.findViewById(R.id.sticker_img);
            this.f22502b = (ImageView) view.findViewById(R.id.sticker_img_mark);
            this.itemView.setTag(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f22496b;
        if (onGlobalLayoutListener != null) {
            qsp.b(recyclerView, onGlobalLayoutListener);
        }
    }
}
