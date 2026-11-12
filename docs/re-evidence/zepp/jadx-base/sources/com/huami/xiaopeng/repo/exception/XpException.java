package com.huami.xiaopeng.repo.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/huami/xiaopeng/repo/exception/XpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "code", "b", "getMsgForUi", "setMsgForUi", "msgForUi", "c", "getMsgForLog", "setMsgForLog", "msgForLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public abstract class XpException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String msgForUi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String msgForLog;

    public XpException(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        super("code = " + str + " , msgForUi = " + ((Object) str2) + ", msgForLog = " + ((Object) str3));
        this.code = str;
        this.msgForUi = str2;
        this.msgForLog = str3;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsgForLog() {
        return this.msgForLog;
    }

    @Nullable
    public final String getMsgForUi() {
        return this.msgForUi;
    }

    public final void setCode(@NotNull String str) {
        this.code = str;
    }

    public final void setMsgForLog(@Nullable String str) {
        this.msgForLog = str;
    }

    public final void setMsgForUi(@Nullable String str) {
        this.msgForUi = str;
    }
}
