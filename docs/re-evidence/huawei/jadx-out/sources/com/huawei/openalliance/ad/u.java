package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class u extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (hw.a()) {
            hw.a("JsbQueryConfig", "param content: %s", str);
        }
        String strOptString = new JSONObject(str).optString(JsbMapKeyNames.CONFIG_MAP_KEY);
        hw.b("JsbQueryConfig", "query configmap, key: %s", strOptString);
        if (com.huawei.openalliance.ad.utils.dg.b(strOptString)) {
            a(remoteCallResultCallback, this.f19295a, 3001, null, true);
        } else {
            a(remoteCallResultCallback, this.f19295a, 1000, fp.b(context).b(strOptString, ""), true);
        }
    }

    public u() {
        super("pps.query.cfg");
    }
}
