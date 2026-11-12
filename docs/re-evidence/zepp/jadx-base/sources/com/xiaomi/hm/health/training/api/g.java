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
class g implements IWebApi {
    private IWebApi a;

    public g(IWebApi iWebApi) {
        this.a = iWebApi;
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public boolean deleteHistoryRecord(@NonNull String str, @NonNull String str2, long j) {
        return this.a.deleteHistoryRecord(str, str2, j);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public boolean exitTraining(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        return this.a.exitTraining(str, str2, str3);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public String generatePayOrder(@NonNull String str, @NonNull PayChannel payChannel, @NonNull String str2, @Nullable String str3) {
        return this.a.generatePayOrder(str, payChannel, str2, str3);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public boolean joinTraining(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        return this.a.joinTraining(str, str2, str3);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public Items<FilterItem> loadBodyParts() {
        return this.a.loadBodyParts();
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public HistoryRecodListData loadHistoryRecords(@NonNull String str, @Nullable Long l, @Nullable Long l2, @Nullable Integer num) {
        return this.a.loadHistoryRecords(str, l, l2, num);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public Items<FilterItem> loadInstruments() {
        return this.a.loadInstruments();
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public Items<TrainingItem> loadJoinedTrainings(@NonNull String str) {
        return this.a.loadJoinedTrainings(str);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public Items<PaidOrder> loadPaidOrderList(@NonNull String str, @Nullable Long l, @Nullable String str2, @Nullable Integer num) {
        return this.a.loadPaidOrderList(str, l, str2, num);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public RankingList loadPlayingRankingList(@NonNull String str, @Nullable Integer num) {
        return this.a.loadPlayingRankingList(str, num);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public TrainingItem loadTrainingDetail(@NonNull String str, @Nullable Boolean bool) {
        return this.a.loadTrainingDetail(str, bool);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public Items<Knowledge> loadTrainingKnowledge(@NonNull String str, @Nullable Long l, @Nullable Integer num) {
        return this.a.loadTrainingKnowledge(str, l, num);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public Items<TrainingItem> loadTrainings(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l, @Nullable Integer num, @Nullable String str7, @Nullable Long l2) {
        return this.a.loadTrainings(str, str2, bool, str3, str4, str5, str6, l, num, str7, l2);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public VideoPostConfig loadVideoPost() {
        return this.a.loadVideoPost();
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public List<VideoUrl> loadVideoUrls(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        return this.a.loadVideoUrls(str, str2, list);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public long uploadHistoryRecord(@NonNull String str, @NonNull String str2, long j, long j2, long j3, long j4, @Nullable List<VideoRecord> list) {
        return this.a.uploadHistoryRecord(str, str2, j, j2, j3, j4, list);
    }
}
