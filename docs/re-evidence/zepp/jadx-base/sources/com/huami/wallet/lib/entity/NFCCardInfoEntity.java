package com.huami.wallet.lib.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.device.event.StatEvent;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/wallet/lib/entity/NFCCardInfoEntity;", "", "", "component1", "component2", "component3", "component4", "", "component5", StatEvent.SPORT_TP_VALUE_BALANCE, "activationDate", "cardNumber", "expiredDate", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getBalance", "()Ljava/lang/String;", "b", "getActivationDate", "c", "getCardNumber", GoogleApiAvailabilityLight.a, "getExpiredDate", "e", "J", "getUpdateTime", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NFCCardInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String balance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String activationDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String cardNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String expiredDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long updateTime;

    public NFCCardInfoEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        this.balance = str;
        this.activationDate = str2;
        this.cardNumber = str3;
        this.expiredDate = str4;
        this.updateTime = j;
    }

    public static /* synthetic */ NFCCardInfoEntity copy$default(NFCCardInfoEntity nFCCardInfoEntity, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nFCCardInfoEntity.balance;
        }
        if ((i & 2) != 0) {
            str2 = nFCCardInfoEntity.activationDate;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = nFCCardInfoEntity.cardNumber;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = nFCCardInfoEntity.expiredDate;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = nFCCardInfoEntity.updateTime;
        }
        return nFCCardInfoEntity.copy(str, str5, str6, str7, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivationDate() {
        return this.activationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final NFCCardInfoEntity copy(@NotNull String balance, @NotNull String activationDate, @NotNull String cardNumber, @NotNull String expiredDate, long updateTime) {
        return new NFCCardInfoEntity(balance, activationDate, cardNumber, expiredDate, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NFCCardInfoEntity)) {
            return false;
        }
        NFCCardInfoEntity nFCCardInfoEntity = (NFCCardInfoEntity) other;
        return Intrinsics.areEqual(this.balance, nFCCardInfoEntity.balance) && Intrinsics.areEqual(this.activationDate, nFCCardInfoEntity.activationDate) && Intrinsics.areEqual(this.cardNumber, nFCCardInfoEntity.cardNumber) && Intrinsics.areEqual(this.expiredDate, nFCCardInfoEntity.expiredDate) && this.updateTime == nFCCardInfoEntity.updateTime;
    }

    @NotNull
    public final String getActivationDate() {
        return this.activationDate;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    public final String getExpiredDate() {
        return this.expiredDate;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((this.balance.hashCode() * 31) + this.activationDate.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.expiredDate.hashCode()) * 31) + b.a(this.updateTime);
    }

    @NotNull
    public String toString() {
        return "NFCCardInfoEntity(balance=" + this.balance + ", activationDate=" + this.activationDate + ", cardNumber=" + this.cardNumber + ", expiredDate=" + this.expiredDate + ", updateTime=" + this.updateTime + ')';
    }
}
