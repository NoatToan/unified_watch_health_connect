package defpackage;

import android.content.ContentValues;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwo {
    private kvt e;

    private kwo() {
        this.e = kvt.e();
    }

    static class d {
        private static final kwo d = new kwo();
    }

    public static kwo b() {
        return d.d;
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer(128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type =? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        LogUtil.d("HiH_DataBusinessManager", "queryBusinessDataListByClientIdsWithOrder() selector = ", stringBuffer, ",selector = ", HiJsonUtil.d(stringBuffer));
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("HiH_DataBusinessManager", "queryBusinessDataListByClientIdsWithOrder() order = ", strC);
        return kwf.e(this.e.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> c(HiDataReadOption hiDataReadOption, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer(128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type =? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.e(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> d(long j, long j2, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer(128);
        String[] strArr = new String[size + 3];
        stringBuffer.append("start_time =? and end_time =? and type =? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        return kwf.o(this.e.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> d(int i, List<Integer> list, int i2, int i3) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer(128);
        String[] strArr = new String[size + 2];
        stringBuffer.append("client_id =? and sync_status =? ");
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(i2);
        kwb.e("type", list, stringBuffer, strArr, 2);
        StringBuffer stringBuffer2 = new StringBuffer("start_time DESC  limit 0,");
        stringBuffer2.append(i3);
        return kwf.o(this.e.query(stringBuffer.toString(), strArr, null, null, stringBuffer2.toString()));
    }

    public boolean b(long j, long j2) {
        return kwf.m(this.e.query("_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)}, null, null, null));
    }

    public long e(HiHealthData hiHealthData, int i, int i2) {
        return this.e.insert(kvw.d(hiHealthData, i, i2));
    }

    public long b(HiHealthData hiHealthData, int i, int i2) {
        LogUtil.d("HiH_DataBusinessManager", "insertOrUpdatePointData enter!");
        long jA = a(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i);
        if (jA > 0) {
            if (a(hiHealthData, i, i2) > 0) {
                return jA;
            }
            return -1L;
        }
        return e(hiHealthData, i, i2);
    }

    public int a(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesB = kvw.b(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesB.remove("sync_status");
        }
        return this.e.update(contentValuesB, e(), b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i));
    }

    public int d(long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", (Integer) 1);
        return this.e.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
    }

    public List<HiHealthData> c(long j) {
        return kwf.o(this.e.a("_id =? ", new String[]{Long.toString(j)}, null, null, null));
    }

    private long a(long j, long j2, int i, int i2) {
        return kwf.b(this.e.query(e(), b(j, j2, i, i2), null, null, null));
    }

    private String[] b(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    private String e() {
        return "start_time =? and end_time =? and type =? and client_id =? ";
    }
}
