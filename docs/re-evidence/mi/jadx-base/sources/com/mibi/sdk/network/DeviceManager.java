package com.mibi.sdk.network;

import android.text.TextUtils;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.Coder;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.exception.ServiceTokenExpiredException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceManager {
    private static String KEY_DEVICE_ID = "deviceId";
    private static final String TAG = "DeviceManager";

    public static String getDeviceId(Session session) {
        String strInnerGetDeviceId;
        synchronized (session.getLock(KEY_DEVICE_ID)) {
            strInnerGetDeviceId = innerGetDeviceId(session);
        }
        return strInnerGetDeviceId;
    }

    private static String innerGetDeviceId(Session session) {
        return (String) session.getMemoryStorage().get(Session.KEY_GROUP_GLOBAL_SETTINGS, KEY_DEVICE_ID);
    }

    public static void uploadDevice(Session session) throws PaymentException {
        String url;
        if (session == null) {
            throw new IllegalArgumentException("session should not be null when upload device info.");
        }
        synchronized (session.getLock(KEY_DEVICE_ID)) {
            try {
                if (TextUtils.isEmpty(innerGetDeviceId(session))) {
                    if (session.isFakeAccountLoader()) {
                        url = session.getMemoryStorage().getBoolean(CommonConstants.KEY_IS_PARTNER_ACCOUNT) ? CommonConstants.getUrl(CommonConstants.PATH_PARTNER_DEVICE) : CommonConstants.getUrl(CommonConstants.PATH_NO_ACCOUNT_DEVICE);
                    } else {
                        url = CommonConstants.getUrl("device");
                    }
                    Connection connectionCreateConnection = ConnectionFactory.createConnection(session.getAppContext(), session, url);
                    SortedParameter parameter = connectionCreateConnection.getParameter();
                    parameter.add("model", Client.getBuildModel());
                    parameter.add(CommonConstants.KEY_BRAND, Client.getBuildBrand());
                    parameter.add(CommonConstants.KEY_SYSTEM_VERSION, Integer.valueOf(Client.getBuildSdkVersion()));
                    parameter.add(CommonConstants.KEY_XIAOMI_DEVICE_TOKEN, Client.getXiaomiDeviceToken());
                    if (!session.isFakeAccountLoader()) {
                        parameter.add("oaid", Client.getOaid());
                    } else if (TextUtils.isEmpty(ConnEncryptManager.getPubKey()) || TextUtils.isEmpty(ConnEncryptManager.getPubKeyId())) {
                        MibiLog.d(TAG, "pub key is null");
                    } else {
                        String strGenerateAESRandom = Coder.generateAESRandom();
                        String strEncryptRSA = Coder.encryptRSA(ConnEncryptManager.getPubKey(), strGenerateAESRandom);
                        if (TextUtils.isEmpty(strEncryptRSA)) {
                            MibiLog.d(TAG, "encrypt key is null");
                        } else {
                            parameter.add(CommonConstants.KEY_ENCRYPT_AES_KEY, strEncryptRSA);
                            parameter.add(CommonConstants.KEY_PUB_KEY_ID, ConnEncryptManager.getPubKeyId());
                            parameter.add(CommonConstants.KEY_ENCRYPT_OAID, Coder.encodeAES(Client.getOaid(), strGenerateAESRandom, strGenerateAESRandom));
                            parameter.add(CommonConstants.KEY_PUB_KEY_ID, ConnEncryptManager.getPubKeyId());
                        }
                    }
                    JSONObject jSONObjectRequestJSON = connectionCreateConnection.requestJSON();
                    try {
                        int i = jSONObjectRequestJSON.getInt(CommonConstants.KEY_ERR_CODE);
                        if (i != 200) {
                            ConnEncryptManager.clear();
                        }
                        if (i == 1984) {
                            throw new ServiceTokenExpiredException();
                        }
                        try {
                            String string = jSONObjectRequestJSON.getString("deviceId");
                            if (TextUtils.isEmpty(string)) {
                                throw new ResultException("result has error");
                            }
                            session.getMemoryStorage().put(Session.KEY_GROUP_GLOBAL_SETTINGS, KEY_DEVICE_ID, string);
                        } catch (JSONException e) {
                            throw new ResultException(e);
                        }
                    } catch (JSONException e2) {
                        throw new ResultException("error code not exists", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
