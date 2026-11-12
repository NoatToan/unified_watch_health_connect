package com.xiaomi.fitness.sync.export.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Entity(tableName = "StockInfo")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/sync/export/db/StockInfoEntity;", "", "symbol", "", "market", "nameCN", "latestPrice", "", "preClose", "halted", "", "delay", "timestamp", "", "updateTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIIJJ)V", "getSymbol", "()Ljava/lang/String;", "getMarket", "getNameCN", "getLatestPrice", "()F", "getPreClose", "getHalted", "()I", "getDelay", "getTimestamp", "()J", "getUpdateTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StockInfoEntity {
    private final int delay;
    private final int halted;
    private final float latestPrice;

    @NotNull
    private final String market;

    @NotNull
    private final String nameCN;
    private final float preClose;

    @PrimaryKey
    @NotNull
    private final String symbol;
    private final long timestamp;
    private final long updateTimestamp;

    public StockInfoEntity(@NotNull String symbol, @NotNull String market, @NotNull String nameCN, float f, float f2, int i, int i2, long j, long j2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(nameCN, "nameCN");
        this.symbol = symbol;
        this.market = market;
        this.nameCN = nameCN;
        this.latestPrice = f;
        this.preClose = f2;
        this.halted = i;
        this.delay = i2;
        this.timestamp = j;
        this.updateTimestamp = j2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNameCN() {
        return this.nameCN;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getLatestPrice() {
        return this.latestPrice;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getPreClose() {
        return this.preClose;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHalted() {
        return this.halted;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    @NotNull
    public final StockInfoEntity copy(@NotNull String symbol, @NotNull String market, @NotNull String nameCN, float latestPrice, float preClose, int halted, int delay, long timestamp, long updateTimestamp) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(nameCN, "nameCN");
        return new StockInfoEntity(symbol, market, nameCN, latestPrice, preClose, halted, delay, timestamp, updateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockInfoEntity)) {
            return false;
        }
        StockInfoEntity stockInfoEntity = (StockInfoEntity) other;
        return Intrinsics.areEqual(this.symbol, stockInfoEntity.symbol) && Intrinsics.areEqual(this.market, stockInfoEntity.market) && Intrinsics.areEqual(this.nameCN, stockInfoEntity.nameCN) && Float.compare(this.latestPrice, stockInfoEntity.latestPrice) == 0 && Float.compare(this.preClose, stockInfoEntity.preClose) == 0 && this.halted == stockInfoEntity.halted && this.delay == stockInfoEntity.delay && this.timestamp == stockInfoEntity.timestamp && this.updateTimestamp == stockInfoEntity.updateTimestamp;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getHalted() {
        return this.halted;
    }

    public final float getLatestPrice() {
        return this.latestPrice;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    @NotNull
    public final String getNameCN() {
        return this.nameCN;
    }

    public final float getPreClose() {
        return this.preClose;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public int hashCode() {
        return (((((((((((((((this.symbol.hashCode() * 31) + this.market.hashCode()) * 31) + this.nameCN.hashCode()) * 31) + Float.hashCode(this.latestPrice)) * 31) + Float.hashCode(this.preClose)) * 31) + Integer.hashCode(this.halted)) * 31) + Integer.hashCode(this.delay)) * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.updateTimestamp);
    }

    @NotNull
    public String toString() {
        return "StockInfoEntity(symbol=" + this.symbol + ", market=" + this.market + ", nameCN=" + this.nameCN + ", latestPrice=" + this.latestPrice + ", preClose=" + this.preClose + ", halted=" + this.halted + ", delay=" + this.delay + ", timestamp=" + this.timestamp + ", updateTimestamp=" + this.updateTimestamp + ")";
    }
}
