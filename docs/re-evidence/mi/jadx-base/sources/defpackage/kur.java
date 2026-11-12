package defpackage;

import android.content.res.AssetManager;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNAssetsLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class kur extends jur {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YRNBundleInfo f24316b;
    public final YRNBundleInfo c;

    public kur(AssetManager assetManager, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        super(assetManager);
        this.f24316b = yRNBundleInfo;
        this.c = yRNBundleInfo2;
    }

    @Override // defpackage.n1d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(YRNAssetsLoadRequest yRNAssetsLoadRequest) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA = false;
        try {
            ezr.c().f(YRNTraceEvent.newEvent(yRNAssetsLoadRequest.getAppName(), 12, "开始加载内置bundle", this.f24316b, this.c));
            zA = super.a(yRNAssetsLoadRequest);
            if (zA) {
                ezr.c().f(YRNTraceEvent.newEvent(yRNAssetsLoadRequest.getAppName(), 120, "加载内置bundle成功", this.f24316b, this.c, System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                ezr.c().f(YRNTraceEvent.newEvent(yRNAssetsLoadRequest.getAppName(), 121, "加载内置bundle失败", this.f24316b, this.c, System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ezr.c().f(YRNTraceEvent.newEvent(yRNAssetsLoadRequest.getAppName(), 121, e.getMessage(), this.f24316b, this.c, System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return zA;
    }
}
