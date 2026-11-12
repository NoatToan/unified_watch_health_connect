package health.compact.a;

import android.content.Context;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class AliveStatusRecord {
    private static AliveStatusRecord e = new AliveStatusRecord(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36501b;
    private long d;

    private AliveStatusRecord(long j, long j2) {
        this.f36501b = j;
        this.d = j2;
    }

    public long e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jE = e(jCurrentTimeMillis);
        long jA = a(jElapsedRealtime);
        if (jE <= 0 || jA <= 0) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "intervalMillsByTimeStamp <=0 or intervalMillsByElapsedRealTime <= 0");
            return 0L;
        }
        if (jE <= jA) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "computeIntervalMillsFromNow end value:", Long.valueOf(jE));
            return jE;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "computeIntervalMillsFromNow end value:", Long.valueOf(jA));
        return jA;
    }

    private long e(long j) {
        long j2 = this.f36501b;
        if (j2 == 0) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "timeStamp zero,no data isValidate,return NO_DEATH_MILLS");
            return 0L;
        }
        if (j <= j2) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "maybe modify time,return death mills zero, timeStampNow = ", Long.valueOf(j), " mTimestamp = ", Long.valueOf(j2));
            return 0L;
        }
        long j3 = j - j2;
        if (j3 > 2592000000L) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "interval larger than 30 days,drop death time, intervalMills = ", Long.valueOf(j3));
            return 0L;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "computeIntervalByTimeStamp:", Long.valueOf(j3));
        return j3;
    }

    private long a(long j) {
        long j2 = this.d;
        if (j <= j2) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "maybe reboot,return death mills zero, elapsedRealTimeNow = ", Long.valueOf(j), "mElapsedRealTime = ", Long.valueOf(j2));
            return 0L;
        }
        long j3 = j - j2;
        if (j3 > 2592000000L) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "interval larger than 30 days,drop death time, intervalMills = ", Long.valueOf(j3));
            return 0L;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "computeIntervalByElapsedRealTime:", Long.valueOf(j3));
        return j3;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        SharedPerferenceUtils.b(context, System.currentTimeMillis(), SystemClock.elapsedRealtime());
    }

    public static void c(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "deleteAliveRecord context is null.");
        } else {
            SharedPerferenceUtils.a(context);
        }
    }

    public static AliveStatusRecord d(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_AliveStatusRecord", "deserialize context is null.");
            return e;
        }
        try {
            String[] strArrE = SharedPerferenceUtils.e(context);
            if (strArrE != null && strArrE.length >= 2) {
                long j = Long.parseLong(strArrE[0]);
                long j2 = Long.parseLong(strArrE[1]);
                AliveStatusRecord aliveStatusRecord = new AliveStatusRecord(j, j2);
                com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "Deserialize timestamp = ", Long.valueOf(j), " elapsedRealTimeArg = ", Long.valueOf(j2));
                return aliveStatusRecord;
            }
            com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "alive record empty or data bad,return unset record");
            return e;
        } catch (NumberFormatException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_AliveStatusRecord", "deserialize exception = ", e2.getMessage());
            return e;
        }
    }

    public boolean c() {
        long j = this.f36501b;
        if (j > 0 && this.d > 0) {
            return false;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusRecord", "isValidTime mTimestamp = ", Long.valueOf(j), " mElapsedRealTime = ", Long.valueOf(this.d), " data not can use,return unset!!!");
        return true;
    }
}
