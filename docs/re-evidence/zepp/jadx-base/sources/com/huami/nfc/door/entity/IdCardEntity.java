package com.huami.nfc.door.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\r\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u000e\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u000f\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/nfc/door/entity/IdCardEntity;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "cardNo", "realName", Constant.KEY_CARD_TYPE, "isNeedPhoto", "isOldCache", "isVerify", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCardNo", "()Ljava/lang/String;", "b", "getRealName", "c", LogUtil.I, "getCardType", "()I", GoogleApiAvailabilityLight.a, "e", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IdCardEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("cardNo")
    @NotNull
    private final String cardNo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("realName")
    @NotNull
    private final String realName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(Constant.KEY_CARD_TYPE)
    private final int cardType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("isNeedPhoto")
    private final int isNeedPhoto;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("isOldCache")
    private final int isOldCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("isVerify")
    private final int isVerify;

    public IdCardEntity(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4) {
        this.cardNo = str;
        this.realName = str2;
        this.cardType = i;
        this.isNeedPhoto = i2;
        this.isOldCache = i3;
        this.isVerify = i4;
    }

    public static /* synthetic */ IdCardEntity copy$default(IdCardEntity idCardEntity, String str, String str2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = idCardEntity.cardNo;
        }
        if ((i5 & 2) != 0) {
            str2 = idCardEntity.realName;
        }
        String str3 = str2;
        if ((i5 & 4) != 0) {
            i = idCardEntity.cardType;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = idCardEntity.isNeedPhoto;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = idCardEntity.isOldCache;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = idCardEntity.isVerify;
        }
        return idCardEntity.copy(str, str3, i6, i7, i8, i4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIsNeedPhoto() {
        return this.isNeedPhoto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIsOldCache() {
        return this.isOldCache;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIsVerify() {
        return this.isVerify;
    }

    @NotNull
    public final IdCardEntity copy(@NotNull String cardNo, @NotNull String realName, int cardType, int isNeedPhoto, int isOldCache, int isVerify) {
        return new IdCardEntity(cardNo, realName, cardType, isNeedPhoto, isOldCache, isVerify);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdCardEntity)) {
            return false;
        }
        IdCardEntity idCardEntity = (IdCardEntity) other;
        return Intrinsics.areEqual(this.cardNo, idCardEntity.cardNo) && Intrinsics.areEqual(this.realName, idCardEntity.realName) && this.cardType == idCardEntity.cardType && this.isNeedPhoto == idCardEntity.isNeedPhoto && this.isOldCache == idCardEntity.isOldCache && this.isVerify == idCardEntity.isVerify;
    }

    @NotNull
    public final String getCardNo() {
        return this.cardNo;
    }

    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getRealName() {
        return this.realName;
    }

    public int hashCode() {
        return (((((((((this.cardNo.hashCode() * 31) + this.realName.hashCode()) * 31) + this.cardType) * 31) + this.isNeedPhoto) * 31) + this.isOldCache) * 31) + this.isVerify;
    }

    public final int isNeedPhoto() {
        return this.isNeedPhoto;
    }

    public final int isOldCache() {
        return this.isOldCache;
    }

    public final int isVerify() {
        return this.isVerify;
    }

    @NotNull
    public String toString() {
        return "IdCardEntity(cardNo=" + this.cardNo + ", realName=" + this.realName + ", cardType=" + this.cardType + ", isNeedPhoto=" + this.isNeedPhoto + ", isOldCache=" + this.isOldCache + ", isVerify=" + this.isVerify + ')';
    }

    public /* synthetic */ IdCardEntity(String str, String str2, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? 1 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }
}
