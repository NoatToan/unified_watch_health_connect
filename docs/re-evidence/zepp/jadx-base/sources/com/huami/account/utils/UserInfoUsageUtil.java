package com.huami.account.utils;

import android.content.Context;
import com.huami.account.AccountExternalsKt;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.passport.AccountManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/account/utils/UserInfoUsageUtil;", "", "", "userInfoPolicyPrecondition$accountui_release", "()Z", "userInfoPolicyPrecondition", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoUsageUtil {

    @NotNull
    public static final UserInfoUsageUtil INSTANCE = new UserInfoUsageUtil();

    private UserInfoUsageUtil() {
    }

    @JvmStatic
    public static final boolean userInfoPolicyPrecondition$accountui_release() {
        Context context = (Context) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        String countryCode = AccountManager.getDefault(context).getCountryCode();
        if (AccountManager.getDefault(context).isLogin() && !Intrinsics.areEqual(AccountExternalsKt.getCommonDelegate().getChannelName(), "play")) {
            return SelectAreaHelper.isCN(SelectAreaHelper.getAreaByCountryCode(countryCode));
        }
        return false;
    }
}
