package ohos.ace.plugin.taskmanagerplugin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class TaskDao {
    private static DatabaseHelper mDatabaseHelper;
    private static SQLiteDatabase mSQLiteDatabase;

    public static long insert(Context context, Config config) {
        initDb(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put("saveas", config.getSaveas());
        contentValues.put("url", config.getUrl());
        contentValues.put("data", config.getData());
        contentValues.put("title", config.getTitle());
        contentValues.put("description", config.getDescription());
        contentValues.put("action1", Integer.valueOf(config.getAction()));
        contentValues.put(Wpt.MODE, Integer.valueOf(config.getMode()));
        contentValues.put("mimeType", config.getMimeType());
        Progress progress = new Progress();
        progress.setState(0);
        contentValues.put("progress", JsonUtil.convertProgressToJson(progress));
        contentValues.put("ctime", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mtime", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("faults", (Integer) 255);
        contentValues.put("reason", "");
        contentValues.put("downloadId", "");
        contentValues.put("token", config.getToken());
        contentValues.put("taskStates", "");
        contentValues.put("roaming", Integer.valueOf(config.isRoaming() ? 1 : 0));
        contentValues.put("metered", Integer.valueOf(config.isMetered() ? 1 : 0));
        contentValues.put("network", Integer.valueOf(config.getNetwork()));
        contentValues.put("headers", JsonUtil.mapStringToJson(config.getHeaders()));
        contentValues.put("index1", Integer.valueOf(config.getIndex()));
        contentValues.put("begins", Integer.valueOf(config.getBegins()));
        contentValues.put("ends", Integer.valueOf(config.getEnds()));
        contentValues.put("priority", Integer.valueOf(config.getPriority()));
        contentValues.put("overwrite", Integer.valueOf(config.isOverwrite() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(config.isRetry() ? 1 : 0));
        contentValues.put("redirect", Integer.valueOf(config.isRedirect() ? 1 : 0));
        contentValues.put("gauge", Integer.valueOf(config.isGauge() ? 1 : 0));
        contentValues.put("precise", Integer.valueOf(config.isPrecise() ? 1 : 0));
        contentValues.put(WatchFaceProvider.BACKGROUND_LABEL, Integer.valueOf(config.isBackground() ? 1 : 0));
        contentValues.put("method", config.getMethod());
        contentValues.put("forms", config.getForms());
        contentValues.put("files", config.getFiles());
        contentValues.put("bodyFds", config.getBodyFds());
        contentValues.put("bodyFileNames", config.getBodyFileNames());
        contentValues.put(JsbMapKeyNames.H5_EXTRAS, config.getExtras());
        contentValues.put("version", Integer.valueOf(config.getVersion()));
        contentValues.put("tries", (Integer) 0);
        contentValues.put("code", (Integer) 0);
        contentValues.put("withSystem", (Integer) 0);
        try {
            long jInsert = mSQLiteDatabase.insert("Task", null, contentValues);
            ALog.i(IConstant.TAG, "insert: " + jInsert);
            return jInsert;
        } catch (Exception e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "insert: error" + e);
            return -1L;
        }
    }

    public static Config queryConfig(Context context, long j) {
        ALog.i(IConstant.TAG, "queryConfig: " + j);
        initDb(context);
        try {
            Cursor cursorQuery = mSQLiteDatabase.query("Task", null, "tid=?", new String[]{String.valueOf(j)}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("url"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("description"));
                        boolean z = cursorQuery.getInt(cursorQuery.getColumnIndex("roaming")) == 1;
                        boolean z2 = cursorQuery.getInt(cursorQuery.getColumnIndex("metered")) == 1;
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("network"));
                        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex(Wpt.MODE));
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
                        String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("saveas"));
                        HashMap<String, String> mapJsonToMapString = JsonUtil.jsonToMapString(cursorQuery.getString(cursorQuery.getColumnIndex("headers")));
                        Config config = new Config();
                        config.setTaskId(j);
                        config.setUrl(string);
                        config.setDescription(string2);
                        config.setRoaming(z);
                        config.setMetered(z2);
                        config.setNetwork(i);
                        config.setMode(i2);
                        config.setTitle(string3);
                        config.setSaveas(string4);
                        config.setHeaders(mapJsonToMapString);
                        config.setBackground(cursorQuery.getInt(cursorQuery.getColumnIndex(WatchFaceProvider.BACKGROUND_LABEL)) == 1);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return config;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            }
            if (cursorQuery == null) {
                return null;
            }
            cursorQuery.close();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "query: error" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b A[PHI: r12
      0x006b: PHI (r12v4 android.database.Cursor) = (r12v3 android.database.Cursor), (r12v6 android.database.Cursor) binds: [B:19:0x0069, B:12:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public static TaskInfo query(Context context, long j) throws Throwable {
        Exception e;
        Cursor cursorQuery;
        ALog.i(IConstant.TAG, "query: " + j);
        initDb(context);
        String[] strArr = {String.valueOf(j)};
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursorQuery = mSQLiteDatabase.query("Task", null, "tid=?", strArr, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                arrayList.add(getTaskInfoByCursor(cursorQuery));
                            } while (cursorQuery.moveToNext());
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        ALog.e(IConstant.TAG, "query: error" + e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TaskInfo) arrayList.get(0);
    }

    public static List<TaskInfo> queryAll(Context context) {
        ALog.i(IConstant.TAG, "queryAll");
        initDb(context);
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mSQLiteDatabase.query("Task", null, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        arrayList.add(getTaskInfoByCursor(cursorQuery));
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    return arrayList;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ALog.e(IConstant.TAG, "query: error" + e);
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static TaskInfo queryByToken(Context context, long j, String str) {
        ALog.i(IConstant.TAG, "queryByToken: " + j);
        initDb(context);
        String[] strArr = {String.valueOf(j), str};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = mSQLiteDatabase.query("Task", null, "tid=? and token=?", strArr, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(getTaskInfoByCursor(cursorQuery));
                        } while (cursorQuery.moveToNext());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "queryByToken: error" + e);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TaskInfo) arrayList.get(0);
    }

    private static TaskInfo getTaskInfoByCursor(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex("tid"));
        String string = cursor.getString(cursor.getColumnIndex("saveas"));
        String string2 = cursor.getString(cursor.getColumnIndex("url"));
        String string3 = cursor.getString(cursor.getColumnIndex("data"));
        String string4 = cursor.getString(cursor.getColumnIndex("title"));
        String string5 = cursor.getString(cursor.getColumnIndex("description"));
        int i = cursor.getInt(cursor.getColumnIndex("action1"));
        int i2 = cursor.getInt(cursor.getColumnIndex(Wpt.MODE));
        String string6 = cursor.getString(cursor.getColumnIndex("mimeType"));
        String string7 = cursor.getString(cursor.getColumnIndex("progress"));
        String string8 = cursor.getString(cursor.getColumnIndex("reason"));
        String string9 = cursor.getString(cursor.getColumnIndex("token"));
        String string10 = cursor.getString(cursor.getColumnIndex("taskStates"));
        long j2 = cursor.getLong(cursor.getColumnIndex("ctime"));
        long j3 = cursor.getLong(cursor.getColumnIndex("mtime"));
        long j4 = cursor.getLong(cursor.getColumnIndex("downloadId"));
        int i3 = cursor.getInt(cursor.getColumnIndex("faults"));
        int i4 = cursor.getInt(cursor.getColumnIndex("version"));
        String string11 = cursor.getString(cursor.getColumnIndex("files"));
        String string12 = cursor.getString(cursor.getColumnIndex("forms"));
        boolean z = cursor.getInt(cursor.getColumnIndex("gauge")) == 1;
        boolean z2 = cursor.getInt(cursor.getColumnIndex("retry")) == 1;
        boolean z3 = cursor.getInt(cursor.getColumnIndex("withSystem")) == 1;
        int i5 = cursor.getInt(cursor.getColumnIndex("priority"));
        int i6 = cursor.getInt(cursor.getColumnIndex("tries"));
        boolean z4 = z3;
        int i7 = cursor.getInt(cursor.getColumnIndex("code"));
        String string13 = cursor.getString(cursor.getColumnIndex(JsbMapKeyNames.H5_EXTRAS));
        TaskInfo taskInfo = new TaskInfo();
        taskInfo.setTid(j);
        taskInfo.setSaveas(string);
        taskInfo.setUrl(string2);
        taskInfo.setData(string3);
        taskInfo.setTitle(string4);
        taskInfo.setDescription(string5);
        taskInfo.setAction(i);
        taskInfo.setMode(i2);
        taskInfo.setMimeType(string6);
        taskInfo.setProgress(JsonUtil.convertJsonToProgress(string7));
        taskInfo.setReason(string8);
        taskInfo.setCtime(j2);
        taskInfo.setMtime(j3);
        taskInfo.setDownloadId(j4);
        taskInfo.setFaults(i3);
        taskInfo.setToken(string9);
        taskInfo.setTaskStates(JsonUtil.convertJsonToTaskState(string10));
        taskInfo.setVersion(i4);
        taskInfo.setFiles(JsonUtil.jsonToFileSpecList(string11));
        taskInfo.setForms(JsonUtil.jsonToFormList(string12));
        taskInfo.setGauge(z);
        taskInfo.setRetry(z2);
        taskInfo.setTries(i6);
        taskInfo.setCode(i7);
        taskInfo.setWithSystem(z4);
        taskInfo.setPriority(i5);
        taskInfo.setExtras(string13);
        return taskInfo;
    }

    public static List<Long> queryByFilter(Context context, Filter filter) {
        ALog.i(IConstant.TAG, "queryByFilter");
        initDb(context);
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (filter != null) {
            if (filter.getBefore() > 0) {
                arrayList.add(String.valueOf(filter.getBefore()));
                if (!TextUtils.isEmpty(stringBuffer.toString())) {
                    stringBuffer.append("and ");
                }
                stringBuffer.append("ctime<? ");
            }
            if (filter.getAfter() > 0) {
                arrayList.add(String.valueOf(filter.getAfter()));
                if (!TextUtils.isEmpty(stringBuffer.toString())) {
                    stringBuffer.append("and ");
                }
                stringBuffer.append("ctime>? ");
            }
            if (filter.getAction() == 0 || filter.getAction() == 1) {
                arrayList.add(String.valueOf(filter.getAction()));
                if (!TextUtils.isEmpty(stringBuffer.toString())) {
                    stringBuffer.append("and ");
                }
                stringBuffer.append("action1=? ");
            }
            if (filter.getMode() == 0 || filter.getMode() == 1) {
                arrayList.add(String.valueOf(filter.getMode()));
                if (!TextUtils.isEmpty(stringBuffer.toString())) {
                    stringBuffer.append("and ");
                }
                stringBuffer.append("mode=? ");
            }
        }
        String string = stringBuffer.toString();
        ALog.i(IConstant.TAG, "queryByFilter,selection:" + string);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mSQLiteDatabase.query("Task", null, string, strArr, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndex("tid"));
                        ALog.i(IConstant.TAG, "queryByFilter,tid:" + j);
                        Progress progressConvertJsonToProgress = JsonUtil.convertJsonToProgress(cursorQuery.getString(cursorQuery.getColumnIndex("progress")));
                        if (progressConvertJsonToProgress != null && filter != null) {
                            if ((filter.getState() != 0 && filter.getState() != 16 && filter.getState() != 32 && filter.getState() != 33 && filter.getState() != 48 && filter.getState() != 49 && filter.getState() != 64 && filter.getState() != 65 && filter.getState() != 80 && filter.getState() != 96) || progressConvertJsonToProgress.getState() == filter.getState()) {
                                arrayList2.add(Long.valueOf(j));
                            }
                        } else {
                            arrayList2.add(Long.valueOf(j));
                        }
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    return arrayList2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ALog.e(IConstant.TAG, "queryByFilter: error" + e);
            }
            return arrayList2;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static void update(Context context, TaskInfo taskInfo, boolean z) {
        ALog.i(IConstant.TAG, "update: " + JsonUtil.convertTaskInfoToJson(taskInfo));
        initDb(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put("saveas", taskInfo.getSaveas());
        contentValues.put("url", taskInfo.getUrl());
        contentValues.put("data", taskInfo.getData());
        contentValues.put("title", taskInfo.getTitle());
        contentValues.put("description", taskInfo.getDescription());
        contentValues.put("action1", Integer.valueOf(taskInfo.getAction()));
        contentValues.put(Wpt.MODE, Integer.valueOf(taskInfo.getMode()));
        contentValues.put("mimeType", taskInfo.getMimeType());
        contentValues.put("progress", JsonUtil.convertProgressToJson(taskInfo.getProgress()));
        contentValues.put("ctime", Long.valueOf(taskInfo.getCtime()));
        contentValues.put("mtime", Long.valueOf(taskInfo.getMtime()));
        contentValues.put("faults", Integer.valueOf(taskInfo.getFaults()));
        contentValues.put("reason", taskInfo.getReason());
        contentValues.put("downloadId", Long.valueOf(taskInfo.getDownloadId()));
        if (z) {
            contentValues.put("token", taskInfo.getToken());
        }
        contentValues.put("taskStates", JsonUtil.convertTaskStateToJson(taskInfo.getTaskStates()));
        contentValues.put("version", Integer.valueOf(taskInfo.getVersion()));
        contentValues.put("files", JsonUtil.convertFileSpecToJson(taskInfo.getFiles()));
        contentValues.put("forms", JsonUtil.formsListToJson(taskInfo.getForms()));
        contentValues.put("gauge", Integer.valueOf(taskInfo.isGauge() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(taskInfo.isRetry() ? 1 : 0));
        contentValues.put("tries", Integer.valueOf(taskInfo.getTries()));
        contentValues.put("code", Integer.valueOf(taskInfo.getCode()));
        contentValues.put("withSystem", Integer.valueOf(taskInfo.isWithSystem() ? 1 : 0));
        try {
            mSQLiteDatabase.update("Task", contentValues, "tid= ?", new String[]{String.valueOf(taskInfo.getTid())});
        } catch (Exception e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "insert: error" + e);
        }
    }

    public static void delete(Context context, long j) {
        ALog.i(IConstant.TAG, "delete: " + j);
        initDb(context);
        try {
            mSQLiteDatabase.delete("Task", "tid=?", new String[]{String.valueOf(j)});
        } catch (Exception e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "delete error " + e);
        }
    }

    private static void initDb(Context context) {
        if (mDatabaseHelper == null) {
            mDatabaseHelper = new DatabaseHelper(context);
        }
        if (mSQLiteDatabase == null) {
            mSQLiteDatabase = mDatabaseHelper.getWritableDatabase();
        }
    }
}
