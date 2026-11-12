package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqa {
    private String c() {
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append("_id integer primary key autoincrement,Package_Name NVARCHAR(300) not null,User_ID NVARCHAR(300) not null,Device_ID NVARCHAR(300) not null,Auth_Time NVARCHAR(300) not null");
        return String.valueOf(stringBuffer);
    }

    public void e(npz npzVar) {
        if (npzVar == null) {
            LogUtil.j("HwMultiSimAuthNewDb", "createDbTable hwMultiSimMgr is null");
        } else {
            npzVar.createStorageDataTable("HWMultiSimAuthNewDB", 1, c());
        }
    }

    private ContentValues d(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Package_Name", str);
        contentValues.put("User_ID", str2);
        contentValues.put("Device_ID", str3);
        contentValues.put("Auth_Time", str4);
        return contentValues;
    }

    public void e(npz npzVar, List<String> list, String str, String str2) {
        if (npzVar == null) {
            LogUtil.j("HwMultiSimAuthNewDb", "updateAuthStatus hwMultiSimMgr is null");
            return;
        }
        LogUtil.a("HwMultiSimAuthNewDb", "updateAuthStatus applist enter");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            npzVar.insertStorageData("HWMultiSimAuthNewDB", 1, d(it.next(), str, str2, "NA"));
        }
    }

    public void b(npz npzVar, String str, String str2, String str3) {
        if (npzVar == null) {
            LogUtil.j("HwMultiSimAuthNewDb", "updateAuthStatus hwMultiSimMgr is null");
            return;
        }
        LogUtil.a("HwMultiSimAuthNewDb", "updateAuthStatus packageName:", str, " userId:", CommonUtil.n(str2), " deviceId:", CommonUtil.n(str3));
        ContentValues contentValuesD = d(str, str2, str3, String.valueOf(System.currentTimeMillis()));
        Cursor cursorQueryStorageData = npzVar.queryStorageData("HWMultiSimAuthNewDB", 1, "Package_Name='" + str + "' AND User_ID='" + str2 + "' AND Device_ID='" + str3 + "'");
        if (cursorQueryStorageData == null) {
            LogUtil.j("HwMultiSimAuthNewDb", "updateAuthStatus query database failure");
            return;
        }
        if (cursorQueryStorageData.moveToFirst()) {
            npzVar.updateStorageData("HWMultiSimAuthNewDB", 1, contentValuesD, "Package_Name='" + str + "' AND User_ID='" + str2 + "' AND Device_ID='" + str3 + "'");
        } else {
            npzVar.insertStorageData("HWMultiSimAuthNewDB", 1, contentValuesD);
        }
        cursorQueryStorageData.close();
    }

    public boolean a(npz npzVar, String str, String str2, String str3) {
        if (npzVar == null) {
            LogUtil.j("HwMultiSimAuthNewDb", "getAuthStatus hwMultiSimMgr is null");
            return false;
        }
        Cursor cursorQueryStorageData = npzVar.queryStorageData("HWMultiSimAuthNewDB", 1, "Package_Name='" + str + "' AND User_ID='" + str2 + "' AND Device_ID='" + str3 + "'");
        if (cursorQueryStorageData == null) {
            LogUtil.j("HwMultiSimAuthNewDb", "getAuthStatus query database failure");
            return false;
        }
        boolean zMoveToFirst = cursorQueryStorageData.moveToFirst();
        cursorQueryStorageData.close();
        return zMoveToFirst;
    }
}
