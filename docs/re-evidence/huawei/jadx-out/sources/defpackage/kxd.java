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
public class kxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kve f39577a;

    private kxd() {
        this.f39577a = kve.a();
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kxd f39578a = new kxd();
    }

    public static kxd e(Context context) {
        return b.f39578a;
    }

    public long b(HiHealthData hiHealthData, int i, int i2) {
        return this.f39577a.insert(kvw.c(hiHealthData, i, i2));
    }

    public int d(long j, long j2, int i, int i2) {
        return this.f39577a.delete(a(), a(j, j2, i, i2));
    }

    public List<HiHealthData> b(HiDataReadOption hiDataReadOption, int i, List<Integer> list, kth kthVar) {
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
        LogUtil.d("Debug_HealthDataPointStressManager", "queryPointDataListByClientIdsWithOrder() sbSelector = ", stringBuffer, ",sbSelector = ", HiJsonUtil.d(stringBuffer));
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_HealthDataPointStressManager", "queryPointDataListByClientIdsWithOrder() order = ", strC);
        return kwf.m(this.f39577a.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> d(List<Integer> list, long j, long j2, int i, int i2, String[] strArr, int[] iArr, int i3) {
        if (list == null) {
            LogUtil.j("Debug_HealthDataPointStressManager", "queryMergeAggregateHealthPointDataNoAlignType() clientIds is null");
            return null;
        }
        String[] strArr2 = new String[list.size() + 5];
        strArr2[0] = Long.toString(j);
        strArr2[1] = Long.toString(j2);
        strArr2[2] = Integer.toString(i2);
        strArr2[3] = Integer.toString(0);
        strArr2[4] = Integer.toString(2);
        String strD = kwb.d(list, strArr2, 5, i, i2, strArr, iArr, i3);
        LogUtil.d("Debug_HealthDataPointStressManager", "queryMergeAggregateHealthPointDataNoAlignType() aggregateSQL = ", strD, ",selectAgs = ", HiJsonUtil.d(strArr2));
        return kwf.a(this.f39577a.rawQuery(strD, strArr2), strArr);
    }

    public List<HiHealthData> b(List<Integer> list, long j, long j2, int i) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        stringBuffer.append("start_time >=? and start_time <=? and merged =? and type_id =? ");
        String[] strArr = new String[size + 4];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(0);
        strArr[3] = Integer.toString(i);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.a(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null), new String[]{"value"});
    }

    public int d(long j) {
        return this.f39577a.delete("_id =? ", new String[]{Long.toString(j)});
    }

    public List<HiHealthData> c(HiDataReadOption hiDataReadOption, int i, List<Integer> list, kth kthVar) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        int i2 = hiDataReadOption.getModifiedEndTime() > 0 ? 2 : 0;
        int i3 = i2 + 5;
        String[] strArr = new String[size + i3];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged =? and sync_status !=? ");
        if (kthVar != null && !TextUtils.isEmpty(kthVar.b())) {
            stringBuffer.append(kwb.a(kthVar.b()));
        }
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(0);
        strArr[4] = Integer.toString(2);
        if (i2 == 2) {
            stringBuffer.append(" and modified_time >=? and modified_time <=? ");
            strArr[5] = Long.toString(hiDataReadOption.getModifiedStartTime());
            strArr[6] = Long.toString(hiDataReadOption.getModifiedEndTime());
        }
        kwb.e("client_id", list, stringBuffer, strArr, i3);
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_HealthDataPointStressManager", "queryMergePointDataListByClientIdsWithOrder:sbSelector= " + ((Object) stringBuffer));
        return kwf.m(this.f39577a.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> e(long j, long j2, int i, int i2, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time =? and end_time =? and type_id >=? and type_id <=? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.t(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int c(long j, int i, int i2) {
        return this.f39577a.update(kvw.b(i, i2), "_id =? ", new String[]{Long.toString(j)});
    }

    public int a(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesE = kvw.e(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesE.remove("sync_status");
        }
        return this.f39577a.update(contentValuesE, a(), a(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i));
    }

    private List<HiHealthData> e(long j, long j2, int i, int i2) {
        return kwf.q(this.f39577a.query(a(), a(j, j2, i, i2), null, null, null));
    }

    private boolean d(long j, long j2, int i, int i2, int i3) {
        return kwf.m(this.f39577a.query(c(), c(j, j2, i, i2, i3), null, null, null));
    }

    public boolean c(HiHealthData hiHealthData, int i, int i2) {
        long jB;
        if (hiHealthData.getSyncStatus() == 2) {
            return true;
        }
        List<HiHealthData> listE = e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i);
        if (listE == null || listE.isEmpty()) {
            jB = b(hiHealthData, i, i2);
        } else {
            HiHealthData hiHealthData2 = listE.get(0);
            jB = (hiHealthData.getIntValue() == hiHealthData2.getIntValue() && hiHealthData.getMetaData().equals(hiHealthData2.getMetaData())) ? 0L : a(hiHealthData, i, i2);
        }
        return kwb.b(jB);
    }

    public boolean e(HiHealthData hiHealthData, int i, int i2, int i3, int i4) {
        long jB;
        if (d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i2, i3, i)) {
            jB = a(hiHealthData, i, i4);
        } else {
            jB = b(hiHealthData, i, i4);
        }
        return kwb.b(jB);
    }

    private String[] a(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    private String[] c(long j, long j2, int i, int i2, int i3) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2), Integer.toString(i3)};
    }

    private String a() {
        return "start_time =? and end_time =? and type_id =? and client_id =? ";
    }

    private String c() {
        return "start_time =? and end_time =? and type_id >=? and type_id <=? and client_id =? ";
    }

    public List<HiHealthData> c(int i, List<Integer> list, int i2) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.e("type_id", list, stringBuffer, strArr, 2);
        return kwf.q(this.f39577a.query(stringBuffer.toString(), strArr, null, null, "start_time DESC  limit 0 ," + i2));
    }

    public List<HiHealthData> c(int i, List<Integer> list, long j, long j2) {
        int size = list.size() + 4;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(j);
        strArr[3] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        stringBuffer.append("client_id =? and sync_status =? and start_time >=? and start_time <=? ");
        kwb.e("type_id", list, stringBuffer, strArr, 4);
        return kwf.q(this.f39577a.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "));
    }

    public int e(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39577a.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
    }

    public List<HiHealthData> e(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 2;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.t(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> d(int i, int i2, List<Integer> list, int i3) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(i2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("type_id =? and sync_status =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 2);
        kwe.b(stringBuffer, 0, i3);
        return kwf.t(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> b(List<Integer> list, int i, int i2, int i3) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return kwf.m(this.f39577a.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", i, i2, i3)), null);
    }

    public int a(long j, long j2, int i, List<Integer> list, int i2) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and merged!=?");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(i2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return this.f39577a.update(kvw.e(i2), stringBuffer.toString(), strArr);
    }

    public int a(long j, long j2, int i, int i2, int i3) {
        return this.f39577a.update(kvw.e(i3), a(), a(j, j2, i, i2));
    }

    public List<Integer> d(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[list.size() + 1];
        strArr[0] = Integer.toString(0);
        kwb.e("type_id", list, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> a(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[iArr.length + 1];
        strArr[0] = Integer.toString(2);
        kwb.d("type_id", iArr, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "type_id");
        return kwf.i(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null), "type_id");
    }

    public List<Integer> c(long j, long j2, int[] iArr) {
        String[] strArr = new String[iArr.length + 2];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 2);
        kwb.b(stringBuffer, "client_id");
        return kwf.c(this.f39577a.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public int c(long j, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39577a.update(contentValues, "_id =? ", new String[]{Long.toString(j)});
    }
}
