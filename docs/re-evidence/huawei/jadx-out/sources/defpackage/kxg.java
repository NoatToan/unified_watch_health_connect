package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kvh f39581a;

    private kxg() {
        this.f39581a = kvh.b();
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final kxg f39582b = new kxg();
    }

    public static kxg c(Context context) {
        return e.f39582b;
    }

    public int a(long j, long j2, int i) {
        LogUtil.d("Debug_HealthDataSessionManager", "deleteSessionData() startTime = ", Long.valueOf(j), ",endTime = ", Long.valueOf(j2), ",clientID = ", Integer.valueOf(i));
        return this.f39581a.delete(d(), c(j, j2, i, 2));
    }

    public long a(HiHealthData hiHealthData, int i, int i2) {
        return this.f39581a.insert(kvw.a(hiHealthData, i, i2));
    }

    public List<HiHealthData> e(long j, long j2, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        String[] strArr = new String[size + 3];
        stringBuffer.append("start_time =? and end_time =? and sync_status !=? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        stringBuffer.append(" ORDER BY ").append("start_time").append(" ASC ");
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> c(HiDataReadOption hiDataReadOption, List<Integer> list, List<Integer> list2) {
        int size = list.size();
        int size2 = list2.size() + size + 3;
        String[] strArr = new String[size2];
        StringBuffer stringBuffer = new StringBuffer((size2 * 2) + 64);
        stringBuffer.append("start_time >=? and start_time <=? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        kwb.e("type_id", list2, stringBuffer, strArr, size + 3);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, List<Integer> list, List<Integer> list2) {
        int size = list.size();
        int size2 = list2.size() + size + 4;
        String[] strArr = new String[size2];
        StringBuffer stringBuffer = new StringBuffer((size2 * 2) + 64);
        stringBuffer.append("start_time >=? and start_time <=? and merged =? and sync_status !=? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(0);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        kwb.e("type_id", list2, stringBuffer, strArr, size + 4);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public boolean b(HiDataReadOption hiDataReadOption, List<Integer> list, List<Integer> list2) {
        int size = list.size();
        String[] strArr = new String[list2.size() + size + 2];
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append("start_time >=? and start_time <=? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        kwb.e("client_id", list, stringBuffer, strArr, 2);
        kwb.e("type_id", list2, stringBuffer, strArr, size + 2);
        return kwf.m(this.f39581a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> c(HiDataReadOption hiDataReadOption, List<Integer> list, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=?  and type_id =? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, List<Integer> list, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=?  and type_id =? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public int c(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39581a.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
    }

    public boolean b(long j, long j2, int i) {
        return kwf.m(this.f39581a.query(d(), c(j, j2, i, 2), null, null, null));
    }

    public boolean b(HiHealthData hiHealthData, int i, int i2) {
        long jA;
        if (b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i)) {
            jA = d(hiHealthData, i2);
        } else {
            jA = a(hiHealthData, i, i2);
        }
        return kwb.b(jA);
    }

    public int d(HiHealthData hiHealthData, int i) {
        ContentValues contentValuesA = kvw.a(hiHealthData, i);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesA.remove("sync_status");
        }
        return this.f39581a.update(contentValuesA, "_id =? ", new String[]{Long.toString(hiHealthData.getDataId())});
    }

    public int e(HiHealthData hiHealthData, int i) {
        return this.f39581a.update(kvw.a(hiHealthData, i), d(), c(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getClientId(), 2));
    }

    private String[] c(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    private String d() {
        return "start_time =? and end_time =? and client_id =? and sync_status !=? ";
    }

    public List<HiHealthData> a(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 2;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> c(int i, List<Integer> list, int i2) {
        String[] strArr = new String[list.size() + 2];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        StringBuffer stringBuffer = new StringBuffer((list.size() * 2) + 32);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.e("type_id", list, stringBuffer, strArr, 2);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, "start_time DESC  limit 0 ," + i2));
    }

    public List<HiHealthData> e(int i, List<Integer> list, long j, long j2) {
        String[] strArr = new String[list.size() + 4];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(j);
        strArr[3] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((list.size() * 2) + 64);
        stringBuffer.append("client_id =? and sync_status =? and start_time >=? and start_time <=? ");
        kwb.e("type_id", list, stringBuffer, strArr, 4);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "));
    }

    public int b(long j, int i, int i2) {
        return this.f39581a.update(kvw.e(i, i2), "_id =? ", new String[]{Long.toString(j)});
    }

    public List<Integer> a(long j, long j2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and sync_status !=? ");
        String[] strArr = {Long.toString(j), Long.toString(j2), Long.toString(2L)};
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.f39581a.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<HiHealthData> c(List<Integer> list, int i, int i2, int i3) {
        if (list == null) {
            LogUtil.j("Debug_HealthDataSessionManager", "queryHealthSessonDataListByClientIdsWithOrder() clientIds is null");
            return null;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((list.size() * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", i, i2, i3)));
    }

    public List<HiHealthData> b(int i, int i2, List<Integer> list, int i3) {
        String[] strArr = new String[list.size() + 2];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(i2);
        StringBuffer stringBuffer = new StringBuffer((list.size() * 2) + 64);
        stringBuffer.append("type_id =? and sync_status =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 2);
        kwe.b(stringBuffer, 0, i3);
        return kwf.l(this.f39581a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int a(long j) {
        return this.f39581a.delete("_id =? ", new String[]{Long.toString(j)});
    }

    public List<Integer> b(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[iArr.length + 1];
        strArr[0] = Integer.toString(2);
        kwb.d("type_id", iArr, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "type_id");
        return kwf.i(this.f39581a.query(stringBuffer.toString(), strArr, null, null, null), "type_id");
    }
}
