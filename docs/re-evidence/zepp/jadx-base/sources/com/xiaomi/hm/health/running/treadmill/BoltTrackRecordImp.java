package com.xiaomi.hm.health.running.treadmill;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.ad.db.AdProvider;
import com.huami.ad.web.AdAPI;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.sport.home.manager.SportStatManager;
import com.huami.moving.webapi.GetSportStatAPI;
import com.huami.moving.webapi.GetTrackDataAPI;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.treadmill.data.BoltRecordStatics;
import com.huami.treadmill.proxy.IBoltTrackRecord;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.running.SportDetailPageNavigator;
import com.xiaomi.hm.health.running.treadmill.BoltTrackRecordImp;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016J+\u0010\u0012\u001a\u00020\b2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\fH\u0016J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J\u0019\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001cH\u0016J\u0014\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0016¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/running/treadmill/BoltTrackRecordImp;", "Lcom/huami/treadmill/proxy/IBoltTrackRecord;", "", "trackId", "", "deviceSource", "Landroid/app/Activity;", "activity", "", "gotoDetailSport", "source", "deleteBoltTrackRecord", "Lkotlin/Function1;", "Lcom/huami/treadmill/data/BoltRecordStatics;", "Lkotlin/ParameterName;", "name", "bolts", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getCurrentUserBoltRecordStatisticsInfo", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "getNoOwnerBoltTrackRecords", "tracks", "", "uploadBoltTrackRecords", "(Ljava/util/List;)Ljava/lang/Boolean;", "getNoOwnerNum", "()Ljava/lang/Integer;", "", "", "getPromotionIds", "Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;", "record", "uploadLine", "(Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;)Ljava/lang/Long;", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "getAdRecommendExtra", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "getTrackData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BoltTrackRecordImp implements IBoltTrackRecord {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, GetSportStatAPI.StatDataEntity statDataEntity) {
        BoltRecordStatics boltRecordStatics = new BoltRecordStatics(0L, 0.0f, 0.0f, 7, null);
        for (GetSportStatAPI.StatDataEntity statDataEntity2 : statDataEntity.subStatList) {
            int i = statDataEntity2.sportType;
            if (i == 25 || i == 26) {
                boltRecordStatics.setCount(boltRecordStatics.getCount() + ((long) statDataEntity2.count));
                boltRecordStatics.setDistance(boltRecordStatics.getDistance() + statDataEntity2.distance);
                boltRecordStatics.setCalories(boltRecordStatics.getCalories() + statDataEntity2.calorie);
            }
        }
        Unit unit = Unit.INSTANCE;
        function1.invoke(boltRecordStatics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable e(GetSportStatAPI.StatDataEntity statDataEntity) {
        return GetSportStatAPI.getAllRecordsStatInfoInRx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function1 function1, Throwable th) {
        function1.invoke(new BoltRecordStatics(0L, 0.0f, 0.0f, 7, null));
        th.printStackTrace();
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    public void deleteBoltTrackRecord(long trackId, int source) {
        TrackRecordManager.getInstance().deleteLocalRunningHistoryRecord(trackId, DataTypeSource.RunSource.getSourceByValue(source));
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public List<AdEntity> getAdRecommendExtra() {
        return AdProvider.getHomePagesAdByType(AdAPI.TYPE_RUN_TREADPATHBKE);
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    public void getCurrentUserBoltRecordStatisticsInfo(@NotNull final Function1<? super BoltRecordStatics, Unit> listener) {
        Observable.just(SportStatManager.getInstance().getRecordsStatInfo(null, null, false)).observeOn(AndroidSchedulers.mainThread()).flatMap(new Func1() { // from class: u40
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return BoltTrackRecordImp.e((GetSportStatAPI.StatDataEntity) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new Action1() { // from class: s40
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                BoltTrackRecordImp.d(listener, (GetSportStatAPI.StatDataEntity) obj);
            }
        }, new Action1() { // from class: t40
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                BoltTrackRecordImp.f(listener, (Throwable) obj);
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public List<Trackrecord> getNoOwnerBoltTrackRecords() {
        List<Trackrecord> unKnowTrackRecordsInType = TrackRecordManager.getInstance().getUnKnowTrackRecordsInType(25);
        unKnowTrackRecordsInType.addAll(TrackRecordManager.getInstance().getUnKnowTrackRecordsInType(26));
        return unKnowTrackRecordsInType;
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Integer getNoOwnerNum() {
        return Integer.valueOf(((int) TrackRecordManager.getInstance().getUnKnowTrackRecordsCount(25)) + ((int) TrackRecordManager.getInstance().getUnKnowTrackRecordsCount(26)));
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public List<String> getPromotionIds() {
        List<AdEntity> homePagesAdByType = AdProvider.getHomePagesAdByType(AdAPI.TYPE_RUN_TREADPATHBKE);
        ArrayList arrayList = new ArrayList();
        for (AdEntity adEntity : homePagesAdByType) {
            if (m.startsWith$default(adEntity.getTarget(), "sport:path:", false, 2, null)) {
                arrayList.add(adEntity.getTarget().substring(11));
            }
        }
        return arrayList;
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Trackdata getTrackData(@Nullable String trackId) {
        long jLongValue = (trackId == null ? null : Long.valueOf(Long.parseLong(trackId))).longValue();
        Trackrecord lineTrackRecord = HistoryRecordManager.getInstance().getLineTrackRecord(jLongValue);
        return GetTrackDataAPI.getLineTrackData(jLongValue, DataTypeSource.RunSource.getSourceByValue(lineTrackRecord.getSource().intValue()), lineTrackRecord.getType().intValue());
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    public void gotoDetailSport(long trackId, int deviceSource, @NotNull Activity activity) {
        Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(trackId, deviceSource);
        if (trackRecordById != null) {
            new SportDetailPageNavigator(activity).jump2DetailPage(HistoryRecord.convertTrackRecord(trackRecordById), activity);
        }
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Boolean uploadBoltTrackRecords(@NotNull List<Trackrecord> tracks) {
        return Boolean.valueOf(PostRunningDataToServer.postBoltRunningDataInSynced(tracks));
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Long uploadLine(@NotNull TrainingRecord record) {
        return Long.valueOf(RequestTrainingAPI.reqTrainingRecordSync(record));
    }
}
