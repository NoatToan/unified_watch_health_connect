package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;

/* JADX INFO: loaded from: classes16.dex */
public class qmt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwHealthBaseBarLineChart f46496b;
    private boolean d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f46497c = new Handler(Looper.getMainLooper()) { // from class: qmt.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("RingAnimationMgr", "handleMessage msg is null.");
            } else if (message.what == 1) {
                qmt.this.e();
            } else {
                super.handleMessage(message);
            }
        }
    };

    public qmt(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        this.f46496b = hwHealthBaseBarLineChart;
    }

    public boolean b() {
        return this.d;
    }

    public void b(long j) {
        this.f46497c.sendMessageDelayed(this.f46497c.obtainMessage(1), j);
    }

    public void d() {
        this.f46497c.removeMessages(1);
        if (e()) {
            b(500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        boolean z = !this.f46496b.isDataReady();
        if (this.d != z) {
            this.d = z;
            this.f46496b.invalidateForce();
        }
        return this.d;
    }
}
