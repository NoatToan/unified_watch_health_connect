package defpackage;

import com.huawei.health.suggestion.fit.heartrate.HeartRateInterface;
import com.huawei.hihealth.ResultUtils;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hdo implements HeartRateInterface {
    private boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36468a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36470c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36469b = -1;
    private List<HeartRateData> d = new CopyOnWriteArrayList();
    private List<HeartRateData> e = new ArrayList();

    private boolean c(int i) {
        return i > 0 && i < 220;
    }

    @Override // com.huawei.health.suggestion.fit.heartrate.HeartRateInterface
    public void pushHeartRate(int i, long j) {
        this.f36468a = j;
        if (c(i)) {
            this.f36469b = i;
        } else {
            this.f36469b = -1;
        }
    }

    @Override // com.huawei.health.suggestion.fit.heartrate.HeartRateInterface
    public void saveHeartRate() {
        HeartRateData heartRateData;
        boolean z = true;
        int i = this.f36470c + 1;
        this.f36470c = i;
        if (i == 5) {
            LogUtil.d("Suggestion_HeartRateInterfaceImpl", "mHeartRateTempTime:", Long.valueOf(this.f36468a), " mHeartRateTemp:", Integer.valueOf(this.f36469b));
            this.f36470c = 0;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f36468a;
            if (jCurrentTimeMillis < TimeUnit.SECONDS.toMillis(20L) || this.j) {
                z = false;
            } else {
                LogUtil.e("Suggestion_HeartRateInterfaceImpl", "diff time > 20");
            }
            this.j = false;
            if (this.f36469b == -1) {
                LogUtil.e("Suggestion_HeartRateInterfaceImpl", "HEART_NONE");
            } else if (!z) {
                if (jCurrentTimeMillis > TimeUnit.SECONDS.toMillis(5L) && jCurrentTimeMillis < TimeUnit.SECONDS.toMillis(20L)) {
                    heartRateData = new HeartRateData(this.f36468a + TimeUnit.SECONDS.toMillis((jCurrentTimeMillis / TimeUnit.SECONDS.toMillis(5L)) * 5), this.f36469b);
                } else {
                    heartRateData = new HeartRateData(this.f36468a, this.f36469b);
                }
                d(heartRateData);
                return;
            }
            e(new HeartRateData(System.currentTimeMillis(), -1));
        }
    }

    private void e(HeartRateData heartRateData) {
        this.e.add(heartRateData);
    }

    private void d(HeartRateData heartRateData) {
        this.d.add(heartRateData);
    }

    @Override // com.huawei.health.suggestion.fit.heartrate.HeartRateInterface
    public int getAverageHeartRate() {
        int iAcquireHeartRate = 0;
        if (njy.e(this.d)) {
            return 0;
        }
        Iterator<HeartRateData> it = this.d.iterator();
        while (it.hasNext()) {
            iAcquireHeartRate += it.next().acquireHeartRate();
        }
        return iAcquireHeartRate / this.d.size();
    }

    @Override // com.huawei.health.suggestion.fit.heartrate.HeartRateInterface
    public List<HeartRateData> getHeartRateList() {
        return b(this.d);
    }

    @Override // com.huawei.health.suggestion.fit.heartrate.HeartRateInterface
    public List<HeartRateData> getInvalidHeartRateList() {
        return b(this.e);
    }

    private List<HeartRateData> b(List<HeartRateData> list) {
        List list2 = (List) ResultUtils.c(list);
        ArrayList arrayList = new ArrayList();
        if (list2.isEmpty()) {
            LogUtil.j("Suggestion_HeartRateInterfaceImpl", "getListTemp : heartRateList is empty!");
            return arrayList;
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    public void e(boolean z) {
        this.j = z;
    }
}
