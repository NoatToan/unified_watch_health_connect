package com.xiaomi.hm.health.nfc.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/Record;", "", "", "component1", "component2", "", "component3", "type", "amount", "date", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "b", "getAmount", "c", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Record {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("tradeType")
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("tradeAmount")
    private final int amount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("tradeDate")
    @NotNull
    private final String date;

    public Record(int i, int i2, @NotNull String str) {
        this.type = i;
        this.amount = i2;
        this.date = str;
    }

    public static /* synthetic */ Record copy$default(Record record, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = record.type;
        }
        if ((i3 & 2) != 0) {
            i2 = record.amount;
        }
        if ((i3 & 4) != 0) {
            str = record.date;
        }
        return record.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final Record copy(int type, int amount, @NotNull String date) {
        return new Record(type, amount, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Record)) {
            return false;
        }
        Record record = (Record) other;
        return this.type == record.type && this.amount == record.amount && Intrinsics.areEqual(this.date, record.date);
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type * 31) + this.amount) * 31) + this.date.hashCode();
    }

    @NotNull
    public String toString() {
        return "Record(type=" + this.type + ", amount=" + this.amount + ", date=" + this.date + ")";
    }
}
