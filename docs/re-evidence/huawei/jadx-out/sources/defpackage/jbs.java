package defpackage;

import com.huawei.health.sportservice.SportLifecycle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jbs implements SportLifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jpi[] f38357b;
    private jpi e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<jpi> f38358c = new ArrayList();
    private int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38356a = false;

    public void d(jpi jpiVar) {
        if (jpiVar == null) {
            return;
        }
        if (this.f38356a) {
            this.f38358c.clear();
            jpi jpiVar2 = this.e;
            if (jpiVar2 != null) {
                this.f38357b = new jpi[]{jpiVar2, jpiVar};
            }
            this.f38356a = false;
        } else {
            this.f38357b = null;
        }
        this.f38358c.add(jpiVar);
        this.e = jpiVar;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.d = 1;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        if (this.d != 1) {
            this.d = 1;
            this.f38356a = true;
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        if (this.d != 2) {
            this.d = 2;
            this.f38356a = false;
        }
    }

    public List<jpi> d() {
        return this.f38358c;
    }

    public jpi[] e() {
        return this.f38357b;
    }

    public String toString() {
        return "TrackDrawGpsData{mBasePointList=" + this.f38358c.size() + ", mLastSportStatus=" + this.d + ", mLastPoint=" + this.e + ", mPauseLine=" + Arrays.toString(this.f38357b) + ", mIsResumeSport=" + this.f38356a + '}';
    }
}
