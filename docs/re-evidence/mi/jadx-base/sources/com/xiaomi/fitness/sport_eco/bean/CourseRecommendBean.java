package com.xiaomi.fitness.sport_eco.bean;

import com.mi.health.course.export.data.CourseModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/bean/CourseRecommendBean;", "Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "list", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "jumpScene", "", "jumpTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getList", "()Ljava/util/List;", "getJumpScene", "()Ljava/lang/String;", "getJumpTitle", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseRecommendBean extends BaseSportItemBean {

    @Nullable
    private final String jumpScene;

    @Nullable
    private final String jumpTitle;

    @NotNull
    private final List<CourseModel.CourseData> list;

    public CourseRecommendBean(@NotNull List<CourseModel.CourseData> list, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.jumpScene = str;
        this.jumpTitle = str2;
    }

    @Nullable
    public final String getJumpScene() {
        return this.jumpScene;
    }

    @Nullable
    public final String getJumpTitle() {
        return this.jumpTitle;
    }

    @NotNull
    public final List<CourseModel.CourseData> getList() {
        return this.list;
    }

    public /* synthetic */ CourseRecommendBean(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : str2);
    }
}
