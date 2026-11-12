package com.huawei.hianalytics.core.storage;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.hianalytics.core.b;
import com.huawei.hianalytics.core.d;
import com.huawei.hianalytics.core.e;
import com.huawei.hianalytics.core.g;
import com.huawei.hianalytics.core.h;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DaoManager {
    private static final String TAG = "DaoManager";
    private e eventDao;
    private b headerDao;
    private boolean initialized;
    private g mcInfoDao;
    private h mcTagDao;

    public static DaoManager getInstance() {
        return d.f11471a;
    }

    public boolean checkAndClearTable() {
        h hVar = this.mcTagDao;
        if (hVar.d == null) {
            hVar.d = hVar.f11469b.compileStatement("SELECT COUNT(*) FROM \"" + hVar.f11468a + '\"');
        }
        if (hVar.d.simpleQueryForLong() > 500) {
            this.mcTagDao.a();
        }
        g gVar = this.mcInfoDao;
        if (gVar.d == null) {
            gVar.d = gVar.f11469b.compileStatement("SELECT COUNT(*) FROM \"" + gVar.f11468a + '\"');
        }
        if (gVar.d.simpleQueryForLong() < 500) {
            return false;
        }
        this.mcInfoDao.a();
        return true;
    }

    public long countBySubCount(String str, String str2, String str3) {
        if (this.initialized) {
            return this.eventDao.a(str, str2, str3);
        }
        HiLog.w(TAG, "DaoManager not initialized, return");
        return 0L;
    }

    public long countEvents() {
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return 0L;
        }
        e eVar = this.eventDao;
        if (eVar.e == null) {
            eVar.e = eVar.f11469b.compileStatement("SELECT COUNT(*) FROM \"EVENT\"");
        }
        return eVar.e.simpleQueryForLong();
    }

    public void createEventTable(SQLiteDatabase sQLiteDatabase) {
        DBUtil.exec(sQLiteDatabase, e.f);
    }

    public void createHeaderTable(SQLiteDatabase sQLiteDatabase) {
        DBUtil.exec(sQLiteDatabase, b.e);
        HiLog.i("CommonHeaderExDao", "createTable");
    }

    public void createMcInfoTable(SQLiteDatabase sQLiteDatabase) {
        DBUtil.exec(sQLiteDatabase, g.h);
        HiLog.i("MetricMcInfoDao", "createTable");
    }

    public void createMcTagTable(SQLiteDatabase sQLiteDatabase) {
        DBUtil.exec(sQLiteDatabase, h.k);
        HiLog.i("MetricMcTagDao", "createTable");
    }

    public void deleteAllEvents() {
        if (this.initialized) {
            this.eventDao.a();
        } else {
            HiLog.w(TAG, "DaoManager not initialized, return");
        }
    }

    public void deleteAllHeaders() {
        if (this.initialized) {
            this.headerDao.a();
        } else {
            HiLog.w(TAG, "DaoManager not initialized, return");
        }
    }

    public void deleteAllInfo() {
        if (this.initialized) {
            this.mcInfoDao.a();
        } else {
            HiLog.w(TAG, "DaoManager not initialized, return");
        }
    }

    public void deleteEvents(String str, String str2) {
        String str3;
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return;
        }
        e eVar = this.eventDao;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            str3 = null;
        } else {
            arrayList.add(str);
            str3 = Event.COLUMN_SERVICE_TAG.columnName + "=?";
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            str3 = str3 + " AND " + Event.COLUMN_EVT_TYPE.columnName + "=?";
        }
        if (str3 == null) {
            return;
        }
        eVar.b(str3, (String[]) arrayList.toArray(new String[0]));
    }

    public int deleteMcInfo(List<String> list) {
        g gVar = this.mcInfoDao;
        gVar.getClass();
        if (list == null || list.isEmpty()) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
            sb.append("?");
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        return gVar.b(g.e.columnName + " in( " + ((Object) sb) + " )", strArr);
    }

    public int deleteMcTag(List<String> list) {
        h hVar = this.mcTagDao;
        hVar.getClass();
        return hVar.a(list, h.e.columnName);
    }

    public void dropAllTable(SQLiteDatabase sQLiteDatabase) {
        String str = e.f;
        DBUtil.dropTable(sQLiteDatabase, Event.TABLE_NAME);
        String str2 = b.e;
        DBUtil.dropTable(sQLiteDatabase, CommonHeaderEx.TABLE_NAME);
        HiLog.w("CommonHeaderExDao", "dropTable");
        Property property = h.e;
        DBUtil.dropTable(sQLiteDatabase, "METRIC_MC_TAG");
        HiLog.w("MetricMcTagDao", "dropTable");
        Property property2 = g.e;
        DBUtil.dropTable(sQLiteDatabase, "METRIC_MC_INFO");
        HiLog.w("MetricMcInfoDao", "dropTable");
        HiLog.i(TAG, "dropAllTable");
    }

    public void init(SQLiteDatabase sQLiteDatabase) {
        this.eventDao = new e(sQLiteDatabase);
        this.headerDao = new b(sQLiteDatabase);
        this.mcTagDao = new h(sQLiteDatabase);
        this.mcInfoDao = new g(sQLiteDatabase);
        this.initialized = true;
    }

    public long insert(Event event) {
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return 0L;
        }
        e eVar = this.eventDao;
        eVar.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(event);
        return eVar.a((List) arrayList, false);
    }

    public void insertEvents(List<Event> list) {
        if (this.initialized) {
            this.eventDao.a((List) list, false);
        } else {
            HiLog.w(TAG, "DaoManager not initialized, return");
        }
    }

    public long insertHeaders(List<CommonHeaderEx> list) {
        if (this.initialized) {
            return this.headerDao.a((List) list, true);
        }
        HiLog.w(TAG, "DaoManager not initialized, return");
        return 0L;
    }

    public long insertMcInfo(String str) {
        return insertMcInfoList(Collections.singletonList(str));
    }

    public long insertMcInfoList(List<String> list) {
        return this.mcInfoDao.a((List) list, false);
    }

    public long insertMcTagList(List<String> list) {
        h hVar = this.mcTagDao;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(new JSONObject(it.next()).optString(h.f.columnName, ""));
            } catch (JSONException e) {
                HiLog.w("MetricMcTagDao", e.getMessage());
            }
        }
        hVar.a(arrayList, h.f.columnName);
        return hVar.a((List) list, false);
    }

    public List<String> queryMcInfo() {
        g gVar = this.mcInfoDao;
        gVar.getClass();
        String str = g.e.columnName;
        String str2 = g.f.columnName;
        Property property = g.g;
        return gVar.a(new String[]{str, str2, property.columnName}, null, null, property.columnName + " DESC", null);
    }

    public List<String> queryMcTag(String str) {
        h hVar = this.mcTagDao;
        hVar.getClass();
        String str2 = h.e.columnName;
        String str3 = h.f.columnName;
        String str4 = h.g.columnName;
        String str5 = h.h.columnName;
        Property property = h.i;
        return hVar.a(new String[]{str2, str3, str4, str5, property.columnName, h.j.columnName}, property.columnName + " =?", new String[]{str}, null, "1000");
    }

    public List<Event> readEvents(String str, String str2, String str3, long j) {
        String[] strArr;
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return new ArrayList();
        }
        e eVar = this.eventDao;
        eVar.getClass();
        String str4 = Event.COLUMN_ID.columnName;
        String str5 = Event.COLUMN_IS_ENCRYPTED.columnName;
        String str6 = Event.COLUMN_SESSION_ID.columnName;
        String str7 = Event.COLUMN_CONTENT.columnName;
        String str8 = Event.COLUMN_EVT_ID.columnName;
        Property property = Event.COLUMN_PROCESS_NAME;
        String str9 = property.columnName;
        String str10 = Event.COLUMN_EVT_EX_HASH_CODE.columnName;
        String str11 = Event.COLUMN_SESSION_NAME.columnName;
        Property property2 = Event.COLUMN_SERVICE_TAG;
        String str12 = property2.columnName;
        Property property3 = Event.COLUMN_EVT_TIME;
        String str13 = property3.columnName;
        Property property4 = Event.COLUMN_EVT_TYPE;
        String[] strArr2 = {str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, property4.columnName, Event.COLUMN_SUB_COUNT.columnName};
        String str14 = "";
        if (j > 0) {
            str14 = property3.columnName + "<? AND ";
            strArr = new String[]{String.valueOf(j), str, str2, str3, ""};
        } else {
            strArr = new String[]{str, str2, str3, ""};
        }
        return eVar.a(strArr2, str14 + property2.columnName + "=? AND " + property4.columnName + "=? AND (" + property.columnName + "=? or " + property.columnName + "=?)", strArr, null, "1000");
    }

    public CommonHeaderEx readHeader(String str) {
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return new CommonHeaderEx();
        }
        b bVar = this.headerDao;
        bVar.getClass();
        Property property = CommonHeaderEx.COLUMN_HASHCODE;
        ArrayList arrayListA = bVar.a(new String[]{property.columnName, CommonHeaderEx.COLUMN_HEADER.columnName}, property.columnName + " =?", new String[]{str}, null, "1000");
        return !arrayListA.isEmpty() ? (CommonHeaderEx) arrayListA.get(0) : new CommonHeaderEx();
    }

    private DaoManager() {
    }

    public long insert(CommonHeaderEx commonHeaderEx) {
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return 0L;
        }
        b bVar = this.headerDao;
        bVar.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(commonHeaderEx);
        return bVar.a((List) arrayList, true);
    }

    public void deleteEvents(List<Event> list) {
        if (!this.initialized) {
            HiLog.w(TAG, "DaoManager not initialized, return");
            return;
        }
        e eVar = this.eventDao;
        eVar.getClass();
        String[] strArr = new String[list.size()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i).getId());
            sb.append("?");
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        eVar.b(Event.COLUMN_ID.columnName + " in( " + ((Object) sb) + " )", strArr);
    }
}
