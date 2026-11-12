package com.mibi.sdk.network;

import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.account.loader.MiAccountLoader;
import com.mibi.sdk.common.exception.NotConnectedException;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.exception.ServiceTokenExpiredException;
import com.mibi.sdk.common.session.Session;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class DomainManager {
    private static String KEY_DOMAIN_LOCK = "domainLock";
    private static final String TAG = "DomainManager";

    public static class DomainParam implements Serializable {
        public final String mHost;
        public final String mServiceId;

        public DomainParam(String str, String str2) {
            this.mHost = str;
            this.mServiceId = str2;
        }
    }

    public static void updateDomainByAccount(Session session) throws PaymentException {
        if (session == null) {
            throw new IllegalArgumentException("Session should not be null in updateHostAndServiceId");
        }
        synchronized (session.getLock(KEY_DOMAIN_LOCK)) {
            updateServer(session, updateHostAndServiceId(session, null, null));
        }
    }

    public static void updateDomainByOrder(Session session, String str, String str2) throws PaymentException {
        if (session == null) {
            throw new IllegalArgumentException("Session should not be null in updateHostAndServiceId");
        }
        synchronized (session.getLock(KEY_DOMAIN_LOCK)) {
            updateServer(session, updateHostAndServiceId(session, str, str2));
        }
    }

    private static DomainParam updateHostAndServiceId(Session session, String str, String str2) throws PaymentException {
        Connection connectionCreateNoAccountConnection;
        DomainParam domainParam = (DomainParam) session.getMemoryStorage().getSerializable(CommonConstants.KEY_DOMAIN_PARAM);
        if (domainParam != null && !TextUtils.isEmpty(domainParam.mHost) && !TextUtils.isEmpty(domainParam.mServiceId)) {
            return domainParam;
        }
        updateServer(session, new DomainParam(CommonConstants.URL_BASE_DEFAULT, CommonConstants.SERVICE_ID_DEFAULT));
        if (session.getAccountLoader() instanceof MiAccountLoader) {
            connectionCreateNoAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("domain"), session);
        } else {
            connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(session.getAppContext(), CommonConstants.getUrl(session.getMemoryStorage().getBoolean(CommonConstants.KEY_IS_PARTNER_ACCOUNT) ? CommonConstants.PATH_PARTNER_DOMAIN : CommonConstants.PATH_NO_ACCOUNT_DOMAIN));
        }
        if (!TextUtils.isEmpty(str)) {
            connectionCreateNoAccountConnection.getParameter().add("order", str);
        } else if (!TextUtils.isEmpty(str2)) {
            connectionCreateNoAccountConnection.getParameter().add(CommonConstants.KEY_ORDER_QR_URL, str2);
        }
        try {
            JSONObject jSONObjectRequestJSON = connectionCreateNoAccountConnection.requestJSON();
            try {
                if (jSONObjectRequestJSON.getInt(CommonConstants.KEY_ERR_CODE) == 1984) {
                    throw new ServiceTokenExpiredException();
                }
                try {
                    String string = jSONObjectRequestJSON.getString("domain");
                    String string2 = jSONObjectRequestJSON.getString(CommonConstants.KEY_SERVICE_ID);
                    if (!Utils.checkStrings(string, string2)) {
                        throw new ResultException("baseUrl or serviceId should not be empty!");
                    }
                    try {
                        new URL(string);
                        return new DomainParam(string, string2);
                    } catch (MalformedURLException e) {
                        throw new ResultException(e);
                    }
                } catch (JSONException e2) {
                    throw new ResultException("domain content not exists", e2);
                }
            } catch (JSONException e3) {
                throw new ResultException("error code not exists", e3);
            }
        } catch (NotConnectedException e4) {
            throw e4;
        } catch (PaymentException e5) {
            session.getMemoryStorage().remove(CommonConstants.KEY_DOMAIN_PARAM);
            updateServer(session, new DomainParam(CommonConstants.URL_BASE_DEFAULT, CommonConstants.SERVICE_ID_DEFAULT));
            throw e5;
        }
    }

    private static void updateServer(Session session, DomainParam domainParam) throws PaymentException {
        if (!(session.getAccountLoader() instanceof MiAccountLoader)) {
            CommonConstants.setServer(domainParam.mHost, domainParam.mServiceId);
        } else if (TextUtils.equals(CommonConstants.URL_BASE, domainParam.mHost) && TextUtils.equals(CommonConstants.SERVICE_ID, domainParam.mServiceId)) {
            CommonConstants.setServer(domainParam.mHost, domainParam.mServiceId);
        } else {
            CommonConstants.setServer(domainParam.mHost, domainParam.mServiceId);
            session.reload(session.getAppContext());
        }
        session.getMemoryStorage().put(CommonConstants.KEY_DOMAIN_PARAM, domainParam);
    }
}
