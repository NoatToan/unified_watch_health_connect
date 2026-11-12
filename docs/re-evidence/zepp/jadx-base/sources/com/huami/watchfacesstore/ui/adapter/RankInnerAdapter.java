package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/RankInnerAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/WatchData;", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "", "position", "item", "", "convert", "Landroid/view/View;", "itemView", "layoutRes", "onViewHolderInit", GoogleApiAvailabilityLight.b, LogUtil.I, "rankType", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "o", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dataList", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RankInnerAdapter extends BaseRVAdapter<WatchData> {
    public static final int RANK_TYPE_HOME = 0;
    public static final int RANK_TYPE_LIST = 1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int rankType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfigManager;

    public /* synthetic */ RankInnerAdapter(Context context, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? null : list);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter, com.huami.watchfacesstore.view.recycleview.ViewHolder.a
    public void onViewHolderInit(@NotNull View itemView, int layoutRes) {
        ImageView imageView = (ImageView) itemView.findViewById(R.id.iv_rank_img);
        ImageView imageView2 = (ImageView) itemView.findViewById(R.id.iv_rank_img_shadow);
        ExtensionsKt.setShape(itemView.findViewById(R.id.sync_apply_btn), ExtensionsKt.getDp(4), Integer.valueOf(R.color.wf_detail_btn_bg_color));
        DeviceConfigManager deviceConfigManager = this.deviceConfigManager;
        DeviceConfigManager.DeviceSize deviceSize = DeviceConfigManager.DeviceSize.SIZE_ONE;
        deviceConfigManager.setShadowImageParamsByDevice(imageView2, deviceSize);
        imageView2.setImageResource(this.deviceConfigManager.getCurrentDeviceConfig().getPlaceHolderImage());
        this.deviceConfigManager.setImageInCardParamsByDevice(imageView, deviceSize);
    }

    public RankInnerAdapter(@NotNull Context context, int i, @Nullable List<WatchData> list) {
        super(context, list, R.layout.wf_item_ranking_inner);
        this.rankType = i;
        this.deviceConfigManager = KoinExtKt.getDeviceConfigManager();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable WatchData item) {
        Metas metas;
        Float rank;
        int i;
        TextView textView = (TextView) holder.getView(R.id.tv_rank_num);
        if (this.rankType == 0) {
            if (position != 0) {
                i = position != 1 ? R.color.ranking_num_color_3 : R.color.ranking_num_color_2;
            } else {
                i = R.color.ranking_num_color_1;
            }
            textView.setText(String.valueOf(position + 1));
            textView.setTextColor(ContextCompat.getColor(getContext(), i));
        } else {
            textView.setText(String.valueOf(position + 4));
        }
        ImageView imageView = (ImageView) holder.getView(R.id.iv_rank_img);
        String gif = (item == null || (metas = item.getMetas()) == null) ? null : metas.getGif();
        if (gif == null) {
            gif = item == null ? null : item.getImage();
        }
        ExtensionsKt.loadWithRadius(imageView, gif, this.deviceConfigManager.getCurrentDeviceConfig().getDialRadiusInCard());
        holder.setText(R.id.tv_name, (CharSequence) (item != null ? item.getName() : null));
        RatingBar ratingBar = (RatingBar) holder.getView(R.id.rating_bar);
        float fFloatValue = 0.0f;
        if (item != null && (rank = item.getRank()) != null) {
            fFloatValue = rank.floatValue();
        }
        ratingBar.setRating(fFloatValue);
    }
}
