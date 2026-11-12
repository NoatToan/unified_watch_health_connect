package com.mi.health.course.vm;

import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/mi/health/course/vm/FeedData;", "", "data", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "morePage", "", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;Z)V", "getData", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "getMorePage", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedData {

    @NotNull
    private final StateData<List<CourseModel.CourseData>> data;
    private final boolean morePage;

    public FeedData(@NotNull StateData<List<CourseModel.CourseData>> data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.morePage = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedData copy$default(FeedData feedData, StateData stateData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stateData = feedData.data;
        }
        if ((i & 2) != 0) {
            z = feedData.morePage;
        }
        return feedData.copy(stateData, z);
    }

    @NotNull
    public final StateData<List<CourseModel.CourseData>> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMorePage() {
        return this.morePage;
    }

    @NotNull
    public final FeedData copy(@NotNull StateData<List<CourseModel.CourseData>> data, boolean morePage) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new FeedData(data, morePage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedData)) {
            return false;
        }
        FeedData feedData = (FeedData) other;
        return Intrinsics.areEqual(this.data, feedData.data) && this.morePage == feedData.morePage;
    }

    @NotNull
    public final StateData<List<CourseModel.CourseData>> getData() {
        return this.data;
    }

    public final boolean getMorePage() {
        return this.morePage;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Boolean.hashCode(this.morePage);
    }

    @NotNull
    public String toString() {
        return "FeedData(data=" + this.data + ", morePage=" + this.morePage + ")";
    }
}
