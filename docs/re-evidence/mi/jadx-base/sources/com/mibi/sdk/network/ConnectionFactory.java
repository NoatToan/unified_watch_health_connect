package com.mibi.sdk.network;

import android.content.Context;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.AccountToken;
import com.mibi.sdk.common.session.Session;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionFactory {
    private static final void addBaseParameter(Context context, Connection connection) {
        SortedParameter parameter = connection.getParameter();
        parameter.add("la", Client.getLanguage());
        parameter.add(CommonConstants.KEY_COUNTRY, Client.getCountry());
        Client.AppInfo appInfo = Client.getAppInfo();
        parameter.add("package", appInfo.getPackage());
        parameter.add(CommonConstants.KEY_VERSION_CODE, Integer.valueOf(appInfo.getVersionCode()));
        parameter.add(CommonConstants.KEY_VERSION_NAME, appInfo.getVersionName());
        parameter.add(CommonConstants.KEY_OS, Client.getOS());
        if (connection instanceof ConnectionAccount) {
            parameter.add("oaid", Client.getOaid());
        } else {
            parameter.add(CommonConstants.KEY_OAID_MD5, Client.getOaidMd5());
        }
        parameter.add(CommonConstants.KEY_SDK_VERSION_CODE, 78L);
    }

    public static final Connection createAccountConnection(String str, Session session) {
        return createAccountConnection(str, session, true);
    }

    public static final Connection createCacheReaderConnection(Connection connection, Session session) {
        return new ConnectionCacheReader(connection, session);
    }

    public static final Connection createCacheWriterConnection(Connection connection, Session session) {
        return new ConnectionCacheWriter(connection, session);
    }

    public static final Connection createConnection(Context context, Session session, String str) {
        return session.isFakeAccountLoader() ? createNoAccountConnection(context, str) : createAccountConnection(str, session);
    }

    public static final Connection createNoAccountConnection(Context context, String str) {
        return createNoAccountConnection(context, str, true);
    }

    public static final Connection createPartnerConnection(Session session, String str, String str2) {
        ConnectionPartner connectionPartner = new ConnectionPartner(str2, str);
        addBaseParameter(session.getAppContext(), connectionPartner);
        return connectionPartner;
    }

    public static final Connection createSignatureConnection(Context context, String str) {
        return createSignatureConnection(context, str, false);
    }

    public static final Connection createAccountConnection(String str, Session session, boolean z) {
        AccountToken accountToken = session.getAccountLoader().getAccountToken();
        ConnectionAccount connectionAccount = new ConnectionAccount(str, accountToken.getUserId(), accountToken.getSecurity(), accountToken.getServiceToken());
        if (z) {
            addBaseParameter(session.getAppContext(), connectionAccount);
        }
        SortedParameter parameter = connectionAccount.getParameter();
        parameter.add("userId", session.getUserId());
        parameter.add(CommonConstants.KEY_SESSION, session.getUuid());
        parameter.add("deviceId", DeviceManager.getDeviceId(session));
        return connectionAccount;
    }

    public static final Connection createNoAccountConnection(Context context, String str, boolean z) {
        ConnectionDefault connectionDefault = new ConnectionDefault(str);
        if (z) {
            addBaseParameter(context, connectionDefault);
        }
        return connectionDefault;
    }

    public static final Connection createSignatureConnection(Context context, String str, boolean z) {
        ConnectionSaltSignature connectionSaltSignature = new ConnectionSaltSignature(str);
        if (z) {
            addBaseParameter(context, connectionSaltSignature);
        }
        return connectionSaltSignature;
    }
}
