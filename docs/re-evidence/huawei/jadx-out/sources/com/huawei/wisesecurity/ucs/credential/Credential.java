package com.huawei.wisesecurity.ucs.credential;

import android.content.Context;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsLongRange;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringNotEmpty;
import com.huawei.wisesecurity.ucs.credential.entity.AccessKey;
import com.huawei.wisesecurity.ucs.credential.entity.KeyEncryptKey;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs_credential.k;
import defpackage.ynw;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqg;
import defpackage.yqi;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yqz;
import defpackage.yra;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class Credential {
    private static final String AK = "accessKey";
    private static final String DK = "dataKey";
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final String EXPIRE_TIME = "expireTime";
    private static final String KEK = "kek";
    private static final String SK = "secretKey";
    private static final String TAG = "Credential";

    @KfsStringNotEmpty
    private String accessKey;
    private AccessKey ak;

    @KfsStringNotEmpty
    private String dataKey;

    @KfsLongRange(max = Long.MAX_VALUE, min = 1)
    private long expireTime;
    private KeyEncryptKey kek;

    @KfsStringNotEmpty
    private String rawKek;

    @KfsStringNotEmpty
    private String secretKey;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SK, this.secretKey);
            jSONObject.put(AK, this.accessKey);
            jSONObject.put(DK, this.dataKey);
            jSONObject.put(KEK, this.rawKek);
            jSONObject.put("expireTime", this.expireTime);
            return jSONObject.toString();
        } catch (JSONException e) {
            yqi.e(TAG, "Credential toString exception : {0}", e.getMessage());
            return "";
        }
    }

    public byte[] getSecretKeyBytes() {
        return base64DecodeForNative(this.secretKey);
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public String getRawKek() {
        return this.rawKek;
    }

    public int getKekVersion() {
        return this.kek.getVersion();
    }

    public String getKekString() {
        return this.kek.getKey();
    }

    public byte[] getKekBytes() {
        return base64DecodeForNative(this.kek.getKey());
    }

    public int getKekAlg() {
        return this.kek.getKekAlg();
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public byte[] getDataKeyBytes() {
        return base64DecodeForNative(this.dataKey);
    }

    public String getDataKey() {
        return this.dataKey;
    }

    public String getAppPkgName() {
        return this.ak.getAppPkgName();
    }

    public String getAppCertFP() {
        return this.ak.getAppCertFP();
    }

    public int getAlg() {
        return this.kek.getAlg();
    }

    public int getAkskVersion() {
        return this.ak.getAkskVersion();
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public void checkParam() throws yqj {
        try {
            yoj.d(this);
        } catch (yny e) {
            StringBuilder sbB = yql.b("credential get param exception : ");
            sbB.append(e.getMessage());
            throw new yqg(sbB.toString());
        }
    }

    private static String getCty(int i) {
        if (i == 0) {
            return "Kid";
        }
        if (i == 3) {
            return "AndroidKS";
        }
        if (i != 6) {
            return i != 7 ? "" : "Huks_EC";
        }
        return "AndroidKS_EC";
    }

    public static Credential fromString(Context context, String str, yqz yqzVar) throws yqj {
        try {
            Credential credential = new Credential();
            JSONObject jSONObject = new JSONObject(str);
            credential.secretKey = jSONObject.optString(SK);
            credential.dataKey = jSONObject.optString(DK);
            credential.accessKey = jSONObject.optString(AK);
            credential.rawKek = jSONObject.optString(KEK);
            credential.expireTime = jSONObject.optLong("expireTime");
            credential.kek = KeyEncryptKey.fromString(context, credential.rawKek);
            credential.checkParam();
            credential.ak = AccessKey.fromString(credential.accessKey);
            yqzVar.c(credential.getAppPkgName()).c(credential.getAkskVersion()).e(getCty(credential.getKekVersion()));
            if (credential.ak.hasAkskVersion()) {
                UcsLib.checkNativeLibrary();
                StringBuilder sb = new StringBuilder();
                if (!UcsLib.checkPkgNameCertFP(context, credential.ak.getAppPkgName(), credential.ak.getAppCertFP(), sb)) {
                    String str2 = "check AppPkgName appCertFP fail " + sb.toString();
                    yqi.e(TAG, str2, new Object[0]);
                    throw new yqj(1023L, str2);
                }
            }
            k.b(credential).b(credential, context);
            return credential;
        } catch (JSONException e) {
            yqi.e(TAG, "parse credentialStr get json exception : {0}", e.getMessage());
            StringBuilder sbB = yql.b("parse credentialStr get json exception : ");
            sbB.append(e.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_SLEEP_RECORD, sbB.toString());
        } catch (yqj e2) {
            yqi.e(TAG, "parse credentialStr get UCS exception : errorCode : {0} errorMsg : {1}", Long.valueOf(e2.e()), e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            StringBuilder sbB2 = yql.b("parse credentialStr get exception : ");
            sbB2.append(e3.getMessage());
            String string = sbB2.toString();
            throw yra.e(TAG, string, new Object[0], 2001L, string);
        }
    }

    private byte[] base64DecodeForNative(String str) {
        try {
            return Decoder.BASE64.decode(str);
        } catch (ynw unused) {
            return EMPTY_BYTES;
        }
    }

    private Credential() {
    }
}
