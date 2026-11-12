package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaLineRecord;
import com.huawei.pluginachievement.manager.model.KakaRecord;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class KakaLineRecordDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22011c;

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        return 0;
    }

    public KakaLineRecordDBMgr(Context context) {
        this.f22011c = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        String str = map.get("page");
        String str2 = map.get(IAchieveDBMgr.PARAM_PAGE_SIZE);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return d(map.get("huid"), ote.c(str), ote.c(str2));
        }
        LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "query page is null || pageSize is null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private osf d(String str, int i, int i2) throws Throwable {
        LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "query page=", Integer.valueOf(i));
        KakaLineRecord kakaLineRecord = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "query huid is null");
            return null;
        }
        String str2 = " select *  from " + otd.c(this.f22011c).getTableFullName("kaka_line") + " where huid =?  order by  occurDate desc limit ?,? ";
        String[] strArr = {ote.e(str), ote.e(String.valueOf((i - 1) * i2)), ote.e(String.valueOf(i2))};
        LogUtil.d("PLGACHIEVE_KakaLineRecordDBMgr", "query sql=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22011c).rawQueryStorageData(1, str2, strArr);
            if (cursorRawQueryStorageData != null) {
                try {
                    int count = cursorRawQueryStorageData.getCount();
                    LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "query count=", Integer.valueOf(count));
                    if (count <= 0) {
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    }
                    KakaLineRecord kakaLineRecord2 = new KakaLineRecord();
                    try {
                        ArrayList arrayList = new ArrayList(8);
                        while (cursorRawQueryStorageData.moveToNext()) {
                            KakaRecord kakaRecord = new KakaRecord();
                            kakaRecord.setKakaNum(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("kaka_num")));
                            kakaRecord.setDate(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("date_timestamp")));
                            kakaRecord.setDescription(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("description")));
                            kakaRecord.setOccurDate(c(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.OCCUR_DATE))));
                            arrayList.add(kakaRecord);
                        }
                        kakaLineRecord2.setHuid(str);
                        kakaLineRecord2.setTotalNum(e(str));
                        LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "query count=", Integer.valueOf(kakaLineRecord2.getTotalNum()));
                        kakaLineRecord2.setKakaLineRecords(arrayList);
                        kakaLineRecord = kakaLineRecord2;
                    } catch (Throwable th) {
                        th = th;
                        kakaLineRecord = kakaLineRecord2;
                        if (cursorRawQueryStorageData != null) {
                            try {
                                cursorRawQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                throw th;
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_KakaLineRecordDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_KakaLineRecordDBMgr", "query kakaLineRecord=", kakaLineRecord);
        return kakaLineRecord;
    }

    private int e(String str) {
        int count = 0;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "getTotalCount(),id is null!return 0");
            return 0;
        }
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22011c).rawQueryStorageData(1, "select *  from " + otd.c(this.f22011c).getTableFullName("kaka_line") + " where huid =? ", new String[]{ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                try {
                    count = cursorRawQueryStorageData.getCount();
                } catch (Throwable th) {
                    if (cursorRawQueryStorageData != null) {
                        try {
                            cursorRawQueryStorageData.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return count;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_KakaLineRecordDBMgr", e.getMessage());
            return count;
        }
    }

    private long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Timestamp.valueOf(str).getTime();
        } catch (IllegalArgumentException e) {
            LogUtil.e("PLGACHIEVE_KakaLineRecordDBMgr", "getTime() e=", e.getMessage());
            return 0L;
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        long j = -1;
        if (osfVar == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insert achieveData is null");
            return -1L;
        }
        KakaLineRecord kakaLineRecord = osfVar instanceof KakaLineRecord ? (KakaLineRecord) osfVar : null;
        if (kakaLineRecord == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insert kakaLineRecord is null");
            return -1L;
        }
        String huid = kakaLineRecord.getHuid();
        if (TextUtils.isEmpty(huid)) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insert huid is null");
            return -1L;
        }
        List<KakaRecord> kakaLineRecords = kakaLineRecord.getKakaLineRecords();
        if (kakaLineRecords == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insert kakaRecords is null");
            return -1L;
        }
        Iterator<KakaRecord> it = kakaLineRecords.iterator();
        while (it.hasNext()) {
            long jD = d(it.next(), huid);
            if (jD > 0) {
                j += jD;
            }
        }
        LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insert to KakaLineRecord result=", Long.valueOf(j));
        return j;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "delete achieveData is null");
            return -1;
        }
        KakaLineRecord kakaLineRecord = osfVar instanceof KakaLineRecord ? (KakaLineRecord) osfVar : null;
        if (kakaLineRecord == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "delete kakaLineRecord is null");
            return -1;
        }
        return otd.c(this.f22011c).deleteStorageData("kaka_line", 1, "huid=?", new String[]{ote.e(kakaLineRecord.getHuid())});
    }

    private boolean c(KakaRecord kakaRecord) {
        if (kakaRecord.getDate() == -1 || TextUtils.isEmpty(String.valueOf(kakaRecord.getDate()))) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "columCheck kakaRecord date can't be null");
            return false;
        }
        if (TextUtils.isEmpty(String.valueOf(kakaRecord.getKakaNum()))) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "columCheck kakaRecord kakaNum can't be null");
            return false;
        }
        if (!TextUtils.isEmpty(String.valueOf(kakaRecord.getDescription()))) {
            return true;
        }
        LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "columCheck kakaRecord description can't be null");
        return false;
    }

    private long d(KakaRecord kakaRecord, String str) {
        if (kakaRecord == null) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insertKakaRecord kakaRecord is null");
            return -1L;
        }
        if (!c(kakaRecord)) {
            LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insertKakaRecord kakaRecord colums have null data");
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", str);
        contentValues.put("date_timestamp", Long.valueOf(kakaRecord.getDate()));
        contentValues.put("description", Integer.valueOf(kakaRecord.getDescription()));
        contentValues.put("kaka_num", Integer.valueOf(kakaRecord.getKakaNum()));
        contentValues.put(ParsedFieldTag.OCCUR_DATE, String.valueOf(new Timestamp(kakaRecord.getOccurDate())));
        long j = otd.c(this.f22011c).insertStorageData("kaka_line", 1, contentValues) > 0 ? 1L : -1L;
        LogUtil.a("PLGACHIEVE_KakaLineRecordDBMgr", "insertKakaRecord into db successs result = ", Long.valueOf(j));
        return j;
    }
}
