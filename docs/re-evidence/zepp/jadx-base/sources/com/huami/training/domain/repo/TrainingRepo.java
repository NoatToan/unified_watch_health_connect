package com.huami.training.domain.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.android.vo.Resource;
import com.huami.training.domain.model.DomainTrainingType;
import com.huami.training.domain.model.TrainingVo;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/training/domain/repo/TrainingRepo;", "", "", "size", "", "tag", "", "Lcom/huami/training/domain/model/DomainTrainingType;", "trainingTypes", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "Lcom/huami/training/domain/model/TrainingVo;", "getFemaleRecommendTrainings", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)Landroidx/lifecycle/LiveData;", "com.huami.training.domain"}, k = 1, mv = {1, 5, 1})
public interface TrainingRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData getFemaleRecommendTrainings$default(TrainingRepo trainingRepo, Integer num, String str, Set set, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFemaleRecommendTrainings");
            }
            if ((i & 1) != 0) {
                num = 2;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return trainingRepo.getFemaleRecommendTrainings(num, str, set);
        }
    }

    @NotNull
    LiveData<Resource<List<TrainingVo>>> getFemaleRecommendTrainings(@Nullable Integer size, @Nullable String tag, @NotNull Set<? extends DomainTrainingType> trainingTypes);
}
