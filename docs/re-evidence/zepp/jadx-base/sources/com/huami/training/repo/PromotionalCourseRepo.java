package com.huami.training.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.facebook.appevents.UserDataStore;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.PromotionDao;
import com.huami.training.db.po.Training;
import com.huami.training.dto.PromotePlace;
import com.huami.training.dto.Trainer;
import com.huami.training.repo.PromotionalCourseRepo;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/training/repo/PromotionalCourseRepo;", "", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/TrainingVo;", "loadLatestThreePromotionalCourses", "Lcom/huami/training/dto/Trainer;", "a", "Lcom/huami/training/dto/Trainer;", "trainer", "Lcom/huami/training/db/dao/PromotionDao;", "b", "Lcom/huami/training/db/dao/PromotionDao;", "promotionDao", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/training/db/TrainingDb;Lcom/huami/training/dto/Trainer;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionalCourseRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Trainer trainer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PromotionDao promotionDao;

    public PromotionalCourseRepo(@NotNull TrainingDb trainingDb, @NotNull Trainer trainer) {
        this.trainer = trainer;
        this.promotionDao = trainingDb.promotionDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource b(PromotionalCourseRepo promotionalCourseRepo, List list) {
        Resource.Companion companion = Resource.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoToVoExKt.toTrainingVo((Training) it2.next(), promotionalCourseRepo.trainer.isMale().invoke().booleanValue()));
        }
        return companion.success(arrayList);
    }

    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> loadLatestThreePromotionalCourses(@NotNull PromotePlace promotePlace) {
        return Transformations.map(this.promotionDao.queryLatestThreePromotionalTrainings(promotePlace), new Function() { // from class: u46
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PromotionalCourseRepo.b(this.a, (List) obj);
            }
        });
    }
}
