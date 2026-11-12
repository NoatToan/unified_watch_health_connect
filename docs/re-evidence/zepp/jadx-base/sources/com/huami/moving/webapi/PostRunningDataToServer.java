package com.huami.moving.webapi;

import android.util.Pair;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.webkit.ISportHttpRequester;
import com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler;
import com.huami.mifit.sportlib.webkit.SportHttpKit;
import com.huami.moving.datacenter.SportDetailDbClient;
import com.huami.moving.device.SportUsingDeviceHandler;
import com.huami.moving.ui.utils.SportFunctionUtil;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Emitter;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J \u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u0002H\u0007J\u0016\u0010\u0015\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0007R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/moving/webapi/PostRunningDataToServer;", "", "", "isNeedUploadSportDatas", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackrecord", "modify", "postSummarySync", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "trackdata", "postDetailDataSync", "", "cancelSyncRunningData", "Lcom/huami/moving/webapi/PostRunningDataToServer$IHistoryRecordSyncCallBack;", "syncCallBack", "postRunningData", "", "boltData", "postBoltRunningData", "postRunningDataInSynced", "", "postBoltRunningDataInSynced", "", "a", "Ljava/lang/String;", "WEB_API_RUN_DETAIL", "b", "WEB_API_RUN_SUMMARY", "Lrx/Subscription;", "c", "Lrx/Subscription;", "sSyncDataSubscription", "<init>", "()V", "IHistoryRecordSyncCallBack", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class PostRunningDataToServer {

    @NotNull
    public static final PostRunningDataToServer INSTANCE = new PostRunningDataToServer();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String WEB_API_RUN_DETAIL = "v1/sport/run/detail.json";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String WEB_API_RUN_SUMMARY = "v1/sport/run/summary.json";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static Subscription sSyncDataSubscription;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\r\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/webapi/PostRunningDataToServer$IHistoryRecordSyncCallBack;", "", "", "count", "", "notifySyncBegin", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "syncedTrackRecord", "notifySyncSuccess", "unSyncedTrackRecord", "notifySyncFail", "", "unSyncedTrackRecords", "notifySyncEnd", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface IHistoryRecordSyncCallBack {
        void notifySyncBegin(int count);

        void notifySyncEnd(@Nullable List<? extends Trackrecord> unSyncedTrackRecords);

        void notifySyncFail(@NotNull Trackrecord unSyncedTrackRecord);

        void notifySyncSuccess(@NotNull Trackrecord syncedTrackRecord);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "query Bolt TrackData error:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "query TrackData error:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    private PostRunningDataToServer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, List list) {
        if (iHistoryRecordSyncCallBack == null) {
            return;
        }
        iHistoryRecordSyncCallBack.notifySyncBegin(list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable D(List list) {
        return Observable.from(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable E(final Trackrecord trackrecord) {
        return SportDetailDbClient.getInstance().getTrackDataInRx(new DataCondition(trackrecord.getTrackid().longValue(), trackrecord.getSource().intValue(), trackrecord.getType().intValue())).doOnError(new Action1() { // from class: p26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.F((Throwable) obj);
            }
        }).map(new Func1() { // from class: v16
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.G(trackrecord, (Trackdata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Throwable th) {
        HMLog.info$default(null, new a(th), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair G(Trackrecord trackrecord, Trackdata trackdata) {
        return new Pair(trackrecord, trackdata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Trackrecord H(Pair pair) {
        Trackrecord trackrecord = (Trackrecord) pair.first;
        if (postDetailDataSync((Trackdata) pair.second, false) && postSummarySync(trackrecord, false)) {
            trackrecord.setState(Integer.valueOf(SyncedState.STATE_SYNCED_TO_SERVER.getValue()));
        }
        return trackrecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, Trackrecord trackrecord) {
        if (iHistoryRecordSyncCallBack != null) {
            Integer state = trackrecord.getState();
            int value = SyncedState.STATE_SYNCED_TO_SERVER.getValue();
            if (state != null && state.intValue() == value) {
                iHistoryRecordSyncCallBack.notifySyncSuccess(trackrecord);
            } else {
                iHistoryRecordSyncCallBack.notifySyncFail(trackrecord);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(List list) {
        Observable.from(list).filter(new Func1() { // from class: c26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.K((Trackrecord) obj);
            }
        }).toList().subscribe(new Action1() { // from class: q26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.L((List) obj);
            }
        }, new Action1() { // from class: o26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.M((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean K(Trackrecord trackrecord) {
        Integer state = trackrecord.getState();
        return Boolean.valueOf(state != null && state.intValue() == SyncedState.STATE_SYNCED_TO_SERVER.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HMDaoManager.getInstance().getTrackrecordDao().insertOrReplaceInTx(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable N(List list) {
        return Observable.from(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean O(Trackrecord trackrecord) {
        Integer state = trackrecord.getState();
        return Boolean.valueOf(state != null && state.intValue() == SyncedState.STATE_UNKNOW.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(List list, final Emitter emitter) {
        postBoltRunningData(new IHistoryRecordSyncCallBack() { // from class: com.huami.moving.webapi.PostRunningDataToServer$postBoltRunningDataInSynced$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private int syncSucc;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int SYNC_FAIL = 17;

            public final int getSYNC_FAIL() {
                return this.SYNC_FAIL;
            }

            public final int getSyncSucc() {
                return this.syncSucc;
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncBegin(int count) {
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncEnd(@Nullable List<? extends Trackrecord> unSyncedTrackRecords) {
                if (this.syncSucc == this.SYNC_FAIL) {
                    emitter.onNext(Boolean.FALSE);
                } else {
                    emitter.onNext(Boolean.valueOf(unSyncedTrackRecords != null && unSyncedTrackRecords.isEmpty()));
                }
                emitter.onCompleted();
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncFail(@NotNull Trackrecord unSyncedTrackRecord) {
                this.syncSucc = this.SYNC_FAIL;
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncSuccess(@NotNull Trackrecord syncedTrackRecord) {
            }

            public final void setSyncSucc(int i) {
                this.syncSucc = i;
            }
        }, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, List list) {
        if (iHistoryRecordSyncCallBack == null) {
            return;
        }
        iHistoryRecordSyncCallBack.notifySyncBegin(list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable R(List list) {
        return Observable.from(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(List list) {
        Observable.from(list).filter(new Func1() { // from class: y16
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.T((Trackrecord) obj);
            }
        }).toList().subscribe(new Action1() { // from class: q16
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.U((List) obj);
            }
        }, new Action1() { // from class: m26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.V((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean T(Trackrecord trackrecord) {
        Integer state = trackrecord.getState();
        return Boolean.valueOf(state != null && state.intValue() == SyncedState.STATE_SYNCED_TO_SERVER.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HMDaoManager.getInstance().getTrackrecordDao().insertOrReplaceInTx(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(Throwable th) {
        HMLog.warn$default(null, th, d.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable W(List list) {
        return Observable.from(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean X(Trackrecord trackrecord) {
        Integer state = trackrecord.getState();
        return Boolean.valueOf(state != null && state.intValue() == SyncedState.STATE_UNSYNCED.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable Y(final Trackrecord trackrecord) {
        return SportDetailDbClient.getInstance().getTrackDataInRx(new DataCondition(trackrecord.getTrackid().longValue(), trackrecord.getSource().intValue(), trackrecord.getType().intValue())).doOnError(new Action1() { // from class: n26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.Z((Throwable) obj);
            }
        }).map(new Func1() { // from class: u16
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.a0(trackrecord, (Trackdata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(Throwable th) {
        HMLog.info$default(null, new c(th), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair a0(Trackrecord trackrecord, Trackdata trackdata) {
        return new Pair(trackrecord, trackdata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Trackrecord b0(Pair pair) {
        Trackrecord trackrecord = (Trackrecord) pair.first;
        Trackdata trackdata = (Trackdata) pair.second;
        Integer type = trackrecord.getType();
        boolean z = type != null && type.intValue() == 26;
        if (postDetailDataSync(trackdata, z) && postSummarySync(trackrecord, z)) {
            trackrecord.setState(Integer.valueOf(SyncedState.STATE_SYNCED_TO_SERVER.getValue()));
        }
        return trackrecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, Trackrecord trackrecord) {
        if (iHistoryRecordSyncCallBack != null) {
            Integer state = trackrecord.getState();
            int value = SyncedState.STATE_SYNCED_TO_SERVER.getValue();
            if (state != null && state.intValue() == value) {
                iHistoryRecordSyncCallBack.notifySyncSuccess(trackrecord);
            } else {
                iHistoryRecordSyncCallBack.notifySyncFail(trackrecord);
            }
        }
    }

    @JvmStatic
    public static final void cancelSyncRunningData() {
        Subscription subscription = sSyncDataSubscription;
        if (subscription == null || subscription.isUnsubscribed()) {
            return;
        }
        sSyncDataSubscription.unsubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(final Emitter emitter) {
        postRunningData(new IHistoryRecordSyncCallBack() { // from class: com.huami.moving.webapi.PostRunningDataToServer$postRunningDataInSynced$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private int syncSucc;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int SYNC_FAIL = 17;

            public final int getSYNC_FAIL() {
                return this.SYNC_FAIL;
            }

            public final int getSyncSucc() {
                return this.syncSucc;
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncBegin(int count) {
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncEnd(@Nullable List<? extends Trackrecord> unSyncedTrackRecords) {
                if (this.syncSucc == this.SYNC_FAIL) {
                    emitter.onNext(Boolean.FALSE);
                } else {
                    emitter.onNext(Boolean.valueOf(unSyncedTrackRecords != null && unSyncedTrackRecords.isEmpty()));
                }
                emitter.onCompleted();
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncFail(@NotNull Trackrecord unSyncedTrackRecord) {
                this.syncSucc = this.SYNC_FAIL;
            }

            @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
            public void notifySyncSuccess(@NotNull Trackrecord syncedTrackRecord) {
            }

            public final void setSyncSucc(int i) {
                this.syncSucc = i;
            }
        });
    }

    @JvmStatic
    public static final boolean isNeedUploadSportDatas() {
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        return requester == null || requester.isSportDataUploadEnable();
    }

    @JvmStatic
    public static final void postBoltRunningData(@Nullable final IHistoryRecordSyncCallBack syncCallBack, @NotNull List<? extends Trackrecord> boltData) {
        sSyncDataSubscription = Observable.from(boltData).toList().observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: j26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.C(syncCallBack, (List) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new Func1() { // from class: h26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.D((List) obj);
            }
        }).flatMap(new Func1() { // from class: e26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.E((Trackrecord) obj);
            }
        }).map(new Func1() { // from class: x16
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.H((Pair) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: a26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.I(syncCallBack, (Trackrecord) obj);
            }
        }).observeOn(Schedulers.io()).toList().doOnNext(new Action1() { // from class: r16
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.J((List) obj);
            }
        }).flatMap(new Func1() { // from class: g26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.N((List) obj);
            }
        }).filter(new Func1() { // from class: b26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.O((Trackrecord) obj);
            }
        }).toList().toSingle().observeOn(AndroidSchedulers.mainThread()).subscribe(new SingleSubscriber<List<? extends Trackrecord>>() { // from class: com.huami.moving.webapi.PostRunningDataToServer.postBoltRunningData.9
            @Override // rx.SingleSubscriber
            public void onError(@NotNull Throwable throwable) {
                throwable.printStackTrace();
                IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack = syncCallBack;
                if (iHistoryRecordSyncCallBack == null) {
                    return;
                }
                iHistoryRecordSyncCallBack.notifySyncEnd(null);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(@NotNull List<? extends Trackrecord> unSyncedTrackRecords) {
                IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack = syncCallBack;
                if (iHistoryRecordSyncCallBack == null) {
                    return;
                }
                iHistoryRecordSyncCallBack.notifySyncEnd(unSyncedTrackRecords);
            }
        });
    }

    @JvmStatic
    public static final boolean postBoltRunningDataInSynced(@NotNull final List<Trackrecord> boltData) {
        return ((Boolean) Observable.create(new Action1() { // from class: l26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.P(boltData, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.LATEST).toBlocking().single()).booleanValue();
    }

    @JvmStatic
    public static final boolean postDetailDataSync(@NotNull Trackdata trackdata, boolean modify) {
        Integer provider;
        HashMap map = new HashMap();
        if (!isNeedUploadSportDatas()) {
            return false;
        }
        map.put("trackid", trackdata.getTrackid());
        map.put("source", DataTypeSource.RunSource.getSourceByValue(trackdata.getSource().intValue()));
        map.put("version", trackdata.getV());
        if (!SportFunctionUtil.isKoreaNoGps) {
            String bulkll = trackdata.getBulkll();
            if (bulkll == null) {
                bulkll = "";
            }
            map.put("longitude_latitude", bulkll);
        }
        String bulkal = trackdata.getBulkal();
        if (bulkal == null) {
            bulkal = "";
        }
        map.put("altitude", bulkal);
        String bulkacc = trackdata.getBulkacc();
        if (bulkacc == null) {
            bulkacc = "";
        }
        map.put("accuracy", bulkacc);
        String bulktime = trackdata.getBulktime();
        if (bulktime == null) {
            bulktime = "";
        }
        map.put("time", bulktime);
        String bulkgait = trackdata.getBulkgait();
        if (bulkgait == null) {
            bulkgait = "";
        }
        map.put("gait", bulkgait);
        String bulkpace = trackdata.getBulkpace();
        if (bulkpace == null) {
            bulkpace = "";
        }
        map.put("pace", bulkpace);
        String bulkspeed = trackdata.getBulkspeed();
        if (bulkspeed == null) {
            bulkspeed = "";
        }
        map.put("speed", bulkspeed);
        String bulkpause = trackdata.getBulkpause();
        if (bulkpause == null) {
            bulkpause = "";
        }
        map.put("pause", bulkpause);
        String bulkflag = trackdata.getBulkflag();
        if (bulkflag == null) {
            bulkflag = "";
        }
        map.put("flag", bulkflag);
        String kilomarked = trackdata.getKilomarked();
        if (kilomarked == null) {
            kilomarked = "";
        }
        map.put("kilo_pace", kilomarked);
        String milemarked = trackdata.getMilemarked();
        if (milemarked == null) {
            milemarked = "";
        }
        map.put("mile_pace", milemarked);
        String bulkhr = trackdata.getBulkhr();
        if (bulkhr == null) {
            bulkhr = "";
        }
        map.put("heart_rate", bulkhr);
        String bulkdistance = trackdata.getBulkdistance();
        if (bulkdistance == null) {
            bulkdistance = "";
        }
        map.put("distance", bulkdistance);
        String bulkbarometerAltitude = trackdata.getBulkbarometerAltitude();
        if (bulkbarometerAltitude == null) {
            bulkbarometerAltitude = "";
        }
        map.put("air_pressure_altitude", bulkbarometerAltitude);
        String strokeSpeed = trackdata.getStrokeSpeed();
        if (strokeSpeed == null) {
            strokeSpeed = "";
        }
        map.put("stroke_speed", strokeSpeed);
        map.put("provider", (trackdata.getProvider() == null || ((provider = trackdata.getProvider()) != null && provider.intValue() == 1)) ? "gps" : Constants.LOC_PROVIDER_GAODE);
        String lap = trackdata.getLap();
        if (lap == null) {
            lap = "";
        }
        map.put("lap", lap);
        String bulkspo2 = trackdata.getBulkspo2();
        if (bulkspo2 == null) {
            bulkspo2 = "";
        }
        map.put("spo2", bulkspo2);
        String bulkPressure = trackdata.getBulkPressure();
        if (bulkPressure == null) {
            bulkPressure = "";
        }
        map.put(SportWebParams.PARAM_DETAIL_MENTAL_PRESSURE, bulkPressure);
        String bulkTemperature = trackdata.getBulkTemperature();
        if (bulkTemperature == null) {
            bulkTemperature = "";
        }
        map.put("temperature", bulkTemperature);
        String bulkRopeSkippingFreq = trackdata.getBulkRopeSkippingFreq();
        if (bulkRopeSkippingFreq == null) {
            bulkRopeSkippingFreq = "";
        }
        map.put("rope_skipping_frequency", bulkRopeSkippingFreq);
        String timeDeltaAltitude = trackdata.getTimeDeltaAltitude();
        if (timeDeltaAltitude == null) {
            timeDeltaAltitude = "";
        }
        map.put(SportWebParams.PARAM_DETAIL_TIME_DELTA_ALTITUDE, timeDeltaAltitude);
        String golfSwingRtData = trackdata.getGolfSwingRtData();
        if (golfSwingRtData == null) {
            golfSwingRtData = "";
        }
        map.put(SportWebParams.PARAM_DETAIL_GOLF_SWING_RT_DATA, golfSwingRtData);
        String powerMeter = trackdata.getPowerMeter();
        map.put(SportWebParams.PARAM_DETAIL_POWER_METER, powerMeter != null ? powerMeter : "");
        int i = modify ? 28 : 26;
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        return requester != null && requester.doHttpRequestSync(WEB_API_RUN_DETAIL, map, i, new ISportHttpResponseHandler() { // from class: com.huami.moving.webapi.PostRunningDataToServer.postDetailDataSync.1
            @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
            public void onCanceled(int type) {
            }

            @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
            public void onFailed(@NotNull String resp) {
            }

            @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
            public void onSuccessed(@NotNull String resp) {
            }
        });
    }

    @JvmStatic
    public static final void postRunningData(@Nullable final IHistoryRecordSyncCallBack syncCallBack) {
        sSyncDataSubscription = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue())), new WhereCondition[0]).rx().list().observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: k26
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.Q(syncCallBack, (List) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new Func1() { // from class: i26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.R((List) obj);
            }
        }).flatMap(new Func1() { // from class: d26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.Y((Trackrecord) obj);
            }
        }).map(new Func1() { // from class: w16
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.b0((Pair) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: p16
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.c0(syncCallBack, (Trackrecord) obj);
            }
        }).observeOn(Schedulers.io()).toList().doOnNext(new Action1() { // from class: s16
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.S((List) obj);
            }
        }).flatMap(new Func1() { // from class: f26
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.W((List) obj);
            }
        }).filter(new Func1() { // from class: z16
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PostRunningDataToServer.X((Trackrecord) obj);
            }
        }).toList().toSingle().observeOn(AndroidSchedulers.mainThread()).subscribe(new SingleSubscriber<List<? extends Trackrecord>>() { // from class: com.huami.moving.webapi.PostRunningDataToServer.postRunningData.9
            @Override // rx.SingleSubscriber
            public void onError(@NotNull Throwable throwable) {
                throwable.printStackTrace();
                IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack = syncCallBack;
                if (iHistoryRecordSyncCallBack == null) {
                    return;
                }
                iHistoryRecordSyncCallBack.notifySyncEnd(null);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(@NotNull List<? extends Trackrecord> unSyncedTrackRecords) {
                IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack = syncCallBack;
                if (iHistoryRecordSyncCallBack == null) {
                    return;
                }
                iHistoryRecordSyncCallBack.notifySyncEnd(unSyncedTrackRecords);
            }
        });
    }

    @JvmStatic
    public static final boolean postRunningDataInSynced() {
        return ((Boolean) Observable.create(new Action1() { // from class: t16
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PostRunningDataToServer.d0((Emitter) obj);
            }
        }, Emitter.BackpressureMode.LATEST).toBlocking().single()).booleanValue();
    }

    @JvmStatic
    public static final boolean postSummarySync(@NotNull Trackrecord trackrecord, boolean modify) {
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        Object minrtp = 0;
        if (!isNeedUploadSportDatas()) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("trackid", trackrecord.getTrackid());
        map.put("source", DataTypeSource.RunSource.getSourceByValue(trackrecord.getSource().intValue()));
        map.put("version", trackrecord.getV());
        String sn = SportUsingDeviceHandler.getInstance().getSN(trackrecord.getSource().intValue());
        if (sn == null) {
            sn = "";
        }
        map.put("sn", sn);
        String deviceId = SportUsingDeviceHandler.getInstance().getDeviceId(trackrecord.getSource().intValue());
        if (deviceId == null) {
            deviceId = "";
        }
        map.put("deviceid", deviceId);
        map.put("dis", trackrecord.getDistance());
        map.put("calorie", trackrecord.getCal());
        map.put("end_time", trackrecord.getEndtime());
        map.put("run_time", trackrecord.getCosttime());
        Object pace = trackrecord.getPace();
        if (pace == null) {
            pace = minrtp;
        }
        map.put("avg_pace", pace);
        Integer sfreq = trackrecord.getSfreq();
        map.put("avg_frequency", Integer.valueOf(sfreq == null ? 0 : sfreq.intValue()));
        Integer avghr = trackrecord.getAvghr();
        map.put("avg_heart_rate", Integer.valueOf(avghr == null ? 0 : avghr.intValue()));
        Object type = trackrecord.getType();
        if (type == null) {
            type = "";
        }
        map.put("type", type);
        String location = trackrecord.getLocation();
        if (location == null) {
            location = "";
        }
        map.put("location", location);
        String locationdesc = trackrecord.getLocationdesc();
        if (locationdesc == null) {
            locationdesc = "";
        }
        map.put("city", locationdesc);
        Integer ffpercent = trackrecord.getFfpercent();
        map.put("forefoot_ratio", Integer.valueOf(ffpercent == null ? 0 : ffpercent.intValue()));
        String device = trackrecord.getDevice();
        if (device == null) {
            device = "";
        }
        map.put("bind_device", device);
        map.put("max_pace", (trackrecord.getMaxrtp() == null || Float.isNaN(trackrecord.getMaxrtp().floatValue())) ? minrtp : trackrecord.getMaxrtp());
        if (trackrecord.getMinrtp() != null && !Float.isNaN(trackrecord.getMinrtp().floatValue())) {
            minrtp = trackrecord.getMinrtp();
        }
        map.put("min_pace", minrtp);
        Integer altitudeAscend = trackrecord.getAltitudeAscend();
        map.put("altitude_ascend", Integer.valueOf(altitudeAscend == null ? 0 : altitudeAscend.intValue()));
        Integer altitudeDescend = trackrecord.getAltitudeDescend();
        map.put("altitude_descend", Integer.valueOf(altitudeDescend == null ? 0 : altitudeDescend.intValue()));
        Integer totalStep = trackrecord.getTotalStep();
        map.put("total_step", Integer.valueOf(totalStep == null ? 0 : totalStep.intValue()));
        Integer avgStrideLength = trackrecord.getAvgStrideLength();
        map.put("avg_stride_length", Integer.valueOf(avgStrideLength == null ? 0 : avgStrideLength.intValue()));
        Integer landingTime = trackrecord.getLandingTime();
        map.put("landing_time", Integer.valueOf(landingTime == null ? -1 : landingTime.intValue()));
        Integer flightRatio = trackrecord.getFlightRatio();
        map.put("flight_ratio", Integer.valueOf(flightRatio == null ? -1 : flightRatio.intValue()));
        Integer climbDisascend = trackrecord.getClimbDisascend();
        map.put("distance_ascend", Integer.valueOf(climbDisascend == null ? -1 : climbDisascend.intValue()));
        Integer climbDisDescend = trackrecord.getClimbDisDescend();
        map.put("climb_dis_descend", Integer.valueOf(climbDisDescend == null ? -1 : climbDisDescend.intValue()));
        Integer climbDisAscendTime = trackrecord.getClimbDisAscendTime();
        map.put("climb_dis_ascend_time", Integer.valueOf(climbDisAscendTime == null ? -1 : climbDisAscendTime.intValue()));
        Integer climbDisDescendTime = trackrecord.getClimbDisDescendTime();
        map.put("climb_dis_descend_time", Integer.valueOf(climbDisDescendTime == null ? -1 : climbDisDescendTime.intValue()));
        Integer swimSWOLF = trackrecord.getSwimSWOLF();
        map.put("swolf", Integer.valueOf(swimSWOLF == null ? -1 : swimSWOLF.intValue()));
        Integer type2 = trackrecord.getType();
        if (type2 != null && type2.intValue() == 23) {
            map.put("total_strokes", Integer.valueOf(trackrecord.getRopeSkippingCount()));
        } else {
            Integer swimStrokes = trackrecord.getSwimStrokes();
            map.put("total_strokes", Integer.valueOf(swimStrokes == null ? -1 : swimStrokes.intValue()));
        }
        Integer swimTurns = trackrecord.getSwimTurns();
        map.put("total_trips", Integer.valueOf(swimTurns == null ? -1 : swimTurns.intValue()));
        Object swimAvgStrokeSpeed = trackrecord.getSwimAvgStrokeSpeed();
        if (swimAvgStrokeSpeed == null) {
            swimAvgStrokeSpeed = -1;
        }
        map.put("avg_stroke_speed", swimAvgStrokeSpeed);
        Object swimMaxStrokeSpeed = trackrecord.getSwimMaxStrokeSpeed();
        if (swimMaxStrokeSpeed == null) {
            swimMaxStrokeSpeed = -1;
        }
        map.put("max_stroke_speed", swimMaxStrokeSpeed);
        Object swimDistancePerStroke = trackrecord.getSwimDistancePerStroke();
        if (swimDistancePerStroke == null) {
            swimDistancePerStroke = -1;
        }
        map.put("avg_distance_per_stroke", swimDistancePerStroke);
        Integer swimPoolLength = trackrecord.getSwimPoolLength();
        map.put("swim_pool_length", Integer.valueOf(swimPoolLength == null ? -1 : swimPoolLength.intValue()));
        Integer swimStyle = trackrecord.getSwimStyle();
        map.put("swim_style", Integer.valueOf(swimStyle == null ? -1 : swimStyle.intValue()));
        Integer leftLandingTime = trackrecord.getLeftLandingTime();
        map.put("left_landing_time", Integer.valueOf(leftLandingTime == null ? -1 : leftLandingTime.intValue()));
        Integer leftFlightRatio = trackrecord.getLeftFlightRatio();
        map.put("left_flight_ratio", Integer.valueOf(leftFlightRatio == null ? -1 : leftFlightRatio.intValue()));
        Integer rightLandingTime = trackrecord.getRightLandingTime();
        map.put("right_landing_time", Integer.valueOf(rightLandingTime == null ? -1 : rightLandingTime.intValue()));
        Integer rightFlightRatio = trackrecord.getRightFlightRatio();
        map.put("right_flight_ratio", Integer.valueOf(rightFlightRatio == null ? -1 : rightFlightRatio.intValue()));
        String addInfo = trackrecord.getAddInfo();
        if (addInfo == null) {
            addInfo = "";
        }
        map.put("add_info", addInfo);
        map.put("sport_mode", Integer.valueOf(trackrecord.getSportMode()));
        map.put("downhill_num", Integer.valueOf(trackrecord.getDownhillNumber()));
        map.put("downhill_max_altitude_desend", Integer.valueOf(trackrecord.getMaxDownhillFallMileage()));
        map.put("fore_hand", Integer.valueOf(trackrecord.getTennisForeHand()));
        map.put("back_hand", Integer.valueOf(trackrecord.getTennisBackHand()));
        map.put("serve", Integer.valueOf(trackrecord.getTennisServe()));
        map.put("second_half_start_time", Integer.valueOf(trackrecord.getHalfStartTime()));
        map.put("rope_skipping_count", Integer.valueOf(trackrecord.getRopeSkippingCount()));
        map.put("rope_skipping_avg_frequency", Integer.valueOf(trackrecord.getRopeSkippingAvgFrequency()));
        map.put("rope_skipping_max_frequency", Integer.valueOf(trackrecord.getRopeSkippingMaxFrequency()));
        map.put("rope_skipping_rest_time", Long.valueOf(trackrecord.getRopeSkippingRestTime()));
        String marathon = trackrecord.getMarathon();
        if (marathon == null) {
            marathon = "";
        }
        map.put("marathon", marathon);
        map.put("max_frequency", Integer.valueOf(trackrecord.getMaxSFreq()));
        map.put("total_group", Integer.valueOf(trackrecord.getTotalGroup()));
        Integer avgCadence = trackrecord.getAvgCadence();
        map.put("avg_cadence", Integer.valueOf(avgCadence == null ? -1 : avgCadence.intValue()));
        Integer maxCadence = trackrecord.getMaxCadence();
        map.put("max_cadence", Integer.valueOf(maxCadence == null ? -1 : maxCadence.intValue()));
        Long parentTrackId = trackrecord.getParentTrackId();
        map.put("parent_trackid", Long.valueOf(parentTrackId == null ? -1L : parentTrackId.longValue()));
        String childListData = trackrecord.getChildListData();
        if (childListData == null) {
            childListData = "";
        }
        map.put("child_list", childListData);
        Integer maxHR = trackrecord.getMaxHR();
        map.put("max_heart_rate", Integer.valueOf(maxHR == null ? -1 : maxHR.intValue()));
        Integer minHR = trackrecord.getMinHR();
        map.put("min_heart_rate", Integer.valueOf(minHR == null ? -1 : minHR.intValue()));
        Integer teValue = trackrecord.getTeValue();
        map.put("te", Integer.valueOf(teValue == null ? -1 : teValue.intValue()));
        Integer teAnaerobicValue = trackrecord.getTeAnaerobicValue();
        map.put(SportWebParams.PARAM_SUMMARY_TE_ANAEROBIC, Integer.valueOf(teAnaerobicValue == null ? -1 : teAnaerobicValue.intValue()));
        Integer unit = trackrecord.getUnit();
        map.put("unit", Integer.valueOf(unit == null ? 0 : unit.intValue()));
        map.put("strokes", Integer.valueOf(trackrecord.getTouchStrokes()));
        map.put(SportWebParams.PARAM_SUMMARY_TARGET_TYPE, Integer.valueOf(trackrecord.getTargetType()));
        map.put(SportWebParams.PARAM_SUMMARY_TARGET_VALUE, Integer.valueOf(trackrecord.getTargetValue()));
        map.put(SportWebParams.PARAM_SUMMARY_SPO2_MAX, Integer.valueOf(trackrecord.getSpo2Max()));
        map.put(SportWebParams.PARAM_SUMMARY_SPO2_MIN, Integer.valueOf(trackrecord.getSpo2Min()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_ALTITUDE, (trackrecord.getAvgAltitude() == null || Float.isNaN(trackrecord.getAvgAltitude().floatValue())) ? Float.valueOf(-20000.0f) : trackrecord.getAvgAltitude());
        map.put(SportWebParams.PARAM_SUMMARY_MAX_SLOPE, Integer.valueOf(trackrecord.getMaxSlope()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_SLOPE, Integer.valueOf(trackrecord.getAvgSlope()));
        Object avgPulloarTime = trackrecord.getAvgPulloarTime();
        if (avgPulloarTime == null) {
            avgPulloarTime = -1;
        }
        map.put(SportWebParams.PARAM_SUMMARY_AVG_PULLOAR_TIME, avgPulloarTime);
        Object avgReturnTime = trackrecord.getAvgReturnTime();
        if (avgReturnTime == null) {
            avgReturnTime = -1;
        }
        map.put(SportWebParams.PARAM_SUMMARY_AVG_RETURN_TIME, avgReturnTime);
        map.put(SportWebParams.PARAM_SUMMARY_FLOOR_NUMBER, Integer.valueOf(trackrecord.getFloorNumber()));
        Object upstairsHeight = trackrecord.getUpstairsHeight();
        if (upstairsHeight == null) {
            upstairsHeight = -1;
        }
        map.put(SportWebParams.PARAM_SUMMARY_UPSTAIRS_HEIGHT, upstairsHeight);
        Object minUpstairsFloors = trackrecord.getMinUpstairsFloors();
        if (minUpstairsFloors == null) {
            minUpstairsFloors = -1;
        }
        map.put(SportWebParams.PARAM_SUMMARY_MIN_UPSTAIRS_FLOORS, minUpstairsFloors);
        Boolean autoRecognition = trackrecord.getAutoRecognition();
        map.put(SportWebParams.AUTO_RECOGNITION, Boolean.valueOf(autoRecognition == null ? false : autoRecognition.booleanValue()));
        map.put(SportWebParams.ACCUMULATED_GAP, Integer.valueOf(trackrecord.getAccumulatedGap()));
        map.put("max_altitude", Integer.valueOf(trackrecord.getMaxAltitude()));
        map.put("min_altitude", Integer.valueOf(trackrecord.getMinAltitude()));
        String personalBest = trackrecord.getPersonalBest();
        if (personalBest == null) {
            personalBest = "";
        }
        map.put("pb", personalBest);
        String hrZone = trackrecord.getHrZone();
        if (hrZone == null) {
            hrZone = "";
        }
        map.put(SportWebParams.HEART_RANGE, hrZone);
        Integer hrSettingType = trackrecord.getHrSettingType();
        map.put(SportWebParams.HEARTRATE_SETTING_TYPE, Integer.valueOf(hrSettingType == null ? -1 : hrSettingType.intValue()));
        Integer pauseTime = trackrecord.getPauseTime();
        map.put(SportWebParams.PAUSE_TIME, Integer.valueOf(pauseTime != null ? pauseTime.intValue() : -1));
        map.put(SportWebParams.AVERAGE_PRESSURE, Integer.valueOf(trackrecord.getAveragePressure()));
        map.put(SportWebParams.MAXIMUM_PRESSURE, Integer.valueOf(trackrecord.getMaximumPressure()));
        map.put(SportWebParams.NUMBER_OF_BREAK, Integer.valueOf(trackrecord.getNumberOfBreak()));
        String courseTitle = trackrecord.getCourseTitle();
        if (courseTitle == null) {
            courseTitle = "";
        }
        map.put(SportWebParams.COURSE_TITLE, courseTitle);
        map.put(SportWebParams.PARAM_SUMMARY_DOWNSTAIRS_FLOORS, trackrecord.getDownstairsFloors());
        map.put(SportWebParams.PARAM_SUMMARY_DOWNSTAIRS_HEIGHT, trackrecord.getDownstairsHeight());
        map.put(SportWebParams.PARAM_SUMMARY_MIN_PRESSURE, trackrecord.getMinPressure());
        map.put(SportWebParams.PARAM_SUMMARY_AVG_TEMPERATURE, trackrecord.getAverageTemperature());
        map.put(SportWebParams.PARAM_SUMMARY_MAX_TEMPERATURE, trackrecord.getHighestTemperature());
        map.put(SportWebParams.PARAM_SUMMARY_MIN_TEMPERATURE, trackrecord.getLowestTemperature());
        map.put(SportWebParams.PARAM_SUMMARY_EXERCISE_LOAD, trackrecord.getThisExerciseLoad());
        map.put(SportWebParams.PARAM_SUMMARY_VO2_MAX, trackrecord.getMaxVO2());
        map.put(SportWebParams.PARAM_SUMMARY_TOTAL_SWING, Integer.valueOf(trackrecord.getTotalSwing()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_BEAT, Float.valueOf(trackrecord.getAverageBeat()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_UP_TIME, Float.valueOf(trackrecord.getAverageUpTime()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_DOWN_TIME, Float.valueOf(trackrecord.getAverageDownTime()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_ANGLE, Integer.valueOf(trackrecord.getAverageAngle()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_SCORE, Integer.valueOf(trackrecord.getAverageScore()));
        map.put(SportWebParams.PARAM_SUMMARY_AVG_POWER, Float.valueOf(trackrecord.getAveragePower()));
        map.put(SportWebParams.PARAM_SUMMARY_MAX_POWER, Float.valueOf(trackrecord.getMaxPower()));
        map.put(SportWebParams.PARAM_SUMMARY_WORK_VALUE, Float.valueOf(trackrecord.getWorkValue()));
        String strengthTrainingGroup = trackrecord.getStrengthTrainingGroup();
        map.put(SportWebParams.PARAM_SUMMARY_STRENGTH_TRAINING_GROUP, strengthTrainingGroup != null ? strengthTrainingGroup : "");
        return requester != null && requester.doHttpRequestSync(WEB_API_RUN_SUMMARY, map, modify ? 28 : 26, new ISportHttpResponseHandler() { // from class: com.huami.moving.webapi.PostRunningDataToServer.postSummarySync.1
            @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
            public void onCanceled(int type3) {
            }

            @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
            public void onFailed(@NotNull String resp) {
            }

            @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
            public void onSuccessed(@NotNull String resp) {
            }
        });
    }
}
