package com.huawei.wisesecurity.ucs.credential.entity;

import android.content.Context;
import com.huawei.hidatamanager.util.Const;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsIntegerRange;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringNotEmpty;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqj;
import defpackage.yqk;
import defpackage.yql;
import defpackage.yqo;
import defpackage.yqw;
import defpackage.yrr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class KeyEncryptKey {
    private static final int KEK_ALG_GCM = 1;
    private static final String TAG = "KeyEncryptKey";

    @KfsIntegerRange(max = 5, min = 0)
    private int alg;

    @KfsIntegerRange(max = 1, min = 0)
    private int kekAlg;

    @KfsStringNotEmpty
    private String key;
    private int v1;
    private int v2;
    private int version;

    private void checkC1Version(Context context) throws yqj {
        if (this.v2 != yqk.c("Local-C1-Version", -1, context)) {
            throw new yqj(1020L, "kek V2 with C1 version check fail,  please reapply the credential.");
        }
    }

    private void checkSoVersion() throws yqj {
        if (this.v1 != ((int) UcsLib.ucsGetSoVersion())) {
            throw new yqj(1020L, "kek V1 with so version check fail,  please reapply the credential.");
        }
    }

    private void updateRootKey(Context context) throws yqj {
        if (UcsLib.isRootKeyUpdated()) {
            return;
        }
        yrr.d(context, new yqw());
    }

    public int getVersion() {
        return this.version;
    }

    public int getV2() {
        return this.v2;
    }

    public int getV1() {
        return this.v1;
    }

    public String getKey() {
        return this.key;
    }

    public int getKekAlg() {
        return this.kekAlg;
    }

    public int getAlg() {
        return this.alg;
    }

    public static KeyEncryptKey fromString(Context context, String str) throws yqj {
        try {
            KeyEncryptKey keyEncryptKey = new KeyEncryptKey();
            JSONObject jSONObject = new JSONObject(yqo.c(str, 0));
            keyEncryptKey.version = jSONObject.getInt("version");
            keyEncryptKey.alg = jSONObject.getInt("alg");
            keyEncryptKey.kekAlg = jSONObject.getInt("kekAlg");
            keyEncryptKey.key = jSONObject.getString(MedalConstants.EVENT_KEY);
            keyEncryptKey.v1 = jSONObject.optInt("v1");
            keyEncryptKey.v2 = jSONObject.optInt("v2");
            yoj.d(keyEncryptKey);
            keyEncryptKey.checkVersion(context, keyEncryptKey.version);
            if (keyEncryptKey.kekAlg == 1) {
                return keyEncryptKey;
            }
            throw new yqj(1020L, "unsupported kek alg");
        } catch (JSONException e) {
            StringBuilder sbB = yql.b("kek param is not a valid json string : ");
            sbB.append(e.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, sbB.toString());
        } catch (yny e2) {
            StringBuilder sbB2 = yql.b("kek param invalid : ");
            sbB2.append(e2.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, sbB2.toString());
        }
    }

    private void checkVersion(Context context, int i) throws yqj {
        UcsLib.checkNativeLibrary();
        if (i == 3 || i == 6 || i == 7) {
            return;
        }
        checkSoVersion();
        checkC1Version(context);
        updateRootKey(context);
    }
}
