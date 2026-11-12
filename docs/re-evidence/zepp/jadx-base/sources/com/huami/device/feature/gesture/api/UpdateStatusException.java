package com.huami.device.feature.gesture.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/gesture/api/UpdateStatusException;", "Ljava/lang/Exception;", "", "getErrorCode", "", "convertCodeMessage", "a", LogUtil.I, "code", "<init>", "(I)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class UpdateStatusException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    public UpdateStatusException(int i) {
        this.code = i;
    }

    @NotNull
    public final String convertCodeMessage() {
        String str;
        int i = this.code;
        if (i == 0) {
            str = "OK no error";
        } else if (i == 1) {
            str = "Invalid Parameter";
        } else if (i == 2) {
            str = "Invalid Command";
        } else if (i != 3) {
            str = i != 100 ? "other case" : "Time out or No response";
        } else {
            str = "Invalid Status";
        }
        return "\n $" + this.code + " : " + str + " \n error with description: https://confluence.huami.com/pages/viewpage.action?pageId=117080522 \n";
    }

    /* JADX INFO: renamed from: getErrorCode, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}
