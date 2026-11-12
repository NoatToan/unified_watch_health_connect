package com.xiaomi.hm.health.bt.profile.usernew;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/IUserInfoProfile;", "", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "info", "", "setUserInfo", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "getUserInfo", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "location", "setLocation", "", StatEvent.EventParams.TYPE_CARD_GOAL, "setGoal", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IUserInfoProfile {
    @Nullable
    UserInfoExt getUserInfo(@Nullable HMDeviceSource source);

    boolean setGoal(int goal);

    boolean setLocation(@NotNull LocationExt location);

    boolean setUserInfo(@NotNull UserInfoExt info);
}
