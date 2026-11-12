package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.databases.model.HeartRate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/eventbus/EventHeartRateSync;", "", "", "Lcom/xiaomi/hm/health/databases/model/HeartRate;", "component1", "heartRateList", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getHeartRateList", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EventHeartRateSync {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<HeartRate> heartRateList;

    /* JADX WARN: Multi-variable type inference failed */
    public EventHeartRateSync(@NotNull List<? extends HeartRate> list) {
        this.heartRateList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventHeartRateSync copy$default(EventHeartRateSync eventHeartRateSync, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventHeartRateSync.heartRateList;
        }
        return eventHeartRateSync.copy(list);
    }

    @NotNull
    public final List<HeartRate> component1() {
        return this.heartRateList;
    }

    @NotNull
    public final EventHeartRateSync copy(@NotNull List<? extends HeartRate> heartRateList) {
        return new EventHeartRateSync(heartRateList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventHeartRateSync) && Intrinsics.areEqual(this.heartRateList, ((EventHeartRateSync) other).heartRateList);
    }

    @NotNull
    public final List<HeartRate> getHeartRateList() {
        return this.heartRateList;
    }

    public int hashCode() {
        return this.heartRateList.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventHeartRateSync(heartRateList=" + this.heartRateList + ")";
    }
}
