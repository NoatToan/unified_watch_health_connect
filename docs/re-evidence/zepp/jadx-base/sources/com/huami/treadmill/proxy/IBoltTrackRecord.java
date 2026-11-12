package com.huami.treadmill.proxy;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.treadmill.data.BoltRecordStatics;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH&J\u0014\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001dH&J\u0019\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001cH&¨\u0006'"}, d2 = {"Lcom/huami/treadmill/proxy/IBoltTrackRecord;", "", "Lkotlin/Function1;", "Lcom/huami/treadmill/data/BoltRecordStatics;", "Lkotlin/ParameterName;", "name", "bolts", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getCurrentUserBoltRecordStatisticsInfo", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "getNoOwnerBoltTrackRecords", "", "trackId", "", "source", "deleteBoltTrackRecord", "tracks", "", "uploadBoltTrackRecords", "(Ljava/util/List;)Ljava/lang/Boolean;", "deviceSource", "Landroid/app/Activity;", "activity", "gotoDetailSport", "getNoOwnerNum", "()Ljava/lang/Integer;", "", "", "getPromotionIds", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "getTrackData", "Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;", "record", "uploadLine", "(Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;)Ljava/lang/Long;", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "getAdRecommendExtra", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface IBoltTrackRecord {
    void deleteBoltTrackRecord(long trackId, int source);

    @Nullable
    List<AdEntity> getAdRecommendExtra();

    void getCurrentUserBoltRecordStatisticsInfo(@NotNull Function1<? super BoltRecordStatics, Unit> listener);

    @Nullable
    List<Trackrecord> getNoOwnerBoltTrackRecords();

    @Nullable
    Integer getNoOwnerNum();

    @Nullable
    List<String> getPromotionIds();

    @Nullable
    Trackdata getTrackData(@Nullable String trackId);

    void gotoDetailSport(long trackId, int deviceSource, @NotNull Activity activity);

    @Nullable
    Boolean uploadBoltTrackRecords(@NotNull List<Trackrecord> tracks);

    @Nullable
    Long uploadLine(@NotNull TrainingRecord record);
}
