package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.huami.watch.companion.watchface.cloud.WatchSkinAPIKt;
import com.huami.watch.transport.TransportDataItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/XiHuDiyWatchFaceManager;", "Lcom/huami/watch/companion/watchface/manager/BasicDeviceController;", "", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "getCloudDiyWatchSkin", "()[Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "Lcom/huami/watch/transport/TransportDataItem;", "transportDataItem", "", "dataReceived", "", "available", "channelListener", "Landroid/content/Context;", "i", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class XiHuDiyWatchFaceManager extends BasicDeviceController {

    @NotNull
    private static final String j = "XiHuDiyWatchFaceManager";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public XiHuDiyWatchFaceManager(@NotNull Context context) {
        super(context);
        this.context = context;
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void channelListener(boolean available) {
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void dataReceived(@NotNull TransportDataItem transportDataItem) {
    }

    @Nullable
    public final WatchSkinBean[] getCloudDiyWatchSkin() {
        return WatchSkinAPIKt.getWatchSkins(DeviceSource.getDeviceSource(getMDevice()), 0, true, this.context);
    }
}
