package com.xiaomi.fitness.medal.export.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "", "gotCount", "", "medals", "", "Lcom/xiaomi/fitness/medal/export/data/Medal;", "medal", "<init>", "(ILjava/util/List;Lcom/xiaomi/fitness/medal/export/data/Medal;)V", "getGotCount", "()I", "getMedals", "()Ljava/util/List;", "getMedal", "()Lcom/xiaomi/fitness/medal/export/data/Medal;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedalEntrance {

    @SerializedName("gotCount")
    private final int gotCount;

    @SerializedName("medal")
    @Nullable
    private final Medal medal;

    @SerializedName("medalList")
    @NotNull
    private final List<Medal> medals;

    public MedalEntrance(int i, @NotNull List<Medal> medals, @Nullable Medal medal) {
        Intrinsics.checkNotNullParameter(medals, "medals");
        this.gotCount = i;
        this.medals = medals;
        this.medal = medal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MedalEntrance copy$default(MedalEntrance medalEntrance, int i, List list, Medal medal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = medalEntrance.gotCount;
        }
        if ((i2 & 2) != 0) {
            list = medalEntrance.medals;
        }
        if ((i2 & 4) != 0) {
            medal = medalEntrance.medal;
        }
        return medalEntrance.copy(i, list, medal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGotCount() {
        return this.gotCount;
    }

    @NotNull
    public final List<Medal> component2() {
        return this.medals;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Medal getMedal() {
        return this.medal;
    }

    @NotNull
    public final MedalEntrance copy(int gotCount, @NotNull List<Medal> medals, @Nullable Medal medal) {
        Intrinsics.checkNotNullParameter(medals, "medals");
        return new MedalEntrance(gotCount, medals, medal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalEntrance)) {
            return false;
        }
        MedalEntrance medalEntrance = (MedalEntrance) other;
        return this.gotCount == medalEntrance.gotCount && Intrinsics.areEqual(this.medals, medalEntrance.medals) && Intrinsics.areEqual(this.medal, medalEntrance.medal);
    }

    public final int getGotCount() {
        return this.gotCount;
    }

    @Nullable
    public final Medal getMedal() {
        return this.medal;
    }

    @NotNull
    public final List<Medal> getMedals() {
        return this.medals;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.gotCount) * 31) + this.medals.hashCode()) * 31;
        Medal medal = this.medal;
        return iHashCode + (medal == null ? 0 : medal.hashCode());
    }

    @NotNull
    public String toString() {
        return "MedalEntrance(gotCount=" + this.gotCount + ", medals=" + this.medals + ", medal=" + this.medal + ")";
    }
}
