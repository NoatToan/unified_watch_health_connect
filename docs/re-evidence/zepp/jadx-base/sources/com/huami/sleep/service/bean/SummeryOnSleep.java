package com.huami.sleep.service.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/sleep/service/bean/SummeryOnSleep;", "", "Lcom/huami/sleep/service/bean/Slp;", "component1", "slp", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/sleep/service/bean/Slp;", "getSlp", "()Lcom/huami/sleep/service/bean/Slp;", "<init>", "(Lcom/huami/sleep/service/bean/Slp;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SummeryOnSleep {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("slp")
    @NotNull
    private final Slp slp;

    /* JADX WARN: Multi-variable type inference failed */
    public SummeryOnSleep() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SummeryOnSleep(@NotNull Slp slp) {
        this.slp = slp;
    }

    public static /* synthetic */ SummeryOnSleep copy$default(SummeryOnSleep summeryOnSleep, Slp slp, int i, Object obj) {
        if ((i & 1) != 0) {
            slp = summeryOnSleep.slp;
        }
        return summeryOnSleep.copy(slp);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Slp getSlp() {
        return this.slp;
    }

    @NotNull
    public final SummeryOnSleep copy(@NotNull Slp slp) {
        return new SummeryOnSleep(slp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SummeryOnSleep) && Intrinsics.areEqual(this.slp, ((SummeryOnSleep) other).slp);
    }

    @NotNull
    public final Slp getSlp() {
        return this.slp;
    }

    public int hashCode() {
        return this.slp.hashCode();
    }

    @NotNull
    public String toString() {
        return "SummeryOnSleep(slp=" + this.slp + ")";
    }

    public /* synthetic */ SummeryOnSleep(Slp slp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Slp(0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, 4095, null) : slp);
    }
}
