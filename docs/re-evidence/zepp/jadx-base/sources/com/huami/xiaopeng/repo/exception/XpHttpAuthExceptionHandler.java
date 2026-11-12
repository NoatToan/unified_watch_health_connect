package com.huami.xiaopeng.repo.exception;

import com.huami.xiaopeng.repo.config.XpConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/xiaopeng/repo/exception/XpHttpAuthExceptionHandler;", "Lcom/huami/xiaopeng/repo/exception/XpExceptionHandlerApi;", "", "e", "", "handle", "<init>", "()V", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public final class XpHttpAuthExceptionHandler implements XpExceptionHandlerApi {
    @Override // com.huami.xiaopeng.repo.exception.XpExceptionHandlerApi
    public void handle(@NotNull Throwable e) {
        XpHttpAuthException xpHttpAuthException = (XpHttpAuthException) e;
        Function2<String, String, Unit> onXpHttpError = XpConfig.getOnXpHttpError();
        String code = xpHttpAuthException.getCode();
        String msgForLog = xpHttpAuthException.getMsgForLog();
        if (msgForLog == null) {
            msgForLog = "";
        }
        onXpHttpError.invoke(code, msgForLog);
    }
}
