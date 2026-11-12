package com.mibi.sdk.network;

import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ConnEncryptManager {
    private static final String TAG = "ConnEncryptManager";
    private static final long THRESHOLD = 120000;
    private static final String URL_PATH = "/nologin/getKey";
    private static long sLastTime;
    private static String sPubKey;
    private static String sPubKeyId;

    private ConnEncryptManager() {
    }

    public static void clear() {
        MibiLog.d(TAG, CervicalMucusRecord.Appearance.CLEAR);
        sPubKey = null;
        sPubKeyId = null;
    }

    public static void fetchPubKey(Session session) {
        String str = TAG;
        MibiLog.d(str, "fetchPubKey start");
        if (!session.isFakeAccountLoader()) {
            MibiLog.d(str, "has account, do not fetch pub key");
            return;
        }
        if (!TextUtils.isEmpty(sPubKey) && !TextUtils.isEmpty(sPubKeyId)) {
            MibiLog.d(str, "pubKey and pubKeyId already exist, do not fetch");
            return;
        }
        if (System.currentTimeMillis() - sLastTime < 120000) {
            MibiLog.d(str, "request too frequently");
            return;
        }
        sLastTime = System.currentTimeMillis();
        try {
            JSONObject jSONObjectRequestJSON = ConnectionFactory.createNoAccountConnection(session.getAppContext(), CommonConstants.getUrl(URL_PATH)).requestJSON();
            sPubKey = jSONObjectRequestJSON.getString(CommonConstants.KEY_PUB_KEY);
            sPubKeyId = jSONObjectRequestJSON.getString(CommonConstants.KEY_PUB_KEY_ID);
            MibiLog.d(str, "fetch pub key success");
        } catch (Exception e) {
            MibiLog.d(TAG, "fetch pub key failed : " + e, e);
        }
    }

    public static String getPubKey() {
        return sPubKey;
    }

    public static String getPubKeyId() {
        return sPubKeyId;
    }
}
