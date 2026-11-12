package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.tencent.open.apireq.BaseResp;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class kvy {
    public static int d(String str, String str2, ContentValues contentValues, String str3, String[] strArr) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            SQLiteDatabase writableDatabase = HiHealthDBHelper.e(str).getWritableDatabase();
            if (writableDatabase == null) {
                return -1000;
            }
            int iUpdate = writableDatabase.update(str2, contentValues, str3, strArr);
            ReleaseLogUtil.d("HiH_DBCommonUtil", "update dbName=", str, ",tableName=", str2, ",res=", Integer.valueOf(iUpdate), ",costTm=", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            return iUpdate;
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("HiH_DBCommonUtil", "update SQLiteException! dbName=", str, ",tableName=", str2, ",costTm=", LogAnonymous.b(e));
            return BaseResp.CODE_QQ_LOW_VERSION;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_DBCommonUtil", "update Exception! dbName=", str, ",tableName=", str2, ",costTm=", LogAnonymous.b(e2));
            return BaseResp.CODE_QQ_LOW_VERSION;
        }
    }

    public static int c(String str, String str2, String str3, String[] strArr) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            SQLiteDatabase writableDatabase = HiHealthDBHelper.e(str).getWritableDatabase();
            if (writableDatabase == null) {
                return -1000;
            }
            int iDelete = writableDatabase.delete(str2, str3, strArr);
            ReleaseLogUtil.d("HiH_DBCommonUtil", "delete dbName=", str, ",tableName=", str2, "res=", Integer.valueOf(iDelete), ",costTm=", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            return iDelete;
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("HiH_DBCommonUtil", "delete SQLiteException! dbName=", str, ",tableName=", str2, ",costTm=", LogAnonymous.b(e));
            return BaseResp.CODE_QQ_LOW_VERSION;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_DBCommonUtil", "delete Exception! dbName=", str, ",tableName=", str2, ",costTm=", LogAnonymous.b(e2));
            return BaseResp.CODE_QQ_LOW_VERSION;
        }
    }
}
