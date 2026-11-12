package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.event.StatEvent;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003JO\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0010\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0010\u0010%R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0013\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010%¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardInfoEntity;", "", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "number", "activationDate", "expiredDate", "isNeedCloud", StatEvent.SPORT_TP_VALUE_BALANCE, "overdraft", "enable", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getNumber", "()Ljava/lang/String;", "b", "J", "getActivationDate", "()J", "c", "getExpiredDate", GoogleApiAvailabilityLight.a, "Z", "()Z", "e", LogUtil.I, "getBalance", "()I", "f", "getOverdraft", "g", "getEnable", "<init>", "(Ljava/lang/String;JJZIIZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long activationDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long expiredDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isNeedCloud;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int balance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int overdraft;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean enable;

    public CardInfoEntity(@NotNull String str, long j, long j2, boolean z, int i, int i2, boolean z2) {
        this.number = str;
        this.activationDate = j;
        this.expiredDate = j2;
        this.isNeedCloud = z;
        this.balance = i;
        this.overdraft = i2;
        this.enable = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getActivationDate() {
        return this.activationDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsNeedCloud() {
        return this.isNeedCloud;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOverdraft() {
        return this.overdraft;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final CardInfoEntity copy(@NotNull String number, long activationDate, long expiredDate, boolean isNeedCloud, int balance, int overdraft, boolean enable) {
        return new CardInfoEntity(number, activationDate, expiredDate, isNeedCloud, balance, overdraft, enable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfoEntity)) {
            return false;
        }
        CardInfoEntity cardInfoEntity = (CardInfoEntity) other;
        return Intrinsics.areEqual(this.number, cardInfoEntity.number) && this.activationDate == cardInfoEntity.activationDate && this.expiredDate == cardInfoEntity.expiredDate && this.isNeedCloud == cardInfoEntity.isNeedCloud && this.balance == cardInfoEntity.balance && this.overdraft == cardInfoEntity.overdraft && this.enable == cardInfoEntity.enable;
    }

    public final long getActivationDate() {
        return this.activationDate;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getExpiredDate() {
        return this.expiredDate;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    public final int getOverdraft() {
        return this.overdraft;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.number.hashCode() * 31) + b.a(this.activationDate)) * 31) + b.a(this.expiredDate)) * 31;
        boolean z = this.isNeedCloud;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((((iHashCode + r1) * 31) + this.balance) * 31) + this.overdraft) * 31;
        boolean z2 = this.enable;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isNeedCloud() {
        return this.isNeedCloud;
    }

    @NotNull
    public String toString() {
        return "CardInfoEntity(number=" + this.number + ", activationDate=" + this.activationDate + ", expiredDate=" + this.expiredDate + ", isNeedCloud=" + this.isNeedCloud + ", balance=" + this.balance + ", overdraft=" + this.overdraft + ", enable=" + this.enable + ')';
    }

    public /* synthetic */ CardInfoEntity(String str, long j, long j2, boolean z, int i, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? true : z2);
    }
}
