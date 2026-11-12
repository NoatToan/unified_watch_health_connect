package defpackage;

import com.huawei.ui.commonui.linechart.icommon.ISupportRangePresentation;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class ueu implements ISupportRangePresentation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<HeartRateDetailData> f49999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50000c;
    private int d;
    private long e;

    public void c(long j, long j2) {
        this.e = j;
        this.f50000c = j2;
    }

    public void e(int i, int i2) {
        this.d = i;
        this.f49998a = i2;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.ISupportRangePresentation
    public long getStartX() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.ISupportRangePresentation
    public long getEndX() {
        return this.f50000c;
    }

    public int c() {
        return this.f49998a;
    }

    public int e() {
        return this.d;
    }

    public ArrayList<HeartRateDetailData> d() {
        return this.f49999b;
    }

    public void e(ArrayList<HeartRateDetailData> arrayList) {
        this.f49999b = arrayList;
    }
}
