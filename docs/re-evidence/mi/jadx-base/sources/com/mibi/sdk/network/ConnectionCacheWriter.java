package com.mibi.sdk.network;

import com.mibi.sdk.common.Coder;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.Session;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionCacheWriter implements Connection {
    private Connection mConnection;
    private Session mSession;

    public ConnectionCacheWriter(Connection connection, Session session) {
        this.mConnection = connection;
        this.mSession = session;
    }

    public static String connect(String str, String str2) {
        return Utils.join(str, str2);
    }

    @Override // com.mibi.sdk.network.Connection
    public SortedParameter getParameter() {
        return this.mConnection.getParameter();
    }

    @Override // com.mibi.sdk.network.Connection
    public JSONObject getResponse() {
        return this.mConnection.getResponse();
    }

    @Override // com.mibi.sdk.network.Connection
    public int getResponseCode() {
        return this.mConnection.getResponseCode();
    }

    @Override // com.mibi.sdk.network.Connection
    public String getStringResponse() {
        return this.mConnection.getStringResponse();
    }

    @Override // com.mibi.sdk.network.Connection
    public URL getUrl() {
        return this.mConnection.getUrl();
    }

    @Override // com.mibi.sdk.network.Connection
    public JSONObject requestJSON() throws PaymentException {
        JSONObject jSONObjectRequestJSON = this.mConnection.requestJSON();
        try {
            if (jSONObjectRequestJSON.getInt(CommonConstants.KEY_ERR_CODE) == 200) {
                this.mSession.getUserStorage().write(Coder.encodeMD5(this.mConnection.getUrl().toString()), jSONObjectRequestJSON.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObjectRequestJSON;
    }

    @Override // com.mibi.sdk.network.Connection
    public String requestString() throws PaymentException {
        return this.mConnection.requestString();
    }

    @Override // com.mibi.sdk.network.Connection
    public void setNeedGzipRequest(boolean z) {
        this.mConnection.setNeedGzipRequest(z);
    }

    @Override // com.mibi.sdk.network.Connection
    public void setUseGet(boolean z) {
        this.mConnection.setUseGet(z);
    }
}
