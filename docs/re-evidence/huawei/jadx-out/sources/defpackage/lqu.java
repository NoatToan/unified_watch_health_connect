package defpackage;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.callback.IHttpOperationResult;
import com.huawei.hwcloudmodel.utils.NspClient;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.utils.NSPException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lqu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40690c;

    lqu(Context context) {
        this.f40690c = context;
    }

    public void b(String str, Map<String, Object> map, IHttpOperationResult iHttpOperationResult) {
        e(str, map, 30, 30, iHttpOperationResult);
    }

    private void e(final String str, final Map<String, Object> map, final int i, final int i2, final IHttpOperationResult iHttpOperationResult) {
        LogUtil.a("HiH_HwDataRequest", "call(),service=", str);
        final NspClient nspClient = new NspClient(this.f40690c);
        ThreadPoolManager.c().b("HiH_HwDataRequest", new Runnable() { // from class: lqu.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    iHttpOperationResult.operationResult(nspClient.call(str, map, i, i2, 1));
                } catch (NSPException e) {
                    int code = e.getCode();
                    LogUtil.e("HiH_HwDataRequest", "NSPException", Integer.valueOf(code), e.getMessage());
                    iHttpOperationResult.exception(e.getCode(), e);
                }
            }
        });
    }
}
