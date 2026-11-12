package com.huami.phn.coach.usecase.impl;

import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.usecase.PlanDetailUseCase;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/PlanDetailUseCaseImpl;", "Lcom/huami/phn/coach/usecase/PlanDetailUseCase;", "", "id", "Lcom/huami/phn/coach/usecase/PlanDetail;", PointCategory.LOAD, "(Ljava/lang/Long;)Lcom/huami/phn/coach/usecase/PlanDetail;", "Lcom/huami/phn/core/source/LocalDataSource;", "a", "Lcom/huami/phn/core/source/LocalDataSource;", "localDataSource", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PlanDetailUseCaseImpl implements PlanDetailUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource localDataSource;

    public PlanDetailUseCaseImpl(@NotNull LocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override // com.huami.phn.coach.usecase.PlanDetailUseCase
    @Nullable
    public PlanDetail load(@Nullable Long id) {
        PHNProjectRecord pHNProjectRecordQueryProject = id == null ? (PHNProjectRecord) CollectionsKt.firstOrNull((List) this.localDataSource.queryProject(1, null)) : this.localDataSource.queryProject(id.longValue());
        if (pHNProjectRecordQueryProject == null) {
            return null;
        }
        return PHNProjectRecordKt.toPlanDetail(pHNProjectRecordQueryProject);
    }
}
