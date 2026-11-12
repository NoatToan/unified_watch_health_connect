package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwv {
    private kvi d;

    private kwv() {
        this.d = kvi.a();
    }

    static class a {
        private static final kwv e = new kwv();
    }

    public static kwv e(Context context) {
        return a.e;
    }

    public long d(HiHealthData hiHealthData, int i, int i2) {
        return this.d.insert(kvw.h(hiHealthData, i, i2));
    }

    public int b(long j, long j2, int i) {
        return this.d.delete(b(), e(j, j2, i));
    }

    public int b(long j, long j2, int i, int i2, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and end_time <=? and type_id >=? and type_id <=? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Long.toString(i);
        strArr[3] = Long.toString(i2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        LogUtil.d("Debug_DataSessionManager", "deleteSessionDatas() sbSelector = ", stringBuffer, ",selectAgs = ", HiJsonUtil.d(strArr));
        return this.d.delete(stringBuffer.toString(), strArr);
    }

    public List<HiHealthData> d(long j, long j2, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        String[] strArr = new String[size + 3];
        stringBuffer.append("start_time =? and end_time =? and sync_status !=? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        stringBuffer.append(" ORDER BY ").append("start_time").append(" ASC ");
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> c(HiDataReadOption hiDataReadOption, List<Integer> list, int i, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 5];
        stringBuffer.append("start_time =? and end_time =? and type_id >=? and type_id <=? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        strArr[4] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 5);
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> a(HiDataReadOption hiDataReadOption, List<Integer> list, int i, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 5];
        stringBuffer.append("start_time >=? and start_time <=? and type_id >=? and type_id <=? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        strArr[4] = Integer.toString(0);
        kwb.e("client_id", list, stringBuffer, strArr, 5);
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, List<Integer> list, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=?  and type_id =? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> c(HiDataReadOption hiDataReadOption, List<Integer> list, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=?  and type_id =? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    private int b(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesH = kvw.h(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesH.remove("sync_status");
        }
        return this.d.update(contentValuesH, b(), e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i));
    }

    public int a(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.d.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
    }

    public int c(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.d.update(contentValues, b(), e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i));
    }

    private boolean d(long j, long j2, int i) {
        return kwf.m(this.d.query(b(), e(j, j2, i), null, null, null));
    }

    public boolean a(HiHealthData hiHealthData, int i, int i2) {
        long jD;
        if (d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i)) {
            jD = b(hiHealthData, i, i2);
        } else {
            jD = d(hiHealthData, i, i2);
        }
        return kwb.b(jD);
    }

    private String[] e(long j, long j2, int i) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i)};
    }

    private String b() {
        return "start_time =? and end_time =? and client_id =? ";
    }

    public List<HiHealthData> d(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 2;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int b(long j, int i, int i2) {
        return this.d.update(kvw.a(i, i2), "_id =? ", new String[]{Long.toString(j)});
    }

    public List<Integer> e(long j, long j2) {
        String[] strArr = {Long.toString(j), Long.toString(j2)};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.d.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<HiHealthData> a(List<Integer> list, int i, int i2, int i3) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return kwf.x(this.d.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", i, i2, i3)));
    }
}
