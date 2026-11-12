package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.nfc.NFCResponse;
import com.xiaomi.hm.health.device.event.StatEvent;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusBalanceResponse;", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCResponse;", "", "component1", "", "component2", "component3", "code", StatEvent.SPORT_TP_VALUE_BALANCE, "overdraft", "copy", "", "toString", "hashCode", "", "other", "", "equals", "b", LogUtil.I, "getCode", "()I", "c", "J", "getBalance", "()J", GoogleApiAvailabilityLight.a, "getOverdraft", "<init>", "(IJJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BusBalanceResponse extends NFCResponse {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long balance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long overdraft;

    public BusBalanceResponse(int i, long j, long j2) {
        super(i);
        this.code = i;
        this.balance = j;
        this.overdraft = j2;
    }

    public static /* synthetic */ BusBalanceResponse copy$default(BusBalanceResponse busBalanceResponse, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = busBalanceResponse.code;
        }
        if ((i2 & 2) != 0) {
            j = busBalanceResponse.balance;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = busBalanceResponse.overdraft;
        }
        return busBalanceResponse.copy(i, j3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getOverdraft() {
        return this.overdraft;
    }

    @NotNull
    public final BusBalanceResponse copy(int code, long balance, long overdraft) {
        return new BusBalanceResponse(code, balance, overdraft);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusBalanceResponse)) {
            return false;
        }
        BusBalanceResponse busBalanceResponse = (BusBalanceResponse) other;
        return this.code == busBalanceResponse.code && this.balance == busBalanceResponse.balance && this.overdraft == busBalanceResponse.overdraft;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getOverdraft() {
        return this.overdraft;
    }

    public int hashCode() {
        return (((this.code * 31) + b.a(this.balance)) * 31) + b.a(this.overdraft);
    }

    @NotNull
    public String toString() {
        return "BusBalanceResponse(code=" + this.code + ", balance=" + this.balance + ", overdraft=" + this.overdraft + ')';
    }
}
