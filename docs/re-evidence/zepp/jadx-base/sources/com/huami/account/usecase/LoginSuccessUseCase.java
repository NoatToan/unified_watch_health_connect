package com.huami.account.usecase;

import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountProperties;
import com.huami.account.auth.usecase.SaveLastLoginInfoUseCase;
import com.huami.account.constants.LoginType;
import com.huami.account.legal.UserInfoPolicyPropertyRegistry;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.utils.AccountConstants;
import com.huami.account.utils.UserInfoUsageUtil;
import com.huami.passport.AccountManager;
import com.huami.userproperty.UserPropertyManager;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/account/usecase/LoginSuccessUseCase;", "", "", "loginType", "", "c", "b", "a", "invoke", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginSuccessUseCase {
    private final void a(@LoginType int loginType) {
        if (loginType == 3) {
            return;
        }
        SaveLastLoginInfoUseCase saveLastLoginInfoUseCase = (SaveLastLoginInfoUseCase) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SaveLastLoginInfoUseCase.class), null, null);
        AccountManager accountManager = (AccountManager) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountManager.class), null, null);
        String provider = accountManager.getProvider();
        String email = accountManager.getUserInfo().getEmail();
        if (Intrinsics.areEqual(provider, "huami_phone")) {
            email = StringsKt__StringsKt.removePrefix(email, (CharSequence) AccountConstants.DEFAULT_AREA_CODE);
        }
        saveLastLoginInfoUseCase.invoke(provider, email);
    }

    private final void b(@LoginType int loginType) {
        AccountProperties accountProperties;
        Boolean edmConfirmedByRegister;
        if (loginType != 2 || (edmConfirmedByRegister = (accountProperties = AccountProperties.INSTANCE).getEdmConfirmedByRegister()) == null) {
            return;
        }
        accountProperties.getEdmConfirmed().set(edmConfirmedByRegister);
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    private final void c(int loginType) {
        boolean zContains = ArraysKt___ArraysKt.contains(new Integer[]{1, 2}, Integer.valueOf(loginType));
        boolean zUserInfoPolicyPrecondition$accountui_release = UserInfoUsageUtil.userInfoPolicyPrecondition$accountui_release();
        UserInfoPolicyPropertyRegistry userInfoPolicyPropertyRegistry = UserInfoPolicyPropertyRegistry.INSTANCE;
        boolean z = userInfoPolicyPropertyRegistry.isAllowUserInfoUsage().get() == null;
        if (zContains && zUserInfoPolicyPrecondition$accountui_release && z) {
            userInfoPolicyPropertyRegistry.isAllowUserInfoUsage().set(Boolean.TRUE);
            UserPropertyManager.INSTANCE.schedulePushAll();
        }
    }

    public final void invoke(@LoginType int loginType) {
        c(loginType);
        if (AccountExternalsKt.getConfigDelegate().enableEdmFeature()) {
            b(loginType);
        }
        a(loginType);
    }
}
