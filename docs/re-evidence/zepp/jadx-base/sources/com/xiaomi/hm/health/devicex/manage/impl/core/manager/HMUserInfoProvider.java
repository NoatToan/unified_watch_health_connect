package com.xiaomi.hm.health.devicex.manage.impl.core.manager;

import com.huami.account.HMLoginManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.UserInfoProvider;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/core/manager/HMUserInfoProvider;", "Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/UserInfoProvider;", "", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY_NEW, "deviceUserId", "Lcom/xiaomi/hm/health/bt/profile/mili/model/UserInfo;", "getUserInfo", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMUserInfoProvider implements UserInfoProvider {

    @NotNull
    private static final String a = "HMUserInfoProvider";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Exception exc) {
            super(0);
            this.a = str;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userIdStr:" + this.a + ",Exception:" + this.b.getMessage();
        }
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.manager.UserInfoProvider
    @NotNull
    public UserInfo getUserInfo(@Nullable String authKey, @NotNull String deviceUserId) {
        long miIdIfExistsOrHuamiID;
        if (authKey == null || authKey.length() == 0) {
            authKey = deviceUserId;
        }
        try {
            miIdIfExistsOrHuamiID = Long.parseLong(authKey);
        } catch (Exception e) {
            HMLog.info(a, new a(authKey, e));
            miIdIfExistsOrHuamiID = HMLoginManager.getMiIdIfExistsOrHuamiID();
        }
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        return new UserInfo((int) miIdIfExistsOrHuamiID, (byte) userInfo.getGender(), (byte) userInfo.getAge(), (byte) userInfo.getHeight(), (byte) userInfo.getWeight(), (byte) 0, userInfo.getNickname().getBytes(Charset.defaultCharset()));
    }
}
