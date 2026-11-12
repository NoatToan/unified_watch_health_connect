package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNNetworkLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class fyr extends eyr {
    public final YRNBundleInfo c;
    public final YRNBundleInfo d;

    public fyr(s1d s1dVar, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        super(s1dVar);
        this.c = yRNBundleInfo;
        this.d = yRNBundleInfo2;
    }

    @Override // defpackage.n1d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(YRNNetworkLoadRequest yRNNetworkLoadRequest) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA = false;
        try {
            ezr.c().f(YRNTraceEvent.newEvent(yRNNetworkLoadRequest.getAppName(), 92, "开始下载bundle", this.c, this.d));
            zA = super.a(yRNNetworkLoadRequest);
            if (zA) {
                ezr.c().f(YRNTraceEvent.newEvent(yRNNetworkLoadRequest.getAppName(), 920, "下载bundle成功", this.c, this.d, System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                ezr.c().f(YRNTraceEvent.newEvent(yRNNetworkLoadRequest.getAppName(), 921, "下载bundle失败", this.c, this.d, System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ezr.c().f(YRNTraceEvent.newEvent(yRNNetworkLoadRequest.getAppName(), 921, "下载bundle error:" + e.getMessage(), this.c, this.d, System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return zA;
    }
}
