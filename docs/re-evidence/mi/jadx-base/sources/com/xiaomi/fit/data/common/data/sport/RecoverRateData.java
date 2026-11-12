package com.xiaomi.fit.data.common.data.sport;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "", "recoverTime", "", "recoverRate", "", "recoverRateRadio", "", "<init>", "(JIF)V", "getRecoverTime", "()J", "getRecoverRate", "()I", "getRecoverRateRadio", "()F", "recoverRateList", "", "getRecoverRateList", "()Ljava/util/List;", "setRecoverRateList", "(Ljava/util/List;)V", "startRate", "getStartRate", "()Ljava/lang/Integer;", "setStartRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "endRate", "getEndRate", "setEndRate", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecoverRateData {

    @Nullable
    private Integer endRate;
    private final int recoverRate;

    @Nullable
    private List<Integer> recoverRateList;
    private final float recoverRateRadio;
    private final long recoverTime;

    @Nullable
    private Integer startRate;

    public RecoverRateData(long j, int i, float f) {
        this.recoverTime = j;
        this.recoverRate = i;
        this.recoverRateRadio = f;
    }

    public static /* synthetic */ RecoverRateData copy$default(RecoverRateData recoverRateData, long j, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = recoverRateData.recoverTime;
        }
        if ((i2 & 2) != 0) {
            i = recoverRateData.recoverRate;
        }
        if ((i2 & 4) != 0) {
            f = recoverRateData.recoverRateRadio;
        }
        return recoverRateData.copy(j, i, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRecoverTime() {
        return this.recoverTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecoverRate() {
        return this.recoverRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRecoverRateRadio() {
        return this.recoverRateRadio;
    }

    @NotNull
    public final RecoverRateData copy(long recoverTime, int recoverRate, float recoverRateRadio) {
        return new RecoverRateData(recoverTime, recoverRate, recoverRateRadio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoverRateData)) {
            return false;
        }
        RecoverRateData recoverRateData = (RecoverRateData) other;
        return this.recoverTime == recoverRateData.recoverTime && this.recoverRate == recoverRateData.recoverRate && Float.compare(this.recoverRateRadio, recoverRateData.recoverRateRadio) == 0;
    }

    @Nullable
    public final Integer getEndRate() {
        return this.endRate;
    }

    public final int getRecoverRate() {
        return this.recoverRate;
    }

    @Nullable
    public final List<Integer> getRecoverRateList() {
        return this.recoverRateList;
    }

    public final float getRecoverRateRadio() {
        return this.recoverRateRadio;
    }

    public final long getRecoverTime() {
        return this.recoverTime;
    }

    @Nullable
    public final Integer getStartRate() {
        return this.startRate;
    }

    public int hashCode() {
        return (((Long.hashCode(this.recoverTime) * 31) + Integer.hashCode(this.recoverRate)) * 31) + Float.hashCode(this.recoverRateRadio);
    }

    public final void setEndRate(@Nullable Integer num) {
        this.endRate = num;
    }

    public final void setRecoverRateList(@Nullable List<Integer> list) {
        this.recoverRateList = list;
    }

    public final void setStartRate(@Nullable Integer num) {
        this.startRate = num;
    }

    @NotNull
    public String toString() {
        long j = this.recoverTime;
        int i = this.recoverRate;
        float f = this.recoverRateRadio;
        Integer num = this.startRate;
        Integer num2 = this.endRate;
        List<Integer> list = this.recoverRateList;
        return "recoverTime = " + j + ", recoverRate = " + i + ", recoverRateRadio = " + f + ", startRate = " + num + ", endRate = " + num2 + "rateListSize = " + (list != null ? Integer.valueOf(list.size()) : null);
    }
}
