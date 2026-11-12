package defpackage;

import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kvd f39572c;

    private kwx() {
        this.f39572c = kvd.e();
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kwx f39573c = new kwx();
    }

    public static kwx e() {
        return a.f39573c;
    }

    public void b(long j, long j2, List<Integer> list, int i) {
        int[] iArrO = HiHealthDataType.o();
        String[] strArr = new String[iArrO.length + list.size() + 6];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(System.currentTimeMillis());
        strArr[3] = Long.toString(j);
        strArr[4] = Long.toString(j2);
        strArr[5] = Integer.toString(0);
        String strD = kwb.d(iArrO, list, strArr, 6);
        LogUtil.d("Debug_ExecSQLManager", "copySportPointDatas() sql = ", strD, ",selectAgs = ", HiJsonUtil.d(strArr));
        this.f39572c.execSQL(strD, strArr);
    }

    public void a(long j, long j2, List<Integer> list, int i) {
        String[] strArr = new String[list.size() + 8];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(System.currentTimeMillis());
        strArr[3] = Long.toString(j);
        strArr[4] = Long.toString(j2);
        strArr[5] = Integer.toString(20001);
        strArr[6] = Integer.toString(21000);
        strArr[7] = Integer.toString(0);
        String strC = kwb.c(list, strArr, 8);
        LogUtil.d("Debug_ExecSQLManager", "copySportSessionDatas() sql = ", strC, ",selectAgs = ", HiJsonUtil.d(strArr));
        this.f39572c.execSQL(strC, strArr);
    }

    public void d(long j, long j2, int i, int i2, int i3) {
        String[] strArr = {Integer.toString(i), Integer.toString(i3), Integer.toString(0), Long.toString(System.currentTimeMillis()), Integer.toString(HiDateUtil.d(j)), Integer.toString(HiDateUtil.d(j2)), Integer.toString(40001), Integer.toString(41000), Integer.toString(i2)};
        String strE = kwb.e();
        LogUtil.d("Debug_ExecSQLManager", "copySportStatDatas() sql = ", strE, ",selectAgs = ", HiJsonUtil.d(strArr));
        this.f39572c.execSQL(strE, strArr);
    }

    public void e(long j, long j2, List<Integer> list, int i) {
        int[] iArr = {DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()};
        String[] strArr = new String[list.size() + 7];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        strArr[2] = Long.toString(System.currentTimeMillis());
        strArr[3] = Long.toString(j);
        strArr[4] = Long.toString(j2);
        strArr[5] = Integer.toString(0);
        String strA = kwb.a(iArr, list, strArr, 6);
        LogUtil.d("Debug_ExecSQLManager", "copyActiveHourPointDatas() sql = ", strA, ",selectAgs = ", HiJsonUtil.d(strArr));
        this.f39572c.execSQL(strA, strArr);
    }

    public void c(long j, long j2, int i, int i2, int i3) {
        String[] strArr = {Integer.toString(i), Integer.toString(i3), Integer.toString(0), Long.toString(System.currentTimeMillis()), Integer.toString(HiDateUtil.d(j)), Integer.toString(HiDateUtil.d(j2)), Integer.toString(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()), Integer.toString(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()), Integer.toString(i2)};
        String strE = kwb.e();
        LogUtil.d("Debug_ExecSQLManager", "copyActiveHourStatDatas() sql = ", strE, ",selectAgs = ", HiJsonUtil.d(strArr));
        this.f39572c.execSQL(strE, strArr);
    }
}
