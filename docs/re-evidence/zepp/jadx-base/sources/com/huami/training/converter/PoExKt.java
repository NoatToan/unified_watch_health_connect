package com.huami.training.converter;

import com.google.android.exoplayer2.text.ttml.b;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/training/db/po/Training;", "t", "combine", "Lcom/huami/training/db/po/Participation;", b.r, "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PoExKt {
    @NotNull
    public static final Training combine(@NotNull Training training, @NotNull Training training2) {
        if (training.getId() != training2.getId() || training.getType() != training2.getType()) {
            return training;
        }
        GenderPair<String> listImage = (training2.getListImage() == null || Intrinsics.areEqual(training2.getListImage(), training.getListImage())) ? training.getListImage() : training2.getListImage();
        String name = (training2.getName() == null || training2.getDifficulty() == training.getDifficulty()) ? training.getName() : training2.getName();
        Difficulty difficulty = (training2.getDifficulty() == null || training2.getDifficulty() == training.getDifficulty()) ? training.getDifficulty() : training2.getDifficulty();
        Integer contentCount = (training2.getContentCount() == null || Intrinsics.areEqual(training2.getContentCount(), training.getContentCount())) ? training.getContentCount() : training2.getContentCount();
        Integer consumption = (training2.getConsumption() == null || Intrinsics.areEqual(training2.getConsumption(), training.getConsumption())) ? training.getConsumption() : training2.getConsumption();
        Integer participants = (training2.getParticipants() == null || Intrinsics.areEqual(training2.getParticipants(), training.getParticipants())) ? training.getParticipants() : training2.getParticipants();
        if (training2.getLabel() != null) {
            Intrinsics.areEqual(training2.getLabel(), training2.getLabel());
        }
        return training.copy((3 & 1) != 0 ? training.id : 0L, (3 & 2) != 0 ? training.type : null, (3 & 4) != 0 ? training.name : name, (3 & 8) != 0 ? training.listImage : listImage, (3 & 16) != 0 ? training.difficulty : difficulty, (3 & 32) != 0 ? training.consumption : consumption, (3 & 64) != 0 ? training.participants : participants, (3 & 128) != 0 ? training.contentCount : contentCount, (3 & 256) != 0 ? training.label : training.getLabel(), (3 & 512) != 0 ? training.squareImage : (training2.getSquareImage() == null || Intrinsics.areEqual(training2.getSquareImage(), training.getSquareImage())) ? training.getSquareImage() : training2.getSquareImage());
    }

    @NotNull
    public static final Participation combine(@NotNull Participation participation, @NotNull Participation participation2) {
        if (participation.getTrainingId() != participation2.getTrainingId()) {
            return participation;
        }
        if (participation.getId() != 0 && participation2.getId() != 0 && participation.getId() != participation2.getId()) {
            return participation;
        }
        Participation participationCopy = participation.copy((1 & 1) != 0 ? participation.trainingId : 0L, (1 & 2) != 0 ? participation.trainTimes : participation2.getTrainTimes() != participation.getTrainTimes() ? participation2.getTrainTimes() : participation.getTrainTimes(), (1 & 4) != 0 ? participation.joinedTime : (participation2.getJoinedTime() == null || Intrinsics.areEqual(participation2.getJoinedTime(), participation.getJoinedTime())) ? participation.getJoinedTime() : participation2.getJoinedTime(), (1 & 8) != 0 ? participation.lastTrainingTime : (participation2.getLastTrainingTime() == null || Intrinsics.areEqual(participation2.getLastTrainingTime(), participation.getLastTrainingTime())) ? participation.getLastTrainingTime() : participation2.getLastTrainingTime(), (1 & 16) != 0 ? participation.updateTime : (participation2.getUpdateTime() == null || Intrinsics.areEqual(participation2.getUpdateTime(), participation.getUpdateTime())) ? participation.getUpdateTime() : participation2.getUpdateTime(), (1 & 32) != 0 ? participation.expiry : (participation2.getExpiry() == null || Intrinsics.areEqual(participation2.getExpiry(), participation.getExpiry())) ? participation.getExpiry() : participation2.getExpiry(), (1 & 64) != 0 ? participation.hasDownloaded : (participation2.getHasDownloaded() == null || Intrinsics.areEqual(participation2.getHasDownloaded(), participation.getHasDownloaded())) ? participation.getHasDownloaded() : participation2.getHasDownloaded());
        participationCopy.setId(participation.getId());
        return participationCopy;
    }
}
