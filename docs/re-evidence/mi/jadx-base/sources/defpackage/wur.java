package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class wur<T extends YRNLoadRequest> extends azr<T> {
    public final n1d<T> e;
    public final pur f;
    public final YRNBundleInfo g;
    public final YRNBundleInfo h;

    public wur(T t, n1d<T> n1dVar, vxr vxrVar, pur purVar, f1d<T> f1dVar, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        super(t, f1dVar, vxrVar);
        this.e = n1dVar;
        this.f = purVar;
        this.g = yRNBundleInfo;
        this.h = yRNBundleInfo2;
    }

    @Override // defpackage.azr
    public boolean a() {
        try {
            return this.e.a(this.f3622a);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.azr
    public boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA = false;
        try {
            ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 90, "开始解压bundle", this.g, this.h));
            zA = this.f.a(this.f3622a);
            if (zA) {
                ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 900, "解压bundle成功", this.g, this.h, System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 901, "解压bundle失败", this.g, this.h, System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 901, e.getMessage(), this.g, this.h, System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return zA;
    }

    @Override // defpackage.azr
    public boolean c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA = false;
        try {
            ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 93, "开始校验bundle", this.g, this.h));
            zA = zur.a(this.f3622a.getMd5(), this.f3622a.getZipCachePath());
            if (zA) {
                ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 930, "校验bundle成功", this.g, this.h, System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 931, "校验bundle失败", this.g, this.h, System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f3622a.getAppName(), 931, e.getMessage(), this.g, this.h, System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return zA;
    }
}
