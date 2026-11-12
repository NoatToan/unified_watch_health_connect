package defpackage;

import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s1t extends i7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yzs f33186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kft f33187b;
    public long c;

    public s1t(jet jetVar, long j, kft kftVar) {
        this.f33186a = null;
        this.f33187b = null;
        this.c = 0L;
        this.f33186a = new yzs(jetVar);
        this.f33187b = kftVar;
        this.c = j;
    }

    public final boolean a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(1) < 2014) {
            t5t.d("HMWeightSyncDataTask", "year less than 2014!!!");
            return false;
        }
        if (j <= Calendar.getInstance().getTimeInMillis() + 86400000) {
            return true;
        }
        t5t.d("HMWeightSyncDataTask", "timestamp large than current!!!");
        return false;
    }

    @Override // defpackage.i7t
    public void doWork() {
        this.f33187b.a();
        if (!this.f33186a.init()) {
            t5t.d("HMWeightSyncDataTask", "HMWeightSyncDataProfile init failed!!!");
            this.f33187b.b(new WeightSyncResult());
            return;
        }
        int iF = this.f33186a.f(this.c);
        t5t.m("HMWeightSyncDataTask", "weight data size : " + iF);
        if (iF <= 0) {
            this.f33187b.b(new WeightSyncResult());
            this.f33186a.deInit();
            return;
        }
        List<WeightAdvData> listB = this.f33186a.b(this.c, iF);
        this.f33186a.deInit();
        if (listB == null || listB.size() == 0) {
            this.f33187b.b(new WeightSyncResult());
            return;
        }
        WeightSyncResult weightSyncResult = new WeightSyncResult();
        for (WeightAdvData weightAdvData : listB) {
            long timestamp = weightAdvData.getTimestamp();
            if (weightAdvData.getValue() == 0.0f) {
                weightSyncResult.rebootCount++;
                t5t.d("HMWeightSyncDataTask", "wrong weight data value as reboot:" + weightAdvData + "<DROP>!!!");
            } else if (a(timestamp)) {
                weightSyncResult.add(weightAdvData);
                long j = weightSyncResult.startTs;
                if (j == -1 || j > timestamp) {
                    weightSyncResult.startTs = timestamp;
                }
                long j2 = weightSyncResult.stopTs;
                if (j2 == -1) {
                    weightSyncResult.stopTs = timestamp;
                } else if (j2 < timestamp) {
                    weightSyncResult.stopTs = timestamp;
                }
            } else {
                t5t.d("HMWeightSyncDataTask", "wrong weight data timestamp:" + new Date(timestamp).toString() + "<DROP>!!!");
            }
        }
        this.f33187b.b(weightSyncResult);
    }
}
