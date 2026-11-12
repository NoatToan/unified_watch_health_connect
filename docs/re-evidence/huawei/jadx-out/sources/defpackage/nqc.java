package defpackage;

import android.database.Cursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.DbManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqc {
    public List<String> d(npz npzVar, String str) {
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("HwMultiSimAuthDb", "getAuthAppList");
        Cursor cursorQueryStorageData = npzVar.queryStorageData("HWMultiSimAuthDB", 1, "Device_ID='" + str + "'");
        if (cursorQueryStorageData == null) {
            LogUtil.j("HwMultiSimAuthDb", "getAuthStatus query DB failure");
            return arrayList;
        }
        if (cursorQueryStorageData.moveToFirst()) {
            arrayList.add(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("Package_Name")));
        }
        cursorQueryStorageData.close();
        return arrayList;
    }

    public void b(npz npzVar) {
        DbManager.b(BaseApplication.getContext(), npzVar.getModuleId().toString(), "HWMultiSimAuthDB", 1);
    }
}
