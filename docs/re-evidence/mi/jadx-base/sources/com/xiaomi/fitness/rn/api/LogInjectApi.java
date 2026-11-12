package com.xiaomi.fitness.rn.api;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.qtc;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/rn/api/LogInjectApi;", "Lqtc;", "", "isDebugBuildType", "()Z", "", "logType", "", "subType", "logTag", "message", "", "writeLog", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LogInjectApi implements qtc {
    @Override // defpackage.qtc
    public boolean isDebugBuildType() {
        AppUtil appUtil = AppUtil.INSTANCE;
        Logger.i("MiJiaSDK", "isDebugBuildType: " + appUtil.isDevChannel());
        return appUtil.isDevChannel();
    }

    @Override // defpackage.qtc
    public void writeLog(int logType, @Nullable String subType, @Nullable String logTag, @Nullable String message) {
        Logger.i("MiJiaSDK", "[" + logTag + "] " + message);
    }
}
