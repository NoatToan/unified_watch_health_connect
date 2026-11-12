package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.operation.OperationKey;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class ljq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ljy f40355b = new ljy();

    private static boolean b(int i) {
        if (i == 2103 || i == 2104 || i == 2106 || i == 2107 || i == 10001 || i == 47299) {
            return true;
        }
        switch (i) {
            case 2008:
            case 2009:
            case 2010:
            case 2011:
            case 2012:
            case 2013:
            case 2014:
            case 2015:
                return true;
            default:
                switch (i) {
                    case 47200:
                    case 47201:
                    case 47202:
                    case 47203:
                    case 47204:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static kxe a(Context context, int i) {
        if (i(context, i)) {
            return kxc.c();
        }
        return kxe.d(context);
    }

    public static kxo e(Context context, int i) {
        if (i(context, i)) {
            return kxn.b();
        }
        return kxo.a();
    }

    public static kww d(Context context, int i) {
        if (i(context, i)) {
            return kwz.d();
        }
        return kww.c(context);
    }

    public static boolean b(Context context, int i) {
        SQLiteDatabase writableDatabase;
        boolean zI = i(context, i);
        if (zI) {
            writableDatabase = HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase();
        } else {
            writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        }
        if (writableDatabase == null) {
            ReleaseLogUtil.b("HiH_HiDataBaseManagerChooseUtil", "begin dataBase is empty,isSensitive:", Boolean.valueOf(zI));
            return false;
        }
        try {
            f40355b.lock();
            if (!liq.h()) {
                ReleaseLogUtil.c("HiH_HiDataBaseManagerChooseUtil", "begin,isSensitive:", Boolean.valueOf(zI));
            }
            writableDatabase.beginTransactionNonExclusive();
            return true;
        } catch (Throwable th) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("beginTransactionNonLockException", LogAnonymous.b(th));
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap, false);
            ljy ljyVar = f40355b;
            if (ljyVar.isLocked()) {
                ljyVar.unlock();
            }
            ReleaseLogUtil.e("HiH_HiDataBaseManagerChooseUtil", "beginTransactionNonLock e ", LogAnonymous.b(th));
            return false;
        }
    }

    public static boolean h(Context context, int i) {
        SQLiteDatabase writableDatabase;
        if (i(context, i)) {
            writableDatabase = HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase();
        } else {
            writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        }
        if (writableDatabase != null) {
            return writableDatabase.inTransaction();
        }
        return false;
    }

    public static void g(Context context, int i) {
        SQLiteDatabase writableDatabase;
        boolean zI = i(context, i);
        if (zI) {
            writableDatabase = HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase();
        } else {
            writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        }
        if (writableDatabase != null) {
            if (writableDatabase.inTransaction()) {
                writableDatabase.setTransactionSuccessful();
                return;
            }
            b("setTran not inTransaction,isSensitive:" + zI);
        }
    }

    public static void c(Context context, int i) {
        SQLiteDatabase writableDatabase;
        boolean zI = i(context, i);
        try {
            if (zI) {
                writableDatabase = HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase();
            } else {
                writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
            }
            if (writableDatabase != null) {
                if (!liq.h()) {
                    ReleaseLogUtil.c("HiH_HiDataBaseManagerChooseUtil", "end,isSensitive:", Boolean.valueOf(zI));
                }
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                } else {
                    b("end database not inTransaction,isSensitive:" + zI);
                }
            }
            ljy ljyVar = f40355b;
            if (ljyVar.isLocked()) {
                ReleaseLogUtil.c("HiH_HiDataBaseManagerChooseUtil", "end,isSensitive:", Boolean.valueOf(zI), " unlock");
                ljyVar.unlock();
            } else {
                b("end LOCK is unlocked,isSensitive:" + zI);
            }
        } catch (Throwable th) {
            try {
                ReleaseLogUtil.e("HiH_HiDataBaseManagerChooseUtil", "endTransactionNonLock e ", LogAnonymous.b(th));
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put("endTransactionNonLockException", LogAnonymous.b(th));
                long jD = SharedPreferenceManager.d("HiHealthService", "dbMalformed", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (th.getMessage() == null || !(th.getMessage().contains("database or disk is full") || th.getMessage().contains("disk image is malformed"))) {
                    ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap, false);
                } else if (jCurrentTimeMillis - jD >= 604800000) {
                    ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap, false);
                    SharedPreferenceManager.c("HiHealthService", "dbMalformed", jCurrentTimeMillis);
                }
            } finally {
                ljy ljyVar2 = f40355b;
                if (ljyVar2.isLocked()) {
                    ReleaseLogUtil.c("HiH_HiDataBaseManagerChooseUtil", "end,isSensitive:", Boolean.valueOf(zI), " unlock");
                    ljyVar2.unlock();
                } else {
                    b("end LOCK is unlocked,isSensitive:" + zI);
                }
            }
        }
    }

    private static void b(String str) {
        ReleaseLogUtil.b("HiH_HiDataBaseManagerChooseUtil", str);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("endTransactionNonLock", str);
        ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap, false);
    }

    public static int[] a(Context context, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i(context, i)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static int[] e(Context context, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (!i(context, i)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static List<kuk> c(Context context, List<kuk> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (kuk kukVar : list) {
            HiHealthDictType hiHealthDictTypeG = HiHealthDictManager.a(context).g(kukVar.g());
            if (hiHealthDictTypeG != null) {
                if (hiHealthDictTypeG.g() >= 3) {
                    arrayList.add(kukVar);
                }
            } else if (b(kukVar.g())) {
                arrayList.add(kukVar);
            }
        }
        return arrayList;
    }

    public static List<kuk> e(Context context, List<kuk> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (kuk kukVar : list) {
            HiHealthDictType hiHealthDictTypeG = HiHealthDictManager.a(context).g(kukVar.g());
            if (hiHealthDictTypeG != null) {
                if (hiHealthDictTypeG.g() < 3) {
                    arrayList.add(kukVar);
                }
            } else if (!b(kukVar.g())) {
                arrayList.add(kukVar);
            }
        }
        return arrayList;
    }

    public static List<HiHealthData> a(Context context, List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (i(context, hiHealthData.getType())) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    public static List<HiHealthData> b(Context context, List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (!b(hiHealthData.getType()) && !f(context, hiHealthData.getType())) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    public static boolean i(Context context, int i) {
        return b(i) || f(context, i);
    }

    private static boolean f(Context context, int i) {
        HiHealthDictType hiHealthDictTypeI;
        int iE = HiHealthDictManager.a(context).e(i);
        if (iE == 0 || iE == 1) {
            hiHealthDictTypeI = HiHealthDictManager.a(context).i(i);
        } else if (iE == 2) {
            hiHealthDictTypeI = HiHealthDictManager.a(context).g(i);
        } else {
            hiHealthDictTypeI = HiHealthDictManager.a(context).a(i);
        }
        return hiHealthDictTypeI != null && hiHealthDictTypeI.g() >= 3;
    }

    public static String c() {
        Thread owner = f40355b.getOwner();
        if (owner != null) {
            return d(owner);
        }
        return "";
    }

    private static String d(Thread thread) {
        return "deadlock thread name: " + thread.getName() + ", state: " + thread.getState() + ", id: " + thread.getId() + ": " + System.lineSeparator() + DfxUtils.d(thread, null);
    }
}
