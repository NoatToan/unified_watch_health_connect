package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import com.huami.watchfacesstore.bean.Topic;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u0002\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002HÆ\u0003J\u001d\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u0002HÆ\u0003J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0002HÆ\u0003Jc\u0010\u000e\u001a\u00020\u00002\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R-\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R-\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R-\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMBodyTemperatureData;", "", "Lkotlin/Pair;", "", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "component1", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "component2", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "component3", "allDay", Topic.TODAY_RECOMMEND, "eightySeconds", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lkotlin/Pair;", "getAllDay", "()Lkotlin/Pair;", "b", "getSingle", "c", "getEightySeconds", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMBodyTemperatureData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Boolean, TemperatureAllDay[]> allDay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Boolean, TemperatureSingle[]> single;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Boolean, Temperature80s[]> eightySeconds;

    public HMBodyTemperatureData(@Nullable Pair<Boolean, TemperatureAllDay[]> pair, @Nullable Pair<Boolean, TemperatureSingle[]> pair2, @Nullable Pair<Boolean, Temperature80s[]> pair3) {
        this.allDay = pair;
        this.single = pair2;
        this.eightySeconds = pair3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMBodyTemperatureData copy$default(HMBodyTemperatureData hMBodyTemperatureData, Pair pair, Pair pair2, Pair pair3, int i, Object obj) {
        if ((i & 1) != 0) {
            pair = hMBodyTemperatureData.allDay;
        }
        if ((i & 2) != 0) {
            pair2 = hMBodyTemperatureData.single;
        }
        if ((i & 4) != 0) {
            pair3 = hMBodyTemperatureData.eightySeconds;
        }
        return hMBodyTemperatureData.copy(pair, pair2, pair3);
    }

    @Nullable
    public final Pair<Boolean, TemperatureAllDay[]> component1() {
        return this.allDay;
    }

    @Nullable
    public final Pair<Boolean, TemperatureSingle[]> component2() {
        return this.single;
    }

    @Nullable
    public final Pair<Boolean, Temperature80s[]> component3() {
        return this.eightySeconds;
    }

    @NotNull
    public final HMBodyTemperatureData copy(@Nullable Pair<Boolean, TemperatureAllDay[]> allDay, @Nullable Pair<Boolean, TemperatureSingle[]> single, @Nullable Pair<Boolean, Temperature80s[]> eightySeconds) {
        return new HMBodyTemperatureData(allDay, single, eightySeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMBodyTemperatureData)) {
            return false;
        }
        HMBodyTemperatureData hMBodyTemperatureData = (HMBodyTemperatureData) other;
        return Intrinsics.areEqual(this.allDay, hMBodyTemperatureData.allDay) && Intrinsics.areEqual(this.single, hMBodyTemperatureData.single) && Intrinsics.areEqual(this.eightySeconds, hMBodyTemperatureData.eightySeconds);
    }

    @Nullable
    public final Pair<Boolean, TemperatureAllDay[]> getAllDay() {
        return this.allDay;
    }

    @Nullable
    public final Pair<Boolean, Temperature80s[]> getEightySeconds() {
        return this.eightySeconds;
    }

    @Nullable
    public final Pair<Boolean, TemperatureSingle[]> getSingle() {
        return this.single;
    }

    public int hashCode() {
        Pair<Boolean, TemperatureAllDay[]> pair = this.allDay;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair<Boolean, TemperatureSingle[]> pair2 = this.single;
        int iHashCode2 = (iHashCode + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        Pair<Boolean, Temperature80s[]> pair3 = this.eightySeconds;
        return iHashCode2 + (pair3 != null ? pair3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HMBodyTemperatureData(allDay=" + this.allDay + ", single=" + this.single + ", eightySeconds=" + this.eightySeconds + ')';
    }
}
