package com.xiaomi.fitness.user.info.export;

import androidx.annotation.Size;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJc\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0002\u0010\u0014J.\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u001bH'¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/UserInformationManager;", "", "sendProfile", "", "type", "", "value", "", "callBack", "Lcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;", "userInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "accountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "sValue", "", "isRecordHeartAuto", "", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(IFLcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;Lcom/xiaomi/fitness/account/user/UserInfoManager;Lcom/xiaomi/fitness/account/api/AccountRequest;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/coroutines/CoroutineScope;)V", "sendAllProfile", "scope", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getMinLimitAge", "getBirthdaySelectRange", "", "Companion", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserInformationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/UserInformationManager$Companion;", "", "<init>", "()V", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void sendAllProfile$default(UserInformationManager userInformationManager, CoroutineScope coroutineScope, UserProfile userProfile, AccountRequest accountRequest, SendProfileCallBack sendProfileCallBack, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAllProfile");
            }
            if ((i & 1) != 0) {
                coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            }
            if ((i & 8) != 0) {
                sendProfileCallBack = null;
            }
            userInformationManager.sendAllProfile(coroutineScope, userProfile, accountRequest, sendProfileCallBack);
        }

        public static /* synthetic */ void sendProfile$default(UserInformationManager userInformationManager, int i, float f, SendProfileCallBack sendProfileCallBack, UserInfoManager userInfoManager, AccountRequest accountRequest, String str, Boolean bool, CoroutineScope coroutineScope, int i2, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendProfile");
            }
            UserInfoManager accountManagerExtKt = (i2 & 8) != 0 ? AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE) : userInfoManager;
            AccountRequest accountRequest2 = (i2 & 16) != 0 ? new AccountRequest() : accountRequest;
            String str2 = (i2 & 32) != 0 ? null : str;
            Boolean bool2 = (i2 & 64) != 0 ? Boolean.FALSE : bool;
            if ((i2 & 128) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            userInformationManager.sendProfile(i, f, sendProfileCallBack, accountManagerExtKt, accountRequest2, str2, bool2, netCoroutineScope);
        }
    }

    @Size(2)
    @NotNull
    long[] getBirthdaySelectRange();

    int getMinLimitAge();

    void sendAllProfile(@NotNull CoroutineScope scope, @NotNull UserProfile userProfile, @NotNull AccountRequest accountRequest, @Nullable SendProfileCallBack callBack);

    void sendProfile(int type, float value, @Nullable SendProfileCallBack callBack, @Nullable UserInfoManager userInfoManager, @Nullable AccountRequest accountRequest, @Nullable String sValue, @Nullable Boolean isRecordHeartAuto, @Nullable CoroutineScope viewModelScope);
}
