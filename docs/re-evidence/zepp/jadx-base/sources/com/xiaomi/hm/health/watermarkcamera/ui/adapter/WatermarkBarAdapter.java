package com.xiaomi.hm.health.watermarkcamera.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huami.android.design.dialog.loading.LoadingView;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.watermarkcamera.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkBarAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String k = "WatermarkBarAdapter";
    private static final int l = 2;
    private LayoutInflater a;
    private List<WatermarkBarItem> b;
    private List<WatermarkBarItem> c;
    private List<WatermarkBarItem> d;
    private Context e;
    private Bitmap f;
    private OnBarItemClickListener g;
    private OnWatermarkDownloadListener h;
    private int i = 0;
    private int j = 0;

    public interface OnBarItemClickListener {
        void onItemClick(View view, int i);
    }

    public interface OnWatermarkDownloadListener {
        void onDownloadComplete(int i);

        void onDownloadFailed(int i);

        void onDownloadStart(int i);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View a;
        public View b;
        public ImageView c;
        public ImageView d;
        public LoadingView e;
        public ImageView f;
        public ImageView g;
        public ImageView h;

        public ViewHolder(View view) {
            super(view);
        }
    }

    public static class WatermarkBarItem {
        public static final int IMG_CACHE_STATUS_LOADED = 3;
        public static final int IMG_CACHE_STATUS_LOADING = 4;
        public static final int IMG_CACHE_STATUS_NOCACHE = 1;
        public static final int IMG_CACHE_STATUS_PRE_LOAD = 2;
        public static final String a = "New";
        public static final String b = "Hot";
        public int imgCacheStatus;
        public boolean isFromNet;
        public boolean isNeedReload;
        public int itemType;
        public String mAngleType;
        public String mBlackUrl;
        public Bitmap mThumb;
        public String mThumbUrl;
        public String mWhiteUrl;

        public WatermarkBarItem(int i, boolean z) {
            this.itemType = i;
            this.isFromNet = z;
            if (z) {
                this.isNeedReload = true;
            }
            this.imgCacheStatus = 1;
        }
    }

    public class a extends SimpleTarget<File> {
        public final /* synthetic */ String d;
        public final /* synthetic */ WatermarkBarItem e;
        public final /* synthetic */ int f;
        public final /* synthetic */ ViewHolder g;

        public a(String str, WatermarkBarItem watermarkBarItem, int i, ViewHolder viewHolder) {
            this.d = str;
            this.e = watermarkBarItem;
            this.f = i;
            this.g = viewHolder;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull File file, @Nullable Transition<? super File> transition) {
            HMLog.d(WatermarkBarAdapter.k, "onLoadingComplete:" + this.d + ",bitmap=" + file.getAbsolutePath(), new Object[0]);
            WatermarkBarAdapter watermarkBarAdapter = WatermarkBarAdapter.this;
            watermarkBarAdapter.j = watermarkBarAdapter.j + 1;
            if (WatermarkBarAdapter.this.j == 2) {
                WatermarkBarAdapter.this.n(this.e, this.f);
                WatermarkBarAdapter.this.j = 0;
            }
        }

        @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
        public void onLoadFailed(@Nullable Drawable drawable) {
            HMLog.d(WatermarkBarAdapter.k, "onLoadingFailed:" + this.d, new Object[0]);
            this.g.e.stopLoading();
            this.g.e.setVisibility(8);
            IconToast.showError(WatermarkBarAdapter.this.e, WatermarkBarAdapter.this.e.getString(R.string.download_watermark_failed));
            if (WatermarkBarAdapter.this.h != null) {
                WatermarkBarAdapter.this.h.onDownloadFailed(this.f);
            }
        }
    }

    public static class b extends SimpleTarget<File> {
        public ImageView d;
        public WatermarkBarItem e;

        public b(ImageView imageView, WatermarkBarItem watermarkBarItem) {
            this.d = imageView;
            this.e = watermarkBarItem;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull File file, @Nullable Transition<? super File> transition) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
            this.d.setImageBitmap(bitmapDecodeFile);
            this.e.mThumb = bitmapDecodeFile;
        }
    }

    public WatermarkBarAdapter(Context context) {
        this.e = context;
        this.a = LayoutInflater.from(context);
    }

    private void g(ViewHolder viewHolder, int i, boolean z) {
        OnWatermarkDownloadListener onWatermarkDownloadListener = this.h;
        if (onWatermarkDownloadListener != null) {
            onWatermarkDownloadListener.onDownloadStart(i);
        }
        if (z) {
            this.b.get(i).imgCacheStatus = 3;
            notifyItemChanged(i);
            OnWatermarkDownloadListener onWatermarkDownloadListener2 = this.h;
            if (onWatermarkDownloadListener2 != null) {
                onWatermarkDownloadListener2.onDownloadComplete(i);
                return;
            }
            return;
        }
        if (!i(this.e)) {
            Context context = this.e;
            IconToast.showError(context, context.getString(R.string.no_network_connection));
            OnWatermarkDownloadListener onWatermarkDownloadListener3 = this.h;
            if (onWatermarkDownloadListener3 != null) {
                onWatermarkDownloadListener3.onDownloadFailed(i);
                return;
            }
            return;
        }
        if (viewHolder.e.getVisibility() != 8) {
            HMLog.d(k, "watermark is downloading please wait....", new Object[0]);
            return;
        }
        viewHolder.e.setStrokeWidth(10.0f);
        viewHolder.e.setCycleColor(-1);
        viewHolder.e.setVisibility(0);
        viewHolder.e.startLoading();
        this.b.get(i).imgCacheStatus = 4;
        h(viewHolder, this.b.get(i).mWhiteUrl, this.b.get(i), i);
        h(viewHolder, this.b.get(i).mBlackUrl, this.b.get(i), i);
    }

    private void h(ViewHolder viewHolder, String str, WatermarkBarItem watermarkBarItem, int i) {
        Glide.with(this.e).downloadOnly().load(str).into(new a(str, watermarkBarItem, i, viewHolder));
    }

    private boolean i(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i, ViewHolder viewHolder, View view) {
        if (this.i != i) {
            k(i);
            WatermarkBarItem watermarkBarItem = (WatermarkBarItem) viewHolder.itemView.getTag();
            boolean z = watermarkBarItem.imgCacheStatus == 2;
            if (watermarkBarItem.isFromNet || z) {
                g(viewHolder, i, z);
            } else {
                this.g.onItemClick(viewHolder.itemView, i);
            }
        }
    }

    private void k(int i) {
        int i2 = this.i;
        this.i = i;
        notifyItemChanged(i2);
        notifyItemChanged(this.i);
    }

    private void l() {
        Bitmap bitmap = this.f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f.recycle();
    }

    private void m(List<WatermarkBarItem> list) {
        WatermarkBarItem next;
        Iterator<WatermarkBarItem> it2 = list.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            Bitmap bitmap = next.mThumb;
            if (bitmap != null && !bitmap.isRecycled()) {
                next.mThumb.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(WatermarkBarItem watermarkBarItem, int i) {
        watermarkBarItem.isFromNet = false;
        watermarkBarItem.imgCacheStatus = 3;
        notifyItemChanged(i);
        OnWatermarkDownloadListener onWatermarkDownloadListener = this.h;
        if (onWatermarkDownloadListener != null) {
            onWatermarkDownloadListener.onDownloadComplete(i);
        }
    }

    public WatermarkBarItem getCurrentItem(int i) {
        return this.b.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<WatermarkBarItem> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<WatermarkBarItem> getWatermarkBarItemList() {
        return this.b;
    }

    public boolean isNeedReloadThumb(int i) {
        return this.b.get(i).isNeedReload;
    }

    public boolean isSelected(int i) {
        return this.i == i;
    }

    public void rebindWatermarkBarItemList(boolean z) {
        this.b = z ? this.d : this.c;
    }

    public void recycleBitmaps() {
        l();
        m(this.b);
    }

    public void reloadWatermarkBarItemList(List<WatermarkBarItem> list, boolean z) {
        if (z) {
            List<WatermarkBarItem> list2 = this.d;
            if (list2 != null) {
                list2.addAll(list);
                return;
            }
            return;
        }
        List<WatermarkBarItem> list3 = this.c;
        if (list3 != null) {
            list3.addAll(list);
        }
    }

    public void setBgBitmap(Bitmap bitmap) {
        this.f = bitmap;
    }

    public void setItemHighLight(int i) {
        this.i = i;
    }

    public void setOnBarItemClickListener(OnBarItemClickListener onBarItemClickListener) {
        this.g = onBarItemClickListener;
    }

    public void setOnWatermarkDownloadListener(OnWatermarkDownloadListener onWatermarkDownloadListener) {
        this.h = onWatermarkDownloadListener;
    }

    public void setWatermarkBarItemList(List<WatermarkBarItem> list, boolean z) {
        if (z) {
            if (this.d == null) {
                ArrayList arrayList = new ArrayList();
                this.d = arrayList;
                arrayList.addAll(list);
            }
            this.b = this.d;
            return;
        }
        if (this.c == null) {
            ArrayList arrayList2 = new ArrayList();
            this.c = arrayList2;
            arrayList2.addAll(list);
        }
        this.b = this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List list) {
        onBindViewHolder((ViewHolder) viewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewInflate = this.a.inflate(R.layout.layout_watermark_default_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(viewInflate);
        viewHolder.a = viewInflate.findViewById(R.id.default_watermark_buttom_layout);
        viewHolder.b = viewInflate.findViewById(R.id.new_watermark_buttom_layout);
        viewHolder.c = (ImageView) viewInflate.findViewById(R.id.default_watermark);
        viewHolder.d = (ImageView) viewInflate.findViewById(R.id.default_watermark_thumbnail);
        viewHolder.e = (LoadingView) viewInflate.findViewById(R.id.loading_view);
        viewHolder.f = (ImageView) viewInflate.findViewById(R.id.new_watermark_thumbnail);
        viewHolder.g = (ImageView) viewInflate.findViewById(R.id.new_watermark_icon);
        viewHolder.h = (ImageView) viewInflate.findViewById(R.id.hot_watermark_icon);
        return viewHolder;
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i, @NonNull List<Object> list) {
        super.onBindViewHolder(viewHolder, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        WatermarkBarItem watermarkBarItem = this.b.get(i);
        if (watermarkBarItem.isFromNet) {
            viewHolder.a.setVisibility(8);
            viewHolder.b.setVisibility(0);
            if (watermarkBarItem.imgCacheStatus == 4) {
                viewHolder.e.setVisibility(0);
                viewHolder.e.startLoading();
            } else {
                viewHolder.e.stopLoading();
                viewHolder.e.setVisibility(8);
            }
            if (isSelected(i)) {
                viewHolder.b.setBackgroundResource(R.drawable.waterbar_item_select_bg);
            } else {
                viewHolder.b.setBackgroundResource(R.drawable.waterbar_item_unselect_bg);
            }
            if (WatermarkBarItem.b.equalsIgnoreCase(watermarkBarItem.mAngleType)) {
                viewHolder.g.setImageResource(R.drawable.watermark_hot);
            } else {
                viewHolder.g.setImageResource(R.drawable.watermark_new);
            }
        } else {
            if (viewHolder.e.getVisibility() == 0) {
                viewHolder.e.stopLoading();
                viewHolder.e.setVisibility(8);
            }
            viewHolder.a.setVisibility(0);
            viewHolder.b.setVisibility(8);
            if (isSelected(i)) {
                viewHolder.a.setBackgroundResource(R.drawable.waterbar_item_select_bg);
            } else {
                viewHolder.a.setBackgroundResource(R.drawable.waterbar_item_unselect_bg);
            }
        }
        viewHolder.itemView.setTag(watermarkBarItem);
        if (this.f != null) {
            viewHolder.c.setBackgroundColor(-16777216);
        }
        if (!watermarkBarItem.isFromNet) {
            if (WatermarkBarItem.b.equalsIgnoreCase(watermarkBarItem.mAngleType)) {
                viewHolder.h.setVisibility(0);
            } else {
                viewHolder.h.setVisibility(8);
            }
            Bitmap bitmap = watermarkBarItem.mThumb;
            if (bitmap != null) {
                viewHolder.d.setImageBitmap(bitmap);
            } else {
                Glide.with(this.e).asFile().load(watermarkBarItem.mThumbUrl).into(new b(viewHolder.d, watermarkBarItem));
            }
        } else {
            Glide.with(this.e).asFile().load(watermarkBarItem.mThumbUrl).into(new b(viewHolder.f, watermarkBarItem));
        }
        if (this.g != null) {
            final int adapterPosition = viewHolder.getAdapterPosition();
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: zl8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.j(adapterPosition, viewHolder, view);
                }
            });
        }
    }
}
