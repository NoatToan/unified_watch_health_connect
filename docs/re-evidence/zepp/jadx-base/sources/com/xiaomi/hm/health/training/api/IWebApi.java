package com.xiaomi.hm.health.training.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.bean.FilterItem;
import com.xiaomi.hm.health.training.api.bean.HistoryRecodListData;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.Knowledge;
import com.xiaomi.hm.health.training.api.bean.PaidOrder;
import com.xiaomi.hm.health.training.api.bean.RankingList;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.bean.VideoPostConfig;
import com.xiaomi.hm.health.training.api.entity.PayChannel;
import com.xiaomi.hm.health.training.api.entity.VideoRecord;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface IWebApi {
    boolean deleteHistoryRecord(@NonNull String str, @NonNull String str2, long j);

    boolean exitTraining(@NonNull String str, @NonNull String str2, @Nullable String str3);

    @NonNull
    String generatePayOrder(@NonNull String str, @NonNull PayChannel payChannel, @NonNull String str2, @Nullable String str3);

    boolean joinTraining(@NonNull String str, @NonNull String str2, @Nullable String str3);

    Items<FilterItem> loadBodyParts();

    @NonNull
    HistoryRecodListData loadHistoryRecords(@NonNull String str, @Nullable Long l, @Nullable Long l2, @Nullable Integer num);

    Items<FilterItem> loadInstruments();

    @NonNull
    Items<TrainingItem> loadJoinedTrainings(@NonNull String str);

    @NonNull
    Items<PaidOrder> loadPaidOrderList(@NonNull String str, @Nullable Long l, @Nullable String str2, @Nullable Integer num);

    RankingList loadPlayingRankingList(@NonNull String str, @Nullable Integer num);

    @NonNull
    TrainingItem loadTrainingDetail(@NonNull String str, @Nullable Boolean bool);

    Items<Knowledge> loadTrainingKnowledge(@NonNull String str, @Nullable Long l, @Nullable Integer num);

    @NonNull
    Items<TrainingItem> loadTrainings(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l, @Nullable Integer num, @Nullable String str7, @Nullable Long l2);

    VideoPostConfig loadVideoPost();

    List<VideoUrl> loadVideoUrls(@NonNull String str, @NonNull String str2, @NonNull List<String> list);

    long uploadHistoryRecord(@NonNull String str, @NonNull String str2, long j, long j2, long j3, long j4, @Nullable List<VideoRecord> list);
}
