package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcloudmodel.model.unite.ServiceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ecf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<String> f32733a;

    static {
        ArrayList<String> arrayList = new ArrayList<>(10);
        f32733a = arrayList;
        arrayList.add(0, "dltId1");
        f32733a.add(1, "dltId2");
        f32733a.add(2, "dltId3");
        f32733a.add(3, "dltId4");
        f32733a.add(4, "dltId5");
        f32733a.add(5, "dltId6");
        f32733a.add(6, "dltId7");
        f32733a.add(7, "dltId8");
        f32733a.add(8, "dltId9");
        f32733a.add(9, "dltId10");
    }

    public static eby e(String str) throws Throwable {
        LogUtil.a("DataBaseApi", "getDeviceByProduct productID ", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<eby> arrayListC = c("WiFiBindDevice", dmk.c.b(), "productId=?", new String[]{str}, "_id DESC", "1");
        LogUtil.a("DataBaseApi", "getWiFiDeviceByProductId device size ", Integer.valueOf(arrayListC.size()));
        if (njy.e(arrayListC)) {
            LogUtil.j("DataBaseApi", "getWiFiDeviceByProductId has no wifi device");
            return null;
        }
        return arrayListC.get(0);
    }

    public static eby d(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DataBaseApi", "getWiFiDeviceByDeviceId deviceId is null");
            return null;
        }
        ArrayList<eby> arrayListC = c("WiFiBindDevice", dmk.c.b(), "deviceId=?", new String[]{str}, "_id DESC", null);
        if (njy.e(arrayListC)) {
            return null;
        }
        return arrayListC.get(arrayListC.size() - 1);
    }

    public static eby i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<eby> arrayListC = c("WiFiBindDevice", dmk.c.b(), "sn=?", new String[]{str}, "_id DESC", "1");
        if (njy.e(arrayListC)) {
            return null;
        }
        eby ebyVar = arrayListC.get(arrayListC.size() - 1);
        if (ebyVar == null) {
            LogUtil.j("DataBaseApi", "get wifi device by productId fail!");
            return null;
        }
        ebyVar.setSerialNumber(str);
        return ebyVar;
    }

    public static ArrayList<eby> a() {
        return c("WiFiBindDevice", dmk.c.b(), null, null, null, null);
    }

    public static ArrayList<String> c() throws Throwable {
        try {
            ArrayList<ContentValues> arrayListC = c("WiFiBindDevice", new String[]{"deviceId"}, null, null);
            ArrayList<String> arrayList = new ArrayList<>(10);
            if (!njy.e(arrayListC)) {
                Iterator<ContentValues> it = arrayListC.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAsString("deviceId"));
                }
            }
            return arrayList;
        } catch (SQLiteException e) {
            LogUtil.e("DataBaseApi", "getBindWiFiProductID() Exception =", e.getMessage());
            return new ArrayList<>(0);
        }
    }

    public static long b(eby ebyVar) {
        long jE = -1;
        if (ebyVar != null) {
            try {
                if (!ebyVar.g()) {
                    LogUtil.a("DataBaseApi", "insert device ", ebyVar.toString());
                    jE = dmk.d().e("WiFiBindDevice", e(ebyVar));
                    LogUtil.a("DataBaseApi", "insert count ", Long.valueOf(jE));
                    return jE;
                }
            } catch (SQLiteException e) {
                LogUtil.e("DataBaseApi", "insertWiFiDevice() Exception =", e.getMessage());
            }
        }
        return jE;
    }

    public static long c(eby ebyVar) {
        if (ebyVar != null) {
            try {
                if (!TextUtils.isEmpty(ebyVar.getSerialNumber())) {
                    LogUtil.a("DataBaseApi", "update device ", ebyVar.toString());
                    return dmk.d().d("WiFiBindDevice", e(ebyVar), "sn=?", new String[]{String.valueOf(ebyVar.getSerialNumber())});
                }
            } catch (SQLiteException e) {
                LogUtil.e("DataBaseApi", "updateWiFiDevice Exception =", e.getMessage());
                return -1L;
            }
        }
        LogUtil.j("DataBaseApi", "updateWiFiDevice illegal argument: device ");
        return -1L;
    }

    public static int d() {
        try {
            return dmk.d().c("WiFiBindDevice", null, null);
        } catch (SQLiteException e) {
            dyg.c(false, "DataBaseApi", "deleteWiFiDevice() Exception =", e.getMessage());
            return -1;
        }
    }

    public static long c(String str) {
        int iC = -1;
        try {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("DataBaseApi", "deleteWiFiDeviceBySerialNumber serialNumber = null");
                return -1;
            }
            LogUtil.a("DataBaseApi", "deleteWiFiDeviceBySerialNumber enter serialNumber ", dyg.b(str));
            iC = dmk.d().c("WiFiBindDevice", "sn=?", new String[]{str});
            LogUtil.a("DataBaseApi", "deleteWiFiDeviceBySerialNumber count = ", Integer.valueOf(iC));
            return iC;
        } catch (SQLiteException e) {
            LogUtil.e("DataBaseApi", "deleteWiFiDeviceBySerialNumber Exception =", e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00a9: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:39:0x00a9 */
    public static String g(String str) throws Throwable {
        Cursor cursorD;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                if (TextUtils.isEmpty(str)) {
                    LogUtil.j("DataBaseApi", "getDeviceProductId deiviceId is null");
                    return null;
                }
                LogUtil.a("DataBaseApi", "getDeviceProductId deiviceId ", dyg.b(str));
                cursorD = dmk.d().d("WiFiBindDevice", new String[]{"productId"}, "deviceId=?", new String[]{str}, null, null, "_id DESC", "1");
                try {
                    if (cursorD == null) {
                        LogUtil.j("DataBaseApi", "getDeviceProductId cursor is null");
                        if (cursorD != null) {
                            cursorD.close();
                        }
                        return null;
                    }
                    if (cursorD.getCount() == 0) {
                        LogUtil.j("DataBaseApi", "getDeviceProductId cursor size is 0");
                        if (cursorD != null) {
                            cursorD.close();
                        }
                        return null;
                    }
                    String string = null;
                    while (cursorD.moveToNext()) {
                        string = cursorD.getString(cursorD.getColumnIndex("productId"));
                        if (!TextUtils.isEmpty(string)) {
                            break;
                        }
                    }
                    LogUtil.a("DataBaseApi", "getDeviceProductId product ,", string);
                    if (cursorD != null) {
                        cursorD.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    LogUtil.e("DataBaseApi", "getWiFiDeviceProductId() Exception =", e.getMessage());
                    if (cursorD != null) {
                        cursorD.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorD = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public static eal a(String str) throws Throwable {
        Throwable th;
        Cursor cursorD;
        SQLException e;
        eal ealVar;
        Cursor cursor = null;
        ealVarE = null;
        ealVarE = null;
        eal ealVarE = null;
        cursor = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LogUtil.a("DataBaseApi", "getDeviceByDeviceID deviceID ", dyg.b(str));
        try {
            try {
                cursorD = dmk.d().d("WiFiDeviceSubUser", dmk.a.c(), "deviceId= ?", new String[]{str}, null, null, null, null);
                if (cursorD != null) {
                    try {
                        if (cursorD.moveToNext()) {
                            ealVarE = e(cursorD);
                            LogUtil.a("DataBaseApi", ealVarE.toString());
                        }
                    } catch (SQLException e2) {
                        e = e2;
                        eal ealVar2 = ealVarE;
                        cursor = cursorD;
                        ealVar = ealVar2;
                        LogUtil.e("DataBaseApi", "getSubUser catch sql exception ", e.getMessage());
                        if (cursor != null) {
                            cursor.close();
                        }
                        return ealVar;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorD != null) {
                            cursorD.close();
                        }
                        throw th;
                    }
                }
                if (cursorD != null) {
                    cursorD.close();
                }
                return ealVarE;
            } catch (SQLException e3) {
                e = e3;
                ealVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursorD = cursor;
        }
    }

    private static long b(eal ealVar) {
        if (ealVar == null) {
            LogUtil.a("DataBaseApi", "insert userInfo is null ");
            return -1L;
        }
        LogUtil.a("DataBaseApi", "insert SubUser ", ealVar.toString());
        long jE = dmk.d().e("WiFiDeviceSubUser", a(ealVar));
        LogUtil.a("DataBaseApi", "insert count ", Long.valueOf(jE));
        return jE;
    }

    public static long c(eal ealVar) {
        if (ealVar == null || ealVar.b()) {
            LogUtil.a("DataBaseApi", "setSubUser userInfo is null");
            return -1L;
        }
        if (a(ealVar.c()) == null) {
            return b(d(ealVar));
        }
        return e(d(ealVar));
    }

    private static eal d(eal ealVar) {
        ArrayList<eaj> arrayListE = ealVar.e();
        if (arrayListE != null && arrayListE.size() > 0) {
            for (eaj eajVar : arrayListE) {
                if (TextUtils.isEmpty(eajVar.d())) {
                    String strA = a(arrayListE);
                    if (!TextUtils.isEmpty(strA)) {
                        eajVar.a(strA);
                    } else {
                        LogUtil.j("DataBaseApi", "setSubUserSid() sid is error:", " huid:", dyg.b(eajVar.a()));
                    }
                }
            }
            ealVar.b(arrayListE);
        }
        return ealVar;
    }

    public static long d(String str, eaj eajVar) throws Throwable {
        if (TextUtils.isEmpty(str) || eajVar == null) {
            return -1L;
        }
        eal ealVarA = a(str);
        if (ealVarA == null) {
            return 0L;
        }
        ArrayList<eaj> arrayListE = ealVarA.e();
        if (arrayListE == null || arrayListE.size() <= 0) {
            return -1L;
        }
        for (int i = 0; i < arrayListE.size(); i++) {
            if (eajVar.a().equals(arrayListE.get(i).a())) {
                arrayListE.remove(i);
                break;
            }
        }
        if (arrayListE.size() > 0) {
            ealVarA.b(arrayListE);
            return e(ealVarA);
        }
        return b(str);
    }

    public static long e(String str, eaj eajVar) throws Throwable {
        ArrayList<eaj> arrayListE;
        if (TextUtils.isEmpty(str) || eajVar == null) {
            dyg.d(false, "DataBaseApi", "updateSubUser deviceid is null or user is null");
            return -1L;
        }
        eal ealVarA = a(str);
        if (ealVarA == null || (arrayListE = ealVarA.e()) == null || arrayListE.size() <= 0) {
            return -1L;
        }
        for (int i = 0; i < arrayListE.size(); i++) {
            if (eajVar.a().equals(arrayListE.get(i).a())) {
                eajVar.a(arrayListE.get(i).d());
                arrayListE.set(i, eajVar);
                break;
            }
        }
        ealVarA.b(arrayListE);
        return e(ealVarA);
    }

    public static long c(String str, eaj eajVar) throws Throwable {
        if (TextUtils.isEmpty(str) || eajVar.f()) {
            dyg.a(false, "DataBaseApi", "updateSubUser DeviceUserInfo is null");
            return -1L;
        }
        eal ealVarA = a(str);
        if (ealVarA == null) {
            eal ealVar = new eal();
            ealVar.c(str);
            return b(a(ealVar, eajVar));
        }
        return e(a(ealVarA, eajVar));
    }

    private static eal a(eal ealVar, eaj eajVar) {
        ArrayList<eaj> arrayListE = ealVar.e();
        if (TextUtils.isEmpty(eajVar.d())) {
            String strA = a(arrayListE);
            dyg.d(false, "DataBaseApi", "updataUser sid ", strA);
            if (!TextUtils.isEmpty(strA)) {
                eajVar.a(strA);
            } else {
                dyg.d(false, "DataBaseApi", "updataUser sid is error huid:", dyg.b(eajVar.a()));
            }
        }
        ealVar.d(eajVar);
        return ealVar;
    }

    private static String a(ArrayList<eaj> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return f32733a.get(0);
        }
        LogUtil.a("DataBaseApi", "getSid users ", arrayList.toString());
        for (String str : f32733a) {
            Iterator<eaj> it = arrayList.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().d())) {
                }
            }
            return str;
        }
        LogUtil.a("DataBaseApi", "getSid return null ");
        return null;
    }

    private static long e(eal ealVar) {
        if (ealVar == null) {
            LogUtil.j("DataBaseApi", "update userInfo is null ");
            return -1L;
        }
        LogUtil.a("DataBaseApi", "update SubUser ", ealVar.toString());
        long jD = dmk.d().d("WiFiDeviceSubUser", a(ealVar), "deviceId=?", new String[]{String.valueOf(ealVar.c())});
        LogUtil.a("DataBaseApi", "update count ", Long.valueOf(jD));
        return jD;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DataBaseApi", "deleteByDeviceID() wifiDeviceID = null");
            return -1;
        }
        LogUtil.a("DataBaseApi", "deleteByDeviceID() enter wifiDeviceID ", dyg.b(str));
        int iC = dmk.d().c("WiFiDeviceSubUser", "deviceId=?", new String[]{str});
        LogUtil.a("DataBaseApi", "deleteByDeviceID() count = ", Integer.valueOf(iC));
        return iC;
    }

    public static int b() {
        LogUtil.a("DataBaseApi", "deleteAllSubUser enter");
        int iC = dmk.d().c("WiFiDeviceSubUser", null, null);
        LogUtil.a("DataBaseApi", "deleteAllSubUser count = ", Integer.valueOf(iC));
        return iC;
    }

    public static ArrayList<String> e() {
        return e(1);
    }

    public static ArrayList<String> e(boolean z) {
        return a(1, z);
    }

    public static ArrayList<String> h() {
        return e(2);
    }

    private static String b(ArrayList<eaj> arrayList) {
        if (arrayList != null) {
            return new Gson().toJson(arrayList, new TypeToken<ArrayList<eaj>>() { // from class: com.huawei.health.device.wifi.lib.db.DataBaseApi$1
            }.getType());
        }
        return "";
    }

    private static ArrayList<eaj> j(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (ArrayList) new Gson().fromJson(CommonUtil.ac(str), new TypeToken<ArrayList<eaj>>() { // from class: com.huawei.health.device.wifi.lib.db.DataBaseApi$2
            }.getType());
        }
        return new ArrayList<>(10);
    }

    private static eal e(Cursor cursor) {
        eal ealVar = new eal();
        ealVar.c(cursor.getString(cursor.getColumnIndex("deviceId")));
        ealVar.b(j(cursor.getString(cursor.getColumnIndex("subUser"))));
        LogUtil.a("DataBaseApi", "getWiFiDeviceUser SubUser ", ealVar.toString());
        return ealVar;
    }

    private static ContentValues a(eal ealVar) {
        LogUtil.a("DataBaseApi", "getContentValues deviceid ", dyg.b(ealVar.c()));
        ContentValues contentValues = new ContentValues();
        contentValues.put("deviceId", ealVar.c());
        if (ealVar.e() != null && ealVar.e().size() > 0) {
            contentValues.put("subUser", b(ealVar.e()));
        }
        return contentValues;
    }

    private static ContentValues e(eby ebyVar) {
        LogUtil.a("DataBaseApi", "getContentValues deviceid ", dyg.b(ebyVar.a().c()));
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", ebyVar.getProductId());
        contentValues.put("deviceId", ebyVar.a().c());
        contentValues.put("deviceCode", String.valueOf(ebyVar.a().d()));
        contentValues.put("sn", ebyVar.a().l());
        contentValues.put("model", ebyVar.a().f());
        contentValues.put("deviceType", ebyVar.a().a());
        contentValues.put(ProfileRequestConstants.MANU, ebyVar.a().j());
        contentValues.put("prodId", ebyVar.a().h());
        contentValues.put(ProfileRequestConstants.HIV, ebyVar.a().e());
        contentValues.put(ProfileRequestConstants.FWV, ebyVar.a().b());
        contentValues.put(ProfileRequestConstants.HWV, ebyVar.a().i());
        contentValues.put(ProfileRequestConstants.SWV, ebyVar.a().k());
        contentValues.put("mac", ebyVar.a().g());
        contentValues.put(ProfileRequestConstants.PROT_TYPE, Integer.valueOf(ebyVar.a().o()));
        contentValues.put("source", Integer.valueOf(ebyVar.a().m()));
        LogUtil.a("DataBaseApi", "getContentValues source ", Integer.valueOf(ebyVar.a().m()));
        if (ebyVar.d() != null && ebyVar.d().size() > 0) {
            contentValues.put("serviceInfo", e(ebyVar.d()));
        }
        return contentValues;
    }

    private static String e(List<eby.c> list) {
        if (list != null) {
            return new Gson().toJson(list, new TypeToken<List<ServiceInfo>>() { // from class: com.huawei.health.device.wifi.lib.db.DataBaseApi$3
            }.getType());
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private static ArrayList<ContentValues> c(String str, String[] strArr, String str2, String[] strArr2) throws Throwable {
        SQLException e;
        Cursor cursorD;
        String[] strArrF = strArr != null ? strArr : f(str);
        ?? r1 = 0;
        try {
            try {
                cursorD = dmk.d().d(str, strArr, str2, strArr2, null, null, null, null);
                try {
                    ArrayList<ContentValues> arrayListD = d(cursorD, strArrF);
                    if (cursorD != null && !cursorD.isClosed()) {
                        cursorD.close();
                    }
                    return arrayListD;
                } catch (SQLException e2) {
                    e = e2;
                    LogUtil.j("DataBaseApi", "queryRawData throw SQLException ", e.getMessage());
                    if (cursorD != null && !cursorD.isClosed()) {
                        cursorD.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = str;
                th = th;
                if (r1 != 0 && !r1.isClosed()) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLException e3) {
            e = e3;
            cursorD = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    private static String[] f(String str) {
        if ("WiFiBindDevice".equals(str)) {
            return dmk.c.b();
        }
        if ("WiFiDeviceList".equals(str)) {
            return dmk.e.a();
        }
        if ("WiFiDeviceSubUser".equals(str)) {
            return dmk.a.c();
        }
        LogUtil.j("DataBaseApi", "getTableAllColumns unknow table: ", str);
        return new String[0];
    }

    private static ArrayList<ContentValues> d(Cursor cursor, String[] strArr) {
        ArrayList<ContentValues> arrayList = new ArrayList<>(10);
        if (cursor == null || cursor.isClosed() || strArr == null) {
            LogUtil.j("DataBaseApi", "getColumnsFromCursor illegal value ");
            return arrayList;
        }
        StringBuffer stringBuffer = new StringBuffer(10);
        while (cursor.moveToNext()) {
            ContentValues contentValues = new ContentValues();
            boolean z = true;
            for (String str : strArr) {
                if (cursor.getColumnIndex(str) == -1) {
                    stringBuffer.append("missing " + str + ";");
                } else {
                    contentValues.put(str, cursor.getString(cursor.getColumnIndex(str)));
                    z = false;
                }
            }
            if (!z) {
                arrayList.add(contentValues);
            }
        }
        String string = stringBuffer.toString();
        if (!TextUtils.isEmpty(string)) {
            LogUtil.j("DataBaseApi", "getColumnsFromCursor some columns missing:", string);
        }
        return arrayList;
    }

    private static eby c(ContentValues contentValues) {
        eby ebyVar = new eby();
        ebyVar.setProductId(contentValues.getAsString("productId"));
        ebyVar.a().c(contentValues.getAsString("deviceId"));
        ebyVar.a().a(CommonUtil.i(contentValues.getAsString("deviceCode")));
        ebyVar.a().h(contentValues.getAsString("sn"));
        ebyVar.a().j(contentValues.getAsString("model"));
        ebyVar.a().d(contentValues.getAsString("deviceType"));
        ebyVar.a().i(contentValues.getAsString(ProfileRequestConstants.MANU));
        ebyVar.a().f(contentValues.getAsString("prodId"));
        ebyVar.a().b(contentValues.getAsString(ProfileRequestConstants.HIV));
        ebyVar.a().e(contentValues.getAsString(ProfileRequestConstants.FWV));
        ebyVar.a().a(contentValues.getAsString(ProfileRequestConstants.HWV));
        ebyVar.a().m(contentValues.getAsString(ProfileRequestConstants.SWV));
        ebyVar.a().g(contentValues.getAsString("mac"));
        ebyVar.a().a(CommonUtil.j(contentValues.getAsString(ProfileRequestConstants.PROT_TYPE)));
        ebyVar.a().b(CommonUtil.j(contentValues.getAsString("source")));
        ebyVar.a(h(contentValues.getAsString("serviceInfo")));
        LogUtil.a("DataBaseApi", "getWiFiDevice device ", ebyVar.toString());
        return ebyVar;
    }

    private static List<eby.c> h(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (List) new Gson().fromJson(CommonUtil.ac(str), new TypeToken<List<eby.c>>() { // from class: com.huawei.health.device.wifi.lib.db.DataBaseApi$4
            }.getType());
        }
        return new ArrayList(10);
    }

    private static ArrayList<String> e(int i) {
        Cursor cursorD = dmk.d().d("WiFiBindDevice", dmk.c.b(), "source = ?", new String[]{String.valueOf(i)}, null, null, null, null);
        ArrayList<String> arrayList = new ArrayList<>(16);
        if (cursorD == null) {
            LogUtil.j("DataBaseApi", " getAllCurrentUserDeviceID cursor is null");
            return arrayList;
        }
        if (cursorD.getCount() <= 0) {
            LogUtil.j("DataBaseApi", " getAllCurrentUserDeviceID cursor size is 0");
            cursorD.close();
            return arrayList;
        }
        while (cursorD.moveToNext()) {
            try {
                try {
                    arrayList.add(cursorD.getString(cursorD.getColumnIndex("deviceId")));
                } catch (SQLException e) {
                    LogUtil.e("DataBaseApi", "getDeviceIdBySource catch sql exception ", e.getMessage());
                }
            } catch (Throwable th) {
                cursorD.close();
                throw th;
            }
        }
        cursorD.close();
        LogUtil.a("DataBaseApi", " getAllCurrentUserDeviceID list ", arrayList.toString());
        return arrayList;
    }

    private static ArrayList<String> a(int i, boolean z) {
        Cursor cursorD = dmk.d().d("WiFiBindDevice", dmk.c.b(), "source = ?", new String[]{String.valueOf(i)}, null, null, null, null);
        ArrayList<String> arrayList = new ArrayList<>(16);
        if (cursorD == null) {
            LogUtil.j("DataBaseApi", " getAllCurrentUserDeviceID cursorQuery is null");
            return arrayList;
        }
        if (cursorD.getCount() <= 0) {
            LogUtil.j("DataBaseApi", " getAllCurrentUserDeviceID cursorQuery size is 0");
            cursorD.close();
            return arrayList;
        }
        while (cursorD.moveToNext()) {
            try {
                try {
                    String string = cursorD.getString(cursorD.getColumnIndex("deviceId"));
                    eby ebyVarD = d(string);
                    if (z) {
                        if (ebyVarD == null || ebyVarD.a() == null || ebyVarD.a().m() == 1) {
                            LogUtil.j("DataBaseApi", "getDeviceIdBySource deviceIdList not add : ", dyg.b(string));
                        } else {
                            arrayList.add(string);
                        }
                    } else {
                        arrayList.add(string);
                    }
                } catch (SQLException e) {
                    LogUtil.e("DataBaseApi", "getDeviceIdBySource isHagridDevice catch sql exception ", e.getMessage());
                }
            } catch (Throwable th) {
                cursorD.close();
                throw th;
            }
        }
        cursorD.close();
        LogUtil.a("DataBaseApi", " getAllCurrentUserDeviceID isHagridDevice list ", arrayList.toString());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ArrayList<eby> c(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) throws Throwable {
        ArrayList<ContentValues> arrayList;
        Cursor cursorD;
        ArrayList<ContentValues> arrayListD = null;
        arrayListD = null;
        Cursor cursor = null;
        try {
            try {
                cursorD = dmk.d().d(str, strArr, str2, strArr2, null, null, str3, str4);
                try {
                    arrayListD = d(cursorD, strArr);
                    if (cursorD != 0) {
                        cursorD.close();
                    }
                    if (cursorD != 0) {
                        cursorD.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    arrayList = arrayListD;
                    cursor = cursorD;
                    LogUtil.e("DataBaseApi", "getWiFiDeviceForDeviceID() Exception =", e.getMessage());
                    if (cursor != null) {
                        cursor.close();
                    }
                    arrayListD = arrayList;
                } catch (Throwable th) {
                    th = th;
                    if (cursorD != 0) {
                        cursorD.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorD = arrayListD;
            }
        } catch (SQLiteException e2) {
            e = e2;
            arrayList = null;
        }
        ArrayList<eby> arrayList2 = new ArrayList<>();
        if (!njy.e(arrayListD)) {
            Iterator<ContentValues> it = arrayListD.iterator();
            while (it.hasNext()) {
                arrayList2.add(c(it.next()));
            }
        }
        return arrayList2;
    }
}
