package com.huami.third.wechat;

import android.graphics.Bitmap;
import com.huami.third.wechat.entity.AppDeviceInfo;
import com.huami.third.wechat.entity.DeviceListApiEntity;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.DeviceList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J*\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002H&¨\u0006\u0019"}, d2 = {"Lcom/huami/third/wechat/WeChatSource;", "", "", "userId", "name", "brandName", "Lcom/huami/third/wechat/ApiResult;", "Lcom/huami/third/wechat/QRResult;", "getQRCode", "Lcom/huami/third/wechat/UserResult;", "getUser", "getQRContent", "", "size", "Landroid/graphics/Bitmap;", "loadQR", "checkAuth", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", DeviceList.ELEM_NAME, "Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "checkDeviceSupport", "deviceSource", "deviceSN", "getBindTicket", "wechat_release"}, k = 1, mv = {1, 5, 1})
public interface WeChatSource {
    @Nullable
    String checkAuth(@NotNull String userId, @NotNull String name);

    @Nullable
    List<DeviceListApiEntity> checkDeviceSupport(@NotNull List<AppDeviceInfo> deviceList);

    @Nullable
    String getBindTicket(int deviceSource, @NotNull String deviceSN);

    @Nullable
    ApiResult<QRResult> getQRCode(@NotNull String userId, @NotNull String name, @NotNull String brandName);

    @Nullable
    String getQRContent(@NotNull String userId, @NotNull String name, @NotNull String brandName);

    @Nullable
    ApiResult<UserResult> getUser(@NotNull String userId, @NotNull String name);

    @Nullable
    Bitmap loadQR(@NotNull String userId, @NotNull String name, @NotNull String brandName, int size);
}
