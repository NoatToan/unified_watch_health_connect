package vl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvl2/e;", "", "", "errMsg", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    UNKNOWN_ERROR("unknown error"),
    SUCCESS("success"),
    ERROR("internal API error"),
    /* JADX INFO: Fake field, exist only in values array */
    BUSY("failed because another entity holds exclusive access to SE"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_APDU_STATUS("last APDU processed encountered an error"),
    /* JADX INFO: Fake field, exist only in values array */
    BATCH_ERROR("command batch error, bad format or length"),
    /* JADX INFO: Fake field, exist only in values array */
    MEMORY_ERROR("failed to allocate internal memory"),
    /* JADX INFO: Fake field, exist only in values array */
    BAD_STATE("device NFC module does not allow this call in current state"),
    /* JADX INFO: Fake field, exist only in values array */
    APDU_PACKAGE_NOT_CACHED("apdu package not cached"),
    /* JADX INFO: Fake field, exist only in values array */
    FORMAT_ERROR("format error with APDU package payload"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not supported");

    e(String str) {
    }
}
