package com.xiaomi.hm.health.devicex.manage.api.core.manager;

import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/UserInfoProvider;", "", "", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY_NEW, "deviceUserId", "Lcom/xiaomi/hm/health/bt/profile/mili/model/UserInfo;", "getUserInfo", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface UserInfoProvider {
    @NotNull
    UserInfo getUserInfo(@Nullable String authKey, @NotNull String deviceUserId);
}
