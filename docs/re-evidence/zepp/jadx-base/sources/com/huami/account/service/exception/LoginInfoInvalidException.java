package com.huami.account.service.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/service/exception/LoginInfoInvalidException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
public final class LoginInfoInvalidException extends RuntimeException {
    public LoginInfoInvalidException() {
        super("登录状态异常，无法获取登录用户相关信息");
    }
}
