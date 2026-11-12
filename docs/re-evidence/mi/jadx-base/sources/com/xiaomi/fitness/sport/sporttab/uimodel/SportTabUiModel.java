package com.xiaomi.fitness.sport.sporttab.uimodel;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.c1j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\t\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "", "position", "", "label", "", "<init>", "(ILjava/lang/String;)V", "getPosition", "()I", "getLabel", "()Ljava/lang/String;", "toString", "SportRecordCard", "BannerListUiModel", "TrainingIndicatorUiModel", "RunningRouteUiModel", "RecommendationCourseListUiModel", "RecommendationCourseListOldUiModel", "JustDanceUIModel", "TrainingPlanUIModel", "RunningGroupUiModel", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$BannerListUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$JustDanceUIModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RecommendationCourseListOldUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RecommendationCourseListUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RunningGroupUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RunningRouteUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$SportRecordCard;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$TrainingIndicatorUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$TrainingPlanUIModel;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportTabUiModel {

    @NotNull
    private final String label;
    private final int position;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$BannerListUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "position", "", "label", "", "<init>", "(ILjava/lang/String;)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BannerListUiModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public BannerListUiModel() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return super.toString();
        }

        public /* synthetic */ BannerListUiModel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerListUiModel(int i, @NotNull String label) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$JustDanceUIModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "label", "", "position", "", "<init>", "(Ljava/lang/String;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JustDanceUIModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public JustDanceUIModel() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ JustDanceUIModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ResourceExtKt.getString(c1j.s) : str, (i2 & 2) != 0 ? 5 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JustDanceUIModel(@NotNull String label, int i) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RecommendationCourseListOldUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "label", "", "position", "", "<init>", "(Ljava/lang/String;I)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecommendationCourseListOldUiModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public RecommendationCourseListOldUiModel() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return "CourseRecommendationListUiModel=" + super.toString();
        }

        public /* synthetic */ RecommendationCourseListOldUiModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 7 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationCourseListOldUiModel(@NotNull String label, int i) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RecommendationCourseListUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "label", "", "position", "", "<init>", "(Ljava/lang/String;I)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecommendationCourseListUiModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public RecommendationCourseListUiModel() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return "CourseRecommendationListUiModel=" + super.toString();
        }

        public /* synthetic */ RecommendationCourseListUiModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 3 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationCourseListUiModel(@NotNull String label, int i) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RunningGroupUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "label", "", "position", "", "<init>", "(Ljava/lang/String;I)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RunningGroupUiModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public RunningGroupUiModel() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return "CourseRecommendationListUiModel=" + super.toString();
        }

        public /* synthetic */ RunningGroupUiModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 8 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RunningGroupUiModel(@NotNull String label, int i) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$RunningRouteUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "position", "", "label", "", "<init>", "(ILjava/lang/String;)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RunningRouteUiModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public RunningRouteUiModel() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return "RunningRouteUiModel=" + super.toString();
        }

        public /* synthetic */ RunningRouteUiModel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? ResourceExtKt.getString(c1j.e4) : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RunningRouteUiModel(int i, @NotNull String label) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel$SportRecordCard, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$SportRecordCard;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "position", "", "label", "", "<init>", "(ILjava/lang/String;)V", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setSportReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SportRecordSportTabUiModel extends SportTabUiModel {

        @Nullable
        private SportBasicReport sportReport;

        /* JADX WARN: Multi-variable type inference failed */
        public SportRecordSportTabUiModel() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        @Nullable
        public final SportBasicReport getSportReport() {
            return this.sportReport;
        }

        public final void setSportReport(@Nullable SportBasicReport sportBasicReport) {
            this.sportReport = sportBasicReport;
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return "SportRecordSportTabUiModel(sportReport=" + this.sportReport + ")";
        }

        public /* synthetic */ SportRecordSportTabUiModel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? ResourceExtKt.getString(c1j.N4) : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportRecordSportTabUiModel(int i, @NotNull String label) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$TrainingIndicatorUiModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "position", "", "label", "", "<init>", "(ILjava/lang/String;)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrainingIndicatorUiModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public TrainingIndicatorUiModel() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel
        @NotNull
        public String toString() {
            return "TrainingIndicator=" + super.toString();
        }

        public /* synthetic */ TrainingIndicatorUiModel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? ResourceExtKt.getString(c1j.j5) : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrainingIndicatorUiModel(int i, @NotNull String label) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$TrainingPlanUIModel;", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "label", "", "position", "", "<init>", "(Ljava/lang/String;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrainingPlanUIModel extends SportTabUiModel {
        /* JADX WARN: Multi-variable type inference failed */
        public TrainingPlanUIModel() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TrainingPlanUIModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "x训练计划" : str, (i2 & 2) != 0 ? 6 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrainingPlanUIModel(@NotNull String label, int i) {
            super(i, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }

    public /* synthetic */ SportTabUiModel(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public String toString() {
        return "SportTabUiModel(position=" + this.position + ", label='" + this.label + "')";
    }

    private SportTabUiModel(int i, String str) {
        this.position = i;
        this.label = str;
    }
}
