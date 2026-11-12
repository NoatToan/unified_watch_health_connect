package com.huami.training.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.training.db.po.CardPlace;
import com.huami.training.db.po.EntranceKing;
import com.huami.training.db.po.LookAround;
import com.huami.training.db.po.Subject;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.TodayTraining;
import com.huami.training.db.po.Training;
import com.huami.training.dto.SubjectPlace;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\f2\u0006\u0010\n\u001a\u00020\tH'J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\fH'J\b\u0010\u0011\u001a\u00020\u0005H'J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H'J\u0016\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H'J\b\u0010\u0019\u001a\u00020\u0005H'J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH'J\u0016\u0010\u001e\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H'J\b\u0010\u001f\u001a\u00020\u0005H'J\u0016\u0010!\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020 0\u0002H'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00020\fH'J\b\u0010#\u001a\u00020\u0005H'¨\u0006$"}, d2 = {"Lcom/huami/training/db/dao/EntranceDao;", "", "", "Lcom/huami/training/db/po/CardPlace;", "dataList", "", "insertSubjectPlaces", "Lcom/huami/training/db/po/Subject;", "insertSubjects", "Lcom/huami/training/dto/SubjectPlace;", "subjectPlace", "deleteSubjectPlaces", "Landroidx/lifecycle/LiveData;", "querySubjects", "Lcom/huami/training/db/po/Tag;", "insertTodayTag", "queryTodayTag", "clearTodayTag", "", "tag", "Lcom/huami/training/db/po/Training;", "queryTodayTraining", "Lcom/huami/training/db/po/TodayTraining;", "trainings", "insertTodayTraining", "clearTodayTraining", "Landroidx/paging/DataSource$Factory;", "", "queryLookAroundTrainings", "Lcom/huami/training/db/po/LookAround;", "insertLookAroundTrainings", "clearLookAroundTrainings", "Lcom/huami/training/db/po/EntranceKing;", "insertKingList", "queryKingList", "clearKingList", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface EntranceDao {
    @Query("DELETE FROM EntranceKing")
    void clearKingList();

    @Query("DELETE FROM LookAround")
    void clearLookAroundTrainings();

    @Query("DELETE FROM Tag")
    void clearTodayTag();

    @Query("DELETE FROM TodayTraining")
    void clearTodayTraining();

    @Query("DELETE FROM CardPlace WHERE subjectPlace = :subjectPlace")
    void deleteSubjectPlaces(@NotNull SubjectPlace subjectPlace);

    @Insert(onConflict = 1)
    void insertKingList(@NotNull List<EntranceKing> dataList);

    @Insert(onConflict = 1)
    void insertLookAroundTrainings(@NotNull List<LookAround> trainings);

    @Insert(onConflict = 1)
    void insertSubjectPlaces(@NotNull List<CardPlace> dataList);

    @Insert(onConflict = 1)
    void insertSubjects(@NotNull List<Subject> dataList);

    @Insert(onConflict = 1)
    void insertTodayTag(@NotNull List<Tag> dataList);

    @Insert(onConflict = 1)
    void insertTodayTraining(@NotNull List<TodayTraining> trainings);

    @Query("SELECT * FROM EntranceKing")
    @NotNull
    LiveData<List<EntranceKing>> queryKingList();

    @Query("SELECT Training.id, type, name, listImage, difficulty, consumption, participants, contentCount, label, squareImage FROM Training INNER JOIN LookAround ON Training.id = LookAround.trainingId")
    @NotNull
    DataSource.Factory<Integer, Training> queryLookAroundTrainings();

    @Query("\n        SELECT Subject.id, title, subtitle, imageUrl, targetUrl, targetMode, displayMode\n        FROM Subject INNER JOIN CardPlace\n        WHERE Subject.id = subjectId AND subjectPlace = :subjectPlace\n    ")
    @NotNull
    LiveData<List<Subject>> querySubjects(@NotNull SubjectPlace subjectPlace);

    @Query("SELECT * FROM Tag LIMIT 0,8")
    @NotNull
    LiveData<List<Tag>> queryTodayTag();

    @Query("SELECT Training.id,listImage, name, difficulty, contentCount, consumption, participants, type, label,squareImage FROM Training INNER JOIN TodayTraining WHERE tagId=:tag AND Training.id = trainingId")
    @NotNull
    LiveData<List<Training>> queryTodayTraining(long tag);
}
