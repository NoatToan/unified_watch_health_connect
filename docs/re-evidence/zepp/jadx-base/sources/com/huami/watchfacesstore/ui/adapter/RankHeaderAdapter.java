package com.huami.watchfacesstore.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.adapter.RankHeaderAdapter;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.view.banner.HolderRestLoader;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0017R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006%"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/RankHeaderAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/WatchData;", "Lcom/huami/watchfacesstore/view/banner/HolderRestLoader;", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "", "position", "item", "", "convert", "Landroid/view/View;", "itemView", "layoutRes", "onViewHolderInit", "", "isRestItem", "onItemRestLoader", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", GoogleApiAvailabilityLight.b, "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "o", LogUtil.I, "currentPos", "", b.r, "[I", "bigImageArr", DTransferConstants.SEARCH_KEY, "smallImageArr", "r", "btnBg", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RankHeaderAdapter extends BaseRVAdapter<WatchData> implements HolderRestLoader {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfigManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int currentPos;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final int[] bigImageArr;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final int[] smallImageArr;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final int[] btnBg;

    public RankHeaderAdapter(@NotNull Context context) {
        super(context, R.layout.wf_item_ranking_header);
        this.deviceConfigManager = KoinExtKt.getDeviceConfigManager();
        this.bigImageArr = new int[]{R.drawable.wf_ic_rank_first_big, R.drawable.wf_ic_rank_third_big, R.drawable.wf_ic_rank_second_big};
        this.smallImageArr = new int[]{R.drawable.wf_ic_rank_first_small, R.drawable.wf_ic_rank_third_small, R.drawable.wf_ic_rank_second_small};
        this.btnBg = new int[]{R.drawable.wf_rank_header_first_btn_bg, R.drawable.wf_rank_header_third_btn_bg, R.drawable.wf_rank_header_second_btn_bg};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(RankHeaderAdapter rankHeaderAdapter, WatchData watchData, View view) {
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, rankHeaderAdapter.getContext(), 0, watchData.getId(), null, WatchFaceDetailActivity.FROM_RANK, 8, null);
    }

    @Override // com.huami.watchfacesstore.view.banner.HolderRestLoader
    @SuppressLint({"NotifyDataSetChanged"})
    public void onItemRestLoader(int position, boolean isRestItem) {
        if (isRestItem) {
            return;
        }
        this.currentPos = position;
        notifyDataSetChanged();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter, com.huami.watchfacesstore.view.recycleview.ViewHolder.a
    public void onViewHolderInit(@NotNull View itemView, int layoutRes) {
        ImageView imageView = (ImageView) itemView.findViewById(R.id.iv_watch_face);
        ImageView imageView2 = (ImageView) itemView.findViewById(R.id.iv_watch_face_bg);
        DeviceConfigManager deviceConfigManager = this.deviceConfigManager;
        DeviceConfigManager.DeviceSize deviceSize = DeviceConfigManager.DeviceSize.SIZE_THREE;
        deviceConfigManager.setShadowImageParamsByDevice(imageView2, deviceSize);
        this.deviceConfigManager.setImageInCardParamsByDevice(imageView, deviceSize);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable final WatchData item) {
        if (item == null) {
            return;
        }
        ImageView imageView = (ImageView) holder.getView(R.id.iv_watch_face_bg);
        TextView textView = (TextView) holder.getView(R.id.tv_detail);
        ImageView imageView2 = (ImageView) holder.getView(R.id.iv_rank_bg);
        if (position == this.currentPos) {
            imageView2.setImageResource(this.bigImageArr[position]);
        } else {
            imageView2.setImageResource(this.smallImageArr[position]);
        }
        imageView.setImageResource(this.deviceConfigManager.getCurrentDeviceConfig().getRankPlaceHolderImage()[position]);
        holder.setText(R.id.tv_watch_name, (CharSequence) item.getName());
        RatingBar ratingBar = (RatingBar) holder.getView(R.id.rating_bar);
        Float rank = item.getRank();
        ratingBar.setRating(rank == null ? 0.0f : rank.floatValue());
        ImageView imageView3 = (ImageView) holder.getView(R.id.iv_watch_face);
        Metas metas = item.getMetas();
        String gif = metas == null ? null : metas.getGif();
        if (gif == null) {
            gif = item.getImage();
        }
        ExtensionsKt.loadWithRadius(imageView3, gif, this.deviceConfigManager.getCurrentDeviceConfig().getDialRadiusInCard());
        textView.setBackgroundResource(this.btnBg[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: r66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RankHeaderAdapter.k(this.a, item, view);
            }
        });
    }
}
