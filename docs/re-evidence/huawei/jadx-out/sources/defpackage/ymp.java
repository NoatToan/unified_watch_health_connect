package defpackage;

import android.os.RemoteException;
import com.google.android.clockwork.companion.partnerapi.PartnerApi;
import com.huawei.hwbtsdk.btdatatype.callback.IBindPartnerServiceCallback;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class ymp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53638a = new Object();
    private static ymp e;

    private ymp() {
    }

    public static ymp d() {
        ymp ympVar;
        synchronized (f53638a) {
            LogUtil.b("ReconnectManager", "getInstance() ");
            if (e == null) {
                e = new ymp();
            }
            ympVar = e;
        }
        return ympVar;
    }

    public void d(final String str) {
        if (str == null) {
            LogUtil.b("ReconnectManager", "node id is null");
        } else {
            ymq.b().d(new IBindPartnerServiceCallback() { // from class: ymp.1
                @Override // com.huawei.hwbtsdk.btdatatype.callback.IBindPartnerServiceCallback
                public void onBinderResponse(PartnerApi partnerApi) {
                    LogUtil.b("ReconnectManager", "reconnect begin");
                    if (partnerApi != null) {
                        try {
                            LogUtil.b("ReconnectManager", "reconnect result is ", Boolean.valueOf(partnerApi.reconnectByNodeId(str)));
                        } catch (RemoteException e2) {
                            LogUtil.d("ReconnectManager", "reconnectByNode error is ", e2.getMessage());
                        }
                    }
                }
            });
        }
    }
}
