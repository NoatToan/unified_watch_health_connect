package com.garmin.sync.gc.exception;

import gy2.i;
import ny2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/sync/gc/exception/ServerException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lny2/a;", "Lgy2/i;", "failure", "", "detailMessage", "url", "", "httpCode", "<init>", "(Lgy2/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Lgy2/i;", "getFailure", "()Lgy2/i;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ServerException extends Exception implements a {
    private final i failure;
    private final Integer httpCode;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerException(i iVar, String str, String str2, Integer num) {
        super((str == null || str.length() == 0) ? iVar.name() : str);
        iVar.getClass();
        this.failure = iVar;
        this.url = str2;
        this.httpCode = num;
    }

    public final i getFailure() {
        return this.failure;
    }

    @Override // bd2.a
    public Integer getHttpCode() {
        return this.httpCode;
    }

    @Override // bd2.b
    public String getUrl() {
        return this.url;
    }

    public /* synthetic */ ServerException(i iVar, String str, String str2, Integer num, int i14, j jVar) {
        this(iVar, str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : num);
    }
}
