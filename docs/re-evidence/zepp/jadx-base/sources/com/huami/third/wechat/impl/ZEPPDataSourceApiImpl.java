package com.huami.third.wechat.impl;

import com.huami.account.HMLoginManager;
import com.huami.third.wechat.ApiResult;
import com.huami.third.wechat.UserResult;
import com.huami.third.wechat.WeChatSourceImpl;
import com.huami.third.wechat.api.DataSourceApi;
import com.huami.third.wechat.entity.AppDeviceInfo;
import com.huami.third.wechat.entity.DeviceListApiEntity;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.DeviceList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/third/wechat/impl/ZEPPDataSourceApiImpl;", "Lcom/huami/third/wechat/api/DataSourceApi;", "", "checkBindState", "", "getQRContent", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", DeviceList.ELEM_NAME, "Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "checkDeviceSupport", "", "deviceSource", "deviceSN", "getBindTicket", "a", "Ljava/lang/String;", "name", "b", "brandName", "Lcom/huami/third/wechat/WeChatSourceImpl;", "c", "Lcom/huami/third/wechat/WeChatSourceImpl;", "wechatSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final class ZEPPDataSourceApiImpl implements DataSourceApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String brandName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WeChatSourceImpl wechatSource = new WeChatSourceImpl();

    public ZEPPDataSourceApiImpl(@NotNull String str, @NotNull String str2) {
        this.name = str;
        this.brandName = str2;
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    public boolean checkBindState() {
        ApiResult<UserResult> user;
        UserResult data;
        String huamiId = HMLoginManager.getHuamiId();
        return (huamiId == null || (user = this.wechatSource.getUser(huamiId, this.name)) == null || (data = user.getData()) == null || data.isBind() != 1) ? false : true;
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    @Nullable
    public List<DeviceListApiEntity> checkDeviceSupport(@NotNull List<AppDeviceInfo> deviceList) {
        return this.wechatSource.checkDeviceSupport(deviceList);
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    @Nullable
    public String getBindTicket(int deviceSource, @NotNull String deviceSN) {
        return this.wechatSource.getBindTicket(deviceSource, deviceSN);
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    @Nullable
    public String getQRContent() {
        String huamiId = HMLoginManager.getHuamiId();
        if (huamiId == null) {
            return null;
        }
        return this.wechatSource.getQRContent(huamiId, this.name, this.brandName);
    }
}
