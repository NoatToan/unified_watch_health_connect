package defpackage;

import com.huawei.hwcommonmodel.fitnessdatatype.DataTotalMotion;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateDetect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41110a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<DataTotalMotion> f41112c = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HeartRateDetect f41111b = new HeartRateDetect();

    public int d() {
        return this.f41110a;
    }

    public void e(int i) {
        this.f41110a = i;
    }

    public List<DataTotalMotion> a() {
        return this.f41112c;
    }

    public void e(HeartRateDetect heartRateDetect) {
        this.f41111b = heartRateDetect;
    }
}
