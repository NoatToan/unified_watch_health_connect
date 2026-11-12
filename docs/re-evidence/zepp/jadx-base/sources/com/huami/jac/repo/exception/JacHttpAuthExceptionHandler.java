package com.huami.jac.repo.exception;

import com.huami.jac.repo.config.JacConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/jac/repo/exception/JacHttpAuthExceptionHandler;", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "", "e", "", "handle", "<init>", "()V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacHttpAuthExceptionHandler implements JacExceptionHandlerApi {
    @Override // com.huami.jac.repo.exception.JacExceptionHandlerApi
    public void handle(@NotNull Throwable e) {
        JacHttpAuthException jacHttpAuthException = (JacHttpAuthException) e;
        Function2<String, String, Unit> onJacHttpError = JacConfig.getOnJacHttpError();
        String code = jacHttpAuthException.getCode();
        String msgForLog = jacHttpAuthException.getMsgForLog();
        if (msgForLog == null) {
            msgForLog = "";
        }
        onJacHttpError.invoke(code, msgForLog);
    }
}
