package com.huami.nfc.door;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.nfc.door.entity.DoorCardExtraEntity;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MB\u0093\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bK\u0010LJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0007J\u009e\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\u0002HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0019\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0007R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0007R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u0010:R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u0010\u0007R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010/R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bJ\u0010\u0007¨\u0006N"}, d2 = {"Lcom/huami/nfc/door/DoorCardInfo;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "Lcom/huami/nfc/door/entity/DoorCardExtraEntity;", "component11", "component12", "aid", "cardArt", "type", "fingerFlag", "name", "userTerms", "status", "applyChannel", "cardCategory", "cid", "extra", "bizType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/nfc/door/entity/DoorCardExtraEntity;Ljava/lang/Integer;)Lcom/huami/nfc/door/DoorCardInfo;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "b", "getCardArt", "c", "Ljava/lang/Integer;", "getType", GoogleApiAvailabilityLight.a, "getFingerFlag", "e", "getName", "setName", "(Ljava/lang/String;)V", "f", "getUserTerms", "g", "getStatus", "h", "getApplyChannel", "i", "getCardCategory", z.j, "getCid", hl.k, "Lcom/huami/nfc/door/entity/DoorCardExtraEntity;", "getExtra", "()Lcom/huami/nfc/door/entity/DoorCardExtraEntity;", "l", "getBizType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/nfc/door/entity/DoorCardExtraEntity;Ljava/lang/Integer;)V", "Companion", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DoorCardInfo implements Parcelable {
    public static final int BIZ_TYPE_WORK = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("aid")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("cardArt")
    @Nullable
    private final String cardArt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(Constant.KEY_CARD_TYPE)
    @Nullable
    private final Integer type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("fingerFlag")
    @Nullable
    private final Integer fingerFlag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @Nullable
    private String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("userTerms")
    @Nullable
    private final String userTerms;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("vcStatus")
    @Nullable
    private final Integer status;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("applyChannel")
    @Nullable
    private final String applyChannel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("userNFCCardType")
    @Nullable
    private final String cardCategory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("cid")
    @Nullable
    private final String cid;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("extra")
    @Nullable
    private final DoorCardExtraEntity extra;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("bizType")
    @Nullable
    private final Integer bizType;

    @NotNull
    public static final Parcelable.Creator<DoorCardInfo> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<DoorCardInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DoorCardInfo createFromParcel(@NotNull Parcel parcel) {
            return new DoorCardInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DoorCardExtraEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DoorCardInfo[] newArray(int i) {
            return new DoorCardInfo[i];
        }
    }

    public DoorCardInfo(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable DoorCardExtraEntity doorCardExtraEntity, @Nullable Integer num4) {
        this.aid = str;
        this.cardArt = str2;
        this.type = num;
        this.fingerFlag = num2;
        this.name = str3;
        this.userTerms = str4;
        this.status = num3;
        this.applyChannel = str5;
        this.cardCategory = str6;
        this.cid = str7;
        this.extra = doorCardExtraEntity;
        this.bizType = num4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DoorCardExtraEntity getExtra() {
        return this.extra;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardArt() {
        return this.cardArt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFingerFlag() {
        return this.fingerFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserTerms() {
        return this.userTerms;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplyChannel() {
        return this.applyChannel;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCardCategory() {
        return this.cardCategory;
    }

    @NotNull
    public final DoorCardInfo copy(@NotNull String aid, @Nullable String cardArt, @Nullable Integer type, @Nullable Integer fingerFlag, @Nullable String name, @Nullable String userTerms, @Nullable Integer status, @Nullable String applyChannel, @Nullable String cardCategory, @Nullable String cid, @Nullable DoorCardExtraEntity extra, @Nullable Integer bizType) {
        return new DoorCardInfo(aid, cardArt, type, fingerFlag, name, userTerms, status, applyChannel, cardCategory, cid, extra, bizType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoorCardInfo)) {
            return false;
        }
        DoorCardInfo doorCardInfo = (DoorCardInfo) other;
        return Intrinsics.areEqual(this.aid, doorCardInfo.aid) && Intrinsics.areEqual(this.cardArt, doorCardInfo.cardArt) && Intrinsics.areEqual(this.type, doorCardInfo.type) && Intrinsics.areEqual(this.fingerFlag, doorCardInfo.fingerFlag) && Intrinsics.areEqual(this.name, doorCardInfo.name) && Intrinsics.areEqual(this.userTerms, doorCardInfo.userTerms) && Intrinsics.areEqual(this.status, doorCardInfo.status) && Intrinsics.areEqual(this.applyChannel, doorCardInfo.applyChannel) && Intrinsics.areEqual(this.cardCategory, doorCardInfo.cardCategory) && Intrinsics.areEqual(this.cid, doorCardInfo.cid) && Intrinsics.areEqual(this.extra, doorCardInfo.extra) && Intrinsics.areEqual(this.bizType, doorCardInfo.bizType);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getApplyChannel() {
        return this.applyChannel;
    }

    @Nullable
    public final Integer getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getCardArt() {
        return this.cardArt;
    }

    @Nullable
    public final String getCardCategory() {
        return this.cardCategory;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    public final DoorCardExtraEntity getExtra() {
        return this.extra;
    }

    @Nullable
    public final Integer getFingerFlag() {
        return this.fingerFlag;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUserTerms() {
        return this.userTerms;
    }

    public int hashCode() {
        int iHashCode = this.aid.hashCode() * 31;
        String str = this.cardArt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fingerFlag;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userTerms;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.applyChannel;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardCategory;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cid;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        DoorCardExtraEntity doorCardExtraEntity = this.extra;
        int iHashCode11 = (iHashCode10 + (doorCardExtraEntity == null ? 0 : doorCardExtraEntity.hashCode())) * 31;
        Integer num4 = this.bizType;
        return iHashCode11 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "DoorCardInfo(aid=" + this.aid + ", cardArt=" + ((Object) this.cardArt) + ", type=" + this.type + ", fingerFlag=" + this.fingerFlag + ", name=" + ((Object) this.name) + ", userTerms=" + ((Object) this.userTerms) + ", status=" + this.status + ", applyChannel=" + ((Object) this.applyChannel) + ", cardCategory=" + ((Object) this.cardCategory) + ", cid=" + ((Object) this.cid) + ", extra=" + this.extra + ", bizType=" + this.bizType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.aid);
        parcel.writeString(this.cardArt);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.fingerFlag;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.userTerms);
        Integer num3 = this.status;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.applyChannel);
        parcel.writeString(this.cardCategory);
        parcel.writeString(this.cid);
        DoorCardExtraEntity doorCardExtraEntity = this.extra;
        if (doorCardExtraEntity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            doorCardExtraEntity.writeToParcel(parcel, flags);
        }
        Integer num4 = this.bizType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public /* synthetic */ DoorCardInfo(String str, String str2, Integer num, Integer num2, String str3, String str4, Integer num3, String str5, String str6, String str7, DoorCardExtraEntity doorCardExtraEntity, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? 0 : num3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) == 0 ? doorCardExtraEntity : null, (i & 2048) != 0 ? 0 : num4);
    }
}
