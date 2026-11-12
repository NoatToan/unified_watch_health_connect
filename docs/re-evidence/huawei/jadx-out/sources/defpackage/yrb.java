package defpackage;

import com.huawei.hms.network.NetworkKit;
import com.huawei.wisesecurity.ucs_credential.i0;

/* JADX INFO: loaded from: classes20.dex */
public class yrb extends NetworkKit.Callback {
    @Override // com.huawei.hms.network.NetworkKit.Callback
    public void onResult(boolean z) {
        if (z) {
            yqi.e("RemoteRestClient", "Networkkit init success", new Object[0]);
        } else {
            yqi.e("RemoteRestClient", " Networkkit init failed", new Object[0]);
        }
    }

    public yrb(i0 i0Var) {
    }
}
