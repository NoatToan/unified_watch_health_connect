package com.xiaomi.fitness.account.logger;

import android.util.Log;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/account/logger/XiaomiAccountLogger;", "Lcom/xiaomi/accountsdk/utils/AccountLogger$Logger;", "<init>", "()V", "TAG", "", "log", "", "tag", "message", "tr", "", "requestLog", "Lcom/xiaomi/accountsdk/utils/AccountLogger$HttpRequestLog;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class XiaomiAccountLogger implements AccountLogger.Logger {

    @NotNull
    private final String TAG = "XiaomiAccountLogger";

    @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
    public void log(@Nullable String tag, @Nullable String message) {
        if (AppUtil.INSTANCE.isDevChannel()) {
            if (tag == null) {
                Logger.e(this.TAG, message);
            } else {
                Logger.e(tag, message);
            }
        }
    }

    @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
    public void log(@Nullable String tag, @Nullable String message, @Nullable Throwable tr) {
        if (AppUtil.INSTANCE.isDevChannel()) {
            if (tag == null) {
                Logger.e(this.TAG, message + "\n" + Log.getStackTraceString(tr));
                return;
            }
            Logger.e(tag, message + "\n" + Log.getStackTraceString(tr));
        }
    }

    @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
    public void log(@Nullable String tag, @Nullable Throwable tr) {
        if (AppUtil.INSTANCE.isDevChannel()) {
            if (tag == null) {
                String str = this.TAG;
                String stackTraceString = Log.getStackTraceString(tr);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
                Logger.e(str, stackTraceString);
                return;
            }
            String stackTraceString2 = Log.getStackTraceString(tr);
            Intrinsics.checkNotNullExpressionValue(stackTraceString2, "getStackTraceString(...)");
            Logger.e(tag, stackTraceString2);
        }
    }

    @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
    public void log(@Nullable AccountLogger.HttpRequestLog requestLog) {
        if (AppUtil.INSTANCE.isDevChannel()) {
            Logger.e(AccountLogger.HttpRequestLog.REQUEST_LOG_TAG, String.valueOf(requestLog));
        }
    }
}
