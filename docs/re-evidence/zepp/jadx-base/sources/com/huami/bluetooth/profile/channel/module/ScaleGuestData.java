package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleGuestData;", "", "Lcom/huami/bluetooth/profile/channel/module/Gender;", "component1", "", "component2", "component3", "component4", "Lcom/huami/bluetooth/profile/channel/module/BodyMode;", "component5", "gender", "height", "birthDayYear", "birthDayMonth", "model", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/Gender;", "getGender", "()Lcom/huami/bluetooth/profile/channel/module/Gender;", "b", LogUtil.I, "getHeight", "()I", "c", "getBirthDayYear", GoogleApiAvailabilityLight.a, "getBirthDayMonth", "e", "Lcom/huami/bluetooth/profile/channel/module/BodyMode;", "getModel", "()Lcom/huami/bluetooth/profile/channel/module/BodyMode;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/Gender;IIILcom/huami/bluetooth/profile/channel/module/BodyMode;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScaleGuestData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Gender gender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int birthDayYear;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int birthDayMonth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final BodyMode model;

    public ScaleGuestData(@NotNull Gender gender, int i, int i2, int i3, @NotNull BodyMode bodyMode) {
        this.gender = gender;
        this.height = i;
        this.birthDayYear = i2;
        this.birthDayMonth = i3;
        this.model = bodyMode;
    }

    public static /* synthetic */ ScaleGuestData copy$default(ScaleGuestData scaleGuestData, Gender gender, int i, int i2, int i3, BodyMode bodyMode, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gender = scaleGuestData.gender;
        }
        if ((i4 & 2) != 0) {
            i = scaleGuestData.height;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = scaleGuestData.birthDayYear;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = scaleGuestData.birthDayMonth;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            bodyMode = scaleGuestData.model;
        }
        return scaleGuestData.copy(gender, i5, i6, i7, bodyMode);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBirthDayYear() {
        return this.birthDayYear;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBirthDayMonth() {
        return this.birthDayMonth;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BodyMode getModel() {
        return this.model;
    }

    @NotNull
    public final ScaleGuestData copy(@NotNull Gender gender, int height, int birthDayYear, int birthDayMonth, @NotNull BodyMode model) {
        return new ScaleGuestData(gender, height, birthDayYear, birthDayMonth, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleGuestData)) {
            return false;
        }
        ScaleGuestData scaleGuestData = (ScaleGuestData) other;
        return this.gender == scaleGuestData.gender && this.height == scaleGuestData.height && this.birthDayYear == scaleGuestData.birthDayYear && this.birthDayMonth == scaleGuestData.birthDayMonth && this.model == scaleGuestData.model;
    }

    public final int getBirthDayMonth() {
        return this.birthDayMonth;
    }

    public final int getBirthDayYear() {
        return this.birthDayYear;
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final BodyMode getModel() {
        return this.model;
    }

    public int hashCode() {
        return (((((((this.gender.hashCode() * 31) + this.height) * 31) + this.birthDayYear) * 31) + this.birthDayMonth) * 31) + this.model.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScaleGuestData(gender=" + this.gender + ", height=" + this.height + ", birthDayYear=" + this.birthDayYear + ", birthDayMonth=" + this.birthDayMonth + ", model=" + this.model + ')';
    }

    public /* synthetic */ ScaleGuestData(Gender gender, int i, int i2, int i3, BodyMode bodyMode, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Gender.OTHER : gender, i, i2, i3, (i4 & 16) != 0 ? BodyMode.MODE_NORMAL : bodyMode);
    }
}
