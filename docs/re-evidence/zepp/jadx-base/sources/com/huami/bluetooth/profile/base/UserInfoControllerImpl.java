package com.huami.bluetooth.profile.base;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/base/UserInfoControllerImpl;", "Lcom/huami/bluetooth/profile/base/UserInfoController;", "Lcom/huami/bluetooth/profile/Request;", "request", "", "a", "Lcom/xiaomi/hm/health/bt/profile/mili/model/UserInfo;", "userInfo", "setUserInfo", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoControllerImpl implements UserInfoController {

    @NotNull
    private static final String b = "UserInfoControllerImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    public UserInfoControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this.characteristic = bluetoothCharacteristic;
    }

    private final boolean a(Request request) {
        return this.characteristic.sendCommandNoResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public static /* synthetic */ boolean b(UserInfoControllerImpl userInfoControllerImpl, Request request, int i, Object obj) {
        if ((i & 1) != 0) {
            request = new Request();
        }
        return userInfoControllerImpl.a(request);
    }

    @Override // com.huami.bluetooth.profile.base.UserInfoController
    public boolean setUserInfo(@NotNull UserInfo userInfo) {
        boolean zA = a(new Request(ProfileUtils.bytesOfUserInfo(new UserInfoExt(((long) userInfo.uid) & 4294967295L, (short) (userInfo.height & 255), (short) (userInfo.weight & 255), GenderExt.fromValue(userInfo.gender), new BirthDateExt((short) (Calendar.getInstance().get(1) - userInfo.age), (byte) 1, (byte) 1)))));
        Debug.fi(b, Intrinsics.stringPlus("UserInfo ret:", Boolean.valueOf(zA)));
        return zA;
    }
}
