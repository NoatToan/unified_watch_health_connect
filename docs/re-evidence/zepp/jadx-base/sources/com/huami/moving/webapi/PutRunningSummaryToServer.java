package com.huami.moving.webapi;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.hkwebapi.HttpKitCommonAPI;
import com.huami.moving.webapi.PutRunningSummaryToServer;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import defpackage.jw4;
import java.util.List;
import java.util.Map;
import org.greenrobot.greendao.query.WhereCondition;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public class PutRunningSummaryToServer {
    private static final String a = "v1/sport/run/summary.json";

    public class a implements HttpKitCommonAPI.PutRequestListener {
        public final /* synthetic */ Trackrecord a;

        public a(Trackrecord trackrecord) {
            this.a = trackrecord;
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestErrorListener() {
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestSuccessListener() {
            this.a.setState(Integer.valueOf(SyncedState.STATE_SYNCED_TO_SERVER.getValue()));
            HMDaoManager.getInstance().getTrackrecordDao().insertOrReplace(this.a);
        }
    }

    public class b implements HttpKitCommonAPI.PutRequestListener {
        public final /* synthetic */ Trackrecord a;

        public b(Trackrecord trackrecord) {
            this.a = trackrecord;
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestErrorListener() {
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestSuccessListener() {
            this.a.setState(Integer.valueOf(SyncedState.STATE_SYNCED_TO_SERVER.getValue()));
            HMDaoManager.getInstance().getTrackrecordDao().insertOrReplace(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(PostRunningDataToServer.IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, List list) {
        if (iHistoryRecordSyncCallBack != null) {
            iHistoryRecordSyncCallBack.notifySyncBegin(list.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Trackrecord h(Trackrecord trackrecord) {
        putRunSyncSummary(trackrecord);
        return trackrecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(PostRunningDataToServer.IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, Trackrecord trackrecord) {
        if (iHistoryRecordSyncCallBack != null) {
            if (trackrecord.getState().intValue() == SyncedState.STATE_SYNCED_TO_SERVER.getValue()) {
                iHistoryRecordSyncCallBack.notifySyncSuccess(trackrecord);
            } else {
                iHistoryRecordSyncCallBack.notifySyncFail(trackrecord);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean j(Trackrecord trackrecord) {
        return Boolean.valueOf(trackrecord.getState().intValue() == SyncedState.STATE_UNSYNCED.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(PostRunningDataToServer.IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, List list) {
        if (iHistoryRecordSyncCallBack != null) {
            iHistoryRecordSyncCallBack.notifySyncEnd(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(PostRunningDataToServer.IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack, Throwable th) {
        th.printStackTrace();
        if (iHistoryRecordSyncCallBack != null) {
            iHistoryRecordSyncCallBack.notifySyncEnd(null);
        }
    }

    public static void putRunSummary(final PostRunningDataToServer.IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack) {
        HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.STATE_SYNC_AGAIN.getValue())), new WhereCondition[0]).rx().list().observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: e56
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PutRunningSummaryToServer.g(iHistoryRecordSyncCallBack, (List) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(jw4.a).map(new Func1() { // from class: g56
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PutRunningSummaryToServer.h((Trackrecord) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: c56
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PutRunningSummaryToServer.i(iHistoryRecordSyncCallBack, (Trackrecord) obj);
            }
        }).observeOn(Schedulers.io()).toList().flatMap(jw4.a).filter(new Func1() { // from class: h56
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PutRunningSummaryToServer.j((Trackrecord) obj);
            }
        }).toList().observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: f56
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PutRunningSummaryToServer.k(iHistoryRecordSyncCallBack, (List) obj);
            }
        }, new Action1() { // from class: d56
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                PutRunningSummaryToServer.l(iHistoryRecordSyncCallBack, (Throwable) obj);
            }
        });
    }

    public static void putRunSyncSummary(Trackrecord trackrecord) {
        String url = HMServerDef.getUrl(a);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("trackid", trackrecord.getTrackid());
        systemParams.put("source", DataTypeSource.RunSource.getSourceByValue(trackrecord.getSource().intValue()));
        systemParams.put("dis", trackrecord.getDistance());
        systemParams.put("avg_pace", trackrecord.getPace());
        systemParams.put("indoor_run_calibrated", trackrecord.getIndoorRunCalibrated());
        HttpKitCommonAPI.putRequestAPI(url, systemParams, new b(trackrecord));
    }

    public static void putRunSummary(Trackrecord trackrecord) {
        String url = HMServerDef.getUrl(a);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("trackid", trackrecord.getTrackid());
        systemParams.put("source", DataTypeSource.RunSource.getSourceByValue(trackrecord.getSource().intValue()));
        systemParams.put("dis", trackrecord.getDistance());
        systemParams.put("avg_pace", trackrecord.getPace());
        systemParams.put("indoor_run_calibrated", trackrecord.getIndoorRunCalibrated());
        HttpKitCommonAPI.putRequestAPI(url, systemParams, new a(trackrecord));
    }
}
