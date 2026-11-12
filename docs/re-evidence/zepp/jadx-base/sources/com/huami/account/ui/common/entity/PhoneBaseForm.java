package com.huami.account.ui.common.entity;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "", "", "toString", "component1", "component2", "component3", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "areaCode", "countryCode", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "b", "getAreaCode", "c", "getCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PhoneBaseForm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String areaCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String countryCode;

    public PhoneBaseForm(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.phoneNumber = str;
        this.areaCode = str2;
        this.countryCode = str3;
    }

    public static /* synthetic */ PhoneBaseForm copy$default(PhoneBaseForm phoneBaseForm, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneBaseForm.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = phoneBaseForm.areaCode;
        }
        if ((i & 4) != 0) {
            str3 = phoneBaseForm.countryCode;
        }
        return phoneBaseForm.copy(str, str2, str3);
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
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final PhoneBaseForm copy(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String countryCode) {
        return new PhoneBaseForm(phoneNumber, areaCode, countryCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneBaseForm)) {
            return false;
        }
        PhoneBaseForm phoneBaseForm = (PhoneBaseForm) other;
        return Intrinsics.areEqual(this.phoneNumber, phoneBaseForm.phoneNumber) && Intrinsics.areEqual(this.areaCode, phoneBaseForm.areaCode) && Intrinsics.areEqual(this.countryCode, phoneBaseForm.countryCode);
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
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((this.phoneNumber.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.countryCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "+" + this.areaCode + this.phoneNumber + "," + this.countryCode;
    }
}
