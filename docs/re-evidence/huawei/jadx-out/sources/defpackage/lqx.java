package defpackage;

import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwcloudmodel.callback.WifiRequestCallBack;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lqx {
    private ExtendHandler e = null;

    public void e() {
        this.e = HandlerCenter.e("wifi_HwCloudManager");
    }

    public void d(final String str, final String str2, final Map<String, String> map, final WifiRequestCallBack wifiRequestCallBack) {
        this.e.postTask(new Runnable() { // from class: lqx.5
            @Override // java.lang.Runnable
            public void run() {
                wifiRequestCallBack.operationResult((String) oet.d().e(str, map, str2, String.class));
            }
        });
    }
}
