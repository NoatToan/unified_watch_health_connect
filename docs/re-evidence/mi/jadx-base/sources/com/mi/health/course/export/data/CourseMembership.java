package com.mi.health.course.export.data;

import com.xiaomi.fitness.baseui.recyclerview.StateData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J6\u0010\u0013\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R'\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/mi/health/course/export/data/CourseMembership;", "", "membership", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/OpenVipModel;", "Ljava/util/ArrayList;", "status", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "<init>", "(Ljava/util/ArrayList;Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;)V", "getMembership", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getStatus", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "setStatus", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;)V", "component1", "component2", "copy", "(Ljava/util/ArrayList;Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;)Lcom/mi/health/course/export/data/CourseMembership;", "equals", "", "other", "hashCode", "", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseMembership {

    @Nullable
    private final ArrayList<OpenVipModel> membership;

    @NotNull
    private StateData.Status status;

    public CourseMembership(@Nullable ArrayList<OpenVipModel> arrayList, @NotNull StateData.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.membership = arrayList;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseMembership copy$default(CourseMembership courseMembership, ArrayList arrayList, StateData.Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = courseMembership.membership;
        }
        if ((i & 2) != 0) {
            status = courseMembership.status;
        }
        return courseMembership.copy(arrayList, status);
    }

    @Nullable
    public final ArrayList<OpenVipModel> component1() {
        return this.membership;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StateData.Status getStatus() {
        return this.status;
    }

    @NotNull
    public final CourseMembership copy(@Nullable ArrayList<OpenVipModel> membership, @NotNull StateData.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new CourseMembership(membership, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseMembership)) {
            return false;
        }
        CourseMembership courseMembership = (CourseMembership) other;
        return Intrinsics.areEqual(this.membership, courseMembership.membership) && this.status == courseMembership.status;
    }

    @Nullable
    public final ArrayList<OpenVipModel> getMembership() {
        return this.membership;
    }

    @NotNull
    public final StateData.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        ArrayList<OpenVipModel> arrayList = this.membership;
        return ((arrayList == null ? 0 : arrayList.hashCode()) * 31) + this.status.hashCode();
    }

    public final void setStatus(@NotNull StateData.Status status) {
        Intrinsics.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    @NotNull
    public String toString() {
        return "CourseMembership(membership=" + this.membership + ", status=" + this.status + ")";
    }
}
