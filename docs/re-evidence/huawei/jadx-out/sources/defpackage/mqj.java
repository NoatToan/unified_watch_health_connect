package defpackage;

import com.huawei.hwcommonmodel.fitnessdatatype.DataTotalMotion;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateDetect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mqj {
    private int d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DataTotalMotion> f42180b = new ArrayList(16);
    private HeartRateDetect e = new HeartRateDetect();

    public int b() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public List<DataTotalMotion> e() {
        return this.f42180b;
    }

    public void a(HeartRateDetect heartRateDetect) {
        this.e = heartRateDetect;
    }
}
