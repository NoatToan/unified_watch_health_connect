package com.huawei.wisesecurity.ucs.credential.entity;

import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringNotEmpty;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yqo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AccessKey {
    private static final String AKSK_VERSION = "akskVersion";
    private static final String APP_CERT_FP = "appCertFP";
    private static final String APP_PKG_NAME = "appPkgName";
    private int akskVersion;

    @KfsStringNotEmpty
    private String appCertFP;

    @KfsStringNotEmpty
    private String appPkgName;

    public boolean hasAkskVersion() {
        return this.akskVersion >= 1;
    }

    public String getAppPkgName() {
        return this.appPkgName;
    }

    public String getAppCertFP() {
        return this.appCertFP;
    }

    public int getAkskVersion() {
        return this.akskVersion;
    }

    public static AccessKey fromString(String str) throws yqj {
        try {
            AccessKey accessKey = new AccessKey();
            JSONObject jSONObject = new JSONObject(yqo.c(str, 0));
            accessKey.akskVersion = jSONObject.optInt(AKSK_VERSION);
            accessKey.appPkgName = jSONObject.optString(APP_PKG_NAME);
            accessKey.appCertFP = jSONObject.optString(APP_CERT_FP);
            if (accessKey.hasAkskVersion()) {
                yoj.d(accessKey);
            }
            return accessKey;
        } catch (JSONException e) {
            StringBuilder sbB = yql.b("accessKey param is not a valid json string : ");
            sbB.append(e.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, sbB.toString());
        } catch (yny e2) {
            StringBuilder sbB2 = yql.b("accessKey param invalid : ");
            sbB2.append(e2.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, sbB2.toString());
        }
    }
}
