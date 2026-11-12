package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class l extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        int i;
        hw.a("JsbClickShare", "start");
        String strOptString = new JSONObject(str).optString(JsbMapKeyNames.H5_CSHARE_URL, "");
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB != null) {
            hw.a("JsbClickShare", "start dialog activity");
            com.huawei.openalliance.ad.inter.data.e eVarA = pl.a(context, contentRecordB, true);
            eVarA.aa(strOptString);
            ca.a(context, eVarA, contentRecordB);
            i = 1000;
        } else {
            hw.a("JsbClickShare", "ad not exist");
            i = 3002;
        }
        a(remoteCallResultCallback, this.f19295a, i, null, true);
    }

    public l() {
        super("pps.click.share");
    }
}
