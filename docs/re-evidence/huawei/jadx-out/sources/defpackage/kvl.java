package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.EcgMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiZipUtil;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kvl extends DBCommon {
    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ int delete(String str, String[] strArr) {
        return super.delete(str, strArr);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ void execSQL(String str, Object[] objArr) {
        super.execSQL(str, objArr);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ long insert(ContentValues contentValues) {
        return super.insert(contentValues);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ Cursor query(String str, String[] strArr, String str2, String str3, String str4) {
        return super.query(str, strArr, str2, str3, str4);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ Cursor queryEX(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return super.queryEX(strArr, str, strArr2, str2, str3, str4);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ Cursor rawQuery(String str, String[] strArr) {
        return super.rawQuery(str, strArr);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ int update(ContentValues contentValues, String str, String[] strArr) {
        return super.update(contentValues, str, strArr);
    }

    private kvl() {
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kvl f39542a = new kvl();
    }

    public static kvl a() {
        return d.f39542a;
    }

    public static String d() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS sample_sequence(_id integer primary key not null,start_time integer not null,end_time integer not null,type_id  integer not null,sub_type_id  integer,data text not null,meta_data text,simple_data text,client_id integer not null,merged integer not null,sync_status integer not null,timeZone text not null,modified_time integer not null,reserve text)");
        return sb.toString();
    }

    public static String c() {
        return " DROP INDEX IF EXISTS SequenceIndex";
    }

    public static String b() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX IF NOT EXISTS SequenceIndex ON sample_sequence(type_id,start_time,end_time,client_id)");
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX IF NOT EXISTS SequenceStartTimeIndex ON sample_sequence(start_time,end_time,type_id,client_id)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sample_sequence";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "start_time", "end_time", "type_id", "sub_type_id", "data", "meta_data", "simple_data", "client_id", "merged", "sync_status", "timeZone", "modified_time", "reserve"};
    }

    private String[] j() {
        return new String[]{"_id", "start_time", "end_time", "type_id", "sub_type_id", "meta_data", "simple_data", "client_id", "merged", "sync_status", "timeZone", "modified_time", "reserve"};
    }

    public Cursor a(String str, String[] strArr, String str2, String str3, String str4) {
        return queryEX(j(), str, strArr, str2, str3, str4);
    }

    public static ContentValues b(HiHealthData hiHealthData, int i, int i2) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("start_time", Long.valueOf(hiHealthData.getStartTime()));
        contentValues.put("end_time", Long.valueOf(hiHealthData.getEndTime()));
        contentValues.put("type_id", Integer.valueOf(hiHealthData.getType()));
        contentValues.put("sub_type_id", Integer.valueOf(hiHealthData.getSubType()));
        if (lka.d(hiHealthData.getSequenceData())) {
            String strB = lka.b(hiHealthData.getStartTime(), hiHealthData.getType(), i);
            lka.d(hiHealthData.getSequenceData(), strB);
            contentValues.put("data", "detailFilePath=" + strB);
        } else {
            contentValues.put("data", hiHealthData.getSequenceData());
        }
        if (lka.d(hiHealthData.getMetaData())) {
            String strE = lka.e(hiHealthData.getStartTime(), hiHealthData.getType(), i);
            lka.b(hiHealthData.getMetaData(), strE);
            contentValues.put("meta_data", "metadataFilePath=" + strE);
        } else {
            contentValues.put("meta_data", hiHealthData.getMetaData());
        }
        contentValues.put("simple_data", hiHealthData.getSimpleData());
        contentValues.put("client_id", Integer.valueOf(i));
        contentValues.put("merged", Integer.valueOf(i2));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("timeZone", HiDateUtil.c(hiHealthData.getTimeZone()));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("reserve", hiHealthData.getReserve());
        b(contentValues, hiHealthData);
        return contentValues;
    }

    public static ContentValues d(HiHealthData hiHealthData, int i, int i2) throws Throwable {
        ContentValues contentValues = new ContentValues();
        if (lka.d(hiHealthData.getSequenceData())) {
            String strB = lka.b(hiHealthData.getStartTime(), hiHealthData.getType(), i);
            lka.d(hiHealthData.getSequenceData(), strB);
            contentValues.put("data", "detailFilePath=" + strB);
        } else {
            contentValues.put("data", hiHealthData.getSequenceData());
        }
        d(contentValues, hiHealthData, i);
        contentValues.put("simple_data", hiHealthData.getSimpleData());
        contentValues.put("merged", Integer.valueOf(i2));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        b(contentValues, hiHealthData);
        return contentValues;
    }

    private static void d(ContentValues contentValues, HiHealthData hiHealthData, int i) {
        if (lka.d(hiHealthData.getMetaData())) {
            String strE = lka.e(hiHealthData.getStartTime(), hiHealthData.getType(), i);
            lka.b(hiHealthData.getMetaData(), strE);
            contentValues.put("meta_data", "metadataFilePath=" + strE);
            return;
        }
        contentValues.put("meta_data", hiHealthData.getMetaData());
    }

    public static ContentValues c(HiHealthData hiHealthData, int i) {
        ContentValues contentValues = new ContentValues();
        d(contentValues, hiHealthData, i);
        contentValues.put("sync_status", (Integer) 0);
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static ContentValues d(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        contentValues.put("merged", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static ContentValues c(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static List<HiHealthData> a(Cursor cursor, String str) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseSequenceMetaDataCursor() Cursor query == null");
            return null;
        }
        char c2 = '\n';
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = new String[13];
                    strArr[0] = "_id";
                    strArr[1] = "start_time";
                    strArr[2] = "end_time";
                    strArr[3] = "type_id";
                    strArr[4] = "sub_type_id";
                    strArr[5] = "meta_data";
                    strArr[6] = "simple_data";
                    strArr[7] = "sync_status";
                    strArr[8] = "timeZone";
                    strArr[9] = "merged";
                    strArr[c2] = "client_id";
                    strArr[11] = "modified_time";
                    strArr[12] = "reserve";
                    int[] iArr2 = new int[13];
                    int i = 0;
                    for (int i2 = 13; i < i2; i2 = 13) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                        i++;
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setDataId(cursor.getInt(iArr[0]));
                hiHealthData.setStartTime(cursor.getLong(iArr[1]));
                hiHealthData.setEndTime(cursor.getLong(iArr[2]));
                hiHealthData.setType(cursor.getInt(iArr[3]));
                hiHealthData.setSubType(cursor.getInt(iArr[4]));
                hiHealthData.setMetaData(a(cursor.getString(iArr[5])));
                hiHealthData.setSimpleData(cursor.getString(iArr[6]));
                hiHealthData.setSyncStatus(cursor.getInt(iArr[7]));
                hiHealthData.setTimeZone(cursor.getString(iArr[8]));
                hiHealthData.putInt("merged", cursor.getInt(iArr[9]));
                hiHealthData.setDeviceUuid(str);
                hiHealthData.setClientId(cursor.getInt(iArr[10]));
                hiHealthData.putLong("modified_time", cursor.getLong(iArr[11]));
                hiHealthData.setReserve(cursor.getString(iArr[12]));
                arrayList.add(hiHealthData);
                c2 = '\n';
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private static String a(String str) {
        return (str == null || !str.startsWith("metadataFilePath=")) ? str : lka.c(str.substring(17));
    }

    public static List<String> e(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseSequenceMetaDataCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        boolean z = true;
        int columnIndex = 0;
        while (cursor.moveToNext()) {
            try {
                if (z) {
                    columnIndex = cursor.getColumnIndex("meta_data");
                    z = false;
                }
                arrayList.add(a(cursor.getString(columnIndex)));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> a(Cursor cursor, boolean z) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseSequenceDatasCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = {"_id", "start_time", "end_time", "type_id", "sub_type_id", "data", "meta_data", "simple_data", "client_id", "sync_status", "merged", "timeZone", "modified_time", "reserve"};
                    int[] iArr2 = new int[14];
                    for (int i = 0; i < 14; i++) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthDataB = b(cursor, z, iArr);
                if (hiHealthDataB != null) {
                    arrayList.add(hiHealthDataB);
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private static HiHealthData b(Cursor cursor, boolean z, int[] iArr) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setDataId(cursor.getLong(iArr[0]));
        hiHealthData.setStartTime(cursor.getLong(iArr[1]));
        hiHealthData.setEndTime(cursor.getLong(iArr[2]));
        hiHealthData.setType(cursor.getInt(iArr[3]));
        hiHealthData.setSubType(cursor.getInt(iArr[4]));
        String string = cursor.getString(iArr[5]);
        if (string.startsWith("detailFilePath=")) {
            string = lka.a(string.substring(15));
        }
        if (z) {
            try {
                hiHealthData.setSequenceData(HiZipUtil.d(string));
            } catch (IOException e) {
                ReleaseLogUtil.a("HiH_DBSampleSequence", "parseSequenceDatasCursor() uncompress e = ", e.getMessage());
                return null;
            }
        } else {
            hiHealthData.setSequenceData(string);
        }
        hiHealthData.setMetaData(a(cursor.getString(iArr[6])));
        hiHealthData.setSimpleData(cursor.getString(iArr[7]));
        hiHealthData.setClientId(cursor.getInt(iArr[8]));
        hiHealthData.setSyncStatus(cursor.getInt(iArr[9]));
        hiHealthData.putInt("merged", cursor.getInt(iArr[10]));
        hiHealthData.setTimeZone(cursor.getString(iArr[11]));
        hiHealthData.putLong("modified_time", cursor.getLong(iArr[12]));
        hiHealthData.setReserve(cursor.getString(iArr[13]));
        return hiHealthData;
    }

    public static List<HiHealthData> c(Cursor cursor) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseSequenceDatasCursor() Cursor query == null");
            return null;
        }
        char c2 = '\n';
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = new String[13];
                    strArr[0] = "_id";
                    strArr[1] = "start_time";
                    strArr[2] = "end_time";
                    strArr[3] = "type_id";
                    strArr[4] = "sub_type_id";
                    strArr[5] = "meta_data";
                    strArr[6] = "simple_data";
                    strArr[7] = "client_id";
                    strArr[8] = "sync_status";
                    strArr[9] = "merged";
                    strArr[c2] = "timeZone";
                    strArr[11] = "modified_time";
                    strArr[12] = "reserve";
                    int[] iArr2 = new int[13];
                    int i = 0;
                    for (int i2 = 13; i < i2; i2 = 13) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                        i++;
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setDataId(cursor.getLong(iArr[0]));
                hiHealthData.setStartTime(cursor.getLong(iArr[1]));
                hiHealthData.setEndTime(cursor.getLong(iArr[2]));
                hiHealthData.setType(cursor.getInt(iArr[3]));
                hiHealthData.setSubType(cursor.getInt(iArr[4]));
                hiHealthData.setMetaData(a(cursor.getString(iArr[5])));
                hiHealthData.setSimpleData(cursor.getString(iArr[6]));
                hiHealthData.setClientId(cursor.getInt(iArr[7]));
                hiHealthData.setSyncStatus(cursor.getInt(iArr[8]));
                hiHealthData.putInt("merged", cursor.getInt(iArr[9]));
                hiHealthData.setTimeZone(cursor.getString(iArr[10]));
                hiHealthData.putLong("modified_time", cursor.getLong(iArr[11]));
                hiHealthData.setReserve(cursor.getString(iArr[12]));
                arrayList.add(hiHealthData);
                c2 = '\n';
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> a(Cursor cursor) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseSequenceDatasCursor() Cursor query == null");
            return null;
        }
        char c2 = '\n';
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = new String[13];
                    strArr[0] = "start_time";
                    strArr[1] = "end_time";
                    strArr[2] = "type_id";
                    strArr[3] = "sub_type_id";
                    strArr[4] = "meta_data";
                    strArr[5] = "simple_data";
                    strArr[6] = "timeZone";
                    strArr[7] = "sync_status";
                    strArr[8] = "merged";
                    strArr[9] = "client_id";
                    strArr[c2] = "reserve";
                    strArr[11] = "modified_time";
                    strArr[12] = "_id";
                    int[] iArr2 = new int[13];
                    int i = 0;
                    for (int i2 = 13; i < i2; i2 = 13) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                        i++;
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setStartTime(cursor.getLong(iArr[0]));
                hiHealthData.setEndTime(cursor.getLong(iArr[1]));
                hiHealthData.setType(cursor.getInt(iArr[2]));
                hiHealthData.setSubType(cursor.getInt(iArr[3]));
                hiHealthData.setMetaData(a(cursor.getString(iArr[4])));
                hiHealthData.setSimpleData(cursor.getString(iArr[5]));
                hiHealthData.setTimeZone(cursor.getString(iArr[6]));
                hiHealthData.setSyncStatus(cursor.getInt(iArr[7]));
                hiHealthData.putInt("merged", cursor.getInt(iArr[8]));
                hiHealthData.setClientId(cursor.getInt(iArr[9]));
                hiHealthData.setReserve(cursor.getString(iArr[10]));
                hiHealthData.setModifiedTime(cursor.getLong(iArr[11]));
                hiHealthData.setDataId(cursor.getLong(iArr[12]));
                arrayList.add(hiHealthData);
                c2 = '\n';
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> c(Cursor cursor, String[] strArr) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseAggregateRawSequenceCursor Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                int i = 0;
                if (iArr == null) {
                    String[] strArr2 = {"start_time", "end_time", "type_id"};
                    int[] iArr2 = new int[strArr.length + 3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        iArr2[i2] = cursor.getColumnIndex(strArr2[i2]);
                    }
                    for (int i3 = 0; i3 < strArr.length; i3++) {
                        iArr2[i3 + 3] = cursor.getColumnIndex(strArr[i3]);
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setStartTime(cursor.getLong(iArr[0]));
                hiHealthData.setEndTime(cursor.getLong(iArr[1]));
                hiHealthData.setType(cursor.getInt(iArr[2]));
                int length = iArr.length - strArr.length;
                int length2 = strArr.length;
                while (i < length2) {
                    hiHealthData.putDouble(strArr[i], cursor.getDouble(iArr[length]));
                    i++;
                    length++;
                }
                arrayList.add(hiHealthData);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private static void b(ContentValues contentValues, HiHealthData hiHealthData) {
        if (contentValues == null || hiHealthData == null || hiHealthData.getType() != 31001) {
            return;
        }
        String metaData = hiHealthData.getMetaData();
        if (metaData != null && !metaData.isEmpty()) {
            try {
                EcgMetaData ecgMetaData = (EcgMetaData) HiJsonUtil.d(metaData, EcgMetaData.class);
                if (ecgMetaData != null) {
                    contentValues.put("sub_type_id", Long.valueOf(ecgMetaData.getEcgArrhyType()));
                }
            } catch (JsonSyntaxException e) {
                ReleaseLogUtil.a("HiH_DBSampleSequence", "buildEcgData JsonSyntaxException:", e.getMessage());
            }
        }
        if (hiHealthData.getSimpleData() != null) {
            contentValues.put("simple_data", hiHealthData.getSimpleData());
        }
    }

    public static List<Integer> b(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBSampleSequence", "parseSportTypeListCursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                arrayList.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("sub_type_id"))));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }
}
