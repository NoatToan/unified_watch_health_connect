package com.huawei.hianalytics.framework;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.CommonHeaderEx;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class u extends t {
    /* JADX WARN: Code duplicated, block: B:13:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0089, please report this as an issue */
    public u(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j, int i, int i2) throws JSONException {
        String string;
        IMandatoryParameters iMandatoryParameters;
        super(str, str2, str3, jSONObject, j, i, i2);
        if (jSONObject2 != null || jSONObject3 != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("headerEx", jSONObject2);
            jSONObject4.put("commonEx", jSONObject3);
            if (jSONObject4.length() == 0) {
                HiLog.sw("RecordTaskEx", "content is empty, tag: " + str + ", type: " + str2);
            } else {
                string = jSONObject4.toString();
            }
            this.f11527c = string;
            if (TextUtils.isEmpty(string)) {
                HiLog.sw("RecordTaskEx", "common and header Ex is empty, tag: " + str + ", type: " + str2);
            }
            iMandatoryParameters = b.e.f11498a;
            if (iMandatoryParameters != null || iMandatoryParameters.checkDebugModeEnabled()) {
            }
            this.f11526b = SHA.sha256Encrypt(this.f11527c);
            return;
        }
        HiLog.sw("RecordTaskEx", "header and evt is null, tag: " + str + ", type: " + str2);
        string = "";
        this.f11527c = string;
        if (TextUtils.isEmpty(string)) {
            iMandatoryParameters = b.e.f11498a;
            if (iMandatoryParameters != null) {
            }
        } else {
            HiLog.sw("RecordTaskEx", "common and header Ex is empty, tag: " + str + ", type: " + str2);
        }
    }

    @Override // com.huawei.hianalytics.framework.t, java.lang.Runnable
    public final void run() {
        if (!TextUtils.isEmpty(this.f11526b)) {
            CommonHeaderEx commonHeaderEx = new CommonHeaderEx(this.f11526b, this.f11527c);
            IStorageHandler iStorageHandlerC = j.c(this.f11525a);
            if (iStorageHandlerC != null) {
                iStorageHandlerC.insert(commonHeaderEx);
            }
        }
        super.run();
    }
}
