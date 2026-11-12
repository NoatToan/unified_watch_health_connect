package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003Jc\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R\u0019\u0010\u0013\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\u0015\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 ¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardTransEntity;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "transId", "date", "amount", "type", "posId", "overdraftLimit", "recordTag", "recordLen", "record", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTransId", "()Ljava/lang/String;", "b", "J", "getDate", "()J", "c", LogUtil.I, "getAmount", "()I", GoogleApiAvailabilityLight.a, "getType", "e", "getPosId", "f", "getOverdraftLimit", "g", "getRecordTag", "h", "getRecordLen", "i", "getRecord", "<init>", "(Ljava/lang/String;JIILjava/lang/String;IIILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardTransEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String transId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String posId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int overdraftLimit;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int recordTag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int recordLen;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String record;

    public CardTransEntity(@NotNull String str, long j, int i, int i2, @NotNull String str2, int i3, int i4, int i5, @NotNull String str3) {
        this.transId = str;
        this.date = j;
        this.amount = i;
        this.type = i2;
        this.posId = str2;
        this.overdraftLimit = i3;
        this.recordTag = i4;
        this.recordLen = i5;
        this.record = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransId() {
        return this.transId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOverdraftLimit() {
        return this.overdraftLimit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getRecordTag() {
        return this.recordTag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRecordLen() {
        return this.recordLen;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRecord() {
        return this.record;
    }

    @NotNull
    public final CardTransEntity copy(@NotNull String transId, long date, int amount, int type, @NotNull String posId, int overdraftLimit, int recordTag, int recordLen, @NotNull String record) {
        return new CardTransEntity(transId, date, amount, type, posId, overdraftLimit, recordTag, recordLen, record);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardTransEntity)) {
            return false;
        }
        CardTransEntity cardTransEntity = (CardTransEntity) other;
        return Intrinsics.areEqual(this.transId, cardTransEntity.transId) && this.date == cardTransEntity.date && this.amount == cardTransEntity.amount && this.type == cardTransEntity.type && Intrinsics.areEqual(this.posId, cardTransEntity.posId) && this.overdraftLimit == cardTransEntity.overdraftLimit && this.recordTag == cardTransEntity.recordTag && this.recordLen == cardTransEntity.recordLen && Intrinsics.areEqual(this.record, cardTransEntity.record);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final long getDate() {
        return this.date;
    }

    public final int getOverdraftLimit() {
        return this.overdraftLimit;
    }

    @NotNull
    public final String getPosId() {
        return this.posId;
    }

    @NotNull
    public final String getRecord() {
        return this.record;
    }

    public final int getRecordLen() {
        return this.recordLen;
    }

    public final int getRecordTag() {
        return this.recordTag;
    }

    @NotNull
    public final String getTransId() {
        return this.transId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((this.transId.hashCode() * 31) + b.a(this.date)) * 31) + this.amount) * 31) + this.type) * 31) + this.posId.hashCode()) * 31) + this.overdraftLimit) * 31) + this.recordTag) * 31) + this.recordLen) * 31) + this.record.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardTransEntity(transId=" + this.transId + ", date=" + this.date + ", amount=" + this.amount + ", type=" + this.type + ", posId=" + this.posId + ", overdraftLimit=" + this.overdraftLimit + ", recordTag=" + this.recordTag + ", recordLen=" + this.recordLen + ", record=" + this.record + ')';
    }

    public /* synthetic */ CardTransEntity(String str, long j, int i, int i2, String str2, int i3, int i4, int i5, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, j, i, i2, (i6 & 16) != 0 ? "" : str2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 1 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? "" : str3);
    }
}
