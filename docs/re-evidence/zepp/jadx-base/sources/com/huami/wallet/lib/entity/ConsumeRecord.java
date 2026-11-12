package com.huami.wallet.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/wallet/lib/entity/ConsumeRecord;", "", "", "component1", "", "component2", "timestamp", "amount", "copy", "", "toString", "hashCode", "other", "", "equals", "J", LogUtil.I, "<init>", "(JI)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConsumeRecord {

    @JvmField
    public int amount;

    @JvmField
    public long timestamp;

    public ConsumeRecord(long j, int i) {
        this.timestamp = j;
        this.amount = i;
    }

    public static /* synthetic */ ConsumeRecord copy$default(ConsumeRecord consumeRecord, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = consumeRecord.timestamp;
        }
        if ((i2 & 2) != 0) {
            i = consumeRecord.amount;
        }
        return consumeRecord.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final ConsumeRecord copy(long timestamp, int amount) {
        return new ConsumeRecord(timestamp, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumeRecord)) {
            return false;
        }
        ConsumeRecord consumeRecord = (ConsumeRecord) other;
        return this.timestamp == consumeRecord.timestamp && this.amount == consumeRecord.amount;
    }

    public int hashCode() {
        return (b.a(this.timestamp) * 31) + this.amount;
    }

    @NotNull
    public String toString() {
        return "ConsumeRecord(timestamp=" + this.timestamp + ", amount=" + this.amount + ')';
    }
}
