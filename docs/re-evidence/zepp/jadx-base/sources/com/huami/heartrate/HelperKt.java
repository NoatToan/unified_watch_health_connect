package com.huami.heartrate;

import android.os.Bundle;
import com.huami.heartrate.koin.ScopeKt;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.service.IHeartRateService;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/huami/heartrate/model/UserOfHeartRate;", "userOfHeartRate", "Lcom/huami/heartrate/service/IHeartRateService;", "getHeartRateService", "", "userId", "", "registerTime", "", "userAge", "Landroid/os/Bundle;", "parseIntentParams", "heartrate-service_release"}, k = 2, mv = {1, 5, 1})
public final class HelperKt {
    @Nullable
    public static final IHeartRateService getHeartRateService(@NotNull UserOfHeartRate userOfHeartRate) {
        return (IHeartRateService) ScopeKt.getOrCreateHeartRateScope(userOfHeartRate).getOrNull(Reflection.getOrCreateKotlinClass(IHeartRateService.class), null, null);
    }

    public static /* synthetic */ IHeartRateService getHeartRateService$default(UserOfHeartRate userOfHeartRate, int i, Object obj) {
        if ((i & 1) != 0) {
            userOfHeartRate = (UserOfHeartRate) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserOfHeartRate.class), null, null);
        }
        return getHeartRateService(userOfHeartRate);
    }

    @NotNull
    public static final Bundle parseIntentParams(@NotNull String str, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(XiaomiOAuthConstants.EXTRA_USER_ID, str);
        bundle.putLong("extra_user_register_time", j);
        bundle.putInt("extra_user_age", i);
        return bundle;
    }
}
