package com.huami.account.service;

import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u0000\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u0000\"\u0016\u0010\u000e\u001a\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/huami/account/service/AccountService;", "", "getValidUid", "", "isInChinaRegion", "isCN", "isUnknown", "", "userId", WebConstant.QueryParam.USER_REGION, "appToken", "Lcom/huami/account/service/LoginManagerDelegate;", "a", "()Lcom/huami/account/service/LoginManagerDelegate;", "loginManagerDelegate", "service_release"}, k = 2, mv = {1, 5, 1})
public final class AccountServiceExtKt {
    private static final LoginManagerDelegate a() {
        return (LoginManagerDelegate) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(LoginManagerDelegate.class), null, null);
    }

    @Nullable
    public static final String appToken(@NotNull AccountService accountService) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(accountService.appTokenOrThrow());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }

    public static final long getValidUid(@NotNull AccountService accountService) {
        return a().getValidUid();
    }

    public static final boolean isCN(@NotNull AccountService accountService) {
        return a().isInMainland();
    }

    public static final boolean isInChinaRegion(@NotNull AccountService accountService) {
        return a().isInChina();
    }

    public static final boolean isUnknown(@NotNull AccountService accountService) {
        return a().isUnknown();
    }

    @Nullable
    public static final String userId(@NotNull AccountService accountService) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(accountService.userIdOrThrow());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }

    @Nullable
    public static final String userRegion(@NotNull AccountService accountService) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(accountService.userRegionOrThrow());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }
}
