package com.huami.third.wechat.ui.bind.bind;

import com.huami.third.wechat.entity.AppDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/huami/third/wechat/ui/bind/bind/IDeviceHelper;", "", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", "getAllBoundDevices", "", "source", "Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;", "getDeviceShapeBySource", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceHelper {
    @NotNull
    List<AppDeviceInfo> getAllBoundDevices();

    @NotNull
    DeviceShape getDeviceShapeBySource(int source);
}
