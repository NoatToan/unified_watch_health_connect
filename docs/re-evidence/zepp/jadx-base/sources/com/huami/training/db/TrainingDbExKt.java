package com.huami.training.db;

import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDbExKt;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.Training;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/huami/training/db/TrainingDb;", "", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "joinedTrainings", "", "saveAllJoinedTrainings", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class TrainingDbExKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TrainingDb trainingDb, List list) {
        TrainingDao trainingDao = trainingDb.trainingDao();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((JoinedTrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        ParticipationDao participationDao = trainingDb.participationDao();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Participation participationPo = WebBeanToPoExKt.toParticipationPo((JoinedTrainingBean) it3.next());
            if (participationPo != null) {
                arrayList2.add(participationPo);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(((Participation) it4.next()).getTrainingId()));
        }
        participationDao.deleteParticipationsNotIn(arrayList3);
        participationDao.insertOrUpdateParticipations(arrayList2);
    }

    public static final void saveAllJoinedTrainings(@NotNull final TrainingDb trainingDb, @NotNull final List<JoinedTrainingBean> list) {
        trainingDb.runInTransaction(new Runnable() { // from class: vu7
            @Override // java.lang.Runnable
            public final void run() {
                TrainingDbExKt.b(trainingDb, list);
            }
        });
    }
}
