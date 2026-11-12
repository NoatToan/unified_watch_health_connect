package health.compact.a;

import android.util.SparseArray;
import com.huawei.health.manager.util.TimeUtil;

/* JADX INFO: loaded from: classes2.dex */
public class StepDataCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SparseArray<OneMinuteStepData> f36642c = new SparseArray<>();

    protected void c(int i) {
    }

    public void b(int i, long j, int i2, int i3, int i4) {
        int iB;
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataCache", "setSteps()");
        int iE = (int) TimeUtil.e(j);
        SparseArray<OneMinuteStepData> sparseArray = this.f36642c;
        if (sparseArray == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_DataCache", "setSteps mCache == null");
            return;
        }
        OneMinuteStepData oneMinuteStepData = sparseArray.get(iE);
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataCache", "size ", Integer.valueOf(this.f36642c.size()));
        if (oneMinuteStepData != null) {
            iB = oneMinuteStepData.b();
            oneMinuteStepData.c(oneMinuteStepData.d(), iE, i2, i3, i4);
        } else {
            oneMinuteStepData = new OneMinuteStepData(i, iE, i2, i3, i4);
            iB = 0;
        }
        c(oneMinuteStepData);
        this.f36642c.put(iE, oneMinuteStepData);
        e(iE, i2, iB);
    }

    public void d(OneMinuteStepData oneMinuteStepData) {
        SparseArray<OneMinuteStepData> sparseArray;
        if (oneMinuteStepData == null || (sparseArray = this.f36642c) == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataCache", "data == null or mCache == null");
            return;
        }
        OneMinuteStepData oneMinuteStepData2 = sparseArray.get((int) oneMinuteStepData.e());
        int iB = oneMinuteStepData2 != null ? oneMinuteStepData2.b() : 0;
        c(oneMinuteStepData);
        this.f36642c.put((int) oneMinuteStepData.e(), oneMinuteStepData);
        e((int) oneMinuteStepData.e(), oneMinuteStepData.b(), iB);
    }

    public OneMinuteStepData e(long j) {
        return this.f36642c.get((int) TimeUtil.e(j));
    }

    private void e(int i, int i2, int i3) {
        if (i2 < i3) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataCache", "mcache insert step<oldStep");
        }
        c(i);
    }

    public SparseArray<OneMinuteStepData> c() {
        return this.f36642c;
    }

    public void e() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_DataCache", "clear()");
        SparseArray<OneMinuteStepData> sparseArray = this.f36642c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return;
        }
        this.f36642c.clear();
    }

    public int d() {
        SparseArray<OneMinuteStepData> sparseArray = this.f36642c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return 0;
        }
        int iB = 0;
        for (int i = 0; i < this.f36642c.size(); i++) {
            if (this.f36642c.valueAt(i).j()) {
                iB += this.f36642c.valueAt(i).b();
            }
        }
        return iB;
    }

    private void c(OneMinuteStepData oneMinuteStepData) {
        oneMinuteStepData.g();
    }
}
