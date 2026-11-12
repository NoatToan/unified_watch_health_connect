package com.xiaomi.fitness.share.amap.moments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/share/amap/moments/MomentData;", "", "name", "", "img", "", "bg", "<init>", "(Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getImg", "()I", "getBg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MomentData {
    private final int bg;
    private final int img;

    @NotNull
    private final String name;

    public MomentData(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.img = i;
        this.bg = i2;
    }

    public static /* synthetic */ MomentData copy$default(MomentData momentData, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = momentData.name;
        }
        if ((i3 & 2) != 0) {
            i = momentData.img;
        }
        if ((i3 & 4) != 0) {
            i2 = momentData.bg;
        }
        return momentData.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getImg() {
        return this.img;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBg() {
        return this.bg;
    }

    @NotNull
    public final MomentData copy(@NotNull String name, int img, int bg) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MomentData(name, img, bg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentData)) {
            return false;
        }
        MomentData momentData = (MomentData) other;
        return Intrinsics.areEqual(this.name, momentData.name) && this.img == momentData.img && this.bg == momentData.bg;
    }

    public final int getBg() {
        return this.bg;
    }

    public final int getImg() {
        return this.img;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.img)) * 31) + Integer.hashCode(this.bg);
    }

    @NotNull
    public String toString() {
        return "MomentData(name=" + this.name + ", img=" + this.img + ", bg=" + this.bg + ")";
    }
}
