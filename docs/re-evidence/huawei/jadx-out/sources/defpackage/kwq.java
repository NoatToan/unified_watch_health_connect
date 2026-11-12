package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kvd f39562b;

    private kwq() {
        this.f39562b = kvd.e();
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kwq f39563a = new kwq();
    }

    public static kwq e(Context context) {
        return d.f39563a;
    }

    public long a(HiHealthData hiHealthData, int i, int i2) {
        return this.f39562b.insert(kvw.e(hiHealthData, i, i2));
    }

    public int a(long j, long j2, int i, int i2) {
        return this.f39562b.delete(e(), d(j, j2, i, i2));
    }

    public int c(long j, long j2, int[] iArr, List<Integer> list) {
        int size = list.size();
        int length = iArr.length;
        int i = size + length + 2;
        String[] strArr = new String[i];
        StringBuffer stringBuffer = new StringBuffer((i * 2) + 32);
        stringBuffer.append("start_time >=? and end_time <=? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        LogUtil.d("Debug_DataPointManager", "deletePointDatas() sbSelector = ", stringBuffer, ",selectAgs = ", HiJsonUtil.d(strArr));
        return this.f39562b.delete(stringBuffer.toString(), strArr);
    }

    public List<HiHealthData> a(HiDataReadOption hiDataReadOption, int i, List<Integer> list, kth kthVar) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        int i2 = hiDataReadOption.getModifiedEndTime() > 0 ? 2 : 0;
        int i3 = i2 + 4;
        String[] strArr = new String[size + i3];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged != ?");
        if (kthVar != null && !TextUtils.isEmpty(kthVar.b())) {
            stringBuffer.append(kwb.a(kthVar.b()));
        }
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        if (i2 == 2) {
            stringBuffer.append(" and modified_time >=? and modified_time <=? ");
            strArr[4] = Long.toString(hiDataReadOption.getModifiedStartTime());
            strArr[5] = Long.toString(hiDataReadOption.getModifiedEndTime());
        }
        kwb.e("client_id", list, stringBuffer, strArr, i3);
        LogUtil.d("Debug_DataPointManager", "queryPointDataListByClientIdsWithOrder() sbSelector = ", stringBuffer, ",sbSelector = ", HiJsonUtil.d(stringBuffer));
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_DataPointManager", "queryPointDataListByClientIdsWithOrder() order = ", strC);
        return kwf.m(this.f39562b.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> b(HiDataReadOption hiDataReadOption, int i, List<Integer> list, kth kthVar) {
        if (list == null) {
            LogUtil.j("Debug_DataPointManager", "queryMergePointDataListByClientIdsWithOrder() clientIds is null");
            return null;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        int i2 = hiDataReadOption.getModifiedEndTime() > 0 ? 2 : 0;
        int i3 = i2 + 4;
        String[] strArr = new String[size + i3];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged =? ");
        if (kthVar != null && !TextUtils.isEmpty(kthVar.b())) {
            stringBuffer.append(kwb.a(kthVar.b()));
        }
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        if (i2 == 2) {
            stringBuffer.append(" and modified_time >=? and modified_time <=? ");
            strArr[4] = Long.toString(hiDataReadOption.getModifiedStartTime());
            strArr[5] = Long.toString(hiDataReadOption.getModifiedEndTime());
        }
        kwb.e("client_id", list, stringBuffer, strArr, i3);
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_DataPointManager", "queryMergePointDataListByClientIdsWithOrder: sbSelector=" + ((Object) stringBuffer));
        return kwf.m(this.f39562b.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public int d(long j, int i, int i2) {
        return this.f39562b.update(kvw.d(i2, i), "_id =? ", new String[]{Long.toString(j)});
    }

    public int a(long j, long j2, int i, int i2, int i3) {
        return this.f39562b.update(kvw.a(i3), e(), d(j, j2, i, i2));
    }

    public int a(long j, long j2, int i, List<Integer> list, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged!=?");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return this.f39562b.update(kvw.a(i2), stringBuffer.toString(), strArr);
    }

    public int e(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesD = kvw.d(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesD.remove("sync_status");
        }
        return this.f39562b.update(contentValuesD, e(), d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i));
    }

    public Double b(long j, long j2, int i, int i2) {
        return kwf.g(this.f39562b.query(e(), d(j, j2, i, i2), null, null, null), "value");
    }

    private String[] d(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    private String e() {
        return "start_time =? and end_time =? and type_id =? and client_id =? ";
    }

    public int e(int i, long j, long j2, int i2, int i3) {
        String[] strArr = {Integer.toString(i), Long.toString(j), Long.toString(j2), Integer.toString(i2)};
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i3));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39562b.update(contentValues, "client_id =? and start_time =? and end_time =? and type_id =? ", strArr);
    }

    public int d(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39562b.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
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
        return kwf.t(this.f39562b.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<Integer> b(long j, long j2, int i) {
        String[] strArr = {Long.toString(j), Long.toString(j2), Integer.toString(i)};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? ");
        kwb.b(stringBuffer, "client_id");
        return kwf.c(this.f39562b.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> e(long j, long j2, int[] iArr) {
        String[] strArr = new String[iArr.length + 2];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.b(stringBuffer, "client_id");
        return kwf.c(this.f39562b.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<HiHealthData> a(List<Integer> list, int i, int i2, int i3) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return kwf.m(this.f39562b.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", i, i2, i3)), null);
    }

    public List<HiHealthData> c(int i, long j, long j2, int i2) {
        return kwf.m(this.f39562b.query("start_time >=? and start_time <=? and type_id =? and client_id =? ", new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i2), Integer.toString(i)}, null, null, null), null);
    }

    public List<HiHealthData> b(int i, List<Integer> list, int i2) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.e("type_id", list, stringBuffer, strArr, 2);
        return kwf.q(this.f39562b.query(stringBuffer.toString(), strArr, null, null, "start_time DESC  limit 0 ," + i2));
    }

    public List<HiHealthData> d(int i, List<Integer> list, long j, long j2) {
        int size = list.size() + 4;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(j);
        strArr[3] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        stringBuffer.append("client_id =? and sync_status =? and start_time >=? and start_time <=? ");
        kwb.e("type_id", list, stringBuffer, strArr, 4);
        return kwf.q(this.f39562b.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "));
    }

    public List<Integer> d(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[list.size() + 1];
        strArr[0] = Integer.toString(0);
        kwb.e("type_id", list, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.f39562b.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<HiHealthData> e(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 2;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("start_time >=? and start_time <=? and sync_status != 2");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.t(this.f39562b.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int c(long j, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39562b.update(contentValues, "_id =? ", new String[]{Long.toString(j)});
    }
}
