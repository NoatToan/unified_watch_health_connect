package com.xiaomi.fitness.sleep.behavior.analyze.core;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Events;", "", "dreamTalk", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Score;", "snoring", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getDreamTalk", "()Ljava/util/List;", "setDreamTalk", "(Ljava/util/List;)V", "getSnoring", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Events {

    @SerializedName("Dream talk")
    @NotNull
    private List<Score> dreamTalk;

    @SerializedName("Snoring")
    @NotNull
    private final List<Score> snoring;

    public Events(@NotNull List<Score> dreamTalk, @NotNull List<Score> snoring) {
        Intrinsics.checkNotNullParameter(dreamTalk, "dreamTalk");
        Intrinsics.checkNotNullParameter(snoring, "snoring");
        this.dreamTalk = dreamTalk;
        this.snoring = snoring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Events copy$default(Events events, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = events.dreamTalk;
        }
        if ((i & 2) != 0) {
            list2 = events.snoring;
        }
        return events.copy(list, list2);
    }

    @NotNull
    public final List<Score> component1() {
        return this.dreamTalk;
    }

    @NotNull
    public final List<Score> component2() {
        return this.snoring;
    }

    @NotNull
    public final Events copy(@NotNull List<Score> dreamTalk, @NotNull List<Score> snoring) {
        Intrinsics.checkNotNullParameter(dreamTalk, "dreamTalk");
        Intrinsics.checkNotNullParameter(snoring, "snoring");
        return new Events(dreamTalk, snoring);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Events)) {
            return false;
        }
        Events events = (Events) other;
        return Intrinsics.areEqual(this.dreamTalk, events.dreamTalk) && Intrinsics.areEqual(this.snoring, events.snoring);
    }

    @NotNull
    public final List<Score> getDreamTalk() {
        return this.dreamTalk;
    }

    @NotNull
    public final List<Score> getSnoring() {
        return this.snoring;
    }

    public int hashCode() {
        return (this.dreamTalk.hashCode() * 31) + this.snoring.hashCode();
    }

    public final void setDreamTalk(@NotNull List<Score> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dreamTalk = list;
    }

    @NotNull
    public String toString() {
        return "Events(dreamTalk=" + this.dreamTalk + ", snoring=" + this.snoring + ")";
    }
}
