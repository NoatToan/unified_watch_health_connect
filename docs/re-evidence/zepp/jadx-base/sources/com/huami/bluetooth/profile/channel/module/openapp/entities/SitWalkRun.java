package com.huami.bluetooth.profile.channel.module.openapp.entities;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "timeRun", "timeFastWalk", "timeSit", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getTimeRun", "()I", "b", "getTimeFastWalk", "c", "getTimeSit", "<init>", "(III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SitWalkRun implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int timeRun;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int timeFastWalk;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int timeSit;

    public SitWalkRun(int i, int i2, int i3) {
        this.timeRun = i;
        this.timeFastWalk = i2;
        this.timeSit = i3;
    }

    public static /* synthetic */ SitWalkRun copy$default(SitWalkRun sitWalkRun, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sitWalkRun.timeRun;
        }
        if ((i4 & 2) != 0) {
            i2 = sitWalkRun.timeFastWalk;
        }
        if ((i4 & 4) != 0) {
            i3 = sitWalkRun.timeSit;
        }
        return sitWalkRun.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimeRun() {
        return this.timeRun;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeFastWalk() {
        return this.timeFastWalk;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeSit() {
        return this.timeSit;
    }

    @NotNull
    public final SitWalkRun copy(int timeRun, int timeFastWalk, int timeSit) {
        return new SitWalkRun(timeRun, timeFastWalk, timeSit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SitWalkRun)) {
            return false;
        }
        SitWalkRun sitWalkRun = (SitWalkRun) other;
        return this.timeRun == sitWalkRun.timeRun && this.timeFastWalk == sitWalkRun.timeFastWalk && this.timeSit == sitWalkRun.timeSit;
    }

    public final int getTimeFastWalk() {
        return this.timeFastWalk;
    }

    public final int getTimeRun() {
        return this.timeRun;
    }

    public final int getTimeSit() {
        return this.timeSit;
    }

    public int hashCode() {
        return (((this.timeRun * 31) + this.timeFastWalk) * 31) + this.timeSit;
    }

    @NotNull
    public String toString() {
        return "SitWalkRun(timeRun=" + this.timeRun + ", timeFastWalk=" + this.timeFastWalk + ", timeSit=" + this.timeSit + ')';
    }
}
