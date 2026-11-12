package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.DbManager;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceDbForHomeCards {
    public static final String EXERCISE_INSERT_TIME = "exerciseInsertTime";
    public static final String EXERCISE_INSERT_TIME_TABLE_NAME = "exercise_insert_time_table";
    public static final String HUID = "huid";
    private static final String TAG = "DeviceDBForHomeCards";
    public static final String USER_ID = "user_id";

    private DeviceDbForHomeCards() {
    }

    public static void updateExerciseInsertTime(long j) {
        LogUtil.a(TAG, "enter updateExerciseInsertTime with currentTime = " + j);
        DbManager.a(BaseApplication.getContext(), String.valueOf(22), EXERCISE_INSERT_TIME_TABLE_NAME, 2, "huid varchar primary key ,exerciseInsertTime exerciseInsertTime varchar");
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXERCISE_INSERT_TIME, Long.toString(j));
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        contentValues.put("huid", strC);
        if (isTableHaveCurrentUser()) {
            DbManager.d dVar = new DbManager.d();
            dVar.b(BaseApplication.getContext());
            dVar.c(String.valueOf(22));
            dVar.b(EXERCISE_INSERT_TIME_TABLE_NAME);
            dVar.e(2);
            DbManager.d(dVar, contentValues, "huid='" + strC + "'");
            return;
        }
        DbManager.c(BaseApplication.getContext(), String.valueOf(22), EXERCISE_INSERT_TIME_TABLE_NAME, 2, contentValues);
    }

    private static boolean isTableHaveCurrentUser() {
        LogUtil.a(TAG, "enter isHaveCurrentUser");
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(String.valueOf(22)), EXERCISE_INSERT_TIME_TABLE_NAME, 2, "huid='" + KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + "'");
        boolean z = false;
        if (cursorC != null) {
            z = cursorC.getCount() > 0;
            cursorC.close();
        }
        LogUtil.d(TAG, "isHaveKeyInfo:", Boolean.valueOf(z));
        return z;
    }
}
