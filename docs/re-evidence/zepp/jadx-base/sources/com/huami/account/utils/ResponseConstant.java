package com.huami.account.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/huami/account/utils/ResponseConstant;", "", "", "SUCCESS_200", "Ljava/lang/String;", "ERROR_404", "ERROR_400", "ERROR_400_4", "", "VERIFICATION_CODE_INVALID", LogUtil.I, "ERROR_401", "ERROR_429", "SMS_ERROR_IP_LIMIT", "SMS_ERROR_ONE_HOUR_LATER", "SMS_ERROR_ONE_DAY_LATER", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class ResponseConstant {

    @NotNull
    public static final String ERROR_400 = "400";

    @NotNull
    public static final String ERROR_400_4 = "400:4";

    @NotNull
    public static final String ERROR_401 = "401";

    @NotNull
    public static final String ERROR_404 = "404";

    @NotNull
    public static final String ERROR_429 = "429";

    @NotNull
    public static final ResponseConstant INSTANCE = new ResponseConstant();

    @NotNull
    public static final String SMS_ERROR_IP_LIMIT = "12";

    @NotNull
    public static final String SMS_ERROR_ONE_DAY_LATER = "14";

    @NotNull
    public static final String SMS_ERROR_ONE_HOUR_LATER = "13";

    @NotNull
    public static final String SUCCESS_200 = "200";
    public static final int VERIFICATION_CODE_INVALID = 4;

    private ResponseConstant() {
    }
}
