package defpackage;

import android.os.Bundle;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jbu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISportDataCallback f38359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38360c;
    private long d;

    public jbu(ISportDataCallback iSportDataCallback, long j) {
        this.f38359b = iSportDataCallback;
        a(j);
        this.f38360c = 1L;
    }

    public void e(Bundle bundle) {
        long j = this.f38360c;
        if (j >= this.d) {
            c(bundle);
            this.f38360c = 1L;
        } else {
            this.f38360c = j + 1;
        }
    }

    public void c(Bundle bundle) {
        ISportDataCallback iSportDataCallback = this.f38359b;
        if (iSportDataCallback != null) {
            iSportDataCallback.getSportInfo(bundle);
        } else {
            LogUtil.j("Track_SportDataCallbackProxy", "report mCallback is null");
        }
    }

    public void c(MotionPathSimplify motionPathSimplify) {
        ISportDataCallback iSportDataCallback = this.f38359b;
        if (iSportDataCallback != null) {
            iSportDataCallback.onSummary(motionPathSimplify);
        } else {
            LogUtil.j("Track_SportDataCallbackProxy", "onSummary mCallback is null");
        }
    }

    private void a(long j) {
        if (j <= 0) {
            this.d = 1L;
        } else {
            this.d = j;
        }
    }

    public ISportDataCallback d() {
        return this.f38359b;
    }
}
