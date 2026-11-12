package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import defpackage.gye;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pmm;
import defpackage.pmr;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ShareBackgroundAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f22474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentViewHolder f22475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ShareDataInfo> f22476c;
    private Context d;
    private ShareDataInfo e;
    private ShareDataInfo f;
    private int g = 1;
    private OnLongItemClickListener h;
    private OnItemClickListener j;

    public interface OnItemClickListener {
        void onItemClick(int i, ShareDataInfo shareDataInfo);
    }

    public interface OnLongItemClickListener {
        void onOnLongItemClick(int i, ShareDataInfo shareDataInfo);
    }

    public ContentViewHolder c() {
        return this.f22475b;
    }

    public void b(ContentViewHolder contentViewHolder) {
        this.f22475b = contentViewHolder;
    }

    public void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f22474a = onGlobalLayoutListener;
    }

    public ShareBackgroundAdapter(Context context, List<ShareDataInfo> list, OnItemClickListener onItemClickListener, OnLongItemClickListener onLongItemClickListener) {
        this.d = context;
        this.f22476c = list;
        this.j = onItemClickListener;
        this.h = onLongItemClickListener;
    }

    public void d(List<ShareDataInfo> list) {
        if (njy.e(list)) {
            return;
        }
        this.f22476c = list;
        notifyDataSetChanged();
    }

    public void b() {
        ShareDataInfo shareDataInfo = this.e;
        if (shareDataInfo == null) {
            return;
        }
        c(shareDataInfo);
    }

    public void a() {
        ShareDataInfo shareDataInfo = this.f;
        if (shareDataInfo == null) {
            return;
        }
        c(shareDataInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f22476c)) {
            return 0;
        }
        return this.f22476c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ContentViewHolder(LayoutInflater.from(this.d).inflate(R.layout.background_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ShareDataInfo shareDataInfo;
        if (njy.e(this.f22476c, i) || (shareDataInfo = this.f22476c.get(i)) == null) {
            return;
        }
        c((ContentViewHolder) viewHolder, shareDataInfo, i, this.j);
    }

    private void c(ContentViewHolder contentViewHolder, final ShareDataInfo shareDataInfo, final int i, final OnItemClickListener onItemClickListener) {
        String strA;
        qqf.d(R.mipmap.share_bg_select, contentViewHolder.d);
        if (i != 0) {
            String str = qre.f(R.string.IDS_hwh_edit_share_background) + (!EnvironmentInfo.m() ? i : i + 1);
            if (shareDataInfo.isSelect()) {
                contentViewHolder.d.setVisibility(0);
                contentViewHolder.itemView.setContentDescription(qre.a(R.string.accessibility_selected, str));
                this.e = shareDataInfo;
            } else {
                contentViewHolder.d.setVisibility(8);
                contentViewHolder.itemView.setContentDescription(str);
            }
        } else {
            if (!EnvironmentInfo.m()) {
                strA = qre.f(R.string.accessibility_select_pic);
            } else {
                strA = qre.a(R.string.accessibility_unselected, qre.f(R.string.IDS_hwh_edit_share_background) + 1);
            }
            contentViewHolder.itemView.setContentDescription(strA);
        }
        e(contentViewHolder, shareDataInfo);
        contentViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ShareBackgroundAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (lrd.d()) {
                    ShareBackgroundAdapter.this.b((ContentViewHolder) view.getTag());
                }
                if (!(shareDataInfo instanceof pmr)) {
                    ShareBackgroundAdapter shareBackgroundAdapter = ShareBackgroundAdapter.this;
                    int i2 = i;
                    if (i2 == 0) {
                        i2 = shareBackgroundAdapter.g;
                    }
                    shareBackgroundAdapter.g = i2;
                    ShareBackgroundAdapter.this.f = shareDataInfo;
                }
                OnItemClickListener onItemClickListener2 = onItemClickListener;
                if (onItemClickListener2 != null) {
                    onItemClickListener2.onItemClick(i, shareDataInfo);
                }
            }
        });
        contentViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.pluginsocialshare.adapter.ShareBackgroundAdapter.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (ShareBackgroundAdapter.this.h == null) {
                    return true;
                }
                ShareBackgroundAdapter.this.h.onOnLongItemClick(i, shareDataInfo);
                return true;
            }
        });
    }

    public void c(ShareDataInfo shareDataInfo) {
        if (njy.e(this.f22476c) || shareDataInfo == null) {
            return;
        }
        for (ShareDataInfo shareDataInfo2 : this.f22476c) {
            shareDataInfo2.setSelect(shareDataInfo2.getId() == shareDataInfo.getId());
        }
    }

    public void e(ContentViewHolder contentViewHolder, ShareDataInfo shareDataInfo) {
        contentViewHolder.f22483c.setVisibility(8);
        if (shareDataInfo instanceof pmr) {
            pmr pmrVar = (pmr) shareDataInfo;
            qqf.d(pmrVar.b(), contentViewHolder.f22482b);
            contentViewHolder.f22481a.setVisibility(8);
            contentViewHolder.e.setVisibility(8);
            if (pmrVar.getId() == -1) {
                contentViewHolder.d.setVisibility(8);
                return;
            }
            return;
        }
        if (shareDataInfo instanceof pmm) {
            c(contentViewHolder, (pmm) shareDataInfo);
            contentViewHolder.f22482b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            contentViewHolder.f22483c.setVisibility(0);
            contentViewHolder.f22481a.setVisibility(8);
            contentViewHolder.e.setVisibility(8);
            return;
        }
        if (shareDataInfo instanceof gye) {
            gye gyeVar = (gye) shareDataInfo;
            if (gyeVar.b() == 0) {
                contentViewHolder.f22481a.setVisibility(8);
                contentViewHolder.e.setVisibility(0);
            } else if (gyeVar.b() == 1) {
                contentViewHolder.f22481a.setVisibility(0);
                contentViewHolder.e.setVisibility(8);
            } else {
                contentViewHolder.f22481a.setVisibility(8);
                contentViewHolder.e.setVisibility(8);
            }
            c(contentViewHolder, gyeVar);
            return;
        }
        LogUtil.a("Share_ShareBackgroundAdapter", "setContentViewImage down bg show");
    }

    private void c(ContentViewHolder contentViewHolder, pmm pmmVar) {
        ImageView imageView = contentViewHolder.f22482b;
        if (pmmVar == null || TextUtils.isEmpty(pmmVar.getPath())) {
            LogUtil.a("Share_ShareBackgroundAdapter", "loadCameraShareDataByPath params null");
            return;
        }
        File file = new File(CommonUtil.c(pmmVar.getPath()));
        if (file.exists()) {
            RequestOptions requestOptionsCenterInside = new RequestOptions().centerInside();
            LogUtil.a("Share_ShareBackgroundAdapter", "file exit");
            qqf.c(file, requestOptionsCenterInside, imageView);
        }
    }

    private void c(ContentViewHolder contentViewHolder, gye gyeVar) {
        ImageView imageView = contentViewHolder.f22482b;
        if (gyeVar == null || TextUtils.isEmpty(gyeVar.h())) {
            LogUtil.a("Share_ShareBackgroundAdapter", "loadItemImageViewByPath params null");
            return;
        }
        File file = new File(CommonUtil.c(gyeVar.h()));
        if (file.exists()) {
            LogUtil.a("Share_ShareBackgroundAdapter", "path file size:", Long.valueOf(file.length()), " cloudSize:", Integer.valueOf(gyeVar.i()));
            if (file.length() >= gyeVar.i()) {
                RequestOptions requestOptionsCenterInside = new RequestOptions().centerInside();
                LogUtil.a("Share_ShareBackgroundAdapter", "file exit");
                qqf.c(file, requestOptionsCenterInside, imageView);
            }
        }
    }

    public static class ContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f22481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f22482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        TextView f22483c;
        ImageView d;
        ImageView e;

        public ContentViewHolder(View view) {
            super(view);
            this.f22482b = (ImageView) view.findViewById(R.id.bg_img);
            this.d = (ImageView) view.findViewById(R.id.bg_view_mark);
            this.f22483c = (TextView) view.findViewById(R.id.bg_latest_flag);
            this.e = (ImageView) view.findViewById(R.id.hw_health_edit_share_download);
            this.f22481a = (RelativeLayout) view.findViewById(R.id.hw_health_edit_share_downloading);
            this.itemView.setTag(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f22474a;
        if (onGlobalLayoutListener != null) {
            qsp.b(recyclerView, onGlobalLayoutListener);
        }
    }
}
