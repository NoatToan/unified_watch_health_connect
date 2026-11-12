package com.huami.training.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.huami.training.converter.PoExKt;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.db.po.Participation;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0017J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH'J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0017J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\bH'J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H'J\b\u0010\u0016\u001a\u00020\u0006H'J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\bH'J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\u0004H'J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH'J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a0\u001dH'J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u001fH'J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u001fH'J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH'¨\u0006%"}, d2 = {"Lcom/huami/training/db/dao/ParticipationDao;", "", "Lcom/huami/training/db/po/Participation;", "participation", "", "insertParticipation", "", "insertOrUpdateParticipation", "", "participations", "insertParticipations", "", "updateParticipation", "insertOrUpdateParticipations", "trainingId", "", "downloaded", "updateParticipationDownloadState", "increaseParticipationTrainTimes", "trainingIds", "deleteParticipationsNotIn", "deleteParticipation", "deleteParticipations", "queryParticipation", "queryParticipations", "queryParticipationsIn", "Lcom/huami/training/db/po/JoinedTraining;", "queryJoinedTraining", "queryJoinedTrainings", "Landroidx/paging/DataSource$Factory;", "queryJoinedTrainingsForPaging", "Landroidx/lifecycle/LiveData;", "queryLatestTwoJoinedTrainings", "queryAllJoinedTrainings", "queryAllJoinedTrainingsCount", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class ParticipationDao {
    @Query("DELETE FROM Participation WHERE trainingId = :trainingId")
    public abstract void deleteParticipation(long trainingId);

    @Query("DELETE FROM Participation")
    public abstract void deleteParticipations();

    @Query("DELETE FROM Participation WHERE trainingId NOT IN (:trainingIds)")
    public abstract void deleteParticipationsNotIn(@NotNull List<Long> trainingIds);

    @Transaction
    public void increaseParticipationTrainTimes(long trainingId) {
        Participation participationQueryParticipation = queryParticipation(trainingId);
        participationQueryParticipation.copy((1 & 1) != 0 ? participationQueryParticipation.trainingId : 0L, (1 & 2) != 0 ? participationQueryParticipation.trainTimes : participationQueryParticipation.getTrainTimes() + 1, (1 & 4) != 0 ? participationQueryParticipation.joinedTime : null, (1 & 8) != 0 ? participationQueryParticipation.lastTrainingTime : null, (1 & 16) != 0 ? participationQueryParticipation.updateTime : null, (1 & 32) != 0 ? participationQueryParticipation.expiry : null, (1 & 64) != 0 ? participationQueryParticipation.hasDownloaded : null);
        updateParticipation(participationQueryParticipation);
    }

    @Transaction
    public void insertOrUpdateParticipation(@NotNull Participation participation) {
        if (insertParticipation(participation) == -1) {
            Participation participationQueryParticipation = queryParticipation(participation.getTrainingId());
            Participation participationCopy = participation.copy((1 & 1) != 0 ? participation.trainingId : 0L, (1 & 2) != 0 ? participation.trainTimes : 0, (1 & 4) != 0 ? participation.joinedTime : null, (1 & 8) != 0 ? participation.lastTrainingTime : null, (1 & 16) != 0 ? participation.updateTime : null, (1 & 32) != 0 ? participation.expiry : null, (1 & 64) != 0 ? participation.hasDownloaded : null);
            participationCopy.setId(participationQueryParticipation.getId());
            if (Intrinsics.areEqual(participationQueryParticipation, participationCopy)) {
                return;
            }
            updateParticipation(PoExKt.combine(participationQueryParticipation, participation));
        }
    }

    @Transaction
    public void insertOrUpdateParticipations(@NotNull List<Participation> participations) {
        List<Long> listInsertParticipations = insertParticipations(participations);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : listInsertParticipations) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Participation participation = ((Number) obj).longValue() == -1 ? participations.get(i2) : null;
            if (participation != null) {
                arrayList.add(participation);
            }
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((Participation) it2.next()).getTrainingId()));
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(queryParticipationsIn(arrayList2), new Comparator<T>() { // from class: com.huami.training.db.dao.ParticipationDao$insertOrUpdateParticipations$lambda-6$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Participation) t).getTrainingId()), Long.valueOf(((Participation) t2).getTrainingId()));
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator<T>() { // from class: com.huami.training.db.dao.ParticipationDao$insertOrUpdateParticipations$lambda-6$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Participation) t).getTrainingId()), Long.valueOf(((Participation) t2).getTrainingId()));
            }
        });
        int size = listSortedWith2.size() < listSortedWith.size() ? listSortedWith2.size() : listSortedWith.size();
        if (size <= 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            Participation participation2 = (Participation) listSortedWith.get(i);
            Participation participation3 = (Participation) listSortedWith2.get(i);
            Participation participationCopy = participation3.copy((1 & 1) != 0 ? participation3.trainingId : 0L, (1 & 2) != 0 ? participation3.trainTimes : 0, (1 & 4) != 0 ? participation3.joinedTime : null, (1 & 8) != 0 ? participation3.lastTrainingTime : null, (1 & 16) != 0 ? participation3.updateTime : null, (1 & 32) != 0 ? participation3.expiry : null, (1 & 64) != 0 ? participation3.hasDownloaded : null);
            participationCopy.setId(participation2.getId());
            if (!Intrinsics.areEqual(participation2, participationCopy)) {
                updateParticipation(PoExKt.combine(participation2, participationCopy));
            }
            if (i4 >= size) {
                return;
            } else {
                i = i4;
            }
        }
    }

    @Insert(onConflict = 5)
    public abstract long insertParticipation(@NotNull Participation participation);

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertParticipations(@NotNull List<Participation> participations);

    @Query("SELECT * FROM JoinedTraining")
    @NotNull
    public abstract LiveData<List<JoinedTraining>> queryAllJoinedTrainings();

    @Query("SELECT COUNT(*) FROM JoinedTraining")
    @NotNull
    public abstract LiveData<Integer> queryAllJoinedTrainingsCount();

    @Query("SELECT * FROM JoinedTraining WHERE id = :trainingId")
    @Nullable
    public abstract JoinedTraining queryJoinedTraining(long trainingId);

    @Query("SELECT * FROM JoinedTraining")
    @NotNull
    public abstract List<JoinedTraining> queryJoinedTrainings();

    @Query("SELECT * FROM JoinedTraining")
    @NotNull
    public abstract DataSource.Factory<Integer, JoinedTraining> queryJoinedTrainingsForPaging();

    @Query("SELECT * FROM JoinedTraining LIMIT 2")
    @NotNull
    public abstract LiveData<List<JoinedTraining>> queryLatestTwoJoinedTrainings();

    @Query("SELECT * FROM Participation WHERE trainingId = :trainingId")
    @NotNull
    public abstract Participation queryParticipation(long trainingId);

    @Query("SELECT * FROM Participation")
    @NotNull
    public abstract List<Participation> queryParticipations();

    @Query("SELECT * FROM Participation WHERE trainingId IN (:trainingIds)")
    @NotNull
    public abstract List<Participation> queryParticipationsIn(@NotNull List<Long> trainingIds);

    @Update
    public abstract int updateParticipation(@NotNull Participation participation);

    @Query("UPDATE Participation SET hasDownloaded = :downloaded WHERE trainingId = :trainingId")
    public abstract int updateParticipationDownloadState(long trainingId, boolean downloaded);
}
