package defpackage;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ize {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<njt> f38243c = new ArrayList<>(16);
    private CopyOnWriteArrayList<njt> d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38241a = 0;
    private float e = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38242b = 0.0f;

    public ArrayList<njt> e(boolean z) {
        ArrayList<njt> arrayList = new ArrayList<>(16);
        if (this.f38243c.size() > 0) {
            arrayList.addAll(this.f38243c);
            if (z) {
                this.f38243c.clear();
            }
        }
        return arrayList;
    }

    public void e(long j, float f) {
        if (j % 5 != 0 || j == this.f38241a) {
            return;
        }
        float f2 = (f * 10.0f) / 3.6f;
        LogUtil.a("Track_RealTimePaceUtil", "time = ", Long.valueOf(j), " realTimeSpeed = ", Float.valueOf(f2));
        d(j, f2);
        njt njtVar = new njt(j, f2);
        this.f38243c.add(njtVar);
        this.f38242b = Math.max(f2, this.f38242b);
        this.f38241a = j;
        this.e = f2;
        if (this.d.size() >= 12) {
            this.d.remove(0);
            this.d.add(njtVar);
        } else {
            this.d.add(njtVar);
        }
    }

    private void d(long j, float f) {
        long j2 = this.f38241a;
        if (j2 <= 0 || j - j2 <= 5) {
            return;
        }
        LogUtil.a("Track_RealTimePaceUtil", "compensateSpeedData time =", Long.valueOf(j), " currentrealTimeSpeed =", Float.valueOf(f));
        float f2 = this.e;
        long j3 = j - this.f38241a;
        float f3 = (f - f2) / j3;
        long j4 = j3 / 5;
        int i = 0;
        while (i < j4 - 1) {
            long j5 = this.f38241a;
            i++;
            long j6 = i * 5;
            float f4 = this.e + f3;
            if (f4 < 0.0f) {
                return;
            }
            this.f38243c.add(new njt(j5 + j6, f4));
        }
    }

    public CopyOnWriteArrayList<njt> e() {
        if (this.d.size() >= 12) {
            return this.d;
        }
        return null;
    }

    public void c(List<njt> list) {
        if (!CollectionUtils.a(list)) {
            for (njt njtVar : list) {
                if (njtVar != null) {
                    this.f38242b = Math.max(this.f38242b, njtVar.b());
                }
            }
        }
        ArrayList<njt> arrayList = this.f38243c;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public float c() {
        return (this.f38242b / 10.0f) * 3.6f;
    }
}
