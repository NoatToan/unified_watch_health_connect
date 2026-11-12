package com.xiaomi.wearable.data.sportbasic.devicelist;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListView;", "", "showDeviceListView", "", "show", "", "needResize", "selectDevice", "did", "", "isClick", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceListView {
    void selectDevice(@NotNull String did, boolean isClick);

    void showDeviceListView(boolean show, boolean needResize);
}
