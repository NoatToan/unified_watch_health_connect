package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.RemoteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class ksy extends HiDataOperation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f39392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39393c;
    private IDataOperateListener d;

    ksy(Context context) {
        super(context);
    }

    public boolean c(List list, IDataOperateListener iDataOperateListener) throws RemoteException {
        if (iDataOperateListener == null) {
            LogUtil.e("HiH_HiBaseDataMigrateOperation", "HiBaseDataMigrateOperation listener is null");
            return false;
        }
        List<Integer> listE = e(list);
        if (listE.size() != list.size()) {
            LogUtil.j("HiH_HiBaseDataMigrateOperation", "HiBaseDataMigrateOperation types contains invalid value(s)");
            d(3, Collections.singletonList("types contains invalid value"));
            return false;
        }
        this.f39393c = ktx.c().d();
        this.f39392b = listE;
        this.d = iDataOperateListener;
        ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "HiBaseDataMigrateOperation=", HiJsonUtil.d(list));
        return true;
    }

    private List<Integer> e(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iB = CommonUtil.b(it.next().toString(), 10);
            if (iB != -1) {
                arrayList.add(Integer.valueOf(iB));
            }
        }
        return arrayList;
    }

    private void d(int i, List<String> list) {
        ktu.d(this.d, i, list);
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        int[] iArr = {0};
        ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "start migrateBaseData!");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Map<String, Map<String, LinkedHashSet<Integer>>> mapD = lke.d(this.f39392b, this.mContext);
                Map<String, LinkedHashSet<Integer>> linkedHashMap = mapD.get("hihealth_003.db");
                if (CollectionUtils.c(linkedHashMap)) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put("sample_config", new LinkedHashSet<>());
                linkedHashMap.put("user_preference", new LinkedHashSet<>());
                linkedHashMap.put("sync_anchor", new LinkedHashSet<>());
                linkedHashMap.put("hihealth_dataclient", new LinkedHashSet<>());
                mapD.remove("hihealth_003.db");
                mapD.put("hihealth_003.db", linkedHashMap);
                c(mapD, iArr);
                ktu.d(this.d, iArr[0], Collections.EMPTY_LIST);
                ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "end migrateBaseData! totalTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiBaseDataMigrateOperation", "execute Exception", LogAnonymous.b(e));
                iArr[0] = 11;
                ktu.d(this.d, 11, Collections.EMPTY_LIST);
                ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "end migrateBaseData! totalTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            ktu.d(this.d, iArr[0], Collections.EMPTY_LIST);
            ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "end migrateBaseData! totalTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            throw th;
        }
    }

    private void c(Map<String, Map<String, LinkedHashSet<Integer>>> map, final int[] iArr) {
        final int iE = kud.a().e();
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1010);
        map.forEach(new BiConsumer() { // from class: ktb
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f39402a.c(iE, accountInfo, iArr, (String) obj, (Map) obj2);
            }
        });
    }

    /* synthetic */ void c(final int i, final String str, final int[] iArr, final String str2, Map map) {
        map.forEach(new BiConsumer() { // from class: kta
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) throws Throwable {
                this.f39400b.a(i, str, str2, iArr, (String) obj, (LinkedHashSet) obj2);
            }
        });
    }

    /* synthetic */ void a(int i, String str, String str2, int[] iArr, String str3, LinkedHashSet linkedHashSet) throws Throwable {
        String strB = b(i, str, str2, str3);
        if (SharedPreferenceManager.b("HiHealthService", strB, false)) {
            LogUtil.a("HiH_HiBaseDataMigrateOperation", "key=", strB, ", sp=", Boolean.valueOf(SharedPreferenceManager.b("HiHealthService", strB, false)));
            return;
        }
        int iA = a(linkedHashSet.stream().mapToInt(new cyf()).toArray(), str2, str3, i);
        if (iA == 0) {
            SharedPreferenceManager.a("HiHealthService", strB, true);
        } else {
            iArr[0] = iA;
        }
    }

    public static String b(int i, String str, String str2, String str3) {
        return i + "_" + str + "_MIGRATE_SUCCESS_" + str2 + "_" + str3;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    private int a(int[] iArr, String str, String str2, int i) throws Throwable {
        boolean zB;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        int i2 = (iArr == null || iArr.length == 0) ? 0 : iArr[0];
        try {
            zB = !ljq.h(this.mContext, i2) ? ljq.b(this.mContext, i2) : false;
            try {
                int i3 = b(iArr, str, str2, i) < 0 ? 4 : 0;
                if (c(iArr, str, str2, i) < 0) {
                    i3 = 9;
                }
                if (zB) {
                    ljq.g(this.mContext, i2);
                }
                if (zB) {
                    ljq.c(this.mContext, i2);
                }
                ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData dbName=", str, ", tableName=", str2, ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", types=", HiJsonUtil.d(iArr));
                return i3;
            } catch (Exception e) {
                e = e;
                try {
                    ReleaseLogUtil.e("HiH_HiBaseDataMigrateOperation", "baseDataMigrateTransaction() e = ", ExceptionUtils.c(e));
                    if (zB) {
                        ljq.c(this.mContext, i2);
                    }
                    ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData dbName=", str, ", tableName=", str2, ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", types=", HiJsonUtil.d(iArr));
                    return 11;
                } catch (Throwable th) {
                    th = th;
                    z = zB;
                    zB = z;
                    if (zB) {
                        ljq.c(this.mContext, i2);
                    }
                    ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData dbName=", str, ", tableName=", str2, ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", types=", HiJsonUtil.d(iArr));
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (zB) {
                    ljq.c(this.mContext, i2);
                }
                ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData dbName=", str, ", tableName=", str2, ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", types=", HiJsonUtil.d(iArr));
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th3) {
            th = th3;
            zB = z;
            if (zB) {
                ljq.c(this.mContext, i2);
            }
            ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData dbName=", str, ", tableName=", str2, ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", types=", HiJsonUtil.d(iArr));
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    private int b(int[] iArr, String str, String str2, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str2.hashCode();
        int iC = 0;
        switch (str2) {
            case "sync_anchor":
                iC = kvy.c(str, str2, "main_user_id =? ", new String[]{Integer.toString(i)});
                break;
            case "hihealth_stat_day":
            case "sample_point_health":
            case "sample_session_health":
            case "sample_session":
            case "sample_point":
            case "sample_session_core":
            case "sample_point_health_stress":
            case "sample_sequence":
                iC = e(str, str2, iArr, i, 0);
                break;
            case "user_preference":
            case "hihealth_dataclient":
                iC = e(str, str2, i, 0);
                break;
            case "sample_config":
                iC = d(str, str2, i, 0);
                break;
            default:
                ReleaseLogUtil.a("HiH_HiBaseDataMigrateOperation", "Invalid tableName: ", str2);
                break;
        }
        ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData updateCount=", Integer.valueOf(iC), ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return iC;
    }

    private int d(String str, String str2, int i, int i2) {
        List<Integer> listE = kwt.b().e(i);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[listE.size() + 1];
        strArr[0] = String.valueOf(1);
        kwb.e("client_id", new ArrayList(listE), stringBuffer, strArr, 1);
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        LogUtil.d("HiH_HiBaseDataMigrateOperation", "update migrate tableName=", str2, ", sql =", stringBuffer.toString(), ", selectionArgs=", HiJsonUtil.d(strArr));
        return kvy.d(str, str2, contentValues, stringBuffer.toString(), strArr);
    }

    private int e(String str, String str2, int i, int i2) {
        String str3;
        String[] strArr = {Integer.toString(i), Integer.toString(1)};
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        if (!"hihealth_dataclient".equals(str2)) {
            str3 = "user_id =? and sync_status =? ";
        } else {
            String[] strArr2 = {Integer.toString(i), Integer.toString(1), Integer.toString(0)};
            contentValues.put("cloud_device", (Integer) 0);
            str3 = "user_id =? and sync_status =?  and cloud_device >? ";
            strArr = strArr2;
        }
        LogUtil.d("HiH_HiBaseDataMigrateOperation", "whereClause=", str3, ", whereArgs=", HiJsonUtil.d(strArr));
        return kvy.d(str, str2, contentValues, str3, strArr);
    }

    private int e(String str, String str2, int[] iArr, int i, int i2) {
        List<Integer> listE = kwt.b().e(i);
        if (CollectionUtils.a(listE) || iArr == null || iArr.length == 0) {
            return 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        List list = (List) Arrays.stream(iArr).boxed().collect(Collectors.toList());
        String[] strArr = new String[listE.size() + list.size() + 1];
        strArr[0] = String.valueOf(1);
        if ("hihealth_stat_day".equals(str2)) {
            kwb.e("stat_type", (List<Integer>) list, stringBuffer, strArr, 1);
        } else {
            kwb.e("type_id", (List<Integer>) list, stringBuffer, strArr, 1);
        }
        kwb.e("client_id", new ArrayList(listE), stringBuffer, strArr, list.size() + 1);
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        LogUtil.d("HiH_HiBaseDataMigrateOperation", "update migrate tableName=", str2, ", sql =", stringBuffer.toString(), ", selectionArgs=", HiJsonUtil.d(strArr));
        return kvy.d(str, str2, contentValues, stringBuffer.toString(), strArr);
    }

    private int c(int[] iArr, String str, String str2, int i) {
        String[] strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Integer> listE = kwt.b().e(i);
        if (CollectionUtils.a(listE) || iArr == null || iArr.length == 0) {
            return 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if ("hihealth_003.db".equals(str) && "hihealth_stat_day".equals(str2)) {
            int[] iArrE = e();
            strArr = new String[listE.size() + iArr.length + iArrE.length];
            kwe.d(d(str2), iArr, stringBuffer, strArr, 0);
            kwb.e("client_id", new ArrayList(listE), stringBuffer, strArr, iArr.length);
            kwe.d("hihealth_type", iArrE, stringBuffer, strArr, listE.size() + iArr.length);
        } else {
            strArr = new String[listE.size() + iArr.length];
            kwe.d(d(str2), iArr, stringBuffer, strArr, 0);
            kwb.e("client_id", new ArrayList(listE), stringBuffer, strArr, iArr.length);
        }
        String[] strArr2 = strArr;
        LogUtil.d("HiH_HiBaseDataMigrateOperation", "delete migrate tableName=", str2, " sql =", stringBuffer.toString(), ", selectionArgs=", HiJsonUtil.d(strArr2));
        int iC = kvy.c(str, str2, stringBuffer.toString(), strArr2);
        ReleaseLogUtil.d("HiH_HiBaseDataMigrateOperation", "migrateBaseData deleteCount=", Integer.valueOf(iC), ", tm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return iC;
    }

    private int[] e() {
        List<Integer> listE = HiHealthDictManager.a(BaseApplication.b()).e();
        ArrayList arrayList = new ArrayList();
        arrayList.add(30001);
        arrayList.addAll(listE);
        return arrayList.stream().mapToInt(new cyf()).toArray();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private String d(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1887652205) {
            if (iHashCode != -345528434) {
                if (iHashCode == 629588169 && str.equals("business_data")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("config_stat_day")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("hihealth_stat_day")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0 || b2 == 1) {
            return "stat_type";
        }
        if (b2 == 2) {
            return "type";
        }
        return "type_id";
    }
}
