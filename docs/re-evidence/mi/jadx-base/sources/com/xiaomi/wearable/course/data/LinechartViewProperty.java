package com.xiaomi.wearable.course.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R#\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/wearable/course/data/LinechartViewProperty;", "", "recommendList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/wearable/course/data/LinechartDataEntity;", "Ljava/util/ArrayList;", "type", "", "maxValueX", "", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;I)V", "getRecommendList", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getType", "()Ljava/lang/String;", "getMaxValueX", "()I", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;I)Lcom/xiaomi/wearable/course/data/LinechartViewProperty;", "equals", "", "other", "hashCode", "toString", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LinechartViewProperty {
    private final int maxValueX;

    @NotNull
    private final ArrayList<LinechartDataEntity> recommendList;

    @NotNull
    private final String type;

    public LinechartViewProperty(@NotNull ArrayList<LinechartDataEntity> recommendList, @NotNull String type, int i) {
        Intrinsics.checkNotNullParameter(recommendList, "recommendList");
        Intrinsics.checkNotNullParameter(type, "type");
        this.recommendList = recommendList;
        this.type = type;
        this.maxValueX = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinechartViewProperty copy$default(LinechartViewProperty linechartViewProperty, ArrayList arrayList, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = linechartViewProperty.recommendList;
        }
        if ((i2 & 2) != 0) {
            str = linechartViewProperty.type;
        }
        if ((i2 & 4) != 0) {
            i = linechartViewProperty.maxValueX;
        }
        return linechartViewProperty.copy(arrayList, str, i);
    }

    @NotNull
    public final ArrayList<LinechartDataEntity> component1() {
        return this.recommendList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxValueX() {
        return this.maxValueX;
    }

    @NotNull
    public final LinechartViewProperty copy(@NotNull ArrayList<LinechartDataEntity> recommendList, @NotNull String type, int maxValueX) {
        Intrinsics.checkNotNullParameter(recommendList, "recommendList");
        Intrinsics.checkNotNullParameter(type, "type");
        return new LinechartViewProperty(recommendList, type, maxValueX);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinechartViewProperty)) {
            return false;
        }
        LinechartViewProperty linechartViewProperty = (LinechartViewProperty) other;
        return Intrinsics.areEqual(this.recommendList, linechartViewProperty.recommendList) && Intrinsics.areEqual(this.type, linechartViewProperty.type) && this.maxValueX == linechartViewProperty.maxValueX;
    }

    public final int getMaxValueX() {
        return this.maxValueX;
    }

    @NotNull
    public final ArrayList<LinechartDataEntity> getRecommendList() {
        return this.recommendList;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.recommendList.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.maxValueX);
    }

    @NotNull
    public String toString() {
        return "LinechartViewProperty(recommendList=" + this.recommendList + ", type=" + this.type + ", maxValueX=" + this.maxValueX + ")";
    }

    public /* synthetic */ LinechartViewProperty(ArrayList arrayList, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i2 & 2) != 0 ? "" : str, i);
    }
}
