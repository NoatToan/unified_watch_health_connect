package com.xiaomi.fitness.repo.sleep.net;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/net/SleepDistributeResult;", "", "map", "", "", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDistributeResult {

    @SerializedName("sleep_score_user_distribute")
    @Nullable
    private final Map<Integer, Integer> map;

    public SleepDistributeResult(@Nullable Map<Integer, Integer> map) {
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepDistributeResult copy$default(SleepDistributeResult sleepDistributeResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = sleepDistributeResult.map;
        }
        return sleepDistributeResult.copy(map);
    }

    @Nullable
    public final Map<Integer, Integer> component1() {
        return this.map;
    }

    @NotNull
    public final SleepDistributeResult copy(@Nullable Map<Integer, Integer> map) {
        return new SleepDistributeResult(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SleepDistributeResult) && Intrinsics.areEqual(this.map, ((SleepDistributeResult) other).map);
    }

    @Nullable
    public final Map<Integer, Integer> getMap() {
        return this.map;
    }

    public int hashCode() {
        Map<Integer, Integer> map = this.map;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepDistributeResult(map=" + this.map + ")";
    }
}
