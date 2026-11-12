package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kvf f39579b;

    private kxe() {
        this.f39579b = kvf.d();
    }

    protected kxe(kvf kvfVar) {
        this.f39579b = kvfVar;
    }

    static class d {
        private static final kxe e = new kxe();
    }

    public static kxe d(Context context) {
        return d.e;
    }

    public int b(long j, long j2, int i, int i2) {
        return this.f39579b.delete(d(), e(j, j2, i, i2));
    }

    public long b(HiHealthData hiHealthData, int i, int i2) {
        return this.f39579b.insert(kvw.c(hiHealthData, i, i2));
    }

    public List<HiHealthData> e(HiDataReadOption hiDataReadOption, int i, List<Integer> list, kth kthVar) {
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
        LogUtil.d("Debug_HealthDataPointManager", "queryPointDataListByClientIdsWithOrder() sbSelector = ", stringBuffer, ",sbSelector = ", HiJsonUtil.d(stringBuffer));
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_HealthDataPointManager", "queryPointDataListByClientIdsWithOrder() order = ", strC);
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> a(HiDataReadOption hiDataReadOption, int[] iArr, List<Integer> list) {
        int size = list.size();
        int i = hiDataReadOption.getModifiedEndTime() > 0 ? 2 : 0;
        int length = iArr.length + size + 3 + i;
        String[] strArr = new String[length];
        StringBuffer stringBuffer = new StringBuffer((length * 2) + 64);
        stringBuffer.append("start_time >=? and start_time <=? and merged != ?");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(2);
        int iB = kwe.b(strArr, 3, hiDataReadOption);
        if (i == 2) {
            stringBuffer.append(" and modified_time >=? and modified_time <=? ");
        }
        kwb.e("client_id", list, stringBuffer, strArr, iB);
        kwb.d("type_id", iArr, stringBuffer, strArr, size + iB);
        LogUtil.d("Debug_HealthDataPointManager", "queryPointDataListByClientIdsWithOrder() sql = ", stringBuffer, ",selectAgs = ", HiJsonUtil.d(strArr));
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_HealthDataPointManager", "queryPointDataListByClientIdsWithOrder() order = ", strC);
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public int b(long j) {
        return this.f39579b.delete("_id =? ", new String[]{Long.toString(j)});
    }

    public List<HiHealthData> b(HiDataReadOption hiDataReadOption, int i, List<Integer> list, kth kthVar) {
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
        LogUtil.d("Debug_HealthDataPointManager", "queryMergePointDataListByClientIdsWithOrder:sbSelector= " + ((Object) stringBuffer), " selectAgs=" + HiJsonUtil.d(strArr));
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> b(long j, int i, List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and merged =? and type_id =? and value >? ");
        String[] strArr = new String[list.size() + 4];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(0L);
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(24);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        Cursor cursorQuery = this.f39579b.query(stringBuffer.toString(), strArr, null, null, null);
        LogUtil.d("Debug_HealthDataPointManager", "queryListByValue sql=" + stringBuffer.toString(), ", selectAgs", HiJsonUtil.d(strArr));
        return kwf.m(cursorQuery, null);
    }

    public List<HiHealthData> b(HiDataReadOption hiDataReadOption, int[] iArr, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        int i = hiDataReadOption.getModifiedEndTime() > 0 ? 2 : 0;
        String[] strArr = new String[iArr.length + size + 3 + i];
        stringBuffer.append("start_time >=? and start_time <=? and merged =? ");
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(0);
        int iB = kwe.b(strArr, 3, hiDataReadOption);
        if (i == 2) {
            stringBuffer.append(" and modified_time >=? and modified_time <=? ");
        }
        kwb.e("client_id", list, stringBuffer, strArr, iB);
        kwb.d("type_id", iArr, stringBuffer, strArr, size + iB);
        String strC = kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        LogUtil.d("Debug_HealthDataPointManager", "queryMergePointDatasWithOrder() sql = ", stringBuffer, ",selectAgs = ", HiJsonUtil.d(strArr));
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, strC), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> b(HiDataReadOption hiDataReadOption, int[] iArr, List<Integer> list, String str) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[iArr.length + size + 4];
        stringBuffer.append("start_time >=? and start_time <=? and merged =? and (metadata is NULL  or metadata =?  or metadata= '").append(str).append(Constants.RIGHT_BRACKET);
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(0);
        strArr[3] = "0";
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        kwb.d("type_id", iArr, stringBuffer, strArr, size + 4);
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())), hiDataReadOption.getDeviceUuid());
    }

    public List<HiHealthData> b(long j, long j2, int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 128);
        String[] strArr = new String[size + 4];
        stringBuffer.append("start_time =? and end_time =? and type_id =? and sync_status !=? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.t(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> e(long j, long j2, int i, List<Integer> list) {
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("Debug_HealthDataPointManager", "clientIds is null or empty!");
            return Collections.EMPTY_LIST;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        String[] strArr = new String[size + 3];
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? ");
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        return kwf.t(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int b(long j, int i, int i2) {
        return this.f39579b.update(kvw.b(i, i2), "_id =? ", new String[]{Long.toString(j)});
    }

    public int a(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesE = kvw.e(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesE.remove("sync_status");
        }
        if (hiHealthData.getInt("merged") == 2) {
            contentValuesE.remove("merged");
        }
        return this.f39579b.update(contentValuesE, d(), e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i));
    }

    public int e(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValuesE = kvw.e(hiHealthData, i2);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesE.remove("sync_status");
        }
        return this.f39579b.update(contentValuesE, e(), d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i, 2));
    }

    public int d(HiHealthData hiHealthData, int i) {
        ContentValues contentValuesE = kvw.e(hiHealthData, i);
        if (hiHealthData.getSyncStatus() == 1) {
            contentValuesE.remove("sync_status");
        }
        if (hiHealthData.getInt("merged") == 2) {
            contentValuesE.remove("merged");
        }
        return this.f39579b.update(contentValuesE, "_id =? ", new String[]{Long.toString(hiHealthData.getDataId())});
    }

    private boolean d(long j, long j2, int i, int i2) {
        return kwf.m(this.f39579b.query(e(), d(j, j2, i, i2, 2), null, null, null));
    }

    public boolean c(final HiHealthData hiHealthData, int i, int i2) {
        long jE;
        LogUtil.d("Debug_HealthDataPointManager", "insertOrUpdatePointData enter!");
        if (d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i)) {
            jE = e(hiHealthData, i, i2);
        } else {
            long jB = b(hiHealthData, i, i2);
            if (i2 != 1) {
                HandlerCenter.a().d(new Runnable() { // from class: kxb
                    @Override // java.lang.Runnable
                    public final void run() {
                        lfp.c().process(hiHealthData);
                    }
                }, 1000L);
            }
            jE = jB;
        }
        return kwb.b(jE);
    }

    private String[] e(long j, long j2, int i, int i2) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2)};
    }

    private String d() {
        return "start_time =? and end_time =? and type_id =? and client_id =? ";
    }

    private String e() {
        return "start_time =? and end_time =? and type_id =? and client_id =? and sync_status !=? ";
    }

    private String[] d(long j, long j2, int i, int i2, int i3) {
        return new String[]{Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(i2), Integer.toString(i3)};
    }

    public List<HiHealthData> c(int i, List<Integer> list, int i2) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.e("type_id", list, stringBuffer, strArr, 2);
        return kwf.q(this.f39579b.query(stringBuffer.toString(), strArr, null, null, "start_time DESC  limit 0 ," + i2));
    }

    public List<Integer> e(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        String[] strArr = {Long.toString(i)};
        kwb.b(stringBuffer, str);
        return kwf.i(this.f39579b.queryEX(new String[]{str}, stringBuffer.toString(), strArr, null, null, null), str);
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
        return kwf.q(this.f39579b.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "));
    }

    public List<HiHealthData> e(int i, List<Integer> list, long j, long j2) {
        int size = list.size() + 4;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(2);
        strArr[2] = Long.toString(j);
        strArr[3] = Long.toString(j2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        stringBuffer.append("client_id =? and sync_status !=? and start_time =? and end_time =? ");
        kwb.e("type_id", list, stringBuffer, strArr, 4);
        return kwf.q(this.f39579b.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "));
    }

    public int b(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        return this.f39579b.update(contentValues, "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)});
    }

    public List<HiHealthData> a(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 3;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("start_time >=? and start_time <=? and sync_status !=? ");
        kwb.d("type_id", iArr, stringBuffer, strArr, 3);
        kwb.e("client_id", list, stringBuffer, strArr, length + 3);
        return kwf.t(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int d(List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return this.f39579b.delete(stringBuffer.toString(), strArr);
    }

    public List<Integer> c(long j, long j2, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and type_id =? and sync_status !=? ");
        String[] strArr = {Long.toString(j), Long.toString(j2), Integer.toString(i), Integer.toString(2)};
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> d(long j, long j2, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("start_time >=? and start_time <=? and sync_status !=? ");
        String[] strArr = new String[iArr.length + 3];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(2);
        kwb.d("type_id", iArr, stringBuffer, strArr, 3);
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<HiHealthData> d(int[] iArr, int i, List<Integer> list, int i2) {
        int size = list.size();
        int length = iArr.length + size + 1;
        String[] strArr = new String[length];
        strArr[0] = Integer.toString(i);
        StringBuffer stringBuffer = new StringBuffer((length * 2) + 32);
        stringBuffer.append("sync_status =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 1);
        kwb.d("type_id", iArr, stringBuffer, strArr, size + 1);
        kwe.b(stringBuffer, 0, i2);
        LogUtil.d("Debug_HealthDataPointManager", "queryPointDataBySyncStatus() selector = ", stringBuffer, ",selectAgs = ", HiJsonUtil.d(strArr));
        return kwf.t(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> d(List<Integer> list, int i, int i2, int i3) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, kwb.c("start_time", i, i2, i3)), null);
    }

    public List<HiHealthData> c(List<Integer> list, long j, long j2, int i) {
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("Debug_HealthDataPointManager", "clientIDs is null or empty!");
            return Collections.EMPTY_LIST;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 64);
        stringBuffer.append("start_time >=? and start_time <=? and merged =? and type_id =? ");
        String[] strArr = new String[size + 4];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(0);
        strArr[3] = Integer.toString(i);
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.m(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null), null);
    }

    public List<Integer> b(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[list.size() + 1];
        strArr[0] = Integer.toString(0);
        kwb.e("type_id", list, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "client_id");
        return kwf.i(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null), "client_id");
    }

    public List<Integer> b(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("sync_status =? ");
        String[] strArr = new String[iArr.length + 1];
        strArr[0] = Integer.toString(2);
        kwb.d("type_id", iArr, stringBuffer, strArr, 1);
        kwb.b(stringBuffer, "type_id");
        return kwf.i(this.f39579b.query(stringBuffer.toString(), strArr, null, null, null), "type_id");
    }

    public int d(long j, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return this.f39579b.update(contentValues, "_id =? ", new String[]{Long.toString(j)});
    }
}
