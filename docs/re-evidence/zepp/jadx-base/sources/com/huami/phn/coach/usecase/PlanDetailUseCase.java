package com.huami.phn.coach.usecase;

import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetailUseCase;", "", "", "id", "Lcom/huami/phn/coach/usecase/PlanDetail;", PointCategory.LOAD, "(Ljava/lang/Long;)Lcom/huami/phn/coach/usecase/PlanDetail;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface PlanDetailUseCase {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PlanDetail load$default(PlanDetailUseCase planDetailUseCase, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 1) != 0) {
                l = null;
            }
            return planDetailUseCase.load(l);
        }
    }

    @Nullable
    PlanDetail load(@Nullable Long id);
}
