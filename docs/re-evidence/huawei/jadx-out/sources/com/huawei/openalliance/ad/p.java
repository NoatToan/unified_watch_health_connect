package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class p extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        int i;
        if (hw.a()) {
            hw.a("JsbFeedbackToggle", "start");
        }
        String strOptString = new JSONObject(str).optString(JsbMapKeyNames.FEEDBACK_CODE, "3");
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB != null) {
            new com.huawei.openalliance.ad.analysis.i(context).f(contentRecordB, strOptString);
            i = 1000;
        } else {
            hw.a("JsbFeedbackToggle", "ad not exist");
            i = 3002;
        }
        a(remoteCallResultCallback, this.f19295a, i, null, true);
    }

    public p() {
        super("pps.feedback.toggle");
    }
}
