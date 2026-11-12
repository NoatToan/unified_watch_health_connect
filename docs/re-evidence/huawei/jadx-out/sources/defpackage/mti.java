package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.SecurityContactsDbHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mti {
    public static void b(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "setLastSyncedTime: deviceId is null or empty.");
            return;
        }
        LogUtil.a("CacheDatabaseUtils", "setLastSyncedTime: lastSyncedTime: ", Long.valueOf(j));
        mta mtaVarB = mta.b(BaseApplication.getContext());
        List<msv> listD = mtaVarB.d(mtv.a(str));
        if (listD.isEmpty()) {
            mtaVarB.b(mtv.a(new msv(str, str, 16, 1, j)));
        } else {
            msv msvVar = listD.get(0);
            msvVar.b(j);
            mtaVarB.c(mtv.a(msvVar));
        }
        LogUtil.a("CacheDatabaseUtils", "setLastSyncedTime: end, queried size: ", Integer.valueOf(listD.size()));
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "getLastSyncedTime: deviceId is null or empty");
            return 0L;
        }
        List<msv> listD = mta.b(BaseApplication.getContext()).d(mtv.a(str));
        if (listD.isEmpty()) {
            LogUtil.a("CacheDatabaseUtils", "getLastSyncedTime: queried result list is empty.");
            return 0L;
        }
        msv msvVar = listD.get(0);
        if (msvVar == null) {
            LogUtil.a("CacheDatabaseUtils", "getLastSyncedTime: queried result bean is empty.");
            return 0L;
        }
        return msvVar.d();
    }

    public static void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "setSyncAllContactsFlag: deviceId is null or empty.");
            return;
        }
        int i2 = i == 0 ? 0 : 16;
        mta mtaVarB = mta.b(BaseApplication.getContext());
        List<msv> listD = mtaVarB.d(mtv.a(str));
        LogUtil.a("CacheDatabaseUtils", "setSyncAllContactsFlag: start, queried size: ", Integer.valueOf(listD.size()));
        if (listD.isEmpty()) {
            mtaVarB.b(mtv.a(new msv(str, str, i2, 1, System.currentTimeMillis())));
            return;
        }
        msv msvVar = listD.get(0);
        if (msvVar == null) {
            LogUtil.j("CacheDatabaseUtils", "setSyncAllContactsFlag: deviceSyncStateBean is null.");
        } else {
            msvVar.c(i);
            mtaVarB.c(mtv.a(msvVar));
        }
    }

    public static void c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "setSyncContactState: deviceId is null or empty.");
            return;
        }
        LogUtil.a("CacheDatabaseUtils", "setSyncContactState: start. isSync: ", Boolean.valueOf(z));
        mta.b(BaseApplication.getContext()).e(mtv.a(new msv(str, str, 0, z ? 1 : 0, -1L)));
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "isSynchronizedOnce: deviceId is null or empty.");
            return false;
        }
        LogUtil.a("CacheDatabaseUtils", "isSynchronizedOnce: enter");
        List<msv> listD = mta.b(BaseApplication.getContext()).d(mtv.a(str));
        return !listD.isEmpty() && listD.get(0).b() == 16;
    }

    public static void b(String str, List<msy> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            LogUtil.j("CacheDatabaseUtils", "saveSyncedContacts: input parameters are invalid.");
            return;
        }
        mtb mtbVarE = mtb.e(BaseApplication.getContext());
        if (b(str)) {
            mtbVarE.c(list, str);
        } else {
            mtbVarE.a(list, str);
        }
        b(str, System.currentTimeMillis());
        b(str, 16);
    }

    public static void c(String str, List<msz> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            LogUtil.j("CacheDatabaseUtils", "saveSyncedContactSportData: input parameters are invalid.");
            return;
        }
        mtg mtgVarA = mtg.a(BaseApplication.getContext());
        if (b(str)) {
            mtgVarA.d(list, str + "_sport");
            return;
        }
        mtgVarA.c(list, str + "_sport");
    }

    public static void e(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            LogUtil.j("CacheDatabaseUtils", "saveDeletedContacts: input parameters are invalid.");
        } else {
            mtb.e(BaseApplication.getContext()).e(list, str);
            b(str, System.currentTimeMillis());
        }
    }

    public static void a(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            LogUtil.j("CacheDatabaseUtils", "saveDeletedSportContacts: input parameters are invalid.");
            return;
        }
        mtg.a(BaseApplication.getContext()).a(list, str + "_sport");
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "createSyncDataTable: deviceId is null or empty.");
        } else {
            mtb.e(BaseApplication.getContext()).b(str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "createSyncDataTable: deviceId is null or empty.");
            return;
        }
        mtg.a(BaseApplication.getContext()).e(str + "_sport");
    }

    public static List<msy> e(String str) {
        return mtb.e(BaseApplication.getContext()).d(str);
    }

    public static List<msz> f(String str) {
        return mtg.a(BaseApplication.getContext()).a(str + "_sport");
    }

    public static void c(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("CacheDatabaseUtils", "clearDeviceFromDb: deviceIdList is null or empty.");
            return;
        }
        LogUtil.a("CacheDatabaseUtils", "clearDeviceFromDb: list size: ", Integer.valueOf(list.size()));
        mta.b(BaseApplication.getContext()).a(list);
        SecurityContactsDbHelper securityContactsDbHelperD = SecurityContactsDbHelper.d(BaseApplication.getContext());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            securityContactsDbHelperD.a(it.next());
        }
    }

    public static void a() {
        mtb.e(BaseApplication.getContext());
        mta.b(BaseApplication.getContext());
        mtg.a(BaseApplication.getContext());
    }
}
