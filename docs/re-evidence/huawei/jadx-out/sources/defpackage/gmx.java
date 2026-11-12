package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes29.dex */
public class gmx extends BaseDao {
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x008b: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:30:0x008b */
    public void a(String str, String str2, int i) {
        boolean z;
        boolean z2;
        LogUtil.d("Suggestion_TrainCountDao", "insert：beginTransaction");
        boolean z3 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    gmc.g().h();
                    z = true;
                }
                try {
                    int iA = a(str, str2);
                    if (iA == 0) {
                        d(str, str2, i);
                    } else if (i > iA) {
                        e(str, str2, i);
                    } else {
                        LogUtil.d("Suggestion_TrainCountDao", "insert：count=", Integer.valueOf(i), ", idCount=", Integer.valueOf(iA));
                    }
                    if (z) {
                        gmc.g().f();
                    }
                    LogUtil.d("Suggestion_TrainCountDao", "insert：endTransaction");
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("Suggestion_TrainCountDao", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        gmc.g().f();
                    }
                    LogUtil.d("Suggestion_TrainCountDao", "insert：endTransaction");
                }
            } catch (Throwable th) {
                th = th;
                z3 = z2;
                if (z3) {
                    gmc.g().f();
                }
                LogUtil.d("Suggestion_TrainCountDao", "insert：endTransaction");
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z3) {
                gmc.g().f();
            }
            LogUtil.d("Suggestion_TrainCountDao", "insert：endTransaction");
            throw th;
        }
    }

    public int a(String str, String str2) {
        int i;
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("train_count") + " where userId=? and id=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) str2)});
                i = 0;
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        try {
                            i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("count"));
                        } catch (SQLiteException e) {
                            e = e;
                            LogUtil.e("Suggestion_TrainCountDao", "SQLiteException getIdCount:", LogAnonymous.b(e));
                            return i;
                        }
                    }
                }
                LogUtil.d("Suggestion_TrainCountDao", "getIdCount count = ", Integer.valueOf(i));
                return i;
            } finally {
                if (0 != 0) {
                    cursorRawQueryStorageData.close();
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            i = 0;
        }
    }

    private void e(String str, String str2, int i) {
        ContentValues contentValuesC = c(str, str2, i);
        LogUtil.d("Suggestion_TrainCountDao", "update：", contentValuesC.toString());
        gmc.g().updateStorageData("train_count", 1, contentValuesC, "userId=? and id=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) str2)});
    }

    private void d(String str, String str2, int i) {
        ContentValues contentValuesC = c(str, str2, i);
        gmc.g().insertStorageData("train_count", 1, contentValuesC);
        LogUtil.d("Suggestion_TrainCountDao", "insertCount values = ", contentValuesC);
    }

    private ContentValues c(String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("id", str2);
        contentValues.put("count", Integer.valueOf(i));
        return contentValues;
    }
}
