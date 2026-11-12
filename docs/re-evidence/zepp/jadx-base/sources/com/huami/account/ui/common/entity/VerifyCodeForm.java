package com.huami.account.ui.common.entity;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huami/account/ui/common/entity/VerifyCodeForm;", "", "", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "b", "getAreaCode", "areaCode", "c", "getCode", "code", GoogleApiAvailabilityLight.a, "getCodeType", "codeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class VerifyCodeForm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String areaCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String codeType;

    public VerifyCodeForm(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.phoneNumber = str;
        this.areaCode = str2;
        this.code = str3;
        this.codeType = str4;
    }

    @NotNull
    public final String getAreaCode() {
        return this.areaCode;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }
}
