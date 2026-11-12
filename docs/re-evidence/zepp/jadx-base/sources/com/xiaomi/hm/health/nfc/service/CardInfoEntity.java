package com.xiaomi.hm.health.nfc.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b/\u00100J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JR\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\b\"\u0004\b'\u0010(R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "", "Lcom/xiaomi/hm/health/nfc/service/Record;", "component5", "cardNo", "logicCardNo", "validityDate", StatEvent.SPORT_TP_VALUE_BALANCE, "tradeRecords", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCardNo", "()Ljava/lang/String;", "setCardNo", "(Ljava/lang/String;)V", "b", "getLogicCardNo", "setLogicCardNo", "c", "getValidityDate", "setValidityDate", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getBalance", "setBalance", "(Ljava/lang/Integer;)V", "e", "Ljava/util/List;", "getTradeRecords", "()Ljava/util/List;", "setTradeRecords", "(Ljava/util/List;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("cardNo")
    @Nullable
    private String cardNo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("logicCardNo")
    @Nullable
    private String logicCardNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("validityDate")
    @Nullable
    private String validityDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName(StatEvent.SPORT_TP_VALUE_BALANCE)
    @Nullable
    private Integer balance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("tradeRecords")
    @Nullable
    private List<Record> tradeRecords;

    public CardInfoEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public CardInfoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable List<Record> list) {
        this.cardNo = str;
        this.logicCardNo = str2;
        this.validityDate = str3;
        this.balance = num;
        this.tradeRecords = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardInfoEntity copy$default(CardInfoEntity cardInfoEntity, String str, String str2, String str3, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardInfoEntity.cardNo;
        }
        if ((i & 2) != 0) {
            str2 = cardInfoEntity.logicCardNo;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = cardInfoEntity.validityDate;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            num = cardInfoEntity.balance;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list = cardInfoEntity.tradeRecords;
        }
        return cardInfoEntity.copy(str, str4, str5, num2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogicCardNo() {
        return this.logicCardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValidityDate() {
        return this.validityDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBalance() {
        return this.balance;
    }

    @Nullable
    public final List<Record> component5() {
        return this.tradeRecords;
    }

    @NotNull
    public final CardInfoEntity copy(@Nullable String cardNo, @Nullable String logicCardNo, @Nullable String validityDate, @Nullable Integer balance, @Nullable List<Record> tradeRecords) {
        return new CardInfoEntity(cardNo, logicCardNo, validityDate, balance, tradeRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfoEntity)) {
            return false;
        }
        CardInfoEntity cardInfoEntity = (CardInfoEntity) other;
        return Intrinsics.areEqual(this.cardNo, cardInfoEntity.cardNo) && Intrinsics.areEqual(this.logicCardNo, cardInfoEntity.logicCardNo) && Intrinsics.areEqual(this.validityDate, cardInfoEntity.validityDate) && Intrinsics.areEqual(this.balance, cardInfoEntity.balance) && Intrinsics.areEqual(this.tradeRecords, cardInfoEntity.tradeRecords);
    }

    @Nullable
    public final Integer getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getLogicCardNo() {
        return this.logicCardNo;
    }

    @Nullable
    public final List<Record> getTradeRecords() {
        return this.tradeRecords;
    }

    @Nullable
    public final String getValidityDate() {
        return this.validityDate;
    }

    public int hashCode() {
        String str = this.cardNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logicCardNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validityDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.balance;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Record> list = this.tradeRecords;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setBalance(@Nullable Integer num) {
        this.balance = num;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setLogicCardNo(@Nullable String str) {
        this.logicCardNo = str;
    }

    public final void setTradeRecords(@Nullable List<Record> list) {
        this.tradeRecords = list;
    }

    public final void setValidityDate(@Nullable String str) {
        this.validityDate = str;
    }

    @NotNull
    public String toString() {
        return "CardInfoEntity(cardNo=" + this.cardNo + ", logicCardNo=" + this.logicCardNo + ", validityDate=" + this.validityDate + ", balance=" + this.balance + ", tradeRecords=" + this.tradeRecords + ")";
    }

    public /* synthetic */ CardInfoEntity(String str, String str2, String str3, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list);
    }
}
