package com.huami.xiaopeng.repo.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/xiaopeng/repo/exception/XpLoginException;", "Lcom/huami/xiaopeng/repo/exception/XpException;", "", "code", "msgForLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public final class XpLoginException extends XpException {
    /* JADX WARN: Multi-variable type inference failed */
    public XpLoginException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ XpLoginException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? XpErrorCode.XP_ERROR_CODE_LOGIN : str, (i & 2) != 0 ? "请先登陆账号" : str2);
    }

    public XpLoginException(@NotNull String str, @NotNull String str2) {
        super(str, str2, "请先登陆账号");
    }
}
