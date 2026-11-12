package com.huami.training.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.huami.training.converter.PoExKt;
import com.huami.training.db.po.Training;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0017J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\bH'¨\u0006\u0015"}, d2 = {"Lcom/huami/training/db/dao/TrainingDao;", "", "Lcom/huami/training/db/po/Training;", "training", "", "insertTraining", "", "insertOrUpdateTraining", "", "trainings", "insertTrainings", "updateTraining", "updateTrainings", "insertOrUpdateTrainings", "trainingId", "queryTraining", "queryTrainings", "ids", "queryTrainingsIn", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class TrainingDao {
    @Transaction
    public void insertOrUpdateTraining(@NotNull Training training) {
        if (insertTraining(training) == -1) {
            Training trainingQueryTraining = queryTraining(training.getId());
            if (Intrinsics.areEqual(trainingQueryTraining, training)) {
                return;
            }
            updateTraining(PoExKt.combine(trainingQueryTraining, training));
        }
    }

    @Transaction
    public void insertOrUpdateTrainings(@NotNull List<Training> trainings) {
        List<Long> listInsertTrainings = insertTrainings(trainings);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : listInsertTrainings) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Training training = ((Number) obj).longValue() == -1 ? trainings.get(i2) : null;
            if (training != null) {
                arrayList.add(training);
            }
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((Training) it2.next()).getId()));
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(queryTrainingsIn(arrayList2), new Comparator<T>() { // from class: com.huami.training.db.dao.TrainingDao$insertOrUpdateTrainings$lambda-4$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Training) t).getId()), Long.valueOf(((Training) t2).getId()));
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator<T>() { // from class: com.huami.training.db.dao.TrainingDao$insertOrUpdateTrainings$lambda-4$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Training) t).getId()), Long.valueOf(((Training) t2).getId()));
            }
        });
        int size = listSortedWith2.size() < listSortedWith.size() ? listSortedWith2.size() : listSortedWith.size();
        if (size <= 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            Training training2 = (Training) listSortedWith.get(i);
            Training training3 = (Training) listSortedWith2.get(i);
            if (!Intrinsics.areEqual(training2, training3)) {
                updateTraining(PoExKt.combine(training2, training3));
            }
            if (i4 >= size) {
                return;
            } else {
                i = i4;
            }
        }
    }

    @Insert(onConflict = 5)
    public abstract long insertTraining(@NotNull Training training);

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertTrainings(@NotNull List<Training> trainings);

    @Query("SELECT * FROM Training WHERE id = :trainingId")
    @NotNull
    public abstract Training queryTraining(long trainingId);

    @Query("SELECT * FROM Training")
    @NotNull
    public abstract List<Training> queryTrainings();

    @Query("SELECT * FROM Training WHERE id in (:ids)")
    @NotNull
    public abstract List<Training> queryTrainingsIn(@NotNull List<Long> ids);

    @Update
    public abstract void updateTraining(@NotNull Training training);

    @Update
    public abstract void updateTrainings(@NotNull List<Training> trainings);
}
