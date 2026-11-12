package com.xiaomi.fitness.sport_eco.ftp.request;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpApiImpl;", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpApi;", "request", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;", "<init>", "(Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;)V", "requestEcoApi", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$RespData;", "eco_api", "", "params", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtpApiImpl implements FtpApi {

    @NotNull
    private final FtpRequest request;

    public FtpApiImpl(@NotNull FtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    @Override // com.xiaomi.fitness.sport_eco.ftp.request.FtpApi
    @Nullable
    public Object requestEcoApi(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super FtpModel.RespData> continuation) {
        return this.request.requestEcoApi(str, str2, continuation);
    }
}
