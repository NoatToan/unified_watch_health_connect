package com.huami.account.utils;

import com.huami.account.service.AnonymousService;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\tH\u0007¨\u0006\r"}, d2 = {"Lcom/huami/account/utils/PolicyTipUtil;", "", "", "interceptWithShowTip", "isNeedIntercept", "", "showTip", "Lcom/huami/account/service/AnonymousService;", "anonymousPolicyApi", "Lcom/huami/account/service/UserInfoPolicyService;", "userInfoPolicyApi", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PolicyTipUtil {

    @NotNull
    public static final PolicyTipUtil INSTANCE = new PolicyTipUtil();

    private PolicyTipUtil() {
    }

    @JvmStatic
    @NotNull
    public static final AnonymousService anonymousPolicyApi() {
        return (AnonymousService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AnonymousService.class), null, null);
    }

    @Deprecated(message = "仅包含匿名信息 API，请使用 anonymousPolicyApi() 下的函数", replaceWith = @ReplaceWith(expression = "anonymousPolicyApi().showLoginIfNeeded()", imports = {"com.huami.account.utils.PolicyTipUtil.anonymousPolicyApi"}))
    @JvmStatic
    public static final boolean interceptWithShowTip() {
        return anonymousPolicyApi().showLoginIfNeeded();
    }

    @Deprecated(message = "仅包含匿名信息 API，请使用 anonymousPolicyApi() 下的函数", replaceWith = @ReplaceWith(expression = "anonymousPolicyApi().isAnonymousUser()", imports = {"com.huami.account.utils.PolicyTipUtil.anonymousPolicyApi"}))
    @JvmStatic
    public static final boolean isNeedIntercept() {
        return anonymousPolicyApi().isAnonymousUser();
    }

    @Deprecated(message = "仅包含匿名信息 API，请使用 anonymousPolicyApi() 下的函数", replaceWith = @ReplaceWith(expression = "anonymousPolicyApi().showLoginTip()", imports = {"com.huami.account.utils.PolicyTipUtil.anonymousPolicyApi"}))
    @JvmStatic
    public static final void showTip() {
        anonymousPolicyApi().showLoginTip();
    }

    @JvmStatic
    @NotNull
    public static final UserInfoPolicyService userInfoPolicyApi() {
        return (UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null);
    }
}
