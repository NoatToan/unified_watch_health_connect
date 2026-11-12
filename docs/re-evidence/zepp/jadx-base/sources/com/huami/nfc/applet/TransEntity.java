package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0012\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0013\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+¨\u00066"}, d2 = {"Lcom/huami/nfc/applet/TransEntity;", "", "", "component1", "component2", "component3", "", "component4", "", "component5", "Lcom/huami/nfc/applet/TransType;", "component6", "component7", "component8", "source", "aid", "transId", "time", "amount", "type", "posId", "overdraftLimit", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "b", "getAid", "c", "getTransId", GoogleApiAvailabilityLight.a, "J", "getTime", "()J", "e", LogUtil.I, "getAmount", "()I", "f", "Lcom/huami/nfc/applet/TransType;", "getType", "()Lcom/huami/nfc/applet/TransType;", "g", "getPosId", "h", "getOverdraftLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILcom/huami/nfc/applet/TransType;Ljava/lang/String;I)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String transId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final TransType type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String posId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int overdraftLimit;

    public TransEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, @NotNull TransType transType, @NotNull String str4, int i2) {
        this.source = str;
        this.aid = str2;
        this.transId = str3;
        this.time = j;
        this.amount = i;
        this.type = transType;
        this.posId = str4;
        this.overdraftLimit = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransId() {
        return this.transId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TransType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOverdraftLimit() {
        return this.overdraftLimit;
    }

    @NotNull
    public final TransEntity copy(@NotNull String source, @NotNull String aid, @NotNull String transId, long time, int amount, @NotNull TransType type, @NotNull String posId, int overdraftLimit) {
        return new TransEntity(source, aid, transId, time, amount, type, posId, overdraftLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransEntity)) {
            return false;
        }
        TransEntity transEntity = (TransEntity) other;
        return Intrinsics.areEqual(this.source, transEntity.source) && Intrinsics.areEqual(this.aid, transEntity.aid) && Intrinsics.areEqual(this.transId, transEntity.transId) && this.time == transEntity.time && this.amount == transEntity.amount && this.type == transEntity.type && Intrinsics.areEqual(this.posId, transEntity.posId) && this.overdraftLimit == transEntity.overdraftLimit;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getOverdraftLimit() {
        return this.overdraftLimit;
    }

    @NotNull
    public final String getPosId() {
        return this.posId;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTransId() {
        return this.transId;
    }

    @NotNull
    public final TransType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((this.source.hashCode() * 31) + this.aid.hashCode()) * 31) + this.transId.hashCode()) * 31) + b.a(this.time)) * 31) + this.amount) * 31) + this.type.hashCode()) * 31) + this.posId.hashCode()) * 31) + this.overdraftLimit;
    }

    @NotNull
    public String toString() {
        return "TransEntity(source=" + this.source + ", aid=" + this.aid + ", transId=" + this.transId + ", time=" + this.time + ", amount=" + this.amount + ", type=" + this.type + ", posId=" + this.posId + ", overdraftLimit=" + this.overdraftLimit + ')';
    }

    public /* synthetic */ TransEntity(String str, String str2, String str3, long j, int i, TransType transType, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, j, i, transType, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? 0 : i2);
    }
}
