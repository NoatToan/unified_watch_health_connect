package com.huami.account.ui.login.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/account/ui/login/entity/PhoneLoginForm;", "", "", "component1", "component2", "component3", "teleNumber", "password", "areaCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTeleNumber", "()Ljava/lang/String;", "b", "getPassword", "c", "getAreaCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PhoneLoginForm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String teleNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String password;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String areaCode;

    public PhoneLoginForm(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.teleNumber = str;
        this.password = str2;
        this.areaCode = str3;
    }

    public static /* synthetic */ PhoneLoginForm copy$default(PhoneLoginForm phoneLoginForm, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneLoginForm.teleNumber;
        }
        if ((i & 2) != 0) {
            str2 = phoneLoginForm.password;
        }
        if ((i & 4) != 0) {
            str3 = phoneLoginForm.areaCode;
        }
        return phoneLoginForm.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTeleNumber() {
        return this.teleNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAreaCode() {
        return this.areaCode;
    }

    @NotNull
    public final PhoneLoginForm copy(@NotNull String teleNumber, @NotNull String password, @NotNull String areaCode) {
        return new PhoneLoginForm(teleNumber, password, areaCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneLoginForm)) {
            return false;
        }
        PhoneLoginForm phoneLoginForm = (PhoneLoginForm) other;
        return Intrinsics.areEqual(this.teleNumber, phoneLoginForm.teleNumber) && Intrinsics.areEqual(this.password, phoneLoginForm.password) && Intrinsics.areEqual(this.areaCode, phoneLoginForm.areaCode);
    }

    @NotNull
    public final String getAreaCode() {
        return this.areaCode;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getTeleNumber() {
        return this.teleNumber;
    }

    public int hashCode() {
        return (((this.teleNumber.hashCode() * 31) + this.password.hashCode()) * 31) + this.areaCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "PhoneLoginForm(teleNumber=" + this.teleNumber + ", password=" + this.password + ", areaCode=" + this.areaCode + ")";
    }
}
