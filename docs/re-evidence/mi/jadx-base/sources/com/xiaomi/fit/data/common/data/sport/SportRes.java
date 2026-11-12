package com.xiaomi.fit.data.common.data.sport;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/SportRes;", "", "name", "", "icon", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getIcon", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRes {
    private final int icon;

    @NotNull
    private final String name;

    public SportRes(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.icon = i;
    }

    public static /* synthetic */ SportRes copy$default(SportRes sportRes, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sportRes.name;
        }
        if ((i2 & 2) != 0) {
            i = sportRes.icon;
        }
        return sportRes.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final SportRes copy(@NotNull String name, int icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SportRes(name, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRes)) {
            return false;
        }
        SportRes sportRes = (SportRes) other;
        return Intrinsics.areEqual(this.name, sportRes.name) && this.icon == sportRes.icon;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Integer.hashCode(this.icon);
    }

    @NotNull
    public String toString() {
        return "SportRes(name=" + this.name + ", icon=" + this.icon + ")";
    }
}
