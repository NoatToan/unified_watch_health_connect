package com.huami.heartrate.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/heartrate/model/HeartRateSection;", "", "", "component1", "", "component2", "component3", "color", "name", "time", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getColor", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "getTime", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateSection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String time;

    public HeartRateSection(int i, @NotNull String str, @NotNull String str2) {
        this.color = i;
        this.name = str;
        this.time = str2;
    }

    public static /* synthetic */ HeartRateSection copy$default(HeartRateSection heartRateSection, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = heartRateSection.color;
        }
        if ((i2 & 2) != 0) {
            str = heartRateSection.name;
        }
        if ((i2 & 4) != 0) {
            str2 = heartRateSection.time;
        }
        return heartRateSection.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final HeartRateSection copy(int color, @NotNull String name, @NotNull String time) {
        return new HeartRateSection(color, name, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateSection)) {
            return false;
        }
        HeartRateSection heartRateSection = (HeartRateSection) other;
        return this.color == heartRateSection.color && Intrinsics.areEqual(this.name, heartRateSection.name) && Intrinsics.areEqual(this.time, heartRateSection.time);
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.color * 31) + this.name.hashCode()) * 31) + this.time.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeartRateSection(color=" + this.color + ", name=" + this.name + ", time=" + this.time + ")";
    }
}
