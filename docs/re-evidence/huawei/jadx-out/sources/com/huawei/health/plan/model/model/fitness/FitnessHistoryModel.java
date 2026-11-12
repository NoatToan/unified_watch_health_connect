package com.huawei.health.plan.model.model.fitness;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.model.FitnessSummaryRecord;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import defpackage.btt;
import defpackage.ghw;
import defpackage.gls;
import defpackage.glw;
import defpackage.gmc;
import defpackage.gmh;
import defpackage.gmv;
import defpackage.gmw;
import defpackage.gzm;
import defpackage.ift;
import defpackage.lsl;
import defpackage.njy;
import defpackage.ntx;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class FitnessHistoryModel {
    private static final int ACCOUNT_NULL = -2;
    private static final String CALORIE = "calorie";
    private static final String DATE = "date";
    private static final String DURING = "during";
    public static final int FAILURE_CODE = 1;
    public static final String FITNESS_HISTORY_LAST_SYNC = "fitness_history_last_sync";
    private static final int FITNESS_RECORD_TYPE = 1;
    private static final String FROM = " from ";
    private static final int HAS_MORE_DATA = 1000;
    private static final Object LOCK = new Object();
    public static final String MMKV_FITNESS_HISTORY_MODULE = "MMKV_FITNESS_HISTORY_MODULE";
    private static final int NO_MORE_DATA = 1001;
    private static final long ONE_SECOND_IN_MILLISECOND = 1000;
    private static final int PARAMETER_INVALID = -1;
    private static final int RECEIVE_DATA = 1002;
    private static final String SQL_RULE = "?[0-9][0-9]?*";
    public static final int SUCCESS_CODE = 0;
    private static final String SYNC_LOCAL_WHERE_CASE = " (workoutId GLOB ? or wearType = 3) ";
    private static final int SYNC_RECENT_MONTHS = 3;
    private static final String TAG = "Suggestion_FitnessHistoryModel";
    private static final String TIMES = "times";
    private static final int WEAR_DEVICE_TYPE = 2;
    private static final String WHERE_CASE = " (workoutId GLOB ? or wearType = 3) and (sportRecordType = 0) ";
    private CopyOnWriteArrayList<WorkoutRecord> mCloudData;
    private JSONArray mCloudDataNumber;
    private long mDeletingRecord;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private boolean mIsDownloadingWorkoutRecords;
    private boolean mIsNeedAdd;
    private ResultCallback mResultCallback;

    private FitnessHistoryModel() {
        this.mIsDownloadingWorkoutRecords = false;
        this.mIsNeedAdd = false;
        this.mDeletingRecord = 0L;
        this.mHandlerThread = new HandlerThread("fitnessRecordSync");
        this.mCloudData = new CopyOnWriteArrayList<>();
        if (!this.mHandlerThread.isAlive()) {
            this.mHandlerThread.start();
        }
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel.1
            int start = 0;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                switch (message.what) {
                    case 1000:
                        FitnessHistoryModel.this.onHasMoreData(message);
                        break;
                    case 1001:
                        LogUtil.a(FitnessHistoryModel.TAG, "NO_MORE_DATA");
                        FitnessHistoryModel.this.onNoMoreData(message);
                        this.start++;
                        break;
                    case 1002:
                        LogUtil.a(FitnessHistoryModel.TAG, "RECEIVE_DATA START = ", Integer.valueOf(this.start));
                        if (this.start == 0 && (message.obj instanceof JSONArray)) {
                            JSONArray jSONArray = (JSONArray) message.obj;
                            FitnessHistoryModel fitnessHistoryModel = FitnessHistoryModel.this;
                            fitnessHistoryModel.mCloudDataNumber = fitnessHistoryModel.getCloudDataNumber(jSONArray);
                        }
                        if (FitnessHistoryModel.this.mCloudDataNumber != null && this.start < FitnessHistoryModel.this.mCloudDataNumber.length()) {
                            JSONObject jSONObjectOptJSONObject = FitnessHistoryModel.this.mCloudDataNumber.optJSONObject(this.start);
                            if (jSONObjectOptJSONObject == null) {
                                LogUtil.j(FitnessHistoryModel.TAG, "RECEIVE_DATA object == null");
                            } else {
                                LogUtil.a(FitnessHistoryModel.TAG, "queryTrainCount month: ", jSONObjectOptJSONObject.optString("months"), " count: ", jSONObjectOptJSONObject.optString("count"));
                                if (FitnessHistoryModel.this.compareFitnessRecordCount(jSONObjectOptJSONObject)) {
                                    this.start++;
                                    FitnessHistoryModel.this.mHandler.sendEmptyMessage(1002);
                                }
                            }
                        } else {
                            this.start = 0;
                            FitnessHistoryModel.this.onResultSuccess();
                            FitnessHistoryModel.this.setSyncUser();
                        }
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray getCloudDataNumber(JSONArray jSONArray) {
        if (getSyncUser() != null) {
            return jSONArray;
        }
        HashSet<String> recentMonthList = getRecentMonthList(System.currentTimeMillis(), 3);
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (recentMonthList.contains(jSONObject.getString("months"))) {
                    jSONArray2.put(jSONObject);
                }
            } catch (JSONException unused) {
                ReleaseLogUtil.d(TAG, "getCloudDataNumber JSONException");
            }
        }
        return jSONArray2;
    }

    private String getSyncUser() {
        String strB = SharedPreferenceManager.b(MMKV_FITNESS_HISTORY_MODULE, FITNESS_HISTORY_LAST_SYNC, "");
        String str = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault() + CommonUtil.e(BaseApplication.getContext());
        if (strB.equals(str)) {
            LogUtil.a(TAG, "syncUser=", str);
            return null;
        }
        ReleaseLogUtil.d(TAG, "firstSync syncUser=", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncUser() {
        String syncUser = getSyncUser();
        if (syncUser == null) {
            return;
        }
        SharedPreferenceManager.c(MMKV_FITNESS_HISTORY_MODULE, FITNESS_HISTORY_LAST_SYNC, syncUser);
    }

    private HashSet<String> getRecentMonthList(long j, int i) {
        HashSet<String> hashSet = new HashSet<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(String.valueOf(HiDateUtil.d(lsl.e(j, 0 - i2)) / 100));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onResultSuccess() {
        ResultCallback resultCallback = this.mResultCallback;
        if (resultCallback != null) {
            resultCallback.onResult(0, new Object());
        } else {
            LogUtil.j(TAG, "mResultCallback is null");
        }
        synchronized (LOCK) {
            this.mIsDownloadingWorkoutRecords = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNoMoreData(Message message) {
        compareData(getWorkoutRecordsSyncByMonth(((Long) message.obj).longValue() * 1000), this.mCloudData);
        this.mCloudData.clear();
        Message messageObtain = Message.obtain();
        messageObtain.what = 1002;
        messageObtain.obj = new Object();
        this.mHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onHasMoreData(Message message) {
        LogUtil.a(TAG, "HAS_MORE_DATA");
        if (message.obj instanceof Bundle) {
            Bundle bundle = (Bundle) message.obj;
            postFitnessHistoryRequest(bundle.getLong("startTime"), bundle.getLong("endTime"), bundle.getInt("pageNum") + 1);
        }
    }

    static class SingletonHolder {
        private static final FitnessHistoryModel INSTANCE = new FitnessHistoryModel();

        private SingletonHolder() {
        }
    }

    public static FitnessHistoryModel getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void compareData(List<WorkoutRecord> list, List<WorkoutRecord> list2) {
        LogUtil.a(TAG, "compareData ");
        if (list2 == null) {
            LogUtil.j(TAG, "cloud has no fitness history record");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo == null) {
            LogUtil.j(TAG, "compareData() mAccountInfo or huid is null!");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j(TAG, "local has no fitness history record");
            addExercisedRecord(list2);
        } else {
            LogUtil.a(TAG, " loudData size is ", Integer.valueOf(list2.size()), " and localData is ", Integer.valueOf(list.size()));
            compare(list, list2, accountInfo);
        }
    }

    private void compare(List<WorkoutRecord> list, List<WorkoutRecord> list2, String str) {
        boolean z;
        for (WorkoutRecord workoutRecord : list2) {
            if (workoutRecord == null) {
                LogUtil.j(TAG, "waring cloudTmpRecord == null");
            } else {
                int iAcquireId = workoutRecord.acquireId();
                LogUtil.a(TAG, "local has same history recordId: ", Integer.valueOf(iAcquireId), "exerciseTime:", Long.valueOf(workoutRecord.acquireExerciseTime()));
                int i = 0;
                if (this.mIsNeedAdd && workoutRecord.acquireExerciseTime() / 1000 == this.mDeletingRecord / 1000) {
                    LogUtil.a(TAG, "compareData recordId = 0 but need to delete this record");
                    gmc.g().n().b(str, "", 9, String.valueOf(iAcquireId));
                    this.mIsNeedAdd = false;
                    this.mDeletingRecord = 0L;
                    z = true;
                } else {
                    z = false;
                }
                while (true) {
                    if (i >= list.size()) {
                        if (!z) {
                            addExercisedRecord(workoutRecord);
                            break;
                        }
                        break;
                    } else {
                        WorkoutRecord workoutRecord2 = list.get(i);
                        if (workoutRecord.acquireExerciseTime() / 1000 == workoutRecord2.acquireExerciseTime() / 1000) {
                            LogUtil.a(TAG, "the cloudTempRecord Id:", workoutRecord.acquireWorkoutId(), " exerciseTime:", Long.valueOf(workoutRecord.acquireExerciseTime()));
                            gmw.c(str, workoutRecord2, iAcquireId);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public void acquireAnnualExerciseRecordByAll(final ResultCallback resultCallback) throws Throwable {
        if (resultCallback == null) {
            LogUtil.j(TAG, "acquireExerciseRecordByAll callback == null");
            return;
        }
        LogUtil.a(TAG, "acquireExerciseRecordByAll");
        final String str = "select record.*, info.primaryClassify as primaryClassify, info.secondClassify as secondClassify from " + gmc.g().getTableFullName("workout_record") + " record inner join " + gmc.g().getTableFullName(gmh.c()) + " info on record.workoutId = info.workoutId where (record.workoutId GLOB ?  or record.wearType = 3) and (record.sportRecordType = 0) and record.userId = ?  order by exerciseTime desc";
        try {
            btt.d().c(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FitnessHistoryModel.lambda$acquireAnnualExerciseRecordByAll$0(str, resultCallback);
                }
            });
        } catch (SQLiteException e) {
            ReleaseLogUtil.a(TAG, "SQLiteException: ", LogAnonymous.b(e));
            gmc.g().i();
        }
    }

    static /* synthetic */ void lambda$acquireAnnualExerciseRecordByAll$0(String str, ResultCallback resultCallback) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{SQL_RULE, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)});
        if (cursorRawQueryStorageData != null) {
            while (cursorRawQueryStorageData.moveToNext()) {
                arrayList.add(gmw.c(cursorRawQueryStorageData));
            }
            cursorRawQueryStorageData.close();
        }
        resultCallback.onResult(0, arrayList);
    }

    public void acquireExerciseRecordByTimeAndId(long j, long j2, final String str, final String str2, final ResultCallback resultCallback) {
        LogUtil.a(TAG, "acquireExerciseRecordByTimeAndId");
        if (resultCallback == null) {
            LogUtil.j(TAG, "acquireExerciseRecordByTimeAndId callback == null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "acquireExerciseRecordByTimeAndId workOutId or version is empty");
            resultCallback.onResult(1, null);
            return;
        }
        if (j > j2 || j < 0) {
            LogUtil.j(TAG, "invalid time startTime = ", Long.valueOf(j), ". endTime = ", Long.valueOf(j2));
            resultCallback.onResult(1, null);
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo == null) {
            LogUtil.j(TAG, "acquireExerciseRecordByTimeAndId mAccountInfo is null");
            return;
        }
        final String str3 = "select * from " + gmc.g().getTableFullName("workout_record") + " where  (workoutId GLOB ? or wearType = 3) and (sportRecordType = 0)  and userId = ?  and exerciseTime >= " + j + " and exerciseTime <= " + j2 + " and workoutId = ? and version = ? order by finishRate desc";
        btt.d().c(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FitnessHistoryModel.lambda$acquireExerciseRecordByTimeAndId$1(str3, accountInfo, str, str2, resultCallback);
            }
        });
    }

    static /* synthetic */ void lambda$acquireExerciseRecordByTimeAndId$1(String str, String str2, String str3, String str4, ResultCallback resultCallback) {
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{SQL_RULE, str2, str3, str4});
        WorkoutRecord workoutRecord = new WorkoutRecord();
        if (cursorRawQueryStorageData != null) {
            LogUtil.a(TAG, "cursor not null");
            if (cursorRawQueryStorageData.moveToNext()) {
                workoutRecord = gmw.b(cursorRawQueryStorageData);
            }
            cursorRawQueryStorageData.close();
        }
        LogUtil.a(TAG, "onResult callback SUCCESS_CODE:", 0);
        resultCallback.onResult(0, workoutRecord);
    }

    public void acquireExerciseFinished(long j, long j2, final String str, final ResultCallback resultCallback) {
        LogUtil.a(TAG, "acquireExerciseFinished enter");
        if (resultCallback == null) {
            LogUtil.j(TAG, "acquireExerciseFinished callback == null");
            return;
        }
        if (j > j2 || j < 0 || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "acquireExerciseFinished invalid params startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2), ", workoutId = ", str);
            resultCallback.onResult(1, "invalid params");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo == null) {
            LogUtil.j(TAG, "acquireExerciseFinished mAccountInfo is null");
            resultCallback.onResult(1, "mAccountInfo is null");
            return;
        }
        final String str2 = "select finishRate from " + gmc.g().getTableFullName("workout_record") + " where  (workoutId GLOB ? or wearType = 3)  and userId = ?  and exerciseTime >= " + j + " and exerciseTime <= " + j2 + " and workoutId = ? order by finishRate desc limit 1";
        btt.d().c(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                FitnessHistoryModel.lambda$acquireExerciseFinished$2(str2, accountInfo, str, resultCallback);
            }
        });
    }

    static /* synthetic */ void lambda$acquireExerciseFinished$2(String str, String str2, String str3, ResultCallback resultCallback) {
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{SQL_RULE, str2, str3});
        float f = 0.0f;
        if (cursorRawQueryStorageData != null) {
            LogUtil.a(TAG, "acquireExerciseFinished cursor not null");
            f = cursorRawQueryStorageData.moveToNext() ? cursorRawQueryStorageData.getFloat(cursorRawQueryStorageData.getColumnIndex("finishRate")) : 0.0f;
            cursorRawQueryStorageData.close();
        }
        String strE = UnitUtil.e(f, 2, 0);
        String strE2 = UnitUtil.e(100.0d, 2, 0);
        boolean zEquals = strE.equals(strE2);
        LogUtil.a(TAG, "acquireExerciseFinished onResult callback finishRate = ", Float.valueOf(f), " localRate = ", strE, " targetRate = ", strE2, " isFinished = ", Boolean.valueOf(zEquals));
        resultCallback.onResult(0, Boolean.valueOf(zEquals));
    }

    private void getDataFromDb(SimpleDateFormat simpleDateFormat, List<FitnessTrackRecord> list, String str) {
        Date date;
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{SQL_RULE, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)});
        try {
            if (cursorRawQueryStorageData == null) {
                LogUtil.e(TAG, "getDataFrmDb cursor==null");
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                    return;
                }
                return;
            }
            while (cursorRawQueryStorageData.moveToNext()) {
                FitnessTrackRecord fitnessTrackRecord = new FitnessTrackRecord();
                float f = cursorRawQueryStorageData.getFloat(cursorRawQueryStorageData.getColumnIndex("calorie"));
                fitnessTrackRecord.saveSumCalorie(f);
                int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("times"));
                fitnessTrackRecord.saveSumExerciseTimes(i);
                fitnessTrackRecord.saveSumExerciseTime(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex(DURING)));
                String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("date"));
                fitnessTrackRecord.saveMonthDate(string);
                LogUtil.a(TAG, "date=", string, " cal=", Float.valueOf(f), " cnt=", Integer.valueOf(i));
                try {
                    if (TextUtils.isEmpty(string)) {
                        LogUtil.j(TAG, "getData dateString == null");
                        date = new Date();
                    } else {
                        date = simpleDateFormat.parse(string);
                    }
                    LogUtil.a(TAG, "monthZeroTime=", Long.valueOf(date.getTime()));
                    fitnessTrackRecord.saveMonthZeroTime(date.getTime());
                } catch (ParseException e) {
                    LogUtil.e(TAG, "getData e ", LogAnonymous.b(e));
                }
                fitnessTrackRecord.saveRecordType(10001);
                list.add(fitnessTrackRecord);
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        } catch (Throwable th) {
            if (cursorRawQueryStorageData != null) {
                try {
                    cursorRawQueryStorageData.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void acquireFitnessRecordCategoryList(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "acquireFitnessRecordCategoryList");
        btt.d().c(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                FitnessHistoryModel.lambda$acquireFitnessRecordCategoryList$3(iBaseResponseCallback);
            }
        });
    }

    static /* synthetic */ void lambda$acquireFitnessRecordCategoryList$3(IBaseResponseCallback iBaseResponseCallback) {
        String str = "select distinct category from " + gmc.g().getTableFullName("workout_record") + " where userId = ? and sportRecordType = 0 order by category";
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)});
        if (cursorRawQueryStorageData != null) {
            while (cursorRawQueryStorageData.moveToNext()) {
                int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("category"));
                if (i != 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            cursorRawQueryStorageData.close();
        }
        LogUtil.a(TAG, "categoryList is: ", arrayList);
        iBaseResponseCallback.a(0, arrayList);
    }

    private boolean isValidCheckParameters(ntx ntxVar, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "isValidCheckParameters callback == null");
            return false;
        }
        if (ntxVar.a() > ntxVar.e() || ntxVar.a() < 0) {
            LogUtil.j(TAG, "isValidCheckParameters startTime = ", Long.valueOf(ntxVar.a()), ". endTime = ", Long.valueOf(ntxVar.e()));
            iBaseResponseCallback.a(-1, "startTime > endTime");
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) != null) {
            return true;
        }
        LogUtil.j(TAG, "isValidCheckParameters mAccountInfo == null");
        iBaseResponseCallback.a(-2, "mAccountInfo == null");
        return false;
    }

    public void deleteFitnessRecord(WorkoutRecord workoutRecord, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "deleteFitnessRecord callback == null");
            return;
        }
        if (workoutRecord == null) {
            LogUtil.j(TAG, "deleteFitnessRecord record == null");
            iBaseResponseCallback.a(-1, "deleteFitnessRecord record == null");
            return;
        }
        int iAcquireId = workoutRecord.acquireId();
        LogUtil.a(TAG, "deleteFitnessRecord webId = ", Integer.valueOf(iAcquireId));
        if (workoutRecord.acquireWearType() == 2) {
            iBaseResponseCallback.a(-1, "deleteFitnessRecord record is device record, not support delete");
        }
        try {
            long jAcquireExerciseTime = workoutRecord.acquireExerciseTime();
            LogUtil.a(TAG, "deleteFitnessRecord exerciseTime = ", Long.valueOf(jAcquireExerciseTime));
            int iE = gmw.e(workoutRecord.acquireExerciseTime(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), workoutRecord.acquireWorkoutId());
            if (iAcquireId == 0) {
                LogUtil.a(TAG, "deleteFitnessRecord this record has no web Id");
                long j = jAcquireExerciseTime / 1000;
                getInstance().postFitnessHistoryRequest(j - 1, j + 1, 0);
                this.mDeletingRecord = jAcquireExerciseTime;
                this.mIsNeedAdd = true;
            } else {
                ReleaseLogUtil.d(TAG, "deleteFitnessRecord:", Integer.valueOf(workoutRecord.acquireId()), " ", workoutRecord.acquireWorkoutId(), " ", workoutRecord.acquireWorkoutName());
                gls.b().deleteWorkoutRecords(workoutRecord.acquireId(), 1, iBaseResponseCallback);
            }
            iBaseResponseCallback.a(iE, "fitnessRecord delete success");
        } catch (Exception e) {
            LogUtil.e(TAG, "deleteFitnessRecord ", LogAnonymous.b(e));
        }
    }

    public void deleteFitnessRecord(String str, long j, IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "not course record.");
            return;
        }
        WorkoutRecord workoutRecordB = gmv.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), j, str);
        if (workoutRecordB == null) {
            LogUtil.e(TAG, "deleteFitnessRecord mRecord == null");
            return;
        }
        if (workoutRecordB.acquireWorkoutId() == null || !workoutRecordB.acquireWorkoutId().equals(str)) {
            return;
        }
        deleteFitnessRecord(workoutRecordB, iBaseResponseCallback);
        int iAcquireId = workoutRecordB.acquireId();
        ReleaseLogUtil.d(TAG, "deleteFitnessRecord:", Integer.valueOf(iAcquireId), " ", workoutRecordB.acquireWorkoutId(), " ", workoutRecordB.acquireWorkoutName());
    }

    public WorkoutRecord acquireWorkoutRecordByRecordId(int i) {
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("workout_record") + " where  (workoutId GLOB ? or wearType = 3)  and userId = ?  and recordIndex = " + i, new String[]{SQL_RULE, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)});
        WorkoutRecord workoutRecordB = null;
        if (cursorRawQueryStorageData != null) {
            while (cursorRawQueryStorageData.moveToNext()) {
                workoutRecordB = gmw.b(cursorRawQueryStorageData);
            }
            cursorRawQueryStorageData.close();
        }
        return workoutRecordB;
    }

    private List<WorkoutRecord> getWorkoutRecordsSyncByMonth(long j) throws Throwable {
        StringBuilder sb = new StringBuilder();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo == null) {
            LogUtil.j(TAG, "getWorkoutRecordsSyncByMonth mAccountInfo is null");
            return null;
        }
        long jB = ift.b(j);
        long jE = ift.e(j);
        String str = "select * from " + gmc.g().getTableFullName("workout_record") + " where  (workoutId GLOB ? or wearType = 3)  and userId = ?  and exerciseTime between " + jB + " and " + jE + " order by exerciseTime desc";
        LogUtil.a(TAG, "search workout record start time: ", Long.valueOf(jB), "end time: ", Long.valueOf(jE));
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{SQL_RULE, accountInfo});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    arrayList.add(gmw.b(cursorRawQueryStorageData));
                }
                cursorRawQueryStorageData.close();
                return arrayList;
            }
        } catch (SQLiteException e) {
            LogUtil.e(TAG, "acquireDetailFitnessRecord failed! SQL:" + sb.toString(), e);
            ReleaseLogUtil.a(TAG, "SQLiteException: ", LogAnonymous.b(e));
            gmc.g().i();
        }
        return arrayList;
    }

    private void addExercisedRecord(List<WorkoutRecord> list) {
        if (list == null) {
            LogUtil.j(TAG, "addExercisedRecord records are null");
            return;
        }
        LogUtil.a(TAG, "addExercisedRecord multiple records ", Integer.valueOf(list.size()));
        for (int i = 0; i < list.size(); i++) {
            int iAcquireId = list.get(i).acquireId();
            if (this.mIsNeedAdd && list.get(i).acquireExerciseTime() / 1000 == this.mDeletingRecord / 1000) {
                gmc.g().n().b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), "", 9, String.valueOf(iAcquireId));
                this.mIsNeedAdd = false;
                this.mDeletingRecord = 0L;
            } else {
                addExercisedRecord(list.get(i));
            }
        }
    }

    private void addExercisedRecord(WorkoutRecord workoutRecord) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (workoutRecord == null) {
            LogUtil.j(TAG, "addExercisedRecord record is null");
            return;
        }
        if (accountInfo == null) {
            LogUtil.e(TAG, "mAccountInfo == null");
            return;
        }
        if (gmw.b(accountInfo, workoutRecord)) {
            LogUtil.j(TAG, "exercised record has exist.", Integer.valueOf(workoutRecord.acquireId()));
            return;
        }
        boolean zA = gmw.a(accountInfo, workoutRecord);
        int iAcquireId = workoutRecord.acquireId();
        LogUtil.a(TAG, "insert res=", Boolean.valueOf(zA), " ", Integer.valueOf(iAcquireId), " ", workoutRecord.acquireWorkoutName(), " pId=", workoutRecord.acquirePlanId());
        if (workoutRecord.getSportRecordType() != 0) {
            LogUtil.a(TAG, "addExercisedRecord : SportRecordType != 0");
        } else {
            gmc.g().k().c(accountInfo, workoutRecord.acquireExerciseTime(), workoutRecord.acquireActualCalorie(), workoutRecord.getDuration(), workoutRecord.acquireWorkoutId(), false);
        }
        if (TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
            return;
        }
        glw.c().e();
    }

    public void downloadFitnessRecordFromCloud(ResultCallback resultCallback) {
        synchronized (LOCK) {
            LogUtil.a(TAG, "downloadFitnessRecordFromCloud start");
            if (resultCallback == null) {
                LogUtil.j(TAG, "downloadFitnessRecordFromCloud start");
                return;
            }
            if (this.mIsDownloadingWorkoutRecords) {
                LogUtil.a(TAG, "downloadFitnessRecordFromCloud is downloading");
                resultCallback.onResult(-998, "repeat downloading");
            } else {
                this.mIsDownloadingWorkoutRecords = true;
                LogUtil.a(TAG, "downloadFitnessRecordFromCloud ", LoginInit.getInstance(BaseApplication.getContext()));
                this.mResultCallback = resultCallback;
                getFitnessHistoryByMonth();
            }
        }
    }

    public void unregisterResultCallback() {
        this.mResultCallback = null;
    }

    public void postFitnessHistoryRequest(final long j, final long j2, final int i) {
        LogUtil.a(TAG, "postFitnessHistoryRequest");
        ghw.b().queryTrainList(j, j2, i, new DataCallback() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel.2
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i2, String str) {
                LogUtil.j(FitnessHistoryModel.TAG, "postFitnessHistoryRequest ", str);
                FitnessHistoryModel.this.onDownloadFail();
                FitnessHistoryModel.this.mIsNeedAdd = false;
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("trainInfoList");
                if (jSONArrayOptJSONArray == null) {
                    LogUtil.a(FitnessHistoryModel.TAG, "no data");
                } else {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                    LogUtil.a(FitnessHistoryModel.TAG, "sTm=", simpleDateFormat.format(Long.valueOf(j * 1000)), ",eTm=", simpleDateFormat.format(Long.valueOf(j2 * 1000)));
                    FitnessHistoryModel.this.mCloudData.addAll(gzm.e(jSONArrayOptJSONArray));
                    gmw.d(FitnessHistoryModel.this.mCloudData);
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        LogUtil.d(FitnessHistoryModel.TAG, "postFitnessHistoryRequest onSuccess ", jSONArrayOptJSONArray.optJSONObject(i2).toString());
                    }
                }
                if (jSONObject.optBoolean("hasMore")) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1000;
                    Bundle bundle = new Bundle();
                    bundle.putLong("startTime", j);
                    bundle.putLong("endTime", j2);
                    bundle.putInt("pageNum", i);
                    messageObtain.obj = bundle;
                    FitnessHistoryModel.this.mHandler.sendMessage(messageObtain);
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 1001;
                messageObtain2.obj = Long.valueOf(j);
                FitnessHistoryModel.this.mHandler.sendMessage(messageObtain2);
            }
        });
    }

    private void getFitnessHistoryByMonth() {
        ghw.b().queryTrainCount(new DataCallback() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel.3
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.j(FitnessHistoryModel.TAG, "queryTrainCount errorCode = ", Integer.valueOf(i), "errorInfo = ", str);
                FitnessHistoryModel.this.onDownloadFail();
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    LogUtil.j(FitnessHistoryModel.TAG, "queryTrainCount no data");
                    FitnessHistoryModel.this.onDownloadFail();
                    return;
                }
                LogUtil.a(FitnessHistoryModel.TAG, "received message: ", jSONObject);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("monthTrainList");
                if (jSONArrayOptJSONArray != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = jSONArrayOptJSONArray;
                    messageObtain.what = 1002;
                    FitnessHistoryModel.this.mHandler.sendMessage(messageObtain);
                    return;
                }
                LogUtil.j(FitnessHistoryModel.TAG, "queryTrainCount no data");
                FitnessHistoryModel.this.onDownloadFail();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDownloadFail() {
        synchronized (LOCK) {
            this.mIsDownloadingWorkoutRecords = false;
        }
        ResultCallback resultCallback = this.mResultCallback;
        if (resultCallback != null) {
            resultCallback.onResult(-997, RecommendConstants.DOWNLOAD_FAIL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean compareFitnessRecordCount(JSONObject jSONObject) throws Throwable {
        int i;
        Date date;
        String strOptString = jSONObject.optString("months");
        String strOptString2 = jSONObject.optString("count");
        if (strOptString.isEmpty() || strOptString2.isEmpty()) {
            LogUtil.j(TAG, "invalid data");
            return true;
        }
        try {
            i = Integer.parseInt(strOptString2);
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "parse wrong", e.getMessage());
            i = 0;
        }
        try {
            date = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).parse(strOptString + "01000000");
        } catch (ParseException e2) {
            LogUtil.e(TAG, "compareFitnessRecordCount ", LogAnonymous.b(e2));
            date = null;
        }
        if (date == null) {
            return true;
        }
        long time = date.getTime();
        List<WorkoutRecord> workoutRecordsSyncByMonth = getWorkoutRecordsSyncByMonth(time);
        if (workoutRecordsSyncByMonth == null) {
            return false;
        }
        LogUtil.a(TAG, "localSize=", Integer.valueOf(workoutRecordsSyncByMonth.size()), " cloudSize=", Integer.valueOf(i), " month=", Long.valueOf(time));
        if (workoutRecordsSyncByMonth.size() == i) {
            return true;
        }
        postFitnessHistoryRequest(ift.b(time) / 1000, ift.e(time) / 1000, 0);
        return false;
    }

    public void acquireSummaryFitnessRecord(final long j, final long j2, final IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        LogUtil.a(TAG, "acquireSummaryFitnessRecord");
        if (!isValidCheckParameters(new ntx.d().b(j).d(j).a(), iBaseResponseCallback)) {
            LogUtil.j(TAG, "deleteFitnessRecord isValidCheckParameters fail");
            return;
        }
        try {
            final String str = "select sum(actualCalorie) as sumCalorie , sum(during) as sumDuring,  count(workoutId) as sumCount from " + gmc.g().getTableFullName("workout_record") + " where  (workoutId GLOB ? or wearType = 3) and (sportRecordType = 0)  and userId = ?  and exerciseTime between " + j + " and " + j2;
            btt.d().c(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    FitnessHistoryModel.lambda$acquireSummaryFitnessRecord$4(str, j, j2, iBaseResponseCallback);
                }
            });
        } catch (SQLiteException e) {
            ReleaseLogUtil.a(TAG, "SQLiteException: ", LogAnonymous.b(e));
            gmc.g().i();
        }
    }

    static /* synthetic */ void lambda$acquireSummaryFitnessRecord$4(String str, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        FitnessSummaryRecord fitnessSummaryRecord = new FitnessSummaryRecord();
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, new String[]{SQL_RULE, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)});
        if (cursorRawQueryStorageData != null) {
            while (cursorRawQueryStorageData.moveToNext()) {
                float f = cursorRawQueryStorageData.getFloat(cursorRawQueryStorageData.getColumnIndex("sumCalorie"));
                long j3 = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("sumDuring"));
                int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("sumCount"));
                fitnessSummaryRecord.saveRecordsSumCalorie(f);
                fitnessSummaryRecord.saveRecordsSumTime(j3);
                fitnessSummaryRecord.saveRecordsCount(i);
                fitnessSummaryRecord.saveRecordsStartTime(j);
                fitnessSummaryRecord.saveRecordsEndTime(j2);
                fitnessSummaryRecord.saveRecordType(10001);
            }
            cursorRawQueryStorageData.close();
        }
        iBaseResponseCallback.a(0, fitnessSummaryRecord);
    }

    public void acquireSummaryFitnessRecord(final ntx ntxVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (!isValidCheckParameters(ntxVar, iBaseResponseCallback)) {
            LogUtil.j(TAG, "acquireSummaryFitnessRecord isValidCheckParameters fail");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1128x2d73e64a(ntxVar, iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$acquireSummaryFitnessRecord$5$com-huawei-health-plan-model-model-fitness-FitnessHistoryModel, reason: not valid java name */
    /* synthetic */ void m1128x2d73e64a(ntx ntxVar, IBaseResponseCallback iBaseResponseCallback) {
        String acquireSummaryFitnessRecordSql = getAcquireSummaryFitnessRecordSql(ntxVar);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(getStartTimeDateFormat(ntxVar.h()), Locale.ENGLISH);
        ArrayList arrayList = new ArrayList();
        getDataFromDb(simpleDateFormat, arrayList, acquireSummaryFitnessRecordSql);
        LogUtil.a(TAG, "acquireSummaryFitnessRecord size: ", Integer.valueOf(arrayList.size()));
        iBaseResponseCallback.a(0, arrayList);
    }

    public void acquireDetailFitnessRecord(final ntx ntxVar, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "acquireDetailFitnessRecord");
        if (!isValidCheckParameters(ntxVar, iBaseResponseCallback)) {
            LogUtil.j(TAG, "deleteFitnessRecord isValidCheckParameters fail");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.plan.model.model.fitness.FitnessHistoryModel$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    FitnessHistoryModel.lambda$acquireDetailFitnessRecord$6(ntxVar, iBaseResponseCallback);
                }
            });
        }
    }

    static /* synthetic */ void lambda$acquireDetailFitnessRecord$6(ntx ntxVar, IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        String str;
        String str2 = "";
        if (ntxVar.i() == 0) {
            str = "";
        } else {
            str = " and category = " + ntxVar.i();
        }
        if (ntxVar.c() != 0) {
            str2 = " limit " + ntxVar.c();
        }
        StringBuilder sb = new StringBuilder();
        String str3 = ntxVar.b() == 0 ? " DESC " : " ASC ";
        sb.append("select * from ");
        sb.append(gmc.g().getTableFullName("workout_record"));
        sb.append(" where  (workoutId GLOB ? or wearType = 3) and (sportRecordType = 0)  and userId = ? ");
        sb.append(str);
        sb.append(" and exerciseTime between ");
        sb.append(ntxVar.a());
        sb.append(" and ");
        sb.append(ntxVar.e());
        sb.append(" order by exerciseTime");
        sb.append(str3);
        sb.append(str2);
        LogUtil.a(TAG, "query detailRecords SQL is:", sb);
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, sb.toString(), new String[]{SQL_RULE, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        arrayList.add(gmw.b(cursorRawQueryStorageData));
                    } catch (Throwable th) {
                        if (cursorRawQueryStorageData != null) {
                            try {
                                cursorRawQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        } catch (SQLiteDatabaseLockedException e) {
            ReleaseLogUtil.a(TAG, "acquireDetailFitnessRecord, SQLiteDatabaseLockedException: ", LogAnonymous.b(e));
            OpAnalyticsUtil.getInstance().sqliteDatabaseLockedExceptionSetEvent(e, "FitnessHistoryModel#acquireDetailFitnessRecord");
        } catch (SQLiteException e2) {
            LogUtil.e(TAG, "acquireDetailFitnessRecord failed! SQL:" + sb.toString(), e2);
            ReleaseLogUtil.a(TAG, "SQLiteException: ", LogAnonymous.b(e2));
            gmc.g().i();
        }
        LogUtil.a(TAG, "exit acquireDetailFitnessRecord, records size：", Integer.valueOf(arrayList.size()));
        iBaseResponseCallback.a(0, arrayList);
    }

    private String getStartTimeDateFormat(int i) {
        String str;
        if (i == 3) {
            str = "yyyyMMdd";
        } else if (i == 4) {
            str = "yyyy-ww";
        } else if (i == 5) {
            str = "yyyyMM";
        } else if (i == 6) {
            str = "yyyy";
        } else {
            if (i != 7) {
                LogUtil.e(TAG, "ERROR, notSupport HiGroupUnitType");
            }
            str = "";
        }
        LogUtil.d(TAG, "getStartTimeDateFormat，timeUnit: ", Integer.valueOf(i), " dateFormat: ", str);
        return str;
    }

    private String getAcquireSummaryFitnessRecordSql(ntx ntxVar) {
        String str;
        String str2;
        int iH = ntxVar.h();
        if (iH == 3) {
            str = "substr(exerciseDate, 1, 8) as date,";
        } else if (iH == 4) {
            str = "strftime('%Y-%W',datetime(exerciseTime/1000 " + HiDateUtil.c((String) null) + "*36, 'unixepoch')) as date,";
        } else if (iH == 5) {
            str = "substr(exerciseDate, 1, 6) as date,";
        } else {
            if (iH != 6) {
                LogUtil.e(TAG, "not group by date");
            }
            str = "substr(exerciseDate, 1, 4) as date,";
        }
        if (ntxVar.i() == 0) {
            str2 = "";
        } else {
            str2 = " and category = " + ntxVar.i();
        }
        boolean z = ntxVar.h() == 0 || ntxVar.h() == 7;
        String str3 = "select " + str + "sum(actualCalorie) as calorie ,sum(during) as during, count(workoutId) as times from " + gmc.g().getTableFullName("workout_record") + " where  (workoutId GLOB ? or wearType = 3) and (sportRecordType = 0)  and userId = ?" + str2 + " and exerciseTime between " + ntxVar.a() + " and " + ntxVar.e() + (z ? "" : " group by date") + (z ? "" : " order by date desc");
        LogUtil.d(TAG, str3);
        return str3;
    }
}
