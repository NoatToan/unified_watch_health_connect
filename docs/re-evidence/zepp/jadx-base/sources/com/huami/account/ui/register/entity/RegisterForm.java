package com.huami.account.ui.register.entity;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/account/ui/register/entity/RegisterForm;", "", "", "component1", "component2", "component3", "component4", "component5", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "areaCode", "password", "returnCode", "countryCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "b", "getAreaCode", "c", "getPassword", GoogleApiAvailabilityLight.a, "getReturnCode", "e", "getCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RegisterForm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String areaCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String password;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String returnCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String countryCode;

    public RegisterForm(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.phoneNumber = str;
        this.areaCode = str2;
        this.password = str3;
        this.returnCode = str4;
        this.countryCode = str5;
    }

    public static /* synthetic */ RegisterForm copy$default(RegisterForm registerForm, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerForm.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = registerForm.areaCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = registerForm.password;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = registerForm.returnCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = registerForm.countryCode;
        }
        return registerForm.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAreaCode() {
        return this.areaCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReturnCode() {
        return this.returnCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final RegisterForm copy(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String password, @NotNull String returnCode, @NotNull String countryCode) {
        return new RegisterForm(phoneNumber, areaCode, password, returnCode, countryCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterForm)) {
            return false;
        }
        RegisterForm registerForm = (RegisterForm) other;
        return Intrinsics.areEqual(this.phoneNumber, registerForm.phoneNumber) && Intrinsics.areEqual(this.areaCode, registerForm.areaCode) && Intrinsics.areEqual(this.password, registerForm.password) && Intrinsics.areEqual(this.returnCode, registerForm.returnCode) && Intrinsics.areEqual(this.countryCode, registerForm.countryCode);
    }

    @NotNull
    public final String getAreaCode() {
        return this.areaCode;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        return (((((((this.phoneNumber.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.password.hashCode()) * 31) + this.returnCode.hashCode()) * 31) + this.countryCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "RegisterForm(phoneNumber=" + this.phoneNumber + ", areaCode=" + this.areaCode + ", password=" + this.password + ", returnCode=" + this.returnCode + ", countryCode=" + this.countryCode + ")";
    }
}
