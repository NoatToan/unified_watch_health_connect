package com.huami.watch.companion.esim;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watch/companion/esim/Error;", "", "", AbsEsimOperation.KEY_SUBJECT_CODE, "reasonCode", "", "getErrorType", "ERROR_PIN_ERROR", LogUtil.I, "ERROR_OTHERS", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class Error {
    public static final int ERROR_OTHERS = 2;
    public static final int ERROR_PIN_ERROR = 1;

    @NotNull
    public static final Error INSTANCE = new Error();

    private Error() {
    }

    @JvmStatic
    public static final int getErrorType(@NotNull String subjectCode, @NotNull String reasonCode) {
        return (Intrinsics.areEqual(subjectCode, "8.2.7") && Intrinsics.areEqual(reasonCode, "3.8")) ? 1 : 2;
    }
}
