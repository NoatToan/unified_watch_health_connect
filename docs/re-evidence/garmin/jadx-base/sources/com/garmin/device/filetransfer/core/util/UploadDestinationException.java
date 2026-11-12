package com.garmin.device.filetransfer.core.util;

import ny2.a;
import ok2.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002BS\b\u0007\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/garmin/device/filetransfer/core/util/UploadDestinationException;", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "Lny2/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "", "details", "", "httpCode", "url", "Lok2/e;", "failure", "", "invalidContent", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lok2/e;Z)V", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Z", "getInvalidContent", "()Z", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadDestinationException extends CoreTransferException implements a {
    private final Integer httpCode;
    private final boolean invalidContent;
    private final String url;

    public /* synthetic */ UploadDestinationException(Exception exc, String str, Integer num, String str2, e eVar, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : exc, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? e.A : eVar, (i14 & 32) != 0 ? false : z14);
    }

    @Override // bd2.a
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public final boolean getInvalidContent() {
        return this.invalidContent;
    }

    @Override // bd2.b
    public String getUrl() {
        return this.url;
    }

    public UploadDestinationException(Exception exc) {
        this(exc, null, null, null, null, false, 62, null);
    }

    public UploadDestinationException(Exception exc, String str) {
        this(exc, str, null, null, null, false, 60, null);
    }

    public UploadDestinationException(Exception exc, String str, Integer num) {
        this(exc, str, num, null, null, false, 56, null);
    }

    public UploadDestinationException(Exception exc, String str, Integer num, String str2) {
        this(exc, str, num, str2, null, false, 48, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadDestinationException(Exception exc, String str, Integer num, String str2, e eVar) {
        this(exc, str, num, str2, eVar, false, 32, null);
        eVar.getClass();
    }

    public UploadDestinationException() {
        this(null, null, null, null, null, false, 63, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadDestinationException(Exception exc, String str, Integer num, String str2, e eVar, boolean z14) {
        super(eVar, str, exc);
        eVar.getClass();
        this.httpCode = num;
        this.url = str2;
        this.invalidContent = z14;
    }
}
