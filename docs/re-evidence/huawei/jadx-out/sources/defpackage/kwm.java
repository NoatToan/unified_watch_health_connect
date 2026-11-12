package defpackage;

import android.content.ContentValues;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.HiDateUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kuq f39558c;

    private kwm() {
        this.f39558c = kuq.e();
    }

    static class b {
        private static final kwm d = new kwm();
    }

    public static kwm d() {
        return b.d;
    }

    public static String[] a() {
        return new String[]{"_id", "start_time", "end_time", "type_id", "value", "metadata", DBPointCommon.COLUMN_UNIT_ID, "client_id", "merged", "sync_status", "timeZone", "modified_time"};
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(" create table  IF NOT EXISTS " + str + Constants.LEFT_BRACKET_ONLY);
        sb.append("_id integer primary key  not null,start_time integer not null,end_time integer not null,type_id integer not null,value double,metadata text,unit_id integer not null,client_id integer not null,merged integer not null,sync_status integer not null,timeZone text not null,modified_time integer not null)");
        return sb.toString();
    }

    public static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(" CREATE INDEX  IF NOT EXISTS ");
        sb.append(str + " ON " + str2 + Constants.LEFT_BRACKET_ONLY);
        sb.append("start_time,end_time,type_id,client_id)");
        return sb.toString();
    }

    public List<HiHealthData> e(String str, HiDataReadOption hiDataReadOption, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.m(this.f39558c.d(str, stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> a(String str, HiDataReadOption hiDataReadOption, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.m(this.f39558c.d(str, stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> b(String str, long j, long j2, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[size + 3];
        stringBuffer.append("start_time =? and end_time =? and type_id =? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        return kwf.t(this.f39558c.d(str, stringBuffer.toString(), strArr, null, null, null));
    }

    public int d(String str, HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Double.valueOf(hiHealthData.getValue()));
        contentValues.put("metadata", hiHealthData.getMetaData());
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(hiHealthData.getPointUnit()));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("merged", Integer.valueOf(i2));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        if (hiHealthData.getSyncStatus() == 1) {
            contentValues.remove("sync_status");
        }
        return this.f39558c.a(str, contentValues, c(), d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i));
    }

    private boolean d(String str, long j, long j2, int i, int i2) {
        return kwf.m(this.f39558c.d(str, c(), d(j, j2, i, i2), null, null, null));
    }

    public boolean a(String str, HiHealthData hiHealthData, int i, int i2) {
        long jB;
        LogUtil.d("Debug_ConfigDataManager", "insertOrUpdatePointData enter!");
        if (d(str, hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i)) {
            jB = d(str, hiHealthData, i, i2);
        } else {
            jB = b(str, hiHealthData, i, i2);
        }
        return kwb.b(jB);
    }

    public long b(String str, HiHealthData hiHealthData, int i, int i2) {
        return this.f39558c.d(str, e(hiHealthData, i, i2));
    }

    private String[] d(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    private ContentValues e(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("start_time", Long.valueOf(hiHealthData.getStartTime()));
        contentValues.put("end_time", Long.valueOf(hiHealthData.getEndTime()));
        contentValues.put("type_id", Integer.valueOf(hiHealthData.getType()));
        contentValues.put("value", Double.valueOf(hiHealthData.getValue()));
        contentValues.put("metadata", hiHealthData.getMetaData());
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(hiHealthData.getPointUnit()));
        contentValues.put("client_id", Integer.valueOf(i));
        contentValues.put("merged", Integer.valueOf(i2));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("timeZone", HiDateUtil.c(hiHealthData.getTimeZone()));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    private String c() {
        return "start_time =? and end_time =? and type_id =? and client_id =? ";
    }

    public List<HiHealthData> e(String str, long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        String[] strArr = new String[list.size() + length + 2];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.t(this.f39558c.d(str, stringBuffer.toString(), strArr, null, null, null));
    }

    public int b(String str, long j, long j2, int i, int i2) {
        return this.f39558c.e(str, c(), d(j, j2, i, i2));
    }

    public int a(String str, long j, int i, int i2) {
        return this.f39558c.a(str, kvw.d(i, i2), "_id =? ", new String[]{Long.toString(j)});
    }

    public List<HiHealthData> a(String str, List<Integer> list, HiAggregateOption hiAggregateOption) {
        String[] strArr = new String[list.size() + 3];
        strArr[0] = Long.toString(hiAggregateOption.getStartTime());
        strArr[1] = Long.toString(hiAggregateOption.getEndTime());
        strArr[2] = Integer.toString(0);
        return kwf.c(this.f39558c.rawQuery(b(str, list, strArr, 3, hiAggregateOption), strArr), hiAggregateOption.getConstantsKey());
    }

    private String b(String str, List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption) {
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select ");
        stringBuffer.append(str).append(".start_time,");
        stringBuffer.append(str).append(".end_time,");
        stringBuffer.append(str).append(".type_id,");
        int[] type = hiAggregateOption.getType();
        for (int i2 = 0; i2 < type.length; i2++) {
            stringBuffer.append(c(str, hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < type.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from ").append(str);
        stringBuffer.append(" where ").append(str).append(".start_time >=? and ").append(str).append(".start_time <=?  and ");
        stringBuffer.append(str).append(".merged =? ");
        kwb.e(str + ".client_id", list, stringBuffer, strArr, i);
        kwe.c(stringBuffer, str, "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    private String c(String str, int i, int i2, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i == 0) {
            kwe.d(stringBuffer, str, "type_id", "value", i2, str2);
        } else if (i == 1) {
            kwe.a(stringBuffer, str, "type_id", "value", i2, str2);
        } else if (i == 2) {
            kwe.e(stringBuffer, str, "type_id", i2, str2);
        } else if (i == 3) {
            kwe.c(stringBuffer, str, "type_id", "value", i2, str2);
        } else if (i == 4) {
            kwe.e(stringBuffer, str, "type_id", "value", i2, str2);
        } else if (i == 5) {
            kwe.b(stringBuffer, str, "type_id", "value", i2, str2);
        }
        return stringBuffer.toString();
    }
}
