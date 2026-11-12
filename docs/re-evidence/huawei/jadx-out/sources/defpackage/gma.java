package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.FitnessCallback;
import com.huawei.basefitnessadvice.model.DayTotalRecord;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.jsoperation.JsUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gma extends BaseDao {
    public void c(final String str, final long j, final float f, final int i, final String str2, final boolean z) {
        ThreadPoolManager.c().b("Suggestion_DayTotalRecordDao", new Runnable() { // from class: gma.2
            @Override // java.lang.Runnable
            public void run() {
                gma.this.d(str, j, f, i);
                Bundle bundle = new Bundle();
                bundle.putLong(FitnessCallback.BUNDLE_FITNESS_DURATION, i);
                if (z) {
                    hcb.a().onChange(str2, 4, bundle);
                }
            }
        });
    }

    public List<Map<String, Object>> d(String str, int i, int i2) {
        ArrayList arrayList = new ArrayList(16);
        if (i2 < i) {
            LogUtil.e("Suggestion_DayTotalRecordDao", "getRecordsByDateRange, Data error");
            return arrayList;
        }
        for (DayTotalRecord dayTotalRecord : c(str, i, i2)) {
            if (dayTotalRecord != null) {
                HashMap map = new HashMap(3);
                map.put("date", String.valueOf(dayTotalRecord.getDate()));
                map.put(JsUtil.SUGGESTION_TOTAL_CALORIE, String.valueOf(dayTotalRecord.getTotalCalorie()));
                map.put("totalduration", String.valueOf(dayTotalRecord.getTotalDuration()));
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, long j, float f, int i) {
        if (e(j)) {
            LogUtil.a("Suggestion_DayTotalRecordDao", "record overtime!");
            return;
        }
        if (a(str, j)) {
            LogUtil.a("Suggestion_DayTotalRecordDao", "record exist!");
            return;
        }
        try {
            e(str, j, f, Integer.parseInt(ped.i(i)));
        } catch (NumberFormatException e) {
            LogUtil.e("Suggestion_DayTotalRecordDao", "parse exception", LogAnonymous.b(e));
        }
        for (DayTotalRecord dayTotalRecord : e(str)) {
            b(dayTotalRecord.getTimeStamp(), dayTotalRecord.getTotalCalorie(), dayTotalRecord.getDuration(), str, dayTotalRecord.getDate());
        }
    }

    private void b(long j, float f, int i, final String str, final int i2) {
        LogUtil.d("Suggestion_DayTotalRecordDao", "updateCloud: date", Integer.valueOf(ieg.b(j)), " calorie", Float.valueOf(f), " duration", Integer.valueOf(i));
        ghw.b().setEvent(f, i, j, new DataCallback() { // from class: gma.1
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i3, String str2) {
                LogUtil.j("Suggestion_DayTotalRecordDao", "setEvent onFailure ", Integer.valueOf(i3));
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_DayTotalRecordDao", "setEvent onSuccess");
                gma.this.e(str, i2);
            }
        });
    }

    private boolean a(String str, long j) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("select * from ");
        sb.append(gmc.g().getTableFullName("fitness_total_record"));
        sb.append(" where userId=? and recordTime=?");
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, sb.toString(), new String[]{StringUtils.c((Object) str), String.valueOf(ifp.a(Long.valueOf(j)))});
            return cursorRawQueryStorageData != null ? cursorRawQueryStorageData.moveToNext() : false;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_DayTotalRecordDao", "isRecordTimeExist ", LogAnonymous.b(e));
            return false;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private boolean e(String str, long j, float f, int i) {
        int iB = ieg.b(j);
        d(str, iB);
        ContentValues contentValues = new ContentValues();
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("recordDate", Integer.valueOf(iB));
        contentValues.put("recordTime", Long.valueOf(j));
        contentValues.put("recordCalorie", Float.valueOf(f));
        contentValues.put("recordDuration", Integer.valueOf(i));
        contentValues.put("recordStatus", (Integer) 0);
        contentValues.put("recordTotalCalorie", Float.valueOf(d(str, iB, f)));
        contentValues.put("recordTotalDuration", Integer.valueOf(e(str, iB, i)));
        contentValues.put("dayLastRecord", (Integer) 1);
        long jInsertStorageData = gmc.g().insertStorageData("fitness_total_record", 1, contentValues);
        LogUtil.d("Suggestion_DayTotalRecordDao", "insertRecord", LogAnonymous.c(contentValues));
        return jInsertStorageData > 0;
    }

    private int e(String str, int i, int i2) {
        int duration = 0;
        for (DayTotalRecord dayTotalRecord : c(str, i)) {
            if (dayTotalRecord != null) {
                duration += dayTotalRecord.getDuration();
            }
        }
        LogUtil.a("Suggestion_DayTotalRecordDao", "getDayTotalDuration ", Integer.valueOf(duration), " recordDate", Integer.valueOf(i), " duration", Integer.valueOf(i2));
        return duration + i2;
    }

    private float d(String str, int i, float f) {
        float calorie = 0.0f;
        for (DayTotalRecord dayTotalRecord : c(str, i)) {
            if (dayTotalRecord != null) {
                calorie += dayTotalRecord.getCalorie();
            }
        }
        LogUtil.a("Suggestion_DayTotalRecordDao", "getDayTotalCalorie ", Float.valueOf(calorie), " recordDate", Integer.valueOf(i), " calorie", Float.valueOf(f));
        return calorie + f;
    }

    private boolean e(long j) {
        LogUtil.a("Suggestion_DayTotalRecordDao", "timeGap :", Long.valueOf(System.currentTimeMillis() - j));
        return System.currentTimeMillis() - j > 2592000000L;
    }

    private List<DayTotalRecord> c(String str, int i) {
        ArrayList arrayList = new ArrayList(16);
        StringBuilder sb = new StringBuilder(16);
        sb.append("select * from ");
        sb.append(gmc.g().getTableFullName("fitness_total_record"));
        sb.append(" where userId=? and recordDate=?");
        String string = sb.toString();
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, string, new String[]{StringUtils.c((Object) str), String.valueOf(i)});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        arrayList.add(a(cursorRawQueryStorageData));
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return arrayList;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_DayTotalRecordDao", "getDayTotalRecords ", LogAnonymous.b(e));
            }
            return arrayList;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private DayTotalRecord a(Cursor cursor) {
        DayTotalRecord dayTotalRecord = new DayTotalRecord();
        dayTotalRecord.setId(cursor.getInt(cursor.getColumnIndex("recordId")));
        dayTotalRecord.setUserId(cursor.getString(cursor.getColumnIndex(JsbMapKeyNames.H5_USER_ID)));
        dayTotalRecord.setDate(cursor.getInt(cursor.getColumnIndex("recordDate")));
        dayTotalRecord.setTimeStamp(cursor.getLong(cursor.getColumnIndex("recordTime")));
        dayTotalRecord.setCalorie(cursor.getFloat(cursor.getColumnIndex("recordCalorie")));
        dayTotalRecord.setDuration(cursor.getInt(cursor.getColumnIndex("recordDuration")));
        dayTotalRecord.setStatus(cursor.getInt(cursor.getColumnIndex("recordStatus")));
        dayTotalRecord.setTotalCalorie(cursor.getFloat(cursor.getColumnIndex("recordTotalCalorie")));
        dayTotalRecord.setTotalDuration(cursor.getInt(cursor.getColumnIndex("recordTotalDuration")));
        dayTotalRecord.setIsLastRecord(cursor.getInt(cursor.getColumnIndex("dayLastRecord")));
        return dayTotalRecord;
    }

    private List<DayTotalRecord> e(String str) {
        ArrayList arrayList = new ArrayList(16);
        StringBuilder sb = new StringBuilder(16);
        sb.append("select * from ");
        sb.append(gmc.g().getTableFullName("fitness_total_record"));
        sb.append(" where userId=? and recordStatus=0 and dayLastRecord=1");
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, sb.toString(), new String[]{StringUtils.c((Object) str)});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        arrayList.add(a(cursorRawQueryStorageData));
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return arrayList;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_DayTotalRecordDao", "getDayTotalRecords ", LogAnonymous.b(e));
            }
            return arrayList;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private boolean d(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("dayLastRecord", (Integer) 0);
        int iUpdateStorageData = gmc.g().updateStorageData("fitness_total_record", 1, contentValues, "userId=? and recordDate=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) String.valueOf(i))});
        LogUtil.a("Suggestion_DayTotalRecordDao", "isUpdateDayRecordIsLast ", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("recordStatus", (Integer) 1);
        return gmc.g().updateStorageData("fitness_total_record", 1, contentValues, "userId=? and recordDate=? and dayLastRecord=1", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) String.valueOf(i))}) > 0;
    }

    private List<DayTotalRecord> c(String str, int i, int i2) {
        ArrayList arrayList = new ArrayList(16);
        StringBuilder sb = new StringBuilder(16);
        sb.append("select * from ");
        sb.append(gmc.g().getTableFullName("fitness_total_record"));
        sb.append(" where userId=? and dayLastRecord=1 and recordDate>=? and recordDate<=?");
        String string = sb.toString();
        String[] strArr = {StringUtils.c((Object) str), String.valueOf(ifp.e(Integer.valueOf(i))), String.valueOf(ifp.e(Integer.valueOf(i2)))};
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, string, strArr);
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        arrayList.add(a(cursorRawQueryStorageData));
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return arrayList;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_DayTotalRecordDao", "getRecordsByRange ", LogAnonymous.b(e));
            }
            return arrayList;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }
}
