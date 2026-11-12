package com.garmin.feature.garminpay.providers.felica.exception.server;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/exception/server/FNValidateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "note", "", "<init>", "(Ljava/lang/String;)V", "rawResultCode", "rawMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNote", "()Ljava/lang/String;", "setNote", "getRawResultCode", "setRawResultCode", "rawResultMessage", "getRawResultMessage", "setRawResultMessage", "isExpectedError", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class FNValidateException extends Exception {
    public static final int $stable = 8;
    private String note;
    private String rawResultCode;
    private String rawResultMessage;

    public FNValidateException(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(": (");
        sb3.append(str2);
        super(e0.h(sb3, ")(", str3, ")"));
        this.note = str;
        this.rawResultCode = str2;
        this.rawResultMessage = str3;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getRawResultCode() {
        return this.rawResultCode;
    }

    public final String getRawResultMessage() {
        return this.rawResultMessage;
    }

    public final boolean isExpectedError() {
        return this.rawResultCode != null;
    }

    public final void setNote(String str) {
        str.getClass();
        this.note = str;
    }

    public final void setRawResultCode(String str) {
        this.rawResultCode = str;
    }

    public final void setRawResultMessage(String str) {
        this.rawResultMessage = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FNValidateException(String str) {
        super(str);
        str.getClass();
        this.note = str;
    }
}
