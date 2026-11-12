package com.huami.third.googlefit;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/huami/third/googlefit/Workout;", "", "", "toString", "component1", "component2", "", "component3", "component4", "component5", "component6", "", "Lcom/huami/third/googlefit/Data;", "component7", "activity", "name", "startTime", "endTime", "desc", "identifier", "dataList", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getActivity", "()Ljava/lang/String;", "b", "getName", "c", "J", "getStartTime", "()J", GoogleApiAvailabilityLight.a, "getEndTime", "e", "getDesc", "f", "getIdentifier", "g", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class Workout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String identifier;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Data> dataList;

    public Workout(@NotNull String str, @NotNull String str2, long j, long j2, @Nullable String str3, @Nullable String str4, @NotNull List<Data> list) {
        this.activity = str;
        this.name = str2;
        this.startTime = j;
        this.endTime = j2;
        this.desc = str3;
        this.identifier = str4;
        this.dataList = list;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivity() {
        return this.activity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final List<Data> component7() {
        return this.dataList;
    }

    @NotNull
    public final Workout copy(@NotNull String activity, @NotNull String name, long startTime, long endTime, @Nullable String desc, @Nullable String identifier, @NotNull List<Data> dataList) {
        return new Workout(activity, name, startTime, endTime, desc, identifier, dataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Workout)) {
            return false;
        }
        Workout workout = (Workout) other;
        return Intrinsics.areEqual(this.activity, workout.activity) && Intrinsics.areEqual(this.name, workout.name) && this.startTime == workout.startTime && this.endTime == workout.endTime && Intrinsics.areEqual(this.desc, workout.desc) && Intrinsics.areEqual(this.identifier, workout.identifier) && Intrinsics.areEqual(this.dataList, workout.dataList);
    }

    @NotNull
    public final String getActivity() {
        return this.activity;
    }

    @NotNull
    public final List<Data> getDataList() {
        return this.dataList;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.activity;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.startTime;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.endTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.desc;
        int iHashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.identifier;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<Data> list = this.dataList;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Workout(activity='" + this.activity + "', name='" + this.name + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", desc=" + this.desc + ", identifier=" + this.identifier + ", dataList=" + this.dataList + ')';
    }

    public /* synthetic */ Workout(String str, String str2, long j, long j2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, list);
    }
}
