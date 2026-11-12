package com.garmin.customermanagementlib;

import cj2.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/customermanagementlib/CustomerManagementException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "Lcj2/b;", "errorFlag", "<init>", "(Ljava/lang/String;Lcj2/b;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcj2/b;", "getErrorFlag", "()Lcj2/b;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class CustomerManagementException extends Exception {
    public static final int $stable = 8;
    private final b errorFlag;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerManagementException(String str, b bVar) {
        super(str);
        str.getClass();
        bVar.getClass();
        this.message = str;
        this.errorFlag = bVar;
    }

    public b getErrorFlag() {
        return this.errorFlag;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ CustomerManagementException(String str, b bVar, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? b.UNKNOWN : bVar);
    }
}
