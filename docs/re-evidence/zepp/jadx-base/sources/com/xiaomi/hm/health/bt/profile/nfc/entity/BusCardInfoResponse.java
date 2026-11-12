package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.profile.nfc.NFCResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusCardInfoResponse;", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCResponse;", "", "component1", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardInfoEntity;", "component2", "code", "cardInfoEntity", "copy", "", "toString", "hashCode", "", "other", "", "equals", "b", LogUtil.I, "getCode", "()I", "c", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardInfoEntity;", "getCardInfoEntity", "()Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardInfoEntity;", "<init>", "(ILcom/xiaomi/hm/health/bt/profile/nfc/entity/CardInfoEntity;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BusCardInfoResponse extends NFCResponse {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final CardInfoEntity cardInfoEntity;

    public BusCardInfoResponse(int i, @Nullable CardInfoEntity cardInfoEntity) {
        super(i);
        this.code = i;
        this.cardInfoEntity = cardInfoEntity;
    }

    public static /* synthetic */ BusCardInfoResponse copy$default(BusCardInfoResponse busCardInfoResponse, int i, CardInfoEntity cardInfoEntity, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = busCardInfoResponse.code;
        }
        if ((i2 & 2) != 0) {
            cardInfoEntity = busCardInfoResponse.cardInfoEntity;
        }
        return busCardInfoResponse.copy(i, cardInfoEntity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardInfoEntity getCardInfoEntity() {
        return this.cardInfoEntity;
    }

    @NotNull
    public final BusCardInfoResponse copy(int code, @Nullable CardInfoEntity cardInfoEntity) {
        return new BusCardInfoResponse(code, cardInfoEntity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusCardInfoResponse)) {
            return false;
        }
        BusCardInfoResponse busCardInfoResponse = (BusCardInfoResponse) other;
        return this.code == busCardInfoResponse.code && Intrinsics.areEqual(this.cardInfoEntity, busCardInfoResponse.cardInfoEntity);
    }

    @Nullable
    public final CardInfoEntity getCardInfoEntity() {
        return this.cardInfoEntity;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i = this.code * 31;
        CardInfoEntity cardInfoEntity = this.cardInfoEntity;
        return i + (cardInfoEntity == null ? 0 : cardInfoEntity.hashCode());
    }

    @NotNull
    public String toString() {
        return "BusCardInfoResponse(code=" + this.code + ", cardInfoEntity=" + this.cardInfoEntity + ')';
    }

    public /* synthetic */ BusCardInfoResponse(int i, CardInfoEntity cardInfoEntity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : cardInfoEntity);
    }
}
