package com.xiaomi.fitness.login.internaltest;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/login/internaltest/InternalTestApiService;", "", "checkWhiteList", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/login/internaltest/ResultBooleanModel;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InternalTestApiService {
    @Nullable
    @uua("whitelist/check")
    Object checkWhiteList(@Nullable @xfi("data") String str, @NotNull Continuation<? super BaseResult<ResultBooleanModel>> continuation);
}
