package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i extends j {
    protected abstract void b(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback);

    public String c(String str) {
        return str;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (hw.a()) {
            hw.a("CmdBaseAdRequest", "paramContent: %s", str);
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.i.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.b(context, str, remoteCallResultCallback);
                } catch (Throwable th) {
                    hw.a(5, "CmdBaseAdRequest", "executeInNetworkThread exception", th);
                    j.a(remoteCallResultCallback, i.this.f19295a, -1, th.getClass().getSimpleName() + ":" + th.getMessage(), true);
                }
            }
        });
    }

    public i(String str) {
        super(str);
    }
}
