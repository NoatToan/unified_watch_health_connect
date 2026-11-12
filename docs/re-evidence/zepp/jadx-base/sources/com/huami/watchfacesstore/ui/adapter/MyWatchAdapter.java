package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "", "position", "item", "", "convert", "setItemSelected", "Landroid/view/View;", "itemView", "layoutRes", "onViewHolderInit", "Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;", GoogleApiAvailabilityLight.b, "Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;", "deviceSize", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "o", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", b.r, LogUtil.I, "getPrePosition", "()I", "setPrePosition", "(I)V", "prePosition", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MyWatchAdapter extends BaseRVAdapter<MyWatchFaceBean> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager.DeviceSize deviceSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfigManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
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

    public MyWatchAdapter(@NotNull Context context, @NotNull DeviceConfigManager.DeviceSize deviceSize) {
        super(context, R.layout.wf_item_internal_watch_face);
        this.deviceSize = deviceSize;
        this.deviceConfigManager = KoinExtKt.getDeviceConfigManager();
        this.prePosition = -1;
    }

    public final int getPrePosition() {
        return this.prePosition;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter, com.huami.watchfacesstore.view.recycleview.ViewHolder.a
    public void onViewHolderInit(@NotNull View itemView, int layoutRes) {
        HMLog.debug("MyWatchAdapter", a.a);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.thumbnail_img_shadow);
        ImageView imageView2 = (ImageView) itemView.findViewById(R.id.thumbnail_img);
        View viewFindViewById = itemView.findViewById(R.id.selected_bg);
        ImageView imageView3 = (ImageView) itemView.findViewById(R.id.transparent_img);
        imageView.setImageResource(this.deviceConfigManager.getCurrentDeviceConfig().getPlaceHolderImage());
        this.deviceConfigManager.setShadowImageParamsByDevice(imageView, this.deviceSize);
        this.deviceConfigManager.setImageInCardParamsByDevice(imageView2, this.deviceSize);
        this.deviceConfigManager.setImageInCardParamsByDevice(viewFindViewById, this.deviceSize);
        this.deviceConfigManager.setImageInCardParamsByDevice(imageView3, this.deviceSize);
        ExtensionsKt.setShape$default(viewFindViewById, ExtensionsKt.getDp(this.deviceConfigManager.getCurrentDeviceConfig().getDialRadiusInCard()), null, 2, null);
    }

    public final void setItemSelected(int position) {
        if (this.prePosition == -1) {
            for (MyWatchFaceBean myWatchFaceBean : getListData()) {
                if (myWatchFaceBean.isSelected()) {
                    myWatchFaceBean.setSelected(false);
                }
            }
        }
        int i = this.prePosition;
        if (i != position) {
            if (i != -1) {
                MyWatchFaceBean item = getItem(i);
                if (item != null) {
                    item.setSelected(false);
                }
                notifyItemChanged(this.prePosition);
            }
            MyWatchFaceBean item2 = getItem(position);
            if (item2 != null) {
                item2.setSelected(true);
            }
            notifyItemChanged(position);
        }
    }

    public final void setPrePosition(int i) {
        this.prePosition = i;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable MyWatchFaceBean item) {
        Unit unit;
        ImageView imageView = (ImageView) holder.getView(R.id.thumbnail_img);
        ImageView imageView2 = (ImageView) holder.getView(R.id.transparent_img);
        if (item == null) {
            return;
        }
        if (item.isSelected()) {
            setPrePosition(position);
            ExtensionsKt.visible(holder.getView(R.id.selected_bg));
            ExtensionsKt.visible(holder.getView(R.id.selected_img));
        } else {
            ExtensionsKt.gone(holder.getView(R.id.selected_bg));
            ExtensionsKt.gone(holder.getView(R.id.selected_img));
        }
        String gif = item.getGif();
        if (gif == null) {
            gif = item.getImage();
        }
        ExtensionsKt.loadWithRadius(imageView, gif, this.deviceConfigManager.getCurrentDeviceConfig().getDialRadiusInCard());
        if (item.getTransparentBackground() == null) {
            unit = null;
        } else {
            ExtensionsKt.visible(imageView2);
            ExtensionsKt.loadUrlAndHintColor(imageView2, item.getTransparentBackground(), item.getColor());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ExtensionsKt.gone(imageView2);
        }
    }
}
