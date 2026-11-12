package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import defpackage.gyi;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pmr;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ShareStickerAdapter extends RecyclerView.Adapter<StickerContentViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22503a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ShareDataInfo> f22504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f22505c;
    private OnItemClickListener d;
    private Context e;

    public interface OnItemClickListener {
        void onItemClick(int i, ShareDataInfo shareDataInfo);
    }

    public void b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f22505c = onGlobalLayoutListener;
    }

    public ShareStickerAdapter(Context context, List<ShareDataInfo> list, OnItemClickListener onItemClickListener) {
        this.e = context;
        this.f22504b = list;
        this.d = onItemClickListener;
    }

    public void b(List<ShareDataInfo> list) {
        this.f22504b = list;
        notifyDataSetChanged();
    }

    public void e(int i) {
        this.f22503a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f22504b)) {
            return 0;
        }
        return this.f22504b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public StickerContentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StickerContentViewHolder(LayoutInflater.from(this.e).inflate(R.layout.sticker_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(StickerContentViewHolder stickerContentViewHolder, final int i) {
        final ShareDataInfo shareDataInfo;
        if (njy.e(this.f22504b, i) || (shareDataInfo = this.f22504b.get(i)) == null) {
            return;
        }
        if (shareDataInfo instanceof pmr) {
            qqf.d(((pmr) shareDataInfo).c(), stickerContentViewHolder.f22509c);
        } else if (shareDataInfo instanceof gyi) {
            d(stickerContentViewHolder.f22509c, (gyi) shareDataInfo);
        } else {
            LogUtil.a("Share_ShareStickerAdapter", "setContentViewImage down bg show");
        }
        final String str = qre.f(R.string.IDS_hwh_edit_share_texture) + (i + 1);
        if (i == this.f22503a) {
            stickerContentViewHolder.f22508b.setVisibility(0);
            stickerContentViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_selected, str));
        } else {
            stickerContentViewHolder.f22508b.setVisibility(8);
            stickerContentViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_unselected, str));
        }
        stickerContentViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ShareStickerAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StickerContentViewHolder stickerContentViewHolder2 = (StickerContentViewHolder) view.getTag();
                int i2 = ShareStickerAdapter.this.f22503a;
                int i3 = i;
                if (i2 == i3) {
                    ShareStickerAdapter.this.f22503a = -1;
                    lrd.c(stickerContentViewHolder2.itemView, qre.a(R.string.accessibility_unselected, str));
                } else {
                    ShareStickerAdapter.this.f22503a = i3;
                    lrd.c(stickerContentViewHolder2.itemView, qre.a(R.string.accessibility_selected, str));
                }
                if (ShareStickerAdapter.this.d != null) {
                    ShareStickerAdapter.this.d.onItemClick(ShareStickerAdapter.this.f22503a, shareDataInfo);
                }
                ShareStickerAdapter.this.notifyDataSetChanged();
            }
        });
    }

    protected void d(ImageView imageView, ShareDataInfo shareDataInfo) {
        if (shareDataInfo == null || TextUtils.isEmpty(shareDataInfo.getPath())) {
            LogUtil.a("Share_ShareStickerAdapter", "setImageViewByPath params null");
            return;
        }
        File file = new File(CommonUtil.c(shareDataInfo.getPath()));
        if (file.exists()) {
            qqf.c(file, new RequestOptions().centerInside(), imageView);
        }
    }

    public static class StickerContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f22508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f22509c;

        public StickerContentViewHolder(View view) {
            super(view);
            this.f22509c = (ImageView) view.findViewById(R.id.sticker_img);
            this.f22508b = (ImageView) view.findViewById(R.id.sticker_img_mark);
            this.itemView.setTag(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f22505c;
        if (onGlobalLayoutListener != null) {
            qsp.b(recyclerView, onGlobalLayoutListener);
        }
    }
}
