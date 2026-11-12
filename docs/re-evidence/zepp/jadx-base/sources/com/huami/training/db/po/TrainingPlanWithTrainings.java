package com.huami.training.db.po;

import androidx.room.Embedded;
import androidx.room.Ignore;
import androidx.room.Relation;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0007X\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/training/db/po/TrainingPlanWithTrainings;", "", "", "Lcom/huami/training/db/po/PlanTraining;", "a", "Lcom/huami/training/db/po/TrainingPlan;", "component1", "plan", "_trainings", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/training/db/po/TrainingPlan;", "getPlan", "()Lcom/huami/training/db/po/TrainingPlan;", "b", "Ljava/util/List;", "c", "Lkotlin/Lazy;", "getTrainings", "()Ljava/util/List;", "trainings", "<init>", "(Lcom/huami/training/db/po/TrainingPlan;Ljava/util/List;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TrainingPlanWithTrainings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Embedded
    @NotNull
    private final TrainingPlan plan;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Relation(entityColumn = BloodPressureConst.ParamKey.PLANID, parentColumn = "id")
    @NotNull
    private final List<PlanTraining> _trainings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Ignore
    @NotNull
    private final Lazy trainings = LazyKt__LazyJVMKt.lazy(new Function0<List<? extends PlanTraining>>() { // from class: com.huami.training.db.po.TrainingPlanWithTrainings$trainings$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends PlanTraining> invoke() {
            return CollectionsKt___CollectionsKt.sortedWith(this.a._trainings, new Comparator<T>() { // from class: com.huami.training.db.po.TrainingPlanWithTrainings$trainings$2$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((PlanTraining) t).getDayIndex()), Integer.valueOf(((PlanTraining) t2).getDayIndex()));
                }
            });
        }
    });

    public TrainingPlanWithTrainings(@NotNull TrainingPlan trainingPlan, @NotNull List<PlanTraining> list) {
        this.plan = trainingPlan;
        this._trainings = list;
    }

    private final List<PlanTraining> a() {
        return this._trainings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrainingPlanWithTrainings copy$default(TrainingPlanWithTrainings trainingPlanWithTrainings, TrainingPlan trainingPlan, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            trainingPlan = trainingPlanWithTrainings.plan;
        }
        if ((i & 2) != 0) {
            list = trainingPlanWithTrainings._trainings;
        }
        return trainingPlanWithTrainings.copy(trainingPlan, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TrainingPlan getPlan() {
        return this.plan;
    }

    @NotNull
    public final TrainingPlanWithTrainings copy(@NotNull TrainingPlan plan, @NotNull List<PlanTraining> _trainings) {
        return new TrainingPlanWithTrainings(plan, _trainings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanWithTrainings)) {
            return false;
        }
        TrainingPlanWithTrainings trainingPlanWithTrainings = (TrainingPlanWithTrainings) other;
        return Intrinsics.areEqual(this.plan, trainingPlanWithTrainings.plan) && Intrinsics.areEqual(this._trainings, trainingPlanWithTrainings._trainings);
    }

    @NotNull
    public final TrainingPlan getPlan() {
        return this.plan;
    }

    @NotNull
    public final List<PlanTraining> getTrainings() {
        return (List) this.trainings.getValue();
    }

    public int hashCode() {
        return (this.plan.hashCode() * 31) + this._trainings.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrainingPlanWithTrainings(plan=" + this.plan + ", _trainings=" + this._trainings + ')';
    }
}
