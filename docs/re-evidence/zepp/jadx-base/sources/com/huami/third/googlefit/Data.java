package com.huami.third.googlefit;

import com.google.android.gms.fitness.data.DataType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/third/googlefit/Data;", "", "", "toString", "Lcom/google/android/gms/fitness/data/DataType;", "component1", "component2", "", "Lcom/huami/third/googlefit/Segment;", "component3", "dataType", "name", "segments", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/google/android/gms/fitness/data/DataType;", "getDataType", "()Lcom/google/android/gms/fitness/data/DataType;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Ljava/util/List;", "getSegments", "()Ljava/util/List;", "<init>", "(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;Ljava/util/List;)V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class Data {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DataType dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Segment> segments;

    public Data(@NotNull DataType dataType, @NotNull String str, @NotNull List<Segment> list) {
        this.dataType = dataType;
        this.name = str;
        this.segments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, DataType dataType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            dataType = data.dataType;
        }
        if ((i & 2) != 0) {
            str = data.name;
        }
        if ((i & 4) != 0) {
            list = data.segments;
        }
        return data.copy(dataType, str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataType getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Segment> component3() {
        return this.segments;
    }

    @NotNull
    public final Data copy(@NotNull DataType dataType, @NotNull String name, @NotNull List<Segment> segments) {
        return new Data(dataType, name, segments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.dataType, data.dataType) && Intrinsics.areEqual(this.name, data.name) && Intrinsics.areEqual(this.segments, data.segments);
    }

    @NotNull
    public final DataType getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Segment> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        DataType dataType = this.dataType;
        int iHashCode = (dataType != null ? dataType.hashCode() : 0) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<Segment> list = this.segments;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Data(dataType=" + this.dataType + ", name='" + this.name + "', segments=" + this.segments + ')';
    }
}
