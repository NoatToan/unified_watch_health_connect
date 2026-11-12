package health.compact.a;

import android.content.Context;
import com.huawei.health.manager.common.SingleDayBaseManager;
import com.huawei.health.manager.util.UserInfo;

/* JADX INFO: loaded from: classes2.dex */
public class DistanceManager extends SingleDayBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DistanceManager f36540c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f36541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36542b;
    private UserInfo e;

    private DistanceManager(Context context) {
        super(context);
        this.f36541a = 0.0d;
        this.e = null;
        this.f36542b = 0L;
        this.e = UserInfo.a();
    }

    public static DistanceManager a(Context context) {
        DistanceManager distanceManager;
        synchronized (d) {
            if (f36540c == null) {
                f36540c = new DistanceManager(context);
            }
            distanceManager = f36540c;
        }
        return distanceManager;
    }

    public int d(int i) {
        return c(i);
    }

    private int c(int i) {
        double dE = CalculateDistanceUtils.e(i, this.e.c()) * 1000.0d;
        int i2 = (int) (this.f36541a + dE);
        long jA = com.huawei.hwlogsmodel.LogUtil.a(1000, this.f36542b);
        if (jA != -1) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_DistanceManager", "computeDistanceStatic", " stepDis = ", Double.valueOf(dE), " mDisDiffStand = ", Double.valueOf(this.f36541a), " distanceStatic = ", Integer.valueOf(i2));
            this.f36542b = jA;
        }
        return i2;
    }

    public void a(int i, int i2) {
        int iD = d(i);
        com.huawei.hwlogsmodel.LogUtil.a("Step_DistanceManager", "syncDistance", " stepDis = ", Integer.valueOf(iD), " mDisDiffStand = ", Double.valueOf(this.f36541a), " distanceFromDb = ", Integer.valueOf(i2));
        if (iD < i2) {
            double d2 = this.f36541a + ((double) (i2 - iD));
            this.f36541a = d2;
            com.huawei.hwlogsmodel.LogUtil.a("Step_DistanceManager", "saveDiffDistanceToFile total db mDistanceDiffStand ", Double.valueOf(d2));
        }
    }

    public void e() {
        this.f36541a = 0.0d;
    }
}
