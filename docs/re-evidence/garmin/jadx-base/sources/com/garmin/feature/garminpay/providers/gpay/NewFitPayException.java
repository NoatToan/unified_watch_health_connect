package com.garmin.feature.garminpay.providers.gpay;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/NewFitPayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "Lzn2/z;", "errorFlag", "", "extraData", "<init>", "(Ljava/lang/String;Lzn2/z;Ljava/lang/Object;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lzn2/z;", "getErrorFlag", "()Lzn2/z;", "Ljava/lang/Object;", "getExtraData", "()Ljava/lang/Object;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class NewFitPayException extends Exception {
    public static final int $stable = 8;
    private final z errorFlag;
    private final Object extraData;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFitPayException(String str, z zVar, Object obj) {
        super(str);
        str.getClass();
        zVar.getClass();
        this.message = str;
        this.errorFlag = zVar;
        this.extraData = obj;
    }

    public z getErrorFlag() {
        return this.errorFlag;
    }

    public Object getExtraData() {
        return this.extraData;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ NewFitPayException(String str, z zVar, Object obj, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? z.UNKNOWN : zVar, (i14 & 4) != 0 ? null : obj);
    }
}
