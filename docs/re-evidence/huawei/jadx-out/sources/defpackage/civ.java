package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class civ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<Integer> f1628b = new ArrayList<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1629c;
    private long d;

    public void b(long j) {
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public void c(long j) {
        this.f1629c = j;
    }

    public long c() {
        return ((Long) lst.d(Long.valueOf(this.f1629c))).longValue();
    }

    public void c(String str) {
        int length = str.length();
        this.f1628b = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            try {
                this.f1628b.add(i, Integer.valueOf(Integer.parseInt(str.substring(i, i + 1))));
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_SleepStatusFrame", "setStatusList parseString NumberFormatException");
            }
        }
        LogUtil.a("SleepStatusFrame", "integerArrayList:", Integer.valueOf(this.f1628b.size()));
    }

    public ArrayList<Integer> b() {
        return this.f1628b;
    }

    public String toString() {
        return "SleepStatusFrame{startTime = " + this.d + "endTime = " + this.f1629c + "statusList = " + this.f1628b.toString() + "}";
    }
}
