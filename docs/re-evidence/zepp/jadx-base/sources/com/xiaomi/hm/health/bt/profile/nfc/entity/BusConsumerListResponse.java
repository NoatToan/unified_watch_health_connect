package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.profile.nfc.NFCResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusConsumerListResponse;", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCResponse;", "", "component1", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardTransEntity;", "component2", "code", "cardTransEntityList", "copy", "", "toString", "hashCode", "", "other", "", "equals", "b", LogUtil.I, "getCode", "()I", "c", "Ljava/util/List;", "getCardTransEntityList", "()Ljava/util/List;", "<init>", "(ILjava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BusConsumerListResponse extends NFCResponse {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<CardTransEntity> cardTransEntityList;

    public BusConsumerListResponse(int i, @NotNull List<CardTransEntity> list) {
        super(i);
        this.code = i;
        this.cardTransEntityList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BusConsumerListResponse copy$default(BusConsumerListResponse busConsumerListResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = busConsumerListResponse.code;
        }
        if ((i2 & 2) != 0) {
            list = busConsumerListResponse.cardTransEntityList;
        }
        return busConsumerListResponse.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<CardTransEntity> component2() {
        return this.cardTransEntityList;
    }

    @NotNull
    public final BusConsumerListResponse copy(int code, @NotNull List<CardTransEntity> cardTransEntityList) {
        return new BusConsumerListResponse(code, cardTransEntityList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusConsumerListResponse)) {
            return false;
        }
        BusConsumerListResponse busConsumerListResponse = (BusConsumerListResponse) other;
        return this.code == busConsumerListResponse.code && Intrinsics.areEqual(this.cardTransEntityList, busConsumerListResponse.cardTransEntityList);
    }

    @NotNull
    public final List<CardTransEntity> getCardTransEntityList() {
        return this.cardTransEntityList;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        return (this.code * 31) + this.cardTransEntityList.hashCode();
    }

    @NotNull
    public String toString() {
        return "BusConsumerListResponse(code=" + this.code + ", cardTransEntityList=" + this.cardTransEntityList + ')';
    }
}
