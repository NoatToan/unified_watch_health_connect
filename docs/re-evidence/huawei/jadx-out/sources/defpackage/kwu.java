package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwu {
    private kvk e;

    private kwu() {
        this.e = kvk.e();
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final kwu f39570b = new kwu();
    }

    public static kwu c(Context context) {
        return b.f39570b;
    }

    public long b(HiHealthData hiHealthData, int i, int i2) {
        return this.e.insert(kvw.a(hiHealthData, i, i2));
    }

    public int d(long j, long j2, int i) {
        return this.e.delete(c(), e(j, j2, i, 2));
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
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> b(HiDataReadOption hiDataReadOption, List<Integer> list, int i, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 6];
        stringBuffer.append("start_time >=? and start_time <=? and type_id >=? and type_id <=? and merged =? and sync_status !=? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        strArr[4] = Integer.toString(0);
        strArr[5] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 6);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public boolean c(HiDataReadOption hiDataReadOption, List<Integer> list, int i, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer(128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type_id >=? and type_id <=? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.m(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> a(HiDataReadOption hiDataReadOption, List<Integer> list, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=?  and type_id =? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> e(HiDataReadOption hiDataReadOption, List<Integer> list, int i, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 5];
        stringBuffer.append("start_time >=? and start_time <=? and type_id >=? and type_id <=? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        strArr[4] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 5);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, List<Integer> list, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=?  and type_id =? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public int a(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesA = kvw.a(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesA.remove("sync_status");
        }
        return this.e.update(contentValuesA, c(), e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i, 2));
    }

    public int a(HiHealthData hiHealthData, int i) {
        ContentValues contentValuesA = kvw.a(hiHealthData, i);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesA.remove("sync_status");
        }
        return this.e.update(contentValuesA, "_id =? ", new String[]{Long.toString(hiHealthData.getDataId())});
    }

    private boolean c(long j, long j2, int i) {
        return kwf.m(this.e.query(c(), e(j, j2, i, 2), null, null, null));
    }

    public int a(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.e.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
    }

    public boolean d(HiHealthData hiHealthData, int i, int i2) {
        long jB;
        if (c(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i)) {
            jB = a(hiHealthData, i2);
        } else {
            jB = b(hiHealthData, i, i2);
        }
        return kwb.b(jB);
    }

    private String c() {
        return "start_time =? and end_time =? and client_id =? and sync_status !=? ";
    }

    private String[] e(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    public List<HiHealthData> c(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 2;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> e(int i, List<Integer> list, int i2) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.e("type_id", list, stringBuffer, strArr, 2);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, "start_time DESC  limit 0 ," + i2));
    }

    public List<HiHealthData> e(int i, List<Integer> list, long j, long j2) {
        int size = list.size() + 4;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(j);
        strArr[3] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        stringBuffer.append("client_id =? and sync_status =? and start_time >=? and start_time <=? ");
        kwb.e("type_id", list, stringBuffer, strArr, 4);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "));
    }

    public int b(long j, int i, int i2) {
        return this.e.update(kvw.e(i, i2), "_id =? ", new String[]{Long.toString(j)});
    }

    public List<Integer> a(long j, long j2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and sync_status !=? ");
        String[] strArr = {Long.toString(j), Long.toString(j2), Long.toString(2L)};
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.e.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> e(long j, long j2, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and sync_status !=? ");
        String[] strArr = {Long.toString(j), Long.toString(j2), Long.toString(i), Long.toString(2L)};
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.e.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> e(long j, long j2, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and sync_status !=? ");
        String[] strArr = new String[iArr.length + 3];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Long.toString(2L);
        kwb.d("type_id", iArr, stringBuffer, strArr, 3);
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.e.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<HiHealthData> d(List<Integer> list, int i, int i2, int i3) {
        if (list == null) {
            LogUtil.j("DataCoreSessionManager", "queryCoreSessonDataListByClientIdsWithOrder clientIds is null");
            return null;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", i, i2, i3)));
    }

    public List<HiHealthData> e(int i, int i2, List<Integer> list, int i3) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(i2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("type_id =? and sync_status =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 2);
        kwe.b(stringBuffer, 0, i3);
        return kwf.l(this.e.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int a(long j) {
        return this.e.delete("_id =? ", new String[]{Long.toString(j)});
    }

    public List<Integer> c(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[list.size() + 1];
        strArr[0] = Integer.toString(0);
        kwb.e("type_id", list, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.e.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> c(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[iArr.length + 1];
        strArr[0] = Integer.toString(2);
        kwb.d("type_id", iArr, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "type_id");
        return kwf.i(this.e.query(stringBuffer.toString(), strArr, null, null, null), "type_id");
    }
}
