package com.huami.moving.webapi;

import com.huami.mifit.sportlib.webkit.ISportHttpRequester;
import com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler;
import com.huami.mifit.sportlib.webkit.SportHttpKit;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.huami.moving.webapi.GetRunningHistoryRecordAPI;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.Observable;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public class GetRunningHistoryRecordAPI {
    public static final String TAG = "GetRunningHistoryRecordAPI";
    private static final String a = "summary";
    private static final String b = "v1/sport/run/history.json";
    private static final int c = 1;
    private static final int d = 5;
    private static String e = "0";
    private static final int f = -1;

    public class a implements ISportHttpResponseHandler {
        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            try {
                JSONArray jSONArrayOptJSONArray = str.substring(0, 1).toCharArray()[0] == '{' ? new JSONObject(str).optJSONArray("summary") : null;
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
                TrackrecordDao trackrecordDao = HMDaoManager.getInstance().getTrackrecordDao();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        Trackrecord sportRecord = SportWebDataConverter.INSTANCE.parseSportRecord(jSONArrayOptJSONArray.getJSONObject(i));
                        if (!SportRecordQueryConstrainUtils.isSilentProcessSportType(sportRecord.getType().intValue()) && trackrecordDao.queryBuilder().where(TrackrecordDao.Properties.Trackid.eq(sportRecord.getTrackid()), new WhereCondition[0]).where(TrackrecordDao.Properties.Source.eq(sportRecord.getSource()), new WhereCondition[0]).count() == 0) {
                            arrayList.add(sportRecord);
                        }
                    } catch (Exception e) {
                        HMLog.i(GetRunningHistoryRecordAPI.TAG, e.getMessage(), new Object[0]);
                    }
                }
                trackrecordDao.insertOrReplaceInTx(arrayList);
                arrayList.clear();
            } catch (Exception e2) {
                HMLog.i(GetRunningHistoryRecordAPI.TAG, e2.getMessage(), new Object[0]);
            }
        }
    }

    public class b implements ISportHttpResponseHandler {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            try {
                JSONArray jSONArrayOptJSONArray = str.substring(0, 1).toCharArray()[0] == '{' ? new JSONObject(str).optJSONArray("summary") : null;
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
                TrackrecordDao trackrecordDao = HMDaoManager.getInstance().getTrackrecordDao();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        Trackrecord sportRecord = SportWebDataConverter.INSTANCE.parseSportRecord(jSONArrayOptJSONArray.getJSONObject(i));
                        if (!SportRecordQueryConstrainUtils.isSilentProcessSportType(sportRecord.getType().intValue())) {
                            this.a.add(sportRecord);
                        }
                    } catch (Exception e) {
                        HMLog.i(GetRunningHistoryRecordAPI.TAG, e.getMessage(), new Object[0]);
                    }
                }
                trackrecordDao.insertOrReplaceInTx(arrayList);
                arrayList.clear();
            } catch (Exception e2) {
                HMLog.i(GetRunningHistoryRecordAPI.TAG, e2.getMessage(), new Object[0]);
            }
        }
    }

    private static boolean e(long j, int i, String... strArr) {
        HashMap map = new HashMap();
        map.put("type", e);
        if (strArr == null || strArr.length != 2) {
            if (j > 0) {
                map.put("trackid", Long.valueOf(j));
            }
            map.put("count", Integer.valueOf(i));
        } else {
            map.put("from", strArr[0]);
            map.put("to", strArr[1]);
        }
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        return requester != null && requester.doHttpRequestSync(b, map, 27, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void f() throws Exception {
        e(System.currentTimeMillis() / 1000, 5, new String[0]);
        return null;
    }

    public static Observable<Void> fetchLatestSportRecordInRx() {
        return Observable.fromCallable(new Callable() { // from class: vf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GetRunningHistoryRecordAPI.f();
            }
        }).subscribeOn(Schedulers.io());
    }

    public static Trackrecord fetchLineRecordById(long j, String str) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        map.put("type", str);
        if (j > 0) {
            map.put("trackid", Long.valueOf(j));
        }
        map.put("count", 1);
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null || !requester.doHttpRequestSync(b, map, 27, new b(arrayList))) {
            return null;
        }
        return (Trackrecord) arrayList.get(0);
    }

    public static Observable<Boolean> fetchSpecificSportRecordInRx(final long j, int i) {
        return Observable.fromCallable(new Callable() { // from class: sf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GetRunningHistoryRecordAPI.g(j);
            }
        }).subscribeOn(Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean g(long j) throws Exception {
        return Boolean.valueOf(e(j, 1, new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean h(long j, int i) throws Exception {
        return Boolean.valueOf(e(j, i, new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(String str, String str2) throws Exception {
        return Boolean.valueOf(e(0L, 0, str, str2));
    }

    public static Observable<Boolean> loadRunningHistoryRecordInRxBySyncTime(final long j, final int i) {
        return Observable.fromCallable(new Callable() { // from class: tf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GetRunningHistoryRecordAPI.h(j, i);
            }
        }).subscribeOn(Schedulers.io());
    }

    public static Observable<Boolean> loadRunningHistoryRecordInRxByTimeRange(final String str, final String str2) {
        return Observable.fromCallable(new Callable() { // from class: uf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GetRunningHistoryRecordAPI.i(str, str2);
            }
        }).subscribeOn(Schedulers.io());
    }

    public static void setQueryType(String str) {
        e = str;
    }
}
