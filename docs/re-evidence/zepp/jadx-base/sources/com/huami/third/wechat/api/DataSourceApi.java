package com.huami.third.wechat.api;

import com.huami.third.wechat.entity.AppDeviceInfo;
import com.huami.third.wechat.entity.DeviceListApiEntity;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.DeviceList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/huami/third/wechat/api/DataSourceApi;", "", "", "checkBindState", "", "getQRContent", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", DeviceList.ELEM_NAME, "Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "checkDeviceSupport", "", "deviceSource", "deviceSN", "getBindTicket", "wechat_release"}, k = 1, mv = {1, 5, 1})
public interface DataSourceApi {
    boolean checkBindState();

    @Nullable
    List<DeviceListApiEntity> checkDeviceSupport(@NotNull List<AppDeviceInfo> deviceList);

    @Nullable
    String getBindTicket(int deviceSource, @NotNull String deviceSN);

    @Nullable
    String getQRContent();
}
