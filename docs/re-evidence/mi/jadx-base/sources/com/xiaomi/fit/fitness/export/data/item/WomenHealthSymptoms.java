package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationHp;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationMood;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationPain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "hp", "", "mood", "pain", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(J)V", "getTime", "()J", "setTime", "getHp", "()Ljava/lang/Integer;", "setHp", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMood", "setMood", "getPain", "setPain", "getTimestamp", "setTimestamp", "", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WomenHealthSymptoms extends DailyRecordItem {

    @SerializedName("hp")
    @Nullable
    private Integer hp;

    @SerializedName("mood")
    @Nullable
    private Integer mood;

    @SerializedName("pain")
    @Nullable
    private Integer pain;

    @SerializedName("date_time")
    private long time;

    public WomenHealthSymptoms(long j, @MenstruationHp @Nullable Integer num, @MenstruationMood @Nullable Integer num2, @MenstruationPain @Nullable Integer num3) {
        super(null);
        this.time = j;
        this.hp = num;
        this.mood = num2;
        this.pain = num3;
    }

    public static /* synthetic */ WomenHealthSymptoms copy$default(WomenHealthSymptoms womenHealthSymptoms, long j, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = womenHealthSymptoms.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            num = womenHealthSymptoms.hp;
        }
        Integer num4 = num;
        if ((i & 4) != 0) {
            num2 = womenHealthSymptoms.mood;
        }
        Integer num5 = num2;
        if ((i & 8) != 0) {
            num3 = womenHealthSymptoms.pain;
        }
        return womenHealthSymptoms.copy(j2, num4, num5, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHp() {
        return this.hp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMood() {
        return this.mood;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPain() {
        return this.pain;
    }

    @NotNull
    public final WomenHealthSymptoms copy(long time, @MenstruationHp @Nullable Integer hp, @MenstruationMood @Nullable Integer mood, @MenstruationPain @Nullable Integer pain) {
        return new WomenHealthSymptoms(time, hp, mood, pain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WomenHealthSymptoms)) {
            return false;
        }
        WomenHealthSymptoms womenHealthSymptoms = (WomenHealthSymptoms) other;
        return this.time == womenHealthSymptoms.time && Intrinsics.areEqual(this.hp, womenHealthSymptoms.hp) && Intrinsics.areEqual(this.mood, womenHealthSymptoms.mood) && Intrinsics.areEqual(this.pain, womenHealthSymptoms.pain);
    }

    @Nullable
    public final Integer getHp() {
        return this.hp;
    }

    @Nullable
    public final Integer getMood() {
        return this.mood;
    }

    @Nullable
    public final Integer getPain() {
        return this.pain;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        Integer num = this.hp;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mood;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pain;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setHp(@Nullable Integer num) {
        this.hp = num;
    }

    public final void setMood(@Nullable Integer num) {
        this.mood = num;
    }

    public final void setPain(@Nullable Integer num) {
        this.pain = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "WomenHealthSymptoms(time=" + this.time + ", hp=" + this.hp + ", mood=" + this.mood + ", pain=" + this.pain + ")";
    }

    public WomenHealthSymptoms(long j) {
        this(j, null, null, null);
    }
}
