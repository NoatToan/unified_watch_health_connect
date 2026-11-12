package com.huami.femalehealth.logiclib.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/HttpErrorCode;", "", "", "CODE_INTERNAL_ERROR", LogUtil.I, "CODE_NOT_FOUND", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class HttpErrorCode {
    public static final int CODE_INTERNAL_ERROR = -50000;
    public static final int CODE_NOT_FOUND = -2001;

    @NotNull
    public static final HttpErrorCode INSTANCE = new HttpErrorCode();

    private HttpErrorCode() {
    }
}
