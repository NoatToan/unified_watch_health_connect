package com.xiaomi.fitness.userinfo;

import androidx.annotation.Size;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0017¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/userinfo/UserInformationManagerImpl;", "Lcom/xiaomi/fitness/user/info/export/UserInformationManager;", "<init>", "()V", "sendProfile", "", "type", "", "value", "", "callBack", "Lcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;", "userInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "accountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "sValue", "", "isRecordHeartAuto", "", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(IFLcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;Lcom/xiaomi/fitness/account/user/UserInfoManager;Lcom/xiaomi/fitness/account/api/AccountRequest;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/coroutines/CoroutineScope;)V", "sendAllProfile", "scope", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getMinLimitAge", "getBirthdaySelectRange", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInformationManagerImpl implements UserInformationManager {
    @Override // com.xiaomi.fitness.user.info.export.UserInformationManager
    @Size(2)
    @NotNull
    public long[] getBirthdaySelectRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).getMinLimitAge());
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(UserInfoConfigUtil.MIN_BIRTHDAY_TIME);
        return new long[]{calendar.getTimeInMillis(), timeInMillis};
    }

    @Override // com.xiaomi.fitness.user.info.export.UserInformationManager
    public int getMinLimitAge() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        if (StringsKt__StringsKt.isBlank(currentRegion) || StringsKt__StringsJVMKt.equals(currentRegion, "cn", true)) {
            return 14;
        }
        return (StringsKt__StringsJVMKt.equals(currentRegion, "i2", true) || StringsKt__StringsJVMKt.equals(currentRegion, "sg", true)) ? 18 : 16;
    }

    @Override // com.xiaomi.fitness.user.info.export.UserInformationManager
    public void sendAllProfile(@NotNull CoroutineScope scope, @NotNull UserProfile userProfile, @NotNull AccountRequest accountRequest, @Nullable SendProfileCallBack callBack) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(accountRequest, "accountRequest");
        UserInfoConfigUtil.INSTANCE.sendAllProfile(scope, userProfile, accountRequest, callBack);
    }

    @Override // com.xiaomi.fitness.user.info.export.UserInformationManager
    public void sendProfile(int type, float value, @Nullable SendProfileCallBack callBack, @Nullable UserInfoManager userInfoManager, @Nullable AccountRequest accountRequest, @Nullable String sValue, @Nullable Boolean isRecordHeartAuto, @Nullable CoroutineScope viewModelScope) {
        Logger.i("UserInformationManagerImpl", "sendProfile type" + type + ";value" + value + ";sValue" + sValue);
        UserInfoConfigUtil.INSTANCE.sendProfile(type, value, callBack, userInfoManager, accountRequest, sValue, isRecordHeartAuto, viewModelScope);
    }
}
