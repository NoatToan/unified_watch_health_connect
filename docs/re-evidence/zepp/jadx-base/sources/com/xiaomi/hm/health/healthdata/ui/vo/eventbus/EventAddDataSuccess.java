package com.xiaomi.hm.health.healthdata.ui.vo.eventbus;

import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/eventbus/EventAddDataSuccess;", "", "", "component1", "time", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "<init>", "(J)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EventAddDataSuccess {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    public EventAddDataSuccess(long j) {
        this.time = j;
    }

    public static /* synthetic */ EventAddDataSuccess copy$default(EventAddDataSuccess eventAddDataSuccess, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eventAddDataSuccess.time;
        }
        return eventAddDataSuccess.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final EventAddDataSuccess copy(long time) {
        return new EventAddDataSuccess(time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventAddDataSuccess) && this.time == ((EventAddDataSuccess) other).time;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return b.a(this.time);
    }

    @NotNull
    public String toString() {
        return "EventAddDataSuccess(time=" + this.time + ")";
    }
}
