package com.xiaomi.fitness.sport.view.justdance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/PhoneUiSetupData;", "", "isPopup", "", "isMaster", "inputSetup", "", "disabledSetup", "setupData", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()I", "getInputSetup", "()Ljava/lang/String;", "getDisabledSetup", "getSetupData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhoneUiSetupData {

    @NotNull
    private final String disabledSetup;

    @NotNull
    private final String inputSetup;
    private final int isMaster;
    private final int isPopup;

    @NotNull
    private final String setupData;

    public PhoneUiSetupData(int i, int i2, @NotNull String inputSetup, @NotNull String disabledSetup, @NotNull String setupData) {
        Intrinsics.checkNotNullParameter(inputSetup, "inputSetup");
        Intrinsics.checkNotNullParameter(disabledSetup, "disabledSetup");
        Intrinsics.checkNotNullParameter(setupData, "setupData");
        this.isPopup = i;
        this.isMaster = i2;
        this.inputSetup = inputSetup;
        this.disabledSetup = disabledSetup;
        this.setupData = setupData;
    }

    public static /* synthetic */ PhoneUiSetupData copy$default(PhoneUiSetupData phoneUiSetupData, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = phoneUiSetupData.isPopup;
        }
        if ((i3 & 2) != 0) {
            i2 = phoneUiSetupData.isMaster;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = phoneUiSetupData.inputSetup;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = phoneUiSetupData.disabledSetup;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = phoneUiSetupData.setupData;
        }
        return phoneUiSetupData.copy(i, i4, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIsPopup() {
        return this.isPopup;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIsMaster() {
        return this.isMaster;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInputSetup() {
        return this.inputSetup;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisabledSetup() {
        return this.disabledSetup;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSetupData() {
        return this.setupData;
    }

    @NotNull
    public final PhoneUiSetupData copy(int isPopup, int isMaster, @NotNull String inputSetup, @NotNull String disabledSetup, @NotNull String setupData) {
        Intrinsics.checkNotNullParameter(inputSetup, "inputSetup");
        Intrinsics.checkNotNullParameter(disabledSetup, "disabledSetup");
        Intrinsics.checkNotNullParameter(setupData, "setupData");
        return new PhoneUiSetupData(isPopup, isMaster, inputSetup, disabledSetup, setupData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneUiSetupData)) {
            return false;
        }
        PhoneUiSetupData phoneUiSetupData = (PhoneUiSetupData) other;
        return this.isPopup == phoneUiSetupData.isPopup && this.isMaster == phoneUiSetupData.isMaster && Intrinsics.areEqual(this.inputSetup, phoneUiSetupData.inputSetup) && Intrinsics.areEqual(this.disabledSetup, phoneUiSetupData.disabledSetup) && Intrinsics.areEqual(this.setupData, phoneUiSetupData.setupData);
    }

    @NotNull
    public final String getDisabledSetup() {
        return this.disabledSetup;
    }

    @NotNull
    public final String getInputSetup() {
        return this.inputSetup;
    }

    @NotNull
    public final String getSetupData() {
        return this.setupData;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.isPopup) * 31) + Integer.hashCode(this.isMaster)) * 31) + this.inputSetup.hashCode()) * 31) + this.disabledSetup.hashCode()) * 31) + this.setupData.hashCode();
    }

    public final int isMaster() {
        return this.isMaster;
    }

    public final int isPopup() {
        return this.isPopup;
    }

    @NotNull
    public String toString() {
        return "PhoneUiSetupData(isPopup=" + this.isPopup + ", isMaster=" + this.isMaster + ", inputSetup=" + this.inputSetup + ", disabledSetup=" + this.disabledSetup + ", setupData=" + this.setupData + ")";
    }
}
