package defpackage;

import com.huawei.health.h5pro.core.H5ProBridgeCbkExecutor;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class exh implements H5ProBridgeCbkExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<H5ProAppLoader> f33613a;

    public exh(H5ProAppLoader h5ProAppLoader) {
        this.f33613a = new WeakReference<>(h5ProAppLoader);
    }

    @Override // com.huawei.health.h5pro.core.H5ProBridgeCbkExecutor
    public void execute(String str) {
        H5ProAppLoader h5ProAppLoader = (H5ProAppLoader) GeneralUtil.getReferent(this.f33613a);
        if (h5ProAppLoader == null) {
            LogUtil.w("H5PRO_H5ProBridgeCbkExecutorImpl", "onJsBridgeCbk: h5ProAppLoader is null");
        } else {
            h5ProAppLoader.execJs(str, null);
        }
    }
}
