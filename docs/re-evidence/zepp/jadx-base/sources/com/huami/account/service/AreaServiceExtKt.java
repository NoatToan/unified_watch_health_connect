package com.huami.account.service;

import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/account/service/AreaService;", "", WebConstant.QueryParam.USER_REGION, "service_release"}, k = 2, mv = {1, 5, 1})
public final class AreaServiceExtKt {
    @NotNull
    public static final String userRegion(@NotNull AreaService areaService) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(areaService.userRegionOrThrow());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }
}
