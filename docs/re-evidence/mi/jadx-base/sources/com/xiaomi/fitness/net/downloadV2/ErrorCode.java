package com.xiaomi.fitness.net.downloadV2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/ErrorCode;", "", "code", "", "msg", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "DownLoadHttpException", "DownLoadDirNotExist", "ResponseEmptyBody", "EmptyFileName", "EmptyDownloadRequest", "Other", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ErrorCode {
    DownLoadHttpException(-1, "http exception"),
    DownLoadDirNotExist(-2, "download dir not exist!"),
    ResponseEmptyBody(-3, "response with empty body"),
    EmptyFileName(-4, "empty file name"),
    EmptyDownloadRequest(-5, "empty download request"),
    Other(-6, "other exception");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int code;

    @NotNull
    private final String msg;

    ErrorCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    @NotNull
    public static EnumEntries<ErrorCode> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}
