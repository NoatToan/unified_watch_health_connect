package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.connectivity.thirdband.StepCounterStrategy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedList;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes7.dex */
public class dls implements StepCounterStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Uri f31975c = Uri.parse("content://com.miui.providers.steps/item");
    private static final String[] d = {"_id", "_begin_time", "_end_time", "_mode", "_steps"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31977b = 0;
    private long e;

    @Override // com.huawei.health.connectivity.thirdband.StepCounterStrategy
    public int getRealSteps() {
        return a();
    }

    @Override // com.huawei.health.connectivity.thirdband.StepCounterStrategy
    public boolean isSupportStep() {
        return e();
    }

    private static boolean e() {
        try {
            Boolean bool = (Boolean) Class.forName("miui.util.FeatureParser").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "support_steps_provider", false);
            boolean zBooleanValue = bool.booleanValue();
            ReleaseLogUtil.d("Step_XiaomiStepCounter", "isSupportXiaomi:", bool);
            return zBooleanValue;
        } catch (Exception e) {
            ReleaseLogUtil.a("Step_XiaomiStepCounter", "isSupportXiaomi:", ExceptionUtils.c(e));
            return false;
        }
    }

    private static List<dlt> c(String str, String[] strArr) {
        LinkedList linkedList = new LinkedList();
        try {
            Context context = BaseApplication.getContext();
            if (context == null) {
                ReleaseLogUtil.a("Step_XiaomiStepCounter", "getAllSteps context == null");
                return linkedList;
            }
            Cursor cursorQuery = context.getContentResolver().query(f31975c, d, str, strArr, "_id asc");
            if (cursorQuery == null) {
                ReleaseLogUtil.a("Step_XiaomiStepCounter", "getAllSteps cursor == null");
                return linkedList;
            }
            if (cursorQuery.moveToFirst()) {
                do {
                    linkedList.add(new dlt(d(cursorQuery, "_id", 0), c(cursorQuery, "_begin_time", System.currentTimeMillis()), c(cursorQuery, "_end_time", System.currentTimeMillis()), d(cursorQuery, "_mode", 2), d(cursorQuery, "_steps", 0)));
                } while (cursorQuery.moveToNext());
            }
            return linkedList;
        } catch (Exception e) {
            ReleaseLogUtil.a("Step_XiaomiStepCounter", "getAllSteps:", ExceptionUtils.c(e));
            return linkedList;
        }
    }

    private int a() {
        int iSum;
        synchronized (this) {
            if (!StepCounterSupportUtils.b(BaseApplication.getContext())) {
                ReleaseLogUtil.e("Step_XiaomiStepCounter", "isSupportXiaomi: isSupport not permission");
                return 0;
            }
            if (!lsl.c(System.currentTimeMillis(), this.e)) {
                this.e = 0L;
                this.f31976a = 0;
            }
            long jE = e(300000, this.f31977b);
            if (jE == -1 && this.f31977b != 0) {
                return this.f31976a;
            }
            this.f31977b = jE;
            if (this.e == 0) {
                this.e = lsl.r(System.currentTimeMillis());
            }
            String[] strArr = {String.valueOf(this.e), String.valueOf(System.currentTimeMillis()), String.valueOf(2), String.valueOf(3)};
            ReleaseLogUtil.d("Step_XiaomiStepCounter", "mQueryStepTime:", Long.valueOf(this.e), "endTime:", Long.valueOf(System.currentTimeMillis()));
            List<dlt> listC = c("_begin_time >= ? AND _end_time <= ? AND (_mode = ? OR _mode = ?)", strArr);
            LogUtil.a("Step_XiaomiStepCounter", "XIAOMI: list", listC);
            if (njy.b(listC)) {
                iSum = listC.stream().mapToInt(new ToIntFunction() { // from class: dlr
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return ((dlt) obj).e();
                    }
                }).sum();
                this.e = System.currentTimeMillis();
                dlt dltVar = listC.get(listC.size() - 1);
                if (dltVar != null) {
                    this.e = dltVar.b();
                }
            } else {
                iSum = 0;
            }
            ReleaseLogUtil.d("Step_XiaomiStepCounter", npt.d("getXiaomiStep start:", Integer.valueOf(this.f31976a), "currentStep:", Integer.valueOf(iSum), "mQueryStepTime:", Long.valueOf(this.e)));
            int i = this.f31976a + iSum;
            this.f31976a = i;
            return i;
        }
    }

    public static long e(int i, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j >= i) {
            return jCurrentTimeMillis;
        }
        return -1L;
    }

    private static int d(Cursor cursor, String str, int i) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex != -1 ? cursor.getInt(columnIndex) : i;
    }

    private static long c(Cursor cursor, String str, long j) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex != -1 ? cursor.getLong(columnIndex) : j;
    }
}
