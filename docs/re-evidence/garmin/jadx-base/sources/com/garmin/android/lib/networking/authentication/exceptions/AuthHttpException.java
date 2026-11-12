package com.garmin.android.lib.networking.authentication.exceptions;

import bd2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/lib/networking/authentication/exceptions/AuthHttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lbd2/a;", "", "msg", "", "httpCode", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthHttpException extends Exception implements a {
    private final Integer httpCode;

    public /* synthetic */ AuthHttpException(String str, Integer num, Throwable th3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : th3);
    }

    @Override // bd2.a
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthHttpException(String str, Integer num, Throwable th3) {
        super(str, th3);
        str.getClass();
        this.httpCode = num;
    }
}
