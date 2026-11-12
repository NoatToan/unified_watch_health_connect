package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/StyleWatchAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "", "position", "item", "", "convert", "setItemSelected", "setItemCollected", "Landroid/view/View;", "itemView", "layoutRes", "onViewHolderInit", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", GoogleApiAvailabilityLight.b, "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "o", LogUtil.I, "prePosition", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class StyleWatchAdapter extends BaseRVAdapter<WatchFaceDetailBean> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfigManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int prePosition;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onViewHolderInit";
        }
    }

    public StyleWatchAdapter(@NotNull Context context) {
        super(context, R.layout.wf_item_internal_watch_face);
        this.deviceConfigManager = KoinExtKt.getDeviceConfigManager();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter, com.huami.watchfacesstore.view.recycleview.ViewHolder.a
    public void onViewHolderInit(@NotNull View itemView, int layoutRes) {
        HMLog.debug("MyWatchAdapter", a.a);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.thumbnail_img_shadow);
        ImageView imageView2 = (ImageView) itemView.findViewById(R.id.thumbnail_img);
        View viewFindViewById = itemView.findViewById(R.id.selected_bg);
        imageView.setImageResource(this.deviceConfigManager.getCurrentDeviceConfig().getPlaceHolderImage());
        DeviceConfigManager deviceConfigManager = this.deviceConfigManager;
        DeviceConfigManager.DeviceSize deviceSize = DeviceConfigManager.DeviceSize.SIZE_FIVE;
        deviceConfigManager.setShadowImageParamsByDevice(imageView, deviceSize);
        this.deviceConfigManager.setImageInCardParamsByDevice(imageView2, deviceSize);
        this.deviceConfigManager.setImageInCardParamsByDevice(viewFindViewById, deviceSize);
        ExtensionsKt.setShape$default(viewFindViewById, ExtensionsKt.getDp(this.deviceConfigManager.getDialRadius()), null, 2, null);
    }

    public final void setItemCollected(int position) {
        WatchFaceDetailBean item = getItem(position);
        if (item == null) {
            return;
        }
        item.setCollect(!item.isCollect());
    }

    public final void setItemSelected(int position) {
        int i = this.prePosition;
        if (i != position) {
            WatchFaceDetailBean item = getItem(i);
            if (item != null) {
                item.setSelected(false);
            }
            notifyItemChanged(this.prePosition);
            WatchFaceDetailBean item2 = getItem(position);
            if (item2 != null) {
                item2.setSelected(true);
            }
            notifyItemChanged(position);
        }
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable WatchFaceDetailBean item) {
        ImageView imageView = (ImageView) holder.getView(R.id.thumbnail_img);
        if (item == null) {
            return;
        }
        if (item.isSelected()) {
            this.prePosition = position;
            ExtensionsKt.visible(holder.getView(R.id.selected_bg));
            ExtensionsKt.visible(holder.getView(R.id.selected_img));
        } else {
            ExtensionsKt.gone(holder.getView(R.id.selected_bg));
            ExtensionsKt.gone(holder.getView(R.id.selected_img));
        }
        ExtensionsKt.loadWithRadius(imageView, item.getImage(), this.deviceConfigManager.getCurrentDeviceConfig().getDialRadiusInCard());
    }
}
