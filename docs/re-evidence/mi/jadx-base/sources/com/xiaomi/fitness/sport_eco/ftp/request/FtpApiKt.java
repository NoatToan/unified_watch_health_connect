package com.xiaomi.fitness.sport_eco.ftp.request;

import com.xiaomi.fitness.common.utils.AppUtil;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ftpApi", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpApi;", "getFtpApi", "()Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpApi;", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FtpApiKt {

    @NotNull
    private static final FtpApi ftpApi = ((FtpEntryPoint) EntryPointAccessors.fromApplication(AppUtil.getApp(), FtpEntryPoint.class)).getFtpApi();

    @NotNull
    public static final FtpApi getFtpApi() {
        return ftpApi;
    }
}
