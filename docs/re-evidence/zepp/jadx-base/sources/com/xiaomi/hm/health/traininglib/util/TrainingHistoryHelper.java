package com.xiaomi.hm.health.traininglib.util;

import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.traininglib.model.TrainingHistoryDetail;
import com.xiaomi.hm.health.traininglib.model.TrainingHistoryListData;
import com.xiaomi.hm.health.traininglib.model.TrainingRecordStatInfo;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import rx.Emitter;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHistoryHelper {
    private static volatile TrainingHistoryHelper d;
    private Subscription a;
    private Subscription b;
    private final long c;

    public interface DeleteTrainingHistoryRecordCallback {
        void onDeleteFailed();

        void onDeleteSuccess();
    }

    public interface TrainingHistoryRecordSyncCallback {
        void notifySyncBegin(int i);

        void notifySyncEnd(List<TrainingRecord> list);

        void notifySyncFail(TrainingRecord trainingRecord);

        void notifySyncSuccess(TrainingRecord trainingRecord);
    }

    public class a extends SingleSubscriber<List<TrainingRecord>> {
        public final /* synthetic */ TrainingHistoryRecordSyncCallback b;

        public a(TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback) {
            this.b = trainingHistoryRecordSyncCallback;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
            TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback = this.b;
            if (trainingHistoryRecordSyncCallback != null) {
                trainingHistoryRecordSyncCallback.notifySyncEnd(null);
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(List<TrainingRecord> list) {
            TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback = this.b;
            if (trainingHistoryRecordSyncCallback != null) {
                trainingHistoryRecordSyncCallback.notifySyncEnd(list);
            }
        }
    }

    public class a0 implements Callable<TrainingRecordStatInfo> {
        public a0() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecordStatInfo call() throws Exception {
            return RequestTrainingAPI.reqTrainingHistoryStatSync();
        }
    }

    public class b implements Func1<TrainingRecord, Boolean> {
        public b() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(TrainingRecord trainingRecord) {
            return Boolean.valueOf(trainingRecord.status.intValue() == 0);
        }
    }

    public class b0 extends SingleSubscriber<Boolean> {
        public b0() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            HMLog.d(TrainingHistoryHelper.this.j(), "训练历史记录同步成功", new Object[0]);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
            HMLog.d(TrainingHistoryHelper.this.j(), "训练历史记录同步失败", new Object[0]);
        }
    }

    public class c implements Func1<List<TrainingRecord>, Observable<TrainingRecord>> {
        public c() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(List<TrainingRecord> list) {
            return Observable.from(list);
        }
    }

    public class c0 implements Func1<TrainingRecord, Boolean> {
        public c0() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(TrainingRecord trainingRecord) {
            long jReqTrainingRecordSync = RequestTrainingAPI.reqTrainingRecordSync(trainingRecord);
            int i = jReqTrainingRecordSync > 0 ? 1 : 0;
            trainingRecord.status = Integer.valueOf(i);
            if (i == 0) {
                throw new IllegalStateException("训练历史记录同步失败");
            }
            trainingRecord.createTime = Long.valueOf(jReqTrainingRecordSync);
            TrainingDBUtils.updateTrainingRecord(trainingRecord);
            return Boolean.TRUE;
        }
    }

    public class d implements Action1<TrainingRecord> {
        public final /* synthetic */ TrainingHistoryRecordSyncCallback a;

        public d(TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback) {
            this.a = trainingHistoryRecordSyncCallback;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TrainingRecord trainingRecord) {
            if (this.a != null) {
                if (trainingRecord.status.intValue() == 1) {
                    this.a.notifySyncSuccess(trainingRecord);
                } else {
                    this.a.notifySyncFail(trainingRecord);
                }
            }
        }
    }

    public class d0 implements Func1<TrainingRecord, Observable<TrainingRecord>> {
        public d0() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(TrainingRecord trainingRecord) {
            return TrainingDBUtils.queryTrainingHistoryRecordRelatedData(trainingRecord);
        }
    }

    public class e implements Func1<TrainingRecord, TrainingRecord> {
        public e() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecord call(TrainingRecord trainingRecord) {
            long jReqTrainingRecordSync = RequestTrainingAPI.reqTrainingRecordSync(trainingRecord);
            int i = jReqTrainingRecordSync > 0 ? 1 : 0;
            trainingRecord.status = Integer.valueOf(i);
            if (i != 0) {
                trainingRecord.createTime = Long.valueOf(jReqTrainingRecordSync);
                TrainingDBUtils.updateTrainingRecord(trainingRecord);
            }
            return trainingRecord;
        }
    }

    public class e0 implements Action1<TrainingRecord> {
        public e0() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TrainingRecord trainingRecord) {
            if (trainingRecord == null || trainingRecord.getStatus().intValue() != 0) {
                throw new IllegalStateException("不是有效的未同步的训练历史记录，无需进行同步");
            }
        }
    }

    public class f implements Func1<TrainingRecord, Observable<TrainingRecord>> {
        public f() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(TrainingRecord trainingRecord) {
            return TrainingDBUtils.queryTrainingHistoryRecordRelatedData(trainingRecord);
        }
    }

    public class f0 implements Action1<Emitter<Boolean>> {

        public class a implements TrainingHistoryRecordSyncCallback {
            private boolean a = true;
            public final /* synthetic */ Emitter b;

            public a(Emitter emitter) {
                this.b = emitter;
            }

            @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
            public void notifySyncBegin(int i) {
            }

            @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
            public void notifySyncEnd(List<TrainingRecord> list) {
                this.b.onNext(Boolean.valueOf(this.a));
                this.b.onCompleted();
            }

            @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
            public void notifySyncFail(TrainingRecord trainingRecord) {
                this.a = false;
            }

            @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
            public void notifySyncSuccess(TrainingRecord trainingRecord) {
            }
        }

        public f0() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Emitter<Boolean> emitter) {
            TrainingHistoryHelper.this.syncAllUnSyncedTrainingHistoryRecord(new a(emitter));
        }
    }

    public class g implements Func1<List<TrainingRecord>, Observable<TrainingRecord>> {
        public g() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(List<TrainingRecord> list) {
            return Observable.from(list);
        }
    }

    public class h implements Action1<List<TrainingRecord>> {
        public final /* synthetic */ TrainingHistoryRecordSyncCallback a;

        public h(TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback) {
            this.a = trainingHistoryRecordSyncCallback;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(List<TrainingRecord> list) {
            TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback = this.a;
            if (trainingHistoryRecordSyncCallback != null) {
                trainingHistoryRecordSyncCallback.notifySyncBegin(list.size());
            }
        }
    }

    public class i extends SingleSubscriber<Void> {
        public final /* synthetic */ DeleteTrainingHistoryRecordCallback b;

        public i(DeleteTrainingHistoryRecordCallback deleteTrainingHistoryRecordCallback) {
            this.b = deleteTrainingHistoryRecordCallback;
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            DeleteTrainingHistoryRecordCallback deleteTrainingHistoryRecordCallback = this.b;
            if (deleteTrainingHistoryRecordCallback != null) {
                deleteTrainingHistoryRecordCallback.onDeleteSuccess();
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
            DeleteTrainingHistoryRecordCallback deleteTrainingHistoryRecordCallback = this.b;
            if (deleteTrainingHistoryRecordCallback != null) {
                deleteTrainingHistoryRecordCallback.onDeleteFailed();
            }
        }
    }

    public class j implements Func1<TrainingRecord, Observable<Void>> {

        public class a implements Runnable {
            public final /* synthetic */ TrainingRecord a;

            public a(TrainingRecord trainingRecord) {
                this.a = trainingRecord;
            }

            @Override // java.lang.Runnable
            public void run() {
                TrainingDBUtils.deleteFullTrainingRecord(this.a.getTrainingId().longValue(), this.a.getStartTime().longValue(), this.a.getFinishNumber().intValue());
            }
        }

        public j() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<Void> call(TrainingRecord trainingRecord) {
            return trainingRecord == null ? Observable.just(null) : TrainingHistoryHelper.this.i().rxTxPlain().run(new a(trainingRecord));
        }
    }

    public class k implements Func2<TrainingRecordStatInfo, TrainingRecordStatInfo, TrainingRecordStatInfo> {
        public k() {
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecordStatInfo call(TrainingRecordStatInfo trainingRecordStatInfo, TrainingRecordStatInfo trainingRecordStatInfo2) {
            TrainingRecordStatInfo trainingRecordStatInfo3 = new TrainingRecordStatInfo();
            if (trainingRecordStatInfo != null) {
                trainingRecordStatInfo3.totalCount += trainingRecordStatInfo.totalCount;
                trainingRecordStatInfo3.totalDuration += trainingRecordStatInfo.totalDuration;
                trainingRecordStatInfo3.totalConsumption += trainingRecordStatInfo.totalConsumption;
            }
            if (trainingRecordStatInfo2 != null) {
                trainingRecordStatInfo3.totalCount += trainingRecordStatInfo2.totalCount;
                trainingRecordStatInfo3.totalDuration += trainingRecordStatInfo2.totalDuration;
                trainingRecordStatInfo3.totalConsumption += trainingRecordStatInfo2.totalConsumption;
            }
            return trainingRecordStatInfo3;
        }
    }

    public class l implements Func1<TrainingRecord, TrainingRecord> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public l(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecord call(TrainingRecord trainingRecord) {
            if (trainingRecord == null) {
                HMLog.d(TrainingHistoryHelper.this.j(), "deleteTrainingRecord() -> 本地数据库无对应历史记录, trainingId:" + this.a + ", trainingStartTime:" + this.b + ", syncTime:" + this.c, new Object[0]);
            } else {
                HMLog.d(TrainingHistoryHelper.this.j(), "deleteTrainingRecord() -> trainingId:" + this.a + ", trainingStartTime:" + this.b + ", syncTime:" + this.c + ", createTime:" + trainingRecord.getCreateTime() + ", status:" + trainingRecord.getStatus(), new Object[0]);
            }
            if (trainingRecord != null && trainingRecord.getStatus().intValue() == 0) {
                return trainingRecord;
            }
            long jLongValue = this.c;
            if (trainingRecord != null && trainingRecord.getCreateTime().longValue() > 0) {
                jLongValue = trainingRecord.getCreateTime().longValue();
            }
            if ((trainingRecord == null || trainingRecord.getStatus().intValue() == 1) ? RequestTrainingAPI.reqDeleteTrainingHistoryRecordSync(this.a, jLongValue) : false) {
                return trainingRecord;
            }
            throw new IllegalStateException("Failed to delete training history record from web");
        }
    }

    public class m implements Func1<List<TrainingRecord>, Observable<TrainingRecord>> {
        public m() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(List<TrainingRecord> list) {
            if (list.isEmpty()) {
                return Observable.just(null);
            }
            TrainingRecord trainingRecord = list.get(0);
            return TrainingHistoryHelper.this.loadTrainingHistoryDetailFromWeb(trainingRecord.getTrainingId().longValue(), trainingRecord.getStartTime().longValue(), trainingRecord.getCreateTime().longValue());
        }
    }

    public class n implements Func1<List<TrainingRecord>, Observable<List<TrainingRecord>>> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ int c;

        public class a implements Func2<List<TrainingRecord>, Void, List<TrainingRecord>> {
            public a() {
            }

            @Override // rx.functions.Func2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<TrainingRecord> call(List<TrainingRecord> list, Void r2) {
                return list;
            }
        }

        public class b implements Func1<Throwable, Void> {
            public b() {
            }

            @Override // rx.functions.Func1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call(Throwable th) {
                th.printStackTrace();
                HMLog.w(TrainingHistoryHelper.this.j(), "缓存训练历史记录列表时发生错误。" + th.getMessage(), new Object[0]);
                return null;
            }
        }

        public class c implements Action1<Void> {
            public c() {
            }

            @Override // rx.functions.Action1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Void r3) {
                HMLog.d(TrainingHistoryHelper.this.j(), "缓存训练历史记录列表成功。", new Object[0]);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ List a;

            public d(List list) {
                this.a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                n nVar = n.this;
                TrainingHistoryHelper.this.f(nVar.a, nVar.b, nVar.c, this.a);
            }
        }

        public n(Long l, Long l2, int i) {
            this.a = l;
            this.b = l2;
            this.c = i;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<List<TrainingRecord>> call(List<TrainingRecord> list) {
            HMLog.d(TrainingHistoryHelper.this.j(), "从网络请求到的训练历史记录共" + list.size() + "条,startTime:" + TrainingHistoryHelper.this.h(this.a) + ",endTime:" + TrainingHistoryHelper.this.h(this.b) + ",limit:" + this.c, new Object[0]);
            if (list.isEmpty()) {
                return Observable.just(list);
            }
            ArrayList arrayList = new ArrayList();
            for (TrainingRecord trainingRecord : list) {
                if (arrayList.contains(trainingRecord)) {
                    boolean zReqDeleteTrainingHistoryRecordSync = RequestTrainingAPI.reqDeleteTrainingHistoryRecordSync(trainingRecord.trainingId.longValue(), trainingRecord.createTime.longValue());
                    String strJ = TrainingHistoryHelper.this.j();
                    StringBuilder sb = new StringBuilder();
                    sb.append(zReqDeleteTrainingHistoryRecordSync ? "已" : "未能");
                    sb.append("删除重复的训练历史记录. name:");
                    sb.append(trainingRecord.name);
                    sb.append(", createTime:");
                    sb.append(trainingRecord.createTime);
                    HMLog.d(strJ, sb.toString(), new Object[0]);
                } else {
                    arrayList.add(trainingRecord);
                }
            }
            return Observable.zip(Observable.just(arrayList), TrainingHistoryHelper.this.i().rxTx().run(new d(arrayList)).doOnNext(new c()).onErrorReturn(new b()), new a());
        }
    }

    public class o implements Func1<TrainingRecord, TrainingRecord> {
        public o() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecord call(TrainingRecord trainingRecord) {
            trainingRecord.setStatus(1);
            trainingRecord.generateTrainingRecordId();
            return trainingRecord;
        }
    }

    public class p implements Func1<TrainingHistoryListData, Observable<TrainingRecord>> {
        public p() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(TrainingHistoryListData trainingHistoryListData) {
            List<TrainingRecord> list;
            return (trainingHistoryListData == null || (list = trainingHistoryListData.userTrainingRecords) == null || list.isEmpty()) ? Observable.from(new ArrayList()) : Observable.from(trainingHistoryListData.userTrainingRecords);
        }
    }

    public class q implements Callable<TrainingHistoryListData> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ int c;

        public q(Long l, Long l2, int i) {
            this.a = l;
            this.b = l2;
            this.c = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingHistoryListData call() throws Exception {
            return RequestTrainingAPI.reqTrainingHistoryListSync(this.a, this.b, this.c);
        }
    }

    public class r implements Func1<TrainingRecord, Observable<TrainingRecord>> {
        public r() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(TrainingRecord trainingRecord) {
            return TrainingDBUtils.queryTrainingHistoryRecordRelatedData(trainingRecord);
        }
    }

    public class s implements Action1<TrainingRecord> {
        public s() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TrainingRecord trainingRecord) {
            if (trainingRecord == null) {
                throw new IllegalStateException("训练历史记录详情数据获取失败");
            }
        }
    }

    public class t implements Func1<TrainingRecord, Observable<TrainingRecord>> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        public class a implements Func1<TrainingRecord, TrainingRecord> {
            public final /* synthetic */ TrainingRecord a;

            public a(TrainingRecord trainingRecord) {
                this.a = trainingRecord;
            }

            @Override // rx.functions.Func1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public TrainingRecord call(TrainingRecord trainingRecord) {
                if (trainingRecord != null) {
                    trainingRecord.merge(this.a);
                }
                TrainingDBUtils.insertTrainingRecord(trainingRecord);
                return trainingRecord;
            }
        }

        public t(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(TrainingRecord trainingRecord) {
            return TrainingDBUtils.querySingleSimpleTrainingHistoryRecordInRx(this.a, this.b).map(new a(trainingRecord));
        }
    }

    public class u implements Func1<TrainingRecord, Observable<TrainingRecord>> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        public class a implements Func2<TrainingRecord, Void, TrainingRecord> {
            public a() {
            }

            @Override // rx.functions.Func2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public TrainingRecord call(TrainingRecord trainingRecord, Void r2) {
                return trainingRecord;
            }
        }

        public u(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<TrainingRecord> call(TrainingRecord trainingRecord) {
            List<TrainingHeartRate> list = trainingRecord.heartRateList;
            if (list == null || list.isEmpty()) {
                return Observable.just(trainingRecord);
            }
            HMLog.d(TrainingHistoryHelper.this.j(), "缓存训练历史记录里的心率列表到数据库", new Object[0]);
            for (TrainingHeartRate trainingHeartRate : trainingRecord.heartRateList) {
                trainingHeartRate.trainingId = Long.valueOf(this.a);
                trainingHeartRate.trainingStartTime = Long.valueOf(this.b);
            }
            return Observable.zip(Observable.just(trainingRecord), TrainingDBUtils.insertNewTrainingHeartRatesInRx(this.a, this.b, trainingRecord.heartRateList), new a());
        }
    }

    public class v implements Callable<TrainingRecordStatInfo> {
        public v() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecordStatInfo call() throws Exception {
            return TrainingDBUtils.getRecordsStatInfo(null, null, true);
        }
    }

    public class w implements Func1<TrainingRecord, TrainingRecord> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        public w(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecord call(TrainingRecord trainingRecord) {
            List<HaveDoneAction> list = trainingRecord.actions;
            if (list != null && !list.isEmpty()) {
                HMLog.d(TrainingHistoryHelper.this.j(), "缓存训练历史记录里的动作列表到数据库", new Object[0]);
                for (HaveDoneAction haveDoneAction : trainingRecord.actions) {
                    haveDoneAction.trainingId = Long.valueOf(this.a);
                    haveDoneAction.trainingStartTime = Long.valueOf(this.b);
                }
                TrainingDBUtils.insertTrainingDoneActions(trainingRecord.actions);
            }
            return trainingRecord;
        }
    }

    public class x implements Func1<TrainingHistoryDetail, TrainingRecord> {
        public final /* synthetic */ long a;

        public x(long j) {
            this.a = j;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecord call(TrainingHistoryDetail trainingHistoryDetail) {
            if (trainingHistoryDetail != null) {
                return TrainingHistoryHelper.this.g(trainingHistoryDetail, this.a);
            }
            HMLog.d(TrainingHistoryHelper.this.j(), "从网络请求训练历史记录详情信息获取为空", new Object[0]);
            throw new IllegalStateException("从网络请求训练历史记录详情信息获取为空");
        }
    }

    public class y implements Callable<TrainingHistoryDetail> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        public y(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingHistoryDetail call() throws Exception {
            return RequestTrainingAPI.reqTrainingHistoryDetailSync(this.a, this.b);
        }
    }

    public class z implements Action1<TrainingRecordStatInfo> {
        public z() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TrainingRecordStatInfo trainingRecordStatInfo) {
            if (trainingRecordStatInfo == null) {
                throw new IllegalStateException("从网络获取训练历史统计信息失败");
            }
        }
    }

    private TrainingHistoryHelper() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK, 3, 1);
        this.c = calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Long l2, Long l3, int i2, List<TrainingRecord> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<TrainingRecord> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getStartTime());
        }
        if ((l2 == null || l3 == null) ? false : true) {
            TrainingDBUtils.deleteSyncedTrainingRecordByTimeRange(l2, l3, arrayList);
        } else {
            TrainingDBUtils.deleteSyncedTrainingRecordBySyncTime(l3, i2, arrayList);
        }
        List<TrainingRecord> listQueryTrainingHistoryRecordList = TrainingDBUtils.queryTrainingHistoryRecordList(arrayList);
        for (TrainingRecord trainingRecord : list) {
            int iIndexOf = listQueryTrainingHistoryRecordList.indexOf(trainingRecord);
            if (iIndexOf >= 0) {
                TrainingRecord trainingRecord2 = listQueryTrainingHistoryRecordList.get(iIndexOf);
                trainingRecord.merge(trainingRecord2);
                TrainingDBUtils.updateTrainingRecord(trainingRecord);
                HMLog.d(j(), "更新网络获取到的历史记录到数据库，" + trainingRecord2, new Object[0]);
            } else {
                TrainingDBUtils.insertTrainingRecord(trainingRecord);
                HMLog.d(j(), "插入网络获取到的历史记录到数据库，" + trainingRecord, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TrainingRecord g(TrainingHistoryDetail trainingHistoryDetail, long j2) {
        TrainingRecord trainingRecord = new TrainingRecord();
        trainingRecord.trainingId = Long.valueOf(trainingHistoryDetail.trainingId);
        trainingRecord.startTime = Long.valueOf(j2);
        trainingRecord.name = trainingHistoryDetail.name;
        trainingRecord.pause = trainingHistoryDetail.pause;
        trainingRecord.actionNumber = Integer.valueOf(trainingHistoryDetail.actionNumber);
        trainingRecord.actions = trainingHistoryDetail.actions;
        trainingRecord.detailsPageIllustrated = trainingHistoryDetail.detailsPageIllustrated;
        trainingRecord.hasBoundHrDevice = Boolean.valueOf(trainingHistoryDetail.isBindingHeartRateBracelet);
        TrainingHistoryDetail.HeartRateDataBean heartRateDataBean = trainingHistoryDetail.heartRateData;
        if (heartRateDataBean != null) {
            trainingRecord.averageHeartRate = Integer.valueOf(heartRateDataBean.averageHeartRate);
            trainingRecord.maxHeartRate = Integer.valueOf(trainingHistoryDetail.heartRateData.maxHeartRate);
            trainingRecord.heartRate = trainingHistoryDetail.heartRateData.heartRate;
            TrainingRecordUtils.parseHeartRateListFromCsv(trainingRecord);
        }
        trainingRecord.status = 1;
        return trainingRecord;
    }

    public static TrainingHistoryHelper getInstance() {
        if (d == null) {
            synchronized (TrainingHistoryHelper.class) {
                if (d == null) {
                    d = new TrainingHistoryHelper();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h(Long l2) {
        return l2 == null ? "null" : TimeUtils.debugTime(l2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DaoSession i() {
        return HMDaoManager.getInstance().getDaoSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String j() {
        return getClass().getSimpleName();
    }

    private Observable<TrainingRecord> k(Long l2, Long l3, int i2) {
        return TrainingDBUtils.querySimpleTrainingHistoryRecordListInRx(l2, l3, i2);
    }

    private Observable<List<TrainingRecord>> l(Long l2, Long l3, int i2) {
        return l3.longValue() < this.c ? Observable.just(new ArrayList()) : Observable.fromCallable(new q(l2, l3, i2)).subscribeOn(Schedulers.io()).flatMap(new p()).map(new o()).toList().flatMap(new n(l2, l3, i2));
    }

    public void cancelSyncRecords() {
        Subscription subscription = this.a;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.a.unsubscribe();
        }
        Subscription subscription2 = this.b;
        if (subscription2 == null || subscription2.isUnsubscribed()) {
            return;
        }
        this.b.unsubscribe();
    }

    public boolean checkLocalTrainingHistoryDetailDataIsValid(long j2, long j3) {
        return TrainingDBUtils.hasTrainingHistoryRecord(j2, j3) && TrainingDBUtils.queryDoneActionCountInOneHistoryRecord(j2, j3) > 0;
    }

    public void deleteTrainingRecord(long j2, long j3, long j4, DeleteTrainingHistoryRecordCallback deleteTrainingHistoryRecordCallback) {
        TrainingDBUtils.querySingleSimpleTrainingHistoryRecordInRx(j2, j3).observeOn(Schedulers.io()).map(new l(j2, j3, j4)).flatMap(new j()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new i(deleteTrainingHistoryRecordCallback));
    }

    public Observable<TrainingRecordStatInfo> getAllRecordsStatInfoInRx() {
        return Observable.zip(Observable.fromCallable(new v()), Observable.fromCallable(new a0()).doOnNext(new z()), new k()).subscribeOn(Schedulers.io());
    }

    public Observable<TrainingRecord> loadLatestTrainingRecordFromWeb() {
        return loadTrainingHistoryListFromWebBySyncTime(Long.valueOf(System.currentTimeMillis() + 1), 1).flatMap(new m());
    }

    public Observable<TrainingRecord> loadTrainingHistoryDetailFromLocal(long j2, long j3) {
        return TrainingDBUtils.querySingleSimpleTrainingHistoryRecordInRx(j2, j3).doOnNext(new s()).observeOn(Schedulers.io()).flatMap(new r());
    }

    public Observable<TrainingRecord> loadTrainingHistoryDetailFromWeb(long j2, long j3, long j4) {
        return Observable.fromCallable(new y(j2, j4)).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).map(new x(j3)).map(new w(j2, j3)).flatMap(new u(j2, j3)).flatMap(new t(j2, j3));
    }

    public Observable<TrainingRecord> loadTrainingHistoryListFromLocalBySyncTime(Long l2, int i2) {
        if (l2 == null) {
            l2 = Long.valueOf(System.currentTimeMillis());
        }
        return k(null, l2, i2);
    }

    public Observable<TrainingRecord> loadTrainingHistoryListFromLocalByTimeRange(Long l2, Long l3) {
        if (l2 == null) {
            l2 = 0L;
        }
        if (l3 == null) {
            l3 = Long.MAX_VALUE;
        }
        return k(l2, l3, 0);
    }

    public Observable<List<TrainingRecord>> loadTrainingHistoryListFromWebBySyncTime(Long l2, int i2) {
        if (l2 == null) {
            l2 = Long.valueOf(System.currentTimeMillis());
        }
        return l(null, l2, i2);
    }

    public Observable<List<TrainingRecord>> loadTrainingHistoryListFromWebByTimeRange(Long l2, Long l3) {
        if (l2 == null) {
            l2 = 0L;
        }
        if (l3 == null) {
            l3 = Long.MAX_VALUE;
        }
        return l(l2, l3, 0);
    }

    public long queryAllTrainingHistoryRecordCount() {
        return TrainingDBUtils.queryAllTrainingHistoryRecordCount();
    }

    public TrainingRecord queryLatestTrainingRecord() {
        return TrainingDBUtils.queryLatestTrainingHistoryRecord();
    }

    public long queryTrainingHistoryRecordCountByTimeRange(long j2, long j3) {
        return TrainingDBUtils.queryTrainingHistoryRecordCountByTimeRange(j2, j3);
    }

    public long queryUnSyncedTrainingHistoryRecordCount() {
        return TrainingDBUtils.queryUnSyncedTrainingHistoryRecordCount();
    }

    public void syncAllUnSyncedTrainingHistoryRecord(TrainingHistoryRecordSyncCallback trainingHistoryRecordSyncCallback) {
        cancelSyncRecords();
        this.a = TrainingDBUtils.queryUnSyncedTrainingHistoryRecordListInRx().toList().observeOn(AndroidSchedulers.mainThread()).doOnNext(new h(trainingHistoryRecordSyncCallback)).observeOn(Schedulers.io()).flatMap(new g()).flatMap(new f()).map(new e()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new d(trainingHistoryRecordSyncCallback)).observeOn(Schedulers.io()).toList().flatMap(new c()).filter(new b()).toList().toSingle().observeOn(AndroidSchedulers.mainThread()).subscribe(new a(trainingHistoryRecordSyncCallback));
    }

    public boolean syncAllUnSyncedTrainingHistoryRecordInSyncWay() {
        return ((Boolean) Observable.create(new f0(), Emitter.BackpressureMode.LATEST).toBlocking().single()).booleanValue();
    }

    public void syncSingleTrainingHistoryRecord(long j2, long j3) {
        this.b = TrainingDBUtils.querySingleSimpleTrainingHistoryRecordInRx(j2, j3).doOnNext(new e0()).flatMap(new d0()).observeOn(Schedulers.io()).map(new c0()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new b0());
    }
}
