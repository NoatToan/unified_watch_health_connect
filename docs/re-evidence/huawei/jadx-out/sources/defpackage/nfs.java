package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearmgr.phoneprocess.adapterapi.WearMgrAdapterApi;

/* JADX INFO: loaded from: classes2.dex */
public class nfs implements WearMgrAdapterApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43064a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static nfs f43065c;

    private nfs() {
    }

    public static nfs d() {
        nfs nfsVar;
        synchronized (f43064a) {
            if (f43065c == null) {
                LogUtil.a("WearMgrAdapterImpl", "WearMgrAdapterImpl init.");
                f43065c = new nfs();
            }
            nfsVar = f43065c;
        }
        return nfsVar;
    }
}
