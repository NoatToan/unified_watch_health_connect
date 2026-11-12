package defpackage;

import android.util.Log;
import com.huawei.health.hwhealthtrackalgo.c;
import com.huawei.health.hwhealthtrackalgo.stat.FilterResultListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class flh {
    public FilterResultListener i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, Integer> f34169c = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34168b = 0;
    public int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34167a = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("Total = ");
        stringBuffer.append(this.f34168b);
        stringBuffer.append(" Filted = ");
        stringBuffer.append(this.g);
        stringBuffer.append(" ByAccuracy = ");
        stringBuffer.append(this.f);
        stringBuffer.append(" ByTime = ");
        stringBuffer.append(this.d);
        stringBuffer.append(" ByShortDis = ");
        stringBuffer.append(this.f34167a);
        stringBuffer.append(" ByOverSpeed = ");
        stringBuffer.append(this.e);
        return stringBuffer.toString();
    }

    public final void b(int i, c cVar, long j) {
        int i2 = 1;
        if (i != 1 || cVar == null) {
            i2 = 0;
        } else {
            this.g++;
            if (cVar instanceof fky) {
                this.f++;
                i2 = 2;
            } else if (cVar instanceof fld) {
                this.d++;
                i2 = 4;
            } else if (cVar instanceof flf) {
                this.f34167a++;
                i2 = 3;
            } else if (cVar instanceof fkz) {
                this.e++;
            } else {
                Log.e("Track_StatFilterPointsMgr", "stat else");
                i2 = 199;
            }
        }
        FilterResultListener filterResultListener = this.i;
        if (filterResultListener != null) {
            filterResultListener.onFilterResult(i2, j);
        }
    }
}
