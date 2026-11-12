package com.garmin.device.filetransfer.core.util;

import ny2.a;
import ok2.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/device/filetransfer/core/util/UrlSourceException;", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "Lny2/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "", "details", "", "httpCode", "url", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UrlSourceException extends CoreTransferException implements a {
    private final Integer httpCode;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UrlSourceException(Exception exc, String str, Integer num, String str2, int i14, j jVar) {
        exc = (i14 & 1) != 0 ? null : exc;
        str = (i14 & 2) != 0 ? null : str;
        if ((i14 & 4) != 0) {
            a aVar = exc instanceof a ? (a) exc : null;
            num = aVar != null ? aVar.getHttpCode() : null;
        }
        if ((i14 & 8) != 0) {
            a aVar2 = exc instanceof a ? (a) exc : null;
            str2 = aVar2 != null ? aVar2.getUrl() : null;
        }
        this(exc, str, num, str2);
    }

    @Override // bd2.a
    public Integer getHttpCode() {
        return this.httpCode;
    }

    @Override // bd2.b
    public String getUrl() {
        return this.url;
    }

    public UrlSourceException() {
        this(null, null, null, null, 15, null);
    }

    public UrlSourceException(Exception exc, String str, Integer num, String str2) {
        super(e.f132652v, str, exc);
        this.httpCode = num;
        this.url = str2;
    }
}
