package com.garmin.sync.gc.server;

import ny2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/sync/gc/server/CheckDeviceFirmwareUpdateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lny2/a;", "", "cause", "", "httpCode", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckDeviceFirmwareUpdateException extends Exception implements a {
    private final Integer httpCode;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDeviceFirmwareUpdateException(Throwable th3, Integer num) {
        super(th3);
        th3.getClass();
        this.httpCode = num;
        this.url = "/device-service/softwareupdate/check";
    }

    @Override // bd2.a
    public Integer getHttpCode() {
        return this.httpCode;
    }

    @Override // bd2.b
    public String getUrl() {
        return this.url;
    }

    public /* synthetic */ CheckDeviceFirmwareUpdateException(Throwable th3, Integer num, int i14, j jVar) {
        this(th3, (i14 & 2) != 0 ? null : num);
    }
}
